package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"lifecycle-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RepeatOnLifecycleKt {
    public static final Object a(Lifecycle lifecycle, Lifecycle.State state, Function2 function2, SuspendLambda suspendLambda) {
        Object objC;
        if (state != Lifecycle.State.e) {
            return (lifecycle.getD() != Lifecycle.State.d && (objC = CoroutineScopeKt.c(new RepeatOnLifecycleKt$repeatOnLifecycle$3(lifecycle, state, function2, null), suspendLambda)) == CoroutineSingletons.d) ? objC : Unit.f24250a;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
    }
}
