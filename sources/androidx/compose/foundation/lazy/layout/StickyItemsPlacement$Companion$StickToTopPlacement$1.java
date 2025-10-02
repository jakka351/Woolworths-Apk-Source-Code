package androidx.compose.foundation.lazy.layout;

import androidx.collection.IntList;
import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/lazy/layout/StickyItemsPlacement$Companion$StickToTopPlacement$1", "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class StickyItemsPlacement$Companion$StickToTopPlacement$1 implements StickyItemsPlacement {
    @Override // androidx.compose.foundation.lazy.layout.StickyItemsPlacement
    public final int a(ArrayList arrayList, int i, int i2, int i3, int i4) {
        Object obj;
        int i5;
        int size = arrayList.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i6);
            if (((LazyLayoutMeasuredItem) obj).getF1075a() != i) {
                break;
            }
            i6++;
        }
        LazyLayoutMeasuredItem lazyLayoutMeasuredItem = (LazyLayoutMeasuredItem) obj;
        if (lazyLayoutMeasuredItem != null) {
            long jN = lazyLayoutMeasuredItem.n(0);
            i5 = (int) (lazyLayoutMeasuredItem.getD() ? jN & 4294967295L : jN >> 32);
        } else {
            i5 = Integer.MIN_VALUE;
        }
        int iMax = i3 == Integer.MIN_VALUE ? -i4 : Math.max(-i4, i3);
        return i5 != Integer.MIN_VALUE ? Math.min(iMax, i5 - i2) : iMax;
    }

    @Override // androidx.compose.foundation.lazy.layout.StickyItemsPlacement
    public final MutableIntList b(int i, int i2, IntList intList) {
        int i3;
        if (i2 - i < 0 || (i3 = intList.b) == 0) {
            return IntListKt.f677a;
        }
        IntRange intRangeO = RangesKt.o(0, i3);
        int i4 = intRangeO.d;
        int i5 = intRangeO.e;
        int iA = -1;
        if (i4 <= i5) {
            while (intList.a(i4) <= i) {
                iA = intList.a(i4);
                if (i4 == i5) {
                    break;
                }
                i4++;
            }
        }
        if (iA == -1) {
            return IntListKt.f677a;
        }
        MutableIntList mutableIntList = IntListKt.f677a;
        MutableIntList mutableIntList2 = new MutableIntList(1);
        mutableIntList2.c(iA);
        return mutableIntList2;
    }
}
