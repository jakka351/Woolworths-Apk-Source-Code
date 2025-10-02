package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public class TreeMultimap<K, V> extends AbstractSortedKeySortedSetMultimap<K, V> {
    public transient Comparator k;
    public transient Comparator l;

    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        Objects.requireNonNull(comparator);
        this.k = comparator;
        Comparator comparator2 = (Comparator) objectInputStream.readObject();
        Objects.requireNonNull(comparator2);
        this.l = comparator2;
        n(new TreeMap(this.k));
        Serialization.c(this, objectInputStream, objectInputStream.readInt());
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.k);
        objectOutputStream.writeObject(this.l);
        Serialization.f(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
    public final Map a() {
        return j();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public final boolean containsKey(Object obj) {
        return this.i.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final Collection get(Object obj) {
        return (NavigableSet) super.get(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public final Collection i(Object obj) {
        if (obj == null) {
            this.k.compare(obj, obj);
        }
        return h();
    }

    @Override // com.google.common.collect.AbstractSortedKeySortedSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // com.google.common.collect.AbstractSortedKeySortedSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final Map p1() {
        return (NavigableMap) super.p1();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public final int size() {
        return this.j;
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap
    /* renamed from: t */
    public final SortedSet h() {
        return new TreeSet(this.l);
    }

    @Override // com.google.common.collect.AbstractSortedKeySortedSetMultimap
    /* renamed from: u */
    public final SortedMap p1() {
        return (NavigableMap) super.p1();
    }

    @Override // com.google.common.collect.AbstractSortedKeySortedSetMultimap
    /* renamed from: w */
    public final SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final Set get(Object obj) {
        return (NavigableSet) super.get(obj);
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final SortedSet get(Object obj) {
        return (NavigableSet) super.get(obj);
    }
}
