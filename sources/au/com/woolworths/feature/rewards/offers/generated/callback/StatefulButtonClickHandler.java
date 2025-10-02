package au.com.woolworths.feature.rewards.offers.generated.callback;

import android.view.View;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.feature.rewards.offers.databinding.EpoxyItemRewardsProductOfferTileBindingImpl;
import au.com.woolworths.foundation.rewards.offers.model.OfferViewItem;
import au.com.woolworths.foundation.rewards.offers.ui.RewardsOfferActionListener;

/* loaded from: classes3.dex */
public final class StatefulButtonClickHandler implements au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonClickHandler {
    public final EpoxyItemRewardsProductOfferTileBindingImpl d;

    public interface Listener {
    }

    public StatefulButtonClickHandler(EpoxyItemRewardsProductOfferTileBindingImpl epoxyItemRewardsProductOfferTileBindingImpl) {
        this.d = epoxyItemRewardsProductOfferTileBindingImpl;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonClickHandler
    public final void T2(View view, StatefulButtonState statefulButtonState) {
        EpoxyItemRewardsProductOfferTileBindingImpl epoxyItemRewardsProductOfferTileBindingImpl = this.d;
        OfferViewItem offerViewItem = epoxyItemRewardsProductOfferTileBindingImpl.D;
        RewardsOfferActionListener rewardsOfferActionListener = epoxyItemRewardsProductOfferTileBindingImpl.F;
        if (rewardsOfferActionListener == null || offerViewItem == null) {
            return;
        }
        rewardsOfferActionListener.Z(offerViewItem.b);
    }
}
