package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/pager/PagerScrollPosition;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PagerScrollPosition {

    /* renamed from: a, reason: collision with root package name */
    public final PagerState f1090a;
    public final MutableIntState b;
    public final MutableFloatState c;
    public boolean d;
    public Object e;
    public final LazyLayoutNearestRangeState f;

    public PagerScrollPosition(int i, float f, PagerState pagerState) {
        this.f1090a = pagerState;
        this.b = SnapshotIntStateKt.a(i);
        this.c = PrimitiveSnapshotStateKt.a(f);
        this.f = new LazyLayoutNearestRangeState(i, 30, 100);
    }
}
