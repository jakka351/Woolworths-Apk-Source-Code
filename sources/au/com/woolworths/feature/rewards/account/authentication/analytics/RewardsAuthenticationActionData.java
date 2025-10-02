package au.com.woolworths.feature.rewards.account.authentication.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/account/authentication/analytics/RewardsAuthenticationActionData;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class RewardsAuthenticationActionData implements Action {
    public static final RewardsAuthenticationActionData e;
    public static final RewardsAuthenticationActionData f;
    public static final RewardsAuthenticationActionData g;
    public static final RewardsAuthenticationActionData h;
    public static final RewardsAuthenticationActionData i;
    public static final /* synthetic */ RewardsAuthenticationActionData[] j;
    public static final /* synthetic */ EnumEntries k;
    public final Screen d = Screens.y;

    static {
        RewardsAuthenticationActionData rewardsAuthenticationActionData = new RewardsAuthenticationActionData() { // from class: au.com.woolworths.feature.rewards.account.authentication.analytics.RewardsAuthenticationActionData.LINK_ERROR
            public final Category l = Category.v;
            public final String m = "Failed to link Rewards card";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getM() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getL() {
                return this.l;
            }
        };
        e = rewardsAuthenticationActionData;
        RewardsAuthenticationActionData rewardsAuthenticationActionData2 = new RewardsAuthenticationActionData() { // from class: au.com.woolworths.feature.rewards.account.authentication.analytics.RewardsAuthenticationActionData.LINK_ERROR_OK
            public final Category l = Category.m;
            public final String m = "Rewards SignUp Error – OK";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getM() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getL() {
                return this.l;
            }
        };
        f = rewardsAuthenticationActionData2;
        RewardsAuthenticationActionData rewardsAuthenticationActionData3 = new RewardsAuthenticationActionData() { // from class: au.com.woolworths.feature.rewards.account.authentication.analytics.RewardsAuthenticationActionData.SERVER_ERROR
            public final Category l = Category.v;
            public final String m = "Server Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getM() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getL() {
                return this.l;
            }
        };
        g = rewardsAuthenticationActionData3;
        RewardsAuthenticationActionData rewardsAuthenticationActionData4 = new RewardsAuthenticationActionData() { // from class: au.com.woolworths.feature.rewards.account.authentication.analytics.RewardsAuthenticationActionData.NETWORK_ERROR
            public final Category l = Category.v;
            public final String m = "Network Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getM() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getL() {
                return this.l;
            }
        };
        h = rewardsAuthenticationActionData4;
        RewardsAuthenticationActionData rewardsAuthenticationActionData5 = new RewardsAuthenticationActionData() { // from class: au.com.woolworths.feature.rewards.account.authentication.analytics.RewardsAuthenticationActionData.TRY_AGAIN
            public final Category l = Category.m;
            public final String m = "Try Again";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getM() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getL() {
                return this.l;
            }
        };
        i = rewardsAuthenticationActionData5;
        RewardsAuthenticationActionData[] rewardsAuthenticationActionDataArr = {rewardsAuthenticationActionData, rewardsAuthenticationActionData2, rewardsAuthenticationActionData3, rewardsAuthenticationActionData4, rewardsAuthenticationActionData5};
        j = rewardsAuthenticationActionDataArr;
        k = EnumEntriesKt.a(rewardsAuthenticationActionDataArr);
    }

    public RewardsAuthenticationActionData(String str, int i2) {
    }

    public static RewardsAuthenticationActionData valueOf(String str) {
        return (RewardsAuthenticationActionData) Enum.valueOf(RewardsAuthenticationActionData.class, str);
    }

    public static RewardsAuthenticationActionData[] values() {
        return (RewardsAuthenticationActionData[]) j.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public final Screen getD() {
        return this.d;
    }
}
