package com.fasterxml.jackson.databind.util;

import YU.a;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.json.JsonGeneratorImpl;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.annotation.NoClass;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class ClassUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final Annotation[] f14330a = new Annotation[0];
    public static final Ctor[] b = new Ctor[0];
    public static final Iterator c = Collections.emptyIterator();

    public static final class Ctor {

        /* renamed from: a, reason: collision with root package name */
        public final Constructor f14331a;
        public transient Annotation[] b;
        public transient Annotation[][] c;
        public int d = -1;

        public Ctor(Constructor constructor) {
            this.f14331a = constructor;
        }
    }

    public static class EnumTypeLocator {
        public static final EnumTypeLocator e = new EnumTypeLocator();

        /* renamed from: a, reason: collision with root package name */
        public final Field f14332a;
        public final Field b;
        public final String c;
        public final String d;

        public EnumTypeLocator() throws SecurityException {
            String string;
            Field fieldA;
            String string2;
            Field fieldA2 = null;
            try {
                fieldA = a(EnumSet.class, "elementType");
                string = null;
            } catch (Exception e2) {
                string = e2.toString();
                fieldA = null;
            }
            this.f14332a = fieldA;
            this.c = string;
            try {
                string2 = null;
                fieldA2 = a(EnumMap.class, "keyType");
            } catch (Exception e3) {
                string2 = e3.toString();
            }
            this.b = fieldA2;
            this.d = string2;
        }

        public static Field a(Class cls, String str) throws SecurityException {
            for (Field field : cls.getDeclaredFields()) {
                if (str.equals(field.getName()) && field.getType() == Class.class) {
                    field.setAccessible(true);
                    return field;
                }
            }
            throw new IllegalStateException(a.j("No field named '", str, "' in class '", cls.getName(), "'"));
        }
    }

    public static String A(String str) {
        return str == null ? "[null]" : c(str);
    }

    public static String B(Class cls) {
        if (cls == null) {
            return "[null]";
        }
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
        }
        String simpleName = cls.isPrimitive() ? cls.getSimpleName() : cls.getName();
        if (i > 0) {
            StringBuilder sb = new StringBuilder(simpleName);
            do {
                sb.append("[]");
                i--;
            } while (i > 0);
            simpleName = sb.toString();
        }
        if (simpleName == null) {
            return "[null]";
        }
        StringBuilder sb2 = new StringBuilder(simpleName.length() + 2);
        sb2.append('`');
        sb2.append(simpleName);
        sb2.append('`');
        return sb2.toString();
    }

    public static Class C(Class cls) {
        if (cls.isPrimitive()) {
            return cls;
        }
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        return null;
    }

    public static void D(DeserializationContext deserializationContext, IOException iOException) throws JsonMappingException {
        if (iOException instanceof JsonMappingException) {
            throw ((JsonMappingException) iOException);
        }
        JsonMappingException jsonMappingException = new JsonMappingException(deserializationContext == null ? null : deserializationContext.i, iOException.getMessage());
        jsonMappingException.initCause(iOException);
        throw jsonMappingException;
    }

    public static void E(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    public static void F(Throwable th) {
        if (th instanceof IOException) {
            throw ((IOException) th);
        }
    }

    public static void G(Throwable th) {
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
    }

    public static void H(Class cls, Object obj, String str) {
        if (obj.getClass() != cls) {
            throw new IllegalStateException(a.o(a.v("Sub-class ", obj.getClass().getName(), " (of class ", cls.getName(), ") must override method '"), str, "'"));
        }
    }

    public static Class I(Class cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        throw new IllegalArgumentException(androidx.constraintlayout.core.state.a.f(cls, new StringBuilder("Class "), " is not a primitive type"));
    }

    public static void a(Class cls, Class cls2, ArrayList arrayList) {
        if (cls == cls2 || cls == null || cls == Object.class || arrayList.contains(cls)) {
            return;
        }
        arrayList.add(cls);
        for (Class<?> cls3 : cls.getInterfaces()) {
            a(cls3, cls2, arrayList);
        }
        a(cls.getSuperclass(), cls2, arrayList);
    }

    public static void b(Throwable th, Class cls) {
        String name = cls.getName();
        String name2 = th.getClass().getName();
        String message = th.getMessage();
        StringBuilder sbV = a.v("Failed on call to `getDeclaredMethods()` on class `", name, "`, problem: (", name2, ") ");
        sbV.append(message);
        throw new IllegalArgumentException(sbV.toString(), th);
    }

    public static String c(String str) {
        if (str == null) {
            return "[null]";
        }
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append('\'');
        sb.append(str);
        sb.append('\'');
        return sb.toString();
    }

    public static String d(Class cls) {
        if (cls.isAnnotation()) {
            return "annotation";
        }
        if (cls.isArray()) {
            return "array";
        }
        if (Enum.class.isAssignableFrom(cls)) {
            return "enum";
        }
        if (cls.isPrimitive()) {
            return "primitive";
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e(Member member, boolean z) throws SecurityException {
        AccessibleObject accessibleObject = (AccessibleObject) member;
        try {
            Class<?> declaringClass = member.getDeclaringClass();
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(declaringClass.getModifiers()) && (!z || w(declaringClass))) {
                return;
            }
            accessibleObject.setAccessible(true);
        } catch (SecurityException e) {
            if (accessibleObject.isAccessible()) {
                return;
            }
            throw new IllegalArgumentException("Cannot access " + member + " (from class " + member.getDeclaringClass().getName() + "; failed to set access: " + e.getMessage());
        } catch (RuntimeException e2) {
            if (!"InaccessibleObjectException".equals(e2.getClass().getSimpleName())) {
                throw e2;
            }
            String simpleName = member.getClass().getSimpleName();
            String name = member.getName();
            String strB = B(member.getDeclaringClass());
            String name2 = e2.getClass().getName();
            String message = e2.getMessage();
            StringBuilder sbV = a.v("Failed to call `setAccess()` on ", simpleName, " '", name, "' (of class ");
            androidx.constraintlayout.core.state.a.B(sbV, strB, ") due to `", name2, "`, problem: ");
            sbV.append(message);
            throw new IllegalArgumentException(sbV.toString(), e2);
        }
    }

    public static String f(Object obj) {
        if (obj == null) {
            return "[null]";
        }
        return B(obj instanceof Class ? (Class) obj : obj.getClass());
    }

    public static void g(JsonGeneratorImpl jsonGeneratorImpl, Closeable closeable, Exception exc) throws IOException {
        if (jsonGeneratorImpl != null) {
            jsonGeneratorImpl.d2(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
            try {
                jsonGeneratorImpl.close();
            } catch (Exception e) {
                exc.addSuppressed(e);
            }
        }
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e2) {
                exc.addSuppressed(e2);
            }
        }
        F(exc);
        G(exc);
        throw new RuntimeException(exc);
    }

    public static Object h(Class cls, boolean z) throws NoSuchMethodException, SecurityException {
        Constructor constructorK = k(cls, z);
        if (constructorK == null) {
            throw new IllegalArgumentException(androidx.constraintlayout.core.state.a.f(cls, new StringBuilder("Class "), " has no default (no arg) constructor"));
        }
        try {
            return constructorK.newInstance(null);
        } catch (Exception e) {
            String str = "Failed to instantiate class " + cls.getName() + ", problem: " + e.getMessage();
            Throwable thS = s(e);
            G(thS);
            E(thS);
            throw new IllegalArgumentException(str, thS);
        }
    }

    public static String i(Throwable th) {
        return th instanceof JacksonException ? ((JacksonException) th).b() : (!(th instanceof InvocationTargetException) || th.getCause() == null) ? th.getMessage() : th.getCause().getMessage();
    }

    public static Annotation[] j(Class cls) {
        return y(cls) ? f14330a : cls.getDeclaredAnnotations();
    }

    public static Constructor k(Class cls, boolean z) throws NoSuchMethodException, SecurityException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (z) {
                e(declaredConstructor, z);
                return declaredConstructor;
            }
            if (Modifier.isPublic(declaredConstructor.getModifiers())) {
                return declaredConstructor;
            }
            throw new IllegalArgumentException("Default constructor for " + cls.getName() + " is not accessible (non-public?): not allowed to try modify access via Reflection: cannot instantiate type");
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (Exception e) {
            String str = "Failed to find default constructor of class " + cls.getName() + ", problem: " + e.getMessage();
            Throwable thS = s(e);
            G(thS);
            E(thS);
            throw new IllegalArgumentException(str, thS);
        }
    }

    public static Class l(EnumMap enumMap) {
        if (!enumMap.isEmpty()) {
            return ((Enum) enumMap.keySet().iterator().next()).getDeclaringClass();
        }
        EnumTypeLocator enumTypeLocator = EnumTypeLocator.e;
        Field field = enumTypeLocator.b;
        if (field != null) {
            try {
                return (Class) field.get(enumMap);
            } catch (Exception e) {
                throw new IllegalArgumentException(e);
            }
        }
        throw new IllegalStateException("Cannot figure out type parameter for `EnumMap` (odd JDK platform?), problem: " + enumTypeLocator.d);
    }

    public static Class m(EnumSet enumSet) {
        if (!enumSet.isEmpty()) {
            return ((Enum) enumSet.iterator().next()).getDeclaringClass();
        }
        EnumTypeLocator enumTypeLocator = EnumTypeLocator.e;
        Field field = enumTypeLocator.f14332a;
        if (field != null) {
            try {
                return (Class) field.get(enumSet);
            } catch (Exception e) {
                throw new IllegalArgumentException(e);
            }
        }
        throw new IllegalStateException("Cannot figure out type parameter for `EnumSet` (odd JDK platform?), problem: " + enumTypeLocator.c);
    }

    public static ArrayList n(Class cls, Class cls2, boolean z) {
        ArrayList arrayList = new ArrayList(8);
        if (cls != null && cls != cls2) {
            if (z) {
                arrayList.add(cls);
            }
            while (true) {
                cls = cls.getSuperclass();
                if (cls == null || cls == cls2) {
                    break;
                }
                arrayList.add(cls);
            }
        }
        return arrayList;
    }

    public static String o(Object obj) {
        return B(obj instanceof Class ? (Class) obj : obj.getClass());
    }

    public static Method[] p(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader == null) {
                throw null;
            }
            try {
                try {
                    return contextClassLoader.loadClass(cls.getName()).getDeclaredMethods();
                } finally {
                }
            } catch (ClassNotFoundException e2) {
                e.addSuppressed(e2);
                throw null;
            }
        } finally {
        }
    }

    public static Ctor[] q(Class cls) throws SecurityException {
        if (cls.isInterface() || y(cls)) {
            return b;
        }
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        int length = declaredConstructors.length;
        Ctor[] ctorArr = new Ctor[length];
        for (int i = 0; i < length; i++) {
            ctorArr[i] = new Ctor(declaredConstructors[i]);
        }
        return ctorArr;
    }

    public static Class r(Class cls) {
        if (!Modifier.isStatic(cls.getModifiers())) {
            try {
                if (((y(cls) || cls.getEnclosingMethod() == null) ? false : true) || y(cls)) {
                    return null;
                }
                return cls.getEnclosingClass();
            } catch (SecurityException unused) {
            }
        }
        return null;
    }

    public static Throwable s(Exception exc) {
        Exception cause = exc;
        while (cause.getCause() != null) {
            cause = cause.getCause();
        }
        return cause;
    }

    public static String t(JavaType javaType) {
        if (javaType == null) {
            return "[null]";
        }
        StringBuilder sb = new StringBuilder(80);
        sb.append('`');
        sb.append(javaType.c());
        sb.append('`');
        return sb.toString();
    }

    public static boolean u(Class cls, Object obj) {
        return obj != null && obj.getClass() == cls;
    }

    public static boolean v(Class cls) {
        return cls == Void.class || cls == Void.TYPE || cls == NoClass.class;
    }

    public static boolean w(Class cls) {
        String name = cls.getName();
        return name.startsWith("java.") || name.startsWith("javax.");
    }

    public static boolean x(Object obj) {
        return obj == null || obj.getClass().getAnnotation(JacksonStdImpl.class) != null;
    }

    public static boolean y(Class cls) {
        return cls == Object.class || cls.isPrimitive();
    }

    public static boolean z(Class cls) {
        Class superclass = cls.getSuperclass();
        return superclass != null && "com.android.tools.r8.RecordTag".equals(superclass.getName());
    }
}
