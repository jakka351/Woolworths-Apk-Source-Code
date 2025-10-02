package au.com.woolworths.android.onesite.modules.rewards;

import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardData;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardDataKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsAccountInteractorKt {
    public static final Region a(RewardsAccountInteractor rewardsAccountInteractor) {
        Intrinsics.h(rewardsAccountInteractor, "<this>");
        RewardsCardData cardData = rewardsAccountInteractor.getCardData();
        if (cardData != null) {
            return RewardsCardDataKt.a(cardData);
        }
        return null;
    }
}
