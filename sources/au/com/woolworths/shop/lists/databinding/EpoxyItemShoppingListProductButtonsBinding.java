package au.com.woolworths.shop.lists.databinding;

import android.view.View;
import android.widget.Button;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeBrandLabelBinding;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListItemListener;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListProductItemState;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;

/* loaded from: classes4.dex */
public abstract class EpoxyItemShoppingListProductButtonsBinding extends ViewDataBinding {
    public final IncludeBrandLabelBinding A;
    public final Button B;
    public ProductItemUiModel C;
    public ShoppingListItemListener D;
    public ShoppingListProductItemState E;
    public final Button y;
    public final Button z;

    public EpoxyItemShoppingListProductButtonsBinding(DataBindingComponent dataBindingComponent, View view, Button button, Button button2, IncludeBrandLabelBinding includeBrandLabelBinding, Button button3) {
        super(dataBindingComponent, view, 1);
        this.y = button;
        this.z = button2;
        this.A = includeBrandLabelBinding;
        this.B = button3;
    }
}
