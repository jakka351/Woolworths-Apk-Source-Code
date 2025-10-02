package au.com.woolworths.feature.rewards.offers.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.rewards.offers.OfferSectionViewItem;
import au.com.woolworths.feature.rewards.offers.RewardsOffersClickListener;

/* loaded from: classes3.dex */
public abstract class EpoxyItemRewardsOfferSectionTitleBinding extends ViewDataBinding {
    public final TextView A;
    public OfferSectionViewItem B;
    public String C;
    public String D;
    public boolean E;
    public RewardsOffersClickListener F;
    public Float G;
    public final Button y;
    public final ProgressBar z;

    public EpoxyItemRewardsOfferSectionTitleBinding(DataBindingComponent dataBindingComponent, View view, Button button, ProgressBar progressBar, TextView textView) {
        super(dataBindingComponent, view, 0);
        this.y = button;
        this.z = progressBar;
        this.A = textView;
    }
}
