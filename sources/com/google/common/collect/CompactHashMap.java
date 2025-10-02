package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
class CompactHashMap<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Object m = new Object();
    public transient Object d;
    public transient int[] e;
    public transient Object[] f;
    public transient Object[] g;
    public transient int h;
    public transient int i;
    public transient Set j;
    public transient Set k;
    public transient Collection l;

    /* renamed from: com.google.common.collect.CompactHashMap$2, reason: invalid class name */
    class AnonymousClass2 extends CompactHashMap<Object, Object>.Itr<Map.Entry<Object, Object>> {
        public AnonymousClass2() {
            super();
        }

        @Override // com.google.common.collect.CompactHashMap.Itr
        public final Object a(int i) {
            return new MapEntry(i);
        }
    }

    public class EntrySetView extends AbstractSet<Map.Entry<K, V>> {
        public EntrySetView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            CompactHashMap compactHashMap = CompactHashMap.this;
            Map mapG = compactHashMap.g();
            if (mapG != null) {
                return mapG.entrySet().contains(obj);
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int iL = compactHashMap.l(entry.getKey());
                if (iL != -1 && Objects.a(compactHashMap.t()[iL], entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            CompactHashMap compactHashMap = CompactHashMap.this;
            Map mapG = compactHashMap.g();
            return mapG != null ? mapG.entrySet().iterator() : new AnonymousClass2();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            CompactHashMap compactHashMap = CompactHashMap.this;
            Map mapG = compactHashMap.g();
            if (mapG != null) {
                return mapG.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (compactHashMap.p()) {
                return false;
            }
            int iJ = compactHashMap.j();
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object obj2 = compactHashMap.d;
            java.util.Objects.requireNonNull(obj2);
            int iD = CompactHashing.d(key, value, iJ, obj2, compactHashMap.r(), compactHashMap.s(), compactHashMap.t());
            if (iD == -1) {
                return false;
            }
            compactHashMap.o(iD, iJ);
            compactHashMap.i--;
            compactHashMap.k();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return CompactHashMap.this.size();
        }
    }

    public abstract class Itr<T> implements Iterator<T> {
        public int d;
        public int e;
        public int f = -1;

        public Itr() {
            this.d = CompactHashMap.this.h;
            this.e = CompactHashMap.this.h();
        }

        public abstract Object a(int i);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.e >= 0;
        }

        @Override // java.util.Iterator
        public final Object next() {
            CompactHashMap compactHashMap = CompactHashMap.this;
            if (compactHashMap.h != this.d) {
                throw new ConcurrentModificationException();
            }
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.e;
            this.f = i;
            Object objA = a(i);
            this.e = compactHashMap.i(this.e);
            return objA;
        }

        @Override // java.util.Iterator
        public final void remove() {
            CompactHashMap compactHashMap = CompactHashMap.this;
            if (compactHashMap.h != this.d) {
                throw new ConcurrentModificationException();
            }
            CollectPreconditions.d(this.f >= 0);
            this.d += 32;
            compactHashMap.remove(compactHashMap.s()[this.f]);
            this.e = compactHashMap.b(this.e, this.f);
            this.f = -1;
        }
    }

    public class KeySetView extends AbstractSet<K> {
        public KeySetView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return CompactHashMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            final CompactHashMap compactHashMap = CompactHashMap.this;
            Map mapG = compactHashMap.g();
            return mapG != null ? mapG.keySet().iterator() : new CompactHashMap<Object, Object>.Itr<Object>() { // from class: com.google.common.collect.CompactHashMap.1
                @Override // com.google.common.collect.CompactHashMap.Itr
                public final Object a(int i) {
                    Object obj = CompactHashMap.m;
                    return CompactHashMap.this.s()[i];
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            CompactHashMap compactHashMap = CompactHashMap.this;
            Map mapG = compactHashMap.g();
            return mapG != null ? mapG.keySet().remove(obj) : compactHashMap.q(obj) != CompactHashMap.m;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return CompactHashMap.this.size();
        }
    }

    public final class MapEntry extends AbstractMapEntry<K, V> {
        public final Object d;
        public int e;

        public MapEntry(int i) {
            Object obj = CompactHashMap.m;
            this.d = CompactHashMap.this.s()[i];
            this.e = i;
        }

        public final void a() {
            int i = this.e;
            Object obj = this.d;
            CompactHashMap compactHashMap = CompactHashMap.this;
            if (i != -1 && i < compactHashMap.size()) {
                if (Objects.a(obj, compactHashMap.s()[this.e])) {
                    return;
                }
            }
            Object obj2 = CompactHashMap.m;
            this.e = compactHashMap.l(obj);
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.d;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            CompactHashMap compactHashMap = CompactHashMap.this;
            Map mapG = compactHashMap.g();
            if (mapG != null) {
                return mapG.get(this.d);
            }
            a();
            int i = this.e;
            if (i == -1) {
                return null;
            }
            return compactHashMap.t()[i];
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public final Object setValue(Object obj) {
            CompactHashMap compactHashMap = CompactHashMap.this;
            Map mapG = compactHashMap.g();
            Object obj2 = this.d;
            if (mapG != 0) {
                return mapG.put(obj2, obj);
            }
            a();
            int i = this.e;
            if (i == -1) {
                compactHashMap.put(obj2, obj);
                return null;
            }
            Object obj3 = compactHashMap.t()[i];
            compactHashMap.t()[this.e] = obj;
            return obj3;
        }
    }

    public class ValuesView extends AbstractCollection<V> {
        public ValuesView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            final CompactHashMap compactHashMap = CompactHashMap.this;
            Map mapG = compactHashMap.g();
            return mapG != null ? mapG.values().iterator() : new CompactHashMap<Object, Object>.Itr<Object>() { // from class: com.google.common.collect.CompactHashMap.3
                @Override // com.google.common.collect.CompactHashMap.Itr
                public final Object a(int i) {
                    Object obj = CompactHashMap.m;
                    return CompactHashMap.this.t()[i];
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return CompactHashMap.this.size();
        }
    }

    public CompactHashMap(int i) {
        m(i);
    }

    public static CompactHashMap e() {
        CompactHashMap compactHashMap = new CompactHashMap();
        compactHashMap.m(3);
        return compactHashMap;
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(YU.a.d(i, "Invalid size: "));
        }
        m(i);
        for (int i2 = 0; i2 < i; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    @J2ktIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Map mapG = g();
        Iterator<Map.Entry<K, V>> it = mapG != null ? mapG.entrySet().iterator() : new AnonymousClass2();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    public void a(int i) {
    }

    public int b(int i, int i2) {
        return i - 1;
    }

    public int c() {
        Preconditions.q("Arrays already allocated", p());
        int i = this.h;
        int iMax = Math.max(4, Hashing.a(1.0d, i + 1));
        this.d = CompactHashing.a(iMax);
        this.h = CompactHashing.b(this.h, 32 - Integer.numberOfLeadingZeros(iMax - 1), 31);
        this.e = new int[i];
        this.f = new Object[i];
        this.g = new Object[i];
        return i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (p()) {
            return;
        }
        k();
        Map mapG = g();
        if (mapG != null) {
            this.h = Ints.c(size(), 3);
            mapG.clear();
            this.d = null;
            this.i = 0;
            return;
        }
        Arrays.fill(s(), 0, this.i, (Object) null);
        Arrays.fill(t(), 0, this.i, (Object) null);
        Object obj = this.d;
        java.util.Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(r(), 0, this.i, 0);
        this.i = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapG = g();
        return mapG != null ? mapG.containsKey(obj) : l(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapG = g();
        if (mapG != null) {
            return mapG.containsValue(obj);
        }
        for (int i = 0; i < this.i; i++) {
            if (Objects.a(obj, t()[i])) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Map d() {
        LinkedHashMap linkedHashMapF = f(j() + 1);
        int iH = h();
        while (iH >= 0) {
            linkedHashMapF.put(s()[iH], t()[iH]);
            iH = i(iH);
        }
        this.d = linkedHashMapF;
        this.e = null;
        this.f = null;
        this.g = null;
        k();
        return linkedHashMapF;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.k;
        if (set != null) {
            return set;
        }
        EntrySetView entrySetView = new EntrySetView();
        this.k = entrySetView;
        return entrySetView;
    }

    public LinkedHashMap f(int i) {
        return new LinkedHashMap(i, 1.0f);
    }

    public final Map g() {
        Object obj = this.d;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapG = g();
        if (mapG != null) {
            return mapG.get(obj);
        }
        int iL = l(obj);
        if (iL == -1) {
            return null;
        }
        a(iL);
        return t()[iL];
    }

    public int h() {
        return isEmpty() ? -1 : 0;
    }

    public int i(int i) {
        int i2 = i + 1;
        if (i2 < this.i) {
            return i2;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final int j() {
        return (1 << (this.h & 31)) - 1;
    }

    public final void k() {
        this.h += 32;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.j;
        if (set != null) {
            return set;
        }
        KeySetView keySetView = new KeySetView();
        this.j = keySetView;
        return keySetView;
    }

    public final int l(Object obj) {
        if (p()) {
            return -1;
        }
        int iC = Hashing.c(obj);
        int iJ = j();
        Object obj2 = this.d;
        java.util.Objects.requireNonNull(obj2);
        int iE = CompactHashing.e(iC & iJ, obj2);
        if (iE == 0) {
            return -1;
        }
        int i = ~iJ;
        int i2 = iC & i;
        do {
            int i3 = iE - 1;
            int i4 = r()[i3];
            if ((i4 & i) == i2 && Objects.a(obj, s()[i3])) {
                return i3;
            }
            iE = i4 & iJ;
        } while (iE != 0);
        return -1;
    }

    public void m(int i) {
        Preconditions.f("Expected size must be >= 0", i >= 0);
        this.h = Ints.c(i, 1);
    }

    public void n(Object obj, int i, Object obj2, int i2, int i3) {
        r()[i] = CompactHashing.b(i2, 0, i3);
        s()[i] = obj;
        t()[i] = obj2;
    }

    public void o(int i, int i2) {
        Object obj = this.d;
        java.util.Objects.requireNonNull(obj);
        int[] iArrR = r();
        Object[] objArrS = s();
        Object[] objArrT = t();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrS[i] = null;
            objArrT[i] = null;
            iArrR[i] = 0;
            return;
        }
        Object obj2 = objArrS[i3];
        objArrS[i] = obj2;
        objArrT[i] = objArrT[i3];
        objArrS[i3] = null;
        objArrT[i3] = null;
        iArrR[i] = iArrR[i3];
        iArrR[i3] = 0;
        int iC = Hashing.c(obj2) & i2;
        int iE = CompactHashing.e(iC, obj);
        if (iE == size) {
            CompactHashing.f(iC, i + 1, obj);
            return;
        }
        while (true) {
            int i4 = iE - 1;
            int i5 = iArrR[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                iArrR[i4] = CompactHashing.b(i5, i + 1, i2);
                return;
            }
            iE = i6;
        }
    }

    public final boolean p() {
        return this.d == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object put(java.lang.Object r18, java.lang.Object r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r3 = r19
            boolean r2 = r0.p()
            if (r2 == 0) goto Lf
            r0.c()
        Lf:
            java.util.Map r2 = r0.g()
            if (r2 == 0) goto L1a
            java.lang.Object r1 = r2.put(r1, r3)
            return r1
        L1a:
            int[] r2 = r0.r()
            java.lang.Object[] r4 = r0.s()
            java.lang.Object[] r5 = r0.t()
            r6 = r2
            int r2 = r0.i
            int r7 = r2 + 1
            r8 = r4
            int r4 = com.google.common.collect.Hashing.c(r1)
            int r9 = r0.j()
            r10 = r4 & r9
            java.lang.Object r11 = r0.d
            java.util.Objects.requireNonNull(r11)
            int r11 = com.google.common.collect.CompactHashing.e(r10, r11)
            r12 = 1
            if (r11 != 0) goto L5b
            if (r7 <= r9) goto L50
            int r5 = com.google.common.collect.CompactHashing.c(r9)
            int r9 = r0.w(r9, r5, r4, r2)
            r5 = r9
            r16 = r12
            goto L9e
        L50:
            java.lang.Object r5 = r0.d
            java.util.Objects.requireNonNull(r5)
            com.google.common.collect.CompactHashing.f(r10, r7, r5)
            r16 = r12
            goto L95
        L5b:
            int r10 = ~r9
            r13 = r4 & r10
            r14 = 0
        L5f:
            int r11 = r11 - r12
            r15 = r6[r11]
            r16 = r12
            r12 = r15 & r10
            if (r12 != r13) goto L78
            r12 = r8[r11]
            boolean r12 = com.google.common.base.Objects.a(r1, r12)
            if (r12 == 0) goto L78
            r1 = r5[r11]
            r5[r11] = r3
            r0.a(r11)
            return r1
        L78:
            r12 = r15 & r9
            int r14 = r14 + 1
            if (r12 != 0) goto Lc5
            r5 = 9
            if (r14 < r5) goto L8b
            java.util.Map r2 = r0.d()
            java.lang.Object r1 = r2.put(r1, r3)
            return r1
        L8b:
            if (r7 <= r9) goto L97
            int r5 = com.google.common.collect.CompactHashing.c(r9)
            int r9 = r0.w(r9, r5, r4, r2)
        L95:
            r5 = r9
            goto L9e
        L97:
            int r5 = com.google.common.collect.CompactHashing.b(r15, r7, r9)
            r6[r11] = r5
            goto L95
        L9e:
            int[] r6 = r0.r()
            int r6 = r6.length
            if (r7 <= r6) goto Lbb
            int r8 = r6 >>> 1
            r11 = r16
            int r8 = java.lang.Math.max(r11, r8)
            int r8 = r8 + r6
            r8 = r8 | r11
            r9 = 1073741823(0x3fffffff, float:1.9999999)
            int r8 = java.lang.Math.min(r9, r8)
            if (r8 == r6) goto Lbb
            r0.u(r8)
        Lbb:
            r0.n(r1, r2, r3, r4, r5)
            r0.i = r7
            r0.k()
            r1 = 0
            return r1
        Lc5:
            r1 = r18
            r3 = r19
            r11 = r12
            r12 = r16
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.CompactHashMap.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final Object q(Object obj) {
        boolean zP = p();
        Object obj2 = m;
        if (zP) {
            return obj2;
        }
        int iJ = j();
        Object obj3 = this.d;
        java.util.Objects.requireNonNull(obj3);
        int iD = CompactHashing.d(obj, null, iJ, obj3, r(), s(), null);
        if (iD == -1) {
            return obj2;
        }
        Object obj4 = t()[iD];
        o(iD, iJ);
        this.i--;
        k();
        return obj4;
    }

    public final int[] r() {
        int[] iArr = this.e;
        java.util.Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapG = g();
        if (mapG != null) {
            return mapG.remove(obj);
        }
        Object objQ = q(obj);
        if (objQ == m) {
            return null;
        }
        return objQ;
    }

    public final Object[] s() {
        Object[] objArr = this.f;
        java.util.Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapG = g();
        return mapG != null ? mapG.size() : this.i;
    }

    public final Object[] t() {
        Object[] objArr = this.g;
        java.util.Objects.requireNonNull(objArr);
        return objArr;
    }

    public void u(int i) {
        this.e = Arrays.copyOf(r(), i);
        this.f = Arrays.copyOf(s(), i);
        this.g = Arrays.copyOf(t(), i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.l;
        if (collection != null) {
            return collection;
        }
        ValuesView valuesView = new ValuesView();
        this.l = valuesView;
        return valuesView;
    }

    public final int w(int i, int i2, int i3, int i4) {
        Object objA = CompactHashing.a(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            CompactHashing.f(i3 & i5, i4 + 1, objA);
        }
        Object obj = this.d;
        java.util.Objects.requireNonNull(obj);
        int[] iArrR = r();
        for (int i6 = 0; i6 <= i; i6++) {
            int iE = CompactHashing.e(i6, obj);
            while (iE != 0) {
                int i7 = iE - 1;
                int i8 = iArrR[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iE2 = CompactHashing.e(i10, objA);
                CompactHashing.f(i10, iE, objA);
                iArrR[i7] = CompactHashing.b(i9, iE2, i5);
                iE = i8 & i;
            }
        }
        this.d = objA;
        this.h = CompactHashing.b(this.h, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }
}
