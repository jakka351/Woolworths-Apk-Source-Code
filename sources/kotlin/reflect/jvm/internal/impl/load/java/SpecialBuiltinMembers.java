package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.LinkedHashMap;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedure;

@JvmName
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SpecialBuiltinMembers {
    public static final String a(FunctionDescriptor functionDescriptor) {
        CallableMemberDescriptor callableMemberDescriptorB = KotlinBuiltIns.A(functionDescriptor) ? b(functionDescriptor) : null;
        if (callableMemberDescriptorB != null) {
            CallableMemberDescriptor callableMemberDescriptorL = DescriptorUtilsKt.l(callableMemberDescriptorB);
            if (callableMemberDescriptorL instanceof PropertyDescriptor) {
                return ClassicBuiltinSpecialProperties.a(callableMemberDescriptorL);
            }
            if (callableMemberDescriptorL instanceof SimpleFunctionDescriptor) {
                int i = BuiltinMethodsWithDifferentJvmName.l;
                LinkedHashMap linkedHashMap = SpecialGenericSignatures.i;
                String strB = MethodSignatureMappingKt.b((SimpleFunctionDescriptor) callableMemberDescriptorL);
                Name name = strB == null ? null : (Name) linkedHashMap.get(strB);
                if (name != null) {
                    return name.b();
                }
            }
        }
        return null;
    }

    public static final CallableMemberDescriptor b(CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.h(callableMemberDescriptor, "<this>");
        if (!SpecialGenericSignatures.j.contains(callableMemberDescriptor.getName()) && !BuiltinSpecialProperties.d.contains(DescriptorUtilsKt.l(callableMemberDescriptor).getName())) {
            return null;
        }
        if ((callableMemberDescriptor instanceof PropertyDescriptor) || (callableMemberDescriptor instanceof PropertyAccessorDescriptor)) {
            return DescriptorUtilsKt.b(callableMemberDescriptor, SpecialBuiltinMembers$$Lambda$0.d);
        }
        if (callableMemberDescriptor instanceof SimpleFunctionDescriptor) {
            return DescriptorUtilsKt.b(callableMemberDescriptor, SpecialBuiltinMembers$$Lambda$1.d);
        }
        return null;
    }

    public static final CallableMemberDescriptor c(CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.h(callableMemberDescriptor, "<this>");
        CallableMemberDescriptor callableMemberDescriptorB = b(callableMemberDescriptor);
        if (callableMemberDescriptorB != null) {
            return callableMemberDescriptorB;
        }
        int i = BuiltinMethodsWithSpecialGenericSignature.l;
        Name name = callableMemberDescriptor.getName();
        Intrinsics.g(name, "getName(...)");
        if (BuiltinMethodsWithSpecialGenericSignature.b(name)) {
            return DescriptorUtilsKt.b(callableMemberDescriptor, SpecialBuiltinMembers$$Lambda$2.d);
        }
        return null;
    }

    public static final boolean d(ClassDescriptor classDescriptor, CallableMemberDescriptor specialCallableDescriptor) {
        Intrinsics.h(classDescriptor, "<this>");
        Intrinsics.h(specialCallableDescriptor, "specialCallableDescriptor");
        DeclarationDescriptor declarationDescriptorE = specialCallableDescriptor.e();
        Intrinsics.f(declarationDescriptorE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        SimpleType simpleTypeT = ((ClassDescriptor) declarationDescriptorE).t();
        Intrinsics.g(simpleTypeT, "getDefaultType(...)");
        for (ClassDescriptor classDescriptorJ = DescriptorUtils.j(classDescriptor); classDescriptorJ != null; classDescriptorJ = DescriptorUtils.j(classDescriptorJ)) {
            if (!(classDescriptorJ instanceof JavaClassDescriptor) && TypeCheckingProcedure.a(classDescriptorJ.t(), simpleTypeT) != null) {
                return !KotlinBuiltIns.A(classDescriptorJ);
            }
        }
        return false;
    }
}
