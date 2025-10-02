package androidx.compose.foundation.pager;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/pager/PagerSnapDistanceMaxPages;", "Landroidx/compose/foundation/pager/PagerSnapDistance;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PagerSnapDistanceMaxPages implements PagerSnapDistance {
    @Override // androidx.compose.foundation.pager.PagerSnapDistance
    public final int a(int i, int i2) {
        long j = i;
        long j2 = 1;
        long j3 = j - j2;
        if (j3 < 0) {
            j3 = 0;
        }
        int i3 = (int) j3;
        long j4 = j + j2;
        if (j4 > 2147483647L) {
            j4 = 2147483647L;
        }
        return RangesKt.c(i2, i3, (int) j4);
    }

    public final boolean equals(Object obj) {
        return obj instanceof PagerSnapDistanceMaxPages;
    }

    public final int hashCode() {
        return Integer.hashCode(1);
    }
}
