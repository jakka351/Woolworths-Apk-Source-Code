package au.com.woolworths.feature.shared.instore.wifi.ui;

import au.com.woolworths.feature.shared.instore.wifi.analytics.InstoreWifiAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class InstoreWifiScreenKt$InstoreWifiScreen$4$1 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ((InstoreWifiViewModel) this.receiver).g.f6517a.c(new InstoreWifiAction.NotificationPreferencesLinkClick(InstoreWifiViewModel.q6(zBooleanValue)));
        return Unit.f24250a;
    }
}
