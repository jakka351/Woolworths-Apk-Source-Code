package com.airbnb.epoxy;

import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
class ControllerHelperLookup {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f13308a = new LinkedHashMap();
    public static final NoOpControllerHelper b = new NoOpControllerHelper();

    public static Constructor a(Class cls) {
        Constructor<?> constructorA;
        LinkedHashMap linkedHashMap = f13308a;
        Constructor constructor = (Constructor) linkedHashMap.get(cls);
        if (constructor != null || linkedHashMap.containsKey(cls)) {
            return constructor;
        }
        String name = cls.getName();
        if (name.startsWith("android.") || name.startsWith("java.")) {
            return null;
        }
        try {
            constructorA = Class.forName(name.concat("_EpoxyHelper")).getConstructor(cls);
        } catch (ClassNotFoundException unused) {
            constructorA = a(cls.getSuperclass());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Unable to find Epoxy Helper constructor for ".concat(name), e);
        }
        linkedHashMap.put(cls, constructorA);
        return constructorA;
    }
}
