package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes.dex */
class DescriptorRendererOptionsImpl$$Lambda$0 implements Function1 {
    public static final DescriptorRendererOptionsImpl$$Lambda$0 d = new DescriptorRendererOptionsImpl$$Lambda$0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KotlinType it = (KotlinType) obj;
        KProperty[] kPropertyArr = DescriptorRendererOptionsImpl.Y;
        Intrinsics.h(it, "it");
        return it;
    }
}
