package au.com.woolworths.foundation.feature.analytics.list;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/feature/analytics/list/ListItemsTrackerState;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "feature_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ListItemsTrackerState<T> {

    /* renamed from: a, reason: collision with root package name */
    public final LazyListState f8493a;
    public final Function1 b;
    public final MutableStateFlow c;
    public final SnapshotStateMap d;

    public ListItemsTrackerState(LazyListState lazyListState, Function1 onItemSeen) {
        Intrinsics.h(lazyListState, "lazyListState");
        Intrinsics.h(onItemSeen, "onItemSeen");
        this.f8493a = lazyListState;
        this.b = onItemSeen;
        this.c = StateFlowKt.a(EmptyList.d);
        this.d = new SnapshotStateMap();
    }

    public final void a(Object obj, String key) {
        MutableStateFlow mutableStateFlow;
        Object value;
        ArrayList arrayList;
        Intrinsics.h(key, "key");
        ListItemKeyToEvent listItemKeyToEvent = new ListItemKeyToEvent(key, obj);
        do {
            mutableStateFlow = this.c;
            value = mutableStateFlow.getValue();
            ArrayList arrayListC0 = CollectionsKt.c0((List) value, CollectionsKt.Q(listItemKeyToEvent));
            HashSet hashSet = new HashSet();
            arrayList = new ArrayList();
            Iterator it = arrayListC0.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (hashSet.add(((ListItemKeyToEvent) next).f8492a)) {
                    arrayList.add(next);
                }
            }
        } while (!mutableStateFlow.d(value, arrayList));
    }
}
