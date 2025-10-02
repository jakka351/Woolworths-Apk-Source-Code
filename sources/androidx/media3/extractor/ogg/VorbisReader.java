package androidx.media3.extractor.ogg;

import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.VorbisBitArray;
import androidx.media3.extractor.VorbisUtil;
import androidx.media3.extractor.ogg.StreamReader;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class VorbisReader extends StreamReader {
    public VorbisSetup n;
    public int o;
    public boolean p;
    public VorbisUtil.VorbisIdHeader q;
    public VorbisUtil.CommentHeader r;

    public static final class VorbisSetup {

        /* renamed from: a, reason: collision with root package name */
        public final VorbisUtil.VorbisIdHeader f3351a;
        public final VorbisUtil.CommentHeader b;
        public final byte[] c;
        public final VorbisUtil.Mode[] d;
        public final int e;

        public VorbisSetup(VorbisUtil.VorbisIdHeader vorbisIdHeader, VorbisUtil.CommentHeader commentHeader, byte[] bArr, VorbisUtil.Mode[] modeArr, int i) {
            this.f3351a = vorbisIdHeader;
            this.b = commentHeader;
            this.c = bArr;
            this.d = modeArr;
            this.e = i;
        }
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    public final void a(long j) {
        this.g = j;
        this.p = j != 0;
        VorbisUtil.VorbisIdHeader vorbisIdHeader = this.q;
        this.o = vorbisIdHeader != null ? vorbisIdHeader.e : 0;
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    public final long b(ParsableByteArray parsableByteArray) {
        byte b = parsableByteArray.f2922a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        VorbisSetup vorbisSetup = this.n;
        Assertions.g(vorbisSetup);
        int i = vorbisSetup.e;
        VorbisUtil.VorbisIdHeader vorbisIdHeader = vorbisSetup.f3351a;
        int i2 = !vorbisSetup.d[(b >> 1) & (255 >>> (8 - i))].f3257a ? vorbisIdHeader.e : vorbisIdHeader.f;
        long j = this.p ? (this.o + i2) / 4 : 0;
        byte[] bArr = parsableByteArray.f2922a;
        int length = bArr.length;
        int i3 = parsableByteArray.c + 4;
        if (length < i3) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i3);
            parsableByteArray.E(bArrCopyOf.length, bArrCopyOf);
        } else {
            parsableByteArray.F(i3);
        }
        byte[] bArr2 = parsableByteArray.f2922a;
        int i4 = parsableByteArray.c;
        bArr2[i4 - 4] = (byte) (j & 255);
        bArr2[i4 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i4 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i4 - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i2;
        return j;
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    public final boolean c(ParsableByteArray parsableByteArray, long j, StreamReader.SetupData setupData) throws ParserException {
        VorbisSetup vorbisSetup;
        VorbisUtil.VorbisIdHeader vorbisIdHeader;
        long jFloor;
        if (this.n != null) {
            setupData.f3350a.getClass();
            return false;
        }
        VorbisUtil.VorbisIdHeader vorbisIdHeader2 = this.q;
        int i = 4;
        if (vorbisIdHeader2 == null) {
            VorbisUtil.c(1, parsableByteArray, false);
            parsableByteArray.m();
            int iU = parsableByteArray.u();
            int iM = parsableByteArray.m();
            int i2 = parsableByteArray.i();
            int i3 = i2 <= 0 ? -1 : i2;
            int i4 = parsableByteArray.i();
            int i5 = i4 <= 0 ? -1 : i4;
            parsableByteArray.i();
            int iU2 = parsableByteArray.u();
            int iPow = (int) Math.pow(2.0d, iU2 & 15);
            int iPow2 = (int) Math.pow(2.0d, (iU2 & 240) >> 4);
            parsableByteArray.u();
            this.q = new VorbisUtil.VorbisIdHeader(iU, iM, i3, i5, iPow, iPow2, Arrays.copyOf(parsableByteArray.f2922a, parsableByteArray.c));
        } else {
            VorbisUtil.CommentHeader commentHeader = this.r;
            if (commentHeader == null) {
                this.r = VorbisUtil.b(parsableByteArray, true, true);
            } else {
                int i6 = parsableByteArray.c;
                byte[] bArr = new byte[i6];
                System.arraycopy(parsableByteArray.f2922a, 0, bArr, 0, i6);
                int i7 = vorbisIdHeader2.f3258a;
                int i8 = 5;
                VorbisUtil.c(5, parsableByteArray, false);
                int iU3 = parsableByteArray.u() + 1;
                VorbisBitArray vorbisBitArray = new VorbisBitArray(parsableByteArray.f2922a);
                int i9 = 8;
                vorbisBitArray.c(parsableByteArray.b * 8);
                int i10 = 0;
                while (true) {
                    int i11 = i9;
                    int i12 = 16;
                    if (i10 >= iU3) {
                        VorbisUtil.VorbisIdHeader vorbisIdHeader3 = vorbisIdHeader2;
                        int i13 = 6;
                        int iB = vorbisBitArray.b(6) + 1;
                        for (int i14 = 0; i14 < iB; i14++) {
                            if (vorbisBitArray.b(16) != 0) {
                                throw ParserException.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i15 = 1;
                        int iB2 = vorbisBitArray.b(6) + 1;
                        int i16 = 0;
                        while (true) {
                            int i17 = 3;
                            if (i16 < iB2) {
                                int iB3 = vorbisBitArray.b(i12);
                                if (iB3 == 0) {
                                    int i18 = i11;
                                    vorbisBitArray.c(i18);
                                    vorbisBitArray.c(16);
                                    vorbisBitArray.c(16);
                                    vorbisBitArray.c(6);
                                    vorbisBitArray.c(i18);
                                    int iB4 = vorbisBitArray.b(4) + 1;
                                    int i19 = 0;
                                    while (i19 < iB4) {
                                        vorbisBitArray.c(i18);
                                        i19++;
                                        i18 = 8;
                                    }
                                } else {
                                    if (iB3 != i15) {
                                        throw ParserException.a(null, "floor type greater than 1 not decodable: " + iB3);
                                    }
                                    int iB5 = vorbisBitArray.b(5);
                                    int[] iArr = new int[iB5];
                                    int i20 = -1;
                                    for (int i21 = 0; i21 < iB5; i21++) {
                                        int iB6 = vorbisBitArray.b(4);
                                        iArr[i21] = iB6;
                                        if (iB6 > i20) {
                                            i20 = iB6;
                                        }
                                    }
                                    int i22 = i20 + 1;
                                    int[] iArr2 = new int[i22];
                                    int i23 = 0;
                                    while (i23 < i22) {
                                        iArr2[i23] = vorbisBitArray.b(i17) + 1;
                                        int iB7 = vorbisBitArray.b(2);
                                        int i24 = i11;
                                        if (iB7 > 0) {
                                            vorbisBitArray.c(i24);
                                        }
                                        int i25 = i22;
                                        int i26 = 0;
                                        for (int i27 = 1; i26 < (i27 << iB7); i27 = 1) {
                                            vorbisBitArray.c(i24);
                                            i26++;
                                            i24 = 8;
                                        }
                                        i23++;
                                        i22 = i25;
                                        i11 = 8;
                                        i17 = 3;
                                    }
                                    vorbisBitArray.c(2);
                                    int iB8 = vorbisBitArray.b(4);
                                    int i28 = 0;
                                    int i29 = 0;
                                    for (int i30 = 0; i30 < iB5; i30++) {
                                        i28 += iArr2[iArr[i30]];
                                        while (i29 < i28) {
                                            vorbisBitArray.c(iB8);
                                            i29++;
                                        }
                                    }
                                }
                                i16++;
                                i11 = 8;
                                i13 = 6;
                                i15 = 1;
                                i12 = 16;
                            } else {
                                int iB9 = vorbisBitArray.b(i13) + 1;
                                int i31 = 0;
                                while (i31 < iB9) {
                                    if (vorbisBitArray.b(16) > 2) {
                                        throw ParserException.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    vorbisBitArray.c(24);
                                    vorbisBitArray.c(24);
                                    vorbisBitArray.c(24);
                                    int iB10 = vorbisBitArray.b(i13) + 1;
                                    int i32 = 8;
                                    vorbisBitArray.c(8);
                                    int[] iArr3 = new int[iB10];
                                    for (int i33 = 0; i33 < iB10; i33++) {
                                        iArr3[i33] = ((vorbisBitArray.a() ? vorbisBitArray.b(5) : 0) * 8) + vorbisBitArray.b(3);
                                    }
                                    int i34 = 0;
                                    while (i34 < iB10) {
                                        int i35 = 0;
                                        while (i35 < i32) {
                                            if ((iArr3[i34] & (1 << i35)) != 0) {
                                                vorbisBitArray.c(i32);
                                            }
                                            i35++;
                                            i32 = 8;
                                        }
                                        i34++;
                                        i32 = 8;
                                    }
                                    i31++;
                                    i13 = 6;
                                }
                                int iB11 = vorbisBitArray.b(i13) + 1;
                                for (int i36 = 0; i36 < iB11; i36++) {
                                    int iB12 = vorbisBitArray.b(16);
                                    if (iB12 != 0) {
                                        Log.c("VorbisUtil", "mapping type other than 0 not supported: " + iB12);
                                    } else {
                                        int iB13 = vorbisBitArray.a() ? vorbisBitArray.b(4) + 1 : 1;
                                        if (vorbisBitArray.a()) {
                                            int iB14 = vorbisBitArray.b(8) + 1;
                                            for (int i37 = 0; i37 < iB14; i37++) {
                                                int i38 = i7 - 1;
                                                int i39 = 0;
                                                for (int i40 = i38; i40 > 0; i40 >>>= 1) {
                                                    i39++;
                                                }
                                                vorbisBitArray.c(i39);
                                                int i41 = 0;
                                                while (i38 > 0) {
                                                    i41++;
                                                    i38 >>>= 1;
                                                }
                                                vorbisBitArray.c(i41);
                                            }
                                        }
                                        if (vorbisBitArray.b(2) != 0) {
                                            throw ParserException.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (iB13 > 1) {
                                            for (int i42 = 0; i42 < i7; i42++) {
                                                vorbisBitArray.c(4);
                                            }
                                        }
                                        for (int i43 = 0; i43 < iB13; i43++) {
                                            vorbisBitArray.c(8);
                                            vorbisBitArray.c(8);
                                            vorbisBitArray.c(8);
                                        }
                                    }
                                }
                                int iB15 = vorbisBitArray.b(6);
                                int i44 = iB15 + 1;
                                VorbisUtil.Mode[] modeArr = new VorbisUtil.Mode[i44];
                                for (int i45 = 0; i45 < i44; i45++) {
                                    boolean zA = vorbisBitArray.a();
                                    vorbisBitArray.b(16);
                                    vorbisBitArray.b(16);
                                    vorbisBitArray.b(8);
                                    modeArr[i45] = new VorbisUtil.Mode(zA);
                                }
                                if (!vorbisBitArray.a()) {
                                    throw ParserException.a(null, "framing bit after modes not set as expected");
                                }
                                int i46 = 0;
                                while (iB15 > 0) {
                                    i46++;
                                    iB15 >>>= 1;
                                }
                                vorbisSetup = new VorbisSetup(vorbisIdHeader3, commentHeader, bArr, modeArr, i46);
                            }
                        }
                    } else {
                        if (vorbisBitArray.b(24) != 5653314) {
                            throw ParserException.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((vorbisBitArray.c * 8) + vorbisBitArray.d));
                        }
                        int iB16 = vorbisBitArray.b(16);
                        int iB17 = vorbisBitArray.b(24);
                        if (vorbisBitArray.a()) {
                            vorbisBitArray.c(i8);
                            int iB18 = 0;
                            while (iB18 < iB17) {
                                int i47 = 0;
                                for (int i48 = iB17 - iB18; i48 > 0; i48 >>>= 1) {
                                    i47++;
                                }
                                iB18 += vorbisBitArray.b(i47);
                            }
                        } else {
                            boolean zA2 = vorbisBitArray.a();
                            for (int i49 = 0; i49 < iB17; i49++) {
                                if (!zA2) {
                                    vorbisBitArray.c(i8);
                                } else if (vorbisBitArray.a()) {
                                    vorbisBitArray.c(i8);
                                }
                            }
                        }
                        int iB19 = vorbisBitArray.b(i);
                        if (iB19 > 2) {
                            throw ParserException.a(null, "lookup type greater than 2 not decodable: " + iB19);
                        }
                        if (iB19 == 1 || iB19 == 2) {
                            vorbisBitArray.c(32);
                            vorbisBitArray.c(32);
                            int iB20 = vorbisBitArray.b(i) + 1;
                            vorbisBitArray.c(1);
                            if (iB19 != 1) {
                                vorbisIdHeader = vorbisIdHeader2;
                                jFloor = iB16 * iB17;
                            } else if (iB16 != 0) {
                                vorbisIdHeader = vorbisIdHeader2;
                                jFloor = (long) Math.floor(Math.pow(iB17, 1.0d / iB16));
                            } else {
                                vorbisIdHeader = vorbisIdHeader2;
                                jFloor = 0;
                            }
                            vorbisBitArray.c((int) (jFloor * iB20));
                        } else {
                            vorbisIdHeader = vorbisIdHeader2;
                        }
                        i10++;
                        i9 = i11;
                        vorbisIdHeader2 = vorbisIdHeader;
                        i = 4;
                        i8 = 5;
                    }
                }
            }
        }
        vorbisSetup = null;
        this.n = vorbisSetup;
        if (vorbisSetup == null) {
            return true;
        }
        VorbisUtil.VorbisIdHeader vorbisIdHeader4 = vorbisSetup.f3351a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(vorbisIdHeader4.g);
        arrayList.add(vorbisSetup.c);
        Metadata metadataA = VorbisUtil.a(ImmutableList.q(vorbisSetup.b.f3256a));
        Format.Builder builder = new Format.Builder();
        builder.l = MimeTypes.m("audio/ogg");
        builder.m = MimeTypes.m("audio/vorbis");
        builder.h = vorbisIdHeader4.d;
        builder.i = vorbisIdHeader4.c;
        builder.C = vorbisIdHeader4.f3258a;
        builder.D = vorbisIdHeader4.b;
        builder.p = arrayList;
        builder.k = metadataA;
        setupData.f3350a = new Format(builder);
        return true;
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }
}
