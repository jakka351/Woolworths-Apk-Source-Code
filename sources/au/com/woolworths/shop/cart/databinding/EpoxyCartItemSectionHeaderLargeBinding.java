package au.com.woolworths.shop.cart.databinding;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.foundation.shop.cart.data.model.SectionHeader;
import au.com.woolworths.shop.cart.ui.ProductSectionItemListener;

/* loaded from: classes4.dex */
public abstract class EpoxyCartItemSectionHeaderLargeBinding extends ViewDataBinding {
    public final TextView A;
    public SectionHeader B;
    public Boolean C;
    public ProductSectionItemListener D;
    public final ImageView y;
    public final ImageButton z;

    public EpoxyCartItemSectionHeaderLargeBinding(DataBindingComponent dataBindingComponent, View view, ImageView imageView, ImageButton imageButton, TextView textView) {
        super(dataBindingComponent, view, 0);
        this.y = imageView;
        this.z = imageButton;
        this.A = textView;
    }
}
