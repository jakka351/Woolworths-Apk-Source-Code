package au.com.woolworths.shop.lists.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListItemListener;

/* loaded from: classes4.dex */
public abstract class EpoxyItemShoppingListCheckedBinding extends ViewDataBinding {
    public int A;
    public boolean B;
    public ShoppingListItemListener C;
    public final TextView y;
    public final ImageView z;

    public EpoxyItemShoppingListCheckedBinding(View view, ImageView imageView, TextView textView, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = imageView;
    }
}
