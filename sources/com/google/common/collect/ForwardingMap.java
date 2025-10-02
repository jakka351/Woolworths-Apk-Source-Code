package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class ForwardingMap<K, V> extends ForwardingObject implements Map<K, V> {

    public abstract class StandardEntrySet extends Maps.EntrySet<K, V> {
        @Override // com.google.common.collect.Maps.EntrySet
        public final Map h() {
            return null;
        }
    }

    public class StandardKeySet extends Maps.KeySet<K, V> {
    }

    public class StandardValues extends Maps.Values<K, V> {
    }

    @Override // com.google.common.collect.ForwardingObject
    /* renamed from: R1, reason: merged with bridge method [inline-methods] */
    public abstract Map P1();

    public final boolean U1(Object obj) {
        return Iterators.d(new Maps.AnonymousClass2(entrySet().iterator()), obj);
    }

    public void clear() {
        P1().clear();
    }

    public boolean containsKey(Object obj) {
        return P1().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return P1().containsValue(obj);
    }

    public Set entrySet() {
        return P1().entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || P1().equals(obj);
    }

    public Object get(Object obj) {
        return P1().get(obj);
    }

    public int hashCode() {
        return P1().hashCode();
    }

    public boolean isEmpty() {
        return P1().isEmpty();
    }

    public Set keySet() {
        return P1().keySet();
    }

    public Object put(Object obj, Object obj2) {
        return P1().put(obj, obj2);
    }

    public void putAll(Map map) {
        P1().putAll(map);
    }

    public Object remove(Object obj) {
        return P1().remove(obj);
    }

    public int size() {
        return P1().size();
    }

    public Collection values() {
        return P1().values();
    }
}
