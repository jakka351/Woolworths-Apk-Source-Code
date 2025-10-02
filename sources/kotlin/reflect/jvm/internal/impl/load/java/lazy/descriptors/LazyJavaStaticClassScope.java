package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class LazyJavaStaticClassScope extends LazyJavaStaticScope {
    public static final /* synthetic */ int p = 0;
    public final JavaClass n;
    public final LazyJavaClassDescriptor o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaStaticClassScope(LazyJavaResolverContext lazyJavaResolverContext, JavaClass jClass, LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        super(lazyJavaResolverContext, null);
        Intrinsics.h(jClass, "jClass");
        this.n = jClass;
        this.o = lazyJavaClassDescriptor;
    }

    public static PropertyDescriptor v(PropertyDescriptor propertyDescriptor) {
        CallableMemberDescriptor.Kind kindF = propertyDescriptor.f();
        kindF.getClass();
        if (kindF != CallableMemberDescriptor.Kind.e) {
            return propertyDescriptor;
        }
        Collection collectionQ = propertyDescriptor.q();
        Intrinsics.g(collectionQ, "getOverriddenDescriptors(...)");
        Collection<PropertyDescriptor> collection = collectionQ;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(collection, 10));
        for (PropertyDescriptor propertyDescriptor2 : collection) {
            Intrinsics.e(propertyDescriptor2);
            arrayList.add(v(propertyDescriptor2));
        }
        return (PropertyDescriptor) CollectionsKt.n0(CollectionsKt.w(arrayList));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final ClassifierDescriptor f(Name name, LookupLocation location) {
        Intrinsics.h(name, "name");
        Intrinsics.h(location, "location");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set h(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.h(kindFilter, "kindFilter");
        return EmptySet.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set i(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.h(kindFilter, "kindFilter");
        LinkedHashSet linkedHashSetK0 = CollectionsKt.K0(((DeclaredMemberIndex) this.e.invoke()).a());
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.o;
        LazyJavaStaticClassScope lazyJavaStaticClassScopeB = UtilKt.b(lazyJavaClassDescriptor);
        Set setA = lazyJavaStaticClassScopeB != null ? lazyJavaStaticClassScopeB.a() : null;
        if (setA == null) {
            setA = EmptySet.d;
        }
        linkedHashSetK0.addAll(setA);
        if (this.n.y()) {
            linkedHashSetK0.addAll(CollectionsKt.R(StandardNames.c, StandardNames.f24313a));
        }
        LazyJavaResolverContext lazyJavaResolverContext = this.b;
        linkedHashSetK0.addAll(lazyJavaResolverContext.f24425a.x.h(lazyJavaClassDescriptor, lazyJavaResolverContext));
        return linkedHashSetK0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final void j(ArrayList arrayList, Name name) {
        Intrinsics.h(name, "name");
        LazyJavaResolverContext lazyJavaResolverContext = this.b;
        lazyJavaResolverContext.f24425a.x.a(this.o, name, arrayList, lazyJavaResolverContext);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final DeclaredMemberIndex k() {
        return new ClassDeclaredMemberIndex(this.n, LazyJavaStaticClassScope$$Lambda$0.d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final void m(LinkedHashSet linkedHashSet, Name name) {
        Intrinsics.h(name, "name");
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.o;
        LazyJavaStaticClassScope lazyJavaStaticClassScopeB = UtilKt.b(lazyJavaClassDescriptor);
        Collection collectionL0 = lazyJavaStaticClassScopeB == null ? EmptySet.d : CollectionsKt.L0(lazyJavaStaticClassScopeB.e(name, NoLookupLocation.h));
        JavaResolverComponents javaResolverComponents = this.b.f24425a;
        linkedHashSet.addAll(DescriptorResolverUtils.e(name, collectionL0, linkedHashSet, this.o, javaResolverComponents.f, javaResolverComponents.u.b()));
        if (this.n.y()) {
            if (name.equals(StandardNames.c)) {
                linkedHashSet.add(DescriptorFactory.f(lazyJavaClassDescriptor));
            } else if (name.equals(StandardNames.f24313a)) {
                linkedHashSet.add(DescriptorFactory.g(lazyJavaClassDescriptor));
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticScope, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final void n(ArrayList arrayList, final Name name) {
        Intrinsics.h(name, "name");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Function1 function1 = new Function1(name) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$$Lambda$2
            public final Name d;

            {
                this.d = name;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                MemberScope it = (MemberScope) obj;
                int i = LazyJavaStaticClassScope.p;
                Intrinsics.h(it, "it");
                return it.b(this.d, NoLookupLocation.h);
            }
        };
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.o;
        DFS.a(CollectionsKt.Q(lazyJavaClassDescriptor), LazyJavaStaticClassScope$$Lambda$3.f24438a, new LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$2(lazyJavaClassDescriptor, linkedHashSet, function1));
        boolean zIsEmpty = arrayList.isEmpty();
        LazyJavaResolverContext lazyJavaResolverContext = this.b;
        if (zIsEmpty) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                PropertyDescriptor propertyDescriptorV = v((PropertyDescriptor) obj);
                Object arrayList2 = linkedHashMap.get(propertyDescriptorV);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(propertyDescriptorV, arrayList2);
                }
                ((List) arrayList2).add(obj);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) ((Map.Entry) it.next()).getValue();
                JavaResolverComponents javaResolverComponents = lazyJavaResolverContext.f24425a;
                CollectionsKt.h(DescriptorResolverUtils.e(name, collection, arrayList, this.o, javaResolverComponents.f, javaResolverComponents.u.b()), arrayList3);
            }
            arrayList.addAll(arrayList3);
        } else {
            JavaResolverComponents javaResolverComponents2 = lazyJavaResolverContext.f24425a;
            arrayList.addAll(DescriptorResolverUtils.e(name, linkedHashSet, arrayList, this.o, javaResolverComponents2.f, javaResolverComponents2.u.b()));
        }
        if (this.n.y() && name.equals(StandardNames.b)) {
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.a(arrayList, DescriptorFactory.e(lazyJavaClassDescriptor));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set o(DescriptorKindFilter kindFilter) {
        Intrinsics.h(kindFilter, "kindFilter");
        LinkedHashSet linkedHashSetK0 = CollectionsKt.K0(((DeclaredMemberIndex) this.e.invoke()).d());
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.o;
        DFS.a(CollectionsKt.Q(lazyJavaClassDescriptor), LazyJavaStaticClassScope$$Lambda$3.f24438a, new LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$2(lazyJavaClassDescriptor, linkedHashSetK0, LazyJavaStaticClassScope$$Lambda$1.d));
        if (this.n.y()) {
            linkedHashSetK0.add(StandardNames.b);
        }
        return linkedHashSetK0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final DeclarationDescriptor q() {
        return this.o;
    }
}
