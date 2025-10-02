package au.com.woolworths.android.onesite.modules.splash;

import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.analytics.adobe.data.ActionData;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.modules.splash.SplashScreenContract;
import au.com.woolworths.android.onesite.repository.ConfigManagerImpl;
import au.com.woolworths.android.onesite.repository.PreferencesManager;
import au.com.woolworths.android.onesite.utils.preload.PreLoaderService;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.base.shopapp.appdata.LegacyShopAnalyticsManager;
import au.com.woolworths.foundation.force.upgrade.impl.AppConfigClientImpl;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppFlavorInteractor;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor;
import au.com.woolworths.foundation.shop.onboarding.data.OnboardingRepository;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/modules/splash/SplashViewModel;", "Landroidx/lifecycle/ViewModel;", "Companion", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SplashViewModel extends ViewModel {
    public final PreferencesManager e;
    public final OnboardingRepository f;
    public final LegacyShopAnalyticsManager g;
    public final ConfigManagerImpl h;
    public final AppConfigClientImpl i;
    public final PreLoaderService j;
    public final ShopAccountInteractor k;
    public final FeatureToggleManager l;
    public final ShopAppRegionInteractor m;
    public final ShopAppFlavorInteractor n;
    public final SharedFlowImpl o;
    public final Flow p;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/android/onesite/modules/splash/SplashViewModel$Companion;", "", "", "SPLASH_TIME_OUT", "J", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public SplashViewModel(PreferencesManager preferencesManager, OnboardingRepository onboardingRepository, LegacyShopAnalyticsManager analyticsManager, ConfigManagerImpl configManagerImpl, AppConfigClientImpl appConfigClientImpl, PreLoaderService preLoaderService, ShopAccountInteractor accountInteractor, FeatureToggleManager featureToggleManager, ShopAppRegionInteractor shopAppRegionInteractor, ShopAppFlavorInteractor shopAppFlavorInteractor) {
        Intrinsics.h(preferencesManager, "preferencesManager");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(preLoaderService, "preLoaderService");
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(shopAppRegionInteractor, "shopAppRegionInteractor");
        Intrinsics.h(shopAppFlavorInteractor, "shopAppFlavorInteractor");
        this.e = preferencesManager;
        this.f = onboardingRepository;
        this.g = analyticsManager;
        this.h = configManagerImpl;
        this.i = appConfigClientImpl;
        this.j = preLoaderService;
        this.k = accountInteractor;
        this.l = featureToggleManager;
        this.m = shopAppRegionInteractor;
        this.n = shopAppFlavorInteractor;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.o = sharedFlowImplB;
        this.p = FlowKt.a(sharedFlowImplB);
    }

    public static void r6(SplashViewModel splashViewModel, ActionData actionData) {
        LegacyShopAnalyticsManager legacyShopAnalyticsManager = splashViewModel.g;
        actionData.b("Splash screen");
        legacyShopAnalyticsManager.d(actionData);
    }

    public final void p6(String str, Function0 function0) {
        String osVersion = Build.VERSION.RELEASE;
        Intrinsics.h(osVersion, "osVersion");
        BuildersKt.c(ViewModelKt.a(this), null, null, new SplashViewModel$checkForAppUpdates$1(this, function0, str, null), 3);
    }

    public final void q6() {
        boolean z = this.f.f8865a.getBoolean("app_tour_key", false);
        SharedFlowImpl sharedFlowImpl = this.o;
        if (z) {
            sharedFlowImpl.f(SplashScreenContract.Action.LaunchHome.f4433a);
            return;
        }
        boolean zC = this.l.c(BaseShopAppFeature.c0);
        ShopAppFlavorInteractor shopAppFlavorInteractor = this.n;
        if (zC || shopAppFlavorInteractor.b(Region.j)) {
            sharedFlowImpl.f(shopAppFlavorInteractor.b(Region.j) ? SplashScreenContract.Action.LaunchLegacyOnboarding.f4434a : SplashScreenContract.Action.LaunchCountrySelector.f4432a);
        } else {
            sharedFlowImpl.f(SplashScreenContract.Action.LaunchOnboarding.f4435a);
        }
    }
}
