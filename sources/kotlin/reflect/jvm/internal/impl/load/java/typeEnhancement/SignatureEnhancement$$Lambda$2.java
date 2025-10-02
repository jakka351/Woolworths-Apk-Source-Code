package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes7.dex */
class SignatureEnhancement$$Lambda$2 implements Function1 {
    public static final SignatureEnhancement$$Lambda$2 d = new SignatureEnhancement$$Lambda$2();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CallableMemberDescriptor it = (CallableMemberDescriptor) obj;
        Intrinsics.h(it, "it");
        KotlinType returnType = it.getReturnType();
        Intrinsics.e(returnType);
        return returnType;
    }
}
