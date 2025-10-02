package au.com.woolworths.product.databinding;

import android.view.View;
import android.widget.CheckedTextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes4.dex */
public abstract class LayoutProductPriceBinding extends ViewDataBinding {
    public static final /* synthetic */ int C = 0;
    public final CheckedTextView A;
    public final CheckedTextView B;
    public final CheckedTextView y;
    public final CheckedTextView z;

    public LayoutProductPriceBinding(DataBindingComponent dataBindingComponent, View view, CheckedTextView checkedTextView, CheckedTextView checkedTextView2, CheckedTextView checkedTextView3, CheckedTextView checkedTextView4) {
        super(dataBindingComponent, view, 0);
        this.y = checkedTextView;
        this.z = checkedTextView2;
        this.A = checkedTextView3;
        this.B = checkedTextView4;
    }
}
