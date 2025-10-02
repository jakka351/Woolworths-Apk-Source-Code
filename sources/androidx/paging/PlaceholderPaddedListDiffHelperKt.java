package androidx.paging;

import androidx.paging.OverlappingListsDiffDispatcher;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListUpdateCallback;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"paging-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PlaceholderPaddedListDiffHelperKt {
    public static final PlaceholderPaddedDiffResult a(final PlaceholderPaddedList placeholderPaddedList, final PlaceholderPaddedList newList, final DiffUtil.ItemCallback itemCallback) {
        Intrinsics.h(placeholderPaddedList, "<this>");
        Intrinsics.h(newList, "newList");
        final int e = placeholderPaddedList.getE();
        final int e2 = newList.getE();
        DiffUtil.Callback callback = new DiffUtil.Callback() { // from class: androidx.paging.PlaceholderPaddedListDiffHelperKt$computeDiff$diffResult$1
            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public final boolean a(int i, int i2) {
                Object item = placeholderPaddedList.getItem(i);
                Object item2 = newList.getItem(i2);
                if (item == item2) {
                    return true;
                }
                return itemCallback.a(item, item2);
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public final boolean b(int i, int i2) {
                Object item = placeholderPaddedList.getItem(i);
                Object item2 = newList.getItem(i2);
                if (item == item2) {
                    return true;
                }
                return itemCallback.b(item, item2);
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public final Object c(int i, int i2) {
                Object item = placeholderPaddedList.getItem(i);
                Object item2 = newList.getItem(i2);
                return item == item2 ? Boolean.TRUE : itemCallback.c(item, item2);
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            /* renamed from: d, reason: from getter */
            public final int getE() {
                return e2;
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            /* renamed from: e, reason: from getter */
            public final int getD() {
                return e;
            }
        };
        boolean z = true;
        DiffUtil.DiffResult diffResultA = DiffUtil.a(callback, true);
        Iterable iterableO = RangesKt.o(0, placeholderPaddedList.getE());
        if ((iterableO instanceof Collection) && ((Collection) iterableO).isEmpty()) {
            z = false;
        } else {
            IntProgressionIterator it = iterableO.iterator();
            while (it.f) {
                if (diffResultA.a(it.nextInt()) != -1) {
                    break;
                }
            }
            z = false;
        }
        return new PlaceholderPaddedDiffResult(diffResultA, z);
    }

    public static final void b(PlaceholderPaddedList placeholderPaddedList, ListUpdateCallback listUpdateCallback, PlaceholderPaddedList newList, PlaceholderPaddedDiffResult diffResult) {
        Intrinsics.h(placeholderPaddedList, "<this>");
        Intrinsics.h(newList, "newList");
        Intrinsics.h(diffResult, "diffResult");
        if (diffResult.b) {
            OverlappingListsDiffDispatcher.PlaceholderUsingUpdateCallback placeholderUsingUpdateCallback = new OverlappingListsDiffDispatcher.PlaceholderUsingUpdateCallback(placeholderPaddedList, newList, listUpdateCallback);
            diffResult.f3584a.b(placeholderUsingUpdateCallback);
            int iMin = Math.min(placeholderPaddedList.getF(), placeholderUsingUpdateCallback.g);
            int f = newList.getF() - placeholderUsingUpdateCallback.g;
            DiffingChangePayload diffingChangePayload = DiffingChangePayload.f;
            if (f > 0) {
                if (iMin > 0) {
                    listUpdateCallback.a(0, iMin, diffingChangePayload);
                }
                listUpdateCallback.d(0, f);
            } else if (f < 0) {
                listUpdateCallback.b(0, -f);
                int i = iMin + f;
                if (i > 0) {
                    listUpdateCallback.a(0, i, diffingChangePayload);
                }
            }
            placeholderUsingUpdateCallback.g = newList.getF();
            int iMin2 = Math.min(placeholderPaddedList.getG(), placeholderUsingUpdateCallback.h);
            int g = newList.getG();
            int i2 = placeholderUsingUpdateCallback.h;
            int i3 = g - i2;
            int i4 = placeholderUsingUpdateCallback.g + placeholderUsingUpdateCallback.i + i2;
            int i5 = i4 - iMin2;
            boolean z = i5 != placeholderPaddedList.getSize() - iMin2;
            if (i3 > 0) {
                listUpdateCallback.d(i4, i3);
            } else if (i3 < 0) {
                listUpdateCallback.b(i4 + i3, -i3);
                iMin2 += i3;
            }
            if (iMin2 > 0 && z) {
                listUpdateCallback.a(i5, iMin2, diffingChangePayload);
            }
            placeholderUsingUpdateCallback.h = newList.getG();
            return;
        }
        int iMax = Math.max(placeholderPaddedList.getF(), newList.getF());
        int iMin3 = Math.min(placeholderPaddedList.getE() + placeholderPaddedList.getF(), newList.getE() + newList.getF());
        int i6 = iMin3 - iMax;
        if (i6 > 0) {
            listUpdateCallback.b(iMax, i6);
            listUpdateCallback.d(iMax, i6);
        }
        int iMin4 = Math.min(iMax, iMin3);
        int iMax2 = Math.max(iMax, iMin3);
        int f2 = placeholderPaddedList.getF();
        int size = newList.getSize();
        if (f2 > size) {
            f2 = size;
        }
        int e = placeholderPaddedList.getE() + placeholderPaddedList.getF();
        int size2 = newList.getSize();
        if (e > size2) {
            e = size2;
        }
        int i7 = iMin4 - f2;
        DiffingChangePayload diffingChangePayload2 = DiffingChangePayload.d;
        if (i7 > 0) {
            listUpdateCallback.a(f2, i7, diffingChangePayload2);
        }
        int i8 = e - iMax2;
        if (i8 > 0) {
            listUpdateCallback.a(iMax2, i8, diffingChangePayload2);
        }
        int f3 = newList.getF();
        int size3 = placeholderPaddedList.getSize();
        if (f3 > size3) {
            f3 = size3;
        }
        int e2 = newList.getE() + newList.getF();
        int size4 = placeholderPaddedList.getSize();
        if (e2 > size4) {
            e2 = size4;
        }
        int i9 = iMin4 - f3;
        DiffingChangePayload diffingChangePayload3 = DiffingChangePayload.e;
        if (i9 > 0) {
            listUpdateCallback.a(f3, i9, diffingChangePayload3);
        }
        int i10 = e2 - iMax2;
        if (i10 > 0) {
            listUpdateCallback.a(iMax2, i10, diffingChangePayload3);
        }
        int size5 = newList.getSize() - placeholderPaddedList.getSize();
        if (size5 > 0) {
            listUpdateCallback.d(placeholderPaddedList.getSize(), size5);
        } else if (size5 < 0) {
            listUpdateCallback.b(placeholderPaddedList.getSize() + size5, -size5);
        }
    }

    public static final int c(PlaceholderPaddedList placeholderPaddedList, PlaceholderPaddedDiffResult placeholderPaddedDiffResult, PlaceholderPaddedList newList, int i) {
        int iA;
        Intrinsics.h(placeholderPaddedList, "<this>");
        Intrinsics.h(newList, "newList");
        if (!placeholderPaddedDiffResult.b) {
            return RangesKt.d(i, RangesKt.o(0, newList.getSize()));
        }
        int f = i - placeholderPaddedList.getF();
        int e = placeholderPaddedList.getE();
        if (f >= 0 && f < e) {
            for (int i2 = 0; i2 < 30; i2++) {
                int i3 = ((i2 / 2) * (i2 % 2 == 1 ? -1 : 1)) + f;
                if (i3 >= 0 && i3 < placeholderPaddedList.getE() && (iA = placeholderPaddedDiffResult.f3584a.a(i3)) != -1) {
                    return newList.getF() + iA;
                }
            }
        }
        return RangesKt.d(i, RangesKt.o(0, newList.getSize()));
    }
}
