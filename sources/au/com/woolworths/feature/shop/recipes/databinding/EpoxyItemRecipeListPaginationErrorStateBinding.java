package au.com.woolworths.feature.shop.recipes.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.feature.shop.recipes.recipes.list.RecipeListClickHandler;

/* loaded from: classes3.dex */
public abstract class EpoxyItemRecipeListPaginationErrorStateBinding extends ViewDataBinding {
    public ResText A;
    public RecipeListClickHandler B;
    public final TextView y;
    public final Button z;

    public EpoxyItemRecipeListPaginationErrorStateBinding(View view, Button button, TextView textView, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = button;
    }
}
