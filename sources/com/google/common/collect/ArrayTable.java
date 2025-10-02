package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import com.google.common.collect.Tables;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class ArrayTable<R, C, V> extends AbstractTable<R, C, V> implements Serializable {

    /* renamed from: com.google.common.collect.ArrayTable$1, reason: invalid class name */
    class AnonymousClass1 extends AbstractIndexedListIterator<Table.Cell<Object, Object, Object>> {
        @Override // com.google.common.collect.AbstractIndexedListIterator
        public final Object a(int i) {
            throw null;
        }
    }

    /* renamed from: com.google.common.collect.ArrayTable$2, reason: invalid class name */
    class AnonymousClass2 extends Tables.AbstractCell<Object, Object, Object> {
        @Override // com.google.common.collect.Table.Cell
        public final Object a() {
            throw null;
        }

        @Override // com.google.common.collect.Table.Cell
        public final Object b() {
            throw null;
        }

        @Override // com.google.common.collect.Table.Cell
        public final Object getValue() {
            throw null;
        }
    }

    /* renamed from: com.google.common.collect.ArrayTable$3, reason: invalid class name */
    class AnonymousClass3 extends AbstractIndexedListIterator<Object> {
        @Override // com.google.common.collect.AbstractIndexedListIterator
        public final Object a(int i) {
            throw null;
        }
    }

    public static abstract class ArrayMap<K, V> extends Maps.IteratorBasedAbstractMap<K, V> {

        /* renamed from: com.google.common.collect.ArrayTable$ArrayMap$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractMapEntry<Object, Object> {
            @Override // java.util.Map.Entry
            public final Object getKey() {
                throw null;
            }

            @Override // java.util.Map.Entry
            public final Object getValue() {
                throw null;
            }

            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
            public final Object setValue(Object obj) {
                throw null;
            }
        }

        /* renamed from: com.google.common.collect.ArrayTable$ArrayMap$2, reason: invalid class name */
        class AnonymousClass2 extends AbstractIndexedListIterator<Map.Entry<Object, Object>> {
            @Override // com.google.common.collect.AbstractIndexedListIterator
            public final Object a(int i) {
                throw null;
            }
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public final Iterator a() {
            throw null;
        }

        public final Object b(int i) {
            throw null;
        }

        public abstract Object c(int i);

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            throw null;
        }

        public abstract Object d(Object obj);

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean isEmpty() {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object put(Object obj, Object obj2) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            throw null;
        }
    }

    public class Column extends ArrayMap<R, V> {
        public Column(int i) {
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public final Object c(int i) {
            ArrayTable.this.getClass();
            throw null;
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public final Object d(Object obj) {
            throw null;
        }
    }

    public class ColumnMap extends ArrayMap<C, Map<R, V>> {
        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public final Object c(int i) {
            return new Column(i);
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public final Object d(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap, java.util.AbstractMap, java.util.Map
        public final Object put(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }
    }

    public class Row extends ArrayMap<C, V> {
        public Row(int i) {
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public final Object c(int i) {
            ArrayTable.this.getClass();
            throw null;
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public final Object d(Object obj) {
            throw null;
        }
    }

    public class RowMap extends ArrayMap<R, Map<C, V>> {
        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public final Object c(int i) {
            return new Row(i);
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public final Object d(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap, java.util.AbstractMap, java.util.Map
        public final Object put(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.common.collect.AbstractTable
    public final Iterator a() {
        throw null;
    }

    @Override // com.google.common.collect.AbstractTable
    public final void b() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractTable
    public final boolean c(Object obj) {
        throw null;
    }

    @Override // com.google.common.collect.Table
    public final Map d() {
        return null;
    }

    @Override // com.google.common.collect.AbstractTable
    public final Iterator h() {
        throw null;
    }

    @Override // com.google.common.collect.Table
    public final int size() {
        throw null;
    }
}
