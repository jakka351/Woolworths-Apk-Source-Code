package au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes;

import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/recipes/homepage/savedrecipes/SavedRecipesFullPageErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class SavedRecipesFullPageErrorState implements FullPageErrorCause {
    public static final SavedRecipesFullPageErrorState d;
    public static final SavedRecipesFullPageErrorState e;
    public static final SavedRecipesFullPageErrorState f;
    public static final SavedRecipesFullPageErrorState g;
    public static final SavedRecipesFullPageErrorState h;
    public static final /* synthetic */ SavedRecipesFullPageErrorState[] i;
    public static final /* synthetic */ EnumEntries j;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/shop/recipes/recipes/homepage/savedrecipes/SavedRecipesFullPageErrorState.NO_RECIPES", "Lau/com/woolworths/feature/shop/recipes/recipes/homepage/savedrecipes/SavedRecipesFullPageErrorState;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NO_RECIPES extends SavedRecipesFullPageErrorState {
        public NO_RECIPES() {
            super("NO_RECIPES", 2);
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final int getDrawableRes() {
            return R.drawable.ic_no_catalogue;
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final Text getMessage() {
            return new ResText(R.string.recipe_list_no_results);
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final int getSecondaryActionRes() {
            return R.string.try_again_button_text;
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final Text getTitle() {
            return new ResText(R.string.no_results_error_heading);
        }
    }

    static {
        SavedRecipesFullPageErrorState savedRecipesFullPageErrorState = new SavedRecipesFullPageErrorState() { // from class: au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesFullPageErrorState.NO_NETWORK
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.empty_connection_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.recipe_list_connection_error);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.no_network_heading);
            }
        };
        d = savedRecipesFullPageErrorState;
        SavedRecipesFullPageErrorState savedRecipesFullPageErrorState2 = new SavedRecipesFullPageErrorState() { // from class: au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesFullPageErrorState.SERVER_ERROR
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.empty_server_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.recipe_list_server_error);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.server_error_heading);
            }
        };
        e = savedRecipesFullPageErrorState2;
        NO_RECIPES no_recipes = new NO_RECIPES();
        f = no_recipes;
        SavedRecipesFullPageErrorState savedRecipesFullPageErrorState3 = new SavedRecipesFullPageErrorState() { // from class: au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesFullPageErrorState.NO_SAVED_RECIPES
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.no_saved_recipes;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.no_saved_recipes_error_message);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.no_saved_recipes_error_heading);
            }
        };
        g = savedRecipesFullPageErrorState3;
        SavedRecipesFullPageErrorState savedRecipesFullPageErrorState4 = new SavedRecipesFullPageErrorState() { // from class: au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesFullPageErrorState.GUEST
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.no_saved_recipes;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.save_recipe_login_message);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getPrimaryActionRes() {
                return R.string.save_recipe_login;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.save_recipe_login_title);
            }
        };
        h = savedRecipesFullPageErrorState4;
        SavedRecipesFullPageErrorState[] savedRecipesFullPageErrorStateArr = {savedRecipesFullPageErrorState, savedRecipesFullPageErrorState2, no_recipes, savedRecipesFullPageErrorState3, savedRecipesFullPageErrorState4};
        i = savedRecipesFullPageErrorStateArr;
        j = EnumEntriesKt.a(savedRecipesFullPageErrorStateArr);
    }

    public static SavedRecipesFullPageErrorState valueOf(String str) {
        return (SavedRecipesFullPageErrorState) Enum.valueOf(SavedRecipesFullPageErrorState.class, str);
    }

    public static SavedRecipesFullPageErrorState[] values() {
        return (SavedRecipesFullPageErrorState[]) i.clone();
    }
}
