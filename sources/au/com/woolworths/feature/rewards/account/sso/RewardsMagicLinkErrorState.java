package au.com.woolworths.feature.rewards.account.sso;

import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/account/sso/RewardsMagicLinkErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class RewardsMagicLinkErrorState implements FullPageErrorCause {
    public static final RewardsMagicLinkErrorState d;
    public static final RewardsMagicLinkErrorState e;
    public static final /* synthetic */ RewardsMagicLinkErrorState[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        RewardsMagicLinkErrorState rewardsMagicLinkErrorState = new RewardsMagicLinkErrorState() { // from class: au.com.woolworths.feature.rewards.account.sso.RewardsMagicLinkErrorState.NETWORK_ERROR
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
        d = rewardsMagicLinkErrorState;
        RewardsMagicLinkErrorState rewardsMagicLinkErrorState2 = new RewardsMagicLinkErrorState() { // from class: au.com.woolworths.feature.rewards.account.sso.RewardsMagicLinkErrorState.SERVER_ERROR
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
        e = rewardsMagicLinkErrorState2;
        RewardsMagicLinkErrorState[] rewardsMagicLinkErrorStateArr = {rewardsMagicLinkErrorState, rewardsMagicLinkErrorState2};
        f = rewardsMagicLinkErrorStateArr;
        g = EnumEntriesKt.a(rewardsMagicLinkErrorStateArr);
    }

    public static RewardsMagicLinkErrorState valueOf(String str) {
        return (RewardsMagicLinkErrorState) Enum.valueOf(RewardsMagicLinkErrorState.class, str);
    }

    public static RewardsMagicLinkErrorState[] values() {
        return (RewardsMagicLinkErrorState[]) f.clone();
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final int getDrawableRes() {
        return 0;
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final int getImageTintRes() {
        return R.color.rewards_color_primary;
    }
}
