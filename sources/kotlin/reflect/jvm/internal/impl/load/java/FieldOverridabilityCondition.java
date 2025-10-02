package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JavaDescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;

/* loaded from: classes.dex */
public final class FieldOverridabilityCondition implements ExternalOverridabilityCondition {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public final ExternalOverridabilityCondition.Contract a() {
        return ExternalOverridabilityCondition.Contract.f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public final ExternalOverridabilityCondition.Result b(CallableDescriptor superDescriptor, CallableDescriptor subDescriptor, ClassDescriptor classDescriptor) {
        Intrinsics.h(superDescriptor, "superDescriptor");
        Intrinsics.h(subDescriptor, "subDescriptor");
        boolean z = subDescriptor instanceof PropertyDescriptor;
        ExternalOverridabilityCondition.Result result = ExternalOverridabilityCondition.Result.f;
        if (!z || !(superDescriptor instanceof PropertyDescriptor)) {
            return result;
        }
        PropertyDescriptor propertyDescriptor = (PropertyDescriptor) subDescriptor;
        PropertyDescriptor propertyDescriptor2 = (PropertyDescriptor) superDescriptor;
        return !Intrinsics.c(propertyDescriptor.getName(), propertyDescriptor2.getName()) ? result : (JavaDescriptorUtilKt.a(propertyDescriptor) && JavaDescriptorUtilKt.a(propertyDescriptor2)) ? ExternalOverridabilityCondition.Result.d : (JavaDescriptorUtilKt.a(propertyDescriptor) || JavaDescriptorUtilKt.a(propertyDescriptor2)) ? ExternalOverridabilityCondition.Result.e : result;
    }
}
