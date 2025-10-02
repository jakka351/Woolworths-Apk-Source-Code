package au.com.woolworths.feature.product.list.data;

import com.woolworths.product.list.ProductListQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/feature/product/list/data/ZeroResultProductCategories;", "Lcom/woolworths/product/list/ProductListQuery$OnZeroResultProductCategories1;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductListQueryOnZeroResultProductCategories1ExtKt {
    @NotNull
    public static final ZeroResultProductCategories toUiModel(@NotNull ProductListQuery.OnZeroResultProductCategories1 onZeroResultProductCategories1) {
        Intrinsics.h(onZeroResultProductCategories1, "<this>");
        String zeroResultProductCategoriesTitle = onZeroResultProductCategories1.getZeroResultProductCategoriesTitle();
        List<ProductListQuery.ZeroResultProductCategoriesItem1> zeroResultProductCategoriesItems = onZeroResultProductCategories1.getZeroResultProductCategoriesItems();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(zeroResultProductCategoriesItems, 10));
        Iterator<T> it = zeroResultProductCategoriesItems.iterator();
        while (it.hasNext()) {
            arrayList.add(ProductListQueryZeroResultProductCategoriesItem1ExtKt.toUiModel((ProductListQuery.ZeroResultProductCategoriesItem1) it.next()));
        }
        return new ZeroResultProductCategories(zeroResultProductCategoriesTitle, arrayList);
    }
}
