package au.com.woolworths.feature.product.list.legacy.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.base.shopapp.modules.listsectionheader.ListSectionHeaderApiData;

/* loaded from: classes3.dex */
public abstract class EpoxyItemProductListSectionHeaderBinding extends ViewDataBinding {
    public ListSectionHeaderApiData A;
    public final TextView y;
    public final View z;

    public EpoxyItemProductListSectionHeaderBinding(View view, View view2, TextView textView, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = view2;
    }
}
