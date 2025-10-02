package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* loaded from: classes7.dex */
class SpecialBuiltinMembers$$Lambda$0 implements Function1 {
    public static final SpecialBuiltinMembers$$Lambda$0 d = new SpecialBuiltinMembers$$Lambda$0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CallableMemberDescriptor it = (CallableMemberDescriptor) obj;
        Intrinsics.h(it, "it");
        return Boolean.valueOf(ClassicBuiltinSpecialProperties.b(DescriptorUtilsKt.l(it)));
    }
}
