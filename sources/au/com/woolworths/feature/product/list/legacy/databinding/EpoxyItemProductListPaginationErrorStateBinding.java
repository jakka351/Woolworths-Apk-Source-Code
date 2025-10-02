package au.com.woolworths.feature.product.list.legacy.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.models.text.ResWithArgText;
import au.com.woolworths.feature.product.list.legacy.ProductListClickHandler;

/* loaded from: classes3.dex */
public abstract class EpoxyItemProductListPaginationErrorStateBinding extends ViewDataBinding {
    public ResWithArgText A;
    public ProductListClickHandler B;
    public final TextView y;
    public final Button z;

    public EpoxyItemProductListPaginationErrorStateBinding(View view, Button button, TextView textView, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = button;
    }
}
