package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import java.util.Objects;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes.dex */
class RegularImmutableList<E> extends ImmutableList<E> {
    public static final ImmutableList h = new RegularImmutableList(new Object[0], 0);
    public final transient Object[] f;
    public final transient int g;

    public RegularImmutableList(Object[] objArr, int i) {
        this.f = objArr;
        this.g = i;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public final int d(int i, Object[] objArr) {
        Object[] objArr2 = this.f;
        int i2 = this.g;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final Object[] g() {
        return this.f;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Preconditions.i(i, this.g);
        Object obj = this.f[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int h() {
        return this.g;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int i() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean j() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.g;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    @GwtIncompatible
    public Object writeReplace() {
        return super.writeReplace();
    }
}
