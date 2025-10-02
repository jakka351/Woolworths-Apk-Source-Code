package io.perfmark;

/* loaded from: classes7.dex */
public final class PerfMark {

    /* renamed from: a, reason: collision with root package name */
    public static final Impl f24217a;

    static {
        Object obj;
        Class<?> cls;
        Impl impl;
        try {
            cls = Class.forName("io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl");
            obj = null;
        } catch (Throwable th) {
            obj = th;
            cls = null;
        }
        if (cls != null) {
            try {
                impl = (Impl) cls.asSubclass(Impl.class).getConstructor(Tag.class).newInstance(Impl.f24216a);
            } catch (Throwable th2) {
                obj = th2;
            }
        } else {
            impl = null;
        }
        if (impl != null) {
            f24217a = impl;
        } else {
            f24217a = new Impl();
        }
        if (obj != null) {
            try {
                if (Boolean.getBoolean("io.perfmark.PerfMark.debug")) {
                    Class<?> cls2 = Class.forName("java.util.logging.Logger");
                    Object objInvoke = cls2.getMethod("getLogger", String.class).invoke(null, PerfMark.class.getName());
                    Class<?> cls3 = Class.forName("java.util.logging.Level");
                    cls2.getMethod("log", cls3, String.class, Throwable.class).invoke(objInvoke, cls3.getField("FINE").get(null), "Error during PerfMark.<clinit>", obj);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void a() {
        f24217a.getClass();
    }

    public static void b() {
        f24217a.getClass();
    }

    public static void c() {
        f24217a.getClass();
    }

    public static void d() {
        f24217a.getClass();
    }

    public static void e() {
        f24217a.getClass();
    }
}
