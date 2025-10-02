package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;

/* loaded from: classes.dex */
class DescriptorRenderer$$Lambda$9 implements Function1 {
    public static final DescriptorRenderer$$Lambda$9 d = new DescriptorRenderer$$Lambda$9();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DescriptorRendererOptions withOptions = (DescriptorRendererOptions) obj;
        DescriptorRendererImpl descriptorRendererImpl = DescriptorRenderer.f24521a;
        Intrinsics.h(withOptions, "$this$withOptions");
        withOptions.d();
        withOptions.o(ClassifierNamePolicy.FULLY_QUALIFIED.f24518a);
        withOptions.e(DescriptorRendererModifier.f);
        return Unit.f24250a;
    }
}
