package au.com.woolworths.feature.product.list.legacy.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.product.list.legacy.ui.FilterOptionsClickListener;
import au.com.woolworths.feature.product.list.legacy.ui.ProductListOptionsItem;

/* loaded from: classes3.dex */
public abstract class EpoxyItemProductListOptionsFilterLegacyBinding extends ViewDataBinding {
    public FilterOptionsClickListener A;
    public final TextView y;
    public ProductListOptionsItem.FilterOptionItem z;

    public EpoxyItemProductListOptionsFilterLegacyBinding(DataBindingComponent dataBindingComponent, View view, TextView textView) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
    }
}
