package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.text.Regex;

/* loaded from: classes7.dex */
class KDeclarationContainerImpl$$Lambda$3 implements Function1 {
    public static final KDeclarationContainerImpl$$Lambda$3 d = new KDeclarationContainerImpl$$Lambda$3();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FunctionDescriptor descriptor = (FunctionDescriptor) obj;
        Regex regex = KDeclarationContainerImpl.d;
        Intrinsics.h(descriptor, "descriptor");
        return DescriptorRenderer.c.z(descriptor) + " | " + RuntimeTypeMapper.c(descriptor).getB();
    }
}
