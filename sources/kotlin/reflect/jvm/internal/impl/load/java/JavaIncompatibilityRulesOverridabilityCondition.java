package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;

/* loaded from: classes.dex */
public final class JavaIncompatibilityRulesOverridabilityCondition implements ExternalOverridabilityCondition {

    public static final class Companion {
        public static boolean a(CallableDescriptor superDescriptor, CallableDescriptor subDescriptor) {
            Intrinsics.h(superDescriptor, "superDescriptor");
            Intrinsics.h(subDescriptor, "subDescriptor");
            if (!(subDescriptor instanceof JavaMethodDescriptor) || !(superDescriptor instanceof FunctionDescriptor)) {
                return false;
            }
            JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) subDescriptor;
            javaMethodDescriptor.h().size();
            FunctionDescriptor functionDescriptor = (FunctionDescriptor) superDescriptor;
            functionDescriptor.h().size();
            List listH = javaMethodDescriptor.a().h();
            Intrinsics.g(listH, "getValueParameters(...)");
            List listH2 = functionDescriptor.H0().h();
            Intrinsics.g(listH2, "getValueParameters(...)");
            Iterator it = CollectionsKt.Q0(listH, listH2).iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) pair.d;
                ValueParameterDescriptor valueParameterDescriptor2 = (ValueParameterDescriptor) pair.e;
                Intrinsics.e(valueParameterDescriptor);
                boolean z = b((FunctionDescriptor) subDescriptor, valueParameterDescriptor) instanceof JvmType.Primitive;
                Intrinsics.e(valueParameterDescriptor2);
                if (z != (b(functionDescriptor, valueParameterDescriptor2) instanceof JvmType.Primitive)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
        
            if (kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.g(r0).equals(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.g(r3)) == false) goto L23;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType b(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r4, kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r5) {
            /*
                boolean r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.c(r4)
                java.lang.String r1 = "getType(...)"
                if (r0 != 0) goto L6a
                java.util.List r0 = r4.h()
                int r0 = r0.size()
                r2 = 1
                if (r0 == r2) goto L14
                goto L5e
            L14:
                kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r0 = r4.e()
                boolean r2 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
                r3 = 0
                if (r2 == 0) goto L20
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r0
                goto L21
            L20:
                r0 = r3
            L21:
                if (r0 != 0) goto L24
                goto L5e
            L24:
                java.util.List r4 = r4.h()
                java.lang.String r2 = "getValueParameters(...)"
                kotlin.jvm.internal.Intrinsics.g(r4, r2)
                java.lang.Object r4 = kotlin.collections.CollectionsKt.n0(r4)
                kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) r4
                kotlin.reflect.jvm.internal.impl.types.KotlinType r4 = r4.getType()
                kotlin.reflect.jvm.internal.impl.types.TypeConstructor r4 = r4.J0()
                kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor r4 = r4.c()
                boolean r2 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
                if (r2 == 0) goto L46
                r3 = r4
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r3
            L46:
                if (r3 != 0) goto L49
                goto L5e
            L49:
                kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r4 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.u(r0)
                if (r4 == 0) goto L5e
                kotlin.reflect.jvm.internal.impl.name.FqName r4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.g(r0)
                kotlin.reflect.jvm.internal.impl.name.FqName r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.g(r3)
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L5e
                goto L6a
            L5e:
                kotlin.reflect.jvm.internal.impl.types.KotlinType r4 = r5.getType()
                kotlin.jvm.internal.Intrinsics.g(r4, r1)
                kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType r4 = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.d(r4)
                return r4
            L6a:
                kotlin.reflect.jvm.internal.impl.types.KotlinType r4 = r5.getType()
                kotlin.jvm.internal.Intrinsics.g(r4, r1)
                kotlin.reflect.jvm.internal.impl.types.UnwrappedType r4 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.n(r4)
                kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType r4 = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.d(r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition.Companion.b(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor):kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType");
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public final ExternalOverridabilityCondition.Contract a() {
        return ExternalOverridabilityCondition.Contract.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1  */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result b(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor r6, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor r7, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r8) {
        /*
            r5 = this;
            java.lang.String r0 = "superDescriptor"
            kotlin.jvm.internal.Intrinsics.h(r6, r0)
            java.lang.String r0 = "subDescriptor"
            kotlin.jvm.internal.Intrinsics.h(r7, r0)
            boolean r0 = r6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
            if (r0 == 0) goto La1
            boolean r0 = r7 instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
            if (r0 == 0) goto La1
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.A(r7)
            if (r0 == 0) goto L1a
            goto La1
        L1a:
            int r0 = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.l
            r0 = r7
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) r0
            kotlin.reflect.jvm.internal.impl.name.Name r1 = r0.getName()
            java.lang.String r2 = "getName(...)"
            kotlin.jvm.internal.Intrinsics.g(r1, r2)
            boolean r1 = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.b(r1)
            if (r1 != 0) goto L3e
            java.util.ArrayList r1 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.f24412a
            kotlin.reflect.jvm.internal.impl.name.Name r1 = r0.getName()
            kotlin.jvm.internal.Intrinsics.g(r1, r2)
            boolean r1 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.b(r1)
            if (r1 != 0) goto L3e
            goto La1
        L3e:
            r1 = r6
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r1
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1 = kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.c(r1)
            boolean r2 = r6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
            if (r2 == 0) goto L4d
            r3 = r6
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) r3
            goto L4e
        L4d:
            r3 = 0
        L4e:
            if (r3 == 0) goto L5b
            boolean r4 = r0.D0()
            boolean r3 = r3.D0()
            if (r4 != r3) goto L5b
            goto L64
        L5b:
            if (r1 == 0) goto La7
            boolean r3 = r0.D0()
            if (r3 != 0) goto L64
            goto La7
        L64:
            boolean r3 = r8 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor
            if (r3 == 0) goto La1
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r3 = r0.w0()
            if (r3 == 0) goto L6f
            goto La1
        L6f:
            if (r1 == 0) goto La1
            boolean r8 = kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.d(r8, r1)
            if (r8 == 0) goto L78
            goto La1
        L78:
            boolean r8 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
            if (r8 == 0) goto La7
            if (r2 == 0) goto La7
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) r1
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r8 = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.a(r1)
            if (r8 == 0) goto La7
            r8 = 2
            java.lang.String r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.a(r0, r8)
            r1 = r6
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) r1
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r1 = r1.H0()
            java.lang.String r2 = "getOriginal(...)"
            kotlin.jvm.internal.Intrinsics.g(r1, r2)
            java.lang.String r8 = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.a(r1, r8)
            boolean r8 = kotlin.jvm.internal.Intrinsics.c(r0, r8)
            if (r8 == 0) goto La7
        La1:
            boolean r6 = kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition.Companion.a(r6, r7)
            if (r6 == 0) goto Laa
        La7:
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r6 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.e
            return r6
        Laa:
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r6 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.f
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition.b(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor):kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result");
    }
}
