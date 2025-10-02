package androidx.media3.extractor.ts;

import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.ts.MpeghUtil;
import androidx.media3.extractor.ts.TsPayloadReader;

@UnstableApi
/* loaded from: classes2.dex */
public final class MpeghReader implements ElementaryStreamReader {
    public String e;
    public TrackOutput f;
    public boolean i;
    public int k;
    public int l;
    public int n;
    public int o;
    public int s;
    public boolean u;
    public int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f3425a = new ParsableByteArray(new byte[15], 2);
    public final ParsableBitArray b = new ParsableBitArray();
    public final ParsableByteArray c = new ParsableByteArray();
    public final MpeghUtil.MhasPacketHeader p = new MpeghUtil.MhasPacketHeader();
    public int q = -2147483647;
    public int r = -1;
    public long t = -1;
    public boolean j = true;
    public boolean m = true;
    public double g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x041d  */
    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(androidx.media3.common.util.ParsableByteArray r24) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 1374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ts.MpeghReader.a(androidx.media3.common.util.ParsableByteArray):void");
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void b() {
        this.d = 0;
        this.l = 0;
        this.f3425a.D(2);
        this.n = 0;
        this.o = 0;
        this.q = -2147483647;
        this.r = -1;
        this.s = 0;
        this.t = -1L;
        this.u = false;
        this.i = false;
        this.m = true;
        this.j = true;
        this.g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void c(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.a();
        trackIdGenerator.b();
        this.e = trackIdGenerator.e;
        trackIdGenerator.b();
        this.f = extractorOutput.j(trackIdGenerator.d, 1);
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void d(int i, long j) {
        this.k = i;
        if (!this.j && (this.o != 0 || !this.m)) {
            this.i = true;
        }
        if (j != -9223372036854775807L) {
            if (this.i) {
                this.h = j;
            } else {
                this.g = j;
            }
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void e(boolean z) {
    }
}
