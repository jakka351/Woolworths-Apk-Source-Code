package androidx.media3.extractor;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public final class Ac4Util {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f3219a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    public static final class Ac4Presentation {

        /* renamed from: a, reason: collision with root package name */
        public boolean f3220a;
        public int b;
        public int c;
        public boolean d;
        public int e;
        public int f;
    }

    public static final class SyncFrameInfo {

        /* renamed from: a, reason: collision with root package name */
        public final int f3221a;
        public final int b;
        public final int c;

        public SyncFrameInfo(int i, int i2, int i3) {
            this.f3221a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    public static void a(int i, ParsableByteArray parsableByteArray) {
        parsableByteArray.D(7);
        byte[] bArr = parsableByteArray.f2922a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0320  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.media3.common.Format b(androidx.media3.common.util.ParsableByteArray r20, java.lang.String r21, java.lang.String r22, androidx.media3.common.DrmInitData r23) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 862
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.Ac4Util.b(androidx.media3.common.util.ParsableByteArray, java.lang.String, java.lang.String, androidx.media3.common.DrmInitData):androidx.media3.common.Format");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.media3.extractor.Ac4Util.SyncFrameInfo c(androidx.media3.common.util.ParsableBitArray r9) {
        /*
            r0 = 16
            int r1 = r9.g(r0)
            int r0 = r9.g(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.g(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r9.g(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.g(r1)
            boolean r2 = r9.f()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.g(r2)
            boolean r5 = r9.f()
            if (r5 == 0) goto L47
            int r5 = r9.g(r4)
            if (r5 <= 0) goto L47
            r9.o(r1)
        L47:
            boolean r5 = r9.f()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L55
            r5 = r7
            goto L56
        L55:
            r5 = r6
        L56:
            int r9 = r9.g(r3)
            int[] r8 = androidx.media3.extractor.Ac4Util.f3219a
            if (r5 != r6) goto L65
            r6 = 13
            if (r9 != r6) goto L65
            r9 = r8[r9]
            goto L93
        L65:
            if (r5 != r7) goto L92
            r6 = 14
            if (r9 >= r6) goto L92
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 8
            r8 = 1
            if (r2 == r8) goto L8b
            r8 = 11
            if (r2 == r1) goto L86
            if (r2 == r4) goto L8b
            if (r2 == r3) goto L7d
            goto L90
        L7d:
            if (r9 == r4) goto L83
            if (r9 == r7) goto L83
            if (r9 != r8) goto L90
        L83:
            int r9 = r6 + 1
            goto L93
        L86:
            if (r9 == r7) goto L83
            if (r9 != r8) goto L90
            goto L83
        L8b:
            if (r9 == r4) goto L83
            if (r9 != r7) goto L90
            goto L83
        L90:
            r9 = r6
            goto L93
        L92:
            r9 = 0
        L93:
            androidx.media3.extractor.Ac4Util$SyncFrameInfo r1 = new androidx.media3.extractor.Ac4Util$SyncFrameInfo
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.Ac4Util.c(androidx.media3.common.util.ParsableBitArray):androidx.media3.extractor.Ac4Util$SyncFrameInfo");
    }

    public static void d(ParsableBitArray parsableBitArray, Ac4Presentation ac4Presentation) throws ParserException {
        int iG = parsableBitArray.g(5);
        parsableBitArray.o(2);
        if (parsableBitArray.f()) {
            parsableBitArray.o(5);
        }
        if (iG >= 7 && iG <= 10) {
            parsableBitArray.n();
        }
        if (parsableBitArray.f()) {
            int iG2 = parsableBitArray.g(3);
            if (ac4Presentation.b == -1 && iG >= 0 && iG <= 15 && (iG2 == 0 || iG2 == 1)) {
                ac4Presentation.b = iG;
            }
            if (parsableBitArray.f()) {
                f(parsableBitArray);
            }
        }
    }

    public static void e(ParsableBitArray parsableBitArray, Ac4Presentation ac4Presentation) throws ParserException {
        parsableBitArray.o(2);
        boolean zF = parsableBitArray.f();
        int iG = parsableBitArray.g(8);
        for (int i = 0; i < iG; i++) {
            parsableBitArray.o(2);
            if (parsableBitArray.f()) {
                parsableBitArray.o(5);
            }
            if (zF) {
                parsableBitArray.o(24);
            } else {
                if (parsableBitArray.f()) {
                    if (!parsableBitArray.f()) {
                        parsableBitArray.o(4);
                    }
                    ac4Presentation.c = parsableBitArray.g(6) + 1;
                }
                parsableBitArray.o(4);
            }
        }
        if (parsableBitArray.f()) {
            parsableBitArray.o(3);
            if (parsableBitArray.f()) {
                f(parsableBitArray);
            }
        }
    }

    public static void f(ParsableBitArray parsableBitArray) throws ParserException {
        int iG = parsableBitArray.g(6);
        if (iG < 2 || iG > 42) {
            throw ParserException.b(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iG)));
        }
        parsableBitArray.o(iG * 8);
    }
}
