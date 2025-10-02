package au.com.woolworths.feature.shop.recipes.recipes;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.paging.LivePagedList;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PagedList;
import androidx.paging.PagingSource;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.pagingutils.NumericPageKeyedPagingSourceFactory;
import au.com.woolworths.pagingutils.NumericPageListing;
import au.com.woolworths.pagingutils.PageKeyedPagingSource;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/recipes/RecipesInteractor;", "", "Companion", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RecipesInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final RecipesRepository f8066a;
    public final CollectionModeInteractor b;
    public final GoogleAdManagerInteractor c;
    public final FeatureToggleManager d;
    public final PagedList.Config e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/recipes/RecipesInteractor$Companion;", "", "", "RECIPE_PAGING_LOAD_SIZE", "I", "RECIPE_PAGING_PRELOAD_SIZE", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public RecipesInteractor(RecipesRepository recipesRepository, CollectionModeInteractor collectionModeInteractor, GoogleAdManagerInteractor googleAdManagerInteractor, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(googleAdManagerInteractor, "googleAdManagerInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f8066a = recipesRepository;
        this.b = collectionModeInteractor;
        this.c = googleAdManagerInteractor;
        this.d = featureToggleManager;
        PagedList.Config.Builder builder = new PagedList.Config.Builder();
        builder.d = false;
        builder.b = 10;
        builder.c = 20;
        builder.b(20);
        this.e = builder.a();
    }

    public final NumericPageListing a(String searchTerm) {
        Intrinsics.h(searchTerm, "searchTerm");
        final NumericPageKeyedPagingSourceFactory numericPageKeyedPagingSourceFactory = new NumericPageKeyedPagingSourceFactory(null, new RecipesInteractor$fetchRecipeListBySearchTerm$1(this, searchTerm, null));
        LivePagedList livePagedListA = new LivePagedListBuilder(new Function0<PagingSource<Integer, Object>>() { // from class: au.com.woolworths.feature.shop.recipes.recipes.RecipesInteractor$fetchRecipeListBySearchTerm$$inlined$getPageListing$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return numericPageKeyedPagingSourceFactory.a();
            }
        }, this.e).a();
        RecipesInteractor$fetchRecipeListBySearchTerm$$inlined$getPageListing$2 recipesInteractor$fetchRecipeListBySearchTerm$$inlined$getPageListing$2 = RecipesInteractor$fetchRecipeListBySearchTerm$$inlined$getPageListing$2.d;
        MutableLiveData mutableLiveData = numericPageKeyedPagingSourceFactory.c;
        return new NumericPageListing(livePagedListA, Transformations.c(mutableLiveData, recipesInteractor$fetchRecipeListBySearchTerm$$inlined$getPageListing$2), Transformations.c(mutableLiveData, RecipesInteractor$fetchRecipeListBySearchTerm$$inlined$getPageListing$3.d), new Function0<Unit>() { // from class: au.com.woolworths.feature.shop.recipes.recipes.RecipesInteractor$fetchRecipeListBySearchTerm$$inlined$getPageListing$4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PageKeyedPagingSource pageKeyedPagingSource = (PageKeyedPagingSource) numericPageKeyedPagingSourceFactory.c.e();
                if (pageKeyedPagingSource != null) {
                    pageKeyedPagingSource.c();
                }
                return Unit.f24250a;
            }
        }, Transformations.c(mutableLiveData, RecipesInteractor$fetchRecipeListBySearchTerm$$inlined$getPageListing$5.d), Transformations.c(mutableLiveData, RecipesInteractor$fetchRecipeListBySearchTerm$$inlined$getPageListing$6.d));
    }

    public final NumericPageListing b(String str, List list) {
        final NumericPageKeyedPagingSourceFactory numericPageKeyedPagingSourceFactory = new NumericPageKeyedPagingSourceFactory(null, new RecipesInteractor$fetchRecipeListBySourceAndTags$1(this, list, str, null));
        LivePagedList livePagedListA = new LivePagedListBuilder(new Function0<PagingSource<Integer, Object>>() { // from class: au.com.woolworths.feature.shop.recipes.recipes.RecipesInteractor$fetchRecipeListBySourceAndTags$$inlined$getPageListing$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return numericPageKeyedPagingSourceFactory.a();
            }
        }, this.e).a();
        RecipesInteractor$fetchRecipeListBySourceAndTags$$inlined$getPageListing$2 recipesInteractor$fetchRecipeListBySourceAndTags$$inlined$getPageListing$2 = RecipesInteractor$fetchRecipeListBySourceAndTags$$inlined$getPageListing$2.d;
        MutableLiveData mutableLiveData = numericPageKeyedPagingSourceFactory.c;
        return new NumericPageListing(livePagedListA, Transformations.c(mutableLiveData, recipesInteractor$fetchRecipeListBySourceAndTags$$inlined$getPageListing$2), Transformations.c(mutableLiveData, RecipesInteractor$fetchRecipeListBySourceAndTags$$inlined$getPageListing$3.d), new Function0<Unit>() { // from class: au.com.woolworths.feature.shop.recipes.recipes.RecipesInteractor$fetchRecipeListBySourceAndTags$$inlined$getPageListing$4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PageKeyedPagingSource pageKeyedPagingSource = (PageKeyedPagingSource) numericPageKeyedPagingSourceFactory.c.e();
                if (pageKeyedPagingSource != null) {
                    pageKeyedPagingSource.c();
                }
                return Unit.f24250a;
            }
        }, Transformations.c(mutableLiveData, RecipesInteractor$fetchRecipeListBySourceAndTags$$inlined$getPageListing$5.d), Transformations.c(mutableLiveData, RecipesInteractor$fetchRecipeListBySourceAndTags$$inlined$getPageListing$6.d));
    }

    public final NumericPageListing c() {
        final NumericPageKeyedPagingSourceFactory numericPageKeyedPagingSourceFactory = new NumericPageKeyedPagingSourceFactory(null, new RecipesInteractor$fetchSavedRecipes$1(this, null));
        LivePagedList livePagedListA = new LivePagedListBuilder(new Function0<PagingSource<Integer, Object>>() { // from class: au.com.woolworths.feature.shop.recipes.recipes.RecipesInteractor$fetchSavedRecipes$$inlined$getPageListing$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return numericPageKeyedPagingSourceFactory.a();
            }
        }, this.e).a();
        RecipesInteractor$fetchSavedRecipes$$inlined$getPageListing$2 recipesInteractor$fetchSavedRecipes$$inlined$getPageListing$2 = RecipesInteractor$fetchSavedRecipes$$inlined$getPageListing$2.d;
        MutableLiveData mutableLiveData = numericPageKeyedPagingSourceFactory.c;
        return new NumericPageListing(livePagedListA, Transformations.c(mutableLiveData, recipesInteractor$fetchSavedRecipes$$inlined$getPageListing$2), Transformations.c(mutableLiveData, RecipesInteractor$fetchSavedRecipes$$inlined$getPageListing$3.d), new Function0<Unit>() { // from class: au.com.woolworths.feature.shop.recipes.recipes.RecipesInteractor$fetchSavedRecipes$$inlined$getPageListing$4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PageKeyedPagingSource pageKeyedPagingSource = (PageKeyedPagingSource) numericPageKeyedPagingSourceFactory.c.e();
                if (pageKeyedPagingSource != null) {
                    pageKeyedPagingSource.c();
                }
                return Unit.f24250a;
            }
        }, Transformations.c(mutableLiveData, RecipesInteractor$fetchSavedRecipes$$inlined$getPageListing$5.d), Transformations.c(mutableLiveData, RecipesInteractor$fetchSavedRecipes$$inlined$getPageListing$6.d));
    }
}
