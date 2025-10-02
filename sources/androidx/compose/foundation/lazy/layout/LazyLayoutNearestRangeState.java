package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "Landroidx/compose/runtime/State;", "Lkotlin/ranges/IntRange;", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class LazyLayoutNearestRangeState implements State<IntRange> {
    public final int d;
    public final int e;
    public final MutableState f;
    public int g;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState$Companion;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public LazyLayoutNearestRangeState(int i, int i2, int i3) {
        this.d = i2;
        this.e = i3;
        int i4 = (i / i2) * i2;
        this.f = SnapshotStateKt.e(RangesKt.o(Math.max(i4 - i3, 0), i4 + i2 + i3), SnapshotStateKt.n());
        this.g = i;
    }

    public final void b(int i) {
        if (i != this.g) {
            this.g = i;
            int i2 = this.d;
            int i3 = (i / i2) * i2;
            int i4 = this.e;
            ((SnapshotMutableStateImpl) this.f).setValue(RangesKt.o(Math.max(i3 - i4, 0), i3 + i2 + i4));
        }
    }

    @Override // androidx.compose.runtime.State
    /* renamed from: getValue */
    public final Object getD() {
        return (IntRange) ((SnapshotMutableStateImpl) this.f).getD();
    }
}
