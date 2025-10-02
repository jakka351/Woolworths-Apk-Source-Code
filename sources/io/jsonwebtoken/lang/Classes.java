package io.jsonwebtoken.lang;

import YU.a;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public final class Classes {
    private static final ClassLoaderAccessor THREAD_CL_ACCESSOR = new ExceptionIgnoringAccessor() { // from class: io.jsonwebtoken.lang.Classes.1
        @Override // io.jsonwebtoken.lang.Classes.ExceptionIgnoringAccessor
        public ClassLoader doGetClassLoader() throws Throwable {
            return Thread.currentThread().getContextClassLoader();
        }
    };
    private static final ClassLoaderAccessor CLASS_CL_ACCESSOR = new ExceptionIgnoringAccessor() { // from class: io.jsonwebtoken.lang.Classes.2
        @Override // io.jsonwebtoken.lang.Classes.ExceptionIgnoringAccessor
        public ClassLoader doGetClassLoader() throws Throwable {
            return Classes.class.getClassLoader();
        }
    };
    private static final ClassLoaderAccessor SYSTEM_CL_ACCESSOR = new ExceptionIgnoringAccessor() { // from class: io.jsonwebtoken.lang.Classes.3
        @Override // io.jsonwebtoken.lang.Classes.ExceptionIgnoringAccessor
        public ClassLoader doGetClassLoader() throws Throwable {
            return ClassLoader.getSystemClassLoader();
        }
    };

    public interface ClassLoaderAccessor {
        InputStream getResourceStream(String str);

        Class loadClass(String str);
    }

    public static abstract class ExceptionIgnoringAccessor implements ClassLoaderAccessor {
        private ExceptionIgnoringAccessor() {
        }

        public abstract ClassLoader doGetClassLoader() throws Throwable;

        public final ClassLoader getClassLoader() {
            try {
                return doGetClassLoader();
            } catch (Throwable unused) {
                return null;
            }
        }

        @Override // io.jsonwebtoken.lang.Classes.ClassLoaderAccessor
        public InputStream getResourceStream(String str) {
            ClassLoader classLoader = getClassLoader();
            if (classLoader != null) {
                return classLoader.getResourceAsStream(str);
            }
            return null;
        }

        @Override // io.jsonwebtoken.lang.Classes.ClassLoaderAccessor
        public Class loadClass(String str) {
            ClassLoader classLoader = getClassLoader();
            if (classLoader == null) {
                return null;
            }
            try {
                return classLoader.loadClass(str);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        }
    }

    private Classes() {
    }

    public static <T> Class<T> forName(String str) throws UnknownClassException {
        Class clsLoadClass = THREAD_CL_ACCESSOR.loadClass(str);
        if (clsLoadClass == null) {
            clsLoadClass = CLASS_CL_ACCESSOR.loadClass(str);
        }
        if (clsLoadClass == null) {
            clsLoadClass = SYSTEM_CL_ACCESSOR.loadClass(str);
        }
        if (clsLoadClass != null) {
            return clsLoadClass;
        }
        String strH = a.h("Unable to load class named [", str, "] from the thread context, current, or system/application ClassLoaders.  All heuristics have been exhausted.  Class could not be found.");
        if (str != null && str.startsWith("io.jsonwebtoken.impl")) {
            strH = a.g(strH, "  Have you remembered to include the jjwt-impl.jar in your runtime classpath?");
        }
        throw new UnknownClassException(strH);
    }

    public static <T> Constructor<T> getConstructor(Class<T> cls, Class... clsArr) {
        try {
            return cls.getConstructor(clsArr);
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(e);
        }
    }

    public static InputStream getResourceAsStream(String str) {
        InputStream resourceStream = THREAD_CL_ACCESSOR.getResourceStream(str);
        if (resourceStream == null) {
            resourceStream = CLASS_CL_ACCESSOR.getResourceStream(str);
        }
        return resourceStream == null ? SYSTEM_CL_ACCESSOR.getResourceStream(str) : resourceStream;
    }

    public static <T> T instantiate(Constructor<T> constructor, Object... objArr) {
        try {
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            throw new InstantiationException("Unable to instantiate instance with constructor [" + constructor + "]", e);
        }
    }

    public static <T> T invokeStatic(String str, String str2, Class[] clsArr, Object... objArr) throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = forName(str).getDeclaredMethod(str2, clsArr);
            declaredMethod.setAccessible(true);
            return (T) declaredMethod.invoke(null, objArr);
        } catch (Exception e) {
            throw new IllegalStateException(a.j("Unable to invoke class method ", str, "#", str2, ".  Ensure the necessary implementation is in the runtime classpath."), e);
        }
    }

    public static boolean isAvailable(String str) {
        try {
            forName(str);
            return true;
        } catch (UnknownClassException unused) {
            return false;
        }
    }

    public static <T> T newInstance(String str) {
        return (T) newInstance(forName(str));
    }

    public static <T> T newInstance(String str, Class[] clsArr, Object... objArr) {
        return (T) instantiate(getConstructor(forName(str), clsArr), objArr);
    }

    public static <T> T newInstance(String str, Object... objArr) {
        return (T) newInstance(forName(str), objArr);
    }

    public static <T> T newInstance(Class<T> cls) {
        if (cls != null) {
            try {
                return cls.newInstance();
            } catch (Exception e) {
                throw new InstantiationException(androidx.constraintlayout.core.state.a.f(cls, new StringBuilder("Unable to instantiate class ["), "]"), e);
            }
        }
        throw new IllegalArgumentException("Class method parameter cannot be null.");
    }

    public static <T> T newInstance(Class<T> cls, Object... objArr) {
        Class[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            clsArr[i] = objArr[i].getClass();
        }
        return (T) instantiate(getConstructor(cls, clsArr), objArr);
    }
}
