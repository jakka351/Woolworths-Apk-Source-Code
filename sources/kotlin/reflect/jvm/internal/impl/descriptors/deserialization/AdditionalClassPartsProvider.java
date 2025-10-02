package kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes.dex */
public interface AdditionalClassPartsProvider {

    /* loaded from: classes7.dex */
    public static final class None implements AdditionalClassPartsProvider {

        /* renamed from: a, reason: collision with root package name */
        public static final None f24352a = new None();

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        public final Collection b(ClassDescriptor classDescriptor) {
            return EmptyList.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        public final Collection c(ClassDescriptor classDescriptor) {
            return EmptyList.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        public final Collection d(Name name, ClassDescriptor classDescriptor) {
            Intrinsics.h(name, "name");
            Intrinsics.h(classDescriptor, "classDescriptor");
            return EmptyList.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        public final Collection e(ClassDescriptor classDescriptor) {
            Intrinsics.h(classDescriptor, "classDescriptor");
            return EmptyList.d;
        }
    }

    Collection b(ClassDescriptor classDescriptor);

    Collection c(ClassDescriptor classDescriptor);

    Collection d(Name name, ClassDescriptor classDescriptor);

    Collection e(ClassDescriptor classDescriptor);
}
