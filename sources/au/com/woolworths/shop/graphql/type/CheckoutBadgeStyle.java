package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CheckoutBadgeStyle;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckoutBadgeStyle {
    public static final Companion e;
    public static final EnumType f;
    public static final CheckoutBadgeStyle g;
    public static final /* synthetic */ CheckoutBadgeStyle[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CheckoutBadgeStyle$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        CheckoutBadgeStyle checkoutBadgeStyle = new CheckoutBadgeStyle("PLAIN", 0, "PLAIN");
        CheckoutBadgeStyle checkoutBadgeStyle2 = new CheckoutBadgeStyle("PRIMARY", 1, "PRIMARY");
        CheckoutBadgeStyle checkoutBadgeStyle3 = new CheckoutBadgeStyle("PRIMARY_SOLID", 2, "PRIMARY_SOLID");
        CheckoutBadgeStyle checkoutBadgeStyle4 = new CheckoutBadgeStyle("UNKNOWN__", 3, "UNKNOWN__");
        g = checkoutBadgeStyle4;
        CheckoutBadgeStyle[] checkoutBadgeStyleArr = {checkoutBadgeStyle, checkoutBadgeStyle2, checkoutBadgeStyle3, checkoutBadgeStyle4};
        h = checkoutBadgeStyleArr;
        i = EnumEntriesKt.a(checkoutBadgeStyleArr);
        e = new Companion();
        f = new EnumType("CheckoutBadgeStyle", CollectionsKt.R("PLAIN", "PRIMARY", "PRIMARY_SOLID"));
    }

    public CheckoutBadgeStyle(String str, int i2, String str2) {
        this.d = str2;
    }

    public static CheckoutBadgeStyle valueOf(String str) {
        return (CheckoutBadgeStyle) Enum.valueOf(CheckoutBadgeStyle.class, str);
    }

    public static CheckoutBadgeStyle[] values() {
        return (CheckoutBadgeStyle[]) h.clone();
    }
}
