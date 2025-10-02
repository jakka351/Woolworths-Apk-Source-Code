package androidx.compose.ui.layout;

import androidx.collection.MutableOrderedScatterSet;
import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/FixedCountSubcomposeSlotReusePolicy;", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class FixedCountSubcomposeSlotReusePolicy implements SubcomposeSlotReusePolicy {
    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public final void a(SubcomposeSlotReusePolicy.SlotIdsSet slotIdsSet) {
        int i;
        MutableOrderedScatterSet mutableOrderedScatterSet = slotIdsSet.d;
        if (mutableOrderedScatterSet.g > 0) {
            long[] jArr = mutableOrderedScatterSet.c;
            int i2 = mutableOrderedScatterSet.d;
            while (i2 != Integer.MAX_VALUE && (i = mutableOrderedScatterSet.g) > 0 && i != 0) {
                int i3 = (int) (jArr[i2] & 2147483647L);
                mutableOrderedScatterSet.i(i2);
                i2 = i3;
            }
        }
    }

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public final boolean b(Object obj, Object obj2) {
        return true;
    }
}
