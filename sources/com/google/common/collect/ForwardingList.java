package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class ForwardingList<E> extends ForwardingCollection<E> implements List<E> {
    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Object P1() {
        b2();
        return Collections.EMPTY_LIST;
    }

    @Override // com.google.common.collect.ForwardingCollection
    /* renamed from: R1 */
    public /* bridge */ /* synthetic */ Collection P1() {
        b2();
        return Collections.EMPTY_LIST;
    }

    public void add(int i, Object obj) {
        b2();
        Collections.EMPTY_LIST.add(i, obj);
    }

    public boolean addAll(int i, Collection collection) {
        b2();
        return Collections.EMPTY_LIST.addAll(i, collection);
    }

    public abstract List b2();

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        b2();
        return Collections.EMPTY_LIST.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        b2();
        return Collections.EMPTY_LIST.get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        b2();
        return Collections.EMPTY_LIST.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b2();
        return Collections.EMPTY_LIST.indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b2();
        return Collections.EMPTY_LIST.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        b2();
        return Collections.EMPTY_LIST.listIterator();
    }

    @Override // java.util.List
    public final Object remove(int i) {
        b2();
        return Collections.EMPTY_LIST.remove(i);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        b2();
        return Collections.EMPTY_LIST.set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        b2();
        return Collections.EMPTY_LIST.subList(i, i2);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        b2();
        return Collections.EMPTY_LIST.listIterator(i);
    }
}
