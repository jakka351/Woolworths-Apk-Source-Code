package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.intrinsics.UndispatchedKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SupervisorKt {
    public static final CompletableJob a(Job job) {
        return new SupervisorJobImpl(job);
    }

    public static CompletableJob b() {
        return new SupervisorJobImpl(null);
    }

    public static final Object c(Function2 function2, Continuation continuation) {
        SupervisorCoroutine supervisorCoroutine = new SupervisorCoroutine(continuation, continuation.getE());
        Object objA = UndispatchedKt.a(supervisorCoroutine, supervisorCoroutine, function2);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return objA;
    }
}
