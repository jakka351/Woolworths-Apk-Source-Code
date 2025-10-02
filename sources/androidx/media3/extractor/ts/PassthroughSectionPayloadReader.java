package androidx.media3.extractor.ts;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.ts.TsPayloadReader;

@UnstableApi
/* loaded from: classes2.dex */
public final class PassthroughSectionPayloadReader implements SectionPayloadReader {

    /* renamed from: a, reason: collision with root package name */
    public Format f3428a;
    public TimestampAdjuster b;
    public TrackOutput c;

    public PassthroughSectionPayloadReader(String str) {
        Format.Builder builder = new Format.Builder();
        builder.l = MimeTypes.m("video/mp2t");
        builder.m = MimeTypes.m(str);
        this.f3428a = new Format(builder);
    }

    @Override // androidx.media3.extractor.ts.SectionPayloadReader
    public final void a(ParsableByteArray parsableByteArray) {
        long jD;
        long j;
        Assertions.g(this.b);
        int i = Util.f2928a;
        TimestampAdjuster timestampAdjuster = this.b;
        synchronized (timestampAdjuster) {
            try {
                long j2 = timestampAdjuster.c;
                jD = j2 != -9223372036854775807L ? j2 + timestampAdjuster.b : timestampAdjuster.d();
            } finally {
            }
        }
        TimestampAdjuster timestampAdjuster2 = this.b;
        synchronized (timestampAdjuster2) {
            j = timestampAdjuster2.b;
        }
        if (jD == -9223372036854775807L || j == -9223372036854775807L) {
            return;
        }
        Format format = this.f3428a;
        if (j != format.s) {
            Format.Builder builderA = format.a();
            builderA.r = j;
            Format format2 = new Format(builderA);
            this.f3428a = format2;
            this.c.e(format2);
        }
        int iA = parsableByteArray.a();
        this.c.c(iA, parsableByteArray);
        this.c.g(jD, 1, iA, 0, null);
    }

    @Override // androidx.media3.extractor.ts.SectionPayloadReader
    public final void c(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        this.b = timestampAdjuster;
        trackIdGenerator.a();
        trackIdGenerator.b();
        TrackOutput trackOutputJ = extractorOutput.j(trackIdGenerator.d, 5);
        this.c = trackOutputJ;
        trackOutputJ.e(this.f3428a);
    }
}
