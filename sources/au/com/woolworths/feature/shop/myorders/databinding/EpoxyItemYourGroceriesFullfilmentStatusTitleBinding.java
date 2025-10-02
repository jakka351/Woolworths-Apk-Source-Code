package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.ImageButton;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesFullfilmentStatusItem;
import au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract;

/* loaded from: classes3.dex */
public abstract class EpoxyItemYourGroceriesFullfilmentStatusTitleBinding extends ViewDataBinding {
    public YourGroceriesContract.YourGroceriesClickHandler A;
    public final ImageButton y;
    public YourGroceriesFullfilmentStatusItem z;

    public EpoxyItemYourGroceriesFullfilmentStatusTitleBinding(DataBindingComponent dataBindingComponent, View view, ImageButton imageButton) {
        super(dataBindingComponent, view, 0);
        this.y = imageButton;
    }
}
