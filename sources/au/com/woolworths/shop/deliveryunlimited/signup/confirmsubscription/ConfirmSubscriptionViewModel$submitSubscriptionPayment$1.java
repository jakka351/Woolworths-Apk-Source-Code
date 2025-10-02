package au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.shop.deliveryunlimited.signup.DeliveryUnlimitedSignUpInteractor;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.ConfirmSubscriptionContract;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSubscribePayment;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSubscribeSubmissionResponse;
import au.com.woolworths.shop.digipay.models.SubmittedInstrument;
import com.woolworths.R;
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
@DebugMetadata(c = "au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.ConfirmSubscriptionViewModel$submitSubscriptionPayment$1", f = "ConfirmSubscriptionViewModel.kt", l = {149}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ConfirmSubscriptionViewModel$submitSubscriptionPayment$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ConfirmSubscriptionViewModel q;
    public final /* synthetic */ DeliveryUnlimitedSubscribePayment r;
    public final /* synthetic */ SubmittedInstrument s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmSubscriptionViewModel$submitSubscriptionPayment$1(ConfirmSubscriptionViewModel confirmSubscriptionViewModel, DeliveryUnlimitedSubscribePayment deliveryUnlimitedSubscribePayment, SubmittedInstrument submittedInstrument, Continuation continuation) {
        super(2, continuation);
        this.q = confirmSubscriptionViewModel;
        this.r = deliveryUnlimitedSubscribePayment;
        this.s = submittedInstrument;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ConfirmSubscriptionViewModel$submitSubscriptionPayment$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ConfirmSubscriptionViewModel$submitSubscriptionPayment$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        ConfirmSubscriptionViewModel confirmSubscriptionViewModel = this.q;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                DeliveryUnlimitedSignUpInteractor deliveryUnlimitedSignUpInteractor = confirmSubscriptionViewModel.g;
                String str = confirmSubscriptionViewModel.i;
                if (str == null) {
                    Intrinsics.p("selectedPlanId");
                    throw null;
                }
                int price = this.r.getPrice();
                SubmittedInstrument submittedInstrument = this.s;
                String str2 = submittedInstrument.f10924a;
                String str3 = submittedInstrument.b;
                this.p = 1;
                obj = deliveryUnlimitedSignUpInteractor.a(str, price, str2, str3, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            DeliveryUnlimitedSubscribeSubmissionResponse deliveryUnlimitedSubscribeSubmissionResponse = (DeliveryUnlimitedSubscribeSubmissionResponse) obj;
            if (deliveryUnlimitedSubscribeSubmissionResponse.getSuccess()) {
                confirmSubscriptionViewModel.l.f(ConfirmSubscriptionContract.Actions.LaunchConfirmationPage.f10858a);
            } else {
                String message = deliveryUnlimitedSubscribeSubmissionResponse.getMessage();
                Intrinsics.e(message);
                ConfirmSubscriptionViewModel.q6(confirmSubscriptionViewModel, message);
            }
        } catch (NoConnectivityException unused) {
            String string = confirmSubscriptionViewModel.p6().getString(R.string.delivery_unlimited_payment_network_error_message);
            Intrinsics.g(string, "getString(...)");
            ConfirmSubscriptionViewModel.q6(confirmSubscriptionViewModel, string);
        } catch (ServerErrorException unused2) {
            String string2 = confirmSubscriptionViewModel.p6().getString(R.string.delivery_unlimited_payment_server_error_message);
            Intrinsics.g(string2, "getString(...)");
            ConfirmSubscriptionViewModel.q6(confirmSubscriptionViewModel, string2);
        }
        return Unit.f24250a;
    }
}
