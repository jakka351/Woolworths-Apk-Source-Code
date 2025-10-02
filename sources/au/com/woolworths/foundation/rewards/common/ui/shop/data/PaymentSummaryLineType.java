package au.com.woolworths.foundation.rewards.common.ui.shop.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/shop/data/PaymentSummaryLineType;", "", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PaymentSummaryLineType {
    public static final PaymentSummaryLineType d;
    public static final PaymentSummaryLineType e;
    public static final PaymentSummaryLineType f;
    public static final PaymentSummaryLineType g;
    public static final PaymentSummaryLineType h;
    public static final PaymentSummaryLineType i;
    public static final PaymentSummaryLineType j;
    public static final /* synthetic */ PaymentSummaryLineType[] k;
    public static final /* synthetic */ EnumEntries l;

    static {
        PaymentSummaryLineType paymentSummaryLineType = new PaymentSummaryLineType("BOLD", 0);
        d = paymentSummaryLineType;
        PaymentSummaryLineType paymentSummaryLineType2 = new PaymentSummaryLineType("BOLD_NEGATIVE", 1);
        e = paymentSummaryLineType2;
        PaymentSummaryLineType paymentSummaryLineType3 = new PaymentSummaryLineType("NEGATIVE", 2);
        f = paymentSummaryLineType3;
        PaymentSummaryLineType paymentSummaryLineType4 = new PaymentSummaryLineType("PLAIN", 3);
        g = paymentSummaryLineType4;
        PaymentSummaryLineType paymentSummaryLineType5 = new PaymentSummaryLineType("REWARDS", 4);
        h = paymentSummaryLineType5;
        PaymentSummaryLineType paymentSummaryLineType6 = new PaymentSummaryLineType("SAVINGS", 5);
        i = paymentSummaryLineType6;
        PaymentSummaryLineType paymentSummaryLineType7 = new PaymentSummaryLineType("SUBTOTAL", 6);
        PaymentSummaryLineType paymentSummaryLineType8 = new PaymentSummaryLineType("TOTAL", 7);
        j = paymentSummaryLineType8;
        PaymentSummaryLineType[] paymentSummaryLineTypeArr = {paymentSummaryLineType, paymentSummaryLineType2, paymentSummaryLineType3, paymentSummaryLineType4, paymentSummaryLineType5, paymentSummaryLineType6, paymentSummaryLineType7, paymentSummaryLineType8, new PaymentSummaryLineType("UNKNOWN", 8)};
        k = paymentSummaryLineTypeArr;
        l = EnumEntriesKt.a(paymentSummaryLineTypeArr);
    }

    public static PaymentSummaryLineType valueOf(String str) {
        return (PaymentSummaryLineType) Enum.valueOf(PaymentSummaryLineType.class, str);
    }

    public static PaymentSummaryLineType[] values() {
        return (PaymentSummaryLineType[]) k.clone();
    }
}
