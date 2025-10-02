package au.com.woolworths.feature.shop.recipes.generated.callback;

import android.view.View;
import androidx.appcompat.widget.SearchView;
import au.com.woolworths.feature.shop.recipes.databinding.ActivityRecipeListBindingImpl;
import au.com.woolworths.feature.shop.recipes.recipes.list.RecipeListViewModel;
import au.com.woolworths.feature.shop.recipes.recipes.list.RecipesListContract;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class OnFocusChangeListener implements View.OnFocusChangeListener {
    public final ActivityRecipeListBindingImpl d;

    public interface Listener {
    }

    public OnFocusChangeListener(ActivityRecipeListBindingImpl activityRecipeListBindingImpl) {
        this.d = activityRecipeListBindingImpl;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        ActivityRecipeListBindingImpl activityRecipeListBindingImpl = this.d;
        SearchView searchView = activityRecipeListBindingImpl.B;
        RecipeListViewModel recipeListViewModel = activityRecipeListBindingImpl.E;
        if (recipeListViewModel == null || searchView == null) {
            return;
        }
        searchView.getQuery();
        CharSequence currentSearchTerm = searchView.getQuery();
        Intrinsics.h(currentSearchTerm, "currentSearchTerm");
        if (z) {
            recipeListViewModel.l.f(new RecipesListContract.Actions.LaunchRecipeSearch(currentSearchTerm.toString()));
        }
    }
}
