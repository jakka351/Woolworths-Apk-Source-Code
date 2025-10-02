package au.com.woolworths.foundation.rewards.offers.ui.generated.callback;

import android.view.View;
import au.com.woolworths.foundation.rewards.offers.model.OfferViewItem;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import au.com.woolworths.foundation.rewards.offers.ui.RewardsOfferActionListener;
import au.com.woolworths.foundation.rewards.offers.ui.databinding.EpoxyItemRewardsOfferCardBindingImpl;
import com.dynatrace.android.callback.Callback;

/* loaded from: classes4.dex */
public final class OnClickListener implements View.OnClickListener {
    public final EpoxyItemRewardsOfferCardBindingImpl d;
    public final int e;

    public interface Listener {
    }

    public OnClickListener(EpoxyItemRewardsOfferCardBindingImpl epoxyItemRewardsOfferCardBindingImpl, int i) {
        this.d = epoxyItemRewardsOfferCardBindingImpl;
        this.e = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Callback.g(view);
        try {
            EpoxyItemRewardsOfferCardBindingImpl epoxyItemRewardsOfferCardBindingImpl = this.d;
            int i = this.e;
            if (i == 1) {
                OfferViewItem offerViewItem = epoxyItemRewardsOfferCardBindingImpl.I;
                RewardsOfferActionListener rewardsOfferActionListener = epoxyItemRewardsOfferCardBindingImpl.J;
                if (rewardsOfferActionListener != null && offerViewItem != null) {
                    rewardsOfferActionListener.L4(offerViewItem.b);
                }
            } else if (i == 3) {
                OfferViewItem offerViewItem2 = epoxyItemRewardsOfferCardBindingImpl.I;
                RewardsOfferActionListener rewardsOfferActionListener2 = epoxyItemRewardsOfferCardBindingImpl.J;
                if (rewardsOfferActionListener2 != null && offerViewItem2 != null) {
                    RewardsOfferData rewardsOfferData = offerViewItem2.b;
                    rewardsOfferActionListener2.p2(rewardsOfferData, rewardsOfferData.y);
                }
            }
        } finally {
            Callback.h();
        }
    }
}
