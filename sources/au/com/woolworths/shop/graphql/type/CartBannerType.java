package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CartBannerType;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CartBannerType {
    public static final Companion e;
    public static final EnumType f;
    public static final CartBannerType g;
    public static final /* synthetic */ CartBannerType[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CartBannerType$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        CartBannerType cartBannerType = new CartBannerType("STANDARD", 0, "STANDARD");
        CartBannerType cartBannerType2 = new CartBannerType("PRODUCT_REVIEW", 1, "PRODUCT_REVIEW");
        CartBannerType cartBannerType3 = new CartBannerType("FULFILMENT_WINDOW", 2, "FULFILMENT_WINDOW");
        CartBannerType cartBannerType4 = new CartBannerType("UNKNOWN__", 3, "UNKNOWN__");
        g = cartBannerType4;
        CartBannerType[] cartBannerTypeArr = {cartBannerType, cartBannerType2, cartBannerType3, cartBannerType4};
        h = cartBannerTypeArr;
        i = EnumEntriesKt.a(cartBannerTypeArr);
        e = new Companion();
        f = new EnumType("CartBannerType", CollectionsKt.R("STANDARD", "PRODUCT_REVIEW", "FULFILMENT_WINDOW"));
    }

    public CartBannerType(String str, int i2, String str2) {
        this.d = str2;
    }

    public static CartBannerType valueOf(String str) {
        return (CartBannerType) Enum.valueOf(CartBannerType.class, str);
    }

    public static CartBannerType[] values() {
        return (CartBannerType[]) h.clone();
    }
}
