package io.grpc.okhttp.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.net.ssl.SSLSocket;

/* loaded from: classes7.dex */
public class OptionalMethod<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Class f24138a;
    public final String b;
    public final Class[] c;

    public OptionalMethod(Class cls, String str, Class... clsArr) {
        this.f24138a = cls;
        this.b = str;
        this.c = clsArr;
    }

    public static Method b(Class cls, String str, Class[] clsArr) throws NoSuchMethodException, SecurityException {
        if (cls != null) {
            try {
                if ((cls.getModifiers() & 1) == 0) {
                    return b(cls.getSuperclass(), str, clsArr);
                }
                Method method = cls.getMethod(str, clsArr);
                try {
                    if ((method.getModifiers() & 1) != 0) {
                        return method;
                    }
                } catch (NoSuchMethodException unused) {
                    return method;
                }
            } catch (NoSuchMethodException unused2) {
                return null;
            }
        }
        return null;
    }

    public final Method a(Class cls) throws NoSuchMethodException, SecurityException {
        Class cls2;
        Method methodB = b(cls, this.b, this.c);
        if (methodB == null || (cls2 = this.f24138a) == null || cls2.isAssignableFrom(methodB.getReturnType())) {
            return methodB;
        }
        return null;
    }

    public final Object c(SSLSocket sSLSocket, Object... objArr) throws NoSuchMethodException, SecurityException {
        Method methodA = a(sSLSocket.getClass());
        if (methodA == null) {
            throw new AssertionError("Method " + this.b + " not supported for object " + sSLSocket);
        }
        try {
            return methodA.invoke(sSLSocket, objArr);
        } catch (IllegalAccessException e) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + methodA);
            assertionError.initCause(e);
            throw assertionError;
        }
    }

    public final void d(SSLSocket sSLSocket, Object... objArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Method methodA = a(sSLSocket.getClass());
            if (methodA == null) {
                return;
            }
            try {
                methodA.invoke(sSLSocket, objArr);
            } catch (IllegalAccessException unused) {
            }
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public final Object e(SSLSocket sSLSocket, Object... objArr) {
        try {
            return c(sSLSocket, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }
}
