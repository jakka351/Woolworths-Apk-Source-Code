package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;

/* loaded from: classes.dex */
class DescriptorRendererOptionsImpl$$Lambda$1 implements Function1 {
    public static final DescriptorRendererOptionsImpl$$Lambda$1 d = new DescriptorRendererOptionsImpl$$Lambda$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ValueParameterDescriptor it = (ValueParameterDescriptor) obj;
        KProperty[] kPropertyArr = DescriptorRendererOptionsImpl.Y;
        Intrinsics.h(it, "it");
        return "...";
    }
}
