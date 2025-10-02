package androidx.compose.ui.semantics;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ProgressBarRangeInfo {
    public static final ProgressBarRangeInfo d = new ProgressBarRangeInfo(BitmapDescriptorFactory.HUE_RED, RangesKt.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED), 0);

    /* renamed from: a, reason: collision with root package name */
    public final float f2013a;
    public final ClosedFloatingPointRange b;
    public final int c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/semantics/ProgressBarRangeInfo$Companion;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public ProgressBarRangeInfo(float f, ClosedFloatingPointRange closedFloatingPointRange, int i) {
        this.f2013a = f;
        this.b = closedFloatingPointRange;
        this.c = i;
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgressBarRangeInfo)) {
            return false;
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) obj;
        return this.f2013a == progressBarRangeInfo.f2013a && Intrinsics.c(this.b, progressBarRangeInfo.b) && this.c == progressBarRangeInfo.c;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (Float.hashCode(this.f2013a) * 31)) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=");
        sb.append(this.f2013a);
        sb.append(", range=");
        sb.append(this.b);
        sb.append(", steps=");
        return a.l(sb, this.c, ')');
    }
}
