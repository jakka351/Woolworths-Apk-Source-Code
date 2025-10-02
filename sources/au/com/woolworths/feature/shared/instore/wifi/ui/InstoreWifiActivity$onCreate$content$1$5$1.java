package au.com.woolworths.feature.shared.instore.wifi.ui;

import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.shared.instore.wifi.analytics.InstoreWifiAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class InstoreWifiActivity$onCreate$content$1$5$1 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        InstoreWifiActivity instoreWifiActivity = (InstoreWifiActivity) this.receiver;
        int i = InstoreWifiActivity.D;
        instoreWifiActivity.N4().f.j(InstoreWifiAction.LoginDialogButtonClick.d, TrackingMetadata.Companion.a(TrackableValue.o0, zBooleanValue ? "Continue" : "cancel"));
        if (zBooleanValue) {
            Activities.LogIn.c(instoreWifiActivity);
        }
        return Unit.f24250a;
    }
}
