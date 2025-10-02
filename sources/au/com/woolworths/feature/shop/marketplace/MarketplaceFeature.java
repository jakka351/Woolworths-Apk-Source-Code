package au.com.woolworths.feature.shop.marketplace;

import au.com.woolworths.android.onesite.featuretoggles.Feature;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/MarketplaceFeature;", "Lau/com/woolworths/android/onesite/featuretoggles/Feature;", "", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class MarketplaceFeature implements Feature {
    public static final MarketplaceFeature d;
    public static final MarketplaceFeature e;
    public static final MarketplaceFeature f;
    public static final /* synthetic */ MarketplaceFeature[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        MarketplaceFeature marketplaceFeature = new MarketplaceFeature() { // from class: au.com.woolworths.feature.shop.marketplace.MarketplaceFeature.MARKETPLACE_BRANDS_SELLERS_COMPOSE
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean b() {
                return true;
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_marketplace_brands_sellers_compose";
            }

            @Override // au.com.woolworths.feature.shop.marketplace.MarketplaceFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        d = marketplaceFeature;
        MarketplaceFeature marketplaceFeature2 = new MarketplaceFeature() { // from class: au.com.woolworths.feature.shop.marketplace.MarketplaceFeature.MARKETPLACE_CATEGORIES_COMPOSE
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean b() {
                return true;
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_marketplace_categories_compose";
            }

            @Override // au.com.woolworths.feature.shop.marketplace.MarketplaceFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        e = marketplaceFeature2;
        MarketplaceFeature marketplaceFeature3 = new MarketplaceFeature() { // from class: au.com.woolworths.feature.shop.marketplace.MarketplaceFeature.MARKETPLACE_FOR_YOU_COMPOSE
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean b() {
                return true;
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_marketplace_for_you_compose";
            }

            @Override // au.com.woolworths.feature.shop.marketplace.MarketplaceFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        f = marketplaceFeature3;
        MarketplaceFeature[] marketplaceFeatureArr = {marketplaceFeature, marketplaceFeature2, marketplaceFeature3};
        g = marketplaceFeatureArr;
        h = EnumEntriesKt.a(marketplaceFeatureArr);
    }

    public static MarketplaceFeature valueOf(String str) {
        return (MarketplaceFeature) Enum.valueOf(MarketplaceFeature.class, str);
    }

    public static MarketplaceFeature[] values() {
        return (MarketplaceFeature[]) g.clone();
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
