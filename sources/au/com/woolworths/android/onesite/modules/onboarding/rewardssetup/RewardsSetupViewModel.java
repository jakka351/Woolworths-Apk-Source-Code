package au.com.woolworths.android.onesite.modules.onboarding.rewardssetup;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.modules.onboarding.rewardssetup.RewardsSetupContract;
import au.com.woolworths.android.onesite.repository.LaunchManager;
import au.com.woolworths.base.shopapp.appdata.LegacyShopAnalyticsManager;
import dagger.hilt.android.lifecycle.HiltViewModel;
import io.reactivex.subjects.PublishSubject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/onboarding/rewardssetup/RewardsSetupViewModel;", "Landroidx/lifecycle/ViewModel;", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsSetupViewModel extends ViewModel {
    public final LaunchManager e;
    public final AnalyticsManager f;
    public final LegacyShopAnalyticsManager g;
    public final String h;
    public boolean i;
    public boolean j;
    public final PublishSubject k;
    public final PublishSubject l;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4388a;

        static {
            int[] iArr = new int[LaunchManager.LaunchState.values().length];
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f4388a = iArr;
        }
    }

    public RewardsSetupViewModel(LaunchManager launchManager, AnalyticsManager analyticsManager, LegacyShopAnalyticsManager legacyShopAnalyticsManager) {
        Intrinsics.h(launchManager, "launchManager");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(legacyShopAnalyticsManager, "legacyShopAnalyticsManager");
        this.e = launchManager;
        this.f = analyticsManager;
        this.g = legacyShopAnalyticsManager;
        this.h = "Onboarding Rewards Chooser screen";
        PublishSubject publishSubject = new PublishSubject();
        this.k = publishSubject;
        this.l = publishSubject;
    }

    public final void p6(boolean z) {
        LaunchManager launchManager = this.e;
        LaunchManager.LaunchState launchStateD = launchManager.d();
        if (launchStateD == LaunchManager.LaunchState.g) {
            launchStateD = LaunchManager.LaunchState.h;
            launchManager.a(launchStateD);
        }
        int i = launchStateD == null ? -1 : WhenMappings.f4388a[launchStateD.ordinal()];
        PublishSubject publishSubject = this.k;
        if (i == 1) {
            publishSubject.onNext(RewardsSetupContract.Actions.LaunchHome.f4383a);
        } else {
            publishSubject.onNext(new RewardsSetupContract.Actions.LaunchShoppingModeSelector(z));
        }
    }
}
