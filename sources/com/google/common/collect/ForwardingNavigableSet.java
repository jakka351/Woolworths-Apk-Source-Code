package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.NavigableSet;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class ForwardingNavigableSet<E> extends ForwardingSortedSet<E> implements NavigableSet<E> {

    public class StandardDescendingSet extends Sets.DescendingSet<E> {
    }

    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        return P1().ceiling(obj);
    }

    @Override // java.util.NavigableSet
    public Iterator descendingIterator() {
        return P1().descendingIterator();
    }

    @Override // java.util.NavigableSet
    public NavigableSet descendingSet() {
        return P1().descendingSet();
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        return P1().floor(obj);
    }

    @Override // java.util.NavigableSet
    public NavigableSet headSet(Object obj, boolean z) {
        return P1().headSet(obj, z);
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        return P1().higher(obj);
    }

    @Override // com.google.common.collect.ForwardingSortedSet
    /* renamed from: k2, reason: merged with bridge method [inline-methods] */
    public abstract NavigableSet P1();

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        return P1().lower(obj);
    }

    @Override // java.util.NavigableSet
    public Object pollFirst() {
        return P1().pollFirst();
    }

    @Override // java.util.NavigableSet
    public Object pollLast() {
        return P1().pollLast();
    }

    @Override // java.util.NavigableSet
    public NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return P1().subSet(obj, z, obj2, z2);
    }

    @Override // java.util.NavigableSet
    public NavigableSet tailSet(Object obj, boolean z) {
        return P1().tailSet(obj, z);
    }
}
