package au.com.woolworths.base.shopapp;

import au.com.woolworths.android.onesite.featuretoggles.Feature;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/base/shopapp/BaseShopAppFeature;", "Lau/com/woolworths/android/onesite/featuretoggles/Feature;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class BaseShopAppFeature implements Feature {
    public static final BaseShopAppFeature A;
    public static final BaseShopAppFeature B;
    public static final BaseShopAppFeature C;
    public static final BaseShopAppFeature D;
    public static final BaseShopAppFeature E;
    public static final BaseShopAppFeature F;
    public static final BaseShopAppFeature G;
    public static final BaseShopAppFeature H;
    public static final BaseShopAppFeature I;
    public static final BaseShopAppFeature J;
    public static final BaseShopAppFeature K;
    public static final BaseShopAppFeature L;
    public static final BaseShopAppFeature M;
    public static final BaseShopAppFeature N;
    public static final BaseShopAppFeature O;
    public static final BaseShopAppFeature P;
    public static final BaseShopAppFeature Q;
    public static final BaseShopAppFeature R;
    public static final BaseShopAppFeature S;
    public static final BaseShopAppFeature T;
    public static final BaseShopAppFeature U;
    public static final BaseShopAppFeature V;
    public static final BaseShopAppFeature W;
    public static final BaseShopAppFeature X;
    public static final BaseShopAppFeature Y;
    public static final BaseShopAppFeature Z;
    public static final BaseShopAppFeature a0;
    public static final BaseShopAppFeature b0;
    public static final BaseShopAppFeature c0;
    public static final BaseShopAppFeature d;
    public static final BaseShopAppFeature d0;
    public static final BaseShopAppFeature e;
    public static final BaseShopAppFeature e0;
    public static final BaseShopAppFeature f;
    public static final BaseShopAppFeature f0;
    public static final BaseShopAppFeature g;
    public static final BaseShopAppFeature g0;
    public static final BaseShopAppFeature h;
    public static final BaseShopAppFeature h0;
    public static final BaseShopAppFeature i;
    public static final BaseShopAppFeature i0;
    public static final BaseShopAppFeature j;
    public static final BaseShopAppFeature j0;
    public static final BaseShopAppFeature k;
    public static final BaseShopAppFeature k0;
    public static final BaseShopAppFeature l;
    public static final BaseShopAppFeature l0;
    public static final BaseShopAppFeature m;
    public static final BaseShopAppFeature m0;
    public static final BaseShopAppFeature n;
    public static final BaseShopAppFeature n0;
    public static final BaseShopAppFeature o;
    public static final BaseShopAppFeature o0;
    public static final BaseShopAppFeature p;
    public static final BaseShopAppFeature p0;
    public static final BaseShopAppFeature q;
    public static final BaseShopAppFeature q0;
    public static final BaseShopAppFeature r;
    public static final BaseShopAppFeature r0;
    public static final BaseShopAppFeature s;
    public static final BaseShopAppFeature s0;
    public static final BaseShopAppFeature t;
    public static final BaseShopAppFeature t0;
    public static final BaseShopAppFeature u;
    public static final BaseShopAppFeature u0;
    public static final BaseShopAppFeature v;
    public static final BaseShopAppFeature v0;
    public static final BaseShopAppFeature w;
    public static final /* synthetic */ BaseShopAppFeature[] w0;
    public static final BaseShopAppFeature x;
    public static final /* synthetic */ EnumEntries x0;
    public static final BaseShopAppFeature y;
    public static final BaseShopAppFeature z;

    static {
        BaseShopAppFeature baseShopAppFeature = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.ASYNC_MESSAGING_PROMOTION
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_async_messaging_promotion";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        d = baseShopAppFeature;
        BaseShopAppFeature baseShopAppFeature2 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.BUNDLES
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_bundles";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        e = baseShopAppFeature2;
        BaseShopAppFeature baseShopAppFeature3 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.BUNDLES_QUANTITY
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_bundles_quantity";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        f = baseShopAppFeature3;
        BaseShopAppFeature baseShopAppFeature4 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.CAMPAIGN_ANIMATION
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_campaign_animation";
            }
        };
        g = baseShopAppFeature4;
        BaseShopAppFeature baseShopAppFeature5 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.CHECK_OTHER_STORES_BUTTON
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_check_nearby_stores";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        h = baseShopAppFeature5;
        BaseShopAppFeature baseShopAppFeature6 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.CHECKOUT_ADAPT_CHECKOUT_FOOTER
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_adapt_checkout_footer";
            }
        };
        i = baseShopAppFeature6;
        BaseShopAppFeature baseShopAppFeature7 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.CHECKOUT_TIME_SELECTION_UPLIFT
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_checkout_time_selection_uplift";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        j = baseShopAppFeature7;
        BaseShopAppFeature baseShopAppFeature8 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.CONSOLIDATED_SPECIALS
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_consolidated_specials";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        k = baseShopAppFeature8;
        BaseShopAppFeature baseShopAppFeature9 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.CONTENT_PAGE_CORE_BUTTON_SECTION_COMPONENT
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_content_page_core_button_section_component";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        l = baseShopAppFeature9;
        BaseShopAppFeature baseShopAppFeature10 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.CONTENT_PAGE_INFO_TILE_COMPONENT
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_content_page_info_tile_component";
            }
        };
        m = baseShopAppFeature10;
        BaseShopAppFeature baseShopAppFeature11 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.DELIVERY_ADDRESS_API_MIGRATION
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_delivery_address_api_migration";
            }
        };
        n = baseShopAppFeature11;
        BaseShopAppFeature baseShopAppFeature12 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.DELIVERY_UNLIMITED_WPAY_INTEGRATION
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_delivery_unlimited_wpay";
            }
        };
        o = baseShopAppFeature12;
        BaseShopAppFeature baseShopAppFeature13 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.EVERYDAY_MARKET_FREIGHT_RE_PLATFORM
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean b() {
                return true;
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_everyday_market_freight_re_platform";
            }
        };
        p = baseShopAppFeature13;
        BaseShopAppFeature baseShopAppFeature14 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.EVERYDAY_MARKET_PDP_UPLIFT
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_everyday_market_pdp_uplift";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        q = baseShopAppFeature14;
        BaseShopAppFeature baseShopAppFeature15 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.EVERYDAY_MARKET_SHIPPING_CALCULATOR
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_everyday_market_shipping_calculator";
            }
        };
        r = baseShopAppFeature15;
        BaseShopAppFeature baseShopAppFeature16 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.GUEST_MODE_SPEECH_BUBBLE_ENTRY_POINT
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_guest_mode_speech_bubble_entry_point";
            }
        };
        s = baseShopAppFeature16;
        BaseShopAppFeature baseShopAppFeature17 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.INSTORE_CART
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_instore_cart";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        t = baseShopAppFeature17;
        BaseShopAppFeature baseShopAppFeature18 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.INSTORE_NAVIGATION_INIT_ON_APP_LAUNCH
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_maps_init_on_app_launch";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        u = baseShopAppFeature18;
        BaseShopAppFeature baseShopAppFeature19 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.LISTS_SPECIALS_WATCHLIST
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_specials_watchlist";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        v = baseShopAppFeature19;
        BaseShopAppFeature baseShopAppFeature20 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.LOWER_PRICE_PROMOTION_STYLE
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_lower_price_promotion_styling";
            }
        };
        w = baseShopAppFeature20;
        BaseShopAppFeature baseShopAppFeature21 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.MERCHANT_PROFILE_BYPASS
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean b() {
                return true;
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_merchant_profile_bypass_enabled";
            }
        };
        x = baseShopAppFeature21;
        BaseShopAppFeature baseShopAppFeature22 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.MINIMUM_INCREMENT_PRICING
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_minimum_increment_pricing";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        y = baseShopAppFeature22;
        BaseShopAppFeature baseShopAppFeature23 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.MORE_MENU_UPLIFT
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_tt_more_menu_uplift";
            }
        };
        z = baseShopAppFeature23;
        BaseShopAppFeature baseShopAppFeature24 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.NATIVE_BARCODE_SCANNER_COMPENSATE_UPC_A
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_native_barcode_scanner_compensate_upc_a";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        A = baseShopAppFeature24;
        BaseShopAppFeature baseShopAppFeature25 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.NATIVE_SCANANDGO_BARCODE_SCANNER
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_native_scanandgo_barcode_scanner";
            }
        };
        B = baseShopAppFeature25;
        BaseShopAppFeature baseShopAppFeature26 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.NZ_COACH_MARKS
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_nz_coach_marks";
            }
        };
        BaseShopAppFeature baseShopAppFeature27 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.ONBOARDING_UPLIFT
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_onboarding_uplift";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        C = baseShopAppFeature27;
        BaseShopAppFeature baseShopAppFeature28 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.PAST_SHOP_APP_LINK
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_past_shop_app_link";
            }
        };
        D = baseShopAppFeature28;
        BaseShopAppFeature baseShopAppFeature29 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.PRODUCT_CAROUSEL_LAZY_LOADING
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_product_carousel_lazy_loading";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        E = baseShopAppFeature29;
        BaseShopAppFeature baseShopAppFeature30 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.PRODUCT_DETAILS_ACTIONABLE_CARD
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_product_details_actionable_card";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        F = baseShopAppFeature30;
        BaseShopAppFeature baseShopAppFeature31 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.PRODUCT_DETAILS_UPLIFT
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_product_details_uplift";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        G = baseShopAppFeature31;
        BaseShopAppFeature baseShopAppFeature32 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.PRODUCT_DETAILS_WATCHLIST
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_product_details_watchlist";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        H = baseShopAppFeature32;
        BaseShopAppFeature baseShopAppFeature33 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.PRODUCT_LIST_COMPOSE_PLUS_PAGINATION_UPLIFT
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_product_list_compose_plus_pagination_uplift";
            }
        };
        I = baseShopAppFeature33;
        BaseShopAppFeature baseShopAppFeature34 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.PRODUCT_LIST_COMPOSE_UPLIFT
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_product_list_compose_uplift";
            }
        };
        J = baseShopAppFeature34;
        BaseShopAppFeature baseShopAppFeature35 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.PRODUCT_LIST_PERSISTENT_CHIP
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_product_list_persistent_chip";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        K = baseShopAppFeature35;
        BaseShopAppFeature baseShopAppFeature36 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.PRODUCT_LIST_PERSISTENT_CHIP_NZ
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_product_list_persistent_chip_nz";
            }
        };
        L = baseShopAppFeature36;
        BaseShopAppFeature baseShopAppFeature37 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.PRODUCT_LIST_VIDEO_AD_UNIT
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_product_list_video_ad_unit";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        M = baseShopAppFeature37;
        BaseShopAppFeature baseShopAppFeature38 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.PRODUCT_RATINGS_AND_REVIEWS
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_product_ratings_and_reviews";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        N = baseShopAppFeature38;
        BaseShopAppFeature baseShopAppFeature39 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.PRODUCT_TILE_UPLIFT
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_product_tile_uplift";
            }
        };
        O = baseShopAppFeature39;
        BaseShopAppFeature baseShopAppFeature40 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.PRODUCT_WRITE_REVIEWS
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_product_write_reviews";
            }
        };
        P = baseShopAppFeature40;
        BaseShopAppFeature baseShopAppFeature41 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.PROMOTIONS_DEEPLINK
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_promotions_deeplink";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        BaseShopAppFeature baseShopAppFeature42 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.REWARDS_ACTIVITY_COMPOSE
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_rewards_activity_compose";
            }
        };
        Q = baseShopAppFeature42;
        BaseShopAppFeature baseShopAppFeature43 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.REWARDS_ADD_PRIMING_MEMBER_PRICING
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean b() {
                return true;
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_rewards_card_priming_member_pricing";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        R = baseShopAppFeature43;
        BaseShopAppFeature baseShopAppFeature44 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.REWARDS_OFFER_DETAILS_REFACTOR
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_offer_details_refactor";
            }
        };
        S = baseShopAppFeature44;
        BaseShopAppFeature baseShopAppFeature45 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.REWARDS_SETTINGS
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_rewards_settings";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        BaseShopAppFeature baseShopAppFeature46 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.SAVED_RECIPES_CONTENT_PAGE_MIGRATION
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_saved_recipes_content_page_migration";
            }
        };
        T = baseShopAppFeature46;
        BaseShopAppFeature baseShopAppFeature47 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.SCANANDGO_SCAN_UPLIFT
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean b() {
                return true;
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_scanandgo_scan_uplift";
            }
        };
        U = baseShopAppFeature47;
        BaseShopAppFeature baseShopAppFeature48 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.SCANDIT_BARCODE_SCANNER
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_scandit_barcode_scanner";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        V = baseShopAppFeature48;
        BaseShopAppFeature baseShopAppFeature49 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.SEARCH_CMO_PERSISTENT_BANNER
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_search_cmo_persistent_banner";
            }
        };
        W = baseShopAppFeature49;
        BaseShopAppFeature baseShopAppFeature50 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.SERVICE_FEES
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_service_fees";
            }
        };
        X = baseShopAppFeature50;
        BaseShopAppFeature baseShopAppFeature51 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.SHOP_APP_UPGRADE_UPLIFT
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_shop_app_upgrade_uplift";
            }
        };
        Y = baseShopAppFeature51;
        BaseShopAppFeature baseShopAppFeature52 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.SPECIALS_CONTENT_PAGE
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_specials_content_page";
            }
        };
        Z = baseShopAppFeature52;
        BaseShopAppFeature baseShopAppFeature53 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.SPECIALS_HOME_BASKET_BUILDER
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_specials_home_basket_builder";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        a0 = baseShopAppFeature53;
        BaseShopAppFeature baseShopAppFeature54 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.STORE_SELECTOR_GRAPHQL_MIGRATION
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_store_selector_graphql_migration";
            }
        };
        b0 = baseShopAppFeature54;
        BaseShopAppFeature baseShopAppFeature55 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.TRANS_TASMAN_UPLIFT
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_trans_tasman_uplift";
            }
        };
        c0 = baseShopAppFeature55;
        BaseShopAppFeature baseShopAppFeature56 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.TROLLEY_APIGEE_MIGRATION
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_trolley_apigee_migration";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        d0 = baseShopAppFeature56;
        BaseShopAppFeature baseShopAppFeature57 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.TROLLEY_DELIVERY_FEE_REMOVAL
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_trolley_delivery_fee_removal";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        BaseShopAppFeature baseShopAppFeature58 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.UNIT_PRICE_INSET_BANNER
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_unit_price_inset_banner";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        e0 = baseShopAppFeature58;
        BaseShopAppFeature baseShopAppFeature59 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.UNIVERSAL_LINK_RESOLVER
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_universal_link_resolver";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        f0 = baseShopAppFeature59;
        BaseShopAppFeature baseShopAppFeature60 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.VIDEO_TAG_ON_RECIPE_CARD
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_recipe_summary_card_video_tag";
            }
        };
        g0 = baseShopAppFeature60;
        BaseShopAppFeature baseShopAppFeature61 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.VOICE_PRODUCT_SEARCH
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_voice_product_search";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        h0 = baseShopAppFeature61;
        BaseShopAppFeature baseShopAppFeature62 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.VOICE_PRODUCT_SEARCH_DEEPLINK
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_voice_product_search_deeplink";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        i0 = baseShopAppFeature62;
        BaseShopAppFeature baseShopAppFeature63 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.VOICE_PRODUCT_SEARCH_SPECIALS
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_voice_product_search_specials";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        j0 = baseShopAppFeature63;
        BaseShopAppFeature baseShopAppFeature64 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.VOICE_SEARCH_FEEDBACK
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_voice_search_feedback";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        k0 = baseShopAppFeature64;
        BaseShopAppFeature baseShopAppFeature65 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.ZERO_RESULT_PAGE
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_product_list_new_zero_results";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        l0 = baseShopAppFeature65;
        BaseShopAppFeature baseShopAppFeature66 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.NUTRITION_INFO
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_nutrition_info";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        m0 = baseShopAppFeature66;
        BaseShopAppFeature baseShopAppFeature67 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.PAST_SHOP_ACTIONABLE_CARD
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_past_shop_actionable_card";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        n0 = baseShopAppFeature67;
        BaseShopAppFeature baseShopAppFeature68 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.PRODUCT_FILTER_UPLIFT
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean b() {
                return true;
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_product_filter_uplift";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        o0 = baseShopAppFeature68;
        BaseShopAppFeature baseShopAppFeature69 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.PRODUCT_FINDER_PRODUCT_CARD_COMPOSE_UPLIFT
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_product_finder_product_card_compose_uplift";
            }
        };
        p0 = baseShopAppFeature69;
        BaseShopAppFeature baseShopAppFeature70 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.PRODUCT_LIST_MERCH_CARD
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_product_list_merch_card";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        q0 = baseShopAppFeature70;
        BaseShopAppFeature baseShopAppFeature71 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.PRODUCT_LIST_NHP_EDR_BANNER
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_product_list_nhp_edr_banner";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        r0 = baseShopAppFeature71;
        BaseShopAppFeature baseShopAppFeature72 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.PRODUCT_LIST_NHP_PERSONALISED_PRODUCTS_BANNER
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_product_list_nhp_personalised_products_banner";
            }
        };
        s0 = baseShopAppFeature72;
        BaseShopAppFeature baseShopAppFeature73 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.PRODUCT_SOURCE_SPECIALS
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_product_source_specials";
            }

            @Override // au.com.woolworths.base.shopapp.BaseShopAppFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        BaseShopAppFeature baseShopAppFeature74 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.PRODUCT_VARIETIES_BOOST_ALL_BANNER
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_product_varieties_boost_all_banner";
            }
        };
        t0 = baseShopAppFeature74;
        BaseShopAppFeature baseShopAppFeature75 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.OLIVE_MYORDERS_AUTO_START
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_olive_myorders_auto_start";
            }
        };
        u0 = baseShopAppFeature75;
        BaseShopAppFeature baseShopAppFeature76 = new BaseShopAppFeature() { // from class: au.com.woolworths.base.shopapp.BaseShopAppFeature.SDUI_DATA_SOURCE_FDC
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_sdui_data_source_fdc";
            }
        };
        v0 = baseShopAppFeature76;
        BaseShopAppFeature[] baseShopAppFeatureArr = {baseShopAppFeature, baseShopAppFeature2, baseShopAppFeature3, baseShopAppFeature4, baseShopAppFeature5, baseShopAppFeature6, baseShopAppFeature7, baseShopAppFeature8, baseShopAppFeature9, baseShopAppFeature10, baseShopAppFeature11, baseShopAppFeature12, baseShopAppFeature13, baseShopAppFeature14, baseShopAppFeature15, baseShopAppFeature16, baseShopAppFeature17, baseShopAppFeature18, baseShopAppFeature19, baseShopAppFeature20, baseShopAppFeature21, baseShopAppFeature22, baseShopAppFeature23, baseShopAppFeature24, baseShopAppFeature25, baseShopAppFeature26, baseShopAppFeature27, baseShopAppFeature28, baseShopAppFeature29, baseShopAppFeature30, baseShopAppFeature31, baseShopAppFeature32, baseShopAppFeature33, baseShopAppFeature34, baseShopAppFeature35, baseShopAppFeature36, baseShopAppFeature37, baseShopAppFeature38, baseShopAppFeature39, baseShopAppFeature40, baseShopAppFeature41, baseShopAppFeature42, baseShopAppFeature43, baseShopAppFeature44, baseShopAppFeature45, baseShopAppFeature46, baseShopAppFeature47, baseShopAppFeature48, baseShopAppFeature49, baseShopAppFeature50, baseShopAppFeature51, baseShopAppFeature52, baseShopAppFeature53, baseShopAppFeature54, baseShopAppFeature55, baseShopAppFeature56, baseShopAppFeature57, baseShopAppFeature58, baseShopAppFeature59, baseShopAppFeature60, baseShopAppFeature61, baseShopAppFeature62, baseShopAppFeature63, baseShopAppFeature64, baseShopAppFeature65, baseShopAppFeature66, baseShopAppFeature67, baseShopAppFeature68, baseShopAppFeature69, baseShopAppFeature70, baseShopAppFeature71, baseShopAppFeature72, baseShopAppFeature73, baseShopAppFeature74, baseShopAppFeature75, baseShopAppFeature76};
        w0 = baseShopAppFeatureArr;
        x0 = EnumEntriesKt.a(baseShopAppFeatureArr);
    }

    public static BaseShopAppFeature valueOf(String str) {
        return (BaseShopAppFeature) Enum.valueOf(BaseShopAppFeature.class, str);
    }

    public static BaseShopAppFeature[] values() {
        return (BaseShopAppFeature[]) w0.clone();
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
