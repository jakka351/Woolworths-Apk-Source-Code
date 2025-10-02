package au.com.woolworths.shop.lists.ui.shoppinglist.sort.sortbottomsheet;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.shop.lists.data.utils.ListsInMemoryRepository;
import au.com.woolworths.shop.lists.ui.shoppinglist.sort.sortbottomsheet.SortByBottomSheetContract;
import au.com.woolworths.shop.lists.ui.utils.ListsUtils;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/sortbottomsheet/SortByBottomSheetViewModel;", "Landroidx/lifecycle/ViewModel;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SortByBottomSheetViewModel extends ViewModel {
    public final ListsInMemoryRepository e;
    public final AnalyticsManager f;
    public final MutableStateFlow g;
    public final StateFlow h;
    public boolean i;
    public final Lazy j;

    public SortByBottomSheetViewModel(ListsInMemoryRepository listsInMemoryRepository, AnalyticsManager analyticsManager, ListsUtils listsUtils) {
        Intrinsics.h(listsInMemoryRepository, "listsInMemoryRepository");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(listsUtils, "listsUtils");
        this.e = listsInMemoryRepository;
        this.f = analyticsManager;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new SortByBottomSheetContract.ViewState(listsUtils.d()));
        this.g = mutableStateFlowA;
        this.h = mutableStateFlowA;
        this.j = LazyKt.b(new au.com.woolworths.shop.cart.ui.c(this, 25));
    }
}
