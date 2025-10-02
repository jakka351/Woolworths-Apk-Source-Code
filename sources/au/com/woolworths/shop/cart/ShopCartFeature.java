package au.com.woolworths.shop.cart;

import au.com.woolworths.android.onesite.featuretoggles.Feature;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/ShopCartFeature;", "Lau/com/woolworths/android/onesite/featuretoggles/Feature;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ShopCartFeature implements Feature {
    public static final ShopCartFeature d;
    public static final ShopCartFeature e;
    public static final ShopCartFeature f;
    public static final ShopCartFeature g;
    public static final ShopCartFeature h;
    public static final ShopCartFeature i;
    public static final /* synthetic */ ShopCartFeature[] j;
    public static final /* synthetic */ EnumEntries k;

    static {
        ShopCartFeature shopCartFeature = new ShopCartFeature() { // from class: au.com.woolworths.shop.cart.ShopCartFeature.CART_ADAPT_CART_FOOTER
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_adapt_cart_footer";
            }
        };
        d = shopCartFeature;
        ShopCartFeature shopCartFeature2 = new ShopCartFeature() { // from class: au.com.woolworths.shop.cart.ShopCartFeature.CART_BUNDLES
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_cart_bundles";
            }

            @Override // au.com.woolworths.shop.cart.ShopCartFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        e = shopCartFeature2;
        ShopCartFeature shopCartFeature3 = new ShopCartFeature() { // from class: au.com.woolworths.shop.cart.ShopCartFeature.CART_LOADER_UPLIFT
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_cart_loader_uplift";
            }
        };
        f = shopCartFeature3;
        ShopCartFeature shopCartFeature4 = new ShopCartFeature() { // from class: au.com.woolworths.shop.cart.ShopCartFeature.CART_ORDER_SUMMARY
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_cart_order_summary";
            }
        };
        ShopCartFeature shopCartFeature5 = new ShopCartFeature() { // from class: au.com.woolworths.shop.cart.ShopCartFeature.CART_PRODUCT_SAVING
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean b() {
                return true;
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_cart_product_saving";
            }
        };
        g = shopCartFeature5;
        ShopCartFeature shopCartFeature6 = new ShopCartFeature() { // from class: au.com.woolworths.shop.cart.ShopCartFeature.CART_PROMPT_UPLIFT
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_cart_prompt_uplift";
            }
        };
        h = shopCartFeature6;
        ShopCartFeature shopCartFeature7 = new ShopCartFeature() { // from class: au.com.woolworths.shop.cart.ShopCartFeature.CART_QUICK_ADD
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_cart_quick_add";
            }
        };
        i = shopCartFeature7;
        ShopCartFeature[] shopCartFeatureArr = {shopCartFeature, shopCartFeature2, shopCartFeature3, shopCartFeature4, shopCartFeature5, shopCartFeature6, shopCartFeature7};
        j = shopCartFeatureArr;
        k = EnumEntriesKt.a(shopCartFeatureArr);
    }

    public static ShopCartFeature valueOf(String str) {
        return (ShopCartFeature) Enum.valueOf(ShopCartFeature.class, str);
    }

    public static ShopCartFeature[] values() {
        return (ShopCartFeature[]) j.clone();
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
    public final String a() {
        return "";
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
    public boolean getDefaultValue() {
        return false;
    }
}
