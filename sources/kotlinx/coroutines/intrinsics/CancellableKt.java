package kotlinx.coroutines.intrinsics;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.internal.DispatchedContinuationKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CancellableKt {
    public static final void a(Throwable th, Continuation continuation) {
        if (th instanceof DispatchException) {
            th = ((DispatchException) th).d;
        }
        continuation.resumeWith(ResultKt.a(th));
        throw th;
    }

    public static final void b(Continuation continuation, AbstractCoroutine abstractCoroutine) {
        try {
            DispatchedContinuationKt.a(Unit.f24250a, IntrinsicsKt.b(continuation));
        } catch (Throwable th) {
            a(th, abstractCoroutine);
            throw null;
        }
    }
}
