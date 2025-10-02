package au.com.woolworths.feature.shop.marketplace.ui.brands;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shop.marketplace.data.models.InfoHeader;
import au.com.woolworths.feature.shop.marketplace.data.models.Marketplace;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceBrands;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceLandingPageName;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceSection;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceSectionItem;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/brands/MarketplaceBrandsViewModel;", "Lau/com/woolworths/feature/shop/marketplace/ui/facet/MarketplaceFacetViewModel;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MarketplaceBrandsViewModel extends MarketplaceFacetViewModel {
    public final String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketplaceBrandsViewModel(AnalyticsManager analyticsManager, MarketplaceInteractor marketplaceInteractor) {
        super(analyticsManager, marketplaceInteractor);
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.k = "Brand everyday Market";
    }

    public static void v6(MutableStateFlow mutableStateFlow, boolean z, MarketplaceErrorState marketplaceErrorState) {
        InfoHeader infoHeader = ((MarketplaceFacetContract.ViewState) mutableStateFlow.getValue()).b;
        MarketplaceSectionItem marketplaceSectionItem = ((MarketplaceFacetContract.ViewState) mutableStateFlow.getValue()).c;
        mutableStateFlow.setValue(new MarketplaceFacetContract.ViewState.BrandsViewState(z, infoHeader, marketplaceSectionItem instanceof MarketplaceBrands ? (MarketplaceBrands) marketplaceSectionItem : null, ((MarketplaceFacetContract.ViewState) mutableStateFlow.getValue()).e, marketplaceErrorState));
    }

    @Override // au.com.woolworths.feature.shop.marketplace.ui.facet.MarketplaceFacetViewModel
    public final Object p6(boolean z, Continuation continuation) {
        Marketplace marketplace;
        v6(this.h, true, null);
        MarketplaceInteractor marketplaceInteractor = this.f;
        return (z || (marketplace = marketplaceInteractor.b) == null) ? marketplaceInteractor.a((ContinuationImpl) continuation) : marketplace;
    }

    @Override // au.com.woolworths.feature.shop.marketplace.ui.facet.MarketplaceFacetViewModel
    /* renamed from: r6, reason: from getter */
    public final String getK() {
        return this.k;
    }

    @Override // au.com.woolworths.feature.shop.marketplace.ui.facet.MarketplaceFacetViewModel
    public final void s6(MutableStateFlow mutableStateFlow, MarketplaceErrorState marketplaceErrorState) {
        Intrinsics.h(mutableStateFlow, "<this>");
        mutableStateFlow.setValue(new MarketplaceFacetContract.ViewState.BrandsViewState(false, ((MarketplaceFacetContract.ViewState) mutableStateFlow.getValue()).b, null, SearchBarViewState.Hidden.d, marketplaceErrorState));
    }

    @Override // au.com.woolworths.feature.shop.marketplace.ui.facet.MarketplaceFacetViewModel
    public final void t6(MutableStateFlow mutableStateFlow, SearchBarViewState searchBarViewState) {
        Intrinsics.h(mutableStateFlow, "<this>");
        Object value = mutableStateFlow.getValue();
        Intrinsics.f(value, "null cannot be cast to non-null type au.com.woolworths.feature.shop.marketplace.ui.facet.MarketplaceFacetContract.ViewState.BrandsViewState");
        MarketplaceFacetContract.ViewState.BrandsViewState brandsViewState = (MarketplaceFacetContract.ViewState.BrandsViewState) value;
        mutableStateFlow.setValue(new MarketplaceFacetContract.ViewState.BrandsViewState(brandsViewState.g, brandsViewState.h, brandsViewState.i, searchBarViewState, brandsViewState.k));
    }

    @Override // au.com.woolworths.feature.shop.marketplace.ui.facet.MarketplaceFacetViewModel
    public final void u6(Marketplace marketplace, String str) {
        MarketplaceSection marketplaceSection;
        MarketplaceErrorState marketplaceErrorState;
        SearchBarViewState searchBarViewState;
        MarketplaceBrands marketplaceBrands;
        Object next;
        if (marketplace != null) {
            Iterator it = marketplace.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((MarketplaceSection) next) instanceof MarketplaceBrands) {
                        break;
                    }
                }
            }
            marketplaceSection = (MarketplaceSection) next;
        } else {
            marketplaceSection = null;
        }
        MarketplaceBrands marketplaceBrands2 = marketplaceSection instanceof MarketplaceBrands ? (MarketplaceBrands) marketplaceSection : null;
        if (marketplaceBrands2 == null || marketplaceBrands2.e.isEmpty()) {
            this.e.c(MarketplaceActions.NoResultsError.f);
            marketplaceErrorState = MarketplaceErrorState.h;
        } else {
            marketplaceErrorState = null;
        }
        MutableStateFlow mutableStateFlow = this.h;
        if (marketplaceBrands2 == null) {
            v6(mutableStateFlow, false, marketplaceErrorState);
            return;
        }
        MarketplaceFacetContract.ViewState viewState = (MarketplaceFacetContract.ViewState) mutableStateFlow.getValue();
        boolean z = marketplaceErrorState != null;
        Intrinsics.h(viewState, "<this>");
        SearchBarViewState searchBarViewState2 = viewState.e;
        Object obj = SearchBarViewState.Hidden.d;
        SearchBarViewState searchBarViewState3 = searchBarViewState2.equals(obj) ? null : searchBarViewState2;
        if (searchBarViewState3 == null) {
            if (!z) {
                obj = SearchBarViewState.Inactive.d;
            }
            searchBarViewState = obj;
        } else {
            searchBarViewState = searchBarViewState3;
        }
        ArrayList arrayListQ6 = MarketplaceFacetViewModel.q6(marketplaceBrands2.e, str, searchBarViewState);
        InfoHeader infoHeader = marketplace.f7468a;
        if (arrayListQ6 != null) {
            MarketplaceLandingPageName pageName = marketplaceBrands2.f7470a;
            String str2 = marketplaceBrands2.b;
            String channel = marketplaceBrands2.c;
            String facet = marketplaceBrands2.d;
            Intrinsics.h(pageName, "pageName");
            Intrinsics.h(channel, "channel");
            Intrinsics.h(facet, "facet");
            marketplaceBrands = new MarketplaceBrands(pageName, str2, channel, facet, arrayListQ6);
        } else {
            marketplaceBrands = marketplaceBrands2;
        }
        mutableStateFlow.setValue(new MarketplaceFacetContract.ViewState.BrandsViewState(false, infoHeader, marketplaceBrands, searchBarViewState, marketplaceErrorState));
    }
}
