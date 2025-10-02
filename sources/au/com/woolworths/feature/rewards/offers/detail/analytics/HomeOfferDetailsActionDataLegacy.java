package au.com.woolworths.feature.rewards.offers.detail.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferScreen;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Deprecated
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/analytics/HomeOfferDetailsActionDataLegacy;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "Companion", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class HomeOfferDetailsActionDataLegacy implements Action {
    public static final Companion e;
    public static final HomeOfferDetailsActionDataLegacy f;
    public static final HomeOfferDetailsActionDataLegacy g;
    public static final HomeOfferDetailsActionDataLegacy h;
    public static final HomeOfferDetailsActionDataLegacy i;
    public static final HomeOfferDetailsActionDataLegacy j;
    public static final HomeOfferDetailsActionDataLegacy k;
    public static final HomeOfferDetailsActionDataLegacy l;
    public static final HomeOfferDetailsActionDataLegacy m;
    public static final HomeOfferDetailsActionDataLegacy n;
    public static final HomeOfferDetailsActionDataLegacy o;
    public static final HomeOfferDetailsActionDataLegacy p;
    public static final HomeOfferDetailsActionDataLegacy q;
    public static final /* synthetic */ HomeOfferDetailsActionDataLegacy[] r;
    public static final /* synthetic */ EnumEntries s;
    public final Screen d = RewardsOfferScreen.d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/analytics/HomeOfferDetailsActionDataLegacy$Companion;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        HomeOfferDetailsActionDataLegacy homeOfferDetailsActionDataLegacy = new HomeOfferDetailsActionDataLegacy() { // from class: au.com.woolworths.feature.rewards.offers.detail.analytics.HomeOfferDetailsActionDataLegacy.ACTIVATE_OFFER_BUTTON_CLICK
            public final Category t = Category.m;
            public final String u = "Activate Offer";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getU() {
                return this.u;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getT() {
                return this.t;
            }
        };
        f = homeOfferDetailsActionDataLegacy;
        HomeOfferDetailsActionDataLegacy homeOfferDetailsActionDataLegacy2 = new HomeOfferDetailsActionDataLegacy() { // from class: au.com.woolworths.feature.rewards.offers.detail.analytics.HomeOfferDetailsActionDataLegacy.ACTIVATE_OFFER_SUCCESS
            public final Category t = Category.J;
            public final String u = "Success";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getU() {
                return this.u;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getT() {
                return this.t;
            }
        };
        g = homeOfferDetailsActionDataLegacy2;
        HomeOfferDetailsActionDataLegacy homeOfferDetailsActionDataLegacy3 = new HomeOfferDetailsActionDataLegacy() { // from class: au.com.woolworths.feature.rewards.offers.detail.analytics.HomeOfferDetailsActionDataLegacy.ACTIVATE_OFFER_FAIL
            public final Category t = Category.I;
            public final String u = "fail";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getU() {
                return this.u;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getT() {
                return this.t;
            }
        };
        h = homeOfferDetailsActionDataLegacy3;
        HomeOfferDetailsActionDataLegacy homeOfferDetailsActionDataLegacy4 = new HomeOfferDetailsActionDataLegacy() { // from class: au.com.woolworths.feature.rewards.offers.detail.analytics.HomeOfferDetailsActionDataLegacy.ACTIVATE_OFFER_NETWORK_ERROR
            public final Category t = Category.v;
            public final String u = "Network Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getU() {
                return this.u;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getT() {
                return this.t;
            }
        };
        i = homeOfferDetailsActionDataLegacy4;
        HomeOfferDetailsActionDataLegacy homeOfferDetailsActionDataLegacy5 = new HomeOfferDetailsActionDataLegacy() { // from class: au.com.woolworths.feature.rewards.offers.detail.analytics.HomeOfferDetailsActionDataLegacy.ACTIVATE_OFFER_SERVER_ERROR
            public final Category t = Category.v;
            public final String u = "Server Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getU() {
                return this.u;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getT() {
                return this.t;
            }
        };
        j = homeOfferDetailsActionDataLegacy5;
        HomeOfferDetailsActionDataLegacy homeOfferDetailsActionDataLegacy6 = new HomeOfferDetailsActionDataLegacy() { // from class: au.com.woolworths.feature.rewards.offers.detail.analytics.HomeOfferDetailsActionDataLegacy.LOADING_OFFER_NETWORK_ERROR
            public final Category t = Category.v;
            public final String u = "Network Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getU() {
                return this.u;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getT() {
                return this.t;
            }
        };
        k = homeOfferDetailsActionDataLegacy6;
        HomeOfferDetailsActionDataLegacy homeOfferDetailsActionDataLegacy7 = new HomeOfferDetailsActionDataLegacy() { // from class: au.com.woolworths.feature.rewards.offers.detail.analytics.HomeOfferDetailsActionDataLegacy.LOADING_OFFER_SERVER_ERROR
            public final Category t = Category.v;
            public final String u = "Server Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getU() {
                return this.u;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getT() {
                return this.t;
            }
        };
        l = homeOfferDetailsActionDataLegacy7;
        HomeOfferDetailsActionDataLegacy homeOfferDetailsActionDataLegacy8 = new HomeOfferDetailsActionDataLegacy() { // from class: au.com.woolworths.feature.rewards.offers.detail.analytics.HomeOfferDetailsActionDataLegacy.OFFER_NETWORK_ERROR_TRY_AGAIN_BUTTON_CLICK
            public final Category t = Category.m;
            public final String u = "Network Error - Try Again";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getU() {
                return this.u;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getT() {
                return this.t;
            }
        };
        m = homeOfferDetailsActionDataLegacy8;
        HomeOfferDetailsActionDataLegacy homeOfferDetailsActionDataLegacy9 = new HomeOfferDetailsActionDataLegacy() { // from class: au.com.woolworths.feature.rewards.offers.detail.analytics.HomeOfferDetailsActionDataLegacy.OFFER_SERVER_ERROR_TRY_AGAIN_BUTTON_CLICK
            public final Category t = Category.m;
            public final String u = "Server Error - Try Again";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getU() {
                return this.u;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getT() {
                return this.t;
            }
        };
        n = homeOfferDetailsActionDataLegacy9;
        HomeOfferDetailsActionDataLegacy homeOfferDetailsActionDataLegacy10 = new HomeOfferDetailsActionDataLegacy() { // from class: au.com.woolworths.feature.rewards.offers.detail.analytics.HomeOfferDetailsActionDataLegacy.OFFER_DETAILS_LOADED
            public final Category t = Category.L;
            public final String u = "Offer Details Loaded";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getU() {
                return this.u;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getT() {
                return this.t;
            }
        };
        o = homeOfferDetailsActionDataLegacy10;
        HomeOfferDetailsActionDataLegacy homeOfferDetailsActionDataLegacy11 = new HomeOfferDetailsActionDataLegacy() { // from class: au.com.woolworths.feature.rewards.offers.detail.analytics.HomeOfferDetailsActionDataLegacy.REWARDS_OFFER_BANNER_IMPRESSION
            public final Category t = Category.h;
            public final String u = "View";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getU() {
                return this.u;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getT() {
                return this.t;
            }
        };
        p = homeOfferDetailsActionDataLegacy11;
        HomeOfferDetailsActionDataLegacy homeOfferDetailsActionDataLegacy12 = new HomeOfferDetailsActionDataLegacy() { // from class: au.com.woolworths.feature.rewards.offers.detail.analytics.HomeOfferDetailsActionDataLegacy.REWARDS_OFFER_BANNER_CLICK
            public final Category t = Category.s;
            public final String u = "View";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getU() {
                return this.u;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getT() {
                return this.t;
            }
        };
        q = homeOfferDetailsActionDataLegacy12;
        HomeOfferDetailsActionDataLegacy[] homeOfferDetailsActionDataLegacyArr = {homeOfferDetailsActionDataLegacy, homeOfferDetailsActionDataLegacy2, homeOfferDetailsActionDataLegacy3, homeOfferDetailsActionDataLegacy4, homeOfferDetailsActionDataLegacy5, homeOfferDetailsActionDataLegacy6, homeOfferDetailsActionDataLegacy7, homeOfferDetailsActionDataLegacy8, homeOfferDetailsActionDataLegacy9, homeOfferDetailsActionDataLegacy10, homeOfferDetailsActionDataLegacy11, homeOfferDetailsActionDataLegacy12};
        r = homeOfferDetailsActionDataLegacyArr;
        s = EnumEntriesKt.a(homeOfferDetailsActionDataLegacyArr);
        e = new Companion();
    }

    public HomeOfferDetailsActionDataLegacy(String str, int i2) {
    }

    public static HomeOfferDetailsActionDataLegacy valueOf(String str) {
        return (HomeOfferDetailsActionDataLegacy) Enum.valueOf(HomeOfferDetailsActionDataLegacy.class, str);
    }

    public static HomeOfferDetailsActionDataLegacy[] values() {
        return (HomeOfferDetailsActionDataLegacy[]) r.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public final Screen getD() {
        return this.d;
    }
}
