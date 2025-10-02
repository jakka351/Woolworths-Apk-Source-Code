package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes7.dex */
public final class ModuleAwareClassDescriptorKt {
    public static final MemberScope a(ClassDescriptor classDescriptor, TypeSubstitution typeSubstitution, KotlinTypeRefiner kotlinTypeRefiner) {
        MemberScope memberScopeN0;
        ModuleAwareClassDescriptor moduleAwareClassDescriptor = classDescriptor instanceof ModuleAwareClassDescriptor ? (ModuleAwareClassDescriptor) classDescriptor : null;
        if (moduleAwareClassDescriptor != null && (memberScopeN0 = moduleAwareClassDescriptor.n0(typeSubstitution, kotlinTypeRefiner)) != null) {
            return memberScopeN0;
        }
        MemberScope memberScopeU0 = classDescriptor.u0(typeSubstitution);
        Intrinsics.g(memberScopeU0, "getMemberScope(...)");
        return memberScopeU0;
    }

    public static final MemberScope b(ClassDescriptor classDescriptor, KotlinTypeRefiner kotlinTypeRefiner) {
        MemberScope memberScopeO0;
        ModuleAwareClassDescriptor moduleAwareClassDescriptor = classDescriptor instanceof ModuleAwareClassDescriptor ? (ModuleAwareClassDescriptor) classDescriptor : null;
        if (moduleAwareClassDescriptor != null && (memberScopeO0 = moduleAwareClassDescriptor.o0(kotlinTypeRefiner)) != null) {
            return memberScopeO0;
        }
        MemberScope memberScopeH = classDescriptor.H();
        Intrinsics.g(memberScopeH, "getUnsubstitutedMemberScope(...)");
        return memberScopeH;
    }
}
