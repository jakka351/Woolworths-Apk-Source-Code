package au.com.woolworths.feature.product.list.data;

import com.woolworths.product.list.ProductsBySearchQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/feature/product/list/data/SortOption;", "Lcom/woolworths/product/list/ProductsBySearchQuery$SortOption;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductsBySearchQuerySortOptionExtKt {
    @NotNull
    public static final SortOption toUiModel(@NotNull ProductsBySearchQuery.SortOption sortOption) {
        Intrinsics.h(sortOption, "<this>");
        return new SortOption(sortOption.getKey(), sortOption.getTitle(), sortOption.getSubtitle(), sortOption.isApplied());
    }
}
