package coil3.network.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-network-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SingleParameterLazyKt {
    public static final SingleParameterLazy a(Function1 function1) {
        SingleParameterLazy singleParameterLazy = new SingleParameterLazy();
        singleParameterLazy.f13132a = function1;
        singleParameterLazy.b = UNINITIALIZED.f13133a;
        return singleParameterLazy;
    }
}
