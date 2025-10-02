package au.com.woolworths.feature.shop.catalogue.storeselector;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.feature.shop.catalogue.models.CatalogueStoreSearchListInfo;
import au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorContract;
import au.com.woolworths.feature.shop.catalogue.storeselector.analytics.CatalogueStoreSelectorActions;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/storeselector/CatalogueStoreSelectorViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "Lau/com/woolworths/feature/shop/catalogue/storeselector/CatalogueSelectorFullPageErrorActionInterface;", "Companion", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CatalogueStoreSelectorViewModel extends ViewModel implements FullPageErrorStateClickHandler, CatalogueSelectorFullPageErrorActionInterface {
    public final CatalogueStoreSelectorInteractor e;
    public final AnalyticsManager f;
    public final MutableLiveData g;
    public final SharedFlowImpl h;
    public final Flow i;
    public String j;
    public final SharedFlowImpl k;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/storeselector/CatalogueStoreSelectorViewModel$Companion;", "", "", "MINIMUM_SEARCH_THRESHOLD", "I", "", "DEBOUNCE_TIME", "J", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public CatalogueStoreSelectorViewModel(CatalogueStoreSelectorInteractor catalogueStoreSelectorInteractor, AnalyticsManager analyticsManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = catalogueStoreSelectorInteractor;
        this.f = analyticsManager;
        this.g = new MutableLiveData();
        BufferOverflow bufferOverflow = BufferOverflow.e;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, bufferOverflow, 1);
        this.h = sharedFlowImplB;
        this.i = FlowKt.a(sharedFlowImplB);
        this.j = "";
        this.k = SharedFlowKt.b(0, 1, bufferOverflow, 1);
        BuildersKt.c(ViewModelKt.a(this), null, null, new CatalogueStoreSelectorViewModel$subscribeToInput$1(this, null), 3);
    }

    public static final CatalogueStoreSelectorContract.ViewState p6(CatalogueStoreSelectorViewModel catalogueStoreSelectorViewModel, Exception exc) {
        AnalyticsManager analyticsManager = catalogueStoreSelectorViewModel.f;
        if (exc instanceof NoConnectivityException) {
            analyticsManager.c(CatalogueStoreSelectorActions.e);
            return r6(catalogueStoreSelectorViewModel, CatalogueStoreSelectorContract.PageState.g, CatalogueStoreSelectorErrorState.d, null, 4);
        }
        analyticsManager.c(CatalogueStoreSelectorActions.g);
        return r6(catalogueStoreSelectorViewModel, CatalogueStoreSelectorContract.PageState.g, CatalogueStoreSelectorErrorState.e, null, 4);
    }

    public static final void q6(CatalogueStoreSelectorViewModel catalogueStoreSelectorViewModel, CatalogueStoreSearchListInfo catalogueStoreSearchListInfo) {
        CatalogueStoreSelectorContract.ViewState viewStateR6;
        MutableLiveData mutableLiveData = catalogueStoreSelectorViewModel.g;
        if (catalogueStoreSearchListInfo.getCatalogueStoresList().isEmpty() && catalogueStoreSelectorViewModel.j.length() == 0) {
            mutableLiveData.m(r6(catalogueStoreSelectorViewModel, CatalogueStoreSelectorContract.PageState.e, null, new CatalogueStoreSearchListInfo(EmptyList.d), 2));
            return;
        }
        AnalyticsManager analyticsManager = catalogueStoreSelectorViewModel.f;
        if (catalogueStoreSearchListInfo.getCatalogueStoresList().isEmpty()) {
            analyticsManager.c(CatalogueStoreSelectorActions.f);
            viewStateR6 = r6(catalogueStoreSelectorViewModel, CatalogueStoreSelectorContract.PageState.g, CatalogueStoreSelectorErrorState.f, null, 4);
        } else {
            String str = catalogueStoreSelectorViewModel.j;
            int size = catalogueStoreSearchListInfo.getCatalogueStoresList().size();
            TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.J2, str);
            trackingMetadataA.b(TrackableValue.Q2, "location");
            trackingMetadataA.b(TrackableValue.O2, Integer.valueOf(size));
            analyticsManager.j(CatalogueStoreSelectorActions.i, trackingMetadataA);
            viewStateR6 = r6(catalogueStoreSelectorViewModel, CatalogueStoreSelectorContract.PageState.f, null, catalogueStoreSearchListInfo, 2);
        }
        mutableLiveData.m(viewStateR6);
    }

    public static CatalogueStoreSelectorContract.ViewState r6(CatalogueStoreSelectorViewModel catalogueStoreSelectorViewModel, CatalogueStoreSelectorContract.PageState pageState, CatalogueStoreSelectorErrorState catalogueStoreSelectorErrorState, CatalogueStoreSearchListInfo catalogueStoreSearchListInfo, int i) {
        CatalogueStoreSelectorErrorState catalogueStoreSelectorErrorState2 = null;
        if ((i & 2) != 0) {
            catalogueStoreSelectorErrorState = null;
        }
        if ((i & 4) != 0) {
            catalogueStoreSearchListInfo = null;
        }
        if (catalogueStoreSelectorErrorState == null) {
            CatalogueStoreSelectorContract.ViewState viewState = (CatalogueStoreSelectorContract.ViewState) catalogueStoreSelectorViewModel.g.e();
            if (viewState != null) {
                catalogueStoreSelectorErrorState2 = viewState.b;
            }
        } else {
            catalogueStoreSelectorViewModel.getClass();
            catalogueStoreSelectorErrorState2 = catalogueStoreSelectorErrorState;
        }
        if (catalogueStoreSearchListInfo == null) {
            catalogueStoreSearchListInfo = new CatalogueStoreSearchListInfo(EmptyList.d);
        }
        return new CatalogueStoreSelectorContract.ViewState(pageState, catalogueStoreSelectorErrorState2, catalogueStoreSearchListInfo);
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onPrimaryActionClicked() {
        CatalogueStoreSelectorErrorState catalogueStoreSelectorErrorState;
        CatalogueStoreSelectorContract.ViewState viewState = (CatalogueStoreSelectorContract.ViewState) this.g.e();
        if (viewState == null || (catalogueStoreSelectorErrorState = viewState.b) == null) {
            return;
        }
        catalogueStoreSelectorErrorState.a(this);
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        CatalogueStoreSelectorErrorState catalogueStoreSelectorErrorState;
        CatalogueStoreSelectorContract.ViewState viewState = (CatalogueStoreSelectorContract.ViewState) this.g.e();
        if (viewState == null || (catalogueStoreSelectorErrorState = viewState.b) == null) {
            return;
        }
        catalogueStoreSelectorErrorState.b(this);
    }

    public final void s6() {
        this.f.c(CatalogueStoreSelectorActions.j);
        this.k.f(this.j);
    }
}
