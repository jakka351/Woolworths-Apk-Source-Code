package au.com.woolworths.shop.checkout.ui.confirmation;

import android.os.Bundle;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.FirebaseAnalyticsManagerImpl;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.shop.checkout.domain.model.confirmation.OrderConfirmation;
import au.com.woolworths.shop.checkout.domain.model.confirmation.OrderInfo;
import au.com.woolworths.shop.checkout.ui.analytics.OrderConfirmationActions;
import au.com.woolworths.shop.checkout.ui.analytics.OrderConfirmationAnalyticsExtKt;
import au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationContract;
import com.woolworths.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationViewModel$fetchOrderConfirmation$1", f = "OrderConfirmationViewModel.kt", l = {131}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class OrderConfirmationViewModel$fetchOrderConfirmation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ OrderConfirmationViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderConfirmationViewModel$fetchOrderConfirmation$1(OrderConfirmationViewModel orderConfirmationViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = orderConfirmationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderConfirmationViewModel$fetchOrderConfirmation$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderConfirmationViewModel$fetchOrderConfirmation$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        OrderConfirmationViewModel orderConfirmationViewModel = this.q;
        AnalyticsManager analyticsManager = orderConfirmationViewModel.f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        EmptyList emptyList = EmptyList.d;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                OrderConfirmationInteractor orderConfirmationInteractor = orderConfirmationViewModel.e;
                String str = orderConfirmationViewModel.o;
                if (str == null) {
                    Intrinsics.p("lastOrderId");
                    throw null;
                }
                this.p = 1;
                obj = orderConfirmationInteractor.a(str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            OrderConfirmation orderConfirmation = (OrderConfirmation) obj;
            MutableStateFlow mutableStateFlow = orderConfirmationViewModel.l;
            List list = orderConfirmation.f10649a;
            OrderInfo orderInfo = orderConfirmation.c;
            String str2 = orderConfirmation.b;
            OrderConfirmationViewModel.s6(orderConfirmationViewModel, mutableStateFlow, false, list, str2 != null ? new PlainText(str2) : new ResText(R.string.order_confirmation_button_title), null, 9);
            orderConfirmationViewModel.k.f(OrderConfirmationContract.Action.ShowVocSurvey.f10719a);
            analyticsManager.e(Screens.p, OrderConfirmationAnalyticsExtKt.a(orderConfirmation));
            if (orderInfo.b) {
                analyticsManager.c(OrderConfirmationActions.DeliveryNow.e);
            }
            if (orderInfo.c.equals(Boolean.TRUE)) {
                analyticsManager.c(OrderConfirmationActions.DirectToBootNow.e);
            }
            if (orderInfo.d) {
                analyticsManager.c(OrderConfirmationActions.DeliveryUnlimited.e);
            }
            FirebaseAnalyticsManagerImpl firebaseAnalyticsManagerImpl = orderConfirmationViewModel.g;
            Bundle bundleP6 = OrderConfirmationViewModel.p6(orderConfirmationViewModel, orderInfo);
            firebaseAnalyticsManagerImpl.getClass();
            firebaseAnalyticsManagerImpl.l(bundleP6, "purchase");
        } catch (NoConnectivityException unused) {
            OrderConfirmationViewModel.s6(orderConfirmationViewModel, orderConfirmationViewModel.l, false, emptyList, null, OrderConfirmationErrorState.d, 5);
            analyticsManager.c(OrderConfirmationActions.NetworkError.e);
        } catch (ServerErrorException unused2) {
            OrderConfirmationViewModel.s6(orderConfirmationViewModel, orderConfirmationViewModel.l, false, emptyList, null, OrderConfirmationErrorState.e, 5);
            analyticsManager.c(OrderConfirmationActions.ServerError.e);
        }
        return Unit.f24250a;
    }
}
