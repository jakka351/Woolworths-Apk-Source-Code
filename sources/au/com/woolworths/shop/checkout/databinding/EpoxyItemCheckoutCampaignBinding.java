package au.com.woolworths.shop.checkout.databinding;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.checkout.domain.model.CheckoutProductCampaign;
import au.com.woolworths.shop.checkout.ui.product.CheckoutProductListener;
import com.google.android.material.switchmaterial.SwitchMaterial;

/* loaded from: classes4.dex */
public abstract class EpoxyItemCheckoutCampaignBinding extends ViewDataBinding {
    public final SwitchMaterial A;
    public final TextView B;
    public final TextView C;
    public final ImageButton D;
    public CheckoutProductCampaign E;
    public CheckoutProductListener F;
    public final ImageView y;
    public final TextView z;

    public EpoxyItemCheckoutCampaignBinding(DataBindingComponent dataBindingComponent, View view, ImageView imageView, TextView textView, SwitchMaterial switchMaterial, TextView textView2, TextView textView3, ImageButton imageButton) {
        super(dataBindingComponent, view, 0);
        this.y = imageView;
        this.z = textView;
        this.A = switchMaterial;
        this.B = textView2;
        this.C = textView3;
        this.D = imageButton;
    }
}
