package com.woolworths.shop.recipes;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.graphql.TealiumAnalytics;
import au.com.woolworths.android.onesite.graphql.GoogleAdCustomTargeting;
import au.com.woolworths.android.onesite.models.search.RecentSearch;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.aem.components.recipes.fragment.RecipeSummaryCardFragment;
import au.com.woolworths.shop.graphql.type.AdBannerNativeSize;
import au.com.woolworths.shop.graphql.type.CardHeight;
import au.com.woolworths.shop.graphql.type.ShoppingModeType;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.salesforce.marketingcloud.storage.db.k;
import com.woolworths.shop.recipes.adapter.RecipeListQuery_ResponseAdapter;
import com.woolworths.shop.recipes.adapter.RecipeListQuery_VariablesAdapter;
import com.woolworths.shop.recipes.selections.RecipeListQuerySelections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u0000 F2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000b<=>?@ABCDEFB\u009f\u0001\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0004\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u001f\u001a\u00020\bH\u0016J\b\u0010 \u001a\u00020\bH\u0016J\b\u0010!\u001a\u00020\bH\u0016J \u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0010H\u0016J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020*H\u0016J\b\u0010+\u001a\u00020,H\u0016J\u0011\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u0011\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004HÆ\u0003J\u0011\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004HÆ\u0003J\u0011\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0004HÆ\u0003J\u0011\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004HÆ\u0003J\u0017\u00103\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0004HÆ\u0003J\t\u00104\u001a\u00020\u0010HÆ\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004HÆ\u0003J¥\u0001\u00106\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00042\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00042\u0010\b\u0002\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00042\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004HÆ\u0001J\u0013\u00107\u001a\u00020\u00102\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u00020\fHÖ\u0001J\t\u0010;\u001a\u00020\bHÖ\u0001R\u0019\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0019\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0019\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u001f\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0015¨\u0006G"}, d2 = {"Lcom/woolworths/shop/recipes/RecipeListQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/shop/recipes/RecipeListQuery$Data;", "shoppingMode", "Lcom/apollographql/apollo/api/Optional;", "Lau/com/woolworths/shop/graphql/type/ShoppingModeType;", k.a.g, "", "", "key", "source", "pageNumber", "", RecentSearch.COLUMN_NAME_SEARCH_TERM, "supportedLinks", "includeUniversalInventoryFallback", "", "isVideoTagOnRecipeCardEnabled", "<init>", "(Lcom/apollographql/apollo/api/Optional;Ljava/util/List;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;ZLcom/apollographql/apollo/api/Optional;)V", "getShoppingMode", "()Lcom/apollographql/apollo/api/Optional;", "getTags", "()Ljava/util/List;", "getKey", "getSource", "getPageNumber", "getSearchTerm", "getSupportedLinks", "getIncludeUniversalInventoryFallback", "()Z", "id", "document", AppMeasurementSdk.ConditionalUserProperty.NAME, "serializeVariables", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "withDefaultValues", "adapter", "Lcom/apollographql/apollo/api/Adapter;", "rootField", "Lcom/apollographql/apollo/api/CompiledField;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "Data", "RecipeSearch", "RecipeListFeed", "OnActionableCard", "OnGoogleAdBannerCard", "OnUniversalInventoryContainer", "GoogleAdBannerCard", "NextBestAction", "OnActionableCard1", "OnRecipeSummaryCard", "Companion", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RecipeListQuery implements Query<Data> {

    @NotNull
    public static final String OPERATION_ID = "aaf835aa514bd2fc43c69169fdc5a9f8ca0590f4bbd5499f06ee3cd516cd47c5";

    @NotNull
    public static final String OPERATION_NAME = "RecipeList";
    private final boolean includeUniversalInventoryFallback;

    @NotNull
    private final Optional<Boolean> isVideoTagOnRecipeCardEnabled;

    @NotNull
    private final Optional<String> key;

    @NotNull
    private final Optional<Integer> pageNumber;

    @NotNull
    private final Optional<String> searchTerm;

    @NotNull
    private final Optional<ShoppingModeType> shoppingMode;

    @NotNull
    private final Optional<String> source;

    @NotNull
    private final Optional<List<String>> supportedLinks;

    @NotNull
    private final List<String> tags;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/woolworths/shop/recipes/RecipeListQuery$Companion;", "", "<init>", "()V", "OPERATION_ID", "", "OPERATION_DOCUMENT", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_NAME", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getOPERATION_DOCUMENT() {
            return "query RecipeList($shoppingMode: ShoppingModeType, $tags: [String!]!, $key: String, $source: String, $pageNumber: Int, $searchTerm: String, $supportedLinks: [String!], $includeUniversalInventoryFallback: Boolean!, $isVideoTagOnRecipeCardEnabled: Boolean! = false ) { recipeSearch(shoppingMode: $shoppingMode, tags: $tags, key: $key, source: $source, pageNumber: $pageNumber, searchTerm: $searchTerm, supportedLinks: $supportedLinks) { totalNumberOfRecipes nextPage recipeListFeed { __typename ... on ActionableCard { __typename link image altText cardHeight analytics _excluded } ... on GoogleAdBannerCard @skip(if: $includeUniversalInventoryFallback) { __typename adUnit nativeCustomTemplateId iabSpec iabSize height targeting correlator _excluded } ... on UniversalInventoryContainer @include(if: $includeUniversalInventoryFallback) { googleAdBannerCard { __typename adUnit nativeCustomTemplateId iabSpec iabSize height targeting correlator _excluded } nextBestAction { __typename ... on ActionableCard { __typename link image altText cardHeight analytics _excluded } } } ... on RecipeSummaryCard { __typename ...recipeSummaryCardFragment } } title } }  fragment recipeSummaryCardFragment on RecipeSummaryCard { title image id tags sourceName isVideoAvailable @include(if: $isVideoTagOnRecipeCardEnabled) recipePrepDuration { duration altText } recipeCookDuration { duration altText } recipeCostPerServe { recipeCostPerServePrice } }";
        }

        private Companion() {
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/woolworths/shop/recipes/RecipeListQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "recipeSearch", "Lcom/woolworths/shop/recipes/RecipeListQuery$RecipeSearch;", "<init>", "(Lcom/woolworths/shop/recipes/RecipeListQuery$RecipeSearch;)V", "getRecipeSearch", "()Lcom/woolworths/shop/recipes/RecipeListQuery$RecipeSearch;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {
        public static final int $stable = 8;

        @Nullable
        private final RecipeSearch recipeSearch;

        public Data(@Nullable RecipeSearch recipeSearch) {
            this.recipeSearch = recipeSearch;
        }

        public static /* synthetic */ Data copy$default(Data data, RecipeSearch recipeSearch, int i, Object obj) {
            if ((i & 1) != 0) {
                recipeSearch = data.recipeSearch;
            }
            return data.copy(recipeSearch);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final RecipeSearch getRecipeSearch() {
            return this.recipeSearch;
        }

        @NotNull
        public final Data copy(@Nullable RecipeSearch recipeSearch) {
            return new Data(recipeSearch);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Data) && Intrinsics.c(this.recipeSearch, ((Data) other).recipeSearch);
        }

        @Nullable
        public final RecipeSearch getRecipeSearch() {
            return this.recipeSearch;
        }

        public int hashCode() {
            RecipeSearch recipeSearch = this.recipeSearch;
            if (recipeSearch == null) {
                return 0;
            }
            return recipeSearch.hashCode();
        }

        @NotNull
        public String toString() {
            return "Data(recipeSearch=" + this.recipeSearch + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001eJp\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020\u00072\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001e¨\u00060"}, d2 = {"Lcom/woolworths/shop/recipes/RecipeListQuery$GoogleAdBannerCard;", "", "__typename", "", OutOfContextTestingActivity.AD_UNIT_KEY, "nativeCustomTemplateId", "iabSpec", "", "iabSize", "height", "Lau/com/woolworths/shop/graphql/type/AdBannerNativeSize;", "targeting", "Lau/com/woolworths/android/onesite/graphql/GoogleAdCustomTargeting;", "correlator", "_excluded", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lau/com/woolworths/shop/graphql/type/AdBannerNativeSize;Lau/com/woolworths/android/onesite/graphql/GoogleAdCustomTargeting;Ljava/lang/String;Ljava/lang/Boolean;)V", "get__typename", "()Ljava/lang/String;", "getAdUnit", "getNativeCustomTemplateId", "getIabSpec", "()Z", "getIabSize", "getHeight", "()Lau/com/woolworths/shop/graphql/type/AdBannerNativeSize;", "getTargeting", "()Lau/com/woolworths/android/onesite/graphql/GoogleAdCustomTargeting;", "getCorrelator", "get_excluded", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lau/com/woolworths/shop/graphql/type/AdBannerNativeSize;Lau/com/woolworths/android/onesite/graphql/GoogleAdCustomTargeting;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/woolworths/shop/recipes/RecipeListQuery$GoogleAdBannerCard;", "equals", "other", "hashCode", "", "toString", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class GoogleAdBannerCard {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @Nullable
        private final Boolean _excluded;

        @NotNull
        private final String adUnit;

        @Nullable
        private final String correlator;

        @NotNull
        private final AdBannerNativeSize height;

        @Nullable
        private final String iabSize;
        private final boolean iabSpec;

        @NotNull
        private final String nativeCustomTemplateId;

        @Nullable
        private final GoogleAdCustomTargeting targeting;

        public GoogleAdBannerCard(@NotNull String __typename, @NotNull String adUnit, @NotNull String nativeCustomTemplateId, boolean z, @Nullable String str, @NotNull AdBannerNativeSize height, @Nullable GoogleAdCustomTargeting googleAdCustomTargeting, @Nullable String str2, @Nullable Boolean bool) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(adUnit, "adUnit");
            Intrinsics.h(nativeCustomTemplateId, "nativeCustomTemplateId");
            Intrinsics.h(height, "height");
            this.__typename = __typename;
            this.adUnit = adUnit;
            this.nativeCustomTemplateId = nativeCustomTemplateId;
            this.iabSpec = z;
            this.iabSize = str;
            this.height = height;
            this.targeting = googleAdCustomTargeting;
            this.correlator = str2;
            this._excluded = bool;
        }

        public static /* synthetic */ GoogleAdBannerCard copy$default(GoogleAdBannerCard googleAdBannerCard, String str, String str2, String str3, boolean z, String str4, AdBannerNativeSize adBannerNativeSize, GoogleAdCustomTargeting googleAdCustomTargeting, String str5, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                str = googleAdBannerCard.__typename;
            }
            if ((i & 2) != 0) {
                str2 = googleAdBannerCard.adUnit;
            }
            if ((i & 4) != 0) {
                str3 = googleAdBannerCard.nativeCustomTemplateId;
            }
            if ((i & 8) != 0) {
                z = googleAdBannerCard.iabSpec;
            }
            if ((i & 16) != 0) {
                str4 = googleAdBannerCard.iabSize;
            }
            if ((i & 32) != 0) {
                adBannerNativeSize = googleAdBannerCard.height;
            }
            if ((i & 64) != 0) {
                googleAdCustomTargeting = googleAdBannerCard.targeting;
            }
            if ((i & 128) != 0) {
                str5 = googleAdBannerCard.correlator;
            }
            if ((i & 256) != 0) {
                bool = googleAdBannerCard._excluded;
            }
            String str6 = str5;
            Boolean bool2 = bool;
            AdBannerNativeSize adBannerNativeSize2 = adBannerNativeSize;
            GoogleAdCustomTargeting googleAdCustomTargeting2 = googleAdCustomTargeting;
            String str7 = str4;
            String str8 = str3;
            return googleAdBannerCard.copy(str, str2, str8, z, str7, adBannerNativeSize2, googleAdCustomTargeting2, str6, bool2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getAdUnit() {
            return this.adUnit;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getNativeCustomTemplateId() {
            return this.nativeCustomTemplateId;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIabSpec() {
            return this.iabSpec;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final String getIabSize() {
            return this.iabSize;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final AdBannerNativeSize getHeight() {
            return this.height;
        }

        @Nullable
        /* renamed from: component7, reason: from getter */
        public final GoogleAdCustomTargeting getTargeting() {
            return this.targeting;
        }

        @Nullable
        /* renamed from: component8, reason: from getter */
        public final String getCorrelator() {
            return this.correlator;
        }

        @Nullable
        /* renamed from: component9, reason: from getter */
        public final Boolean get_excluded() {
            return this._excluded;
        }

        @NotNull
        public final GoogleAdBannerCard copy(@NotNull String __typename, @NotNull String adUnit, @NotNull String nativeCustomTemplateId, boolean iabSpec, @Nullable String iabSize, @NotNull AdBannerNativeSize height, @Nullable GoogleAdCustomTargeting targeting, @Nullable String correlator, @Nullable Boolean _excluded) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(adUnit, "adUnit");
            Intrinsics.h(nativeCustomTemplateId, "nativeCustomTemplateId");
            Intrinsics.h(height, "height");
            return new GoogleAdBannerCard(__typename, adUnit, nativeCustomTemplateId, iabSpec, iabSize, height, targeting, correlator, _excluded);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GoogleAdBannerCard)) {
                return false;
            }
            GoogleAdBannerCard googleAdBannerCard = (GoogleAdBannerCard) other;
            return Intrinsics.c(this.__typename, googleAdBannerCard.__typename) && Intrinsics.c(this.adUnit, googleAdBannerCard.adUnit) && Intrinsics.c(this.nativeCustomTemplateId, googleAdBannerCard.nativeCustomTemplateId) && this.iabSpec == googleAdBannerCard.iabSpec && Intrinsics.c(this.iabSize, googleAdBannerCard.iabSize) && this.height == googleAdBannerCard.height && Intrinsics.c(this.targeting, googleAdBannerCard.targeting) && Intrinsics.c(this.correlator, googleAdBannerCard.correlator) && Intrinsics.c(this._excluded, googleAdBannerCard._excluded);
        }

        @NotNull
        public final String getAdUnit() {
            return this.adUnit;
        }

        @Nullable
        public final String getCorrelator() {
            return this.correlator;
        }

        @NotNull
        public final AdBannerNativeSize getHeight() {
            return this.height;
        }

        @Nullable
        public final String getIabSize() {
            return this.iabSize;
        }

        public final boolean getIabSpec() {
            return this.iabSpec;
        }

        @NotNull
        public final String getNativeCustomTemplateId() {
            return this.nativeCustomTemplateId;
        }

        @Nullable
        public final GoogleAdCustomTargeting getTargeting() {
            return this.targeting;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        @Nullable
        public final Boolean get_excluded() {
            return this._excluded;
        }

        public int hashCode() {
            int iE = b.e(b.c(b.c(this.__typename.hashCode() * 31, 31, this.adUnit), 31, this.nativeCustomTemplateId), 31, this.iabSpec);
            String str = this.iabSize;
            int iHashCode = (this.height.hashCode() + ((iE + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            GoogleAdCustomTargeting googleAdCustomTargeting = this.targeting;
            int iHashCode2 = (iHashCode + (googleAdCustomTargeting == null ? 0 : googleAdCustomTargeting.hashCode())) * 31;
            String str2 = this.correlator;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this._excluded;
            return iHashCode3 + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.__typename;
            String str2 = this.adUnit;
            String str3 = this.nativeCustomTemplateId;
            boolean z = this.iabSpec;
            String str4 = this.iabSize;
            AdBannerNativeSize adBannerNativeSize = this.height;
            GoogleAdCustomTargeting googleAdCustomTargeting = this.targeting;
            String str5 = this.correlator;
            Boolean bool = this._excluded;
            StringBuilder sbV = a.v("GoogleAdBannerCard(__typename=", str, ", adUnit=", str2, ", nativeCustomTemplateId=");
            d.A(str3, ", iabSpec=", ", iabSize=", sbV, z);
            sbV.append(str4);
            sbV.append(", height=");
            sbV.append(adBannerNativeSize);
            sbV.append(", targeting=");
            sbV.append(googleAdCustomTargeting);
            sbV.append(", correlator=");
            sbV.append(str5);
            sbV.append(", _excluded=");
            return au.com.woolworths.android.onesite.a.o(sbV, bool, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/shop/recipes/RecipeListQuery$NextBestAction;", "", "__typename", "", "onActionableCard", "Lcom/woolworths/shop/recipes/RecipeListQuery$OnActionableCard1;", "<init>", "(Ljava/lang/String;Lcom/woolworths/shop/recipes/RecipeListQuery$OnActionableCard1;)V", "get__typename", "()Ljava/lang/String;", "getOnActionableCard", "()Lcom/woolworths/shop/recipes/RecipeListQuery$OnActionableCard1;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NextBestAction {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @Nullable
        private final OnActionableCard1 onActionableCard;

        public NextBestAction(@NotNull String __typename, @Nullable OnActionableCard1 onActionableCard1) {
            Intrinsics.h(__typename, "__typename");
            this.__typename = __typename;
            this.onActionableCard = onActionableCard1;
        }

        public static /* synthetic */ NextBestAction copy$default(NextBestAction nextBestAction, String str, OnActionableCard1 onActionableCard1, int i, Object obj) {
            if ((i & 1) != 0) {
                str = nextBestAction.__typename;
            }
            if ((i & 2) != 0) {
                onActionableCard1 = nextBestAction.onActionableCard;
            }
            return nextBestAction.copy(str, onActionableCard1);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final OnActionableCard1 getOnActionableCard() {
            return this.onActionableCard;
        }

        @NotNull
        public final NextBestAction copy(@NotNull String __typename, @Nullable OnActionableCard1 onActionableCard) {
            Intrinsics.h(__typename, "__typename");
            return new NextBestAction(__typename, onActionableCard);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NextBestAction)) {
                return false;
            }
            NextBestAction nextBestAction = (NextBestAction) other;
            return Intrinsics.c(this.__typename, nextBestAction.__typename) && Intrinsics.c(this.onActionableCard, nextBestAction.onActionableCard);
        }

        @Nullable
        public final OnActionableCard1 getOnActionableCard() {
            return this.onActionableCard;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int iHashCode = this.__typename.hashCode() * 31;
            OnActionableCard1 onActionableCard1 = this.onActionableCard;
            return iHashCode + (onActionableCard1 == null ? 0 : onActionableCard1.hashCode());
        }

        @NotNull
        public String toString() {
            return "NextBestAction(__typename=" + this.__typename + ", onActionableCard=" + this.onActionableCard + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0019JX\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019¨\u0006)"}, d2 = {"Lcom/woolworths/shop/recipes/RecipeListQuery$OnActionableCard;", "", "__typename", "", "link", "image", "altText", "cardHeight", "Lau/com/woolworths/shop/graphql/type/CardHeight;", "analytics", "Lau/com/woolworths/analytics/graphql/TealiumAnalytics;", "_excluded", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/shop/graphql/type/CardHeight;Lau/com/woolworths/analytics/graphql/TealiumAnalytics;Ljava/lang/Boolean;)V", "get__typename", "()Ljava/lang/String;", "getLink", "getImage", "getAltText", "getCardHeight", "()Lau/com/woolworths/shop/graphql/type/CardHeight;", "getAnalytics", "()Lau/com/woolworths/analytics/graphql/TealiumAnalytics;", "get_excluded", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/shop/graphql/type/CardHeight;Lau/com/woolworths/analytics/graphql/TealiumAnalytics;Ljava/lang/Boolean;)Lcom/woolworths/shop/recipes/RecipeListQuery$OnActionableCard;", "equals", "other", "hashCode", "", "toString", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnActionableCard {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @Nullable
        private final Boolean _excluded;

        @NotNull
        private final String altText;

        @Nullable
        private final TealiumAnalytics analytics;

        @NotNull
        private final CardHeight cardHeight;

        @NotNull
        private final String image;

        @NotNull
        private final String link;

        public OnActionableCard(@NotNull String __typename, @NotNull String link, @NotNull String image, @NotNull String altText, @NotNull CardHeight cardHeight, @Nullable TealiumAnalytics tealiumAnalytics, @Nullable Boolean bool) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(link, "link");
            Intrinsics.h(image, "image");
            Intrinsics.h(altText, "altText");
            Intrinsics.h(cardHeight, "cardHeight");
            this.__typename = __typename;
            this.link = link;
            this.image = image;
            this.altText = altText;
            this.cardHeight = cardHeight;
            this.analytics = tealiumAnalytics;
            this._excluded = bool;
        }

        public static /* synthetic */ OnActionableCard copy$default(OnActionableCard onActionableCard, String str, String str2, String str3, String str4, CardHeight cardHeight, TealiumAnalytics tealiumAnalytics, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onActionableCard.__typename;
            }
            if ((i & 2) != 0) {
                str2 = onActionableCard.link;
            }
            if ((i & 4) != 0) {
                str3 = onActionableCard.image;
            }
            if ((i & 8) != 0) {
                str4 = onActionableCard.altText;
            }
            if ((i & 16) != 0) {
                cardHeight = onActionableCard.cardHeight;
            }
            if ((i & 32) != 0) {
                tealiumAnalytics = onActionableCard.analytics;
            }
            if ((i & 64) != 0) {
                bool = onActionableCard._excluded;
            }
            TealiumAnalytics tealiumAnalytics2 = tealiumAnalytics;
            Boolean bool2 = bool;
            CardHeight cardHeight2 = cardHeight;
            String str5 = str3;
            return onActionableCard.copy(str, str2, str5, str4, cardHeight2, tealiumAnalytics2, bool2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getLink() {
            return this.link;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getAltText() {
            return this.altText;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final CardHeight getCardHeight() {
            return this.cardHeight;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final TealiumAnalytics getAnalytics() {
            return this.analytics;
        }

        @Nullable
        /* renamed from: component7, reason: from getter */
        public final Boolean get_excluded() {
            return this._excluded;
        }

        @NotNull
        public final OnActionableCard copy(@NotNull String __typename, @NotNull String link, @NotNull String image, @NotNull String altText, @NotNull CardHeight cardHeight, @Nullable TealiumAnalytics analytics, @Nullable Boolean _excluded) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(link, "link");
            Intrinsics.h(image, "image");
            Intrinsics.h(altText, "altText");
            Intrinsics.h(cardHeight, "cardHeight");
            return new OnActionableCard(__typename, link, image, altText, cardHeight, analytics, _excluded);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnActionableCard)) {
                return false;
            }
            OnActionableCard onActionableCard = (OnActionableCard) other;
            return Intrinsics.c(this.__typename, onActionableCard.__typename) && Intrinsics.c(this.link, onActionableCard.link) && Intrinsics.c(this.image, onActionableCard.image) && Intrinsics.c(this.altText, onActionableCard.altText) && this.cardHeight == onActionableCard.cardHeight && Intrinsics.c(this.analytics, onActionableCard.analytics) && Intrinsics.c(this._excluded, onActionableCard._excluded);
        }

        @NotNull
        public final String getAltText() {
            return this.altText;
        }

        @Nullable
        public final TealiumAnalytics getAnalytics() {
            return this.analytics;
        }

        @NotNull
        public final CardHeight getCardHeight() {
            return this.cardHeight;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        @NotNull
        public final String getLink() {
            return this.link;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        @Nullable
        public final Boolean get_excluded() {
            return this._excluded;
        }

        public int hashCode() {
            int iB = d.b(this.cardHeight, b.c(b.c(b.c(this.__typename.hashCode() * 31, 31, this.link), 31, this.image), 31, this.altText), 31);
            TealiumAnalytics tealiumAnalytics = this.analytics;
            int iHashCode = (iB + (tealiumAnalytics == null ? 0 : tealiumAnalytics.hashCode())) * 31;
            Boolean bool = this._excluded;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.__typename;
            String str2 = this.link;
            String str3 = this.image;
            String str4 = this.altText;
            CardHeight cardHeight = this.cardHeight;
            TealiumAnalytics tealiumAnalytics = this.analytics;
            Boolean bool = this._excluded;
            StringBuilder sbV = a.v("OnActionableCard(__typename=", str, ", link=", str2, ", image=");
            androidx.constraintlayout.core.state.a.B(sbV, str3, ", altText=", str4, ", cardHeight=");
            sbV.append(cardHeight);
            sbV.append(", analytics=");
            sbV.append(tealiumAnalytics);
            sbV.append(", _excluded=");
            return au.com.woolworths.android.onesite.a.o(sbV, bool, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0019JX\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019¨\u0006)"}, d2 = {"Lcom/woolworths/shop/recipes/RecipeListQuery$OnActionableCard1;", "", "__typename", "", "link", "image", "altText", "cardHeight", "Lau/com/woolworths/shop/graphql/type/CardHeight;", "analytics", "Lau/com/woolworths/analytics/graphql/TealiumAnalytics;", "_excluded", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/shop/graphql/type/CardHeight;Lau/com/woolworths/analytics/graphql/TealiumAnalytics;Ljava/lang/Boolean;)V", "get__typename", "()Ljava/lang/String;", "getLink", "getImage", "getAltText", "getCardHeight", "()Lau/com/woolworths/shop/graphql/type/CardHeight;", "getAnalytics", "()Lau/com/woolworths/analytics/graphql/TealiumAnalytics;", "get_excluded", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/shop/graphql/type/CardHeight;Lau/com/woolworths/analytics/graphql/TealiumAnalytics;Ljava/lang/Boolean;)Lcom/woolworths/shop/recipes/RecipeListQuery$OnActionableCard1;", "equals", "other", "hashCode", "", "toString", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnActionableCard1 {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @Nullable
        private final Boolean _excluded;

        @NotNull
        private final String altText;

        @Nullable
        private final TealiumAnalytics analytics;

        @NotNull
        private final CardHeight cardHeight;

        @NotNull
        private final String image;

        @NotNull
        private final String link;

        public OnActionableCard1(@NotNull String __typename, @NotNull String link, @NotNull String image, @NotNull String altText, @NotNull CardHeight cardHeight, @Nullable TealiumAnalytics tealiumAnalytics, @Nullable Boolean bool) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(link, "link");
            Intrinsics.h(image, "image");
            Intrinsics.h(altText, "altText");
            Intrinsics.h(cardHeight, "cardHeight");
            this.__typename = __typename;
            this.link = link;
            this.image = image;
            this.altText = altText;
            this.cardHeight = cardHeight;
            this.analytics = tealiumAnalytics;
            this._excluded = bool;
        }

        public static /* synthetic */ OnActionableCard1 copy$default(OnActionableCard1 onActionableCard1, String str, String str2, String str3, String str4, CardHeight cardHeight, TealiumAnalytics tealiumAnalytics, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onActionableCard1.__typename;
            }
            if ((i & 2) != 0) {
                str2 = onActionableCard1.link;
            }
            if ((i & 4) != 0) {
                str3 = onActionableCard1.image;
            }
            if ((i & 8) != 0) {
                str4 = onActionableCard1.altText;
            }
            if ((i & 16) != 0) {
                cardHeight = onActionableCard1.cardHeight;
            }
            if ((i & 32) != 0) {
                tealiumAnalytics = onActionableCard1.analytics;
            }
            if ((i & 64) != 0) {
                bool = onActionableCard1._excluded;
            }
            TealiumAnalytics tealiumAnalytics2 = tealiumAnalytics;
            Boolean bool2 = bool;
            CardHeight cardHeight2 = cardHeight;
            String str5 = str3;
            return onActionableCard1.copy(str, str2, str5, str4, cardHeight2, tealiumAnalytics2, bool2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getLink() {
            return this.link;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getAltText() {
            return this.altText;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final CardHeight getCardHeight() {
            return this.cardHeight;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final TealiumAnalytics getAnalytics() {
            return this.analytics;
        }

        @Nullable
        /* renamed from: component7, reason: from getter */
        public final Boolean get_excluded() {
            return this._excluded;
        }

        @NotNull
        public final OnActionableCard1 copy(@NotNull String __typename, @NotNull String link, @NotNull String image, @NotNull String altText, @NotNull CardHeight cardHeight, @Nullable TealiumAnalytics analytics, @Nullable Boolean _excluded) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(link, "link");
            Intrinsics.h(image, "image");
            Intrinsics.h(altText, "altText");
            Intrinsics.h(cardHeight, "cardHeight");
            return new OnActionableCard1(__typename, link, image, altText, cardHeight, analytics, _excluded);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnActionableCard1)) {
                return false;
            }
            OnActionableCard1 onActionableCard1 = (OnActionableCard1) other;
            return Intrinsics.c(this.__typename, onActionableCard1.__typename) && Intrinsics.c(this.link, onActionableCard1.link) && Intrinsics.c(this.image, onActionableCard1.image) && Intrinsics.c(this.altText, onActionableCard1.altText) && this.cardHeight == onActionableCard1.cardHeight && Intrinsics.c(this.analytics, onActionableCard1.analytics) && Intrinsics.c(this._excluded, onActionableCard1._excluded);
        }

        @NotNull
        public final String getAltText() {
            return this.altText;
        }

        @Nullable
        public final TealiumAnalytics getAnalytics() {
            return this.analytics;
        }

        @NotNull
        public final CardHeight getCardHeight() {
            return this.cardHeight;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        @NotNull
        public final String getLink() {
            return this.link;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        @Nullable
        public final Boolean get_excluded() {
            return this._excluded;
        }

        public int hashCode() {
            int iB = d.b(this.cardHeight, b.c(b.c(b.c(this.__typename.hashCode() * 31, 31, this.link), 31, this.image), 31, this.altText), 31);
            TealiumAnalytics tealiumAnalytics = this.analytics;
            int iHashCode = (iB + (tealiumAnalytics == null ? 0 : tealiumAnalytics.hashCode())) * 31;
            Boolean bool = this._excluded;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.__typename;
            String str2 = this.link;
            String str3 = this.image;
            String str4 = this.altText;
            CardHeight cardHeight = this.cardHeight;
            TealiumAnalytics tealiumAnalytics = this.analytics;
            Boolean bool = this._excluded;
            StringBuilder sbV = a.v("OnActionableCard1(__typename=", str, ", link=", str2, ", image=");
            androidx.constraintlayout.core.state.a.B(sbV, str3, ", altText=", str4, ", cardHeight=");
            sbV.append(cardHeight);
            sbV.append(", analytics=");
            sbV.append(tealiumAnalytics);
            sbV.append(", _excluded=");
            return au.com.woolworths.android.onesite.a.o(sbV, bool, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001eJp\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020\u00072\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001e¨\u00060"}, d2 = {"Lcom/woolworths/shop/recipes/RecipeListQuery$OnGoogleAdBannerCard;", "", "__typename", "", OutOfContextTestingActivity.AD_UNIT_KEY, "nativeCustomTemplateId", "iabSpec", "", "iabSize", "height", "Lau/com/woolworths/shop/graphql/type/AdBannerNativeSize;", "targeting", "Lau/com/woolworths/android/onesite/graphql/GoogleAdCustomTargeting;", "correlator", "_excluded", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lau/com/woolworths/shop/graphql/type/AdBannerNativeSize;Lau/com/woolworths/android/onesite/graphql/GoogleAdCustomTargeting;Ljava/lang/String;Ljava/lang/Boolean;)V", "get__typename", "()Ljava/lang/String;", "getAdUnit", "getNativeCustomTemplateId", "getIabSpec", "()Z", "getIabSize", "getHeight", "()Lau/com/woolworths/shop/graphql/type/AdBannerNativeSize;", "getTargeting", "()Lau/com/woolworths/android/onesite/graphql/GoogleAdCustomTargeting;", "getCorrelator", "get_excluded", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lau/com/woolworths/shop/graphql/type/AdBannerNativeSize;Lau/com/woolworths/android/onesite/graphql/GoogleAdCustomTargeting;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/woolworths/shop/recipes/RecipeListQuery$OnGoogleAdBannerCard;", "equals", "other", "hashCode", "", "toString", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnGoogleAdBannerCard {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @Nullable
        private final Boolean _excluded;

        @NotNull
        private final String adUnit;

        @Nullable
        private final String correlator;

        @NotNull
        private final AdBannerNativeSize height;

        @Nullable
        private final String iabSize;
        private final boolean iabSpec;

        @NotNull
        private final String nativeCustomTemplateId;

        @Nullable
        private final GoogleAdCustomTargeting targeting;

        public OnGoogleAdBannerCard(@NotNull String __typename, @NotNull String adUnit, @NotNull String nativeCustomTemplateId, boolean z, @Nullable String str, @NotNull AdBannerNativeSize height, @Nullable GoogleAdCustomTargeting googleAdCustomTargeting, @Nullable String str2, @Nullable Boolean bool) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(adUnit, "adUnit");
            Intrinsics.h(nativeCustomTemplateId, "nativeCustomTemplateId");
            Intrinsics.h(height, "height");
            this.__typename = __typename;
            this.adUnit = adUnit;
            this.nativeCustomTemplateId = nativeCustomTemplateId;
            this.iabSpec = z;
            this.iabSize = str;
            this.height = height;
            this.targeting = googleAdCustomTargeting;
            this.correlator = str2;
            this._excluded = bool;
        }

        public static /* synthetic */ OnGoogleAdBannerCard copy$default(OnGoogleAdBannerCard onGoogleAdBannerCard, String str, String str2, String str3, boolean z, String str4, AdBannerNativeSize adBannerNativeSize, GoogleAdCustomTargeting googleAdCustomTargeting, String str5, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onGoogleAdBannerCard.__typename;
            }
            if ((i & 2) != 0) {
                str2 = onGoogleAdBannerCard.adUnit;
            }
            if ((i & 4) != 0) {
                str3 = onGoogleAdBannerCard.nativeCustomTemplateId;
            }
            if ((i & 8) != 0) {
                z = onGoogleAdBannerCard.iabSpec;
            }
            if ((i & 16) != 0) {
                str4 = onGoogleAdBannerCard.iabSize;
            }
            if ((i & 32) != 0) {
                adBannerNativeSize = onGoogleAdBannerCard.height;
            }
            if ((i & 64) != 0) {
                googleAdCustomTargeting = onGoogleAdBannerCard.targeting;
            }
            if ((i & 128) != 0) {
                str5 = onGoogleAdBannerCard.correlator;
            }
            if ((i & 256) != 0) {
                bool = onGoogleAdBannerCard._excluded;
            }
            String str6 = str5;
            Boolean bool2 = bool;
            AdBannerNativeSize adBannerNativeSize2 = adBannerNativeSize;
            GoogleAdCustomTargeting googleAdCustomTargeting2 = googleAdCustomTargeting;
            String str7 = str4;
            String str8 = str3;
            return onGoogleAdBannerCard.copy(str, str2, str8, z, str7, adBannerNativeSize2, googleAdCustomTargeting2, str6, bool2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getAdUnit() {
            return this.adUnit;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getNativeCustomTemplateId() {
            return this.nativeCustomTemplateId;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIabSpec() {
            return this.iabSpec;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final String getIabSize() {
            return this.iabSize;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final AdBannerNativeSize getHeight() {
            return this.height;
        }

        @Nullable
        /* renamed from: component7, reason: from getter */
        public final GoogleAdCustomTargeting getTargeting() {
            return this.targeting;
        }

        @Nullable
        /* renamed from: component8, reason: from getter */
        public final String getCorrelator() {
            return this.correlator;
        }

        @Nullable
        /* renamed from: component9, reason: from getter */
        public final Boolean get_excluded() {
            return this._excluded;
        }

        @NotNull
        public final OnGoogleAdBannerCard copy(@NotNull String __typename, @NotNull String adUnit, @NotNull String nativeCustomTemplateId, boolean iabSpec, @Nullable String iabSize, @NotNull AdBannerNativeSize height, @Nullable GoogleAdCustomTargeting targeting, @Nullable String correlator, @Nullable Boolean _excluded) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(adUnit, "adUnit");
            Intrinsics.h(nativeCustomTemplateId, "nativeCustomTemplateId");
            Intrinsics.h(height, "height");
            return new OnGoogleAdBannerCard(__typename, adUnit, nativeCustomTemplateId, iabSpec, iabSize, height, targeting, correlator, _excluded);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnGoogleAdBannerCard)) {
                return false;
            }
            OnGoogleAdBannerCard onGoogleAdBannerCard = (OnGoogleAdBannerCard) other;
            return Intrinsics.c(this.__typename, onGoogleAdBannerCard.__typename) && Intrinsics.c(this.adUnit, onGoogleAdBannerCard.adUnit) && Intrinsics.c(this.nativeCustomTemplateId, onGoogleAdBannerCard.nativeCustomTemplateId) && this.iabSpec == onGoogleAdBannerCard.iabSpec && Intrinsics.c(this.iabSize, onGoogleAdBannerCard.iabSize) && this.height == onGoogleAdBannerCard.height && Intrinsics.c(this.targeting, onGoogleAdBannerCard.targeting) && Intrinsics.c(this.correlator, onGoogleAdBannerCard.correlator) && Intrinsics.c(this._excluded, onGoogleAdBannerCard._excluded);
        }

        @NotNull
        public final String getAdUnit() {
            return this.adUnit;
        }

        @Nullable
        public final String getCorrelator() {
            return this.correlator;
        }

        @NotNull
        public final AdBannerNativeSize getHeight() {
            return this.height;
        }

        @Nullable
        public final String getIabSize() {
            return this.iabSize;
        }

        public final boolean getIabSpec() {
            return this.iabSpec;
        }

        @NotNull
        public final String getNativeCustomTemplateId() {
            return this.nativeCustomTemplateId;
        }

        @Nullable
        public final GoogleAdCustomTargeting getTargeting() {
            return this.targeting;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        @Nullable
        public final Boolean get_excluded() {
            return this._excluded;
        }

        public int hashCode() {
            int iE = b.e(b.c(b.c(this.__typename.hashCode() * 31, 31, this.adUnit), 31, this.nativeCustomTemplateId), 31, this.iabSpec);
            String str = this.iabSize;
            int iHashCode = (this.height.hashCode() + ((iE + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            GoogleAdCustomTargeting googleAdCustomTargeting = this.targeting;
            int iHashCode2 = (iHashCode + (googleAdCustomTargeting == null ? 0 : googleAdCustomTargeting.hashCode())) * 31;
            String str2 = this.correlator;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this._excluded;
            return iHashCode3 + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.__typename;
            String str2 = this.adUnit;
            String str3 = this.nativeCustomTemplateId;
            boolean z = this.iabSpec;
            String str4 = this.iabSize;
            AdBannerNativeSize adBannerNativeSize = this.height;
            GoogleAdCustomTargeting googleAdCustomTargeting = this.targeting;
            String str5 = this.correlator;
            Boolean bool = this._excluded;
            StringBuilder sbV = a.v("OnGoogleAdBannerCard(__typename=", str, ", adUnit=", str2, ", nativeCustomTemplateId=");
            d.A(str3, ", iabSpec=", ", iabSize=", sbV, z);
            sbV.append(str4);
            sbV.append(", height=");
            sbV.append(adBannerNativeSize);
            sbV.append(", targeting=");
            sbV.append(googleAdCustomTargeting);
            sbV.append(", correlator=");
            sbV.append(str5);
            sbV.append(", _excluded=");
            return au.com.woolworths.android.onesite.a.o(sbV, bool, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/shop/recipes/RecipeListQuery$OnRecipeSummaryCard;", "", "__typename", "", "recipeSummaryCardFragment", "Lau/com/woolworths/shop/aem/components/recipes/fragment/RecipeSummaryCardFragment;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/shop/aem/components/recipes/fragment/RecipeSummaryCardFragment;)V", "get__typename", "()Ljava/lang/String;", "getRecipeSummaryCardFragment", "()Lau/com/woolworths/shop/aem/components/recipes/fragment/RecipeSummaryCardFragment;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRecipeSummaryCard {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final RecipeSummaryCardFragment recipeSummaryCardFragment;

        public OnRecipeSummaryCard(@NotNull String __typename, @NotNull RecipeSummaryCardFragment recipeSummaryCardFragment) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(recipeSummaryCardFragment, "recipeSummaryCardFragment");
            this.__typename = __typename;
            this.recipeSummaryCardFragment = recipeSummaryCardFragment;
        }

        public static /* synthetic */ OnRecipeSummaryCard copy$default(OnRecipeSummaryCard onRecipeSummaryCard, String str, RecipeSummaryCardFragment recipeSummaryCardFragment, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onRecipeSummaryCard.__typename;
            }
            if ((i & 2) != 0) {
                recipeSummaryCardFragment = onRecipeSummaryCard.recipeSummaryCardFragment;
            }
            return onRecipeSummaryCard.copy(str, recipeSummaryCardFragment);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final RecipeSummaryCardFragment getRecipeSummaryCardFragment() {
            return this.recipeSummaryCardFragment;
        }

        @NotNull
        public final OnRecipeSummaryCard copy(@NotNull String __typename, @NotNull RecipeSummaryCardFragment recipeSummaryCardFragment) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(recipeSummaryCardFragment, "recipeSummaryCardFragment");
            return new OnRecipeSummaryCard(__typename, recipeSummaryCardFragment);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnRecipeSummaryCard)) {
                return false;
            }
            OnRecipeSummaryCard onRecipeSummaryCard = (OnRecipeSummaryCard) other;
            return Intrinsics.c(this.__typename, onRecipeSummaryCard.__typename) && Intrinsics.c(this.recipeSummaryCardFragment, onRecipeSummaryCard.recipeSummaryCardFragment);
        }

        @NotNull
        public final RecipeSummaryCardFragment getRecipeSummaryCardFragment() {
            return this.recipeSummaryCardFragment;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.recipeSummaryCardFragment.hashCode() + (this.__typename.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "OnRecipeSummaryCard(__typename=" + this.__typename + ", recipeSummaryCardFragment=" + this.recipeSummaryCardFragment + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/woolworths/shop/recipes/RecipeListQuery$OnUniversalInventoryContainer;", "", "googleAdBannerCard", "Lcom/woolworths/shop/recipes/RecipeListQuery$GoogleAdBannerCard;", "nextBestAction", "Lcom/woolworths/shop/recipes/RecipeListQuery$NextBestAction;", "<init>", "(Lcom/woolworths/shop/recipes/RecipeListQuery$GoogleAdBannerCard;Lcom/woolworths/shop/recipes/RecipeListQuery$NextBestAction;)V", "getGoogleAdBannerCard", "()Lcom/woolworths/shop/recipes/RecipeListQuery$GoogleAdBannerCard;", "getNextBestAction", "()Lcom/woolworths/shop/recipes/RecipeListQuery$NextBestAction;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnUniversalInventoryContainer {
        public static final int $stable = 8;

        @Nullable
        private final GoogleAdBannerCard googleAdBannerCard;

        @Nullable
        private final NextBestAction nextBestAction;

        public OnUniversalInventoryContainer(@Nullable GoogleAdBannerCard googleAdBannerCard, @Nullable NextBestAction nextBestAction) {
            this.googleAdBannerCard = googleAdBannerCard;
            this.nextBestAction = nextBestAction;
        }

        public static /* synthetic */ OnUniversalInventoryContainer copy$default(OnUniversalInventoryContainer onUniversalInventoryContainer, GoogleAdBannerCard googleAdBannerCard, NextBestAction nextBestAction, int i, Object obj) {
            if ((i & 1) != 0) {
                googleAdBannerCard = onUniversalInventoryContainer.googleAdBannerCard;
            }
            if ((i & 2) != 0) {
                nextBestAction = onUniversalInventoryContainer.nextBestAction;
            }
            return onUniversalInventoryContainer.copy(googleAdBannerCard, nextBestAction);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final GoogleAdBannerCard getGoogleAdBannerCard() {
            return this.googleAdBannerCard;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final NextBestAction getNextBestAction() {
            return this.nextBestAction;
        }

        @NotNull
        public final OnUniversalInventoryContainer copy(@Nullable GoogleAdBannerCard googleAdBannerCard, @Nullable NextBestAction nextBestAction) {
            return new OnUniversalInventoryContainer(googleAdBannerCard, nextBestAction);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnUniversalInventoryContainer)) {
                return false;
            }
            OnUniversalInventoryContainer onUniversalInventoryContainer = (OnUniversalInventoryContainer) other;
            return Intrinsics.c(this.googleAdBannerCard, onUniversalInventoryContainer.googleAdBannerCard) && Intrinsics.c(this.nextBestAction, onUniversalInventoryContainer.nextBestAction);
        }

        @Nullable
        public final GoogleAdBannerCard getGoogleAdBannerCard() {
            return this.googleAdBannerCard;
        }

        @Nullable
        public final NextBestAction getNextBestAction() {
            return this.nextBestAction;
        }

        public int hashCode() {
            GoogleAdBannerCard googleAdBannerCard = this.googleAdBannerCard;
            int iHashCode = (googleAdBannerCard == null ? 0 : googleAdBannerCard.hashCode()) * 31;
            NextBestAction nextBestAction = this.nextBestAction;
            return iHashCode + (nextBestAction != null ? nextBestAction.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "OnUniversalInventoryContainer(googleAdBannerCard=" + this.googleAdBannerCard + ", nextBestAction=" + this.nextBestAction + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JC\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/woolworths/shop/recipes/RecipeListQuery$RecipeListFeed;", "", "__typename", "", "onActionableCard", "Lcom/woolworths/shop/recipes/RecipeListQuery$OnActionableCard;", "onGoogleAdBannerCard", "Lcom/woolworths/shop/recipes/RecipeListQuery$OnGoogleAdBannerCard;", "onUniversalInventoryContainer", "Lcom/woolworths/shop/recipes/RecipeListQuery$OnUniversalInventoryContainer;", "onRecipeSummaryCard", "Lcom/woolworths/shop/recipes/RecipeListQuery$OnRecipeSummaryCard;", "<init>", "(Ljava/lang/String;Lcom/woolworths/shop/recipes/RecipeListQuery$OnActionableCard;Lcom/woolworths/shop/recipes/RecipeListQuery$OnGoogleAdBannerCard;Lcom/woolworths/shop/recipes/RecipeListQuery$OnUniversalInventoryContainer;Lcom/woolworths/shop/recipes/RecipeListQuery$OnRecipeSummaryCard;)V", "get__typename", "()Ljava/lang/String;", "getOnActionableCard", "()Lcom/woolworths/shop/recipes/RecipeListQuery$OnActionableCard;", "getOnGoogleAdBannerCard", "()Lcom/woolworths/shop/recipes/RecipeListQuery$OnGoogleAdBannerCard;", "getOnUniversalInventoryContainer", "()Lcom/woolworths/shop/recipes/RecipeListQuery$OnUniversalInventoryContainer;", "getOnRecipeSummaryCard", "()Lcom/woolworths/shop/recipes/RecipeListQuery$OnRecipeSummaryCard;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RecipeListFeed {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @Nullable
        private final OnActionableCard onActionableCard;

        @Nullable
        private final OnGoogleAdBannerCard onGoogleAdBannerCard;

        @Nullable
        private final OnRecipeSummaryCard onRecipeSummaryCard;

        @Nullable
        private final OnUniversalInventoryContainer onUniversalInventoryContainer;

        public RecipeListFeed(@NotNull String __typename, @Nullable OnActionableCard onActionableCard, @Nullable OnGoogleAdBannerCard onGoogleAdBannerCard, @Nullable OnUniversalInventoryContainer onUniversalInventoryContainer, @Nullable OnRecipeSummaryCard onRecipeSummaryCard) {
            Intrinsics.h(__typename, "__typename");
            this.__typename = __typename;
            this.onActionableCard = onActionableCard;
            this.onGoogleAdBannerCard = onGoogleAdBannerCard;
            this.onUniversalInventoryContainer = onUniversalInventoryContainer;
            this.onRecipeSummaryCard = onRecipeSummaryCard;
        }

        public static /* synthetic */ RecipeListFeed copy$default(RecipeListFeed recipeListFeed, String str, OnActionableCard onActionableCard, OnGoogleAdBannerCard onGoogleAdBannerCard, OnUniversalInventoryContainer onUniversalInventoryContainer, OnRecipeSummaryCard onRecipeSummaryCard, int i, Object obj) {
            if ((i & 1) != 0) {
                str = recipeListFeed.__typename;
            }
            if ((i & 2) != 0) {
                onActionableCard = recipeListFeed.onActionableCard;
            }
            if ((i & 4) != 0) {
                onGoogleAdBannerCard = recipeListFeed.onGoogleAdBannerCard;
            }
            if ((i & 8) != 0) {
                onUniversalInventoryContainer = recipeListFeed.onUniversalInventoryContainer;
            }
            if ((i & 16) != 0) {
                onRecipeSummaryCard = recipeListFeed.onRecipeSummaryCard;
            }
            OnRecipeSummaryCard onRecipeSummaryCard2 = onRecipeSummaryCard;
            OnGoogleAdBannerCard onGoogleAdBannerCard2 = onGoogleAdBannerCard;
            return recipeListFeed.copy(str, onActionableCard, onGoogleAdBannerCard2, onUniversalInventoryContainer, onRecipeSummaryCard2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final OnActionableCard getOnActionableCard() {
            return this.onActionableCard;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final OnGoogleAdBannerCard getOnGoogleAdBannerCard() {
            return this.onGoogleAdBannerCard;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final OnUniversalInventoryContainer getOnUniversalInventoryContainer() {
            return this.onUniversalInventoryContainer;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final OnRecipeSummaryCard getOnRecipeSummaryCard() {
            return this.onRecipeSummaryCard;
        }

        @NotNull
        public final RecipeListFeed copy(@NotNull String __typename, @Nullable OnActionableCard onActionableCard, @Nullable OnGoogleAdBannerCard onGoogleAdBannerCard, @Nullable OnUniversalInventoryContainer onUniversalInventoryContainer, @Nullable OnRecipeSummaryCard onRecipeSummaryCard) {
            Intrinsics.h(__typename, "__typename");
            return new RecipeListFeed(__typename, onActionableCard, onGoogleAdBannerCard, onUniversalInventoryContainer, onRecipeSummaryCard);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RecipeListFeed)) {
                return false;
            }
            RecipeListFeed recipeListFeed = (RecipeListFeed) other;
            return Intrinsics.c(this.__typename, recipeListFeed.__typename) && Intrinsics.c(this.onActionableCard, recipeListFeed.onActionableCard) && Intrinsics.c(this.onGoogleAdBannerCard, recipeListFeed.onGoogleAdBannerCard) && Intrinsics.c(this.onUniversalInventoryContainer, recipeListFeed.onUniversalInventoryContainer) && Intrinsics.c(this.onRecipeSummaryCard, recipeListFeed.onRecipeSummaryCard);
        }

        @Nullable
        public final OnActionableCard getOnActionableCard() {
            return this.onActionableCard;
        }

        @Nullable
        public final OnGoogleAdBannerCard getOnGoogleAdBannerCard() {
            return this.onGoogleAdBannerCard;
        }

        @Nullable
        public final OnRecipeSummaryCard getOnRecipeSummaryCard() {
            return this.onRecipeSummaryCard;
        }

        @Nullable
        public final OnUniversalInventoryContainer getOnUniversalInventoryContainer() {
            return this.onUniversalInventoryContainer;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int iHashCode = this.__typename.hashCode() * 31;
            OnActionableCard onActionableCard = this.onActionableCard;
            int iHashCode2 = (iHashCode + (onActionableCard == null ? 0 : onActionableCard.hashCode())) * 31;
            OnGoogleAdBannerCard onGoogleAdBannerCard = this.onGoogleAdBannerCard;
            int iHashCode3 = (iHashCode2 + (onGoogleAdBannerCard == null ? 0 : onGoogleAdBannerCard.hashCode())) * 31;
            OnUniversalInventoryContainer onUniversalInventoryContainer = this.onUniversalInventoryContainer;
            int iHashCode4 = (iHashCode3 + (onUniversalInventoryContainer == null ? 0 : onUniversalInventoryContainer.hashCode())) * 31;
            OnRecipeSummaryCard onRecipeSummaryCard = this.onRecipeSummaryCard;
            return iHashCode4 + (onRecipeSummaryCard != null ? onRecipeSummaryCard.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "RecipeListFeed(__typename=" + this.__typename + ", onActionableCard=" + this.onActionableCard + ", onGoogleAdBannerCard=" + this.onGoogleAdBannerCard + ", onUniversalInventoryContainer=" + this.onUniversalInventoryContainer + ", onRecipeSummaryCard=" + this.onRecipeSummaryCard + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0011\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JB\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/woolworths/shop/recipes/RecipeListQuery$RecipeSearch;", "", "totalNumberOfRecipes", "", "nextPage", "recipeListFeed", "", "Lcom/woolworths/shop/recipes/RecipeListQuery$RecipeListFeed;", "title", "", "<init>", "(ILjava/lang/Integer;Ljava/util/List;Ljava/lang/String;)V", "getTotalNumberOfRecipes", "()I", "getNextPage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRecipeListFeed", "()Ljava/util/List;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(ILjava/lang/Integer;Ljava/util/List;Ljava/lang/String;)Lcom/woolworths/shop/recipes/RecipeListQuery$RecipeSearch;", "equals", "", "other", "hashCode", "toString", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RecipeSearch {
        public static final int $stable = 8;

        @Nullable
        private final Integer nextPage;

        @NotNull
        private final List<RecipeListFeed> recipeListFeed;

        @Nullable
        private final String title;
        private final int totalNumberOfRecipes;

        public RecipeSearch(int i, @Nullable Integer num, @NotNull List<RecipeListFeed> recipeListFeed, @Nullable String str) {
            Intrinsics.h(recipeListFeed, "recipeListFeed");
            this.totalNumberOfRecipes = i;
            this.nextPage = num;
            this.recipeListFeed = recipeListFeed;
            this.title = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RecipeSearch copy$default(RecipeSearch recipeSearch, int i, Integer num, List list, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = recipeSearch.totalNumberOfRecipes;
            }
            if ((i2 & 2) != 0) {
                num = recipeSearch.nextPage;
            }
            if ((i2 & 4) != 0) {
                list = recipeSearch.recipeListFeed;
            }
            if ((i2 & 8) != 0) {
                str = recipeSearch.title;
            }
            return recipeSearch.copy(i, num, list, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getTotalNumberOfRecipes() {
            return this.totalNumberOfRecipes;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Integer getNextPage() {
            return this.nextPage;
        }

        @NotNull
        public final List<RecipeListFeed> component3() {
            return this.recipeListFeed;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final RecipeSearch copy(int totalNumberOfRecipes, @Nullable Integer nextPage, @NotNull List<RecipeListFeed> recipeListFeed, @Nullable String title) {
            Intrinsics.h(recipeListFeed, "recipeListFeed");
            return new RecipeSearch(totalNumberOfRecipes, nextPage, recipeListFeed, title);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RecipeSearch)) {
                return false;
            }
            RecipeSearch recipeSearch = (RecipeSearch) other;
            return this.totalNumberOfRecipes == recipeSearch.totalNumberOfRecipes && Intrinsics.c(this.nextPage, recipeSearch.nextPage) && Intrinsics.c(this.recipeListFeed, recipeSearch.recipeListFeed) && Intrinsics.c(this.title, recipeSearch.title);
        }

        @Nullable
        public final Integer getNextPage() {
            return this.nextPage;
        }

        @NotNull
        public final List<RecipeListFeed> getRecipeListFeed() {
            return this.recipeListFeed;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public final int getTotalNumberOfRecipes() {
            return this.totalNumberOfRecipes;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.totalNumberOfRecipes) * 31;
            Integer num = this.nextPage;
            int iD = b.d((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.recipeListFeed);
            String str = this.title;
            return iD + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "RecipeSearch(totalNumberOfRecipes=" + this.totalNumberOfRecipes + ", nextPage=" + this.nextPage + ", recipeListFeed=" + this.recipeListFeed + ", title=" + this.title + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecipeListQuery(@NotNull Optional<? extends ShoppingModeType> shoppingMode, @NotNull List<String> tags, @NotNull Optional<String> key, @NotNull Optional<String> source, @NotNull Optional<Integer> pageNumber, @NotNull Optional<String> searchTerm, @NotNull Optional<? extends List<String>> supportedLinks, boolean z, @NotNull Optional<Boolean> isVideoTagOnRecipeCardEnabled) {
        Intrinsics.h(shoppingMode, "shoppingMode");
        Intrinsics.h(tags, "tags");
        Intrinsics.h(key, "key");
        Intrinsics.h(source, "source");
        Intrinsics.h(pageNumber, "pageNumber");
        Intrinsics.h(searchTerm, "searchTerm");
        Intrinsics.h(supportedLinks, "supportedLinks");
        Intrinsics.h(isVideoTagOnRecipeCardEnabled, "isVideoTagOnRecipeCardEnabled");
        this.shoppingMode = shoppingMode;
        this.tags = tags;
        this.key = key;
        this.source = source;
        this.pageNumber = pageNumber;
        this.searchTerm = searchTerm;
        this.supportedLinks = supportedLinks;
        this.includeUniversalInventoryFallback = z;
        this.isVideoTagOnRecipeCardEnabled = isVideoTagOnRecipeCardEnabled;
    }

    public static /* synthetic */ RecipeListQuery copy$default(RecipeListQuery recipeListQuery, Optional optional, List list, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, boolean z, Optional optional7, int i, Object obj) {
        if ((i & 1) != 0) {
            optional = recipeListQuery.shoppingMode;
        }
        if ((i & 2) != 0) {
            list = recipeListQuery.tags;
        }
        if ((i & 4) != 0) {
            optional2 = recipeListQuery.key;
        }
        if ((i & 8) != 0) {
            optional3 = recipeListQuery.source;
        }
        if ((i & 16) != 0) {
            optional4 = recipeListQuery.pageNumber;
        }
        if ((i & 32) != 0) {
            optional5 = recipeListQuery.searchTerm;
        }
        if ((i & 64) != 0) {
            optional6 = recipeListQuery.supportedLinks;
        }
        if ((i & 128) != 0) {
            z = recipeListQuery.includeUniversalInventoryFallback;
        }
        if ((i & 256) != 0) {
            optional7 = recipeListQuery.isVideoTagOnRecipeCardEnabled;
        }
        boolean z2 = z;
        Optional optional8 = optional7;
        Optional optional9 = optional5;
        Optional optional10 = optional6;
        Optional optional11 = optional4;
        Optional optional12 = optional2;
        return recipeListQuery.copy(optional, list, optional12, optional3, optional11, optional9, optional10, z2, optional8);
    }

    @Override // com.apollographql.apollo.api.Executable
    @NotNull
    public Adapter<Data> adapter() {
        return Adapters.c(RecipeListQuery_ResponseAdapter.Data.INSTANCE, false);
    }

    @NotNull
    public final Optional<ShoppingModeType> component1() {
        return this.shoppingMode;
    }

    @NotNull
    public final List<String> component2() {
        return this.tags;
    }

    @NotNull
    public final Optional<String> component3() {
        return this.key;
    }

    @NotNull
    public final Optional<String> component4() {
        return this.source;
    }

    @NotNull
    public final Optional<Integer> component5() {
        return this.pageNumber;
    }

    @NotNull
    public final Optional<String> component6() {
        return this.searchTerm;
    }

    @NotNull
    public final Optional<List<String>> component7() {
        return this.supportedLinks;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIncludeUniversalInventoryFallback() {
        return this.includeUniversalInventoryFallback;
    }

    @NotNull
    public final Optional<Boolean> component9() {
        return this.isVideoTagOnRecipeCardEnabled;
    }

    @NotNull
    public final RecipeListQuery copy(@NotNull Optional<? extends ShoppingModeType> shoppingMode, @NotNull List<String> tags, @NotNull Optional<String> key, @NotNull Optional<String> source, @NotNull Optional<Integer> pageNumber, @NotNull Optional<String> searchTerm, @NotNull Optional<? extends List<String>> supportedLinks, boolean includeUniversalInventoryFallback, @NotNull Optional<Boolean> isVideoTagOnRecipeCardEnabled) {
        Intrinsics.h(shoppingMode, "shoppingMode");
        Intrinsics.h(tags, "tags");
        Intrinsics.h(key, "key");
        Intrinsics.h(source, "source");
        Intrinsics.h(pageNumber, "pageNumber");
        Intrinsics.h(searchTerm, "searchTerm");
        Intrinsics.h(supportedLinks, "supportedLinks");
        Intrinsics.h(isVideoTagOnRecipeCardEnabled, "isVideoTagOnRecipeCardEnabled");
        return new RecipeListQuery(shoppingMode, tags, key, source, pageNumber, searchTerm, supportedLinks, includeUniversalInventoryFallback, isVideoTagOnRecipeCardEnabled);
    }

    @Override // com.apollographql.apollo.api.Operation
    @NotNull
    public String document() {
        return INSTANCE.getOPERATION_DOCUMENT();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecipeListQuery)) {
            return false;
        }
        RecipeListQuery recipeListQuery = (RecipeListQuery) other;
        return Intrinsics.c(this.shoppingMode, recipeListQuery.shoppingMode) && Intrinsics.c(this.tags, recipeListQuery.tags) && Intrinsics.c(this.key, recipeListQuery.key) && Intrinsics.c(this.source, recipeListQuery.source) && Intrinsics.c(this.pageNumber, recipeListQuery.pageNumber) && Intrinsics.c(this.searchTerm, recipeListQuery.searchTerm) && Intrinsics.c(this.supportedLinks, recipeListQuery.supportedLinks) && this.includeUniversalInventoryFallback == recipeListQuery.includeUniversalInventoryFallback && Intrinsics.c(this.isVideoTagOnRecipeCardEnabled, recipeListQuery.isVideoTagOnRecipeCardEnabled);
    }

    public final boolean getIncludeUniversalInventoryFallback() {
        return this.includeUniversalInventoryFallback;
    }

    @NotNull
    public final Optional<String> getKey() {
        return this.key;
    }

    @NotNull
    public final Optional<Integer> getPageNumber() {
        return this.pageNumber;
    }

    @NotNull
    public final Optional<String> getSearchTerm() {
        return this.searchTerm;
    }

    @NotNull
    public final Optional<ShoppingModeType> getShoppingMode() {
        return this.shoppingMode;
    }

    @NotNull
    public final Optional<String> getSource() {
        return this.source;
    }

    @NotNull
    public final Optional<List<String>> getSupportedLinks() {
        return this.supportedLinks;
    }

    @NotNull
    public final List<String> getTags() {
        return this.tags;
    }

    public int hashCode() {
        return this.isVideoTagOnRecipeCardEnabled.hashCode() + b.e(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.supportedLinks, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.searchTerm, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.pageNumber, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.source, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.key, b.d(this.shoppingMode.hashCode() * 31, 31, this.tags), 31), 31), 31), 31), 31), 31, this.includeUniversalInventoryFallback);
    }

    @Override // com.apollographql.apollo.api.Operation
    @NotNull
    public String id() {
        return OPERATION_ID;
    }

    @NotNull
    public final Optional<Boolean> isVideoTagOnRecipeCardEnabled() {
        return this.isVideoTagOnRecipeCardEnabled;
    }

    @Override // com.apollographql.apollo.api.Operation
    @NotNull
    public String name() {
        return OPERATION_NAME;
    }

    @NotNull
    public CompiledField rootField() {
        CompiledField.Builder builder = new CompiledField.Builder("data", au.com.woolworths.shop.graphql.type.Query.H2);
        builder.e(RecipeListQuerySelections.INSTANCE.get__root());
        return builder.c();
    }

    @Override // com.apollographql.apollo.api.Executable
    public void serializeVariables(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        RecipeListQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @NotNull
    public String toString() {
        Optional<ShoppingModeType> optional = this.shoppingMode;
        List<String> list = this.tags;
        Optional<String> optional2 = this.key;
        Optional<String> optional3 = this.source;
        Optional<Integer> optional4 = this.pageNumber;
        Optional<String> optional5 = this.searchTerm;
        Optional<List<String>> optional6 = this.supportedLinks;
        boolean z = this.includeUniversalInventoryFallback;
        Optional<Boolean> optional7 = this.isVideoTagOnRecipeCardEnabled;
        StringBuilder sb = new StringBuilder("RecipeListQuery(shoppingMode=");
        sb.append(optional);
        sb.append(", tags=");
        sb.append(list);
        sb.append(", key=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sb, optional2, ", source=", optional3, ", pageNumber=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sb, optional4, ", searchTerm=", optional5, ", supportedLinks=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.y(sb, optional6, ", includeUniversalInventoryFallback=", z, ", isVideoTagOnRecipeCardEnabled=");
        return au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.o(sb, optional7, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RecipeListQuery(Optional optional, List list, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, boolean z, Optional optional7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i & 1;
        Optional.Absent absent = Optional.Absent.f13523a;
        this(i2 != 0 ? absent : optional, list, (i & 4) != 0 ? absent : optional2, (i & 8) != 0 ? absent : optional3, (i & 16) != 0 ? absent : optional4, (i & 32) != 0 ? absent : optional5, (i & 64) != 0 ? absent : optional6, z, (i & 256) != 0 ? absent : optional7);
    }
}
