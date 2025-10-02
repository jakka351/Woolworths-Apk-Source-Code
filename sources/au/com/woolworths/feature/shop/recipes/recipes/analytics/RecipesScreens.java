package au.com.woolworths.feature.shop.recipes.recipes.analytics;

import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/recipes/analytics/RecipesScreens;", "Lau/com/woolworths/android/onesite/analytics/Screen;", "", "Companion", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class RecipesScreens implements Screen {
    public static final RecipesScreens d;
    public static final RecipesScreens e;
    public static final RecipesScreens f;
    public static final RecipesScreens g;
    public static final /* synthetic */ RecipesScreens[] h;
    public static final /* synthetic */ EnumEntries i;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/recipes/analytics/RecipesScreens$Companion;", "", "", "SAVED_RECIPES_ANALYTICS_TITLE", "Ljava/lang/String;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        RecipesScreens recipesScreens = new RecipesScreens() { // from class: au.com.woolworths.feature.shop.recipes.recipes.analytics.RecipesScreens.HOME_RECIPES
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Recipes";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "recipes_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Recipes Home screen";
            }
        };
        d = recipesScreens;
        RecipesScreens recipesScreens2 = new RecipesScreens() { // from class: au.com.woolworths.feature.shop.recipes.recipes.analytics.RecipesScreens.RECIPES_LIST
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Recipes";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "recipelist_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Recipe List screen";
            }
        };
        e = recipesScreens2;
        RecipesScreens recipesScreens3 = new RecipesScreens() { // from class: au.com.woolworths.feature.shop.recipes.recipes.analytics.RecipesScreens.SAVED_RECIPES
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Recipes";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "savedrecipes_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Saved Recipe List screen";
            }
        };
        f = recipesScreens3;
        RecipesScreens recipesScreens4 = new RecipesScreens() { // from class: au.com.woolworths.feature.shop.recipes.recipes.analytics.RecipesScreens.SAVED_RECIPES_LOGIN
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
        g = recipesScreens4;
        RecipesScreens[] recipesScreensArr = {recipesScreens, recipesScreens2, recipesScreens3, recipesScreens4};
        h = recipesScreensArr;
        i = EnumEntriesKt.a(recipesScreensArr);
    }

    public static RecipesScreens valueOf(String str) {
        return (RecipesScreens) Enum.valueOf(RecipesScreens.class, str);
    }

    public static RecipesScreens[] values() {
        return (RecipesScreens[]) h.clone();
    }
}
