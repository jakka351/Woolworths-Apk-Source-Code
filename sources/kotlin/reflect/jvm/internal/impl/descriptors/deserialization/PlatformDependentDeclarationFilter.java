package kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor;

/* loaded from: classes.dex */
public interface PlatformDependentDeclarationFilter {

    /* loaded from: classes7.dex */
    public static final class All implements PlatformDependentDeclarationFilter {

        /* renamed from: a, reason: collision with root package name */
        public static final All f24353a = new All();

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter
        public final boolean a(ClassDescriptor classDescriptor, DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor) {
            Intrinsics.h(classDescriptor, "classDescriptor");
            return true;
        }
    }

    /* loaded from: classes7.dex */
    public static final class NoPlatformDependent implements PlatformDependentDeclarationFilter {

        /* renamed from: a, reason: collision with root package name */
        public static final NoPlatformDependent f24354a = new NoPlatformDependent();

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter
        public final boolean a(ClassDescriptor classDescriptor, DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor) {
            Intrinsics.h(classDescriptor, "classDescriptor");
            return !deserializedSimpleFunctionDescriptor.getAnnotations().m2(PlatformDependentDeclarationFilterKt.f24355a);
        }
    }

    boolean a(ClassDescriptor classDescriptor, DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor);
}
