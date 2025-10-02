package au.com.woolworths.feature.shop.recipes.details.data;

import au.com.woolworths.feature.shop.recipes.details.analytics.RecipeDetailsActions;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/details/data/TabContents;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class TabContents {
    public static final TabContents e;
    public static final TabContents f;
    public static final /* synthetic */ TabContents[] g;
    public static final /* synthetic */ EnumEntries h;
    public final int d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/shop/recipes/details/data/TabContents.INGREDIENTS", "Lau/com/woolworths/feature/shop/recipes/details/data/TabContents;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class INGREDIENTS extends TabContents {
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/shop/recipes/details/data/TabContents.METHOD", "Lau/com/woolworths/feature/shop/recipes/details/data/TabContents;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class METHOD extends TabContents {
    }

    static {
        INGREDIENTS ingredients = new INGREDIENTS("INGREDIENTS", 0, R.string.recipe_detail_tab_ingredients);
        RecipeDetailsActions recipeDetailsActions = RecipeDetailsActions.e;
        e = ingredients;
        METHOD method = new METHOD("METHOD", 1, R.string.recipe_detail_tab_method);
        f = method;
        TabContents[] tabContentsArr = {ingredients, method};
        g = tabContentsArr;
        h = EnumEntriesKt.a(tabContentsArr);
    }

    public TabContents(String str, int i, int i2) {
        this.d = i2;
    }

    public static TabContents valueOf(String str) {
        return (TabContents) Enum.valueOf(TabContents.class, str);
    }

    public static TabContents[] values() {
        return (TabContents[]) g.clone();
    }
}
