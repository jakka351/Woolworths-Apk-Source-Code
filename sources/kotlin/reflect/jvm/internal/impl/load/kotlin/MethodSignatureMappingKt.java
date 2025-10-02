package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class MethodSignatureMappingKt {
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r4, int r5) {
        /*
            r0 = r5 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            r5 = r5 & 2
            if (r5 == 0) goto Le
            r1 = r2
        Le:
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.Intrinsics.h(r4, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            if (r1 == 0) goto L31
            boolean r1 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
            if (r1 == 0) goto L21
            java.lang.String r1 = "<init>"
            goto L2e
        L21:
            kotlin.reflect.jvm.internal.impl.name.Name r1 = r4.getName()
            java.lang.String r1 = r1.b()
            java.lang.String r2 = "asString(...)"
            kotlin.jvm.internal.Intrinsics.g(r1, r2)
        L2e:
            r5.append(r1)
        L31:
            java.lang.String r1 = "("
            r5.append(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor r1 = r4.e0()
            java.lang.String r2 = "getType(...)"
            if (r1 == 0) goto L4c
            kotlin.reflect.jvm.internal.impl.types.KotlinType r1 = r1.getType()
            kotlin.jvm.internal.Intrinsics.g(r1, r2)
            kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType r1 = d(r1)
            r5.append(r1)
        L4c:
            java.util.List r1 = r4.h()
            java.util.Iterator r1 = r1.iterator()
        L54:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L6f
            java.lang.Object r3 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) r3
            kotlin.reflect.jvm.internal.impl.types.KotlinType r3 = r3.getType()
            kotlin.jvm.internal.Intrinsics.g(r3, r2)
            kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType r3 = d(r3)
            r5.append(r3)
            goto L54
        L6f:
            java.lang.String r1 = ")"
            r5.append(r1)
            if (r0 == 0) goto Lb1
            boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
            if (r0 == 0) goto L7b
            goto L9d
        L7b:
            kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = r4.getReturnType()
            kotlin.jvm.internal.Intrinsics.e(r0)
            kotlin.reflect.jvm.internal.impl.name.Name r1 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.f
            kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe r1 = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.d
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.E(r0, r1)
            if (r0 == 0) goto La3
            kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = r4.getReturnType()
            kotlin.jvm.internal.Intrinsics.e(r0)
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.TypeUtils.f(r0)
            if (r0 != 0) goto La3
            boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor
            if (r0 != 0) goto La3
        L9d:
            java.lang.String r4 = "V"
            r5.append(r4)
            goto Lb1
        La3:
            kotlin.reflect.jvm.internal.impl.types.KotlinType r4 = r4.getReturnType()
            kotlin.jvm.internal.Intrinsics.e(r4)
            kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType r4 = d(r4)
            r5.append(r4)
        Lb1:
            java.lang.String r4 = r5.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.a(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, int):java.lang.String");
    }

    public static final String b(CallableDescriptor callableDescriptor) {
        Intrinsics.h(callableDescriptor, "<this>");
        if (!DescriptorUtils.o(callableDescriptor)) {
            DeclarationDescriptor declarationDescriptorE = callableDescriptor.e();
            ClassDescriptor classDescriptor = declarationDescriptorE instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorE : null;
            if (classDescriptor != null && !classDescriptor.getName().e) {
                CallableDescriptor callableDescriptorH0 = callableDescriptor.H0();
                SimpleFunctionDescriptor simpleFunctionDescriptor = callableDescriptorH0 instanceof SimpleFunctionDescriptor ? (SimpleFunctionDescriptor) callableDescriptorH0 : null;
                if (simpleFunctionDescriptor != null) {
                    return MethodSignatureBuildingUtilsKt.a(classDescriptor, a(simpleFunctionDescriptor, 3));
                }
            }
        }
        return null;
    }

    public static final boolean c(FunctionDescriptor f) {
        FunctionDescriptor functionDescriptorA;
        Intrinsics.h(f, "f");
        if (!Intrinsics.c(f.getName().b(), "remove") || f.h().size() != 1 || (DescriptorUtilsKt.l(f).e() instanceof JavaClassDescriptor) || KotlinBuiltIns.A(f)) {
            return false;
        }
        List listH = f.H0().h();
        Intrinsics.g(listH, "getValueParameters(...)");
        KotlinType type = ((ValueParameterDescriptor) CollectionsKt.n0(listH)).getType();
        Intrinsics.g(type, "getType(...)");
        JvmType jvmTypeD = d(type);
        JvmType.Primitive primitive = jvmTypeD instanceof JvmType.Primitive ? (JvmType.Primitive) jvmTypeD : null;
        if ((primitive != null ? primitive.i : null) != JvmPrimitiveType.INT || (functionDescriptorA = BuiltinMethodsWithSpecialGenericSignature.a(f)) == null) {
            return false;
        }
        List listH2 = functionDescriptorA.H0().h();
        Intrinsics.g(listH2, "getValueParameters(...)");
        KotlinType type2 = ((ValueParameterDescriptor) CollectionsKt.n0(listH2)).getType();
        Intrinsics.g(type2, "getType(...)");
        JvmType jvmTypeD2 = d(type2);
        DeclarationDescriptor declarationDescriptorE = functionDescriptorA.e();
        Intrinsics.g(declarationDescriptorE, "getContainingDeclaration(...)");
        return DescriptorUtilsKt.h(declarationDescriptorE).equals(StandardNames.FqNames.K.f24500a) && (jvmTypeD2 instanceof JvmType.Object) && Intrinsics.c(((JvmType.Object) jvmTypeD2).i, "java/lang/Object");
    }

    public static final JvmType d(KotlinType kotlinType) {
        return (JvmType) DescriptorBasedTypeSignatureMappingKt.b(kotlinType, TypeMappingMode.k, FunctionsKt.b());
    }
}
