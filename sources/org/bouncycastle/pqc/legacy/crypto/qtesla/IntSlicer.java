package org.bouncycastle.pqc.legacy.crypto.qtesla;

/* loaded from: classes8.dex */
final class IntSlicer {
    private int base;
    private final int[] values;

    public IntSlicer(int[] iArr, int i) {
        this.values = iArr;
        this.base = i;
    }

    public final int at(int i) {
        return this.values[this.base + i];
    }

    public final IntSlicer copy() {
        return new IntSlicer(this.values, this.base);
    }

    public final IntSlicer from(int i) {
        return new IntSlicer(this.values, this.base + i);
    }

    public final void incBase(int i) {
        this.base += i;
    }

    public final int at(int i, int i2) {
        this.values[this.base + i] = i2;
        return i2;
    }

    public final int at(int i, long j) {
        int[] iArr = this.values;
        int i2 = this.base + i;
        int i3 = (int) j;
        iArr[i2] = i3;
        return i3;
    }
}
