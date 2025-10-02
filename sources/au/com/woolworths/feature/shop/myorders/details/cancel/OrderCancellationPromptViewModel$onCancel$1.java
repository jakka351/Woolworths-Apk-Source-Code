package au.com.woolworths.feature.shop.myorders.details.cancel;

import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shop.myorders.details.cancel.OrderCancellationPromptContract;
import au.com.woolworths.feature.shop.myorders.details.cancel.analytics.OrderCancelActions;
import au.com.woolworths.feature.shop.myorders.details.models.CancelOrderResponse;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.details.cancel.OrderCancellationPromptViewModel$onCancel$1", f = "OrderCancellationPromptViewModel.kt", l = {59}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class OrderCancellationPromptViewModel$onCancel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ OrderCancellationPromptViewModel q;
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderCancellationPromptViewModel$onCancel$1(OrderCancellationPromptViewModel orderCancellationPromptViewModel, int i, Continuation continuation) {
        super(2, continuation);
        this.q = orderCancellationPromptViewModel;
        this.r = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderCancellationPromptViewModel$onCancel$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderCancellationPromptViewModel$onCancel$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OrderCancellationPromptContract.ViewState viewState;
        OrderCancellationPromptViewModel orderCancellationPromptViewModel = this.q;
        SharedFlowImpl sharedFlowImpl = orderCancellationPromptViewModel.j;
        AnalyticsManager analyticsManager = orderCancellationPromptViewModel.g;
        MutableLiveData mutableLiveData = orderCancellationPromptViewModel.h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            try {
                try {
                    if (i == 0) {
                        ResultKt.b(obj);
                        OrderCancellationPromptContract.ViewState viewState2 = (OrderCancellationPromptContract.ViewState) mutableLiveData.e();
                        mutableLiveData.m(viewState2 != null ? OrderCancellationPromptContract.ViewState.a(viewState2, true) : null);
                        analyticsManager.c(OrderCancelActions.e);
                        orderCancellationPromptViewModel.f.getClass();
                        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
                        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.f;
                        OrderCancellationPromptViewModel$onCancel$1$cancelOrderResponse$1 orderCancellationPromptViewModel$onCancel$1$cancelOrderResponse$1 = new OrderCancellationPromptViewModel$onCancel$1$cancelOrderResponse$1(orderCancellationPromptViewModel, this.r, null);
                        this.p = 1;
                        obj = BuildersKt.f(defaultIoScheduler, orderCancellationPromptViewModel$onCancel$1$cancelOrderResponse$1, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj);
                    }
                    CancelOrderResponse cancelOrderResponse = (CancelOrderResponse) obj;
                    if (cancelOrderResponse.f7745a) {
                        sharedFlowImpl.f(OrderCancellationPromptContract.Actions.CancelSuccess.f7693a);
                    } else {
                        OrderCancellationPromptViewModel.p6(orderCancellationPromptViewModel, cancelOrderResponse);
                        analyticsManager.c(OrderCancelActions.f);
                    }
                } catch (ServerErrorException unused) {
                    sharedFlowImpl.f(new OrderCancellationPromptContract.Actions.ShowSnackbarMessage(R.string.cancel_order_server_error));
                    analyticsManager.c(OrderCancelActions.g);
                    viewState = (OrderCancellationPromptContract.ViewState) mutableLiveData.e();
                    if (viewState != null) {
                    }
                }
            } catch (NoConnectivityException unused2) {
                sharedFlowImpl.f(new OrderCancellationPromptContract.Actions.ShowSnackbarMessage(R.string.cancel_order_network_error));
                analyticsManager.c(OrderCancelActions.h);
                viewState = (OrderCancellationPromptContract.ViewState) mutableLiveData.e();
                if (viewState != null) {
                }
            }
            return Unit.f24250a;
        } finally {
            OrderCancellationPromptContract.ViewState viewState3 = (OrderCancellationPromptContract.ViewState) mutableLiveData.e();
            mutableLiveData.m(viewState3 != null ? OrderCancellationPromptContract.ViewState.a(viewState3, false) : null);
        }
    }
}
