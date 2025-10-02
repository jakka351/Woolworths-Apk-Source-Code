package au.com.woolworths.feature.shop.instore.cart;

import androidx.compose.runtime.Stable;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.cart.instorecart.InstoreCartAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shop.instore.cart.InstoreCartContract;
import au.com.woolworths.feature.shop.instore.cart.domain.InstoreCartRepository;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.instore.navigation.map.InstoreNavigationInteractor;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Stable
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/cart/InstoreCartViewModel;", "Landroidx/lifecycle/ViewModel;", "instore-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InstoreCartViewModel extends ViewModel {
    public final AnalyticsManager e;
    public final InstoreCartRepository f;
    public final InstoreNavigationInteractor g;
    public final CollectionModeInteractor h;
    public final Flow i;
    public final MutableStateFlow j;
    public final StateFlow k;
    public Function0 l;

    public InstoreCartViewModel(AnalyticsManager analyticsManager, InstoreCartRepository instoreCartRepository, InstoreNavigationInteractor instoreNavigationInteractor, CollectionModeInteractor collectionModeInteractor) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(instoreCartRepository, "instoreCartRepository");
        Intrinsics.h(instoreNavigationInteractor, "instoreNavigationInteractor");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        this.e = analyticsManager;
        this.f = instoreCartRepository;
        this.g = instoreNavigationInteractor;
        this.h = collectionModeInteractor;
        this.i = FlowKt.a(SharedFlowKt.b(0, 1, BufferOverflow.e, 1));
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(InstoreCartContract.ViewState.Loading.f7306a);
        this.j = mutableStateFlowA;
        this.k = FlowKt.b(mutableStateFlowA);
        q6();
    }

    public static final void p6(InstoreCartViewModel instoreCartViewModel) {
        AnalyticsManager analyticsManager = instoreCartViewModel.e;
        InstoreCartAnalytics.ErrorScreen.Action.d.getClass();
        analyticsManager.g(new Event() { // from class: au.com.woolworths.analytics.supers.cart.instorecart.InstoreCartAnalytics$ErrorScreen$Action$Companion$serverErrorImpression$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                spreadBuilder.b(InstoreCartAnalytics.ErrorScreen.e);
                spreadBuilder.a(new Pair("event.Category", "error"));
                spreadBuilder.a(new Pair("event.Action", "impression"));
                spreadBuilder.a(new Pair("event.Label", "Server Error"));
                spreadBuilder.a(new Pair("user.MarketOrderCount", ""));
                spreadBuilder.a(new Pair("user.SupersOrderCount", ""));
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "error_impression";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "error_impression".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
        instoreCartViewModel.l = new a(instoreCartViewModel, 0);
        instoreCartViewModel.j.setValue(new InstoreCartContract.ViewState.Error(FullPageMessage.Error.ServerError.f8916a));
    }

    public final void q6() {
        this.l = new InstoreCartViewModel$fetchCart$1(0, this, InstoreCartViewModel.class, "fetchCart", "fetchCart()V", 0);
        this.j.setValue(InstoreCartContract.ViewState.Loading.f7306a);
        BuildersKt.c(ViewModelKt.a(this), null, null, new InstoreCartViewModel$fetchCart$2(this, null), 3);
    }
}
