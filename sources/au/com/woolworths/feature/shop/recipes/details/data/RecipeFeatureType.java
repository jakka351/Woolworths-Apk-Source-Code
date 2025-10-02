package au.com.woolworths.feature.shop.recipes.details.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/details/data/RecipeFeatureType;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecipeFeatureType {
    public static final RecipeFeatureType d;
    public static final RecipeFeatureType e;
    public static final RecipeFeatureType f;
    public static final RecipeFeatureType g;
    public static final /* synthetic */ RecipeFeatureType[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        RecipeFeatureType recipeFeatureType = new RecipeFeatureType("SERVES", 0);
        d = recipeFeatureType;
        RecipeFeatureType recipeFeatureType2 = new RecipeFeatureType("PREP", 1);
        e = recipeFeatureType2;
        RecipeFeatureType recipeFeatureType3 = new RecipeFeatureType("COOK", 2);
        f = recipeFeatureType3;
        RecipeFeatureType recipeFeatureType4 = new RecipeFeatureType("UNKNOWN", 3);
        g = recipeFeatureType4;
        RecipeFeatureType[] recipeFeatureTypeArr = {recipeFeatureType, recipeFeatureType2, recipeFeatureType3, recipeFeatureType4};
        h = recipeFeatureTypeArr;
        i = EnumEntriesKt.a(recipeFeatureTypeArr);
    }

    public static RecipeFeatureType valueOf(String str) {
        return (RecipeFeatureType) Enum.valueOf(RecipeFeatureType.class, str);
    }

    public static RecipeFeatureType[] values() {
        return (RecipeFeatureType[]) h.clone();
    }
}
