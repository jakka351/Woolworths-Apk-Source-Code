package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.foundation.shop.nhp.model.ImageWithAltData;
import au.com.woolworths.foundation.shop.nhp.model.personalisedproducts.PersonalisedProductsBannerData;
import au.com.woolworths.sdui.model.action.ActionData;
import com.woolworths.product.list.ProductListQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/foundation/shop/nhp/model/personalisedproducts/PersonalisedProductsBannerData;", "Lcom/woolworths/product/list/ProductListQuery$OnPersonalisedProductsBanner;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductListQueryOnPersonalisedProductsBannerExtKt {
    @NotNull
    public static final PersonalisedProductsBannerData toUiModel(@NotNull ProductListQuery.OnPersonalisedProductsBanner onPersonalisedProductsBanner) {
        List arrayList;
        Intrinsics.h(onPersonalisedProductsBanner, "<this>");
        String bannerTitle = onPersonalisedProductsBanner.getBannerTitle();
        String bannerForegroundColour = onPersonalisedProductsBanner.getBannerForegroundColour();
        String bannerBackgroundColour = onPersonalisedProductsBanner.getBannerBackgroundColour();
        ProductListQuery.BannerImage bannerImage = onPersonalisedProductsBanner.getBannerImage();
        ImageWithAltData uiModel = bannerImage != null ? ProductListQueryBannerImageExtKt.toUiModel(bannerImage) : null;
        List<ProductListQuery.Product> products = onPersonalisedProductsBanner.getProducts();
        if (products != null) {
            List<ProductListQuery.Product> list = products;
            arrayList = new ArrayList(CollectionsKt.s(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(ProductListQueryProductExtKt.toUiModel((ProductListQuery.Product) it.next()));
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = EmptyList.d;
        }
        ProductListQuery.BannerAction1 bannerAction = onPersonalisedProductsBanner.getBannerAction();
        ActionData uiModel2 = bannerAction != null ? ProductListQueryBannerAction1ExtKt.toUiModel(bannerAction) : null;
        ProductListQuery.BannerAnalytics1 bannerAnalytics = onPersonalisedProductsBanner.getBannerAnalytics();
        AnalyticsData uiModel3 = bannerAnalytics != null ? ProductListQueryBannerAnalytics1ExtKt.toUiModel(bannerAnalytics) : null;
        ProductListQuery.BannerImpressionAnalytics1 bannerImpressionAnalytics = onPersonalisedProductsBanner.getBannerImpressionAnalytics();
        return new PersonalisedProductsBannerData(bannerTitle, bannerForegroundColour, bannerBackgroundColour, uiModel, arrayList, uiModel2, uiModel3, bannerImpressionAnalytics != null ? ProductListQueryBannerImpressionAnalytics1ExtKt.toUiModel(bannerImpressionAnalytics) : null);
    }
}
