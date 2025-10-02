package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.ThreadContextKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class DispatchedTaskKt {
    public static final void a(CancellableContinuationImpl cancellableContinuationImpl, Continuation continuation, boolean z) {
        Object obj = CancellableContinuationImpl.j.get(cancellableContinuationImpl);
        Throwable thD = cancellableContinuationImpl.d(obj);
        Object objA = thD != null ? ResultKt.a(thD) : cancellableContinuationImpl.e(obj);
        if (!z) {
            continuation.resumeWith(objA);
            return;
        }
        Intrinsics.f(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) continuation;
        ContinuationImpl continuationImpl = dispatchedContinuation.h;
        Object obj2 = dispatchedContinuation.j;
        CoroutineContext f = continuationImpl.getE();
        Object objC = ThreadContextKt.c(f, obj2);
        UndispatchedCoroutine undispatchedCoroutineC = objC != ThreadContextKt.f24732a ? CoroutineContextKt.c(continuationImpl, f, objC) : null;
        try {
            continuationImpl.resumeWith(objA);
            if (undispatchedCoroutineC == null || undispatchedCoroutineC.r0()) {
                ThreadContextKt.a(f, objC);
            }
        } catch (Throwable th) {
            if (undispatchedCoroutineC == null || undispatchedCoroutineC.r0()) {
                ThreadContextKt.a(f, objC);
            }
            throw th;
        }
    }
}
