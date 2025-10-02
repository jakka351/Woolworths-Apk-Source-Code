package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.Table;
import com.google.common.collect.Tables;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
class StandardTable<R, C, V> extends AbstractTable<R, C, V> implements Serializable {
    public transient Set f;
    public transient Map g;

    public class CellIterator implements Iterator<Table.Cell<R, C, V>> {
        public Map.Entry d;
        public Iterator e;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            throw null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!this.e.hasNext()) {
                throw null;
            }
            Objects.requireNonNull(this.d);
            Map.Entry entry = (Map.Entry) this.e.next();
            return new Tables.ImmutableCell(this.d.getKey(), entry.getKey(), entry.getValue());
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.e.remove();
            Map.Entry entry = this.d;
            Objects.requireNonNull(entry);
            if (((Map) entry.getValue()).isEmpty()) {
                throw null;
            }
        }
    }

    public class Column extends Maps.ViewCachingAbstractMap<R, V> {
        public final Object g;

        public class EntrySet extends Sets.ImprovedAbstractSet<Map.Entry<R, V>> {
            public EntrySet() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final void clear() {
                throw null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Column column = Column.this;
                    StandardTable standardTable = StandardTable.this;
                    Object key = entry.getKey();
                    Object obj2 = column.g;
                    Object value = entry.getValue();
                    if (value != null && value.equals(standardTable.p(key, obj2))) {
                        return true;
                    }
                }
                return false;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean isEmpty() {
                Column column = Column.this;
                return !StandardTable.this.l(column.g);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                Column.this.new EntrySetIterator();
                throw null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Column column = Column.this;
                    StandardTable standardTable = StandardTable.this;
                    Object key = entry.getKey();
                    Object obj2 = column.g;
                    Object value = entry.getValue();
                    if (value != null && value.equals(standardTable.p(key, obj2))) {
                        standardTable.r(key, obj2);
                        return true;
                    }
                }
                return false;
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean retainAll(Collection collection) {
                Predicates.e(collection);
                throw null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                throw null;
            }
        }

        public class EntrySetIterator extends AbstractIterator<Map.Entry<R, V>> {

            /* renamed from: com.google.common.collect.StandardTable$Column$EntrySetIterator$1EntryImpl, reason: invalid class name */
            class C1EntryImpl extends AbstractMapEntry<Object, Object> {
                public final /* synthetic */ Map.Entry d;
                public final /* synthetic */ EntrySetIterator e;

                public C1EntryImpl(EntrySetIterator entrySetIterator, Map.Entry entry) {
                    this.d = entry;
                    this.e = entrySetIterator;
                }

                @Override // java.util.Map.Entry
                public final Object getKey() {
                    return this.d.getKey();
                }

                @Override // java.util.Map.Entry
                public final Object getValue() {
                    return ((Map) this.d.getValue()).get(Column.this.g);
                }

                @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                public final Object setValue(Object obj) {
                    Map map = (Map) this.d.getValue();
                    Object obj2 = Column.this.g;
                    obj.getClass();
                    return map.put(obj2, obj);
                }
            }

            public EntrySetIterator() {
                throw null;
            }

            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        public class KeySet extends Maps.KeySet<R, V> {
            public KeySet() {
                super(Column.this);
            }

            @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                Column column = Column.this;
                return StandardTable.this.k(obj, column.g);
            }

            @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                Column column = Column.this;
                return StandardTable.this.r(obj, column.g) != null;
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean retainAll(Collection collection) {
                Predicates.c(Predicates.g(Predicates.e(collection)), Maps.EntryFunction.d);
                throw null;
            }
        }

        public class Values extends Maps.Values<R, V> {
            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public final boolean remove(Object obj) {
                if (obj == null) {
                    return false;
                }
                Predicates.c(Predicates.d(obj), Maps.EntryFunction.e);
                throw null;
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public final boolean removeAll(Collection collection) {
                Predicates.c(Predicates.e(collection), Maps.EntryFunction.e);
                throw null;
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public final boolean retainAll(Collection collection) {
                Predicates.c(Predicates.g(Predicates.e(collection)), Maps.EntryFunction.e);
                throw null;
            }
        }

        public Column(Object obj) {
            obj.getClass();
            this.g = obj;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set a() {
            return new EntrySet();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set b() {
            return new KeySet();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Collection c() {
            return new Values(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            return StandardTable.this.k(obj, this.g);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            return StandardTable.this.p(obj, this.g);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object put(Object obj, Object obj2) {
            return StandardTable.this.q(obj, this.g, obj2);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            return StandardTable.this.r(obj, this.g);
        }
    }

    public class ColumnKeyIterator extends AbstractIterator<C> {
        @Override // com.google.common.collect.AbstractIterator
        public final Object a() {
            throw null;
        }
    }

    public class ColumnKeySet extends StandardTable<R, C, V>.TableSet<C> {
        public ColumnKeySet() {
            super(StandardTable.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return StandardTable.this.l(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return StandardTable.this.n();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            if (obj == null) {
                return false;
            }
            throw null;
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            collection.getClass();
            throw null;
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            collection.getClass();
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return Iterators.l(StandardTable.this.n());
        }
    }

    public class ColumnMap extends Maps.ViewCachingAbstractMap<C, Map<R, V>> {

        public final class ColumnMapEntrySet extends StandardTable<R, C, V>.TableSet<Map.Entry<C, Map<R, V>>> {

            /* renamed from: com.google.common.collect.StandardTable$ColumnMap$ColumnMapEntrySet$1, reason: invalid class name */
            class AnonymousClass1 implements Function<Object, Map<Object, Object>> {
                public AnonymousClass1() {
                }

                @Override // com.google.common.base.Function
                public final Map<Object, Object> apply(Object obj) {
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ColumnMapEntrySet() {
                super(null);
                ColumnMap.this.getClass();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                ((Map.Entry) obj).getKey();
                throw null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                throw null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                if (!contains(obj) || !(obj instanceof Map.Entry)) {
                    return false;
                }
                ((Map.Entry) obj).getKey();
                new LinkedHashMap();
                throw null;
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean removeAll(Collection collection) {
                collection.getClass();
                return Sets.h(this, collection.iterator());
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean retainAll(Collection collection) {
                collection.getClass();
                throw null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                throw null;
            }
        }

        public class ColumnMapValues extends Maps.Values<C, Map<R, V>> {
            public ColumnMapValues() {
                super(ColumnMap.this);
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public final boolean remove(Object obj) {
                for (Map.Entry entry : ColumnMap.this.entrySet()) {
                    if (((Map) entry.getValue()).equals(obj)) {
                        entry.getKey();
                        new LinkedHashMap();
                        throw null;
                    }
                }
                return false;
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public final boolean removeAll(Collection collection) {
                collection.getClass();
                throw null;
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public final boolean retainAll(Collection collection) {
                collection.getClass();
                throw null;
            }
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set a() {
            return new ColumnMapEntrySet();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Collection c() {
            return new ColumnMapValues();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            throw null;
        }
    }

    public class Row extends Maps.IteratorBasedAbstractMap<C, V> {
        public final Object d;
        public Map e;

        public Row(Object obj) {
            obj.getClass();
            this.d = obj;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public final Iterator a() {
            d();
            Map map = this.e;
            if (map == null) {
                return Iterators.EmptyModifiableIterator.d;
            }
            final Iterator it = map.entrySet().iterator();
            return new Iterator<Map.Entry<Object, Object>>(this) { // from class: com.google.common.collect.StandardTable.Row.1
                public final /* synthetic */ Row e;

                {
                    this.e = this;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                public final Map.Entry<Object, Object> next() {
                    final Map.Entry entry = (Map.Entry) it.next();
                    return new ForwardingMapEntry<Object, Object>() { // from class: com.google.common.collect.StandardTable.Row.2
                        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
                        public final Object P1() {
                            return entry;
                        }

                        @Override // com.google.common.collect.ForwardingMapEntry
                        /* renamed from: R1 */
                        public final Map.Entry P1() {
                            return entry;
                        }

                        @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                        public final boolean equals(Object obj) {
                            if (!(obj instanceof Map.Entry)) {
                                return false;
                            }
                            Map.Entry entry2 = (Map.Entry) obj;
                            return com.google.common.base.Objects.a(getKey(), entry2.getKey()) && com.google.common.base.Objects.a(getValue(), entry2.getValue());
                        }

                        @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                        public final Object setValue(Object obj) {
                            obj.getClass();
                            return super.setValue(obj);
                        }
                    };
                }

                @Override // java.util.Iterator
                public final void remove() {
                    it.remove();
                    this.e.c();
                }
            };
        }

        public Map b() {
            throw null;
        }

        public void c() {
            d();
            Map map = this.e;
            if (map != null && map.isEmpty()) {
                throw null;
            }
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public final void clear() {
            d();
            Map map = this.e;
            if (map != null) {
                map.clear();
            }
            c();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            Map map;
            boolean zContainsKey;
            d();
            if (obj != null && (map = this.e) != null) {
                try {
                    zContainsKey = map.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    zContainsKey = false;
                }
                if (zContainsKey) {
                    return true;
                }
            }
            return false;
        }

        public final void d() {
            Map map = this.e;
            if (map == null) {
                this.e = b();
            } else if (map.isEmpty()) {
                throw null;
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            Map map;
            d();
            if (obj == null || (map = this.e) == null) {
                return null;
            }
            return Maps.h(obj, map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object put(Object obj, Object obj2) {
            obj.getClass();
            obj2.getClass();
            Map map = this.e;
            return (map == null || map.isEmpty()) ? StandardTable.this.q(this.d, obj, obj2) : this.e.put(obj, obj2);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            d();
            Map map = this.e;
            Object objRemove = null;
            if (map == null) {
                return null;
            }
            try {
                objRemove = map.remove(obj);
            } catch (ClassCastException | NullPointerException unused) {
            }
            c();
            return objRemove;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            d();
            Map map = this.e;
            if (map == null) {
                return 0;
            }
            return map.size();
        }
    }

    public class RowMap extends Maps.ViewCachingAbstractMap<R, Map<C, V>> {

        public final class EntrySet extends StandardTable<R, C, V>.TableSet<Map.Entry<R, Map<C, V>>> {

            /* renamed from: com.google.common.collect.StandardTable$RowMap$EntrySet$1, reason: invalid class name */
            class AnonymousClass1 implements Function<Object, Map<Object, Object>> {
                @Override // com.google.common.base.Function
                public final Map<Object, Object> apply(Object obj) {
                    throw null;
                }
            }

            public EntrySet() {
                super(StandardTable.this);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getKey() == null || !(entry.getValue() instanceof Map)) {
                    return false;
                }
                throw null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                throw null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getKey() == null || !(entry.getValue() instanceof Map)) {
                    return false;
                }
                throw null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                throw null;
            }
        }

        public RowMap() {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set a() {
            return new EntrySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            return StandardTable.this.m(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            StandardTable standardTable = StandardTable.this;
            if (!standardTable.m(obj)) {
                return null;
            }
            Objects.requireNonNull(obj);
            return standardTable.s(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            if (obj == null) {
                return null;
            }
            throw null;
        }
    }

    public abstract class TableSet<T> extends Sets.ImprovedAbstractSet<T> {
        public TableSet(StandardTable standardTable) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            throw null;
        }
    }

    @Override // com.google.common.collect.AbstractTable
    public final Iterator a() {
        throw null;
    }

    @Override // com.google.common.collect.AbstractTable
    public void b() {
        throw null;
    }

    @Override // com.google.common.collect.AbstractTable
    public boolean c(Object obj) {
        return obj != null && super.c(obj);
    }

    @Override // com.google.common.collect.Table
    public Map d() {
        Map map = this.g;
        if (map != null) {
            return map;
        }
        Map mapO = o();
        this.g = mapO;
        return mapO;
    }

    public Map i(Object obj) {
        return new Column(obj);
    }

    public Set j() {
        Set set = this.f;
        if (set != null) {
            return set;
        }
        ColumnKeySet columnKeySet = new ColumnKeySet();
        this.f = columnKeySet;
        return columnKeySet;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean k(java.lang.Object r3, java.lang.Object r4) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L20
            if (r4 == 0) goto L20
            java.util.Map r1 = r2.d()
            java.lang.Object r3 = com.google.common.collect.Maps.h(r3, r1)
            java.util.Map r3 = (java.util.Map) r3
            r1 = 1
            if (r3 == 0) goto L1c
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L17
            goto L18
        L17:
            r3 = r0
        L18:
            if (r3 == 0) goto L1c
            r3 = r1
            goto L1d
        L1c:
            r3 = r0
        L1d:
            if (r3 == 0) goto L20
            r0 = r1
        L20:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.StandardTable.k(java.lang.Object, java.lang.Object):boolean");
    }

    public boolean l(Object obj) {
        if (obj == null) {
            return false;
        }
        throw null;
    }

    public boolean m(Object obj) {
        if (obj == null) {
            return false;
        }
        throw null;
    }

    public Iterator n() {
        throw null;
    }

    public Map o() {
        return new RowMap();
    }

    public Object p(Object obj, Object obj2) {
        Map map;
        if (obj != null && obj2 != null && (map = (Map) Maps.h(obj, d())) != null) {
            try {
                return map.get(obj2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return null;
    }

    public Object q(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj2.getClass();
        obj3.getClass();
        throw null;
    }

    public Object r(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return null;
        }
        Maps.h(obj, null);
        throw null;
    }

    public Map s(Object obj) {
        return new Row(obj);
    }

    @Override // com.google.common.collect.Table
    public int size() {
        throw null;
    }
}
