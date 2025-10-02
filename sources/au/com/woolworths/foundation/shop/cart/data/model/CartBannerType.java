package au.com.woolworths.foundation.shop.cart.data.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/cart/data/model/CartBannerType;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CartBannerType {
    public static final CartBannerType d;
    public static final CartBannerType e;
    public static final CartBannerType f;
    public static final CartBannerType g;
    public static final /* synthetic */ CartBannerType[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        CartBannerType cartBannerType = new CartBannerType("STANDARD", 0);
        d = cartBannerType;
        CartBannerType cartBannerType2 = new CartBannerType("PRODUCT_REVIEW", 1);
        e = cartBannerType2;
        CartBannerType cartBannerType3 = new CartBannerType("FULFILMENT_WINDOW", 2);
        f = cartBannerType3;
        CartBannerType cartBannerType4 = new CartBannerType("UNKNOWN", 3);
        g = cartBannerType4;
        CartBannerType[] cartBannerTypeArr = {cartBannerType, cartBannerType2, cartBannerType3, cartBannerType4};
        h = cartBannerTypeArr;
        i = EnumEntriesKt.a(cartBannerTypeArr);
    }

    public static CartBannerType valueOf(String str) {
        return (CartBannerType) Enum.valueOf(CartBannerType.class, str);
    }

    public static CartBannerType[] values() {
        return (CartBannerType[]) h.clone();
    }
}
