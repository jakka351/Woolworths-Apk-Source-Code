package com.google.zxing.multi.qrcode.detector;

import com.google.zxing.qrcode.detector.FinderPattern;
import com.google.zxing.qrcode.detector.FinderPatternFinder;
import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes6.dex */
final class MultiFinderPatternFinder extends FinderPatternFinder {

    public static final class ModuleSizeComparator implements Serializable, Comparator<FinderPattern> {
        @Override // java.util.Comparator
        public final int compare(FinderPattern finderPattern, FinderPattern finderPattern2) {
            double d = finderPattern2.c - finderPattern.c;
            if (d < 0.0d) {
                return -1;
            }
            return d > 0.0d ? 1 : 0;
        }
    }
}
