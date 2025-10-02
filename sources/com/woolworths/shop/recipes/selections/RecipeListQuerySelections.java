package com.woolworths.shop.recipes.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.aem.components.recipes.fragment.selections.RecipeSummaryCardFragmentSelections;
import au.com.woolworths.shop.graphql.type.AdBannerNativeSize;
import au.com.woolworths.shop.graphql.type.CardHeight;
import au.com.woolworths.shop.graphql.type.GoogleAdBannerCard;
import au.com.woolworths.shop.graphql.type.GoogleAdCustomTargeting;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLInt;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.Query;
import au.com.woolworths.shop.graphql.type.RecipeList;
import au.com.woolworths.shop.graphql.type.RecipeListFeed;
import au.com.woolworths.shop.graphql.type.TealiumAnalytics;
import au.com.woolworths.shop.graphql.type.UniversalInventoryNextBestAction;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import com.apollographql.apollo.api.CustomScalarType;
import com.apollographql.apollo.api.EnumType;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/woolworths/shop/recipes/selections/RecipeListQuerySelections;", "", "<init>", "()V", "__onActionableCard", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "__onGoogleAdBannerCard", "__googleAdBannerCard", "__onActionableCard1", "__nextBestAction", "__onUniversalInventoryContainer", "__onRecipeSummaryCard", "__recipeListFeed", "__recipeSearch", "__root", "get__root", "()Ljava/util/List;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RecipeListQuerySelections {
    public static final int $stable;

    @NotNull
    public static final RecipeListQuerySelections INSTANCE = new RecipeListQuerySelections();

    @NotNull
    private static final List<CompiledSelection> __googleAdBannerCard;

    @NotNull
    private static final List<CompiledSelection> __nextBestAction;

    @NotNull
    private static final List<CompiledSelection> __onActionableCard;

    @NotNull
    private static final List<CompiledSelection> __onActionableCard1;

    @NotNull
    private static final List<CompiledSelection> __onGoogleAdBannerCard;

    @NotNull
    private static final List<CompiledSelection> __onRecipeSummaryCard;

    @NotNull
    private static final List<CompiledSelection> __onUniversalInventoryContainer;

    @NotNull
    private static final List<CompiledSelection> __recipeListFeed;

    @NotNull
    private static final List<CompiledSelection> __recipeSearch;

    @NotNull
    private static final List<CompiledSelection> __root;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC2 = new CompiledField.Builder("link", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC3 = new CompiledField.Builder("image", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC4 = new CompiledField.Builder("altText", CompiledGraphQL.b(customScalarType)).c();
        CardHeight.e.getClass();
        EnumType enumType = CardHeight.f;
        CompiledField compiledFieldC5 = new CompiledField.Builder("cardHeight", CompiledGraphQL.b(enumType)).c();
        CustomScalarType customScalarType2 = TealiumAnalytics.f11963a;
        CompiledField compiledFieldC6 = new CompiledField.Builder("analytics", customScalarType2).c();
        CustomScalarType customScalarType3 = GraphQLBoolean.f11439a;
        List<CompiledSelection> listR = CollectionsKt.R(compiledFieldC, compiledFieldC2, compiledFieldC3, compiledFieldC4, compiledFieldC5, compiledFieldC6, new CompiledField.Builder("_excluded", customScalarType3).c());
        __onActionableCard = listR;
        CompiledField compiledFieldC7 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC8 = new CompiledField.Builder(OutOfContextTestingActivity.AD_UNIT_KEY, CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC9 = new CompiledField.Builder("nativeCustomTemplateId", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC10 = new CompiledField.Builder("iabSpec", CompiledGraphQL.b(customScalarType3)).c();
        CompiledField compiledFieldG = d.g("iabSize", customScalarType);
        AdBannerNativeSize.e.getClass();
        EnumType enumType2 = AdBannerNativeSize.f;
        CompiledField compiledFieldC11 = new CompiledField.Builder("height", CompiledGraphQL.b(enumType2)).c();
        CustomScalarType customScalarType4 = GoogleAdCustomTargeting.f11436a;
        List<CompiledSelection> listR2 = CollectionsKt.R(compiledFieldC7, compiledFieldC8, compiledFieldC9, compiledFieldC10, compiledFieldG, compiledFieldC11, new CompiledField.Builder("targeting", customScalarType4).c(), d.g("correlator", customScalarType), d.g("_excluded", customScalarType3));
        __onGoogleAdBannerCard = listR2;
        List<CompiledSelection> listR3 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder(OutOfContextTestingActivity.AD_UNIT_KEY, CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("nativeCustomTemplateId", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("iabSpec", CompiledGraphQL.b(customScalarType3)).c(), d.g("iabSize", customScalarType), new CompiledField.Builder("height", CompiledGraphQL.b(enumType2)).c(), d.g("targeting", customScalarType4), d.g("correlator", customScalarType), d.g("_excluded", customScalarType3));
        __googleAdBannerCard = listR3;
        List<CompiledSelection> listR4 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("link", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("image", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("altText", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("cardHeight", CompiledGraphQL.b(enumType)).c(), d.g("analytics", customScalarType2), d.g("_excluded", customScalarType3));
        __onActionableCard1 = listR4;
        CompiledField compiledFieldC12 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("ActionableCard", CollectionsKt.Q("ActionableCard"));
        builder.d = listR4;
        List<CompiledSelection> listR5 = CollectionsKt.R(compiledFieldC12, builder.a());
        __nextBestAction = listR5;
        CompiledField.Builder builder2 = new CompiledField.Builder("googleAdBannerCard", GoogleAdBannerCard.f11435a);
        builder2.e = listR3;
        CompiledField compiledFieldC13 = builder2.c();
        CompiledField.Builder builder3 = new CompiledField.Builder("nextBestAction", UniversalInventoryNextBestAction.f11980a);
        builder3.e = listR5;
        List<CompiledSelection> listR6 = CollectionsKt.R(compiledFieldC13, builder3.c());
        __onUniversalInventoryContainer = listR6;
        CompiledField compiledFieldC14 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder4 = new CompiledFragment.Builder("RecipeSummaryCard", CollectionsKt.Q("RecipeSummaryCard"));
        builder4.b(RecipeSummaryCardFragmentSelections.d);
        List<CompiledSelection> listR7 = CollectionsKt.R(compiledFieldC14, builder4.a());
        __onRecipeSummaryCard = listR7;
        CompiledField compiledFieldC15 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder5 = new CompiledFragment.Builder("ActionableCard", CollectionsKt.Q("ActionableCard"));
        builder5.d = listR;
        CompiledFragment compiledFragmentA = builder5.a();
        CompiledFragment.Builder builder6 = new CompiledFragment.Builder("GoogleAdBannerCard", CollectionsKt.Q("GoogleAdBannerCard"));
        builder6.c = a.s("includeUniversalInventoryFallback", true);
        builder6.d = listR2;
        CompiledFragment compiledFragmentA2 = builder6.a();
        CompiledFragment.Builder builder7 = new CompiledFragment.Builder("UniversalInventoryContainer", CollectionsKt.Q("UniversalInventoryContainer"));
        builder7.c = a.s("includeUniversalInventoryFallback", false);
        builder7.d = listR6;
        CompiledFragment compiledFragmentA3 = builder7.a();
        CompiledFragment.Builder builder8 = new CompiledFragment.Builder("RecipeSummaryCard", CollectionsKt.Q("RecipeSummaryCard"));
        builder8.d = listR7;
        List<CompiledSelection> listR8 = CollectionsKt.R(compiledFieldC15, compiledFragmentA, compiledFragmentA2, compiledFragmentA3, builder8.a());
        __recipeListFeed = listR8;
        CustomScalarType customScalarType5 = GraphQLInt.f11442a;
        CompiledField compiledFieldC16 = new CompiledField.Builder("totalNumberOfRecipes", CompiledGraphQL.b(customScalarType5)).c();
        CompiledField compiledFieldG2 = d.g("nextPage", customScalarType5);
        CompiledField.Builder builder9 = new CompiledField.Builder("recipeListFeed", CompiledGraphQL.b(CompiledGraphQL.a(RecipeListFeed.f11863a)));
        builder9.e = listR8;
        List<CompiledSelection> listR9 = CollectionsKt.R(compiledFieldC16, compiledFieldG2, builder9.c(), d.g("title", customScalarType));
        __recipeSearch = listR9;
        CompiledField.Builder builder10 = new CompiledField.Builder("recipeSearch", RecipeList.f11862a);
        new CompiledArgument.Builder(Query.v2);
        CompiledArgument compiledArgument = new CompiledArgument();
        new CompiledArgument.Builder(Query.x2);
        CompiledArgument compiledArgument2 = new CompiledArgument();
        new CompiledArgument.Builder(Query.y2);
        CompiledArgument compiledArgument3 = new CompiledArgument();
        new CompiledArgument.Builder(Query.t2);
        CompiledArgument compiledArgument4 = new CompiledArgument();
        new CompiledArgument.Builder(Query.w2);
        CompiledArgument compiledArgument5 = new CompiledArgument();
        new CompiledArgument.Builder(Query.z2);
        CompiledArgument compiledArgument6 = new CompiledArgument();
        new CompiledArgument.Builder(Query.u2);
        builder10.d = CollectionsKt.R(compiledArgument, compiledArgument2, compiledArgument3, compiledArgument4, compiledArgument5, compiledArgument6, new CompiledArgument());
        builder10.e = listR9;
        __root = CollectionsKt.Q(builder10.c());
        $stable = 8;
    }

    private RecipeListQuerySelections() {
    }

    @NotNull
    public final List<CompiledSelection> get__root() {
        return __root;
    }
}
