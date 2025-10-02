package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.InitializedLazyImpl;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaPackage;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues;

/* loaded from: classes.dex */
public final class LazyJavaPackageFragmentProvider implements PackageFragmentProviderOptimized {

    /* renamed from: a, reason: collision with root package name */
    public final LazyJavaResolverContext f24424a;
    public final CacheWithNotNullValues b;

    public LazyJavaPackageFragmentProvider(JavaResolverComponents javaResolverComponents) {
        this.f24424a = new LazyJavaResolverContext(javaResolverComponents, TypeParameterResolver.EMPTY.f24428a, new InitializedLazyImpl(null));
        this.b = javaResolverComponents.f24422a.c();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public final List a(FqName fqName) {
        Intrinsics.h(fqName, "fqName");
        return CollectionsKt.S(d(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public final boolean b(FqName fqName) {
        Intrinsics.h(fqName, "fqName");
        this.f24424a.f24425a.b.a(fqName);
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public final void c(FqName fqName, ArrayList arrayList) {
        Intrinsics.h(fqName, "fqName");
        kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.a(arrayList, d(fqName));
    }

    public final LazyJavaPackageFragment d(FqName fqName) {
        final ReflectJavaPackage reflectJavaPackageA = this.f24424a.f24425a.b.a(fqName);
        return (LazyJavaPackageFragment) this.b.a(fqName, new Function0(this, reflectJavaPackageA) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider$$Lambda$0
            public final LazyJavaPackageFragmentProvider d;
            public final JavaPackage e;

            {
                this.d = this;
                this.e = reflectJavaPackageA;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new LazyJavaPackageFragment(this.d.f24424a, this.e);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public final Collection r(FqName fqName, Function1 function1) {
        Intrinsics.h(fqName, "fqName");
        LazyJavaPackageFragment lazyJavaPackageFragmentD = d(fqName);
        List list = lazyJavaPackageFragmentD != null ? (List) lazyJavaPackageFragmentD.o.invoke() : null;
        if (list == null) {
            list = EmptyList.d;
        }
        return list;
    }

    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f24424a.f24425a.o;
    }
}
