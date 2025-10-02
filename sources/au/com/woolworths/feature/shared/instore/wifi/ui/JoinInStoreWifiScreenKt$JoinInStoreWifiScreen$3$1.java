package au.com.woolworths.feature.shared.instore.wifi.ui;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shared.instore.wifi.analytics.TermsAndConditionsInStoreWifiActions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class JoinInStoreWifiScreenKt$JoinInStoreWifiScreen$3$1 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        JoinWifiViewModel joinWifiViewModel = (JoinWifiViewModel) this.receiver;
        AnalyticsManager analyticsManager = joinWifiViewModel.f;
        if (zBooleanValue) {
            analyticsManager.c(TermsAndConditionsInStoreWifiActions.e);
        } else {
            analyticsManager.c(TermsAndConditionsInStoreWifiActions.f);
        }
        JoinWifiViewModel.s6(joinWifiViewModel, joinWifiViewModel.i, false, zBooleanValue, 1);
        return Unit.f24250a;
    }
}
