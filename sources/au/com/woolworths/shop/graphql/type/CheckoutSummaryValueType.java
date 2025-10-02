package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CheckoutSummaryValueType;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckoutSummaryValueType {
    public static final Companion e;
    public static final EnumType f;
    public static final CheckoutSummaryValueType g;
    public static final /* synthetic */ CheckoutSummaryValueType[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CheckoutSummaryValueType$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static EnumType a() {
            return CheckoutSummaryValueType.f;
        }
    }

    static {
        CheckoutSummaryValueType checkoutSummaryValueType = new CheckoutSummaryValueType("Total", 0, "Total");
        CheckoutSummaryValueType checkoutSummaryValueType2 = new CheckoutSummaryValueType("Plain", 1, "Plain");
        CheckoutSummaryValueType checkoutSummaryValueType3 = new CheckoutSummaryValueType("Point", 2, "Point");
        CheckoutSummaryValueType checkoutSummaryValueType4 = new CheckoutSummaryValueType("Negative", 3, "Negative");
        CheckoutSummaryValueType checkoutSummaryValueType5 = new CheckoutSummaryValueType("Bold", 4, "Bold");
        CheckoutSummaryValueType checkoutSummaryValueType6 = new CheckoutSummaryValueType("UNKNOWN__", 5, "UNKNOWN__");
        g = checkoutSummaryValueType6;
        CheckoutSummaryValueType[] checkoutSummaryValueTypeArr = {checkoutSummaryValueType, checkoutSummaryValueType2, checkoutSummaryValueType3, checkoutSummaryValueType4, checkoutSummaryValueType5, checkoutSummaryValueType6};
        h = checkoutSummaryValueTypeArr;
        i = EnumEntriesKt.a(checkoutSummaryValueTypeArr);
        e = new Companion();
        f = new EnumType("CheckoutSummaryValueType", CollectionsKt.R("Total", "Plain", "Point", "Negative", "Bold"));
    }

    public CheckoutSummaryValueType(String str, int i2, String str2) {
        this.d = str2;
    }

    public static CheckoutSummaryValueType valueOf(String str) {
        return (CheckoutSummaryValueType) Enum.valueOf(CheckoutSummaryValueType.class, str);
    }

    public static CheckoutSummaryValueType[] values() {
        return (CheckoutSummaryValueType[]) h.clone();
    }
}
