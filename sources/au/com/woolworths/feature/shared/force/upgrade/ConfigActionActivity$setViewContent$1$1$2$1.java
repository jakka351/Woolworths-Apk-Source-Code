package au.com.woolworths.feature.shared.force.upgrade;

import au.com.woolworths.analytics.shared.ForceUpgradeAnalytics;
import au.com.woolworths.analytics.shared.ForceUpgradeAnalytics$ForceUpgradeAppScreen$Action$buttonClick$1;
import au.com.woolworths.analytics.shared.ForceUpgradeAnalytics$SoftUpgradeAppDialog$Action$buttonClick$1;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ConfigActionActivity$setViewContent$1$1$2$1 extends FunctionReferenceImpl implements Function2<Boolean, String, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        String p1 = (String) obj2;
        Intrinsics.h(p1, "p1");
        ConfigActionActivity configActionActivity = (ConfigActionActivity) this.receiver;
        int i = ConfigActionActivity.A;
        String str = configActionActivity.O4().d;
        if (zBooleanValue) {
            ConfigActionViewModel configActionViewModelP4 = configActionActivity.P4();
            ForceUpgradeAnalytics.ForceUpgradeAppScreen.Action action = new ForceUpgradeAnalytics.ForceUpgradeAppScreen(str).f;
            action.getClass();
            configActionViewModelP4.f.g(new ForceUpgradeAnalytics$ForceUpgradeAppScreen$Action$buttonClick$1(action, p1));
        } else {
            ConfigActionViewModel configActionViewModelP42 = configActionActivity.P4();
            ForceUpgradeAnalytics.SoftUpgradeAppDialog.Action action2 = new ForceUpgradeAnalytics.SoftUpgradeAppDialog(str).f;
            action2.getClass();
            configActionViewModelP42.f.g(new ForceUpgradeAnalytics$SoftUpgradeAppDialog$Action$buttonClick$1(action2, p1));
        }
        ContextExtKt.g(configActionActivity, configActionActivity.P4().l);
        configActionActivity.setResult(-1);
        configActionActivity.finish();
        return Unit.f24250a;
    }
}
