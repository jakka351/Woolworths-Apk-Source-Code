package androidx.media3.extractor.ts;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.MpegAudioUtil;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.ts.TsPayloadReader;

@UnstableApi
/* loaded from: classes2.dex */
public final class MpegAudioReader implements ElementaryStreamReader {

    /* renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f3424a;
    public final MpegAudioUtil.Header b;
    public final String c;
    public final int d;
    public final String e;
    public TrackOutput f;
    public String g;
    public int h = 0;
    public int i;
    public boolean j;
    public boolean k;
    public long l;
    public int m;
    public long n;

    public MpegAudioReader(String str, int i, String str2) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(4);
        this.f3424a = parsableByteArray;
        parsableByteArray.f2922a[0] = -1;
        this.b = new MpegAudioUtil.Header();
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void a(ParsableByteArray parsableByteArray) {
        Assertions.g(this.f);
        while (parsableByteArray.a() > 0) {
            int i = this.h;
            ParsableByteArray parsableByteArray2 = this.f3424a;
            if (i == 0) {
                byte[] bArr = parsableByteArray.f2922a;
                int i2 = parsableByteArray.b;
                int i3 = parsableByteArray.c;
                while (true) {
                    if (i2 >= i3) {
                        parsableByteArray.G(i3);
                        break;
                    }
                    byte b = bArr[i2];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.k && (b & 224) == 224;
                    this.k = z;
                    if (z2) {
                        parsableByteArray.G(i2 + 1);
                        this.k = false;
                        parsableByteArray2.f2922a[1] = bArr[i2];
                        this.i = 2;
                        this.h = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i == 1) {
                int iMin = Math.min(parsableByteArray.a(), 4 - this.i);
                parsableByteArray.e(this.i, iMin, parsableByteArray2.f2922a);
                int i4 = this.i + iMin;
                this.i = i4;
                if (i4 >= 4) {
                    parsableByteArray2.G(0);
                    int iG = parsableByteArray2.g();
                    MpegAudioUtil.Header header = this.b;
                    if (header.a(iG)) {
                        this.m = header.c;
                        if (!this.j) {
                            this.l = (header.g * 1000000) / header.d;
                            Format.Builder builder = new Format.Builder();
                            builder.f2855a = this.g;
                            builder.l = MimeTypes.m(this.e);
                            builder.m = MimeTypes.m(header.b);
                            builder.n = 4096;
                            builder.C = header.e;
                            builder.D = header.d;
                            builder.d = this.c;
                            builder.f = this.d;
                            this.f.e(new Format(builder));
                            this.j = true;
                        }
                        parsableByteArray2.G(0);
                        this.f.c(4, parsableByteArray2);
                        this.h = 2;
                    } else {
                        this.i = 0;
                        this.h = 1;
                    }
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(parsableByteArray.a(), this.m - this.i);
                this.f.c(iMin2, parsableByteArray);
                int i5 = this.i + iMin2;
                this.i = i5;
                if (i5 >= this.m) {
                    Assertions.f(this.n != -9223372036854775807L);
                    this.f.g(this.n, 1, this.m, 0, null);
                    this.n += this.l;
                    this.i = 0;
                    this.h = 0;
                }
            }
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void b() {
        this.h = 0;
        this.i = 0;
        this.k = false;
        this.n = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void c(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.a();
        trackIdGenerator.b();
        this.g = trackIdGenerator.e;
        trackIdGenerator.b();
        this.f = extractorOutput.j(trackIdGenerator.d, 1);
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void d(int i, long j) {
        this.n = j;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void e(boolean z) {
    }
}
