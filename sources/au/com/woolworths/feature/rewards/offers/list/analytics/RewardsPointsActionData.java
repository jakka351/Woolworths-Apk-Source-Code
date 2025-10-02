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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/list/analytics/RewardsPointsActionData;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "Companion", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class RewardsPointsActionData implements Action {
    public static final Companion e;
    public static final RewardsPointsActionData f;
    public static final RewardsPointsActionData g;
    public static final RewardsPointsActionData h;
    public static final RewardsPointsActionData i;
    public static final RewardsPointsActionData j;
    public static final RewardsPointsActionData k;
    public static final RewardsPointsActionData l;
    public static final RewardsPointsActionData m;
    public static final RewardsPointsActionData n;
    public static final RewardsPointsActionData o;
    public static final RewardsPointsActionData p;
    public static final RewardsPointsActionData q;
    public static final RewardsPointsActionData r;
    public static final RewardsPointsActionData s;
    public static final RewardsPointsActionData t;
    public static final RewardsPointsActionData u;
    public static final /* synthetic */ RewardsPointsActionData[] v;
    public static final /* synthetic */ EnumEntries w;
    public final Screen d = RewardsOfferScreen.e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/list/analytics/RewardsPointsActionData$Companion;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        RewardsPointsActionData rewardsPointsActionData = new RewardsPointsActionData() { // from class: au.com.woolworths.feature.rewards.offers.list.analytics.RewardsPointsActionData.BOOSTED_OFFER_BANNER_CLICK
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
        f = rewardsPointsActionData;
        RewardsPointsActionData rewardsPointsActionData2 = new RewardsPointsActionData() { // from class: au.com.woolworths.feature.rewards.offers.list.analytics.RewardsPointsActionData.BOOSTED_OFFER_BANNER_IMPRESSION
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
        g = rewardsPointsActionData2;
        RewardsPointsActionData rewardsPointsActionData3 = new RewardsPointsActionData() { // from class: au.com.woolworths.feature.rewards.offers.list.analytics.RewardsPointsActionData.REWARDS_OFFERS_IMPRESSION
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
        h = rewardsPointsActionData3;
        RewardsPointsActionData rewardsPointsActionData4 = new RewardsPointsActionData() { // from class: au.com.woolworths.feature.rewards.offers.list.analytics.RewardsPointsActionData.REWARDS_OFFERS_CLICK
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
        i = rewardsPointsActionData4;
        RewardsPointsActionData rewardsPointsActionData5 = new RewardsPointsActionData() { // from class: au.com.woolworths.feature.rewards.offers.list.analytics.RewardsPointsActionData.REWARDS_PRODUCT_OFFERS_FIRST_SWIPE
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
        j = rewardsPointsActionData5;
        RewardsPointsActionData rewardsPointsActionData6 = new RewardsPointsActionData() { // from class: au.com.woolworths.feature.rewards.offers.list.analytics.RewardsPointsActionData.REWARDS_PRODUCT_OFFERS_FIRST_SWIPE_TO_END
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
        k = rewardsPointsActionData6;
        RewardsPointsActionData rewardsPointsActionData7 = new RewardsPointsActionData() { // from class: au.com.woolworths.feature.rewards.offers.list.analytics.RewardsPointsActionData.SPIN_SURPRISE_BANNER_IMPRESSION
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
        l = rewardsPointsActionData7;
        RewardsPointsActionData rewardsPointsActionData8 = new RewardsPointsActionData() { // from class: au.com.woolworths.feature.rewards.offers.list.analytics.RewardsPointsActionData.SPIN_SURPRISE_BANNER_CLICK
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
        m = rewardsPointsActionData8;
        RewardsPointsActionData rewardsPointsActionData9 = new RewardsPointsActionData() { // from class: au.com.woolworths.feature.rewards.offers.list.analytics.RewardsPointsActionData.OFFER_LIST_EMPTY
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
        n = rewardsPointsActionData9;
        RewardsPointsActionData rewardsPointsActionData10 = new RewardsPointsActionData() { // from class: au.com.woolworths.feature.rewards.offers.list.analytics.RewardsPointsActionData.ACTIVATE_OFFER_BUTTON_CLICK
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
        o = rewardsPointsActionData10;
        RewardsPointsActionData rewardsPointsActionData11 = new RewardsPointsActionData() { // from class: au.com.woolworths.feature.rewards.offers.list.analytics.RewardsPointsActionData.ACTIVATE_OFFER_SUCCESS
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
        p = rewardsPointsActionData11;
        RewardsPointsActionData rewardsPointsActionData12 = new RewardsPointsActionData() { // from class: au.com.woolworths.feature.rewards.offers.list.analytics.RewardsPointsActionData.ACTIVATE_OFFER_FAIL
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
        q = rewardsPointsActionData12;
        RewardsPointsActionData rewardsPointsActionData13 = new RewardsPointsActionData() { // from class: au.com.woolworths.feature.rewards.offers.list.analytics.RewardsPointsActionData.LOAD_DETAILS_NETWORK_ERROR
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
        r = rewardsPointsActionData13;
        RewardsPointsActionData rewardsPointsActionData14 = new RewardsPointsActionData() { // from class: au.com.woolworths.feature.rewards.offers.list.analytics.RewardsPointsActionData.LOAD_DETAILS_SERVER_ERROR
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
        s = rewardsPointsActionData14;
        RewardsPointsActionData rewardsPointsActionData15 = new RewardsPointsActionData() { // from class: au.com.woolworths.feature.rewards.offers.list.analytics.RewardsPointsActionData.LOAD_DETAILS_NETWORK_ERROR_TRY_AGAIN
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
        t = rewardsPointsActionData15;
        RewardsPointsActionData rewardsPointsActionData16 = new RewardsPointsActionData() { // from class: au.com.woolworths.feature.rewards.offers.list.analytics.RewardsPointsActionData.LOAD_DETAILS_SERVER_ERROR_TRY_AGAIN
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
        u = rewardsPointsActionData16;
        RewardsPointsActionData[] rewardsPointsActionDataArr = {rewardsPointsActionData, rewardsPointsActionData2, rewardsPointsActionData3, rewardsPointsActionData4, rewardsPointsActionData5, rewardsPointsActionData6, rewardsPointsActionData7, rewardsPointsActionData8, rewardsPointsActionData9, rewardsPointsActionData10, rewardsPointsActionData11, rewardsPointsActionData12, rewardsPointsActionData13, rewardsPointsActionData14, rewardsPointsActionData15, rewardsPointsActionData16};
        v = rewardsPointsActionDataArr;
        w = EnumEntriesKt.a(rewardsPointsActionDataArr);
        e = new Companion();
    }

    public RewardsPointsActionData(String str, int i2) {
    }

    public static RewardsPointsActionData valueOf(String str) {
        return (RewardsPointsActionData) Enum.valueOf(RewardsPointsActionData.class, str);
    }

    public static RewardsPointsActionData[] values() {
        return (RewardsPointsActionData[]) v.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public final Screen getD() {
        return this.d;
    }
}
