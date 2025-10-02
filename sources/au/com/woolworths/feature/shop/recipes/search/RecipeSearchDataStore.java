package au.com.woolworths.feature.shop.recipes.search;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/search/RecipeSearchDataStore;", "", "Keys", "recipes-search_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecipeSearchDataStore {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/search/RecipeSearchDataStore$Keys;", "", "recipes-search_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Keys {

        /* renamed from: a, reason: collision with root package name */
        public static final Preferences.Key f8085a = PreferencesKeys.c("recipe_recent_searches");
    }
}
