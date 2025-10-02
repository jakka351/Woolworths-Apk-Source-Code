package androidx.media3.extractor;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.TrackOutput;

@UnstableApi
/* loaded from: classes2.dex */
public final class TrueHdSampleRechunker {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3254a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(TrackOutput trackOutput, TrackOutput.CryptoData cryptoData) {
        if (this.c > 0) {
            trackOutput.g(this.d, this.e, this.f, this.g, cryptoData);
            this.c = 0;
        }
    }

    public final void b(TrackOutput trackOutput, long j, int i, int i2, int i3, TrackOutput.CryptoData cryptoData) {
        Assertions.e("TrueHD chunk samples must be contiguous in the sample queue.", this.g <= i2 + i3);
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                a(trackOutput, cryptoData);
            }
        }
    }

    public final void c(ExtractorInput extractorInput) {
        if (this.b) {
            return;
        }
        byte[] bArr = this.f3254a;
        extractorInput.b(0, 10, bArr);
        extractorInput.i();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                i = 40 << ((bArr[((b & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i == 0) {
            return;
        }
        this.b = true;
    }
}
