package au.com.woolworths.feature.shop.more.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.more.MoreViewModel;
import au.com.woolworths.feature.shop.more.data.MoreExplainingValue;

/* loaded from: classes3.dex */
public abstract class EpoxyItemMoreExplainingValueBinding extends ViewDataBinding {
    public MoreViewModel A;
    public final TextView y;
    public MoreExplainingValue z;

    public EpoxyItemMoreExplainingValueBinding(DataBindingComponent dataBindingComponent, View view, TextView textView) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
    }
}
