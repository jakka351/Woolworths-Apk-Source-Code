package au.com.woolworths.feature.shop.myorders.details.pickupeta;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.models.text.ResWithArgText;
import au.com.woolworths.feature.shop.myorders.details.infomodal.a;
import au.com.woolworths.feature.shop.myorders.details.pickupeta.PickupEtaSelectorContract;
import au.com.woolworths.feature.shop.myorders.details.pickupeta.analytics.PickupEtaSelectorActions;
import au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener;
import com.woolworths.R;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/pickupeta/PickupEtaSelectorViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/views/horizontalselector/HorizontalSelectorViewListener;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PickupEtaSelectorViewModel extends ViewModel implements HorizontalSelectorViewListener {
    public final AnalyticsManager e;
    public final SharedFlowImpl f;
    public final Flow g;
    public MutableStateFlow h;
    public final Lazy i;
    public String j;
    public Screen k;

    public PickupEtaSelectorViewModel(AnalyticsManager analyticsManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = analyticsManager;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.f = sharedFlowImplB;
        this.g = FlowKt.a(sharedFlowImplB);
        this.i = LazyKt.b(new a(this, 4));
    }

    public final void p6() {
        Screen screen = this.k;
        if (screen == null) {
            Intrinsics.p("hostScreen");
            throw null;
        }
        PickupEtaSelectorActions.Confirm confirm = new PickupEtaSelectorActions.Confirm(screen);
        TrackableValue trackableValue = TrackableValue.o0;
        String str = this.j;
        if (str == null) {
            Intrinsics.p("eta");
            throw null;
        }
        this.e.j(confirm, TrackingMetadata.Companion.a(trackableValue, str));
        String str2 = this.j;
        if (str2 == null) {
            Intrinsics.p("eta");
            throw null;
        }
        this.f.f(new PickupEtaSelectorContract.Actions.ConfirmPickupEta(str2));
    }

    @Override // au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener
    public final void s4() {
        p6();
    }

    @Override // au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener
    public final int x4() {
        MutableStateFlow mutableStateFlow = this.h;
        if (mutableStateFlow != null) {
            return ((PickupEtaSelectorContract.ViewState) mutableStateFlow.getValue()).f7783a.h;
        }
        Intrinsics.p("mutableViewState");
        throw null;
    }

    @Override // au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener
    public final String y1(int i, Context context) {
        Intrinsics.h(context, "context");
        MutableStateFlow mutableStateFlow = this.h;
        if (mutableStateFlow != null) {
            return new ResWithArgText(R.string.accessibility_text_pickup_eta_selector_confirm_selection_action, (String) ((PickupEtaSelectorContract.ViewState) mutableStateFlow.getValue()).f7783a.f.get(i)).getText(context).toString();
        }
        Intrinsics.p("mutableViewState");
        throw null;
    }

    @Override // au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener
    public final void z2(int i) {
        MutableStateFlow mutableStateFlow = this.h;
        if (mutableStateFlow != null) {
            this.j = (String) ((PickupEtaSelectorContract.ViewState) mutableStateFlow.getValue()).f7783a.f.get(i);
        } else {
            Intrinsics.p("mutableViewState");
            throw null;
        }
    }
}
