package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class ForwardingNavigableMap<K, V> extends ForwardingSortedMap<K, V> implements NavigableMap<K, V> {

    public class StandardDescendingMap extends Maps.DescendingMap<K, V> {

        /* renamed from: com.google.common.collect.ForwardingNavigableMap$StandardDescendingMap$1, reason: invalid class name */
        class AnonymousClass1 implements Iterator<Map.Entry<Object, Object>> {
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public final Map.Entry<Object, Object> next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        public final Iterator Y1() {
            throw null;
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        public final NavigableMap b2() {
            return null;
        }
    }

    public class StandardNavigableKeySet extends Maps.NavigableKeySet<K, V> {
    }

    @Override // com.google.common.collect.ForwardingSortedMap
    /* renamed from: b2, reason: merged with bridge method [inline-methods] */
    public abstract NavigableMap P1();

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return P1().ceilingEntry(obj);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return P1().ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return P1().descendingKeySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return P1().descendingMap();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        return P1().firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return P1().floorEntry(obj);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return P1().floorKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return P1().headMap(obj, z);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return P1().higherEntry(obj);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return P1().higherKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        return P1().lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return P1().lowerEntry(obj);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return P1().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return P1().navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return P1().pollFirstEntry();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return P1().pollLastEntry();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return P1().subMap(obj, z, obj2, z2);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return P1().tailMap(obj, z);
    }
}
