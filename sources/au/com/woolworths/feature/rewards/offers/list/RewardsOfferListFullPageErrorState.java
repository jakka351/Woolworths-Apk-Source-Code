package au.com.woolworths.feature.rewards.offers.list;

import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/list/RewardsOfferListFullPageErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class RewardsOfferListFullPageErrorState implements FullPageErrorCause {
    public static final RewardsOfferListFullPageErrorState d;
    public static final RewardsOfferListFullPageErrorState e;
    public static final RewardsOfferListFullPageErrorState f;
    public static final RewardsOfferListFullPageErrorState g;
    public static final /* synthetic */ RewardsOfferListFullPageErrorState[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        RewardsOfferListFullPageErrorState rewardsOfferListFullPageErrorState = new RewardsOfferListFullPageErrorState() { // from class: au.com.woolworths.feature.rewards.offers.list.RewardsOfferListFullPageErrorState.NO_CONNECTIVITY
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.ic_rewards_connection_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.rewards_offer_list_network_error);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.default_connection_error_title_rewards);
            }
        };
        d = rewardsOfferListFullPageErrorState;
        RewardsOfferListFullPageErrorState rewardsOfferListFullPageErrorState2 = new RewardsOfferListFullPageErrorState() { // from class: au.com.woolworths.feature.rewards.offers.list.RewardsOfferListFullPageErrorState.SERVER_ERROR
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.ic_rewards_server_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.rewards_offer_list_server_error);
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
        e = rewardsOfferListFullPageErrorState2;
        RewardsOfferListFullPageErrorState rewardsOfferListFullPageErrorState3 = new RewardsOfferListFullPageErrorState() { // from class: au.com.woolworths.feature.rewards.offers.list.RewardsOfferListFullPageErrorState.NO_CONNECTIVITY_NZ
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.ic_rewards_connection_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.rewards_offer_list_network_error_nz);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.default_connection_error_title_rewards);
            }
        };
        f = rewardsOfferListFullPageErrorState3;
        RewardsOfferListFullPageErrorState rewardsOfferListFullPageErrorState4 = new RewardsOfferListFullPageErrorState() { // from class: au.com.woolworths.feature.rewards.offers.list.RewardsOfferListFullPageErrorState.SERVER_ERROR_NZ
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.ic_rewards_server_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.rewards_offer_list_server_error_nz);
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
        g = rewardsOfferListFullPageErrorState4;
        RewardsOfferListFullPageErrorState[] rewardsOfferListFullPageErrorStateArr = {rewardsOfferListFullPageErrorState, rewardsOfferListFullPageErrorState2, rewardsOfferListFullPageErrorState3, rewardsOfferListFullPageErrorState4};
        h = rewardsOfferListFullPageErrorStateArr;
        i = EnumEntriesKt.a(rewardsOfferListFullPageErrorStateArr);
    }

    public static RewardsOfferListFullPageErrorState valueOf(String str) {
        return (RewardsOfferListFullPageErrorState) Enum.valueOf(RewardsOfferListFullPageErrorState.class, str);
    }

    public static RewardsOfferListFullPageErrorState[] values() {
        return (RewardsOfferListFullPageErrorState[]) h.clone();
    }
}
