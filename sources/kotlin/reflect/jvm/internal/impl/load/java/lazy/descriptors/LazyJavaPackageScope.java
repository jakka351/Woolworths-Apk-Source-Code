package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class LazyJavaPackageScope extends LazyJavaStaticScope {
    public static final /* synthetic */ int r = 0;
    public final JavaPackage n;
    public final LazyJavaPackageFragment o;
    public final NullableLazyValue p;
    public final MemoizedFunctionToNullable q;

    public static final class FindClassRequest {

        /* renamed from: a, reason: collision with root package name */
        public final Name f24432a;
        public final JavaClass b;

        public FindClassRequest(Name name, JavaClass javaClass) {
            Intrinsics.h(name, "name");
            this.f24432a = name;
            this.b = javaClass;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof FindClassRequest) {
                return Intrinsics.c(this.f24432a, ((FindClassRequest) obj).f24432a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f24432a.hashCode();
        }
    }

    public static abstract class KotlinClassLookupResult {

        public static final class Found extends KotlinClassLookupResult {

            /* renamed from: a, reason: collision with root package name */
            public final ClassDescriptor f24433a;

            public Found(ClassDescriptor classDescriptor) {
                this.f24433a = classDescriptor;
            }
        }

        /* loaded from: classes7.dex */
        public static final class NotFound extends KotlinClassLookupResult {

            /* renamed from: a, reason: collision with root package name */
            public static final NotFound f24434a = new NotFound();
        }

        /* loaded from: classes7.dex */
        public static final class SyntheticClass extends KotlinClassLookupResult {

            /* renamed from: a, reason: collision with root package name */
            public static final SyntheticClass f24435a = new SyntheticClass();
        }
    }

    public LazyJavaPackageScope(final LazyJavaResolverContext lazyJavaResolverContext, JavaPackage javaPackage, LazyJavaPackageFragment lazyJavaPackageFragment) {
        super(lazyJavaResolverContext, null);
        this.n = javaPackage;
        this.o = lazyJavaPackageFragment;
        StorageManager storageManager = lazyJavaResolverContext.f24425a.f24422a;
        this.p = storageManager.e(new Function0(lazyJavaResolverContext, this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$$Lambda$0
            public final LazyJavaResolverContext d;
            public final LazyJavaPackageScope e;

            {
                this.d = lazyJavaResolverContext;
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = LazyJavaPackageScope.r;
                this.d.f24425a.b.b(this.e.o.h);
                return null;
            }
        });
        this.q = storageManager.b(new Function1(lazyJavaResolverContext, this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$$Lambda$1
            public final LazyJavaPackageScope d;
            public final LazyJavaResolverContext e;

            {
                this.d = this;
                this.e = lazyJavaResolverContext;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                LazyJavaResolverContext lazyJavaResolverContext2 = this.e;
                JavaResolverComponents javaResolverComponents = lazyJavaResolverContext2.f24425a;
                LazyJavaPackageScope.FindClassRequest request = (LazyJavaPackageScope.FindClassRequest) obj;
                int i = LazyJavaPackageScope.r;
                Intrinsics.h(request, "request");
                LazyJavaPackageScope lazyJavaPackageScope = this.d;
                LazyJavaPackageFragment lazyJavaPackageFragment2 = lazyJavaPackageScope.o;
                ClassId classId = new ClassId(lazyJavaPackageFragment2.h, request.f24432a);
                JavaClass javaClassC = request.b;
                KotlinClassFinder.Result.KotlinClass kotlinClassB = javaClassC != null ? javaResolverComponents.c.b(javaClassC, lazyJavaPackageScope.w()) : javaResolverComponents.c.a(classId, lazyJavaPackageScope.w());
                ReflectKotlinClass reflectKotlinClass = kotlinClassB != null ? kotlinClassB.f24473a : null;
                ClassId classIdA = reflectKotlinClass != null ? ReflectClassUtilKt.a(reflectKotlinClass.f24366a) : null;
                if (classIdA == null || (!classIdA.g() && !classIdA.c)) {
                    Object found = LazyJavaPackageScope.KotlinClassLookupResult.NotFound.f24434a;
                    if (reflectKotlinClass != null) {
                        if (reflectKotlinClass.b.f24478a == KotlinClassHeader.Kind.h) {
                            DeserializedDescriptorResolver deserializedDescriptorResolver = lazyJavaPackageScope.b.f24425a.d;
                            deserializedDescriptorResolver.getClass();
                            ClassData classDataF = deserializedDescriptorResolver.f(reflectKotlinClass);
                            ClassDescriptor classDescriptorA = classDataF == null ? null : deserializedDescriptorResolver.c().t.a(ReflectClassUtilKt.a(reflectKotlinClass.f24366a), classDataF);
                            if (classDescriptorA != null) {
                                found = new LazyJavaPackageScope.KotlinClassLookupResult.Found(classDescriptorA);
                            }
                        } else {
                            found = LazyJavaPackageScope.KotlinClassLookupResult.SyntheticClass.f24435a;
                        }
                    }
                    if (found instanceof LazyJavaPackageScope.KotlinClassLookupResult.Found) {
                        return ((LazyJavaPackageScope.KotlinClassLookupResult.Found) found).f24433a;
                    }
                    if (!(found instanceof LazyJavaPackageScope.KotlinClassLookupResult.SyntheticClass)) {
                        if (!(found instanceof LazyJavaPackageScope.KotlinClassLookupResult.NotFound)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (javaClassC == null) {
                            javaClassC = javaResolverComponents.b.c(new JavaClassFinder.Request(classId, null, 4));
                        }
                        LightClassOriginKind[] lightClassOriginKindArr = LightClassOriginKind.d;
                        FqName fqNameD = javaClassC != null ? javaClassC.d() : null;
                        if (fqNameD != null && !fqNameD.f24500a.c() && fqNameD.b().equals(lazyJavaPackageFragment2.h)) {
                            LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(lazyJavaResolverContext2, lazyJavaPackageFragment2, javaClassC);
                            javaResolverComponents.s.a(lazyJavaClassDescriptor);
                            return lazyJavaClassDescriptor;
                        }
                    }
                }
                return null;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection b(Name name, NoLookupLocation noLookupLocation) {
        Intrinsics.h(name, "name");
        return EmptyList.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final ClassifierDescriptor f(Name name, LookupLocation location) {
        Intrinsics.h(name, "name");
        Intrinsics.h(location, "location");
        return v(name, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final Collection g(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.h(kindFilter, "kindFilter");
        DescriptorKindFilter.Companion companion = DescriptorKindFilter.c;
        if (!kindFilter.a(DescriptorKindFilter.Companion.a() | DescriptorKindFilter.Companion.c())) {
            return EmptyList.d;
        }
        Iterable iterable = (Iterable) this.d.invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            DeclarationDescriptor declarationDescriptor = (DeclarationDescriptor) obj;
            if (declarationDescriptor instanceof ClassDescriptor) {
                Name name = ((ClassDescriptor) declarationDescriptor).getName();
                Intrinsics.g(name, "getName(...)");
                if (((Boolean) function1.invoke(name)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set h(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.h(kindFilter, "kindFilter");
        DescriptorKindFilter.Companion companion = DescriptorKindFilter.c;
        if (!kindFilter.a(DescriptorKindFilter.Companion.c())) {
            return EmptySet.d;
        }
        Set set = (Set) this.p.invoke();
        if (set != null) {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                hashSet.add(Name.e((String) it.next()));
            }
            return hashSet;
        }
        if (function1 == null) {
            function1 = FunctionsKt.a();
        }
        this.n.C(function1);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (JavaClass javaClass : EmptyList.d) {
            javaClass.getClass();
            LightClassOriginKind[] lightClassOriginKindArr = LightClassOriginKind.d;
            Name name = javaClass.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set i(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.h(kindFilter, "kindFilter");
        return EmptySet.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final DeclaredMemberIndex k() {
        return DeclaredMemberIndex.Empty.f24430a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final void m(LinkedHashSet linkedHashSet, Name name) {
        Intrinsics.h(name, "name");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set o(DescriptorKindFilter kindFilter) {
        Intrinsics.h(kindFilter, "kindFilter");
        return EmptySet.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final DeclarationDescriptor q() {
        return this.o;
    }

    public final ClassDescriptor v(Name name, JavaClass javaClass) {
        Name name2 = SpecialNames.f24503a;
        Intrinsics.h(name, "name");
        String strB = name.b();
        Intrinsics.g(strB, "asString(...)");
        if (strB.length() <= 0 || name.e) {
            return null;
        }
        Set set = (Set) this.p.invoke();
        if (javaClass == null && set != null && !set.contains(name.b())) {
            return null;
        }
        return (ClassDescriptor) this.q.invoke(new FindClassRequest(name, javaClass));
    }

    public final MetadataVersion w() {
        this.b.f24425a.d.c().c.getClass();
        return MetadataVersion.g;
    }
}
