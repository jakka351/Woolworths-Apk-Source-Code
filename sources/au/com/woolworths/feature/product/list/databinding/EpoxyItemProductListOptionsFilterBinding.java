package au.com.woolworths.feature.product.list.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.product.list.ui.FilterOptionsClickListener;
import au.com.woolworths.feature.product.list.ui.ProductListOptionsItem;

/* loaded from: classes3.dex */
public abstract class EpoxyItemProductListOptionsFilterBinding extends ViewDataBinding {
    public FilterOptionsClickListener A;
    public final TextView y;
    public ProductListOptionsItem.FilterOptionItem z;

    public EpoxyItemProductListOptionsFilterBinding(DataBindingComponent dataBindingComponent, View view, TextView textView) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
    }
}
