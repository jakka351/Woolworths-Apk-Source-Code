package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.ThreadSafeHeap;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u0002:\u0004\n\u000b\f\rR\u0013\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002X\u0082\u0004R\u0013\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0002X\u0082\u0004R\u000b\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase;", "Lkotlinx/coroutines/EventLoopImplPlatform;", "Lkotlinx/coroutines/Delay;", "Lkotlinx/atomicfu/AtomicRef;", "", "_queue", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "_delayed", "Lkotlinx/atomicfu/AtomicBoolean;", "_isCompleted", "DelayedTask", "DelayedResumeTask", "DelayedRunnableTask", "DelayedTaskQueue", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class EventLoopImplBase extends EventLoopImplPlatform implements Delay {
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(EventLoopImplBase.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(EventLoopImplBase.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater l = AtomicIntegerFieldUpdater.newUpdater(EventLoopImplBase.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedResumeTask;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes7.dex */
    public final class DelayedResumeTask extends DelayedTask {
        public final CancellableContinuationImpl f;

        public DelayedResumeTask(long j, CancellableContinuationImpl cancellableContinuationImpl) {
            super(j);
            this.f = cancellableContinuationImpl;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f.D(EventLoopImplBase.this, Unit.f24250a);
        }

        @Override // kotlinx.coroutines.EventLoopImplBase.DelayedTask
        public final String toString() {
            return super.toString() + this.f;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedRunnableTask;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class DelayedRunnableTask extends DelayedTask {
        public final Runnable f;

        public DelayedRunnableTask(Runnable runnable, long j) {
            super(j);
            this.f = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f.run();
        }

        @Override // kotlinx.coroutines.EventLoopImplBase.DelayedTask
        public final String toString() {
            return super.toString() + this.f;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u00052\u00060\u0006j\u0002`\u0007R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "_heap", "Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes7.dex */
    public static abstract class DelayedTask implements Runnable, Comparable<DelayedTask>, DisposableHandle, ThreadSafeHeapNode {

        @Nullable
        private volatile Object _heap;
        public long d;
        public int e = -1;

        public DelayedTask(long j) {
            this.d = j;
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public final void b(DelayedTaskQueue delayedTaskQueue) {
            if (this._heap == EventLoop_commonKt.f24692a) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = delayedTaskQueue;
        }

        public final int c(long j, DelayedTaskQueue delayedTaskQueue, EventLoopImplBase eventLoopImplBase) {
            synchronized (this) {
                if (this._heap == EventLoop_commonKt.f24692a) {
                    return 2;
                }
                synchronized (delayedTaskQueue) {
                    try {
                        ThreadSafeHeapNode[] threadSafeHeapNodeArr = delayedTaskQueue.f24733a;
                        DelayedTask delayedTask = (DelayedTask) (threadSafeHeapNodeArr != null ? threadSafeHeapNodeArr[0] : null);
                        if (EventLoopImplBase.l.get(eventLoopImplBase) == 1) {
                            return 1;
                        }
                        if (delayedTask == null) {
                            delayedTaskQueue.c = j;
                        } else {
                            long j2 = delayedTask.d;
                            if (j2 - j < 0) {
                                j = j2;
                            }
                            if (j - delayedTaskQueue.c > 0) {
                                delayedTaskQueue.c = j;
                            }
                        }
                        long j3 = this.d;
                        long j4 = delayedTaskQueue.c;
                        if (j3 - j4 < 0) {
                            this.d = j4;
                        }
                        delayedTaskQueue.a(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // java.lang.Comparable
        public final int compareTo(DelayedTask delayedTask) {
            long j = this.d - delayedTask.d;
            if (j > 0) {
                return 1;
            }
            return j < 0 ? -1 : 0;
        }

        public final boolean d(long j) {
            return j - this.d >= 0;
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public final void dispose() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    Symbol symbol = EventLoop_commonKt.f24692a;
                    if (obj == symbol) {
                        return;
                    }
                    DelayedTaskQueue delayedTaskQueue = obj instanceof DelayedTaskQueue ? (DelayedTaskQueue) obj : null;
                    if (delayedTaskQueue != null) {
                        synchronized (delayedTaskQueue) {
                            Object obj2 = this._heap;
                            if ((obj2 instanceof ThreadSafeHeap ? (ThreadSafeHeap) obj2 : null) != null) {
                                delayedTaskQueue.b(this.e);
                            }
                        }
                    }
                    this._heap = symbol;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public final void setIndex(int i) {
            this.e = i;
        }

        public String toString() {
            return androidx.camera.core.impl.b.q(new StringBuilder("Delayed[nanos="), this.d, ']');
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DelayedTaskQueue extends ThreadSafeHeap<DelayedTask> {
        public long c;
    }

    public final void B0(long j2, DelayedTask delayedTask) {
        int iC;
        Thread threadI0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
        if (l.get(this) == 1) {
            iC = 1;
        } else {
            DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) atomicReferenceFieldUpdater.get(this);
            if (delayedTaskQueue == null) {
                DelayedTaskQueue delayedTaskQueue2 = new DelayedTaskQueue();
                delayedTaskQueue2.c = j2;
                kotlin.reflect.jvm.internal.impl.types.checker.a.s(atomicReferenceFieldUpdater, this, delayedTaskQueue2);
                Object obj = atomicReferenceFieldUpdater.get(this);
                Intrinsics.e(obj);
                delayedTaskQueue = (DelayedTaskQueue) obj;
            }
            iC = delayedTask.c(j2, delayedTaskQueue, this);
        }
        if (iC != 0) {
            if (iC == 1) {
                k0(j2, delayedTask);
                return;
            } else {
                if (iC != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        DelayedTaskQueue delayedTaskQueue3 = (DelayedTaskQueue) atomicReferenceFieldUpdater.get(this);
        if (delayedTaskQueue3 != null) {
            synchronized (delayedTaskQueue3) {
                ThreadSafeHeapNode[] threadSafeHeapNodeArr = delayedTaskQueue3.f24733a;
                threadSafeHeapNode = threadSafeHeapNodeArr != null ? threadSafeHeapNodeArr[0] : null;
            }
            threadSafeHeapNode = (DelayedTask) threadSafeHeapNode;
        }
        if (threadSafeHeapNode != delayedTask || Thread.currentThread() == (threadI0 = getM())) {
            return;
        }
        LockSupport.unpark(threadI0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r7 = null;
     */
    @Override // kotlinx.coroutines.EventLoop
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b0() {
        /*
            r10 = this;
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.EventLoop_commonKt.b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.EventLoopImplBase.j
            boolean r2 = r10.d0()
            r3 = 0
            if (r2 == 0) goto Le
            goto Lb6
        Le:
            r10.r0()
        L11:
            java.lang.Object r2 = r1.get(r10)
            r5 = 0
            if (r2 != 0) goto L1a
        L18:
            r7 = r5
            goto L4a
        L1a:
            boolean r6 = r2 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore
            if (r6 == 0) goto L3e
            r6 = r2
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r6 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r6
            java.lang.Object r7 = r6.d()
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.g
            if (r7 == r8) goto L2c
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L4a
        L2c:
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r6 = r6.c()
        L30:
            boolean r5 = r1.compareAndSet(r10, r2, r6)
            if (r5 == 0) goto L37
            goto L11
        L37:
            java.lang.Object r5 = r1.get(r10)
            if (r5 == r2) goto L30
            goto L11
        L3e:
            if (r2 != r0) goto L41
            goto L18
        L41:
            boolean r6 = r1.compareAndSet(r10, r2, r5)
            if (r6 == 0) goto Lbb
            r7 = r2
            java.lang.Runnable r7 = (java.lang.Runnable) r7
        L4a:
            if (r7 == 0) goto L50
            r7.run()
            return r3
        L50:
            kotlin.collections.ArrayDeque r2 = r10.h
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 != 0) goto L5b
        L59:
            r8 = r6
            goto L63
        L5b:
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L62
            goto L59
        L62:
            r8 = r3
        L63:
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 != 0) goto L68
            goto Lb6
        L68:
            java.lang.Object r1 = r1.get(r10)
            if (r1 == 0) goto L90
            boolean r2 = r1 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore
            if (r2 == 0) goto L8d
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r1 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.f
            long r0 = r0.get(r1)
            r8 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r8 = r8 & r0
            int r2 = (int) r8
            r8 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r8
            r8 = 30
            long r0 = r0 >> r8
            int r0 = (int) r0
            if (r2 != r0) goto L8c
            goto L90
        L8c:
            return r3
        L8d:
            if (r1 != r0) goto Lb6
            goto Lba
        L90:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.EventLoopImplBase.k
            java.lang.Object r0 = r0.get(r10)
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r0
            if (r0 == 0) goto Lba
            monitor-enter(r0)
            kotlinx.coroutines.internal.ThreadSafeHeapNode[] r1 = r0.f24733a     // Catch: java.lang.Throwable -> La3
            if (r1 == 0) goto La5
            r2 = 0
            r5 = r1[r2]     // Catch: java.lang.Throwable -> La3
            goto La5
        La3:
            r1 = move-exception
            goto Lb8
        La5:
            monitor-exit(r0)
            kotlinx.coroutines.EventLoopImplBase$DelayedTask r5 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r5
            if (r5 != 0) goto Lab
            goto Lba
        Lab:
            long r0 = r5.d
            long r5 = java.lang.System.nanoTime()
            long r0 = r0 - r5
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto Lb7
        Lb6:
            return r3
        Lb7:
            return r0
        Lb8:
            monitor-exit(r0)
            throw r1
        Lba:
            return r6
        Lbb:
            java.lang.Object r6 = r1.get(r10)
            if (r6 == r2) goto L41
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.EventLoopImplBase.b0():long");
    }

    @Override // kotlinx.coroutines.Delay
    public final void c(long j2, CancellableContinuationImpl cancellableContinuationImpl) {
        long jA = EventLoop_commonKt.a(j2);
        if (jA < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            DelayedResumeTask delayedResumeTask = new DelayedResumeTask(jA + jNanoTime, cancellableContinuationImpl);
            B0(jNanoTime, delayedResumeTask);
            CancellableContinuationKt.a(cancellableContinuationImpl, delayedResumeTask);
        }
    }

    public DisposableHandle j(long j2, Runnable runnable, CoroutineContext coroutineContext) {
        return Delay.DefaultImpls.a(j2, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void k(CoroutineContext coroutineContext, Runnable runnable) {
        m0(runnable);
    }

    public void m0(Runnable runnable) {
        r0();
        if (!t0(runnable)) {
            DefaultExecutor.m.m0(runnable);
            return;
        }
        Thread threadI0 = getM();
        if (Thread.currentThread() != threadI0) {
            LockSupport.unpark(threadI0);
        }
    }

    public final void r0() {
        ThreadSafeHeapNode threadSafeHeapNodeB;
        DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) k.get(this);
        if (delayedTaskQueue == null || ThreadSafeHeap.b.get(delayedTaskQueue) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (delayedTaskQueue) {
                try {
                    ThreadSafeHeapNode[] threadSafeHeapNodeArr = delayedTaskQueue.f24733a;
                    ThreadSafeHeapNode threadSafeHeapNode = threadSafeHeapNodeArr != null ? threadSafeHeapNodeArr[0] : null;
                    if (threadSafeHeapNode != null) {
                        DelayedTask delayedTask = (DelayedTask) threadSafeHeapNode;
                        threadSafeHeapNodeB = delayedTask.d(jNanoTime) ? t0(delayedTask) : false ? delayedTaskQueue.b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (((DelayedTask) threadSafeHeapNodeB) != null);
    }

    @Override // kotlinx.coroutines.EventLoop
    public void shutdown() {
        ThreadSafeHeapNode threadSafeHeapNodeB;
        ThreadLocalEventLoop.f24695a.set(null);
        l.set(this, 1);
        Symbol symbol = EventLoop_commonKt.b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof LockFreeTaskQueueCore)) {
                    if (obj != symbol) {
                        LockFreeTaskQueueCore lockFreeTaskQueueCore = new LockFreeTaskQueueCore(8, true);
                        lockFreeTaskQueueCore.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lockFreeTaskQueueCore)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((LockFreeTaskQueueCore) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, symbol)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (b0() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) k.get(this);
            if (delayedTaskQueue == null) {
                return;
            }
            synchronized (delayedTaskQueue) {
                threadSafeHeapNodeB = ThreadSafeHeap.b.get(delayedTaskQueue) > 0 ? delayedTaskQueue.b(0) : null;
            }
            DelayedTask delayedTask = (DelayedTask) threadSafeHeapNodeB;
            if (delayedTask == null) {
                return;
            } else {
                k0(jNanoTime, delayedTask);
            }
        }
    }

    public final boolean t0(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (l.get(this) != 1) {
                if (obj != null) {
                    if (!(obj instanceof LockFreeTaskQueueCore)) {
                        if (obj != EventLoop_commonKt.b) {
                            LockFreeTaskQueueCore lockFreeTaskQueueCore = new LockFreeTaskQueueCore(8, true);
                            lockFreeTaskQueueCore.a((Runnable) obj);
                            lockFreeTaskQueueCore.a(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lockFreeTaskQueueCore)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        return false;
                    }
                    LockFreeTaskQueueCore lockFreeTaskQueueCore2 = (LockFreeTaskQueueCore) obj;
                    int iA = lockFreeTaskQueueCore2.a(runnable);
                    if (iA == 0) {
                        break;
                    }
                    if (iA == 1) {
                        LockFreeTaskQueueCore lockFreeTaskQueueCoreC = lockFreeTaskQueueCore2.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lockFreeTaskQueueCoreC) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (iA == 2) {
                        return false;
                    }
                } else {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    }
                    break loop0;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean z0() {
        /*
            r7 = this;
            kotlin.collections.ArrayDeque r0 = r7.h
            r1 = 1
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            goto Lb
        La:
            r0 = r1
        Lb:
            r2 = 0
            if (r0 != 0) goto Lf
            goto L54
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.EventLoopImplBase.k
            java.lang.Object r0 = r0.get(r7)
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r0
            if (r0 == 0) goto L27
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = kotlinx.coroutines.internal.ThreadSafeHeap.b
            int r0 = r3.get(r0)
            if (r0 != 0) goto L23
            r0 = r1
            goto L24
        L23:
            r0 = r2
        L24:
            if (r0 != 0) goto L27
            goto L54
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.EventLoopImplBase.j
            java.lang.Object r0 = r0.get(r7)
            if (r0 != 0) goto L30
            goto L53
        L30:
            boolean r3 = r0 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore
            if (r3 == 0) goto L4f
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.f
            long r3 = r3.get(r0)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            int r0 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r5
            r5 = 30
            long r3 = r3 >> r5
            int r3 = (int) r3
            if (r0 != r3) goto L4e
            return r1
        L4e:
            return r2
        L4f:
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.EventLoop_commonKt.b
            if (r0 != r3) goto L54
        L53:
            return r1
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.EventLoopImplBase.z0():boolean");
    }
}
