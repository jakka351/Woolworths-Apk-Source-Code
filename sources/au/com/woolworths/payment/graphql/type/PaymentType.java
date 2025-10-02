package au.com.woolworths.payment.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/payment/graphql/type/PaymentType;", "", "Companion", "schema-payment"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PaymentType {
    public static final Companion e;
    public static final PaymentType f;
    public static final PaymentType g;
    public static final PaymentType h;
    public static final PaymentType i;
    public static final PaymentType j;
    public static final /* synthetic */ PaymentType[] k;
    public static final /* synthetic */ EnumEntries l;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/payment/graphql/type/PaymentType$Companion;", "", "schema-payment"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        PaymentType paymentType = new PaymentType("GIFT_CARD", 0, "GIFT_CARD");
        f = paymentType;
        PaymentType paymentType2 = new PaymentType("CREDIT_CARD", 1, "CREDIT_CARD");
        g = paymentType2;
        PaymentType paymentType3 = new PaymentType("PAYPAL", 2, "PAYPAL");
        h = paymentType3;
        PaymentType paymentType4 = new PaymentType("APPLE_PAY", 3, "APPLE_PAY");
        PaymentType paymentType5 = new PaymentType("GOOGLE_PAY", 4, "GOOGLE_PAY");
        i = paymentType5;
        PaymentType paymentType6 = new PaymentType("UNKNOWN__", 5, "UNKNOWN__");
        j = paymentType6;
        PaymentType[] paymentTypeArr = {paymentType, paymentType2, paymentType3, paymentType4, paymentType5, paymentType6};
        k = paymentTypeArr;
        l = EnumEntriesKt.a(paymentTypeArr);
        e = new Companion();
        CollectionsKt.R("GIFT_CARD", "CREDIT_CARD", "PAYPAL", "APPLE_PAY", "GOOGLE_PAY");
    }

    public PaymentType(String str, int i2, String str2) {
        this.d = str2;
    }

    public static PaymentType valueOf(String str) {
        return (PaymentType) Enum.valueOf(PaymentType.class, str);
    }

    public static PaymentType[] values() {
        return (PaymentType[]) k.clone();
    }
}
