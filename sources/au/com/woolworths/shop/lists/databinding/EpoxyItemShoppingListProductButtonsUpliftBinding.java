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
public abstract class EpoxyItemShoppingListProductButtonsUpliftBinding extends ViewDataBinding {
    public final IncludeBrandLabelBinding A;
    public final Button B;
    public final Button C;
    public ProductItemUiModel D;
    public ShoppingListItemListener E;
    public ShoppingListProductItemState F;
    public final Button y;
    public final Button z;

    public EpoxyItemShoppingListProductButtonsUpliftBinding(DataBindingComponent dataBindingComponent, View view, Button button, Button button2, IncludeBrandLabelBinding includeBrandLabelBinding, Button button3, Button button4) {
        super(dataBindingComponent, view, 1);
        this.y = button;
        this.z = button2;
        this.A = includeBrandLabelBinding;
        this.B = button3;
        this.C = button4;
    }

    public abstract void L(ProductItemUiModel productItemUiModel);

    public abstract void M(ShoppingListProductItemState shoppingListProductItemState);

    public abstract void N(ShoppingListItemListener shoppingListItemListener);
}
