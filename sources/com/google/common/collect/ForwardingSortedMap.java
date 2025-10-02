package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.SortedMap;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class ForwardingSortedMap<K, V> extends ForwardingMap<K, V> implements SortedMap<K, V> {

    public class StandardKeySet extends Maps.SortedKeySet<K, V> {
    }

    @Override // com.google.common.collect.ForwardingMap
    /* renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public abstract SortedMap P1();

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return P1().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return P1().firstKey();
    }

    @Override // java.util.SortedMap
    public SortedMap headMap(Object obj) {
        return P1().headMap(obj);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return P1().lastKey();
    }

    @Override // java.util.SortedMap
    public SortedMap subMap(Object obj, Object obj2) {
        return P1().subMap(obj, obj2);
    }

    @Override // java.util.SortedMap
    public SortedMap tailMap(Object obj) {
        return P1().tailMap(obj);
    }
}
