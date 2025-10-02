package au.com.woolworths.feature.shared.instore.wifi.ui;

import com.cisco.or.sdk.OpenRoaming;
import com.cisco.or.sdk.exceptions.NotInitializedException;
import com.cisco.or.sdk.exceptions.NotSignedException;
import com.cisco.or.sdk.exceptions.ServiceBadResponseException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ InStoreWifiInteractorImpl e;

    public /* synthetic */ e(InStoreWifiInteractorImpl inStoreWifiInteractorImpl, int i) {
        this.d = i;
        this.e = inStoreWifiInteractorImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws NotSignedException, NotInitializedException, ServiceBadResponseException {
        Function0 it = (Function0) obj;
        switch (this.d) {
            case 0:
                Intrinsics.h(it, "it");
                OpenRoaming.b(this.e.i, it);
                break;
            default:
                Intrinsics.h(it, "it");
                OpenRoaming.e(this.e.i, it);
                break;
        }
        return Unit.f24250a;
    }
}
