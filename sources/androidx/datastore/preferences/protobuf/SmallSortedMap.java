package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.FieldSet;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
class SmallSortedMap<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public static final /* synthetic */ int j = 0;
    public List d;
    public Map e;
    public boolean f;
    public volatile EntrySet g;
    public Map h;
    public volatile DescendingEntrySet i;

    /* renamed from: androidx.datastore.preferences.protobuf.SmallSortedMap$1, reason: invalid class name */
    class AnonymousClass1 extends SmallSortedMap<FieldSet.FieldDescriptorLite<Object>, Object> {
        @Override // androidx.datastore.preferences.protobuf.SmallSortedMap
        public final void f() {
            if (!this.f) {
                for (int i = 0; i < this.d.size(); i++) {
                    Map.Entry entryC = c(i);
                    if (((FieldSet.FieldDescriptorLite) entryC.getKey()).j()) {
                        entryC.setValue(Collections.unmodifiableList((List) entryC.getValue()));
                    }
                }
                for (Map.Entry entry : d()) {
                    if (((FieldSet.FieldDescriptorLite) entry.getKey()).j()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.f();
        }

        @Override // androidx.datastore.preferences.protobuf.SmallSortedMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return put((Comparable) obj, obj2);
        }
    }

    /* loaded from: classes2.dex */
    public class DescendingEntryIterator implements Iterator<Map.Entry<K, V>> {
        public int d;
        public Iterator e;

        public DescendingEntryIterator() {
            this.d = SmallSortedMap.this.d.size();
        }

        public final Iterator a() {
            if (this.e == null) {
                this.e = SmallSortedMap.this.h.entrySet().iterator();
            }
            return this.e;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.d;
            return (i > 0 && i <= SmallSortedMap.this.d.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (a().hasNext()) {
                return (Map.Entry) a().next();
            }
            List list = SmallSortedMap.this.d;
            int i = this.d - 1;
            this.d = i;
            return (Map.Entry) list.get(i);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes2.dex */
    public class DescendingEntrySet extends SmallSortedMap<K, V>.EntrySet {
        public DescendingEntrySet() {
            super();
        }

        @Override // androidx.datastore.preferences.protobuf.SmallSortedMap.EntrySet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new DescendingEntryIterator();
        }
    }

    /* loaded from: classes2.dex */
    public class Entry implements Map.Entry<K, V>, Comparable<SmallSortedMap<K, V>.Entry> {
        public final Comparable d;
        public Object e;

        public Entry(SmallSortedMap smallSortedMap, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        public final Comparable a() {
            return this.d;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.d.compareTo(((Entry) obj).d);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj != this) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    Comparable comparable = this.d;
                    if (comparable == null ? key == null : comparable.equals(key)) {
                        Object obj2 = this.e;
                        Object value = entry.getValue();
                        if (obj2 == null ? value == null : obj2.equals(value)) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.d;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.e;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            Comparable comparable = this.d;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.e;
            return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            int i = SmallSortedMap.j;
            SmallSortedMap.this.b();
            Object obj2 = this.e;
            this.e = obj;
            return obj2;
        }

        public final String toString() {
            return this.d + "=" + this.e;
        }

        public Entry(Comparable comparable, Object obj) {
            this.d = comparable;
            this.e = obj;
        }
    }

    /* loaded from: classes2.dex */
    public class EntryIterator implements Iterator<Map.Entry<K, V>> {
        public int d = -1;
        public boolean e;
        public Iterator f;

        public EntryIterator() {
        }

        public final Iterator a() {
            if (this.f == null) {
                this.f = SmallSortedMap.this.e.entrySet().iterator();
            }
            return this.f;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.d + 1;
            SmallSortedMap smallSortedMap = SmallSortedMap.this;
            return i < smallSortedMap.d.size() || (!smallSortedMap.e.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.e = true;
            int i = this.d + 1;
            this.d = i;
            SmallSortedMap smallSortedMap = SmallSortedMap.this;
            return i < smallSortedMap.d.size() ? (Map.Entry) smallSortedMap.d.get(this.d) : (Map.Entry) a().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.e) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.e = false;
            int i = SmallSortedMap.j;
            SmallSortedMap smallSortedMap = SmallSortedMap.this;
            smallSortedMap.b();
            if (this.d >= smallSortedMap.d.size()) {
                a().remove();
                return;
            }
            int i2 = this.d;
            this.d = i2 - 1;
            smallSortedMap.i(i2);
        }
    }

    /* loaded from: classes2.dex */
    public class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        public EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            SmallSortedMap.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            SmallSortedMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = SmallSortedMap.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new EntryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            SmallSortedMap.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return SmallSortedMap.this.size();
        }
    }

    public static AnonymousClass1 g() {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        anonymousClass1.d = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        anonymousClass1.e = map;
        anonymousClass1.h = map;
        return anonymousClass1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.d
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L23
            java.util.List r2 = r4.d
            java.lang.Object r2 = r2.get(r1)
            androidx.datastore.preferences.protobuf.SmallSortedMap$Entry r2 = (androidx.datastore.preferences.protobuf.SmallSortedMap.Entry) r2
            java.lang.Comparable r2 = r2.a()
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L20
            int r0 = r0 + 1
        L1e:
            int r5 = -r0
            return r5
        L20:
            if (r2 != 0) goto L23
            return r1
        L23:
            r0 = 0
        L24:
            if (r0 > r1) goto L47
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.d
            java.lang.Object r3 = r3.get(r2)
            androidx.datastore.preferences.protobuf.SmallSortedMap$Entry r3 = (androidx.datastore.preferences.protobuf.SmallSortedMap.Entry) r3
            java.lang.Comparable r3 = r3.a()
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L40
            int r2 = r2 + (-1)
            r1 = r2
            goto L24
        L40:
            if (r3 <= 0) goto L46
            int r2 = r2 + 1
            r0 = r2
            goto L24
        L46:
            return r2
        L47:
            int r0 = r0 + 1
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.SmallSortedMap.a(java.lang.Comparable):int");
    }

    public final void b() {
        if (this.f) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i) {
        return (Map.Entry) this.d.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.d.isEmpty()) {
            this.d.clear();
        }
        if (this.e.isEmpty()) {
            return;
        }
        this.e.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.e.containsKey(comparable);
    }

    public final Set d() {
        return this.e.isEmpty() ? Collections.EMPTY_SET : this.e.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.e.isEmpty() && !(this.e instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.e = treeMap;
            this.h = treeMap.descendingMap();
        }
        return (SortedMap) this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.g == null) {
            this.g = new EntrySet();
        }
        return this.g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmallSortedMap)) {
            return super.equals(obj);
        }
        SmallSortedMap smallSortedMap = (SmallSortedMap) obj;
        int size = size();
        if (size == smallSortedMap.size()) {
            int size2 = this.d.size();
            if (size2 != smallSortedMap.d.size()) {
                return ((AbstractSet) entrySet()).equals(smallSortedMap.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (c(i).equals(smallSortedMap.c(i))) {
                }
            }
            if (size2 != size) {
                return this.e.equals(smallSortedMap.e);
            }
            return true;
        }
        return false;
    }

    public void f() {
        if (this.f) {
            return;
        }
        this.e = this.e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.e);
        this.h = this.h.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.h);
        this.f = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((Entry) this.d.get(iA)).getValue() : this.e.get(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((Entry) this.d.get(iA)).setValue(obj);
        }
        b();
        if (this.d.isEmpty() && !(this.d instanceof ArrayList)) {
            this.d = new ArrayList(16);
        }
        int i = -(iA + 1);
        if (i >= 16) {
            return e().put(comparable, obj);
        }
        if (this.d.size() == 16) {
            Entry entry = (Entry) this.d.remove(15);
            e().put(entry.a(), entry.getValue());
        }
        this.d.add(i, new Entry(comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.d.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((Entry) this.d.get(i)).hashCode();
        }
        return this.e.size() > 0 ? this.e.hashCode() + iHashCode : iHashCode;
    }

    public final Object i(int i) {
        b();
        Object value = ((Entry) this.d.remove(i)).getValue();
        if (!this.e.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            this.d.add(new Entry(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return i(iA);
        }
        if (this.e.isEmpty()) {
            return null;
        }
        return this.e.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.e.size() + this.d.size();
    }
}
