package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class HashBiMap<K, V> extends AbstractMap<K, V> implements BiMap<K, V>, Serializable {
    public transient Object[] d;
    public transient Object[] e;
    public transient int f;
    public transient int g;
    public transient int[] h;
    public transient int[] i;
    public transient int[] j;
    public transient int[] k;
    public transient int l;
    public transient int m;
    public transient int[] n;
    public transient int[] o;
    public transient BiMap p;

    public final class EntryForKey extends AbstractMapEntry<K, V> {
        public final Object d;
        public int e;

        public EntryForKey(int i) {
            this.d = HashBiMap.this.d[i];
            this.e = i;
        }

        public final void a() {
            int i = this.e;
            Object obj = this.d;
            HashBiMap hashBiMap = HashBiMap.this;
            if (i == -1 || i > hashBiMap.f || !Objects.a(hashBiMap.d[i], obj)) {
                this.e = hashBiMap.f(Hashing.c(obj), obj);
            }
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.d;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            a();
            int i = this.e;
            if (i == -1) {
                return null;
            }
            return HashBiMap.this.e[i];
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public final Object setValue(Object obj) {
            a();
            int i = this.e;
            HashBiMap hashBiMap = HashBiMap.this;
            if (i == -1) {
                hashBiMap.put(this.d, obj);
                return null;
            }
            Object obj2 = hashBiMap.e[i];
            if (Objects.a(obj2, obj)) {
                return obj;
            }
            hashBiMap.m(this.e, obj);
            return obj2;
        }
    }

    public static final class EntryForValue<K, V> extends AbstractMapEntry<V, K> {
        public final HashBiMap d;
        public final Object e;
        public int f;

        public EntryForValue(HashBiMap hashBiMap, int i) {
            this.d = hashBiMap;
            this.e = hashBiMap.e[i];
            this.f = i;
        }

        public final void a() {
            int i = this.f;
            Object obj = this.e;
            HashBiMap hashBiMap = this.d;
            if (i == -1 || i > hashBiMap.f || !Objects.a(obj, hashBiMap.e[i])) {
                hashBiMap.getClass();
                this.f = hashBiMap.g(Hashing.c(obj), obj);
            }
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.e;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            a();
            int i = this.f;
            if (i == -1) {
                return null;
            }
            return this.d.d[i];
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public final Object setValue(Object obj) {
            a();
            int i = this.f;
            HashBiMap hashBiMap = this.d;
            if (i != -1) {
                Object obj2 = hashBiMap.d[i];
                if (Objects.a(obj2, obj)) {
                    return obj;
                }
                hashBiMap.l(this.f, obj);
                return obj2;
            }
            hashBiMap.getClass();
            Object obj3 = this.e;
            int iC = Hashing.c(obj3);
            int iG = hashBiMap.g(iC, obj3);
            if (iG != -1) {
                if (Objects.a(hashBiMap.d[iG], obj)) {
                    return null;
                }
                hashBiMap.l(iG, obj);
                return null;
            }
            int i2 = hashBiMap.m;
            int iC2 = Hashing.c(obj);
            Preconditions.e("Key already present: %s", obj, hashBiMap.f(iC2, obj) == -1);
            hashBiMap.e(hashBiMap.f + 1);
            Object[] objArr = hashBiMap.d;
            int i3 = hashBiMap.f;
            objArr[i3] = obj;
            hashBiMap.e[i3] = obj3;
            hashBiMap.h(i3, iC2);
            hashBiMap.i(hashBiMap.f, iC);
            int i4 = i2 == -2 ? hashBiMap.l : hashBiMap.o[i2];
            hashBiMap.n(i2, hashBiMap.f);
            hashBiMap.n(hashBiMap.f, i4);
            hashBiMap.f++;
            hashBiMap.g++;
            return null;
        }
    }

    public final class EntrySet extends View<K, V, Map.Entry<K, V>> {
        @Override // com.google.common.collect.HashBiMap.View
        public final Object b(int i) {
            return new EntryForKey(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            entry.getValue();
            Hashing.c(key);
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            entry.getValue();
            Hashing.c(key);
            throw null;
        }
    }

    public static class Inverse<K, V> extends AbstractMap<V, K> implements BiMap<V, K>, Serializable {
        public transient Set d;

        @GwtIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            throw null;
        }

        @Override // com.google.common.collect.BiMap
        public final BiMap T0() {
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsValue(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Set entrySet() {
            Set set = this.d;
            if (set != null) {
                return set;
            }
            InverseEntrySet inverseEntrySet = new InverseEntrySet(null);
            this.d = inverseEntrySet;
            return inverseEntrySet;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object put(Object obj, Object obj2) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public final Collection values() {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public final Set values() {
            throw null;
        }
    }

    public static class InverseEntrySet<K, V> extends View<K, V, Map.Entry<V, K>> {
        @Override // com.google.common.collect.HashBiMap.View
        public final Object b(int i) {
            return new EntryForValue(this.d, i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            HashBiMap hashBiMap = this.d;
            hashBiMap.getClass();
            int iG = hashBiMap.g(Hashing.c(key), key);
            return iG != -1 && Objects.a(hashBiMap.d[iG], value);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iC = Hashing.c(key);
            HashBiMap hashBiMap = this.d;
            int iG = hashBiMap.g(iC, key);
            if (iG == -1 || !Objects.a(hashBiMap.d[iG], value)) {
                return false;
            }
            hashBiMap.j(iG, Hashing.c(hashBiMap.d[iG]), iC);
            return true;
        }
    }

    public final class KeySet extends View<K, V, K> {
        @Override // com.google.common.collect.HashBiMap.View
        public final Object b(int i) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Hashing.c(obj);
            throw null;
        }
    }

    public final class ValueSet extends View<K, V, V> {
        @Override // com.google.common.collect.HashBiMap.View
        public final Object b(int i) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Hashing.c(obj);
            throw null;
        }
    }

    public static abstract class View<K, V, T> extends AbstractSet<T> {
        public final HashBiMap d;

        public View(HashBiMap hashBiMap) {
            this.d = hashBiMap;
        }

        public abstract Object b(int i);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            this.d.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new Iterator<Object>() { // from class: com.google.common.collect.HashBiMap.View.1
                public int d;
                public int e;
                public int f;
                public int g;

                {
                    HashBiMap hashBiMap = View.this.d;
                    this.d = hashBiMap.l;
                    this.e = -1;
                    this.f = hashBiMap.g;
                    this.g = hashBiMap.f;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    if (View.this.d.g == this.f) {
                        return this.d != -2 && this.g > 0;
                    }
                    throw new ConcurrentModificationException();
                }

                @Override // java.util.Iterator
                public final Object next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    int i = this.d;
                    View view = View.this;
                    Object objB = view.b(i);
                    int i2 = this.d;
                    this.e = i2;
                    this.d = view.d.o[i2];
                    this.g--;
                    return objB;
                }

                @Override // java.util.Iterator
                public final void remove() {
                    View view = View.this;
                    HashBiMap hashBiMap = view.d;
                    if (view.d.g != this.f) {
                        throw new ConcurrentModificationException();
                    }
                    CollectPreconditions.d(this.e != -1);
                    int i = this.e;
                    hashBiMap.k(i, Hashing.c(hashBiMap.d[i]));
                    if (this.d == hashBiMap.f) {
                        this.d = this.e;
                    }
                    this.e = -1;
                    this.f = hashBiMap.g;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.d.f;
        }
    }

    public static int[] b(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        CollectPreconditions.b(16, "expectedSize");
        int iA = Hashing.a(1.0d, 16);
        this.f = 0;
        this.d = new Object[16];
        this.e = new Object[16];
        this.h = b(iA);
        this.i = b(iA);
        this.j = b(16);
        this.k = b(16);
        this.l = -2;
        this.m = -2;
        this.n = b(16);
        this.o = b(16);
        Serialization.b(this, objectInputStream, i);
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Serialization.e(this, objectOutputStream);
    }

    @Override // com.google.common.collect.BiMap
    public final BiMap T0() {
        return this.p;
    }

    public final int a(int i) {
        return i & (this.h.length - 1);
    }

    public final void c(int i, int i2) {
        Preconditions.g(i != -1);
        int iA = a(i2);
        int[] iArr = this.h;
        int i3 = iArr[iA];
        if (i3 == i) {
            int[] iArr2 = this.j;
            iArr[iA] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.j[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 == -1) {
                throw new AssertionError("Expected to find entry with key " + this.d[i]);
            }
            if (i3 == i) {
                int[] iArr3 = this.j;
                iArr3[i5] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
            i4 = this.j[i3];
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.d, 0, this.f, (Object) null);
        Arrays.fill(this.e, 0, this.f, (Object) null);
        Arrays.fill(this.h, -1);
        Arrays.fill(this.i, -1);
        Arrays.fill(this.j, 0, this.f, -1);
        Arrays.fill(this.k, 0, this.f, -1);
        Arrays.fill(this.n, 0, this.f, -1);
        Arrays.fill(this.o, 0, this.f, -1);
        this.f = 0;
        this.l = -2;
        this.m = -2;
        this.g++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return f(Hashing.c(obj), obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return g(Hashing.c(obj), obj) != -1;
    }

    public final void d(int i, int i2) {
        Preconditions.g(i != -1);
        int iA = a(i2);
        int[] iArr = this.i;
        int i3 = iArr[iA];
        if (i3 == i) {
            int[] iArr2 = this.k;
            iArr[iA] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.k[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 == -1) {
                throw new AssertionError("Expected to find entry with value " + this.e[i]);
            }
            if (i3 == i) {
                int[] iArr3 = this.k;
                iArr3[i5] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
            i4 = this.k[i3];
        }
    }

    public final void e(int i) {
        int[] iArr = this.j;
        if (iArr.length < i) {
            int iB = ImmutableCollection.Builder.b(iArr.length, i);
            this.d = Arrays.copyOf(this.d, iB);
            this.e = Arrays.copyOf(this.e, iB);
            int[] iArr2 = this.j;
            int length = iArr2.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr2, iB);
            Arrays.fill(iArrCopyOf, length, iB, -1);
            this.j = iArrCopyOf;
            int[] iArr3 = this.k;
            int length2 = iArr3.length;
            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, iB);
            Arrays.fill(iArrCopyOf2, length2, iB, -1);
            this.k = iArrCopyOf2;
            int[] iArr4 = this.n;
            int length3 = iArr4.length;
            int[] iArrCopyOf3 = Arrays.copyOf(iArr4, iB);
            Arrays.fill(iArrCopyOf3, length3, iB, -1);
            this.n = iArrCopyOf3;
            int[] iArr5 = this.o;
            int length4 = iArr5.length;
            int[] iArrCopyOf4 = Arrays.copyOf(iArr5, iB);
            Arrays.fill(iArrCopyOf4, length4, iB, -1);
            this.o = iArrCopyOf4;
        }
        if (this.h.length < i) {
            int iA = Hashing.a(1.0d, i);
            this.h = b(iA);
            this.i = b(iA);
            for (int i2 = 0; i2 < this.f; i2++) {
                int iA2 = a(Hashing.c(this.d[i2]));
                int[] iArr6 = this.j;
                int[] iArr7 = this.h;
                iArr6[i2] = iArr7[iA2];
                iArr7[iA2] = i2;
                int iA3 = a(Hashing.c(this.e[i2]));
                int[] iArr8 = this.k;
                int[] iArr9 = this.i;
                iArr8[i2] = iArr9[iA3];
                iArr9[iA3] = i2;
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return null;
    }

    public final int f(int i, Object obj) {
        int[] iArr = this.h;
        int[] iArr2 = this.j;
        Object[] objArr = this.d;
        for (int i2 = iArr[a(i)]; i2 != -1; i2 = iArr2[i2]) {
            if (Objects.a(objArr[i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    public final int g(int i, Object obj) {
        int[] iArr = this.i;
        int[] iArr2 = this.k;
        Object[] objArr = this.e;
        for (int i2 = iArr[a(i)]; i2 != -1; i2 = iArr2[i2]) {
            if (Objects.a(objArr[i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        int iF = f(Hashing.c(obj), obj);
        if (iF == -1) {
            return null;
        }
        return this.e[iF];
    }

    public final void h(int i, int i2) {
        Preconditions.g(i != -1);
        int iA = a(i2);
        int[] iArr = this.j;
        int[] iArr2 = this.h;
        iArr[i] = iArr2[iA];
        iArr2[iA] = i;
    }

    public final void i(int i, int i2) {
        Preconditions.g(i != -1);
        int iA = a(i2);
        int[] iArr = this.k;
        int[] iArr2 = this.i;
        iArr[i] = iArr2[iA];
        iArr2[iA] = i;
    }

    public final void j(int i, int i2, int i3) {
        int i4;
        int i5;
        Preconditions.g(i != -1);
        c(i, i2);
        d(i, i3);
        n(this.n[i], this.o[i]);
        int i6 = this.f - 1;
        if (i6 != i) {
            int i7 = this.n[i6];
            int i8 = this.o[i6];
            n(i7, i);
            n(i, i8);
            Object[] objArr = this.d;
            Object obj = objArr[i6];
            Object[] objArr2 = this.e;
            Object obj2 = objArr2[i6];
            objArr[i] = obj;
            objArr2[i] = obj2;
            int iA = a(Hashing.c(obj));
            int[] iArr = this.h;
            int i9 = iArr[iA];
            if (i9 == i6) {
                iArr[iA] = i;
            } else {
                int i10 = this.j[i9];
                while (true) {
                    i4 = i9;
                    i9 = i10;
                    if (i9 == i6) {
                        break;
                    } else {
                        i10 = this.j[i9];
                    }
                }
                this.j[i4] = i;
            }
            int[] iArr2 = this.j;
            iArr2[i] = iArr2[i6];
            iArr2[i6] = -1;
            int iA2 = a(Hashing.c(obj2));
            int[] iArr3 = this.i;
            int i11 = iArr3[iA2];
            if (i11 == i6) {
                iArr3[iA2] = i;
            } else {
                int i12 = this.k[i11];
                while (true) {
                    i5 = i11;
                    i11 = i12;
                    if (i11 == i6) {
                        break;
                    } else {
                        i12 = this.k[i11];
                    }
                }
                this.k[i5] = i;
            }
            int[] iArr4 = this.k;
            iArr4[i] = iArr4[i6];
            iArr4[i6] = -1;
        }
        Object[] objArr3 = this.d;
        int i13 = this.f;
        objArr3[i13 - 1] = null;
        this.e[i13 - 1] = null;
        this.f = i13 - 1;
        this.g++;
    }

    public final void k(int i, int i2) {
        j(i, i2, Hashing.c(this.e[i]));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return null;
    }

    public final void l(int i, Object obj) {
        Preconditions.g(i != -1);
        int iF = f(Hashing.c(obj), obj);
        int i2 = this.m;
        if (iF != -1) {
            throw new IllegalArgumentException(androidx.camera.core.impl.b.m(obj, "Key already present in map: "));
        }
        if (i2 == i) {
            i2 = this.n[i];
        } else if (i2 == this.f) {
            i2 = iF;
        }
        if (-2 == i) {
            iF = this.o[i];
        } else if (-2 != this.f) {
            iF = -2;
        }
        n(this.n[i], this.o[i]);
        c(i, Hashing.c(this.d[i]));
        this.d[i] = obj;
        h(i, Hashing.c(obj));
        n(i2, i);
        n(i, iF);
    }

    public final void m(int i, Object obj) {
        Preconditions.g(i != -1);
        int iC = Hashing.c(obj);
        if (g(iC, obj) != -1) {
            throw new IllegalArgumentException(androidx.camera.core.impl.b.m(obj, "Value already present in map: "));
        }
        d(i, Hashing.c(this.e[i]));
        this.e[i] = obj;
        i(i, iC);
    }

    public final void n(int i, int i2) {
        if (i == -2) {
            this.l = i2;
        } else {
            this.o[i] = i2;
        }
        if (i2 == -2) {
            this.m = i;
        } else {
            this.n[i2] = i;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int iC = Hashing.c(obj);
        int iF = f(iC, obj);
        if (iF != -1) {
            Object obj3 = this.e[iF];
            if (Objects.a(obj3, obj2)) {
                return obj2;
            }
            m(iF, obj2);
            return obj3;
        }
        int iC2 = Hashing.c(obj2);
        Preconditions.e("Value already present: %s", obj2, g(iC2, obj2) == -1);
        e(this.f + 1);
        Object[] objArr = this.d;
        int i = this.f;
        objArr[i] = obj;
        this.e[i] = obj2;
        h(i, iC);
        i(this.f, iC2);
        n(this.m, this.f);
        n(this.f, -2);
        this.f++;
        this.g++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        int iC = Hashing.c(obj);
        int iF = f(iC, obj);
        if (iF == -1) {
            return null;
        }
        Object obj2 = this.e[iF];
        k(iF, iC);
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    public final Set values() {
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    public final Collection values() {
        return null;
    }
}
