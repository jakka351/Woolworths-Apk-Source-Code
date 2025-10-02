package au.com.woolworths.feature.product.list.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.checkbox.IndeterminateCheckBox;
import au.com.woolworths.feature.product.list.ui.FilterMenuItem;
import au.com.woolworths.feature.product.list.ui.FilterOptionsClickListener;

/* loaded from: classes3.dex */
public abstract class EpoxyItemProductListOptionsChildFilterBinding extends ViewDataBinding {
    public final IncludeCircledCountBinding A;
    public final TextView B;
    public FilterMenuItem C;
    public FilterOptionsClickListener D;
    public final IndeterminateCheckBox y;
    public final ImageView z;

    public EpoxyItemProductListOptionsChildFilterBinding(DataBindingComponent dataBindingComponent, View view, IndeterminateCheckBox indeterminateCheckBox, ImageView imageView, IncludeCircledCountBinding includeCircledCountBinding, TextView textView) {
        super(dataBindingComponent, view, 1);
        this.y = indeterminateCheckBox;
        this.z = imageView;
        this.A = includeCircledCountBinding;
        this.B = textView;
    }
}
