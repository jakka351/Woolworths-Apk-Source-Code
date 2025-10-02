package au.com.woolworths.product.details.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.product.details.ProductDetailsClickHandler;
import au.com.woolworths.product.details.models.HealthierHorizontalListData;

/* loaded from: classes4.dex */
public abstract class EpoxyItemHealthierListHeaderBinding extends ViewDataBinding {
    public final TextView A;
    public HealthierHorizontalListData B;
    public ProductDetailsClickHandler C;
    public final Button y;
    public final TextView z;

    public EpoxyItemHealthierListHeaderBinding(DataBindingComponent dataBindingComponent, View view, Button button, TextView textView, TextView textView2) {
        super(dataBindingComponent, view, 0);
        this.y = button;
        this.z = textView;
        this.A = textView2;
    }
}
