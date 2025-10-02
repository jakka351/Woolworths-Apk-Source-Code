package au.com.woolworths.feature.shop.foryou.settings;

import android.content.Context;
import au.com.woolworths.android.onesite.utils.Extensions;
import au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsContract;
import au.com.woolworths.feature.shop.foryou.settings.analytics.RewardsSettingsActionData;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/foryou/settings/RewardsAuSettingsOption;", "Lau/com/woolworths/feature/shop/foryou/settings/RewardsSettingsOption;", "", "for-you_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class RewardsAuSettingsOption implements RewardsSettingsOption {
    public static final RewardsAuSettingsOption e;
    public static final /* synthetic */ RewardsAuSettingsOption[] f;
    public static final /* synthetic */ EnumEntries g;
    public final int d = ordinal();

    static {
        RewardsAuSettingsOption rewardsAuSettingsOption = new RewardsAuSettingsOption() { // from class: au.com.woolworths.feature.shop.foryou.settings.RewardsAuSettingsOption.HOW_IT_WORKS
            public final int h = R.string.rewards_settings_how_it_works;
            public final int i = android.R.attr.textColorPrimary;
            public final RewardsSettingsContract.Actions.NavigateToUrl j = new RewardsSettingsContract.Actions.NavigateToUrl("https://www.everyday.com.au/how-it-works.html", RewardsSettingsActionData.e);

            @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
            /* renamed from: b, reason: from getter */
            public final int getH() {
                return this.h;
            }

            @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
            /* renamed from: e, reason: from getter */
            public final int getI() {
                return this.i;
            }

            @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
            public final RewardsSettingsContract.Actions getAction() {
                return this.j;
            }
        };
        RewardsAuSettingsOption rewardsAuSettingsOption2 = new RewardsAuSettingsOption() { // from class: au.com.woolworths.feature.shop.foryou.settings.RewardsAuSettingsOption.REDEMPTION_SETTINGS
            public final int h = R.string.rewards_settings_redemption_settings;
            public final int i = android.R.attr.textColorPrimary;
            public final RewardsSettingsContract.Actions.DisplayRedemptionSettings j = RewardsSettingsContract.Actions.DisplayRedemptionSettings.f7139a;

            @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
            /* renamed from: b, reason: from getter */
            public final int getH() {
                return this.h;
            }

            @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
            /* renamed from: e, reason: from getter */
            public final int getI() {
                return this.i;
            }

            @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
            public final RewardsSettingsContract.Actions getAction() {
                return this.j;
            }
        };
        RewardsAuSettingsOption rewardsAuSettingsOption3 = new RewardsAuSettingsOption() { // from class: au.com.woolworths.feature.shop.foryou.settings.RewardsAuSettingsOption.HELP_AND_FAQS
            public final int h = R.string.rewards_settings_help_and_faqs;
            public final int i = android.R.attr.textColorPrimary;
            public final RewardsSettingsContract.Actions.NavigateToUrl j = new RewardsSettingsContract.Actions.NavigateToUrl("https://www.everyday.com.au/support.html", RewardsSettingsActionData.g);

            @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
            /* renamed from: b, reason: from getter */
            public final int getH() {
                return this.h;
            }

            @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
            /* renamed from: e, reason: from getter */
            public final int getI() {
                return this.i;
            }

            @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
            public final RewardsSettingsContract.Actions getAction() {
                return this.j;
            }
        };
        RewardsAuSettingsOption rewardsAuSettingsOption4 = new RewardsAuSettingsOption() { // from class: au.com.woolworths.feature.shop.foryou.settings.RewardsAuSettingsOption.TERMS_AND_CONDITIONS
            public final int h = R.string.rewards_settings_terms_and_conditions;
            public final int i = android.R.attr.textColorPrimary;
            public final RewardsSettingsContract.Actions.NavigateToUrl j = new RewardsSettingsContract.Actions.NavigateToUrl("https://www.everyday.com.au/terms.html", RewardsSettingsActionData.h);

            @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
            /* renamed from: b, reason: from getter */
            public final int getH() {
                return this.h;
            }

            @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
            /* renamed from: e, reason: from getter */
            public final int getI() {
                return this.i;
            }

            @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
            public final RewardsSettingsContract.Actions getAction() {
                return this.j;
            }
        };
        RewardsAuSettingsOption rewardsAuSettingsOption5 = new RewardsAuSettingsOption() { // from class: au.com.woolworths.feature.shop.foryou.settings.RewardsAuSettingsOption.REMOVE_REWARDS_CARDS
            public final int h = R.string.rewards_settings_remove_rewards_card;
            public final int i = R.attr.colorError;
            public final RewardsSettingsContract.Actions.RemoveRewardsCards j = RewardsSettingsContract.Actions.RemoveRewardsCards.f7141a;

            @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
            /* renamed from: b, reason: from getter */
            public final int getH() {
                return this.h;
            }

            @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
            /* renamed from: e, reason: from getter */
            public final int getI() {
                return this.i;
            }

            @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
            public final RewardsSettingsContract.Actions getAction() {
                return this.j;
            }
        };
        e = rewardsAuSettingsOption5;
        RewardsAuSettingsOption[] rewardsAuSettingsOptionArr = {rewardsAuSettingsOption, rewardsAuSettingsOption2, rewardsAuSettingsOption3, rewardsAuSettingsOption4, rewardsAuSettingsOption5};
        f = rewardsAuSettingsOptionArr;
        g = EnumEntriesKt.a(rewardsAuSettingsOptionArr);
    }

    public RewardsAuSettingsOption(String str, int i) {
    }

    public static RewardsAuSettingsOption valueOf(String str) {
        return (RewardsAuSettingsOption) Enum.valueOf(RewardsAuSettingsOption.class, str);
    }

    public static RewardsAuSettingsOption[] values() {
        return (RewardsAuSettingsOption[]) f.clone();
    }

    @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
    public final int c(Context context) {
        Intrinsics.h(context, "context");
        return Extensions.a(getI(), context);
    }

    @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
    public final boolean d() {
        return this != e;
    }

    @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
    /* renamed from: getId, reason: from getter */
    public final int getD() {
        return this.d;
    }
}
