package au.com.woolworths.product.analytics;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.MarketplaceTrackingValue;
import au.com.woolworths.android.onesite.analytics.ProductTrackingValue;
import au.com.woolworths.android.onesite.analytics.ProductTrackingValueKt;
import au.com.woolworths.android.onesite.analytics.RewardsOfferAction;
import au.com.woolworths.android.onesite.analytics.RewardsOfferAnalyticsData;
import au.com.woolworths.android.onesite.models.products.ProductListMarketplace;
import au.com.woolworths.base.shopapp.data.models.CartProductInfo;
import au.com.woolworths.foundation.rewards.offers.model.BasicRewardsOfferStatusData;
import au.com.woolworths.product.models.MemberPriceInfo;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductTrolleyData;
import au.com.woolworths.product.models.RewardsOfferInfo;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductAnalyticsExtKt {
    public static final TrackingMetadata a(List list, TrackingMetadata trackingMetadata, String str) {
        if (list.isEmpty()) {
            return null;
        }
        TrackingMetadata trackingMetadataF = f(list);
        if (trackingMetadata != null) {
            trackingMetadataF.a(trackingMetadata);
        }
        if (str != null) {
            trackingMetadataF.b(TrackableValue.o0, str);
        }
        return trackingMetadataF;
    }

    public static /* synthetic */ TrackingMetadata b(String str, int i, List list) {
        if ((i & 2) != 0) {
            str = null;
        }
        return a(list, null, str);
    }

    public static final BasicRewardsOfferStatusData c(ProductCard productCard, List list) {
        Object offerId;
        RewardsOfferInfo rewardsOfferInfo;
        Intrinsics.h(list, "<this>");
        Iterator it = list.iterator();
        while (true) {
            offerId = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String offerId2 = ((BasicRewardsOfferStatusData) next).getD();
            if (productCard != null && (rewardsOfferInfo = productCard.getRewardsOfferInfo()) != null) {
                offerId = rewardsOfferInfo.getD();
            }
            if (Intrinsics.c(offerId2, offerId)) {
                offerId = next;
                break;
            }
        }
        return (BasicRewardsOfferStatusData) offerId;
    }

    public static final ProductTrackingValue d(ProductCard productCard, Float f, String str, MarketplaceTrackingValue marketplaceTrackingValue) throws NumberFormatException {
        float fFloatValue;
        Double inTrolley;
        String strC;
        MarketplaceTrackingValue marketplaceTrackingValue2;
        long j = Long.parseLong(productCard.getProductId());
        String name = productCard.getName();
        if (f != null) {
            fFloatValue = f.floatValue();
        } else {
            ProductTrolleyData trolley = productCard.getTrolley();
            Float fValueOf = (trolley == null || (inTrolley = trolley.getInTrolley()) == null) ? null : Float.valueOf((float) inTrolley.doubleValue());
            fFloatValue = fValueOf != null ? fValueOf.floatValue() : BitmapDescriptorFactory.HUE_RED;
        }
        String string = productCard.getPrice() != null ? Float.valueOf(r5.intValue() / 100.0f).toString() : null;
        boolean zIsAvailable = productCard.isAvailable();
        String adId = productCard.getAdId();
        String source = productCard.getSource();
        if (str == null) {
            CartProductInfo cartProductInfo = productCard.getCartProductInfo();
            strC = cartProductInfo != null ? cartProductInfo.getTotalPrice() : null;
        } else {
            strC = str;
        }
        String productImage = productCard.getProductImage();
        CartProductInfo cartProductInfo2 = productCard.getCartProductInfo();
        String strB = cartProductInfo2 != null ? cartProductInfo2.getTotalOriginalPrice() : null;
        CartProductInfo cartProductInfo3 = productCard.getCartProductInfo();
        String strA = cartProductInfo3 != null ? cartProductInfo3.getTotalDiscount() : null;
        if (marketplaceTrackingValue == null) {
            ProductListMarketplace marketplace = productCard.getMarketplace();
            marketplaceTrackingValue2 = marketplace != null ? new MarketplaceTrackingValue(marketplace.getBrandName(), marketplace.getSellerName(), null) : null;
        } else {
            marketplaceTrackingValue2 = marketplaceTrackingValue;
        }
        RewardsOfferInfo rewardsOfferInfo = productCard.getRewardsOfferInfo();
        RewardsOfferAnalyticsData offerAnalytics = rewardsOfferInfo != null ? rewardsOfferInfo.getR() : null;
        MemberPriceInfo memberPriceInfo = productCard.getMemberPriceInfo();
        return new ProductTrackingValue(j, name, Boolean.valueOf(zIsAvailable), Float.valueOf(fFloatValue), string, strC, adId, source, marketplaceTrackingValue2, offerAnalytics, memberPriceInfo != null ? memberPriceInfo.getHeader() : null, productImage, strB, strA);
    }

    public static final TrackingMetadata e(ProductCard productCard, Float f, String str, MarketplaceTrackingValue marketplaceTrackingValue) {
        Intrinsics.h(productCard, "<this>");
        TrackingMetadata trackingMetadataA = ProductTrackingValueKt.a(CollectionsKt.Q(d(productCard, f, str, marketplaceTrackingValue)));
        AnalyticsData productCardAnalytics = productCard.getProductCardAnalytics();
        if (productCardAnalytics != null) {
            Map mapD = AnalyticsDataKt.d(productCardAnalytics);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : mapD.entrySet()) {
                if (entry.getValue() != null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.h(linkedHashMap.size()));
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                Object key = entry2.getKey();
                Object value = entry2.getValue();
                Intrinsics.e(value);
                linkedHashMap2.put(key, value);
            }
            trackingMetadataA.d.putAll(linkedHashMap2);
        }
        return trackingMetadataA;
    }

    public static final TrackingMetadata f(List list) {
        Intrinsics.h(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(d((ProductCard) it.next(), null, null, null));
        }
        return ProductTrackingValueKt.a(arrayList);
    }

    public static final TrackingMetadata g(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(d((ProductCard) entry.getKey(), (Float) entry.getValue(), null, null));
        }
        return ProductTrackingValueKt.a(arrayList);
    }

    public static /* synthetic */ TrackingMetadata h(ProductCard productCard, Float f, MarketplaceTrackingValue marketplaceTrackingValue, int i) {
        if ((i & 1) != 0) {
            f = null;
        }
        if ((i & 4) != 0) {
            marketplaceTrackingValue = null;
        }
        return e(productCard, f, null, marketplaceTrackingValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [au.com.woolworths.product.models.ProductCard] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static final List i(List list, List offers) {
        RewardsOfferInfo rewardsOfferInfo;
        String offerId;
        ProductCard productCardJ;
        Intrinsics.h(list, "<this>");
        Intrinsics.h(offers, "offers");
        if (offers.isEmpty()) {
            return list;
        }
        List<BasicRewardsOfferStatusData> list2 = offers;
        int iH = MapsKt.h(CollectionsKt.s(list2, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
        for (BasicRewardsOfferStatusData basicRewardsOfferStatusData : list2) {
            linkedHashMap.put(basicRewardsOfferStatusData.getD(), basicRewardsOfferStatusData);
        }
        List list3 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list3, 10));
        for (?? r0 : list3) {
            if ((r0 instanceof ProductCard) && (rewardsOfferInfo = (r0 = (ProductCard) r0).getRewardsOfferInfo()) != null && (offerId = rewardsOfferInfo.getD()) != null && (productCardJ = j(r0, (BasicRewardsOfferStatusData) linkedHashMap.getOrDefault(offerId, r0.getRewardsOfferInfo()))) != null) {
                r0 = productCardJ;
            }
            arrayList.add(r0);
        }
        return arrayList;
    }

    public static final ProductCard j(ProductCard productCard, BasicRewardsOfferStatusData basicRewardsOfferStatusData) {
        RewardsOfferInfo rewardsOfferInfo;
        Intrinsics.h(productCard, "<this>");
        if (basicRewardsOfferStatusData == null || (rewardsOfferInfo = RewardsOfferInfo.INSTANCE.create(basicRewardsOfferStatusData)) == null) {
            rewardsOfferInfo = productCard.getRewardsOfferInfo();
        }
        return productCard.copy(((-33554433) & 1) != 0 ? productCard.productId : null, ((-33554433) & 2) != 0 ? productCard.name : null, ((-33554433) & 4) != 0 ? productCard.productImage : null, ((-33554433) & 8) != 0 ? productCard.badgeImage : null, ((-33554433) & 16) != 0 ? productCard.price : null, ((-33554433) & 32) != 0 ? productCard.unitOfMeasureLabel : null, ((-33554433) & 64) != 0 ? productCard.promotionValue : null, ((-33554433) & 128) != 0 ? productCard.promotionType : null, ((-33554433) & 256) != 0 ? productCard.unitPriceDescription : null, ((-33554433) & 512) != 0 ? productCard.isAvailable : false, ((-33554433) & 1024) != 0 ? productCard.isNew : false, ((-33554433) & 2048) != 0 ? productCard.wasPrice : null, ((-33554433) & 4096) != 0 ? productCard.multiBuyPrice : null, ((-33554433) & 8192) != 0 ? productCard.multiBuyUnitPrice : null, ((-33554433) & 16384) != 0 ? productCard.purchaseWarning : null, ((-33554433) & 32768) != 0 ? productCard.trolley : null, ((-33554433) & 65536) != 0 ? productCard.trolleys : null, ((-33554433) & 131072) != 0 ? productCard.productShoppingList : null, ((-33554433) & 262144) != 0 ? productCard.inStoreDetails : null, ((-33554433) & 524288) != 0 ? productCard.purchaseRestriction : null, ((-33554433) & 1048576) != 0 ? productCard.inlineLabels : null, ((-33554433) & 2097152) != 0 ? productCard.promotionInfo : null, ((-33554433) & 4194304) != 0 ? productCard.adId : null, ((-33554433) & 8388608) != 0 ? productCard.source : null, ((-33554433) & 16777216) != 0 ? productCard.marketplace : null, ((-33554433) & 33554432) != 0 ? productCard.rewardsOfferInfo : rewardsOfferInfo, ((-33554433) & 67108864) != 0 ? productCard.disclaimer : null, ((-33554433) & 134217728) != 0 ? productCard.tagLabel : null, ((-33554433) & 268435456) != 0 ? productCard.inStoreAvailabilityInfo : null, ((-33554433) & 536870912) != 0 ? productCard.productVarieties : null, ((-33554433) & 1073741824) != 0 ? productCard.categories : null, ((-33554433) & Integer.MIN_VALUE) != 0 ? productCard.isTobacco : false, (255 & 1) != 0 ? productCard.multiBuyPriceInfo : null, (255 & 2) != 0 ? productCard.memberPriceInfo : null, (255 & 4) != 0 ? productCard.cartProductInfo : null, (255 & 8) != 0 ? productCard.inStoreLocation : null, (255 & 16) != 0 ? productCard.productCardAnalytics : null, (255 & 32) != 0 ? productCard.impressionAnalyticsData : null, (255 & 64) != 0 ? productCard.productCardAction : null, (255 & 128) != 0 ? productCard.pricingFootnoteMd : null);
    }

    public static final ProductCard k(ProductCard productCard, RewardsOfferAction rewardsOfferAction) {
        Intrinsics.h(productCard, "<this>");
        if (rewardsOfferAction != null) {
            RewardsOfferInfo rewardsOfferInfo = productCard.getRewardsOfferInfo();
            RewardsOfferInfo rewardsOfferInfoCopy$default = null;
            if (rewardsOfferInfo != null) {
                RewardsOfferAnalyticsData offerAnalytics = productCard.getRewardsOfferInfo().getR();
                rewardsOfferInfoCopy$default = RewardsOfferInfo.copy$default(rewardsOfferInfo, null, null, null, null, null, offerAnalytics != null ? offerAnalytics.copy((16383 & 1) != 0 ? offerAnalytics.offerName : null, (16383 & 2) != 0 ? offerAnalytics.commId : null, (16383 & 4) != 0 ? offerAnalytics.uoid : null, (16383 & 8) != 0 ? offerAnalytics.campaignCode : null, (16383 & 16) != 0 ? offerAnalytics.campaignStream : null, (16383 & 32) != 0 ? offerAnalytics.channel : null, (16383 & 64) != 0 ? offerAnalytics.status : null, (16383 & 128) != 0 ? offerAnalytics.offerType : null, (16383 & 256) != 0 ? offerAnalytics.partnerId : null, (16383 & 512) != 0 ? offerAnalytics.profile : null, (16383 & 1024) != 0 ? offerAnalytics.rtlAccountId : null, (16383 & 2048) != 0 ? offerAnalytics.rtlCampaignId : null, (16383 & 4096) != 0 ? offerAnalytics.rtlCampaignCode : null, (16383 & 8192) != 0 ? offerAnalytics.rtlCouponStart : null, (16383 & 16384) != 0 ? offerAnalytics.action : rewardsOfferAction) : null, null, 95, null);
            }
            ProductCard productCardCopy = productCard.copy(((-33554433) & 1) != 0 ? productCard.productId : null, ((-33554433) & 2) != 0 ? productCard.name : null, ((-33554433) & 4) != 0 ? productCard.productImage : null, ((-33554433) & 8) != 0 ? productCard.badgeImage : null, ((-33554433) & 16) != 0 ? productCard.price : null, ((-33554433) & 32) != 0 ? productCard.unitOfMeasureLabel : null, ((-33554433) & 64) != 0 ? productCard.promotionValue : null, ((-33554433) & 128) != 0 ? productCard.promotionType : null, ((-33554433) & 256) != 0 ? productCard.unitPriceDescription : null, ((-33554433) & 512) != 0 ? productCard.isAvailable : false, ((-33554433) & 1024) != 0 ? productCard.isNew : false, ((-33554433) & 2048) != 0 ? productCard.wasPrice : null, ((-33554433) & 4096) != 0 ? productCard.multiBuyPrice : null, ((-33554433) & 8192) != 0 ? productCard.multiBuyUnitPrice : null, ((-33554433) & 16384) != 0 ? productCard.purchaseWarning : null, ((-33554433) & 32768) != 0 ? productCard.trolley : null, ((-33554433) & 65536) != 0 ? productCard.trolleys : null, ((-33554433) & 131072) != 0 ? productCard.productShoppingList : null, ((-33554433) & 262144) != 0 ? productCard.inStoreDetails : null, ((-33554433) & 524288) != 0 ? productCard.purchaseRestriction : null, ((-33554433) & 1048576) != 0 ? productCard.inlineLabels : null, ((-33554433) & 2097152) != 0 ? productCard.promotionInfo : null, ((-33554433) & 4194304) != 0 ? productCard.adId : null, ((-33554433) & 8388608) != 0 ? productCard.source : null, ((-33554433) & 16777216) != 0 ? productCard.marketplace : null, ((-33554433) & 33554432) != 0 ? productCard.rewardsOfferInfo : rewardsOfferInfoCopy$default, ((-33554433) & 67108864) != 0 ? productCard.disclaimer : null, ((-33554433) & 134217728) != 0 ? productCard.tagLabel : null, ((-33554433) & 268435456) != 0 ? productCard.inStoreAvailabilityInfo : null, ((-33554433) & 536870912) != 0 ? productCard.productVarieties : null, ((-33554433) & 1073741824) != 0 ? productCard.categories : null, ((-33554433) & Integer.MIN_VALUE) != 0 ? productCard.isTobacco : false, (255 & 1) != 0 ? productCard.multiBuyPriceInfo : null, (255 & 2) != 0 ? productCard.memberPriceInfo : null, (255 & 4) != 0 ? productCard.cartProductInfo : null, (255 & 8) != 0 ? productCard.inStoreLocation : null, (255 & 16) != 0 ? productCard.productCardAnalytics : null, (255 & 32) != 0 ? productCard.impressionAnalyticsData : null, (255 & 64) != 0 ? productCard.productCardAction : null, (255 & 128) != 0 ? productCard.pricingFootnoteMd : null);
            if (productCardCopy != null) {
                return productCardCopy;
            }
        }
        return productCard;
    }
}
