package au.com.woolworths.shop.rewards.priming.analytics;

import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/rewards/priming/analytics/RewardsScreens;", "Lau/com/woolworths/android/onesite/analytics/Screen;", "", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class RewardsScreens implements Screen {
    public static final RewardsScreens d;
    public static final RewardsScreens e;
    public static final /* synthetic */ RewardsScreens[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        RewardsScreens rewardsScreens = new RewardsScreens() { // from class: au.com.woolworths.shop.rewards.priming.analytics.RewardsScreens.REWARDS_SETUP
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Rewards";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Rewards Login or Signup";
            }
        };
        d = rewardsScreens;
        RewardsScreens rewardsScreens2 = new RewardsScreens() { // from class: au.com.woolworths.shop.rewards.priming.analytics.RewardsScreens.LEGACY_REWARDS_SETUP
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "More";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "More Rewards screen";
            }
        };
        e = rewardsScreens2;
        RewardsScreens[] rewardsScreensArr = {rewardsScreens, rewardsScreens2};
        f = rewardsScreensArr;
        g = EnumEntriesKt.a(rewardsScreensArr);
    }

    public static RewardsScreens valueOf(String str) {
        return (RewardsScreens) Enum.valueOf(RewardsScreens.class, str);
    }

    public static RewardsScreens[] values() {
        return (RewardsScreens[]) f.clone();
    }
}
