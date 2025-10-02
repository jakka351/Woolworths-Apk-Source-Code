package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes7.dex */
class ReflectionObjectRenderer$$Lambda$1 implements Function1 {
    public static final ReflectionObjectRenderer$$Lambda$1 d = new ReflectionObjectRenderer$$Lambda$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DescriptorRendererImpl descriptorRendererImpl = ReflectionObjectRenderer.f24292a;
        KotlinType type = ((ValueParameterDescriptor) obj).getType();
        Intrinsics.g(type, "getType(...)");
        return ReflectionObjectRenderer.e(type);
    }
}
