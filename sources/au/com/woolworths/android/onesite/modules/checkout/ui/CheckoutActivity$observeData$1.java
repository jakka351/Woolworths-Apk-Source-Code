package au.com.woolworths.android.onesite.modules.checkout.ui;

import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.NavHostController;
import au.com.woolworths.android.onesite.CheckoutNavGraphDirections;
import au.com.woolworths.android.onesite.databinding.ActivityCheckoutBinding;
import au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutContract;
import au.com.woolworths.android.onesite.utils.Logout;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import au.com.woolworths.shop.checkout.domain.model.ProgressId;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.material.snackbar.Snackbar;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutActivity$observeData$1", f = "CheckoutActivity.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CheckoutActivity$observeData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ CheckoutActivity q;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutActivity$observeData$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<CheckoutContract.Action, Continuation<? super Unit>, Object>, SuspendFunction {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            CheckoutContract.Action action = (CheckoutContract.Action) obj;
            final CheckoutActivity checkoutActivity = (CheckoutActivity) this.d;
            int i = CheckoutActivity.I;
            checkoutActivity.getClass();
            if (Intrinsics.c(action, CheckoutContract.Action.LaunchDigipayPaymentScreen.f4305a)) {
                checkoutActivity.R4().p6(ProgressIdExtKt.a(ProgressId.g, checkoutActivity));
                NavHostController navHostController = checkoutActivity.H;
                if (navHostController == null) {
                    Intrinsics.p("navController");
                    throw null;
                }
                navHostController.c(R.id.action_to_checkout_payment_fragment, null);
            } else if (Intrinsics.c(action, CheckoutContract.Action.LaunchWPayPaymentScreen.f4308a)) {
                checkoutActivity.R4().p6(ProgressIdExtKt.a(ProgressId.g, checkoutActivity));
                NavHostController navHostController2 = checkoutActivity.H;
                if (navHostController2 == null) {
                    Intrinsics.p("navController");
                    throw null;
                }
                navHostController2.c(R.id.action_to_checkout_wpay_fragment, null);
            } else if (Intrinsics.c(action, CheckoutContract.Action.LaunchPaymentErrorScreen.f4307a)) {
                checkoutActivity.R4().p6(ProgressIdExtKt.a(ProgressId.g, checkoutActivity));
                NavHostController navHostController3 = checkoutActivity.H;
                if (navHostController3 == null) {
                    Intrinsics.p("navController");
                    throw null;
                }
                navHostController3.c(R.id.action_to_checkout_payment_error_fragment, null);
            } else if (action instanceof CheckoutContract.Action.LaunchOrderConfirmation) {
                long j = ((CheckoutContract.Action.LaunchOrderConfirmation) action).f4306a;
                NavHostController navHostController4 = checkoutActivity.H;
                if (navHostController4 == null) {
                    Intrinsics.p("navController");
                    throw null;
                }
                navHostController4.d(CheckoutNavGraphDirections.Companion.a(j));
                checkoutActivity.finish();
            } else if (Intrinsics.c(action, CheckoutContract.Action.ShowLoginPrompt.f4310a)) {
                ShopAccountInteractor shopAccountInteractor = checkoutActivity.C;
                if (shopAccountInteractor == null) {
                    Intrinsics.p("accountInteractor");
                    throw null;
                }
                Logout.a(checkoutActivity, shopAccountInteractor);
            } else if (action instanceof CheckoutContract.Action.ShowSnackBar) {
                ActivityCheckoutBinding activityCheckoutBinding = checkoutActivity.G;
                if (activityCheckoutBinding == null) {
                    Intrinsics.p("binding");
                    throw null;
                }
                Snackbar.i(activityCheckoutBinding.z, ((CheckoutContract.Action.ShowSnackBar) action).f4311a, 0).l();
            } else {
                if (!(action instanceof CheckoutContract.Action.ShowInvalidWindowError)) {
                    throw new NoWhenBranchMatchedException();
                }
                new AlertDialog.Builder(checkoutActivity).setTitle(((CheckoutContract.Action.ShowInvalidWindowError) action).f4309a).setMessage(R.string.checkout_invalid_window_message).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: au.com.woolworths.android.onesite.modules.checkout.ui.b
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        NavHostController navHostController5 = checkoutActivity.H;
                        if (navHostController5 != null) {
                            navHostController5.c(R.id.action_to_restart_checkout, null);
                        } else {
                            Intrinsics.p("navController");
                            throw null;
                        }
                    }
                }).setCancelable(false).create().show();
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutActivity$observeData$1(CheckoutActivity checkoutActivity, Continuation continuation) {
        super(2, continuation);
        this.q = checkoutActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckoutActivity$observeData$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckoutActivity$observeData$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            int i2 = CheckoutActivity.I;
            CheckoutActivity checkoutActivity = this.q;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, checkoutActivity, CheckoutActivity.class, "handleAction", "handleAction(Lau/com/woolworths/android/onesite/modules/checkout/ui/CheckoutContract$Action;)V", 4), FlowExtKt.a(checkoutActivity.S4().r, checkoutActivity.getD(), Lifecycle.State.g));
            this.p = 1;
            if (FlowKt.g(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
