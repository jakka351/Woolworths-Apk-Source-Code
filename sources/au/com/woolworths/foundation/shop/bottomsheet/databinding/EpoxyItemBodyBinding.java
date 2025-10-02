package au.com.woolworths.foundation.shop.bottomsheet.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.handlers.LinkHandler;

/* loaded from: classes4.dex */
public abstract class EpoxyItemBodyBinding extends ViewDataBinding {
    public LinkHandler A;
    public final TextView y;
    public String z;

    public EpoxyItemBodyBinding(DataBindingComponent dataBindingComponent, View view, TextView textView) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
    }
}
