package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: classes7.dex */
class DescriptorRendererImpl$$Lambda$2 implements Function1 {
    public final DescriptorRendererImpl d;

    public DescriptorRendererImpl$$Lambda$2(DescriptorRendererImpl descriptorRendererImpl) {
        this.d = descriptorRendererImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TypeProjection it = (TypeProjection) obj;
        int i = DescriptorRendererImpl.f;
        Intrinsics.h(it, "it");
        if (it.a()) {
            return "*";
        }
        KotlinType type = it.getType();
        Intrinsics.g(type, "getType(...)");
        String strZ = this.d.Z(type);
        if (it.b() == Variance.f) {
            return strZ;
        }
        return it.b() + ' ' + strZ;
    }
}
