package au.com.woolworths.feature.shop.more.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.more.MoreViewModel;

/* loaded from: classes3.dex */
public abstract class EpoxyItemMoreUsernameBinding extends ViewDataBinding {
    public final TextView y;
    public MoreViewModel z;

    public EpoxyItemMoreUsernameBinding(DataBindingComponent dataBindingComponent, View view, TextView textView) {
        super(dataBindingComponent, view, 1);
        this.y = textView;
    }
}
