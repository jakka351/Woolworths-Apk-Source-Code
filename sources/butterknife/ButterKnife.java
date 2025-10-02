package butterknife;

import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class ButterKnife {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f12957a = new LinkedHashMap();

    private ButterKnife() {
        throw new AssertionError("No instances.");
    }

    public static Unbinder a(View view, Object obj) throws NoSuchMethodException, SecurityException {
        Constructor constructorB = b(obj.getClass());
        if (constructorB == null) {
            return Unbinder.f12958a;
        }
        try {
            return (Unbinder) constructorB.newInstance(obj, view);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Unable to invoke " + constructorB, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Unable to invoke " + constructorB, e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unable to create binding instance.", cause);
        }
    }

    public static Constructor b(Class cls) throws NoSuchMethodException, SecurityException {
        Constructor<?> constructorB;
        LinkedHashMap linkedHashMap = f12957a;
        Constructor constructor = (Constructor) linkedHashMap.get(cls);
        if (constructor != null || linkedHashMap.containsKey(cls)) {
            return constructor;
        }
        String name = cls.getName();
        if (name.startsWith("android.") || name.startsWith("java.") || name.startsWith("androidx.")) {
            return null;
        }
        try {
            constructorB = cls.getClassLoader().loadClass(name.concat("_ViewBinding")).getConstructor(cls, View.class);
        } catch (ClassNotFoundException unused) {
            constructorB = b(cls.getSuperclass());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Unable to find binding constructor for ".concat(name), e);
        }
        linkedHashMap.put(cls, constructorB);
        return constructorB;
    }
}
