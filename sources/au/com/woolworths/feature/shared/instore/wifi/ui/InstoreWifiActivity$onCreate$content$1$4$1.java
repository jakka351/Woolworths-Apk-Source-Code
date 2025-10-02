package au.com.woolworths.feature.shared.instore.wifi.ui;

import au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class InstoreWifiActivity$onCreate$content$1$4$1 extends FunctionReferenceImpl implements Function1<InstoreWifiContract.ErrorType, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InstoreWifiContract.ErrorType p0 = (InstoreWifiContract.ErrorType) obj;
        Intrinsics.h(p0, "p0");
        InstoreWifiActivity instoreWifiActivity = (InstoreWifiActivity) this.receiver;
        int i = InstoreWifiActivity.D;
        InstoreWifiViewModel instoreWifiViewModelN4 = instoreWifiActivity.N4();
        InstoreWifiViewModel.r6(instoreWifiViewModelN4, instoreWifiViewModelN4.h, null, false, null, null, 15);
        if (p0 == InstoreWifiContract.ErrorType.e) {
            instoreWifiActivity.finish();
        }
        return Unit.f24250a;
    }
}
