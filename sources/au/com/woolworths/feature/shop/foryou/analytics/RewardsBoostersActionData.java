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
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/foryou/analytics/RewardsBoostersActionData;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "for-you_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class RewardsBoostersActionData implements Action {
    public static final /* synthetic */ RewardsBoostersActionData[] e;
    public static final /* synthetic */ EnumEntries f;
    public Screen d;

    static {
        RewardsBoostersActionData[] rewardsBoostersActionDataArr = {new RewardsBoostersActionData() { // from class: au.com.woolworths.feature.shop.foryou.analytics.RewardsBoostersActionData.POINTS_TAB_CLICK
            public final Category g;
            public final String h;

            {
                this.d = RewardsOfferScreen.f;
                this.g = Category.m;
                this.h = "Points";
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getH() {
                return this.h;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getG() {
                return this.g;
            }
        }};
        e = rewardsBoostersActionDataArr;
        f = EnumEntriesKt.a(rewardsBoostersActionDataArr);
    }

    public static RewardsBoostersActionData valueOf(String str) {
        return (RewardsBoostersActionData) Enum.valueOf(RewardsBoostersActionData.class, str);
    }

    public static RewardsBoostersActionData[] values() {
        return (RewardsBoostersActionData[]) e.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public final Screen getD() {
        return this.d;
    }
}
