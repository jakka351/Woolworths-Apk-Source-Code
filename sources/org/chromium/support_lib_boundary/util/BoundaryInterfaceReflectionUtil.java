package org.chromium.support_lib_boundary.util;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.jspecify.annotations.NullMarked;

@NullMarked
/* loaded from: classes8.dex */
public class BoundaryInterfaceReflectionUtil {

    public static class InvocationHandlerWithDelegateGetter implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        public final Object f26810a;

        public InvocationHandlerWithDelegateGetter(Object obj) {
            this.f26810a = obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            Object obj2 = this.f26810a;
            try {
                return Class.forName(method.getDeclaringClass().getName(), true, obj2.getClass().getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(obj2, objArr);
            } catch (InvocationTargetException e) {
                throw e.getTargetException();
            } catch (ReflectiveOperationException e2) {
                throw new RuntimeException("Reflection failed for method " + method, e2);
            }
        }
    }

    public static Object a(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(BoundaryInterfaceReflectionUtil.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static InvocationHandler b(Object obj) {
        return new InvocationHandlerWithDelegateGetter(obj);
    }
}
