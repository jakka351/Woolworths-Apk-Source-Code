package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;
import java.util.SortedSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class ForwardingSortedSet<E> extends ForwardingSet<E> implements SortedSet<E> {
    @Override // java.util.SortedSet
    public Comparator comparator() {
        return P1().comparator();
    }

    @Override // com.google.common.collect.ForwardingSet
    /* renamed from: f2, reason: merged with bridge method [inline-methods] */
    public abstract SortedSet P1();

    @Override // java.util.SortedSet
    public Object first() {
        return P1().first();
    }

    @Override // java.util.SortedSet
    public SortedSet headSet(Object obj) {
        return P1().headSet(obj);
    }

    @Override // java.util.SortedSet
    public Object last() {
        return P1().last();
    }

    @Override // java.util.SortedSet
    public SortedSet subSet(Object obj, Object obj2) {
        return P1().subSet(obj, obj2);
    }

    @Override // java.util.SortedSet
    public SortedSet tailSet(Object obj) {
        return P1().tailSet(obj);
    }
}
