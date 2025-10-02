package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class ImmutableMapKeySet<K, V> extends IndexedImmutableSet<K> {
    public final ImmutableMap g;

    @GwtIncompatible
    @J2ktIncompatible
    public static class KeySetSerializedForm<K> implements Serializable {
        public final ImmutableMap d;

        public KeySetSerializedForm(ImmutableMap immutableMap) {
            this.d = immutableMap;
        }

        public Object readResolve() {
            return this.d.keySet();
        }
    }

    public ImmutableMapKeySet(ImmutableMap immutableMap) {
        this.g = immutableMap;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.g.containsKey(obj);
    }

    @Override // com.google.common.collect.IndexedImmutableSet
    public final Object get(int i) {
        return ((Map.Entry) this.g.entrySet().b().get(i)).getKey();
    }

    @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final Iterator iterator() {
        return this.g.j();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean j() {
        return true;
    }

    @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableCollection
    /* renamed from: k */
    public final UnmodifiableIterator iterator() {
        return this.g.j();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.g.size();
    }

    @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    @GwtIncompatible
    public Object writeReplace() {
        return new KeySetSerializedForm(this.g);
    }
}
