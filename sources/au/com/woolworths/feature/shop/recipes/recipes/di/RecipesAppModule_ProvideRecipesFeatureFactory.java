package au.com.woolworths.feature.shop.recipes.recipes.di;

import au.com.woolworths.android.onesite.featuretoggles.Feature;
import au.com.woolworths.feature.shop.recipes.details.RecipeDetailsFeature;
import au.com.woolworths.feature.shop.recipes.feature.RecipesFeature;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.AbstractCollection;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class RecipesAppModule_ProvideRecipesFeatureFactory implements Factory<Set<Feature>> {
    public static LinkedHashSet a(RecipesAppModule recipesAppModule) {
        recipesAppModule.getClass();
        Set setL0 = CollectionsKt.L0(RecipesFeature.f);
        Object[] array = ((AbstractCollection) RecipeDetailsFeature.e).toArray(new RecipeDetailsFeature[0]);
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.h(setL0.size() + array.length));
        linkedHashSet.addAll(setL0);
        CollectionsKt.j(linkedHashSet, array);
        return linkedHashSet;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a(null);
        throw null;
    }
}
