package au.com.woolworths.feature.shop.catalogue.details;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.feature.shop.catalogue.common.AnalyticsAction;
import au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsContract;
import au.com.woolworths.feature.shop.catalogue.details.analytics.CatalogueDetailsActions;
import au.com.woolworths.feature.shop.catalogue.home.model.CatalogueTracking;
import au.com.woolworths.feature.shop.catalogue.home.model.CatalogueTrackingKt;
import au.com.woolworths.feature.shop.catalogue.models.CatalogueSaleDetailInfo;
import au.com.woolworths.feature.shop.catalogue.models.CatalogueStoreInfo;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailsFullPageErrorActionInterface;", "Companion", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CatalogueDetailsViewModel extends ViewModel implements FullPageErrorStateClickHandler, CatalogueDetailsFullPageErrorActionInterface {
    public final CatalogueDetailsInteractor e;
    public final AnalyticsManager f;
    public final CartUpdateInteractor g;
    public final MutableLiveData h;
    public final SharedFlowImpl i;
    public final Flow j;
    public final MutableLiveData k;
    public String l;
    public CatalogueTracking m;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailsViewModel$Companion;", "", "", "YOUTUBE_URL_PREFIX", "Ljava/lang/String;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public CatalogueDetailsViewModel(CatalogueDetailsInteractor catalogueDetailsInteractor, AnalyticsManager analyticsManager, CartUpdateInteractor cartUpdateInteractor) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(cartUpdateInteractor, "cartUpdateInteractor");
        this.e = catalogueDetailsInteractor;
        this.f = analyticsManager;
        this.g = cartUpdateInteractor;
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.h = mutableLiveData;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.i = sharedFlowImplB;
        this.j = FlowKt.a(sharedFlowImplB);
        this.k = mutableLiveData;
    }

    public static CatalogueDetailsContract.ViewState q6(CatalogueDetailsViewModel catalogueDetailsViewModel, CatalogueDetailsContract.PageState pageState, CatalogueDetailsPageErrorState catalogueDetailsPageErrorState, CatalogueSaleDetailInfo catalogueSaleDetailInfo, int i) {
        CatalogueDetailsPageErrorState catalogueDetailsPageErrorState2 = null;
        if ((i & 2) != 0) {
            catalogueDetailsPageErrorState = null;
        }
        if ((i & 4) != 0) {
            catalogueSaleDetailInfo = new CatalogueSaleDetailInfo("", EmptyList.d);
        }
        if (catalogueDetailsPageErrorState == null) {
            CatalogueDetailsContract.ViewState viewState = (CatalogueDetailsContract.ViewState) catalogueDetailsViewModel.h.e();
            if (viewState != null) {
                catalogueDetailsPageErrorState2 = viewState.b;
            }
        } else {
            catalogueDetailsViewModel.getClass();
            catalogueDetailsPageErrorState2 = catalogueDetailsPageErrorState;
        }
        return new CatalogueDetailsContract.ViewState(pageState, catalogueDetailsPageErrorState2, catalogueSaleDetailInfo, 0);
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onPrimaryActionClicked() {
        CatalogueDetailsPageErrorState catalogueDetailsPageErrorState;
        CatalogueDetailsContract.ViewState viewState = (CatalogueDetailsContract.ViewState) this.k.e();
        if (viewState == null || (catalogueDetailsPageErrorState = viewState.b) == null) {
            return;
        }
        catalogueDetailsPageErrorState.a(this);
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        CatalogueDetailsPageErrorState catalogueDetailsPageErrorState;
        CatalogueDetailsContract.ViewState viewState = (CatalogueDetailsContract.ViewState) this.k.e();
        if (viewState == null || (catalogueDetailsPageErrorState = viewState.b) == null) {
            return;
        }
        catalogueDetailsPageErrorState.b(this);
    }

    public final void p6(CatalogueTracking catalogueTracking, String id) {
        Intrinsics.h(id, "id");
        CatalogueDetailsContract.ViewState viewState = (CatalogueDetailsContract.ViewState) this.k.e();
        if ((viewState != null ? viewState.f6825a : null) == CatalogueDetailsContract.PageState.e) {
            return;
        }
        this.m = catalogueTracking;
        this.l = id;
        CatalogueStoreInfo catalogueStoreInfoA = this.e.f6826a.f6778a.a();
        String storeId = catalogueStoreInfoA != null ? catalogueStoreInfoA.getStoreId() : null;
        if (storeId == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        BuildersKt.c(ViewModelKt.a(this), null, null, new CatalogueDetailsViewModel$fetchIndividualCatalogue$1(this, storeId, catalogueTracking, null), 3);
    }

    public final void r6(int i) {
        MutableLiveData mutableLiveData = this.h;
        CatalogueDetailsContract.ViewState viewState = (CatalogueDetailsContract.ViewState) mutableLiveData.e();
        if (viewState != null) {
            int i2 = viewState.d;
            CatalogueDetailsContract.PageState pageState = viewState.f6825a;
            CatalogueDetailsContract.PageState pageState2 = CatalogueDetailsContract.PageState.e;
            if (pageState != pageState2 || i2 == i) {
                return;
            }
            CatalogueDetailsPageErrorState catalogueDetailsPageErrorState = viewState.b;
            CatalogueSaleDetailInfo catalogueSaleDetailInfo = viewState.c;
            if (catalogueDetailsPageErrorState == null) {
                CatalogueDetailsContract.ViewState viewState2 = (CatalogueDetailsContract.ViewState) mutableLiveData.e();
                catalogueDetailsPageErrorState = viewState2 != null ? viewState2.b : null;
            }
            mutableLiveData.m(new CatalogueDetailsContract.ViewState(pageState2, catalogueDetailsPageErrorState, catalogueSaleDetailInfo, i));
            AnalyticsAction analyticsAction = i > i2 ? CatalogueDetailsActions.f : CatalogueDetailsActions.g;
            CatalogueTracking catalogueTracking = this.m;
            AnalyticsManager analyticsManager = this.f;
            if (catalogueTracking == null) {
                analyticsManager.c(analyticsAction);
                return;
            }
            TrackingMetadata trackingMetadataA = CatalogueTrackingKt.a(catalogueTracking);
            trackingMetadataA.b(TrackableValue.C1, Integer.valueOf(i + 1));
            analyticsManager.j(analyticsAction, trackingMetadataA);
        }
    }

    public final void s6() {
        this.f.c(CatalogueDetailsActions.h);
        String str = this.l;
        if (str != null) {
            p6(this.m, str);
        } else {
            Intrinsics.p("catalogueId");
            throw null;
        }
    }

    public final void t6(String str) {
        AnalyticsAction analyticsAction = CatalogueDetailsActions.e;
        TrackableValue trackableValue = TrackableValue.x;
        String str2 = this.l;
        if (str2 == null) {
            Intrinsics.p("catalogueId");
            throw null;
        }
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(trackableValue, str2);
        trackingMetadataA.b(TrackableValue.D, str);
        this.f.j(analyticsAction, trackingMetadataA);
        this.i.f(new CatalogueDetailsContract.Actions.LaunchWebUrl(str));
    }
}
