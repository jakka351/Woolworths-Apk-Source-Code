package com.google.zxing.qrcode;

import YU.a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.GridSampler;
import com.google.zxing.common.PerspectiveTransform;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.qrcode.decoder.Decoder;
import com.google.zxing.qrcode.decoder.QRCodeDecoderMetaData;
import com.google.zxing.qrcode.decoder.Version;
import com.google.zxing.qrcode.detector.AlignmentPattern;
import com.google.zxing.qrcode.detector.Detector;
import com.google.zxing.qrcode.detector.FinderPattern;
import com.google.zxing.qrcode.detector.FinderPatternFinder;
import com.google.zxing.qrcode.detector.FinderPatternInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class QRCodeReader implements Reader {
    public static final ResultPoint[] b = new ResultPoint[0];

    /* renamed from: a, reason: collision with root package name */
    public final Decoder f16220a = new Decoder();

    @Override // com.google.zxing.Reader
    public final Result a(BinaryBitmap binaryBitmap, Map map) throws NotFoundException, FormatException {
        int i;
        int i2;
        ArrayList arrayList;
        FinderPattern finderPattern;
        FinderPattern finderPattern2;
        FinderPattern finderPattern3;
        float f;
        float f2;
        AlignmentPattern alignmentPatternB;
        float f3;
        float f4;
        float f5;
        int i3;
        ResultPoint[] resultPointArr;
        DecoderResult decoderResultA;
        ResultPoint[] resultPointArr2;
        ArrayList arrayList2;
        int i4;
        int iAbs;
        int i5;
        int i6 = 3;
        Decoder decoder = this.f16220a;
        int i7 = 1;
        int i8 = 0;
        if (map == null || !map.containsKey(DecodeHintType.d)) {
            i = 0;
            BitMatrix bitMatrixB = binaryBitmap.b();
            Detector detector = new Detector(bitMatrixB);
            ResultPointCallback resultPointCallback = map == null ? null : (ResultPointCallback) map.get(DecodeHintType.l);
            detector.b = resultPointCallback;
            FinderPatternFinder finderPatternFinder = new FinderPatternFinder(bitMatrixB, resultPointCallback);
            boolean z = map != null && map.containsKey(DecodeHintType.f);
            int i9 = bitMatrixB.e;
            int i10 = bitMatrixB.d;
            int i11 = (i9 * 3) / 388;
            if (i11 < 3 || z) {
                i11 = 3;
            }
            int[] iArr = new int[5];
            int i12 = i11 - 1;
            boolean zE = false;
            while (true) {
                i2 = i6;
                arrayList = finderPatternFinder.b;
                if (i12 >= i9 || zE) {
                    break;
                }
                FinderPatternFinder.b(iArr);
                int i13 = 0;
                int i14 = 0;
                while (i14 < i10) {
                    if (bitMatrixB.b(i14, i12)) {
                        if ((i13 & 1) == i7) {
                            i13++;
                        }
                        iArr[i13] = iArr[i13] + i7;
                    } else if ((i13 & 1) != 0) {
                        iArr[i13] = iArr[i13] + 1;
                    } else if (i13 == 4) {
                        if (!FinderPatternFinder.c(iArr)) {
                            int i15 = i7;
                            iArr[0] = iArr[2];
                            iArr[i15] = iArr[i2];
                            iArr[2] = iArr[4];
                            iArr[i2] = i15;
                            iArr[4] = 0;
                        } else if (finderPatternFinder.d(i12, i14, iArr)) {
                            if (finderPatternFinder.c) {
                                zE = finderPatternFinder.e();
                                i4 = 2;
                            } else {
                                if (arrayList.size() > i7) {
                                    Iterator it = arrayList.iterator();
                                    FinderPattern finderPattern4 = null;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            i4 = 2;
                                            iAbs = 0;
                                            break;
                                        }
                                        FinderPattern finderPattern5 = (FinderPattern) it.next();
                                        Iterator it2 = it;
                                        if (finderPattern5.d >= 2) {
                                            if (finderPattern4 != null) {
                                                finderPatternFinder.c = true;
                                                i4 = 2;
                                                iAbs = ((int) (Math.abs(finderPattern4.f16132a - finderPattern5.f16132a) - Math.abs(finderPattern4.b - finderPattern5.b))) / 2;
                                                break;
                                            }
                                            finderPattern4 = finderPattern5;
                                        }
                                        it = it2;
                                    }
                                } else {
                                    iAbs = 0;
                                    i4 = 2;
                                }
                                if (iAbs > iArr[i4]) {
                                    i12 += (iAbs - r3) - 2;
                                    i14 = i10 - 1;
                                }
                            }
                            FinderPatternFinder.b(iArr);
                            i13 = 0;
                            i11 = i4;
                        } else {
                            iArr[0] = iArr[2];
                            iArr[1] = iArr[i2];
                            iArr[2] = iArr[4];
                            iArr[i2] = 1;
                            iArr[4] = 0;
                        }
                        i13 = i2;
                    } else {
                        i13++;
                        iArr[i13] = iArr[i13] + 1;
                    }
                    i14++;
                    i7 = 1;
                }
                if (FinderPatternFinder.c(iArr) && finderPatternFinder.d(i12, i10, iArr)) {
                    int i16 = iArr[0];
                    if (finderPatternFinder.c) {
                        i11 = i16;
                        zE = finderPatternFinder.e();
                    } else {
                        i11 = i16;
                    }
                }
                i12 += i11;
                i6 = i2;
                i7 = 1;
            }
            if (arrayList.size() < i2) {
                throw NotFoundException.f;
            }
            arrayList.sort(FinderPatternFinder.f);
            FinderPattern[] finderPatternArr = new FinderPattern[i2];
            int i17 = 0;
            double d = Double.MAX_VALUE;
            while (i17 < arrayList.size() - 2) {
                FinderPattern finderPattern6 = (FinderPattern) arrayList.get(i17);
                float f6 = finderPattern6.c;
                i17++;
                int i18 = i17;
                while (i18 < arrayList.size() - 1) {
                    FinderPattern finderPattern7 = (FinderPattern) arrayList.get(i18);
                    double dF = FinderPatternFinder.f(finderPattern6, finderPattern7);
                    i18++;
                    int i19 = i18;
                    while (i19 < arrayList.size()) {
                        FinderPattern finderPattern8 = (FinderPattern) arrayList.get(i19);
                        if (finderPattern8.c <= 1.4f * f6) {
                            arrayList2 = arrayList;
                            double[] dArr = {dF, FinderPatternFinder.f(finderPattern7, finderPattern8), FinderPatternFinder.f(finderPattern6, finderPattern8)};
                            Arrays.sort(dArr);
                            double dAbs = Math.abs(dArr[2] - (dArr[0] * 2.0d)) + Math.abs(dArr[2] - (dArr[1] * 2.0d));
                            if (dAbs < d) {
                                finderPatternArr[0] = finderPattern6;
                                finderPatternArr[1] = finderPattern7;
                                finderPatternArr[2] = finderPattern8;
                                d = dAbs;
                            }
                        } else {
                            arrayList2 = arrayList;
                        }
                        i19++;
                        arrayList = arrayList2;
                    }
                }
            }
            if (d == Double.MAX_VALUE) {
                throw NotFoundException.f;
            }
            float fA = ResultPoint.a(finderPatternArr[0], finderPatternArr[1]);
            float fA2 = ResultPoint.a(finderPatternArr[1], finderPatternArr[2]);
            float fA3 = ResultPoint.a(finderPatternArr[0], finderPatternArr[2]);
            if (fA2 >= fA && fA2 >= fA3) {
                finderPattern = finderPatternArr[0];
                finderPattern2 = finderPatternArr[1];
                finderPattern3 = finderPatternArr[2];
            } else if (fA3 < fA2 || fA3 < fA) {
                finderPattern = finderPatternArr[2];
                finderPattern2 = finderPatternArr[0];
                finderPattern3 = finderPatternArr[1];
            } else {
                finderPattern = finderPatternArr[1];
                finderPattern2 = finderPatternArr[0];
                finderPattern3 = finderPatternArr[2];
            }
            float f7 = finderPattern.f16132a;
            float f8 = finderPattern.b;
            if (((finderPattern2.b - f8) * (finderPattern3.f16132a - f7)) - ((finderPattern2.f16132a - f7) * (finderPattern3.b - f8)) < BitmapDescriptorFactory.HUE_RED) {
                FinderPattern finderPattern9 = finderPattern3;
                finderPattern3 = finderPattern2;
                finderPattern2 = finderPattern9;
            }
            finderPatternArr[0] = finderPattern2;
            finderPatternArr[1] = finderPattern;
            finderPatternArr[2] = finderPattern3;
            FinderPatternInfo finderPatternInfo = new FinderPatternInfo(finderPatternArr);
            FinderPattern finderPattern10 = finderPatternInfo.b;
            FinderPattern finderPattern11 = finderPatternInfo.c;
            float fA4 = detector.a(finderPattern10, finderPattern11);
            float f9 = finderPattern10.b;
            float f10 = finderPattern10.f16132a;
            float f11 = finderPattern11.b;
            float f12 = finderPattern11.f16132a;
            FinderPattern finderPattern12 = finderPatternInfo.f16233a;
            float fA5 = detector.a(finderPattern10, finderPattern12);
            float f13 = finderPattern12.b;
            float f14 = finderPattern12.f16132a;
            float f15 = (fA5 + fA4) / 2.0f;
            if (f15 < 1.0f) {
                throw NotFoundException.f;
            }
            int iC = (MathUtils.c(ResultPoint.a(finderPattern10, finderPattern12) / f15) + MathUtils.c(ResultPoint.a(finderPattern10, finderPattern11) / f15)) / 2;
            int i20 = iC + 7;
            int i21 = i20 & 3;
            if (i21 == 0) {
                i20 = iC + 8;
            } else if (i21 == 2) {
                i20 = iC + 6;
            } else if (i21 == 3) {
                throw NotFoundException.f;
            }
            int i22 = i20;
            int[] iArr2 = Version.e;
            if (i22 % 4 != 1) {
                throw FormatException.a();
            }
            try {
                Version versionC = Version.c((i22 - 17) / 4);
                int i23 = (versionC.f16227a * 4) + 10;
                if (versionC.b.length > 0) {
                    float f16 = (f12 - f10) + f14;
                    f2 = f12;
                    float f17 = (f11 - f9) + f13;
                    float f18 = 1.0f - (3.0f / i23);
                    int iA = (int) a.a(f16, f10, f18, f10);
                    int iA2 = (int) a.a(f17, f9, f18, f9);
                    f = f9;
                    for (int i24 = 4; i24 <= 16; i24 <<= 1) {
                        try {
                            alignmentPatternB = detector.b(iA, f15, i24, iA2);
                            break;
                        } catch (NotFoundException unused) {
                        }
                    }
                } else {
                    f = f9;
                    f2 = f12;
                }
                alignmentPatternB = null;
                float f19 = i22 - 3.5f;
                if (alignmentPatternB != null) {
                    f3 = alignmentPatternB.f16132a;
                    f4 = alignmentPatternB.b;
                    f5 = f19 - 3.0f;
                } else {
                    f3 = (f2 - f10) + f14;
                    f4 = (f11 - f) + f13;
                    f5 = f19;
                }
                BitMatrix bitMatrixA = GridSampler.f16145a.a(bitMatrixB, i22, i22, PerspectiveTransform.a(3.5f, 3.5f, f19, 3.5f, f5, f5, 3.5f, f19, finderPattern10.f16132a, finderPattern10.b, finderPattern11.f16132a, finderPattern11.b, f3, f4, finderPattern12.f16132a, finderPattern12.b));
                if (alignmentPatternB == null) {
                    i3 = 3;
                    resultPointArr = new ResultPoint[]{finderPattern12, finderPattern10, finderPattern11};
                } else {
                    i3 = 3;
                    resultPointArr = new ResultPoint[]{finderPattern12, finderPattern10, finderPattern11, alignmentPatternB};
                }
                decoderResultA = decoder.a(bitMatrixA, map);
                resultPointArr2 = resultPointArr;
            } catch (IllegalArgumentException unused2) {
                throw FormatException.a();
            }
        } else {
            BitMatrix bitMatrixB2 = binaryBitmap.b();
            int[] iArrE = bitMatrixB2.e();
            int i25 = bitMatrixB2.d;
            int[] iArrC = bitMatrixB2.c();
            if (iArrE == null || iArrC == null) {
                throw NotFoundException.f;
            }
            int i26 = bitMatrixB2.e;
            int i27 = iArrE[0];
            int i28 = iArrE[1];
            boolean z2 = true;
            int i29 = 0;
            while (i27 < i25 && i28 < i26) {
                i = i8;
                if (z2 != bitMatrixB2.b(i27, i28)) {
                    int i30 = i29 + 1;
                    if (i30 == 5) {
                        break;
                    }
                    z2 = !z2;
                    i29 = i30;
                }
                i27++;
                i28++;
                i8 = i;
            }
            i = i8;
            if (i27 == i25 || i28 == i26) {
                throw NotFoundException.f;
            }
            int i31 = iArrE[i];
            float f20 = (i27 - i31) / 7.0f;
            int i32 = iArrE[1];
            int i33 = iArrC[1];
            int i34 = iArrC[i];
            if (i31 >= i34 || i32 >= i33) {
                throw NotFoundException.f;
            }
            int i35 = i33 - i32;
            if (i35 != i34 - i31 && (i34 = i31 + i35) >= i25) {
                throw NotFoundException.f;
            }
            int iRound = Math.round(((i34 - i31) + 1) / f20);
            int iRound2 = Math.round((i35 + 1) / f20);
            if (iRound <= 0 || iRound2 <= 0) {
                throw NotFoundException.f;
            }
            if (iRound2 != iRound) {
                throw NotFoundException.f;
            }
            int i36 = (int) (f20 / 2.0f);
            int i37 = i32 + i36;
            int i38 = i31 + i36;
            int i39 = (((int) ((iRound - 1) * f20)) + i38) - i34;
            if (i39 > 0) {
                if (i39 > i36) {
                    throw NotFoundException.f;
                }
                i38 -= i39;
            }
            int i40 = (((int) ((iRound2 - 1) * f20)) + i37) - i33;
            if (i40 > 0) {
                if (i40 > i36) {
                    throw NotFoundException.f;
                }
                i37 -= i40;
            }
            BitMatrix bitMatrix = new BitMatrix(iRound, iRound2);
            for (int i41 = i; i41 < iRound2; i41++) {
                int i42 = ((int) (i41 * f20)) + i37;
                for (int i43 = i; i43 < iRound; i43++) {
                    if (bitMatrixB2.b(((int) (i43 * f20)) + i38, i42)) {
                        bitMatrix.f(i43, i41);
                    }
                }
            }
            decoderResultA = decoder.a(bitMatrix, map);
            resultPointArr2 = b;
            i3 = 3;
        }
        int i44 = decoderResultA.f;
        if ((decoderResultA.e instanceof QRCodeDecoderMetaData) && resultPointArr2.length >= i3) {
            ResultPoint resultPoint = resultPointArr2[i];
            resultPointArr2[i] = resultPointArr2[2];
            resultPointArr2[2] = resultPoint;
        }
        Result result = new Result(decoderResultA.b, decoderResultA.f16143a, resultPointArr2, BarcodeFormat.o);
        List list = decoderResultA.c;
        if (list != null) {
            result.b(ResultMetadataType.e, list);
        }
        String str = decoderResultA.d;
        if (str != null) {
            result.b(ResultMetadataType.f, str);
        }
        if (i44 >= 0 && (i5 = decoderResultA.g) >= 0) {
            result.b(ResultMetadataType.l, Integer.valueOf(i5));
            result.b(ResultMetadataType.m, Integer.valueOf(i44));
        }
        return result;
    }

    @Override // com.google.zxing.Reader
    public final void reset() {
    }
}
