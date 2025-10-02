package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;

/* loaded from: classes7.dex */
final class Java16RecordComponentsLoader {

    /* renamed from: a, reason: collision with root package name */
    public static Cache f24371a;

    public static final class Cache {

        /* renamed from: a, reason: collision with root package name */
        public final Method f24372a;
        public final Method b;

        public Cache(Method method, Method method2) {
            this.f24372a = method;
            this.b = method2;
        }
    }

    public static Cache a(Object obj) {
        Cache cache;
        Cache cache2 = f24371a;
        if (cache2 != null) {
            return cache2;
        }
        Class<?> cls = obj.getClass();
        try {
            cache = new Cache(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
        } catch (NoSuchMethodException unused) {
            cache = new Cache(null, null);
        }
        f24371a = cache;
        return cache;
    }
}
