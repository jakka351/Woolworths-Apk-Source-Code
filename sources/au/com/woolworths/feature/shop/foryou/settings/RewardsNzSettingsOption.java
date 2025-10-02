package au.com.woolworths.feature.shop.foryou.settings;

import android.content.Context;
import au.com.woolworths.android.onesite.utils.Extensions;
import au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsContract;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/foryou/settings/RewardsNzSettingsOption;", "Lau/com/woolworths/feature/shop/foryou/settings/RewardsSettingsOption;", "", "for-you_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class RewardsNzSettingsOption implements RewardsSettingsOption {
    public static final /* synthetic */ RewardsNzSettingsOption[] e;
    public static final /* synthetic */ EnumEntries f;
    public final int d = ordinal();

    static {
        RewardsNzSettingsOption[] rewardsNzSettingsOptionArr = {new RewardsNzSettingsOption() { // from class: au.com.woolworths.feature.shop.foryou.settings.RewardsNzSettingsOption.VISIT_EDR_WEBSITE
            public final int g = R.string.nz_rewards_settings_visit_edr_website;
            public final int h = android.R.attr.textColorPrimary;
            public final RewardsSettingsContract.Actions.NavigateToUrl i = new RewardsSettingsContract.Actions.NavigateToUrl("https://www.everydayrewards.co.nz/");

            @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
            /* renamed from: b, reason: from getter */
            public final int getG() {
                return this.g;
            }

            @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
            /* renamed from: e, reason: from getter */
            public final int getH() {
                return this.h;
            }

            @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
            public final RewardsSettingsContract.Actions getAction() {
                return this.i;
            }
        }, new RewardsNzSettingsOption() { // from class: au.com.woolworths.feature.shop.foryou.settings.RewardsNzSettingsOption.TRACK_POINTS
            public final int g = R.string.nz_rewards_settings_track_points;
            public final int h = android.R.attr.textColorPrimary;
            public final RewardsSettingsContract.Actions.NavigateToUrl i = new RewardsSettingsContract.Actions.NavigateToUrl("https://www.everydayrewards.co.nz/account/points-and-activity");

            @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
            /* renamed from: b, reason: from getter */
            public final int getG() {
                return this.g;
            }

            @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
            /* renamed from: e, reason: from getter */
            public final int getH() {
                return this.h;
            }

            @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
            public final RewardsSettingsContract.Actions getAction() {
                return this.i;
            }
        }, new RewardsNzSettingsOption() { // from class: au.com.woolworths.feature.shop.foryou.settings.RewardsNzSettingsOption.YOUR_REWARDS_CHOICE
            public final int g = R.string.nz_rewards_settings_your_rewards_choice;
            public final int h = android.R.attr.textColorPrimary;
            public final RewardsSettingsContract.Actions.NavigateToUrl i = new RewardsSettingsContract.Actions.NavigateToUrl("https://www.everydayrewards.co.nz/account/rewards-choice");

            @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
            /* renamed from: b, reason: from getter */
            public final int getG() {
                return this.g;
            }

            @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
            /* renamed from: e, reason: from getter */
            public final int getH() {
                return this.h;
            }

            @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
            public final RewardsSettingsContract.Actions getAction() {
                return this.i;
            }
        }, new RewardsNzSettingsOption() { // from class: au.com.woolworths.feature.shop.foryou.settings.RewardsNzSettingsOption.MANAGER_MY_CARD
            public final int g = R.string.nz_rewards_settings_manager_my_card;
            public final int h = android.R.attr.textColorPrimary;
            public final RewardsSettingsContract.Actions.NavigateToUrl i = new RewardsSettingsContract.Actions.NavigateToUrl("https://www.everydayrewards.co.nz/account/card");

            @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
            /* renamed from: b, reason: from getter */
            public final int getG() {
                return this.g;
            }

            @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
            /* renamed from: e, reason: from getter */
            public final int getH() {
                return this.h;
            }

            @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
            public final RewardsSettingsContract.Actions getAction() {
                return this.i;
            }
        }, new RewardsNzSettingsOption() { // from class: au.com.woolworths.feature.shop.foryou.settings.RewardsNzSettingsOption.HOW_IT_WORKS
            public final int g = R.string.nz_rewards_settings_how_it_works;
            public final int h = android.R.attr.textColorPrimary;
            public final RewardsSettingsContract.Actions.NavigateToUrl i = new RewardsSettingsContract.Actions.NavigateToUrl("https://www.everydayrewards.co.nz/how-it-works");

            @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
            /* renamed from: b, reason: from getter */
            public final int getG() {
                return this.g;
            }

            @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
            /* renamed from: e, reason: from getter */
            public final int getH() {
                return this.h;
            }

            @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
            public final RewardsSettingsContract.Actions getAction() {
                return this.i;
            }
        }, new RewardsNzSettingsOption() { // from class: au.com.woolworths.feature.shop.foryou.settings.RewardsNzSettingsOption.HELP_AND_FAQS
            public final int g = R.string.rewards_settings_help_and_faqs;
            public final int h = android.R.attr.textColorPrimary;
            public final RewardsSettingsContract.Actions.NavigateToUrl i = new RewardsSettingsContract.Actions.NavigateToUrl("https://www.everydayrewards.co.nz/help");

            @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
            /* renamed from: b, reason: from getter */
            public final int getG() {
                return this.g;
            }

            @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
            /* renamed from: e, reason: from getter */
            public final int getH() {
                return this.h;
            }

            @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
            public final RewardsSettingsContract.Actions getAction() {
                return this.i;
            }
        }, new RewardsNzSettingsOption() { // from class: au.com.woolworths.feature.shop.foryou.settings.RewardsNzSettingsOption.TERMS_AND_CONDITIONS
            public final int g = R.string.nz_rewards_settings_terms_and_conditions;
            public final int h = android.R.attr.textColorPrimary;
            public final RewardsSettingsContract.Actions.NavigateToUrl i = new RewardsSettingsContract.Actions.NavigateToUrl("https://www.everydayrewards.co.nz/terms-and-conditions");

            @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
            /* renamed from: b, reason: from getter */
            public final int getG() {
                return this.g;
            }

            @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
            /* renamed from: e, reason: from getter */
            public final int getH() {
                return this.h;
            }

            @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
            public final RewardsSettingsContract.Actions getAction() {
                return this.i;
            }
        }};
        e = rewardsNzSettingsOptionArr;
        f = EnumEntriesKt.a(rewardsNzSettingsOptionArr);
    }

    public RewardsNzSettingsOption(String str, int i) {
    }

    public static RewardsNzSettingsOption valueOf(String str) {
        return (RewardsNzSettingsOption) Enum.valueOf(RewardsNzSettingsOption.class, str);
    }

    public static RewardsNzSettingsOption[] values() {
        return (RewardsNzSettingsOption[]) e.clone();
    }

    @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
    public final int c(Context context) {
        Intrinsics.h(context, "context");
        return Extensions.a(getH(), context);
    }

    @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
    public final boolean d() {
        return true;
    }

    @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption
    /* renamed from: getId, reason: from getter */
    public final int getD() {
        return this.d;
    }
}
