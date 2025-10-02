package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class JvmPackageScope implements MemberScope {
    public static final /* synthetic */ KProperty[] f = {Reflection.f24268a.h(new PropertyReference1Impl(JvmPackageScope.class, "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};
    public final LazyJavaResolverContext b;
    public final LazyJavaPackageFragment c;
    public final LazyJavaPackageScope d;
    public final NotNullLazyValue e;

    public JvmPackageScope(LazyJavaResolverContext lazyJavaResolverContext, JavaPackage javaPackage, LazyJavaPackageFragment lazyJavaPackageFragment) {
        this.b = lazyJavaResolverContext;
        this.c = lazyJavaPackageFragment;
        this.d = new LazyJavaPackageScope(lazyJavaResolverContext, javaPackage, lazyJavaPackageFragment);
        this.e = lazyJavaResolverContext.f24425a.f24422a.d(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JvmPackageScope$$Lambda$0
            public final JvmPackageScope d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                JvmPackageScope jvmPackageScope = this.d;
                LazyJavaPackageFragment lazyJavaPackageFragment2 = jvmPackageScope.c;
                Collection collectionValues = ((Map) StorageKt.a(lazyJavaPackageFragment2.m, LazyJavaPackageFragment.r[0])).values();
                ArrayList arrayList = new ArrayList();
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    DeserializedPackageMemberScope deserializedPackageMemberScopeA = jvmPackageScope.b.f24425a.d.a(lazyJavaPackageFragment2, (KotlinJvmBinaryClass) it.next());
                    if (deserializedPackageMemberScopeA != null) {
                        arrayList.add(deserializedPackageMemberScopeA);
                    }
                }
                return (MemberScope[]) ScopeUtilsKt.b(arrayList).toArray(new MemberScope[0]);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set a() {
        MemberScope[] memberScopeArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : memberScopeArrH) {
            CollectionsKt.h(memberScope.a(), linkedHashSet);
        }
        linkedHashSet.addAll(this.d.a());
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection b(Name name, NoLookupLocation noLookupLocation) {
        Intrinsics.h(name, "name");
        i(name, noLookupLocation);
        MemberScope[] memberScopeArrH = h();
        this.d.getClass();
        Collection collectionA = EmptyList.d;
        for (MemberScope memberScope : memberScopeArrH) {
            collectionA = ScopeUtilsKt.a(collectionA, memberScope.b(name, noLookupLocation));
        }
        return collectionA == null ? EmptySet.d : collectionA;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set c() {
        MemberScope[] memberScopeArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : memberScopeArrH) {
            CollectionsKt.h(memberScope.c(), linkedHashSet);
        }
        linkedHashSet.addAll(this.d.c());
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set d() {
        HashSet hashSetA = MemberScopeKt.a(ArraysKt.e(h()));
        if (hashSetA == null) {
            return null;
        }
        hashSetA.addAll(this.d.d());
        return hashSetA;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection e(Name name, LookupLocation lookupLocation) {
        Intrinsics.h(name, "name");
        i(name, lookupLocation);
        MemberScope[] memberScopeArrH = h();
        Collection collectionE = this.d.e(name, lookupLocation);
        for (MemberScope memberScope : memberScopeArrH) {
            collectionE = ScopeUtilsKt.a(collectionE, memberScope.e(name, lookupLocation));
        }
        return collectionE == null ? EmptySet.d : collectionE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final ClassifierDescriptor f(Name name, LookupLocation location) {
        Intrinsics.h(name, "name");
        Intrinsics.h(location, "location");
        i(name, location);
        LazyJavaPackageScope lazyJavaPackageScope = this.d;
        lazyJavaPackageScope.getClass();
        ClassifierDescriptor classifierDescriptor = null;
        ClassDescriptor classDescriptorV = lazyJavaPackageScope.v(name, null);
        if (classDescriptorV != null) {
            return classDescriptorV;
        }
        for (MemberScope memberScope : h()) {
            ClassifierDescriptor classifierDescriptorF = memberScope.f(name, location);
            if (classifierDescriptorF != null) {
                if (!(classifierDescriptorF instanceof ClassifierDescriptorWithTypeParameters) || !((MemberDescriptor) classifierDescriptorF).p0()) {
                    return classifierDescriptorF;
                }
                if (classifierDescriptor == null) {
                    classifierDescriptor = classifierDescriptorF;
                }
            }
        }
        return classifierDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final Collection g(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.h(kindFilter, "kindFilter");
        MemberScope[] memberScopeArrH = h();
        Collection collectionG = this.d.g(kindFilter, function1);
        for (MemberScope memberScope : memberScopeArrH) {
            collectionG = ScopeUtilsKt.a(collectionG, memberScope.g(kindFilter, function1));
        }
        return collectionG == null ? EmptySet.d : collectionG;
    }

    public final MemberScope[] h() {
        return (MemberScope[]) StorageKt.a(this.e, f[0]);
    }

    public final void i(Name name, LookupLocation location) {
        Intrinsics.h(name, "name");
        Intrinsics.h(location, "location");
        UtilsKt.b(this.b.f24425a.n, location, this.c, name);
    }

    public final String toString() {
        return "scope for " + this.c;
    }
}
