package au.com.woolworths.feature.shop.onboarding;

import android.content.Intent;
import android.view.MenuItem;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.branch.BranchDeepLinkInteractorImpl;
import au.com.woolworths.android.onesite.branch.BranchReferringParams;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.feature.shop.bundles.ui.a;
import au.com.woolworths.feature.shop.onboarding.OnboardingContract;
import au.com.woolworths.feature.shop.onboarding.databinding.ActivityOnboardingBinding;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppFlavorInteractor;
import com.dynatrace.android.callback.Callback;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.disposables.CompositeDisposable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/OnboardingActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OnboardingActivity extends Hilt_OnboardingActivity {
    public static final /* synthetic */ int I = 0;
    public BranchDeepLinkInteractorImpl A;
    public ShopAppFlavorInteractor B;
    public ActivityOnboardingBinding C;
    public CallToActionEpoxyController E;
    public boolean G;
    public AnalyticsManager x;
    public FeatureToggleManager y;
    public ShopAppNavigator z;
    public final ViewModelLazy D = new ViewModelLazy(Reflection.f24268a.b(OnboardingViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.onboarding.OnboardingActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.onboarding.OnboardingActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.onboarding.OnboardingActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final Lazy F = LazyKt.b(new a(5));
    public final CompositeDisposable H = new CompositeDisposable();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.shop.onboarding.OnboardingActivity$onCreate$7, reason: invalid class name */
    final /* synthetic */ class AnonymousClass7 extends FunctionReferenceImpl implements Function1<OnboardingContract.NavigationActions, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            OnboardingContract.NavigationActions p0 = (OnboardingContract.NavigationActions) obj;
            Intrinsics.h(p0, "p0");
            OnboardingActivity onboardingActivity = (OnboardingActivity) this.receiver;
            int i = OnboardingActivity.I;
            onboardingActivity.getClass();
            if (p0 instanceof OnboardingContract.NavigationActions.CreateAccount) {
                ShopAppNavigator shopAppNavigator = onboardingActivity.z;
                if (shopAppNavigator == null) {
                    Intrinsics.p("navigator");
                    throw null;
                }
                shopAppNavigator.b.startActivityForResult(ActivityNavigatorKt.a(Activities.SignUp.f4536a, ApplicationType.e), 7777);
            } else if (p0 instanceof OnboardingContract.NavigationActions.LogIn) {
                Activities.LogIn.c(onboardingActivity);
            } else if (p0 instanceof OnboardingContract.NavigationActions.NavigateToCollectionMode) {
                Intent intentA = ActivityNavigatorKt.a(Activities.CollectionModeSetup.f4459a, ApplicationType.e);
                intentA.putExtra("EXTRA_DATA", new Activities.CollectionModeSetup.CollectionModeSetupData(true));
                if (onboardingActivity.getIntent().getBooleanExtra("is_deep_link_flag", false)) {
                    intentA.putExtras(onboardingActivity.getIntent());
                }
                onboardingActivity.startActivity(intentA);
                onboardingActivity.finish();
            } else if (p0 instanceof OnboardingContract.NavigationActions.NavigateToHomePage) {
                onboardingActivity.P4(true);
            } else if (p0 instanceof OnboardingContract.NavigationActions.ContinueAsGuest) {
                onboardingActivity.P4(((OnboardingContract.NavigationActions.ContinueAsGuest) p0).f7953a);
            } else {
                if (!(p0 instanceof OnboardingContract.NavigationActions.NavigateToBranchLink)) {
                    throw new NoWhenBranchMatchedException();
                }
                BranchReferringParams branchReferringParams = ((OnboardingContract.NavigationActions.NavigateToBranchLink) p0).f7956a;
                ApplicationType applicationType = ApplicationType.e;
                onboardingActivity.startActivity(ActivityNavigatorKt.a(Activities.MainActivity.f4487a, applicationType));
                onboardingActivity.finish();
                BranchDeepLinkInteractorImpl branchDeepLinkInteractorImpl = onboardingActivity.A;
                if (branchDeepLinkInteractorImpl == null) {
                    Intrinsics.p("branchDeepLinkInteractor");
                    throw null;
                }
                branchDeepLinkInteractorImpl.c(applicationType, onboardingActivity, branchReferringParams, "");
            }
            return Unit.f24250a;
        }
    }

    public final OnboardingViewModel O4() {
        return (OnboardingViewModel) this.D.getD();
    }

    public final void P4(boolean z) {
        Intent intentB = Activities.MainActivity.f4487a.b();
        if (z && getIntent().getBooleanExtra("is_deep_link_flag", false)) {
            intentB.putExtras(getIntent());
        }
        startActivity(intentB);
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (i == 7777 || i == 8888) {
                O4().q6();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    @Override // au.com.woolworths.feature.shop.onboarding.Hilt_OnboardingActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.onboarding.OnboardingActivity.onCreate(android.os.Bundle):void");
    }

    @Override // au.com.woolworths.feature.shop.onboarding.Hilt_OnboardingActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        this.H.e();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        boolean zOnOptionsItemSelected;
        Callback.p(item);
        try {
            Intrinsics.h(item, "item");
            if (item.getItemId() == 16908332) {
                finish();
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
            analyticsManager.a(Screens.w);
        } else {
            Intrinsics.p("analyticsManager");
            throw null;
        }
    }
}
