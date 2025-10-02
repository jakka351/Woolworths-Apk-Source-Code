package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.camera.core.impl.b;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.IndexingIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaTypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class LazyJavaScope extends MemberScopeImpl {
    public static final /* synthetic */ KProperty[] m;
    public final LazyJavaResolverContext b;
    public final LazyJavaScope c;
    public final NotNullLazyValue d;
    public final NotNullLazyValue e;
    public final MemoizedFunctionToNotNull f;
    public final MemoizedFunctionToNullable g;
    public final MemoizedFunctionToNotNull h;
    public final NotNullLazyValue i;
    public final NotNullLazyValue j;
    public final NotNullLazyValue k;
    public final MemoizedFunctionToNotNull l;

    /* loaded from: classes7.dex */
    public static final class MethodSignatureData {

        /* renamed from: a, reason: collision with root package name */
        public final KotlinType f24436a;
        public final List b;
        public final ArrayList c;
        public final List d;

        public MethodSignatureData(KotlinType kotlinType, List valueParameters, ArrayList arrayList, List errors) {
            Intrinsics.h(valueParameters, "valueParameters");
            Intrinsics.h(errors, "errors");
            this.f24436a = kotlinType;
            this.b = valueParameters;
            this.c = arrayList;
            this.d = errors;
        }

        public final List a() {
            return this.d;
        }

        public final KotlinType b() {
            return this.f24436a;
        }

        public final List c() {
            return this.c;
        }

        public final List d() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MethodSignatureData)) {
                return false;
            }
            MethodSignatureData methodSignatureData = (MethodSignatureData) obj;
            return this.f24436a.equals(methodSignatureData.f24436a) && Intrinsics.c(this.b, methodSignatureData.b) && this.c.equals(methodSignatureData.c) && Intrinsics.c(this.d, methodSignatureData.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + b.e(a.b(b.d(this.f24436a.hashCode() * 961, 31, this.b), 31, this.c), 31, false);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MethodSignatureData(returnType=");
            sb.append(this.f24436a);
            sb.append(", receiverType=null, valueParameters=");
            sb.append(this.b);
            sb.append(", typeParameters=");
            sb.append(this.c);
            sb.append(", hasStableParameterNames=false, errors=");
            return a.o(sb, this.d, ')');
        }
    }

    /* loaded from: classes7.dex */
    public static final class ResolvedValueParameters {

        /* renamed from: a, reason: collision with root package name */
        public final List f24437a;
        public final boolean b;

        public ResolvedValueParameters(List list, boolean z) {
            this.f24437a = list;
            this.b = z;
        }

        public final List a() {
            return this.f24437a;
        }

        public final boolean b() {
            return this.b;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(LazyJavaScope.class, "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;", 0);
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        m = new KProperty[]{reflectionFactory.h(propertyReference1Impl), c.t(LazyJavaScope.class, "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;", 0, reflectionFactory), c.t(LazyJavaScope.class, "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;", 0, reflectionFactory)};
    }

    public LazyJavaScope(LazyJavaResolverContext c, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        Intrinsics.h(c, "c");
        this.b = c;
        this.c = lazyJavaClassMemberScope;
        StorageManager storageManager = c.f24425a.f24422a;
        this.d = storageManager.f(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$0
            public final LazyJavaScope d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KProperty[] kPropertyArr = LazyJavaScope.m;
                DescriptorKindFilter kindFilter = DescriptorKindFilter.m;
                MemberScope.f24557a.getClass();
                Function1 function1A = MemberScope.Companion.a();
                Intrinsics.h(kindFilter, "kindFilter");
                NoLookupLocation noLookupLocation = NoLookupLocation.g;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                DescriptorKindFilter.Companion companion = DescriptorKindFilter.c;
                boolean zA = kindFilter.a(DescriptorKindFilter.Companion.a());
                LazyJavaScope lazyJavaScope = this.d;
                if (zA) {
                    for (Name name : lazyJavaScope.h(kindFilter, function1A)) {
                        function1A.invoke(name);
                        CollectionsKt.a(linkedHashSet, lazyJavaScope.f(name, noLookupLocation));
                    }
                }
                DescriptorKindFilter.Companion companion2 = DescriptorKindFilter.c;
                if (kindFilter.a(DescriptorKindFilter.Companion.b()) && !kindFilter.b().contains(DescriptorKindExclude.NonExtensions.f24552a)) {
                    for (Name name2 : lazyJavaScope.i(kindFilter, function1A)) {
                        function1A.invoke(name2);
                        linkedHashSet.addAll(lazyJavaScope.e(name2, noLookupLocation));
                    }
                }
                DescriptorKindFilter.Companion companion3 = DescriptorKindFilter.c;
                if (kindFilter.a(DescriptorKindFilter.Companion.g()) && !kindFilter.b().contains(DescriptorKindExclude.NonExtensions.f24552a)) {
                    for (Name name3 : lazyJavaScope.o(kindFilter)) {
                        function1A.invoke(name3);
                        linkedHashSet.addAll(lazyJavaScope.b(name3, noLookupLocation));
                    }
                }
                return kotlin.collections.CollectionsKt.G0(linkedHashSet);
            }
        });
        this.e = storageManager.d(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$1
            public final LazyJavaScope d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KProperty[] kPropertyArr = LazyJavaScope.m;
                return this.d.k();
            }
        });
        this.f = storageManager.g(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$2
            public final LazyJavaScope d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Name name = (Name) obj;
                KProperty[] kPropertyArr = LazyJavaScope.m;
                Intrinsics.h(name, "name");
                LazyJavaScope lazyJavaScope = this.d;
                LazyJavaScope lazyJavaScope2 = lazyJavaScope.c;
                if (lazyJavaScope2 != null) {
                    return (Collection) lazyJavaScope2.f.invoke(name);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = ((DeclaredMemberIndex) lazyJavaScope.e.invoke()).e(name).iterator();
                while (it.hasNext()) {
                    JavaMethodDescriptor javaMethodDescriptorT = lazyJavaScope.t((JavaMethod) it.next());
                    if (lazyJavaScope.r(javaMethodDescriptorT)) {
                        lazyJavaScope.b.f24425a.g.getClass();
                        arrayList.add(javaMethodDescriptorT);
                    }
                }
                lazyJavaScope.j(arrayList, name);
                return arrayList;
            }
        });
        this.g = storageManager.b(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$3
            public final LazyJavaScope d;

            {
                this.d = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:50:0x0124  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r22) {
                /*
                    Method dump skipped, instructions count: 331
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$3.invoke(java.lang.Object):java.lang.Object");
            }
        });
        this.h = storageManager.g(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$4
            public final LazyJavaScope d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Name name = (Name) obj;
                KProperty[] kPropertyArr = LazyJavaScope.m;
                Intrinsics.h(name, "name");
                LazyJavaScope lazyJavaScope = this.d;
                LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) lazyJavaScope.f.invoke(name));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : linkedHashSet) {
                    String strA = MethodSignatureMappingKt.a((SimpleFunctionDescriptor) obj2, 2);
                    Object arrayList = linkedHashMap.get(strA);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(strA, arrayList);
                    }
                    ((List) arrayList).add(obj2);
                }
                for (List list : linkedHashMap.values()) {
                    if (list.size() != 1) {
                        List list2 = list;
                        Collection collectionA = OverridingUtilsKt.a(list2, LazyJavaScope$$Lambda$9.d);
                        linkedHashSet.removeAll(list2);
                        linkedHashSet.addAll(collectionA);
                    }
                }
                lazyJavaScope.m(linkedHashSet, name);
                LazyJavaResolverContext lazyJavaResolverContext = lazyJavaScope.b;
                return kotlin.collections.CollectionsKt.G0(lazyJavaResolverContext.f24425a.r.c(lazyJavaResolverContext, linkedHashSet));
            }
        });
        this.i = storageManager.d(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$5
            public final LazyJavaScope d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KProperty[] kPropertyArr = LazyJavaScope.m;
                return this.d.i(DescriptorKindFilter.p, null);
            }
        });
        this.j = storageManager.d(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$6
            public final LazyJavaScope d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KProperty[] kPropertyArr = LazyJavaScope.m;
                return this.d.o(DescriptorKindFilter.q);
            }
        });
        this.k = storageManager.d(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$7
            public final LazyJavaScope d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KProperty[] kPropertyArr = LazyJavaScope.m;
                return this.d.h(DescriptorKindFilter.o, null);
            }
        });
        this.l = storageManager.g(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$8
            public final LazyJavaScope d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Name name = (Name) obj;
                KProperty[] kPropertyArr = LazyJavaScope.m;
                Intrinsics.h(name, "name");
                ArrayList arrayList = new ArrayList();
                LazyJavaScope lazyJavaScope = this.d;
                CollectionsKt.a(arrayList, lazyJavaScope.g.invoke(name));
                lazyJavaScope.n(arrayList, name);
                DeclarationDescriptor declarationDescriptorQ = lazyJavaScope.q();
                int i = DescriptorUtils.f24530a;
                if (DescriptorUtils.n(declarationDescriptorQ, ClassKind.h)) {
                    return kotlin.collections.CollectionsKt.G0(arrayList);
                }
                LazyJavaResolverContext lazyJavaResolverContext = lazyJavaScope.b;
                return kotlin.collections.CollectionsKt.G0(lazyJavaResolverContext.f24425a.r.c(lazyJavaResolverContext, arrayList));
            }
        });
    }

    public static KotlinType l(JavaMethod method, LazyJavaResolverContext lazyJavaResolverContext) {
        Intrinsics.h(method, "method");
        return lazyJavaResolverContext.d.d(method.B(), JavaTypeAttributesKt.a(TypeUsage.e, method.t().i(), null, 6));
    }

    public static ResolvedValueParameters u(LazyJavaResolverContext lazyJavaResolverContext, FunctionDescriptorImpl functionDescriptorImpl, List jValueParameters) {
        Pair pair;
        Name name;
        JavaTypeResolver javaTypeResolver = lazyJavaResolverContext.d;
        JavaResolverComponents javaResolverComponents = lazyJavaResolverContext.f24425a;
        ModuleDescriptor moduleDescriptor = javaResolverComponents.o;
        Intrinsics.h(jValueParameters, "jValueParameters");
        IndexingIterable indexingIterableP0 = kotlin.collections.CollectionsKt.P0(jValueParameters);
        ArrayList arrayList = new ArrayList(kotlin.collections.CollectionsKt.s(indexingIterableP0, 10));
        Iterator it = indexingIterableP0.iterator();
        boolean z = false;
        boolean z2 = false;
        while (true) {
            IndexingIterator indexingIterator = (IndexingIterator) it;
            if (!indexingIterator.d.hasNext()) {
                return new ResolvedValueParameters(kotlin.collections.CollectionsKt.G0(arrayList), z2);
            }
            IndexedValue indexedValue = (IndexedValue) indexingIterator.next();
            int i = indexedValue.f24254a;
            JavaValueParameter javaValueParameter = (JavaValueParameter) indexedValue.b;
            LazyJavaAnnotations lazyJavaAnnotationsA = LazyJavaAnnotationsKt.a(lazyJavaResolverContext, javaValueParameter);
            JavaTypeAttributes javaTypeAttributesA = JavaTypeAttributesKt.a(TypeUsage.e, z, null, 7);
            if (javaValueParameter.g()) {
                JavaType type = javaValueParameter.getType();
                JavaArrayType javaArrayType = type instanceof JavaArrayType ? (JavaArrayType) type : null;
                if (javaArrayType == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + javaValueParameter);
                }
                UnwrappedType unwrappedTypeC = javaTypeResolver.c(javaArrayType, javaTypeAttributesA, true);
                pair = new Pair(unwrappedTypeC, moduleDescriptor.p().f(unwrappedTypeC));
            } else {
                pair = new Pair(javaTypeResolver.d(javaValueParameter.getType(), javaTypeAttributesA), null);
            }
            KotlinType kotlinType = (KotlinType) pair.d;
            KotlinType kotlinType2 = (KotlinType) pair.e;
            if (Intrinsics.c(functionDescriptorImpl.getName().b(), "equals") && jValueParameters.size() == 1 && moduleDescriptor.p().p().equals(kotlinType)) {
                name = Name.e("other");
            } else {
                name = javaValueParameter.getName();
                if (name == null) {
                    z2 = true;
                }
                if (name == null) {
                    name = Name.e("p" + i);
                }
            }
            arrayList.add(new ValueParameterDescriptorImpl(functionDescriptorImpl, null, i, lazyJavaAnnotationsA, name, kotlinType, false, false, false, kotlinType2, javaResolverComponents.j.a(javaValueParameter)));
            z = false;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set a() {
        return (Set) StorageKt.a(this.i, m[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection b(Name name, NoLookupLocation noLookupLocation) {
        Intrinsics.h(name, "name");
        return !c().contains(name) ? EmptyList.d : (Collection) this.l.invoke(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set c() {
        return (Set) StorageKt.a(this.j, m[1]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set d() {
        return (Set) StorageKt.a(this.k, m[2]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection e(Name name, LookupLocation location) {
        Intrinsics.h(name, "name");
        Intrinsics.h(location, "location");
        return !a().contains(name) ? EmptyList.d : (Collection) this.h.invoke(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection g(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.h(kindFilter, "kindFilter");
        return (Collection) this.d.invoke();
    }

    public abstract Set h(DescriptorKindFilter descriptorKindFilter, Function1 function1);

    public abstract Set i(DescriptorKindFilter descriptorKindFilter, Function1 function1);

    public void j(ArrayList arrayList, Name name) {
        Intrinsics.h(name, "name");
    }

    public abstract DeclaredMemberIndex k();

    public abstract void m(LinkedHashSet linkedHashSet, Name name);

    public abstract void n(ArrayList arrayList, Name name);

    public abstract Set o(DescriptorKindFilter descriptorKindFilter);

    public abstract ReceiverParameterDescriptor p();

    public abstract DeclarationDescriptor q();

    public boolean r(JavaMethodDescriptor javaMethodDescriptor) {
        return true;
    }

    public abstract MethodSignatureData s(JavaMethod javaMethod, ArrayList arrayList, KotlinType kotlinType, List list);

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    public final JavaMethodDescriptor t(JavaMethod method) {
        Intrinsics.h(method, "method");
        LazyJavaResolverContext lazyJavaResolverContext = this.b;
        JavaMethodDescriptor javaMethodDescriptorW0 = JavaMethodDescriptor.W0(q(), LazyJavaAnnotationsKt.a(lazyJavaResolverContext, method), method.getName(), lazyJavaResolverContext.f24425a.j.a(method), ((DeclaredMemberIndex) this.e.invoke()).f(method.getName()) != null && ((ArrayList) method.h()).isEmpty());
        Intrinsics.h(lazyJavaResolverContext, "<this>");
        LazyJavaResolverContext lazyJavaResolverContext2 = new LazyJavaResolverContext(lazyJavaResolverContext.f24425a, new LazyJavaTypeParameterResolver(lazyJavaResolverContext, javaMethodDescriptorW0, method, 0), lazyJavaResolverContext.c);
        ArrayList typeParameters = method.getTypeParameters();
        ArrayList arrayList = new ArrayList(kotlin.collections.CollectionsKt.s(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            TypeParameterDescriptor typeParameterDescriptorA = lazyJavaResolverContext2.b.a((JavaTypeParameter) it.next());
            Intrinsics.e(typeParameterDescriptorA);
            arrayList.add(typeParameterDescriptorA);
        }
        ResolvedValueParameters resolvedValueParametersU = u(lazyJavaResolverContext2, javaMethodDescriptorW0, method.h());
        MethodSignatureData methodSignatureDataS = s(method, arrayList, l(method, lazyJavaResolverContext2), resolvedValueParametersU.a());
        ReceiverParameterDescriptor receiverParameterDescriptorP = p();
        List listC = methodSignatureDataS.c();
        List listD = methodSignatureDataS.d();
        KotlinType kotlinTypeB = methodSignatureDataS.b();
        Modality.Companion companion = Modality.d;
        boolean zIsAbstract = method.isAbstract();
        boolean zIsFinal = method.isFinal();
        companion.getClass();
        javaMethodDescriptorW0.V0(null, receiverParameterDescriptorP, EmptyList.d, listC, listD, kotlinTypeB, zIsAbstract ? Modality.h : !zIsFinal ? Modality.g : Modality.e, UtilsKt.d(method.getVisibility()), EmptyMap.d);
        javaMethodDescriptorW0.X0(false, resolvedValueParametersU.b());
        if (methodSignatureDataS.a().isEmpty()) {
            return javaMethodDescriptorW0;
        }
        lazyJavaResolverContext2.f24425a.e.b(javaMethodDescriptorW0, methodSignatureDataS.a());
        throw null;
    }

    public String toString() {
        return "Lazy scope for " + q();
    }
}
