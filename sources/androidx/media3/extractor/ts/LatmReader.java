package androidx.media3.extractor.ts;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.ts.TsPayloadReader;
import java.util.Collections;
import org.bouncycastle.asn1.BERTags;

@UnstableApi
/* loaded from: classes2.dex */
public final class LatmReader implements ElementaryStreamReader {

    /* renamed from: a, reason: collision with root package name */
    public final String f3423a;
    public final int b;
    public final ParsableByteArray c;
    public final ParsableBitArray d;
    public TrackOutput e;
    public String f;
    public Format g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public long r;
    public int s;
    public long t;
    public int u;
    public String v;

    public LatmReader(String str, int i) {
        this.f3423a = str;
        this.b = i;
        ParsableByteArray parsableByteArray = new ParsableByteArray(1024);
        this.c = parsableByteArray;
        byte[] bArr = parsableByteArray.f2922a;
        this.d = new ParsableBitArray(bArr, bArr.length);
        this.l = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void a(ParsableByteArray parsableByteArray) throws ParserException {
        int iG;
        boolean zF;
        Assertions.g(this.e);
        while (parsableByteArray.a() > 0) {
            int i = this.h;
            if (i != 0) {
                if (i != 1) {
                    ParsableByteArray parsableByteArray2 = this.c;
                    ParsableBitArray parsableBitArray = this.d;
                    if (i == 2) {
                        int iU = ((this.k & (-225)) << 8) | parsableByteArray.u();
                        this.j = iU;
                        if (iU > parsableByteArray2.f2922a.length) {
                            parsableByteArray2.D(iU);
                            byte[] bArr = parsableByteArray2.f2922a;
                            parsableBitArray.getClass();
                            parsableBitArray.k(bArr.length, bArr);
                        }
                        this.i = 0;
                        this.h = 3;
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(parsableByteArray.a(), this.j - this.i);
                        parsableByteArray.e(this.i, iMin, parsableBitArray.f2921a);
                        int i2 = this.i + iMin;
                        this.i = i2;
                        if (i2 == this.j) {
                            parsableBitArray.m(0);
                            if (parsableBitArray.f()) {
                                if (this.m) {
                                }
                                this.h = 0;
                            } else {
                                this.m = true;
                                int iG2 = parsableBitArray.g(1);
                                int iG3 = iG2 == 1 ? parsableBitArray.g(1) : 0;
                                this.n = iG3;
                                if (iG3 != 0) {
                                    throw ParserException.a(null, null);
                                }
                                if (iG2 == 1) {
                                    parsableBitArray.g((parsableBitArray.g(2) + 1) * 8);
                                }
                                if (!parsableBitArray.f()) {
                                    throw ParserException.a(null, null);
                                }
                                this.o = parsableBitArray.g(6);
                                int iG4 = parsableBitArray.g(4);
                                int iG5 = parsableBitArray.g(3);
                                if (iG4 != 0 || iG5 != 0) {
                                    throw ParserException.a(null, null);
                                }
                                if (iG2 == 0) {
                                    int iE = parsableBitArray.e();
                                    int iB = parsableBitArray.b();
                                    AacUtil.Config configB = AacUtil.b(parsableBitArray, true);
                                    this.v = configB.c;
                                    this.s = configB.f3217a;
                                    this.u = configB.b;
                                    int iB2 = iB - parsableBitArray.b();
                                    parsableBitArray.m(iE);
                                    byte[] bArr2 = new byte[(iB2 + 7) / 8];
                                    parsableBitArray.h(iB2, bArr2);
                                    Format.Builder builder = new Format.Builder();
                                    builder.f2855a = this.f;
                                    builder.l = MimeTypes.m("video/mp2t");
                                    builder.m = MimeTypes.m("audio/mp4a-latm");
                                    builder.j = this.v;
                                    builder.C = this.u;
                                    builder.D = this.s;
                                    builder.p = Collections.singletonList(bArr2);
                                    builder.d = this.f3423a;
                                    builder.f = this.b;
                                    Format format = new Format(builder);
                                    if (!format.equals(this.g)) {
                                        this.g = format;
                                        this.t = 1024000000 / format.E;
                                        this.e.e(format);
                                    }
                                } else {
                                    int iB3 = parsableBitArray.b();
                                    AacUtil.Config configB2 = AacUtil.b(parsableBitArray, true);
                                    this.v = configB2.c;
                                    this.s = configB2.f3217a;
                                    this.u = configB2.b;
                                    parsableBitArray.o(parsableBitArray.g((parsableBitArray.g(2) + 1) * 8) - (iB3 - parsableBitArray.b()));
                                }
                                int iG6 = parsableBitArray.g(3);
                                this.p = iG6;
                                if (iG6 == 0) {
                                    parsableBitArray.o(8);
                                } else if (iG6 == 1) {
                                    parsableBitArray.o(9);
                                } else if (iG6 == 3 || iG6 == 4 || iG6 == 5) {
                                    parsableBitArray.o(6);
                                } else {
                                    if (iG6 != 6 && iG6 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    parsableBitArray.o(1);
                                }
                                boolean zF2 = parsableBitArray.f();
                                this.q = zF2;
                                this.r = 0L;
                                if (zF2) {
                                    if (iG2 == 1) {
                                        this.r = parsableBitArray.g((parsableBitArray.g(2) + 1) * 8);
                                    } else {
                                        do {
                                            zF = parsableBitArray.f();
                                            this.r = (this.r << 8) + parsableBitArray.g(8);
                                        } while (zF);
                                    }
                                }
                                if (parsableBitArray.f()) {
                                    parsableBitArray.o(8);
                                }
                            }
                            if (this.n != 0) {
                                throw ParserException.a(null, null);
                            }
                            if (this.o != 0) {
                                throw ParserException.a(null, null);
                            }
                            if (this.p != 0) {
                                throw ParserException.a(null, null);
                            }
                            int i3 = 0;
                            do {
                                iG = parsableBitArray.g(8);
                                i3 += iG;
                            } while (iG == 255);
                            int iE2 = parsableBitArray.e();
                            if ((iE2 & 7) == 0) {
                                parsableByteArray2.G(iE2 >> 3);
                            } else {
                                parsableBitArray.h(i3 * 8, parsableByteArray2.f2922a);
                                parsableByteArray2.G(0);
                            }
                            this.e.c(i3, parsableByteArray2);
                            Assertions.f(this.l != -9223372036854775807L);
                            this.e.g(this.l, 1, i3, 0, null);
                            this.l += this.t;
                            if (this.q) {
                                parsableBitArray.o((int) this.r);
                            }
                            this.h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iU2 = parsableByteArray.u();
                    if ((iU2 & BERTags.FLAGS) == 224) {
                        this.k = iU2;
                        this.h = 2;
                    } else if (iU2 != 86) {
                        this.h = 0;
                    }
                }
            } else if (parsableByteArray.u() == 86) {
                this.h = 1;
            }
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void b() {
        this.h = 0;
        this.l = -9223372036854775807L;
        this.m = false;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void c(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.a();
        trackIdGenerator.b();
        this.e = extractorOutput.j(trackIdGenerator.d, 1);
        trackIdGenerator.b();
        this.f = trackIdGenerator.e;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void d(int i, long j) {
        this.l = j;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void e(boolean z) {
    }
}
