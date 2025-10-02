package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeserializedDeclarationsFromSupertypeConflictDataKey;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;

/* loaded from: classes7.dex */
public final class DeserializedClassDescriptor$DeserializedClassMemberScope$generateFakeOverrides$1 extends NonReportingOverrideStrategy {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f24588a;

    public DeserializedClassDescriptor$DeserializedClassMemberScope$generateFakeOverrides$1(ArrayList arrayList) {
        this.f24588a = arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
    public final void a(CallableMemberDescriptor fakeOverride) {
        Intrinsics.h(fakeOverride, "fakeOverride");
        OverridingUtil.r(fakeOverride, null);
        this.f24588a.add(fakeOverride);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
    public final void c(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor fromCurrent) {
        Intrinsics.h(fromCurrent, "fromCurrent");
        if (fromCurrent instanceof FunctionDescriptorImpl) {
            ((FunctionDescriptorImpl) fromCurrent).N0(DeserializedDeclarationsFromSupertypeConflictDataKey.f24333a, callableMemberDescriptor);
        }
    }
}
