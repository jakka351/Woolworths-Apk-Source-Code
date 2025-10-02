package au.com.woolworths.feature.shop.recipes.details.di;

import au.com.woolworths.feature.shop.recipes.details.RecipeDetailsInteractor;
import au.com.woolworths.feature.shop.recipes.details.RecipeDetailsRepository;
import au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class RecipeDetailsAppModule_ProvideRecipeDetailsInteractorFactory implements Factory<RecipeDetailsInteractor> {
    public static RecipeDetailsInteractor a(RecipeDetailsAppModule recipeDetailsAppModule, RecipeDetailsRepository recipeDetailsRepository, CollectionModeInteractor collectionModeInteractor, GoogleAdManagerInteractor googleAdManagerInteractor) {
        recipeDetailsAppModule.getClass();
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(googleAdManagerInteractor, "googleAdManagerInteractor");
        return new RecipeDetailsInteractor(recipeDetailsRepository, collectionModeInteractor, googleAdManagerInteractor);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
