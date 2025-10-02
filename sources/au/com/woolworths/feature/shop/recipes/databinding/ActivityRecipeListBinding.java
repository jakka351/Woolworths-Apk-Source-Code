package au.com.woolworths.feature.shop.recipes.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.feature.shop.recipes.recipes.list.RecipeListViewModel;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes3.dex */
public abstract class ActivityRecipeListBinding extends ViewDataBinding {
    public final MaterialCardView A;
    public final SearchView B;
    public final Toolbar C;
    public final TextView D;
    public RecipeListViewModel E;
    public final EpoxyRecyclerView y;
    public final IncludeGenericErrorStateBinding z;

    public ActivityRecipeListBinding(DataBindingComponent dataBindingComponent, View view, EpoxyRecyclerView epoxyRecyclerView, IncludeGenericErrorStateBinding includeGenericErrorStateBinding, MaterialCardView materialCardView, SearchView searchView, Toolbar toolbar, TextView textView) {
        super(dataBindingComponent, view, 2);
        this.y = epoxyRecyclerView;
        this.z = includeGenericErrorStateBinding;
        this.A = materialCardView;
        this.B = searchView;
        this.C = toolbar;
        this.D = textView;
    }

    public abstract void L(RecipeListViewModel recipeListViewModel);
}
