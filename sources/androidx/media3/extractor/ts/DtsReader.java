package androidx.media3.extractor.ts;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.DtsUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.ts.TsPayloadReader;
import java.util.concurrent.atomic.AtomicInteger;

@UnstableApi
/* loaded from: classes2.dex */
public final class DtsReader implements ElementaryStreamReader {

    /* renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f3410a;
    public final String c;
    public final int d;
    public String f;
    public TrackOutput g;
    public int i;
    public int j;
    public long k;
    public Format l;
    public int m;
    public int n;
    public int h = 0;
    public long q = -9223372036854775807L;
    public final AtomicInteger b = new AtomicInteger();
    public int o = -1;
    public int p = -1;
    public final String e = "video/mp2t";

    public DtsReader(String str, int i, int i2) {
        this.f3410a = new ParsableByteArray(new byte[i2]);
        this.c = str;
        this.d = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04bb  */
    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(androidx.media3.common.util.ParsableByteArray r39) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 1416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ts.DtsReader.a(androidx.media3.common.util.ParsableByteArray):void");
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void b() {
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.q = -9223372036854775807L;
        this.b.set(0);
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
        this.q = j;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void e(boolean z) {
    }

    public final boolean f(ParsableByteArray parsableByteArray, byte[] bArr, int i) {
        int iMin = Math.min(parsableByteArray.a(), i - this.i);
        parsableByteArray.e(this.i, iMin, bArr);
        int i2 = this.i + iMin;
        this.i = i2;
        return i2 == i;
    }

    public final void g(DtsUtil.DtsHeader dtsHeader) {
        int i = dtsHeader.b;
        String str = dtsHeader.f3234a;
        int i2 = dtsHeader.c;
        if (i == -2147483647 || i2 == -1) {
            return;
        }
        Format format = this.l;
        if (format != null && i2 == format.D && i == format.E && str.equals(format.n)) {
            return;
        }
        Format format2 = this.l;
        Format.Builder builder = format2 == null ? new Format.Builder() : format2.a();
        builder.f2855a = this.f;
        builder.l = MimeTypes.m(this.e);
        builder.m = MimeTypes.m(str);
        builder.C = i2;
        builder.D = i;
        builder.d = this.c;
        builder.f = this.d;
        Format format3 = new Format(builder);
        this.l = format3;
        this.g.e(format3);
    }
}
