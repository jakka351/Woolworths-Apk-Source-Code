package au.com.woolworths.foundation.feature.analytics.list;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import au.com.woolworths.feature.shop.myorders.details.infomodal.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/feature/analytics/list/ItemsSeenState;", "", "feature_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ItemsSeenState {

    /* renamed from: a, reason: collision with root package name */
    public final LazyListState f8491a;
    public final float b;
    public final Function1 c;
    public final SnapshotStateMap d;
    public final Flow e;

    public ItemsSeenState(float f, LazyListState listState, Function1 onItemsSeen) {
        Intrinsics.h(listState, "listState");
        Intrinsics.h(onItemsSeen, "onItemsSeen");
        this.f8491a = listState;
        this.b = f;
        this.c = onItemsSeen;
        this.d = new SnapshotStateMap();
        this.e = SnapshotStateKt.m(new a(this, 19));
    }
}
