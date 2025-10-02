package kotlin.collections.builders;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableMap;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0006\u000e\u000f\u0010\u0011\u0012\u0013J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lkotlin/collections/builders/MapBuilder;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "input", "", "readObject", "(Ljava/io/ObjectInputStream;)V", "Companion", "Itr", "KeysItr", "ValuesItr", "EntriesItr", "EntryRef", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, KMutableMap {
    public static final MapBuilder q;
    public Object[] d;
    public Object[] e;
    public int[] f;
    public int[] g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public MapBuilderKeys m;
    public MapBuilderValues n;
    public MapBuilderEntries o;
    public boolean p;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lkotlin/collections/builders/MapBuilder$Companion;", "", "", "MAGIC", "I", "INITIAL_CAPACITY", "INITIAL_MAX_PROBE_DISTANCE", "TOMBSTONE", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00050\u0004¨\u0006\u0006"}, d2 = {"Lkotlin/collections/builders/MapBuilder$EntriesItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class EntriesItr<K, V> extends Itr<K, V> implements Iterator<Map.Entry<K, V>>, KMutableIterator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EntriesItr(MapBuilder map) {
            super(map);
            Intrinsics.h(map, "map");
        }

        public final void c(StringBuilder sb) {
            int i = this.e;
            MapBuilder mapBuilder = this.d;
            if (i >= mapBuilder.i) {
                throw new NoSuchElementException();
            }
            this.e = i + 1;
            this.f = i;
            Object obj = mapBuilder.d[i];
            if (obj == mapBuilder) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = mapBuilder.e;
            Intrinsics.e(objArr);
            Object obj2 = objArr[this.f];
            if (obj2 == mapBuilder) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            b();
        }

        public final int d() {
            int i = this.e;
            MapBuilder mapBuilder = this.d;
            if (i >= mapBuilder.i) {
                throw new NoSuchElementException();
            }
            this.e = i + 1;
            this.f = i;
            Object obj = mapBuilder.d[i];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = mapBuilder.e;
            Intrinsics.e(objArr);
            Object obj2 = objArr[this.f];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            b();
            return iHashCode2;
        }

        @Override // java.util.Iterator
        public final Object next() {
            a();
            int i = this.e;
            MapBuilder mapBuilder = this.d;
            if (i >= mapBuilder.i) {
                throw new NoSuchElementException();
            }
            this.e = i + 1;
            this.f = i;
            EntryRef entryRef = new EntryRef(i, mapBuilder);
            b();
            return entryRef;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/collections/builders/MapBuilder$EntryRef;", "K", "V", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class EntryRef<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {
        public final MapBuilder d;
        public final int e;
        public final int f;

        public EntryRef(int i, MapBuilder map) {
            Intrinsics.h(map, "map");
            this.d = map;
            this.e = i;
            this.f = map.k;
        }

        public final void a() {
            if (this.d.k != this.f) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return Intrinsics.c(entry.getKey(), getKey()) && Intrinsics.c(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            a();
            return this.d.d[this.e];
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            a();
            Object[] objArr = this.d.e;
            Intrinsics.e(objArr);
            return objArr[this.e];
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            Object key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            a();
            MapBuilder mapBuilder = this.d;
            mapBuilder.c();
            Object[] objArr = mapBuilder.e;
            if (objArr == null) {
                int length = mapBuilder.d.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                mapBuilder.e = objArr;
            }
            int i = this.e;
            Object obj2 = objArr[i];
            objArr[i] = obj;
            return obj2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/collections/builders/MapBuilder$Itr;", "K", "V", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static class Itr<K, V> {
        public final MapBuilder d;
        public int e;
        public int f;
        public int g;

        public Itr(MapBuilder map) {
            Intrinsics.h(map, "map");
            this.d = map;
            this.f = -1;
            this.g = map.k;
            b();
        }

        public final void a() {
            if (this.d.k != this.g) {
                throw new ConcurrentModificationException();
            }
        }

        public final void b() {
            while (true) {
                int i = this.e;
                MapBuilder mapBuilder = this.d;
                if (i >= mapBuilder.i || mapBuilder.f[i] >= 0) {
                    return;
                } else {
                    this.e = i + 1;
                }
            }
        }

        public final boolean hasNext() {
            return this.e < this.d.i;
        }

        public final void remove() {
            a();
            if (this.f == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            MapBuilder mapBuilder = this.d;
            mapBuilder.c();
            mapBuilder.l(this.f);
            this.f = -1;
            this.g = mapBuilder.k;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/collections/builders/MapBuilder$KeysItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class KeysItr<K, V> extends Itr<K, V> implements Iterator<K>, KMutableIterator {
        @Override // java.util.Iterator
        public final Object next() {
            a();
            int i = this.e;
            MapBuilder mapBuilder = this.d;
            if (i >= mapBuilder.i) {
                throw new NoSuchElementException();
            }
            this.e = i + 1;
            this.f = i;
            Object obj = mapBuilder.d[i];
            b();
            return obj;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00030\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/collections/builders/MapBuilder$ValuesItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class ValuesItr<K, V> extends Itr<K, V> implements Iterator<V>, KMutableIterator {
        @Override // java.util.Iterator
        public final Object next() {
            a();
            int i = this.e;
            MapBuilder mapBuilder = this.d;
            if (i >= mapBuilder.i) {
                throw new NoSuchElementException();
            }
            this.e = i + 1;
            this.f = i;
            Object[] objArr = mapBuilder.e;
            Intrinsics.e(objArr);
            Object obj = objArr[this.f];
            b();
            return obj;
        }
    }

    static {
        MapBuilder mapBuilder = new MapBuilder(0);
        mapBuilder.p = true;
        q = mapBuilder;
    }

    public MapBuilder() {
        this(8);
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.p) {
            return new SerializedMap(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int iJ = j(obj);
            int i = this.h * 2;
            int length = this.g.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.g;
                int i3 = iArr[iJ];
                if (i3 <= 0) {
                    int i4 = this.i;
                    Object[] objArr = this.d;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.i = i5;
                        objArr[i4] = obj;
                        this.f[i4] = iJ;
                        iArr[iJ] = i5;
                        this.l++;
                        this.k++;
                        if (i2 > this.h) {
                            this.h = i2;
                        }
                        return i4;
                    }
                    g(1);
                } else {
                    if (Intrinsics.c(this.d[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        k(this.g.length * 2);
                        break;
                    }
                    iJ = iJ == 0 ? this.g.length - 1 : iJ - 1;
                }
            }
        }
    }

    public final MapBuilder b() {
        c();
        this.p = true;
        if (this.l > 0) {
            return this;
        }
        MapBuilder mapBuilder = q;
        Intrinsics.f(mapBuilder, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return mapBuilder;
    }

    public final void c() {
        if (this.p) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i = this.i - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.g[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        ListBuilderKt.b(0, this.i, this.d);
        Object[] objArr = this.e;
        if (objArr != null) {
            ListBuilderKt.b(0, this.i, objArr);
        }
        this.l = 0;
        this.i = 0;
        this.k++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public final void d(boolean z) {
        int i;
        Object[] objArr = this.e;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.i;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.f;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.d;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.g[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        ListBuilderKt.b(i3, i, this.d);
        if (objArr != null) {
            ListBuilderKt.b(i3, this.i, objArr);
        }
        this.i = i3;
    }

    public final boolean e(Collection m) {
        Intrinsics.h(m, "m");
        for (Object obj : m) {
            if (obj != null) {
                try {
                    if (!f((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        MapBuilderEntries mapBuilderEntries = this.o;
        if (mapBuilderEntries != null) {
            return mapBuilderEntries;
        }
        MapBuilderEntries mapBuilderEntries2 = new MapBuilderEntries(this);
        this.o = mapBuilderEntries2;
        return mapBuilderEntries2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.l == map.size() && e(map.entrySet());
    }

    public final boolean f(Map.Entry entry) {
        Intrinsics.h(entry, "entry");
        int iH = h(entry.getKey());
        if (iH < 0) {
            return false;
        }
        Object[] objArr = this.e;
        Intrinsics.e(objArr);
        return Intrinsics.c(objArr[iH], entry.getValue());
    }

    public final void g(int i) {
        Object[] objArrCopyOf;
        Object[] objArr = this.d;
        int length = objArr.length;
        int i2 = this.i;
        int i3 = length - i2;
        int i4 = i2 - this.l;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            d(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int iE = AbstractList.Companion.e(objArr.length, i5);
            Object[] objArr2 = this.d;
            Intrinsics.h(objArr2, "<this>");
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, iE);
            Intrinsics.g(objArrCopyOf2, "copyOf(...)");
            this.d = objArrCopyOf2;
            Object[] objArr3 = this.e;
            if (objArr3 != null) {
                objArrCopyOf = Arrays.copyOf(objArr3, iE);
                Intrinsics.g(objArrCopyOf, "copyOf(...)");
            } else {
                objArrCopyOf = null;
            }
            this.e = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.f, iE);
            Intrinsics.g(iArrCopyOf, "copyOf(...)");
            this.f = iArrCopyOf;
            int iHighestOneBit = Integer.highestOneBit((iE >= 1 ? iE : 1) * 3);
            if (iHighestOneBit > this.g.length) {
                k(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.e;
        Intrinsics.e(objArr);
        return objArr[iH];
    }

    public final int h(Object obj) {
        int iJ = j(obj);
        int i = this.h;
        while (true) {
            int i2 = this.g[iJ];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (Intrinsics.c(this.d[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iJ = iJ == 0 ? this.g.length - 1 : iJ - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        EntriesItr entriesItr = new EntriesItr(this);
        int iD = 0;
        while (entriesItr.hasNext()) {
            iD += entriesItr.d();
        }
        return iD;
    }

    public final int i(Object obj) {
        int i = this.i;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f[i] >= 0) {
                Object[] objArr = this.e;
                Intrinsics.e(objArr);
                if (Intrinsics.c(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.l == 0;
    }

    public final int j(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(int r6) {
        /*
            r5 = this;
            int r0 = r5.k
            int r0 = r0 + 1
            r5.k = r0
            int r0 = r5.i
            int r1 = r5.l
            r2 = 0
            if (r0 <= r1) goto L10
            r5.d(r2)
        L10:
            int[] r0 = new int[r6]
            r5.g = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.j = r6
        L1c:
            int r6 = r5.i
            if (r2 >= r6) goto L50
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.d
            r0 = r0[r2]
            int r0 = r5.j(r0)
            int r1 = r5.h
        L2c:
            int[] r3 = r5.g
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.f
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r6.<init>(r0)
            throw r6
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.builders.MapBuilder.k(int):void");
    }

    @Override // java.util.Map
    public final Set keySet() {
        MapBuilderKeys mapBuilderKeys = this.m;
        if (mapBuilderKeys != null) {
            return mapBuilderKeys;
        }
        MapBuilderKeys mapBuilderKeys2 = new MapBuilderKeys(this);
        this.m = mapBuilderKeys2;
        return mapBuilderKeys2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[LOOP:0: B:9:0x0024->B:33:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.d
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.h(r0, r1)
            r1 = 0
            r0[r12] = r1
            java.lang.Object[] r0 = r11.e
            if (r0 == 0) goto L10
            r0[r12] = r1
        L10:
            int[] r0 = r11.f
            r0 = r0[r12]
            int r1 = r11.h
            int r1 = r1 * 2
            int[] r2 = r11.g
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L20
            r1 = r2
        L20:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L24:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L2e
            int[] r0 = r11.g
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2f
        L2e:
            r0 = r5
        L2f:
            int r4 = r4 + 1
            int r5 = r11.h
            r6 = -1
            if (r4 <= r5) goto L3b
            int[] r0 = r11.g
            r0[r1] = r2
            goto L6c
        L3b:
            int[] r5 = r11.g
            r7 = r5[r0]
            if (r7 != 0) goto L44
            r5[r1] = r2
            goto L6c
        L44:
            if (r7 >= 0) goto L4b
            r5[r1] = r6
        L48:
            r1 = r0
            r4 = r2
            goto L65
        L4b:
            java.lang.Object[] r5 = r11.d
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.j(r5)
            int r5 = r5 - r0
            int[] r9 = r11.g
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L65
            r9[r1] = r7
            int[] r4 = r11.f
            r4[r8] = r1
            goto L48
        L65:
            int r3 = r3 + r6
            if (r3 >= 0) goto L24
            int[] r0 = r11.g
            r0[r1] = r6
        L6c:
            int[] r0 = r11.f
            r0[r12] = r6
            int r12 = r11.l
            int r12 = r12 + r6
            r11.l = r12
            int r12 = r11.k
            int r12 = r12 + 1
            r11.k = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.builders.MapBuilder.l(int):void");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int iA = a(obj);
        Object[] objArr = this.e;
        if (objArr == null) {
            int length = this.d.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.e = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i = (-iA) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        Intrinsics.h(from, "from");
        c();
        Set<Map.Entry<K, V>> setEntrySet = from.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        g(setEntrySet.size());
        for (Map.Entry<K, V> entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.e;
            if (objArr == null) {
                int length = this.d.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.e = objArr;
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!Intrinsics.c(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.e;
        Intrinsics.e(objArr);
        Object obj2 = objArr[iH];
        l(iH);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.l * 3) + 2);
        sb.append("{");
        EntriesItr entriesItr = new EntriesItr(this);
        int i = 0;
        while (entriesItr.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            entriesItr.c(sb);
            i++;
        }
        sb.append("}");
        String string = sb.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        MapBuilderValues mapBuilderValues = this.n;
        if (mapBuilderValues != null) {
            return mapBuilderValues;
        }
        MapBuilderValues mapBuilderValues2 = new MapBuilderValues(this);
        this.n = mapBuilderValues2;
        return mapBuilderValues2;
    }

    public MapBuilder(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.d = objArr;
        this.e = null;
        this.f = iArr;
        this.g = new int[iHighestOneBit];
        this.h = 2;
        this.i = 0;
        this.j = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
