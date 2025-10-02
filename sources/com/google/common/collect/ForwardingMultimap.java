package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class ForwardingMultimap<K, V> extends ForwardingObject implements Multimap<K, V> {
    @Override // com.google.common.collect.Multimap
    public Multiset F() {
        return P1().F();
    }

    @Override // com.google.common.collect.ForwardingObject
    /* renamed from: R1 */
    public abstract Multimap P1();

    public Collection b(Object obj) {
        return P1().b(obj);
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        P1().clear();
    }

    @Override // com.google.common.collect.Multimap
    public final boolean containsKey(Object obj) {
        return P1().containsKey(obj);
    }

    @Override // com.google.common.collect.Multimap
    public final boolean equals(Object obj) {
        return obj == this || P1().equals(obj);
    }

    public Collection get(Object obj) {
        return P1().get(obj);
    }

    @Override // com.google.common.collect.Multimap
    public final int hashCode() {
        return P1().hashCode();
    }

    @Override // com.google.common.collect.Multimap
    public final boolean isEmpty() {
        return P1().isEmpty();
    }

    @Override // com.google.common.collect.Multimap
    public Set keySet() {
        return P1().keySet();
    }

    @Override // com.google.common.collect.Multimap
    public Collection l() {
        return P1().l();
    }

    @Override // com.google.common.collect.Multimap
    public Map p1() {
        return P1().p1();
    }

    @Override // com.google.common.collect.Multimap
    public boolean put(Object obj, Object obj2) {
        return P1().put(obj, obj2);
    }

    @Override // com.google.common.collect.Multimap
    public boolean remove(Object obj, Object obj2) {
        return P1().remove(obj, obj2);
    }

    @Override // com.google.common.collect.Multimap
    public final int size() {
        return P1().size();
    }

    @Override // com.google.common.collect.Multimap
    public Collection values() {
        return P1().values();
    }

    @Override // com.google.common.collect.Multimap
    public final boolean y1(Object obj, Object obj2) {
        return P1().y1(obj, obj2);
    }
}
