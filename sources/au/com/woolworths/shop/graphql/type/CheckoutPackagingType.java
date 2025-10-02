package au.com.woolworths.shop.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CheckoutPackagingType;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckoutPackagingType {
    public static final Companion e;
    public static final CheckoutPackagingType f;
    public static final /* synthetic */ CheckoutPackagingType[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CheckoutPackagingType$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        CheckoutPackagingType checkoutPackagingType = new CheckoutPackagingType("ReusableBags", 0, "ReusableBags");
        CheckoutPackagingType checkoutPackagingType2 = new CheckoutPackagingType("PaperBags", 1, "PaperBags");
        CheckoutPackagingType checkoutPackagingType3 = new CheckoutPackagingType("BYOBags", 2, "BYOBags");
        CheckoutPackagingType checkoutPackagingType4 = new CheckoutPackagingType("UNKNOWN__", 3, "UNKNOWN__");
        f = checkoutPackagingType4;
        CheckoutPackagingType[] checkoutPackagingTypeArr = {checkoutPackagingType, checkoutPackagingType2, checkoutPackagingType3, checkoutPackagingType4};
        g = checkoutPackagingTypeArr;
        h = EnumEntriesKt.a(checkoutPackagingTypeArr);
        e = new Companion();
        CollectionsKt.R("ReusableBags", "PaperBags", "BYOBags");
    }

    public CheckoutPackagingType(String str, int i, String str2) {
        this.d = str2;
    }

    public static CheckoutPackagingType valueOf(String str) {
        return (CheckoutPackagingType) Enum.valueOf(CheckoutPackagingType.class, str);
    }

    public static CheckoutPackagingType[] values() {
        return (CheckoutPackagingType[]) g.clone();
    }
}
