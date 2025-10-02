package androidx.compose.foundation.lazy.layout;

import androidx.collection.IntList;
import androidx.collection.MutableIntList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class LazyLayoutStickyItemsKt {
    public static final List a(StickyItemsPlacement stickyItemsPlacement, ArrayList arrayList, IntList intList, int i, int i2, int i3, int i4, Function1 function1) {
        int i5;
        StickyItemsPlacement stickyItemsPlacement2 = stickyItemsPlacement;
        if (stickyItemsPlacement2 == null || arrayList.isEmpty() || intList.b == 0) {
            return EmptyList.d;
        }
        MutableIntList mutableIntListB = stickyItemsPlacement2.b(((LazyLayoutMeasuredItem) CollectionsKt.D(arrayList)).getF1015a(), ((LazyLayoutMeasuredItem) CollectionsKt.O(arrayList)).getF1015a(), intList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            Object obj = arrayList.get(i6);
            int f1015a = ((LazyLayoutMeasuredItem) obj).getF1015a();
            int[] iArr = intList.f676a;
            int i7 = intList.b;
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    break;
                }
                if (iArr[i8] == f1015a) {
                    arrayList3.add(obj);
                    break;
                }
                i8++;
            }
        }
        int[] iArr2 = mutableIntListB.f676a;
        int i9 = mutableIntListB.b;
        int i10 = 0;
        while (i10 < i9) {
            int i11 = iArr2[i10];
            Iterator it = arrayList.iterator();
            int i12 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i12 = -1;
                    break;
                }
                if (((LazyLayoutMeasuredItem) it.next()).getF1015a() == i11) {
                    break;
                }
                i12++;
            }
            LazyLayoutMeasuredItem lazyLayoutMeasuredItem = i12 == -1 ? (LazyLayoutMeasuredItem) function1.invoke(Integer.valueOf(i11)) : (LazyLayoutMeasuredItem) arrayList.remove(i12);
            ArrayList arrayList4 = arrayList3;
            int q = lazyLayoutMeasuredItem.getQ();
            if (i12 == -1) {
                i5 = Integer.MIN_VALUE;
            } else {
                long jN = lazyLayoutMeasuredItem.n(0);
                i5 = (int) (lazyLayoutMeasuredItem.getC() ? jN & 4294967295L : jN >> 32);
            }
            int iA = stickyItemsPlacement2.a(arrayList4, i11, q, i5, i);
            lazyLayoutMeasuredItem.j();
            lazyLayoutMeasuredItem.i(iA, 0, i3, i4);
            arrayList2.add(lazyLayoutMeasuredItem);
            i10++;
            stickyItemsPlacement2 = stickyItemsPlacement;
            arrayList3 = arrayList4;
        }
        return arrayList2;
    }
}
