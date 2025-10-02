package au.com.woolworths.shop.checkout.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeInsetBannerBinding;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.shop.checkout.domain.model.address.OrderAddress;

/* loaded from: classes4.dex */
public abstract class EpoxyItemCheckoutOrderAddressBinding extends ViewDataBinding {
    public final ImageView A;
    public final IncludeInsetBannerBinding B;
    public final TextView C;
    public OrderAddress D;
    public InsetBannerData E;
    public String F;
    public final TextView y;
    public final TextView z;

    public EpoxyItemCheckoutOrderAddressBinding(DataBindingComponent dataBindingComponent, View view, TextView textView, TextView textView2, ImageView imageView, IncludeInsetBannerBinding includeInsetBannerBinding, TextView textView3) {
        super(dataBindingComponent, view, 1);
        this.y = textView;
        this.z = textView2;
        this.A = imageView;
        this.B = includeInsetBannerBinding;
        this.C = textView3;
    }
}
