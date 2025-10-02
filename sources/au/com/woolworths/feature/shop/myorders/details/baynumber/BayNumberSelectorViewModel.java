package au.com.woolworths.feature.shop.myorders.details.baynumber;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.models.text.ResWithArgText;
import au.com.woolworths.feature.rewards.offers.detail.composable.f;
import au.com.woolworths.feature.shop.myorders.details.baynumber.BayNumberSelectorContract;
import au.com.woolworths.feature.shop.myorders.details.baynumber.analytics.BayNumberSelectorActions;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/baynumber/BayNumberSelectorViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/views/horizontalselector/HorizontalSelectorViewListener;", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BayNumberSelectorViewModel extends ViewModel implements HorizontalSelectorViewListener {
    public final AnalyticsManager e;
    public final SharedFlowImpl f;
    public final Flow g;
    public MutableStateFlow h;
    public final Lazy i;
    public String j;
    public Screen k;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/baynumber/BayNumberSelectorViewModel$Companion;", "", "", "DEFAULT_BAY_NUMBER", "Ljava/lang/String;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public BayNumberSelectorViewModel(AnalyticsManager analyticsManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = analyticsManager;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.f = sharedFlowImplB;
        this.g = FlowKt.a(sharedFlowImplB);
        this.i = LazyKt.b(new f(this, 27));
        this.j = "0";
    }

    public final void p6() {
        Screen screen = this.k;
        if (screen == null) {
            Intrinsics.p("hostScreen");
            throw null;
        }
        this.e.j(new BayNumberSelectorActions.Confirm(screen), TrackingMetadata.Companion.a(TrackableValue.o, this.j));
        this.f.f(new BayNumberSelectorContract.Actions.ConfirmBayNumber(this.j));
    }

    @Override // au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener
    public final void s4() {
        p6();
    }

    @Override // au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener
    public final int x4() {
        return 0;
    }

    @Override // au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener
    public final String y1(int i, Context context) {
        Intrinsics.h(context, "context");
        MutableStateFlow mutableStateFlow = this.h;
        if (mutableStateFlow != null) {
            return new ResWithArgText(R.string.accessibility_text_bay_number_selector_confirm_selection_action, (String) ((BayNumberSelectorContract.ViewState) mutableStateFlow.getValue()).f7688a.f.get(i)).getText(context).toString();
        }
        Intrinsics.p("mutableViewState");
        throw null;
    }

    @Override // au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener
    public final void z2(int i) {
        MutableStateFlow mutableStateFlow = this.h;
        if (mutableStateFlow != null) {
            this.j = (String) ((BayNumberSelectorContract.ViewState) mutableStateFlow.getValue()).f7688a.f.get(i);
        } else {
            Intrinsics.p("mutableViewState");
            throw null;
        }
    }
}
