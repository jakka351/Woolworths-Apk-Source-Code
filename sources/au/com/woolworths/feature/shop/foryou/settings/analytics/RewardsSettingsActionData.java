package au.com.woolworths.feature.shop.foryou.settings.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/foryou/settings/analytics/RewardsSettingsActionData;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "for-you_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class RewardsSettingsActionData implements Action {
    public static final RewardsSettingsActionData e;
    public static final RewardsSettingsActionData f;
    public static final RewardsSettingsActionData g;
    public static final RewardsSettingsActionData h;
    public static final RewardsSettingsActionData i;
    public static final RewardsSettingsActionData j;
    public static final RewardsSettingsActionData k;
    public static final RewardsSettingsActionData l;
    public static final RewardsSettingsActionData m;
    public static final RewardsSettingsActionData n;
    public static final RewardsSettingsActionData o;
    public static final RewardsSettingsActionData p;
    public static final /* synthetic */ RewardsSettingsActionData[] q;
    public static final /* synthetic */ EnumEntries r;
    public final Screen d = Screens.B;

    static {
        RewardsSettingsActionData rewardsSettingsActionData = new RewardsSettingsActionData() { // from class: au.com.woolworths.feature.shop.foryou.settings.analytics.RewardsSettingsActionData.HOW_IT_WORKS
            public final Category s = Category.m;
            public final String t = "How It Works";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.t;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.s;
            }
        };
        e = rewardsSettingsActionData;
        RewardsSettingsActionData rewardsSettingsActionData2 = new RewardsSettingsActionData() { // from class: au.com.woolworths.feature.shop.foryou.settings.analytics.RewardsSettingsActionData.REDEMPTION_SETTINGS
            public final Category s = Category.m;
            public final String t = "Redemption Settings";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.t;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.s;
            }
        };
        f = rewardsSettingsActionData2;
        RewardsSettingsActionData rewardsSettingsActionData3 = new RewardsSettingsActionData() { // from class: au.com.woolworths.feature.shop.foryou.settings.analytics.RewardsSettingsActionData.HELP_AND_FAQS
            public final Category s = Category.m;
            public final String t = "Help & FAQs";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.t;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.s;
            }
        };
        g = rewardsSettingsActionData3;
        RewardsSettingsActionData rewardsSettingsActionData4 = new RewardsSettingsActionData() { // from class: au.com.woolworths.feature.shop.foryou.settings.analytics.RewardsSettingsActionData.TERMS_AND_CONDITIONS
            public final Category s = Category.m;
            public final String t = "Terms and Conditions";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.t;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.s;
            }
        };
        h = rewardsSettingsActionData4;
        RewardsSettingsActionData rewardsSettingsActionData5 = new RewardsSettingsActionData() { // from class: au.com.woolworths.feature.shop.foryou.settings.analytics.RewardsSettingsActionData.REMOVE_REWARDS_CARD
            public final Category s = Category.m;
            public final String t = "Remove Rewards Card";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.t;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.s;
            }
        };
        i = rewardsSettingsActionData5;
        RewardsSettingsActionData rewardsSettingsActionData6 = new RewardsSettingsActionData() { // from class: au.com.woolworths.feature.shop.foryou.settings.analytics.RewardsSettingsActionData.REMOVE_REWARDS_CARD_DIALOG
            public final Category s = Category.u;
            public final String t = "Remove Rewards Card";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.t;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.s;
            }
        };
        j = rewardsSettingsActionData6;
        RewardsSettingsActionData rewardsSettingsActionData7 = new RewardsSettingsActionData() { // from class: au.com.woolworths.feature.shop.foryou.settings.analytics.RewardsSettingsActionData.REMOVE_REWARDS_CARD_CONFIRMED
            public final Category s = Category.m;
            public final String t = "Remove";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.t;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.s;
            }
        };
        k = rewardsSettingsActionData7;
        RewardsSettingsActionData rewardsSettingsActionData8 = new RewardsSettingsActionData() { // from class: au.com.woolworths.feature.shop.foryou.settings.analytics.RewardsSettingsActionData.REMOVE_REWARDS_CARD_CANCEL
            public final Category s = Category.m;
            public final String t = "Cancel";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.t;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.s;
            }
        };
        l = rewardsSettingsActionData8;
        RewardsSettingsActionData rewardsSettingsActionData9 = new RewardsSettingsActionData() { // from class: au.com.woolworths.feature.shop.foryou.settings.analytics.RewardsSettingsActionData.REMOVE_REWARDS_CARD_NETWORK_ERROR
            public final Category s = Category.u;
            public final String t = "Network Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.t;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.s;
            }
        };
        m = rewardsSettingsActionData9;
        RewardsSettingsActionData rewardsSettingsActionData10 = new RewardsSettingsActionData() { // from class: au.com.woolworths.feature.shop.foryou.settings.analytics.RewardsSettingsActionData.REMOVE_REWARDS_CARD_NETWORK_ERROR_CONFIRM_CLICK
            public final Category s = Category.m;
            public final String t = "Network Error: Ok";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.t;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.s;
            }
        };
        n = rewardsSettingsActionData10;
        RewardsSettingsActionData rewardsSettingsActionData11 = new RewardsSettingsActionData() { // from class: au.com.woolworths.feature.shop.foryou.settings.analytics.RewardsSettingsActionData.REMOVE_REWARDS_CARD_SERVER_ERROR
            public final Category s = Category.u;
            public final String t = "Server Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.t;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.s;
            }
        };
        o = rewardsSettingsActionData11;
        RewardsSettingsActionData rewardsSettingsActionData12 = new RewardsSettingsActionData() { // from class: au.com.woolworths.feature.shop.foryou.settings.analytics.RewardsSettingsActionData.REMOVE_REWARDS_CARD_SERVER_ERROR_CONFIRM_CLICK
            public final Category s = Category.m;
            public final String t = "Server Error: Ok";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.t;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.s;
            }
        };
        p = rewardsSettingsActionData12;
        RewardsSettingsActionData[] rewardsSettingsActionDataArr = {rewardsSettingsActionData, rewardsSettingsActionData2, rewardsSettingsActionData3, rewardsSettingsActionData4, rewardsSettingsActionData5, rewardsSettingsActionData6, rewardsSettingsActionData7, rewardsSettingsActionData8, rewardsSettingsActionData9, rewardsSettingsActionData10, rewardsSettingsActionData11, rewardsSettingsActionData12};
        q = rewardsSettingsActionDataArr;
        r = EnumEntriesKt.a(rewardsSettingsActionDataArr);
    }

    public RewardsSettingsActionData(String str, int i2) {
    }

    public static RewardsSettingsActionData valueOf(String str) {
        return (RewardsSettingsActionData) Enum.valueOf(RewardsSettingsActionData.class, str);
    }

    public static RewardsSettingsActionData[] values() {
        return (RewardsSettingsActionData[]) q.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public final Screen getD() {
        return this.d;
    }
}
