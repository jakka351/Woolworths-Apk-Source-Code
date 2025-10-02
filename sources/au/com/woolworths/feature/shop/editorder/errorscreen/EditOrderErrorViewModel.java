package au.com.woolworths.feature.shop.editorder.errorscreen;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.feature.shop.editorder.analytics.EditOrderErrorActions;
import au.com.woolworths.feature.shop.editorder.errorscreen.EditOrderErrorContract;
import au.com.woolworths.foundation.shop.editorder.EditOrderInteractor;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/errorscreen/EditOrderErrorViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/feature/shop/editorder/errorscreen/EditOrderErrorClickHandler;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EditOrderErrorViewModel extends ViewModel implements EditOrderErrorClickHandler {
    public final AnalyticsManager e;
    public final EditOrderInteractor f;
    public Screens g;
    public final SharedFlowImpl h;
    public final Flow i;

    public EditOrderErrorViewModel(AnalyticsManager analyticsManager, EditOrderInteractor editOrderInteractor) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(editOrderInteractor, "editOrderInteractor");
        this.e = analyticsManager;
        this.f = editOrderInteractor;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.h = sharedFlowImplB;
        this.i = FlowKt.a(sharedFlowImplB);
    }

    public final void p6() {
        this.h.f(EditOrderErrorContract.Actions.NavigateToHome.f7056a);
        Screens screens = this.g;
        if (screens == null) {
            Intrinsics.p("analyticsScreen");
            throw null;
        }
        this.e.c(new EditOrderErrorActions.DismissButtonClick(screens));
    }
}
