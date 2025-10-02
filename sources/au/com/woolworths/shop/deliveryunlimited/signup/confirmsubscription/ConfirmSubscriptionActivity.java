package au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.extensions.DialogFragmentExtKt;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.product.details.d;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmation.ConfirmationActivity;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.ConfirmSubscriptionContract;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.terms.ConfirmSubscriptionTermsAndConditionBottomSheetFragmentOld;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSubscribePayment;
import au.com.woolworths.shop.deliveryunlimited.signup.databinding.ActivityDeliveryUnlimitedConfirmSubscriptionBinding;
import au.com.woolworths.shop.digipay.DigipayInteractor;
import au.com.woolworths.shop.digipay.creditcard.CreditCardFragment;
import au.com.woolworths.shop.digipay.models.PaymentInfo;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.snackbar.Snackbar;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/confirmsubscription/ConfirmSubscriptionActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Companion", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ConfirmSubscriptionActivity extends Hilt_ConfirmSubscriptionActivity {
    public static final /* synthetic */ int B = 0;
    public ActivityDeliveryUnlimitedConfirmSubscriptionBinding A;
    public DigipayInteractor x;
    public AnalyticsManager y;
    public final ViewModelLazy z = new ViewModelLazy(Reflection.f24268a.b(ConfirmSubscriptionViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.ConfirmSubscriptionActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.ConfirmSubscriptionActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.ConfirmSubscriptionActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/confirmsubscription/ConfirmSubscriptionActivity$Companion;", "", "", "EXTRA_PLAN_ID", "Ljava/lang/String;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.ConfirmSubscriptionActivity$onCreate$3", f = "ConfirmSubscriptionActivity.kt", l = {84}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.ConfirmSubscriptionActivity$onCreate$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.ConfirmSubscriptionActivity$onCreate$3$1, reason: invalid class name */
        final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<ConfirmSubscriptionContract.Actions, Continuation<? super Unit>, Object>, SuspendFunction {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                ConfirmSubscriptionContract.Actions actions = (ConfirmSubscriptionContract.Actions) obj;
                ConfirmSubscriptionActivity confirmSubscriptionActivity = (ConfirmSubscriptionActivity) this.d;
                int i = ConfirmSubscriptionActivity.B;
                confirmSubscriptionActivity.getClass();
                if (actions instanceof ConfirmSubscriptionContract.Actions.LaunchTermAndConditionsBottomSheet) {
                    FragmentManager supportFragmentManager = confirmSubscriptionActivity.getSupportFragmentManager();
                    Intrinsics.g(supportFragmentManager, "getSupportFragmentManager(...)");
                    DialogFragmentExtKt.a(new ConfirmSubscriptionTermsAndConditionBottomSheetFragmentOld(), supportFragmentManager, "AcceptTermsAndConditionBottomSheet");
                } else if (actions instanceof ConfirmSubscriptionContract.Actions.LaunchConfirmationPage) {
                    int i2 = ConfirmationActivity.A;
                    confirmSubscriptionActivity.startActivity(new Intent(confirmSubscriptionActivity, (Class<?>) ConfirmationActivity.class));
                } else if (actions instanceof ConfirmSubscriptionContract.Actions.OpenUrl) {
                    ContextExtKt.j(confirmSubscriptionActivity, ((ConfirmSubscriptionContract.Actions.OpenUrl) actions).f10860a, null, null, null, 62);
                } else {
                    if (actions instanceof ConfirmSubscriptionContract.Actions.ShowSnackbar) {
                        String str = ((ConfirmSubscriptionContract.Actions.ShowSnackbar) actions).f10861a;
                        ActivityDeliveryUnlimitedConfirmSubscriptionBinding activityDeliveryUnlimitedConfirmSubscriptionBinding = confirmSubscriptionActivity.A;
                        if (activityDeliveryUnlimitedConfirmSubscriptionBinding == null) {
                            Intrinsics.p("binding");
                            throw null;
                        }
                        Snackbar snackbarJ = Snackbar.j(null, activityDeliveryUnlimitedConfirmSubscriptionBinding.F, str, 0);
                        ActivityDeliveryUnlimitedConfirmSubscriptionBinding activityDeliveryUnlimitedConfirmSubscriptionBinding2 = confirmSubscriptionActivity.A;
                        if (activityDeliveryUnlimitedConfirmSubscriptionBinding2 == null) {
                            Intrinsics.p("binding");
                            throw null;
                        }
                        snackbarJ.f(activityDeliveryUnlimitedConfirmSubscriptionBinding2.F);
                        snackbarJ.l();
                    } else if (actions instanceof ConfirmSubscriptionContract.Actions.BindDigipayFragments) {
                        DeliveryUnlimitedSubscribePayment deliveryUnlimitedSubscribePayment = ((ConfirmSubscriptionContract.Actions.BindDigipayFragments) actions).f10856a;
                        FragmentManager supportFragmentManager2 = confirmSubscriptionActivity.getSupportFragmentManager();
                        Intrinsics.g(supportFragmentManager2, "getSupportFragmentManager(...)");
                        FragmentTransaction fragmentTransactionE = supportFragmentManager2.e();
                        PaymentInfo paymentInfo = new PaymentInfo(deliveryUnlimitedSubscribePayment.getPriceLabel(), deliveryUnlimitedSubscribePayment.getPriceDescription(), true);
                        CreditCardFragment creditCardFragment = new CreditCardFragment();
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("EXTRA_PAYMENT_INFO", paymentInfo);
                        creditCardFragment.setArguments(bundle);
                        fragmentTransactionE.j(R.id.credit_card_fragment_container, creditCardFragment, null);
                        fragmentTransactionE.d();
                        ActivityDeliveryUnlimitedConfirmSubscriptionBinding activityDeliveryUnlimitedConfirmSubscriptionBinding3 = confirmSubscriptionActivity.A;
                        if (activityDeliveryUnlimitedConfirmSubscriptionBinding3 == null) {
                            Intrinsics.p("binding");
                            throw null;
                        }
                        activityDeliveryUnlimitedConfirmSubscriptionBinding3.J.a(deliveryUnlimitedSubscribePayment.getFooter().getButton().getLabel(), deliveryUnlimitedSubscribePayment.getFooter().getButton().getLabel());
                    } else {
                        if (!(actions instanceof ConfirmSubscriptionContract.Actions.DismissTermsBottomSheet)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        FragmentManager supportFragmentManager3 = confirmSubscriptionActivity.getSupportFragmentManager();
                        Intrinsics.g(supportFragmentManager3, "getSupportFragmentManager(...)");
                        Fragment fragmentG = supportFragmentManager3.G("AcceptTermsAndConditionBottomSheet");
                        ConfirmSubscriptionTermsAndConditionBottomSheetFragmentOld confirmSubscriptionTermsAndConditionBottomSheetFragmentOld = fragmentG instanceof ConfirmSubscriptionTermsAndConditionBottomSheetFragmentOld ? (ConfirmSubscriptionTermsAndConditionBottomSheetFragmentOld) fragmentG : null;
                        if (confirmSubscriptionTermsAndConditionBottomSheetFragmentOld != null) {
                            confirmSubscriptionTermsAndConditionBottomSheetFragmentOld.dismiss();
                        }
                    }
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass3(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ConfirmSubscriptionActivity.this.new AnonymousClass3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                int i2 = ConfirmSubscriptionActivity.B;
                ConfirmSubscriptionActivity confirmSubscriptionActivity = ConfirmSubscriptionActivity.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, confirmSubscriptionActivity, ConfirmSubscriptionActivity.class, "handleActions", "handleActions(Lau/com/woolworths/shop/deliveryunlimited/signup/confirmsubscription/ConfirmSubscriptionContract$Actions;)V", 4), FlowExtKt.a(FlowKt.a(confirmSubscriptionActivity.O4().l), confirmSubscriptionActivity.getD(), Lifecycle.State.h));
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

    public final ConfirmSubscriptionViewModel O4() {
        return (ConfirmSubscriptionViewModel) this.z.getD();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        ConfirmSubscriptionContract.ViewState viewState = (ConfirmSubscriptionContract.ViewState) O4().j.e();
        if (viewState == null || viewState.b == StatefulButtonState.e) {
            return;
        }
        super.onBackPressed();
    }

    @Override // au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.Hilt_ConfirmSubscriptionActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ConfirmSubscriptionViewModel confirmSubscriptionViewModelO4 = O4();
        String stringExtra = getIntent().getStringExtra(".plan_id");
        if (stringExtra == null) {
            throw new IllegalArgumentException("No plan selected when opening subscripe confirmation");
        }
        confirmSubscriptionViewModelO4.i = stringExtra;
        ActivityDeliveryUnlimitedConfirmSubscriptionBinding activityDeliveryUnlimitedConfirmSubscriptionBinding = (ActivityDeliveryUnlimitedConfirmSubscriptionBinding) DataBindingUtil.d(this, R.layout.activity_delivery_unlimited_confirm_subscription);
        this.A = activityDeliveryUnlimitedConfirmSubscriptionBinding;
        if (activityDeliveryUnlimitedConfirmSubscriptionBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        activityDeliveryUnlimitedConfirmSubscriptionBinding.D(this);
        activityDeliveryUnlimitedConfirmSubscriptionBinding.L(O4());
        TextView disclaimer = activityDeliveryUnlimitedConfirmSubscriptionBinding.A;
        Intrinsics.g(disclaimer, "disclaimer");
        ViewExtKt.a(disclaimer);
        ActivityDeliveryUnlimitedConfirmSubscriptionBinding activityDeliveryUnlimitedConfirmSubscriptionBinding2 = this.A;
        if (activityDeliveryUnlimitedConfirmSubscriptionBinding2 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        setSupportActionBar(activityDeliveryUnlimitedConfirmSubscriptionBinding2.I);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new ConfirmSubscriptionActivity$observeDigipayActions$1(this, null), 3);
        DigipayInteractor digipayInteractor = this.x;
        if (digipayInteractor == null) {
            Intrinsics.p("digipayInteractor");
            throw null;
        }
        digipayInteractor.h.f(this, new ConfirmSubscriptionActivity$sam$androidx_lifecycle_Observer$0(new d(this, 24)));
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass3(null), 3);
        O4().r6();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        boolean zOnOptionsItemSelected;
        Callback.p(item);
        try {
            Intrinsics.h(item, "item");
            if (item.getItemId() == 16908332) {
                onBackPressed();
                zOnOptionsItemSelected = true;
            } else {
                zOnOptionsItemSelected = super.onOptionsItemSelected(item);
            }
            Callback.q();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            Callback.q();
            throw th;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        AnalyticsManager analyticsManager = this.y;
        if (analyticsManager == null) {
            Intrinsics.p("analyticsManager");
            throw null;
        }
        analyticsManager.e(Screens.N, TrackingMetadata.Companion.a(TrackableValue.o0, "Confirm Subscription"));
        DigipayInteractor digipayInteractor = this.x;
        if (digipayInteractor != null) {
            digipayInteractor.f();
        } else {
            Intrinsics.p("digipayInteractor");
            throw null;
        }
    }
}
