package au.com.woolworths.feature.shop.recipes.details.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/details/analytics/RecipeDetailsActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "Companion", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class RecipeDetailsActions implements Action {
    public static final RecipeDetailsActions e;
    public static final RecipeDetailsActions f;
    public static final RecipeDetailsActions g;
    public static final RecipeDetailsActions h;
    public static final RecipeDetailsActions i;
    public static final RecipeDetailsActions j;
    public static final RecipeDetailsActions k;
    public static final RecipeDetailsActions l;
    public static final RecipeDetailsActions m;
    public static final RecipeDetailsActions n;
    public static final RecipeDetailsActions o;
    public static final RecipeDetailsActions p;
    public static final RecipeDetailsActions q;
    public static final RecipeDetailsActions r;
    public static final RecipeDetailsActions s;
    public static final RecipeDetailsActions t;
    public static final /* synthetic */ RecipeDetailsActions[] u;
    public static final /* synthetic */ EnumEntries v;
    public final Screen d = RecipesDetailsScreens.d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/details/analytics/RecipeDetailsActions$Companion;", "", "", "SERVES_DESCRIPTION", "Ljava/lang/String;", "NO_SERVES_DESCRIPTION", "ERROR_REASON_SERVER_ERROR", "ERROR_REASON_NO_NETWORK", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        RecipeDetailsActions recipeDetailsActions = new RecipeDetailsActions() { // from class: au.com.woolworths.feature.shop.recipes.details.analytics.RecipeDetailsActions.ADD_TO_LIST_OR_SHOP_CLICK
            public final Category w = Category.m;
            public final String x = "Add to List or Shop";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getX() {
                return this.x;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getW() {
                return this.w;
            }
        };
        e = recipeDetailsActions;
        RecipeDetailsActions recipeDetailsActions2 = new RecipeDetailsActions() { // from class: au.com.woolworths.feature.shop.recipes.details.analytics.RecipeDetailsActions.ActionableCardClick
            public final Category w = Category.g;
            public final String x = "Actionable Card";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getX() {
                return this.x;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getW() {
                return this.w;
            }
        };
        f = recipeDetailsActions2;
        RecipeDetailsActions recipeDetailsActions3 = new RecipeDetailsActions() { // from class: au.com.woolworths.feature.shop.recipes.details.analytics.RecipeDetailsActions.ActionableCardImpression
            public final Category w = Category.h;
            public final String x = "Actionable Card";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getX() {
                return this.x;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getW() {
                return this.w;
            }
        };
        g = recipeDetailsActions3;
        RecipeDetailsActions recipeDetailsActions4 = new RecipeDetailsActions() { // from class: au.com.woolworths.feature.shop.recipes.details.analytics.RecipeDetailsActions.GoogleAdBannerClick
            public final Category w = Category.y;
            public final String x = "Promotion";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getX() {
                return this.x;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getW() {
                return this.w;
            }
        };
        h = recipeDetailsActions4;
        RecipeDetailsActions recipeDetailsActions5 = new RecipeDetailsActions() { // from class: au.com.woolworths.feature.shop.recipes.details.analytics.RecipeDetailsActions.GoogleAdBannerImpression
            public final Category w = Category.z;
            public final String x = "Promotion";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getX() {
                return this.x;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getW() {
                return this.w;
            }
        };
        i = recipeDetailsActions5;
        RecipeDetailsActions recipeDetailsActions6 = new RecipeDetailsActions() { // from class: au.com.woolworths.feature.shop.recipes.details.analytics.RecipeDetailsActions.RECIPE_CLICK
            public final Category w = Category.m;
            public final String x = "Tap Recipe on Recipes screen";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getX() {
                return this.x;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getW() {
                return this.w;
            }
        };
        j = recipeDetailsActions6;
        RecipeDetailsActions recipeDetailsActions7 = new RecipeDetailsActions() { // from class: au.com.woolworths.feature.shop.recipes.details.analytics.RecipeDetailsActions.SEE_ALL_CLICK
            public final Category w = Category.m;
            public final String x = "See All";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getX() {
                return this.x;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getW() {
                return this.w;
            }
        };
        k = recipeDetailsActions7;
        RecipeDetailsActions recipeDetailsActions8 = new RecipeDetailsActions() { // from class: au.com.woolworths.feature.shop.recipes.details.analytics.RecipeDetailsActions.SHARE
            public final Category w = Category.m;
            public final String x = "SHARE";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getX() {
                return this.x;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getW() {
                return this.w;
            }
        };
        l = recipeDetailsActions8;
        RecipeDetailsActions recipeDetailsActions9 = new RecipeDetailsActions() { // from class: au.com.woolworths.feature.shop.recipes.details.analytics.RecipeDetailsActions.METHOD_LINK
            public final Category w = Category.m;
            public final String x = "Method";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getX() {
                return this.x;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getW() {
                return this.w;
            }
        };
        RecipeDetailsActions recipeDetailsActions10 = new RecipeDetailsActions() { // from class: au.com.woolworths.feature.shop.recipes.details.analytics.RecipeDetailsActions.INGREDIENTS_LINK
            public final Category w = Category.m;
            public final String x = "Ingredients";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getX() {
                return this.x;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getW() {
                return this.w;
            }
        };
        RecipeDetailsActions recipeDetailsActions11 = new RecipeDetailsActions() { // from class: au.com.woolworths.feature.shop.recipes.details.analytics.RecipeDetailsActions.INGREDIENTS_SERVE_DATA_LOADED_IMPRESSION
            public final Category w = Category.B;
            public final String x = "Ingredients Serve Data Loaded";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getX() {
                return this.x;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getW() {
                return this.w;
            }
        };
        m = recipeDetailsActions11;
        RecipeDetailsActions recipeDetailsActions12 = new RecipeDetailsActions() { // from class: au.com.woolworths.feature.shop.recipes.details.analytics.RecipeDetailsActions.NETWORK_ERROR
            public final Category w = Category.v;
            public final String x = "Network Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getX() {
                return this.x;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getW() {
                return this.w;
            }
        };
        n = recipeDetailsActions12;
        RecipeDetailsActions recipeDetailsActions13 = new RecipeDetailsActions() { // from class: au.com.woolworths.feature.shop.recipes.details.analytics.RecipeDetailsActions.RECIPE_DETAILS_LOADED_IMPRESSION
            public final Category w = Category.B;
            public final String x = "Recipe Details Data Loaded";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getX() {
                return this.x;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getW() {
                return this.w;
            }
        };
        o = recipeDetailsActions13;
        RecipeDetailsActions recipeDetailsActions14 = new RecipeDetailsActions() { // from class: au.com.woolworths.feature.shop.recipes.details.analytics.RecipeDetailsActions.SERVER_ERROR
            public final Category w = Category.v;
            public final String x = "Server Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getX() {
                return this.x;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getW() {
                return this.w;
            }
        };
        p = recipeDetailsActions14;
        RecipeDetailsActions recipeDetailsActions15 = new RecipeDetailsActions() { // from class: au.com.woolworths.feature.shop.recipes.details.analytics.RecipeDetailsActions.SAVE_RECIPE
            public final Category w = Category.m;
            public final String x = "Save";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getX() {
                return this.x;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getW() {
                return this.w;
            }
        };
        q = recipeDetailsActions15;
        RecipeDetailsActions recipeDetailsActions16 = new RecipeDetailsActions() { // from class: au.com.woolworths.feature.shop.recipes.details.analytics.RecipeDetailsActions.SERVE_TOGGLE_DECREASE_QUANTITY
            public final Category w = Category.m;
            public final String x = "Decrease Quantity";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getX() {
                return this.x;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getW() {
                return this.w;
            }
        };
        r = recipeDetailsActions16;
        RecipeDetailsActions recipeDetailsActions17 = new RecipeDetailsActions() { // from class: au.com.woolworths.feature.shop.recipes.details.analytics.RecipeDetailsActions.SERVE_TOGGLE_INCREASE_QUANTITY
            public final Category w = Category.m;
            public final String x = "Increase Quantity";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getX() {
                return this.x;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getW() {
                return this.w;
            }
        };
        s = recipeDetailsActions17;
        RecipeDetailsActions recipeDetailsActions18 = new RecipeDetailsActions() { // from class: au.com.woolworths.feature.shop.recipes.details.analytics.RecipeDetailsActions.UNSAVE_RECIPE
            public final Category w = Category.m;
            public final String x = "Unsave";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getX() {
                return this.x;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getW() {
                return this.w;
            }
        };
        t = recipeDetailsActions18;
        RecipeDetailsActions[] recipeDetailsActionsArr = {recipeDetailsActions, recipeDetailsActions2, recipeDetailsActions3, recipeDetailsActions4, recipeDetailsActions5, recipeDetailsActions6, recipeDetailsActions7, recipeDetailsActions8, recipeDetailsActions9, recipeDetailsActions10, recipeDetailsActions11, recipeDetailsActions12, recipeDetailsActions13, recipeDetailsActions14, recipeDetailsActions15, recipeDetailsActions16, recipeDetailsActions17, recipeDetailsActions18};
        u = recipeDetailsActionsArr;
        v = EnumEntriesKt.a(recipeDetailsActionsArr);
    }

    public RecipeDetailsActions(String str, int i2) {
    }

    public static RecipeDetailsActions valueOf(String str) {
        return (RecipeDetailsActions) Enum.valueOf(RecipeDetailsActions.class, str);
    }

    public static RecipeDetailsActions[] values() {
        return (RecipeDetailsActions[]) u.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public final Screen getD() {
        return this.d;
    }
}
