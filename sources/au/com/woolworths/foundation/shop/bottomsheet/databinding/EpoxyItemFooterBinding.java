package au.com.woolworths.foundation.shop.bottomsheet.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.ui.HtmlTextListener;

/* loaded from: classes4.dex */
public abstract class EpoxyItemFooterBinding extends ViewDataBinding {
    public HtmlTextListener A;
    public final TextView y;
    public String z;

    public EpoxyItemFooterBinding(DataBindingComponent dataBindingComponent, View view, TextView textView) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
    }
}
