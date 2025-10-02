package com.google.common.reflect;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ForwardingSet;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Ordering;
import com.google.common.reflect.Invokable;
import com.google.common.reflect.TypeResolver;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class TypeToken<T> extends TypeCapture<T> implements Serializable {
    public final Type d;
    public transient TypeResolver e;

    /* renamed from: com.google.common.reflect.TypeToken$1, reason: invalid class name */
    class AnonymousClass1 extends Invokable.MethodInvokable<Object> {
        @Override // com.google.common.reflect.Invokable
        public final TypeToken a() {
            return null;
        }

        @Override // com.google.common.reflect.Invokable
        public final String toString() {
            throw null;
        }
    }

    /* renamed from: com.google.common.reflect.TypeToken$2, reason: invalid class name */
    class AnonymousClass2 extends Invokable.ConstructorInvokable<Object> {
        @Override // com.google.common.reflect.Invokable
        public final TypeToken a() {
            return null;
        }

        @Override // com.google.common.reflect.Invokable
        public final String toString() {
            new Joiner(", ");
            throw null;
        }
    }

    /* renamed from: com.google.common.reflect.TypeToken$3, reason: invalid class name */
    class AnonymousClass3 extends TypeVisitor {
        @Override // com.google.common.reflect.TypeVisitor
        public final void c(GenericArrayType genericArrayType) {
            a(genericArrayType.getGenericComponentType());
        }

        @Override // com.google.common.reflect.TypeVisitor
        public final void d(ParameterizedType parameterizedType) {
            a(parameterizedType.getActualTypeArguments());
            a(parameterizedType.getOwnerType());
        }

        @Override // com.google.common.reflect.TypeVisitor
        public final void e(TypeVariable typeVariable) {
            throw null;
        }

        @Override // com.google.common.reflect.TypeVisitor
        public final void f(WildcardType wildcardType) {
            a(wildcardType.getLowerBounds());
            a(wildcardType.getUpperBounds());
        }
    }

    public static class Bounds {
    }

    public final class ClassSet extends TypeToken<T>.TypeSet {
        private Object readResolve() {
            throw null;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final Object P1() {
            throw null;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        /* renamed from: R1 */
        public final Collection P1() {
            throw null;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet
        /* renamed from: b2 */
        public final Set P1() {
            throw null;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public final Set f2() {
            throw null;
        }
    }

    public final class InterfaceSet extends TypeToken<T>.TypeSet {
        public transient ImmutableSet f;

        private Object readResolve() {
            throw null;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        /* renamed from: b2 */
        public final Set P1() {
            ImmutableSet immutableSet = this.f;
            if (immutableSet != null) {
                return immutableSet;
            }
            FluentIterable fluentIterableD = FluentIterable.d(null);
            ImmutableSet immutableSetH = FluentIterable.d(Iterables.b(fluentIterableD.g(), TypeFilter.e)).h();
            this.f = immutableSetH;
            return immutableSetH;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public final Set f2() {
            throw null;
        }
    }

    public static final class SimpleTypeToken<T> extends TypeToken<T> {
    }

    public static abstract class TypeCollector<K> {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f14948a = new AnonymousClass1();
        public static final AnonymousClass2 b = new AnonymousClass2();

        /* renamed from: com.google.common.reflect.TypeToken$TypeCollector$1, reason: invalid class name */
        public class AnonymousClass1 extends TypeCollector<TypeToken<?>> {
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public final Iterable c(Object obj) {
                TypeToken typeToken = (TypeToken) obj;
                Type type = typeToken.d;
                if (type instanceof TypeVariable) {
                    return TypeToken.a(((TypeVariable) type).getBounds());
                }
                if (type instanceof WildcardType) {
                    return TypeToken.a(((WildcardType) type).getUpperBounds());
                }
                ImmutableList.Builder builderM = ImmutableList.m();
                for (Type type2 : typeToken.b().getGenericInterfaces()) {
                    builderM.h(typeToken.e(type2));
                }
                return builderM.j();
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public final Class d(Object obj) {
                return ((TypeToken) obj).b();
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public final Object e(Object obj) {
                TypeToken typeToken = (TypeToken) obj;
                Type type = typeToken.d;
                if (type instanceof TypeVariable) {
                    SimpleTypeToken simpleTypeToken = new SimpleTypeToken(((TypeVariable) type).getBounds()[0]);
                    if (simpleTypeToken.b().isInterface()) {
                        return null;
                    }
                    return simpleTypeToken;
                }
                if (type instanceof WildcardType) {
                    SimpleTypeToken simpleTypeToken2 = new SimpleTypeToken(((WildcardType) type).getUpperBounds()[0]);
                    if (simpleTypeToken2.b().isInterface()) {
                        return null;
                    }
                    return simpleTypeToken2;
                }
                Type genericSuperclass = typeToken.b().getGenericSuperclass();
                if (genericSuperclass == null) {
                    return null;
                }
                return typeToken.e(genericSuperclass);
            }
        }

        /* renamed from: com.google.common.reflect.TypeToken$TypeCollector$2, reason: invalid class name */
        public class AnonymousClass2 extends TypeCollector<Class<?>> {
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public final Iterable c(Object obj) {
                return Arrays.asList(((Class) obj).getInterfaces());
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public final Class d(Object obj) {
                return (Class) obj;
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public final Object e(Object obj) {
                return ((Class) obj).getSuperclass();
            }
        }

        /* renamed from: com.google.common.reflect.TypeToken$TypeCollector$3, reason: invalid class name */
        class AnonymousClass3 extends ForwardingTypeCollector<Object> {
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public final ImmutableList b(ImmutableCollection immutableCollection) {
                ImmutableList.Builder builderM = ImmutableList.m();
                Iterator<E> it = immutableCollection.iterator();
                if (!it.hasNext()) {
                    return super.b(builderM.j());
                }
                it.next();
                throw null;
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector.ForwardingTypeCollector, com.google.common.reflect.TypeToken.TypeCollector
            public final Iterable c(Object obj) {
                return ImmutableSet.w();
            }
        }

        public static class ForwardingTypeCollector<K> extends TypeCollector<K> {
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public Iterable c(Object obj) {
                throw null;
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public final Class d(Object obj) {
                throw null;
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public final Object e(Object obj) {
                throw null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int a(Object obj, HashMap map) {
            Integer num = (Integer) map.get(obj);
            if (num != null) {
                return num.intValue();
            }
            boolean zIsInterface = d(obj).isInterface();
            Iterator<T> it = c(obj).iterator();
            int iMax = zIsInterface;
            while (it.hasNext()) {
                iMax = Math.max(iMax, a(it.next(), map));
            }
            Object objE = e(obj);
            int iMax2 = iMax;
            if (objE != null) {
                iMax2 = Math.max(iMax, a(objE, map));
            }
            int i = iMax2 + 1;
            map.put(obj, Integer.valueOf(i));
            return i;
        }

        public ImmutableList b(ImmutableCollection immutableCollection) {
            final HashMap map = new HashMap();
            Iterator<E> it = immutableCollection.iterator();
            while (it.hasNext()) {
                a(it.next(), map);
            }
            final Ordering orderingG = Ordering.c().g();
            return ImmutableList.B(new Ordering<Object>() { // from class: com.google.common.reflect.TypeToken.TypeCollector.4
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    HashMap map2 = map;
                    Object obj3 = map2.get(obj);
                    Objects.requireNonNull(obj3);
                    Object obj4 = map2.get(obj2);
                    Objects.requireNonNull(obj4);
                    return orderingG.compare(obj3, obj4);
                }
            }, map.keySet());
        }

        public abstract Iterable c(Object obj);

        public abstract Class d(Object obj);

        public abstract Object e(Object obj);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class TypeFilter implements Predicate<TypeToken<?>> {
        public static final AnonymousClass1 d;
        public static final AnonymousClass2 e;
        public static final /* synthetic */ TypeFilter[] f;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.reflect.TypeToken$TypeFilter$1] */
        /* JADX WARN: Type inference failed for: r1v0, types: [com.google.common.reflect.TypeToken$TypeFilter$2] */
        static {
            ?? r0 = new TypeFilter() { // from class: com.google.common.reflect.TypeToken.TypeFilter.1
                @Override // com.google.common.base.Predicate
                public final boolean apply(Object obj) {
                    Type type = ((TypeToken) obj).d;
                    return ((type instanceof TypeVariable) || (type instanceof WildcardType)) ? false : true;
                }
            };
            d = r0;
            ?? r1 = new TypeFilter() { // from class: com.google.common.reflect.TypeToken.TypeFilter.2
                @Override // com.google.common.base.Predicate
                public final boolean apply(Object obj) {
                    return ((TypeToken) obj).b().isInterface();
                }
            };
            e = r1;
            f = new TypeFilter[]{r0, r1};
        }

        public static TypeFilter valueOf(String str) {
            return (TypeFilter) Enum.valueOf(TypeFilter.class, str);
        }

        public static TypeFilter[] values() {
            return (TypeFilter[]) f.clone();
        }
    }

    public class TypeSet extends ForwardingSet<TypeToken<? super T>> implements Serializable {
        public transient ImmutableSet d;

        public TypeSet() {
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        /* renamed from: b2 */
        public Set P1() {
            ImmutableSet immutableSet = this.d;
            if (immutableSet != null) {
                return immutableSet;
            }
            FluentIterable fluentIterableD = FluentIterable.d(TypeCollector.f14948a.b(ImmutableList.w(TypeToken.this)));
            ImmutableSet immutableSetH = FluentIterable.d(Iterables.b(fluentIterableD.g(), TypeFilter.d)).h();
            this.d = immutableSetH;
            return immutableSetH;
        }

        public Set f2() {
            return ImmutableSet.q(TypeCollector.b.b(TypeToken.this.c()));
        }
    }

    public TypeToken(Type type) {
        type.getClass();
        this.d = type;
    }

    public static ImmutableList a(Type[] typeArr) {
        ImmutableList.Builder builderM = ImmutableList.m();
        for (Type type : typeArr) {
            SimpleTypeToken simpleTypeToken = new SimpleTypeToken(type);
            if (simpleTypeToken.b().isInterface()) {
                builderM.h(simpleTypeToken);
            }
        }
        return builderM.j();
    }

    public static TypeToken d(Class cls) {
        return new SimpleTypeToken(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Class b() {
        return (Class) c().iterator().next();
    }

    public final ImmutableSet c() {
        final ImmutableSet.Builder builderL = ImmutableSet.l();
        new TypeVisitor() { // from class: com.google.common.reflect.TypeToken.4
            @Override // com.google.common.reflect.TypeVisitor
            public final void b(Class cls) {
                builderL.a(cls);
            }

            @Override // com.google.common.reflect.TypeVisitor
            public final void c(GenericArrayType genericArrayType) {
                Class clsB = new SimpleTypeToken(genericArrayType.getGenericComponentType()).b();
                Joiner joiner = Types.f14950a;
                builderL.a(Array.newInstance((Class<?>) clsB, 0).getClass());
            }

            @Override // com.google.common.reflect.TypeVisitor
            public final void d(ParameterizedType parameterizedType) {
                builderL.a((Class) parameterizedType.getRawType());
            }

            @Override // com.google.common.reflect.TypeVisitor
            public final void e(TypeVariable typeVariable) {
                a(typeVariable.getBounds());
            }

            @Override // com.google.common.reflect.TypeVisitor
            public final void f(WildcardType wildcardType) {
                a(wildcardType.getUpperBounds());
            }
        }.a(this.d);
        return builderL.k();
    }

    public final TypeToken e(Type type) {
        TypeResolver typeResolver = this.e;
        if (typeResolver == null) {
            TypeResolver typeResolver2 = new TypeResolver();
            Type type2 = this.d;
            type2.getClass();
            TypeResolver.TypeMappingIntrospector typeMappingIntrospector = new TypeResolver.TypeMappingIntrospector();
            typeMappingIntrospector.a(type2);
            ImmutableMap immutableMapC = ImmutableMap.c(typeMappingIntrospector.b);
            TypeResolver.TypeTable typeTable = typeResolver2.f14945a;
            typeTable.getClass();
            ImmutableMap.Builder builderA = ImmutableMap.a();
            builderA.e(typeTable.f14946a);
            Iterator it = immutableMapC.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                TypeResolver.TypeVariableKey typeVariableKey = (TypeResolver.TypeVariableKey) entry.getKey();
                Type type3 = (Type) entry.getValue();
                typeVariableKey.getClass();
                Preconditions.e("Type variable %s bound to itself", typeVariableKey, !(type3 instanceof TypeVariable ? typeVariableKey.a((TypeVariable) type3) : false));
                builderA.c(typeVariableKey, type3);
            }
            TypeResolver typeResolver3 = new TypeResolver(new TypeResolver.TypeTable(builderA.a(true)));
            this.e = typeResolver3;
            typeResolver = typeResolver3;
        }
        SimpleTypeToken simpleTypeToken = new SimpleTypeToken(typeResolver.a(type));
        simpleTypeToken.e = this.e;
        return simpleTypeToken;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TypeToken) {
            return this.d.equals(((TypeToken) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        Joiner joiner = Types.f14950a;
        Type type = this.d;
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public Object writeReplace() {
        return new SimpleTypeToken(new TypeResolver().a(this.d));
    }
}
