package au.com.woolworths.shop.buyagain;

import au.com.woolworths.android.onesite.featuretoggles.Feature;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/buyagain/ShopBuyAgainFeature;", "Lau/com/woolworths/android/onesite/featuretoggles/Feature;", "", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ShopBuyAgainFeature implements Feature {
    public static final ShopBuyAgainFeature d;
    public static final ShopBuyAgainFeature e;
    public static final /* synthetic */ ShopBuyAgainFeature[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        ShopBuyAgainFeature shopBuyAgainFeature = new ShopBuyAgainFeature() { // from class: au.com.woolworths.shop.buyagain.ShopBuyAgainFeature.BUY_AGAIN_INSTORE
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_instore_buy_again_search";
            }

            @Override // au.com.woolworths.shop.buyagain.ShopBuyAgainFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        d = shopBuyAgainFeature;
        ShopBuyAgainFeature shopBuyAgainFeature2 = new ShopBuyAgainFeature() { // from class: au.com.woolworths.shop.buyagain.ShopBuyAgainFeature.BUY_AGAIN_WATCHLIST
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_buy_again_watchlist";
            }

            @Override // au.com.woolworths.shop.buyagain.ShopBuyAgainFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        e = shopBuyAgainFeature2;
        ShopBuyAgainFeature[] shopBuyAgainFeatureArr = {shopBuyAgainFeature, shopBuyAgainFeature2};
        f = shopBuyAgainFeatureArr;
        g = EnumEntriesKt.a(shopBuyAgainFeatureArr);
    }

    public static ShopBuyAgainFeature valueOf(String str) {
        return (ShopBuyAgainFeature) Enum.valueOf(ShopBuyAgainFeature.class, str);
    }

    public static ShopBuyAgainFeature[] values() {
        return (ShopBuyAgainFeature[]) f.clone();
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
