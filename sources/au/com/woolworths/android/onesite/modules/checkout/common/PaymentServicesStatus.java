package au.com.woolworths.android.onesite.modules.checkout.common;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/common/PaymentServicesStatus;", "", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaymentServicesStatus {
    public static final PaymentServicesStatus d;
    public static final PaymentServicesStatus e;
    public static final PaymentServicesStatus f;
    public static final PaymentServicesStatus g;
    public static final /* synthetic */ PaymentServicesStatus[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        PaymentServicesStatus paymentServicesStatus = new PaymentServicesStatus("DIGITAL_PAY_ENABLED", 0);
        d = paymentServicesStatus;
        PaymentServicesStatus paymentServicesStatus2 = new PaymentServicesStatus("LOADING", 1);
        e = paymentServicesStatus2;
        PaymentServicesStatus paymentServicesStatus3 = new PaymentServicesStatus("NO_NETWORK_CONNECTION", 2);
        f = paymentServicesStatus3;
        PaymentServicesStatus paymentServicesStatus4 = new PaymentServicesStatus("SERVER_ERROR", 3);
        g = paymentServicesStatus4;
        PaymentServicesStatus[] paymentServicesStatusArr = {paymentServicesStatus, paymentServicesStatus2, paymentServicesStatus3, paymentServicesStatus4};
        h = paymentServicesStatusArr;
        i = EnumEntriesKt.a(paymentServicesStatusArr);
    }

    public static PaymentServicesStatus valueOf(String str) {
        return (PaymentServicesStatus) Enum.valueOf(PaymentServicesStatus.class, str);
    }

    public static PaymentServicesStatus[] values() {
        return (PaymentServicesStatus[]) h.clone();
    }
}
