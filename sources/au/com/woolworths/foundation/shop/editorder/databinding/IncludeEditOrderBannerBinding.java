package au.com.woolworths.foundation.shop.editorder.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderStatus;

/* loaded from: classes4.dex */
public abstract class IncludeEditOrderBannerBinding extends ViewDataBinding {
    public static final /* synthetic */ int D = 0;
    public final Button A;
    public final TextView B;
    public EditOrderStatus C;
    public final TextView y;
    public final ImageView z;

    public IncludeEditOrderBannerBinding(View view, Button button, ImageView imageView, TextView textView, TextView textView2, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = imageView;
        this.A = button;
        this.B = textView2;
    }

    public abstract void L(EditOrderStatus editOrderStatus);
}
