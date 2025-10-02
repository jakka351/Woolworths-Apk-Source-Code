package au.com.woolworths.feature.rewards.offers.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButton;
import au.com.woolworths.foundation.rewards.offers.model.OfferViewItem;
import au.com.woolworths.foundation.rewards.offers.ui.RewardsOfferActionListener;

/* loaded from: classes3.dex */
public abstract class EpoxyItemRewardsProductOfferTileBinding extends ViewDataBinding {
    public final ImageView A;
    public final TextView B;
    public final TextView C;
    public OfferViewItem D;
    public String E;
    public RewardsOfferActionListener F;
    public final StatefulButton y;
    public final ImageView z;

    public EpoxyItemRewardsProductOfferTileBinding(DataBindingComponent dataBindingComponent, View view, StatefulButton statefulButton, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2) {
        super(dataBindingComponent, view, 0);
        this.y = statefulButton;
        this.z = imageView;
        this.A = imageView2;
        this.B = textView;
        this.C = textView2;
    }
}
