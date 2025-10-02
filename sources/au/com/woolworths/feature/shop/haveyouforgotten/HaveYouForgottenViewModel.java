package au.com.woolworths.feature.shop.haveyouforgotten;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shop.haveyouforgotten.HaveYouForgottenContract;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor;
import au.com.woolworths.foundation.shop.cart.data.model.CartFooterData;
import au.com.woolworths.shop.cart.data.CartRepositoryImpl;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/haveyouforgotten/HaveYouForgottenViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/feature/shop/haveyouforgotten/HaveYouForgottenEventHandler;", "have-you-forgotten_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HaveYouForgottenViewModel extends ViewModel implements HaveYouForgottenEventHandler {
    public final CartRepositoryImpl e;
    public final AnalyticsManager f;
    public final ShopAppRegionInteractor g;
    public final SharedFlowImpl h;
    public final Flow i;
    public final MutableStateFlow j;
    public final StateFlow k;

    public HaveYouForgottenViewModel(CartRepositoryImpl cartRepositoryImpl, AnalyticsManager analyticsManager, ShopAppRegionInteractor shopRegionInteractor) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(shopRegionInteractor, "shopRegionInteractor");
        this.e = cartRepositoryImpl;
        this.f = analyticsManager;
        this.g = shopRegionInteractor;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.h = sharedFlowImplB;
        this.i = FlowKt.a(sharedFlowImplB);
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new HaveYouForgottenContract.ViewState(null));
        this.j = mutableStateFlowA;
        this.k = FlowKt.b(mutableStateFlowA);
    }

    public static final void p6(HaveYouForgottenViewModel haveYouForgottenViewModel, CartFooterData cartFooterData) {
        MutableStateFlow mutableStateFlow = haveYouForgottenViewModel.j;
        ((HaveYouForgottenContract.ViewState) mutableStateFlow.getValue()).getClass();
        mutableStateFlow.f(new HaveYouForgottenContract.ViewState(cartFooterData));
    }
}
