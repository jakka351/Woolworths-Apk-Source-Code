package au.com.woolworths.feature.product.list.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.product.list.ui.FilterCardClickListener;

/* loaded from: classes3.dex */
public abstract class EpoxyItemFilterHighlightCardBinding extends ViewDataBinding {
    public FilterCardClickListener A;
    public final ImageView y;
    public final TextView z;

    public EpoxyItemFilterHighlightCardBinding(View view, ImageView imageView, TextView textView, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = imageView;
        this.z = textView;
    }
}
