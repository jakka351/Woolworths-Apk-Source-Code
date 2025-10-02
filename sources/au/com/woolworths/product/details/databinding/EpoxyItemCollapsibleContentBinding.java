package au.com.woolworths.product.details.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.product.details.ProductDetailsClickHandler;
import au.com.woolworths.product.details.customviews.HtmlLinkTextView;
import au.com.woolworths.product.details.ui.CollapsibleContentUiModel;

/* loaded from: classes4.dex */
public abstract class EpoxyItemCollapsibleContentBinding extends ViewDataBinding {
    public final Button A;
    public final TextView B;
    public final TextView C;
    public CollapsibleContentUiModel D;
    public ProductDetailsClickHandler E;
    public final TextView y;
    public final HtmlLinkTextView z;

    public EpoxyItemCollapsibleContentBinding(DataBindingComponent dataBindingComponent, View view, TextView textView, HtmlLinkTextView htmlLinkTextView, Button button, TextView textView2, TextView textView3) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = htmlLinkTextView;
        this.A = button;
        this.B = textView2;
        this.C = textView3;
    }
}
