package androidx.media3.extractor.mp4;

import android.util.Pair;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.container.Mp4Box;
import androidx.media3.container.Mp4TimestampData;
import androidx.media3.extractor.ExtractorUtil;
import java.nio.charset.StandardCharsets;

@UnstableApi
/* loaded from: classes2.dex */
public final class BoxParser {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f3315a;

    public static final class BtrtData {

        /* renamed from: a, reason: collision with root package name */
        public final long f3316a;
        public final long b;

        public BtrtData(long j, long j2) {
            this.f3316a = j;
            this.b = j2;
        }
    }

    public static final class ChunkIterator {

        /* renamed from: a, reason: collision with root package name */
        public final int f3317a;
        public int b;
        public int c;
        public long d;
        public final boolean e;
        public final ParsableByteArray f;
        public final ParsableByteArray g;
        public int h;
        public int i;

        public ChunkIterator(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, boolean z) throws ParserException {
            this.g = parsableByteArray;
            this.f = parsableByteArray2;
            this.e = z;
            parsableByteArray2.G(12);
            this.f3317a = parsableByteArray2.y();
            parsableByteArray.G(12);
            this.i = parsableByteArray.y();
            ExtractorUtil.a("first_chunk must be 1", parsableByteArray.g() == 1);
            this.b = -1;
        }

        public final boolean a() {
            int i = this.b + 1;
            this.b = i;
            if (i == this.f3317a) {
                return false;
            }
            boolean z = this.e;
            ParsableByteArray parsableByteArray = this.f;
            this.d = z ? parsableByteArray.z() : parsableByteArray.w();
            if (this.b == this.h) {
                ParsableByteArray parsableByteArray2 = this.g;
                this.c = parsableByteArray2.y();
                parsableByteArray2.H(4);
                int i2 = this.i - 1;
                this.i = i2;
                this.h = i2 > 0 ? parsableByteArray2.y() - 1 : -1;
            }
            return true;
        }
    }

    public static final class EsdsData {

        /* renamed from: a, reason: collision with root package name */
        public final String f3318a;
        public final byte[] b;
        public final long c;
        public final long d;

        public EsdsData(String str, byte[] bArr, long j, long j2) {
            this.f3318a = str;
            this.b = bArr;
            this.c = j;
            this.d = j2;
        }
    }

    public static final class EyesData {

        /* renamed from: a, reason: collision with root package name */
        public final StriData f3319a;

        public EyesData(StriData striData) {
            this.f3319a = striData;
        }
    }

    public static final class MdhdData {

        /* renamed from: a, reason: collision with root package name */
        public final long f3320a;
        public final long b;

        public MdhdData(long j, long j2, String str) {
            this.f3320a = j;
            this.b = j2;
        }
    }

    public interface SampleSizeBox {
        int a();

        int b();

        int c();
    }

    public static final class StriData {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f3321a;
        public final boolean b;
        public final boolean c;

        public StriData(boolean z, boolean z2, boolean z3) {
            this.f3321a = z;
            this.b = z2;
            this.c = z3;
        }
    }

    public static final class StsdData {

        /* renamed from: a, reason: collision with root package name */
        public final TrackEncryptionBox[] f3322a;
        public Format b;
        public int c;
        public int d = 0;

        public StsdData(int i) {
            this.f3322a = new TrackEncryptionBox[i];
        }
    }

    public static final class StszSampleSizeBox implements SampleSizeBox {

        /* renamed from: a, reason: collision with root package name */
        public final int f3323a;
        public final int b;
        public final ParsableByteArray c;

        public StszSampleSizeBox(Mp4Box.LeafBox leafBox, Format format) {
            ParsableByteArray parsableByteArray = leafBox.b;
            this.c = parsableByteArray;
            parsableByteArray.G(12);
            int iY = parsableByteArray.y();
            if ("audio/raw".equals(format.n)) {
                int iR = Util.r(format.F) * format.D;
                if (iY == 0 || iY % iR != 0) {
                    Log.g("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iR + ", stsz sample size: " + iY);
                    iY = iR;
                }
            }
            this.f3323a = iY == 0 ? -1 : iY;
            this.b = parsableByteArray.y();
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public final int a() {
            int i = this.f3323a;
            return i == -1 ? this.c.y() : i;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public final int b() {
            return this.b;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public final int c() {
            return this.f3323a;
        }
    }

    public static final class Stz2SampleSizeBox implements SampleSizeBox {

        /* renamed from: a, reason: collision with root package name */
        public final ParsableByteArray f3324a;
        public final int b;
        public final int c;
        public int d;
        public int e;

        public Stz2SampleSizeBox(Mp4Box.LeafBox leafBox) {
            ParsableByteArray parsableByteArray = leafBox.b;
            this.f3324a = parsableByteArray;
            parsableByteArray.G(12);
            this.c = parsableByteArray.y() & 255;
            this.b = parsableByteArray.y();
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public final int a() {
            ParsableByteArray parsableByteArray = this.f3324a;
            int i = this.c;
            if (i == 8) {
                return parsableByteArray.u();
            }
            if (i == 16) {
                return parsableByteArray.A();
            }
            int i2 = this.d;
            this.d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.e & 15;
            }
            int iU = parsableByteArray.u();
            this.e = iU;
            return (iU & 240) >> 4;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public final int b() {
            return this.b;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public final int c() {
            return -1;
        }
    }

    public static final class TkhdData {

        /* renamed from: a, reason: collision with root package name */
        public final int f3325a;
        public final int b;
        public final int c;

        public TkhdData(int i, int i2, int i3, long j) {
            this.f3325a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    public static final class VexuData {

        /* renamed from: a, reason: collision with root package name */
        public final EyesData f3326a;

        public VexuData(EyesData eyesData) {
            this.f3326a = eyesData;
        }
    }

    static {
        int i = Util.f2928a;
        f3315a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static EsdsData a(int i, ParsableByteArray parsableByteArray) {
        parsableByteArray.G(i + 12);
        parsableByteArray.H(1);
        b(parsableByteArray);
        parsableByteArray.H(2);
        int iU = parsableByteArray.u();
        if ((iU & 128) != 0) {
            parsableByteArray.H(2);
        }
        if ((iU & 64) != 0) {
            parsableByteArray.H(parsableByteArray.u());
        }
        if ((iU & 32) != 0) {
            parsableByteArray.H(2);
        }
        parsableByteArray.H(1);
        b(parsableByteArray);
        String strE = MimeTypes.e(parsableByteArray.u());
        if ("audio/mpeg".equals(strE) || "audio/vnd.dts".equals(strE) || "audio/vnd.dts.hd".equals(strE)) {
            return new EsdsData(strE, null, -1L, -1L);
        }
        parsableByteArray.H(4);
        long jW = parsableByteArray.w();
        long jW2 = parsableByteArray.w();
        parsableByteArray.H(1);
        int iB = b(parsableByteArray);
        long j = jW2;
        byte[] bArr = new byte[iB];
        parsableByteArray.e(0, iB, bArr);
        if (j <= 0) {
            j = -1;
        }
        return new EsdsData(strE, bArr, j, jW > 0 ? jW : -1L);
    }

    public static int b(ParsableByteArray parsableByteArray) {
        int iU = parsableByteArray.u();
        int i = iU & 127;
        while ((iU & 128) == 128) {
            iU = parsableByteArray.u();
            i = (i << 7) | (iU & 127);
        }
        return i;
    }

    public static int c(int i) {
        return (i >> 24) & 255;
    }

    public static Mp4TimestampData d(ParsableByteArray parsableByteArray) {
        long jO;
        long jO2;
        parsableByteArray.G(8);
        if (c(parsableByteArray.g()) == 0) {
            jO = parsableByteArray.w();
            jO2 = parsableByteArray.w();
        } else {
            jO = parsableByteArray.o();
            jO2 = parsableByteArray.o();
        }
        return new Mp4TimestampData(jO, jO2, parsableByteArray.w());
    }

    public static Pair e(ParsableByteArray parsableByteArray, int i, int i2) throws ParserException {
        Integer num;
        TrackEncryptionBox trackEncryptionBox;
        Pair pairCreate;
        int i3;
        int i4;
        Integer num2;
        boolean z;
        int i5 = parsableByteArray.b;
        while (i5 - i < i2) {
            parsableByteArray.G(i5);
            int iG = parsableByteArray.g();
            ExtractorUtil.a("childAtomSize must be positive", iG > 0);
            if (parsableByteArray.g() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                Integer numValueOf = null;
                String strS = null;
                while (i6 - i5 < iG) {
                    parsableByteArray.G(i6);
                    int iG2 = parsableByteArray.g();
                    int iG3 = parsableByteArray.g();
                    if (iG3 == 1718775137) {
                        numValueOf = Integer.valueOf(parsableByteArray.g());
                    } else if (iG3 == 1935894637) {
                        parsableByteArray.H(4);
                        strS = parsableByteArray.s(4, StandardCharsets.UTF_8);
                    } else if (iG3 == 1935894633) {
                        i8 = i6;
                        i7 = iG2;
                    }
                    i6 += iG2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strS) || "cbc1".equals(strS) || "cens".equals(strS) || "cbcs".equals(strS)) {
                    ExtractorUtil.a("frma atom is mandatory", numValueOf != null);
                    ExtractorUtil.a("schi atom is mandatory", i8 != -1);
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 >= i7) {
                            num = numValueOf;
                            trackEncryptionBox = null;
                            break;
                        }
                        parsableByteArray.G(i9);
                        int iG4 = parsableByteArray.g();
                        if (parsableByteArray.g() == 1952804451) {
                            int iC = c(parsableByteArray.g());
                            parsableByteArray.H(1);
                            if (iC == 0) {
                                parsableByteArray.H(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int iU = parsableByteArray.u();
                                i3 = iU & 15;
                                i4 = (iU & 240) >> 4;
                            }
                            if (parsableByteArray.u() == 1) {
                                num2 = numValueOf;
                                z = true;
                            } else {
                                num2 = numValueOf;
                                z = false;
                            }
                            int iU2 = parsableByteArray.u();
                            byte[] bArr2 = new byte[16];
                            parsableByteArray.e(0, 16, bArr2);
                            if (z && iU2 == 0) {
                                int iU3 = parsableByteArray.u();
                                byte[] bArr3 = new byte[iU3];
                                parsableByteArray.e(0, iU3, bArr3);
                                bArr = bArr3;
                            }
                            num = num2;
                            trackEncryptionBox = new TrackEncryptionBox(z, strS, iU2, bArr2, i4, i3, bArr);
                        } else {
                            i9 += iG4;
                        }
                    }
                    ExtractorUtil.a("tenc atom is mandatory", trackEncryptionBox != null);
                    int i10 = Util.f2928a;
                    pairCreate = Pair.create(num, trackEncryptionBox);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i5 += iG;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x05f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.media3.extractor.mp4.TrackSampleTable f(androidx.media3.extractor.mp4.Track r41, androidx.media3.container.Mp4Box.ContainerBox r42, androidx.media3.extractor.GaplessInfoHolder r43) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 1547
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.BoxParser.f(androidx.media3.extractor.mp4.Track, androidx.media3.container.Mp4Box$ContainerBox, androidx.media3.extractor.GaplessInfoHolder):androidx.media3.extractor.mp4.TrackSampleTable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ee, code lost:
    
        r27 = -9223372036854775807L;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x0cac  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x0cb0  */
    /* JADX WARN: Removed duplicated region for block: B:619:0x0d4b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:629:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:631:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList g(androidx.media3.container.Mp4Box.ContainerBox r64, androidx.media3.extractor.GaplessInfoHolder r65, long r66, androidx.media3.common.DrmInitData r68, boolean r69, boolean r70, com.google.common.base.Function r71) {
        /*
            Method dump skipped, instructions count: 3413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.BoxParser.g(androidx.media3.container.Mp4Box$ContainerBox, androidx.media3.extractor.GaplessInfoHolder, long, androidx.media3.common.DrmInitData, boolean, boolean, com.google.common.base.Function):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:206:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x078b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void h(androidx.media3.common.util.ParsableByteArray r42, int r43, int r44, int r45, int r46, java.lang.String r47, int r48, androidx.media3.common.DrmInitData r49, androidx.media3.extractor.mp4.BoxParser.StsdData r50, int r51) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 2448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.BoxParser.h(androidx.media3.common.util.ParsableByteArray, int, int, int, int, java.lang.String, int, androidx.media3.common.DrmInitData, androidx.media3.extractor.mp4.BoxParser$StsdData, int):void");
    }
}
