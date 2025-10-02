package kotlin.reflect.jvm.internal.impl.protobuf;

import YU.a;
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
import kotlin.reflect.jvm.internal.impl.protobuf.FieldSet;

/* loaded from: classes.dex */
class SmallSortedMap<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public static final /* synthetic */ int i = 0;
    public final int d;
    public List e = Collections.EMPTY_LIST;
    public Map f = Collections.EMPTY_MAP;
    public boolean g;
    public volatile EntrySet h;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap$1, reason: invalid class name */
    final class AnonymousClass1 extends SmallSortedMap<FieldSet.FieldDescriptorLite<Object>, Object> {
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap
        public final void e() {
            if (!this.g) {
                for (int i = 0; i < this.e.size(); i++) {
                    Map.Entry entry = (Map.Entry) this.e.get(i);
                    if (((FieldSet.FieldDescriptorLite) entry.getKey()).j()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
                for (Map.Entry entry2 : c()) {
                    if (((FieldSet.FieldDescriptorLite) entry2.getKey()).j()) {
                        entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                    }
                }
            }
            super.e();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return put((FieldSet.FieldDescriptorLite) obj, obj2);
        }
    }

    public static class EmptySet {

        /* renamed from: a, reason: collision with root package name */
        public static final Iterator f24517a = new AnonymousClass1();
        public static final Iterable b = new AnonymousClass2();

        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap$EmptySet$1, reason: invalid class name */
        public static class AnonymousClass1 implements Iterator<Object> {
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

        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap$EmptySet$2, reason: invalid class name */
        public static class AnonymousClass2 implements Iterable<Object> {
            @Override // java.lang.Iterable
            public final Iterator<Object> iterator() {
                return EmptySet.f24517a;
            }
        }
    }

    public class Entry implements Comparable<SmallSortedMap<K, V>.Entry>, Map.Entry<K, V> {
        public final Comparable d;
        public Object e;

        public Entry(Comparable comparable, Object obj) {
            this.d = comparable;
            this.e = obj;
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
            int i = SmallSortedMap.i;
            SmallSortedMap.this.b();
            Object obj2 = this.e;
            this.e = obj;
            return obj2;
        }

        public final String toString() {
            String strValueOf = String.valueOf(this.d);
            String strValueOf2 = String.valueOf(this.e);
            return a.p(new StringBuilder(strValueOf2.length() + strValueOf.length() + 1), strValueOf, "=", strValueOf2);
        }
    }

    /* loaded from: classes7.dex */
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
            return this.d + 1 < SmallSortedMap.this.e.size() || a().hasNext();
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
            int i = SmallSortedMap.i;
            SmallSortedMap smallSortedMap = SmallSortedMap.this;
            smallSortedMap.b();
            if (this.d >= smallSortedMap.e.size()) {
                a().remove();
                return;
            }
            int i2 = this.d;
            this.d = i2 - 1;
            smallSortedMap.g(i2);
        }
    }

    /* loaded from: classes7.dex */
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
        public final Iterator iterator() {
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

    public SmallSortedMap(int i2) {
        this.d = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
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
            if (r1 < 0) goto L21
            java.util.List r2 = r4.e
            java.lang.Object r2 = r2.get(r1)
            kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap$Entry r2 = (kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.Entry) r2
            java.lang.Comparable r2 = r2.d
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L1e
            int r0 = r0 + 1
        L1c:
            int r5 = -r0
            return r5
        L1e:
            if (r2 != 0) goto L21
            return r1
        L21:
            r0 = 0
        L22:
            if (r0 > r1) goto L43
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.e
            java.lang.Object r3 = r3.get(r2)
            kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap$Entry r3 = (kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.Entry) r3
            java.lang.Comparable r3 = r3.d
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L3c
            int r2 = r2 + (-1)
            r1 = r2
            goto L22
        L3c:
            if (r3 <= 0) goto L42
            int r2 = r2 + 1
            r0 = r2
            goto L22
        L42:
            return r2
        L43:
            int r0 = r0 + 1
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.a(java.lang.Comparable):int");
    }

    public final void b() {
        if (this.g) {
            throw new UnsupportedOperationException();
        }
    }

    public final Iterable c() {
        return this.f.isEmpty() ? EmptySet.b : this.f.entrySet();
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

    public final SortedMap d() {
        b();
        if (this.f.isEmpty() && !(this.f instanceof TreeMap)) {
            this.f = new TreeMap();
        }
        return (SortedMap) this.f;
    }

    public void e() {
        if (this.g) {
            return;
        }
        this.f = this.f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f);
        this.g = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.h == null) {
            this.h = new EntrySet();
        }
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((Entry) this.e.get(iA)).setValue(obj);
        }
        b();
        boolean zIsEmpty = this.e.isEmpty();
        int i2 = this.d;
        if (zIsEmpty && !(this.e instanceof ArrayList)) {
            this.e = new ArrayList(i2);
        }
        int i3 = -(iA + 1);
        if (i3 >= i2) {
            return d().put(comparable, obj);
        }
        if (this.e.size() == i2) {
            Entry entry = (Entry) this.e.remove(i2 - 1);
            d().put(entry.d, entry.e);
        }
        this.e.add(i3, new Entry(comparable, obj));
        return null;
    }

    public final Object g(int i2) {
        b();
        Object obj = ((Entry) this.e.remove(i2)).e;
        if (!this.f.isEmpty()) {
            Iterator it = d().entrySet().iterator();
            List list = this.e;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new Entry((Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((Entry) this.e.get(iA)).e : this.f.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return g(iA);
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
