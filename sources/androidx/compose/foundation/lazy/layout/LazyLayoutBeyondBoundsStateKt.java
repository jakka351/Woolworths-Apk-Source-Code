package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.runtime.collection.MutableVector;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsStateKt {
    public static final List a(LazyLayoutItemProvider lazyLayoutItemProvider, LazyLayoutPinnedItemList lazyLayoutPinnedItemList, LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo) {
        IntRange intRange;
        MutableVector mutableVector = lazyLayoutBeyondBoundsInfo.f1034a;
        if (!(mutableVector.f != 0) && lazyLayoutPinnedItemList.d.isEmpty()) {
            return EmptyList.d;
        }
        ArrayList arrayList = new ArrayList();
        if (lazyLayoutBeyondBoundsInfo.f1034a.f != 0) {
            int i = mutableVector.f;
            if (i == 0) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr = mutableVector.d;
            int i2 = ((LazyLayoutBeyondBoundsInfo.Interval) objArr[0]).f1035a;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = ((LazyLayoutBeyondBoundsInfo.Interval) objArr[i3]).f1035a;
                if (i4 < i2) {
                    i2 = i4;
                }
            }
            if (i2 < 0) {
                InlineClassHelperKt.a("negative minIndex");
            }
            int i5 = mutableVector.f;
            if (i5 == 0) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr2 = mutableVector.d;
            int i6 = ((LazyLayoutBeyondBoundsInfo.Interval) objArr2[0]).b;
            for (int i7 = 0; i7 < i5; i7++) {
                int i8 = ((LazyLayoutBeyondBoundsInfo.Interval) objArr2[i7]).b;
                if (i8 > i6) {
                    i6 = i8;
                }
            }
            intRange = new IntRange(i2, Math.min(i6, lazyLayoutItemProvider.a() - 1), 1);
        } else {
            intRange = IntRange.g;
        }
        int size = lazyLayoutPinnedItemList.d.size();
        for (int i9 = 0; i9 < size; i9++) {
            LazyLayoutPinnedItemList.PinnedItem pinnedItem = (LazyLayoutPinnedItemList.PinnedItem) lazyLayoutPinnedItemList.get(i9);
            int iA = LazyLayoutItemProviderKt.a(pinnedItem.getIndex(), lazyLayoutItemProvider, pinnedItem.getKey());
            int i10 = intRange.d;
            if ((iA > intRange.e || i10 > iA) && iA >= 0 && iA < lazyLayoutItemProvider.a()) {
                arrayList.add(Integer.valueOf(iA));
            }
        }
        int i11 = intRange.d;
        int i12 = intRange.e;
        if (i11 <= i12) {
            while (true) {
                arrayList.add(Integer.valueOf(i11));
                if (i11 == i12) {
                    break;
                }
                i11++;
            }
        }
        return arrayList;
    }
}
