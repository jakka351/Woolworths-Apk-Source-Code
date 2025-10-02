package com.woolworths.scanlibrary.ui.reward.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import com.woolworths.scanlibrary.analytics.Screens;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/reward/analytics/RewardAnalyticsData;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class RewardAnalyticsData implements Action {
    public static final RewardAnalyticsData e;
    public static final RewardAnalyticsData f;
    public static final /* synthetic */ RewardAnalyticsData[] g;
    public static final /* synthetic */ EnumEntries h;
    public final Screens d = Screens.i;

    static {
        RewardAnalyticsData rewardAnalyticsData = new RewardAnalyticsData() { // from class: com.woolworths.scanlibrary.ui.reward.analytics.RewardAnalyticsData.LINK_REWARD
            public final Category i = Category.D;
            public final String j = "Link Everyday Rewards card";

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
        e = rewardAnalyticsData;
        RewardAnalyticsData rewardAnalyticsData2 = new RewardAnalyticsData() { // from class: com.woolworths.scanlibrary.ui.reward.analytics.RewardAnalyticsData.JOIN_REWARD
            public final Category i = Category.D;
            public final String j = "Join Everyday Rewards";

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
        f = rewardAnalyticsData2;
        RewardAnalyticsData[] rewardAnalyticsDataArr = {rewardAnalyticsData, rewardAnalyticsData2};
        g = rewardAnalyticsDataArr;
        h = EnumEntriesKt.a(rewardAnalyticsDataArr);
    }

    public RewardAnalyticsData(String str, int i) {
    }

    public static RewardAnalyticsData valueOf(String str) {
        return (RewardAnalyticsData) Enum.valueOf(RewardAnalyticsData.class, str);
    }

    public static RewardAnalyticsData[] values() {
        return (RewardAnalyticsData[]) g.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
