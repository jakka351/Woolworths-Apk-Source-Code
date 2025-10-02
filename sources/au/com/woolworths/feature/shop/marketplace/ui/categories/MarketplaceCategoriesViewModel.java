package au.com.woolworths.feature.shop.marketplace.ui.categories;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.feature.shop.marketplace.data.models.Marketplace;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceCategories;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceCategory;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceSection;
import au.com.woolworths.feature.shop.marketplace.ui.categories.MarketplaceCategoriesContract;
import au.com.woolworths.feature.shop.marketplace.ui.main.MarketplaceActions;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceErrorState;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceInteractor;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/categories/MarketplaceCategoriesViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/feature/shop/marketplace/ui/categories/MarketplaceCategoriesListener;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MarketplaceCategoriesViewModel extends ViewModel implements MarketplaceCategoriesListener, FullPageErrorStateClickHandler {
    public final AnalyticsManager e;
    public final MarketplaceInteractor f;
    public final SharedFlowImpl g;
    public final MutableStateFlow h;
    public final SharedFlowImpl i;
    public final StateFlow j;

    public MarketplaceCategoriesViewModel(AnalyticsManager analyticsManager, MarketplaceInteractor marketplaceInteractor) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = analyticsManager;
        this.f = marketplaceInteractor;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.g = sharedFlowImplB;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(MarketplaceCategoriesContract.ViewState.d);
        this.h = mutableStateFlowA;
        this.i = sharedFlowImplB;
        this.j = mutableStateFlowA;
    }

    public static final MarketplaceCategories p6(MarketplaceCategoriesViewModel marketplaceCategoriesViewModel, Marketplace marketplace) {
        Object next;
        Iterator it = marketplace.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((MarketplaceSection) next) instanceof MarketplaceCategories) {
                break;
            }
        }
        if (next instanceof MarketplaceCategories) {
            return (MarketplaceCategories) next;
        }
        return null;
    }

    public static final void q6(MarketplaceCategoriesViewModel marketplaceCategoriesViewModel, MutableStateFlow mutableStateFlow, MarketplaceCategories marketplaceCategories) {
        MarketplaceErrorState marketplaceErrorState = null;
        ArrayList arrayList = marketplaceCategories != null ? marketplaceCategories.e : null;
        if (arrayList == null || arrayList.isEmpty()) {
            marketplaceCategoriesViewModel.e.c(MarketplaceActions.NoResultsError.f);
            marketplaceErrorState = MarketplaceErrorState.g;
        }
        mutableStateFlow.setValue(new MarketplaceCategoriesContract.ViewState(false, marketplaceCategories, marketplaceErrorState));
    }

    public static void s6(MutableStateFlow mutableStateFlow, boolean z, MarketplaceErrorState marketplaceErrorState) {
        mutableStateFlow.setValue(new MarketplaceCategoriesContract.ViewState(z, ((MarketplaceCategoriesContract.ViewState) mutableStateFlow.getValue()).b, marketplaceErrorState));
    }

    @Override // au.com.woolworths.feature.shop.marketplace.ui.categories.MarketplaceCategoriesListener
    public final void K5(MarketplaceCategory category, String channel, String facet) {
        Intrinsics.h(category, "category");
        String str = category.f7472a;
        Intrinsics.h(channel, "channel");
        Intrinsics.h(facet, "facet");
        String str2 = category.b;
        this.e.c(new MarketplaceActions.ButtonClick(str2));
        boolean z = category.d;
        SharedFlowImpl sharedFlowImpl = this.g;
        if (z) {
            sharedFlowImpl.f(new MarketplaceCategoriesContract.Action.LaunchProductList(str, str2, channel, facet, category.e));
        } else {
            sharedFlowImpl.f(new MarketplaceCategoriesContract.Action.LaunchProductSubCategory(str, str2));
        }
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        r6();
    }

    public final void r6() {
        BuildersKt.c(ViewModelKt.a(this), null, null, new MarketplaceCategoriesViewModel$fetchCategories$1(this, null), 3);
    }
}
