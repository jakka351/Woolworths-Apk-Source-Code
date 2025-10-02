package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Objects;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
class CompactLinkedHashSet<E> extends CompactHashSet<E> {
    public transient int[] i;
    public transient int[] j;
    public transient int k;
    public transient int l;

    @Override // com.google.common.collect.CompactHashSet
    public final int b(int i, int i2) {
        return i >= size() ? i2 : i;
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (n()) {
            return;
        }
        this.k = -2;
        this.l = -2;
        int[] iArr = this.i;
        if (iArr != null && this.j != null) {
            Arrays.fill(iArr, 0, size(), 0);
            Arrays.fill(this.j, 0, size(), 0);
        }
        super.clear();
    }

    @Override // com.google.common.collect.CompactHashSet
    public final int d() {
        int iD = super.d();
        this.i = new int[iD];
        this.j = new int[iD];
        return iD;
    }

    @Override // com.google.common.collect.CompactHashSet
    public final LinkedHashSet g() {
        LinkedHashSet linkedHashSetG = super.g();
        this.i = null;
        this.j = null;
        return linkedHashSetG;
    }

    @Override // com.google.common.collect.CompactHashSet
    public final int i() {
        return this.k;
    }

    @Override // com.google.common.collect.CompactHashSet
    public final int j(int i) {
        Objects.requireNonNull(this.j);
        return r0[i] - 1;
    }

    @Override // com.google.common.collect.CompactHashSet
    public final void k(int i) {
        super.k(i);
        this.k = -2;
        this.l = -2;
    }

    @Override // com.google.common.collect.CompactHashSet
    public final void l(int i, int i2, int i3, Object obj) {
        super.l(i, i2, i3, obj);
        u(this.l, i);
        u(i, -2);
    }

    @Override // com.google.common.collect.CompactHashSet
    public final void m(int i, int i2) {
        int size = size() - 1;
        super.m(i, i2);
        Objects.requireNonNull(this.i);
        u(r4[i] - 1, j(i));
        if (i < size) {
            Objects.requireNonNull(this.i);
            u(r4[size] - 1, i);
            u(i, j(size));
        }
        int[] iArr = this.i;
        Objects.requireNonNull(iArr);
        iArr[size] = 0;
        int[] iArr2 = this.j;
        Objects.requireNonNull(iArr2);
        iArr2[size] = 0;
    }

    @Override // com.google.common.collect.CompactHashSet
    public final void s(int i) {
        super.s(i);
        int[] iArr = this.i;
        Objects.requireNonNull(iArr);
        this.i = Arrays.copyOf(iArr, i);
        int[] iArr2 = this.j;
        Objects.requireNonNull(iArr2);
        this.j = Arrays.copyOf(iArr2, i);
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = new Object[size()];
        ObjectArrays.b(this, objArr);
        return objArr;
    }

    public final void u(int i, int i2) {
        if (i == -2) {
            this.k = i2;
        } else {
            int[] iArr = this.j;
            Objects.requireNonNull(iArr);
            iArr[i] = i2 + 1;
        }
        if (i2 == -2) {
            this.l = i;
            return;
        }
        int[] iArr2 = this.i;
        Objects.requireNonNull(iArr2);
        iArr2[i2] = i + 1;
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return ObjectArrays.c(this, objArr);
    }
}
