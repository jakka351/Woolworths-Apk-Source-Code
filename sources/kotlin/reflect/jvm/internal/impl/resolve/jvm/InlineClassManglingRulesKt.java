package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class InlineClassManglingRulesKt {
    public static final boolean a(KotlinType kotlinType) {
        ClassifierDescriptor classifierDescriptorC = kotlinType.J0().c();
        if (classifierDescriptorC != null && ((InlineClassesUtilsKt.b(classifierDescriptorC) && InlineClassesUtilsKt.f(classifierDescriptorC) && !DescriptorUtilsKt.g((ClassDescriptor) classifierDescriptorC).equals(StandardNames.h)) || InlineClassesUtilsKt.h(kotlinType))) {
            return true;
        }
        ClassifierDescriptor classifierDescriptorC2 = kotlinType.J0().c();
        TypeParameterDescriptor typeParameterDescriptor = classifierDescriptorC2 instanceof TypeParameterDescriptor ? (TypeParameterDescriptor) classifierDescriptorC2 : null;
        return typeParameterDescriptor != null && a(TypeUtilsKt.i(typeParameterDescriptor));
    }
}
