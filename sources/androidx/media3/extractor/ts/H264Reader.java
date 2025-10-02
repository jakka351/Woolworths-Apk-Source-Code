package androidx.media3.extractor.ts;

import android.util.SparseArray;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.container.ParsableNalUnitBitArray;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.ts.TsPayloadReader;

@UnstableApi
/* loaded from: classes2.dex */
public final class H264Reader implements ElementaryStreamReader {

    /* renamed from: a, reason: collision with root package name */
    public final SeiReader f3417a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public TrackOutput j;
    public SampleReader k;
    public boolean l;
    public boolean n;
    public final boolean[] h = new boolean[3];
    public final NalUnitTargetBuffer d = new NalUnitTargetBuffer(7);
    public final NalUnitTargetBuffer e = new NalUnitTargetBuffer(8);
    public final NalUnitTargetBuffer f = new NalUnitTargetBuffer(6);
    public long m = -9223372036854775807L;
    public final ParsableByteArray o = new ParsableByteArray();

    public static final class SampleReader {

        /* renamed from: a, reason: collision with root package name */
        public final TrackOutput f3418a;
        public final boolean b;
        public final boolean c;
        public final ParsableNalUnitBitArray f;
        public byte[] g;
        public int h;
        public int i;
        public long j;
        public long l;
        public long p;
        public long q;
        public boolean r;
        public boolean s;
        public final SparseArray d = new SparseArray();
        public final SparseArray e = new SparseArray();
        public SliceHeaderData m = new SliceHeaderData();
        public SliceHeaderData n = new SliceHeaderData();
        public boolean k = false;
        public boolean o = false;

        public static final class SliceHeaderData {

            /* renamed from: a, reason: collision with root package name */
            public boolean f3419a;
            public boolean b;
            public NalUnitUtil.SpsData c;
            public int d;
            public int e;
            public int f;
            public int g;
            public boolean h;
            public boolean i;
            public boolean j;
            public boolean k;
            public int l;
            public int m;
            public int n;
            public int o;
            public int p;
        }

        public SampleReader(TrackOutput trackOutput, boolean z, boolean z2) {
            this.f3418a = trackOutput;
            this.b = z;
            this.c = z2;
            byte[] bArr = new byte[128];
            this.g = bArr;
            this.f = new ParsableNalUnitBitArray(bArr, 0, 0);
            SliceHeaderData sliceHeaderData = this.n;
            sliceHeaderData.b = false;
            sliceHeaderData.f3419a = false;
        }
    }

    public H264Reader(SeiReader seiReader, boolean z, boolean z2) {
        this.f3417a = seiReader;
        this.b = z;
        this.c = z2;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void a(ParsableByteArray parsableByteArray) {
        int i;
        Assertions.g(this.j);
        int i2 = Util.f2928a;
        int i3 = parsableByteArray.b;
        int i4 = parsableByteArray.c;
        byte[] bArr = parsableByteArray.f2922a;
        this.g += parsableByteArray.a();
        this.j.c(parsableByteArray.a(), parsableByteArray);
        while (true) {
            int iB = NalUnitUtil.b(bArr, i3, i4, this.h);
            if (iB == i4) {
                g(i3, i4, bArr);
                return;
            }
            int i5 = bArr[iB + 3] & 31;
            if (iB <= 0 || bArr[iB - 1] != 0) {
                i = 3;
            } else {
                iB--;
                i = 4;
            }
            int i6 = iB - i3;
            if (i6 > 0) {
                g(i3, iB, bArr);
            }
            int i7 = i4 - iB;
            long j = this.g - i7;
            f(i7, i6 < 0 ? -i6 : 0, j, this.m);
            h(i5, j, this.m);
            i3 = iB + i;
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void b() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        NalUnitUtil.a(this.h);
        this.d.c();
        this.e.c();
        this.f.c();
        this.f3417a.c.b(0);
        SampleReader sampleReader = this.k;
        if (sampleReader != null) {
            sampleReader.k = false;
            sampleReader.o = false;
            SampleReader.SliceHeaderData sliceHeaderData = sampleReader.n;
            sliceHeaderData.b = false;
            sliceHeaderData.f3419a = false;
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void c(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.a();
        trackIdGenerator.b();
        this.i = trackIdGenerator.e;
        trackIdGenerator.b();
        TrackOutput trackOutputJ = extractorOutput.j(trackIdGenerator.d, 2);
        this.j = trackOutputJ;
        this.k = new SampleReader(trackOutputJ, this.b, this.c);
        this.f3417a.a(extractorOutput, trackIdGenerator);
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void d(int i, long j) {
        this.m = j;
        this.n = ((i & 2) != 0) | this.n;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void e(boolean z) {
        Assertions.g(this.j);
        int i = Util.f2928a;
        if (z) {
            this.f3417a.c.b(0);
            f(0, 0, this.g, this.m);
            h(9, this.g, this.m);
            f(0, 0, this.g, this.m);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(int r18, int r19, long r20, long r22) {
        /*
            Method dump skipped, instructions count: 621
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ts.H264Reader.f(int, int, long, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(int r17, int r18, byte[] r19) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ts.H264Reader.g(int, int, byte[]):void");
    }

    public final void h(int i, long j, long j2) {
        if (!this.l || this.k.c) {
            this.d.d(i);
            this.e.d(i);
        }
        this.f.d(i);
        SampleReader sampleReader = this.k;
        boolean z = this.n;
        sampleReader.i = i;
        sampleReader.l = j2;
        sampleReader.j = j;
        sampleReader.s = z;
        if (!sampleReader.b || i != 1) {
            if (!sampleReader.c) {
                return;
            }
            if (i != 5 && i != 1 && i != 2) {
                return;
            }
        }
        SampleReader.SliceHeaderData sliceHeaderData = sampleReader.m;
        sampleReader.m = sampleReader.n;
        sampleReader.n = sliceHeaderData;
        sliceHeaderData.b = false;
        sliceHeaderData.f3419a = false;
        sampleReader.h = 0;
        sampleReader.k = true;
    }
}
