package au.com.woolworths.feature.shop.recipes.details.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/details/data/RecipeNutritionTileData;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RecipeNutritionTileData {

    /* renamed from: a, reason: collision with root package name */
    public final String f8019a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final ArrayList g;

    public RecipeNutritionTileData(String str, String str2, String str3, int i, String str4, String str5, ArrayList arrayList) {
        this.f8019a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = str5;
        this.g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecipeNutritionTileData)) {
            return false;
        }
        RecipeNutritionTileData recipeNutritionTileData = (RecipeNutritionTileData) obj;
        return this.f8019a.equals(recipeNutritionTileData.f8019a) && this.b.equals(recipeNutritionTileData.b) && this.c.equals(recipeNutritionTileData.c) && this.d == recipeNutritionTileData.d && this.e.equals(recipeNutritionTileData.e) && this.f.equals(recipeNutritionTileData.f) && this.g.equals(recipeNutritionTileData.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + b.c(b.c(b.a(this.d, b.c(b.c(this.f8019a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbV = a.v("RecipeNutritionTileData(title=", this.f8019a, ", perServeKilojoules=", this.b, ", perServeCalories=");
        a.x(this.d, this.c, ", dailyIntakePercentage=", ", dailyIntakeText=", sbV);
        androidx.constraintlayout.core.state.a.B(sbV, this.e, ", disclaimer=", this.f, ", features=");
        return android.support.v4.media.session.a.q(")", sbV, this.g);
    }
}
