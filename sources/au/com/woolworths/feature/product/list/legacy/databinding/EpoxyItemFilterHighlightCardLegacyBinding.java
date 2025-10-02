package au.com.woolworths.feature.product.list.legacy.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.product.list.legacy.ui.FilterCardClickListener;

/* loaded from: classes3.dex */
public abstract class EpoxyItemFilterHighlightCardLegacyBinding extends ViewDataBinding {
    public FilterCardClickListener A;
    public final ImageView y;
    public final TextView z;

    public EpoxyItemFilterHighlightCardLegacyBinding(View view, ImageView imageView, TextView textView, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = imageView;
        this.z = textView;
    }
}
