package au.com.woolworths.product.details.models;

import au.com.woolworths.base.shopapp.data.models.InfoSection;
import com.woolworths.product.details.ProductDetailsQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/base/shopapp/data/models/InfoSection;", "Lcom/woolworths/product/details/ProductDetailsQuery$Info;", "shop-product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductDetailsQueryInfoExtKt {
    @NotNull
    public static final InfoSection toUiModel(@NotNull ProductDetailsQuery.Info info) {
        Intrinsics.h(info, "<this>");
        String title = info.getTitle();
        List<ProductDetailsQuery.Item> items = info.getItems();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(ProductDetailsQueryItemExtKt.toUiModel((ProductDetailsQuery.Item) it.next()));
        }
        ProductDetailsQuery.Footer footer = info.getFooter();
        return new InfoSection(title, arrayList, footer != null ? ProductDetailsQueryFooterExtKt.toUiModel(footer) : null);
    }
}
