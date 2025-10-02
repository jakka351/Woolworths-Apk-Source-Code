package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

@DoNotMock
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public interface Multimap<K, V> {
    Multiset F();

    Collection b(Object obj);

    void clear();

    boolean containsKey(Object obj);

    boolean containsValue(Object obj);

    boolean equals(Object obj);

    Collection get(Object obj);

    int hashCode();

    boolean isEmpty();

    Set keySet();

    Collection l();

    Map p1();

    boolean put(Object obj, Object obj2);

    boolean remove(Object obj, Object obj2);

    int size();

    Collection values();

    boolean y1(Object obj, Object obj2);
}
