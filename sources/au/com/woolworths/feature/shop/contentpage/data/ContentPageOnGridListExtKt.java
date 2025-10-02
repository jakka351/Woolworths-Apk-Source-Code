package au.com.woolworths.feature.shop.contentpage.data;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.shop.aem.components.model.gridlist.GridListData;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryData;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCostPerServeData;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeDuration;
import au.com.woolworths.shop.aem.components.recipes.fragment.RecipeSummaryCardFragment;
import com.woolworths.feature.shop.contentpage.fragment.ContentPage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"content-page_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ContentPageOnGridListExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.ArrayList] */
    public static final GridListData a(ContentPage.OnGridList onGridList) {
        RecipeCardSummaryData recipeCardSummaryData;
        ?? arrayList;
        String str;
        RecipeCostPerServeData recipeCostPerServeData;
        Intrinsics.h(onGridList, "<this>");
        Integer num = onGridList.f19596a;
        ContentPage.GridListImpressionAnalytics gridListImpressionAnalytics = onGridList.c;
        AnalyticsData analyticsDataB = gridListImpressionAnalytics != null ? ContentPageMapperUtilKt.b(gridListImpressionAnalytics.b) : null;
        ContentPage.GridListAnalytics gridListAnalytics = onGridList.b;
        AnalyticsData analyticsDataB2 = gridListAnalytics != null ? ContentPageMapperUtilKt.b(gridListAnalytics.b) : null;
        ArrayList arrayList2 = onGridList.d;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ContentPage.OnRecipeSummaryCard1 onRecipeSummaryCard1 = ((ContentPage.GridListItem) it.next()).b;
            if (onRecipeSummaryCard1 != null) {
                RecipeSummaryCardFragment recipeSummaryCardFragment = onRecipeSummaryCard1.b;
                String str2 = recipeSummaryCardFragment.c;
                String str3 = recipeSummaryCardFragment.f10200a;
                String str4 = recipeSummaryCardFragment.b;
                List list = recipeSummaryCardFragment.d;
                if (list != null) {
                    List list2 = list;
                    arrayList = new ArrayList(CollectionsKt.s(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add((String) it2.next());
                    }
                } else {
                    arrayList = 0;
                }
                if (arrayList == 0) {
                    arrayList = EmptyList.d;
                }
                String str5 = recipeSummaryCardFragment.e;
                Boolean bool = recipeSummaryCardFragment.f;
                RecipeSummaryCardFragment.RecipePrepDuration recipePrepDuration = recipeSummaryCardFragment.g;
                RecipeDuration recipeDuration = recipePrepDuration != null ? new RecipeDuration(recipePrepDuration.f10203a, recipePrepDuration.b) : null;
                RecipeSummaryCardFragment.RecipeCookDuration recipeCookDuration = recipeSummaryCardFragment.h;
                RecipeDuration recipeDuration2 = recipeCookDuration != null ? new RecipeDuration(recipeCookDuration.f10201a, recipeCookDuration.b) : null;
                RecipeSummaryCardFragment.RecipeCostPerServe recipeCostPerServe = recipeSummaryCardFragment.i;
                if (recipeCostPerServe != null) {
                    str = str2;
                    recipeCostPerServeData = new RecipeCostPerServeData(recipeCostPerServe.f10202a, null);
                } else {
                    str = str2;
                    recipeCostPerServeData = null;
                }
                recipeCardSummaryData = new RecipeCardSummaryData(str, str3, str4, arrayList, str5, bool, recipeDuration, recipeDuration2, recipeCostPerServeData);
            } else {
                recipeCardSummaryData = null;
            }
            if (recipeCardSummaryData != null) {
                arrayList3.add(recipeCardSummaryData);
            }
        }
        return new GridListData(num, analyticsDataB, analyticsDataB2, arrayList3);
    }
}
