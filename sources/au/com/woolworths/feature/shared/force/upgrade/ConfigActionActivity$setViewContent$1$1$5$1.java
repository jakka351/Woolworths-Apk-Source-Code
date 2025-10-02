package au.com.woolworths.feature.shared.force.upgrade;

import au.com.woolworths.analytics.shared.ForceUpgradeAnalytics;
import au.com.woolworths.analytics.shared.ForceUpgradeAnalytics$SoftUpgradeOsDialog$Action$buttonClick$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ConfigActionActivity$setViewContent$1$1$5$1 extends FunctionReferenceImpl implements Function1<String, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String p0 = (String) obj;
        Intrinsics.h(p0, "p0");
        ConfigActionActivity configActionActivity = (ConfigActionActivity) this.receiver;
        int i = ConfigActionActivity.A;
        String str = configActionActivity.O4().d;
        ConfigActionViewModel configActionViewModelP4 = configActionActivity.P4();
        ForceUpgradeAnalytics.SoftUpgradeOsDialog.Action action = new ForceUpgradeAnalytics.SoftUpgradeOsDialog(str).f;
        action.getClass();
        configActionViewModelP4.f.g(new ForceUpgradeAnalytics$SoftUpgradeOsDialog$Action$buttonClick$1(action, p0));
        configActionActivity.setResult(2);
        configActionActivity.finish();
        return Unit.f24250a;
    }
}
