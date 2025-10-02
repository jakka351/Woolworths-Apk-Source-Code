package com.woolworths.shop.recipes;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.aem.components.recipes.fragment.RecipeSummaryCardFragment;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.woolworths.shop.recipes.adapter.SavedRecipesQuery_ResponseAdapter;
import com.woolworths.shop.recipes.adapter.SavedRecipesQuery_VariablesAdapter;
import com.woolworths.shop.recipes.selections.SavedRecipesQuerySelections;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004#$%&B)\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0007H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0011\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0003J+\u0010\u001d\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010\"\u001a\u00020\rHÖ\u0001R\u0019\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000b¨\u0006'"}, d2 = {"Lcom/woolworths/shop/recipes/SavedRecipesQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/shop/recipes/SavedRecipesQuery$Data;", "pageNumber", "Lcom/apollographql/apollo/api/Optional;", "", "isVideoTagOnRecipeCardEnabled", "", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "getPageNumber", "()Lcom/apollographql/apollo/api/Optional;", "id", "", "document", AppMeasurementSdk.ConditionalUserProperty.NAME, "serializeVariables", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "withDefaultValues", "adapter", "Lcom/apollographql/apollo/api/Adapter;", "rootField", "Lcom/apollographql/apollo/api/CompiledField;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "Data", SavedRecipesQuery.OPERATION_NAME, "Recipe", "Companion", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SavedRecipesQuery implements Query<Data> {

    @NotNull
    public static final String OPERATION_ID = "16846edebd28c20797a07fa9d35123465d62089c5651db69db3bc7a4c0c1016d";

    @NotNull
    public static final String OPERATION_NAME = "SavedRecipes";

    @NotNull
    private final Optional<Boolean> isVideoTagOnRecipeCardEnabled;

    @NotNull
    private final Optional<Integer> pageNumber;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/woolworths/shop/recipes/SavedRecipesQuery$Companion;", "", "<init>", "()V", "OPERATION_ID", "", "OPERATION_DOCUMENT", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_NAME", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getOPERATION_DOCUMENT() {
            return "query SavedRecipes($pageNumber: Int, $isVideoTagOnRecipeCardEnabled: Boolean! = false ) { savedRecipes(pageNumber: $pageNumber) { totalNumberOfRecipes nextPage recipes { __typename ...recipeSummaryCardFragment } } }  fragment recipeSummaryCardFragment on RecipeSummaryCard { title image id tags sourceName isVideoAvailable @include(if: $isVideoTagOnRecipeCardEnabled) recipePrepDuration { duration altText } recipeCookDuration { duration altText } recipeCostPerServe { recipeCostPerServePrice } }";
        }

        private Companion() {
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/woolworths/shop/recipes/SavedRecipesQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "savedRecipes", "Lcom/woolworths/shop/recipes/SavedRecipesQuery$SavedRecipes;", "<init>", "(Lcom/woolworths/shop/recipes/SavedRecipesQuery$SavedRecipes;)V", "getSavedRecipes", "()Lcom/woolworths/shop/recipes/SavedRecipesQuery$SavedRecipes;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {
        public static final int $stable = 8;

        @Nullable
        private final SavedRecipes savedRecipes;

        public Data(@Nullable SavedRecipes savedRecipes) {
            this.savedRecipes = savedRecipes;
        }

        public static /* synthetic */ Data copy$default(Data data, SavedRecipes savedRecipes, int i, Object obj) {
            if ((i & 1) != 0) {
                savedRecipes = data.savedRecipes;
            }
            return data.copy(savedRecipes);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final SavedRecipes getSavedRecipes() {
            return this.savedRecipes;
        }

        @NotNull
        public final Data copy(@Nullable SavedRecipes savedRecipes) {
            return new Data(savedRecipes);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Data) && Intrinsics.c(this.savedRecipes, ((Data) other).savedRecipes);
        }

        @Nullable
        public final SavedRecipes getSavedRecipes() {
            return this.savedRecipes;
        }

        public int hashCode() {
            SavedRecipes savedRecipes = this.savedRecipes;
            if (savedRecipes == null) {
                return 0;
            }
            return savedRecipes.hashCode();
        }

        @NotNull
        public String toString() {
            return "Data(savedRecipes=" + this.savedRecipes + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/shop/recipes/SavedRecipesQuery$Recipe;", "", "__typename", "", "recipeSummaryCardFragment", "Lau/com/woolworths/shop/aem/components/recipes/fragment/RecipeSummaryCardFragment;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/shop/aem/components/recipes/fragment/RecipeSummaryCardFragment;)V", "get__typename", "()Ljava/lang/String;", "getRecipeSummaryCardFragment", "()Lau/com/woolworths/shop/aem/components/recipes/fragment/RecipeSummaryCardFragment;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Recipe {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final RecipeSummaryCardFragment recipeSummaryCardFragment;

        public Recipe(@NotNull String __typename, @NotNull RecipeSummaryCardFragment recipeSummaryCardFragment) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(recipeSummaryCardFragment, "recipeSummaryCardFragment");
            this.__typename = __typename;
            this.recipeSummaryCardFragment = recipeSummaryCardFragment;
        }

        public static /* synthetic */ Recipe copy$default(Recipe recipe, String str, RecipeSummaryCardFragment recipeSummaryCardFragment, int i, Object obj) {
            if ((i & 1) != 0) {
                str = recipe.__typename;
            }
            if ((i & 2) != 0) {
                recipeSummaryCardFragment = recipe.recipeSummaryCardFragment;
            }
            return recipe.copy(str, recipeSummaryCardFragment);
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
        public final Recipe copy(@NotNull String __typename, @NotNull RecipeSummaryCardFragment recipeSummaryCardFragment) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(recipeSummaryCardFragment, "recipeSummaryCardFragment");
            return new Recipe(__typename, recipeSummaryCardFragment);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Recipe)) {
                return false;
            }
            Recipe recipe = (Recipe) other;
            return Intrinsics.c(this.__typename, recipe.__typename) && Intrinsics.c(this.recipeSummaryCardFragment, recipe.recipeSummaryCardFragment);
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
            return "Recipe(__typename=" + this.__typename + ", recipeSummaryCardFragment=" + this.recipeSummaryCardFragment + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J4\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/woolworths/shop/recipes/SavedRecipesQuery$SavedRecipes;", "", "totalNumberOfRecipes", "", "nextPage", "recipes", "", "Lcom/woolworths/shop/recipes/SavedRecipesQuery$Recipe;", "<init>", "(ILjava/lang/Integer;Ljava/util/List;)V", "getTotalNumberOfRecipes", "()I", "getNextPage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRecipes$annotations", "()V", "getRecipes", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "(ILjava/lang/Integer;Ljava/util/List;)Lcom/woolworths/shop/recipes/SavedRecipesQuery$SavedRecipes;", "equals", "", "other", "hashCode", "toString", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SavedRecipes {
        public static final int $stable = 8;

        @Nullable
        private final Integer nextPage;

        @NotNull
        private final List<Recipe> recipes;
        private final int totalNumberOfRecipes;

        public SavedRecipes(int i, @Nullable Integer num, @NotNull List<Recipe> recipes) {
            Intrinsics.h(recipes, "recipes");
            this.totalNumberOfRecipes = i;
            this.nextPage = num;
            this.recipes = recipes;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SavedRecipes copy$default(SavedRecipes savedRecipes, int i, Integer num, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = savedRecipes.totalNumberOfRecipes;
            }
            if ((i2 & 2) != 0) {
                num = savedRecipes.nextPage;
            }
            if ((i2 & 4) != 0) {
                list = savedRecipes.recipes;
            }
            return savedRecipes.copy(i, num, list);
        }

        @Deprecated
        public static /* synthetic */ void getRecipes$annotations() {
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
        public final List<Recipe> component3() {
            return this.recipes;
        }

        @NotNull
        public final SavedRecipes copy(int totalNumberOfRecipes, @Nullable Integer nextPage, @NotNull List<Recipe> recipes) {
            Intrinsics.h(recipes, "recipes");
            return new SavedRecipes(totalNumberOfRecipes, nextPage, recipes);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SavedRecipes)) {
                return false;
            }
            SavedRecipes savedRecipes = (SavedRecipes) other;
            return this.totalNumberOfRecipes == savedRecipes.totalNumberOfRecipes && Intrinsics.c(this.nextPage, savedRecipes.nextPage) && Intrinsics.c(this.recipes, savedRecipes.recipes);
        }

        @Nullable
        public final Integer getNextPage() {
            return this.nextPage;
        }

        @NotNull
        public final List<Recipe> getRecipes() {
            return this.recipes;
        }

        public final int getTotalNumberOfRecipes() {
            return this.totalNumberOfRecipes;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.totalNumberOfRecipes) * 31;
            Integer num = this.nextPage;
            return this.recipes.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            int i = this.totalNumberOfRecipes;
            Integer num = this.nextPage;
            List<Recipe> list = this.recipes;
            StringBuilder sb = new StringBuilder("SavedRecipes(totalNumberOfRecipes=");
            sb.append(i);
            sb.append(", nextPage=");
            sb.append(num);
            sb.append(", recipes=");
            return a.t(sb, list, ")");
        }
    }

    public SavedRecipesQuery() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SavedRecipesQuery copy$default(SavedRecipesQuery savedRecipesQuery, Optional optional, Optional optional2, int i, Object obj) {
        if ((i & 1) != 0) {
            optional = savedRecipesQuery.pageNumber;
        }
        if ((i & 2) != 0) {
            optional2 = savedRecipesQuery.isVideoTagOnRecipeCardEnabled;
        }
        return savedRecipesQuery.copy(optional, optional2);
    }

    @Override // com.apollographql.apollo.api.Executable
    @NotNull
    public Adapter<Data> adapter() {
        return Adapters.c(SavedRecipesQuery_ResponseAdapter.Data.INSTANCE, false);
    }

    @NotNull
    public final Optional<Integer> component1() {
        return this.pageNumber;
    }

    @NotNull
    public final Optional<Boolean> component2() {
        return this.isVideoTagOnRecipeCardEnabled;
    }

    @NotNull
    public final SavedRecipesQuery copy(@NotNull Optional<Integer> pageNumber, @NotNull Optional<Boolean> isVideoTagOnRecipeCardEnabled) {
        Intrinsics.h(pageNumber, "pageNumber");
        Intrinsics.h(isVideoTagOnRecipeCardEnabled, "isVideoTagOnRecipeCardEnabled");
        return new SavedRecipesQuery(pageNumber, isVideoTagOnRecipeCardEnabled);
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
        if (!(other instanceof SavedRecipesQuery)) {
            return false;
        }
        SavedRecipesQuery savedRecipesQuery = (SavedRecipesQuery) other;
        return Intrinsics.c(this.pageNumber, savedRecipesQuery.pageNumber) && Intrinsics.c(this.isVideoTagOnRecipeCardEnabled, savedRecipesQuery.isVideoTagOnRecipeCardEnabled);
    }

    @NotNull
    public final Optional<Integer> getPageNumber() {
        return this.pageNumber;
    }

    public int hashCode() {
        return this.isVideoTagOnRecipeCardEnabled.hashCode() + (this.pageNumber.hashCode() * 31);
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
        builder.e(SavedRecipesQuerySelections.INSTANCE.get__root());
        return builder.c();
    }

    @Override // com.apollographql.apollo.api.Executable
    public void serializeVariables(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        SavedRecipesQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @NotNull
    public String toString() {
        return "SavedRecipesQuery(pageNumber=" + this.pageNumber + ", isVideoTagOnRecipeCardEnabled=" + this.isVideoTagOnRecipeCardEnabled + ")";
    }

    public SavedRecipesQuery(@NotNull Optional<Integer> pageNumber, @NotNull Optional<Boolean> isVideoTagOnRecipeCardEnabled) {
        Intrinsics.h(pageNumber, "pageNumber");
        Intrinsics.h(isVideoTagOnRecipeCardEnabled, "isVideoTagOnRecipeCardEnabled");
        this.pageNumber = pageNumber;
        this.isVideoTagOnRecipeCardEnabled = isVideoTagOnRecipeCardEnabled;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SavedRecipesQuery(Optional optional, Optional optional2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i & 1;
        Optional.Absent absent = Optional.Absent.f13523a;
        this(i2 != 0 ? absent : optional, (i & 2) != 0 ? absent : optional2);
    }
}
