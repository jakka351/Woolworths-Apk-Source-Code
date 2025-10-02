package au.com.woolworths.shop.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CheckoutBadgeType;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckoutBadgeType {
    public static final Companion e;
    public static final CheckoutBadgeType f;
    public static final /* synthetic */ CheckoutBadgeType[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CheckoutBadgeType$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        CheckoutBadgeType checkoutBadgeType = new CheckoutBadgeType("Status", 0, "Status");
        CheckoutBadgeType checkoutBadgeType2 = new CheckoutBadgeType("Restriction", 1, "Restriction");
        CheckoutBadgeType checkoutBadgeType3 = new CheckoutBadgeType("UNKNOWN__", 2, "UNKNOWN__");
        f = checkoutBadgeType3;
        CheckoutBadgeType[] checkoutBadgeTypeArr = {checkoutBadgeType, checkoutBadgeType2, checkoutBadgeType3};
        g = checkoutBadgeTypeArr;
        h = EnumEntriesKt.a(checkoutBadgeTypeArr);
        e = new Companion();
        CollectionsKt.R("Status", "Restriction");
    }

    public CheckoutBadgeType(String str, int i, String str2) {
        this.d = str2;
    }

    public static CheckoutBadgeType valueOf(String str) {
        return (CheckoutBadgeType) Enum.valueOf(CheckoutBadgeType.class, str);
    }

    public static CheckoutBadgeType[] values() {
        return (CheckoutBadgeType[]) g.clone();
    }
}
