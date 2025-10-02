package com.google.zxing.oned.rss.expanded;

import android.support.v4.media.session.a;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.oned.OneDReader;
import com.google.zxing.oned.rss.AbstractRSSReader;
import com.google.zxing.oned.rss.DataCharacter;
import com.google.zxing.oned.rss.FinderPattern;
import com.google.zxing.oned.rss.RSSUtils;
import com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.math.Primes;

/* loaded from: classes6.dex */
public final class RSSExpandedReader extends AbstractRSSReader {
    public static final int[] k = {7, 5, 4, 3, 1};
    public static final int[] l = {4, 20, 52, 104, 204};
    public static final int[] m = {0, 348, 1388, 2948, 3988};
    public static final int[][] n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};
    public static final int[][] o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, SubsamplingScaleImageView.ORIENTATION_180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, DatastoreTestTrace.FirestoreV1Action.MATCHING_DOCUMENTS_FIELD_NUMBER, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, ModuleDescriptor.MODULE_VERSION}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, 200, 178, 112, 125, 164}, new int[]{70, 210, 208, DatastoreTestTrace.FirestoreV1Action.DATABASE_CONTENTS_BEFORE_ACTION_FIELD_NUMBER, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, BERTags.PRIVATE, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};
    public static final int[][] p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};
    public final ArrayList g = new ArrayList(11);
    public final ArrayList h = new ArrayList();
    public final int[] i = new int[2];
    public boolean j;

    public static Result m(List list) {
        int size = list.size() << 1;
        int i = size - 1;
        if (((ExpandedPair) list.get(list.size() - 1)).b == null) {
            i = size - 2;
        }
        BitArray bitArray = new BitArray(i * 12);
        int i2 = ((ExpandedPair) list.get(0)).b.f16186a;
        int i3 = 0;
        for (int i4 = 11; i4 >= 0; i4--) {
            if (((1 << i4) & i2) != 0) {
                bitArray.j(i3);
            }
            i3++;
        }
        for (int i5 = 1; i5 < list.size(); i5++) {
            ExpandedPair expandedPair = (ExpandedPair) list.get(i5);
            int i6 = expandedPair.f16188a.f16186a;
            for (int i7 = 11; i7 >= 0; i7--) {
                if (((1 << i7) & i6) != 0) {
                    bitArray.j(i3);
                }
                i3++;
            }
            DataCharacter dataCharacter = expandedPair.b;
            if (dataCharacter != null) {
                int i8 = dataCharacter.f16186a;
                for (int i9 = 11; i9 >= 0; i9--) {
                    if (((1 << i9) & i8) != 0) {
                        bitArray.j(i3);
                    }
                    i3++;
                }
            }
        }
        String strB = AbstractExpandedDecoder.a(bitArray).b();
        ResultPoint[] resultPointArr = ((ExpandedPair) list.get(0)).c.c;
        ResultPoint[] resultPointArr2 = ((ExpandedPair) list.get(list.size() - 1)).c.c;
        return new Result(strB, null, new ResultPoint[]{resultPointArr[0], resultPointArr[1], resultPointArr2[0], resultPointArr2[1]}, BarcodeFormat.q);
    }

    @Override // com.google.zxing.oned.OneDReader
    public final Result b(int i, BitArray bitArray, Map map) {
        ArrayList arrayList = this.g;
        arrayList.clear();
        this.j = false;
        try {
            return m(o(i, bitArray));
        } catch (NotFoundException unused) {
            arrayList.clear();
            this.j = true;
            return m(o(i, bitArray));
        }
    }

    public final boolean j() {
        ArrayList arrayList = this.g;
        ExpandedPair expandedPair = (ExpandedPair) arrayList.get(0);
        DataCharacter dataCharacter = expandedPair.f16188a;
        DataCharacter dataCharacter2 = expandedPair.b;
        if (dataCharacter2 != null) {
            int i = dataCharacter2.b;
            int i2 = 2;
            for (int i3 = 1; i3 < arrayList.size(); i3++) {
                ExpandedPair expandedPair2 = (ExpandedPair) arrayList.get(i3);
                i += expandedPair2.f16188a.b;
                int i4 = i2 + 1;
                DataCharacter dataCharacter3 = expandedPair2.b;
                if (dataCharacter3 != null) {
                    i += dataCharacter3.b;
                    i2 += 2;
                } else {
                    i2 = i4;
                }
            }
            if (a.c(i2, 4, Primes.SMALL_FACTOR_LIMIT, i % Primes.SMALL_FACTOR_LIMIT) == dataCharacter.f16186a) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (j() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        r1 = new java.util.ArrayList(r10);
        r1.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        return k(r9 + 1, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List k(int r9, java.util.ArrayList r10) throws com.google.zxing.NotFoundException {
        /*
            r8 = this;
        L0:
            java.util.ArrayList r0 = r8.h
            int r1 = r0.size()
            if (r9 >= r1) goto L74
            java.lang.Object r0 = r0.get(r9)
            com.google.zxing.oned.rss.expanded.ExpandedRow r0 = (com.google.zxing.oned.rss.expanded.ExpandedRow) r0
            java.util.ArrayList r1 = r8.g
            r1.clear()
            java.util.Iterator r2 = r10.iterator()
        L17:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L29
            java.lang.Object r3 = r2.next()
            com.google.zxing.oned.rss.expanded.ExpandedRow r3 = (com.google.zxing.oned.rss.expanded.ExpandedRow) r3
            java.util.ArrayList r3 = r3.f16189a
            r1.addAll(r3)
            goto L17
        L29:
            java.util.ArrayList r2 = r0.f16189a
            r1.addAll(r2)
            r2 = 0
            r3 = r2
        L30:
            r4 = 10
            if (r3 >= r4) goto L71
            int[][] r4 = com.google.zxing.oned.rss.expanded.RSSExpandedReader.p
            r4 = r4[r3]
            int r5 = r1.size()
            int r6 = r4.length
            if (r5 > r6) goto L6e
            r5 = r2
        L40:
            int r6 = r1.size()
            if (r5 >= r6) goto L58
            java.lang.Object r6 = r1.get(r5)
            com.google.zxing.oned.rss.expanded.ExpandedPair r6 = (com.google.zxing.oned.rss.expanded.ExpandedPair) r6
            com.google.zxing.oned.rss.FinderPattern r6 = r6.c
            int r6 = r6.f16187a
            r7 = r4[r5]
            if (r6 == r7) goto L55
            goto L6e
        L55:
            int r5 = r5 + 1
            goto L40
        L58:
            boolean r2 = r8.j()
            if (r2 == 0) goto L5f
            return r1
        L5f:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r10)
            r1.add(r0)
            int r0 = r9 + 1
            java.util.List r9 = r8.k(r0, r1)     // Catch: com.google.zxing.NotFoundException -> L71
            return r9
        L6e:
            int r3 = r3 + 1
            goto L30
        L71:
            int r9 = r9 + 1
            goto L0
        L74:
            com.google.zxing.NotFoundException r9 = com.google.zxing.NotFoundException.f
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.rss.expanded.RSSExpandedReader.k(int, java.util.ArrayList):java.util.List");
    }

    public final List l(boolean z) {
        ArrayList arrayList = this.h;
        List listK = null;
        if (arrayList.size() > 25) {
            arrayList.clear();
            return null;
        }
        this.g.clear();
        if (z) {
            Collections.reverse(arrayList);
        }
        try {
            listK = k(0, new ArrayList());
        } catch (NotFoundException unused) {
        }
        if (z) {
            Collections.reverse(arrayList);
        }
        return listK;
    }

    public final DataCharacter n(BitArray bitArray, FinderPattern finderPattern, boolean z, boolean z2) throws NotFoundException {
        int[] iArr;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int[][] iArr2;
        int i = 0;
        while (true) {
            iArr = this.b;
            if (i >= iArr.length) {
                break;
            }
            iArr[i] = 0;
            i++;
        }
        if (z2) {
            OneDReader.f(finderPattern.b[0], bitArray, iArr);
        } else {
            OneDReader.e(finderPattern.b[1], bitArray, iArr);
            int i2 = 0;
            for (int length = iArr.length - 1; i2 < length; length--) {
                int i3 = iArr[i2];
                iArr[i2] = iArr[length];
                iArr[length] = i3;
                i2++;
            }
        }
        float fD = MathUtils.d(iArr) / 17.0f;
        int[] iArr3 = finderPattern.b;
        int i4 = finderPattern.f16187a;
        float f = (iArr3[1] - iArr3[0]) / 15.0f;
        if (Math.abs(fD - f) / f > 0.3f) {
            throw NotFoundException.f;
        }
        int i5 = 0;
        while (true) {
            int length2 = iArr.length;
            float[] fArr = this.d;
            float[] fArr2 = this.c;
            int[] iArr4 = this.f;
            int[] iArr5 = this.e;
            if (i5 >= length2) {
                int iD = MathUtils.d(iArr5);
                int iD2 = MathUtils.d(iArr4);
                if (iD > 13) {
                    z3 = false;
                    z4 = true;
                } else if (iD < 4) {
                    z4 = false;
                    z3 = true;
                } else {
                    z3 = false;
                    z4 = false;
                }
                if (iD2 > 13) {
                    z5 = false;
                    z6 = true;
                } else if (iD2 < 4) {
                    z6 = false;
                    z5 = true;
                } else {
                    z5 = false;
                    z6 = false;
                }
                int i6 = (iD + iD2) - 17;
                boolean z7 = (iD & 1) == 1;
                boolean z8 = (iD2 & 1) == 0;
                boolean z9 = z3;
                boolean z10 = z4;
                boolean z11 = z5;
                boolean z12 = z6;
                if (i6 != -1) {
                    if (i6 != 0) {
                        if (i6 != 1) {
                            throw NotFoundException.f;
                        }
                        if (z7) {
                            if (z8) {
                                throw NotFoundException.f;
                            }
                            z10 = true;
                            z9 = z3;
                            z11 = z5;
                            z12 = z6;
                        } else {
                            if (!z8) {
                                throw NotFoundException.f;
                            }
                            z12 = true;
                            z9 = z3;
                            z10 = z4;
                            z11 = z5;
                        }
                    } else if (z7) {
                        if (!z8) {
                            throw NotFoundException.f;
                        }
                        if (iD < iD2) {
                            z9 = true;
                            z12 = true;
                            z10 = z4;
                            z11 = z5;
                        } else {
                            z10 = true;
                            z11 = true;
                            z9 = z3;
                            z12 = z6;
                        }
                    } else if (z8) {
                        throw NotFoundException.f;
                    }
                } else if (z7) {
                    if (z8) {
                        throw NotFoundException.f;
                    }
                    z9 = true;
                    z10 = z4;
                    z11 = z5;
                    z12 = z6;
                } else {
                    if (!z8) {
                        throw NotFoundException.f;
                    }
                    z11 = true;
                    z9 = z3;
                    z10 = z4;
                    z12 = z6;
                }
                if (z9) {
                    if (z10) {
                        throw NotFoundException.f;
                    }
                    AbstractRSSReader.h(fArr2, iArr5);
                }
                if (z10) {
                    AbstractRSSReader.g(fArr2, iArr5);
                }
                if (z11) {
                    if (z12) {
                        throw NotFoundException.f;
                    }
                    AbstractRSSReader.h(fArr2, iArr4);
                }
                if (z12) {
                    AbstractRSSReader.g(fArr, iArr4);
                }
                int i7 = (((i4 * 4) + (z ? 0 : 2)) + (!z2 ? 1 : 0)) - 1;
                int length3 = iArr5.length - 1;
                int i8 = 0;
                int i9 = 0;
                while (true) {
                    iArr2 = o;
                    if (length3 < 0) {
                        break;
                    }
                    if (i4 != 0 || !z || !z2) {
                        i8 += iArr5[length3] * iArr2[i7][length3 * 2];
                    }
                    i9 += iArr5[length3];
                    length3--;
                }
                int i10 = 0;
                for (int length4 = iArr4.length - 1; length4 >= 0; length4--) {
                    if (i4 != 0 || !z || !z2) {
                        i10 += iArr4[length4] * iArr2[i7][(length4 * 2) + 1];
                    }
                }
                int i11 = i8 + i10;
                if ((i9 & 1) != 0 || i9 > 13 || i9 < 4) {
                    throw NotFoundException.f;
                }
                int i12 = (13 - i9) / 2;
                int i13 = k[i12];
                return new DataCharacter(YU.a.C(RSSUtils.b(iArr5, i13, true), l[i12], RSSUtils.b(iArr4, 9 - i13, false), m[i12]), i11);
            }
            float f2 = (iArr[i5] * 1.0f) / fD;
            int i14 = (int) (0.5f + f2);
            if (i14 <= 0) {
                if (f2 < 0.3f) {
                    throw NotFoundException.f;
                }
                i14 = 1;
            } else if (i14 > 8) {
                if (f2 > 8.7f) {
                    throw NotFoundException.f;
                }
                i14 = 8;
            }
            int i15 = i5 / 2;
            if ((i5 & 1) == 0) {
                iArr5[i15] = i14;
                fArr2[i15] = f2 - i14;
            } else {
                iArr4[i15] = i14;
                fArr[i15] = f2 - i14;
            }
            i5++;
        }
    }

    public final List o(int i, BitArray bitArray) throws NotFoundException {
        boolean zEquals;
        boolean z;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.g;
            if (z2) {
                if (j()) {
                    return arrayList;
                }
                ArrayList arrayList2 = this.h;
                boolean zIsEmpty = arrayList2.isEmpty();
                int i2 = 0;
                boolean zEquals2 = false;
                while (true) {
                    if (i2 >= arrayList2.size()) {
                        zEquals = false;
                        break;
                    }
                    ExpandedRow expandedRow = (ExpandedRow) arrayList2.get(i2);
                    int i3 = expandedRow.b;
                    ArrayList arrayList3 = expandedRow.f16189a;
                    if (i3 > i) {
                        zEquals = arrayList3.equals(arrayList);
                        break;
                    }
                    zEquals2 = arrayList3.equals(arrayList);
                    i2++;
                }
                if (!zEquals && !zEquals2) {
                    Iterator it = arrayList2.iterator();
                    loop2: while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        ExpandedRow expandedRow2 = (ExpandedRow) it.next();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ExpandedPair expandedPair = (ExpandedPair) it2.next();
                            Iterator it3 = expandedRow2.f16189a.iterator();
                            while (it3.hasNext()) {
                                if (expandedPair.equals((ExpandedPair) it3.next())) {
                                    break;
                                }
                            }
                        }
                        z = true;
                        break loop2;
                    }
                    if (!z) {
                        arrayList2.add(i2, new ExpandedRow(i, arrayList));
                        Iterator it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            ExpandedRow expandedRow3 = (ExpandedRow) it4.next();
                            if (expandedRow3.f16189a.size() != arrayList.size()) {
                                Iterator it5 = expandedRow3.f16189a.iterator();
                                while (true) {
                                    if (!it5.hasNext()) {
                                        it4.remove();
                                        break;
                                    }
                                    if (!arrayList.contains((ExpandedPair) it5.next())) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                if (!zIsEmpty) {
                    List listL = l(false);
                    if (listL != null) {
                        return listL;
                    }
                    List listL2 = l(true);
                    if (listL2 != null) {
                        return listL2;
                    }
                }
                throw NotFoundException.f;
            }
            try {
                arrayList.add(p(bitArray, arrayList, i));
            } catch (NotFoundException e) {
                if (arrayList.isEmpty()) {
                    throw e;
                }
                z2 = true;
            }
        }
    }

    public final ExpandedPair p(BitArray bitArray, ArrayList arrayList, int i) throws NotFoundException {
        int i2;
        int i3;
        int i4;
        int iF;
        int i5;
        FinderPattern finderPattern;
        int[][] iArr;
        int i6;
        int i7 = 2;
        int i8 = 0;
        int i9 = 1;
        boolean z = arrayList.size() % 2 == 0;
        if (this.j) {
            z = !z;
        }
        int iE = -1;
        boolean z2 = true;
        while (true) {
            int[] iArr2 = this.f16185a;
            iArr2[i8] = i8;
            iArr2[i9] = i8;
            iArr2[i7] = i8;
            int i10 = 3;
            iArr2[3] = i8;
            int i11 = bitArray.e;
            int i12 = iE >= 0 ? iE : arrayList.isEmpty() ? i8 : ((ExpandedPair) YU.a.c(i9, arrayList)).c.b[i9];
            int i13 = arrayList.size() % i7 != 0 ? i9 : i8;
            if (this.j) {
                i13 ^= 1;
            }
            boolean z3 = i8;
            while (true) {
                if (i12 >= i11) {
                    break;
                }
                boolean zD = bitArray.d(i12);
                boolean z4 = !zD;
                if (zD) {
                    z3 = z4;
                    break;
                }
                i12++;
                z3 = z4;
            }
            int i14 = i7;
            int i15 = i8;
            boolean z5 = z3;
            int i16 = i12;
            while (i12 < i11) {
                int i17 = i8;
                if (bitArray.d(i12) != z5) {
                    iArr2[i15] = iArr2[i15] + i9;
                    i2 = i9;
                    i3 = i10;
                } else {
                    if (i15 == i10) {
                        if (i13 != 0) {
                            int length = iArr2.length;
                            i3 = i10;
                            int i18 = i17;
                            while (true) {
                                i4 = i9;
                                if (i18 >= length / 2) {
                                    break;
                                }
                                int i19 = iArr2[i18];
                                int i20 = (length - i18) - 1;
                                iArr2[i18] = iArr2[i20];
                                iArr2[i20] = i19;
                                i18++;
                                i9 = i4;
                            }
                        } else {
                            i4 = i9;
                            i3 = i10;
                        }
                        if (AbstractRSSReader.i(iArr2)) {
                            int[] iArr3 = this.i;
                            iArr3[i17] = i16;
                            iArr3[i4] = i12;
                            if (z) {
                                int i21 = i16 - 1;
                                while (i21 >= 0 && !bitArray.d(i21)) {
                                    i21--;
                                }
                                i16 = i21 + 1;
                                i5 = iArr3[i17] - i16;
                                iF = iArr3[i4];
                            } else {
                                iF = bitArray.f(i12 + 1);
                                i5 = iF - iArr3[i4];
                            }
                            int i22 = iF;
                            int i23 = i16;
                            System.arraycopy(iArr2, i17, iArr2, i4, iArr2.length - 1);
                            iArr2[i17] = i5;
                            DataCharacter dataCharacterN = null;
                            try {
                                iArr = n;
                            } catch (NotFoundException unused) {
                                finderPattern = null;
                            }
                            for (i6 = 0; i6 < 6; i6++) {
                                if (OneDReader.d(iArr2, iArr[i6], 0.45f) < 0.2f) {
                                    finderPattern = new FinderPattern(i6, i23, i22, i, new int[]{i23, i22});
                                    if (finderPattern == null) {
                                        int i24 = iArr3[0];
                                        iE = bitArray.d(i24) ? bitArray.e(bitArray.f(i24)) : bitArray.f(bitArray.e(i24));
                                    } else {
                                        z2 = false;
                                    }
                                    if (!z2) {
                                        DataCharacter dataCharacterN2 = n(bitArray, finderPattern, z, true);
                                        if (!arrayList.isEmpty() && ((ExpandedPair) YU.a.c(1, arrayList)).b == null) {
                                            throw NotFoundException.f;
                                        }
                                        try {
                                            dataCharacterN = n(bitArray, finderPattern, z, false);
                                        } catch (NotFoundException unused2) {
                                        }
                                        return new ExpandedPair(dataCharacterN2, dataCharacterN, finderPattern);
                                    }
                                    i7 = i14;
                                    i8 = 0;
                                    i9 = 1;
                                }
                            }
                            throw NotFoundException.f;
                        } else {
                            if (i13 != 0) {
                                int length2 = iArr2.length;
                                for (int i25 = 0; i25 < length2 / 2; i25++) {
                                    int i26 = iArr2[i25];
                                    int i27 = (length2 - i25) - 1;
                                    iArr2[i25] = iArr2[i27];
                                    iArr2[i27] = i26;
                                }
                            }
                            i2 = 1;
                            i17 = 0;
                            i16 += iArr2[0] + iArr2[1];
                            iArr2[0] = iArr2[i14];
                            iArr2[1] = iArr2[i3];
                            iArr2[i14] = 0;
                            iArr2[i3] = 0;
                            i15--;
                        }
                    } else {
                        i2 = i9;
                        i3 = i10;
                        i15++;
                    }
                    iArr2[i15] = i2;
                    z5 = !z5;
                }
                i12++;
                i8 = i17;
                i10 = i3;
                i9 = i2;
            }
            throw NotFoundException.f;
        }
    }

    @Override // com.google.zxing.oned.OneDReader, com.google.zxing.Reader
    public final void reset() {
        this.g.clear();
        this.h.clear();
    }
}
