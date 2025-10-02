package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes.dex */
final class RegularImmutableSet<E> extends ImmutableSet<E> {
    public static final Object[] l;
    public static final RegularImmutableSet m;
    public final transient Object[] g;
    public final transient int h;
    public final transient Object[] i;
    public final transient int j;
    public final transient int k;

    static {
        Object[] objArr = new Object[0];
        l = objArr;
        m = new RegularImmutableSet(objArr, 0, objArr, 0, 0);
    }

    public RegularImmutableSet(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.g = objArr;
        this.h = i;
        this.i = objArr2;
        this.j = i2;
        this.k = i3;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.i;
            if (objArr.length != 0) {
                int iC = Hashing.c(obj);
                while (true) {
                    int i = iC & this.j;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iC = i + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int d(int i, Object[] objArr) {
        Object[] objArr2 = this.g;
        int i2 = this.k;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final Object[] g() {
        return this.g;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int h() {
        return this.k;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.h;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int i() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean j() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: k */
    public final UnmodifiableIterator iterator() {
        return b().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.k;
    }

    @Override // com.google.common.collect.ImmutableSet
    public final ImmutableList t() {
        return ImmutableList.l(this.k, this.g);
    }

    @Override // com.google.common.collect.ImmutableSet
    public final boolean u() {
        return true;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    @GwtIncompatible
    public Object writeReplace() {
        return super.writeReplace();
    }
}
