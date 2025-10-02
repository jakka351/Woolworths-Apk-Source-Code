package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.text.Regex;

/* loaded from: classes7.dex */
class KDeclarationContainerImpl$$Lambda$2 implements Function1 {
    public static final KDeclarationContainerImpl$$Lambda$2 d = new KDeclarationContainerImpl$$Lambda$2();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PropertyDescriptor descriptor = (PropertyDescriptor) obj;
        Regex regex = KDeclarationContainerImpl.d;
        Intrinsics.h(descriptor, "descriptor");
        return DescriptorRenderer.c.z(descriptor) + " | " + RuntimeTypeMapper.b(descriptor).getF();
    }
}
