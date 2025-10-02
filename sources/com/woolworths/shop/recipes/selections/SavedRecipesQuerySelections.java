package com.woolworths.shop.recipes.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.aem.components.recipes.fragment.selections.RecipeSummaryCardFragmentSelections;
import au.com.woolworths.shop.graphql.type.GraphQLInt;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.Query;
import au.com.woolworths.shop.graphql.type.RecipeList;
import au.com.woolworths.shop.graphql.type.RecipeSummaryCard;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/woolworths/shop/recipes/selections/SavedRecipesQuerySelections;", "", "<init>", "()V", "__recipes", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "__savedRecipes", "__root", "get__root", "()Ljava/util/List;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SavedRecipesQuerySelections {
    public static final int $stable;

    @NotNull
    public static final SavedRecipesQuerySelections INSTANCE = new SavedRecipesQuerySelections();

    @NotNull
    private static final List<CompiledSelection> __recipes;

    @NotNull
    private static final List<CompiledSelection> __root;

    @NotNull
    private static final List<CompiledSelection> __savedRecipes;

    static {
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.f11443a)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("RecipeSummaryCard", CollectionsKt.Q("RecipeSummaryCard"));
        builder.b(RecipeSummaryCardFragmentSelections.d);
        List<CompiledSelection> listR = CollectionsKt.R(compiledFieldC, builder.a());
        __recipes = listR;
        CustomScalarType customScalarType = GraphQLInt.f11442a;
        CompiledField compiledFieldC2 = new CompiledField.Builder("totalNumberOfRecipes", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG = d.g("nextPage", customScalarType);
        CompiledField.Builder builder2 = new CompiledField.Builder("recipes", a.f(RecipeSummaryCard.f11871a));
        builder2.e = listR;
        List<CompiledSelection> listR2 = CollectionsKt.R(compiledFieldC2, compiledFieldG, builder2.c());
        __savedRecipes = listR2;
        CompiledField.Builder builder3 = new CompiledField.Builder("savedRecipes", RecipeList.f11862a);
        new CompiledArgument.Builder(Query.A2);
        builder3.d = au.com.woolworths.android.onesite.a.v();
        builder3.e = listR2;
        __root = CollectionsKt.Q(builder3.c());
        $stable = 8;
    }

    private SavedRecipesQuerySelections() {
    }

    @NotNull
    public final List<CompiledSelection> get__root() {
        return __root;
    }
}
