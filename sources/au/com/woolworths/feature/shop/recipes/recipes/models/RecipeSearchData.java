package au.com.woolworths.feature.shop.recipes.recipes.models;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.graphql.MappedName;
import au.com.woolworths.pagingutils.NumericPageData;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryData;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003JT\u0010!\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010&\u001a\u00020\u0007HÖ\u0001J\t\u0010'\u001a\u00020\nHÖ\u0001R$\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011¨\u0006("}, d2 = {"Lau/com/woolworths/feature/shop/recipes/recipes/models/RecipeSearchData;", "Lau/com/woolworths/pagingutils/NumericPageData;", "", "recipes", "", "Lau/com/woolworths/shop/aem/components/model/recipe/RecipeCardSummaryData;", "totalCount", "", "nextPageKey", "title", "", "recipeListFeed", "<init>", "(Ljava/util/List;ILjava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V", "getRecipes$annotations", "()V", "getRecipes", "()Ljava/util/List;", "getTotalCount", "()I", "getNextPageKey", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTitle", "()Ljava/lang/String;", "getRecipeListFeed", "items", "getItems", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/List;ILjava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lau/com/woolworths/feature/shop/recipes/recipes/models/RecipeSearchData;", "equals", "", "other", "hashCode", "toString", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RecipeSearchData implements NumericPageData<Object> {
    public static final int $stable = 8;

    @MappedName
    @Nullable
    private final Integer nextPageKey;

    @Nullable
    private final List<Object> recipeListFeed;

    @Nullable
    private final List<RecipeCardSummaryData> recipes;

    @Nullable
    private final String title;

    @MappedName
    private final int totalCount;

    public RecipeSearchData(@Nullable List<RecipeCardSummaryData> list, int i, @Nullable Integer num, @Nullable String str, @Nullable List<? extends Object> list2) {
        this.recipes = list;
        this.totalCount = i;
        this.nextPageKey = num;
        this.title = str;
        this.recipeListFeed = list2;
    }

    public static /* synthetic */ RecipeSearchData copy$default(RecipeSearchData recipeSearchData, List list, int i, Integer num, String str, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = recipeSearchData.recipes;
        }
        if ((i2 & 2) != 0) {
            i = recipeSearchData.totalCount;
        }
        if ((i2 & 4) != 0) {
            num = recipeSearchData.nextPageKey;
        }
        if ((i2 & 8) != 0) {
            str = recipeSearchData.title;
        }
        if ((i2 & 16) != 0) {
            list2 = recipeSearchData.recipeListFeed;
        }
        List list3 = list2;
        Integer num2 = num;
        return recipeSearchData.copy(list, i, num2, str, list3);
    }

    @Deprecated
    public static /* synthetic */ void getRecipes$annotations() {
    }

    @Nullable
    public final List<RecipeCardSummaryData> component1() {
        return this.recipes;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getNextPageKey() {
        return this.nextPageKey;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final List<Object> component5() {
        return this.recipeListFeed;
    }

    @NotNull
    public final RecipeSearchData copy(@Nullable List<RecipeCardSummaryData> recipes, int totalCount, @Nullable Integer nextPageKey, @Nullable String title, @Nullable List<? extends Object> recipeListFeed) {
        return new RecipeSearchData(recipes, totalCount, nextPageKey, title, recipeListFeed);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecipeSearchData)) {
            return false;
        }
        RecipeSearchData recipeSearchData = (RecipeSearchData) other;
        return Intrinsics.c(this.recipes, recipeSearchData.recipes) && this.totalCount == recipeSearchData.totalCount && Intrinsics.c(this.nextPageKey, recipeSearchData.nextPageKey) && Intrinsics.c(this.title, recipeSearchData.title) && Intrinsics.c(this.recipeListFeed, recipeSearchData.recipeListFeed);
    }

    @Override // au.com.woolworths.pagingutils.PageData
    @NotNull
    public List<Object> getItems() {
        List<Object> list = this.recipeListFeed;
        if (list != null && !list.isEmpty()) {
            return this.recipeListFeed;
        }
        List<RecipeCardSummaryData> list2 = this.recipes;
        return list2 == null ? EmptyList.d : list2;
    }

    @Nullable
    public final List<Object> getRecipeListFeed() {
        return this.recipeListFeed;
    }

    @Nullable
    public final List<RecipeCardSummaryData> getRecipes() {
        return this.recipes;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Override // au.com.woolworths.pagingutils.PageData
    public int getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        List<RecipeCardSummaryData> list = this.recipes;
        int iA = b.a(this.totalCount, (list == null ? 0 : list.hashCode()) * 31, 31);
        Integer num = this.nextPageKey;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<Object> list2 = this.recipeListFeed;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<RecipeCardSummaryData> list = this.recipes;
        int i = this.totalCount;
        Integer num = this.nextPageKey;
        String str = this.title;
        List<Object> list2 = this.recipeListFeed;
        StringBuilder sb = new StringBuilder("RecipeSearchData(recipes=");
        sb.append(list);
        sb.append(", totalCount=");
        sb.append(i);
        sb.append(", nextPageKey=");
        sb.append(num);
        sb.append(", title=");
        sb.append(str);
        sb.append(", recipeListFeed=");
        return a.t(sb, list2, ")");
    }

    @Override // au.com.woolworths.pagingutils.PageData
    @Nullable
    public Integer getNextPageKey() {
        return this.nextPageKey;
    }
}
