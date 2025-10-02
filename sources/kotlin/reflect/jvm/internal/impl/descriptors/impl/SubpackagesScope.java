package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

/* loaded from: classes.dex */
public class SubpackagesScope extends MemberScopeImpl {
    public final ModuleDescriptor b;
    public final FqName c;

    public SubpackagesScope(ModuleDescriptor moduleDescriptor, FqName fqName) {
        Intrinsics.h(moduleDescriptor, "moduleDescriptor");
        Intrinsics.h(fqName, "fqName");
        this.b = moduleDescriptor;
        this.c = fqName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set d() {
        return EmptySet.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final Collection g(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.h(kindFilter, "kindFilter");
        DescriptorKindFilter.Companion companion = DescriptorKindFilter.c;
        if (kindFilter.a(DescriptorKindFilter.Companion.d())) {
            FqName fqName = this.c;
            if (!fqName.f24500a.c() || !kindFilter.b().contains(DescriptorKindExclude.TopLevelPackages.f24553a)) {
                ModuleDescriptor moduleDescriptor = this.b;
                Collection collectionR = moduleDescriptor.r(fqName, function1);
                ArrayList arrayList = new ArrayList(collectionR.size());
                Iterator it = collectionR.iterator();
                while (it.hasNext()) {
                    Name nameF = ((FqName) it.next()).f24500a.f();
                    if (((Boolean) function1.invoke(nameF)).booleanValue()) {
                        PackageViewDescriptor packageViewDescriptor = null;
                        if (!nameF.e) {
                            PackageViewDescriptor packageViewDescriptorL = moduleDescriptor.L(fqName.a(nameF));
                            if (!packageViewDescriptorL.isEmpty()) {
                                packageViewDescriptor = packageViewDescriptorL;
                            }
                        }
                        CollectionsKt.a(arrayList, packageViewDescriptor);
                    }
                }
                return arrayList;
            }
        }
        return EmptyList.d;
    }

    public final String toString() {
        return "subpackages of " + this.c + " from " + this.b;
    }
}
