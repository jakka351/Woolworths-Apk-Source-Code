package au.com.woolworths.rewards.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/CheckoutPaymentSummaryLineType;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckoutPaymentSummaryLineType {
    public static final Companion e;
    public static final CheckoutPaymentSummaryLineType f;
    public static final /* synthetic */ CheckoutPaymentSummaryLineType[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/CheckoutPaymentSummaryLineType$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        CheckoutPaymentSummaryLineType checkoutPaymentSummaryLineType = new CheckoutPaymentSummaryLineType("BOLD", 0, "BOLD");
        CheckoutPaymentSummaryLineType checkoutPaymentSummaryLineType2 = new CheckoutPaymentSummaryLineType("NEGATIVE", 1, "NEGATIVE");
        CheckoutPaymentSummaryLineType checkoutPaymentSummaryLineType3 = new CheckoutPaymentSummaryLineType("BOLD_NEGATIVE", 2, "BOLD_NEGATIVE");
        CheckoutPaymentSummaryLineType checkoutPaymentSummaryLineType4 = new CheckoutPaymentSummaryLineType("PLAIN", 3, "PLAIN");
        CheckoutPaymentSummaryLineType checkoutPaymentSummaryLineType5 = new CheckoutPaymentSummaryLineType("TOTAL", 4, "TOTAL");
        CheckoutPaymentSummaryLineType checkoutPaymentSummaryLineType6 = new CheckoutPaymentSummaryLineType("SAVINGS", 5, "SAVINGS");
        CheckoutPaymentSummaryLineType checkoutPaymentSummaryLineType7 = new CheckoutPaymentSummaryLineType("SUBTOTAL", 6, "SUBTOTAL");
        CheckoutPaymentSummaryLineType checkoutPaymentSummaryLineType8 = new CheckoutPaymentSummaryLineType("REWARDS", 7, "REWARDS");
        CheckoutPaymentSummaryLineType checkoutPaymentSummaryLineType9 = new CheckoutPaymentSummaryLineType("UNKNOWN__", 8, "UNKNOWN__");
        f = checkoutPaymentSummaryLineType9;
        CheckoutPaymentSummaryLineType[] checkoutPaymentSummaryLineTypeArr = {checkoutPaymentSummaryLineType, checkoutPaymentSummaryLineType2, checkoutPaymentSummaryLineType3, checkoutPaymentSummaryLineType4, checkoutPaymentSummaryLineType5, checkoutPaymentSummaryLineType6, checkoutPaymentSummaryLineType7, checkoutPaymentSummaryLineType8, checkoutPaymentSummaryLineType9};
        g = checkoutPaymentSummaryLineTypeArr;
        h = EnumEntriesKt.a(checkoutPaymentSummaryLineTypeArr);
        e = new Companion();
        CollectionsKt.R("BOLD", "NEGATIVE", "BOLD_NEGATIVE", "PLAIN", "TOTAL", "SAVINGS", "SUBTOTAL", "REWARDS");
    }

    public CheckoutPaymentSummaryLineType(String str, int i, String str2) {
        this.d = str2;
    }

    public static CheckoutPaymentSummaryLineType valueOf(String str) {
        return (CheckoutPaymentSummaryLineType) Enum.valueOf(CheckoutPaymentSummaryLineType.class, str);
    }

    public static CheckoutPaymentSummaryLineType[] values() {
        return (CheckoutPaymentSummaryLineType[]) g.clone();
    }
}
