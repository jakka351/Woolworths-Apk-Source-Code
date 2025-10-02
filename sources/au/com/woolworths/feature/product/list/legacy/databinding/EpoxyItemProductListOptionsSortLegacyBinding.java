package au.com.woolworths.feature.product.list.legacy.databinding;

import android.view.View;
import android.widget.CheckedTextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.product.list.legacy.data.SortOption;
import au.com.woolworths.feature.product.list.legacy.ui.SortOptionsClickListener;
import au.com.woolworths.views.CheckableConstraintLayout;

/* loaded from: classes3.dex */
public abstract class EpoxyItemProductListOptionsSortLegacyBinding extends ViewDataBinding {
    public final CheckedTextView A;
    public SortOption B;
    public SortOptionsClickListener C;
    public final CheckableConstraintLayout y;
    public final CheckedTextView z;

    public EpoxyItemProductListOptionsSortLegacyBinding(DataBindingComponent dataBindingComponent, View view, CheckableConstraintLayout checkableConstraintLayout, CheckedTextView checkedTextView, CheckedTextView checkedTextView2) {
        super(dataBindingComponent, view, 0);
        this.y = checkableConstraintLayout;
        this.z = checkedTextView;
        this.A = checkedTextView2;
    }
}
