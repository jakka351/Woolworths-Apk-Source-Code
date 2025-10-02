package au.com.woolworths.shop.cart.analytics;

import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/analytics/CartScreens;", "Lau/com/woolworths/android/onesite/analytics/Screen;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class CartScreens implements Screen {
    public static final CartScreens d;
    public static final CartScreens e;
    public static final /* synthetic */ CartScreens[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        CartScreens cartScreens = new CartScreens() { // from class: au.com.woolworths.shop.cart.analytics.CartScreens.CART
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Checkout";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Cart screen";
            }
        };
        d = cartScreens;
        CartScreens cartScreens2 = new CartScreens() { // from class: au.com.woolworths.shop.cart.analytics.CartScreens.PRODUCT_REVIEW
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Checkout";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Product Review screen";
            }
        };
        e = cartScreens2;
        CartScreens[] cartScreensArr = {cartScreens, cartScreens2};
        f = cartScreensArr;
        g = EnumEntriesKt.a(cartScreensArr);
    }

    public static CartScreens valueOf(String str) {
        return (CartScreens) Enum.valueOf(CartScreens.class, str);
    }

    public static CartScreens[] values() {
        return (CartScreens[]) f.clone();
    }
}
