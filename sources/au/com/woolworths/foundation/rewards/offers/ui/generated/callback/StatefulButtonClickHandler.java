package au.com.woolworths.foundation.rewards.offers.ui.generated.callback;

import android.view.View;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.foundation.rewards.offers.model.OfferViewItem;
import au.com.woolworths.foundation.rewards.offers.ui.RewardsOfferActionListener;
import au.com.woolworths.foundation.rewards.offers.ui.databinding.EpoxyItemRewardsOfferCardBindingImpl;

/* loaded from: classes4.dex */
public final class StatefulButtonClickHandler implements au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonClickHandler {
    public final EpoxyItemRewardsOfferCardBindingImpl d;

    public interface Listener {
    }

    public StatefulButtonClickHandler(EpoxyItemRewardsOfferCardBindingImpl epoxyItemRewardsOfferCardBindingImpl) {
        this.d = epoxyItemRewardsOfferCardBindingImpl;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonClickHandler
    public final void T2(View view, StatefulButtonState statefulButtonState) {
        EpoxyItemRewardsOfferCardBindingImpl epoxyItemRewardsOfferCardBindingImpl = this.d;
        OfferViewItem offerViewItem = epoxyItemRewardsOfferCardBindingImpl.I;
        RewardsOfferActionListener rewardsOfferActionListener = epoxyItemRewardsOfferCardBindingImpl.J;
        if (rewardsOfferActionListener == null || offerViewItem == null) {
            return;
        }
        rewardsOfferActionListener.Z(offerViewItem.b);
    }
}
