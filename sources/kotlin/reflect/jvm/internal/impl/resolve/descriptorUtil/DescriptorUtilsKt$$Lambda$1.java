package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;

/* loaded from: classes7.dex */
class DescriptorUtilsKt$$Lambda$1 implements Function1 {
    public static final DescriptorUtilsKt$$Lambda$1 d = new DescriptorUtilsKt$$Lambda$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DeclarationDescriptor it = (DeclarationDescriptor) obj;
        int i = DescriptorUtilsKt.f24544a;
        Intrinsics.h(it, "it");
        return it.e();
    }
}
