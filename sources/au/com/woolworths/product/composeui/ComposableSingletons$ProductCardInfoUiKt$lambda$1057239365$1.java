package au.com.woolworths.product.composeui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.product.composeui.ComposableSingletons$ProductCardInfoUiKt$lambda$-1057239365$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductCardInfoUiKt$lambda$1057239365$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductCard productCardB = ProductCardPreviewDataKt.b(null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -1, 3);
            ProductCardInfoUiKt.b(productCardB.copy(((-33554433) & 1) != 0 ? productCardB.productId : null, ((-33554433) & 2) != 0 ? productCardB.name : "Woolworths NZ Chicken 0.8-1.3kg 2-3pcs", ((-33554433) & 4) != 0 ? productCardB.productImage : null, ((-33554433) & 8) != 0 ? productCardB.badgeImage : null, ((-33554433) & 16) != 0 ? productCardB.price : 1050, ((-33554433) & 32) != 0 ? productCardB.unitOfMeasureLabel : null, ((-33554433) & 64) != 0 ? productCardB.promotionValue : null, ((-33554433) & 128) != 0 ? productCardB.promotionType : null, ((-33554433) & 256) != 0 ? productCardB.unitPriceDescription : "10.50 per 1kg\n$4.40 / tray (approx)", ((-33554433) & 512) != 0 ? productCardB.isAvailable : false, ((-33554433) & 1024) != 0 ? productCardB.isNew : false, ((-33554433) & 2048) != 0 ? productCardB.wasPrice : null, ((-33554433) & 4096) != 0 ? productCardB.multiBuyPrice : null, ((-33554433) & 8192) != 0 ? productCardB.multiBuyUnitPrice : null, ((-33554433) & 16384) != 0 ? productCardB.purchaseWarning : null, ((-33554433) & 32768) != 0 ? productCardB.trolley : null, ((-33554433) & 65536) != 0 ? productCardB.trolleys : null, ((-33554433) & 131072) != 0 ? productCardB.productShoppingList : null, ((-33554433) & 262144) != 0 ? productCardB.inStoreDetails : null, ((-33554433) & 524288) != 0 ? productCardB.purchaseRestriction : null, ((-33554433) & 1048576) != 0 ? productCardB.inlineLabels : null, ((-33554433) & 2097152) != 0 ? productCardB.promotionInfo : null, ((-33554433) & 4194304) != 0 ? productCardB.adId : null, ((-33554433) & 8388608) != 0 ? productCardB.source : null, ((-33554433) & 16777216) != 0 ? productCardB.marketplace : null, ((-33554433) & 33554432) != 0 ? productCardB.rewardsOfferInfo : null, ((-33554433) & 67108864) != 0 ? productCardB.disclaimer : null, ((-33554433) & 134217728) != 0 ? productCardB.tagLabel : null, ((-33554433) & 268435456) != 0 ? productCardB.inStoreAvailabilityInfo : null, ((-33554433) & 536870912) != 0 ? productCardB.productVarieties : null, ((-33554433) & 1073741824) != 0 ? productCardB.categories : null, ((-33554433) & Integer.MIN_VALUE) != 0 ? productCardB.isTobacco : false, (255 & 1) != 0 ? productCardB.multiBuyPriceInfo : null, (255 & 2) != 0 ? productCardB.memberPriceInfo : null, (255 & 4) != 0 ? productCardB.cartProductInfo : null, (255 & 8) != 0 ? productCardB.inStoreLocation : null, (255 & 16) != 0 ? productCardB.productCardAnalytics : null, (255 & 32) != 0 ? productCardB.impressionAnalyticsData : null, (255 & 64) != 0 ? productCardB.productCardAction : null, (255 & 128) != 0 ? productCardB.pricingFootnoteMd : null), true, true, null, false, false, false, null, true, true, true, true, false, null, null, null, null, 2, composer, 905970096, 100663734, 254200);
        }
        return Unit.f24250a;
    }
}
