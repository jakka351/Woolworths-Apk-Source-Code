package kotlinx.coroutines.scheduling;

import YU.a;
import androidx.camera.core.impl.b;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.internal.ResizableAtomicArray;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\b\t\nR\u000b\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004R\u000b\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004R\u000b\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "Lkotlinx/atomicfu/AtomicLong;", "parkedWorkersStack", "controlState", "Lkotlinx/atomicfu/AtomicBoolean;", "_isTerminated", "Companion", "Worker", "WorkerState", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CoroutineScheduler implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater k = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater l = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater m = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated$volatile");
    public static final Symbol n = new Symbol("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    public final int d;
    public final int e;
    public final long f;
    public final String g;
    public final GlobalQueue h;
    public final GlobalQueue i;
    public final ResizableAtomicArray j;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007R\u0014\u0010\u0013\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\r¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Companion;", "", "Lkotlinx/coroutines/internal/Symbol;", "NOT_IN_STACK", "Lkotlinx/coroutines/internal/Symbol;", "", "PARKED", "I", "CLAIMED", "TERMINATED", "BLOCKING_SHIFT", "", "CREATED_MASK", "J", "BLOCKING_MASK", "CPU_PERMITS_SHIFT", "CPU_PERMITS_MASK", "MIN_SUPPORTED_POOL_SIZE", "MAX_SUPPORTED_POOL_SIZE", "PARKED_INDEX_MASK", "PARKED_VERSION_MASK", "PARKED_VERSION_INC", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[WorkerState.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                WorkerState workerState = WorkerState.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                WorkerState workerState2 = WorkerState.d;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                WorkerState workerState3 = WorkerState.d;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                WorkerState workerState4 = WorkerState.d;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001R*\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\b\u0010\u0012\u001a\u00020\u00118\u0006¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "Ljava/lang/Thread;", "", "index", "indexInArray", "I", "b", "()I", "f", "(I)V", "", "nextParkedWorker", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "g", "(Ljava/lang/Object;)V", "Lkotlinx/atomicfu/AtomicInt;", "workerCtl", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public final class Worker extends Thread {
        public static final /* synthetic */ AtomicIntegerFieldUpdater l = AtomicIntegerFieldUpdater.newUpdater(Worker.class, "workerCtl$volatile");
        public final WorkQueue d;
        public final Ref.ObjectRef e;
        public WorkerState f;
        public long g;
        public long h;
        public int i;
        private volatile int indexInArray;
        public boolean j;

        @Nullable
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        public Worker(int i) {
            setDaemon(true);
            setContextClassLoader(CoroutineScheduler.class.getClassLoader());
            this.d = new WorkQueue();
            this.e = new Ref.ObjectRef();
            this.f = WorkerState.g;
            this.nextParkedWorker = CoroutineScheduler.n;
            int iNanoTime = (int) System.nanoTime();
            this.i = iNanoTime == 0 ? 42 : iNanoTime;
            f(i);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
        
            r12 = kotlinx.coroutines.scheduling.WorkQueue.d.get(r10);
            r0 = kotlinx.coroutines.scheduling.WorkQueue.c.get(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
        
            if (r12 == r0) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
        
            if (kotlinx.coroutines.scheduling.WorkQueue.e.get(r10) != 0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
        
            r0 = r0 - 1;
            r1 = r10.c(r0, true);
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        
            if (r1 == null) goto L71;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
        
            r8 = r1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final kotlinx.coroutines.scheduling.Task a(boolean r12) {
            /*
                r11 = this;
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = r11.f
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.d
                kotlinx.coroutines.scheduling.CoroutineScheduler r3 = kotlinx.coroutines.scheduling.CoroutineScheduler.this
                r8 = 0
                r9 = 1
                kotlinx.coroutines.scheduling.WorkQueue r10 = r11.d
                if (r0 != r1) goto Le
                goto L86
            Le:
                java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.l
            L10:
                long r4 = r0.get(r3)
                r1 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
                long r1 = r1 & r4
                r6 = 42
                long r1 = r1 >> r6
                int r1 = (int) r1
                if (r1 != 0) goto L73
                r10.getClass()
            L23:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = kotlinx.coroutines.scheduling.WorkQueue.b
                java.lang.Object r0 = r12.get(r10)
                kotlinx.coroutines.scheduling.Task r0 = (kotlinx.coroutines.scheduling.Task) r0
                if (r0 != 0) goto L2e
                goto L41
            L2e:
                boolean r1 = r0.e
                if (r1 != r9) goto L41
            L32:
                boolean r1 = r12.compareAndSet(r10, r0, r8)
                if (r1 == 0) goto L3a
                r8 = r0
                goto L61
            L3a:
                java.lang.Object r1 = r12.get(r10)
                if (r1 == r0) goto L32
                goto L23
            L41:
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r12 = kotlinx.coroutines.scheduling.WorkQueue.d
                int r12 = r12.get(r10)
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.WorkQueue.c
                int r0 = r0.get(r10)
            L4d:
                if (r12 == r0) goto L61
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.scheduling.WorkQueue.e
                int r1 = r1.get(r10)
                if (r1 != 0) goto L58
                goto L61
            L58:
                int r0 = r0 + (-1)
                kotlinx.coroutines.scheduling.Task r1 = r10.c(r0, r9)
                if (r1 == 0) goto L4d
                r8 = r1
            L61:
                if (r8 != 0) goto L72
                kotlinx.coroutines.scheduling.GlobalQueue r12 = r3.i
                java.lang.Object r12 = r12.c()
                kotlinx.coroutines.scheduling.Task r12 = (kotlinx.coroutines.scheduling.Task) r12
                if (r12 != 0) goto L71
                kotlinx.coroutines.scheduling.Task r12 = r11.i(r9)
            L71:
                return r12
            L72:
                return r8
            L73:
                r1 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r6 = r4 - r1
                java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.scheduling.CoroutineScheduler.l
                boolean r1 = r2.compareAndSet(r3, r4, r6)
                if (r1 == 0) goto L10
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.d
                r11.f = r0
            L86:
                if (r12 == 0) goto Lba
                int r12 = r3.d
                int r12 = r12 * 2
                int r12 = r11.d(r12)
                if (r12 != 0) goto L93
                goto L94
            L93:
                r9 = 0
            L94:
                if (r9 == 0) goto L9d
                kotlinx.coroutines.scheduling.Task r12 = r11.e()
                if (r12 == 0) goto L9d
                return r12
            L9d:
                r10.getClass()
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = kotlinx.coroutines.scheduling.WorkQueue.b
                java.lang.Object r12 = r12.getAndSet(r10, r8)
                kotlinx.coroutines.scheduling.Task r12 = (kotlinx.coroutines.scheduling.Task) r12
                if (r12 != 0) goto Lae
                kotlinx.coroutines.scheduling.Task r12 = r10.b()
            Lae:
                if (r12 == 0) goto Lb1
                return r12
            Lb1:
                if (r9 != 0) goto Lc1
                kotlinx.coroutines.scheduling.Task r12 = r11.e()
                if (r12 == 0) goto Lc1
                return r12
            Lba:
                kotlinx.coroutines.scheduling.Task r12 = r11.e()
                if (r12 == 0) goto Lc1
                return r12
            Lc1:
                r12 = 3
                kotlinx.coroutines.scheduling.Task r12 = r11.i(r12)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.Worker.a(boolean):kotlinx.coroutines.scheduling.Task");
        }

        /* renamed from: b, reason: from getter */
        public final int getIndexInArray() {
            return this.indexInArray;
        }

        /* renamed from: c, reason: from getter */
        public final Object getNextParkedWorker() {
            return this.nextParkedWorker;
        }

        public final int d(int i) {
            int i2 = this.i;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.i = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
        }

        public final Task e() {
            int iD = d(2);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            if (iD == 0) {
                Task task = (Task) coroutineScheduler.h.c();
                return task != null ? task : (Task) coroutineScheduler.i.c();
            }
            Task task2 = (Task) coroutineScheduler.i.c();
            return task2 != null ? task2 : (Task) coroutineScheduler.h.c();
        }

        public final void f(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(CoroutineScheduler.this.g);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        public final void g(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean h(WorkerState workerState) {
            WorkerState workerState2 = this.f;
            boolean z = workerState2 == WorkerState.d;
            if (z) {
                CoroutineScheduler.l.addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.f = workerState;
            }
            return z;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
        
            r7 = r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x009f, code lost:
        
            r7 = -2;
            r5 = r4;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final kotlinx.coroutines.scheduling.Task i(int r26) {
            /*
                Method dump skipped, instructions count: 259
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.Worker.i(int):kotlinx.coroutines.scheduling.Task");
        }

        /* JADX WARN: Code restructure failed: missing block: B:124:0x0004, code lost:
        
            continue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:125:0x0004, code lost:
        
            continue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:126:0x0004, code lost:
        
            continue;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 417
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.Worker.run():void");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class WorkerState {
        public static final WorkerState d;
        public static final WorkerState e;
        public static final WorkerState f;
        public static final WorkerState g;
        public static final WorkerState h;
        public static final /* synthetic */ WorkerState[] i;
        public static final /* synthetic */ EnumEntries j;

        static {
            WorkerState workerState = new WorkerState("CPU_ACQUIRED", 0);
            d = workerState;
            WorkerState workerState2 = new WorkerState("BLOCKING", 1);
            e = workerState2;
            WorkerState workerState3 = new WorkerState("PARKING", 2);
            f = workerState3;
            WorkerState workerState4 = new WorkerState("DORMANT", 3);
            g = workerState4;
            WorkerState workerState5 = new WorkerState("TERMINATED", 4);
            h = workerState5;
            WorkerState[] workerStateArr = {workerState, workerState2, workerState3, workerState4, workerState5};
            i = workerStateArr;
            j = EnumEntriesKt.a(workerStateArr);
        }

        public static WorkerState valueOf(String str) {
            return (WorkerState) Enum.valueOf(WorkerState.class, str);
        }

        public static WorkerState[] values() {
            return (WorkerState[]) i.clone();
        }
    }

    public CoroutineScheduler(int i, int i2, String str, long j) {
        this.d = i;
        this.e = i2;
        this.f = j;
        this.g = str;
        if (i < 1) {
            throw new IllegalArgumentException(a.e(i, "Core pool size ", " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(b.i(i2, i, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(a.e(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(b.l(j, "Idle worker keep alive time ", " must be positive").toString());
        }
        this.h = new GlobalQueue();
        this.i = new GlobalQueue();
        this.j = new ResizableAtomicArray((i + 1) * 2);
        this.controlState$volatile = i << 42;
    }

    public static /* synthetic */ void c(CoroutineScheduler coroutineScheduler, Runnable runnable, int i) {
        coroutineScheduler.b(runnable, false, (i & 4) == 0);
    }

    public final int a() {
        synchronized (this.j) {
            try {
                if (m.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = l;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.d) {
                    return 0;
                }
                if (i >= this.e) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.j.b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                Worker worker = new Worker(i3);
                this.j.c(i3, worker);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                worker.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, boolean z, boolean z2) {
        Task taskImpl;
        WorkerState workerState;
        TasksKt.f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof Task) {
            taskImpl = (Task) runnable;
            taskImpl.d = jNanoTime;
            taskImpl.e = z;
        } else {
            taskImpl = new TaskImpl(runnable, jNanoTime, z);
        }
        boolean z3 = taskImpl.e;
        AtomicLongFieldUpdater atomicLongFieldUpdater = l;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, llqqqql.cc00630063c00630063) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        Worker worker = threadCurrentThread instanceof Worker ? (Worker) threadCurrentThread : null;
        if (worker == null || !Intrinsics.c(CoroutineScheduler.this, this)) {
            worker = null;
        }
        if (worker != null && (workerState = worker.f) != WorkerState.h && (taskImpl.e || workerState != WorkerState.e)) {
            worker.j = true;
            WorkQueue workQueue = worker.d;
            if (z2) {
                taskImpl = workQueue.a(taskImpl);
            } else {
                workQueue.getClass();
                Task task = (Task) WorkQueue.b.getAndSet(workQueue, taskImpl);
                taskImpl = task == null ? null : workQueue.a(task);
            }
        }
        if (taskImpl != null) {
            if (!(taskImpl.e ? this.i.a(taskImpl) : this.h.a(taskImpl))) {
                throw new RejectedExecutionException(a.o(new StringBuilder(), this.g, " was terminated"));
            }
        }
        if (z3) {
            if (f() || e(jAddAndGet)) {
                return;
            }
            f();
            return;
        }
        if (f() || e(atomicLongFieldUpdater.get(this))) {
            return;
        }
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a6  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.close():void");
    }

    public final void d(Worker worker, int i, int i2) {
        while (true) {
            long j = k.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (llqqqql.cc00630063c00630063 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object nextParkedWorker = worker.getNextParkedWorker();
                    while (true) {
                        if (nextParkedWorker == n) {
                            i3 = -1;
                            break;
                        }
                        if (nextParkedWorker == null) {
                            i3 = 0;
                            break;
                        }
                        Worker worker2 = (Worker) nextParkedWorker;
                        int indexInArray = worker2.getIndexInArray();
                        if (indexInArray != 0) {
                            i3 = indexInArray;
                            break;
                        }
                        nextParkedWorker = worker2.getNextParkedWorker();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (k.compareAndSet(this, j, i3 | j2)) {
                    return;
                }
            }
        }
    }

    public final boolean e(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.d;
        if (i < i2) {
            int iA = a();
            if (iA == 1 && i2 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(this, runnable, 6);
    }

    public final boolean f() {
        Symbol symbol;
        int indexInArray;
        while (true) {
            long j = k.get(this);
            Worker worker = (Worker) this.j.b((int) (2097151 & j));
            if (worker == null) {
                worker = null;
            } else {
                long j2 = (llqqqql.cc00630063c00630063 + j) & (-2097152);
                Object nextParkedWorker = worker.getNextParkedWorker();
                while (true) {
                    symbol = n;
                    if (nextParkedWorker == symbol) {
                        indexInArray = -1;
                        break;
                    }
                    if (nextParkedWorker == null) {
                        indexInArray = 0;
                        break;
                    }
                    Worker worker2 = (Worker) nextParkedWorker;
                    indexInArray = worker2.getIndexInArray();
                    if (indexInArray != 0) {
                        break;
                    }
                    nextParkedWorker = worker2.getNextParkedWorker();
                }
                if (indexInArray >= 0) {
                    if (k.compareAndSet(this, j, indexInArray | j2)) {
                        worker.g(symbol);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (worker == null) {
                return false;
            }
            if (Worker.l.compareAndSet(worker, -1, 0)) {
                LockSupport.unpark(worker);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResizableAtomicArray resizableAtomicArray = this.j;
        int iA = resizableAtomicArray.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iA; i6++) {
            Worker worker = (Worker) resizableAtomicArray.b(i6);
            if (worker != null) {
                WorkQueue workQueue = worker.d;
                workQueue.getClass();
                int i7 = WorkQueue.b.get(workQueue) != null ? (WorkQueue.c.get(workQueue) - WorkQueue.d.get(workQueue)) + 1 : WorkQueue.c.get(workQueue) - WorkQueue.d.get(workQueue);
                int iOrdinal = worker.f.ordinal();
                if (iOrdinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i3++;
                } else if (iOrdinal == 3) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i5++;
                }
            }
        }
        long j = l.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.g);
        sb4.append('@');
        sb4.append(DebugStringsKt.a(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.d;
        sb4.append(i8);
        sb4.append(", max = ");
        a.w(this.e, i, "}, Worker States {CPU = ", ", blocking = ", sb4);
        a.w(i2, i3, ", parked = ", ", dormant = ", sb4);
        a.w(i4, i5, ", terminated = ", "}, running workers queues = ", sb4);
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.h.b());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.i.b());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
