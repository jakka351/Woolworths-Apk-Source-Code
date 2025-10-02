package com.scandit.datacapture.barcode;

import kotlin.ranges.RangesKt;

/* loaded from: classes6.dex */
final class N0 {
    public /* synthetic */ N0(int i) {
        this();
    }

    public static final float a(N0 n0) {
        return ((Number) R0.l.getD()).floatValue();
    }

    public static final int b(N0 n0) {
        return ((Number) R0.m.getD()).intValue();
    }

    private N0() {
    }

    public static final int[] a(N0 n0, int i) {
        int i2 = i & 16777215;
        return new int[]{(RangesKt.c(0, 0, 255) << 24) | i2, (RangesKt.c(230, 0, 255) << 24) | i2};
    }
}
