package au.com.woolworths.shop.rewards.priming.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/rewards/priming/analytics/RewardsSetupActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class RewardsSetupActions implements Action {
    public static final RewardsSetupActions e;
    public static final RewardsSetupActions f;
    public static final RewardsSetupActions g;
    public static final /* synthetic */ RewardsSetupActions[] h;
    public static final /* synthetic */ EnumEntries i;
    public final Screen d = RewardsScreens.d;

    static {
        RewardsSetupActions rewardsSetupActions = new RewardsSetupActions() { // from class: au.com.woolworths.shop.rewards.priming.analytics.RewardsSetupActions.CLOSE_WINDOW
            public final Category j = Category.m;
            public final String k = "Close";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.k;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.j;
            }
        };
        e = rewardsSetupActions;
        RewardsSetupActions rewardsSetupActions2 = new RewardsSetupActions() { // from class: au.com.woolworths.shop.rewards.priming.analytics.RewardsSetupActions.ADD_REWARDS_CARD
            public final Category j = Category.m;
            public final String k = "Add Rewards Card";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.k;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.j;
            }
        };
        f = rewardsSetupActions2;
        RewardsSetupActions rewardsSetupActions3 = new RewardsSetupActions() { // from class: au.com.woolworths.shop.rewards.priming.analytics.RewardsSetupActions.SIGNUP_FOR_REWARDS
            public final Category j = Category.m;
            public final String k = "Sign Up";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.k;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.j;
            }
        };
        g = rewardsSetupActions3;
        RewardsSetupActions[] rewardsSetupActionsArr = {rewardsSetupActions, rewardsSetupActions2, rewardsSetupActions3};
        h = rewardsSetupActionsArr;
        i = EnumEntriesKt.a(rewardsSetupActionsArr);
    }

    public RewardsSetupActions(String str, int i2) {
    }

    public static RewardsSetupActions valueOf(String str) {
        return (RewardsSetupActions) Enum.valueOf(RewardsSetupActions.class, str);
    }

    public static RewardsSetupActions[] values() {
        return (RewardsSetupActions[]) h.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public final Screen getD() {
        return this.d;
    }
}
