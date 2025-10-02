package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.collect.Iterators;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes.dex */
final class SingletonImmutableSet<E> extends ImmutableSet<E> {
    public final transient Object g;

    public SingletonImmutableSet(Object obj) {
        obj.getClass();
        this.g = obj;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public final ImmutableList b() {
        return ImmutableList.w(this.g);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.g.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int d(int i, Object[] objArr) {
        objArr[i] = this.g;
        return i + 1;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.g.hashCode();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean j() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: k */
    public final UnmodifiableIterator iterator() {
        return new Iterators.SingletonIterator(this.g);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.g.toString() + ']';
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    @GwtIncompatible
    public Object writeReplace() {
        return super.writeReplace();
    }
}
