package au.com.woolworths.feature.shop.recipes.recipes.list;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.feature.shop.recipes.recipes.analytics.RecipesScreens;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/recipes/list/RecipeListActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class RecipeListActions implements Action {
    public static final RecipeListActions e;
    public static final RecipeListActions f;
    public static final RecipeListActions g;
    public static final RecipeListActions h;
    public static final RecipeListActions i;
    public static final /* synthetic */ RecipeListActions[] j;
    public static final /* synthetic */ EnumEntries k;
    public final Screen d = RecipesScreens.e;

    static {
        RecipeListActions recipeListActions = new RecipeListActions() { // from class: au.com.woolworths.feature.shop.recipes.recipes.list.RecipeListActions.ActionableCardClick
            public final Category l = Category.g;
            public final String m = "Actionable Card";

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
        e = recipeListActions;
        RecipeListActions recipeListActions2 = new RecipeListActions() { // from class: au.com.woolworths.feature.shop.recipes.recipes.list.RecipeListActions.ActionableCardImpression
            public final Category l = Category.h;
            public final String m = "Actionable Card";

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
        f = recipeListActions2;
        RecipeListActions recipeListActions3 = new RecipeListActions() { // from class: au.com.woolworths.feature.shop.recipes.recipes.list.RecipeListActions.GoogleAdBannerClick
            public final Category l = Category.y;
            public final String m = "Promotion";

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
        g = recipeListActions3;
        RecipeListActions recipeListActions4 = new RecipeListActions() { // from class: au.com.woolworths.feature.shop.recipes.recipes.list.RecipeListActions.GoogleAdBannerImpression
            public final Category l = Category.z;
            public final String m = "Promotion";

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
        h = recipeListActions4;
        RecipeListActions recipeListActions5 = new RecipeListActions() { // from class: au.com.woolworths.feature.shop.recipes.recipes.list.RecipeListActions.SERVER_ERROR
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
        i = recipeListActions5;
        RecipeListActions[] recipeListActionsArr = {recipeListActions, recipeListActions2, recipeListActions3, recipeListActions4, recipeListActions5};
        j = recipeListActionsArr;
        k = EnumEntriesKt.a(recipeListActionsArr);
    }

    public RecipeListActions(String str, int i2) {
    }

    public static RecipeListActions valueOf(String str) {
        return (RecipeListActions) Enum.valueOf(RecipeListActions.class, str);
    }

    public static RecipeListActions[] values() {
        return (RecipeListActions[]) j.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public final Screen getD() {
        return this.d;
    }
}
