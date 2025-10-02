package com.google.mlkit.vision.barcode;

import com.google.android.gms.common.internal.Objects;

/* loaded from: classes6.dex */
public class BarcodeScannerOptions {

    /* renamed from: a, reason: collision with root package name */
    public final int f15988a;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public int f15989a = 0;

        public final void a(int i, int... iArr) {
            this.f15989a = i;
            if (iArr != null) {
                for (int i2 : iArr) {
                    this.f15989a = i2 | this.f15989a;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BarcodeScannerOptions) && this.f15988a == ((BarcodeScannerOptions) obj).f15988a && Objects.equal(null, null) && Objects.equal(null, null);
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f15988a), Boolean.FALSE, null, null);
    }
}
