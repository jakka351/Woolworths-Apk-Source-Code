package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;

/* loaded from: classes7.dex */
class DescriptorRendererImpl$$Lambda$1 implements Function1 {
    public static final DescriptorRendererImpl$$Lambda$1 d = new DescriptorRendererImpl$$Lambda$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KotlinType it = (KotlinType) obj;
        int i = DescriptorRendererImpl.f;
        Intrinsics.h(it, "it");
        return it instanceof StubTypeForBuilderInference ? ((StubTypeForBuilderInference) it).S0() : it;
    }
}
