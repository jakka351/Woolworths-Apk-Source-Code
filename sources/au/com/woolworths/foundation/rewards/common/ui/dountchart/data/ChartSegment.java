package au.com.woolworths.foundation.rewards.common.ui.dountchart.data;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/dountchart/data/ChartSegment;", "", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ChartSegment {

    /* renamed from: a, reason: collision with root package name */
    public final long f8579a;
    public final float b;

    public ChartSegment(long j, float f) {
        this.f8579a = j;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChartSegment)) {
            return false;
        }
        ChartSegment chartSegment = (ChartSegment) obj;
        return Color.c(this.f8579a, chartSegment.f8579a) && Float.compare(this.b, chartSegment.b) == 0;
    }

    public final int hashCode() {
        int i = Color.l;
        return Float.hashCode(this.b) + (Long.hashCode(this.f8579a) * 31);
    }

    public final String toString() {
        return "ChartSegment(color=" + Color.i(this.f8579a) + ", size=" + this.b + ")";
    }
}
