package androidx.media3.extractor.ts;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.ts.TsPayloadReader;

@UnstableApi
/* loaded from: classes2.dex */
public final class Id3Reader implements ElementaryStreamReader {
    public TrackOutput b;
    public boolean c;
    public int e;
    public int f;

    /* renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f3422a = new ParsableByteArray(10);
    public long d = -9223372036854775807L;

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void a(ParsableByteArray parsableByteArray) {
        Assertions.g(this.b);
        if (this.c) {
            int iA = parsableByteArray.a();
            int i = this.f;
            if (i < 10) {
                int iMin = Math.min(iA, 10 - i);
                byte[] bArr = parsableByteArray.f2922a;
                int i2 = parsableByteArray.b;
                ParsableByteArray parsableByteArray2 = this.f3422a;
                System.arraycopy(bArr, i2, parsableByteArray2.f2922a, this.f, iMin);
                if (this.f + iMin == 10) {
                    parsableByteArray2.G(0);
                    if (73 != parsableByteArray2.u() || 68 != parsableByteArray2.u() || 51 != parsableByteArray2.u()) {
                        Log.g("Id3Reader", "Discarding invalid ID3 tag");
                        this.c = false;
                        return;
                    } else {
                        parsableByteArray2.H(3);
                        this.e = parsableByteArray2.t() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA, this.e - this.f);
            this.b.c(iMin2, parsableByteArray);
            this.f += iMin2;
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void b() {
        this.c = false;
        this.d = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void c(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.a();
        trackIdGenerator.b();
        TrackOutput trackOutputJ = extractorOutput.j(trackIdGenerator.d, 5);
        this.b = trackOutputJ;
        Format.Builder builder = new Format.Builder();
        trackIdGenerator.b();
        builder.f2855a = trackIdGenerator.e;
        builder.l = MimeTypes.m("video/mp2t");
        builder.m = MimeTypes.m("application/id3");
        trackOutputJ.e(new Format(builder));
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void d(int i, long j) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        this.d = j;
        this.e = 0;
        this.f = 0;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void e(boolean z) {
        int i;
        Assertions.g(this.b);
        if (this.c && (i = this.e) != 0 && this.f == i) {
            Assertions.f(this.d != -9223372036854775807L);
            this.b.g(this.d, 1, this.e, 0, null);
            this.c = false;
        }
    }
}
