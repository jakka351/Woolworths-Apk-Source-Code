package androidx.media3.extractor.ts;

import androidx.camera.core.impl.e;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.container.ReorderingSeiMessageQueue;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.ts.TsPayloadReader;
import java.util.List;

@UnstableApi
/* loaded from: classes2.dex */
public final class SeiReader {

    /* renamed from: a, reason: collision with root package name */
    public final List f3435a;
    public final TrackOutput[] b;
    public final ReorderingSeiMessageQueue c = new ReorderingSeiMessageQueue(new e(this, 5));

    public SeiReader(List list) {
        this.f3435a = list;
        this.b = new TrackOutput[list.size()];
    }

    public final void a(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        int i = 0;
        while (true) {
            TrackOutput[] trackOutputArr = this.b;
            if (i >= trackOutputArr.length) {
                return;
            }
            trackIdGenerator.a();
            trackIdGenerator.b();
            TrackOutput trackOutputJ = extractorOutput.j(trackIdGenerator.d, 3);
            Format format = (Format) this.f3435a.get(i);
            String str = format.n;
            Assertions.a("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String str2 = format.f2854a;
            if (str2 == null) {
                trackIdGenerator.b();
                str2 = trackIdGenerator.e;
            }
            Format.Builder builder = new Format.Builder();
            builder.f2855a = str2;
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
