package androidx.media3.extractor.ts;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.ts.TsPayloadReader;
import java.util.Arrays;

@UnstableApi
/* loaded from: classes2.dex */
public final class AdtsReader implements ElementaryStreamReader {
    public static final byte[] x = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3408a;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public TrackOutput h;
    public TrackOutput i;
    public boolean m;
    public boolean n;
    public int q;
    public boolean r;
    public int t;
    public TrackOutput v;
    public long w;
    public final ParsableBitArray b = new ParsableBitArray(new byte[7], 7);
    public final ParsableByteArray c = new ParsableByteArray(Arrays.copyOf(x, 10));
    public int o = -1;
    public int p = -1;
    public long s = -9223372036854775807L;
    public long u = -9223372036854775807L;
    public int j = 0;
    public int k = 0;
    public int l = 256;

    public AdtsReader(boolean z, String str, int i, String str2) {
        this.f3408a = z;
        this.d = str;
        this.e = i;
        this.f = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0207  */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(androidx.media3.common.util.ParsableByteArray r24) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ts.AdtsReader.a(androidx.media3.common.util.ParsableByteArray):void");
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void b() {
        this.u = -9223372036854775807L;
        this.n = false;
        this.j = 0;
        this.k = 0;
        this.l = 256;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void c(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.a();
        trackIdGenerator.b();
        this.g = trackIdGenerator.e;
        trackIdGenerator.b();
        TrackOutput trackOutputJ = extractorOutput.j(trackIdGenerator.d, 1);
        this.h = trackOutputJ;
        this.v = trackOutputJ;
        if (!this.f3408a) {
            this.i = new DiscardingTrackOutput();
            return;
        }
        trackIdGenerator.a();
        trackIdGenerator.b();
        TrackOutput trackOutputJ2 = extractorOutput.j(trackIdGenerator.d, 5);
        this.i = trackOutputJ2;
        Format.Builder builder = new Format.Builder();
        trackIdGenerator.b();
        builder.f2855a = trackIdGenerator.e;
        builder.l = MimeTypes.m(this.f);
        builder.m = MimeTypes.m("application/id3");
        trackOutputJ2.e(new Format(builder));
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void d(int i, long j) {
        this.u = j;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void e(boolean z) {
    }
}
