package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes7.dex */
class SignatureEnhancement$$Lambda$0 implements Function1 {
    public static final SignatureEnhancement$$Lambda$0 d = new SignatureEnhancement$$Lambda$0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CallableMemberDescriptor it = (CallableMemberDescriptor) obj;
        Intrinsics.h(it, "it");
        ReceiverParameterDescriptor receiverParameterDescriptorE0 = it.e0();
        Intrinsics.e(receiverParameterDescriptorE0);
        KotlinType type = receiverParameterDescriptorE0.getType();
        Intrinsics.g(type, "getType(...)");
        return type;
    }
}
