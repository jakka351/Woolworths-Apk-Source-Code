package androidx.media3.extractor;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public final class VorbisBitArray {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3255a;
    public final int b;
    public int c;
    public int d;

    public VorbisBitArray(byte[] bArr) {
        this.f3255a = bArr;
        this.b = bArr.length;
    }

    public final boolean a() {
        boolean z = (((this.f3255a[this.c] & 255) >> this.d) & 1) == 1;
        c(1);
        return z;
    }

    public final int b(int i) {
        int i2 = this.c;
        int iMin = Math.min(i, 8 - this.d);
        int i3 = i2 + 1;
        byte[] bArr = this.f3255a;
        int i4 = ((bArr[i2] & 255) >> this.d) & (255 >> (8 - iMin));
        while (iMin < i) {
            i4 |= (bArr[i3] & 255) << iMin;
            iMin += 8;
            i3++;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        c(i);
        return i5;
    }

    public final void c(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.c + i3;
        this.c = i4;
        int i5 = (i - (i3 * 8)) + this.d;
        this.d = i5;
        boolean z = true;
        if (i5 > 7) {
            this.c = i4 + 1;
            this.d = i5 - 8;
        }
        int i6 = this.c;
        if (i6 < 0 || (i6 >= (i2 = this.b) && (i6 != i2 || this.d != 0))) {
            z = false;
        }
        Assertions.f(z);
    }
}
