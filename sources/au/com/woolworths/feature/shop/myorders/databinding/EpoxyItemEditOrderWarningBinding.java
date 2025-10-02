package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.myorders.details.models.EditOrderWarningItem;

/* loaded from: classes3.dex */
public abstract class EpoxyItemEditOrderWarningBinding extends ViewDataBinding {
    public final TextView y;
    public EditOrderWarningItem z;

    public EpoxyItemEditOrderWarningBinding(DataBindingComponent dataBindingComponent, View view, TextView textView) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
    }
}
