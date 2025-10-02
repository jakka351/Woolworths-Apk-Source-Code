package au.com.woolworths.base.rewards.account.data;

import au.com.woolworths.android.onesite.modules.rewards.data.RewardsLinkCallbackResultData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toLinkCallbackResult", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsLinkCallbackResultData;", "Lau/com/woolworths/base/rewards/account/data/RewardsSignupCallbackResult;", "base-rewards-account_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsSignupCallbackResultKt {
    @NotNull
    public static final RewardsLinkCallbackResultData toLinkCallbackResult(@NotNull RewardsSignupCallbackResult rewardsSignupCallbackResult) {
        Intrinsics.h(rewardsSignupCallbackResult, "<this>");
        return new RewardsLinkCallbackResultData(rewardsSignupCallbackResult.getSignupFormUrl(), "", rewardsSignupCallbackResult.getCallbackUrlPattern(), rewardsSignupCallbackResult.getCallbackUrlRegexPattern());
    }
}
