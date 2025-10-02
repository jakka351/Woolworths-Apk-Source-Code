package au.com.woolworths.rewards.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/CheckoutDetailsFormItemType;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckoutDetailsFormItemType {
    public static final Companion e;
    public static final CheckoutDetailsFormItemType f;
    public static final /* synthetic */ CheckoutDetailsFormItemType[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/CheckoutDetailsFormItemType$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        CheckoutDetailsFormItemType checkoutDetailsFormItemType = new CheckoutDetailsFormItemType("STREET_ADDRESS1", 0, "STREET_ADDRESS1");
        CheckoutDetailsFormItemType checkoutDetailsFormItemType2 = new CheckoutDetailsFormItemType("STREET_ADDRESS2", 1, "STREET_ADDRESS2");
        CheckoutDetailsFormItemType checkoutDetailsFormItemType3 = new CheckoutDetailsFormItemType("SUBURB", 2, "SUBURB");
        CheckoutDetailsFormItemType checkoutDetailsFormItemType4 = new CheckoutDetailsFormItemType("POSTCODE", 3, "POSTCODE");
        CheckoutDetailsFormItemType checkoutDetailsFormItemType5 = new CheckoutDetailsFormItemType("ADDRESS_TEXT", 4, "ADDRESS_TEXT");
        CheckoutDetailsFormItemType checkoutDetailsFormItemType6 = new CheckoutDetailsFormItemType("NAME", 5, "NAME");
        CheckoutDetailsFormItemType checkoutDetailsFormItemType7 = new CheckoutDetailsFormItemType("UNKNOWN__", 6, "UNKNOWN__");
        f = checkoutDetailsFormItemType7;
        CheckoutDetailsFormItemType[] checkoutDetailsFormItemTypeArr = {checkoutDetailsFormItemType, checkoutDetailsFormItemType2, checkoutDetailsFormItemType3, checkoutDetailsFormItemType4, checkoutDetailsFormItemType5, checkoutDetailsFormItemType6, checkoutDetailsFormItemType7};
        g = checkoutDetailsFormItemTypeArr;
        h = EnumEntriesKt.a(checkoutDetailsFormItemTypeArr);
        e = new Companion();
        CollectionsKt.R("STREET_ADDRESS1", "STREET_ADDRESS2", "SUBURB", "POSTCODE", "ADDRESS_TEXT", "NAME");
    }

    public CheckoutDetailsFormItemType(String str, int i, String str2) {
        this.d = str2;
    }

    public static CheckoutDetailsFormItemType valueOf(String str) {
        return (CheckoutDetailsFormItemType) Enum.valueOf(CheckoutDetailsFormItemType.class, str);
    }

    public static CheckoutDetailsFormItemType[] values() {
        return (CheckoutDetailsFormItemType[]) g.clone();
    }
}
