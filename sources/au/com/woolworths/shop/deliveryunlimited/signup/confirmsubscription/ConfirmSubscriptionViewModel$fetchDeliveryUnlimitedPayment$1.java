package au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription;

import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.shop.deliveryunlimited.signup.DeliveryUnlimitedSignUpInteractor;
import au.com.woolworths.shop.deliveryunlimited.signup.analytics.ConfirmSubscriptionActions;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.ConfirmSubscriptionContract;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.terms.ConfirmSubscriptionTermsAndConditionContract;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.terms.ConfirmSubscriptionTermsUiModelKt;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSubscribePayment;
import au.com.woolworths.shop.deliveryunlimited.signup.landing.DeliveryUnlimitedSignUpErrorState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.ConfirmSubscriptionViewModel$fetchDeliveryUnlimitedPayment$1", f = "ConfirmSubscriptionViewModel.kt", l = {114}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ConfirmSubscriptionViewModel$fetchDeliveryUnlimitedPayment$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ConfirmSubscriptionViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmSubscriptionViewModel$fetchDeliveryUnlimitedPayment$1(ConfirmSubscriptionViewModel confirmSubscriptionViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = confirmSubscriptionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ConfirmSubscriptionViewModel$fetchDeliveryUnlimitedPayment$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ConfirmSubscriptionViewModel$fetchDeliveryUnlimitedPayment$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        ConfirmSubscriptionViewModel confirmSubscriptionViewModel = this.q;
        MutableLiveData mutableLiveData = confirmSubscriptionViewModel.j;
        AnalyticsManager analyticsManager = confirmSubscriptionViewModel.h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                DeliveryUnlimitedSignUpInteractor deliveryUnlimitedSignUpInteractor = confirmSubscriptionViewModel.g;
                String str = confirmSubscriptionViewModel.i;
                if (str == null) {
                    Intrinsics.p("selectedPlanId");
                    throw null;
                }
                this.p = 1;
                obj = deliveryUnlimitedSignUpInteractor.f10849a.c(str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            DeliveryUnlimitedSubscribePayment deliveryUnlimitedSubscribePayment = (DeliveryUnlimitedSubscribePayment) obj;
            confirmSubscriptionViewModel.j.m(new ConfirmSubscriptionContract.ViewState(false, StatefulButtonState.f, deliveryUnlimitedSubscribePayment, null));
            confirmSubscriptionViewModel.k.m(new ConfirmSubscriptionTermsAndConditionContract.ViewState(ConfirmSubscriptionTermsUiModelKt.a(deliveryUnlimitedSubscribePayment.getTerms())));
            confirmSubscriptionViewModel.l.f(new ConfirmSubscriptionContract.Actions.BindDigipayFragments(deliveryUnlimitedSubscribePayment));
        } catch (NoConnectivityException e) {
            String message = e.getMessage();
            Intrinsics.e(message);
            analyticsManager.j(ConfirmSubscriptionActions.f, TrackingMetadata.Companion.a(TrackableValue.o0, message));
            ConfirmSubscriptionViewModel.s6(confirmSubscriptionViewModel, mutableLiveData, false, null, DeliveryUnlimitedSignUpErrorState.d, 6);
        } catch (ServerErrorException e2) {
            String message2 = e2.getMessage();
            Intrinsics.e(message2);
            analyticsManager.j(ConfirmSubscriptionActions.f, TrackingMetadata.Companion.a(TrackableValue.o0, message2));
            ConfirmSubscriptionViewModel.s6(confirmSubscriptionViewModel, mutableLiveData, false, null, DeliveryUnlimitedSignUpErrorState.e, 6);
        }
        return Unit.f24250a;
    }
}
