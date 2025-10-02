package androidx.media3.extractor.amr;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.LongArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ConstantBitrateSeekMap;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.IndexSeekMap;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

@UnstableApi
/* loaded from: classes2.dex */
public final class AmrExtractor implements Extractor {
    public static final int[] q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] r = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] s;
    public static final byte[] t;
    public final DiscardingTrackOutput b;
    public boolean c;
    public long d;
    public int e;
    public int f;
    public int h;
    public long i;
    public ExtractorOutput j;
    public TrackOutput k;
    public TrackOutput l;
    public SeekMap m;
    public boolean n;
    public long o;
    public boolean p;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3259a = new byte[1];
    public int g = -1;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    static {
        int i = Util.f2928a;
        Charset charset = StandardCharsets.UTF_8;
        s = "#!AMR\n".getBytes(charset);
        t = "#!AMR-WB\n".getBytes(charset);
    }

    public AmrExtractor() {
        DiscardingTrackOutput discardingTrackOutput = new DiscardingTrackOutput();
        this.b = discardingTrackOutput;
        this.l = discardingTrackOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void a(long j, long j2) {
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        this.o = j2;
        SeekMap seekMap = this.m;
        if (!(seekMap instanceof IndexSeekMap)) {
            if (j == 0 || !(seekMap instanceof ConstantBitrateSeekMap)) {
                this.i = 0L;
                return;
            } else {
                this.i = (Math.max(0L, j - ((ConstantBitrateSeekMap) seekMap).b) * 8000000) / r7.e;
                return;
            }
        }
        IndexSeekMap indexSeekMap = (IndexSeekMap) seekMap;
        LongArray longArray = indexSeekMap.b;
        long jC = longArray.f2915a == 0 ? -9223372036854775807L : longArray.c(Util.b(indexSeekMap.f3245a, j));
        this.i = jC;
        if (Math.abs(this.o - jC) < DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT) {
            return;
        }
        this.n = true;
        this.l = this.b;
    }

    public final int b(ExtractorInput extractorInput) throws ParserException {
        boolean z;
        extractorInput.i();
        byte[] bArr = this.f3259a;
        extractorInput.b(0, 1, bArr);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw ParserException.a(null, "Invalid padding bits for frame header " + ((int) b));
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z = this.c) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
            return z ? r[i] : q[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw ParserException.a(null, sb.toString());
    }

    public final boolean d(ExtractorInput extractorInput) {
        extractorInput.i();
        byte[] bArr = s;
        byte[] bArr2 = new byte[bArr.length];
        extractorInput.b(0, bArr.length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.c = false;
            extractorInput.l(bArr.length);
            return true;
        }
        extractorInput.i();
        byte[] bArr3 = t;
        byte[] bArr4 = new byte[bArr3.length];
        extractorInput.b(0, bArr3.length, bArr4);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.c = true;
        extractorInput.l(bArr3.length);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00f0 A[PHI: r4
  0x00f0: PHI (r4v1 androidx.media3.extractor.ExtractorInput) = (r4v0 androidx.media3.extractor.ExtractorInput), (r4v5 androidx.media3.extractor.ExtractorInput) binds: [B:53:0x00ee, B:56:0x00fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ff  */
    @Override // androidx.media3.extractor.Extractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(androidx.media3.extractor.ExtractorInput r18, androidx.media3.extractor.PositionHolder r19) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.amr.AmrExtractor.f(androidx.media3.extractor.ExtractorInput, androidx.media3.extractor.PositionHolder):int");
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean i(ExtractorInput extractorInput) {
        return d(extractorInput);
    }

    @Override // androidx.media3.extractor.Extractor
    public final void j(ExtractorOutput extractorOutput) {
        this.j = extractorOutput;
        TrackOutput trackOutputJ = extractorOutput.j(0, 1);
        this.k = trackOutputJ;
        this.l = trackOutputJ;
        extractorOutput.h();
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }
}
