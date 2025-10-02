package au.com.woolworths.android.onesite.modules.checkout.ui;

import au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesStatus;
import au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutContract;
import au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlowImpl;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/android/onesite/modules/checkout/common/PaymentServicesStatus;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel$paymentStatus$2$2", f = "CheckoutViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CheckoutViewModel$paymentStatus$2$2 extends SuspendLambda implements Function2<PaymentServicesStatus, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ CheckoutViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutViewModel$paymentStatus$2$2(CheckoutViewModel checkoutViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = checkoutViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CheckoutViewModel$paymentStatus$2$2 checkoutViewModel$paymentStatus$2$2 = new CheckoutViewModel$paymentStatus$2$2(this.q, continuation);
        checkoutViewModel$paymentStatus$2$2.p = obj;
        return checkoutViewModel$paymentStatus$2$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CheckoutViewModel$paymentStatus$2$2 checkoutViewModel$paymentStatus$2$2 = (CheckoutViewModel$paymentStatus$2$2) create((PaymentServicesStatus) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        checkoutViewModel$paymentStatus$2$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        PaymentServicesStatus paymentServicesStatus = (PaymentServicesStatus) this.p;
        Intrinsics.e(paymentServicesStatus);
        CheckoutViewModel checkoutViewModel = this.q;
        SharedFlowImpl sharedFlowImpl = checkoutViewModel.l;
        if (CheckoutViewModel.WhenMappings.b[paymentServicesStatus.ordinal()] == 1) {
            CheckoutStep checkoutStep = checkoutViewModel.k;
            if (checkoutStep == CheckoutStep.d || checkoutStep == CheckoutStep.f) {
                checkoutViewModel.k = CheckoutStep.e;
                sharedFlowImpl.f(CheckoutContract.Action.LaunchDigipayPaymentScreen.f4305a);
            }
        } else {
            CheckoutStep checkoutStep2 = checkoutViewModel.k;
            if (checkoutStep2 == CheckoutStep.d || checkoutStep2 == CheckoutStep.e) {
                checkoutViewModel.k = CheckoutStep.f;
                sharedFlowImpl.f(CheckoutContract.Action.LaunchPaymentErrorScreen.f4307a);
            }
        }
        return Unit.f24250a;
    }
}
