package au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.feature.shop.recipes.recipes.analytics.RecipesScreens;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/recipes/homepage/savedrecipes/SavedRecipesActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class SavedRecipesActions implements Action {
    public static final SavedRecipesActions e;
    public static final SavedRecipesActions f;
    public static final SavedRecipesActions g;
    public static final SavedRecipesActions h;
    public static final SavedRecipesActions i;
    public static final /* synthetic */ SavedRecipesActions[] j;
    public static final /* synthetic */ EnumEntries k;
    public final Screen d = RecipesScreens.f;

    static {
        SavedRecipesActions savedRecipesActions = new SavedRecipesActions() { // from class: au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesActions.LOGIN_CLICK
            public final Category l = Category.m;
            public final String m = "Login / Sign up";
            public final Screen n = RecipesScreens.g;

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getM() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getL() {
                return this.l;
            }

            @Override // au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesActions, au.com.woolworths.android.onesite.analytics.Action
            /* renamed from: f, reason: from getter */
            public final Screen getD() {
                return this.n;
            }
        };
        e = savedRecipesActions;
        SavedRecipesActions savedRecipesActions2 = new SavedRecipesActions() { // from class: au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesActions.SAVED_RECIPES_DATA_LOADED_IMPRESSION
            public final Category l = Category.B;
            public final String m = "Saved Recipes Data Loaded";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getM() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getL() {
                return this.l;
            }
        };
        f = savedRecipesActions2;
        SavedRecipesActions savedRecipesActions3 = new SavedRecipesActions() { // from class: au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesActions.SAVED_RECIPES_NO_RESULTS_ERROR
            public final Category l = Category.v;
            public final String m = " No Results Found";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getM() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getL() {
                return this.l;
            }
        };
        g = savedRecipesActions3;
        SavedRecipesActions savedRecipesActions4 = new SavedRecipesActions() { // from class: au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesActions.SAVED_RECIPES_SERVER_ERROR
            public final Category l = Category.v;
            public final String m = "Server Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getM() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getL() {
                return this.l;
            }
        };
        h = savedRecipesActions4;
        SavedRecipesActions savedRecipesActions5 = new SavedRecipesActions() { // from class: au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesActions.SAVED_RECIPES_NETWORK_ERROR
            public final Category l = Category.v;
            public final String m = "Network Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getM() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getL() {
                return this.l;
            }
        };
        i = savedRecipesActions5;
        SavedRecipesActions[] savedRecipesActionsArr = {savedRecipesActions, savedRecipesActions2, savedRecipesActions3, savedRecipesActions4, savedRecipesActions5};
        j = savedRecipesActionsArr;
        k = EnumEntriesKt.a(savedRecipesActionsArr);
    }

    public SavedRecipesActions(String str, int i2) {
    }

    public static SavedRecipesActions valueOf(String str) {
        return (SavedRecipesActions) Enum.valueOf(SavedRecipesActions.class, str);
    }

    public static SavedRecipesActions[] values() {
        return (SavedRecipesActions[]) j.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public Screen getD() {
        return this.d;
    }
}
