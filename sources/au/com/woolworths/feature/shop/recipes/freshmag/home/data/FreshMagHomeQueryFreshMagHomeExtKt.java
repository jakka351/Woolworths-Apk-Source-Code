package au.com.woolworths.feature.shop.recipes.freshmag.home.data;

import au.com.woolworths.android.onesite.data.HorizontalListData;
import au.com.woolworths.foundation.shop.model.recipes.RecipeSource;
import au.com.woolworths.foundation.shop.model.recipes.RecipeTagList;
import au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListItem;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryData;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCostPerServeData;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeDuration;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeMoreCard;
import au.com.woolworths.shop.aem.components.recipes.fragment.RecipeSummaryCardFragment;
import com.woolworths.shop.freshmag.FreshMagHomeQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"recipes_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FreshMagHomeQueryFreshMagHomeExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v17, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v5, types: [au.com.woolworths.android.onesite.data.HorizontalListData] */
    /* JADX WARN: Type inference failed for: r5v9, types: [au.com.woolworths.foundation.shop.model.recipes.RecipeSource] */
    public static final FreshMagHomeData a(FreshMagHomeQuery.FreshMagHome freshMagHome) {
        Iterator it;
        String str;
        FreshMagSummaryData horizontalListData;
        Iterator it2;
        String str2;
        Iterator it3;
        HorizontalListItem recipeMoreCard;
        RecipeTagList recipeSource;
        ?? arrayList;
        RecipeDuration recipeDuration;
        String str3;
        RecipeCostPerServeData recipeCostPerServeData;
        String str4 = "<this>";
        Intrinsics.h(freshMagHome, "<this>");
        ArrayList arrayList2 = freshMagHome.f22715a;
        ArrayList arrayList3 = new ArrayList();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            FreshMagHomeQuery.Item item = (FreshMagHomeQuery.Item) it4.next();
            if ((item != null ? item.b : null) != null) {
                FreshMagHomeQuery.OnFreshMagSummary onFreshMagSummary = item.b;
                Intrinsics.h(onFreshMagSummary, str4);
                horizontalListData = new FreshMagSummaryData(onFreshMagSummary.f22718a, onFreshMagSummary.b, onFreshMagSummary.c, onFreshMagSummary.d);
                it = it4;
                str = str4;
            } else if ((item != null ? item.c : null) != null) {
                FreshMagHomeQuery.OnHorizontalList onHorizontalList = item.c;
                Intrinsics.h(onHorizontalList, str4);
                String str5 = onHorizontalList.f22719a;
                String str6 = onHorizontalList.b;
                String str7 = onHorizontalList.d;
                String str8 = onHorizontalList.e;
                ArrayList arrayList4 = onHorizontalList.c;
                ArrayList arrayList5 = new ArrayList();
                Iterator it5 = arrayList4.iterator();
                while (it5.hasNext()) {
                    FreshMagHomeQuery.Item1 item1 = (FreshMagHomeQuery.Item1) it5.next();
                    FreshMagHomeQuery.OnRecipeSummaryCard onRecipeSummaryCard = item1.b;
                    if (onRecipeSummaryCard != null) {
                        RecipeSummaryCardFragment recipeSummaryCardFragment = onRecipeSummaryCard.b;
                        String str9 = recipeSummaryCardFragment.c;
                        String str10 = recipeSummaryCardFragment.f10200a;
                        String str11 = recipeSummaryCardFragment.b;
                        List list = recipeSummaryCardFragment.d;
                        if (list != null) {
                            List list2 = list;
                            arrayList = new ArrayList(CollectionsKt.s(list2, 10));
                            Iterator it6 = list2.iterator();
                            while (it6.hasNext()) {
                                arrayList.add((String) it6.next());
                            }
                        } else {
                            arrayList = 0;
                        }
                        if (arrayList == 0) {
                            arrayList = EmptyList.d;
                        }
                        List list3 = arrayList;
                        String str12 = recipeSummaryCardFragment.e;
                        Boolean bool = recipeSummaryCardFragment.f;
                        RecipeSummaryCardFragment.RecipePrepDuration recipePrepDuration = recipeSummaryCardFragment.g;
                        it2 = it4;
                        if (recipePrepDuration != null) {
                            str2 = str4;
                            recipeDuration = new RecipeDuration(recipePrepDuration.f10203a, recipePrepDuration.b);
                        } else {
                            str2 = str4;
                            recipeDuration = null;
                        }
                        RecipeSummaryCardFragment.RecipeCookDuration recipeCookDuration = recipeSummaryCardFragment.h;
                        RecipeDuration recipeDuration2 = recipeCookDuration != null ? new RecipeDuration(recipeCookDuration.f10201a, recipeCookDuration.b) : null;
                        RecipeSummaryCardFragment.RecipeCostPerServe recipeCostPerServe = recipeSummaryCardFragment.i;
                        if (recipeCostPerServe != null) {
                            it3 = it5;
                            str3 = str12;
                            recipeCostPerServeData = new RecipeCostPerServeData(recipeCostPerServe.f10202a, null);
                        } else {
                            it3 = it5;
                            str3 = str12;
                            recipeCostPerServeData = null;
                        }
                        recipeMoreCard = new RecipeCardSummaryData(str9, str10, str11, list3, str3, bool, recipeDuration, recipeDuration2, recipeCostPerServeData);
                    } else {
                        it2 = it4;
                        str2 = str4;
                        it3 = it5;
                        FreshMagHomeQuery.OnRecipeMoreCard onRecipeMoreCard = item1.c;
                        if (onRecipeMoreCard != null) {
                            ArrayList<FreshMagHomeQuery.ActionMetadatum> arrayList6 = onRecipeMoreCard.f22720a;
                            ArrayList arrayList7 = new ArrayList();
                            for (FreshMagHomeQuery.ActionMetadatum actionMetadatum : arrayList6) {
                                FreshMagHomeQuery.OnRecipeTagList onRecipeTagList = actionMetadatum.b;
                                if (onRecipeTagList != null) {
                                    ArrayList arrayList8 = onRecipeTagList.f22723a;
                                    ArrayList arrayList9 = new ArrayList(CollectionsKt.s(arrayList8, 10));
                                    Iterator it7 = arrayList8.iterator();
                                    while (it7.hasNext()) {
                                        arrayList9.add((String) it7.next());
                                    }
                                    recipeSource = new RecipeTagList(arrayList9);
                                } else {
                                    FreshMagHomeQuery.OnRecipeSource onRecipeSource = actionMetadatum.c;
                                    recipeSource = onRecipeSource != null ? new RecipeSource(onRecipeSource.f22721a) : null;
                                }
                                if (recipeSource != null) {
                                    arrayList7.add(recipeSource);
                                }
                            }
                            recipeMoreCard = new RecipeMoreCard(arrayList7);
                        } else {
                            recipeMoreCard = null;
                        }
                    }
                    if (recipeMoreCard != null) {
                        arrayList5.add(recipeMoreCard);
                    }
                    it4 = it2;
                    str4 = str2;
                    it5 = it3;
                }
                it = it4;
                str = str4;
                horizontalListData = new HorizontalListData(str5, str6, str7, null, str8, arrayList5, null, null, null, null);
            } else {
                it = it4;
                str = str4;
                horizontalListData = null;
            }
            if (horizontalListData != null) {
                arrayList3.add(horizontalListData);
            }
            it4 = it;
            str4 = str;
        }
        return new FreshMagHomeData(arrayList3);
    }
}
