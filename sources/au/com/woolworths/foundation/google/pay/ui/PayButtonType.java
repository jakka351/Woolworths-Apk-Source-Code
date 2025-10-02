package au.com.woolworths.foundation.google.pay.ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/google/pay/ui/PayButtonType;", "", "google-pay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PayButtonType {
    public static final /* synthetic */ PayButtonType[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        PayButtonType[] payButtonTypeArr = {new PayButtonType("Book", 0), new PayButtonType("Buy", 1), new PayButtonType("Checkout", 2), new PayButtonType("Donate", 3), new PayButtonType("Order", 4), new PayButtonType("Pay", 5), new PayButtonType("Plain", 6), new PayButtonType("Subscribe", 7)};
        d = payButtonTypeArr;
        e = EnumEntriesKt.a(payButtonTypeArr);
    }

    public static PayButtonType valueOf(String str) {
        return (PayButtonType) Enum.valueOf(PayButtonType.class, str);
    }

    public static PayButtonType[] values() {
        return (PayButtonType[]) d.clone();
    }
}
