package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@J2ktIncompatible
@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
class CompactLinkedHashMap<K, V> extends CompactHashMap<K, V> {
    public transient long[] n;
    public transient int o;
    public transient int p;

    @Override // com.google.common.collect.CompactHashMap
    public final void a(int i) {
    }

    @Override // com.google.common.collect.CompactHashMap
    public final int b(int i, int i2) {
        return i >= size() ? i2 : i;
    }

    @Override // com.google.common.collect.CompactHashMap
    public final int c() {
        int iC = super.c();
        this.n = new long[iC];
        return iC;
    }

    @Override // com.google.common.collect.CompactHashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (p()) {
            return;
        }
        this.o = -2;
        this.p = -2;
        long[] jArr = this.n;
        if (jArr != null) {
            Arrays.fill(jArr, 0, size(), 0L);
        }
        super.clear();
    }

    @Override // com.google.common.collect.CompactHashMap
    public final Map d() {
        Map mapD = super.d();
        this.n = null;
        return mapD;
    }

    @Override // com.google.common.collect.CompactHashMap
    public final LinkedHashMap f(int i) {
        return new LinkedHashMap(i, 1.0f, false);
    }

    @Override // com.google.common.collect.CompactHashMap
    public final int h() {
        return this.o;
    }

    @Override // com.google.common.collect.CompactHashMap
    public final int i(int i) {
        return ((int) x()[i]) - 1;
    }

    @Override // com.google.common.collect.CompactHashMap
    public final void m(int i) {
        super.m(i);
        this.o = -2;
        this.p = -2;
    }

    @Override // com.google.common.collect.CompactHashMap
    public final void n(Object obj, int i, Object obj2, int i2, int i3) {
        super.n(obj, i, obj2, i2, i3);
        y(this.p, i);
        y(i, -2);
    }

    @Override // com.google.common.collect.CompactHashMap
    public final void o(int i, int i2) {
        int size = size() - 1;
        super.o(i, i2);
        y(((int) (x()[i] >>> 32)) - 1, i(i));
        if (i < size) {
            y(((int) (x()[size] >>> 32)) - 1, i);
            y(i, i(size));
        }
        x()[size] = 0;
    }

    @Override // com.google.common.collect.CompactHashMap
    public final void u(int i) {
        super.u(i);
        this.n = Arrays.copyOf(x(), i);
    }

    public final long[] x() {
        long[] jArr = this.n;
        Objects.requireNonNull(jArr);
        return jArr;
    }

    public final void y(int i, int i2) {
        if (i == -2) {
            this.o = i2;
        } else {
            x()[i] = (x()[i] & (-4294967296L)) | ((i2 + 1) & 4294967295L);
        }
        if (i2 == -2) {
            this.p = i;
        } else {
            x()[i2] = (4294967295L & x()[i2]) | ((i + 1) << 32);
        }
    }
}
