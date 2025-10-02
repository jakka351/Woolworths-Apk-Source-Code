package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.collect.Multiset;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

@J2ktIncompatible
@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class Serialization {

    public static final class FieldSetter<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Field f14904a;

        public FieldSetter(Field field) throws SecurityException {
            this.f14904a = field;
            field.setAccessible(true);
        }

        public final void a(Serializable serializable, Object obj) throws IllegalAccessException, IllegalArgumentException {
            try {
                this.f14904a.set(serializable, obj);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    public static FieldSetter a(Class cls, String str) {
        try {
            return new FieldSetter(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    public static void b(Map map, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            map.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    public static void c(Multimap multimap, ObjectInputStream objectInputStream, int i) throws IOException {
        for (int i2 = 0; i2 < i; i2++) {
            Collection collection = multimap.get(objectInputStream.readObject());
            int i3 = objectInputStream.readInt();
            for (int i4 = 0; i4 < i3; i4++) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    public static void d(Multiset multiset, ObjectInputStream objectInputStream, int i) throws ClassNotFoundException, IOException {
        for (int i2 = 0; i2 < i; i2++) {
            multiset.add(objectInputStream.readInt(), objectInputStream.readObject());
        }
    }

    public static void e(Map map, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public static void f(Multimap multimap, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(multimap.p1().size());
        for (Map.Entry entry : multimap.p1().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            Iterator it = ((Collection) entry.getValue()).iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    public static void g(Multiset multiset, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(multiset.entrySet().size());
        for (Multiset.Entry entry : multiset.entrySet()) {
            objectOutputStream.writeObject(entry.a());
            objectOutputStream.writeInt(entry.getCount());
        }
    }
}
