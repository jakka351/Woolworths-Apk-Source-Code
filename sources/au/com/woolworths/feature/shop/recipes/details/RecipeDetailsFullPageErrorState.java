package au.com.woolworths.feature.shop.recipes.details;

import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/details/RecipeDetailsFullPageErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class RecipeDetailsFullPageErrorState implements FullPageErrorCause {
    public static final RecipeDetailsFullPageErrorState d;
    public static final RecipeDetailsFullPageErrorState e;
    public static final RecipeDetailsFullPageErrorState f;
    public static final /* synthetic */ RecipeDetailsFullPageErrorState[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        RecipeDetailsFullPageErrorState recipeDetailsFullPageErrorState = new RecipeDetailsFullPageErrorState() { // from class: au.com.woolworths.feature.shop.recipes.details.RecipeDetailsFullPageErrorState.NO_NETWORK
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return com.woolworths.R.drawable.empty_connection_error_old;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(com.woolworths.R.string.recipe_detail_connection_error);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return com.woolworths.R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(com.woolworths.R.string.no_network_heading);
            }
        };
        d = recipeDetailsFullPageErrorState;
        RecipeDetailsFullPageErrorState recipeDetailsFullPageErrorState2 = new RecipeDetailsFullPageErrorState() { // from class: au.com.woolworths.feature.shop.recipes.details.RecipeDetailsFullPageErrorState.SERVER_ERROR
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return com.woolworths.R.drawable.empty_server_error_old;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(com.woolworths.R.string.recipe_detail_unable_to_load_results);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return com.woolworths.R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(com.woolworths.R.string.server_error_heading);
            }
        };
        e = recipeDetailsFullPageErrorState2;
        RecipeDetailsFullPageErrorState recipeDetailsFullPageErrorState3 = new RecipeDetailsFullPageErrorState() { // from class: au.com.woolworths.feature.shop.recipes.details.RecipeDetailsFullPageErrorState.GUEST
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return com.woolworths.R.drawable.no_saved_recipes;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(com.woolworths.R.string.save_recipe_login_message);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getPrimaryActionRes() {
                return com.woolworths.R.string.save_recipe_login;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(com.woolworths.R.string.save_recipe_login_title);
            }
        };
        f = recipeDetailsFullPageErrorState3;
        RecipeDetailsFullPageErrorState[] recipeDetailsFullPageErrorStateArr = {recipeDetailsFullPageErrorState, recipeDetailsFullPageErrorState2, recipeDetailsFullPageErrorState3};
        g = recipeDetailsFullPageErrorStateArr;
        h = EnumEntriesKt.a(recipeDetailsFullPageErrorStateArr);
    }

    public static RecipeDetailsFullPageErrorState valueOf(String str) {
        return (RecipeDetailsFullPageErrorState) Enum.valueOf(RecipeDetailsFullPageErrorState.class, str);
    }

    public static RecipeDetailsFullPageErrorState[] values() {
        return (RecipeDetailsFullPageErrorState[]) g.clone();
    }
}
