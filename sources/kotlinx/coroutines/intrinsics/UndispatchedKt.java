package kotlinx.coroutines.intrinsics;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.JobSupportKt;
import kotlinx.coroutines.internal.ScopeCoroutine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class UndispatchedKt {
    public static final Object a(ScopeCoroutine scopeCoroutine, ScopeCoroutine scopeCoroutine2, Function2 function2) {
        Object completedExceptionally;
        Object objA0;
        try {
            TypeIntrinsics.d(2, function2);
            completedExceptionally = function2.invoke(scopeCoroutine2, scopeCoroutine);
        } catch (Throwable th) {
            completedExceptionally = new CompletedExceptionally(th, false);
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        if (completedExceptionally == coroutineSingletons || (objA0 = scopeCoroutine.a0(completedExceptionally)) == JobSupportKt.b) {
            return coroutineSingletons;
        }
        scopeCoroutine.q0();
        if (objA0 instanceof CompletedExceptionally) {
            throw ((CompletedExceptionally) objA0).f24689a;
        }
        return JobSupportKt.a(objA0);
    }
}
