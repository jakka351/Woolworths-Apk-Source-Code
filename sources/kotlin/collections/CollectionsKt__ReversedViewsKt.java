package kotlin.collections;

import YU.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes.dex */
class CollectionsKt__ReversedViewsKt extends CollectionsKt__MutableCollectionsKt {
    public static final int d(int i, List list) {
        if (i >= 0 && i <= CollectionsKt.I(list)) {
            return CollectionsKt.I(list) - i;
        }
        StringBuilder sbR = a.r(i, "Element index ", " must be in range [");
        sbR.append(new IntRange(0, CollectionsKt.I(list), 1));
        sbR.append("].");
        throw new IndexOutOfBoundsException(sbR.toString());
    }

    public static final int e(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder sbR = a.r(i, "Position index ", " must be in range [");
        sbR.append(new IntRange(0, list.size(), 1));
        sbR.append("].");
        throw new IndexOutOfBoundsException(sbR.toString());
    }
}
