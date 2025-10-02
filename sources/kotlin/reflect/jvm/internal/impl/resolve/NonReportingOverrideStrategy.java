package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* loaded from: classes7.dex */
public abstract class NonReportingOverrideStrategy extends OverridingStrategy {
    public abstract void c(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2);

    public final void d(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
        c(callableMemberDescriptor, callableMemberDescriptor2);
    }
}
