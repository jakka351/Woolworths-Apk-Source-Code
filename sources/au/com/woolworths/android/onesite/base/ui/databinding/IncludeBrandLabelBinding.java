package au.com.woolworths.android.onesite.base.ui.databinding;

import android.view.View;
import android.widget.CheckedTextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabel;

/* loaded from: classes3.dex */
public abstract class IncludeBrandLabelBinding extends ViewDataBinding {
    public Boolean A;
    public Boolean B;
    public Integer C;
    public final CheckedTextView y;
    public BrandLabel z;

    public IncludeBrandLabelBinding(DataBindingComponent dataBindingComponent, View view, CheckedTextView checkedTextView) {
        super(dataBindingComponent, view, 0);
        this.y = checkedTextView;
    }

    public abstract void L(BrandLabel brandLabel);

    public abstract void M(Integer num);

    public abstract void N(Boolean bool);
}
