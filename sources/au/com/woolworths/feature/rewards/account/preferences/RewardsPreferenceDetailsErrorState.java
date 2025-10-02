package au.com.woolworths.feature.rewards.account.preferences;

import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Deprecated
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class RewardsPreferenceDetailsErrorState implements FullPageErrorCause {
    public static final RewardsPreferenceDetailsErrorState d;
    public static final RewardsPreferenceDetailsErrorState e;
    public static final RewardsPreferenceDetailsErrorState f;
    public static final /* synthetic */ RewardsPreferenceDetailsErrorState[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        RewardsPreferenceDetailsErrorState rewardsPreferenceDetailsErrorState = new RewardsPreferenceDetailsErrorState() { // from class: au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsErrorState.NETWORK_ERROR
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.rewards_empty_connection_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.generic_network_error_subtitle);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.no_network_heading);
            }
        };
        d = rewardsPreferenceDetailsErrorState;
        RewardsPreferenceDetailsErrorState rewardsPreferenceDetailsErrorState2 = new RewardsPreferenceDetailsErrorState() { // from class: au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsErrorState.SERVER_ERROR
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.rewards_empty_server_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.generic_server_error_subtitle);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.server_error_heading);
            }
        };
        e = rewardsPreferenceDetailsErrorState2;
        RewardsPreferenceDetailsErrorState rewardsPreferenceDetailsErrorState3 = new RewardsPreferenceDetailsErrorState() { // from class: au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsErrorState.SETTING_ERROR
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.ic_push_settings;
            }

            @Override // au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsErrorState, au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getImageTintRes() {
                return 0;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.au_rewards_push_setting_error_subtitle);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return R.string.au_rewards_push_setting_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.rewards_push_setting_error_heading);
            }
        };
        f = rewardsPreferenceDetailsErrorState3;
        RewardsPreferenceDetailsErrorState[] rewardsPreferenceDetailsErrorStateArr = {rewardsPreferenceDetailsErrorState, rewardsPreferenceDetailsErrorState2, rewardsPreferenceDetailsErrorState3};
        g = rewardsPreferenceDetailsErrorStateArr;
        h = EnumEntriesKt.a(rewardsPreferenceDetailsErrorStateArr);
    }

    public static RewardsPreferenceDetailsErrorState valueOf(String str) {
        return (RewardsPreferenceDetailsErrorState) Enum.valueOf(RewardsPreferenceDetailsErrorState.class, str);
    }

    public static RewardsPreferenceDetailsErrorState[] values() {
        return (RewardsPreferenceDetailsErrorState[]) g.clone();
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public int getImageTintRes() {
        return R.color.rewards_color_primary;
    }
}
