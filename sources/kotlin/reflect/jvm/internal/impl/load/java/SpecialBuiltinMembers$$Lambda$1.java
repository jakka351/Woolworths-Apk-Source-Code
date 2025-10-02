package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* loaded from: classes7.dex */
class SpecialBuiltinMembers$$Lambda$1 implements Function1 {
    public static final SpecialBuiltinMembers$$Lambda$1 d = new SpecialBuiltinMembers$$Lambda$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CallableMemberDescriptor it = (CallableMemberDescriptor) obj;
        Intrinsics.h(it, "it");
        int i = BuiltinMethodsWithDifferentJvmName.l;
        final SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) it;
        return Boolean.valueOf(KotlinBuiltIns.A(simpleFunctionDescriptor) && DescriptorUtilsKt.b(simpleFunctionDescriptor, new Function1(simpleFunctionDescriptor) { // from class: kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName$$Lambda$0
            public final SimpleFunctionDescriptor d;

            {
                this.d = simpleFunctionDescriptor;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                CallableMemberDescriptor it2 = (CallableMemberDescriptor) obj2;
                int i2 = BuiltinMethodsWithDifferentJvmName.l;
                Intrinsics.h(it2, "it");
                return Boolean.valueOf(SpecialGenericSignatures.i.containsKey(MethodSignatureMappingKt.b(this.d)));
            }
        }) != null);
    }
}
