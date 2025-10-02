package com.google.gson.internal;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class ConstructorConstructor {

    /* renamed from: a, reason: collision with root package name */
    public final Map f15922a;
    public final boolean b;
    public final List c;

    /* renamed from: com.google.gson.internal.ConstructorConstructor$13, reason: invalid class name */
    class AnonymousClass13 implements ObjectConstructor<Object> {
        @Override // com.google.gson.internal.ObjectConstructor
        public final Object a() {
            return new ArrayList();
        }
    }

    /* renamed from: com.google.gson.internal.ConstructorConstructor$18, reason: invalid class name */
    class AnonymousClass18 implements ObjectConstructor<Object> {
        @Override // com.google.gson.internal.ObjectConstructor
        public final Object a() {
            return new LinkedTreeMap();
        }
    }

    public ConstructorConstructor(Map map, boolean z, List list) {
        this.f15922a = map;
        this.b = z;
        this.c = list;
    }

    public static String a(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ".concat(cls.getName());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.gson.internal.ObjectConstructor b(com.google.gson.reflect.TypeToken r9) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.ConstructorConstructor.b(com.google.gson.reflect.TypeToken):com.google.gson.internal.ObjectConstructor");
    }

    public final String toString() {
        return this.f15922a.toString();
    }
}
