package au.com.woolworths.feature.shared.instore.wifi.ui;

import au.com.woolworths.feature.shared.instore.wifi.analytics.InstoreWifiAction;
import au.com.woolworths.feature.shared.instore.wifi.analytics.ShopInstoreWifiAnalyticsInteractor;
import au.com.woolworths.feature.shared.instore.wifi.analytics.WifiScreens;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class InstoreWifiScreenKt$InstoreWifiScreen$6$1 extends FunctionReferenceImpl implements Function2<Boolean, String, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        String p1 = (String) obj2;
        Intrinsics.h(p1, "p1");
        InstoreWifiViewModel instoreWifiViewModel = (InstoreWifiViewModel) this.receiver;
        instoreWifiViewModel.getClass();
        ShopInstoreWifiAnalyticsInteractor shopInstoreWifiAnalyticsInteractor = instoreWifiViewModel.g;
        WifiScreens wifiScreensQ6 = InstoreWifiViewModel.q6(zBooleanValue);
        shopInstoreWifiAnalyticsInteractor.getClass();
        shopInstoreWifiAnalyticsInteractor.f6517a.c(new InstoreWifiAction.PrivacyPolicyLinkClick(wifiScreensQ6));
        return Unit.f24250a;
    }
}
