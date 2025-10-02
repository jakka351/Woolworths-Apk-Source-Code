package au.com.woolworths.feature.rewards.account.callback;

import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/account/callback/RewardsCallbackUrlErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class RewardsCallbackUrlErrorState implements FullPageErrorCause {
    public static final RewardsCallbackUrlErrorState d;
    public static final RewardsCallbackUrlErrorState e;
    public static final /* synthetic */ RewardsCallbackUrlErrorState[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        RewardsCallbackUrlErrorState rewardsCallbackUrlErrorState = new RewardsCallbackUrlErrorState() { // from class: au.com.woolworths.feature.rewards.account.callback.RewardsCallbackUrlErrorState.NETWORK_ERROR
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
        d = rewardsCallbackUrlErrorState;
        RewardsCallbackUrlErrorState rewardsCallbackUrlErrorState2 = new RewardsCallbackUrlErrorState() { // from class: au.com.woolworths.feature.rewards.account.callback.RewardsCallbackUrlErrorState.SERVER_ERROR
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
        e = rewardsCallbackUrlErrorState2;
        RewardsCallbackUrlErrorState[] rewardsCallbackUrlErrorStateArr = {rewardsCallbackUrlErrorState, rewardsCallbackUrlErrorState2};
        f = rewardsCallbackUrlErrorStateArr;
        g = EnumEntriesKt.a(rewardsCallbackUrlErrorStateArr);
    }

    public static RewardsCallbackUrlErrorState valueOf(String str) {
        return (RewardsCallbackUrlErrorState) Enum.valueOf(RewardsCallbackUrlErrorState.class, str);
    }

    public static RewardsCallbackUrlErrorState[] values() {
        return (RewardsCallbackUrlErrorState[]) f.clone();
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
