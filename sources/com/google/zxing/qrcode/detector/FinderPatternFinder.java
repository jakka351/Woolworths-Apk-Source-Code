package com.google.zxing.qrcode.detector;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class FinderPatternFinder {
    public static final EstimatedModuleComparator f = new EstimatedModuleComparator();

    /* renamed from: a, reason: collision with root package name */
    public final BitMatrix f16232a;
    public boolean c;
    public final ResultPointCallback e;
    public final ArrayList b = new ArrayList();
    public final int[] d = new int[5];

    public static final class EstimatedModuleComparator implements Serializable, Comparator<FinderPattern> {
        @Override // java.util.Comparator
        public final int compare(FinderPattern finderPattern, FinderPattern finderPattern2) {
            return Float.compare(finderPattern.c, finderPattern2.c);
        }
    }

    public FinderPatternFinder(BitMatrix bitMatrix, ResultPointCallback resultPointCallback) {
        this.f16232a = bitMatrix;
        this.e = resultPointCallback;
    }

    public static float a(int i, int[] iArr) {
        return ((i - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    public static void b(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = 0;
        }
    }

    public static boolean c(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f2 = i / 7.0f;
        float f3 = f2 / 2.0f;
        return Math.abs(f2 - ((float) iArr[0])) < f3 && Math.abs(f2 - ((float) iArr[1])) < f3 && Math.abs((f2 * 3.0f) - ((float) iArr[2])) < 3.0f * f3 && Math.abs(f2 - ((float) iArr[3])) < f3 && Math.abs(f2 - ((float) iArr[4])) < f3;
    }

    public static double f(FinderPattern finderPattern, FinderPattern finderPattern2) {
        double d = finderPattern.f16132a - finderPattern2.f16132a;
        double d2 = finderPattern.b - finderPattern2.b;
        return (d2 * d2) + (d * d);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00e9  */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(int r20, int r21, int[] r22) {
        /*
            Method dump skipped, instructions count: 806
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.detector.FinderPatternFinder.d(int, int, int[]):boolean");
    }

    public final boolean e() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        Iterator it = arrayList.iterator();
        float fAbs = BitmapDescriptorFactory.HUE_RED;
        int i = 0;
        float f2 = 0.0f;
        while (it.hasNext()) {
            FinderPattern finderPattern = (FinderPattern) it.next();
            if (finderPattern.d >= 2) {
                i++;
                f2 += finderPattern.c;
            }
        }
        if (i >= 3) {
            float f3 = f2 / size;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                fAbs += Math.abs(((FinderPattern) it2.next()).c - f3);
            }
            if (fAbs <= f2 * 0.05f) {
                return true;
            }
        }
        return false;
    }
}
