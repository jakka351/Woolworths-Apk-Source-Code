package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.util.ListIterator;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
class RegularImmutableAsList<E> extends ImmutableAsList<E> {
    @Override // com.google.common.collect.ImmutableAsList
    public final ImmutableCollection D() {
        return null;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public final int d(int i, Object[] objArr) {
        throw null;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final Object[] g() {
        throw null;
    }

    @Override // java.util.List
    public final Object get(int i) {
        throw null;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int h() {
        throw null;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int i() {
        throw null;
    }

    @Override // com.google.common.collect.ImmutableList, java.util.List
    public final ListIterator listIterator(int i) {
        throw null;
    }

    @Override // com.google.common.collect.ImmutableList
    /* renamed from: s */
    public final UnmodifiableListIterator listIterator(int i) {
        throw null;
    }

    @Override // com.google.common.collect.ImmutableAsList, com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    @GwtIncompatible
    public Object writeReplace() {
        return super.writeReplace();
    }
}
