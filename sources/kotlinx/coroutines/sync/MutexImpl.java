package kotlinx.coroutines.sync;

import au.com.woolworths.feature.shared.instore.wifi.ui.d;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.a;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectInstanceInternal;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0006\u0007R\u0013\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002X\u0082\u0004¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl;", "Lkotlinx/coroutines/sync/SemaphoreAndMutexImpl;", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/atomicfu/AtomicRef;", "", "owner", "CancellableContinuationWithOwner", "SelectInstanceWithOwner", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class MutexImpl extends SemaphoreAndMutexImpl implements Mutex {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$CancellableContinuationWithOwner;", "Lkotlinx/coroutines/CancellableContinuation;", "", "Lkotlinx/coroutines/Waiter;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public final class CancellableContinuationWithOwner implements CancellableContinuation<Unit>, Waiter {
        public final CancellableContinuationImpl d;

        public CancellableContinuationWithOwner(CancellableContinuationImpl cancellableContinuationImpl) {
            this.d = cancellableContinuationImpl;
        }

        @Override // kotlinx.coroutines.Waiter
        public final void a(Segment segment, int i) {
            this.d.a(segment, i);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public final boolean cancel(Throwable th) {
            return this.d.cancel(th);
        }

        @Override // kotlin.coroutines.Continuation
        /* renamed from: getContext */
        public final CoroutineContext getD() {
            return this.d.h;
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public final void q(Object obj, Function3 function3) throws DispatchException {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MutexImpl.h;
            MutexImpl mutexImpl = MutexImpl.this;
            atomicReferenceFieldUpdater.set(mutexImpl, null);
            this.d.B(Unit.f24250a, new d(mutexImpl, this));
        }

        @Override // kotlin.coroutines.Continuation
        public final void resumeWith(Object obj) {
            this.d.resumeWith(obj);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public final void u(Object obj) throws DispatchException {
            this.d.u(obj);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public final Symbol w(Object obj, Function3 function3) {
            MutexImpl mutexImpl = MutexImpl.this;
            a aVar = new a(mutexImpl, this);
            Symbol symbolF = this.d.F((Unit) obj, aVar);
            if (symbolF != null) {
                MutexImpl.h.set(mutexImpl, null);
            }
            return symbolF;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$SelectInstanceWithOwner;", "Q", "Lkotlinx/coroutines/selects/SelectInstanceInternal;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes7.dex */
    public final class SelectInstanceWithOwner<Q> implements SelectInstanceInternal<Q> {
        public final SelectInstanceInternal d;
        public final Object e;

        public SelectInstanceWithOwner(SelectInstanceInternal selectInstanceInternal, Object obj) {
            this.d = selectInstanceInternal;
            this.e = obj;
        }

        @Override // kotlinx.coroutines.Waiter
        public final void a(Segment segment, int i) {
            this.d.a(segment, i);
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public final void c(Object obj) {
            MutexImpl.h.set(MutexImpl.this, this.e);
            this.d.c(obj);
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public final void d(DisposableHandle disposableHandle) {
            this.d.d(disposableHandle);
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public final boolean e(Object obj, Object obj2) {
            boolean zE = this.d.e(obj, obj2);
            if (zE) {
                MutexImpl.h.set(MutexImpl.this, this.e);
            }
            return zE;
        }
    }

    public MutexImpl(boolean z) {
        super(1, z ? 1 : 0);
        this.owner$volatile = z ? null : MutexKt.f24747a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        r0.q(r1, r4.b);
     */
    @Override // kotlinx.coroutines.sync.Mutex
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r4.f()
            kotlin.Unit r1 = kotlin.Unit.f24250a
            if (r0 == 0) goto L9
            goto L3b
        L9:
            kotlin.coroutines.Continuation r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.b(r5)
            kotlinx.coroutines.CancellableContinuationImpl r5 = kotlinx.coroutines.CancellableContinuationKt.b(r5)
            kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner r0 = new kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner     // Catch: java.lang.Throwable -> L3c
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L3c
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = kotlinx.coroutines.sync.SemaphoreAndMutexImpl.g     // Catch: java.lang.Throwable -> L3c
            int r2 = r2.getAndDecrement(r4)     // Catch: java.lang.Throwable -> L3c
            int r3 = r4.f24748a     // Catch: java.lang.Throwable -> L3c
            if (r2 > r3) goto L16
            if (r2 <= 0) goto L28
            kotlinx.coroutines.a r2 = r4.b     // Catch: java.lang.Throwable -> L3c
            r0.q(r1, r2)     // Catch: java.lang.Throwable -> L3c
            goto L2e
        L28:
            boolean r2 = r4.d(r0)     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L16
        L2e:
            java.lang.Object r5 = r5.n()
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            if (r5 != r0) goto L37
            goto L38
        L37:
            r5 = r1
        L38:
            if (r5 != r0) goto L3b
            return r5
        L3b:
            return r1
        L3c:
            r0 = move-exception
            r5.A()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.MutexImpl.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public final void c(Object obj) {
        while (e()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            Symbol symbol = MutexKt.f24747a;
            if (obj2 != symbol) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, symbol)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    release();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final boolean e() {
        return Math.max(SemaphoreAndMutexImpl.g.get(this), 0) == 0;
    }

    public final boolean f() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = SemaphoreAndMutexImpl.g;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.f24748a;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > i3) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else {
                if (i2 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    h.set(this, null);
                    return true;
                }
            }
        }
    }

    public final String toString() {
        return "Mutex@" + DebugStringsKt.a(this) + "[isLocked=" + e() + ",owner=" + h.get(this) + ']';
    }
}
