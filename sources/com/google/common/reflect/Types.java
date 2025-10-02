package com.google.common.reflect;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.UnmodifiableListIterator;
import io.jsonwebtoken.JwtParser;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.AccessControlException;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class Types {

    /* renamed from: a, reason: collision with root package name */
    public static final Joiner f14950a = new Joiner(", ").e();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class ClassOwnership {
        public static final ClassOwnership d;
        public static final /* synthetic */ ClassOwnership[] e = {new ClassOwnership() { // from class: com.google.common.reflect.Types.ClassOwnership.1
            @Override // com.google.common.reflect.Types.ClassOwnership
            public final Class a(Class cls) {
                return cls.getEnclosingClass();
            }
        }, new ClassOwnership() { // from class: com.google.common.reflect.Types.ClassOwnership.2
            @Override // com.google.common.reflect.Types.ClassOwnership
            public final Class a(Class cls) {
                if (cls.isLocalClass()) {
                    return null;
                }
                return cls.getEnclosingClass();
            }
        }};

        /* JADX INFO: Fake field, exist only in values array */
        ClassOwnership EF2;

        /* renamed from: com.google.common.reflect.Types$ClassOwnership$1LocalClass, reason: invalid class name */
        class C1LocalClass<T> {
        }

        /* renamed from: com.google.common.reflect.Types$ClassOwnership$3, reason: invalid class name */
        class AnonymousClass3 extends C1LocalClass<String> {
        }

        static {
            ParameterizedType parameterizedType = (ParameterizedType) AnonymousClass3.class.getGenericSuperclass();
            Objects.requireNonNull(parameterizedType);
            for (ClassOwnership classOwnership : values()) {
                if (classOwnership.a(C1LocalClass.class) == parameterizedType.getOwnerType()) {
                    d = classOwnership;
                    return;
                }
            }
            throw new AssertionError();
        }

        public static ClassOwnership valueOf(String str) {
            return (ClassOwnership) Enum.valueOf(ClassOwnership.class, str);
        }

        public static ClassOwnership[] values() {
            return (ClassOwnership[]) e.clone();
        }

        public abstract Class a(Class cls);
    }

    public static final class GenericArrayTypeImpl implements GenericArrayType, Serializable {
        public final Type d;

        public GenericArrayTypeImpl(Type type) {
            this.d = JavaVersion.f.d(type);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof GenericArrayType) {
                return com.google.common.base.Objects.a(this.d, ((GenericArrayType) obj).getGenericComponentType());
            }
            return false;
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.d;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            Joiner joiner = Types.f14950a;
            Type type = this.d;
            return YU.a.o(sb, type instanceof Class ? ((Class) type).getName() : type.toString(), "[]");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class JavaVersion {
        public static final AnonymousClass2 d;
        public static final AnonymousClass3 e;
        public static final JavaVersion f;
        public static final /* synthetic */ JavaVersion[] g;

        /* renamed from: com.google.common.reflect.Types$JavaVersion$2, reason: invalid class name */
        public enum AnonymousClass2 extends JavaVersion {
            public AnonymousClass2() {
                super("JAVA7", 1);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public final Type a(Type type) {
                if (!(type instanceof Class)) {
                    return new GenericArrayTypeImpl(type);
                }
                Joiner joiner = Types.f14950a;
                return Array.newInstance((Class<?>) type, 0).getClass();
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public final Type d(Type type) {
                type.getClass();
                return type;
            }
        }

        /* renamed from: com.google.common.reflect.Types$JavaVersion$3, reason: invalid class name */
        public enum AnonymousClass3 extends JavaVersion {
            public AnonymousClass3() {
                super("JAVA8", 2);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public final Type a(Type type) {
                return JavaVersion.d.a(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public final String b(Type type) {
                try {
                    return (String) Type.class.getMethod("getTypeName", null).invoke(type, null);
                } catch (IllegalAccessException e) {
                    e = e;
                    throw new RuntimeException(e);
                } catch (NoSuchMethodException unused) {
                    throw new AssertionError("Type.getTypeName should be available in Java 8");
                } catch (InvocationTargetException e2) {
                    e = e2;
                    throw new RuntimeException(e);
                }
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public final Type d(Type type) {
                type.getClass();
                return type;
            }
        }

        /* renamed from: com.google.common.reflect.Types$JavaVersion$5, reason: invalid class name */
        public class AnonymousClass5 extends TypeCapture<Map.Entry<String, int[][]>> {
        }

        /* renamed from: com.google.common.reflect.Types$JavaVersion$6, reason: invalid class name */
        public class AnonymousClass6 extends TypeCapture<int[]> {
        }

        static {
            JavaVersion javaVersion = new JavaVersion() { // from class: com.google.common.reflect.Types.JavaVersion.1
                @Override // com.google.common.reflect.Types.JavaVersion
                public final Type a(Type type) {
                    return new GenericArrayTypeImpl(type);
                }

                @Override // com.google.common.reflect.Types.JavaVersion
                public final Type d(Type type) {
                    type.getClass();
                    if (!(type instanceof Class)) {
                        return type;
                    }
                    Class cls = (Class) type;
                    return cls.isArray() ? new GenericArrayTypeImpl(cls.getComponentType()) : type;
                }
            };
            AnonymousClass2 anonymousClass2 = new AnonymousClass2();
            d = anonymousClass2;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3();
            e = anonymousClass3;
            JavaVersion javaVersion2 = new JavaVersion() { // from class: com.google.common.reflect.Types.JavaVersion.4
                @Override // com.google.common.reflect.Types.JavaVersion
                public final Type a(Type type) {
                    return JavaVersion.d.a(type);
                }

                @Override // com.google.common.reflect.Types.JavaVersion
                public final String b(Type type) {
                    return JavaVersion.e.b(type);
                }

                @Override // com.google.common.reflect.Types.JavaVersion
                public final Type d(Type type) {
                    type.getClass();
                    return type;
                }
            };
            g = new JavaVersion[]{javaVersion, anonymousClass2, anonymousClass3, javaVersion2};
            if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
                Type genericSuperclass = AnonymousClass5.class.getGenericSuperclass();
                Preconditions.e("%s isn't parameterized", genericSuperclass, genericSuperclass instanceof ParameterizedType);
                if (((ParameterizedType) genericSuperclass).getActualTypeArguments()[0].toString().contains("java.util.Map.java.util.Map")) {
                    f = anonymousClass3;
                    return;
                } else {
                    f = javaVersion2;
                    return;
                }
            }
            Type genericSuperclass2 = AnonymousClass6.class.getGenericSuperclass();
            Preconditions.e("%s isn't parameterized", genericSuperclass2, genericSuperclass2 instanceof ParameterizedType);
            if (((ParameterizedType) genericSuperclass2).getActualTypeArguments()[0] instanceof Class) {
                f = anonymousClass2;
            } else {
                f = javaVersion;
            }
        }

        public static JavaVersion valueOf(String str) {
            return (JavaVersion) Enum.valueOf(JavaVersion.class, str);
        }

        public static JavaVersion[] values() {
            return (JavaVersion[]) g.clone();
        }

        public abstract Type a(Type type);

        public String b(Type type) {
            Joiner joiner = Types.f14950a;
            return type instanceof Class ? ((Class) type).getName() : type.toString();
        }

        public final ImmutableList c(Type[] typeArr) {
            ImmutableList.Builder builderM = ImmutableList.m();
            for (Type type : typeArr) {
                builderM.h(d(type));
            }
            return builderM.j();
        }

        public abstract Type d(Type type);
    }

    public static final class NativeTypeVariableEquals<X> {

        /* renamed from: a, reason: collision with root package name */
        public static final boolean f14951a = !NativeTypeVariableEquals.class.getTypeParameters()[0].equals(Types.d(NativeTypeVariableEquals.class, "X", new Type[0]));
    }

    public static final class ParameterizedTypeImpl implements ParameterizedType, Serializable {
        public final Type d;
        public final ImmutableList e;
        public final Class f;

        public ParameterizedTypeImpl(Type type, Class cls, Type[] typeArr) {
            cls.getClass();
            Preconditions.g(typeArr.length == cls.getTypeParameters().length);
            Types.b(typeArr, "type parameter");
            this.d = type;
            this.f = cls;
            this.e = JavaVersion.f.c(typeArr);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) obj;
                if (this.f.equals(parameterizedType.getRawType()) && com.google.common.base.Objects.a(this.d, parameterizedType.getOwnerType())) {
                    Joiner joiner = Types.f14950a;
                    if (Arrays.equals((Type[]) this.e.toArray(new Type[0]), parameterizedType.getActualTypeArguments())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            Joiner joiner = Types.f14950a;
            return (Type[]) this.e.toArray(new Type[0]);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.d;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.f;
        }

        public final int hashCode() {
            Type type = this.d;
            return ((type == null ? 0 : type.hashCode()) ^ this.e.hashCode()) ^ this.f.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            Type type = this.d;
            if (type != null) {
                JavaVersion javaVersion = JavaVersion.f;
                javaVersion.getClass();
                if (!(javaVersion instanceof JavaVersion.AnonymousClass4)) {
                    sb.append(javaVersion.b(type));
                    sb.append(JwtParser.SEPARATOR_CHAR);
                }
            }
            sb.append(this.f.getName());
            sb.append('<');
            Joiner joiner = Types.f14950a;
            final JavaVersion javaVersion2 = JavaVersion.f;
            Objects.requireNonNull(javaVersion2);
            sb.append(joiner.c(Iterables.i(this.e, new Function() { // from class: com.google.common.reflect.b
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return javaVersion2.b((Type) obj);
                }
            })));
            sb.append('>');
            return sb.toString();
        }
    }

    public static final class TypeVariableImpl<D extends GenericDeclaration> {

        /* renamed from: a, reason: collision with root package name */
        public final GenericDeclaration f14952a;
        public final String b;
        public final ImmutableList c;

        public TypeVariableImpl(GenericDeclaration genericDeclaration, String str, Type[] typeArr) {
            Types.b(typeArr, "bound for type variable");
            genericDeclaration.getClass();
            this.f14952a = genericDeclaration;
            str.getClass();
            this.b = str;
            this.c = ImmutableList.q(typeArr);
        }

        public final boolean equals(Object obj) {
            boolean z = NativeTypeVariableEquals.f14951a;
            GenericDeclaration genericDeclaration = this.f14952a;
            String str = this.b;
            if (!z) {
                if (obj instanceof TypeVariable) {
                    TypeVariable typeVariable = (TypeVariable) obj;
                    if (str.equals(typeVariable.getName()) && genericDeclaration.equals(typeVariable.getGenericDeclaration())) {
                        return true;
                    }
                }
                return false;
            }
            if (obj != null && Proxy.isProxyClass(obj.getClass()) && (Proxy.getInvocationHandler(obj) instanceof TypeVariableInvocationHandler)) {
                TypeVariableImpl typeVariableImpl = ((TypeVariableInvocationHandler) Proxy.getInvocationHandler(obj)).f14953a;
                if (str.equals(typeVariableImpl.b) && genericDeclaration.equals(typeVariableImpl.f14952a) && this.c.equals(typeVariableImpl.c)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f14952a.hashCode() ^ this.b.hashCode();
        }

        public final String toString() {
            return this.b;
        }
    }

    public static final class TypeVariableInvocationHandler implements InvocationHandler {
        public static final ImmutableMap b;

        /* renamed from: a, reason: collision with root package name */
        public final TypeVariableImpl f14953a;

        static {
            ImmutableMap.Builder builderA = ImmutableMap.a();
            for (Method method : TypeVariableImpl.class.getMethods()) {
                if (method.getDeclaringClass().equals(TypeVariableImpl.class)) {
                    try {
                        method.setAccessible(true);
                    } catch (AccessControlException unused) {
                    }
                    builderA.c(method.getName(), method);
                }
            }
            b = builderA.a(false);
        }

        public TypeVariableInvocationHandler(TypeVariableImpl typeVariableImpl) {
            this.f14953a = typeVariableImpl;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Method method2 = (Method) b.get(name);
            if (method2 == null) {
                throw new UnsupportedOperationException(name);
            }
            try {
                return method2.invoke(this.f14953a, objArr);
            } catch (InvocationTargetException e) {
                throw e.getCause();
            }
        }
    }

    public static final class WildcardTypeImpl implements WildcardType, Serializable {
        public final ImmutableList d;
        public final ImmutableList e;

        public WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            Types.b(typeArr, "lower bound for wildcard");
            Types.b(typeArr2, "upper bound for wildcard");
            JavaVersion javaVersion = JavaVersion.f;
            this.d = javaVersion.c(typeArr);
            this.e = javaVersion.c(typeArr2);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) obj;
                if (this.d.equals(Arrays.asList(wildcardType.getLowerBounds()))) {
                    if (this.e.equals(Arrays.asList(wildcardType.getUpperBounds()))) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Joiner joiner = Types.f14950a;
            return (Type[]) this.d.toArray(new Type[0]);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            Joiner joiner = Types.f14950a;
            return (Type[]) this.e.toArray(new Type[0]);
        }

        public final int hashCode() {
            return this.d.hashCode() ^ this.e.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("?");
            UnmodifiableListIterator unmodifiableListIteratorListIterator = this.d.listIterator(0);
            while (unmodifiableListIteratorListIterator.hasNext()) {
                Type type = (Type) unmodifiableListIteratorListIterator.next();
                sb.append(" super ");
                sb.append(JavaVersion.f.b(type));
            }
            Joiner joiner = Types.f14950a;
            for (Type type2 : Iterables.b(this.e, Predicates.g(Predicates.d(Object.class)))) {
                sb.append(" extends ");
                sb.append(JavaVersion.f.b(type2));
            }
            return sb.toString();
        }
    }

    public static Type a(Type[] typeArr) {
        for (Type type : typeArr) {
            type.getClass();
            final AtomicReference atomicReference = new AtomicReference();
            new TypeVisitor() { // from class: com.google.common.reflect.Types.1
                @Override // com.google.common.reflect.TypeVisitor
                public final void b(Class cls) {
                    atomicReference.set(cls.getComponentType());
                }

                @Override // com.google.common.reflect.TypeVisitor
                public final void c(GenericArrayType genericArrayType) {
                    atomicReference.set(genericArrayType.getGenericComponentType());
                }

                @Override // com.google.common.reflect.TypeVisitor
                public final void e(TypeVariable typeVariable) {
                    atomicReference.set(Types.a(typeVariable.getBounds()));
                }

                @Override // com.google.common.reflect.TypeVisitor
                public final void f(WildcardType wildcardType) {
                    atomicReference.set(Types.a(wildcardType.getUpperBounds()));
                }
            }.a(type);
            Type type2 = (Type) atomicReference.get();
            if (type2 != null) {
                if (type2 instanceof Class) {
                    Class cls = (Class) type2;
                    if (cls.isPrimitive()) {
                        return cls;
                    }
                }
                return new WildcardTypeImpl(new Type[0], new Type[]{type2});
            }
        }
        return null;
    }

    public static void b(Type[] typeArr, String str) {
        for (Type type : typeArr) {
            if (type instanceof Class) {
                Preconditions.h(!r2.isPrimitive(), "Primitive type '%s' used as %s", (Class) type, str);
            }
        }
    }

    public static Type c(Type type) {
        if (!(type instanceof WildcardType)) {
            return JavaVersion.f.a(type);
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        Preconditions.f("Wildcard cannot have more than one lower bounds.", lowerBounds.length <= 1);
        if (lowerBounds.length == 1) {
            return new WildcardTypeImpl(new Type[]{c(lowerBounds[0])}, new Type[]{Object.class});
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        Preconditions.f("Wildcard should have only one upper bound.", upperBounds.length == 1);
        return new WildcardTypeImpl(new Type[0], new Type[]{c(upperBounds[0])});
    }

    public static TypeVariable d(GenericDeclaration genericDeclaration, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        TypeVariableInvocationHandler typeVariableInvocationHandler = new TypeVariableInvocationHandler(new TypeVariableImpl(genericDeclaration, str, typeArr));
        Preconditions.e("%s is not an interface", TypeVariable.class, TypeVariable.class.isInterface());
        return (TypeVariable) TypeVariable.class.cast(Proxy.newProxyInstance(TypeVariable.class.getClassLoader(), new Class[]{TypeVariable.class}, typeVariableInvocationHandler));
    }

    public static ParameterizedType e(Type type, Class cls, Type... typeArr) {
        if (type == null) {
            return new ParameterizedTypeImpl(ClassOwnership.d.a(cls), cls, typeArr);
        }
        Preconditions.e("Owner type for unenclosed %s", cls, cls.getEnclosingClass() != null);
        return new ParameterizedTypeImpl(type, cls, typeArr);
    }
}
