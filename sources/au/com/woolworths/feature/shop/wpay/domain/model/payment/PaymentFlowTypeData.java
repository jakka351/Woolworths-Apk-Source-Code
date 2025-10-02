package au.com.woolworths.feature.shop.wpay.domain.model.payment;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentFlowTypeData;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaymentFlowTypeData {
    public static final PaymentFlowTypeData d;
    public static final PaymentFlowTypeData e;
    public static final /* synthetic */ PaymentFlowTypeData[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        PaymentFlowTypeData paymentFlowTypeData = new PaymentFlowTypeData("CHECKOUT", 0);
        d = paymentFlowTypeData;
        PaymentFlowTypeData paymentFlowTypeData2 = new PaymentFlowTypeData("DELIVERY_UNLIMITED", 1);
        e = paymentFlowTypeData2;
        PaymentFlowTypeData[] paymentFlowTypeDataArr = {paymentFlowTypeData, paymentFlowTypeData2};
        f = paymentFlowTypeDataArr;
        g = EnumEntriesKt.a(paymentFlowTypeDataArr);
    }

    public static PaymentFlowTypeData valueOf(String str) {
        return (PaymentFlowTypeData) Enum.valueOf(PaymentFlowTypeData.class, str);
    }

    public static PaymentFlowTypeData[] values() {
        return (PaymentFlowTypeData[]) f.clone();
    }
}
