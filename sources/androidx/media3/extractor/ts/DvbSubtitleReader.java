package androidx.media3.extractor.ts;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.ts.TsPayloadReader;
import java.util.Collections;
import java.util.List;

@UnstableApi
/* loaded from: classes2.dex */
public final class DvbSubtitleReader implements ElementaryStreamReader {

    /* renamed from: a, reason: collision with root package name */
    public final List f3411a;
    public final TrackOutput[] b;
    public boolean c;
    public int d;
    public int e;
    public long f = -9223372036854775807L;

    public DvbSubtitleReader(List list) {
        this.f3411a = list;
        this.b = new TrackOutput[list.size()];
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void a(ParsableByteArray parsableByteArray) {
        boolean z;
        boolean z2;
        if (this.c) {
            if (this.d == 2) {
                if (parsableByteArray.a() == 0) {
                    z2 = false;
                } else {
                    if (parsableByteArray.u() != 32) {
                        this.c = false;
                    }
                    this.d--;
                    z2 = this.c;
                }
                if (!z2) {
                    return;
                }
            }
            if (this.d == 1) {
                if (parsableByteArray.a() == 0) {
                    z = false;
                } else {
                    if (parsableByteArray.u() != 0) {
                        this.c = false;
                    }
                    this.d--;
                    z = this.c;
                }
                if (!z) {
                    return;
                }
            }
            int i = parsableByteArray.b;
            int iA = parsableByteArray.a();
            for (TrackOutput trackOutput : this.b) {
                parsableByteArray.G(i);
                trackOutput.c(iA, parsableByteArray);
            }
            this.e += iA;
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void b() {
        this.c = false;
        this.f = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void c(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        int i = 0;
        while (true) {
            TrackOutput[] trackOutputArr = this.b;
            if (i >= trackOutputArr.length) {
                return;
            }
            TsPayloadReader.DvbSubtitleInfo dvbSubtitleInfo = (TsPayloadReader.DvbSubtitleInfo) this.f3411a.get(i);
            trackIdGenerator.a();
            trackIdGenerator.b();
            TrackOutput trackOutputJ = extractorOutput.j(trackIdGenerator.d, 3);
            Format.Builder builder = new Format.Builder();
            trackIdGenerator.b();
            builder.f2855a = trackIdGenerator.e;
            builder.l = MimeTypes.m("video/mp2t");
            builder.m = MimeTypes.m("application/dvbsubs");
            builder.p = Collections.singletonList(dvbSubtitleInfo.b);
            builder.d = dvbSubtitleInfo.f3441a;
            trackOutputJ.e(new Format(builder));
            trackOutputArr[i] = trackOutputJ;
            i++;
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void d(int i, long j) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        this.f = j;
        this.e = 0;
        this.d = 2;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void e(boolean z) {
        if (this.c) {
            Assertions.f(this.f != -9223372036854775807L);
            for (TrackOutput trackOutput : this.b) {
                trackOutput.g(this.f, 1, this.e, 0, null);
            }
            this.c = false;
        }
    }
}
