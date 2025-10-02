package kotlin.jvm.internal;

import java.util.Collections;
import java.util.List;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.jvm.internal.ReflectionFactoryImpl;

/* loaded from: classes.dex */
public class Reflection {

    /* renamed from: a, reason: collision with root package name */
    public static final ReflectionFactory f24268a;
    public static final KClass[] b;

    static {
        ReflectionFactory reflectionFactory = null;
        try {
            reflectionFactory = (ReflectionFactory) ReflectionFactoryImpl.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (reflectionFactory == null) {
            reflectionFactory = new ReflectionFactory();
        }
        f24268a = reflectionFactory;
        b = new KClass[0];
    }

    public static KClass a(Class cls) {
        return f24268a.b(cls);
    }

    public static KType b(Class cls) {
        ReflectionFactory reflectionFactory = f24268a;
        return reflectionFactory.l(reflectionFactory.b(cls), Collections.EMPTY_LIST, false);
    }

    public static KType c(KTypeProjection kTypeProjection) {
        ReflectionFactory reflectionFactory = f24268a;
        return reflectionFactory.l(reflectionFactory.b(List.class), Collections.singletonList(kTypeProjection), false);
    }
}
