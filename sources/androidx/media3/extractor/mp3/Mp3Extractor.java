package androidx.media3.extractor.mp3;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ConstantBitrateSeekMap;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.Id3Peeker;
import androidx.media3.extractor.MpegAudioUtil;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import java.io.EOFException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@UnstableApi
/* loaded from: classes2.dex */
public final class Mp3Extractor implements Extractor {
    public final DiscardingTrackOutput e;
    public ExtractorOutput f;
    public TrackOutput g;
    public TrackOutput h;
    public int i;
    public Metadata j;
    public long l;
    public long m;
    public long n;
    public int o;
    public Seeker p;
    public boolean q;
    public boolean r;
    public long s;

    /* renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f3311a = new ParsableByteArray(10);
    public final MpegAudioUtil.Header b = new MpegAudioUtil.Header();
    public final GaplessInfoHolder c = new GaplessInfoHolder();
    public long k = -9223372036854775807L;
    public final Id3Peeker d = new Id3Peeker();

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public Mp3Extractor() {
        DiscardingTrackOutput discardingTrackOutput = new DiscardingTrackOutput();
        this.e = discardingTrackOutput;
        this.h = discardingTrackOutput;
        this.n = -1L;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void a(long j, long j2) {
        this.i = 0;
        this.k = -9223372036854775807L;
        this.l = 0L;
        this.o = 0;
        this.s = j2;
        if (this.p instanceof IndexSeeker) {
            throw null;
        }
    }

    public final void b() {
        SeekMap seekMap = this.p;
        if ((seekMap instanceof ConstantBitrateSeeker) && ((ConstantBitrateSeekMap) seekMap).d()) {
            long j = this.n;
            if (j == -1 || j == this.p.g()) {
                return;
            }
            ConstantBitrateSeeker constantBitrateSeeker = (ConstantBitrateSeeker) this.p;
            this.p = new ConstantBitrateSeeker(this.n, constantBitrateSeeker.h, constantBitrateSeeker.i, constantBitrateSeeker.j, constantBitrateSeeker.k);
            ExtractorOutput extractorOutput = this.f;
            extractorOutput.getClass();
            extractorOutput.q(this.p);
            TrackOutput trackOutput = this.g;
            trackOutput.getClass();
            this.p.l();
            trackOutput.d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(androidx.media3.extractor.ExtractorInput r9) {
        /*
            r8 = this;
            androidx.media3.extractor.mp3.Seeker r0 = r8.p
            r1 = 1
            if (r0 == 0) goto L1b
            long r2 = r0.g()
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L1b
            long r4 = r9.j()
            r6 = 4
            long r2 = r2 - r6
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1b
            goto L27
        L1b:
            androidx.media3.common.util.ParsableByteArray r0 = r8.f3311a     // Catch: java.io.EOFException -> L27
            byte[] r0 = r0.f2922a     // Catch: java.io.EOFException -> L27
            r2 = 0
            r3 = 4
            boolean r9 = r9.h(r0, r2, r3, r1)     // Catch: java.io.EOFException -> L27
            r9 = r9 ^ r1
            return r9
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp3.Mp3Extractor.d(androidx.media3.extractor.ExtractorInput):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0339 A[LOOP:2: B:144:0x0337->B:145:0x0339, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // androidx.media3.extractor.Extractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(androidx.media3.extractor.ExtractorInput r47, androidx.media3.extractor.PositionHolder r48) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp3.Mp3Extractor.f(androidx.media3.extractor.ExtractorInput, androidx.media3.extractor.PositionHolder):int");
    }

    public final boolean g(ExtractorInput extractorInput, boolean z) throws Throwable {
        int iJ;
        int i;
        int iA;
        int i2 = z ? 32768 : 131072;
        extractorInput.i();
        if (extractorInput.getPosition() == 0) {
            Metadata metadataA = this.d.a(extractorInput, null);
            this.j = metadataA;
            if (metadataA != null) {
                this.c.b(metadataA);
            }
            iJ = (int) extractorInput.j();
            if (!z) {
                extractorInput.l(iJ);
            }
            i = 0;
        } else {
            iJ = 0;
            i = 0;
        }
        int i3 = i;
        int i4 = i3;
        while (true) {
            if (!d(extractorInput)) {
                ParsableByteArray parsableByteArray = this.f3311a;
                parsableByteArray.G(0);
                int iG = parsableByteArray.g();
                if ((i == 0 || ((-128000) & iG) == (i & (-128000))) && (iA = MpegAudioUtil.a(iG)) != -1) {
                    i3++;
                    if (i3 != 1) {
                        if (i3 == 4) {
                            break;
                        }
                    } else {
                        this.b.a(iG);
                        i = iG;
                    }
                    extractorInput.k(iA - 4);
                } else {
                    int i5 = i4 + 1;
                    if (i4 == i2) {
                        if (z) {
                            return false;
                        }
                        b();
                        throw new EOFException();
                    }
                    if (z) {
                        extractorInput.i();
                        extractorInput.k(iJ + i5);
                    } else {
                        extractorInput.l(1);
                    }
                    i3 = 0;
                    i4 = i5;
                    i = 0;
                }
            } else if (i3 <= 0) {
                b();
                throw new EOFException();
            }
        }
        if (z) {
            extractorInput.l(iJ + i4);
        } else {
            extractorInput.i();
        }
        this.i = i;
        return true;
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean i(ExtractorInput extractorInput) {
        return g(extractorInput, true);
    }

    @Override // androidx.media3.extractor.Extractor
    public final void j(ExtractorOutput extractorOutput) {
        this.f = extractorOutput;
        TrackOutput trackOutputJ = extractorOutput.j(0, 1);
        this.g = trackOutputJ;
        this.h = trackOutputJ;
        this.f.h();
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }
}
