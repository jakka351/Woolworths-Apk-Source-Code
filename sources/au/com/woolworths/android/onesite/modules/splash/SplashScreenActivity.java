package au.com.woolworths.android.onesite.modules.splash;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.splashscreen.SplashScreen;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.analytics.FirebasePerfMonitor;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.modules.splash.SplashScreenContract;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.foundation.force.upgrade.data.UpgradeConfig;
import au.com.woolworths.foundation.force.upgrade.extension.UpgradeConfigExtensionKt;
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
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/modules/splash/SplashScreenActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SplashScreenActivity extends Hilt_SplashScreenActivity {
    public static final /* synthetic */ int C = 0;
    public FirebasePerfMonitor y;
    public FeatureToggleManager z;
    public final ViewModelLazy x = new ViewModelLazy(Reflection.f24268a.b(SplashViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.android.onesite.modules.splash.SplashScreenActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.android.onesite.modules.splash.SplashScreenActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.android.onesite.modules.splash.SplashScreenActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public boolean A = true;
    public final ActivityResultLauncher B = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: au.com.woolworths.android.onesite.modules.splash.a
        @Override // androidx.activity.result.ActivityResultCallback
        public final void a(Object obj) {
            SplashScreenActivity splashScreenActivity = this.d;
            ViewModelLazy viewModelLazy = splashScreenActivity.x;
            ActivityResult result = (ActivityResult) obj;
            int i = SplashScreenActivity.C;
            Intrinsics.h(result, "result");
            int i2 = result.d;
            if (i2 != -1 && i2 != 0) {
                if (i2 != 2) {
                    return;
                }
                ((SplashViewModel) viewModelLazy.getD()).q6();
            } else {
                SplashViewModel splashViewModel = (SplashViewModel) viewModelLazy.getD();
                String strC = ContextExtKt.c(splashScreenActivity);
                String RELEASE = Build.VERSION.RELEASE;
                Intrinsics.g(RELEASE, "RELEASE");
                splashViewModel.p6(strC, new SplashScreenActivity$startConfigActionActivityForResult$1$1(splashScreenActivity));
            }
        }
    });

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.android.onesite.modules.splash.SplashScreenActivity$onCreate$2", f = "SplashScreenActivity.kt", l = {66}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.android.onesite.modules.splash.SplashScreenActivity$onCreate$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.android.onesite.modules.splash.SplashScreenActivity$onCreate$2$1, reason: invalid class name */
        final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<SplashScreenContract.Action, Continuation<? super Unit>, Object>, SuspendFunction {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                SplashScreenContract.Action action = (SplashScreenContract.Action) obj;
                SplashScreenActivity splashScreenActivity = (SplashScreenActivity) this.d;
                int i = SplashScreenActivity.C;
                splashScreenActivity.getClass();
                if (action instanceof SplashScreenContract.Action.LaunchHome) {
                    Intent intentB = Activities.MainActivity.f4487a.b();
                    if (splashScreenActivity.getIntent().getBooleanExtra("is_deep_link_flag", false)) {
                        intentB.putExtras(splashScreenActivity.getIntent());
                    }
                    splashScreenActivity.startActivity(intentB);
                    splashScreenActivity.finish();
                } else if (action instanceof SplashScreenContract.Action.LaunchOnboarding) {
                    SplashViewModel splashViewModel = (SplashViewModel) splashScreenActivity.x.getD();
                    if (splashViewModel.m.b() == Region.i && splashViewModel.l.c(BaseShopAppFeature.C)) {
                        Intent intentA = ActivityNavigatorKt.a(Activities.OnboardingSdui.f4494a, ApplicationType.e);
                        intentA.addFlags(335544320);
                        if (splashScreenActivity.getIntent().getBooleanExtra("is_deep_link_flag", false)) {
                            intentA.putExtras(splashScreenActivity.getIntent());
                        }
                        splashScreenActivity.startActivity(intentA);
                        splashScreenActivity.O4();
                        splashScreenActivity.finish();
                    } else {
                        splashScreenActivity.S4();
                    }
                } else if (action instanceof SplashScreenContract.Action.LaunchLegacyOnboarding) {
                    splashScreenActivity.S4();
                } else if (action instanceof SplashScreenContract.Action.LaunchCountrySelector) {
                    Intent intentB2 = Activities.CountrySelector.f4463a.b(Activities.CountrySelector.Source.d);
                    intentB2.addFlags(335544320);
                    if (splashScreenActivity.getIntent().getBooleanExtra("is_deep_link_flag", false)) {
                        intentB2.putExtras(splashScreenActivity.getIntent());
                    }
                    splashScreenActivity.startActivity(intentB2);
                    splashScreenActivity.O4();
                    splashScreenActivity.finish();
                } else if (action instanceof SplashScreenContract.Action.ShowForceUpdateDialog) {
                    String string = splashScreenActivity.getString(R.string.update);
                    Intrinsics.g(string, "getString(...)");
                    String strA = ((SplashScreenContract.Action.ShowForceUpdateDialog) action).getF4438a();
                    String str = strA == null ? "" : strA;
                    String string2 = splashScreenActivity.getString(R.string.update);
                    Intrinsics.g(string2, "getString(...)");
                    splashScreenActivity.Q4(new Activities.AppConfigAction.ConfigExtras("app_force_upgrade_foreground", "APP", "FORCED_DIALOG", string, str, string2, (String) null, (String) null, 448));
                } else if (action instanceof SplashScreenContract.Action.ShowUpdateAvailableDialog) {
                    String string3 = splashScreenActivity.getString(R.string.update);
                    Intrinsics.g(string3, "getString(...)");
                    SplashScreenContract.Action.ShowUpdateAvailableDialog showUpdateAvailableDialog = (SplashScreenContract.Action.ShowUpdateAvailableDialog) action;
                    String strB = showUpdateAvailableDialog.getF4442a();
                    String str2 = strB == null ? "" : strB;
                    String string4 = splashScreenActivity.getString(R.string.update);
                    Intrinsics.g(string4, "getString(...)");
                    splashScreenActivity.Q4(new Activities.AppConfigAction.ConfigExtras("app_soft_upgrade_foreground", "APP", "FLEXIBLE_DIALOG", string3, str2, string4, splashScreenActivity.getString(R.string.not_now), showUpdateAvailableDialog.getB(), 128));
                } else if (action instanceof SplashScreenContract.Action.ShowUnsupportedOsDialog) {
                    String string5 = splashScreenActivity.getString(R.string.update);
                    Intrinsics.g(string5, "getString(...)");
                    String strA2 = ((SplashScreenContract.Action.ShowUnsupportedOsDialog) action).getF4441a();
                    String str3 = strA2 == null ? "" : strA2;
                    String string6 = splashScreenActivity.getString(R.string.update);
                    Intrinsics.g(string6, "getString(...)");
                    splashScreenActivity.Q4(new Activities.AppConfigAction.ConfigExtras("os_soft_upgrade_foreground", "OS", "FLEXIBLE_DIALOG", string5, str3, string6, splashScreenActivity.getString(R.string.not_now), (String) null, KyberEngine.KyberPolyBytes));
                } else if (action instanceof SplashScreenContract.Action.ShowAppFlexibleUpdate) {
                    splashScreenActivity.R4(((SplashScreenContract.Action.ShowAppFlexibleUpdate) action).getF4436a());
                } else if (action instanceof SplashScreenContract.Action.ShowAppForcedUpdate) {
                    splashScreenActivity.R4(((SplashScreenContract.Action.ShowAppForcedUpdate) action).getF4437a());
                } else if (action instanceof SplashScreenContract.Action.ShowOsFlexibleUpdate) {
                    splashScreenActivity.R4(((SplashScreenContract.Action.ShowOsFlexibleUpdate) action).getF4439a());
                } else {
                    if (!(action instanceof SplashScreenContract.Action.ShowOsForcedUpdate)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    splashScreenActivity.R4(((SplashScreenContract.Action.ShowOsForcedUpdate) action).getF4440a());
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return SplashScreenActivity.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                int i2 = SplashScreenActivity.C;
                SplashScreenActivity splashScreenActivity = SplashScreenActivity.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, splashScreenActivity, SplashScreenActivity.class, "handleAction", "handleAction(Lau/com/woolworths/android/onesite/modules/splash/SplashScreenContract$Action;)V", 4), FlowExtKt.a(((SplashViewModel) splashScreenActivity.x.getD()).p, splashScreenActivity.getD(), Lifecycle.State.g));
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.android.onesite.modules.splash.SplashScreenActivity$onCreate$3, reason: invalid class name */
    final /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ((SplashScreenActivity) this.receiver).A = false;
            return Unit.f24250a;
        }
    }

    public final void O4() {
        P4().f4059a.remove("app_cold_start_interactive_state");
        P4().f4059a.remove("app_start_interactive_state");
    }

    public final FirebasePerfMonitor P4() {
        FirebasePerfMonitor firebasePerfMonitor = this.y;
        if (firebasePerfMonitor != null) {
            return firebasePerfMonitor;
        }
        Intrinsics.p("firebasePerfMonitor");
        throw null;
    }

    public final void Q4(Activities.AppConfigAction.ConfigExtras configExtras) {
        ActivityOptionsCompat activityOptionsCompatA = ActivityOptionsCompat.a(this, android.R.anim.fade_in, android.R.anim.fade_out);
        Intent intentA = ActivityNavigatorKt.a(Activities.AppConfigAction.f4446a, ApplicationType.e);
        intentA.putExtra("EXTRA_CONFIG_ACTION_DETAILS", configExtras);
        this.B.a(intentA, activityOptionsCompatA);
    }

    public final void R4(UpgradeConfig upgradeConfig) {
        ActivityOptionsCompat activityOptionsCompatA = ActivityOptionsCompat.a(this, android.R.anim.fade_in, android.R.anim.fade_out);
        Intent intentA = ActivityNavigatorKt.a(Activities.AppConfigAction.f4446a, ApplicationType.e);
        intentA.putExtra("EXTRA_CONFIG_ACTION_DETAILS", new Activities.AppConfigAction.ConfigExtras(UpgradeConfigExtensionKt.a(upgradeConfig, "applaunch"), upgradeConfig.getF8501a().name(), upgradeConfig.getB().name(), upgradeConfig.getC().getF8503a(), upgradeConfig.getC().getB(), upgradeConfig.getC().getC(), upgradeConfig.getC().getD(), (String) null, KyberEngine.KyberPolyBytes));
        this.B.a(intentA, activityOptionsCompatA);
    }

    public final void S4() {
        Intent intentA = ActivityNavigatorKt.a(Activities.Onboarding.f4493a, ApplicationType.e);
        intentA.addFlags(335544320);
        if (getIntent().getBooleanExtra("is_deep_link_flag", false)) {
            intentA.putExtras(getIntent());
        }
        startActivity(intentA);
        O4();
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [au.com.woolworths.android.onesite.modules.splash.b] */
    @Override // au.com.woolworths.android.onesite.modules.splash.Hilt_SplashScreenActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        SplashScreen splashScreenA = SplashScreen.Companion.a(this);
        super.onCreate(bundle);
        splashScreenA.a(new SplashScreen.KeepOnScreenCondition() { // from class: au.com.woolworths.android.onesite.modules.splash.b
            @Override // androidx.core.splashscreen.SplashScreen.KeepOnScreenCondition
            public final boolean j() {
                return this.d.A;
            }
        });
        P4().c("app_start_interactive_state");
        P4().c("home_page_successful_load");
        P4().c("home_page_failed_load");
        FeatureToggleManager featureToggleManager = this.z;
        if (featureToggleManager == null) {
            Intrinsics.p("featureToggleManager");
            throw null;
        }
        featureToggleManager.activate();
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass2(null), 3);
        SplashViewModel splashViewModel = (SplashViewModel) this.x.getD();
        String strC = ContextExtKt.c(this);
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.g(RELEASE, "RELEASE");
        splashViewModel.p6(strC, new AnonymousClass3(0, this, SplashScreenActivity.class, "dismissSplashScreen", "dismissSplashScreen()V", 0));
    }
}
