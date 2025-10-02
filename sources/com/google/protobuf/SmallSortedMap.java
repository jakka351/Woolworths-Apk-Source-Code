package com.google.protobuf;

import com.google.protobuf.FieldSet;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
class SmallSortedMap<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public static final /* synthetic */ int k = 0;
    public final int d;
    public List e = Collections.EMPTY_LIST;
    public Map f;
    public boolean g;
    public volatile EntrySet h;
    public Map i;
    public volatile DescendingEntrySet j;

    /* renamed from: com.google.protobuf.SmallSortedMap$1, reason: invalid class name */
    class AnonymousClass1 extends SmallSortedMap<FieldSet.FieldDescriptorLite<Object>, Object> {
        @Override // com.google.protobuf.SmallSortedMap
        public final void f() {
            if (!this.g) {
                for (int i = 0; i < this.e.size(); i++) {
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

        @Override // com.google.protobuf.SmallSortedMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return put((Comparable) obj, obj2);
        }
    }

    /* loaded from: classes6.dex */
    public class DescendingEntryIterator implements Iterator<Map.Entry<K, V>> {
        public int d;
        public Iterator e;

        public DescendingEntryIterator() {
            this.d = SmallSortedMap.this.e.size();
        }

        public final Iterator a() {
            if (this.e == null) {
                this.e = SmallSortedMap.this.i.entrySet().iterator();
            }
            return this.e;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.d;
            return (i > 0 && i <= SmallSortedMap.this.e.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (a().hasNext()) {
                return (Map.Entry) a().next();
            }
            List list = SmallSortedMap.this.e;
            int i = this.d - 1;
            this.d = i;
            return (Map.Entry) list.get(i);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes6.dex */
    public class DescendingEntrySet extends SmallSortedMap<K, V>.EntrySet {
        public DescendingEntrySet() {
            super();
        }

        @Override // com.google.protobuf.SmallSortedMap.EntrySet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new DescendingEntryIterator();
        }
    }

    public static class EmptySet {

        /* renamed from: a, reason: collision with root package name */
        public static final Iterator f16081a = new AnonymousClass1();
        public static final Iterable b = new AnonymousClass2();

        /* renamed from: com.google.protobuf.SmallSortedMap$EmptySet$1, reason: invalid class name */
        public class AnonymousClass1 implements Iterator<Object> {
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public final Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: com.google.protobuf.SmallSortedMap$EmptySet$2, reason: invalid class name */
        public class AnonymousClass2 implements Iterable<Object> {
            @Override // java.lang.Iterable
            public final Iterator<Object> iterator() {
                return EmptySet.f16081a;
            }
        }
    }

    /* loaded from: classes6.dex */
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
            int i = SmallSortedMap.k;
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

    /* loaded from: classes6.dex */
    public class EntryIterator implements Iterator<Map.Entry<K, V>> {
        public int d = -1;
        public boolean e;
        public Iterator f;

        public EntryIterator() {
        }

        public final Iterator a() {
            if (this.f == null) {
                this.f = SmallSortedMap.this.f.entrySet().iterator();
            }
            return this.f;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.d + 1;
            SmallSortedMap smallSortedMap = SmallSortedMap.this;
            return i < smallSortedMap.e.size() || (!smallSortedMap.f.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.e = true;
            int i = this.d + 1;
            this.d = i;
            SmallSortedMap smallSortedMap = SmallSortedMap.this;
            return i < smallSortedMap.e.size() ? (Map.Entry) smallSortedMap.e.get(this.d) : (Map.Entry) a().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.e) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.e = false;
            int i = SmallSortedMap.k;
            SmallSortedMap smallSortedMap = SmallSortedMap.this;
            smallSortedMap.b();
            if (this.d >= smallSortedMap.e.size()) {
                a().remove();
                return;
            }
            int i2 = this.d;
            this.d = i2 - 1;
            smallSortedMap.h(i2);
        }
    }

    /* loaded from: classes6.dex */
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

    public SmallSortedMap(int i) {
        this.d = i;
        Map map = Collections.EMPTY_MAP;
        this.f = map;
        this.i = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.e
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L23
            java.util.List r2 = r4.e
            java.lang.Object r2 = r2.get(r1)
            com.google.protobuf.SmallSortedMap$Entry r2 = (com.google.protobuf.SmallSortedMap.Entry) r2
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
            java.util.List r3 = r4.e
            java.lang.Object r3 = r3.get(r2)
            com.google.protobuf.SmallSortedMap$Entry r3 = (com.google.protobuf.SmallSortedMap.Entry) r3
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.SmallSortedMap.a(java.lang.Comparable):int");
    }

    public final void b() {
        if (this.g) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i) {
        return (Map.Entry) this.e.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.e.isEmpty()) {
            this.e.clear();
        }
        if (this.f.isEmpty()) {
            return;
        }
        this.f.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f.containsKey(comparable);
    }

    public final Iterable d() {
        return this.f.isEmpty() ? EmptySet.b : this.f.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f.isEmpty() && !(this.f instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f = treeMap;
            this.i = treeMap.descendingMap();
        }
        return (SortedMap) this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.h == null) {
            this.h = new EntrySet();
        }
        return this.h;
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
            int size2 = this.e.size();
            if (size2 != smallSortedMap.e.size()) {
                return ((AbstractSet) entrySet()).equals(smallSortedMap.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (c(i).equals(smallSortedMap.c(i))) {
                }
            }
            if (size2 != size) {
                return this.f.equals(smallSortedMap.f);
            }
            return true;
        }
        return false;
    }

    public void f() {
        if (this.g) {
            return;
        }
        this.f = this.f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f);
        this.i = this.i.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.i);
        this.g = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((Entry) this.e.get(iA)).setValue(obj);
        }
        b();
        boolean zIsEmpty = this.e.isEmpty();
        int i = this.d;
        if (zIsEmpty && !(this.e instanceof ArrayList)) {
            this.e = new ArrayList(i);
        }
        int i2 = -(iA + 1);
        if (i2 >= i) {
            return e().put(comparable, obj);
        }
        if (this.e.size() == i) {
            Entry entry = (Entry) this.e.remove(i - 1);
            e().put(entry.a(), entry.getValue());
        }
        this.e.add(i2, new Entry(comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((Entry) this.e.get(iA)).getValue() : this.f.get(comparable);
    }

    public final Object h(int i) {
        b();
        Object value = ((Entry) this.e.remove(i)).getValue();
        if (!this.f.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            this.e.add(new Entry(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.e.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((Entry) this.e.get(i)).hashCode();
        }
        return this.f.size() > 0 ? this.f.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return h(iA);
        }
        if (this.f.isEmpty()) {
            return null;
        }
        return this.f.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f.size() + this.e.size();
    }
}
