package au.com.woolworths.feature.product.list.databinding;

import android.view.View;
import android.widget.ImageView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.product.list.ProductsDisplayMode;
import au.com.woolworths.feature.product.list.ui.DisplayModeClickListener;
import au.com.woolworths.views.CheckableConstraintLayout;

/* loaded from: classes3.dex */
public abstract class EpoxyItemProductListOptionsDisplayModeBinding extends ViewDataBinding {
    public ProductsDisplayMode A;
    public boolean B;
    public DisplayModeClickListener C;
    public final ImageView y;
    public final CheckableConstraintLayout z;

    public EpoxyItemProductListOptionsDisplayModeBinding(DataBindingComponent dataBindingComponent, View view, ImageView imageView, CheckableConstraintLayout checkableConstraintLayout) {
        super(dataBindingComponent, view, 0);
        this.y = imageView;
        this.z = checkableConstraintLayout;
    }
}
