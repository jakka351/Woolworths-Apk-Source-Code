package au.com.woolworths.feature.shop.onboarding.sdui;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.branch.BranchDeepLinkInteractorImpl;
import au.com.woolworths.android.onesite.branch.BranchReferringParams;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.shop.onboarding.sdui.OnboardingSduiContract;
import au.com.woolworths.feature.shop.onboarding.sdui.ui.OnboardingSduiScreenKt;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/sdui/OnboardingSduiActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes.dex */
public final class OnboardingSduiActivity extends Hilt_OnboardingSduiActivity {
    public static final /* synthetic */ int B = 0;
    public ActivityResultLauncher A;
    public AnalyticsManager w;
    public BranchDeepLinkInteractorImpl x;
    public final ViewModelLazy y = new ViewModelLazy(Reflection.f24268a.b(OnboardingSduiViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.onboarding.sdui.OnboardingSduiActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.onboarding.sdui.OnboardingSduiActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.onboarding.sdui.OnboardingSduiActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public ActivityResultLauncher z;

    public static final void N4(OnboardingSduiActivity onboardingSduiActivity) {
        ComponentName component;
        Intent intentB = Activities.MainActivity.f4487a.b();
        if (onboardingSduiActivity.getIntent().getBooleanExtra("is_deep_link_flag", false)) {
            Intent intent = (Intent) onboardingSduiActivity.getIntent().getParcelableExtra("ShopAppDeepLink.Extras.deferredIntent");
            if (!Intrinsics.c((intent == null || (component = intent.getComponent()) == null) ? null : component.getClassName(), onboardingSduiActivity.getLocalClassName())) {
                intentB.putExtras(onboardingSduiActivity.getIntent());
            }
        }
        onboardingSduiActivity.startActivity(intentB);
        onboardingSduiActivity.finish();
    }

    @Override // au.com.woolworths.feature.shop.onboarding.sdui.Hilt_OnboardingSduiActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.z = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new a(this, 0));
        this.A = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new a(this, 1));
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.onboarding.sdui.OnboardingSduiActivity.onCreate.3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final OnboardingSduiActivity onboardingSduiActivity = OnboardingSduiActivity.this;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(1467311681, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.onboarding.sdui.OnboardingSduiActivity.onCreate.3.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            int iIntValue = ((Number) obj4).intValue();
                            final int i = 3;
                            final int i2 = 2;
                            if ((iIntValue & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                int i3 = OnboardingSduiActivity.B;
                                final OnboardingSduiActivity onboardingSduiActivity2 = onboardingSduiActivity;
                                OnboardingSduiViewModel onboardingSduiViewModel = (OnboardingSduiViewModel) onboardingSduiActivity2.y.getD();
                                composer2.o(5004770);
                                boolean zI = composer2.I(onboardingSduiActivity2);
                                Object objG = composer2.G();
                                final int i4 = 0;
                                Object obj5 = Composer.Companion.f1624a;
                                if (zI || objG == obj5) {
                                    objG = new Function1() { // from class: au.com.woolworths.feature.shop.onboarding.sdui.b
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj6) {
                                            int i5 = i4;
                                            Unit unit = Unit.f24250a;
                                            OnboardingSduiActivity onboardingSduiActivity3 = onboardingSduiActivity2;
                                            switch (i5) {
                                                case 0:
                                                    Intrinsics.h((OnboardingSduiContract.NavigationAction.ContinueAsGuest) obj6, "action");
                                                    OnboardingSduiActivity.N4(onboardingSduiActivity3);
                                                    return unit;
                                                default:
                                                    OnboardingSduiContract.NavigationAction.NavigateToBranchLink action = (OnboardingSduiContract.NavigationAction.NavigateToBranchLink) obj6;
                                                    Intrinsics.h(action, "action");
                                                    BranchReferringParams f7967a = action.getF7967a();
                                                    int i6 = OnboardingSduiActivity.B;
                                                    ApplicationType applicationType = ApplicationType.e;
                                                    onboardingSduiActivity3.startActivity(ActivityNavigatorKt.a(Activities.MainActivity.f4487a, applicationType));
                                                    onboardingSduiActivity3.finish();
                                                    BranchDeepLinkInteractorImpl branchDeepLinkInteractorImpl = onboardingSduiActivity3.x;
                                                    if (branchDeepLinkInteractorImpl != null) {
                                                        branchDeepLinkInteractorImpl.c(applicationType, onboardingSduiActivity3, f7967a, "");
                                                        return unit;
                                                    }
                                                    Intrinsics.p("branchDeepLinkInteractor");
                                                    throw null;
                                            }
                                        }
                                    };
                                    composer2.A(objG);
                                }
                                Function1 function1 = (Function1) objG;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(onboardingSduiActivity2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == obj5) {
                                    objG2 = new Function0() { // from class: au.com.woolworths.feature.shop.onboarding.sdui.c
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int i5 = i4;
                                            Unit unit = Unit.f24250a;
                                            OnboardingSduiActivity onboardingSduiActivity3 = onboardingSduiActivity2;
                                            switch (i5) {
                                                case 0:
                                                    ActivityResultLauncher activityResultLauncher = onboardingSduiActivity3.z;
                                                    if (activityResultLauncher != null) {
                                                        activityResultLauncher.a(ActivityNavigatorKt.a(Activities.LogIn.f4485a, ApplicationType.e), null);
                                                        return unit;
                                                    }
                                                    Intrinsics.p("loginLauncher");
                                                    throw null;
                                                case 1:
                                                    ActivityResultLauncher activityResultLauncher2 = onboardingSduiActivity3.A;
                                                    if (activityResultLauncher2 != null) {
                                                        activityResultLauncher2.a(ActivityNavigatorKt.a(Activities.SignUp.f4536a, ApplicationType.e), null);
                                                        return unit;
                                                    }
                                                    Intrinsics.p("signupLauncher");
                                                    throw null;
                                                case 2:
                                                    int i6 = OnboardingSduiActivity.B;
                                                    onboardingSduiActivity3.getClass();
                                                    Intent intentA = ActivityNavigatorKt.a(Activities.CollectionModeSetup.f4459a, ApplicationType.e);
                                                    intentA.putExtra("EXTRA_DATA", new Activities.CollectionModeSetup.CollectionModeSetupData(true));
                                                    if (onboardingSduiActivity3.getIntent().getBooleanExtra("is_deep_link_flag", false)) {
                                                        intentA.putExtras(onboardingSduiActivity3.getIntent());
                                                    }
                                                    onboardingSduiActivity3.startActivity(intentA);
                                                    onboardingSduiActivity3.finish();
                                                    return unit;
                                                default:
                                                    OnboardingSduiActivity.N4(onboardingSduiActivity3);
                                                    return unit;
                                            }
                                        }
                                    };
                                    composer2.A(objG2);
                                }
                                Function0 function0 = (Function0) objG2;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(onboardingSduiActivity2);
                                Object objG3 = composer2.G();
                                final int i5 = 1;
                                if (zI3 || objG3 == obj5) {
                                    objG3 = new Function0() { // from class: au.com.woolworths.feature.shop.onboarding.sdui.c
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int i52 = i5;
                                            Unit unit = Unit.f24250a;
                                            OnboardingSduiActivity onboardingSduiActivity3 = onboardingSduiActivity2;
                                            switch (i52) {
                                                case 0:
                                                    ActivityResultLauncher activityResultLauncher = onboardingSduiActivity3.z;
                                                    if (activityResultLauncher != null) {
                                                        activityResultLauncher.a(ActivityNavigatorKt.a(Activities.LogIn.f4485a, ApplicationType.e), null);
                                                        return unit;
                                                    }
                                                    Intrinsics.p("loginLauncher");
                                                    throw null;
                                                case 1:
                                                    ActivityResultLauncher activityResultLauncher2 = onboardingSduiActivity3.A;
                                                    if (activityResultLauncher2 != null) {
                                                        activityResultLauncher2.a(ActivityNavigatorKt.a(Activities.SignUp.f4536a, ApplicationType.e), null);
                                                        return unit;
                                                    }
                                                    Intrinsics.p("signupLauncher");
                                                    throw null;
                                                case 2:
                                                    int i6 = OnboardingSduiActivity.B;
                                                    onboardingSduiActivity3.getClass();
                                                    Intent intentA = ActivityNavigatorKt.a(Activities.CollectionModeSetup.f4459a, ApplicationType.e);
                                                    intentA.putExtra("EXTRA_DATA", new Activities.CollectionModeSetup.CollectionModeSetupData(true));
                                                    if (onboardingSduiActivity3.getIntent().getBooleanExtra("is_deep_link_flag", false)) {
                                                        intentA.putExtras(onboardingSduiActivity3.getIntent());
                                                    }
                                                    onboardingSduiActivity3.startActivity(intentA);
                                                    onboardingSduiActivity3.finish();
                                                    return unit;
                                                default:
                                                    OnboardingSduiActivity.N4(onboardingSduiActivity3);
                                                    return unit;
                                            }
                                        }
                                    };
                                    composer2.A(objG3);
                                }
                                Function0 function02 = (Function0) objG3;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI4 = composer2.I(onboardingSduiActivity2);
                                Object objG4 = composer2.G();
                                if (zI4 || objG4 == obj5) {
                                    objG4 = new Function1() { // from class: au.com.woolworths.feature.shop.onboarding.sdui.b
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj6) {
                                            int i52 = i5;
                                            Unit unit = Unit.f24250a;
                                            OnboardingSduiActivity onboardingSduiActivity3 = onboardingSduiActivity2;
                                            switch (i52) {
                                                case 0:
                                                    Intrinsics.h((OnboardingSduiContract.NavigationAction.ContinueAsGuest) obj6, "action");
                                                    OnboardingSduiActivity.N4(onboardingSduiActivity3);
                                                    return unit;
                                                default:
                                                    OnboardingSduiContract.NavigationAction.NavigateToBranchLink action = (OnboardingSduiContract.NavigationAction.NavigateToBranchLink) obj6;
                                                    Intrinsics.h(action, "action");
                                                    BranchReferringParams f7967a = action.getF7967a();
                                                    int i6 = OnboardingSduiActivity.B;
                                                    ApplicationType applicationType = ApplicationType.e;
                                                    onboardingSduiActivity3.startActivity(ActivityNavigatorKt.a(Activities.MainActivity.f4487a, applicationType));
                                                    onboardingSduiActivity3.finish();
                                                    BranchDeepLinkInteractorImpl branchDeepLinkInteractorImpl = onboardingSduiActivity3.x;
                                                    if (branchDeepLinkInteractorImpl != null) {
                                                        branchDeepLinkInteractorImpl.c(applicationType, onboardingSduiActivity3, f7967a, "");
                                                        return unit;
                                                    }
                                                    Intrinsics.p("branchDeepLinkInteractor");
                                                    throw null;
                                            }
                                        }
                                    };
                                    composer2.A(objG4);
                                }
                                Function1 function12 = (Function1) objG4;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI5 = composer2.I(onboardingSduiActivity2);
                                Object objG5 = composer2.G();
                                if (zI5 || objG5 == obj5) {
                                    objG5 = new Function0() { // from class: au.com.woolworths.feature.shop.onboarding.sdui.c
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int i52 = i2;
                                            Unit unit = Unit.f24250a;
                                            OnboardingSduiActivity onboardingSduiActivity3 = onboardingSduiActivity2;
                                            switch (i52) {
                                                case 0:
                                                    ActivityResultLauncher activityResultLauncher = onboardingSduiActivity3.z;
                                                    if (activityResultLauncher != null) {
                                                        activityResultLauncher.a(ActivityNavigatorKt.a(Activities.LogIn.f4485a, ApplicationType.e), null);
                                                        return unit;
                                                    }
                                                    Intrinsics.p("loginLauncher");
                                                    throw null;
                                                case 1:
                                                    ActivityResultLauncher activityResultLauncher2 = onboardingSduiActivity3.A;
                                                    if (activityResultLauncher2 != null) {
                                                        activityResultLauncher2.a(ActivityNavigatorKt.a(Activities.SignUp.f4536a, ApplicationType.e), null);
                                                        return unit;
                                                    }
                                                    Intrinsics.p("signupLauncher");
                                                    throw null;
                                                case 2:
                                                    int i6 = OnboardingSduiActivity.B;
                                                    onboardingSduiActivity3.getClass();
                                                    Intent intentA = ActivityNavigatorKt.a(Activities.CollectionModeSetup.f4459a, ApplicationType.e);
                                                    intentA.putExtra("EXTRA_DATA", new Activities.CollectionModeSetup.CollectionModeSetupData(true));
                                                    if (onboardingSduiActivity3.getIntent().getBooleanExtra("is_deep_link_flag", false)) {
                                                        intentA.putExtras(onboardingSduiActivity3.getIntent());
                                                    }
                                                    onboardingSduiActivity3.startActivity(intentA);
                                                    onboardingSduiActivity3.finish();
                                                    return unit;
                                                default:
                                                    OnboardingSduiActivity.N4(onboardingSduiActivity3);
                                                    return unit;
                                            }
                                        }
                                    };
                                    composer2.A(objG5);
                                }
                                Function0 function03 = (Function0) objG5;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI6 = composer2.I(onboardingSduiActivity2);
                                Object objG6 = composer2.G();
                                if (zI6 || objG6 == obj5) {
                                    objG6 = new Function0() { // from class: au.com.woolworths.feature.shop.onboarding.sdui.c
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int i52 = i;
                                            Unit unit = Unit.f24250a;
                                            OnboardingSduiActivity onboardingSduiActivity3 = onboardingSduiActivity2;
                                            switch (i52) {
                                                case 0:
                                                    ActivityResultLauncher activityResultLauncher = onboardingSduiActivity3.z;
                                                    if (activityResultLauncher != null) {
                                                        activityResultLauncher.a(ActivityNavigatorKt.a(Activities.LogIn.f4485a, ApplicationType.e), null);
                                                        return unit;
                                                    }
                                                    Intrinsics.p("loginLauncher");
                                                    throw null;
                                                case 1:
                                                    ActivityResultLauncher activityResultLauncher2 = onboardingSduiActivity3.A;
                                                    if (activityResultLauncher2 != null) {
                                                        activityResultLauncher2.a(ActivityNavigatorKt.a(Activities.SignUp.f4536a, ApplicationType.e), null);
                                                        return unit;
                                                    }
                                                    Intrinsics.p("signupLauncher");
                                                    throw null;
                                                case 2:
                                                    int i6 = OnboardingSduiActivity.B;
                                                    onboardingSduiActivity3.getClass();
                                                    Intent intentA = ActivityNavigatorKt.a(Activities.CollectionModeSetup.f4459a, ApplicationType.e);
                                                    intentA.putExtra("EXTRA_DATA", new Activities.CollectionModeSetup.CollectionModeSetupData(true));
                                                    if (onboardingSduiActivity3.getIntent().getBooleanExtra("is_deep_link_flag", false)) {
                                                        intentA.putExtras(onboardingSduiActivity3.getIntent());
                                                    }
                                                    onboardingSduiActivity3.startActivity(intentA);
                                                    onboardingSduiActivity3.finish();
                                                    return unit;
                                                default:
                                                    OnboardingSduiActivity.N4(onboardingSduiActivity3);
                                                    return unit;
                                            }
                                        }
                                    };
                                    composer2.A(objG6);
                                }
                                composer2.l();
                                OnboardingSduiScreenKt.i(onboardingSduiViewModel, function1, function0, function02, function12, function03, (Function0) objG6, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 458637853));
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        AnalyticsManager analyticsManager = this.w;
        if (analyticsManager != null) {
            analyticsManager.a(Screens.w);
        } else {
            Intrinsics.p("analyticsManager");
            throw null;
        }
    }
}
