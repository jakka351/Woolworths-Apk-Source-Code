package androidx.media3.extractor.ts;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.ts.TsPayloadReader;
import java.util.Arrays;

@UnstableApi
/* loaded from: classes2.dex */
public final class H263Reader implements ElementaryStreamReader {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final UserDataReader f3414a;
    public final ParsableByteArray b;
    public final boolean[] c = new boolean[4];
    public final CsdBuffer d;
    public final NalUnitTargetBuffer e;
    public SampleReader f;
    public long g;
    public String h;
    public TrackOutput i;
    public boolean j;
    public long k;

    public static final class CsdBuffer {
        public static final byte[] f = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        public boolean f3415a;
        public int b;
        public int c;
        public int d;
        public byte[] e;

        public final void a(int i, int i2, byte[] bArr) {
            if (this.f3415a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.e;
                int length = bArr2.length;
                int i4 = this.c + i3;
                if (length < i4) {
                    this.e = Arrays.copyOf(bArr2, i4 * 2);
                }
                System.arraycopy(bArr, i, this.e, this.c, i3);
                this.c += i3;
            }
        }
    }

    public static final class SampleReader {

        /* renamed from: a, reason: collision with root package name */
        public final TrackOutput f3416a;
        public boolean b;
        public boolean c;
        public boolean d;
        public int e;
        public int f;
        public long g;
        public long h;

        public SampleReader(TrackOutput trackOutput) {
            this.f3416a = trackOutput;
        }

        public final void a(int i, int i2, byte[] bArr) {
            if (this.c) {
                int i3 = this.f;
                int i4 = (i + 1) - i3;
                if (i4 >= i2) {
                    this.f = (i2 - i) + i3;
                } else {
                    this.d = ((bArr[i4] & 192) >> 6) == 0;
                    this.c = false;
                }
            }
        }

        public final void b(long j, int i, boolean z) {
            Assertions.f(this.h != -9223372036854775807L);
            if (this.e == 182 && z && this.b) {
                this.f3416a.g(this.h, this.d ? 1 : 0, (int) (j - this.g), i, null);
            }
            if (this.e != 179) {
                this.g = j;
            }
        }
    }

    public H263Reader(UserDataReader userDataReader) {
        this.f3414a = userDataReader;
        CsdBuffer csdBuffer = new CsdBuffer();
        csdBuffer.e = new byte[128];
        this.d = csdBuffer;
        this.k = -9223372036854775807L;
        this.e = new NalUnitTargetBuffer(178);
        this.b = new ParsableByteArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0237  */
    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(androidx.media3.common.util.ParsableByteArray r20) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ts.H263Reader.a(androidx.media3.common.util.ParsableByteArray):void");
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void b() {
        NalUnitUtil.a(this.c);
        CsdBuffer csdBuffer = this.d;
        csdBuffer.f3415a = false;
        csdBuffer.c = 0;
        csdBuffer.b = 0;
        SampleReader sampleReader = this.f;
        if (sampleReader != null) {
            sampleReader.b = false;
            sampleReader.c = false;
            sampleReader.d = false;
            sampleReader.e = -1;
        }
        NalUnitTargetBuffer nalUnitTargetBuffer = this.e;
        if (nalUnitTargetBuffer != null) {
            nalUnitTargetBuffer.c();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void c(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.a();
        trackIdGenerator.b();
        this.h = trackIdGenerator.e;
        trackIdGenerator.b();
        TrackOutput trackOutputJ = extractorOutput.j(trackIdGenerator.d, 2);
        this.i = trackOutputJ;
        this.f = new SampleReader(trackOutputJ);
        this.f3414a.b(extractorOutput, trackIdGenerator);
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void d(int i, long j) {
        this.k = j;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void e(boolean z) {
        Assertions.g(this.f);
        if (z) {
            this.f.b(this.g, 0, this.j);
            SampleReader sampleReader = this.f;
            sampleReader.b = false;
            sampleReader.c = false;
            sampleReader.d = false;
            sampleReader.e = -1;
        }
    }
}
