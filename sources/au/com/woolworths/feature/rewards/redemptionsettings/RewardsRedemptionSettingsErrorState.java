package au.com.woolworths.feature.rewards.redemptionsettings;

import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class RewardsRedemptionSettingsErrorState implements FullPageErrorCause {
    public static final RewardsRedemptionSettingsErrorState d;
    public static final RewardsRedemptionSettingsErrorState e;
    public static final /* synthetic */ RewardsRedemptionSettingsErrorState[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        RewardsRedemptionSettingsErrorState rewardsRedemptionSettingsErrorState = new RewardsRedemptionSettingsErrorState() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsErrorState.NO_CONNECTIVITY
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return 0;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(com.woolworths.R.string.rewards_redemption_settings_connection_error);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return com.woolworths.R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(com.woolworths.R.string.no_network_heading);
            }
        };
        d = rewardsRedemptionSettingsErrorState;
        RewardsRedemptionSettingsErrorState rewardsRedemptionSettingsErrorState2 = new RewardsRedemptionSettingsErrorState() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsErrorState.SERVER_ERROR
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return 0;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(com.woolworths.R.string.rewards_redemption_settings_unable_to_load_results);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return com.woolworths.R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(com.woolworths.R.string.server_error_heading);
            }
        };
        e = rewardsRedemptionSettingsErrorState2;
        RewardsRedemptionSettingsErrorState[] rewardsRedemptionSettingsErrorStateArr = {rewardsRedemptionSettingsErrorState, rewardsRedemptionSettingsErrorState2};
        f = rewardsRedemptionSettingsErrorStateArr;
        g = EnumEntriesKt.a(rewardsRedemptionSettingsErrorStateArr);
    }

    public static RewardsRedemptionSettingsErrorState valueOf(String str) {
        return (RewardsRedemptionSettingsErrorState) Enum.valueOf(RewardsRedemptionSettingsErrorState.class, str);
    }

    public static RewardsRedemptionSettingsErrorState[] values() {
        return (RewardsRedemptionSettingsErrorState[]) f.clone();
    }
}
