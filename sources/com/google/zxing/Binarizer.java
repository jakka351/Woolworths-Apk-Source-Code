package com.google.zxing;

import com.google.zxing.common.BitArray;
import com.google.zxing.common.BitMatrix;

/* loaded from: classes6.dex */
public abstract class Binarizer {

    /* renamed from: a, reason: collision with root package name */
    public final LuminanceSource f16126a;

    public Binarizer(LuminanceSource luminanceSource) {
        this.f16126a = luminanceSource;
    }

    public abstract Binarizer a(LuminanceSource luminanceSource);

    public abstract BitMatrix b();

    public abstract BitArray c(int i, BitArray bitArray);
}
