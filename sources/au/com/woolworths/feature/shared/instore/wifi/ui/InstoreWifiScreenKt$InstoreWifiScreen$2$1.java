package au.com.woolworths.feature.shared.instore.wifi.ui;

import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shared.instore.wifi.analytics.InstoreWifiAction;
import au.com.woolworths.feature.shared.instore.wifi.analytics.WifiScreens;
import au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class InstoreWifiScreenKt$InstoreWifiScreen$2$1 extends FunctionReferenceImpl implements Function2<Boolean, Boolean, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        m(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
        return Unit.f24250a;
    }

    public final void m(boolean z, boolean z2) {
        InstoreWifiViewModel instoreWifiViewModel = (InstoreWifiViewModel) this.receiver;
        instoreWifiViewModel.getClass();
        WifiScreens wifiScreensQ6 = InstoreWifiViewModel.q6(z2);
        if (Boolean.valueOf(z).equals(((InstoreWifiContract.ViewState) instoreWifiViewModel.j.getValue()).c)) {
            return;
        }
        AnalyticsManager analyticsManager = instoreWifiViewModel.g.f6517a;
        if (z) {
            analyticsManager.c(new InstoreWifiAction.ToggleSwitchWifiClickOn(wifiScreensQ6));
        } else {
            analyticsManager.c(new InstoreWifiAction.ToggleSwitchWifiClickOff(wifiScreensQ6));
        }
        BuildersKt.c(ViewModelKt.a(instoreWifiViewModel), null, null, new InstoreWifiViewModel$onJoinCheckChanged$1(z, instoreWifiViewModel, wifiScreensQ6, null), 3);
    }
}
