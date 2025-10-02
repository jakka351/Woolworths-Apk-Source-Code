package com.google.zxing;

import com.google.zxing.common.BitMatrix;

/* loaded from: classes6.dex */
public final class BinaryBitmap {

    /* renamed from: a, reason: collision with root package name */
    public final Binarizer f16127a;
    public BitMatrix b;

    public BinaryBitmap(Binarizer binarizer) {
        if (binarizer == null) {
            throw new IllegalArgumentException("Binarizer must be non-null.");
        }
        this.f16127a = binarizer;
    }

    public final void a(int i, int i2, int i3, int i4) {
        Binarizer binarizer = this.f16127a;
        new BinaryBitmap(binarizer.a(binarizer.f16126a.a(i, i2, i3, i4)));
    }

    public final BitMatrix b() {
        if (this.b == null) {
            this.b = this.f16127a.b();
        }
        return this.b;
    }

    public final String toString() {
        try {
            return b().toString();
        } catch (NotFoundException unused) {
            return "";
        }
    }
}
