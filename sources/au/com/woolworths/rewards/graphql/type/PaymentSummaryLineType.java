package au.com.woolworths.rewards.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/PaymentSummaryLineType;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PaymentSummaryLineType {
    public static final Companion e;
    public static final PaymentSummaryLineType f;
    public static final /* synthetic */ PaymentSummaryLineType[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/PaymentSummaryLineType$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        PaymentSummaryLineType paymentSummaryLineType = new PaymentSummaryLineType("BOLD", 0, "BOLD");
        PaymentSummaryLineType paymentSummaryLineType2 = new PaymentSummaryLineType("NEGATIVE", 1, "NEGATIVE");
        PaymentSummaryLineType paymentSummaryLineType3 = new PaymentSummaryLineType("PLAIN", 2, "PLAIN");
        PaymentSummaryLineType paymentSummaryLineType4 = new PaymentSummaryLineType("TOTAL", 3, "TOTAL");
        PaymentSummaryLineType paymentSummaryLineType5 = new PaymentSummaryLineType("SAVINGS", 4, "SAVINGS");
        PaymentSummaryLineType paymentSummaryLineType6 = new PaymentSummaryLineType("SUBTOTAL", 5, "SUBTOTAL");
        PaymentSummaryLineType paymentSummaryLineType7 = new PaymentSummaryLineType("REWARDS", 6, "REWARDS");
        PaymentSummaryLineType paymentSummaryLineType8 = new PaymentSummaryLineType("BOLD_NEGATIVE", 7, "BOLD_NEGATIVE");
        PaymentSummaryLineType paymentSummaryLineType9 = new PaymentSummaryLineType("UNKNOWN__", 8, "UNKNOWN__");
        f = paymentSummaryLineType9;
        PaymentSummaryLineType[] paymentSummaryLineTypeArr = {paymentSummaryLineType, paymentSummaryLineType2, paymentSummaryLineType3, paymentSummaryLineType4, paymentSummaryLineType5, paymentSummaryLineType6, paymentSummaryLineType7, paymentSummaryLineType8, paymentSummaryLineType9};
        g = paymentSummaryLineTypeArr;
        h = EnumEntriesKt.a(paymentSummaryLineTypeArr);
        e = new Companion();
        CollectionsKt.R("BOLD", "NEGATIVE", "PLAIN", "TOTAL", "SAVINGS", "SUBTOTAL", "REWARDS", "BOLD_NEGATIVE");
    }

    public PaymentSummaryLineType(String str, int i, String str2) {
        this.d = str2;
    }

    public static PaymentSummaryLineType valueOf(String str) {
        return (PaymentSummaryLineType) Enum.valueOf(PaymentSummaryLineType.class, str);
    }

    public static PaymentSummaryLineType[] values() {
        return (PaymentSummaryLineType[]) g.clone();
    }
}
