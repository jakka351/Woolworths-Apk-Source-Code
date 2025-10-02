package au.com.woolworths.base.shopapp.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.base.shopapp.data.models.InfoSectionItem;

/* loaded from: classes3.dex */
public abstract class EpoxyItemInfoSectionItemBinding extends ViewDataBinding {
    public InfoSectionItem A;
    public final ImageView y;
    public final TextView z;

    public EpoxyItemInfoSectionItemBinding(View view, ImageView imageView, TextView textView, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = imageView;
        this.z = textView;
    }
}
