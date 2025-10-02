package au.com.woolworths.product.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.product.models.MemberPriceInfo;

/* loaded from: classes4.dex */
public abstract class LayoutMemberPriceLabelBinding extends ViewDataBinding {
    public final TextView A;
    public MemberPriceInfo B;
    public final TextView y;
    public final TextView z;

    public LayoutMemberPriceLabelBinding(DataBindingComponent dataBindingComponent, View view, TextView textView, TextView textView2, TextView textView3) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = textView2;
        this.A = textView3;
    }

    public abstract void L(MemberPriceInfo memberPriceInfo);
}
