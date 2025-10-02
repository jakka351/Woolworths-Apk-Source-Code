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
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsMedalliaActionDataOld;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class AccountSettingsMedalliaActionDataOld implements Action {
    public static final AccountSettingsMedalliaActionDataOld e;
    public static final AccountSettingsMedalliaActionDataOld f;
    public static final AccountSettingsMedalliaActionDataOld g;
    public static final AccountSettingsMedalliaActionDataOld h;
    public static final /* synthetic */ AccountSettingsMedalliaActionDataOld[] i;
    public static final /* synthetic */ EnumEntries j;
    public final Screens d = Screens.E;

    static {
        AccountSettingsMedalliaActionDataOld accountSettingsMedalliaActionDataOld = new AccountSettingsMedalliaActionDataOld() { // from class: au.com.woolworths.feature.rewards.account.settings.AccountSettingsMedalliaActionDataOld.MEDALLIA_SUBMIT_IMPRESSION
            public final Category k = Category.B;
            public final String l = "formDidSubmit";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.l;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.k;
            }
        };
        e = accountSettingsMedalliaActionDataOld;
        AccountSettingsMedalliaActionDataOld accountSettingsMedalliaActionDataOld2 = new AccountSettingsMedalliaActionDataOld() { // from class: au.com.woolworths.feature.rewards.account.settings.AccountSettingsMedalliaActionDataOld.MEDALLIA_DISMISS_IMPRESSION
            public final Category k = Category.B;
            public final String l = "formDidDismiss";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.l;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.k;
            }
        };
        f = accountSettingsMedalliaActionDataOld2;
        AccountSettingsMedalliaActionDataOld accountSettingsMedalliaActionDataOld3 = new AccountSettingsMedalliaActionDataOld() { // from class: au.com.woolworths.feature.rewards.account.settings.AccountSettingsMedalliaActionDataOld.MEDALLIA_CLOSE_IMPRESSION
            public final Category k = Category.B;
            public final String l = "formDidClose";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.l;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.k;
            }
        };
        g = accountSettingsMedalliaActionDataOld3;
        AccountSettingsMedalliaActionDataOld accountSettingsMedalliaActionDataOld4 = new AccountSettingsMedalliaActionDataOld() { // from class: au.com.woolworths.feature.rewards.account.settings.AccountSettingsMedalliaActionDataOld.MEDALLIA_THANK_YOU_IMPRESSION
            public final Category k = Category.B;
            public final String l = "formDidThankYouPrompt";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.l;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.k;
            }
        };
        h = accountSettingsMedalliaActionDataOld4;
        AccountSettingsMedalliaActionDataOld[] accountSettingsMedalliaActionDataOldArr = {accountSettingsMedalliaActionDataOld, accountSettingsMedalliaActionDataOld2, accountSettingsMedalliaActionDataOld3, accountSettingsMedalliaActionDataOld4};
        i = accountSettingsMedalliaActionDataOldArr;
        j = EnumEntriesKt.a(accountSettingsMedalliaActionDataOldArr);
    }

    public AccountSettingsMedalliaActionDataOld(String str, int i2) {
    }

    public static AccountSettingsMedalliaActionDataOld valueOf(String str) {
        return (AccountSettingsMedalliaActionDataOld) Enum.valueOf(AccountSettingsMedalliaActionDataOld.class, str);
    }

    public static AccountSettingsMedalliaActionDataOld[] values() {
        return (AccountSettingsMedalliaActionDataOld[]) i.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
