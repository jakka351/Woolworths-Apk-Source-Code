package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesProductItem;
import au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract;

/* loaded from: classes3.dex */
public abstract class EpoxyItemOrderProductListFeedItemBinding extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public YourGroceriesProductItem D;
    public int E;
    public YourGroceriesContract.YourGroceriesClickHandler F;
    public final TextView y;
    public final ImageView z;

    public EpoxyItemOrderProductListFeedItemBinding(View view, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = imageView;
        this.A = textView2;
        this.B = textView3;
        this.C = textView4;
    }
}
