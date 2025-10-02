package au.com.woolworths.feature.shop.recipes.details.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.data.HorizontalListData;
import au.com.woolworths.foundation.shop.model.recipes.RecipeBylineData;
import au.com.woolworths.shop.aem.components.model.method.MethodData;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCostPerServeData;
import au.com.woolworths.shop.aem.components.model.video.VideoData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/details/data/RecipeDetailData;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RecipeDetailData {

    /* renamed from: a, reason: collision with root package name */
    public final String f8018a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final RecipeBylineData f;
    public final List g;
    public final IngredientsSectionData h;
    public final List i;
    public final MethodData j;
    public final HorizontalListData k;
    public final RecipeNutritionTileData l;
    public final String m;
    public final List n;
    public final UserInteractionData o;
    public final Object p;
    public final ShopIngredientButton q;
    public final VideoData r;
    public final RecipeCostPerServeData s;
    public final AnalyticsData t;
    public final AnalyticsData u;

    public RecipeDetailData(String str, String str2, String str3, String str4, List list, RecipeBylineData recipeBylineData, List list2, IngredientsSectionData ingredientsSectionData, List list3, MethodData methodData, HorizontalListData horizontalListData, RecipeNutritionTileData recipeNutritionTileData, String str5, List list4, UserInteractionData userInteractionData, Object obj, ShopIngredientButton shopIngredientButton, VideoData videoData, RecipeCostPerServeData recipeCostPerServeData, AnalyticsData analyticsData, AnalyticsData analyticsData2) {
        this.f8018a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
        this.f = recipeBylineData;
        this.g = list2;
        this.h = ingredientsSectionData;
        this.i = list3;
        this.j = methodData;
        this.k = horizontalListData;
        this.l = recipeNutritionTileData;
        this.m = str5;
        this.n = list4;
        this.o = userInteractionData;
        this.p = obj;
        this.q = shopIngredientButton;
        this.r = videoData;
        this.s = recipeCostPerServeData;
        this.t = analyticsData;
        this.u = analyticsData2;
    }

    public static RecipeDetailData a(RecipeDetailData recipeDetailData, ArrayList arrayList, IngredientsSectionData ingredientsSectionData, UserInteractionData userInteractionData, Object obj, int i) {
        String str = recipeDetailData.f8018a;
        String str2 = recipeDetailData.b;
        String str3 = recipeDetailData.c;
        String str4 = recipeDetailData.d;
        List list = (i & 16) != 0 ? recipeDetailData.e : arrayList;
        RecipeBylineData recipeBylineData = recipeDetailData.f;
        List list2 = list;
        List list3 = recipeDetailData.g;
        IngredientsSectionData ingredientsSectionData2 = (i & 128) != 0 ? recipeDetailData.h : ingredientsSectionData;
        List list4 = recipeDetailData.i;
        IngredientsSectionData ingredientsSectionData3 = ingredientsSectionData2;
        MethodData methodData = recipeDetailData.j;
        HorizontalListData horizontalListData = recipeDetailData.k;
        RecipeNutritionTileData recipeNutritionTileData = recipeDetailData.l;
        String str5 = recipeDetailData.m;
        List list5 = recipeDetailData.n;
        UserInteractionData userInteractionData2 = (i & 16384) != 0 ? recipeDetailData.o : userInteractionData;
        Object obj2 = (i & 32768) != 0 ? recipeDetailData.p : obj;
        ShopIngredientButton shopIngredientButton = recipeDetailData.q;
        VideoData videoData = recipeDetailData.r;
        RecipeCostPerServeData recipeCostPerServeData = recipeDetailData.s;
        AnalyticsData analyticsData = recipeDetailData.t;
        AnalyticsData analyticsData2 = recipeDetailData.u;
        recipeDetailData.getClass();
        return new RecipeDetailData(str, str2, str3, str4, list2, recipeBylineData, list3, ingredientsSectionData3, list4, methodData, horizontalListData, recipeNutritionTileData, str5, list5, userInteractionData2, obj2, shopIngredientButton, videoData, recipeCostPerServeData, analyticsData, analyticsData2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecipeDetailData)) {
            return false;
        }
        RecipeDetailData recipeDetailData = (RecipeDetailData) obj;
        return Intrinsics.c(this.f8018a, recipeDetailData.f8018a) && Intrinsics.c(this.b, recipeDetailData.b) && Intrinsics.c(this.c, recipeDetailData.c) && Intrinsics.c(this.d, recipeDetailData.d) && Intrinsics.c(this.e, recipeDetailData.e) && Intrinsics.c(this.f, recipeDetailData.f) && Intrinsics.c(this.g, recipeDetailData.g) && Intrinsics.c(this.h, recipeDetailData.h) && Intrinsics.c(this.i, recipeDetailData.i) && Intrinsics.c(this.j, recipeDetailData.j) && Intrinsics.c(this.k, recipeDetailData.k) && Intrinsics.c(this.l, recipeDetailData.l) && Intrinsics.c(this.m, recipeDetailData.m) && Intrinsics.c(this.n, recipeDetailData.n) && Intrinsics.c(this.o, recipeDetailData.o) && Intrinsics.c(this.p, recipeDetailData.p) && Intrinsics.c(this.q, recipeDetailData.q) && Intrinsics.c(this.r, recipeDetailData.r) && Intrinsics.c(this.s, recipeDetailData.s) && Intrinsics.c(this.t, recipeDetailData.t) && Intrinsics.c(this.u, recipeDetailData.u);
    }

    public final int hashCode() {
        int iHashCode = this.f8018a.hashCode() * 31;
        String str = this.b;
        int iC = b.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        int iD = b.d((iC + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e);
        RecipeBylineData recipeBylineData = this.f;
        int iD2 = b.d((iD + (recipeBylineData == null ? 0 : recipeBylineData.hashCode())) * 31, 31, this.g);
        IngredientsSectionData ingredientsSectionData = this.h;
        int iHashCode2 = (this.j.hashCode() + b.d((iD2 + (ingredientsSectionData == null ? 0 : ingredientsSectionData.hashCode())) * 31, 31, this.i)) * 31;
        HorizontalListData horizontalListData = this.k;
        int iHashCode3 = (iHashCode2 + (horizontalListData == null ? 0 : horizontalListData.hashCode())) * 31;
        RecipeNutritionTileData recipeNutritionTileData = this.l;
        int iHashCode4 = (iHashCode3 + (recipeNutritionTileData == null ? 0 : recipeNutritionTileData.hashCode())) * 31;
        String str3 = this.m;
        int iD3 = b.d((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.n);
        UserInteractionData userInteractionData = this.o;
        int iHashCode5 = (iD3 + (userInteractionData == null ? 0 : userInteractionData.hashCode())) * 31;
        Object obj = this.p;
        int iHashCode6 = (this.q.f8023a.hashCode() + ((iHashCode5 + (obj == null ? 0 : obj.hashCode())) * 31)) * 31;
        VideoData videoData = this.r;
        int iHashCode7 = (iHashCode6 + (videoData == null ? 0 : videoData.hashCode())) * 31;
        RecipeCostPerServeData recipeCostPerServeData = this.s;
        int iHashCode8 = (iHashCode7 + (recipeCostPerServeData == null ? 0 : recipeCostPerServeData.hashCode())) * 31;
        AnalyticsData analyticsData = this.t;
        int iHashCode9 = (iHashCode8 + (analyticsData == null ? 0 : analyticsData.hashCode())) * 31;
        AnalyticsData analyticsData2 = this.u;
        return iHashCode9 + (analyticsData2 != null ? analyticsData2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("RecipeDetailData(recipeId=", this.f8018a, ", recipeUrl=", this.b, ", title=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", image=", this.d, ", features=");
        sbV.append(this.e);
        sbV.append(", byLine=");
        sbV.append(this.f);
        sbV.append(", ingredients=");
        sbV.append(this.g);
        sbV.append(", ingredientsSection=");
        sbV.append(this.h);
        sbV.append(", ingredientProductIds=");
        sbV.append(this.i);
        sbV.append(", method=");
        sbV.append(this.j);
        sbV.append(", latestRecipes=");
        sbV.append(this.k);
        sbV.append(", nutritionTile=");
        sbV.append(this.l);
        sbV.append(", sourceName=");
        au.com.woolworths.android.onesite.a.B(sbV, this.m, ", tags=", this.n, ", userInteraction=");
        sbV.append(this.o);
        sbV.append(", universalInventory=");
        sbV.append(this.p);
        sbV.append(", shopIngredientButton=");
        sbV.append(this.q);
        sbV.append(", video=");
        sbV.append(this.r);
        sbV.append(", costPerServe=");
        sbV.append(this.s);
        sbV.append(", analytics=");
        sbV.append(this.t);
        sbV.append(", impressionAnalytics=");
        return au.com.woolworths.android.onesite.a.n(sbV, this.u, ")");
    }
}
