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
public final class H262Reader implements ElementaryStreamReader {
    public static final double[] r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    public String f3412a;
    public TrackOutput b;
    public final UserDataReader c;
    public final String d;
    public final ParsableByteArray e;
    public final NalUnitTargetBuffer f;
    public final boolean[] g = new boolean[4];
    public final CsdBuffer h;
    public long i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;
    public long n;
    public long o;
    public boolean p;
    public boolean q;

    public static final class CsdBuffer {
        public static final byte[] e = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        public boolean f3413a;
        public int b;
        public int c;
        public byte[] d;

        public final void a(int i, int i2, byte[] bArr) {
            if (this.f3413a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.d;
                int length = bArr2.length;
                int i4 = this.b + i3;
                if (length < i4) {
                    this.d = Arrays.copyOf(bArr2, i4 * 2);
                }
                System.arraycopy(bArr, i, this.d, this.b, i3);
                this.b += i3;
            }
        }
    }

    public H262Reader(UserDataReader userDataReader, String str) {
        this.c = userDataReader;
        this.d = str;
        CsdBuffer csdBuffer = new CsdBuffer();
        csdBuffer.d = new byte[128];
        this.h = csdBuffer;
        if (userDataReader != null) {
            this.f = new NalUnitTargetBuffer(178);
            this.e = new ParsableByteArray();
        } else {
            this.f = null;
            this.e = null;
        }
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0201  */
    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(androidx.media3.common.util.ParsableByteArray r23) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ts.H262Reader.a(androidx.media3.common.util.ParsableByteArray):void");
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void b() {
        NalUnitUtil.a(this.g);
        CsdBuffer csdBuffer = this.h;
        csdBuffer.f3413a = false;
        csdBuffer.b = 0;
        csdBuffer.c = 0;
        NalUnitTargetBuffer nalUnitTargetBuffer = this.f;
        if (nalUnitTargetBuffer != null) {
            nalUnitTargetBuffer.c();
        }
        this.i = 0L;
        this.j = false;
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void c(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.a();
        trackIdGenerator.b();
        this.f3412a = trackIdGenerator.e;
        trackIdGenerator.b();
        this.b = extractorOutput.j(trackIdGenerator.d, 2);
        UserDataReader userDataReader = this.c;
        if (userDataReader != null) {
            userDataReader.b(extractorOutput, trackIdGenerator);
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void d(int i, long j) {
        this.m = j;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void e(boolean z) {
        Assertions.g(this.b);
        if (z) {
            boolean z2 = this.p;
            this.b.g(this.o, z2 ? 1 : 0, (int) (this.i - this.n), 0, null);
        }
    }
}
