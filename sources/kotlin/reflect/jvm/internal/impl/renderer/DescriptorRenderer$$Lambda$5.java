package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.Unit;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;

/* loaded from: classes.dex */
class DescriptorRenderer$$Lambda$5 implements Function1 {
    public static final DescriptorRenderer$$Lambda$5 d = new DescriptorRenderer$$Lambda$5();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DescriptorRendererOptions withOptions = (DescriptorRendererOptions) obj;
        DescriptorRendererImpl descriptorRendererImpl = DescriptorRenderer.f24521a;
        Intrinsics.h(withOptions, "$this$withOptions");
        withOptions.h();
        withOptions.e(EmptySet.d);
        withOptions.o(ClassifierNamePolicy.SHORT.f24519a);
        withOptions.k();
        withOptions.a(ParameterNameRenderingPolicy.f);
        withOptions.i();
        withOptions.j();
        withOptions.n();
        withOptions.m();
        return Unit.f24250a;
    }
}
