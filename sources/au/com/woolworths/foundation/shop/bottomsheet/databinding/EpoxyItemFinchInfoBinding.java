package au.com.woolworths.foundation.shop.bottomsheet.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.foundation.shop.bottomsheet.FinchInfoItem;

/* loaded from: classes4.dex */
public abstract class EpoxyItemFinchInfoBinding extends ViewDataBinding {
    public final TextView A;
    public FinchInfoItem B;
    public final TextView y;
    public final ImageView z;

    public EpoxyItemFinchInfoBinding(View view, ImageView imageView, TextView textView, TextView textView2, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = imageView;
        this.A = textView2;
    }
}
