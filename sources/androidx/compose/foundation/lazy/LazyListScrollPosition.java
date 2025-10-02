package androidx.compose.foundation.lazy;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotMutableIntStateImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListScrollPosition;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class LazyListScrollPosition {

    /* renamed from: a, reason: collision with root package name */
    public final MutableIntState f998a;
    public final MutableIntState b;
    public boolean c;
    public Object d;
    public final LazyLayoutNearestRangeState e;

    public LazyListScrollPosition(int i, int i2) {
        this.f998a = SnapshotIntStateKt.a(i);
        this.b = SnapshotIntStateKt.a(i2);
        this.e = new LazyLayoutNearestRangeState(i, 30, 100);
    }

    public final void a(int i, int i2) {
        if (i < BitmapDescriptorFactory.HUE_RED) {
            InlineClassHelperKt.a("Index should be non-negative (" + i + ')');
        }
        ((SnapshotMutableIntStateImpl) this.f998a).i(i);
        this.e.b(i);
        ((SnapshotMutableIntStateImpl) this.b).i(i2);
    }
}
