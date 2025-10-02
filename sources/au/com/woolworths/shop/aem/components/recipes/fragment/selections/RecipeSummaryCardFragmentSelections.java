package au.com.woolworths.shop.aem.components.recipes.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLFloat;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.RecipeCostPerServe;
import au.com.woolworths.shop.graphql.type.RecipeDuration;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.apollographql.apollo.api.ObjectType;
import com.salesforce.marketingcloud.storage.db.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/recipes/fragment/selections/RecipeSummaryCardFragmentSelections;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RecipeSummaryCardFragmentSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f10208a;
    public static final List b;
    public static final List c;
    public static final List d;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listR = CollectionsKt.R(new CompiledField.Builder("duration", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("altText", CompiledGraphQL.b(customScalarType)).c());
        f10208a = listR;
        List listR2 = CollectionsKt.R(new CompiledField.Builder("duration", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("altText", CompiledGraphQL.b(customScalarType)).c());
        b = listR2;
        List listQ = CollectionsKt.Q(new CompiledField.Builder("recipeCostPerServePrice", CompiledGraphQL.b(GraphQLFloat.f11440a)).c());
        c = listQ;
        CompiledField compiledFieldC = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC2 = new CompiledField.Builder("image", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC3 = new CompiledField.Builder("id", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC4 = new CompiledField.Builder(k.a.g, CompiledGraphQL.a(CompiledGraphQL.b(customScalarType))).c();
        CompiledField compiledFieldC5 = new CompiledField.Builder("sourceName", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder = new CompiledField.Builder("isVideoAvailable", CompiledGraphQL.b(GraphQLBoolean.f11439a));
        builder.c = a.s("isVideoTagOnRecipeCardEnabled", false);
        CompiledField compiledFieldC6 = builder.c();
        ObjectType objectType = RecipeDuration.f11858a;
        CompiledField.Builder builder2 = new CompiledField.Builder("recipePrepDuration", objectType);
        builder2.e = listR;
        CompiledField compiledFieldC7 = builder2.c();
        CompiledField.Builder builder3 = new CompiledField.Builder("recipeCookDuration", objectType);
        builder3.e = listR2;
        CompiledField compiledFieldC8 = builder3.c();
        CompiledField.Builder builder4 = new CompiledField.Builder("recipeCostPerServe", RecipeCostPerServe.f11856a);
        builder4.e = listQ;
        d = CollectionsKt.R(compiledFieldC, compiledFieldC2, compiledFieldC3, compiledFieldC4, compiledFieldC5, compiledFieldC6, compiledFieldC7, compiledFieldC8, builder4.c());
    }
}
