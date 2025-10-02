package au.com.woolworths.feature.shop.recipes.databinding;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.recipes.details.ServesQuantityClickListener;
import au.com.woolworths.feature.shop.recipes.details.data.RecipeServesData;

/* loaded from: classes3.dex */
public abstract class ServesQuantityControlLayoutBinding extends ViewDataBinding {
    public final TextView A;
    public RecipeServesData B;
    public ServesQuantityClickListener C;
    public final ImageButton y;
    public final ImageButton z;

    public ServesQuantityControlLayoutBinding(DataBindingComponent dataBindingComponent, View view, ImageButton imageButton, ImageButton imageButton2, TextView textView) {
        super(dataBindingComponent, view, 0);
        this.y = imageButton;
        this.z = imageButton2;
        this.A = textView;
    }
}
