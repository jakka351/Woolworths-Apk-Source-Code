package au.com.woolworths.feature.product.list.legacy.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.checkbox.IndeterminateCheckBox;
import au.com.woolworths.feature.product.list.legacy.ui.FilterMenuItem;
import au.com.woolworths.feature.product.list.legacy.ui.FilterOptionsClickListener;

/* loaded from: classes3.dex */
public abstract class EpoxyItemProductListOptionsChildFilterLegacyBinding extends ViewDataBinding {
    public final IncludeCircledCountLegacyBinding A;
    public final TextView B;
    public FilterMenuItem C;
    public FilterOptionsClickListener D;
    public final IndeterminateCheckBox y;
    public final ImageView z;

    public EpoxyItemProductListOptionsChildFilterLegacyBinding(DataBindingComponent dataBindingComponent, View view, IndeterminateCheckBox indeterminateCheckBox, ImageView imageView, IncludeCircledCountLegacyBinding includeCircledCountLegacyBinding, TextView textView) {
        super(dataBindingComponent, view, 1);
        this.y = indeterminateCheckBox;
        this.z = imageView;
        this.A = includeCircledCountLegacyBinding;
        this.B = textView;
    }
}
