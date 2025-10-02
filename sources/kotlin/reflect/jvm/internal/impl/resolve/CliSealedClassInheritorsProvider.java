package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class CliSealedClassInheritorsProvider extends SealedClassInheritorsProvider {
    public static Collection a(ClassDescriptor classDescriptor) {
        if (classDescriptor.k() != Modality.f) {
            return EmptyList.d;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        DeclarationDescriptor declarationDescriptorE = classDescriptor.e();
        if (declarationDescriptorE instanceof PackageFragmentDescriptor) {
            b(classDescriptor, linkedHashSet, ((PackageFragmentDescriptor) declarationDescriptorE).s(), false);
        }
        MemberScope memberScopeG = classDescriptor.G();
        Intrinsics.g(memberScopeG, "getUnsubstitutedInnerClassesScope(...)");
        b(classDescriptor, linkedHashSet, memberScopeG, true);
        return CollectionsKt.u0(new CliSealedClassInheritorsProvider$computeSealedSubclasses$$inlined$sortedBy$1(), linkedHashSet);
    }

    public static final void b(ClassDescriptor classDescriptor, LinkedHashSet linkedHashSet, MemberScope memberScope, boolean z) {
        for (DeclarationDescriptor declarationDescriptor : ResolutionScope.DefaultImpls.a(memberScope, DescriptorKindFilter.o, 2)) {
            if (declarationDescriptor instanceof ClassDescriptor) {
                ClassDescriptor classDescriptorL = (ClassDescriptor) declarationDescriptor;
                if (classDescriptorL.p0()) {
                    Name name = classDescriptorL.getName();
                    Intrinsics.g(name, "getName(...)");
                    ClassifierDescriptor classifierDescriptorF = memberScope.f(name, NoLookupLocation.g);
                    classDescriptorL = classifierDescriptorF instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorF : classifierDescriptorF instanceof TypeAliasDescriptor ? ((TypeAliasDescriptor) classifierDescriptorF).l() : null;
                }
                if (classDescriptorL != null) {
                    int i = DescriptorUtils.f24530a;
                    Iterator it = classDescriptorL.m().a().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (DescriptorUtils.p((KotlinType) it.next(), classDescriptor.H0())) {
                                linkedHashSet.add(classDescriptorL);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z) {
                        MemberScope memberScopeG = classDescriptorL.G();
                        Intrinsics.g(memberScopeG, "getUnsubstitutedInnerClassesScope(...)");
                        b(classDescriptor, linkedHashSet, memberScopeG, z);
                    }
                }
            }
        }
    }
}
