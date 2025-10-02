package com.google.zxing.oned.rss;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitArray;
import com.google.zxing.oned.OneDReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public final class RSS14Reader extends AbstractRSSReader {
    public static final int[] i = {1, 10, 34, 70, 126};
    public static final int[] j = {4, 20, 48, 81};
    public static final int[] k = {0, 161, 961, 2015, 2715};
    public static final int[] l = {0, 336, 1036, 1516};
    public static final int[] m = {8, 6, 4, 3, 1};
    public static final int[] n = {2, 4, 6, 8};
    public static final int[][] o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public static void j(ArrayList arrayList, Pair pair) {
        if (pair == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair2 = (Pair) it.next();
            if (pair2.f16186a == pair.f16186a) {
                pair2.d++;
                return;
            }
        }
        arrayList.add(pair);
    }

    @Override // com.google.zxing.oned.OneDReader
    public final Result b(int i2, BitArray bitArray, Map map) throws NotFoundException {
        Pair pairL = l(bitArray, false, i2, map);
        ArrayList arrayList = this.g;
        j(arrayList, pairL);
        bitArray.i();
        Pair pairL2 = l(bitArray, true, i2, map);
        ArrayList arrayList2 = this.h;
        j(arrayList2, pairL2);
        bitArray.i();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            int i3 = pair.d;
            FinderPattern finderPattern = pair.c;
            if (i3 > 1) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Pair pair2 = (Pair) it2.next();
                    int i4 = pair2.d;
                    FinderPattern finderPattern2 = pair2.c;
                    if (i4 > 1) {
                        int i5 = ((pair2.b * 16) + pair.b) % 79;
                        int i6 = (finderPattern.f16187a * 9) + finderPattern2.f16187a;
                        if (i6 > 72) {
                            i6--;
                        }
                        if (i6 > 8) {
                            i6--;
                        }
                        if (i5 == i6) {
                            String strValueOf = String.valueOf((pair.f16186a * 4537077) + pair2.f16186a);
                            StringBuilder sb = new StringBuilder(14);
                            for (int length = 13 - strValueOf.length(); length > 0; length--) {
                                sb.append('0');
                            }
                            sb.append(strValueOf);
                            int i7 = 0;
                            for (int i8 = 0; i8 < 13; i8++) {
                                int iCharAt = sb.charAt(i8) - '0';
                                if ((i8 & 1) == 0) {
                                    iCharAt *= 3;
                                }
                                i7 += iCharAt;
                            }
                            int i9 = 10 - (i7 % 10);
                            if (i9 == 10) {
                                i9 = 0;
                            }
                            sb.append(i9);
                            ResultPoint[] resultPointArr = finderPattern.c;
                            ResultPoint[] resultPointArr2 = finderPattern2.c;
                            return new Result(sb.toString(), null, new ResultPoint[]{resultPointArr[0], resultPointArr[1], resultPointArr2[0], resultPointArr2[1]}, BarcodeFormat.p);
                        }
                    }
                }
            }
        }
        throw NotFoundException.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[PHI: r14 r15
  0x009c: PHI (r14v7 boolean) = (r14v4 boolean), (r14v15 boolean) binds: [B:50:0x00b8, B:38:0x009a] A[DONT_GENERATE, DONT_INLINE]
  0x009c: PHI (r15v5 boolean) = (r15v2 boolean), (r15v13 boolean) binds: [B:50:0x00b8, B:38:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1 A[PHI: r14 r15
  0x00a1: PHI (r14v6 boolean) = (r14v4 boolean), (r14v15 boolean) binds: [B:50:0x00b8, B:38:0x009a] A[DONT_GENERATE, DONT_INLINE]
  0x00a1: PHI (r15v4 boolean) = (r15v2 boolean), (r15v13 boolean) binds: [B:50:0x00b8, B:38:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.zxing.oned.rss.DataCharacter k(com.google.zxing.common.BitArray r20, com.google.zxing.oned.rss.FinderPattern r21, boolean r22) throws com.google.zxing.NotFoundException {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.rss.RSS14Reader.k(com.google.zxing.common.BitArray, com.google.zxing.oned.rss.FinderPattern, boolean):com.google.zxing.oned.rss.DataCharacter");
    }

    public final Pair l(BitArray bitArray, boolean z, int i2, Map map) {
        try {
            FinderPattern finderPatternN = n(bitArray, i2, z, m(bitArray, z));
            ResultPointCallback resultPointCallback = map == null ? null : (ResultPointCallback) map.get(DecodeHintType.l);
            if (resultPointCallback != null) {
                resultPointCallback.a();
            }
            DataCharacter dataCharacterK = k(bitArray, finderPatternN, true);
            DataCharacter dataCharacterK2 = k(bitArray, finderPatternN, false);
            return new Pair((dataCharacterK.f16186a * 1597) + dataCharacterK2.f16186a, (dataCharacterK2.b * 4) + dataCharacterK.b, finderPatternN);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    public final int[] m(BitArray bitArray, boolean z) throws NotFoundException {
        int[] iArr = this.f16185a;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        int i2 = bitArray.e;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < i2) {
            z2 = !bitArray.d(i3);
            if (z == z2) {
                break;
            }
            i3++;
        }
        int i4 = 0;
        int i5 = i3;
        while (i3 < i2) {
            if (bitArray.d(i3) != z2) {
                iArr[i4] = iArr[i4] + 1;
            } else {
                if (i4 != 3) {
                    i4++;
                } else {
                    if (AbstractRSSReader.i(iArr)) {
                        return new int[]{i5, i3};
                    }
                    i5 += iArr[0] + iArr[1];
                    iArr[0] = iArr[2];
                    iArr[1] = iArr[3];
                    iArr[2] = 0;
                    iArr[3] = 0;
                    i4--;
                }
                iArr[i4] = 1;
                z2 = !z2;
            }
            i3++;
        }
        throw NotFoundException.f;
    }

    public final FinderPattern n(BitArray bitArray, int i2, boolean z, int[] iArr) throws NotFoundException {
        int i3;
        int i4;
        boolean zD = bitArray.d(iArr[0]);
        int i5 = iArr[0] - 1;
        while (i5 >= 0 && zD != bitArray.d(i5)) {
            i5--;
        }
        int i6 = i5 + 1;
        int i7 = iArr[0] - i6;
        int[] iArr2 = this.f16185a;
        System.arraycopy(iArr2, 0, iArr2, 1, iArr2.length - 1);
        iArr2[0] = i7;
        for (int i8 = 0; i8 < 9; i8++) {
            if (OneDReader.d(iArr2, o[i8], 0.45f) < 0.2f) {
                int i9 = iArr[1];
                if (z) {
                    int i10 = bitArray.e - 1;
                    i3 = i10 - i9;
                    i4 = i10 - i6;
                } else {
                    i3 = i9;
                    i4 = i6;
                }
                return new FinderPattern(i8, i4, i3, i2, new int[]{i6, i9});
            }
        }
        throw NotFoundException.f;
    }

    @Override // com.google.zxing.oned.OneDReader, com.google.zxing.Reader
    public final void reset() {
        this.g.clear();
        this.h.clear();
    }
}
