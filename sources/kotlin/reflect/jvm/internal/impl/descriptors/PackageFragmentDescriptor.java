package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* loaded from: classes.dex */
public interface PackageFragmentDescriptor extends ClassOrPackageFragmentDescriptor {
    FqName d();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    ModuleDescriptor e();

    MemberScope s();
}
