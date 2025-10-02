package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
class StandardRowSortedTable<R, C, V> extends StandardTable<R, C, V> implements RowSortedTable<R, C, V> {

    public class RowSortedMap extends StandardTable<R, C, V>.RowMap implements SortedMap<R, Map<C, V>> {
        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set b() {
            return new Maps.SortedKeySet(this);
        }

        @Override // java.util.SortedMap
        public final Comparator comparator() {
            throw null;
        }

        @Override // java.util.SortedMap
        public final Object firstKey() {
            throw null;
        }

        @Override // java.util.SortedMap
        public final SortedMap headMap(Object obj) {
            obj.getClass();
            throw null;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            return (SortedSet) super.keySet();
        }

        @Override // java.util.SortedMap
        public final Object lastKey() {
            throw null;
        }

        @Override // java.util.SortedMap
        public final SortedMap subMap(Object obj, Object obj2) {
            obj.getClass();
            obj2.getClass();
            throw null;
        }

        @Override // java.util.SortedMap
        public final SortedMap tailMap(Object obj) {
            obj.getClass();
            throw null;
        }
    }

    @Override // com.google.common.collect.StandardTable
    public final Map o() {
        return new RowSortedMap();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public SortedMap d() {
        return (SortedMap) super.d();
    }
}
