package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes.dex */
public abstract class ModuleAwareClassDescriptor implements ClassDescriptor {

    public static final class Companion {
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public /* bridge */ /* synthetic */ ClassifierDescriptor a() {
        return a();
    }

    public abstract MemberScope n0(TypeSubstitution typeSubstitution, KotlinTypeRefiner kotlinTypeRefiner);

    public abstract MemberScope o0(KotlinTypeRefiner kotlinTypeRefiner);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public /* bridge */ /* synthetic */ DeclarationDescriptor a() {
        return a();
    }
}
