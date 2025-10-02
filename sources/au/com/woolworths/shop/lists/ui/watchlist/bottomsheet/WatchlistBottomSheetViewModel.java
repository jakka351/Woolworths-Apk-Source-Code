package au.com.woolworths.shop.lists.ui.watchlist.bottomsheet;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.shop.lists.ui.utils.ListsUtils;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/watchlist/bottomsheet/WatchlistBottomSheetViewModel;", "Landroidx/lifecycle/ViewModel;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WatchlistBottomSheetViewModel extends ViewModel {
    public final ListsUtils e;
    public final SharedFlowImpl f;
    public final Flow g;

    public WatchlistBottomSheetViewModel(ListsUtils listsUtils) {
        Intrinsics.h(listsUtils, "listsUtils");
        this.e = listsUtils;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.f = sharedFlowImplB;
        this.g = FlowKt.a(sharedFlowImplB);
    }
}
