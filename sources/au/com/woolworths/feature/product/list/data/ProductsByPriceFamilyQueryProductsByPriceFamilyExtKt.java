package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.product.models.ProductCard;
import com.woolworths.product.list.ProductsByPriceFamilyQuery;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/feature/product/list/data/ProductListByPriceFamilyApiData;", "Lcom/woolworths/product/list/ProductsByPriceFamilyQuery$ProductsByPriceFamily;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductsByPriceFamilyQueryProductsByPriceFamilyExtKt {
    @NotNull
    public static final ProductListByPriceFamilyApiData toUiModel(@NotNull ProductsByPriceFamilyQuery.ProductsByPriceFamily productsByPriceFamily) {
        Intrinsics.h(productsByPriceFamily, "<this>");
        Integer totalNumberOfProducts = productsByPriceFamily.getTotalNumberOfProducts();
        List<ProductsByPriceFamilyQuery.ProductsFeed> productsFeed = productsByPriceFamily.getProductsFeed();
        ArrayList arrayList = new ArrayList();
        for (ProductsByPriceFamilyQuery.ProductsFeed productsFeed2 : productsFeed) {
            ProductCard uiModel = productsFeed2.getOnProductCard() != null ? ProductsByPriceFamilyQueryOnProductCardExtKt.toUiModel(productsFeed2.getOnProductCard()) : null;
            if (uiModel != null) {
                arrayList.add(uiModel);
            }
        }
        return new ProductListByPriceFamilyApiData(totalNumberOfProducts, arrayList);
    }
}
