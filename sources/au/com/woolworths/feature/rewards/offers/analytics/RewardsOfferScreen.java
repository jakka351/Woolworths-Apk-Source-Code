package au.com.woolworths.feature.rewards.offers.analytics;

import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/analytics/RewardsOfferScreen;", "Lau/com/woolworths/android/onesite/analytics/Screen;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class RewardsOfferScreen implements Screen {
    public static final RewardsOfferScreen d;
    public static final RewardsOfferScreen e;
    public static final RewardsOfferScreen f;
    public static final RewardsOfferScreen g;
    public static final /* synthetic */ RewardsOfferScreen[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        RewardsOfferScreen rewardsOfferScreen = new RewardsOfferScreen() { // from class: au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferScreen.HOME_OFFER_DETAILS
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Home";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "offerdetails_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Offer Details";
            }
        };
        d = rewardsOfferScreen;
        RewardsOfferScreen rewardsOfferScreen2 = new RewardsOfferScreen() { // from class: au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferScreen.HOME_POINTS
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Home";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "points_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String c() {
                return "screen_view_home_points";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Points";
            }
        };
        e = rewardsOfferScreen2;
        RewardsOfferScreen rewardsOfferScreen3 = new RewardsOfferScreen() { // from class: au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferScreen.REWARDS_BOOSTERS_POINTS
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Boosters";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "points_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String c() {
                return "screen_view_boosters_points";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Points";
            }
        };
        f = rewardsOfferScreen3;
        RewardsOfferScreen rewardsOfferScreen4 = new RewardsOfferScreen() { // from class: au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferScreen.REWARDS_OFFER_DETAILS
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Boosters";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "offerdetails_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Offer Details";
            }
        };
        g = rewardsOfferScreen4;
        RewardsOfferScreen[] rewardsOfferScreenArr = {rewardsOfferScreen, rewardsOfferScreen2, rewardsOfferScreen3, rewardsOfferScreen4};
        h = rewardsOfferScreenArr;
        i = EnumEntriesKt.a(rewardsOfferScreenArr);
    }

    public static RewardsOfferScreen valueOf(String str) {
        return (RewardsOfferScreen) Enum.valueOf(RewardsOfferScreen.class, str);
    }

    public static RewardsOfferScreen[] values() {
        return (RewardsOfferScreen[]) h.clone();
    }
}
