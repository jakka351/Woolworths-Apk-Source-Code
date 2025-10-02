package au.com.woolworths.product.composeui;

import au.com.woolworths.android.onesite.models.products.ProductListMarketplace;
import au.com.woolworths.android.onesite.models.products.PromotionInfo;
import au.com.woolworths.android.onesite.products.models.ProductPromotionTypes;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus;
import au.com.woolworths.product.models.AisleSide;
import au.com.woolworths.product.models.InStoreLocationData;
import au.com.woolworths.product.models.InStoreLocationType;
import au.com.woolworths.product.models.InstoreDetailsData;
import au.com.woolworths.product.models.InstoreLocationDetailsData;
import au.com.woolworths.product.models.MemberPriceInfo;
import au.com.woolworths.product.models.MultiBuyPriceInfo;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductShoppingList;
import au.com.woolworths.product.models.ProductTrolleyData;
import au.com.woolworths.product.models.ProductVarieties;
import au.com.woolworths.product.models.RewardsOfferInfo;
import au.com.woolworths.product.models.TagLabel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductCardPreviewDataKt {
    public static final InStoreLocationData a() {
        return new InStoreLocationData(new InstoreLocationDetailsData(2, AisleSide.RIGHT, "CENTRE OF STORE", 8, null, 1, 5525.44d, 3733.07d, 121.9d), new InstoreDetailsData("Aisle 3", InStoreLocationType.AVAILABLE));
    }

    public static ProductCard b(String str, String str2, Integer num, String str3, boolean z, String str4, ProductTrolleyData productTrolleyData, ProductShoppingList productShoppingList, InstoreDetailsData instoreDetailsData, List list, PromotionInfo promotionInfo, ProductListMarketplace productListMarketplace, RewardsOfferInfo rewardsOfferInfo, TagLabel tagLabel, MultiBuyPriceInfo multiBuyPriceInfo, MemberPriceInfo memberPriceInfo, InStoreLocationData inStoreLocationData, int i, int i2) {
        MultiBuyPriceInfo multiBuyPriceInfo2;
        String productId = (i & 1) != 0 ? "productId123" : str;
        String str5 = (i & 2) != 0 ? "Alfa One Rice Bran Oil 1l" : str2;
        Integer num2 = (i & 16) != 0 ? 5099 : num;
        String str6 = (i & 32) != 0 ? null : "per 200G";
        String str7 = (i & 256) != 0 ? "$0.50 per 100ML" : str3;
        boolean z2 = (i & 512) != 0 ? true : z;
        String str8 = (i & 2048) != 0 ? "Was $5.00" : null;
        String str9 = (i & 4096) != 0 ? "2 for $5.00" : str4;
        String str10 = (i & 8192) != 0 ? "$2.99 each" : null;
        ProductTrolleyData productTrolleyData2 = (32768 & i) != 0 ? null : productTrolleyData;
        ProductShoppingList productShoppingList2 = (65536 & i) != 0 ? new ProductShoppingList(1.0d, 7.0d, 1.0d, 1.0d, null) : productShoppingList;
        InstoreDetailsData instoreDetailsData2 = (131072 & i) != 0 ? new InstoreDetailsData("Isle 3", InStoreLocationType.AVAILABLE) : instoreDetailsData;
        List list2 = (524288 & i) != 0 ? null : list;
        PromotionInfo promotionInfo2 = (1048576 & i) != 0 ? new PromotionInfo(ProductPromotionTypes.LOW_PRICE, "Save $7.00") : promotionInfo;
        ProductListMarketplace productListMarketplace2 = (4194304 & i) != 0 ? new ProductListMarketplace("http://text", "Sold & Shipped by Market Partner", "Some Seller", "Acme", null) : productListMarketplace;
        RewardsOfferInfo rewardsOfferInfo2 = (8388608 & i) != 0 ? new RewardsOfferInfo("offerId123", "Boost", "Shop & enjoy the points. Ends 24 Aug.", "Min. spend $3", RewardsOfferStatus.NOT_ACTIVATED, null, null) : rewardsOfferInfo;
        String str11 = (16777216 & i) != 0 ? "Available only instore and on the website. Restrictions on sale apply" : null;
        TagLabel tagLabel2 = (33554432 & i) != 0 ? null : tagLabel;
        ProductVarieties productVarieties = (134217728 & i) != 0 ? new ProductVarieties(2, "View 2 varieties", "productFamilyAbc") : null;
        if ((536870912 & i) != 0) {
            multiBuyPriceInfo2 = new MultiBuyPriceInfo(str9 == null ? "" : str9, str10 != null ? str10 : "");
        } else {
            multiBuyPriceInfo2 = multiBuyPriceInfo;
        }
        MemberPriceInfo memberPriceInfo2 = (1073741824 & i) != 0 ? null : memberPriceInfo;
        InStoreLocationData inStoreLocationData2 = (i & Integer.MIN_VALUE) != 0 ? null : inStoreLocationData;
        String str12 = (i2 & 2) == 0 ? "Price per kg charged" : null;
        Intrinsics.h(productId, "productId");
        return new ProductCard(productId, str5, null, null, num2, str6, null, null, str7, z2, false, str8, str9, str10, null, productTrolleyData2, null, productShoppingList2, instoreDetailsData2, null, list2, promotionInfo2, null, null, productListMarketplace2, rewardsOfferInfo2, str11, tagLabel2, null, productVarieties, EmptyList.d, false, multiBuyPriceInfo2, memberPriceInfo2, null, inStoreLocationData2, null, null, null, str12, -2139029504, 52, null);
    }
}
