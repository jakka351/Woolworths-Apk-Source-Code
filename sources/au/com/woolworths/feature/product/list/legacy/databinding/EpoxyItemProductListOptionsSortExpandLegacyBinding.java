package au.com.woolworths.feature.product.list.legacy.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.product.list.legacy.ui.SortOptionsClickListener;

/* loaded from: classes3.dex */
public abstract class EpoxyItemProductListOptionsSortExpandLegacyBinding extends ViewDataBinding {
    public Integer A;
    public SortOptionsClickListener B;
    public final ConstraintLayout y;
    public final TextView z;

    public EpoxyItemProductListOptionsSortExpandLegacyBinding(DataBindingComponent dataBindingComponent, View view, ConstraintLayout constraintLayout, TextView textView) {
        super(dataBindingComponent, view, 0);
        this.y = constraintLayout;
        this.z = textView;
    }
}
