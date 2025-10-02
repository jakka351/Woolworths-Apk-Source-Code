package au.com.woolworths.feature.shop.recipes.recipes.models;

import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/recipes/models/RecipeListFullPageErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "", "<init>", "(Ljava/lang/String;I)V", "NO_NETWORK", "SERVER_ERROR", "NO_RECIPES", "NO_SEARCH_RESULT", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class RecipeListFullPageErrorState implements FullPageErrorCause {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RecipeListFullPageErrorState[] $VALUES;
    public static final RecipeListFullPageErrorState NO_NETWORK = new RecipeListFullPageErrorState("NO_NETWORK", 0) { // from class: au.com.woolworths.feature.shop.recipes.recipes.models.RecipeListFullPageErrorState.NO_NETWORK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // au.com.woolworths.feature.shop.recipes.recipes.models.RecipeListFullPageErrorState, au.com.woolworths.android.onesite.common.FullPageErrorCause
        public int getDrawableRes() {
            return R.drawable.empty_connection_error_old;
        }

        @Override // au.com.woolworths.feature.shop.recipes.recipes.models.RecipeListFullPageErrorState, au.com.woolworths.android.onesite.common.FullPageErrorCause
        @ColorRes
        public /* bridge */ /* synthetic */ int getImageTintRes() {
            return 0;
        }

        @Override // au.com.woolworths.feature.shop.recipes.recipes.models.RecipeListFullPageErrorState, au.com.woolworths.android.onesite.common.FullPageErrorCause
        @NotNull
        /* renamed from: getMessage */
        public Text getD() {
            return new ResText(R.string.recipe_list_connection_error);
        }

        @Override // au.com.woolworths.feature.shop.recipes.recipes.models.RecipeListFullPageErrorState, au.com.woolworths.android.onesite.common.FullPageErrorCause
        @StringRes
        public /* bridge */ /* synthetic */ int getPrimaryActionRes() {
            return 0;
        }

        @Override // au.com.woolworths.feature.shop.recipes.recipes.models.RecipeListFullPageErrorState, au.com.woolworths.android.onesite.common.FullPageErrorCause
        @DrawableRes
        public /* bridge */ /* synthetic */ int getSecondaryActionIconRes() {
            return 0;
        }

        @Override // au.com.woolworths.feature.shop.recipes.recipes.models.RecipeListFullPageErrorState, au.com.woolworths.android.onesite.common.FullPageErrorCause
        public int getSecondaryActionRes() {
            return R.string.try_again_button_text;
        }

        @Override // au.com.woolworths.feature.shop.recipes.recipes.models.RecipeListFullPageErrorState, au.com.woolworths.android.onesite.common.FullPageErrorCause
        public /* bridge */ /* synthetic */ boolean getShouldUsePrimaryForImageTint() {
            return false;
        }

        @Override // au.com.woolworths.feature.shop.recipes.recipes.models.RecipeListFullPageErrorState, au.com.woolworths.android.onesite.common.FullPageErrorCause
        @NotNull
        public Text getTitle() {
            return new ResText(R.string.no_network_heading);
        }
    };
    public static final RecipeListFullPageErrorState SERVER_ERROR = new RecipeListFullPageErrorState("SERVER_ERROR", 1) { // from class: au.com.woolworths.feature.shop.recipes.recipes.models.RecipeListFullPageErrorState.SERVER_ERROR
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // au.com.woolworths.feature.shop.recipes.recipes.models.RecipeListFullPageErrorState, au.com.woolworths.android.onesite.common.FullPageErrorCause
        public int getDrawableRes() {
            return R.drawable.empty_server_error_old;
        }

        @Override // au.com.woolworths.feature.shop.recipes.recipes.models.RecipeListFullPageErrorState, au.com.woolworths.android.onesite.common.FullPageErrorCause
        @ColorRes
        public /* bridge */ /* synthetic */ int getImageTintRes() {
            return 0;
        }

        @Override // au.com.woolworths.feature.shop.recipes.recipes.models.RecipeListFullPageErrorState, au.com.woolworths.android.onesite.common.FullPageErrorCause
        @NotNull
        /* renamed from: getMessage */
        public Text getD() {
            return new ResText(R.string.recipe_list_server_error);
        }

        @Override // au.com.woolworths.feature.shop.recipes.recipes.models.RecipeListFullPageErrorState, au.com.woolworths.android.onesite.common.FullPageErrorCause
        @StringRes
        public /* bridge */ /* synthetic */ int getPrimaryActionRes() {
            return 0;
        }

        @Override // au.com.woolworths.feature.shop.recipes.recipes.models.RecipeListFullPageErrorState, au.com.woolworths.android.onesite.common.FullPageErrorCause
        @DrawableRes
        public /* bridge */ /* synthetic */ int getSecondaryActionIconRes() {
            return 0;
        }

        @Override // au.com.woolworths.feature.shop.recipes.recipes.models.RecipeListFullPageErrorState, au.com.woolworths.android.onesite.common.FullPageErrorCause
        public int getSecondaryActionRes() {
            return R.string.try_again_button_text;
        }

        @Override // au.com.woolworths.feature.shop.recipes.recipes.models.RecipeListFullPageErrorState, au.com.woolworths.android.onesite.common.FullPageErrorCause
        public /* bridge */ /* synthetic */ boolean getShouldUsePrimaryForImageTint() {
            return false;
        }

        @Override // au.com.woolworths.feature.shop.recipes.recipes.models.RecipeListFullPageErrorState, au.com.woolworths.android.onesite.common.FullPageErrorCause
        @NotNull
        public Text getTitle() {
            return new ResText(R.string.server_error_heading);
        }
    };
    public static final RecipeListFullPageErrorState NO_RECIPES = new RecipeListFullPageErrorState("NO_RECIPES", 2) { // from class: au.com.woolworths.feature.shop.recipes.recipes.models.RecipeListFullPageErrorState.NO_RECIPES
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // au.com.woolworths.feature.shop.recipes.recipes.models.RecipeListFullPageErrorState, au.com.woolworths.android.onesite.common.FullPageErrorCause
        public int getDrawableRes() {
            return R.drawable.ic_no_catalogue;
        }

        @Override // au.com.woolworths.feature.shop.recipes.recipes.models.RecipeListFullPageErrorState, au.com.woolworths.android.onesite.common.FullPageErrorCause
        @ColorRes
        public /* bridge */ /* synthetic */ int getImageTintRes() {
            return 0;
        }

        @Override // au.com.woolworths.feature.shop.recipes.recipes.models.RecipeListFullPageErrorState, au.com.woolworths.android.onesite.common.FullPageErrorCause
        @NotNull
        /* renamed from: getMessage */
        public Text getD() {
            return new ResText(R.string.recipe_list_no_results);
        }

        @Override // au.com.woolworths.feature.shop.recipes.recipes.models.RecipeListFullPageErrorState, au.com.woolworths.android.onesite.common.FullPageErrorCause
        @StringRes
        public /* bridge */ /* synthetic */ int getPrimaryActionRes() {
            return 0;
        }

        @Override // au.com.woolworths.feature.shop.recipes.recipes.models.RecipeListFullPageErrorState, au.com.woolworths.android.onesite.common.FullPageErrorCause
        @DrawableRes
        public /* bridge */ /* synthetic */ int getSecondaryActionIconRes() {
            return 0;
        }

        @Override // au.com.woolworths.feature.shop.recipes.recipes.models.RecipeListFullPageErrorState, au.com.woolworths.android.onesite.common.FullPageErrorCause
        public int getSecondaryActionRes() {
            return R.string.try_again_button_text;
        }

        @Override // au.com.woolworths.feature.shop.recipes.recipes.models.RecipeListFullPageErrorState, au.com.woolworths.android.onesite.common.FullPageErrorCause
        public /* bridge */ /* synthetic */ boolean getShouldUsePrimaryForImageTint() {
            return false;
        }

        @Override // au.com.woolworths.feature.shop.recipes.recipes.models.RecipeListFullPageErrorState, au.com.woolworths.android.onesite.common.FullPageErrorCause
        @NotNull
        public Text getTitle() {
            return new ResText(R.string.no_results_error_heading);
        }
    };
    public static final RecipeListFullPageErrorState NO_SEARCH_RESULT = new RecipeListFullPageErrorState("NO_SEARCH_RESULT", 3) { // from class: au.com.woolworths.feature.shop.recipes.recipes.models.RecipeListFullPageErrorState.NO_SEARCH_RESULT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // au.com.woolworths.feature.shop.recipes.recipes.models.RecipeListFullPageErrorState, au.com.woolworths.android.onesite.common.FullPageErrorCause
        public int getDrawableRes() {
            return R.drawable.ic_no_catalogue;
        }

        @Override // au.com.woolworths.feature.shop.recipes.recipes.models.RecipeListFullPageErrorState, au.com.woolworths.android.onesite.common.FullPageErrorCause
        @ColorRes
        public /* bridge */ /* synthetic */ int getImageTintRes() {
            return 0;
        }

        @Override // au.com.woolworths.feature.shop.recipes.recipes.models.RecipeListFullPageErrorState, au.com.woolworths.android.onesite.common.FullPageErrorCause
        @NotNull
        /* renamed from: getMessage */
        public Text getD() {
            return new ResText(R.string.recipe_search_no_results_message);
        }

        @Override // au.com.woolworths.feature.shop.recipes.recipes.models.RecipeListFullPageErrorState, au.com.woolworths.android.onesite.common.FullPageErrorCause
        @StringRes
        public /* bridge */ /* synthetic */ int getPrimaryActionRes() {
            return 0;
        }

        @Override // au.com.woolworths.feature.shop.recipes.recipes.models.RecipeListFullPageErrorState, au.com.woolworths.android.onesite.common.FullPageErrorCause
        @DrawableRes
        public /* bridge */ /* synthetic */ int getSecondaryActionIconRes() {
            return 0;
        }

        @Override // au.com.woolworths.feature.shop.recipes.recipes.models.RecipeListFullPageErrorState, au.com.woolworths.android.onesite.common.FullPageErrorCause
        @StringRes
        public /* bridge */ /* synthetic */ int getSecondaryActionRes() {
            return 0;
        }

        @Override // au.com.woolworths.feature.shop.recipes.recipes.models.RecipeListFullPageErrorState, au.com.woolworths.android.onesite.common.FullPageErrorCause
        public /* bridge */ /* synthetic */ boolean getShouldUsePrimaryForImageTint() {
            return false;
        }

        @Override // au.com.woolworths.feature.shop.recipes.recipes.models.RecipeListFullPageErrorState, au.com.woolworths.android.onesite.common.FullPageErrorCause
        @NotNull
        public Text getTitle() {
            return new ResText(R.string.recipe_search_no_results_title);
        }
    };

    private static final /* synthetic */ RecipeListFullPageErrorState[] $values() {
        return new RecipeListFullPageErrorState[]{NO_NETWORK, SERVER_ERROR, NO_RECIPES, NO_SEARCH_RESULT};
    }

    static {
        RecipeListFullPageErrorState[] recipeListFullPageErrorStateArr$values = $values();
        $VALUES = recipeListFullPageErrorStateArr$values;
        $ENTRIES = EnumEntriesKt.a(recipeListFullPageErrorStateArr$values);
    }

    public /* synthetic */ RecipeListFullPageErrorState(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    @NotNull
    public static EnumEntries<RecipeListFullPageErrorState> getEntries() {
        return $ENTRIES;
    }

    public static RecipeListFullPageErrorState valueOf(String str) {
        return (RecipeListFullPageErrorState) Enum.valueOf(RecipeListFullPageErrorState.class, str);
    }

    public static RecipeListFullPageErrorState[] values() {
        return (RecipeListFullPageErrorState[]) $VALUES.clone();
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    @DrawableRes
    public abstract /* synthetic */ int getDrawableRes();

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    @ColorRes
    public /* bridge */ /* synthetic */ int getImageTintRes() {
        return 0;
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    @NotNull
    /* renamed from: getMessage */
    public abstract /* synthetic */ Text getD();

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    @StringRes
    public /* bridge */ /* synthetic */ int getPrimaryActionRes() {
        return 0;
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    @DrawableRes
    public /* bridge */ /* synthetic */ int getSecondaryActionIconRes() {
        return 0;
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    @StringRes
    public /* bridge */ /* synthetic */ int getSecondaryActionRes() {
        return 0;
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public /* bridge */ /* synthetic */ boolean getShouldUsePrimaryForImageTint() {
        return false;
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    @Nullable
    public /* bridge */ /* synthetic */ Text getTitle() {
        return null;
    }

    private RecipeListFullPageErrorState(String str, int i) {
    }
}
