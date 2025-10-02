package au.com.woolworths.feature.shop.homepage;

import au.com.woolworths.android.onesite.featuretoggles.Feature;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/HomeFeature;", "Lau/com/woolworths/android/onesite/featuretoggles/Feature;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class HomeFeature implements Feature {
    public static final HomeFeature d;
    public static final HomeFeature e;
    public static final HomeFeature f;
    public static final HomeFeature g;
    public static final HomeFeature h;
    public static final HomeFeature i;
    public static final HomeFeature j;
    public static final /* synthetic */ HomeFeature[] k;
    public static final /* synthetic */ EnumEntries l;

    static {
        HomeFeature homeFeature = new HomeFeature() { // from class: au.com.woolworths.feature.shop.homepage.HomeFeature.HOMEPAGE_BROADCAST_BANNER
            @Override // au.com.woolworths.feature.shop.homepage.HomeFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String a() {
                return "BROADCAST_BANNER";
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean b() {
                return true;
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_home_generic_banner";
            }

            @Override // au.com.woolworths.feature.shop.homepage.HomeFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        d = homeFeature;
        HomeFeature homeFeature2 = new HomeFeature() { // from class: au.com.woolworths.feature.shop.homepage.HomeFeature.HOMEPAGE_MIGRATE_WITH_CONTENT_PAGE
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean b() {
                return true;
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_homepage_migrate_with_content_page";
            }

            @Override // au.com.woolworths.feature.shop.homepage.HomeFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        e = homeFeature2;
        HomeFeature homeFeature3 = new HomeFeature() { // from class: au.com.woolworths.feature.shop.homepage.HomeFeature.HOMEPAGE_PRODUCT_CARD_CAROUSEL_COMPOSE
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_homepage_product_card_carousel_compose";
            }
        };
        f = homeFeature3;
        HomeFeature homeFeature4 = new HomeFeature() { // from class: au.com.woolworths.feature.shop.homepage.HomeFeature.HOMEPAGE_PRODUCT_CARD_CAROUSEL_COMPOSE_DIFF
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_homepage_product_card_carousel_compose_diff";
            }
        };
        g = homeFeature4;
        HomeFeature homeFeature5 = new HomeFeature() { // from class: au.com.woolworths.feature.shop.homepage.HomeFeature.HOMEPAGE_VIDEO_AD_UNIT
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_homepage_video_ad_unit";
            }

            @Override // au.com.woolworths.feature.shop.homepage.HomeFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        h = homeFeature5;
        HomeFeature homeFeature6 = new HomeFeature() { // from class: au.com.woolworths.feature.shop.homepage.HomeFeature.HOMEPAGE_WATCHLIST
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_homepage_watchlist";
            }

            @Override // au.com.woolworths.feature.shop.homepage.HomeFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        i = homeFeature6;
        HomeFeature homeFeature7 = new HomeFeature() { // from class: au.com.woolworths.feature.shop.homepage.HomeFeature.HOMEPAGE_BASKET_BUILDER
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_homepage_basket_builder";
            }

            @Override // au.com.woolworths.feature.shop.homepage.HomeFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        j = homeFeature7;
        HomeFeature[] homeFeatureArr = {homeFeature, homeFeature2, homeFeature3, homeFeature4, homeFeature5, homeFeature6, homeFeature7};
        k = homeFeatureArr;
        l = EnumEntriesKt.a(homeFeatureArr);
    }

    public static HomeFeature valueOf(String str) {
        return (HomeFeature) Enum.valueOf(HomeFeature.class, str);
    }

    public static HomeFeature[] values() {
        return (HomeFeature[]) k.clone();
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
    public String a() {
        return "";
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
    public boolean getDefaultValue() {
        return false;
    }
}
