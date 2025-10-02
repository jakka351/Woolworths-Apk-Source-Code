package au.com.woolworths.feature.shop.marketplace.ui.sellers;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shop.marketplace.data.models.Marketplace;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceLandingPageName;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceSection;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceSectionItem;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceSellers;
import au.com.woolworths.feature.shop.marketplace.ui.facet.MarketplaceFacetContract;
import au.com.woolworths.feature.shop.marketplace.ui.facet.MarketplaceFacetViewModel;
import au.com.woolworths.feature.shop.marketplace.ui.main.MarketplaceActions;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceErrorState;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceInteractor;
import au.com.woolworths.feature.shop.marketplace.ui.marketplacesection.SearchBarViewState;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableStateFlow;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/sellers/MarketplaceSellersViewModel;", "Lau/com/woolworths/feature/shop/marketplace/ui/facet/MarketplaceFacetViewModel;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MarketplaceSellersViewModel extends MarketplaceFacetViewModel {
    public final String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketplaceSellersViewModel(AnalyticsManager analyticsManager, MarketplaceInteractor marketplaceInteractor) {
        super(analyticsManager, marketplaceInteractor);
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.k = "Seller everyday Market";
    }

    public static void v6(MutableStateFlow mutableStateFlow, boolean z, MarketplaceErrorState marketplaceErrorState) {
        MarketplaceSectionItem marketplaceSectionItem = ((MarketplaceFacetContract.ViewState) mutableStateFlow.getValue()).c;
        mutableStateFlow.setValue(new MarketplaceFacetContract.ViewState.SellersViewState(z, marketplaceSectionItem instanceof MarketplaceSellers ? (MarketplaceSellers) marketplaceSectionItem : null, ((MarketplaceFacetContract.ViewState) mutableStateFlow.getValue()).e, marketplaceErrorState));
    }

    @Override // au.com.woolworths.feature.shop.marketplace.ui.facet.MarketplaceFacetViewModel
    public final Object p6(boolean z, Continuation continuation) {
        Marketplace marketplace;
        v6(this.h, true, null);
        MarketplaceInteractor marketplaceInteractor = this.f;
        return (z || (marketplace = marketplaceInteractor.c) == null) ? marketplaceInteractor.b((ContinuationImpl) continuation) : marketplace;
    }

    @Override // au.com.woolworths.feature.shop.marketplace.ui.facet.MarketplaceFacetViewModel
    /* renamed from: r6, reason: from getter */
    public final String getK() {
        return this.k;
    }

    @Override // au.com.woolworths.feature.shop.marketplace.ui.facet.MarketplaceFacetViewModel
    public final void s6(MutableStateFlow mutableStateFlow, MarketplaceErrorState marketplaceErrorState) {
        Intrinsics.h(mutableStateFlow, "<this>");
        mutableStateFlow.setValue(new MarketplaceFacetContract.ViewState.SellersViewState(false, null, SearchBarViewState.Hidden.d, marketplaceErrorState));
    }

    @Override // au.com.woolworths.feature.shop.marketplace.ui.facet.MarketplaceFacetViewModel
    public final void t6(MutableStateFlow mutableStateFlow, SearchBarViewState searchBarViewState) {
        Intrinsics.h(mutableStateFlow, "<this>");
        Object value = mutableStateFlow.getValue();
        Intrinsics.f(value, "null cannot be cast to non-null type au.com.woolworths.feature.shop.marketplace.ui.facet.MarketplaceFacetContract.ViewState.SellersViewState");
        MarketplaceFacetContract.ViewState.SellersViewState sellersViewState = (MarketplaceFacetContract.ViewState.SellersViewState) value;
        mutableStateFlow.setValue(new MarketplaceFacetContract.ViewState.SellersViewState(sellersViewState.g, sellersViewState.h, searchBarViewState, sellersViewState.j));
    }

    @Override // au.com.woolworths.feature.shop.marketplace.ui.facet.MarketplaceFacetViewModel
    public final void u6(Marketplace marketplace, String str) {
        MarketplaceSection marketplaceSection;
        MarketplaceErrorState marketplaceErrorState;
        Object next;
        if (marketplace != null) {
            Iterator it = marketplace.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((MarketplaceSection) next) instanceof MarketplaceSellers) {
                        break;
                    }
                }
            }
            marketplaceSection = (MarketplaceSection) next;
        } else {
            marketplaceSection = null;
        }
        MarketplaceSellers marketplaceSellers = marketplaceSection instanceof MarketplaceSellers ? (MarketplaceSellers) marketplaceSection : null;
        if (marketplaceSellers == null || marketplaceSellers.e.isEmpty()) {
            this.e.c(MarketplaceActions.NoResultsError.f);
            marketplaceErrorState = MarketplaceErrorState.i;
        } else {
            marketplaceErrorState = null;
        }
        MutableStateFlow mutableStateFlow = this.h;
        if (marketplaceSellers == null) {
            v6(mutableStateFlow, false, marketplaceErrorState);
            return;
        }
        MarketplaceFacetContract.ViewState viewState = (MarketplaceFacetContract.ViewState) mutableStateFlow.getValue();
        boolean z = marketplaceErrorState != null;
        Intrinsics.h(viewState, "<this>");
        SearchBarViewState searchBarViewState = viewState.e;
        SearchBarViewState searchBarViewState2 = SearchBarViewState.Hidden.d;
        SearchBarViewState searchBarViewState3 = searchBarViewState.equals(searchBarViewState2) ? null : searchBarViewState;
        if (searchBarViewState3 != null) {
            searchBarViewState2 = searchBarViewState3;
        } else if (!z) {
            searchBarViewState2 = SearchBarViewState.Inactive.d;
        }
        ArrayList arrayListQ6 = MarketplaceFacetViewModel.q6(marketplaceSellers.e, str, searchBarViewState2);
        if (arrayListQ6 != null) {
            MarketplaceLandingPageName pageName = marketplaceSellers.f7475a;
            String str2 = marketplaceSellers.b;
            String channel = marketplaceSellers.c;
            String facet = marketplaceSellers.d;
            Intrinsics.h(pageName, "pageName");
            Intrinsics.h(channel, "channel");
            Intrinsics.h(facet, "facet");
            marketplaceSellers = new MarketplaceSellers(pageName, str2, channel, facet, arrayListQ6);
        }
        mutableStateFlow.setValue(new MarketplaceFacetContract.ViewState.SellersViewState(false, marketplaceSellers, searchBarViewState2, marketplaceErrorState));
    }
}
