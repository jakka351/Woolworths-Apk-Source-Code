package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;", "", "WrapEllipsisInfo", "WrapInfo", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class FlowLayoutBuildingBlocks {

    /* renamed from: a, reason: collision with root package name */
    public final int f958a;
    public final FlowLayoutOverflowState b;
    public final long c;
    public final int d;
    public final int e;
    public final int f;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;", "", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WrapEllipsisInfo {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;", "", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WrapInfo {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f959a;
        public final boolean b;

        public WrapInfo(boolean z, boolean z2) {
            this.f959a = z;
            this.b = z2;
        }
    }

    public FlowLayoutBuildingBlocks(int i, FlowLayoutOverflowState flowLayoutOverflowState, long j, int i2, int i3, int i4) {
        this.f958a = i;
        this.b = flowLayoutOverflowState;
        this.c = j;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public final WrapEllipsisInfo a(WrapInfo wrapInfo, boolean z, int i, int i2, int i3, int i4) {
        if (!wrapInfo.b) {
            return null;
        }
        this.b.getClass();
        FlowLayoutOverflow.OverflowType overflowType = FlowLayoutOverflow.OverflowType.d;
        return null;
    }

    public final WrapInfo b(boolean z, int i, long j, IntIntPair intIntPair, int i2, int i3, int i4, boolean z2, boolean z3) {
        int i5 = i3 + i4;
        if (intIntPair == null) {
            return new WrapInfo(true, true);
        }
        long j2 = intIntPair.f675a;
        this.b.getClass();
        FlowLayoutOverflow.OverflowType overflowType = FlowLayoutOverflow.OverflowType.d;
        FlowLayoutOverflow.OverflowType overflowType2 = FlowLayoutOverflow.OverflowType.d;
        if (i2 >= this.d || ((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)) < 0) {
            return new WrapInfo(true, true);
        }
        if (i != 0 && (i >= this.f958a || ((int) (j >> 32)) - ((int) (j2 >> 32)) < 0)) {
            return z2 ? new WrapInfo(true, true) : new WrapInfo(true, b(z, 0, IntIntPair.a(Constraints.h(this.c), (((int) (j & 4294967295L)) - this.f) - i4), new IntIntPair(IntIntPair.a(((int) (j2 >> 32)) - this.e, (int) (j2 & 4294967295L))), i2 + 1, i5, 0, true, false).b);
        }
        Math.max(i4, (int) (j2 & 4294967295L));
        return new WrapInfo(false, false);
    }
}
