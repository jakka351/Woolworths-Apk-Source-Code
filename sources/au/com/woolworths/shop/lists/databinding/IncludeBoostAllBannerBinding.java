package au.com.woolworths.shop.lists.databinding;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButton;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonClickHandler;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.BoostAllBannerState;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes4.dex */
public abstract class IncludeBoostAllBannerBinding extends ViewDataBinding {
    public final StatefulButton A;
    public final TextView B;
    public StatefulButtonClickHandler C;
    public BoostAllBannerState D;
    public final LottieAnimationView y;
    public final LinearLayout z;

    public IncludeBoostAllBannerBinding(DataBindingComponent dataBindingComponent, View view, LottieAnimationView lottieAnimationView, LinearLayout linearLayout, StatefulButton statefulButton, TextView textView) {
        super(dataBindingComponent, view, 0);
        this.y = lottieAnimationView;
        this.z = linearLayout;
        this.A = statefulButton;
        this.B = textView;
    }

    public abstract void L(BoostAllBannerState boostAllBannerState);

    public abstract void M(StatefulButtonClickHandler statefulButtonClickHandler);
}
