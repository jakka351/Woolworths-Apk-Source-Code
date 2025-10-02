package au.com.woolworths.feature.rewards.offers.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.rewards.offers.StandardBannerViewItem;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public abstract class EpoxyItemStandardBannerBinding extends ViewDataBinding {
    public final ImageView A;
    public final TextView B;
    public StandardBannerViewItem C;
    public Function1 D;
    public final TextView y;
    public final TextView z;

    public EpoxyItemStandardBannerBinding(View view, ImageView imageView, TextView textView, TextView textView2, TextView textView3, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = textView2;
        this.A = imageView;
        this.B = textView3;
    }
}
