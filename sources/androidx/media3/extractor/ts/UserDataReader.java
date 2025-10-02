package androidx.media3.extractor.ts;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.CeaUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.ts.TsPayloadReader;
import java.util.List;

/* loaded from: classes2.dex */
final class UserDataReader {

    /* renamed from: a, reason: collision with root package name */
    public final List f3444a;
    public final TrackOutput[] b;

    public UserDataReader(List list) {
        this.f3444a = list;
        this.b = new TrackOutput[list.size()];
    }

    public final void a(long j, ParsableByteArray parsableByteArray) {
        if (parsableByteArray.a() < 9) {
            return;
        }
        int iG = parsableByteArray.g();
        int iG2 = parsableByteArray.g();
        int iU = parsableByteArray.u();
        if (iG == 434 && iG2 == 1195456820 && iU == 3) {
            CeaUtil.b(j, parsableByteArray, this.b);
        }
    }

    public final void b(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        int i = 0;
        while (true) {
            TrackOutput[] trackOutputArr = this.b;
            if (i >= trackOutputArr.length) {
                return;
            }
            trackIdGenerator.a();
            trackIdGenerator.b();
            TrackOutput trackOutputJ = extractorOutput.j(trackIdGenerator.d, 3);
            Format format = (Format) this.f3444a.get(i);
            String str = format.n;
            Assertions.a("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            Format.Builder builder = new Format.Builder();
            trackIdGenerator.b();
            builder.f2855a = trackIdGenerator.e;
            builder.l = MimeTypes.m("video/mp2t");
            builder.m = MimeTypes.m(str);
            builder.e = format.e;
            builder.d = format.d;
            builder.H = format.I;
            builder.p = format.q;
            trackOutputJ.e(new Format(builder));
            trackOutputArr[i] = trackOutputJ;
            i++;
        }
    }
}
