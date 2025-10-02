package au.com.woolworths.android.onesite.branch;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/branch/BranchAnalyticsActionData;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class BranchAnalyticsActionData implements Action {
    public static final BranchAnalyticsActionData d;
    public static final BranchAnalyticsActionData e;
    public static final /* synthetic */ BranchAnalyticsActionData[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        BranchAnalyticsActionData branchAnalyticsActionData = new BranchAnalyticsActionData() { // from class: au.com.woolworths.android.onesite.branch.BranchAnalyticsActionData.SHOP_BRANCH_ANALYTICS_CLICK
            public final Category h = Category.s;
            public final String i = "";
            public final Screens j = Screens.J;

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getI() {
                return this.i;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getH() {
                return this.h;
            }

            @Override // au.com.woolworths.android.onesite.analytics.Action
            /* renamed from: f */
            public final Screen getD() {
                return this.j;
            }
        };
        d = branchAnalyticsActionData;
        BranchAnalyticsActionData branchAnalyticsActionData2 = new BranchAnalyticsActionData() { // from class: au.com.woolworths.android.onesite.branch.BranchAnalyticsActionData.REWARDS_BRANCH_ANALYTICS_CLICK
            public final Category h = Category.s;
            public final String i = "";
            public final Screens j = Screens.x;

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getI() {
                return this.i;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getH() {
                return this.h;
            }

            @Override // au.com.woolworths.android.onesite.analytics.Action
            /* renamed from: f */
            public final Screen getD() {
                return this.j;
            }
        };
        e = branchAnalyticsActionData2;
        BranchAnalyticsActionData[] branchAnalyticsActionDataArr = {branchAnalyticsActionData, branchAnalyticsActionData2};
        f = branchAnalyticsActionDataArr;
        g = EnumEntriesKt.a(branchAnalyticsActionDataArr);
    }

    public static BranchAnalyticsActionData valueOf(String str) {
        return (BranchAnalyticsActionData) Enum.valueOf(BranchAnalyticsActionData.class, str);
    }

    public static BranchAnalyticsActionData[] values() {
        return (BranchAnalyticsActionData[]) f.clone();
    }
}
