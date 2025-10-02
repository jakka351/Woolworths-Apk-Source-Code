package au.com.woolworths.feature.rewards.offers.list.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferScreen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/list/analytics/RewardsOffersListActionData;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "Companion", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class RewardsOffersListActionData implements Action {
    public static final Companion e;
    public static final RewardsOffersListActionData f;
    public static final RewardsOffersListActionData g;
    public static final RewardsOffersListActionData h;
    public static final RewardsOffersListActionData i;
    public static final RewardsOffersListActionData j;
    public static final RewardsOffersListActionData k;
    public static final RewardsOffersListActionData l;
    public static final RewardsOffersListActionData m;
    public static final RewardsOffersListActionData n;
    public static final RewardsOffersListActionData o;
    public static final RewardsOffersListActionData p;
    public static final RewardsOffersListActionData q;
    public static final RewardsOffersListActionData r;
    public static final RewardsOffersListActionData s;
    public static final RewardsOffersListActionData t;
    public static final RewardsOffersListActionData u;
    public static final /* synthetic */ RewardsOffersListActionData[] v;
    public static final /* synthetic */ EnumEntries w;
    public final Screen d = RewardsOfferScreen.f;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/list/analytics/RewardsOffersListActionData$Companion;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        RewardsOffersListActionData rewardsOffersListActionData = new RewardsOffersListActionData() { // from class: au.com.woolworths.feature.rewards.offers.list.analytics.RewardsOffersListActionData.BOOSTED_OFFER_BANNER_CLICK
            public final Category x = Category.s;
            public final String y = "Shop boosted";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getY() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getX() {
                return this.x;
            }
        };
        f = rewardsOffersListActionData;
        RewardsOffersListActionData rewardsOffersListActionData2 = new RewardsOffersListActionData() { // from class: au.com.woolworths.feature.rewards.offers.list.analytics.RewardsOffersListActionData.BOOSTED_OFFER_BANNER_IMPRESSION
            public final Category x = Category.h;
            public final String y = "Shop your boosted products";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getY() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getX() {
                return this.x;
            }
        };
        g = rewardsOffersListActionData2;
        RewardsOffersListActionData rewardsOffersListActionData3 = new RewardsOffersListActionData() { // from class: au.com.woolworths.feature.rewards.offers.list.analytics.RewardsOffersListActionData.REWARDS_OFFERS_IMPRESSION
            public final Category x = Category.L;
            public final String y = "Rewards Offers Loaded";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getY() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getX() {
                return this.x;
            }
        };
        h = rewardsOffersListActionData3;
        RewardsOffersListActionData rewardsOffersListActionData4 = new RewardsOffersListActionData() { // from class: au.com.woolworths.feature.rewards.offers.list.analytics.RewardsOffersListActionData.REWARDS_OFFERS_CLICK
            public final Category x = Category.m;
            public final String y = "Offer Details";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getY() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getX() {
                return this.x;
            }
        };
        i = rewardsOffersListActionData4;
        RewardsOffersListActionData rewardsOffersListActionData5 = new RewardsOffersListActionData() { // from class: au.com.woolworths.feature.rewards.offers.list.analytics.RewardsOffersListActionData.REWARDS_PRODUCT_OFFERS_FIRST_SWIPE
            public final Category x = Category.n;
            public final String y = "First Carousel Swipe";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getY() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getX() {
                return this.x;
            }
        };
        j = rewardsOffersListActionData5;
        RewardsOffersListActionData rewardsOffersListActionData6 = new RewardsOffersListActionData() { // from class: au.com.woolworths.feature.rewards.offers.list.analytics.RewardsOffersListActionData.REWARDS_PRODUCT_OFFERS_FIRST_SWIPE_TO_END
            public final Category x = Category.n;
            public final String y = "Scrolled to Carousel End";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getY() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getX() {
                return this.x;
            }
        };
        k = rewardsOffersListActionData6;
        RewardsOffersListActionData rewardsOffersListActionData7 = new RewardsOffersListActionData() { // from class: au.com.woolworths.feature.rewards.offers.list.analytics.RewardsOffersListActionData.SPIN_SURPRISE_BANNER_IMPRESSION
            public final Category x = Category.h;
            public final String y = "Banner Loaded";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getY() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getX() {
                return this.x;
            }
        };
        l = rewardsOffersListActionData7;
        RewardsOffersListActionData rewardsOffersListActionData8 = new RewardsOffersListActionData() { // from class: au.com.woolworths.feature.rewards.offers.list.analytics.RewardsOffersListActionData.SPIN_SURPRISE_BANNER_CLICK
            public final Category x = Category.m;
            public final String y = "Banner Action";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getY() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getX() {
                return this.x;
            }
        };
        m = rewardsOffersListActionData8;
        RewardsOffersListActionData rewardsOffersListActionData9 = new RewardsOffersListActionData() { // from class: au.com.woolworths.feature.rewards.offers.list.analytics.RewardsOffersListActionData.OFFER_LIST_EMPTY
            public final Category x = Category.B;
            public final String y = "No points boosters right now";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getY() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getX() {
                return this.x;
            }
        };
        n = rewardsOffersListActionData9;
        RewardsOffersListActionData rewardsOffersListActionData10 = new RewardsOffersListActionData() { // from class: au.com.woolworths.feature.rewards.offers.list.analytics.RewardsOffersListActionData.ACTIVATE_OFFER_BUTTON_CLICK
            public final Category x = Category.m;
            public final String y = "Activate Offer";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getY() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getX() {
                return this.x;
            }
        };
        o = rewardsOffersListActionData10;
        RewardsOffersListActionData rewardsOffersListActionData11 = new RewardsOffersListActionData() { // from class: au.com.woolworths.feature.rewards.offers.list.analytics.RewardsOffersListActionData.ACTIVATE_OFFER_SUCCESS
            public final Category x = Category.J;
            public final String y = "success";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getY() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getX() {
                return this.x;
            }
        };
        p = rewardsOffersListActionData11;
        RewardsOffersListActionData rewardsOffersListActionData12 = new RewardsOffersListActionData() { // from class: au.com.woolworths.feature.rewards.offers.list.analytics.RewardsOffersListActionData.ACTIVATE_OFFER_FAIL
            public final Category x = Category.I;
            public final String y = "fail";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getY() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getX() {
                return this.x;
            }
        };
        q = rewardsOffersListActionData12;
        RewardsOffersListActionData rewardsOffersListActionData13 = new RewardsOffersListActionData() { // from class: au.com.woolworths.feature.rewards.offers.list.analytics.RewardsOffersListActionData.LOAD_DETAILS_NETWORK_ERROR
            public final Category x = Category.v;
            public final String y = "Network Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getY() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getX() {
                return this.x;
            }
        };
        r = rewardsOffersListActionData13;
        RewardsOffersListActionData rewardsOffersListActionData14 = new RewardsOffersListActionData() { // from class: au.com.woolworths.feature.rewards.offers.list.analytics.RewardsOffersListActionData.LOAD_DETAILS_SERVER_ERROR
            public final Category x = Category.v;
            public final String y = "Server Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getY() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getX() {
                return this.x;
            }
        };
        s = rewardsOffersListActionData14;
        RewardsOffersListActionData rewardsOffersListActionData15 = new RewardsOffersListActionData() { // from class: au.com.woolworths.feature.rewards.offers.list.analytics.RewardsOffersListActionData.LOAD_DETAILS_NETWORK_ERROR_TRY_AGAIN
            public final Category x = Category.m;
            public final String y = "Network Error - Try again";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getY() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getX() {
                return this.x;
            }
        };
        t = rewardsOffersListActionData15;
        RewardsOffersListActionData rewardsOffersListActionData16 = new RewardsOffersListActionData() { // from class: au.com.woolworths.feature.rewards.offers.list.analytics.RewardsOffersListActionData.LOAD_DETAILS_SERVER_ERROR_TRY_AGAIN
            public final Category x = Category.m;
            public final String y = "Server Error - Try again";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getY() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getX() {
                return this.x;
            }
        };
        u = rewardsOffersListActionData16;
        RewardsOffersListActionData[] rewardsOffersListActionDataArr = {rewardsOffersListActionData, rewardsOffersListActionData2, rewardsOffersListActionData3, rewardsOffersListActionData4, rewardsOffersListActionData5, rewardsOffersListActionData6, rewardsOffersListActionData7, rewardsOffersListActionData8, rewardsOffersListActionData9, rewardsOffersListActionData10, rewardsOffersListActionData11, rewardsOffersListActionData12, rewardsOffersListActionData13, rewardsOffersListActionData14, rewardsOffersListActionData15, rewardsOffersListActionData16};
        v = rewardsOffersListActionDataArr;
        w = EnumEntriesKt.a(rewardsOffersListActionDataArr);
        e = new Companion();
    }

    public RewardsOffersListActionData(String str, int i2) {
    }

    public static RewardsOffersListActionData valueOf(String str) {
        return (RewardsOffersListActionData) Enum.valueOf(RewardsOffersListActionData.class, str);
    }

    public static RewardsOffersListActionData[] values() {
        return (RewardsOffersListActionData[]) v.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public final Screen getD() {
        return this.d;
    }
}
