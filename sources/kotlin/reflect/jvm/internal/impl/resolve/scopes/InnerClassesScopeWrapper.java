package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class InnerClassesScopeWrapper extends MemberScopeImpl {
    public final MemberScope b;

    public InnerClassesScopeWrapper(MemberScope workerScope) {
        Intrinsics.h(workerScope, "workerScope");
        this.b = workerScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set a() {
        return this.b.a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set c() {
        return this.b.c();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set d() {
        return this.b.d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final ClassifierDescriptor f(Name name, LookupLocation location) {
        Intrinsics.h(name, "name");
        Intrinsics.h(location, "location");
        ClassifierDescriptor classifierDescriptorF = this.b.f(name, location);
        if (classifierDescriptorF != null) {
            ClassDescriptor classDescriptor = classifierDescriptorF instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorF : null;
            if (classDescriptor != null) {
                return classDescriptor;
            }
            if (classifierDescriptorF instanceof TypeAliasDescriptor) {
                return (TypeAliasDescriptor) classifierDescriptorF;
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final Collection g(DescriptorKindFilter kindFilter, Function1 function1) {
        Collection collection;
        Intrinsics.h(kindFilter, "kindFilter");
        DescriptorKindFilter.Companion companion = DescriptorKindFilter.c;
        DescriptorKindFilter descriptorKindFilterC = kindFilter.c(DescriptorKindFilter.Companion.a());
        if (descriptorKindFilterC == null) {
            collection = EmptyList.d;
        } else {
            Collection collectionG = this.b.g(descriptorKindFilterC, function1);
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionG) {
                if (obj instanceof ClassifierDescriptorWithTypeParameters) {
                    arrayList.add(obj);
                }
            }
            collection = arrayList;
        }
        return collection;
    }

    public final String toString() {
        return "Classes from " + this.b;
    }
}
