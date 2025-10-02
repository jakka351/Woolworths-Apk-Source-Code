package au.com.woolworths.product.details.models;

import au.com.woolworths.product.models.ProductCard;
import com.woolworths.product.details.ProductDetailsQuery;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/product/details/models/CppProductsHorizontalList;", "Lcom/woolworths/product/details/ProductDetailsQuery$OnProductHorizontalList;", "shop-product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductDetailsQueryOnProductHorizontalListExtKt {
    @NotNull
    public static final CppProductsHorizontalList toUiModel(@NotNull ProductDetailsQuery.OnProductHorizontalList onProductHorizontalList) {
        Intrinsics.h(onProductHorizontalList, "<this>");
        String title = onProductHorizontalList.getTitle();
        String subtitle = onProductHorizontalList.getSubtitle();
        String actionTitle = onProductHorizontalList.getActionTitle();
        String deepLink = onProductHorizontalList.getDeepLink();
        List<ProductDetailsQuery.Item1> items = onProductHorizontalList.getItems();
        ArrayList arrayList = new ArrayList();
        for (ProductDetailsQuery.Item1 item1 : items) {
            ProductCard uiModel = item1.getOnProductCard() != null ? ProductDetailsQueryOnProductCard1ExtKt.toUiModel(item1.getOnProductCard()) : null;
            if (uiModel != null) {
                arrayList.add(uiModel);
            }
        }
        return new CppProductsHorizontalList(title, subtitle, actionTitle, deepLink, arrayList);
    }
}
