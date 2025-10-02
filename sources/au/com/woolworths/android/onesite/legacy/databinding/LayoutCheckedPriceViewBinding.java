package au.com.woolworths.android.onesite.legacy.databinding;

import android.view.View;
import android.widget.CheckedTextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public abstract class LayoutCheckedPriceViewBinding extends ViewDataBinding {
    public final CheckedTextView A;
    public Boolean B;
    public Boolean C;
    public String D;
    public String E;
    public final CheckedTextView y;
    public final CheckedTextView z;

    public LayoutCheckedPriceViewBinding(DataBindingComponent dataBindingComponent, View view, CheckedTextView checkedTextView, CheckedTextView checkedTextView2, CheckedTextView checkedTextView3) {
        super(dataBindingComponent, view, 0);
        this.y = checkedTextView;
        this.z = checkedTextView2;
        this.A = checkedTextView3;
    }
}
