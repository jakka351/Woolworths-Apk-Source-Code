package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;

/* loaded from: classes7.dex */
class BuiltinMethodsWithSpecialGenericSignature$$Lambda$0 implements Function1 {
    public static final BuiltinMethodsWithSpecialGenericSignature$$Lambda$0 d = new BuiltinMethodsWithSpecialGenericSignature$$Lambda$0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CallableMemberDescriptor it = (CallableMemberDescriptor) obj;
        int i = BuiltinMethodsWithSpecialGenericSignature.l;
        Intrinsics.h(it, "it");
        return Boolean.valueOf(CollectionsKt.t(SpecialGenericSignatures.f, MethodSignatureMappingKt.b(it)));
    }
}
