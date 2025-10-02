package au.com.woolworths.feature.shared.force.upgrade;

import au.com.woolworths.analytics.shared.ForceUpgradeAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shared.force.upgrade.UpdateFullScreenType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ConfigActionActivity$setViewContent$1$1$1$1 extends FunctionReferenceImpl implements Function1<UpdateFullScreenType, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        UpdateFullScreenType p0 = (UpdateFullScreenType) obj;
        Intrinsics.h(p0, "p0");
        ConfigActionActivity configActionActivity = (ConfigActionActivity) this.receiver;
        int i = ConfigActionActivity.A;
        ConfigActionViewModel configActionViewModelP4 = configActionActivity.P4();
        String screenType = configActionActivity.O4().d;
        AnalyticsManager analyticsManager = configActionViewModelP4.f;
        Intrinsics.h(screenType, "screenType");
        if (p0 instanceof UpdateFullScreenType.AppForceUpdate) {
            analyticsManager.f(new ForceUpgradeAnalytics.ForceUpgradeAppScreen(screenType));
        } else {
            if (!(p0 instanceof UpdateFullScreenType.OsForceUpdate)) {
                throw new NoWhenBranchMatchedException();
            }
            analyticsManager.f(new ForceUpgradeAnalytics.ForceUpgradeOsScreen(screenType));
        }
        return Unit.f24250a;
    }
}
