package au.com.woolworths.feature.shop.marketplace.ui.facet;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.feature.shop.marketplace.data.models.Marketplace;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceFacet;
import au.com.woolworths.feature.shop.marketplace.ui.facet.MarketplaceFacetContract;
import au.com.woolworths.feature.shop.marketplace.ui.main.MarketplaceActions;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceErrorState;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceInteractor;
import au.com.woolworths.feature.shop.marketplace.ui.marketplacesection.SearchBarListener;
import au.com.woolworths.feature.shop.marketplace.ui.marketplacesection.SearchBarViewState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/facet/MarketplaceFacetViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/feature/shop/marketplace/ui/facet/MarketplaceFacetListener;", "Lau/com/woolworths/feature/shop/marketplace/ui/marketplacesection/SearchBarListener;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public abstract class MarketplaceFacetViewModel extends ViewModel implements MarketplaceFacetListener, SearchBarListener, FullPageErrorStateClickHandler {
    public final AnalyticsManager e;
    public final MarketplaceInteractor f;
    public final SharedFlowImpl g;
    public final MutableStateFlow h;
    public final SharedFlowImpl i;
    public final StateFlow j;

    public MarketplaceFacetViewModel(AnalyticsManager analyticsManager, MarketplaceInteractor marketplaceInteractor) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = analyticsManager;
        this.f = marketplaceInteractor;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.g = sharedFlowImplB;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(MarketplaceFacetContract.ViewState.Initial.g);
        this.h = mutableStateFlowA;
        this.i = sharedFlowImplB;
        this.j = mutableStateFlowA;
    }

    public static ArrayList q6(List list, String str, SearchBarViewState searchBarViewState) {
        String string = str != null ? StringsKt.k0(str).toString() : null;
        if (string == null || string.length() == 0 || searchBarViewState.equals(SearchBarViewState.Hidden.d)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (StringsKt.o(((MarketplaceFacet) obj).getF7474a(), string, true)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // au.com.woolworths.feature.shop.marketplace.ui.facet.MarketplaceFacetListener
    public final void F2(MarketplaceFacet item, String channel, String facet) {
        Intrinsics.h(item, "item");
        Intrinsics.h(channel, "channel");
        Intrinsics.h(facet, "facet");
        String f7474a = item.getF7474a();
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.o0, getK());
        if (f7474a != null) {
            this.e.j(new MarketplaceActions.ButtonClick(f7474a), trackingMetadataA);
        }
        this.g.f(new MarketplaceFacetContract.Action.LaunchProductList(item.getF7474a(), channel, facet));
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        BuildersKt.c(ViewModelKt.a(this), null, null, new MarketplaceFacetViewModel$fetchMarketplace$1(this, true, null, null), 3);
    }

    public abstract Object p6(boolean z, Continuation continuation);

    /* renamed from: r6 */
    public abstract String getK();

    public abstract void s6(MutableStateFlow mutableStateFlow, MarketplaceErrorState marketplaceErrorState);

    public abstract void t6(MutableStateFlow mutableStateFlow, SearchBarViewState searchBarViewState);

    public abstract void u6(Marketplace marketplace, String str);
}
