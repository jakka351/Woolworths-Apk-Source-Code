package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;

/* loaded from: classes7.dex */
public final class JavaDescriptorUtilKt {
    public static final boolean a(PropertyDescriptor propertyDescriptor) {
        Intrinsics.h(propertyDescriptor, "<this>");
        return propertyDescriptor.getGetter() == null;
    }
}
