package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMappingUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;

/* loaded from: classes7.dex */
public final class DescriptorsJvmAbiUtil {
    public static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        if (i == 1 || i == 2) {
            objArr[0] = "companionObject";
        } else if (i != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static boolean b(PropertyDescriptor propertyDescriptor) {
        if (propertyDescriptor == null) {
            a(0);
            throw null;
        }
        if (propertyDescriptor.f() != CallableMemberDescriptor.Kind.e) {
            DeclarationDescriptor declarationDescriptorE = propertyDescriptor.e();
            if (declarationDescriptorE == null) {
                a(1);
                throw null;
            }
            if (DescriptorUtils.l(declarationDescriptorE)) {
                DeclarationDescriptor declarationDescriptorE2 = declarationDescriptorE.e();
                if (DescriptorUtils.n(declarationDescriptorE2, ClassKind.d) || DescriptorUtils.n(declarationDescriptorE2, ClassKind.f)) {
                    LinkedHashSet linkedHashSet = CompanionObjectMapping.f24309a;
                    if (CompanionObjectMappingUtilsKt.a((ClassDescriptor) declarationDescriptorE)) {
                    }
                    return true;
                }
            }
            if (DescriptorUtils.l(propertyDescriptor.e())) {
                FieldDescriptor fieldDescriptorN = propertyDescriptor.N();
                if ((fieldDescriptorN == null || !fieldDescriptorN.getAnnotations().m2(JvmAbi.f24407a)) ? propertyDescriptor.getAnnotations().m2(JvmAbi.f24407a) : true) {
                    return true;
                }
            }
        }
        return false;
    }
}
