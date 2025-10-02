package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* loaded from: classes7.dex */
public final class JavaForKotlinOverridePropertyDescriptor extends JavaPropertyDescriptor {
    public final SimpleFunctionDescriptor F;
    public final SimpleFunctionDescriptor G;
    public final PropertyDescriptor H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaForKotlinOverridePropertyDescriptor(ClassDescriptor ownerDescriptor, SimpleFunctionDescriptor simpleFunctionDescriptor, SimpleFunctionDescriptor simpleFunctionDescriptor2, PropertyDescriptor propertyDescriptor) {
        super(ownerDescriptor, Annotations.Companion.f24350a, simpleFunctionDescriptor.k(), simpleFunctionDescriptor.getVisibility(), simpleFunctionDescriptor2 != null, propertyDescriptor.getName(), simpleFunctionDescriptor.g(), null, CallableMemberDescriptor.Kind.d, false, null);
        Intrinsics.h(ownerDescriptor, "ownerDescriptor");
        this.F = simpleFunctionDescriptor;
        this.G = simpleFunctionDescriptor2;
        this.H = propertyDescriptor;
    }
}
