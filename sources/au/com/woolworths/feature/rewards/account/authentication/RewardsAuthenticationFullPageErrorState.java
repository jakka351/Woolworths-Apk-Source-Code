package au.com.woolworths.feature.rewards.account.authentication;

import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationFullPageErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class RewardsAuthenticationFullPageErrorState implements FullPageErrorCause {
    public static final RewardsAuthenticationFullPageErrorState d;
    public static final RewardsAuthenticationFullPageErrorState e;
    public static final /* synthetic */ RewardsAuthenticationFullPageErrorState[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        RewardsAuthenticationFullPageErrorState rewardsAuthenticationFullPageErrorState = new RewardsAuthenticationFullPageErrorState() { // from class: au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationFullPageErrorState.NO_CONNECTIVITY
            @Override // au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationFullPageErrorState
            public final void a(RewardsAuthenticationViewModel rewardsAuthenticationViewModel) {
            }

            @Override // au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationFullPageErrorState
            public final void b(RewardsAuthenticationViewModel rewardsAuthenticationViewModel) {
                rewardsAuthenticationViewModel.g();
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getDrawableRes */
            public final int getG() {
                return R.drawable.empty_connection_error_old;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getMessage */
            public final Text getE() {
                return new ResText(R.string.rewards_authentication_connection_error_message);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getSecondaryActionRes */
            public final int getF() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getTitle */
            public final Text getD() {
                return new ResText(R.string.no_network_heading);
            }
        };
        d = rewardsAuthenticationFullPageErrorState;
        RewardsAuthenticationFullPageErrorState rewardsAuthenticationFullPageErrorState2 = new RewardsAuthenticationFullPageErrorState() { // from class: au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationFullPageErrorState.SERVER_ERROR
            @Override // au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationFullPageErrorState
            public final void a(RewardsAuthenticationViewModel rewardsAuthenticationViewModel) {
            }

            @Override // au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationFullPageErrorState
            public final void b(RewardsAuthenticationViewModel rewardsAuthenticationViewModel) {
                rewardsAuthenticationViewModel.g();
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getDrawableRes */
            public final int getG() {
                return R.drawable.empty_server_error_old;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getMessage */
            public final Text getE() {
                return new ResText(R.string.rewards_authentication_server_error_message);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getSecondaryActionRes */
            public final int getF() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getTitle */
            public final Text getD() {
                return new ResText(R.string.server_error_heading);
            }
        };
        e = rewardsAuthenticationFullPageErrorState2;
        RewardsAuthenticationFullPageErrorState[] rewardsAuthenticationFullPageErrorStateArr = {rewardsAuthenticationFullPageErrorState, rewardsAuthenticationFullPageErrorState2};
        f = rewardsAuthenticationFullPageErrorStateArr;
        g = EnumEntriesKt.a(rewardsAuthenticationFullPageErrorStateArr);
    }

    public static RewardsAuthenticationFullPageErrorState valueOf(String str) {
        return (RewardsAuthenticationFullPageErrorState) Enum.valueOf(RewardsAuthenticationFullPageErrorState.class, str);
    }

    public static RewardsAuthenticationFullPageErrorState[] values() {
        return (RewardsAuthenticationFullPageErrorState[]) f.clone();
    }

    public abstract void a(RewardsAuthenticationViewModel rewardsAuthenticationViewModel);

    public abstract void b(RewardsAuthenticationViewModel rewardsAuthenticationViewModel);

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final int getImageTintRes() {
        return R.color.rewards_color_primary;
    }
}
