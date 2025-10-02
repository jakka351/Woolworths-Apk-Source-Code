package kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* loaded from: classes7.dex */
class OperatorChecks$$Lambda$1 implements Function1 {
    public static final OperatorChecks$$Lambda$1 d = new OperatorChecks$$Lambda$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SimpleType simpleTypeT;
        UnwrappedType unwrappedTypeP;
        KotlinType returnType;
        FunctionDescriptor Checks = (FunctionDescriptor) obj;
        List list = OperatorChecks.f24645a;
        Intrinsics.h(Checks, "$this$Checks");
        DeclarationDescriptor declarationDescriptorE = Checks.e();
        Intrinsics.g(declarationDescriptorE, "getContainingDeclaration(...)");
        if (declarationDescriptorE instanceof ClassDescriptor) {
            Name name = KotlinBuiltIns.f;
            if (KotlinBuiltIns.b((ClassDescriptor) declarationDescriptorE, StandardNames.FqNames.f24314a)) {
                return null;
            }
        }
        Collection collectionQ = Checks.q();
        Intrinsics.g(collectionQ, "getOverriddenDescriptors(...)");
        Collection collection = collectionQ;
        if (!collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                DeclarationDescriptor declarationDescriptorE2 = ((FunctionDescriptor) it.next()).e();
                Intrinsics.g(declarationDescriptorE2, "getContainingDeclaration(...)");
                if (declarationDescriptorE2 instanceof ClassDescriptor) {
                    Name name2 = KotlinBuiltIns.f;
                    if (KotlinBuiltIns.b((ClassDescriptor) declarationDescriptorE2, StandardNames.FqNames.f24314a)) {
                        return null;
                    }
                }
            }
        }
        DeclarationDescriptor declarationDescriptorE3 = Checks.e();
        ClassDescriptor classDescriptor = declarationDescriptorE3 instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorE3 : null;
        if (classDescriptor != null) {
            if (!InlineClassesUtilsKt.f(classDescriptor)) {
                classDescriptor = null;
            }
            if (classDescriptor != null && (simpleTypeT = classDescriptor.t()) != null && (unwrappedTypeP = TypeUtilsKt.p(simpleTypeT)) != null && (returnType = Checks.getReturnType()) != null && Intrinsics.c(Checks.getName(), OperatorNameConventions.d)) {
                Name name3 = KotlinBuiltIns.f;
                if ((KotlinBuiltIns.C(returnType, StandardNames.FqNames.h) || KotlinBuiltIns.F(returnType)) && Checks.h().size() == 1) {
                    KotlinType type = ((ValueParameterDescriptor) Checks.h().get(0)).getType();
                    Intrinsics.g(type, "getType(...)");
                    if (Intrinsics.c(TypeUtilsKt.p(type), unwrappedTypeP) && Checks.A0().isEmpty() && Checks.e0() == null) {
                        return null;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder("must override ''equals()'' in Any");
        DeclarationDescriptor declarationDescriptorE4 = Checks.e();
        Intrinsics.g(declarationDescriptorE4, "getContainingDeclaration(...)");
        if (InlineClassesUtilsKt.f(declarationDescriptorE4)) {
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRenderer.b;
            DeclarationDescriptor declarationDescriptorE5 = Checks.e();
            Intrinsics.f(declarationDescriptorE5, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            SimpleType simpleTypeT2 = ((ClassDescriptor) declarationDescriptorE5).t();
            Intrinsics.g(simpleTypeT2, "getDefaultType(...)");
            sb.append(" or define ''equals(other: " + descriptorRendererImpl.Z(TypeUtilsKt.p(simpleTypeT2)) + "): Boolean''");
        }
        return sb.toString();
    }
}
