package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import java.lang.Comparable;
import java.util.NavigableSet;
import java.util.SortedSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class ContiguousSet<C extends Comparable> extends ImmutableSortedSet<C> {
    public static final /* synthetic */ int i = 0;

    public ContiguousSet() {
        super(NaturalOrdering.f);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet B() {
        return new DescendingImmutableSortedSet(this);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* renamed from: F */
    public final ImmutableSortedSet headSet(Object obj) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return I(comparable, false);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* renamed from: G */
    public final ImmutableSortedSet headSet(Object obj, boolean z) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return I(comparable, z);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* renamed from: J */
    public final ImmutableSortedSet subSet(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        Preconditions.g(this.g.compare(comparable, comparable2) <= 0);
        return L(comparable, true, comparable2, false);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* renamed from: K */
    public final ImmutableSortedSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        Preconditions.g(this.g.compare(comparable, comparable2) <= 0);
        return L(comparable, z, comparable2, z2);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* renamed from: M */
    public final ImmutableSortedSet tailSet(Object obj) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return O(comparable, true);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* renamed from: N */
    public final ImmutableSortedSet tailSet(Object obj, boolean z) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return O(comparable, z);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* renamed from: P */
    public abstract ContiguousSet I(Comparable comparable, boolean z);

    public abstract Range Q();

    @Override // com.google.common.collect.ImmutableSortedSet
    /* renamed from: S */
    public abstract ContiguousSet L(Comparable comparable, boolean z, Comparable comparable2, boolean z2);

    @Override // com.google.common.collect.ImmutableSortedSet
    /* renamed from: T */
    public abstract ContiguousSet O(Comparable comparable, boolean z);

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return I(comparable, z);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        Preconditions.g(this.g.compare(comparable, comparable2) <= 0);
        return L(comparable, z, comparable2, z2);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return O(comparable, z);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return Q().toString();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    @GwtIncompatible
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return I(comparable, false);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return O(comparable, true);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        Preconditions.g(this.g.compare(comparable, comparable2) <= 0);
        return L(comparable, true, comparable2, false);
    }
}
