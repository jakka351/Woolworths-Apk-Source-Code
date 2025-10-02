package au.com.woolworths.shop.cart.ui.shared;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/shared/FooterSource;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FooterSource {
    public static final FooterSource d;
    public static final FooterSource e;
    public static final /* synthetic */ FooterSource[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        FooterSource footerSource = new FooterSource("CART", 0);
        d = footerSource;
        FooterSource footerSource2 = new FooterSource("HYF", 1);
        e = footerSource2;
        FooterSource[] footerSourceArr = {footerSource, footerSource2};
        f = footerSourceArr;
        g = EnumEntriesKt.a(footerSourceArr);
    }

    public static FooterSource valueOf(String str) {
        return (FooterSource) Enum.valueOf(FooterSource.class, str);
    }

    public static FooterSource[] values() {
        return (FooterSource[]) f.clone();
    }
}
