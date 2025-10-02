package au.com.woolworths.feature.rewards.account.settings;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsActionDataOld;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class AccountSettingsActionDataOld implements Action {
    public static final AccountSettingsActionDataOld e;
    public static final AccountSettingsActionDataOld f;
    public static final AccountSettingsActionDataOld g;
    public static final /* synthetic */ AccountSettingsActionDataOld[] h;
    public static final /* synthetic */ EnumEntries i;
    public final Screens d = Screens.D;

    static {
        AccountSettingsActionDataOld accountSettingsActionDataOld = new AccountSettingsActionDataOld() { // from class: au.com.woolworths.feature.rewards.account.settings.AccountSettingsActionDataOld.EXTERNAL_LINK_CLICK
            public final Category j = Category.m;
            public final String k = "External Link";

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
        e = accountSettingsActionDataOld;
        AccountSettingsActionDataOld accountSettingsActionDataOld2 = new AccountSettingsActionDataOld() { // from class: au.com.woolworths.feature.rewards.account.settings.AccountSettingsActionDataOld.INSTORE_WIFI_LINK_CLICK
            public final Category j = Category.m;
            public final String k = "Free in-store Wifi";

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
        f = accountSettingsActionDataOld2;
        AccountSettingsActionDataOld accountSettingsActionDataOld3 = new AccountSettingsActionDataOld() { // from class: au.com.woolworths.feature.rewards.account.settings.AccountSettingsActionDataOld.LOGOUT_CLICK
            public final Category j = Category.m;
            public final String k = "Log Out";

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
        g = accountSettingsActionDataOld3;
        AccountSettingsActionDataOld[] accountSettingsActionDataOldArr = {accountSettingsActionDataOld, accountSettingsActionDataOld2, accountSettingsActionDataOld3, new AccountSettingsActionDataOld() { // from class: au.com.woolworths.feature.rewards.account.settings.AccountSettingsActionDataOld.POINTS_BALANCE_CLICK
            public final Category j = Category.m;
            public final String k = "Points Balance";

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
        }};
        h = accountSettingsActionDataOldArr;
        i = EnumEntriesKt.a(accountSettingsActionDataOldArr);
    }

    public AccountSettingsActionDataOld(String str, int i2) {
    }

    public static AccountSettingsActionDataOld valueOf(String str) {
        return (AccountSettingsActionDataOld) Enum.valueOf(AccountSettingsActionDataOld.class, str);
    }

    public static AccountSettingsActionDataOld[] values() {
        return (AccountSettingsActionDataOld[]) h.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
