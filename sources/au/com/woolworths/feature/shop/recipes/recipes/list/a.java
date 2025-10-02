package au.com.woolworths.feature.shop.recipes.recipes.list;

import androidx.appcompat.app.ActionBar;
import androidx.paging.PagedList;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.analytics.supers.recipes.search.RecipeSearchAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.shop.recipes.databinding.ActivityRecipeListBinding;
import au.com.woolworths.feature.shop.recipes.recipes.analytics.RecipesScreens;
import au.com.woolworths.feature.shop.recipes.recipes.models.RecipeSearchData;
import au.com.woolworths.pagingutils.KeyedPageData;
import au.com.woolworths.pagingutils.NetworkState;
import au.com.woolworths.pagingutils.PageData;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryData;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ RecipeListActivity e;

    public /* synthetic */ a(RecipeListActivity recipeListActivity, int i) {
        this.d = i;
        this.e = recipeListActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        int i = this.d;
        Unit unit = Unit.f24250a;
        RecipeListActivity recipeListActivity = this.e;
        switch (i) {
            case 0:
                Integer num = (Integer) obj;
                int i2 = RecipeListActivity.C;
                RecipeListViewModel recipeListViewModelO4 = recipeListActivity.O4();
                String str2 = recipeListActivity.A;
                if (str2 == null) {
                    Intrinsics.p("listTitle");
                    throw null;
                }
                Intrinsics.e(num);
                AnalyticsManager analyticsManager = recipeListViewModelO4.g;
                TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.l2, str2);
                Activities.RecipeList.ExtraRecipeListSource extraRecipeListSource = recipeListViewModelO4.n;
                if (extraRecipeListSource == null) {
                    Intrinsics.p("recipeListSource");
                    throw null;
                }
                if (extraRecipeListSource instanceof Activities.RecipeList.ExtrasBySourceAndTags) {
                    analyticsManager.e(RecipesScreens.e, trackingMetadataA);
                } else {
                    if (!(extraRecipeListSource instanceof Activities.RecipeList.ExtrasBySearchTerm)) {
                        throw new IllegalArgumentException("Recipe List: The source provided is not implemented");
                    }
                    analyticsManager.b(RecipeSearchAnalytics.RecipeSearchResult.d, trackingMetadataA);
                }
                return unit;
            case 1:
                int i3 = RecipeListActivity.C;
                ((RecipeListEpoxyController) recipeListActivity.z.getD()).submitList((PagedList) obj);
                return unit;
            case 2:
                int i4 = RecipeListActivity.C;
                ((RecipeListEpoxyController) recipeListActivity.z.getD()).setNetworkState((NetworkState) obj);
                return unit;
            case 3:
                NetworkState networkState = (NetworkState) obj;
                ActivityRecipeListBinding activityRecipeListBinding = recipeListActivity.x;
                if (activityRecipeListBinding != null) {
                    activityRecipeListBinding.y.suppressLayout(Intrinsics.c(networkState, NetworkState.e));
                    return unit;
                }
                Intrinsics.p("activityBinding");
                throw null;
            default:
                KeyedPageData keyedPageData = (KeyedPageData) obj;
                int i5 = RecipeListActivity.C;
                PageData pageData = keyedPageData.b;
                RecipeListViewModel recipeListViewModelO42 = recipeListActivity.O4();
                List items = pageData.getC();
                int totalCount = pageData.getD();
                Intrinsics.h(items, "items");
                Activities.RecipeList.ExtraRecipeListSource extraRecipeListSource2 = recipeListViewModelO42.n;
                if (extraRecipeListSource2 == null) {
                    Intrinsics.p("recipeListSource");
                    throw null;
                }
                Activities.RecipeList.ExtrasBySearchTerm extrasBySearchTerm = extraRecipeListSource2 instanceof Activities.RecipeList.ExtrasBySearchTerm ? (Activities.RecipeList.ExtrasBySearchTerm) extraRecipeListSource2 : null;
                if (extrasBySearchTerm != null && (str = extrasBySearchTerm.d) != null) {
                    AnalyticsManager analyticsManager2 = recipeListViewModelO42.g;
                    RecipeSearchAnalytics.RecipeSearchResult.Action action = RecipeSearchAnalytics.RecipeSearchResult.Action.e;
                    TrackingMetadata trackingMetadataA2 = TrackingMetadata.Companion.a(TrackableValue.J2, str);
                    trackingMetadataA2.b(TrackableValue.O2, Integer.valueOf(totalCount));
                    TrackableValue trackableValue = TrackableValue.o2;
                    List list = items;
                    ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
                    for (Object obj2 : list) {
                        RecipeCardSummaryData recipeCardSummaryData = obj2 instanceof RecipeCardSummaryData ? (RecipeCardSummaryData) obj2 : null;
                        arrayList.add(recipeCardSummaryData != null ? recipeCardSummaryData.getTitle() : null);
                    }
                    trackingMetadataA2.b(trackableValue, arrayList);
                    TrackableValue trackableValue2 = TrackableValue.m2;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list, 10));
                    for (Object obj3 : list) {
                        RecipeCardSummaryData recipeCardSummaryData2 = obj3 instanceof RecipeCardSummaryData ? (RecipeCardSummaryData) obj3 : null;
                        arrayList2.add(recipeCardSummaryData2 != null ? recipeCardSummaryData2.getId() : null);
                    }
                    trackingMetadataA2.b(trackableValue2, arrayList2);
                    analyticsManager2.i(action, trackingMetadataA2);
                }
                PageData pageData2 = keyedPageData.b;
                Intrinsics.f(pageData2, "null cannot be cast to non-null type au.com.woolworths.feature.shop.recipes.recipes.models.RecipeSearchData");
                String title = ((RecipeSearchData) pageData2).getTitle();
                if (title == null) {
                    title = recipeListActivity.getString(R.string.recipe_list_default_title);
                    Intrinsics.g(title, "getString(...)");
                }
                ActionBar supportActionBar = recipeListActivity.getSupportActionBar();
                Intrinsics.e(supportActionBar);
                CharSequence charSequenceJ = supportActionBar.j();
                if (charSequenceJ == null || charSequenceJ.length() == 0) {
                    ActionBar supportActionBar2 = recipeListActivity.getSupportActionBar();
                    Intrinsics.e(supportActionBar2);
                    supportActionBar2.A(title);
                }
                return unit;
        }
    }
}
