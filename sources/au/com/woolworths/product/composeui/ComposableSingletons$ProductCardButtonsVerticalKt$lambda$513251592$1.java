package au.com.woolworths.product.composeui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.product.models.InStoreAvailabilityInfo;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.product.ui.ListButtonType;
import au.com.woolworths.product.ui.ProductCardButtonType;
import au.com.woolworths.product.ui.ProductCardButtonsState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.product.composeui.ComposableSingletons$ProductCardButtonsVerticalKt$lambda$-513251592$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductCardButtonsVerticalKt$lambda$513251592$1 implements Function2<Composer, Integer, Unit> {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/product/composeui/ComposableSingletons$ProductCardButtonsVerticalKt$lambda$-513251592$1$1", "Lau/com/woolworths/product/tile/ProductClickListener;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.product.composeui.ComposableSingletons$ProductCardButtonsVerticalKt$lambda$-513251592$1$1, reason: invalid class name */
    public final class AnonymousClass1 implements ProductClickListener {
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductCard productCardB = ProductCardPreviewDataKt.b(null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -1, 3);
            ProductCardButtonsVerticalKt.b(productCardB.copy(((-33554433) & 1) != 0 ? productCardB.productId : null, ((-33554433) & 2) != 0 ? productCardB.name : null, ((-33554433) & 4) != 0 ? productCardB.productImage : null, ((-33554433) & 8) != 0 ? productCardB.badgeImage : null, ((-33554433) & 16) != 0 ? productCardB.price : null, ((-33554433) & 32) != 0 ? productCardB.unitOfMeasureLabel : null, ((-33554433) & 64) != 0 ? productCardB.promotionValue : null, ((-33554433) & 128) != 0 ? productCardB.promotionType : null, ((-33554433) & 256) != 0 ? productCardB.unitPriceDescription : null, ((-33554433) & 512) != 0 ? productCardB.isAvailable : false, ((-33554433) & 1024) != 0 ? productCardB.isNew : false, ((-33554433) & 2048) != 0 ? productCardB.wasPrice : null, ((-33554433) & 4096) != 0 ? productCardB.multiBuyPrice : null, ((-33554433) & 8192) != 0 ? productCardB.multiBuyUnitPrice : null, ((-33554433) & 16384) != 0 ? productCardB.purchaseWarning : null, ((-33554433) & 32768) != 0 ? productCardB.trolley : null, ((-33554433) & 65536) != 0 ? productCardB.trolleys : null, ((-33554433) & 131072) != 0 ? productCardB.productShoppingList : null, ((-33554433) & 262144) != 0 ? productCardB.inStoreDetails : null, ((-33554433) & 524288) != 0 ? productCardB.purchaseRestriction : null, ((-33554433) & 1048576) != 0 ? productCardB.inlineLabels : null, ((-33554433) & 2097152) != 0 ? productCardB.promotionInfo : null, ((-33554433) & 4194304) != 0 ? productCardB.adId : null, ((-33554433) & 8388608) != 0 ? productCardB.source : null, ((-33554433) & 16777216) != 0 ? productCardB.marketplace : null, ((-33554433) & 33554432) != 0 ? productCardB.rewardsOfferInfo : null, ((-33554433) & 67108864) != 0 ? productCardB.disclaimer : null, ((-33554433) & 134217728) != 0 ? productCardB.tagLabel : null, ((-33554433) & 268435456) != 0 ? productCardB.inStoreAvailabilityInfo : new InStoreAvailabilityInfo(new ButtonApiData("see in store", null, null, true, null, null, null, null, null, 502, null), null, null, 6, null), ((-33554433) & 536870912) != 0 ? productCardB.productVarieties : null, ((-33554433) & 1073741824) != 0 ? productCardB.categories : null, ((-33554433) & Integer.MIN_VALUE) != 0 ? productCardB.isTobacco : false, (255 & 1) != 0 ? productCardB.multiBuyPriceInfo : null, (255 & 2) != 0 ? productCardB.memberPriceInfo : null, (255 & 4) != 0 ? productCardB.cartProductInfo : null, (255 & 8) != 0 ? productCardB.inStoreLocation : null, (255 & 16) != 0 ? productCardB.productCardAnalytics : null, (255 & 32) != 0 ? productCardB.impressionAnalyticsData : null, (255 & 64) != 0 ? productCardB.productCardAction : null, (255 & 128) != 0 ? productCardB.pricingFootnoteMd : null), null, new AnonymousClass1(), new ProductCardButtonsState(ProductCardButtonType.g, ListButtonType.d), PaddingKt.h(Modifier.Companion.d, 8, BitmapDescriptorFactory.HUE_RED, 2), composer, 24624, 0);
        }
        return Unit.f24250a;
    }
}
