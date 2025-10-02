package au.com.woolworths.android.onesite.base.ui.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerClickListener;

/* loaded from: classes3.dex */
public abstract class IncludeInsetBannerBinding extends ViewDataBinding {
    public final ImageView A;
    public final ImageView B;
    public final TextView C;
    public final TextView D;
    public InsetBanner E;
    public InsetBannerClickListener F;
    public final TextView y;
    public final TextView z;

    public IncludeInsetBannerBinding(DataBindingComponent dataBindingComponent, View view, TextView textView, TextView textView2, ImageView imageView, ImageView imageView2, TextView textView3, TextView textView4) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = textView2;
        this.A = imageView;
        this.B = imageView2;
        this.C = textView3;
        this.D = textView4;
    }

    public abstract void L(InsetBanner insetBanner);

    public abstract void M(InsetBannerClickListener insetBannerClickListener);
}
