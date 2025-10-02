package au.com.woolworths.shop.cart.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.shop.cart.ui.CartSectionOptionsListener;

/* loaded from: classes4.dex */
public abstract class EpoxyCartItemSectionMenuOptionBinding extends ViewDataBinding {
    public Integer A;
    public Text B;
    public String C;
    public Boolean D;
    public CartSectionOptionsListener E;
    public final ImageView y;
    public final TextView z;

    public EpoxyCartItemSectionMenuOptionBinding(View view, ImageView imageView, TextView textView, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = imageView;
        this.z = textView;
    }
}
