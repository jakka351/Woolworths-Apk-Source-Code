package au.com.woolworths.product.productbottomsheet;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.TrolleyResult;
import au.com.woolworths.android.onesite.models.TrolleyResultExtKt;
import au.com.woolworths.product.extensions.ProductTrolleyExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductId;
import au.com.woolworths.product.models.ProductTileButtonType;
import au.com.woolworths.product.models.ProductTrolleyData;
import au.com.woolworths.product.models.VideoAdUnitData;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/productbottomsheet/ProductListFeedTrolleyUpdater;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public class ProductListFeedTrolleyUpdater {
    public static ProductCard a(ProductCard productCard, TrolleyResult trolleyResult) {
        Object next;
        String productId = productCard.getProductId();
        Iterator<T> it = TrolleyResultExtKt.getAllGroceryAndMarketItems(trolleyResult).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ProductId.Companion companion = ProductId.INSTANCE;
            if (Intrinsics.c(companion.create(productId), companion.create(((TrolleyResult.TrolleyItem) next).getArticle()))) {
                break;
            }
        }
        TrolleyResult.TrolleyItem trolleyItem = (TrolleyResult.TrolleyItem) next;
        float itemQuantityInTrolley = trolleyItem != null ? trolleyItem.getItemQuantityInTrolley() : 0.0f;
        ProductTrolleyData trolley = productCard.getTrolley();
        if (trolley == null) {
            return productCard;
        }
        Pair pair = !productCard.isAvailable() ? new Pair(ProductTileButtonType.DISABLED, trolley.getButtonLabel()) : itemQuantityInTrolley == BitmapDescriptorFactory.HUE_RED ? new Pair(ProductTileButtonType.ADD, "Add") : new Pair(ProductTileButtonType.UPDATE, "Update");
        return productCard.copy(((-33554433) & 1) != 0 ? productCard.productId : null, ((-33554433) & 2) != 0 ? productCard.name : null, ((-33554433) & 4) != 0 ? productCard.productImage : null, ((-33554433) & 8) != 0 ? productCard.badgeImage : null, ((-33554433) & 16) != 0 ? productCard.price : null, ((-33554433) & 32) != 0 ? productCard.unitOfMeasureLabel : null, ((-33554433) & 64) != 0 ? productCard.promotionValue : null, ((-33554433) & 128) != 0 ? productCard.promotionType : null, ((-33554433) & 256) != 0 ? productCard.unitPriceDescription : null, ((-33554433) & 512) != 0 ? productCard.isAvailable : false, ((-33554433) & 1024) != 0 ? productCard.isNew : false, ((-33554433) & 2048) != 0 ? productCard.wasPrice : null, ((-33554433) & 4096) != 0 ? productCard.multiBuyPrice : null, ((-33554433) & 8192) != 0 ? productCard.multiBuyUnitPrice : null, ((-33554433) & 16384) != 0 ? productCard.purchaseWarning : null, ((-33554433) & 32768) != 0 ? productCard.trolley : trolley.copy((895 & 1) != 0 ? trolley.minimum : 0.0d, (895 & 2) != 0 ? trolley.maximum : 0.0d, (895 & 4) != 0 ? trolley.increment : 0.0d, (895 & 8) != 0 ? trolley.defaultValue : 0.0d, (895 & 16) != 0 ? trolley.inTrolley : Double.valueOf(itemQuantityInTrolley), (895 & 32) != 0 ? trolley.unitLabel : null, (895 & 64) != 0 ? trolley.buttonState : (ProductTileButtonType) pair.d, (895 & 128) != 0 ? trolley.buttonLabel : (String) pair.e, (895 & 256) != 0 ? trolley.buttonQuantity : ProductTrolleyExtKt.a(trolley, itemQuantityInTrolley), (895 & 512) != 0 ? trolley.title : null), ((-33554433) & 65536) != 0 ? productCard.trolleys : null, ((-33554433) & 131072) != 0 ? productCard.productShoppingList : null, ((-33554433) & 262144) != 0 ? productCard.inStoreDetails : null, ((-33554433) & 524288) != 0 ? productCard.purchaseRestriction : null, ((-33554433) & 1048576) != 0 ? productCard.inlineLabels : null, ((-33554433) & 2097152) != 0 ? productCard.promotionInfo : null, ((-33554433) & 4194304) != 0 ? productCard.adId : null, ((-33554433) & 8388608) != 0 ? productCard.source : null, ((-33554433) & 16777216) != 0 ? productCard.marketplace : null, ((-33554433) & 33554432) != 0 ? productCard.rewardsOfferInfo : null, ((-33554433) & 67108864) != 0 ? productCard.disclaimer : null, ((-33554433) & 134217728) != 0 ? productCard.tagLabel : null, ((-33554433) & 268435456) != 0 ? productCard.inStoreAvailabilityInfo : null, ((-33554433) & 536870912) != 0 ? productCard.productVarieties : null, ((-33554433) & 1073741824) != 0 ? productCard.categories : null, ((-33554433) & Integer.MIN_VALUE) != 0 ? productCard.isTobacco : false, (255 & 1) != 0 ? productCard.multiBuyPriceInfo : null, (255 & 2) != 0 ? productCard.memberPriceInfo : null, (255 & 4) != 0 ? productCard.cartProductInfo : null, (255 & 8) != 0 ? productCard.inStoreLocation : null, (255 & 16) != 0 ? productCard.productCardAnalytics : null, (255 & 32) != 0 ? productCard.impressionAnalyticsData : null, (255 & 64) != 0 ? productCard.productCardAction : null, (255 & 128) != 0 ? productCard.pricingFootnoteMd : null);
    }

    public static ArrayList b(List items, TrolleyResult trolleyResult) {
        VideoAdUnitData videoAdUnitData;
        ProductCard productCard;
        Intrinsics.h(items, "items");
        Intrinsics.h(trolleyResult, "trolleyResult");
        List list = items;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        for (Object objCopy$default : list) {
            if (objCopy$default instanceof ProductCard) {
                objCopy$default = a((ProductCard) objCopy$default, trolleyResult);
            } else if ((objCopy$default instanceof VideoAdUnitData) && ((productCard = (videoAdUnitData = (VideoAdUnitData) objCopy$default).getProductCard()) == null || (objCopy$default = VideoAdUnitData.copy$default(videoAdUnitData, null, a(productCard, trolleyResult), null, null, 13, null)) == null)) {
                objCopy$default = videoAdUnitData;
            }
            arrayList.add(objCopy$default);
        }
        return arrayList;
    }

    public static ArrayList c(List list, TrolleyResult trolleyResult) {
        Intrinsics.h(trolleyResult, "trolleyResult");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(a((ProductCard) it.next(), trolleyResult));
        }
        return arrayList;
    }
}
