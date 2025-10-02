package au.com.woolworths.feature.shared.force.upgrade;

import au.com.woolworths.analytics.shared.ForceUpgradeAnalytics;
import au.com.woolworths.analytics.shared.ForceUpgradeAnalytics$SoftUpgradeAppDialog$Action$buttonClick$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ConfigActionActivity$setViewContent$1$1$3$1 extends FunctionReferenceImpl implements Function2<String, String, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String p0 = (String) obj;
        Intrinsics.h(p0, "p0");
        ConfigActionActivity configActionActivity = (ConfigActionActivity) this.receiver;
        int i = ConfigActionActivity.A;
        String str = configActionActivity.O4().d;
        ConfigActionViewModel configActionViewModelP4 = configActionActivity.P4();
        ForceUpgradeAnalytics.SoftUpgradeAppDialog.Action action = new ForceUpgradeAnalytics.SoftUpgradeAppDialog(str).f;
        action.getClass();
        configActionViewModelP4.f.g(new ForceUpgradeAnalytics$SoftUpgradeAppDialog$Action$buttonClick$1(action, p0));
        configActionActivity.P4().e.b((String) obj2);
        configActionActivity.setResult(2);
        configActionActivity.finish();
        return Unit.f24250a;
    }
}
