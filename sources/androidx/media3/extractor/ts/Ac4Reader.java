package androidx.media3.extractor.ts;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.Ac4Util;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.ts.TsPayloadReader;

@UnstableApi
/* loaded from: classes2.dex */
public final class Ac4Reader implements ElementaryStreamReader {

    /* renamed from: a, reason: collision with root package name */
    public final ParsableBitArray f3406a;
    public final ParsableByteArray b;
    public final String c;
    public final int d;
    public final String e;
    public String f;
    public TrackOutput g;
    public int h;
    public int i;
    public boolean j;
    public long k;
    public Format l;
    public int m;
    public long n;

    public Ac4Reader(String str, int i, String str2) {
        ParsableBitArray parsableBitArray = new ParsableBitArray(new byte[16], 16);
        this.f3406a = parsableBitArray;
        this.b = new ParsableByteArray(parsableBitArray.f2921a);
        this.h = 0;
        this.i = 0;
        this.j = false;
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void a(ParsableByteArray parsableByteArray) {
        Assertions.g(this.g);
        while (parsableByteArray.a() > 0) {
            int i = this.h;
            ParsableByteArray parsableByteArray2 = this.b;
            if (i == 0) {
                while (parsableByteArray.a() > 0) {
                    if (this.j) {
                        int iU = parsableByteArray.u();
                        this.j = iU == 172;
                        if (iU == 64 || iU == 65) {
                            boolean z = iU == 65;
                            this.h = 1;
                            byte[] bArr = parsableByteArray2.f2922a;
                            bArr[0] = -84;
                            bArr[1] = (byte) (z ? 65 : 64);
                            this.i = 2;
                        }
                    } else {
                        this.j = parsableByteArray.u() == 172;
                    }
                }
            } else if (i == 1) {
                byte[] bArr2 = parsableByteArray2.f2922a;
                int iMin = Math.min(parsableByteArray.a(), 16 - this.i);
                parsableByteArray.e(this.i, iMin, bArr2);
                int i2 = this.i + iMin;
                this.i = i2;
                if (i2 == 16) {
                    ParsableBitArray parsableBitArray = this.f3406a;
                    parsableBitArray.m(0);
                    Ac4Util.SyncFrameInfo syncFrameInfoC = Ac4Util.c(parsableBitArray);
                    int i3 = syncFrameInfoC.f3221a;
                    Format format = this.l;
                    if (format == null || 2 != format.D || i3 != format.E || !"audio/ac4".equals(format.n)) {
                        Format.Builder builder = new Format.Builder();
                        builder.f2855a = this.f;
                        builder.l = MimeTypes.m(this.e);
                        builder.m = MimeTypes.m("audio/ac4");
                        builder.C = 2;
                        builder.D = i3;
                        builder.d = this.c;
                        builder.f = this.d;
                        Format format2 = new Format(builder);
                        this.l = format2;
                        this.g.e(format2);
                    }
                    this.m = syncFrameInfoC.b;
                    this.k = (syncFrameInfoC.c * 1000000) / this.l.E;
                    parsableByteArray2.G(0);
                    this.g.c(16, parsableByteArray2);
                    this.h = 2;
                }
            } else if (i == 2) {
                int iMin2 = Math.min(parsableByteArray.a(), this.m - this.i);
                this.g.c(iMin2, parsableByteArray);
                int i4 = this.i + iMin2;
                this.i = i4;
                if (i4 == this.m) {
                    Assertions.f(this.n != -9223372036854775807L);
                    this.g.g(this.n, 1, this.m, 0, null);
                    this.n += this.k;
                    this.h = 0;
                }
            }
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void b() {
        this.h = 0;
        this.i = 0;
        this.j = false;
        this.n = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void c(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.a();
        trackIdGenerator.b();
        this.f = trackIdGenerator.e;
        trackIdGenerator.b();
        this.g = extractorOutput.j(trackIdGenerator.d, 1);
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void d(int i, long j) {
        this.n = j;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void e(boolean z) {
    }
}
