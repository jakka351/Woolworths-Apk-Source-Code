package com.google.gson.internal.reflect;

import YU.a;
import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class ReflectionHelper {

    /* renamed from: a, reason: collision with root package name */
    public static final RecordHelper f15960a;

    public static abstract class RecordHelper {
        public abstract Method a(Class cls, Field field);

        public abstract Constructor b(Class cls);

        public abstract String[] c(Class cls);

        public abstract boolean d(Class cls);
    }

    /* loaded from: classes6.dex */
    public static class RecordNotSupportedHelper extends RecordHelper {
        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public final Method a(Class cls, Field field) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public final Constructor b(Class cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public final String[] c(Class cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public final boolean d(Class cls) {
            return false;
        }
    }

    public static class RecordSupportedHelper extends RecordHelper {

        /* renamed from: a, reason: collision with root package name */
        public final Method f15961a = Class.class.getMethod("isRecord", null);
        public final Method b;
        public final Method c;
        public final Method d;

        public RecordSupportedHelper() throws NoSuchMethodException, SecurityException {
            Method method = Class.class.getMethod("getRecordComponents", null);
            this.b = method;
            Class<?> componentType = method.getReturnType().getComponentType();
            this.c = componentType.getMethod("getName", null);
            this.d = componentType.getMethod("getType", null);
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public final Method a(Class cls, Field field) {
            try {
                return cls.getMethod(field.getName(), null);
            } catch (ReflectiveOperationException e) {
                RecordHelper recordHelper = ReflectionHelper.f15960a;
                throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            }
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public final Constructor b(Class cls) {
            try {
                Object[] objArr = (Object[]) this.b.invoke(cls, null);
                Class<?>[] clsArr = new Class[objArr.length];
                for (int i = 0; i < objArr.length; i++) {
                    clsArr[i] = (Class) this.d.invoke(objArr[i], null);
                }
                return cls.getDeclaredConstructor(clsArr);
            } catch (ReflectiveOperationException e) {
                RecordHelper recordHelper = ReflectionHelper.f15960a;
                throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            }
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public final String[] c(Class cls) {
            try {
                Object[] objArr = (Object[]) this.b.invoke(cls, null);
                String[] strArr = new String[objArr.length];
                for (int i = 0; i < objArr.length; i++) {
                    strArr[i] = (String) this.c.invoke(objArr[i], null);
                }
                return strArr;
            } catch (ReflectiveOperationException e) {
                RecordHelper recordHelper = ReflectionHelper.f15960a;
                throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            }
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public final boolean d(Class cls) {
            try {
                return ((Boolean) this.f15961a.invoke(cls, null)).booleanValue();
            } catch (ReflectiveOperationException e) {
                RecordHelper recordHelper = ReflectionHelper.f15960a;
                throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            }
        }
    }

    static {
        RecordHelper recordNotSupportedHelper;
        try {
            recordNotSupportedHelper = new RecordSupportedHelper();
        } catch (NoSuchMethodException unused) {
            recordNotSupportedHelper = new RecordNotSupportedHelper();
        }
        f15960a = recordNotSupportedHelper;
    }

    public static void a(AccessibleObject accessibleObject, StringBuilder sb) {
        sb.append('(');
        Class<?>[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i = 0; i < parameterTypes.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(parameterTypes[i].getSimpleName());
        }
        sb.append(')');
    }

    public static String b(Constructor constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        a(constructor, sb);
        return sb.toString();
    }

    public static String c(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    public static String d(AccessibleObject accessibleObject, boolean z) {
        String str;
        if (accessibleObject instanceof Field) {
            str = "field '" + c((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb = new StringBuilder(method.getName());
            a(method, sb);
            str = "method '" + method.getDeclaringClass().getName() + "#" + sb.toString() + "'";
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + b((Constructor) accessibleObject) + "'";
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (!z || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public static Method e(Class cls, Field field) {
        return f15960a.a(cls, field);
    }

    public static Constructor f(Class cls) {
        return f15960a.b(cls);
    }

    public static String[] g(Class cls) {
        return f15960a.c(cls);
    }

    public static boolean h(Class cls) {
        return f15960a.d(cls);
    }

    public static void i(AccessibleObject accessibleObject) throws SecurityException {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e) {
            throw new JsonIOException(a.h("Failed making ", d(accessibleObject, false), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type."), e);
        }
    }
}
