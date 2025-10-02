package au.com.woolworths.shop.lists.databinding;

import android.view.View;
import android.widget.Button;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListItemListener;

/* loaded from: classes4.dex */
public abstract class EpoxyItemShoppingListCheckedMenuBinding extends ViewDataBinding {
    public ShoppingListItemListener A;
    public final Button y;
    public final Button z;

    public EpoxyItemShoppingListCheckedMenuBinding(DataBindingComponent dataBindingComponent, View view, Button button, Button button2) {
        super(dataBindingComponent, view, 0);
        this.y = button;
        this.z = button2;
    }
}
