package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;

/* loaded from: classes7.dex */
final class Java16SealedRecordLoader {

    /* renamed from: a, reason: collision with root package name */
    public static Cache f24373a;

    public static final class Cache {

        /* renamed from: a, reason: collision with root package name */
        public final Method f24374a;
        public final Method b;
        public final Method c;
        public final Method d;

        public Cache(Method method, Method method2, Method method3, Method method4) {
            this.f24374a = method;
            this.b = method2;
            this.c = method3;
            this.d = method4;
        }
    }

    public static Cache a() {
        Cache cache;
        Cache cache2 = f24373a;
        if (cache2 != null) {
            return cache2;
        }
        try {
            cache = new Cache(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
        } catch (NoSuchMethodException unused) {
            cache = new Cache(null, null, null, null);
        }
        f24373a = cache;
        return cache;
    }
}
