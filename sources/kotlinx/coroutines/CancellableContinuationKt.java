package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.coroutines.internal.Symbol;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CancellableContinuationKt {
    public static final void a(CancellableContinuationImpl cancellableContinuationImpl, DisposableHandle disposableHandle) {
        cancellableContinuationImpl.s(new DisposeOnCancel(disposableHandle));
    }

    public static final CancellableContinuationImpl b(Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl;
        CancellableContinuationImpl cancellableContinuationImpl2;
        if (!(continuation instanceof DispatchedContinuation)) {
            return new CancellableContinuationImpl(1, continuation);
        }
        DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) continuation;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = DispatchedContinuation.k;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(dispatchedContinuation);
            cancellableContinuationImpl = null;
            Symbol symbol = DispatchedContinuationKt.b;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(dispatchedContinuation, symbol);
                cancellableContinuationImpl2 = null;
                break;
            }
            if (obj instanceof CancellableContinuationImpl) {
                while (!atomicReferenceFieldUpdater.compareAndSet(dispatchedContinuation, obj, symbol)) {
                    if (atomicReferenceFieldUpdater.get(dispatchedContinuation) != obj) {
                        break;
                    }
                }
                cancellableContinuationImpl2 = (CancellableContinuationImpl) obj;
                break loop0;
            }
            if (obj != symbol && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (cancellableContinuationImpl2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = CancellableContinuationImpl.j;
            Object obj2 = atomicReferenceFieldUpdater2.get(cancellableContinuationImpl2);
            if (!(obj2 instanceof CompletedContinuation) || ((CompletedContinuation) obj2).d == null) {
                CancellableContinuationImpl.i.set(cancellableContinuationImpl2, 536870911);
                atomicReferenceFieldUpdater2.set(cancellableContinuationImpl2, Active.d);
                cancellableContinuationImpl = cancellableContinuationImpl2;
            } else {
                cancellableContinuationImpl2.k();
            }
            if (cancellableContinuationImpl != null) {
                return cancellableContinuationImpl;
            }
        }
        return new CancellableContinuationImpl(2, continuation);
    }
}
