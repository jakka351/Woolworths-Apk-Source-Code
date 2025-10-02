package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.models.text.Text;

/* loaded from: classes3.dex */
public abstract class EpoxyItemSectionTitleBinding extends ViewDataBinding {
    public final TextView y;
    public Text z;

    public EpoxyItemSectionTitleBinding(DataBindingComponent dataBindingComponent, View view, TextView textView) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
    }
}
