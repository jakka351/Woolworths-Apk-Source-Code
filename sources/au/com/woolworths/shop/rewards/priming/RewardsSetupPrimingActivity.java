package au.com.woolworths.shop.rewards.priming;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.repository.LaunchManager;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.shop.rewards.priming.RewardsSetupPrimingContract;
import au.com.woolworths.shop.rewards.priming.RewardsSetupPrimingViewModel;
import au.com.woolworths.shop.rewards.priming.analytics.RewardsScreens;
import au.com.woolworths.shop.rewards.priming.analytics.RewardsSetupActions;
import au.com.woolworths.shop.rewards.priming.ui.RewardsSetupPrimingScreenKt;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.SharedFlowImpl;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/rewards/priming/RewardsSetupPrimingActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Companion", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RewardsSetupPrimingActivity extends Hilt_RewardsSetupPrimingActivity {
    public static final /* synthetic */ int A = 0;
    public Activities.RewardsSetupMoreActivity.ExtraSetupEntryPoint y;
    public final ViewModelLazy x = new ViewModelLazy(Reflection.f24268a.b(RewardsSetupPrimingViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.rewards.priming.RewardsSetupPrimingActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getD();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.rewards.priming.RewardsSetupPrimingActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.rewards.priming.RewardsSetupPrimingActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final RewardsSetupPrimingActivity$onBackPressedCallback$1 z = new OnBackPressedCallback() { // from class: au.com.woolworths.shop.rewards.priming.RewardsSetupPrimingActivity$onBackPressedCallback$1
        {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public final void e() {
            int i = RewardsSetupPrimingActivity.A;
            RewardsSetupPrimingActivity rewardsSetupPrimingActivity = this.d;
            rewardsSetupPrimingActivity.O4().g.c(RewardsSetupActions.e);
            rewardsSetupPrimingActivity.finish();
        }
    };

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/shop/rewards/priming/RewardsSetupPrimingActivity$Companion;", "", "", "REWARDS_AUTH_REQUEST_CODE", "I", "", "EXTRA_SOURCE", "Ljava/lang/String;", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public final RewardsSetupPrimingViewModel O4() {
        return (RewardsSetupPrimingViewModel) this.x.getD();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if ((i != 5 && i != 10005) || i2 != -1) {
            RewardsSetupPrimingViewModel rewardsSetupPrimingViewModelO4 = O4();
            if (i2 != -1) {
                rewardsSetupPrimingViewModelO4.h = false;
                rewardsSetupPrimingViewModelO4.i = false;
                return;
            } else if (i == 5 || i == 10005) {
                rewardsSetupPrimingViewModelO4.h = true;
                rewardsSetupPrimingViewModelO4.i = false;
                return;
            } else {
                rewardsSetupPrimingViewModelO4.h = false;
                rewardsSetupPrimingViewModelO4.i = true;
                return;
            }
        }
        RewardsSetupPrimingViewModel rewardsSetupPrimingViewModelO42 = O4();
        SharedFlowImpl sharedFlowImpl = rewardsSetupPrimingViewModelO42.l;
        LaunchManager launchManager = rewardsSetupPrimingViewModelO42.e;
        if (launchManager.b()) {
            sharedFlowImpl.f(RewardsSetupPrimingContract.Actions.SetShoppingModeStepComplete.f12900a);
        }
        if (rewardsSetupPrimingViewModelO42.i) {
            sharedFlowImpl.f(RewardsSetupPrimingContract.Actions.FinishWithResultOnboardingCancel.f12897a);
        } else if (rewardsSetupPrimingViewModelO42.h) {
            launchManager.c();
            boolean z = rewardsSetupPrimingViewModelO42.h;
            LaunchManager.LaunchState launchStateD = launchManager.d();
            if (launchStateD == LaunchManager.LaunchState.g) {
                launchStateD = LaunchManager.LaunchState.h;
                launchManager.a(launchStateD);
            }
            if ((launchStateD == null ? -1 : RewardsSetupPrimingViewModel.WhenMappings.f12903a[launchStateD.ordinal()]) == 1) {
                sharedFlowImpl.f(RewardsSetupPrimingContract.Actions.LaunchHome.f12898a);
            } else {
                sharedFlowImpl.f(new RewardsSetupPrimingContract.Actions.LaunchShoppingModeSelector(z));
            }
        }
        Activities.RewardsSetupMoreActivity.ExtraSetupEntryPoint extraSetupEntryPoint = this.y;
        if ((extraSetupEntryPoint != null ? extraSetupEntryPoint.d : null) == Activities.RewardsSetupMoreActivity.RewardsSetupEntryPoint.f) {
            Intent intentB = Activities.MainActivity.f4487a.b();
            if (getIntent().getBooleanExtra("is_deep_link_flag", false)) {
                intentB.putExtras(getIntent());
            }
            startActivity(intentB);
        } else {
            Bundle extras = getIntent().getExtras();
            Intent intent2 = new Intent();
            if (extras != null && extras.containsKey("EXTRA_SOURCE")) {
                intent2.putExtra("EXTRA_SOURCE", extras.getParcelable("EXTRA_SOURCE"));
            }
            setResult(-1, intent2);
        }
        finish();
    }

    @Override // au.com.woolworths.shop.rewards.priming.Hilt_RewardsSetupPrimingActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        Activities.RewardsSetupMoreActivity.ExtraSetupEntryPoint extraSetupEntryPoint = extras != null ? (Activities.RewardsSetupMoreActivity.ExtraSetupEntryPoint) extras.getParcelable("EXTRA_SOURCE") : null;
        this.y = extraSetupEntryPoint != null ? extraSetupEntryPoint : null;
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.rewards.priming.RewardsSetupPrimingActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final RewardsSetupPrimingActivity rewardsSetupPrimingActivity = RewardsSetupPrimingActivity.this;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(8044433, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.rewards.priming.RewardsSetupPrimingActivity.onCreate.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                int i = RewardsSetupPrimingActivity.A;
                                RewardsSetupPrimingActivity rewardsSetupPrimingActivity2 = rewardsSetupPrimingActivity;
                                RewardsSetupPrimingViewModel rewardsSetupPrimingViewModelO4 = rewardsSetupPrimingActivity2.O4();
                                composer2.o(5004770);
                                boolean zI = composer2.I(rewardsSetupPrimingActivity2);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    RewardsSetupPrimingActivity$onCreate$1$1$1$1 rewardsSetupPrimingActivity$onCreate$1$1$1$1 = new RewardsSetupPrimingActivity$onCreate$1$1$1$1(0, rewardsSetupPrimingActivity2, RewardsSetupPrimingActivity.class, "onSignInClick", "onSignInClick()V", 0);
                                    composer2.A(rewardsSetupPrimingActivity$onCreate$1$1$1$1);
                                    objG = rewardsSetupPrimingActivity$onCreate$1$1$1$1;
                                }
                                composer2.l();
                                Function0 function0 = (Function0) ((KFunction) objG);
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(rewardsSetupPrimingActivity2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    RewardsSetupPrimingActivity$onCreate$1$1$2$1 rewardsSetupPrimingActivity$onCreate$1$1$2$1 = new RewardsSetupPrimingActivity$onCreate$1$1$2$1(0, rewardsSetupPrimingActivity2, RewardsSetupPrimingActivity.class, "onJoinClick", "onJoinClick()V", 0);
                                    composer2.A(rewardsSetupPrimingActivity$onCreate$1$1$2$1);
                                    objG2 = rewardsSetupPrimingActivity$onCreate$1$1$2$1;
                                }
                                composer2.l();
                                Function0 function02 = (Function0) ((KFunction) objG2);
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(rewardsSetupPrimingActivity2);
                                Object objG3 = composer2.G();
                                if (zI3 || objG3 == composer$Companion$Empty$1) {
                                    RewardsSetupPrimingActivity$onCreate$1$1$3$1 rewardsSetupPrimingActivity$onCreate$1$1$3$1 = new RewardsSetupPrimingActivity$onCreate$1$1$3$1(0, rewardsSetupPrimingActivity2, RewardsSetupPrimingActivity.class, "onBackClick", "onBackClick()V", 0);
                                    composer2.A(rewardsSetupPrimingActivity$onCreate$1$1$3$1);
                                    objG3 = rewardsSetupPrimingActivity$onCreate$1$1$3$1;
                                }
                                composer2.l();
                                Function0 function03 = (Function0) ((KFunction) objG3);
                                Activities.RewardsSetupMoreActivity.ExtraSetupEntryPoint extraSetupEntryPoint2 = rewardsSetupPrimingActivity2.y;
                                RewardsSetupPrimingScreenKt.a(rewardsSetupPrimingViewModelO4, function0, function02, function03, (extraSetupEntryPoint2 != null ? extraSetupEntryPoint2.d : null) == Activities.RewardsSetupMoreActivity.RewardsSetupEntryPoint.e, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -901448375));
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new RewardsSetupPrimingActivity$listenToActions$1(2, this, RewardsSetupPrimingActivity.class, "handleActions", "handleActions(Lau/com/woolworths/shop/rewards/priming/RewardsSetupPrimingContract$Actions;)V", 4), FlowExtKt.a(O4().m, getD(), Lifecycle.State.g)), LifecycleOwnerKt.a(this));
        OnBackPressedDispatcher d = getD();
        d.getClass();
        RewardsSetupPrimingActivity$onBackPressedCallback$1 onBackPressedCallback = this.z;
        Intrinsics.h(onBackPressedCallback, "onBackPressedCallback");
        d.b(onBackPressedCallback);
        O4().g.a(RewardsScreens.e);
    }
}
