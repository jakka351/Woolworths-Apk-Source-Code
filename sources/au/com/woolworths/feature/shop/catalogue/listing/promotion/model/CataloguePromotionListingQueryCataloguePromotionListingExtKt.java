package au.com.woolworths.feature.shop.catalogue.listing.promotion.model;

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
import au.com.woolworths.product.models.ProductInlineLabelApiData;
import au.com.woolworths.product.models.ProductShoppingList;
import au.com.woolworths.product.models.ProductTrolleyData;
import au.com.woolworths.product.models.ProductVarieties;
import au.com.woolworths.product.models.PurchaseRestrictionExtKt;
import au.com.woolworths.product.models.RewardsOfferInfo;
import au.com.woolworths.product.models.TagLabel;
import au.com.woolworths.shop.aem.components.model.ImageWithAltText;
import au.com.woolworths.shop.graphql.type.PurchaseRestriction;
import com.woolworths.shop.catalogue.CataloguePromotionListingQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"catalogue_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CataloguePromotionListingQueryCataloguePromotionListingExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v44, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v45, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r53v1, types: [au.com.woolworths.product.models.ProductCard] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v44, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v45, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    public static final PromotionListing a(CataloguePromotionListingQuery.CataloguePromotionListing cataloguePromotionListing) {
        Iterator it;
        Object promotionGroup;
        ?? arrayList;
        Iterator it2;
        ProductHeroCard productHeroCard;
        String str;
        String str2;
        String str3;
        ?? arrayList2;
        ?? arrayList3;
        String str4;
        String str5;
        String str6;
        ?? arrayList4;
        String str7;
        String str8;
        String str9;
        ?? arrayList5;
        ?? arrayList6;
        String str10;
        String str11;
        String str12;
        ?? arrayList7;
        String str13;
        String str14;
        String str15;
        ?? arrayList8;
        ?? arrayList9;
        String str16;
        String str17;
        ?? arrayList10;
        String str18;
        String str19;
        EmptyList emptyList;
        ?? arrayList11;
        ?? arrayList12;
        String str20;
        String str21;
        ?? arrayList13;
        Intrinsics.h(cataloguePromotionListing, "<this>");
        CataloguePromotionListingQuery.Header header = cataloguePromotionListing.f21688a;
        ListingHeader listingHeader = header != null ? new ListingHeader(header.f21690a, header.b, header.c) : null;
        ArrayList arrayList14 = cataloguePromotionListing.b;
        ArrayList arrayList15 = new ArrayList();
        Iterator it3 = arrayList14.iterator();
        while (it3.hasNext()) {
            CataloguePromotionListingQuery.Item item = (CataloguePromotionListingQuery.Item) it3.next();
            CataloguePromotionListingQuery.OnProductCard onProductCard = item.b;
            EmptyList emptyList2 = EmptyList.d;
            if (onProductCard != null) {
                ProductCard productCard = onProductCard.b;
                String str22 = productCard.f8949a;
                String str23 = productCard.b;
                String str24 = productCard.e;
                String str25 = productCard.j;
                Integer num = productCard.h;
                String str26 = productCard.i;
                String str27 = productCard.l;
                boolean z = productCard.f;
                boolean z2 = productCard.c;
                String str28 = productCard.m;
                String str29 = productCard.n;
                it = it3;
                ProductCard.Trolley trolley = productCard.p;
                ProductTrolleyData uiModel = trolley != null ? ProductCardKt.toUiModel(trolley) : null;
                List list = productCard.q;
                if (list != null) {
                    List list2 = list;
                    str18 = str28;
                    str19 = str27;
                    emptyList = emptyList2;
                    arrayList11 = new ArrayList(CollectionsKt.s(list2, 10));
                    Iterator it4 = list2.iterator();
                    while (it4.hasNext()) {
                        arrayList11.add(ProductCardKt.toUiModel((ProductCard.Trolley1) it4.next()));
                    }
                } else {
                    str18 = str28;
                    str19 = str27;
                    emptyList = emptyList2;
                    arrayList11 = 0;
                }
                EmptyList emptyList3 = arrayList11 == 0 ? emptyList : arrayList11;
                ProductShoppingList uiModel2 = ProductCardListExtKt.toUiModel(productCard.r);
                ProductCard.InStoreDetails inStoreDetails = productCard.s;
                InstoreDetailsData uiModel3 = inStoreDetails != null ? ProductCardInStoreDetailsExtKt.toUiModel(inStoreDetails) : null;
                PurchaseRestriction purchaseRestriction = productCard.d;
                au.com.woolworths.product.models.PurchaseRestriction uiModel4 = purchaseRestriction != null ? PurchaseRestrictionExtKt.toUiModel(purchaseRestriction) : null;
                List<ProductCard.InlineLabel> list3 = productCard.o;
                if (list3 != null) {
                    arrayList12 = new ArrayList();
                    for (ProductCard.InlineLabel inlineLabel : list3) {
                        ProductInlineLabelApiData uiModel5 = inlineLabel != null ? ProductCardInlineLabelExtKt.toUiModel(inlineLabel) : null;
                        if (uiModel5 != null) {
                            arrayList12.add(uiModel5);
                        }
                    }
                } else {
                    arrayList12 = 0;
                }
                EmptyList emptyList4 = arrayList12 == 0 ? emptyList : arrayList12;
                ProductCard.PromotionInfo promotionInfo = productCard.k;
                PromotionInfo uiModel6 = promotionInfo != null ? ProductCardPromotionInfoExtKt.toUiModel(promotionInfo) : null;
                String str30 = productCard.u;
                String str31 = productCard.v;
                ProductCard.Marketplace marketplace = productCard.w;
                ProductListMarketplace uiModel7 = marketplace != null ? ProductCardMarketplaceExtKt.toUiModel(marketplace) : null;
                ProductCard.RewardsOfferInfo rewardsOfferInfo = productCard.x;
                RewardsOfferInfo uiModel8 = rewardsOfferInfo != null ? ProductCardRewardsOfferInfoExtKt.toUiModel(rewardsOfferInfo) : null;
                String str32 = productCard.y;
                ProductCard.TagLabel tagLabel = productCard.z;
                TagLabel uiModel9 = tagLabel != null ? ProductCardTagLabelExtKt.toUiModel(tagLabel) : null;
                ProductCard.InStoreAvailabilityInfo inStoreAvailabilityInfo = productCard.g;
                InStoreAvailabilityInfo uiModel10 = inStoreAvailabilityInfo != null ? ProductCardInStoreAvailabilityInfoExtKt.toUiModel(inStoreAvailabilityInfo) : null;
                ProductCard.ProductVarieties productVarieties = productCard.A;
                ProductVarieties uiModel11 = productVarieties != null ? ProductCardProductVarietiesExtKt.toUiModel(productVarieties) : null;
                List list4 = productCard.B;
                if (list4 != null) {
                    List list5 = list4;
                    str20 = str30;
                    str21 = str31;
                    arrayList13 = new ArrayList(CollectionsKt.s(list5, 10));
                    Iterator it5 = list5.iterator();
                    while (it5.hasNext()) {
                        arrayList13.add(ProductCardCategoryExtKt.toUiModel((ProductCard.Category) it5.next()));
                    }
                } else {
                    str20 = str30;
                    str21 = str31;
                    arrayList13 = 0;
                }
                EmptyList emptyList5 = arrayList13 == 0 ? emptyList : arrayList13;
                boolean z3 = productCard.C;
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
                promotionGroup = new au.com.woolworths.product.models.ProductCard(str22, str23, str24, str25, num, str26, null, null, str19, z, z2, str18, null, null, str29, uiModel, emptyList3, uiModel2, uiModel3, uiModel4, emptyList4, uiModel6, str20, str21, uiModel7, uiModel8, str32, uiModel9, uiModel10, uiModel11, emptyList5, z3, uiModel12, uiModel13, uiModel14, uiModel15, uiModel16, null, productCardAction != null ? ProductCardProductCardActionExtKt.toUiModel(productCardAction) : null, productCard.I, 12480, 32, null);
            } else {
                it = it3;
                CataloguePromotionListingQuery.OnProductHeroCard onProductHeroCard = item.c;
                if (onProductHeroCard != null) {
                    ProductCard productCard2 = onProductHeroCard.f21695a.b;
                    String str33 = productCard2.f8949a;
                    String str34 = productCard2.b;
                    String str35 = productCard2.e;
                    String str36 = productCard2.j;
                    Integer num2 = productCard2.h;
                    String str37 = productCard2.i;
                    String str38 = productCard2.l;
                    boolean z4 = productCard2.f;
                    boolean z5 = productCard2.c;
                    String str39 = productCard2.m;
                    String str40 = productCard2.n;
                    ProductCard.Trolley trolley2 = productCard2.p;
                    ProductTrolleyData uiModel17 = trolley2 != null ? ProductCardKt.toUiModel(trolley2) : null;
                    List list6 = productCard2.q;
                    if (list6 != null) {
                        List list7 = list6;
                        str13 = str33;
                        str14 = str34;
                        str15 = str35;
                        arrayList8 = new ArrayList(CollectionsKt.s(list7, 10));
                        Iterator it6 = list7.iterator();
                        while (it6.hasNext()) {
                            arrayList8.add(ProductCardKt.toUiModel((ProductCard.Trolley1) it6.next()));
                        }
                    } else {
                        str13 = str33;
                        str14 = str34;
                        str15 = str35;
                        arrayList8 = 0;
                    }
                    EmptyList emptyList6 = arrayList8 == 0 ? emptyList2 : arrayList8;
                    ProductShoppingList uiModel18 = ProductCardListExtKt.toUiModel(productCard2.r);
                    ProductCard.InStoreDetails inStoreDetails2 = productCard2.s;
                    InstoreDetailsData uiModel19 = inStoreDetails2 != null ? ProductCardInStoreDetailsExtKt.toUiModel(inStoreDetails2) : null;
                    PurchaseRestriction purchaseRestriction2 = productCard2.d;
                    au.com.woolworths.product.models.PurchaseRestriction uiModel20 = purchaseRestriction2 != null ? PurchaseRestrictionExtKt.toUiModel(purchaseRestriction2) : null;
                    List<ProductCard.InlineLabel> list8 = productCard2.o;
                    if (list8 != null) {
                        arrayList9 = new ArrayList();
                        for (ProductCard.InlineLabel inlineLabel2 : list8) {
                            ProductInlineLabelApiData uiModel21 = inlineLabel2 != null ? ProductCardInlineLabelExtKt.toUiModel(inlineLabel2) : null;
                            if (uiModel21 != null) {
                                arrayList9.add(uiModel21);
                            }
                        }
                    } else {
                        arrayList9 = 0;
                    }
                    EmptyList emptyList7 = arrayList9 == 0 ? emptyList2 : arrayList9;
                    ProductCard.PromotionInfo promotionInfo2 = productCard2.k;
                    PromotionInfo uiModel22 = promotionInfo2 != null ? ProductCardPromotionInfoExtKt.toUiModel(promotionInfo2) : null;
                    String str41 = productCard2.u;
                    String str42 = productCard2.v;
                    ProductCard.Marketplace marketplace2 = productCard2.w;
                    ProductListMarketplace uiModel23 = marketplace2 != null ? ProductCardMarketplaceExtKt.toUiModel(marketplace2) : null;
                    ProductCard.RewardsOfferInfo rewardsOfferInfo2 = productCard2.x;
                    RewardsOfferInfo uiModel24 = rewardsOfferInfo2 != null ? ProductCardRewardsOfferInfoExtKt.toUiModel(rewardsOfferInfo2) : null;
                    String str43 = productCard2.y;
                    ProductCard.TagLabel tagLabel2 = productCard2.z;
                    TagLabel uiModel25 = tagLabel2 != null ? ProductCardTagLabelExtKt.toUiModel(tagLabel2) : null;
                    ProductCard.InStoreAvailabilityInfo inStoreAvailabilityInfo2 = productCard2.g;
                    InStoreAvailabilityInfo uiModel26 = inStoreAvailabilityInfo2 != null ? ProductCardInStoreAvailabilityInfoExtKt.toUiModel(inStoreAvailabilityInfo2) : null;
                    ProductCard.ProductVarieties productVarieties2 = productCard2.A;
                    ProductVarieties uiModel27 = productVarieties2 != null ? ProductCardProductVarietiesExtKt.toUiModel(productVarieties2) : null;
                    List list9 = productCard2.B;
                    if (list9 != null) {
                        List list10 = list9;
                        str16 = str41;
                        str17 = str42;
                        arrayList10 = new ArrayList(CollectionsKt.s(list10, 10));
                        Iterator it7 = list10.iterator();
                        while (it7.hasNext()) {
                            arrayList10.add(ProductCardCategoryExtKt.toUiModel((ProductCard.Category) it7.next()));
                        }
                    } else {
                        str16 = str41;
                        str17 = str42;
                        arrayList10 = 0;
                    }
                    EmptyList emptyList8 = arrayList10 == 0 ? emptyList2 : arrayList10;
                    boolean z6 = productCard2.C;
                    ProductCard.MultiBuyPriceInfo multiBuyPriceInfo2 = productCard2.E;
                    MultiBuyPriceInfo uiModel28 = multiBuyPriceInfo2 != null ? ProductCardMultiBuyPriceInfoExtKt.toUiModel(multiBuyPriceInfo2) : null;
                    ProductCard.MemberPriceInfo memberPriceInfo2 = productCard2.D;
                    MemberPriceInfo uiModel29 = memberPriceInfo2 != null ? ProductCardMemberPriceInfoExtKt.toUiModel(memberPriceInfo2) : null;
                    ProductCard.CartProductInfo cartProductInfo2 = productCard2.F;
                    CartProductInfo uiModel30 = cartProductInfo2 != null ? ProductCardCartProductInfoExtKt.toUiModel(cartProductInfo2) : null;
                    ProductCard.InStoreLocation inStoreLocation2 = productCard2.t;
                    InStoreLocationData uiModel31 = inStoreLocation2 != null ? ProductCardInStoreLocationExtKt.toUiModel(inStoreLocation2) : null;
                    ProductCard.ProductCardAnalytics productCardAnalytics2 = productCard2.G;
                    AnalyticsData uiModel32 = productCardAnalytics2 != null ? ProductCardProductCardAnalyticsExtKt.toUiModel(productCardAnalytics2) : null;
                    ProductCard.ProductCardAction productCardAction2 = productCard2.H;
                    promotionGroup = new ProductHeroCard(new au.com.woolworths.product.models.ProductCard(str13, str14, str15, str36, num2, str37, null, null, str38, z4, z5, str39, null, null, str40, uiModel17, emptyList6, uiModel18, uiModel19, uiModel20, emptyList7, uiModel22, str16, str17, uiModel23, uiModel24, str43, uiModel25, uiModel26, uiModel27, emptyList8, z6, uiModel28, uiModel29, uiModel30, uiModel31, uiModel32, null, productCardAction2 != null ? ProductCardProductCardActionExtKt.toUiModel(productCardAction2) : null, productCard2.I, 12480, 32, null));
                } else {
                    CataloguePromotionListingQuery.OnCataloguePromotionGroup onCataloguePromotionGroup = item.d;
                    if (onCataloguePromotionGroup != null) {
                        CataloguePromotionListingQuery.CataloguePromotionGroupBadge cataloguePromotionGroupBadge = onCataloguePromotionGroup.f21692a;
                        ImageWithAltText imageWithAltText = cataloguePromotionGroupBadge != null ? new ImageWithAltText(cataloguePromotionGroupBadge.b, cataloguePromotionGroupBadge.f21686a) : null;
                        String str44 = onCataloguePromotionGroup.b;
                        List list11 = onCataloguePromotionGroup.c;
                        if (list11 != null) {
                            arrayList = new ArrayList();
                            Iterator it8 = list11.iterator();
                            while (it8.hasNext()) {
                                CataloguePromotionListingQuery.CataloguePromotionGroupItem cataloguePromotionGroupItem = (CataloguePromotionListingQuery.CataloguePromotionGroupItem) it8.next();
                                CataloguePromotionListingQuery.OnProductCard1 onProductCard1 = cataloguePromotionGroupItem.b;
                                if (onProductCard1 != null) {
                                    ProductCard productCard3 = onProductCard1.b;
                                    String str45 = productCard3.f8949a;
                                    String str46 = productCard3.b;
                                    String str47 = productCard3.e;
                                    String str48 = productCard3.j;
                                    Integer num3 = productCard3.h;
                                    String str49 = productCard3.i;
                                    String str50 = productCard3.l;
                                    boolean z7 = productCard3.f;
                                    boolean z8 = productCard3.c;
                                    it2 = it8;
                                    String str51 = productCard3.m;
                                    String str52 = productCard3.n;
                                    ProductCard.Trolley trolley3 = productCard3.p;
                                    ProductTrolleyData uiModel33 = trolley3 != null ? ProductCardKt.toUiModel(trolley3) : null;
                                    List list12 = productCard3.q;
                                    if (list12 != null) {
                                        List list13 = list12;
                                        str7 = str45;
                                        str8 = str46;
                                        str9 = str47;
                                        arrayList5 = new ArrayList(CollectionsKt.s(list13, 10));
                                        Iterator it9 = list13.iterator();
                                        while (it9.hasNext()) {
                                            arrayList5.add(ProductCardKt.toUiModel((ProductCard.Trolley1) it9.next()));
                                        }
                                    } else {
                                        str7 = str45;
                                        str8 = str46;
                                        str9 = str47;
                                        arrayList5 = 0;
                                    }
                                    EmptyList emptyList9 = arrayList5 == 0 ? emptyList2 : arrayList5;
                                    ProductShoppingList uiModel34 = ProductCardListExtKt.toUiModel(productCard3.r);
                                    ProductCard.InStoreDetails inStoreDetails3 = productCard3.s;
                                    InstoreDetailsData uiModel35 = inStoreDetails3 != null ? ProductCardInStoreDetailsExtKt.toUiModel(inStoreDetails3) : null;
                                    PurchaseRestriction purchaseRestriction3 = productCard3.d;
                                    au.com.woolworths.product.models.PurchaseRestriction uiModel36 = purchaseRestriction3 != null ? PurchaseRestrictionExtKt.toUiModel(purchaseRestriction3) : null;
                                    List<ProductCard.InlineLabel> list14 = productCard3.o;
                                    if (list14 != null) {
                                        arrayList6 = new ArrayList();
                                        for (ProductCard.InlineLabel inlineLabel3 : list14) {
                                            ProductInlineLabelApiData uiModel37 = inlineLabel3 != null ? ProductCardInlineLabelExtKt.toUiModel(inlineLabel3) : null;
                                            if (uiModel37 != null) {
                                                arrayList6.add(uiModel37);
                                            }
                                        }
                                    } else {
                                        arrayList6 = 0;
                                    }
                                    EmptyList emptyList10 = arrayList6 == 0 ? emptyList2 : arrayList6;
                                    ProductCard.PromotionInfo promotionInfo3 = productCard3.k;
                                    PromotionInfo uiModel38 = promotionInfo3 != null ? ProductCardPromotionInfoExtKt.toUiModel(promotionInfo3) : null;
                                    String str53 = productCard3.u;
                                    String str54 = productCard3.v;
                                    ProductCard.Marketplace marketplace3 = productCard3.w;
                                    ProductListMarketplace uiModel39 = marketplace3 != null ? ProductCardMarketplaceExtKt.toUiModel(marketplace3) : null;
                                    ProductCard.RewardsOfferInfo rewardsOfferInfo3 = productCard3.x;
                                    RewardsOfferInfo uiModel40 = rewardsOfferInfo3 != null ? ProductCardRewardsOfferInfoExtKt.toUiModel(rewardsOfferInfo3) : null;
                                    String str55 = productCard3.y;
                                    ProductCard.TagLabel tagLabel3 = productCard3.z;
                                    TagLabel uiModel41 = tagLabel3 != null ? ProductCardTagLabelExtKt.toUiModel(tagLabel3) : null;
                                    ProductCard.InStoreAvailabilityInfo inStoreAvailabilityInfo3 = productCard3.g;
                                    InStoreAvailabilityInfo uiModel42 = inStoreAvailabilityInfo3 != null ? ProductCardInStoreAvailabilityInfoExtKt.toUiModel(inStoreAvailabilityInfo3) : null;
                                    ProductCard.ProductVarieties productVarieties3 = productCard3.A;
                                    ProductVarieties uiModel43 = productVarieties3 != null ? ProductCardProductVarietiesExtKt.toUiModel(productVarieties3) : null;
                                    List list15 = productCard3.B;
                                    if (list15 != null) {
                                        List list16 = list15;
                                        str10 = str53;
                                        str11 = str54;
                                        str12 = str55;
                                        arrayList7 = new ArrayList(CollectionsKt.s(list16, 10));
                                        Iterator it10 = list16.iterator();
                                        while (it10.hasNext()) {
                                            arrayList7.add(ProductCardCategoryExtKt.toUiModel((ProductCard.Category) it10.next()));
                                        }
                                    } else {
                                        str10 = str53;
                                        str11 = str54;
                                        str12 = str55;
                                        arrayList7 = 0;
                                    }
                                    EmptyList emptyList11 = arrayList7 == 0 ? emptyList2 : arrayList7;
                                    boolean z9 = productCard3.C;
                                    ProductCard.MultiBuyPriceInfo multiBuyPriceInfo3 = productCard3.E;
                                    MultiBuyPriceInfo uiModel44 = multiBuyPriceInfo3 != null ? ProductCardMultiBuyPriceInfoExtKt.toUiModel(multiBuyPriceInfo3) : null;
                                    ProductCard.MemberPriceInfo memberPriceInfo3 = productCard3.D;
                                    MemberPriceInfo uiModel45 = memberPriceInfo3 != null ? ProductCardMemberPriceInfoExtKt.toUiModel(memberPriceInfo3) : null;
                                    ProductCard.CartProductInfo cartProductInfo3 = productCard3.F;
                                    CartProductInfo uiModel46 = cartProductInfo3 != null ? ProductCardCartProductInfoExtKt.toUiModel(cartProductInfo3) : null;
                                    ProductCard.InStoreLocation inStoreLocation3 = productCard3.t;
                                    InStoreLocationData uiModel47 = inStoreLocation3 != null ? ProductCardInStoreLocationExtKt.toUiModel(inStoreLocation3) : null;
                                    ProductCard.ProductCardAnalytics productCardAnalytics3 = productCard3.G;
                                    AnalyticsData uiModel48 = productCardAnalytics3 != null ? ProductCardProductCardAnalyticsExtKt.toUiModel(productCardAnalytics3) : null;
                                    ProductCard.ProductCardAction productCardAction3 = productCard3.H;
                                    productHeroCard = new au.com.woolworths.product.models.ProductCard(str7, str8, str9, str48, num3, str49, null, null, str50, z7, z8, str51, null, null, str52, uiModel33, emptyList9, uiModel34, uiModel35, uiModel36, emptyList10, uiModel38, str10, str11, uiModel39, uiModel40, str12, uiModel41, uiModel42, uiModel43, emptyList11, z9, uiModel44, uiModel45, uiModel46, uiModel47, uiModel48, null, productCardAction3 != null ? ProductCardProductCardActionExtKt.toUiModel(productCardAction3) : null, productCard3.I, 12480, 32, null);
                                } else {
                                    it2 = it8;
                                    CataloguePromotionListingQuery.OnProductHeroCard1 onProductHeroCard1 = cataloguePromotionGroupItem.c;
                                    if (onProductHeroCard1 != null) {
                                        ProductCard productCard4 = onProductHeroCard1.f21696a.b;
                                        String str56 = productCard4.f8949a;
                                        String str57 = productCard4.b;
                                        String str58 = productCard4.e;
                                        String str59 = productCard4.j;
                                        Integer num4 = productCard4.h;
                                        String str60 = productCard4.i;
                                        String str61 = productCard4.l;
                                        boolean z10 = productCard4.f;
                                        boolean z11 = productCard4.c;
                                        String str62 = productCard4.m;
                                        String str63 = productCard4.n;
                                        ProductCard.Trolley trolley4 = productCard4.p;
                                        ProductTrolleyData uiModel49 = trolley4 != null ? ProductCardKt.toUiModel(trolley4) : null;
                                        List list17 = productCard4.q;
                                        if (list17 != null) {
                                            List list18 = list17;
                                            str = str57;
                                            str2 = str58;
                                            str3 = str59;
                                            arrayList2 = new ArrayList(CollectionsKt.s(list18, 10));
                                            Iterator it11 = list18.iterator();
                                            while (it11.hasNext()) {
                                                arrayList2.add(ProductCardKt.toUiModel((ProductCard.Trolley1) it11.next()));
                                            }
                                        } else {
                                            str = str57;
                                            str2 = str58;
                                            str3 = str59;
                                            arrayList2 = 0;
                                        }
                                        EmptyList emptyList12 = arrayList2 == 0 ? emptyList2 : arrayList2;
                                        ProductShoppingList uiModel50 = ProductCardListExtKt.toUiModel(productCard4.r);
                                        ProductCard.InStoreDetails inStoreDetails4 = productCard4.s;
                                        InstoreDetailsData uiModel51 = inStoreDetails4 != null ? ProductCardInStoreDetailsExtKt.toUiModel(inStoreDetails4) : null;
                                        PurchaseRestriction purchaseRestriction4 = productCard4.d;
                                        au.com.woolworths.product.models.PurchaseRestriction uiModel52 = purchaseRestriction4 != null ? PurchaseRestrictionExtKt.toUiModel(purchaseRestriction4) : null;
                                        List<ProductCard.InlineLabel> list19 = productCard4.o;
                                        if (list19 != null) {
                                            arrayList3 = new ArrayList();
                                            for (ProductCard.InlineLabel inlineLabel4 : list19) {
                                                ProductInlineLabelApiData uiModel53 = inlineLabel4 != null ? ProductCardInlineLabelExtKt.toUiModel(inlineLabel4) : null;
                                                if (uiModel53 != null) {
                                                    arrayList3.add(uiModel53);
                                                }
                                            }
                                        } else {
                                            arrayList3 = 0;
                                        }
                                        EmptyList emptyList13 = arrayList3 == 0 ? emptyList2 : arrayList3;
                                        ProductCard.PromotionInfo promotionInfo4 = productCard4.k;
                                        PromotionInfo uiModel54 = promotionInfo4 != null ? ProductCardPromotionInfoExtKt.toUiModel(promotionInfo4) : null;
                                        String str64 = productCard4.u;
                                        String str65 = productCard4.v;
                                        ProductCard.Marketplace marketplace4 = productCard4.w;
                                        ProductListMarketplace uiModel55 = marketplace4 != null ? ProductCardMarketplaceExtKt.toUiModel(marketplace4) : null;
                                        ProductCard.RewardsOfferInfo rewardsOfferInfo4 = productCard4.x;
                                        RewardsOfferInfo uiModel56 = rewardsOfferInfo4 != null ? ProductCardRewardsOfferInfoExtKt.toUiModel(rewardsOfferInfo4) : null;
                                        String str66 = productCard4.y;
                                        ProductCard.TagLabel tagLabel4 = productCard4.z;
                                        TagLabel uiModel57 = tagLabel4 != null ? ProductCardTagLabelExtKt.toUiModel(tagLabel4) : null;
                                        ProductCard.InStoreAvailabilityInfo inStoreAvailabilityInfo4 = productCard4.g;
                                        InStoreAvailabilityInfo uiModel58 = inStoreAvailabilityInfo4 != null ? ProductCardInStoreAvailabilityInfoExtKt.toUiModel(inStoreAvailabilityInfo4) : null;
                                        ProductCard.ProductVarieties productVarieties4 = productCard4.A;
                                        ProductVarieties uiModel59 = productVarieties4 != null ? ProductCardProductVarietiesExtKt.toUiModel(productVarieties4) : null;
                                        List list20 = productCard4.B;
                                        if (list20 != null) {
                                            List list21 = list20;
                                            str4 = str64;
                                            str5 = str65;
                                            str6 = str66;
                                            arrayList4 = new ArrayList(CollectionsKt.s(list21, 10));
                                            Iterator it12 = list21.iterator();
                                            while (it12.hasNext()) {
                                                arrayList4.add(ProductCardCategoryExtKt.toUiModel((ProductCard.Category) it12.next()));
                                            }
                                        } else {
                                            str4 = str64;
                                            str5 = str65;
                                            str6 = str66;
                                            arrayList4 = 0;
                                        }
                                        EmptyList emptyList14 = arrayList4 == 0 ? emptyList2 : arrayList4;
                                        boolean z12 = productCard4.C;
                                        ProductCard.MultiBuyPriceInfo multiBuyPriceInfo4 = productCard4.E;
                                        MultiBuyPriceInfo uiModel60 = multiBuyPriceInfo4 != null ? ProductCardMultiBuyPriceInfoExtKt.toUiModel(multiBuyPriceInfo4) : null;
                                        ProductCard.MemberPriceInfo memberPriceInfo4 = productCard4.D;
                                        MemberPriceInfo uiModel61 = memberPriceInfo4 != null ? ProductCardMemberPriceInfoExtKt.toUiModel(memberPriceInfo4) : null;
                                        ProductCard.CartProductInfo cartProductInfo4 = productCard4.F;
                                        CartProductInfo uiModel62 = cartProductInfo4 != null ? ProductCardCartProductInfoExtKt.toUiModel(cartProductInfo4) : null;
                                        ProductCard.InStoreLocation inStoreLocation4 = productCard4.t;
                                        InStoreLocationData uiModel63 = inStoreLocation4 != null ? ProductCardInStoreLocationExtKt.toUiModel(inStoreLocation4) : null;
                                        ProductCard.ProductCardAnalytics productCardAnalytics4 = productCard4.G;
                                        AnalyticsData uiModel64 = productCardAnalytics4 != null ? ProductCardProductCardAnalyticsExtKt.toUiModel(productCardAnalytics4) : null;
                                        ProductCard.ProductCardAction productCardAction4 = productCard4.H;
                                        productHeroCard = new ProductHeroCard(new au.com.woolworths.product.models.ProductCard(str56, str, str2, str3, num4, str60, null, null, str61, z10, z11, str62, null, null, str63, uiModel49, emptyList12, uiModel50, uiModel51, uiModel52, emptyList13, uiModel54, str4, str5, uiModel55, uiModel56, str6, uiModel57, uiModel58, uiModel59, emptyList14, z12, uiModel60, uiModel61, uiModel62, uiModel63, uiModel64, null, productCardAction4 != null ? ProductCardProductCardActionExtKt.toUiModel(productCardAction4) : null, productCard4.I, 12480, 32, null));
                                    } else {
                                        productHeroCard = null;
                                    }
                                }
                                if (productHeroCard != null) {
                                    arrayList.add(productHeroCard);
                                }
                                it8 = it2;
                            }
                        } else {
                            arrayList = 0;
                        }
                        promotionGroup = new PromotionGroup(imageWithAltText, str44, arrayList == 0 ? emptyList2 : arrayList);
                    } else {
                        promotionGroup = null;
                    }
                }
            }
            if (promotionGroup != null) {
                arrayList15.add(promotionGroup);
            }
            it3 = it;
        }
        return new PromotionListing(listingHeader, arrayList15);
    }
}
