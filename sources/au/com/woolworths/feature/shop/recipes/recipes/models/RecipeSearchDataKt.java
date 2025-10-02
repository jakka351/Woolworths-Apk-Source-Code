package au.com.woolworths.feature.shop.recipes.recipes.models;

import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard;
import au.com.woolworths.foundation.advertising.data.google.model.UniversalInventoryContainerData;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0004"}, d2 = {"containsGoogleAds", "", "Lau/com/woolworths/feature/shop/recipes/recipes/models/RecipeSearchData;", "containsUniversalInventoryContainer", "recipes_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RecipeSearchDataKt {
    public static final boolean containsGoogleAds(@NotNull RecipeSearchData recipeSearchData) {
        Intrinsics.h(recipeSearchData, "<this>");
        List<Object> items = recipeSearchData.getItems();
        if ((items instanceof Collection) && items.isEmpty()) {
            return false;
        }
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            if (it.next() instanceof GoogleAdBannerCard) {
                return true;
            }
        }
        return false;
    }

    public static final boolean containsUniversalInventoryContainer(@NotNull RecipeSearchData recipeSearchData) {
        Intrinsics.h(recipeSearchData, "<this>");
        List<Object> items = recipeSearchData.getItems();
        if ((items instanceof Collection) && items.isEmpty()) {
            return false;
        }
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            if (it.next() instanceof UniversalInventoryContainerData) {
                return true;
            }
        }
        return false;
    }
}
