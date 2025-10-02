package androidx.media3.container;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@UnstableApi
/* loaded from: classes2.dex */
public final class NalUnitUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f2934a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object c = new Object();
    public static int[] d = new int[10];

    public static final class H265LayerInfo {

        /* renamed from: a, reason: collision with root package name */
        public final int f2935a;
        public final int b;

        public H265LayerInfo(int i, int i2) {
            this.f2935a = i;
            this.b = i2;
        }
    }

    public static final class H265NalHeader {

        /* renamed from: a, reason: collision with root package name */
        public final int f2936a;
        public final int b;
        public final int c;

        public H265NalHeader(int i, int i2, int i3) {
            this.f2936a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    public static final class H265ProfileTierLevel {

        /* renamed from: a, reason: collision with root package name */
        public final int f2937a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int[] e;
        public final int f;

        public H265ProfileTierLevel(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
            this.f2937a = i;
            this.b = z;
            this.c = i2;
            this.d = i3;
            this.e = iArr;
            this.f = i4;
        }
    }

    public static final class H265ProfileTierLevelsAndIndices {

        /* renamed from: a, reason: collision with root package name */
        public final ImmutableList f2938a;
        public final int[] b;

        public H265ProfileTierLevelsAndIndices(List list, int[] iArr) {
            this.f2938a = ImmutableList.o(list);
            this.b = iArr;
        }
    }

    public static final class H265RepFormat {

        /* renamed from: a, reason: collision with root package name */
        public final int f2939a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        public H265RepFormat(int i, int i2, int i3, int i4, int i5) {
            this.f2939a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
        }
    }

    public static final class H265RepFormatsAndIndices {

        /* renamed from: a, reason: collision with root package name */
        public final ImmutableList f2940a;
        public final int[] b;

        public H265RepFormatsAndIndices(List list, int[] iArr) {
            this.f2940a = ImmutableList.o(list);
            this.b = iArr;
        }
    }

    public static final class H265Sei3dRefDisplayInfoData {

        /* renamed from: a, reason: collision with root package name */
        public final int f2941a;

        public H265Sei3dRefDisplayInfoData(int i) {
            this.f2941a = i;
        }
    }

    public static final class H265SpsData {

        /* renamed from: a, reason: collision with root package name */
        public final int f2942a;
        public final H265ProfileTierLevel b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final float g;
        public final int h;
        public final int i;
        public final int j;
        public final int k;

        public H265SpsData(int i, H265ProfileTierLevel h265ProfileTierLevel, int i2, int i3, int i4, int i5, float f, int i6, int i7, int i8, int i9) {
            this.f2942a = i;
            this.b = h265ProfileTierLevel;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = f;
            this.h = i6;
            this.i = i7;
            this.j = i8;
            this.k = i9;
        }
    }

    public static final class H265VideoSignalInfo {

        /* renamed from: a, reason: collision with root package name */
        public final int f2943a;
        public final int b;
        public final int c;

        public H265VideoSignalInfo(int i, int i2, int i3) {
            this.f2943a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    public static final class H265VideoSignalInfosAndIndices {

        /* renamed from: a, reason: collision with root package name */
        public final ImmutableList f2944a;
        public final int[] b;

        public H265VideoSignalInfosAndIndices(List list, int[] iArr) {
            this.f2944a = ImmutableList.o(list);
            this.b = iArr;
        }
    }

    public static final class H265VpsData {

        /* renamed from: a, reason: collision with root package name */
        public final ImmutableList f2945a;
        public final H265ProfileTierLevelsAndIndices b;
        public final H265RepFormatsAndIndices c;
        public final H265VideoSignalInfosAndIndices d;

        public H265VpsData(List list, H265ProfileTierLevelsAndIndices h265ProfileTierLevelsAndIndices, H265RepFormatsAndIndices h265RepFormatsAndIndices, H265VideoSignalInfosAndIndices h265VideoSignalInfosAndIndices) {
            this.f2945a = list != null ? ImmutableList.o(list) : ImmutableList.t();
            this.b = h265ProfileTierLevelsAndIndices;
            this.c = h265RepFormatsAndIndices;
            this.d = h265VideoSignalInfosAndIndices;
        }
    }

    public static final class PpsData {

        /* renamed from: a, reason: collision with root package name */
        public final int f2946a;
        public final boolean b;

        public PpsData(int i, int i2, boolean z) {
            this.f2946a = i2;
            this.b = z;
        }
    }

    public static final class SpsData {

        /* renamed from: a, reason: collision with root package name */
        public final int f2947a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final float g;
        public final int h;
        public final int i;
        public final boolean j;
        public final boolean k;
        public final int l;
        public final int m;
        public final int n;
        public final boolean o;
        public final int p;
        public final int q;
        public final int r;
        public final int s;

        public SpsData(int i, int i2, int i3, int i4, int i5, int i6, float f, int i7, int i8, boolean z, boolean z2, int i9, int i10, int i11, boolean z3, int i12, int i13, int i14, int i15) {
            this.f2947a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = f;
            this.h = i7;
            this.i = i8;
            this.j = z;
            this.k = z2;
            this.l = i9;
            this.m = i10;
            this.n = i11;
            this.o = z3;
            this.p = i12;
            this.q = i13;
            this.r = i14;
            this.s = i15;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        Assertions.f(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            a(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            a(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            a(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b2 = bArr[i5];
            if ((b2 & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b2 == 1) {
                    a(zArr);
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    public static boolean c(byte[] bArr, int i, Format format) {
        int i2;
        if (Objects.equals(format.n, "video/avc")) {
            byte b2 = bArr[4];
            if (((b2 & 96) >> 5) == 0 && ((i2 = b2 & 31) == 1 || i2 == 9 || i2 == 14)) {
                return false;
            }
        } else if (Objects.equals(format.n, "video/hevc")) {
            H265NalHeader h265NalHeaderE = e(new ParsableNalUnitBitArray(bArr, 4, i + 4));
            int i3 = h265NalHeaderE.f2936a;
            if (i3 == 35) {
                return false;
            }
            if (i3 <= 14 && i3 % 2 == 0 && h265NalHeaderE.c == format.C - 1) {
                return false;
            }
        }
        return true;
    }

    public static int d(Format format) {
        if (Objects.equals(format.n, "video/avc")) {
            return 1;
        }
        return (Objects.equals(format.n, "video/hevc") || MimeTypes.b(format.k, "video/hevc")) ? 2 : 0;
    }

    public static H265NalHeader e(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        parsableNalUnitBitArray.i();
        return new H265NalHeader(parsableNalUnitBitArray.e(6), parsableNalUnitBitArray.e(6), parsableNalUnitBitArray.e(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.media3.container.NalUnitUtil.H265ProfileTierLevel f(androidx.media3.container.ParsableNalUnitBitArray r19, boolean r20, int r21, androidx.media3.container.NalUnitUtil.H265ProfileTierLevel r22) {
        /*
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 2
            r6 = 8
            r7 = 0
            if (r20 == 0) goto L42
            int r2 = r0.e(r5)
            boolean r8 = r0.d()
            r9 = 5
            int r9 = r0.e(r9)
            r10 = r7
            r11 = r10
        L1e:
            r12 = 32
            if (r10 >= r12) goto L2e
            boolean r12 = r0.d()
            if (r12 == 0) goto L2b
            r12 = 1
            int r12 = r12 << r10
            r11 = r11 | r12
        L2b:
            int r10 = r10 + 1
            goto L1e
        L2e:
            r10 = r7
        L2f:
            if (r10 >= r3) goto L3a
            int r12 = r0.e(r6)
            r4[r10] = r12
            int r10 = r10 + 1
            goto L2f
        L3a:
            r13 = r2
        L3b:
            r17 = r4
            r14 = r8
            r15 = r9
            r16 = r11
            goto L57
        L42:
            if (r2 == 0) goto L50
            int r3 = r2.f2937a
            boolean r8 = r2.b
            int r9 = r2.c
            int r11 = r2.d
            int[] r4 = r2.e
            r13 = r3
            goto L3b
        L50:
            r17 = r4
            r13 = r7
            r14 = r13
            r15 = r14
            r16 = r15
        L57:
            int r18 = r0.e(r6)
            r2 = r7
        L5c:
            if (r7 >= r1) goto L71
            boolean r3 = r0.d()
            if (r3 == 0) goto L66
            int r2 = r2 + 88
        L66:
            boolean r3 = r0.d()
            if (r3 == 0) goto L6e
            int r2 = r2 + 8
        L6e:
            int r7 = r7 + 1
            goto L5c
        L71:
            r0.j(r2)
            if (r1 <= 0) goto L7b
            int r6 = r6 - r1
            int r6 = r6 * r5
            r0.j(r6)
        L7b:
            androidx.media3.container.NalUnitUtil$H265ProfileTierLevel r12 = new androidx.media3.container.NalUnitUtil$H265ProfileTierLevel
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.container.NalUnitUtil.f(androidx.media3.container.ParsableNalUnitBitArray, boolean, int, androidx.media3.container.NalUnitUtil$H265ProfileTierLevel):androidx.media3.container.NalUnitUtil$H265ProfileTierLevel");
    }

    public static H265Sei3dRefDisplayInfoData g(int i, int i2, byte[] bArr) {
        byte b2;
        int i3 = i + 2;
        do {
            i2--;
            b2 = bArr[i2];
            if (b2 != 0) {
                break;
            }
        } while (i2 > i3);
        if (b2 == 0 || i2 <= i3) {
            return null;
        }
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i3, i2 + 1);
        while (parsableNalUnitBitArray.b(16)) {
            int iE = parsableNalUnitBitArray.e(8);
            int i4 = 0;
            while (iE == 255) {
                i4 += 255;
                iE = parsableNalUnitBitArray.e(8);
            }
            int i5 = i4 + iE;
            int iE2 = parsableNalUnitBitArray.e(8);
            int i6 = 0;
            while (iE2 == 255) {
                i6 += 255;
                iE2 = parsableNalUnitBitArray.e(8);
            }
            int i7 = i6 + iE2;
            if (i7 == 0 || !parsableNalUnitBitArray.b(i7)) {
                return null;
            }
            if (i5 == 176) {
                int iF = parsableNalUnitBitArray.f();
                boolean zD = parsableNalUnitBitArray.d();
                int iF2 = zD ? parsableNalUnitBitArray.f() : 0;
                int iF3 = parsableNalUnitBitArray.f();
                int iF4 = -1;
                for (int i8 = 0; i8 <= iF3; i8++) {
                    iF4 = parsableNalUnitBitArray.f();
                    parsableNalUnitBitArray.f();
                    int iE3 = parsableNalUnitBitArray.e(6);
                    if (iE3 == 63) {
                        return null;
                    }
                    parsableNalUnitBitArray.e(iE3 == 0 ? Math.max(0, iF - 30) : Math.max(0, (iE3 + iF) - 31));
                    if (zD) {
                        int iE4 = parsableNalUnitBitArray.e(6);
                        if (iE4 == 63) {
                            return null;
                        }
                        parsableNalUnitBitArray.e(iE4 == 0 ? Math.max(0, iF2 - 30) : Math.max(0, (iE4 + iF2) - 31));
                    }
                    if (parsableNalUnitBitArray.d()) {
                        parsableNalUnitBitArray.j(10);
                    }
                }
                return new H265Sei3dRefDisplayInfoData(iF4);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.media3.container.NalUnitUtil.H265SpsData h(byte[] r30, int r31, int r32, androidx.media3.container.NalUnitUtil.H265VpsData r33) {
        /*
            Method dump skipped, instructions count: 952
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.container.NalUnitUtil.h(byte[], int, int, androidx.media3.container.NalUnitUtil$H265VpsData):androidx.media3.container.NalUnitUtil$H265SpsData");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.media3.container.NalUnitUtil.H265VpsData i(int r38, int r39, byte[] r40) {
        /*
            Method dump skipped, instructions count: 2067
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.container.NalUnitUtil.i(int, int, byte[]):androidx.media3.container.NalUnitUtil$H265VpsData");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x022d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.media3.container.NalUnitUtil.SpsData j(int r30, int r31, byte[] r32) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.container.NalUnitUtil.j(int, int, byte[]):androidx.media3.container.NalUnitUtil$SpsData");
    }

    public static void k(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int iF = parsableNalUnitBitArray.f() + 1;
        parsableNalUnitBitArray.j(8);
        for (int i = 0; i < iF; i++) {
            parsableNalUnitBitArray.f();
            parsableNalUnitBitArray.f();
            parsableNalUnitBitArray.i();
        }
        parsableNalUnitBitArray.j(20);
    }

    public static int l(int i, byte[] bArr) {
        int i2;
        synchronized (c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = d;
                    if (iArr.length <= i4) {
                        d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i9 + 2;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }
}
