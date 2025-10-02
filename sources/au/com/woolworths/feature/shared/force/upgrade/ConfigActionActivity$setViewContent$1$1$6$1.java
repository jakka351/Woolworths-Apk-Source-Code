package au.com.woolworths.feature.shared.force.upgrade;

import au.com.woolworths.analytics.shared.ForceUpgradeAnalytics;
import au.com.woolworths.analytics.shared.ForceUpgradeAnalytics$ForceUpgradeAppScreen$Action$buttonClick$1;
import au.com.woolworths.analytics.shared.ForceUpgradeAnalytics$ForceUpgradeOsScreen$Action$buttonClick$1;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.feature.shared.force.upgrade.UpdateFullScreenType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ConfigActionActivity$setViewContent$1$1$6$1 extends FunctionReferenceImpl implements Function2<UpdateFullScreenType, String, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        UpdateFullScreenType p0 = (UpdateFullScreenType) obj;
        String p1 = (String) obj2;
        Intrinsics.h(p0, "p0");
        Intrinsics.h(p1, "p1");
        ConfigActionActivity configActionActivity = (ConfigActionActivity) this.receiver;
        int i = ConfigActionActivity.A;
        if (p0 instanceof UpdateFullScreenType.AppForceUpdate) {
            ConfigActionViewModel configActionViewModelP4 = configActionActivity.P4();
            ForceUpgradeAnalytics.ForceUpgradeAppScreen.Action action = new ForceUpgradeAnalytics.ForceUpgradeAppScreen(configActionActivity.O4().d).f;
            action.getClass();
            configActionViewModelP4.f.g(new ForceUpgradeAnalytics$ForceUpgradeAppScreen$Action$buttonClick$1(action, p1));
        } else {
            if (!(p0 instanceof UpdateFullScreenType.OsForceUpdate)) {
                configActionActivity.getClass();
                throw new NoWhenBranchMatchedException();
            }
            ConfigActionViewModel configActionViewModelP42 = configActionActivity.P4();
            ForceUpgradeAnalytics.ForceUpgradeOsScreen.Action action2 = new ForceUpgradeAnalytics.ForceUpgradeOsScreen(configActionActivity.O4().d).f;
            action2.getClass();
            configActionViewModelP42.f.g(new ForceUpgradeAnalytics$ForceUpgradeOsScreen$Action$buttonClick$1(action2, p1));
        }
        ApplicationType applicationType = configActionActivity.x;
        if (applicationType != null) {
            configActionActivity.startActivity(ActivityNavigatorKt.a(Activities.RewardsCardOverlay.f4517a, applicationType));
            return Unit.f24250a;
        }
        Intrinsics.p("applicationType");
        throw null;
    }
}
