package androidx.media3.extractor.ts;

import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.ts.TsPayloadReader;

@UnstableApi
/* loaded from: classes2.dex */
public final class Ac3Reader implements ElementaryStreamReader {

    /* renamed from: a, reason: collision with root package name */
    public final ParsableBitArray f3404a;
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

    public Ac3Reader(String str) {
        this(null, 0, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02bf  */
    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(androidx.media3.common.util.ParsableByteArray r23) {
        /*
            Method dump skipped, instructions count: 967
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ts.Ac3Reader.a(androidx.media3.common.util.ParsableByteArray):void");
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

    public Ac3Reader(String str, int i, String str2) {
        ParsableBitArray parsableBitArray = new ParsableBitArray(new byte[128], 128);
        this.f3404a = parsableBitArray;
        this.b = new ParsableByteArray(parsableBitArray.f2921a);
        this.h = 0;
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }
}
