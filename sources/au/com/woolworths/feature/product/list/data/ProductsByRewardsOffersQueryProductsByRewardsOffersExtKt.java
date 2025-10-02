package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.product.models.ProductCard;
import com.woolworths.product.list.ProductsByRewardsOffersQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/feature/product/list/data/ProductListByRewardsOfferApiData;", "Lcom/woolworths/product/list/ProductsByRewardsOffersQuery$ProductsByRewardsOffers;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductsByRewardsOffersQueryProductsByRewardsOffersExtKt {
    @NotNull
    public static final ProductListByRewardsOfferApiData toUiModel(@NotNull ProductsByRewardsOffersQuery.ProductsByRewardsOffers productsByRewardsOffers) {
        Intrinsics.h(productsByRewardsOffers, "<this>");
        List<ProductsByRewardsOffersQuery.CustomMessage> customMessages = productsByRewardsOffers.getCustomMessages();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = customMessages.iterator();
        while (true) {
            CustomMessage uiModel = null;
            if (!it.hasNext()) {
                break;
            }
            ProductsByRewardsOffersQuery.CustomMessage customMessage = (ProductsByRewardsOffersQuery.CustomMessage) it.next();
            if (customMessage.getOnPopupMessage() != null) {
                uiModel = ProductsByRewardsOffersQueryOnPopupMessageExtKt.toUiModel(customMessage.getOnPopupMessage());
            } else if (customMessage.getOnFullScreenMessage() != null) {
                uiModel = ProductsByRewardsOffersQueryOnFullScreenMessageExtKt.toUiModel(customMessage.getOnFullScreenMessage());
            }
            if (uiModel != null) {
                arrayList.add(uiModel);
            }
        }
        Integer totalNumberOfProducts = productsByRewardsOffers.getTotalNumberOfProducts();
        List<ProductsByRewardsOffersQuery.ProductsFeed> productsFeed = productsByRewardsOffers.getProductsFeed();
        ArrayList arrayList2 = new ArrayList();
        for (ProductsByRewardsOffersQuery.ProductsFeed productsFeed2 : productsFeed) {
            ProductCard uiModel2 = productsFeed2.getOnProductCard() != null ? ProductsByRewardsOffersQueryOnProductCardExtKt.toUiModel(productsFeed2.getOnProductCard()) : null;
            if (uiModel2 != null) {
                arrayList2.add(uiModel2);
            }
        }
        return new ProductListByRewardsOfferApiData(arrayList, totalNumberOfProducts, arrayList2);
    }
}
