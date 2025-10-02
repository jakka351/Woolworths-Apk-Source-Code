package au.com.woolworths.rewards.base.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.rewards.base.RewardsEmptyStateClickHandler;
import au.com.woolworths.rewards.base.data.RewardsEmptyStateData;

/* loaded from: classes4.dex */
public abstract class EpoxyIncludeRewardsEmptyStateBinding extends ViewDataBinding {
    public final ImageView A;
    public final TextView B;
    public final TextView C;
    public RewardsEmptyStateData D;
    public RewardsEmptyStateClickHandler E;
    public final Button y;
    public final ImageView z;

    public EpoxyIncludeRewardsEmptyStateBinding(DataBindingComponent dataBindingComponent, View view, Button button, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2) {
        super(dataBindingComponent, view, 0);
        this.y = button;
        this.z = imageView;
        this.A = imageView2;
        this.B = textView;
        this.C = textView2;
    }
}
