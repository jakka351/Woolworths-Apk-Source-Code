package androidx.media3.extractor.ts;

import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.container.ReorderingSeiMessageQueue;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.ts.TsPayloadReader;
import com.google.common.base.Preconditions;
import java.util.Collections;

@UnstableApi
/* loaded from: classes2.dex */
public final class H265Reader implements ElementaryStreamReader {

    /* renamed from: a, reason: collision with root package name */
    public final SeiReader f3420a;
    public String b;
    public TrackOutput c;
    public SampleReader d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final NalUnitTargetBuffer g = new NalUnitTargetBuffer(32);
    public final NalUnitTargetBuffer h = new NalUnitTargetBuffer(33);
    public final NalUnitTargetBuffer i = new NalUnitTargetBuffer(34);
    public final NalUnitTargetBuffer j = new NalUnitTargetBuffer(39);
    public final NalUnitTargetBuffer k = new NalUnitTargetBuffer(40);
    public long m = -9223372036854775807L;
    public final ParsableByteArray n = new ParsableByteArray();

    public static final class SampleReader {

        /* renamed from: a, reason: collision with root package name */
        public final TrackOutput f3421a;
        public long b;
        public boolean c;
        public int d;
        public long e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public boolean j;
        public long k;
        public long l;
        public boolean m;

        public SampleReader(TrackOutput trackOutput) {
            this.f3421a = trackOutput;
        }

        public final void a(int i) {
            long j = this.l;
            if (j != -9223372036854775807L) {
                long j2 = this.b;
                long j3 = this.k;
                if (j2 == j3) {
                    return;
                }
                int i2 = (int) (j2 - j3);
                this.f3421a.g(j, this.m ? 1 : 0, i2, i, null);
            }
        }
    }

    public H265Reader(SeiReader seiReader) {
        this.f3420a = seiReader;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void a(ParsableByteArray parsableByteArray) {
        int i;
        Assertions.g(this.c);
        int i2 = Util.f2928a;
        while (parsableByteArray.a() > 0) {
            int i3 = parsableByteArray.b;
            int i4 = parsableByteArray.c;
            byte[] bArr = parsableByteArray.f2922a;
            this.l += parsableByteArray.a();
            this.c.c(parsableByteArray.a(), parsableByteArray);
            while (i3 < i4) {
                int iB = NalUnitUtil.b(bArr, i3, i4, this.f);
                if (iB == i4) {
                    g(i3, i4, bArr);
                    return;
                }
                int i5 = (bArr[iB + 3] & 126) >> 1;
                if (iB <= 0 || bArr[iB - 1] != 0) {
                    i = 3;
                } else {
                    iB--;
                    i = 4;
                }
                int i6 = iB;
                int i7 = i;
                int i8 = i6 - i3;
                if (i8 > 0) {
                    g(i3, i6, bArr);
                }
                int i9 = i4 - i6;
                long j = this.l - i9;
                f(i9, i8 < 0 ? -i8 : 0, j, this.m);
                h(i9, i5, j, this.m);
                i3 = i6 + i7;
            }
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void b() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        NalUnitUtil.a(this.f);
        this.g.c();
        this.h.c();
        this.i.c();
        this.j.c();
        this.k.c();
        this.f3420a.c.b(0);
        SampleReader sampleReader = this.d;
        if (sampleReader != null) {
            sampleReader.f = false;
            sampleReader.g = false;
            sampleReader.h = false;
            sampleReader.i = false;
            sampleReader.j = false;
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void c(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.a();
        trackIdGenerator.b();
        this.b = trackIdGenerator.e;
        trackIdGenerator.b();
        TrackOutput trackOutputJ = extractorOutput.j(trackIdGenerator.d, 2);
        this.c = trackOutputJ;
        this.d = new SampleReader(trackOutputJ);
        this.f3420a.a(extractorOutput, trackIdGenerator);
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void d(int i, long j) {
        this.m = j;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void e(boolean z) {
        Assertions.g(this.c);
        int i = Util.f2928a;
        if (z) {
            this.f3420a.c.b(0);
            f(0, 0, this.l, this.m);
            h(0, 48, this.l, this.m);
        }
    }

    public final void f(int i, int i2, long j, long j2) {
        ReorderingSeiMessageQueue reorderingSeiMessageQueue = this.f3420a.c;
        SampleReader sampleReader = this.d;
        boolean z = this.e;
        if (sampleReader.j && sampleReader.g) {
            sampleReader.m = sampleReader.c;
            sampleReader.j = false;
        } else if (sampleReader.h || sampleReader.g) {
            if (z && sampleReader.i) {
                sampleReader.a(i + ((int) (j - sampleReader.b)));
            }
            sampleReader.k = sampleReader.b;
            sampleReader.l = sampleReader.e;
            sampleReader.m = sampleReader.c;
            sampleReader.i = true;
        }
        if (!this.e) {
            NalUnitTargetBuffer nalUnitTargetBuffer = this.g;
            nalUnitTargetBuffer.b(i2);
            NalUnitTargetBuffer nalUnitTargetBuffer2 = this.h;
            nalUnitTargetBuffer2.b(i2);
            NalUnitTargetBuffer nalUnitTargetBuffer3 = this.i;
            nalUnitTargetBuffer3.b(i2);
            if (nalUnitTargetBuffer.c && nalUnitTargetBuffer2.c && nalUnitTargetBuffer3.c) {
                String str = this.b;
                int i3 = nalUnitTargetBuffer.e;
                byte[] bArr = new byte[nalUnitTargetBuffer2.e + i3 + nalUnitTargetBuffer3.e];
                System.arraycopy(nalUnitTargetBuffer.d, 0, bArr, 0, i3);
                System.arraycopy(nalUnitTargetBuffer2.d, 0, bArr, nalUnitTargetBuffer.e, nalUnitTargetBuffer2.e);
                System.arraycopy(nalUnitTargetBuffer3.d, 0, bArr, nalUnitTargetBuffer.e + nalUnitTargetBuffer2.e, nalUnitTargetBuffer3.e);
                NalUnitUtil.H265SpsData h265SpsDataH = NalUnitUtil.h(nalUnitTargetBuffer2.d, 3, nalUnitTargetBuffer2.e, null);
                NalUnitUtil.H265ProfileTierLevel h265ProfileTierLevel = h265SpsDataH.b;
                String strA = h265ProfileTierLevel != null ? CodecSpecificDataUtil.a(h265ProfileTierLevel.f2937a, h265ProfileTierLevel.b, h265ProfileTierLevel.c, h265ProfileTierLevel.d, h265ProfileTierLevel.e, h265ProfileTierLevel.f) : null;
                Format.Builder builder = new Format.Builder();
                builder.f2855a = str;
                builder.l = MimeTypes.m("video/mp2t");
                builder.m = MimeTypes.m("video/hevc");
                builder.j = strA;
                builder.t = h265SpsDataH.e;
                builder.u = h265SpsDataH.f;
                ColorInfo.Builder builder2 = new ColorInfo.Builder();
                builder2.f2850a = h265SpsDataH.i;
                builder2.b = h265SpsDataH.j;
                builder2.c = h265SpsDataH.k;
                builder2.e = h265SpsDataH.c + 8;
                builder2.f = h265SpsDataH.d + 8;
                builder.A = builder2.a();
                builder.x = h265SpsDataH.g;
                builder.o = h265SpsDataH.h;
                builder.B = h265SpsDataH.f2942a + 1;
                builder.p = Collections.singletonList(bArr);
                Format format = new Format(builder);
                this.c.e(format);
                int i4 = format.p;
                Preconditions.r(i4 != -1);
                reorderingSeiMessageQueue.getClass();
                Assertions.f(i4 >= 0);
                reorderingSeiMessageQueue.e = i4;
                reorderingSeiMessageQueue.b(i4);
                this.e = true;
            }
        }
        NalUnitTargetBuffer nalUnitTargetBuffer4 = this.j;
        boolean zB = nalUnitTargetBuffer4.b(i2);
        ParsableByteArray parsableByteArray = this.n;
        if (zB) {
            parsableByteArray.E(NalUnitUtil.l(nalUnitTargetBuffer4.e, nalUnitTargetBuffer4.d), nalUnitTargetBuffer4.d);
            parsableByteArray.H(5);
            reorderingSeiMessageQueue.a(j2, parsableByteArray);
        }
        NalUnitTargetBuffer nalUnitTargetBuffer5 = this.k;
        if (nalUnitTargetBuffer5.b(i2)) {
            parsableByteArray.E(NalUnitUtil.l(nalUnitTargetBuffer5.e, nalUnitTargetBuffer5.d), nalUnitTargetBuffer5.d);
            parsableByteArray.H(5);
            reorderingSeiMessageQueue.a(j2, parsableByteArray);
        }
    }

    public final void g(int i, int i2, byte[] bArr) {
        SampleReader sampleReader = this.d;
        if (sampleReader.f) {
            int i3 = sampleReader.d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                sampleReader.g = (bArr[i4] & 128) != 0;
                sampleReader.f = false;
            } else {
                sampleReader.d = (i2 - i) + i3;
            }
        }
        if (!this.e) {
            this.g.a(i, i2, bArr);
            this.h.a(i, i2, bArr);
            this.i.a(i, i2, bArr);
        }
        this.j.a(i, i2, bArr);
        this.k.a(i, i2, bArr);
    }

    public final void h(int i, int i2, long j, long j2) {
        SampleReader sampleReader = this.d;
        boolean z = this.e;
        sampleReader.g = false;
        sampleReader.h = false;
        sampleReader.e = j2;
        sampleReader.d = 0;
        sampleReader.b = j;
        if (i2 >= 32 && i2 != 40) {
            if (sampleReader.i && !sampleReader.j) {
                if (z) {
                    sampleReader.a(i);
                }
                sampleReader.i = false;
            }
            if ((32 <= i2 && i2 <= 35) || i2 == 39) {
                sampleReader.h = !sampleReader.j;
                sampleReader.j = true;
            }
        }
        boolean z2 = i2 >= 16 && i2 <= 21;
        sampleReader.c = z2;
        sampleReader.f = z2 || i2 <= 9;
        if (!this.e) {
            this.g.d(i2);
            this.h.d(i2);
            this.i.d(i2);
        }
        this.j.d(i2);
        this.k.d(i2);
    }
}
