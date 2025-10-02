package au.com.woolworths.rewards.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/PaymentMode;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PaymentMode {
    public static final Companion e;
    public static final PaymentMode f;
    public static final /* synthetic */ PaymentMode[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/PaymentMode$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        PaymentMode paymentMode = new PaymentMode("CARD", 0, "CARD");
        PaymentMode paymentMode2 = new PaymentMode("REDIRECT", 1, "REDIRECT");
        PaymentMode paymentMode3 = new PaymentMode("APPLEPAY", 2, "APPLEPAY");
        PaymentMode paymentMode4 = new PaymentMode("GOOGLEPAY", 3, "GOOGLEPAY");
        PaymentMode paymentMode5 = new PaymentMode("EVERYDAY_PAY", 4, "EVERYDAY_PAY");
        PaymentMode paymentMode6 = new PaymentMode("UNKNOWN__", 5, "UNKNOWN__");
        f = paymentMode6;
        PaymentMode[] paymentModeArr = {paymentMode, paymentMode2, paymentMode3, paymentMode4, paymentMode5, paymentMode6};
        g = paymentModeArr;
        h = EnumEntriesKt.a(paymentModeArr);
        e = new Companion();
        CollectionsKt.R("CARD", "REDIRECT", "APPLEPAY", "GOOGLEPAY", "EVERYDAY_PAY");
    }

    public PaymentMode(String str, int i, String str2) {
        this.d = str2;
    }

    public static PaymentMode valueOf(String str) {
        return (PaymentMode) Enum.valueOf(PaymentMode.class, str);
    }

    public static PaymentMode[] values() {
        return (PaymentMode[]) g.clone();
    }
}
