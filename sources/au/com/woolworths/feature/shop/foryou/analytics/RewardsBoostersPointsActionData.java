package au.com.woolworths.feature.shop.foryou.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferScreen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/foryou/analytics/RewardsBoostersPointsActionData;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "for-you_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class RewardsBoostersPointsActionData implements Action {
    public static final RewardsBoostersPointsActionData e;
    public static final RewardsBoostersPointsActionData f;
    public static final /* synthetic */ RewardsBoostersPointsActionData[] g;
    public static final /* synthetic */ EnumEntries h;
    public final Screen d = RewardsOfferScreen.f;

    static {
        RewardsBoostersPointsActionData rewardsBoostersPointsActionData = new RewardsBoostersPointsActionData() { // from class: au.com.woolworths.feature.shop.foryou.analytics.RewardsBoostersPointsActionData.POINTS_BALANCE_CLICK
            public final Category i = Category.m;
            public final String j = "Points Balance";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getJ() {
                return this.j;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getI() {
                return this.i;
            }
        };
        e = rewardsBoostersPointsActionData;
        RewardsBoostersPointsActionData rewardsBoostersPointsActionData2 = new RewardsBoostersPointsActionData() { // from class: au.com.woolworths.feature.shop.foryou.analytics.RewardsBoostersPointsActionData.POINTS_BALANCE_IMPRESSION
            public final Category i = Category.B;
            public final String j = "Current Points";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getJ() {
                return this.j;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getI() {
                return this.i;
            }
        };
        f = rewardsBoostersPointsActionData2;
        RewardsBoostersPointsActionData[] rewardsBoostersPointsActionDataArr = {rewardsBoostersPointsActionData, rewardsBoostersPointsActionData2};
        g = rewardsBoostersPointsActionDataArr;
        h = EnumEntriesKt.a(rewardsBoostersPointsActionDataArr);
    }

    public RewardsBoostersPointsActionData(String str, int i) {
    }

    public static RewardsBoostersPointsActionData valueOf(String str) {
        return (RewardsBoostersPointsActionData) Enum.valueOf(RewardsBoostersPointsActionData.class, str);
    }

    public static RewardsBoostersPointsActionData[] values() {
        return (RewardsBoostersPointsActionData[]) g.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public final Screen getD() {
        return this.d;
    }
}
