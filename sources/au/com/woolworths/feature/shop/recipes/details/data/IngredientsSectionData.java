package au.com.woolworths.feature.shop.recipes.details.data;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/details/data/IngredientsSectionData;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class IngredientsSectionData {

    /* renamed from: a, reason: collision with root package name */
    public final RecipeServesData f8017a;
    public final ArrayList b;

    public IngredientsSectionData(RecipeServesData recipeServesData, ArrayList arrayList) {
        this.f8017a = recipeServesData;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IngredientsSectionData)) {
            return false;
        }
        IngredientsSectionData ingredientsSectionData = (IngredientsSectionData) obj;
        return Intrinsics.c(this.f8017a, ingredientsSectionData.f8017a) && this.b.equals(ingredientsSectionData.b);
    }

    public final int hashCode() {
        RecipeServesData recipeServesData = this.f8017a;
        return this.b.hashCode() + ((recipeServesData == null ? 0 : recipeServesData.hashCode()) * 31);
    }

    public final String toString() {
        return "IngredientsSectionData(serves=" + this.f8017a + ", ingredients=" + this.b + ")";
    }
}
