package com.woolworths.feature.shop.recipes.details.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.GraphQLInt;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.IngredientsSection;
import au.com.woolworths.shop.graphql.type.Query;
import au.com.woolworths.shop.graphql.type.RecipeServes;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/selections/GetIngredientsQuerySelections;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetIngredientsQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f20314a;
    public static final List b;
    public static final List c;

    static {
        CustomScalarType customScalarType = GraphQLInt.f11442a;
        CompiledField compiledFieldC = new CompiledField.Builder("quantity", CompiledGraphQL.b(customScalarType)).c();
        CustomScalarType customScalarType2 = GraphQLString.f11443a;
        List listR = CollectionsKt.R(compiledFieldC, new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType2)).c(), new CompiledField.Builder("minimum", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("maximum", CompiledGraphQL.b(customScalarType)).c());
        f20314a = listR;
        CompiledField.Builder builder = new CompiledField.Builder("servesInfo", RecipeServes.f11869a);
        builder.e = listR;
        List listR2 = CollectionsKt.R(builder.c(), new CompiledField.Builder("ingredients", a.e(customScalarType2)).c());
        b = listR2;
        CompiledField.Builder builder2 = new CompiledField.Builder("getIngredients", IngredientsSection.f11506a);
        new CompiledArgument.Builder(Query.r2);
        CompiledArgument compiledArgument = new CompiledArgument();
        new CompiledArgument.Builder(Query.s2);
        builder2.d = CollectionsKt.R(compiledArgument, new CompiledArgument());
        builder2.e = listR2;
        c = CollectionsKt.Q(builder2.c());
    }
}
