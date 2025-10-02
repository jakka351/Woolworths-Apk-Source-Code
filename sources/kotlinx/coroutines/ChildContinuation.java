package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.coroutines.internal.Symbol;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/ChildContinuation;", "Lkotlinx/coroutines/JobNode;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class ChildContinuation extends JobNode {
    public final CancellableContinuationImpl h;

    public ChildContinuation(CancellableContinuationImpl cancellableContinuationImpl) {
        this.h = cancellableContinuationImpl;
    }

    @Override // kotlinx.coroutines.JobNode
    public final boolean k() {
        return true;
    }

    @Override // kotlinx.coroutines.JobNode
    public final void l(Throwable th) throws DispatchException {
        JobSupport jobSupportJ = j();
        CancellableContinuationImpl cancellableContinuationImpl = this.h;
        Throwable thM = cancellableContinuationImpl.m(jobSupportJ);
        if (cancellableContinuationImpl.x()) {
            DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) cancellableContinuationImpl.g;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = DispatchedContinuation.k;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(dispatchedContinuation);
                Symbol symbol = DispatchedContinuationKt.b;
                if (!Intrinsics.c(obj, symbol)) {
                    if (!(obj instanceof Throwable)) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(dispatchedContinuation, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(dispatchedContinuation) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(dispatchedContinuation, symbol, thM)) {
                    if (atomicReferenceFieldUpdater.get(dispatchedContinuation) != symbol) {
                        break;
                    }
                }
                return;
            }
        }
        cancellableContinuationImpl.cancel(thM);
        if (cancellableContinuationImpl.x()) {
            return;
        }
        cancellableContinuationImpl.k();
    }
}
