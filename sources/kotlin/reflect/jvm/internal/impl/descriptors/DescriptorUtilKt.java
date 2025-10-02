package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DescriptorUtilKt {
    public static final ClassifierDescriptor a(DeclarationDescriptor declarationDescriptor) {
        DeclarationDescriptor declarationDescriptorE = declarationDescriptor.e();
        if (declarationDescriptorE == null || (declarationDescriptor instanceof PackageFragmentDescriptor)) {
            return null;
        }
        if (!(declarationDescriptorE.e() instanceof PackageFragmentDescriptor)) {
            return a(declarationDescriptorE);
        }
        if (declarationDescriptorE instanceof ClassifierDescriptor) {
            return (ClassifierDescriptor) declarationDescriptorE;
        }
        return null;
    }

    public static final ClassDescriptor b(ModuleDescriptor moduleDescriptor, FqName fqName) {
        MemberScope memberScopeG;
        NoLookupLocation noLookupLocation = NoLookupLocation.d;
        Intrinsics.h(moduleDescriptor, "<this>");
        Intrinsics.h(fqName, "fqName");
        FqNameUnsafe fqNameUnsafe = fqName.f24500a;
        if (!fqNameUnsafe.c()) {
            ClassifierDescriptor classifierDescriptorF = ((AbstractScopeAdapter) moduleDescriptor.L(fqName.b()).s()).f(fqNameUnsafe.f(), noLookupLocation);
            ClassDescriptor classDescriptor = classifierDescriptorF instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorF : null;
            if (classDescriptor != null) {
                return classDescriptor;
            }
            ClassDescriptor classDescriptorB = b(moduleDescriptor, fqName.b());
            ClassifierDescriptor classifierDescriptorF2 = (classDescriptorB == null || (memberScopeG = classDescriptorB.G()) == null) ? null : memberScopeG.f(fqNameUnsafe.f(), noLookupLocation);
            if (classifierDescriptorF2 instanceof ClassDescriptor) {
                return (ClassDescriptor) classifierDescriptorF2;
            }
        }
        return null;
    }
}
