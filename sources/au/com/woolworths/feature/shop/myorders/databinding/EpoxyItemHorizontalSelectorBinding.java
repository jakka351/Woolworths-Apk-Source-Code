package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.views.horizontalselector.HorizontalSelectorItemClickListener;
import au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener;

/* loaded from: classes3.dex */
public abstract class EpoxyItemHorizontalSelectorBinding extends ViewDataBinding {
    public Integer A;
    public HorizontalSelectorViewListener B;
    public HorizontalSelectorItemClickListener C;
    public String D;
    public int E;
    public final ImageView y;
    public final TextView z;

    public EpoxyItemHorizontalSelectorBinding(View view, ImageView imageView, TextView textView, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = imageView;
        this.z = textView;
    }
}
