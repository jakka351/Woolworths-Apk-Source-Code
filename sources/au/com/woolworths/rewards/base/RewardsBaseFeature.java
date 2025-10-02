package au.com.woolworths.rewards.base;

import au.com.woolworths.android.onesite.featuretoggles.Feature;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/base/RewardsBaseFeature;", "Lau/com/woolworths/android/onesite/featuretoggles/Feature;", "", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class RewardsBaseFeature implements Feature {
    public static final RewardsBaseFeature d;
    public static final RewardsBaseFeature e;
    public static final RewardsBaseFeature f;
    public static final RewardsBaseFeature g;
    public static final RewardsBaseFeature h;
    public static final RewardsBaseFeature i;
    public static final RewardsBaseFeature j;
    public static final RewardsBaseFeature k;
    public static final RewardsBaseFeature l;
    public static final RewardsBaseFeature m;
    public static final RewardsBaseFeature n;
    public static final RewardsBaseFeature o;
    public static final RewardsBaseFeature p;
    public static final RewardsBaseFeature q;
    public static final RewardsBaseFeature r;
    public static final RewardsBaseFeature s;
    public static final /* synthetic */ RewardsBaseFeature[] t;
    public static final /* synthetic */ EnumEntries u;

    static {
        RewardsBaseFeature rewardsBaseFeature = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.ACTIVITY_BREAK_DOWN
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_activity_break_down";
            }
        };
        RewardsBaseFeature rewardsBaseFeature2 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.AKAMAI_BOTMANAGER
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_rewards_akamai_botmanager";
            }
        };
        RewardsBaseFeature rewardsBaseFeature3 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.ALGOLIA_ANALYTICS
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_algolia_analytics";
            }

            @Override // au.com.woolworths.rewards.base.RewardsBaseFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        RewardsBaseFeature rewardsBaseFeature4 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.AUTO_VERIFY_REWARDS_LOGIN_OTP
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_auto_verify_rewards_login_otp";
            }

            @Override // au.com.woolworths.rewards.base.RewardsBaseFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        d = rewardsBaseFeature4;
        RewardsBaseFeature rewardsBaseFeature5 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.BANK_FOR_CHRISTMAS
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_rewards_bfc";
            }
        };
        RewardsBaseFeature rewardsBaseFeature6 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.BRANCH_ANALYTICS_REFACTOR
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_branch_analytics_refactor";
            }
        };
        e = rewardsBaseFeature6;
        RewardsBaseFeature rewardsBaseFeature7 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.COACH_MARKS_V2
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_coach_mark_v2";
            }

            @Override // au.com.woolworths.rewards.base.RewardsBaseFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        RewardsBaseFeature rewardsBaseFeature8 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.DEVICE_FINGERPRINT
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_device_fingerprint";
            }

            @Override // au.com.woolworths.rewards.base.RewardsBaseFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        RewardsBaseFeature rewardsBaseFeature9 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.END_CHAT
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_mandy_end_chat";
            }

            @Override // au.com.woolworths.rewards.base.RewardsBaseFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        f = rewardsBaseFeature9;
        RewardsBaseFeature rewardsBaseFeature10 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.EVERYDAY_DIGITAL_DESTINATION
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_everyday_digital_destination";
            }
        };
        RewardsBaseFeature rewardsBaseFeature11 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.EVERYDAY_EXTRA_REFER_A_FRIEND
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean b() {
                return true;
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_everyday_extra_refer_a_friend";
            }

            @Override // au.com.woolworths.rewards.base.RewardsBaseFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        RewardsBaseFeature rewardsBaseFeature12 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.EVERYDAY_EXTRAS_ACCOUNT_NOTIFICATION_BANNER
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean b() {
                return true;
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_everyday_extra_account_notification_banner";
            }
        };
        g = rewardsBaseFeature12;
        RewardsBaseFeature rewardsBaseFeature13 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.EVERYDAY_PAY_DISABLE_ADD_CARD
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_wallet_disable_add_bankcard";
            }
        };
        RewardsBaseFeature rewardsBaseFeature14 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.EVERYDAY_PAY_DISABLE_SECURE_FLAG
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_edpay_disable_secure_flag";
            }
        };
        RewardsBaseFeature rewardsBaseFeature15 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.EVERYDAY_PAY_DISABLE_UPDATE_CARD
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_wallet_disable_update_bankcard";
            }
        };
        RewardsBaseFeature rewardsBaseFeature16 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.EVERYDAY_PAY_WALLET_CYBERSOURCE_PAYMENT_CHECK
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_edpay_wallet_cybersource_payment_check";
            }
        };
        RewardsBaseFeature rewardsBaseFeature17 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.EVERYDAY_PAY_WALLET_GIFT_CARD_DETAILS_V2
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_edpay_wallet_gift_card_details_v2";
            }

            @Override // au.com.woolworths.rewards.base.RewardsBaseFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        RewardsBaseFeature rewardsBaseFeature18 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.EVERYDAY_PAY_WALLET_HOME_PAGE_V2
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_edpay_wallet_home_page_v2";
            }

            @Override // au.com.woolworths.rewards.base.RewardsBaseFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        RewardsBaseFeature rewardsBaseFeature19 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.EVERYDAY_PAY_WALLET_LITE
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_edpay_wallet_lite";
            }

            @Override // au.com.woolworths.rewards.base.RewardsBaseFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        RewardsBaseFeature rewardsBaseFeature20 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.EVERYDAY_PAY_WALLET_MLKIT_OCR
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean b() {
                return true;
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_edpay_wallet_mlkit_ocr";
            }
        };
        RewardsBaseFeature rewardsBaseFeature21 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.EVERYDAY_PAY_WALLET_NATIVE_OCR
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean b() {
                return true;
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_edpay_wallet_native_ocr";
            }
        };
        h = rewardsBaseFeature21;
        RewardsBaseFeature rewardsBaseFeature22 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.EVERYDAY_PAY_WALLET_TERMS_AND_CONDITIONS
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_edpay_wallet_t&c_update";
            }

            @Override // au.com.woolworths.rewards.base.RewardsBaseFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        RewardsBaseFeature rewardsBaseFeature23 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.EVERYDAY_PAY_WALLET_UNAVAILABLE
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean b() {
                return true;
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_edpay_wallet_unavailable";
            }
        };
        RewardsBaseFeature rewardsBaseFeature24 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.EVERYDAY_PAY_WEB_VIEW_FIX
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_edpay_webview_fix";
            }
        };
        i = rewardsBaseFeature24;
        RewardsBaseFeature rewardsBaseFeature25 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.EVERYDAY_SHOP_ENQUIRY_COMMENT_TIPS
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_everyday_shop_enquiry_comment_tips";
            }
        };
        RewardsBaseFeature rewardsBaseFeature26 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.EVERYDAY_SHOP_FORCE_UPGRADE
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_everyday_shop_force_upgrade";
            }
        };
        RewardsBaseFeature rewardsBaseFeature27 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.EVERYDAY_SHOP_FREIGHT_CHECKOUT
            @Override // au.com.woolworths.rewards.base.RewardsBaseFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String a() {
                return "freightCheckout";
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_everyday_shop_freight_checkout";
            }

            @Override // au.com.woolworths.rewards.base.RewardsBaseFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        RewardsBaseFeature rewardsBaseFeature28 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.EVERYDAY_SHOP_FREIGHT_LAYOUT
            @Override // au.com.woolworths.rewards.base.RewardsBaseFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String a() {
                return "freightLayout";
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_everyday_shop_freight_layout";
            }

            @Override // au.com.woolworths.rewards.base.RewardsBaseFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        RewardsBaseFeature rewardsBaseFeature29 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.EVERYDAY_SHOP_GIFTING_WEBVIEW
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_everyday_shop_gifting_webview";
            }
        };
        RewardsBaseFeature rewardsBaseFeature30 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.EVERYDAY_SHOP_HOME_V2
            @Override // au.com.woolworths.rewards.base.RewardsBaseFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String a() {
                return "shopHomeV2";
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_everyday_shop_home_v2";
            }
        };
        RewardsBaseFeature rewardsBaseFeature31 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.EVERYDAY_SHOP_LOW_PRICE_14_DAYS
            @Override // au.com.woolworths.rewards.base.RewardsBaseFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String a() {
                return "lowestPrice";
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_everyday_shop_lowest_price_in_14days";
            }
        };
        RewardsBaseFeature rewardsBaseFeature32 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.EVERYDAY_SHOP_PAY_WEBVIEW_LOG
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_everyday_shop_pay_webview_log";
            }
        };
        RewardsBaseFeature rewardsBaseFeature33 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.EVERYDAY_SHOP_RESEND_GIFT_CARD
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_edgifting_resend_giftcard";
            }
        };
        RewardsBaseFeature rewardsBaseFeature34 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.EVERYDAY_SHOP_SEARCH_FILTERS
            @Override // au.com.woolworths.rewards.base.RewardsBaseFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String a() {
                return "edrsSearchFilters";
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_edrs_search_filters";
            }

            @Override // au.com.woolworths.rewards.base.RewardsBaseFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        RewardsBaseFeature rewardsBaseFeature35 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.GAMIFICATION
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_rewards_gamification";
            }
        };
        RewardsBaseFeature rewardsBaseFeature36 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.GIFTING_ERECEIPTS
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_gifting_ereceipts";
            }
        };
        RewardsBaseFeature rewardsBaseFeature37 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.HOME_PAGE_OPTIMIZED_REFRESH
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_home_page_optimized_refresh";
            }
        };
        RewardsBaseFeature rewardsBaseFeature38 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.HOME_PAGE_OPTIMIZED_REFRESH_FALLBACK
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_home_page_optimized_refresh_fallback";
            }
        };
        RewardsBaseFeature rewardsBaseFeature39 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.IN_FEED_MESSAGES
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_rewards_infeed_messages";
            }
        };
        RewardsBaseFeature rewardsBaseFeature40 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.IN_STORE_WIFI
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean b() {
                return true;
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_rewards_instore_wifi";
            }
        };
        j = rewardsBaseFeature40;
        RewardsBaseFeature rewardsBaseFeature41 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.INTERSTITIAL_ADS
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_interstitial_ads";
            }
        };
        RewardsBaseFeature rewardsBaseFeature42 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.LOGIN_BYPASS
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_login_bypass";
            }
        };
        RewardsBaseFeature rewardsBaseFeature43 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.LOGIN_TARGET_BLANK_OVERRIDE
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_login_webview_target_blank_override";
            }
        };
        k = rewardsBaseFeature43;
        RewardsBaseFeature rewardsBaseFeature44 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.OFFER_DETAILS_REFACTOR
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_offer_details_refactor";
            }

            @Override // au.com.woolworths.rewards.base.RewardsBaseFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        l = rewardsBaseFeature44;
        RewardsBaseFeature rewardsBaseFeature45 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.OFFER_DETAILS_REFACTOR_NZ
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_offer_details_refactor_nz";
            }
        };
        m = rewardsBaseFeature45;
        RewardsBaseFeature rewardsBaseFeature46 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.OFFER_PERSONALISATION
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean b() {
                return true;
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_offer_personalisation";
            }
        };
        n = rewardsBaseFeature46;
        RewardsBaseFeature rewardsBaseFeature47 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.ONLINE_ERECEIPT_BARCODES
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_online_ereceipt_barcodes";
            }
        };
        RewardsBaseFeature rewardsBaseFeature48 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.REWARDS_APP_UPGRADE_UPLIFT
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_rewards_app_upgrade_uplift";
            }
        };
        o = rewardsBaseFeature48;
        RewardsBaseFeature rewardsBaseFeature49 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.REWARDS_AUTH0_DIGILITE_SIGNUP
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_rewards_auth0_digilite";
            }
        };
        p = rewardsBaseFeature49;
        RewardsBaseFeature rewardsBaseFeature50 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.REWARDS_AUTH0_SIGNUP
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_rewards_auth0_signup";
            }
        };
        q = rewardsBaseFeature50;
        RewardsBaseFeature rewardsBaseFeature51 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.REWARDS_HEADER_SHOW_CARD
            @Override // au.com.woolworths.rewards.base.RewardsBaseFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String a() {
                return "featureShowCard";
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_rewards_header_show_card";
            }

            @Override // au.com.woolworths.rewards.base.RewardsBaseFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        RewardsBaseFeature rewardsBaseFeature52 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.REWARDS_PERK_COMPOSE
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_perk_compose";
            }
        };
        RewardsBaseFeature rewardsBaseFeature53 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.REWARDS_PUSH_PREFERENCES_COMPOSE
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_rewards_push_preferences_compose";
            }

            @Override // au.com.woolworths.rewards.base.RewardsBaseFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        RewardsBaseFeature rewardsBaseFeature54 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.REWARDS_USER_ATTRIBUTION
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_rewards_user_attribution";
            }
        };
        RewardsBaseFeature rewardsBaseFeature55 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.SALESFORCE_NZ
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_salesforce_nz";
            }

            @Override // au.com.woolworths.rewards.base.RewardsBaseFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        RewardsBaseFeature rewardsBaseFeature56 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.VALUE_DASHBOARD_EMPTY_STATE_UPLIFT
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_value_empty_state_uplift";
            }
        };
        RewardsBaseFeature rewardsBaseFeature57 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.WX_ID_INTEGRATION
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_rewards_wxid_integration";
            }
        };
        r = rewardsBaseFeature57;
        RewardsBaseFeature rewardsBaseFeature58 = new RewardsBaseFeature() { // from class: au.com.woolworths.rewards.base.RewardsBaseFeature.WX_ID_TO_TEALIUM
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_rewards_wxid_forward_to_tealium";
            }
        };
        s = rewardsBaseFeature58;
        RewardsBaseFeature[] rewardsBaseFeatureArr = {rewardsBaseFeature, rewardsBaseFeature2, rewardsBaseFeature3, rewardsBaseFeature4, rewardsBaseFeature5, rewardsBaseFeature6, rewardsBaseFeature7, rewardsBaseFeature8, rewardsBaseFeature9, rewardsBaseFeature10, rewardsBaseFeature11, rewardsBaseFeature12, rewardsBaseFeature13, rewardsBaseFeature14, rewardsBaseFeature15, rewardsBaseFeature16, rewardsBaseFeature17, rewardsBaseFeature18, rewardsBaseFeature19, rewardsBaseFeature20, rewardsBaseFeature21, rewardsBaseFeature22, rewardsBaseFeature23, rewardsBaseFeature24, rewardsBaseFeature25, rewardsBaseFeature26, rewardsBaseFeature27, rewardsBaseFeature28, rewardsBaseFeature29, rewardsBaseFeature30, rewardsBaseFeature31, rewardsBaseFeature32, rewardsBaseFeature33, rewardsBaseFeature34, rewardsBaseFeature35, rewardsBaseFeature36, rewardsBaseFeature37, rewardsBaseFeature38, rewardsBaseFeature39, rewardsBaseFeature40, rewardsBaseFeature41, rewardsBaseFeature42, rewardsBaseFeature43, rewardsBaseFeature44, rewardsBaseFeature45, rewardsBaseFeature46, rewardsBaseFeature47, rewardsBaseFeature48, rewardsBaseFeature49, rewardsBaseFeature50, rewardsBaseFeature51, rewardsBaseFeature52, rewardsBaseFeature53, rewardsBaseFeature54, rewardsBaseFeature55, rewardsBaseFeature56, rewardsBaseFeature57, rewardsBaseFeature58};
        t = rewardsBaseFeatureArr;
        u = EnumEntriesKt.a(rewardsBaseFeatureArr);
    }

    public static RewardsBaseFeature valueOf(String str) {
        return (RewardsBaseFeature) Enum.valueOf(RewardsBaseFeature.class, str);
    }

    public static RewardsBaseFeature[] values() {
        return (RewardsBaseFeature[]) t.clone();
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
