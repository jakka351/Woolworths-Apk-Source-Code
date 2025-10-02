package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesSubstitutedProduct;
import au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract;

/* loaded from: classes3.dex */
public abstract class EpoxyItemOrderYourGroceriesSubstitutionCardBinding extends ViewDataBinding {
    public final TextView A;
    public final ImageView B;
    public final TextView C;
    public final TextView D;
    public YourGroceriesSubstitutedProduct E;
    public YourGroceriesContract.YourGroceriesClickHandler F;
    public final Group y;
    public final ImageView z;

    public EpoxyItemOrderYourGroceriesSubstitutionCardBinding(DataBindingComponent dataBindingComponent, View view, Group group, ImageView imageView, TextView textView, ImageView imageView2, TextView textView2, TextView textView3) {
        super(dataBindingComponent, view, 0);
        this.y = group;
        this.z = imageView;
        this.A = textView;
        this.B = imageView2;
        this.C = textView2;
        this.D = textView3;
    }
}
