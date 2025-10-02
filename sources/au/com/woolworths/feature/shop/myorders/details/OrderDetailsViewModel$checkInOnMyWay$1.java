package au.com.woolworths.feature.shop.myorders.details;

import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsContract;
import au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions;
import au.com.woolworths.feature.shop.myorders.details.models.PickupCheckInResponse;
import au.com.woolworths.feature.shop.myorders.orders.OrderCheckInInteractor;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlowImpl;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.details.OrderDetailsViewModel$checkInOnMyWay$1", f = "OrderDetailsViewModel.kt", l = {550}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class OrderDetailsViewModel$checkInOnMyWay$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ OrderDetailsViewModel q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderDetailsViewModel$checkInOnMyWay$1(OrderDetailsViewModel orderDetailsViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.q = orderDetailsViewModel;
        this.r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderDetailsViewModel$checkInOnMyWay$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderDetailsViewModel$checkInOnMyWay$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        OrderDetailsViewModel orderDetailsViewModel = this.q;
        MutableLiveData mutableLiveData = orderDetailsViewModel.s;
        SharedFlowImpl sharedFlowImpl = orderDetailsViewModel.u;
        AnalyticsManager analyticsManager = orderDetailsViewModel.i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                OrderCheckInInteractor orderCheckInInteractor = orderDetailsViewModel.h;
                int i2 = orderDetailsViewModel.A;
                String str = this.r;
                this.p = 1;
                obj = orderCheckInInteractor.f7852a.a(i2, str, null, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            if (((PickupCheckInResponse) obj).f7773a) {
                orderDetailsViewModel.t6(orderDetailsViewModel.A, null);
            } else {
                analyticsManager.c(OrderDetailsActions.o);
                sharedFlowImpl.f(new OrderDetailsContract.Actions.ShowErrorMessage(new ResText(R.string.pickup_eta_server_error)));
                OrderDetailsContract.ViewState viewState = (OrderDetailsContract.ViewState) mutableLiveData.e();
                mutableLiveData.m(viewState != null ? new OrderDetailsContract.ViewState(OrderDetailsContract.LoadingState.g, viewState.b, viewState.c) : null);
            }
        } catch (NoConnectivityException unused) {
            analyticsManager.c(OrderDetailsActions.o);
            sharedFlowImpl.f(new OrderDetailsContract.Actions.ShowErrorMessage(new ResText(R.string.pickup_eta_connection_error)));
            OrderDetailsContract.ViewState viewState2 = (OrderDetailsContract.ViewState) mutableLiveData.e();
            mutableLiveData.m(viewState2 != null ? new OrderDetailsContract.ViewState(OrderDetailsContract.LoadingState.g, viewState2.b, viewState2.c) : null);
        } catch (ServerErrorException unused2) {
            analyticsManager.c(OrderDetailsActions.o);
            sharedFlowImpl.f(new OrderDetailsContract.Actions.ShowErrorMessage(new ResText(R.string.pickup_eta_server_error)));
            OrderDetailsContract.ViewState viewState3 = (OrderDetailsContract.ViewState) mutableLiveData.e();
            mutableLiveData.m(viewState3 != null ? new OrderDetailsContract.ViewState(OrderDetailsContract.LoadingState.g, viewState3.b, viewState3.c) : null);
        }
        return Unit.f24250a;
    }
}
