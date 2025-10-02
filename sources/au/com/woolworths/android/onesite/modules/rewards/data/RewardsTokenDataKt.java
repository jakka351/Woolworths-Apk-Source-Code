package au.com.woolworths.android.onesite.modules.rewards.data;

import au.com.woolworths.android.onesite.network.Component;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsTokenDataKt {
    public static final RewardsTokenAndCardInfo a(RewardsTokenData rewardsTokenData) {
        Intrinsics.h(rewardsTokenData, "<this>");
        RewardsTokenInfo rewardsTokenInfo = new RewardsTokenInfo(rewardsTokenData.getRefreshToken(), rewardsTokenData.getAccessToken(), TimeUnit.SECONDS.toMillis(rewardsTokenData.getAccessTokenExpiresIn()) + System.currentTimeMillis());
        Component rewardsCardUpdate = rewardsTokenData.getRewardsCardUpdate();
        return new RewardsTokenAndCardInfo(rewardsTokenInfo, rewardsCardUpdate != null ? (RewardsCardUpdate) rewardsCardUpdate.b() : null);
    }
}
