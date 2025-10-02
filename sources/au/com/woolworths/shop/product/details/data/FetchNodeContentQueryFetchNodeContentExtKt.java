package au.com.woolworths.shop.product.details.data;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.models.products.ProductListMarketplace;
import au.com.woolworths.android.onesite.models.products.PromotionInfo;
import au.com.woolworths.base.shopapp.data.models.CartProductInfo;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.product.models.InStoreAvailabilityInfo;
import au.com.woolworths.product.models.InStoreLocationData;
import au.com.woolworths.product.models.InstoreDetailsData;
import au.com.woolworths.product.models.MemberPriceInfo;
import au.com.woolworths.product.models.MultiBuyPriceInfo;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardCartProductInfoExtKt;
import au.com.woolworths.product.models.ProductCardCategoryExtKt;
import au.com.woolworths.product.models.ProductCardInStoreAvailabilityInfoExtKt;
import au.com.woolworths.product.models.ProductCardInStoreDetailsExtKt;
import au.com.woolworths.product.models.ProductCardInStoreLocationExtKt;
import au.com.woolworths.product.models.ProductCardInlineLabelExtKt;
import au.com.woolworths.product.models.ProductCardKt;
import au.com.woolworths.product.models.ProductCardListExtKt;
import au.com.woolworths.product.models.ProductCardMarketplaceExtKt;
import au.com.woolworths.product.models.ProductCardMemberPriceInfoExtKt;
import au.com.woolworths.product.models.ProductCardMultiBuyPriceInfoExtKt;
import au.com.woolworths.product.models.ProductCardProductCardActionExtKt;
import au.com.woolworths.product.models.ProductCardProductCardAnalyticsExtKt;
import au.com.woolworths.product.models.ProductCardProductVarietiesExtKt;
import au.com.woolworths.product.models.ProductCardPromotionInfoExtKt;
import au.com.woolworths.product.models.ProductCardRewardsOfferInfoExtKt;
import au.com.woolworths.product.models.ProductCardTagLabelExtKt;
import au.com.woolworths.product.models.ProductCategory;
import au.com.woolworths.product.models.ProductInlineLabelApiData;
import au.com.woolworths.product.models.ProductShoppingList;
import au.com.woolworths.product.models.ProductTrolleyData;
import au.com.woolworths.product.models.ProductVarieties;
import au.com.woolworths.product.models.PurchaseRestrictionExtKt;
import au.com.woolworths.product.models.RewardsOfferInfo;
import au.com.woolworths.product.models.TagLabel;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.shop.aem.components.model.link.TextWithAltData;
import au.com.woolworths.shop.graphql.type.PurchaseRestriction;
import au.com.woolworths.shop.productcard.data.InstoreLocationInfo;
import au.com.woolworths.shop.productcard.data.MarketplaceInfo;
import au.com.woolworths.shop.productcard.data.ProductFooter;
import au.com.woolworths.shop.productcard.data.ProductPriceInfo;
import au.com.woolworths.shop.productcard.data.ProductRatingsAndReviews;
import au.com.woolworths.shop.productcard.data.ProductRewardsInfo;
import au.com.woolworths.shop.productcard.data.ProductTileDataKt;
import au.com.woolworths.shop.productcard.data.ProductTileFooterExtKt;
import au.com.woolworths.shop.productcard.data.ProductTileInStoreInfoExtKt;
import au.com.woolworths.shop.productcard.data.ProductTileListExtKt;
import au.com.woolworths.shop.productcard.data.ProductTileMarketplaceInfoExtKt;
import au.com.woolworths.shop.productcard.data.ProductTilePriceInfoExtKt;
import au.com.woolworths.shop.productcard.data.ProductTileProductCardActionExtKt;
import au.com.woolworths.shop.productcard.data.ProductTileProductStatusExtKt;
import au.com.woolworths.shop.productcard.data.ProductTileProductTagExtKt;
import au.com.woolworths.shop.productcard.data.ProductTileRatingsAndReviewsExtKt;
import au.com.woolworths.shop.productcard.data.ProductTileTrolleyExtKt;
import com.woolworths.shop.product.details.FetchNodeContentQuery;
import com.woolworths.shop.productcard.data.fragment.ProductTile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FetchNodeContentQueryFetchNodeContentExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r19v0, types: [au.com.woolworths.shop.productcard.data.ProductTile] */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.ArrayList] */
    public static final NodeContent a(FetchNodeContentQuery.FetchNodeContent fetchNodeContent) {
        ProductHorizontalList productHorizontalList;
        Iterator it;
        ProductCard productTile;
        ?? arrayList;
        ?? arrayList2;
        ?? arrayList3;
        ?? arrayList4;
        boolean z;
        Integer num;
        EmptyList emptyList;
        ?? arrayList5;
        ?? arrayList6;
        String str;
        String str2;
        ?? arrayList7;
        Intrinsics.h(fetchNodeContent, "<this>");
        FetchNodeContentQuery.OnHorizontalList onHorizontalList = fetchNodeContent.b;
        if (onHorizontalList != null) {
            ArrayList arrayList8 = onHorizontalList.f23405a;
            ArrayList arrayList9 = new ArrayList();
            Iterator it2 = arrayList8.iterator();
            while (it2.hasNext()) {
                FetchNodeContentQuery.Item item = (FetchNodeContentQuery.Item) it2.next();
                FetchNodeContentQuery.OnProductCard onProductCard = item.b;
                EmptyList emptyList2 = EmptyList.d;
                if (onProductCard != null) {
                    au.com.woolworths.graphql.common.fragment.ProductCard productCard = onProductCard.b;
                    String str3 = productCard.f8949a;
                    String str4 = productCard.b;
                    String str5 = productCard.e;
                    String str6 = productCard.j;
                    Integer num2 = productCard.h;
                    String str7 = productCard.i;
                    String str8 = productCard.l;
                    boolean z2 = productCard.f;
                    boolean z3 = productCard.c;
                    String str9 = productCard.m;
                    it = it2;
                    String str10 = productCard.n;
                    ProductCard.Trolley trolley = productCard.p;
                    ProductTrolleyData uiModel = trolley != null ? ProductCardKt.toUiModel(trolley) : null;
                    List list = productCard.q;
                    if (list != null) {
                        List list2 = list;
                        z = z3;
                        num = num2;
                        emptyList = emptyList2;
                        arrayList5 = new ArrayList(CollectionsKt.s(list2, 10));
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            arrayList5.add(ProductCardKt.toUiModel((ProductCard.Trolley1) it3.next()));
                        }
                    } else {
                        z = z3;
                        num = num2;
                        emptyList = emptyList2;
                        arrayList5 = 0;
                    }
                    EmptyList emptyList3 = arrayList5 == 0 ? emptyList : arrayList5;
                    ProductShoppingList uiModel2 = ProductCardListExtKt.toUiModel(productCard.r);
                    ProductCard.InStoreDetails inStoreDetails = productCard.s;
                    InstoreDetailsData uiModel3 = inStoreDetails != null ? ProductCardInStoreDetailsExtKt.toUiModel(inStoreDetails) : null;
                    PurchaseRestriction purchaseRestriction = productCard.d;
                    au.com.woolworths.product.models.PurchaseRestriction uiModel4 = purchaseRestriction != null ? PurchaseRestrictionExtKt.toUiModel(purchaseRestriction) : null;
                    List<ProductCard.InlineLabel> list3 = productCard.o;
                    if (list3 != null) {
                        arrayList6 = new ArrayList();
                        for (ProductCard.InlineLabel inlineLabel : list3) {
                            ProductInlineLabelApiData uiModel5 = inlineLabel != null ? ProductCardInlineLabelExtKt.toUiModel(inlineLabel) : null;
                            if (uiModel5 != null) {
                                arrayList6.add(uiModel5);
                            }
                        }
                    } else {
                        arrayList6 = 0;
                    }
                    EmptyList emptyList4 = arrayList6 == 0 ? emptyList : arrayList6;
                    ProductCard.PromotionInfo promotionInfo = productCard.k;
                    PromotionInfo uiModel6 = promotionInfo != null ? ProductCardPromotionInfoExtKt.toUiModel(promotionInfo) : null;
                    String str11 = productCard.u;
                    String str12 = productCard.v;
                    ProductCard.Marketplace marketplace = productCard.w;
                    ProductListMarketplace uiModel7 = marketplace != null ? ProductCardMarketplaceExtKt.toUiModel(marketplace) : null;
                    ProductCard.RewardsOfferInfo rewardsOfferInfo = productCard.x;
                    RewardsOfferInfo uiModel8 = rewardsOfferInfo != null ? ProductCardRewardsOfferInfoExtKt.toUiModel(rewardsOfferInfo) : null;
                    String str13 = productCard.y;
                    ProductCard.TagLabel tagLabel = productCard.z;
                    TagLabel uiModel9 = tagLabel != null ? ProductCardTagLabelExtKt.toUiModel(tagLabel) : null;
                    ProductCard.InStoreAvailabilityInfo inStoreAvailabilityInfo = productCard.g;
                    InStoreAvailabilityInfo uiModel10 = inStoreAvailabilityInfo != null ? ProductCardInStoreAvailabilityInfoExtKt.toUiModel(inStoreAvailabilityInfo) : null;
                    ProductCard.ProductVarieties productVarieties = productCard.A;
                    ProductVarieties uiModel11 = productVarieties != null ? ProductCardProductVarietiesExtKt.toUiModel(productVarieties) : null;
                    List list4 = productCard.B;
                    if (list4 != null) {
                        List list5 = list4;
                        str = str11;
                        str2 = str12;
                        arrayList7 = new ArrayList(CollectionsKt.s(list5, 10));
                        Iterator it4 = list5.iterator();
                        while (it4.hasNext()) {
                            arrayList7.add(ProductCardCategoryExtKt.toUiModel((ProductCard.Category) it4.next()));
                        }
                    } else {
                        str = str11;
                        str2 = str12;
                        arrayList7 = 0;
                    }
                    EmptyList emptyList5 = arrayList7 == 0 ? emptyList : arrayList7;
                    boolean z4 = productCard.C;
                    ProductCard.MultiBuyPriceInfo multiBuyPriceInfo = productCard.E;
                    MultiBuyPriceInfo uiModel12 = multiBuyPriceInfo != null ? ProductCardMultiBuyPriceInfoExtKt.toUiModel(multiBuyPriceInfo) : null;
                    ProductCard.MemberPriceInfo memberPriceInfo = productCard.D;
                    MemberPriceInfo uiModel13 = memberPriceInfo != null ? ProductCardMemberPriceInfoExtKt.toUiModel(memberPriceInfo) : null;
                    ProductCard.CartProductInfo cartProductInfo = productCard.F;
                    CartProductInfo uiModel14 = cartProductInfo != null ? ProductCardCartProductInfoExtKt.toUiModel(cartProductInfo) : null;
                    ProductCard.InStoreLocation inStoreLocation = productCard.t;
                    InStoreLocationData uiModel15 = inStoreLocation != null ? ProductCardInStoreLocationExtKt.toUiModel(inStoreLocation) : null;
                    ProductCard.ProductCardAnalytics productCardAnalytics = productCard.G;
                    AnalyticsData uiModel16 = productCardAnalytics != null ? ProductCardProductCardAnalyticsExtKt.toUiModel(productCardAnalytics) : null;
                    ProductCard.ProductCardAction productCardAction = productCard.H;
                    productTile = new au.com.woolworths.product.models.ProductCard(str3, str4, str5, str6, num, str7, null, null, str8, z2, z, str9, null, null, str10, uiModel, emptyList3, uiModel2, uiModel3, uiModel4, emptyList4, uiModel6, str, str2, uiModel7, uiModel8, str13, uiModel9, uiModel10, uiModel11, emptyList5, z4, uiModel12, uiModel13, uiModel14, uiModel15, uiModel16, null, productCardAction != null ? ProductCardProductCardActionExtKt.toUiModel(productCardAction) : null, productCard.I, 12480, 32, null);
                } else {
                    it = it2;
                    FetchNodeContentQuery.OnProductTile onProductTile = item.c;
                    if (onProductTile != null) {
                        ProductTile productTile2 = onProductTile.b;
                        String str14 = productTile2.f23631a;
                        String str15 = productTile2.b;
                        ProductTile.RoundelImage roundelImage = productTile2.c;
                        au.com.woolworths.shop.productcard.data.RoundelImage roundelImageB = roundelImage != null ? ProductTileDataKt.b(roundelImage) : null;
                        List list6 = productTile2.e;
                        if (list6 != null) {
                            List list7 = list6;
                            arrayList = new ArrayList(CollectionsKt.s(list7, 10));
                            Iterator it5 = list7.iterator();
                            while (it5.hasNext()) {
                                arrayList.add(ProductTileProductTagExtKt.a((ProductTile.ProductTag) it5.next()));
                            }
                        } else {
                            arrayList = 0;
                        }
                        EmptyList emptyList6 = arrayList == 0 ? emptyList2 : arrayList;
                        ProductTile.PriceInfo priceInfo = productTile2.f;
                        ProductPriceInfo productPriceInfoA = priceInfo != null ? ProductTilePriceInfoExtKt.a(priceInfo) : null;
                        List list8 = productTile2.g;
                        if (list8 != null) {
                            List list9 = list8;
                            arrayList2 = new ArrayList(CollectionsKt.s(list9, 10));
                            Iterator it6 = list9.iterator();
                            while (it6.hasNext()) {
                                arrayList2.add(ProductTileProductStatusExtKt.a((ProductTile.ProductStatus) it6.next()));
                            }
                        } else {
                            arrayList2 = 0;
                        }
                        EmptyList emptyList7 = arrayList2 == 0 ? emptyList2 : arrayList2;
                        ProductTile.MiddleMessage middleMessage = productTile2.h;
                        TextWithAltData textWithAltData = middleMessage != null ? new TextWithAltData(middleMessage.f23651a, middleMessage.b) : null;
                        ProductTile.RatingsAndReviews ratingsAndReviews = productTile2.i;
                        ProductRatingsAndReviews productRatingsAndReviewsA = ratingsAndReviews != null ? ProductTileRatingsAndReviewsExtKt.a(ratingsAndReviews) : null;
                        ProductTile.Footer footer = productTile2.j;
                        ProductFooter productFooterA = footer != null ? ProductTileFooterExtKt.a(footer) : null;
                        ProductShoppingList productShoppingListA = ProductTileListExtKt.a(productTile2.k);
                        List list10 = productTile2.l;
                        if (list10 != null) {
                            List list11 = list10;
                            arrayList3 = new ArrayList(CollectionsKt.s(list11, 10));
                            Iterator it7 = list11.iterator();
                            while (it7.hasNext()) {
                                arrayList3.add(ProductTileTrolleyExtKt.a((ProductTile.Trolley) it7.next()));
                            }
                        } else {
                            arrayList3 = 0;
                        }
                        EmptyList emptyList8 = arrayList3 == 0 ? emptyList2 : arrayList3;
                        String str16 = productTile2.m;
                        ProductTile.RewardsOfferInfo rewardsOfferInfo2 = productTile2.n;
                        ProductRewardsInfo productRewardsInfo = rewardsOfferInfo2 != null ? new ProductRewardsInfo(rewardsOfferInfo2.f23659a) : null;
                        List list12 = productTile2.o;
                        if (list12 != null) {
                            List<ProductTile.Category> list13 = list12;
                            arrayList4 = new ArrayList(CollectionsKt.s(list13, 10));
                            for (ProductTile.Category category : list13) {
                                Intrinsics.h(category, "<this>");
                                arrayList4.add(new ProductCategory(category.f23637a, category.b));
                            }
                        } else {
                            arrayList4 = 0;
                        }
                        EmptyList emptyList9 = arrayList4 == 0 ? emptyList2 : arrayList4;
                        String str17 = productTile2.p;
                        ProductTile.ProductCardAction productCardAction2 = productTile2.q;
                        ActionData actionDataA = productCardAction2 != null ? ProductTileProductCardActionExtKt.a(productCardAction2) : null;
                        ProductTile.InStoreInfo inStoreInfo = productTile2.r;
                        InstoreLocationInfo instoreLocationInfoA = inStoreInfo != null ? ProductTileInStoreInfoExtKt.a(inStoreInfo) : null;
                        ProductTile.MarketplaceInfo marketplaceInfo = productTile2.s;
                        MarketplaceInfo marketplaceInfoA = marketplaceInfo != null ? ProductTileMarketplaceInfoExtKt.a(marketplaceInfo) : null;
                        ProductTile.RestrictionInfo restrictionInfo = productTile2.t;
                        productTile = new au.com.woolworths.shop.productcard.data.ProductTile(str14, str15, roundelImageB, null, emptyList6, productPriceInfoA, emptyList7, textWithAltData, productRatingsAndReviewsA, productFooterA, productShoppingListA, emptyList8, str16, productRewardsInfo, emptyList9, str17, actionDataA, instoreLocationInfoA, marketplaceInfoA, restrictionInfo != null ? ProductTileRestrictionInfoExtKt.a(restrictionInfo) : null);
                    } else {
                        productTile = null;
                    }
                }
                if (productTile != null) {
                    arrayList9.add(productTile);
                }
                it2 = it;
            }
            productHorizontalList = new ProductHorizontalList(null, null, null, null, null, arrayList9);
        } else {
            productHorizontalList = null;
        }
        return new NodeContent(productHorizontalList);
    }
}
