package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;

/* loaded from: classes7.dex */
public final class MethodSignatureBuildingUtilsKt {
    public static final String a(ClassDescriptor classDescriptor, String jvmDescriptor) {
        Intrinsics.h(classDescriptor, "classDescriptor");
        Intrinsics.h(jvmDescriptor, "jvmDescriptor");
        String str = JavaToKotlinClassMap.f24321a;
        ClassId classIdE = JavaToKotlinClassMap.e(DescriptorUtilsKt.g(classDescriptor).f24500a);
        return SignatureBuildingComponents.f(classIdE != null ? JvmClassName.e(classIdE) : DescriptorBasedTypeSignatureMappingKt.a(classDescriptor, TypeMappingConfigurationImpl.f24476a), jvmDescriptor);
    }
}
