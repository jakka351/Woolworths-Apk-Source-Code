package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;

/* loaded from: classes7.dex */
class DescriptorRendererImpl$$Lambda$5 implements Function1 {
    public static final DescriptorRendererImpl$$Lambda$5 d = new DescriptorRendererImpl$$Lambda$5();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DescriptorRendererOptions withOptions = (DescriptorRendererOptions) obj;
        int i = DescriptorRendererImpl.f;
        Intrinsics.h(withOptions, "$this$withOptions");
        withOptions.f(SetsKt.g(withOptions.b(), CollectionsKt.R(StandardNames.FqNames.p, StandardNames.FqNames.q)));
        return Unit.f24250a;
    }
}
