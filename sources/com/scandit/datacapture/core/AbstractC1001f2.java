package com.scandit.datacapture.core;

import android.util.Range;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.f2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC1001f2 {

    /* renamed from: a, reason: collision with root package name */
    private static final Comparator f18495a = new androidx.browser.trusted.a(13);
    private static final Comparator b = new androidx.browser.trusted.a(14);

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(Range range, Range range2) {
        Object upper = range.getUpper();
        Intrinsics.g(upper, "o1.upper");
        int iIntValue = ((Number) upper).intValue();
        Object upper2 = range2.getUpper();
        Intrinsics.g(upper2, "o2.upper");
        if (iIntValue > ((Number) upper2).intValue()) {
            return -1;
        }
        Object upper3 = range.getUpper();
        Intrinsics.g(upper3, "o1.upper");
        int iIntValue2 = ((Number) upper3).intValue();
        Object upper4 = range2.getUpper();
        Intrinsics.g(upper4, "o2.upper");
        if (iIntValue2 < ((Number) upper4).intValue()) {
            return 1;
        }
        Object lower = range.getLower();
        Intrinsics.g(lower, "o1.lower");
        int iIntValue3 = ((Number) lower).intValue();
        Object lower2 = range2.getLower();
        Intrinsics.g(lower2, "o2.lower");
        if (iIntValue3 > ((Number) lower2).intValue()) {
            return -1;
        }
        Object lower3 = range.getLower();
        Intrinsics.g(lower3, "o1.lower");
        int iIntValue4 = ((Number) lower3).intValue();
        Object lower4 = range2.getLower();
        Intrinsics.g(lower4, "o2.lower");
        return iIntValue4 < ((Number) lower4).intValue() ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(Range range, Range range2) {
        Object upper = range.getUpper();
        Intrinsics.g(upper, "o1.upper");
        int iIntValue = ((Number) upper).intValue();
        Object upper2 = range2.getUpper();
        Intrinsics.g(upper2, "o2.upper");
        if (iIntValue > ((Number) upper2).intValue()) {
            return -1;
        }
        Object upper3 = range.getUpper();
        Intrinsics.g(upper3, "o1.upper");
        int iIntValue2 = ((Number) upper3).intValue();
        Object upper4 = range2.getUpper();
        Intrinsics.g(upper4, "o2.upper");
        if (iIntValue2 < ((Number) upper4).intValue()) {
            return 1;
        }
        Object lower = range.getLower();
        Intrinsics.g(lower, "o1.lower");
        int iIntValue3 = ((Number) lower).intValue();
        Object lower2 = range2.getLower();
        Intrinsics.g(lower2, "o2.lower");
        if (iIntValue3 < ((Number) lower2).intValue()) {
            return -1;
        }
        Object lower3 = range.getLower();
        Intrinsics.g(lower3, "o1.lower");
        int iIntValue4 = ((Number) lower3).intValue();
        Object lower4 = range2.getLower();
        Intrinsics.g(lower4, "o2.lower");
        return iIntValue4 > ((Number) lower4).intValue() ? 1 : 0;
    }

    public static final Range c(Range[] frameRateRanges, float f) {
        Intrinsics.h(frameRateRanges, "frameRateRanges");
        ArrayList arrayList = new ArrayList();
        for (Range range : frameRateRanges) {
            if ((((Integer) range.getUpper()) != null ? Float.valueOf(r4.intValue()) : null).floatValue() <= f) {
                arrayList.add(range);
            }
        }
        return (Range) CollectionsKt.F(CollectionsKt.u0(b, arrayList));
    }

    public static final Range a(Range[] frameRateRanges, float f) {
        Object next;
        Intrinsics.h(frameRateRanges, "frameRateRanges");
        ArrayList arrayList = new ArrayList();
        int length = frameRateRanges.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Range range = frameRateRanges[i];
            if ((((Integer) range.getUpper()) != null ? Float.valueOf(r5.intValue()) : null).floatValue() <= f) {
                arrayList.add(range);
            }
            i++;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                Integer num = (Integer) ((Range) next).getUpper();
                do {
                    Object next2 = it.next();
                    Integer num2 = (Integer) ((Range) next2).getUpper();
                    if (num.compareTo(num2) < 0) {
                        next = next2;
                        num = num2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Range range2 = (Range) next;
        Integer num3 = range2 != null ? (Integer) range2.getUpper() : null;
        if (num3 != null) {
            return new Range(num3, num3);
        }
        return null;
    }

    public static final Range b(Range[] frameRateRanges, float f) {
        Intrinsics.h(frameRateRanges, "frameRateRanges");
        ArrayList arrayList = new ArrayList();
        for (Range range : frameRateRanges) {
            if ((((Integer) range.getUpper()) != null ? Float.valueOf(r4.intValue()) : null).floatValue() <= f) {
                arrayList.add(range);
            }
        }
        return (Range) CollectionsKt.F(CollectionsKt.u0(f18495a, arrayList));
    }
}
