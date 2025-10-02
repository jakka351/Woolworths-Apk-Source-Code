package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;

/* loaded from: classes7.dex */
public final class TypeMappingConfigurationImpl implements TypeMappingConfiguration<JvmType> {

    /* renamed from: a, reason: collision with root package name */
    public static final TypeMappingConfigurationImpl f24476a = new TypeMappingConfigurationImpl();

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    public final void a(ClassDescriptor classDescriptor) {
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    public final void b(ClassDescriptor classDescriptor) {
        Intrinsics.h(classDescriptor, "classDescriptor");
    }
}
