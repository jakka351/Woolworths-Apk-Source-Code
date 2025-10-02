package com.bumptech.glide.load.engine.bitmap_recycle;

import android.util.Log;
import com.bumptech.glide.util.Preconditions;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class LruArrayPool implements ArrayPool {

    /* renamed from: a, reason: collision with root package name */
    public final GroupedLinkedMap f13821a = new GroupedLinkedMap();
    public final KeyPool b = new KeyPool();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final int e;
    public int f;

    /* loaded from: classes4.dex */
    public static final class Key implements Poolable {

        /* renamed from: a, reason: collision with root package name */
        public final KeyPool f13822a;
        public int b;
        public Class c;

        public Key(KeyPool keyPool) {
            this.f13822a = keyPool;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.Poolable
        public final void a() {
            this.f13822a.c(this);
        }

        public final void b(Class cls, int i) {
            this.b = i;
            this.c = cls;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Key) {
                Key key = (Key) obj;
                if (this.b == key.b && this.c == key.c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i = this.b * 31;
            Class cls = this.c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public final String toString() {
            return "Key{size=" + this.b + "array=" + this.c + '}';
        }
    }

    public static final class KeyPool extends BaseKeyPool<Key> {
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.BaseKeyPool
        public final Poolable a() {
            return new Key(this);
        }
    }

    public LruArrayPool(int i) {
        this.e = i;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public final synchronized void a(int i) {
        try {
            if (i >= 40) {
                b();
            } else if (i >= 20 || i == 15) {
                f(this.e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public final synchronized void b() {
        f(0);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public final synchronized Object c(Class cls, int i) {
        Key key;
        int i2;
        try {
            Integer num = (Integer) i(cls).ceilingKey(Integer.valueOf(i));
            if (num == null || ((i2 = this.f) != 0 && this.e / i2 < 2 && num.intValue() > i * 8)) {
                Key key2 = (Key) this.b.b();
                key2.b(cls, i);
                key = key2;
            } else {
                KeyPool keyPool = this.b;
                int iIntValue = num.intValue();
                key = (Key) keyPool.b();
                key.b(cls, iIntValue);
            }
        } catch (Throwable th) {
            throw th;
        }
        return h(key, cls);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public final synchronized Object d() {
        Key key;
        key = (Key) this.b.b();
        key.b(byte[].class, 8);
        return h(key, byte[].class);
    }

    public final void e(Class cls, int i) {
        NavigableMap navigableMapI = i(cls);
        Integer num = (Integer) navigableMapI.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapI.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapI.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    public final void f(int i) {
        while (this.f > i) {
            Object objC = this.f13821a.c();
            Preconditions.b(objC);
            ArrayAdapterInterface arrayAdapterInterfaceG = g(objC.getClass());
            this.f -= arrayAdapterInterfaceG.a(objC) * arrayAdapterInterfaceG.c();
            e(objC.getClass(), arrayAdapterInterfaceG.a(objC));
            if (Log.isLoggable(arrayAdapterInterfaceG.b(), 2)) {
                Log.v(arrayAdapterInterfaceG.b(), "evicted: " + arrayAdapterInterfaceG.a(objC));
            }
        }
    }

    public final ArrayAdapterInterface g(Class cls) {
        ArrayAdapterInterface byteArrayAdapter;
        HashMap map = this.d;
        ArrayAdapterInterface arrayAdapterInterface = (ArrayAdapterInterface) map.get(cls);
        if (arrayAdapterInterface != null) {
            return arrayAdapterInterface;
        }
        if (cls.equals(int[].class)) {
            byteArrayAdapter = new IntegerArrayAdapter();
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            byteArrayAdapter = new ByteArrayAdapter();
        }
        map.put(cls, byteArrayAdapter);
        return byteArrayAdapter;
    }

    public final Object h(Key key, Class cls) {
        ArrayAdapterInterface arrayAdapterInterfaceG = g(cls);
        Object objA = this.f13821a.a(key);
        if (objA != null) {
            this.f -= arrayAdapterInterfaceG.a(objA) * arrayAdapterInterfaceG.c();
            e(cls, arrayAdapterInterfaceG.a(objA));
        }
        if (objA != null) {
            return objA;
        }
        if (Log.isLoggable(arrayAdapterInterfaceG.b(), 2)) {
            Log.v(arrayAdapterInterfaceG.b(), "Allocated " + key.b + " bytes");
        }
        return arrayAdapterInterfaceG.newArray(key.b);
    }

    public final NavigableMap i(Class cls) {
        HashMap map = this.c;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public final synchronized void put(Object obj) {
        Class<?> cls = obj.getClass();
        ArrayAdapterInterface arrayAdapterInterfaceG = g(cls);
        int iA = arrayAdapterInterfaceG.a(obj);
        int iC = arrayAdapterInterfaceG.c() * iA;
        if (iC <= this.e / 2) {
            Key key = (Key) this.b.b();
            key.b(cls, iA);
            this.f13821a.b(key, obj);
            NavigableMap navigableMapI = i(cls);
            Integer num = (Integer) navigableMapI.get(Integer.valueOf(key.b));
            Integer numValueOf = Integer.valueOf(key.b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapI.put(numValueOf, Integer.valueOf(iIntValue));
            this.f += iC;
            f(this.e);
        }
    }
}
