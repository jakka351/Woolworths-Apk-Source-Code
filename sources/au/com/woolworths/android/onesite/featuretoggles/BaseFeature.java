package au.com.woolworths.android.onesite.featuretoggles;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/featuretoggles/BaseFeature;", "Lau/com/woolworths/android/onesite/featuretoggles/Feature;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class BaseFeature implements Feature {
    public static final BaseFeature d;
    public static final BaseFeature e;
    public static final BaseFeature f;
    public static final BaseFeature g;
    public static final BaseFeature h;
    public static final BaseFeature i;
    public static final BaseFeature j;
    public static final BaseFeature k;
    public static final BaseFeature l;
    public static final BaseFeature m;
    public static final BaseFeature n;
    public static final BaseFeature o;
    public static final BaseFeature p;
    public static final BaseFeature q;
    public static final /* synthetic */ BaseFeature[] r;
    public static final /* synthetic */ EnumEntries s;

    static {
        BaseFeature baseFeature = new BaseFeature() { // from class: au.com.woolworths.android.onesite.featuretoggles.BaseFeature.DARK_THEME
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_dark_theme";
            }
        };
        d = baseFeature;
        BaseFeature baseFeature2 = new BaseFeature() { // from class: au.com.woolworths.android.onesite.featuretoggles.BaseFeature.FEATURE_ACCESS_LIST
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean b() {
                return true;
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_feature_access_list";
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.BaseFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        BaseFeature baseFeature3 = new BaseFeature() { // from class: au.com.woolworths.android.onesite.featuretoggles.BaseFeature.GAM_RESPONSE_FAILURE_LOG
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_gam_response_failure_log";
            }
        };
        e = baseFeature3;
        BaseFeature baseFeature4 = new BaseFeature() { // from class: au.com.woolworths.android.onesite.featuretoggles.BaseFeature.GRAPHQL_SUBSCRIPTIONS
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean b() {
                return true;
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_graphql_subscriptions";
            }
        };
        f = baseFeature4;
        BaseFeature baseFeature5 = new BaseFeature() { // from class: au.com.woolworths.android.onesite.featuretoggles.BaseFeature.INCLUDE_LOWEST_PRICE_14_DAYS
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_everyday_market_lowest_price";
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.BaseFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        g = baseFeature5;
        BaseFeature baseFeature6 = new BaseFeature() { // from class: au.com.woolworths.android.onesite.featuretoggles.BaseFeature.LIFECYCLE_EVENT_REMOVAL
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_lifecycle_event_removal";
            }
        };
        h = baseFeature6;
        BaseFeature baseFeature7 = new BaseFeature() { // from class: au.com.woolworths.android.onesite.featuretoggles.BaseFeature.PREEMPTIVE_TOKEN_REFRESH
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean b() {
                return true;
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_preemptive_token_refresh_enabled";
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.BaseFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        i = baseFeature7;
        BaseFeature baseFeature8 = new BaseFeature() { // from class: au.com.woolworths.android.onesite.featuretoggles.BaseFeature.REWARDS_AUTH_UPLIFT
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_rewards_auth_uplift";
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.BaseFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        j = baseFeature8;
        BaseFeature baseFeature9 = new BaseFeature() { // from class: au.com.woolworths.android.onesite.featuretoggles.BaseFeature.REWARDS_HOMEPAGE_COMPOSE
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_rewards_homepage_compose";
            }
        };
        BaseFeature baseFeature10 = new BaseFeature() { // from class: au.com.woolworths.android.onesite.featuretoggles.BaseFeature.REWARDS_OFFER_DETAILS_EMPTY_STATE
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_rewards_offer_details_with_empty_state";
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.BaseFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        k = baseFeature10;
        BaseFeature baseFeature11 = new BaseFeature() { // from class: au.com.woolworths.android.onesite.featuretoggles.BaseFeature.REWARDS_WALLET_FRAMES_IGNORE_526
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean b() {
                return true;
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_wallet_frames_ignore_526_error";
            }
        };
        BaseFeature baseFeature12 = new BaseFeature() { // from class: au.com.woolworths.android.onesite.featuretoggles.BaseFeature.SHOP_WXID_INTEGRATION
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_shop_wxid_integration";
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.BaseFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        l = baseFeature12;
        BaseFeature baseFeature13 = new BaseFeature() { // from class: au.com.woolworths.android.onesite.featuretoggles.BaseFeature.TEALIUM_BRANCH_REMOTE_COMMAND
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_tealium_branch_remote_command";
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.BaseFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        m = baseFeature13;
        BaseFeature baseFeature14 = new BaseFeature() { // from class: au.com.woolworths.android.onesite.featuretoggles.BaseFeature.TEALIUM_FIREBASE_REMOTE_COMMAND
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean b() {
                return true;
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_tealium_firebase_remote_command";
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.BaseFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        n = baseFeature14;
        BaseFeature baseFeature15 = new BaseFeature() { // from class: au.com.woolworths.android.onesite.featuretoggles.BaseFeature.TEALIUM_IMPRESSION_MERGING
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_impression_merging";
            }
        };
        o = baseFeature15;
        BaseFeature baseFeature16 = new BaseFeature() { // from class: au.com.woolworths.android.onesite.featuretoggles.BaseFeature.TEALIUM_OFFER_IMPRESSION_MERGING
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_offer_impression_merging";
            }
        };
        p = baseFeature16;
        BaseFeature baseFeature17 = new BaseFeature() { // from class: au.com.woolworths.android.onesite.featuretoggles.BaseFeature.UNIVERSAL_INVENTORY_FALLBACK
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_universal_inventory_fallback";
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.BaseFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        q = baseFeature17;
        BaseFeature[] baseFeatureArr = {baseFeature, baseFeature2, baseFeature3, baseFeature4, baseFeature5, baseFeature6, baseFeature7, baseFeature8, baseFeature9, baseFeature10, baseFeature11, baseFeature12, baseFeature13, baseFeature14, baseFeature15, baseFeature16, baseFeature17};
        r = baseFeatureArr;
        s = EnumEntriesKt.a(baseFeatureArr);
    }

    public static BaseFeature valueOf(String str) {
        return (BaseFeature) Enum.valueOf(BaseFeature.class, str);
    }

    public static BaseFeature[] values() {
        return (BaseFeature[]) r.clone();
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
