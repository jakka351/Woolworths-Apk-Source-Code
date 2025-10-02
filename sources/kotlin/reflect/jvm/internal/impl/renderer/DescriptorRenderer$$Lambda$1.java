package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
class DescriptorRenderer$$Lambda$1 implements Function1 {
    public static final DescriptorRenderer$$Lambda$1 d = new DescriptorRenderer$$Lambda$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DescriptorRendererOptions withOptions = (DescriptorRendererOptions) obj;
        DescriptorRendererImpl descriptorRendererImpl = DescriptorRenderer.f24521a;
        Intrinsics.h(withOptions, "$this$withOptions");
        withOptions.h();
        return Unit.f24250a;
    }
}
