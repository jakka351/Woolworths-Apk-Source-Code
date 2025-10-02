package com.fasterxml.jackson.databind.type;

import YU.a;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.type.TypeParser;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.LRUMap;
import com.fasterxml.jackson.databind.util.LookupCache;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class TypeFactory implements Serializable {
    public static final JavaType[] f = new JavaType[0];
    public static final TypeFactory g = new TypeFactory();
    public static final TypeBindings h = TypeBindings.j;
    public static final Class i = String.class;
    public static final Class j = Object.class;
    public static final Class k = Comparable.class;
    public static final Class l = Enum.class;
    public static final Class m = JsonNode.class;
    public static final Class n;
    public static final Class o;
    public static final Class p;
    public static final SimpleType q;
    public static final SimpleType r;
    public static final SimpleType s;
    public static final SimpleType t;
    public static final SimpleType u;
    public static final SimpleType v;
    public static final SimpleType w;
    public static final SimpleType x;
    public final LookupCache d = new LRUMap(16, 200);
    public final TypeParser e = new TypeParser(this);

    static {
        Class cls = Boolean.TYPE;
        n = cls;
        Class cls2 = Integer.TYPE;
        o = cls2;
        Class cls3 = Long.TYPE;
        p = cls3;
        q = new SimpleType(cls);
        r = new SimpleType(cls2);
        s = new SimpleType(cls3);
        t = new SimpleType(String.class);
        u = new SimpleType(Object.class);
        v = new SimpleType(Comparable.class);
        w = new SimpleType(Enum.class);
        x = new SimpleType(JsonNode.class);
    }

    public static SimpleType a(Class cls) {
        if (cls.isPrimitive()) {
            if (cls == n) {
                return q;
            }
            if (cls == o) {
                return r;
            }
            if (cls == p) {
                return s;
            }
            return null;
        }
        if (cls == i) {
            return t;
        }
        if (cls == j) {
            return u;
        }
        if (cls == m) {
            return x;
        }
        return null;
    }

    public static boolean e(JavaType javaType, JavaType javaType2) {
        if (javaType2 instanceof PlaceholderForType) {
            ((PlaceholderForType) javaType2).n = javaType;
            return true;
        }
        if (javaType.d == javaType2.d) {
            List listE = javaType.j().e();
            List listE2 = javaType2.j().e();
            int size = listE.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (e((JavaType) listE.get(i2), (JavaType) listE2.get(i2))) {
                }
            }
            return true;
        }
        return false;
    }

    public static JavaType h(JavaType javaType, Class cls) {
        Class cls2 = javaType.d;
        if (cls2 == cls) {
            return javaType;
        }
        JavaType javaTypeI = javaType.i(cls);
        if (javaTypeI != null) {
            return javaTypeI;
        }
        if (cls.isAssignableFrom(cls2)) {
            throw new IllegalArgumentException(String.format("Internal error: class %s not included as super-type for %s", cls.getName(), javaType));
        }
        throw new IllegalArgumentException(String.format("Class %s not a super-type of %s", cls.getName(), javaType));
    }

    public static Class l(String str) throws ClassNotFoundException {
        Throwable thS = null;
        if (str.indexOf(46) < 0) {
            Class cls = "int".equals(str) ? Integer.TYPE : "long".equals(str) ? Long.TYPE : "float".equals(str) ? Float.TYPE : "double".equals(str) ? Double.TYPE : "boolean".equals(str) ? Boolean.TYPE : "byte".equals(str) ? Byte.TYPE : "char".equals(str) ? Character.TYPE : "short".equals(str) ? Short.TYPE : "void".equals(str) ? Void.TYPE : null;
            if (cls != null) {
                return cls;
            }
        }
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null) {
            try {
                return Class.forName(str, true, contextClassLoader);
            } catch (Exception e) {
                thS = ClassUtil.s(e);
            }
        }
        try {
            return Class.forName(str);
        } catch (Exception e2) {
            if (thS == null) {
                thS = ClassUtil.s(e2);
            }
            ClassUtil.G(thS);
            throw new ClassNotFoundException(thS.getMessage(), thS);
        }
    }

    public static JavaType[] m(JavaType javaType, Class cls) {
        JavaType javaTypeI = javaType.i(cls);
        return javaTypeI == null ? f : javaTypeI.j().e;
    }

    public static void n(Class cls) {
        TypeBindings typeBindings = h;
        if (!typeBindings.f() || a(cls) == null) {
            new SimpleType(cls, typeBindings, null, null);
        }
    }

    public static SimpleType o() {
        g.getClass();
        return u;
    }

    public final JavaType b(ClassStack classStack, Type type, TypeBindings typeBindings) {
        JavaType javaType;
        Type[] bounds;
        JavaType javaType2;
        TypeBindings typeBindingsC;
        if (type instanceof Class) {
            return c(classStack, (Class) type, h);
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Class cls = (Class) parameterizedType.getRawType();
            if (cls == l) {
                return w;
            }
            if (cls == k) {
                return v;
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments == null ? 0 : actualTypeArguments.length;
            if (length == 0) {
                typeBindingsC = h;
            } else {
                JavaType[] javaTypeArr = new JavaType[length];
                for (int i2 = 0; i2 < length; i2++) {
                    javaTypeArr[i2] = b(classStack, actualTypeArguments[i2], typeBindings);
                }
                typeBindingsC = TypeBindings.c(cls, javaTypeArr);
            }
            return c(classStack, cls, typeBindingsC);
        }
        if (type instanceof JavaType) {
            return (JavaType) type;
        }
        if (type instanceof GenericArrayType) {
            JavaType javaTypeB = b(classStack, ((GenericArrayType) type).getGenericComponentType(), typeBindings);
            int i3 = ArrayType.o;
            return new ArrayType(javaTypeB, typeBindings, Array.newInstance((Class<?>) javaTypeB.d, 0), null, null, false);
        }
        if (!(type instanceof TypeVariable)) {
            if (type instanceof WildcardType) {
                return b(classStack, ((WildcardType) type).getUpperBounds()[0], typeBindings);
            }
            StringBuilder sb = new StringBuilder("Unrecognized Type: ");
            sb.append(type == null ? "[null]" : type.toString());
            throw new IllegalArgumentException(sb.toString());
        }
        TypeVariable typeVariable = (TypeVariable) type;
        String name = typeVariable.getName();
        if (typeBindings == null) {
            throw new IllegalArgumentException(a.h("Null `bindings` passed (type variable \"", name, "\")"));
        }
        String[] strArr = typeBindings.d;
        int length2 = strArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length2) {
                javaType = null;
                break;
            }
            if (name.equals(strArr[i4])) {
                javaType = typeBindings.e[i4];
                if ((javaType instanceof ResolvedRecursiveType) && (javaType2 = ((ResolvedRecursiveType) javaType).m) != null) {
                    javaType = javaType2;
                }
            } else {
                i4++;
            }
        }
        if (javaType != null) {
            return javaType;
        }
        String[] strArr2 = typeBindings.f;
        if (strArr2 != null) {
            int length3 = strArr2.length;
            do {
                length3--;
                if (length3 >= 0) {
                }
            } while (!name.equals(strArr2[length3]));
            return u;
        }
        String[] strArr3 = typeBindings.f;
        int length4 = strArr3 == null ? 0 : strArr3.length;
        String[] strArr4 = length4 == 0 ? new String[1] : (String[]) Arrays.copyOf(strArr3, length4 + 1);
        strArr4[length4] = name;
        TypeBindings typeBindings2 = new TypeBindings(typeBindings.d, typeBindings.e, strArr4);
        synchronized (typeVariable) {
            bounds = typeVariable.getBounds();
        }
        return b(classStack, bounds[0], typeBindings2);
    }

    /* JADX WARN: Removed duplicated region for block: B:98:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fasterxml.jackson.databind.JavaType c(com.fasterxml.jackson.databind.type.ClassStack r20, java.lang.Class r21, com.fasterxml.jackson.databind.type.TypeBindings r22) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.type.TypeFactory.c(com.fasterxml.jackson.databind.type.ClassStack, java.lang.Class, com.fasterxml.jackson.databind.type.TypeBindings):com.fasterxml.jackson.databind.JavaType");
    }

    public final JavaType[] d(ClassStack classStack, Class cls, TypeBindings typeBindings) {
        Annotation[] annotationArr = ClassUtil.f14330a;
        Type[] genericInterfaces = cls.getGenericInterfaces();
        if (genericInterfaces == null || genericInterfaces.length == 0) {
            return f;
        }
        int length = genericInterfaces.length;
        JavaType[] javaTypeArr = new JavaType[length];
        for (int i2 = 0; i2 < length; i2++) {
            javaTypeArr[i2] = b(classStack, genericInterfaces[i2], typeBindings);
        }
        return javaTypeArr;
    }

    public final CollectionType f(JavaType javaType, Class cls) {
        TypeBindings typeBindings;
        String[] strArr = TypeBindings.h;
        TypeVariable[] typeParameters = cls.getTypeParameters();
        int length = typeParameters == null ? 0 : typeParameters.length;
        if (length == 0) {
            typeBindings = TypeBindings.j;
        } else {
            if (length != 1) {
                throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 1 type parameter: class expects " + length);
            }
            typeBindings = new TypeBindings(new String[]{typeParameters[0].getName()}, new JavaType[]{javaType}, null);
        }
        CollectionType collectionType = (CollectionType) c(null, cls, typeBindings);
        if (typeBindings.f() && javaType != null) {
            JavaType javaTypeK = collectionType.i(Collection.class).k();
            if (!javaTypeK.equals(javaType)) {
                throw new IllegalArgumentException(String.format("Non-generic Collection class %s did not resolve to something with element type %s but %s ", ClassUtil.B(cls), javaType, javaTypeK));
            }
        }
        return collectionType;
    }

    public final JavaType g(String str) {
        TypeParser typeParser = this.e;
        typeParser.getClass();
        TypeParser.MyTokenizer myTokenizer = new TypeParser.MyTokenizer(str.trim());
        JavaType javaTypeB = typeParser.b(myTokenizer);
        if (myTokenizer.hasMoreTokens()) {
            throw TypeParser.a(myTokenizer, "Unexpected tokens after complete type");
        }
        return javaTypeB;
    }

    public final MapType i(Class cls, JavaType javaType, JavaType javaType2) {
        TypeBindings typeBindings;
        JavaType[] javaTypeArr = {javaType, javaType2};
        String[] strArr = TypeBindings.h;
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length == 0) {
            typeBindings = TypeBindings.j;
        } else {
            int length = typeParameters.length;
            String[] strArr2 = new String[length];
            for (int i2 = 0; i2 < length; i2++) {
                strArr2[i2] = typeParameters[i2].getName();
            }
            if (length != 2) {
                throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 2 type parameters: class expects " + length);
            }
            typeBindings = new TypeBindings(strArr2, javaTypeArr, null);
        }
        MapType mapType = (MapType) c(null, cls, typeBindings);
        if (typeBindings.f()) {
            JavaType javaTypeI = mapType.i(Map.class);
            JavaType javaTypeO = javaTypeI.o();
            if (!javaTypeO.equals(javaType)) {
                throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with key type %s but %s ", ClassUtil.B(cls), javaType, javaTypeO));
            }
            JavaType javaTypeK = javaTypeI.k();
            if (!javaTypeK.equals(javaType2)) {
                throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with value type %s but %s ", ClassUtil.B(cls), javaType2, javaTypeK));
            }
        }
        return mapType;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0065, code lost:
    
        if (r3 == java.util.EnumSet.class) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fasterxml.jackson.databind.JavaType j(com.fasterxml.jackson.databind.JavaType r17, java.lang.Class r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.type.TypeFactory.j(com.fasterxml.jackson.databind.JavaType, java.lang.Class, boolean):com.fasterxml.jackson.databind.JavaType");
    }

    public final JavaType k(Type type) {
        return b(null, type, h);
    }
}
