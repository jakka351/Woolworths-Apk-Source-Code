package androidx.media3.extractor.mkv;

import androidx.media3.extractor.ExtractorInput;

/* loaded from: classes2.dex */
final class VarintReader {
    public static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3309a = new byte[8];
    public int b;
    public int c;

    public static long a(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    public final long b(ExtractorInput extractorInput, boolean z, boolean z2, int i) {
        int i2;
        int i3 = this.b;
        byte[] bArr = this.f3309a;
        if (i3 == 0) {
            if (!extractorInput.e(bArr, 0, 1, z)) {
                return -1L;
            }
            int i4 = bArr[0] & 255;
            int i5 = 0;
            while (true) {
                if (i5 >= 8) {
                    i2 = -1;
                    break;
                }
                if ((d[i5] & i4) != 0) {
                    i2 = i5 + 1;
                    break;
                }
                i5++;
            }
            this.c = i2;
            if (i2 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.b = 1;
        }
        int i6 = this.c;
        if (i6 > i) {
            this.b = 0;
            return -2L;
        }
        if (i6 != 1) {
            extractorInput.readFully(bArr, 1, i6 - 1);
        }
        this.b = 0;
        return a(bArr, this.c, z2);
    }
}
