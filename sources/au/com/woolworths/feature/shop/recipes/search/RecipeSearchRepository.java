package au.com.woolworths.feature.shop.recipes.search;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.datastore.core.DataStore;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/search/RecipeSearchRepository;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "recipes-search_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RecipeSearchRepository {

    /* renamed from: a, reason: collision with root package name */
    public final DataStore f8088a;
    public final RecipeSearchRepository$special$$inlined$map$1 b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/search/RecipeSearchRepository$Companion;", "", "", "RECENT_SEARCH_SEPARATOR", "Ljava/lang/String;", "", "MAX_RECENT_SEARCH_LIMIT", "I", "recipes-search_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Inject
    public RecipeSearchRepository(@NotNull Context context) {
        Intrinsics.h(context, "context");
        DataStore dataStore = (DataStore) RecipeSearchDataStoreKt.b.getValue(context, RecipeSearchDataStoreKt.f8086a[0]);
        this.f8088a = dataStore;
        this.b = new RecipeSearchRepository$special$$inlined$map$1(dataStore.getData(), this);
    }

    public static final ArrayList a(RecipeSearchRepository recipeSearchRepository, String str) {
        return str != null ? CollectionsKt.J0(StringsKt.T(str, new String[]{"\t"}, 6)) : new ArrayList();
    }
}
