package au.com.woolworths.feature.shop.recipes.recipes;

import androidx.lifecycle.LiveData;
import au.com.woolworths.pagingutils.PageKeyedPagingSource;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecipesInteractor$fetchRecipeListBySearchTerm$$inlined$getPageListing$5 implements Function1<PageKeyedPagingSource<Integer, Object>, LiveData<Integer>> {
    public static final RecipesInteractor$fetchRecipeListBySearchTerm$$inlined$getPageListing$5 d = new RecipesInteractor$fetchRecipeListBySearchTerm$$inlined$getPageListing$5();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((PageKeyedPagingSource) obj).f;
    }
}
