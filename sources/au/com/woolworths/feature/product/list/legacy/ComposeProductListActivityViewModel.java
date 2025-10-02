package au.com.woolworths.feature.product.list.legacy;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.product.list.legacy.ComposeProductListActivityContract;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.Store;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ComposeProductListActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposeProductListActivityViewModel extends ViewModel {
    public final CollectionModeInteractor e;
    public final AnalyticsManager f;
    public final FeatureToggleManager g;
    public Job h;
    public Job i;
    public final MutableStateFlow j;
    public final StateFlow k;
    public final SharedFlowImpl l;
    public final SharedFlowImpl m;
    public boolean n;
    public final Lazy o;

    public ComposeProductListActivityViewModel(CollectionModeInteractor collectionModeInteractor, AnalyticsManager analyticsManager, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.e = collectionModeInteractor;
        this.f = analyticsManager;
        this.g = featureToggleManager;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new ComposeProductListActivityContract.ViewState("", null, false, false, false, false));
        this.j = mutableStateFlowA;
        this.k = FlowKt.b(mutableStateFlowA);
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.l = sharedFlowImplB;
        this.m = sharedFlowImplB;
        this.o = LazyKt.b(new h(this, 0));
    }

    public final void p6(boolean z) {
        MutableStateFlow mutableStateFlow = this.j;
        mutableStateFlow.setValue(ComposeProductListActivityContract.ViewState.a((ComposeProductListActivityContract.ViewState) mutableStateFlow.getValue(), null, null, false, false, z, false, 47));
    }

    public final void q6(Activities.ProductList.Extras extras) {
        String str;
        MutableStateFlow mutableStateFlow = this.j;
        ComposeProductListActivityContract.ViewState viewState = (ComposeProductListActivityContract.ViewState) mutableStateFlow.getValue();
        String str2 = extras.d.d;
        Activities.ProductList.ExtraProductListSource extraProductListSource = extras.e;
        mutableStateFlow.setValue(ComposeProductListActivityContract.ViewState.a(viewState, null, str2, false, extraProductListSource.getE().l, false, false, 53));
        if (extraProductListSource.getE().j) {
            ComposeProductListActivityContract.ViewState viewState2 = (ComposeProductListActivityContract.ViewState) mutableStateFlow.getValue();
            Store storeH = this.e.h();
            if (storeH == null || (str = storeH.f) == null) {
                str = "";
            }
            mutableStateFlow.setValue(ComposeProductListActivityContract.ViewState.a(viewState2, str, null, false, false, false, false, 62));
        }
    }
}
