package au.com.woolworths.foundation.rewards.offers.model;

import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers-model_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OfferViewItemKt {
    public static final StatefulButtonState a(OfferViewItem offerViewItem) {
        RewardsOfferData rewardsOfferData;
        if (offerViewItem == null || !offerViewItem.f8617a) {
            return ((offerViewItem == null || (rewardsOfferData = offerViewItem.b) == null) ? null : rewardsOfferData.n) == RewardsOfferStatus.NOT_ACTIVATED ? StatefulButtonState.d : StatefulButtonState.f;
        }
        return StatefulButtonState.e;
    }
}
