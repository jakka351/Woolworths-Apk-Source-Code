package au.com.woolworths.feature.shop.myorders.details.cancel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.feature.shop.myorders.details.cancel.OrderCancellationPromptContract;
import au.com.woolworths.feature.shop.myorders.details.cancel.analytics.OrderCancelActions;
import au.com.woolworths.feature.shop.myorders.details.models.CancelOrderResponse;
import au.com.woolworths.feature.shop.myorders.details.models.OrderCancelWarning;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/cancel/OrderCancellationPromptViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrderCancellationPromptViewModel extends ViewModel implements FullPageErrorStateClickHandler {
    public final OrderCancellationInteractor e;
    public final DispatcherProvider f;
    public final AnalyticsManager g;
    public final MutableLiveData h;
    public final MutableLiveData i;
    public final SharedFlowImpl j;
    public final Flow k;

    public OrderCancellationPromptViewModel(OrderCancellationInteractor orderCancellationInteractor, DispatcherProvider dispatcherProvider, AnalyticsManager analyticsManager) {
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = orderCancellationInteractor;
        this.f = dispatcherProvider;
        this.g = analyticsManager;
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.h = mutableLiveData;
        this.i = mutableLiveData;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.j = sharedFlowImplB;
        this.k = FlowKt.a(sharedFlowImplB);
    }

    public static final void p6(OrderCancellationPromptViewModel orderCancellationPromptViewModel, CancelOrderResponse cancelOrderResponse) {
        MutableLiveData mutableLiveData = orderCancellationPromptViewModel.h;
        Object objE = mutableLiveData.e();
        Intrinsics.e(objE);
        OrderCancelWarning orderCancelWarning = ((OrderCancellationPromptContract.ViewState) objE).b;
        String str = cancelOrderResponse.b;
        Intrinsics.e(str);
        mutableLiveData.m(new OrderCancellationPromptContract.ViewState(false, orderCancelWarning, new CancelOrderFullPageErrorState(str)));
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        this.g.c(OrderCancelActions.i);
        this.j.f(OrderCancellationPromptContract.Actions.OrderOutOfWindow.f7694a);
    }

    public final void q6(int i) {
        BuildersKt.c(ViewModelKt.a(this), null, null, new OrderCancellationPromptViewModel$onCancel$1(this, i, null), 3);
    }
}
