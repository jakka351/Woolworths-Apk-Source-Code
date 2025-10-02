package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.Unit;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;

/* loaded from: classes.dex */
class DescriptorRenderer$$Lambda$4 implements Function1 {
    public static final DescriptorRenderer$$Lambda$4 d = new DescriptorRenderer$$Lambda$4();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DescriptorRendererOptions withOptions = (DescriptorRendererOptions) obj;
        DescriptorRendererImpl descriptorRendererImpl = DescriptorRenderer.f24521a;
        Intrinsics.h(withOptions, "$this$withOptions");
        withOptions.e(EmptySet.d);
        withOptions.o(ClassifierNamePolicy.SHORT.f24519a);
        withOptions.a(ParameterNameRenderingPolicy.e);
        return Unit.f24250a;
    }
}
