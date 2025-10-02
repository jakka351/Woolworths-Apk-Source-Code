package au.com.woolworths.rewards.base.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;

/* loaded from: classes4.dex */
public abstract class EpoxyIncludeRewardsGenericErrorStateBinding extends ViewDataBinding {
    public final Button A;
    public final TextView B;
    public final Button C;
    public FullPageErrorCause D;
    public FullPageErrorStateClickHandler E;
    public final ImageView y;
    public final TextView z;

    public EpoxyIncludeRewardsGenericErrorStateBinding(DataBindingComponent dataBindingComponent, View view, ImageView imageView, TextView textView, Button button, TextView textView2, Button button2) {
        super(dataBindingComponent, view, 0);
        this.y = imageView;
        this.z = textView;
        this.A = button;
        this.B = textView2;
        this.C = button2;
    }

    public abstract void L(FullPageErrorStateClickHandler fullPageErrorStateClickHandler);

    public abstract void M(FullPageErrorCause fullPageErrorCause);
}
