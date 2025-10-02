package au.com.woolworths.foundation.rewards.offers.ui.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButton;
import au.com.woolworths.foundation.rewards.offers.model.OfferViewItem;
import au.com.woolworths.foundation.rewards.offers.ui.RewardsOfferActionListener;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes4.dex */
public abstract class EpoxyItemRewardsOfferCardBinding extends ViewDataBinding {
    public final FrameLayout A;
    public final TextView B;
    public final TextView C;
    public final MaterialCardView D;
    public final TextView E;
    public final ImageView F;
    public final LottieAnimationView G;
    public final StatefulButton H;
    public OfferViewItem I;
    public RewardsOfferActionListener J;
    public final ImageView y;
    public final ImageView z;

    public EpoxyItemRewardsOfferCardBinding(DataBindingComponent dataBindingComponent, View view, ImageView imageView, ImageView imageView2, FrameLayout frameLayout, TextView textView, TextView textView2, MaterialCardView materialCardView, TextView textView3, ImageView imageView3, LottieAnimationView lottieAnimationView, StatefulButton statefulButton) {
        super(dataBindingComponent, view, 0);
        this.y = imageView;
        this.z = imageView2;
        this.A = frameLayout;
        this.B = textView;
        this.C = textView2;
        this.D = materialCardView;
        this.E = textView3;
        this.F = imageView3;
        this.G = lottieAnimationView;
        this.H = statefulButton;
    }
}
