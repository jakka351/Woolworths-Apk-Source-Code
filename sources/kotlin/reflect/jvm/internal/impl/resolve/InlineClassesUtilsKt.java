package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class InlineClassesUtilsKt {
    static {
        ClassId.Companion.b(new FqName("kotlin.jvm.JvmInline"));
    }

    public static final boolean a(CallableMemberDescriptor callableMemberDescriptor) {
        ValueClassRepresentation valueClassRepresentationF0;
        Intrinsics.h(callableMemberDescriptor, "<this>");
        if (!(callableMemberDescriptor instanceof PropertyGetterDescriptor)) {
            return false;
        }
        PropertyDescriptor propertyDescriptorG0 = ((PropertyGetterDescriptor) callableMemberDescriptor).g0();
        Intrinsics.g(propertyDescriptorG0, "getCorrespondingProperty(...)");
        if (propertyDescriptorG0.e0() != null) {
            return false;
        }
        DeclarationDescriptor declarationDescriptorE = propertyDescriptorG0.e();
        ClassDescriptor classDescriptor = declarationDescriptorE instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorE : null;
        if (classDescriptor == null || (valueClassRepresentationF0 = classDescriptor.f0()) == null) {
            return false;
        }
        Name name = propertyDescriptorG0.getName();
        Intrinsics.g(name, "getName(...)");
        return valueClassRepresentationF0.a(name);
    }

    public static final boolean b(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.h(declarationDescriptor, "<this>");
        return (declarationDescriptor instanceof ClassDescriptor) && (((ClassDescriptor) declarationDescriptor).f0() instanceof InlineClassRepresentation);
    }

    public static final boolean c(KotlinType kotlinType) {
        ClassifierDescriptor classifierDescriptorC = kotlinType.J0().c();
        if (classifierDescriptorC != null) {
            return b(classifierDescriptorC);
        }
        return false;
    }

    public static final boolean d(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.h(declarationDescriptor, "<this>");
        return (declarationDescriptor instanceof ClassDescriptor) && (((ClassDescriptor) declarationDescriptor).f0() instanceof MultiFieldValueClassRepresentation);
    }

    public static final boolean e(VariableDescriptor variableDescriptor) {
        if (variableDescriptor.e0() != null) {
            return false;
        }
        DeclarationDescriptor declarationDescriptorE = variableDescriptor.e();
        Name name = null;
        ClassDescriptor classDescriptor = declarationDescriptorE instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorE : null;
        if (classDescriptor != null) {
            int i = DescriptorUtilsKt.f24544a;
            ValueClassRepresentation valueClassRepresentationF0 = classDescriptor.f0();
            InlineClassRepresentation inlineClassRepresentation = valueClassRepresentationF0 instanceof InlineClassRepresentation ? (InlineClassRepresentation) valueClassRepresentationF0 : null;
            if (inlineClassRepresentation != null) {
                name = inlineClassRepresentation.f24334a;
            }
        }
        return Intrinsics.c(name, variableDescriptor.getName());
    }

    public static final boolean f(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.h(declarationDescriptor, "<this>");
        return b(declarationDescriptor) || d(declarationDescriptor);
    }

    public static final boolean g(KotlinType kotlinType) {
        ClassifierDescriptor classifierDescriptorC = kotlinType.J0().c();
        if (classifierDescriptorC != null) {
            return f(classifierDescriptorC);
        }
        return false;
    }

    public static final boolean h(KotlinType kotlinType) {
        Intrinsics.h(kotlinType, "<this>");
        ClassifierDescriptor classifierDescriptorC = kotlinType.J0().c();
        return (classifierDescriptorC == null || !d(classifierDescriptorC) || ClassicTypeSystemContext.DefaultImpls.I(kotlinType)) ? false : true;
    }

    public static final SimpleType i(KotlinType kotlinType) {
        Intrinsics.h(kotlinType, "<this>");
        ClassifierDescriptor classifierDescriptorC = kotlinType.J0().c();
        ClassDescriptor classDescriptor = classifierDescriptorC instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorC : null;
        if (classDescriptor != null) {
            int i = DescriptorUtilsKt.f24544a;
            ValueClassRepresentation valueClassRepresentationF0 = classDescriptor.f0();
            InlineClassRepresentation inlineClassRepresentation = valueClassRepresentationF0 instanceof InlineClassRepresentation ? (InlineClassRepresentation) valueClassRepresentationF0 : null;
            if (inlineClassRepresentation != null) {
                return (SimpleType) inlineClassRepresentation.b;
            }
        }
        return null;
    }
}
