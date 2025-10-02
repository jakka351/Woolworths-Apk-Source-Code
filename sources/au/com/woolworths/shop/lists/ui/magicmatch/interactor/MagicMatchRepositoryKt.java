package au.com.woolworths.shop.lists.ui.magicmatch.interactor;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.models.products.ProductListMarketplace;
import au.com.woolworths.android.onesite.models.products.PromotionInfo;
import au.com.woolworths.base.shopapp.data.models.CartProductInfo;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.product.models.InStoreAvailabilityInfo;
import au.com.woolworths.product.models.InStoreLocationData;
import au.com.woolworths.product.models.InStoreLocationType;
import au.com.woolworths.product.models.InstoreDetailsData;
import au.com.woolworths.product.models.MemberPriceInfo;
import au.com.woolworths.product.models.MultiBuyPriceInfo;
import au.com.woolworths.product.models.ProductCategory;
import au.com.woolworths.product.models.ProductInlineLabelApiData;
import au.com.woolworths.product.models.ProductShoppingList;
import au.com.woolworths.product.models.ProductTrolleyData;
import au.com.woolworths.product.models.ProductVarieties;
import au.com.woolworths.product.models.PurchaseRestriction;
import au.com.woolworths.product.models.RewardsOfferInfo;
import au.com.woolworths.product.models.TagLabel;
import au.com.woolworths.shop.lists.MagicMatchProductListQuery;
import au.com.woolworths.shop.lists.ui.magicmatch.models.MagicMatchProductListData;
import au.com.woolworths.shop.lists.ui.magicmatch.models.MatchProductByQuantityData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class MagicMatchRepositoryKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v26, types: [java.util.ArrayList] */
    public static final ArrayList a(MagicMatchProductListQuery.Data data) {
        Iterator it;
        MatchProductByQuantityData matchProductByQuantityData;
        String str;
        EmptyList emptyList;
        Integer num;
        ?? arrayList;
        InstoreDetailsData instoreDetailsData;
        PurchaseRestriction purchaseRestriction;
        ?? arrayList2;
        String str2;
        ProductListMarketplace productListMarketplace;
        String str3;
        String str4;
        ProductVarieties productVarieties;
        ?? arrayList3;
        boolean z;
        MemberPriceInfo memberPriceInfo;
        InStoreLocationType inStoreLocationType;
        String str5;
        String str6;
        Integer num2;
        ?? arrayList4;
        InstoreDetailsData instoreDetailsData2;
        PurchaseRestriction purchaseRestriction2;
        ?? arrayList5;
        String str7;
        ProductListMarketplace productListMarketplace2;
        String str8;
        String str9;
        ProductVarieties productVarieties2;
        ?? arrayList6;
        boolean z2;
        MemberPriceInfo memberPriceInfo2;
        InStoreLocationType inStoreLocationType2;
        ArrayList arrayList7 = data.f12228a.f12229a;
        ArrayList arrayList8 = new ArrayList(CollectionsKt.s(arrayList7, 10));
        Iterator it2 = arrayList7.iterator();
        while (it2.hasNext()) {
            MagicMatchProductListQuery.ProductList productList = (MagicMatchProductListQuery.ProductList) it2.next();
            Intrinsics.h(productList, "<this>");
            String str10 = productList.f12233a;
            String str11 = productList.b;
            MagicMatchProductListQuery.MatchedProduct matchedProduct = productList.c;
            EmptyList emptyList2 = EmptyList.d;
            if (matchedProduct != null) {
                ProductCard productCard = matchedProduct.b.b;
                String str12 = productCard.f8949a;
                String str13 = productCard.b;
                String str14 = productCard.e;
                String str15 = productCard.j;
                Integer num3 = productCard.h;
                String str16 = productCard.i;
                it = it2;
                String str17 = productCard.l;
                boolean z3 = productCard.f;
                boolean z4 = productCard.c;
                String str18 = productCard.m;
                String str19 = productCard.n;
                ProductCard.Trolley trolley = productCard.p;
                ProductTrolleyData productTrolleyDataA = trolley != null ? ProductCardTrolleyExtKt.a(trolley) : null;
                List list = productCard.q;
                if (list != null) {
                    List list2 = list;
                    str5 = str16;
                    str6 = str15;
                    num2 = num3;
                    arrayList4 = new ArrayList(CollectionsKt.s(list2, 10));
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(ProductCardTrolley1ExtKt.a((ProductCard.Trolley1) it3.next()));
                    }
                } else {
                    str5 = str16;
                    str6 = str15;
                    num2 = num3;
                    arrayList4 = 0;
                }
                EmptyList emptyList3 = arrayList4 == 0 ? emptyList2 : arrayList4;
                ProductCard.List list3 = productCard.r;
                ProductShoppingList productShoppingList = new ProductShoppingList(list3.f8963a, list3.b, list3.c, list3.d, list3.e);
                ProductCard.InStoreDetails inStoreDetails = productCard.s;
                if (inStoreDetails != null) {
                    String str20 = inStoreDetails.f8959a;
                    au.com.woolworths.shop.graphql.type.InStoreLocationType inStoreLocationType3 = inStoreDetails.b;
                    if (inStoreLocationType3 != null) {
                        int iOrdinal = inStoreLocationType3.ordinal();
                        inStoreLocationType2 = (iOrdinal == 0 || iOrdinal != 1) ? InStoreLocationType.AVAILABLE : InStoreLocationType.UNAVAILABLE;
                    } else {
                        inStoreLocationType2 = null;
                    }
                    instoreDetailsData2 = new InstoreDetailsData(str20, inStoreLocationType2);
                } else {
                    instoreDetailsData2 = null;
                }
                au.com.woolworths.shop.graphql.type.PurchaseRestriction purchaseRestriction3 = productCard.d;
                if (purchaseRestriction3 != null) {
                    int iOrdinal2 = purchaseRestriction3.ordinal();
                    purchaseRestriction2 = iOrdinal2 != 0 ? iOrdinal2 != 1 ? PurchaseRestriction.NO_RESTRICTION : PurchaseRestriction.NO_RESTRICTION : PurchaseRestriction.LEGAL_AGE_RESTRICTION;
                } else {
                    purchaseRestriction2 = null;
                }
                List<ProductCard.InlineLabel> list4 = productCard.o;
                if (list4 != null) {
                    arrayList5 = new ArrayList();
                    for (ProductCard.InlineLabel inlineLabel : list4) {
                        ProductInlineLabelApiData productInlineLabelApiDataA = inlineLabel != null ? ProductCardInlineLabelExtKt.a(inlineLabel) : null;
                        if (productInlineLabelApiDataA != null) {
                            arrayList5.add(productInlineLabelApiDataA);
                        }
                    }
                } else {
                    arrayList5 = 0;
                }
                EmptyList emptyList4 = arrayList5 == 0 ? emptyList2 : arrayList5;
                ProductCard.PromotionInfo promotionInfo = productCard.k;
                PromotionInfo promotionInfoA = promotionInfo != null ? ProductCardPromotionInfoExtKt.a(promotionInfo) : null;
                String str21 = productCard.u;
                String str22 = productCard.v;
                ProductCard.Marketplace marketplace = productCard.w;
                if (marketplace != null) {
                    str7 = str21;
                    productListMarketplace2 = new ProductListMarketplace(marketplace.f8964a, marketplace.b, marketplace.c, marketplace.d, marketplace.e);
                } else {
                    str7 = str21;
                    productListMarketplace2 = null;
                }
                ProductCard.RewardsOfferInfo rewardsOfferInfo = productCard.x;
                RewardsOfferInfo rewardsOfferInfoA = rewardsOfferInfo != null ? ProductCardRewardsOfferInfoExtKt.a(rewardsOfferInfo) : null;
                String str23 = productCard.y;
                ProductCard.TagLabel tagLabel = productCard.z;
                TagLabel tagLabelA = tagLabel != null ? ProductCardTagLabelExtKt.a(tagLabel) : null;
                ProductCard.InStoreAvailabilityInfo inStoreAvailabilityInfo = productCard.g;
                InStoreAvailabilityInfo inStoreAvailabilityInfoA = inStoreAvailabilityInfo != null ? ProductCardInStoreAvailabilityInfoExtKt.a(inStoreAvailabilityInfo) : null;
                ProductCard.ProductVarieties productVarieties3 = productCard.A;
                if (productVarieties3 != null) {
                    str8 = str23;
                    str9 = str22;
                    productVarieties2 = new ProductVarieties(productVarieties3.f8970a, productVarieties3.b, productVarieties3.c);
                } else {
                    str8 = str23;
                    str9 = str22;
                    productVarieties2 = null;
                }
                List list5 = productCard.B;
                if (list5 != null) {
                    List list6 = list5;
                    arrayList6 = new ArrayList(CollectionsKt.s(list6, 10));
                    for (Iterator it4 = list6.iterator(); it4.hasNext(); it4 = it4) {
                        ProductCard.Category category = (ProductCard.Category) it4.next();
                        Intrinsics.h(category, "<this>");
                        arrayList6.add(new ProductCategory(category.f8955a, category.b));
                    }
                } else {
                    arrayList6 = 0;
                }
                EmptyList emptyList5 = arrayList6 == 0 ? emptyList2 : arrayList6;
                boolean z5 = productCard.C;
                ProductCard.MultiBuyPriceInfo multiBuyPriceInfo = productCard.E;
                MultiBuyPriceInfo multiBuyPriceInfo2 = multiBuyPriceInfo != null ? new MultiBuyPriceInfo(multiBuyPriceInfo.f8966a, multiBuyPriceInfo.b) : null;
                ProductCard.MemberPriceInfo memberPriceInfo3 = productCard.D;
                if (memberPriceInfo3 != null) {
                    z2 = z5;
                    memberPriceInfo2 = new MemberPriceInfo(memberPriceInfo3.f8965a, memberPriceInfo3.b, memberPriceInfo3.c);
                } else {
                    z2 = z5;
                    memberPriceInfo2 = null;
                }
                ProductCard.CartProductInfo cartProductInfo = productCard.F;
                CartProductInfo cartProductInfo2 = cartProductInfo != null ? new CartProductInfo(cartProductInfo.f8954a, cartProductInfo.b, cartProductInfo.c) : null;
                ProductCard.InStoreLocation inStoreLocation = productCard.t;
                InStoreLocationData inStoreLocationDataA = inStoreLocation != null ? ProductCardInStoreLocationExtKt.a(inStoreLocation) : null;
                ProductCard.ProductCardAnalytics productCardAnalytics = productCard.G;
                AnalyticsData analyticsDataA = productCardAnalytics != null ? ProductCardProductCardAnalyticsExtKt.a(productCardAnalytics) : null;
                ProductCard.ProductCardAction productCardAction = productCard.H;
                matchProductByQuantityData = new MatchProductByQuantityData(new au.com.woolworths.product.models.ProductCard(str12, str13, str14, str6, num2, str5, null, null, str17, z3, z4, str18, null, null, str19, productTrolleyDataA, emptyList3, productShoppingList, instoreDetailsData2, purchaseRestriction2, emptyList4, promotionInfoA, str7, str9, productListMarketplace2, rewardsOfferInfoA, str8, tagLabelA, inStoreAvailabilityInfoA, productVarieties2, emptyList5, z2, multiBuyPriceInfo2, memberPriceInfo2, cartProductInfo2, inStoreLocationDataA, analyticsDataA, null, productCardAction != null ? ProductCardProductCardActionExtKt.a(productCardAction) : null, productCard.I, 12480, 32, null), matchedProduct.f12230a);
            } else {
                it = it2;
                matchProductByQuantityData = null;
            }
            ArrayList arrayList9 = productList.d;
            ArrayList arrayList10 = new ArrayList(CollectionsKt.s(arrayList9, 10));
            Iterator it5 = arrayList9.iterator();
            while (it5.hasNext()) {
                MagicMatchProductListQuery.SuggestedProductList suggestedProductList = (MagicMatchProductListQuery.SuggestedProductList) it5.next();
                Intrinsics.h(suggestedProductList, "<this>");
                ProductCard productCard2 = suggestedProductList.b.b;
                String str24 = productCard2.f8949a;
                String str25 = productCard2.b;
                String str26 = productCard2.e;
                String str27 = productCard2.j;
                Integer num4 = productCard2.h;
                Iterator it6 = it5;
                String str28 = productCard2.i;
                String str29 = productCard2.l;
                boolean z6 = productCard2.f;
                boolean z7 = productCard2.c;
                String str30 = productCard2.m;
                String str31 = productCard2.n;
                ProductCard.Trolley trolley2 = productCard2.p;
                ProductTrolleyData productTrolleyDataA2 = trolley2 != null ? ProductCardTrolleyExtKt.a(trolley2) : null;
                List list7 = productCard2.q;
                if (list7 != null) {
                    List list8 = list7;
                    str = str27;
                    emptyList = emptyList2;
                    num = num4;
                    arrayList = new ArrayList(CollectionsKt.s(list8, 10));
                    Iterator it7 = list8.iterator();
                    while (it7.hasNext()) {
                        arrayList.add(ProductCardTrolley1ExtKt.a((ProductCard.Trolley1) it7.next()));
                    }
                } else {
                    str = str27;
                    emptyList = emptyList2;
                    num = num4;
                    arrayList = 0;
                }
                EmptyList emptyList6 = arrayList == 0 ? emptyList : arrayList;
                ProductCard.List list9 = productCard2.r;
                ProductShoppingList productShoppingList2 = new ProductShoppingList(list9.f8963a, list9.b, list9.c, list9.d, list9.e);
                ProductCard.InStoreDetails inStoreDetails2 = productCard2.s;
                if (inStoreDetails2 != null) {
                    String str32 = inStoreDetails2.f8959a;
                    au.com.woolworths.shop.graphql.type.InStoreLocationType inStoreLocationType4 = inStoreDetails2.b;
                    if (inStoreLocationType4 != null) {
                        int iOrdinal3 = inStoreLocationType4.ordinal();
                        inStoreLocationType = (iOrdinal3 == 0 || iOrdinal3 != 1) ? InStoreLocationType.AVAILABLE : InStoreLocationType.UNAVAILABLE;
                    } else {
                        inStoreLocationType = null;
                    }
                    instoreDetailsData = new InstoreDetailsData(str32, inStoreLocationType);
                } else {
                    instoreDetailsData = null;
                }
                au.com.woolworths.shop.graphql.type.PurchaseRestriction purchaseRestriction4 = productCard2.d;
                if (purchaseRestriction4 != null) {
                    int iOrdinal4 = purchaseRestriction4.ordinal();
                    purchaseRestriction = iOrdinal4 != 0 ? iOrdinal4 != 1 ? PurchaseRestriction.NO_RESTRICTION : PurchaseRestriction.NO_RESTRICTION : PurchaseRestriction.LEGAL_AGE_RESTRICTION;
                } else {
                    purchaseRestriction = null;
                }
                List<ProductCard.InlineLabel> list10 = productCard2.o;
                if (list10 != null) {
                    arrayList2 = new ArrayList();
                    for (ProductCard.InlineLabel inlineLabel2 : list10) {
                        ProductInlineLabelApiData productInlineLabelApiDataA2 = inlineLabel2 != null ? ProductCardInlineLabelExtKt.a(inlineLabel2) : null;
                        if (productInlineLabelApiDataA2 != null) {
                            arrayList2.add(productInlineLabelApiDataA2);
                        }
                    }
                } else {
                    arrayList2 = 0;
                }
                EmptyList emptyList7 = arrayList2 == 0 ? emptyList : arrayList2;
                ProductCard.PromotionInfo promotionInfo2 = productCard2.k;
                PromotionInfo promotionInfoA2 = promotionInfo2 != null ? ProductCardPromotionInfoExtKt.a(promotionInfo2) : null;
                String str33 = productCard2.u;
                String str34 = productCard2.v;
                ProductCard.Marketplace marketplace2 = productCard2.w;
                if (marketplace2 != null) {
                    str2 = str33;
                    productListMarketplace = new ProductListMarketplace(marketplace2.f8964a, marketplace2.b, marketplace2.c, marketplace2.d, marketplace2.e);
                } else {
                    str2 = str33;
                    productListMarketplace = null;
                }
                ProductCard.RewardsOfferInfo rewardsOfferInfo2 = productCard2.x;
                RewardsOfferInfo rewardsOfferInfoA2 = rewardsOfferInfo2 != null ? ProductCardRewardsOfferInfoExtKt.a(rewardsOfferInfo2) : null;
                String str35 = productCard2.y;
                ProductCard.TagLabel tagLabel2 = productCard2.z;
                TagLabel tagLabelA2 = tagLabel2 != null ? ProductCardTagLabelExtKt.a(tagLabel2) : null;
                ProductCard.InStoreAvailabilityInfo inStoreAvailabilityInfo2 = productCard2.g;
                InStoreAvailabilityInfo inStoreAvailabilityInfoA2 = inStoreAvailabilityInfo2 != null ? ProductCardInStoreAvailabilityInfoExtKt.a(inStoreAvailabilityInfo2) : null;
                ProductCard.ProductVarieties productVarieties4 = productCard2.A;
                if (productVarieties4 != null) {
                    str3 = str35;
                    str4 = str34;
                    productVarieties = new ProductVarieties(productVarieties4.f8970a, productVarieties4.b, productVarieties4.c);
                } else {
                    str3 = str35;
                    str4 = str34;
                    productVarieties = null;
                }
                List list11 = productCard2.B;
                if (list11 != null) {
                    List list12 = list11;
                    arrayList3 = new ArrayList(CollectionsKt.s(list12, 10));
                    for (Iterator it8 = list12.iterator(); it8.hasNext(); it8 = it8) {
                        ProductCard.Category category2 = (ProductCard.Category) it8.next();
                        Intrinsics.h(category2, "<this>");
                        arrayList3.add(new ProductCategory(category2.f8955a, category2.b));
                    }
                } else {
                    arrayList3 = 0;
                }
                EmptyList emptyList8 = arrayList3 == 0 ? emptyList : arrayList3;
                boolean z8 = productCard2.C;
                ProductCard.MultiBuyPriceInfo multiBuyPriceInfo3 = productCard2.E;
                MultiBuyPriceInfo multiBuyPriceInfo4 = multiBuyPriceInfo3 != null ? new MultiBuyPriceInfo(multiBuyPriceInfo3.f8966a, multiBuyPriceInfo3.b) : null;
                ProductCard.MemberPriceInfo memberPriceInfo4 = productCard2.D;
                if (memberPriceInfo4 != null) {
                    z = z8;
                    memberPriceInfo = new MemberPriceInfo(memberPriceInfo4.f8965a, memberPriceInfo4.b, memberPriceInfo4.c);
                } else {
                    z = z8;
                    memberPriceInfo = null;
                }
                ProductCard.CartProductInfo cartProductInfo3 = productCard2.F;
                CartProductInfo cartProductInfo4 = cartProductInfo3 != null ? new CartProductInfo(cartProductInfo3.f8954a, cartProductInfo3.b, cartProductInfo3.c) : null;
                ProductCard.InStoreLocation inStoreLocation2 = productCard2.t;
                InStoreLocationData inStoreLocationDataA2 = inStoreLocation2 != null ? ProductCardInStoreLocationExtKt.a(inStoreLocation2) : null;
                ProductCard.ProductCardAnalytics productCardAnalytics2 = productCard2.G;
                AnalyticsData analyticsDataA2 = productCardAnalytics2 != null ? ProductCardProductCardAnalyticsExtKt.a(productCardAnalytics2) : null;
                ProductCard.ProductCardAction productCardAction2 = productCard2.H;
                arrayList10.add(new MatchProductByQuantityData(new au.com.woolworths.product.models.ProductCard(str24, str25, str26, str, num, str28, null, null, str29, z6, z7, str30, null, null, str31, productTrolleyDataA2, emptyList6, productShoppingList2, instoreDetailsData, purchaseRestriction, emptyList7, promotionInfoA2, str2, str4, productListMarketplace, rewardsOfferInfoA2, str3, tagLabelA2, inStoreAvailabilityInfoA2, productVarieties, emptyList8, z, multiBuyPriceInfo4, memberPriceInfo, cartProductInfo4, inStoreLocationDataA2, analyticsDataA2, null, productCardAction2 != null ? ProductCardProductCardActionExtKt.a(productCardAction2) : null, productCard2.I, 12480, 32, null), suggestedProductList.f12234a));
                it5 = it6;
                emptyList2 = emptyList;
            }
            arrayList8.add(new MagicMatchProductListData(str10, str11, matchProductByQuantityData, arrayList10));
            it2 = it;
        }
        return arrayList8;
    }
}
