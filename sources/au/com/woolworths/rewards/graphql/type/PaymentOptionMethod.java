package au.com.woolworths.rewards.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/PaymentOptionMethod;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PaymentOptionMethod {
    public static final Companion e;
    public static final PaymentOptionMethod f;
    public static final /* synthetic */ PaymentOptionMethod[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/PaymentOptionMethod$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        PaymentOptionMethod paymentOptionMethod = new PaymentOptionMethod("CARD", 0, "CARD");
        PaymentOptionMethod paymentOptionMethod2 = new PaymentOptionMethod("PAYPAL", 1, "PAYPAL");
        PaymentOptionMethod paymentOptionMethod3 = new PaymentOptionMethod("PAYPALPAYLATER", 2, "PAYPALPAYLATER");
        PaymentOptionMethod paymentOptionMethod4 = new PaymentOptionMethod("GOOGLEPAY", 3, "GOOGLEPAY");
        PaymentOptionMethod paymentOptionMethod5 = new PaymentOptionMethod("APPLEPAY", 4, "APPLEPAY");
        PaymentOptionMethod paymentOptionMethod6 = new PaymentOptionMethod("EVERYDAY_REWARDS", 5, "EVERYDAY_REWARDS");
        PaymentOptionMethod paymentOptionMethod7 = new PaymentOptionMethod("EVERYDAY_PAY", 6, "EVERYDAY_PAY");
        PaymentOptionMethod paymentOptionMethod8 = new PaymentOptionMethod("UNKNOWN__", 7, "UNKNOWN__");
        f = paymentOptionMethod8;
        PaymentOptionMethod[] paymentOptionMethodArr = {paymentOptionMethod, paymentOptionMethod2, paymentOptionMethod3, paymentOptionMethod4, paymentOptionMethod5, paymentOptionMethod6, paymentOptionMethod7, paymentOptionMethod8};
        g = paymentOptionMethodArr;
        h = EnumEntriesKt.a(paymentOptionMethodArr);
        e = new Companion();
        CollectionsKt.R("CARD", "PAYPAL", "PAYPALPAYLATER", "GOOGLEPAY", "APPLEPAY", "EVERYDAY_REWARDS", "EVERYDAY_PAY");
    }

    public PaymentOptionMethod(String str, int i, String str2) {
        this.d = str2;
    }

    public static PaymentOptionMethod valueOf(String str) {
        return (PaymentOptionMethod) Enum.valueOf(PaymentOptionMethod.class, str);
    }

    public static PaymentOptionMethod[] values() {
        return (PaymentOptionMethod[]) g.clone();
    }
}
