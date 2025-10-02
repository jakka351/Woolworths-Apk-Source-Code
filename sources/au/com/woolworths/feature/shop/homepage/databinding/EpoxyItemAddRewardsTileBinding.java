package au.com.woolworths.feature.shop.homepage.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.homepage.data.AddRewardsTileData;
import au.com.woolworths.feature.shop.homepage.presentation.AddRewardsClickListener;

/* loaded from: classes3.dex */
public abstract class EpoxyItemAddRewardsTileBinding extends ViewDataBinding {
    public AddRewardsTileData A;
    public AddRewardsClickListener B;
    public final TextView y;
    public final TextView z;

    public EpoxyItemAddRewardsTileBinding(DataBindingComponent dataBindingComponent, View view, TextView textView, TextView textView2) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = textView2;
    }
}
