package au.com.woolworths.shop.deliveryunlimited.signup.landing;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.URLUtil;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.utils.Extensions;
import au.com.woolworths.product.details.d;
import au.com.woolworths.shop.cart.ui.c;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSignUpPlans;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSignUpSummary;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSubscribe;
import au.com.woolworths.shop.deliveryunlimited.signup.databinding.ActivityDeliveryUnlimitedSignupLandingBinding;
import au.com.woolworths.shop.deliveryunlimited.signup.landing.DeliveryUnlimitedSignUpLandingContract;
import au.com.woolworths.shop.deliveryunlimited.signup.selectplan.SelectPlanActivity;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/landing/DeliveryUnlimitedSignUpLandingActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class DeliveryUnlimitedSignUpLandingActivity extends Hilt_DeliveryUnlimitedSignUpLandingActivity {
    public static final /* synthetic */ int B = 0;
    public AnalyticsManager x;
    public ActivityDeliveryUnlimitedSignupLandingBinding y;
    public final ViewModelLazy z = new ViewModelLazy(Reflection.f24268a.b(DeliveryUnlimitedSignUpLandingViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.landing.DeliveryUnlimitedSignUpLandingActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.landing.DeliveryUnlimitedSignUpLandingActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.landing.DeliveryUnlimitedSignUpLandingActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final Lazy A = LazyKt.b(new c(this, 13));

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.deliveryunlimited.signup.landing.DeliveryUnlimitedSignUpLandingActivity$onCreate$1", f = "DeliveryUnlimitedSignUpLandingActivity.kt", l = {56}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.deliveryunlimited.signup.landing.DeliveryUnlimitedSignUpLandingActivity$onCreate$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.shop.deliveryunlimited.signup.landing.DeliveryUnlimitedSignUpLandingActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
        final /* synthetic */ class C02471 extends AdaptedFunctionReference implements Function2<DeliveryUnlimitedSignUpLandingContract.Actions, Continuation<? super Unit>, Object>, SuspendFunction {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                DeliveryUnlimitedSignUpLandingContract.Actions actions = (DeliveryUnlimitedSignUpLandingContract.Actions) obj;
                DeliveryUnlimitedSignUpLandingActivity deliveryUnlimitedSignUpLandingActivity = (DeliveryUnlimitedSignUpLandingActivity) this.d;
                int i = DeliveryUnlimitedSignUpLandingActivity.B;
                deliveryUnlimitedSignUpLandingActivity.getClass();
                if (actions instanceof DeliveryUnlimitedSignUpLandingContract.Actions.LaunchSelectPlanPage) {
                    DeliveryUnlimitedSignUpLandingContract.Actions.LaunchSelectPlanPage launchSelectPlanPage = (DeliveryUnlimitedSignUpLandingContract.Actions.LaunchSelectPlanPage) actions;
                    DeliveryUnlimitedSignUpPlans deliveryUnlimitedSignUpPlans = launchSelectPlanPage.f10877a;
                    boolean z = launchSelectPlanPage.b;
                    int i2 = SelectPlanActivity.C;
                    SelectPlanActivity.Companion.a(deliveryUnlimitedSignUpLandingActivity, deliveryUnlimitedSignUpPlans, z);
                } else {
                    if (!(actions instanceof DeliveryUnlimitedSignUpLandingContract.Actions.LaunchFeatureLink)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str = ((DeliveryUnlimitedSignUpLandingContract.Actions.LaunchFeatureLink) actions).f10876a;
                    if (URLUtil.isValidUrl(str)) {
                        ContextExtKt.j(deliveryUnlimitedSignUpLandingActivity, str, null, null, null, 62);
                    } else {
                        deliveryUnlimitedSignUpLandingActivity.startActivity(Activities.WebLinkActivity.f4553a.b(str));
                    }
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return DeliveryUnlimitedSignUpLandingActivity.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                int i2 = DeliveryUnlimitedSignUpLandingActivity.B;
                DeliveryUnlimitedSignUpLandingActivity deliveryUnlimitedSignUpLandingActivity = DeliveryUnlimitedSignUpLandingActivity.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new C02471(2, deliveryUnlimitedSignUpLandingActivity, DeliveryUnlimitedSignUpLandingActivity.class, "handleActions", "handleActions(Lau/com/woolworths/shop/deliveryunlimited/signup/landing/DeliveryUnlimitedSignUpLandingContract$Actions;)V", 4), FlowKt.a(deliveryUnlimitedSignUpLandingActivity.O4().g));
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

    public final DeliveryUnlimitedSignUpLandingViewModel O4() {
        return (DeliveryUnlimitedSignUpLandingViewModel) this.z.getD();
    }

    @Override // au.com.woolworths.shop.deliveryunlimited.signup.landing.Hilt_DeliveryUnlimitedSignUpLandingActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        DeliveryUnlimitedSubscribe deliveryUnlimitedSubscribe;
        DeliveryUnlimitedSignUpSummary summary;
        super.onCreate(bundle);
        ActivityDeliveryUnlimitedSignupLandingBinding activityDeliveryUnlimitedSignupLandingBinding = (ActivityDeliveryUnlimitedSignupLandingBinding) DataBindingUtil.d(this, R.layout.activity_delivery_unlimited_signup_landing);
        this.y = activityDeliveryUnlimitedSignupLandingBinding;
        String title = null;
        if (activityDeliveryUnlimitedSignupLandingBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        setSupportActionBar(activityDeliveryUnlimitedSignupLandingBinding.J);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass1(null), 3);
        ActivityDeliveryUnlimitedSignupLandingBinding activityDeliveryUnlimitedSignupLandingBinding2 = this.y;
        if (activityDeliveryUnlimitedSignupLandingBinding2 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        activityDeliveryUnlimitedSignupLandingBinding2.D(this);
        activityDeliveryUnlimitedSignupLandingBinding2.L(O4());
        activityDeliveryUnlimitedSignupLandingBinding2.H.setController((DeliveryUnlimitedSignUpLandingEpoxyController) this.A.getD());
        Toolbar toolbar = activityDeliveryUnlimitedSignupLandingBinding2.J;
        DeliveryUnlimitedSignUpLandingContract.ViewState viewState = (DeliveryUnlimitedSignUpLandingContract.ViewState) O4().i.e();
        if (viewState != null && (deliveryUnlimitedSubscribe = viewState.b) != null && (summary = deliveryUnlimitedSubscribe.getSummary()) != null) {
            title = summary.getTitle();
        }
        toolbar.setTitle(title);
        activityDeliveryUnlimitedSignupLandingBinding2.y.a(new AppBarLayout.OnOffsetChangedListener() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.landing.a
            @Override // com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
            public final void a(int i) {
                DeliveryUnlimitedSubscribe deliveryUnlimitedSubscribe2;
                DeliveryUnlimitedSignUpSummary summary2;
                DeliveryUnlimitedSignUpLandingActivity deliveryUnlimitedSignUpLandingActivity = this.f10883a;
                ActivityDeliveryUnlimitedSignupLandingBinding activityDeliveryUnlimitedSignupLandingBinding3 = deliveryUnlimitedSignUpLandingActivity.y;
                String title2 = null;
                if (activityDeliveryUnlimitedSignupLandingBinding3 == null) {
                    Intrinsics.p("binding");
                    throw null;
                }
                CollapsingToolbarLayout collapsingToolbarLayout = activityDeliveryUnlimitedSignupLandingBinding3.z;
                Toolbar toolbar2 = activityDeliveryUnlimitedSignupLandingBinding3.J;
                if (collapsingToolbarLayout.getHeight() + i >= collapsingToolbarLayout.getScrimVisibleHeightTrigger()) {
                    Drawable navigationIcon = toolbar2.getNavigationIcon();
                    if (navigationIcon != null) {
                        navigationIcon.setTint(-1);
                    }
                    if (Intrinsics.c(toolbar2.getTitle(), "")) {
                        return;
                    }
                    toolbar2.setTitle("");
                    return;
                }
                Drawable navigationIcon2 = toolbar2.getNavigationIcon();
                if (navigationIcon2 != null) {
                    navigationIcon2.setTint(Extensions.a(R.attr.colorPrimary, deliveryUnlimitedSignUpLandingActivity));
                }
                DeliveryUnlimitedSignUpLandingContract.ViewState viewState2 = (DeliveryUnlimitedSignUpLandingContract.ViewState) deliveryUnlimitedSignUpLandingActivity.O4().i.e();
                if (viewState2 != null && (deliveryUnlimitedSubscribe2 = viewState2.b) != null && (summary2 = deliveryUnlimitedSubscribe2.getSummary()) != null) {
                    title2 = summary2.getTitle();
                }
                if (Intrinsics.c(toolbar2.getTitle(), title2)) {
                    return;
                }
                toolbar2.setTitle(title2);
            }
        });
        ConstraintLayout footer = activityDeliveryUnlimitedSignupLandingBinding2.E;
        Intrinsics.g(footer, "footer");
        ViewExtKt.a(footer);
        O4().p6();
        O4().i.f(this, new DeliveryUnlimitedSignUpLandingActivity$sam$androidx_lifecycle_Observer$0(new d(this, 26)));
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
        AnalyticsManager analyticsManager = this.x;
        if (analyticsManager != null) {
            analyticsManager.a(Screens.K);
        } else {
            Intrinsics.p("analyticsManager");
            throw null;
        }
    }
}
