package au.com.woolworths.feature.rewards.redemptionsettings.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/analytics/RewardsRedemptionSettingsActionData;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class RewardsRedemptionSettingsActionData implements Action {
    public static final RewardsRedemptionSettingsActionData e;
    public static final RewardsRedemptionSettingsActionData f;
    public static final RewardsRedemptionSettingsActionData g;
    public static final RewardsRedemptionSettingsActionData h;
    public static final RewardsRedemptionSettingsActionData i;
    public static final RewardsRedemptionSettingsActionData j;
    public static final RewardsRedemptionSettingsActionData k;
    public static final RewardsRedemptionSettingsActionData l;
    public static final /* synthetic */ RewardsRedemptionSettingsActionData[] m;
    public static final /* synthetic */ EnumEntries n;
    public final Screen d = Screens.A;

    static {
        RewardsRedemptionSettingsActionData rewardsRedemptionSettingsActionData = new RewardsRedemptionSettingsActionData() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.analytics.RewardsRedemptionSettingsActionData.REDEMPTION_SETTINGS_PRESENTED_BOTTOM_SHEET
            public final Category o = Category.k;
            public final String p = "Redemption Settings";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getP() {
                return this.p;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getO() {
                return this.o;
            }
        };
        e = rewardsRedemptionSettingsActionData;
        RewardsRedemptionSettingsActionData rewardsRedemptionSettingsActionData2 = new RewardsRedemptionSettingsActionData() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.analytics.RewardsRedemptionSettingsActionData.REDEMPTION_SETTINGS_PRESENTED_REWARDS_SETTING
            public final Category o = Category.B;
            public final String p = "Redemption settings presented";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getP() {
                return this.p;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getO() {
                return this.o;
            }
        };
        f = rewardsRedemptionSettingsActionData2;
        RewardsRedemptionSettingsActionData rewardsRedemptionSettingsActionData3 = new RewardsRedemptionSettingsActionData() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.analytics.RewardsRedemptionSettingsActionData.CHANGE_VIA_WEBSITE
            public final Category o = Category.u;
            public final String p = "Change Via Website";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getP() {
                return this.p;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getO() {
                return this.o;
            }
        };
        g = rewardsRedemptionSettingsActionData3;
        RewardsRedemptionSettingsActionData rewardsRedemptionSettingsActionData4 = new RewardsRedemptionSettingsActionData() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.analytics.RewardsRedemptionSettingsActionData.CANCEL_CHANGE_VIA_WEBSITE
            public final Category o = Category.m;
            public final String p = "Cancel";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getP() {
                return this.p;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getO() {
                return this.o;
            }
        };
        h = rewardsRedemptionSettingsActionData4;
        RewardsRedemptionSettingsActionData rewardsRedemptionSettingsActionData5 = new RewardsRedemptionSettingsActionData() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.analytics.RewardsRedemptionSettingsActionData.REDEMPTION_SETTINGS_NETWORK_ERROR
            public final Category o = Category.v;
            public final String p = "Network Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getP() {
                return this.p;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getO() {
                return this.o;
            }
        };
        i = rewardsRedemptionSettingsActionData5;
        RewardsRedemptionSettingsActionData rewardsRedemptionSettingsActionData6 = new RewardsRedemptionSettingsActionData() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.analytics.RewardsRedemptionSettingsActionData.REDEMPTION_SETTINGS_SERVER_ERROR
            public final Category o = Category.v;
            public final String p = "Server Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getP() {
                return this.p;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getO() {
                return this.o;
            }
        };
        j = rewardsRedemptionSettingsActionData6;
        RewardsRedemptionSettingsActionData rewardsRedemptionSettingsActionData7 = new RewardsRedemptionSettingsActionData() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.analytics.RewardsRedemptionSettingsActionData.REDEMPTION_SETTINGS_NETWORK_ERROR_TRY_AGAIN_CLICK
            public final Category o = Category.m;
            public final String p = "Network Error - Try Again";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getP() {
                return this.p;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getO() {
                return this.o;
            }
        };
        k = rewardsRedemptionSettingsActionData7;
        RewardsRedemptionSettingsActionData rewardsRedemptionSettingsActionData8 = new RewardsRedemptionSettingsActionData() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.analytics.RewardsRedemptionSettingsActionData.REDEMPTION_SETTINGS_SERVER_ERROR_TRY_AGAIN_CLICK
            public final Category o = Category.m;
            public final String p = "Server Error - Try Again";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getP() {
                return this.p;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getO() {
                return this.o;
            }
        };
        l = rewardsRedemptionSettingsActionData8;
        RewardsRedemptionSettingsActionData[] rewardsRedemptionSettingsActionDataArr = {rewardsRedemptionSettingsActionData, rewardsRedemptionSettingsActionData2, rewardsRedemptionSettingsActionData3, rewardsRedemptionSettingsActionData4, rewardsRedemptionSettingsActionData5, rewardsRedemptionSettingsActionData6, rewardsRedemptionSettingsActionData7, rewardsRedemptionSettingsActionData8};
        m = rewardsRedemptionSettingsActionDataArr;
        n = EnumEntriesKt.a(rewardsRedemptionSettingsActionDataArr);
    }

    public RewardsRedemptionSettingsActionData(String str, int i2) {
    }

    public static RewardsRedemptionSettingsActionData valueOf(String str) {
        return (RewardsRedemptionSettingsActionData) Enum.valueOf(RewardsRedemptionSettingsActionData.class, str);
    }

    public static RewardsRedemptionSettingsActionData[] values() {
        return (RewardsRedemptionSettingsActionData[]) m.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public final Screen getD() {
        return this.d;
    }
}
