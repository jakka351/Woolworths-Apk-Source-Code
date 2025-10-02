package au.com.woolworths.feature.rewards.account.preferences.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/analytics/RewardsPreferenceDetailsActionData;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class RewardsPreferenceDetailsActionData implements Action {
    public static final RewardsPreferenceDetailsActionData f;
    public static final RewardsPreferenceDetailsActionData g;
    public static final /* synthetic */ RewardsPreferenceDetailsActionData[] h;
    public static final /* synthetic */ EnumEntries i;
    public Screens d = Screens.I;
    public String e = "";

    static {
        RewardsPreferenceDetailsActionData rewardsPreferenceDetailsActionData = new RewardsPreferenceDetailsActionData() { // from class: au.com.woolworths.feature.rewards.account.preferences.analytics.RewardsPreferenceDetailsActionData.PREFS_TOGGLE_ON
            public final Category j = Category.i0;

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.j;
            }
        };
        f = rewardsPreferenceDetailsActionData;
        RewardsPreferenceDetailsActionData rewardsPreferenceDetailsActionData2 = new RewardsPreferenceDetailsActionData() { // from class: au.com.woolworths.feature.rewards.account.preferences.analytics.RewardsPreferenceDetailsActionData.PREFS_TOGGLE_OFF
            public final Category j = Category.h0;

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.j;
            }
        };
        g = rewardsPreferenceDetailsActionData2;
        RewardsPreferenceDetailsActionData[] rewardsPreferenceDetailsActionDataArr = {rewardsPreferenceDetailsActionData, rewardsPreferenceDetailsActionData2};
        h = rewardsPreferenceDetailsActionDataArr;
        i = EnumEntriesKt.a(rewardsPreferenceDetailsActionDataArr);
    }

    public RewardsPreferenceDetailsActionData(String str, int i2) {
    }

    public static RewardsPreferenceDetailsActionData valueOf(String str) {
        return (RewardsPreferenceDetailsActionData) Enum.valueOf(RewardsPreferenceDetailsActionData.class, str);
    }

    public static RewardsPreferenceDetailsActionData[] values() {
        return (RewardsPreferenceDetailsActionData[]) h.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.BaseAction
    /* renamed from: a, reason: from getter */
    public final String getE() {
        return this.e;
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
