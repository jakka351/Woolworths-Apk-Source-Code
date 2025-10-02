package au.com.woolworths.shop.checkout.databinding;

import android.view.View;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.checkout.domain.model.PackagingMethodOption;
import au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsListener;

/* loaded from: classes4.dex */
public abstract class EpoxyItemCheckoutPackagingMethodOptionBinding extends ViewDataBinding {
    public final CheckedTextView A;
    public PackagingMethodOption B;
    public CheckoutDetailsListener C;
    public final ImageView y;
    public final CheckedTextView z;

    public EpoxyItemCheckoutPackagingMethodOptionBinding(DataBindingComponent dataBindingComponent, View view, ImageView imageView, CheckedTextView checkedTextView, CheckedTextView checkedTextView2) {
        super(dataBindingComponent, view, 0);
        this.y = imageView;
        this.z = checkedTextView;
        this.A = checkedTextView2;
    }
}
