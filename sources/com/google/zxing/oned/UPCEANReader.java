package com.google.zxing.oned;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitArray;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlnlnnn;
import com.salesforce.marketingcloud.analytics.b;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class UPCEANReader extends OneDReader {
    public static final int[] d = {1, 1, 1};
    public static final int[] e = {1, 1, 1, 1, 1};
    public static final int[] f = {1, 1, 1, 1, 1, 1};
    public static final int[][] g;
    public static final int[][] h;

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f16184a = new StringBuilder(20);
    public final UPCEANExtensionSupport b = new UPCEANExtensionSupport();
    public final EANManufacturerOrgSupport c = new EANManufacturerOrgSupport();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        g = iArr;
        int[][] iArr2 = new int[20][];
        h = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = g[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            h[i] = iArr4;
        }
    }

    public static boolean h(String str) {
        int length = str.length();
        if (length != 0) {
            int i = length - 1;
            if (p(str.subSequence(0, i)) == Character.digit(str.charAt(i), 10)) {
                return true;
            }
        }
        return false;
    }

    public static int i(BitArray bitArray, int[] iArr, int i, int[][] iArr2) {
        OneDReader.e(i, bitArray, iArr);
        int length = iArr2.length;
        float f2 = 0.48f;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            float fD = OneDReader.d(iArr, iArr2[i3], 0.7f);
            if (fD < f2) {
                i2 = i3;
                f2 = fD;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        throw NotFoundException.f;
    }

    public static int[] m(BitArray bitArray, int i, boolean z, int[] iArr, int[] iArr2) throws NotFoundException {
        int i2 = bitArray.e;
        int iF = z ? bitArray.f(i) : bitArray.e(i);
        int length = iArr.length;
        boolean z2 = z;
        int i3 = 0;
        int i4 = iF;
        while (iF < i2) {
            if (bitArray.d(iF) != z2) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                if (i3 != length - 1) {
                    i3++;
                } else {
                    if (OneDReader.d(iArr2, iArr, 0.7f) < 0.48f) {
                        return new int[]{i4, iF};
                    }
                    i4 += iArr2[0] + iArr2[1];
                    int i5 = i3 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i5);
                    iArr2[i5] = 0;
                    iArr2[i3] = 0;
                    i3--;
                }
                iArr2[i3] = 1;
                z2 = !z2;
            }
            iF++;
        }
        throw NotFoundException.f;
    }

    public static int[] n(BitArray bitArray) throws NotFoundException {
        int[] iArr = new int[3];
        int[] iArrM = null;
        boolean zH = false;
        int i = 0;
        while (!zH) {
            Arrays.fill(iArr, 0, 3, 0);
            iArrM = m(bitArray, i, false, d, iArr);
            int i2 = iArrM[0];
            int i3 = iArrM[1];
            int i4 = i2 - (i3 - i2);
            if (i4 >= 0) {
                zH = bitArray.h(i4, i2);
            }
            i = i3;
        }
        return iArrM;
    }

    public static int p(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 1; i2 >= 0; i2 -= 2) {
            int iCharAt = charSequence.charAt(i2) - '0';
            if (iCharAt < 0 || iCharAt > 9) {
                throw FormatException.a();
            }
            i += iCharAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 2; i4 >= 0; i4 -= 2) {
            int iCharAt2 = charSequence.charAt(i4) - '0';
            if (iCharAt2 < 0 || iCharAt2 > 9) {
                throw FormatException.a();
            }
            i3 += iCharAt2;
        }
        return (1000 - i3) % 10;
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result b(int i, BitArray bitArray, Map map) {
        return l(i, bitArray, n(bitArray), map);
    }

    public boolean g(String str) {
        return h(str);
    }

    public int[] j(int i, BitArray bitArray) {
        return m(bitArray, i, false, d, new int[3]);
    }

    public abstract int k(BitArray bitArray, int[] iArr, StringBuilder sb);

    public Result l(int i, BitArray bitArray, int[] iArr, Map map) throws NotFoundException, ChecksumException, NumberFormatException, FormatException {
        int length;
        String str = null;
        ResultPointCallback resultPointCallback = map == null ? null : (ResultPointCallback) map.get(DecodeHintType.l);
        if (resultPointCallback != null) {
            int i2 = iArr[0];
            int i3 = iArr[1];
            resultPointCallback.a();
        }
        StringBuilder sb = this.f16184a;
        sb.setLength(0);
        int iK = k(bitArray, iArr, sb);
        if (resultPointCallback != null) {
            resultPointCallback.a();
        }
        int[] iArrJ = j(iK, bitArray);
        if (resultPointCallback != null) {
            int i4 = iArrJ[0];
            int i5 = iArrJ[1];
            resultPointCallback.a();
        }
        int i6 = iArrJ[1];
        int i7 = (i6 - iArrJ[0]) + i6;
        if (i7 >= bitArray.e || !bitArray.h(i6, i7)) {
            throw NotFoundException.f;
        }
        String string = sb.toString();
        if (string.length() < 8) {
            throw FormatException.a();
        }
        if (!g(string)) {
            throw ChecksumException.a();
        }
        BarcodeFormat barcodeFormatO = o();
        float f2 = i;
        Result result = new Result(string, null, new ResultPoint[]{new ResultPoint((iArr[1] + iArr[0]) / 2.0f, f2), new ResultPoint((iArrJ[1] + iArrJ[0]) / 2.0f, f2)}, barcodeFormatO);
        try {
            Result resultA = this.b.a(i, iArrJ[1], bitArray);
            result.b(ResultMetadataType.j, resultA.f16131a);
            result.a(resultA.e);
            ResultPoint[] resultPointArr = resultA.c;
            ResultPoint[] resultPointArr2 = result.c;
            if (resultPointArr2 == null) {
                result.c = resultPointArr;
            } else if (resultPointArr != null && resultPointArr.length > 0) {
                ResultPoint[] resultPointArr3 = new ResultPoint[resultPointArr2.length + resultPointArr.length];
                System.arraycopy(resultPointArr2, 0, resultPointArr3, 0, resultPointArr2.length);
                System.arraycopy(resultPointArr, 0, resultPointArr3, resultPointArr2.length, resultPointArr.length);
                result.c = resultPointArr3;
            }
            length = resultA.f16131a.length();
        } catch (ReaderException unused) {
            length = 0;
        }
        int[] iArr2 = map == null ? null : (int[]) map.get(DecodeHintType.m);
        if (iArr2 != null) {
            for (int i8 : iArr2) {
                if (length != i8) {
                }
            }
            throw NotFoundException.f;
        }
        if (barcodeFormatO == BarcodeFormat.k || barcodeFormatO == BarcodeFormat.r) {
            EANManufacturerOrgSupport eANManufacturerOrgSupport = this.c;
            synchronized (eANManufacturerOrgSupport) {
                if (eANManufacturerOrgSupport.f16175a.isEmpty()) {
                    eANManufacturerOrgSupport.a("US/CA", new int[]{0, 19});
                    eANManufacturerOrgSupport.a("US", new int[]{30, 39});
                    eANManufacturerOrgSupport.a("US/CA", new int[]{60, 139});
                    eANManufacturerOrgSupport.a("FR", new int[]{nlnlnnn.xxx00780078x0078, 379});
                    eANManufacturerOrgSupport.a("BG", new int[]{380});
                    eANManufacturerOrgSupport.a("SI", new int[]{383});
                    eANManufacturerOrgSupport.a("HR", new int[]{385});
                    eANManufacturerOrgSupport.a("BA", new int[]{387});
                    eANManufacturerOrgSupport.a("DE", new int[]{400, 440});
                    eANManufacturerOrgSupport.a("JP", new int[]{450, 459});
                    eANManufacturerOrgSupport.a("RU", new int[]{460, 469});
                    eANManufacturerOrgSupport.a("TW", new int[]{471});
                    eANManufacturerOrgSupport.a("EE", new int[]{474});
                    eANManufacturerOrgSupport.a("LV", new int[]{475});
                    eANManufacturerOrgSupport.a("AZ", new int[]{476});
                    eANManufacturerOrgSupport.a("LT", new int[]{477});
                    eANManufacturerOrgSupport.a("UZ", new int[]{478});
                    eANManufacturerOrgSupport.a("LK", new int[]{479});
                    eANManufacturerOrgSupport.a("PH", new int[]{480});
                    eANManufacturerOrgSupport.a("BY", new int[]{481});
                    eANManufacturerOrgSupport.a("UA", new int[]{482});
                    eANManufacturerOrgSupport.a("MD", new int[]{484});
                    eANManufacturerOrgSupport.a("AM", new int[]{485});
                    eANManufacturerOrgSupport.a("GE", new int[]{486});
                    eANManufacturerOrgSupport.a("KZ", new int[]{487});
                    eANManufacturerOrgSupport.a("HK", new int[]{489});
                    eANManufacturerOrgSupport.a("JP", new int[]{490, 499});
                    eANManufacturerOrgSupport.a("GB", new int[]{500, 509});
                    eANManufacturerOrgSupport.a("GR", new int[]{520});
                    eANManufacturerOrgSupport.a("LB", new int[]{528});
                    eANManufacturerOrgSupport.a("CY", new int[]{529});
                    eANManufacturerOrgSupport.a("MK", new int[]{531});
                    eANManufacturerOrgSupport.a("MT", new int[]{535});
                    eANManufacturerOrgSupport.a("IE", new int[]{539});
                    eANManufacturerOrgSupport.a("BE/LU", new int[]{540, 549});
                    eANManufacturerOrgSupport.a("PT", new int[]{560});
                    eANManufacturerOrgSupport.a("IS", new int[]{569});
                    eANManufacturerOrgSupport.a("DK", new int[]{570, 579});
                    eANManufacturerOrgSupport.a("PL", new int[]{590});
                    eANManufacturerOrgSupport.a("RO", new int[]{594});
                    eANManufacturerOrgSupport.a("HU", new int[]{599});
                    eANManufacturerOrgSupport.a("ZA", new int[]{600, 601});
                    eANManufacturerOrgSupport.a("GH", new int[]{603});
                    eANManufacturerOrgSupport.a("BH", new int[]{608});
                    eANManufacturerOrgSupport.a("MU", new int[]{609});
                    eANManufacturerOrgSupport.a(RequestConfiguration.MAX_AD_CONTENT_RATING_MA, new int[]{611});
                    eANManufacturerOrgSupport.a("DZ", new int[]{613});
                    eANManufacturerOrgSupport.a("KE", new int[]{616});
                    eANManufacturerOrgSupport.a("CI", new int[]{618});
                    eANManufacturerOrgSupport.a("TN", new int[]{619});
                    eANManufacturerOrgSupport.a("SY", new int[]{621});
                    eANManufacturerOrgSupport.a("EG", new int[]{622});
                    eANManufacturerOrgSupport.a("LY", new int[]{624});
                    eANManufacturerOrgSupport.a("JO", new int[]{625});
                    eANManufacturerOrgSupport.a("IR", new int[]{626});
                    eANManufacturerOrgSupport.a("KW", new int[]{627});
                    eANManufacturerOrgSupport.a("SA", new int[]{628});
                    eANManufacturerOrgSupport.a("AE", new int[]{629});
                    eANManufacturerOrgSupport.a("FI", new int[]{640, 649});
                    eANManufacturerOrgSupport.a("CN", new int[]{690, 695});
                    eANManufacturerOrgSupport.a("NO", new int[]{700, 709});
                    eANManufacturerOrgSupport.a("IL", new int[]{729});
                    eANManufacturerOrgSupport.a("SE", new int[]{730, 739});
                    eANManufacturerOrgSupport.a("GT", new int[]{740});
                    eANManufacturerOrgSupport.a("SV", new int[]{741});
                    eANManufacturerOrgSupport.a("HN", new int[]{742});
                    eANManufacturerOrgSupport.a("NI", new int[]{743});
                    eANManufacturerOrgSupport.a("CR", new int[]{744});
                    eANManufacturerOrgSupport.a("PA", new int[]{745});
                    eANManufacturerOrgSupport.a("DO", new int[]{746});
                    eANManufacturerOrgSupport.a("MX", new int[]{750});
                    eANManufacturerOrgSupport.a("CA", new int[]{754, 755});
                    eANManufacturerOrgSupport.a("VE", new int[]{759});
                    eANManufacturerOrgSupport.a("CH", new int[]{760, 769});
                    eANManufacturerOrgSupport.a("CO", new int[]{770});
                    eANManufacturerOrgSupport.a("UY", new int[]{773});
                    eANManufacturerOrgSupport.a("PE", new int[]{775});
                    eANManufacturerOrgSupport.a("BO", new int[]{777});
                    eANManufacturerOrgSupport.a("AR", new int[]{779});
                    eANManufacturerOrgSupport.a("CL", new int[]{780});
                    eANManufacturerOrgSupport.a("PY", new int[]{784});
                    eANManufacturerOrgSupport.a("PE", new int[]{785});
                    eANManufacturerOrgSupport.a("EC", new int[]{786});
                    eANManufacturerOrgSupport.a("BR", new int[]{789, 790});
                    eANManufacturerOrgSupport.a("IT", new int[]{800, 839});
                    eANManufacturerOrgSupport.a("ES", new int[]{840, 849});
                    eANManufacturerOrgSupport.a("CU", new int[]{850});
                    eANManufacturerOrgSupport.a("SK", new int[]{858});
                    eANManufacturerOrgSupport.a("CZ", new int[]{859});
                    eANManufacturerOrgSupport.a("YU", new int[]{860});
                    eANManufacturerOrgSupport.a("MN", new int[]{865});
                    eANManufacturerOrgSupport.a("KP", new int[]{867});
                    eANManufacturerOrgSupport.a("TR", new int[]{868, 869});
                    eANManufacturerOrgSupport.a("NL", new int[]{870, 879});
                    eANManufacturerOrgSupport.a("KR", new int[]{880});
                    eANManufacturerOrgSupport.a("TH", new int[]{885});
                    eANManufacturerOrgSupport.a("SG", new int[]{b.r});
                    eANManufacturerOrgSupport.a("IN", new int[]{890});
                    eANManufacturerOrgSupport.a("VN", new int[]{893});
                    eANManufacturerOrgSupport.a("PK", new int[]{896});
                    eANManufacturerOrgSupport.a("ID", new int[]{899});
                    eANManufacturerOrgSupport.a("AT", new int[]{900, 919});
                    eANManufacturerOrgSupport.a("AU", new int[]{930, 939});
                    eANManufacturerOrgSupport.a("AZ", new int[]{940, 949});
                    eANManufacturerOrgSupport.a("MY", new int[]{955});
                    eANManufacturerOrgSupport.a("MO", new int[]{958});
                }
            }
            int i9 = Integer.parseInt(string.substring(0, 3));
            int size = eANManufacturerOrgSupport.f16175a.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                int[] iArr3 = (int[]) eANManufacturerOrgSupport.f16175a.get(i10);
                int i11 = iArr3[0];
                if (i9 < i11) {
                    break;
                }
                if (iArr3.length != 1) {
                    i11 = iArr3[1];
                }
                if (i9 <= i11) {
                    str = (String) eANManufacturerOrgSupport.b.get(i10);
                    break;
                }
                i10++;
            }
            if (str != null) {
                result.b(ResultMetadataType.i, str);
            }
        }
        return result;
    }

    public abstract BarcodeFormat o();
}
