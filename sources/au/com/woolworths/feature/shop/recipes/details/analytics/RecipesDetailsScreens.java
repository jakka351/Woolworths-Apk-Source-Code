package au.com.woolworths.feature.shop.recipes.details.analytics;

import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/details/analytics/RecipesDetailsScreens;", "Lau/com/woolworths/android/onesite/analytics/Screen;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class RecipesDetailsScreens implements Screen {
    public static final RecipesDetailsScreens d;
    public static final RecipesDetailsScreens e;
    public static final /* synthetic */ RecipesDetailsScreens[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        RecipesDetailsScreens recipesDetailsScreens = new RecipesDetailsScreens() { // from class: au.com.woolworths.feature.shop.recipes.details.analytics.RecipesDetailsScreens.RECIPES_DETAILS
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Recipes";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "recipedetails_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Recipe Details screen";
            }
        };
        d = recipesDetailsScreens;
        RecipesDetailsScreens recipesDetailsScreens2 = new RecipesDetailsScreens() { // from class: au.com.woolworths.feature.shop.recipes.details.analytics.RecipesDetailsScreens.SAVED_RECIPES_LOGIN
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Recipes";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "savedrecipeslogin_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Login";
            }
        };
        e = recipesDetailsScreens2;
        RecipesDetailsScreens[] recipesDetailsScreensArr = {recipesDetailsScreens, recipesDetailsScreens2};
        f = recipesDetailsScreensArr;
        g = EnumEntriesKt.a(recipesDetailsScreensArr);
    }

    public static RecipesDetailsScreens valueOf(String str) {
        return (RecipesDetailsScreens) Enum.valueOf(RecipesDetailsScreens.class, str);
    }

    public static RecipesDetailsScreens[] values() {
        return (RecipesDetailsScreens[]) f.clone();
    }
}
