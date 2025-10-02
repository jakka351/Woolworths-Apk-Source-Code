package com.google.zxing.oned.rss;

import com.google.zxing.ResultPoint;

/* loaded from: classes6.dex */
public final class FinderPattern {

    /* renamed from: a, reason: collision with root package name */
    public final int f16187a;
    public final int[] b;
    public final ResultPoint[] c;

    public FinderPattern(int i, int i2, int i3, int i4, int[] iArr) {
        this.f16187a = i;
        this.b = iArr;
        float f = i4;
        this.c = new ResultPoint[]{new ResultPoint(i2, f), new ResultPoint(i3, f)};
    }

    public final boolean equals(Object obj) {
        return (obj instanceof FinderPattern) && this.f16187a == ((FinderPattern) obj).f16187a;
    }

    public final int hashCode() {
        return this.f16187a;
    }
}
