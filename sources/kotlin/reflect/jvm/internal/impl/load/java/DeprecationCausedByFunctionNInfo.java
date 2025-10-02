package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue;
import kotlin.reflect.jvm.internal.impl.resolve.deprecation.DescriptorBasedDeprecationInfo;

/* loaded from: classes7.dex */
public final class DeprecationCausedByFunctionNInfo extends DescriptorBasedDeprecationInfo {
    public final JavaCallableMemberDescriptor d;

    public DeprecationCausedByFunctionNInfo(JavaCallableMemberDescriptor javaCallableMemberDescriptor) {
        this.d = javaCallableMemberDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationInfo
    public final void a() {
        DeprecationLevelValue deprecationLevelValue = DeprecationLevelValue.d;
    }
}
