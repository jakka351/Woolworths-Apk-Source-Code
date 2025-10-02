package au.com.woolworths.shop.lists.databinding;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListItemListener;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.TextItemUiModel;

/* loaded from: classes4.dex */
public abstract class EpoxyItemShoppingListTextBinding extends ViewDataBinding {
    public final FrameLayout A;
    public final EditText B;
    public TextItemUiModel C;
    public Boolean D;
    public Boolean E;
    public ShoppingListItemListener F;
    public final CheckBox y;
    public final ImageView z;

    public EpoxyItemShoppingListTextBinding(DataBindingComponent dataBindingComponent, View view, CheckBox checkBox, ImageView imageView, FrameLayout frameLayout, EditText editText) {
        super(dataBindingComponent, view, 0);
        this.y = checkBox;
        this.z = imageView;
        this.A = frameLayout;
        this.B = editText;
    }
}
