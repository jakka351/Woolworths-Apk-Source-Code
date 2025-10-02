package au.com.woolworths.feature.shop.more.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.more.MoreClickListener;
import au.com.woolworths.feature.shop.more.data.MoreTileItem;

/* loaded from: classes3.dex */
public abstract class EpoxyItemMoreTileBinding extends ViewDataBinding {
    public final ImageView A;
    public MoreTileItem B;
    public MoreClickListener C;
    public final TextView y;
    public final TextView z;

    public EpoxyItemMoreTileBinding(View view, ImageView imageView, TextView textView, TextView textView2, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = textView2;
        this.A = imageView;
    }
}
