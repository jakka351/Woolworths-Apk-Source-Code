package androidx.media3.extractor;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.container.NalUnitUtil;
import java.util.Collections;
import java.util.List;

@UnstableApi
/* loaded from: classes2.dex */
public final class HevcConfig {

    /* renamed from: a, reason: collision with root package name */
    public final List f3243a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final int k;
    public final String l;
    public final NalUnitUtil.H265VpsData m;

    public HevcConfig(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, int i9, String str, NalUnitUtil.H265VpsData h265VpsData) {
        this.f3243a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = f;
        this.k = i9;
        this.l = str;
        this.m = h265VpsData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static HevcConfig a(ParsableByteArray parsableByteArray, boolean z, NalUnitUtil.H265VpsData h265VpsData) throws ParserException {
        boolean z2;
        NalUnitUtil.H265Sei3dRefDisplayInfoData h265Sei3dRefDisplayInfoDataG;
        int i;
        int i2 = 4;
        try {
            if (z) {
                parsableByteArray.H(4);
            } else {
                parsableByteArray.H(21);
            }
            int iU = parsableByteArray.u() & 3;
            int iU2 = parsableByteArray.u();
            int i3 = parsableByteArray.b;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                z2 = true;
                if (i5 >= iU2) {
                    break;
                }
                parsableByteArray.H(1);
                int iA = parsableByteArray.A();
                for (int i7 = 0; i7 < iA; i7++) {
                    int iA2 = parsableByteArray.A();
                    i6 += iA2 + 4;
                    parsableByteArray.H(iA2);
                }
                i5++;
            }
            parsableByteArray.G(i3);
            byte[] bArr = new byte[i6];
            NalUnitUtil.H265VpsData h265VpsData2 = h265VpsData;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            float f = 1.0f;
            String strA = null;
            int i16 = 0;
            int i17 = 0;
            while (i16 < iU2) {
                int iU3 = parsableByteArray.u() & 63;
                int iA3 = parsableByteArray.A();
                int i18 = i4;
                NalUnitUtil.H265VpsData h265VpsDataI = h265VpsData2;
                while (i18 < iA3) {
                    boolean z3 = z2;
                    int iA4 = parsableByteArray.A();
                    int i19 = iU;
                    System.arraycopy(NalUnitUtil.f2934a, i4, bArr, i17, i2);
                    int i20 = i17 + 4;
                    System.arraycopy(parsableByteArray.f2922a, parsableByteArray.b, bArr, i20, iA4);
                    if (iU3 == 32 && i18 == 0) {
                        h265VpsDataI = NalUnitUtil.i(i20, i20 + iA4, bArr);
                    } else {
                        if (iU3 == 33 && i18 == 0) {
                            NalUnitUtil.H265SpsData h265SpsDataH = NalUnitUtil.h(bArr, i20, i20 + iA4, h265VpsDataI);
                            i8 = h265SpsDataH.f2942a + 1;
                            i9 = h265SpsDataH.c + 8;
                            i10 = h265SpsDataH.d + 8;
                            int i21 = h265SpsDataH.i;
                            int i22 = h265SpsDataH.j;
                            i11 = i21;
                            int i23 = h265SpsDataH.k;
                            float f2 = h265SpsDataH.g;
                            int i24 = h265SpsDataH.h;
                            NalUnitUtil.H265ProfileTierLevel h265ProfileTierLevel = h265SpsDataH.b;
                            if (h265ProfileTierLevel != null) {
                                i = i24;
                                strA = CodecSpecificDataUtil.a(h265ProfileTierLevel.f2937a, h265ProfileTierLevel.b, h265ProfileTierLevel.c, h265ProfileTierLevel.d, h265ProfileTierLevel.e, h265ProfileTierLevel.f);
                            } else {
                                i = i24;
                            }
                            i15 = i;
                            f = f2;
                            i13 = i23;
                            i12 = i22;
                        } else if (iU3 == 39 && i18 == 0 && (h265Sei3dRefDisplayInfoDataG = NalUnitUtil.g(i20, i20 + iA4, bArr)) != null && h265VpsDataI != null) {
                            i4 = 0;
                            i14 = h265Sei3dRefDisplayInfoDataG.f2941a == ((NalUnitUtil.H265LayerInfo) h265VpsDataI.f2945a.get(0)).b ? 4 : 5;
                        }
                        i4 = 0;
                    }
                    i17 = i20 + iA4;
                    parsableByteArray.H(iA4);
                    i18++;
                    z2 = z3;
                    iU = i19;
                    i2 = 4;
                }
                i16++;
                h265VpsData2 = h265VpsDataI;
                i2 = 4;
            }
            return new HevcConfig(i6 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iU + 1, i8, i9, i10, i11, i12, i13, i14, f, i15, strA, h265VpsData2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.a(e, "Error parsing".concat(z ? "L-HEVC config" : "HEVC config"));
        }
    }
}
