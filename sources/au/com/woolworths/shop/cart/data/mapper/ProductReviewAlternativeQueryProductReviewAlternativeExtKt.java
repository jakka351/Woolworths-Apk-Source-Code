package au.com.woolworths.shop.cart.data.mapper;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.android.onesite.models.products.ProductListMarketplace;
import au.com.woolworths.android.onesite.models.products.PromotionInfo;
import au.com.woolworths.base.shopapp.data.models.CartProductInfo;
import au.com.woolworths.base.shopapp.modules.badge.BadgeApiData;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantityInfo;
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
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.cart.domain.model.ProductReviewAlternativeResponseData;
import au.com.woolworths.shop.cart.domain.model.ProductReviewAlternativeResponseInfoCta;
import au.com.woolworths.shop.cart.domain.model.ProductReviewAlternativeResponseInfoData;
import au.com.woolworths.shop.cart.domain.model.ProductReviewCard;
import au.com.woolworths.shop.graphql.type.PurchaseRestriction;
import com.woolworths.shop.cart.ProductReviewAlternativeQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-cart_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductReviewAlternativeQueryProductReviewAlternativeExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v38, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v39, types: [java.util.ArrayList] */
    public static final ProductReviewAlternativeResponseData a(ProductReviewAlternativeQuery.ProductReviewAlternative productReviewAlternative) {
        String str;
        String str2;
        CartProductQuantityInfo cartProductQuantityInfo;
        EmptyList emptyList;
        String str3;
        ArrayList arrayList;
        String str4;
        AnalyticsData analyticsData;
        String str5;
        String str6;
        String str7;
        ?? arrayList2;
        ?? arrayList3;
        String str8;
        ?? arrayList4;
        String str9;
        EmptyList emptyList2;
        String str10;
        ?? arrayList5;
        ?? arrayList6;
        String str11;
        String str12;
        String str13;
        ?? arrayList7;
        ProductReviewAlternativeQuery.Product product = productReviewAlternative.e;
        String str14 = product.f21547a;
        String str15 = product.b;
        double d = product.c;
        String str16 = product.d;
        ProductReviewAlternativeQuery.Badge badge = product.e;
        BadgeApiData badgeApiData = badge != null ? new BadgeApiData(badge.f21540a, BadgeTypeExtKt.a(badge.b), null) : null;
        ProductReviewAlternativeQuery.QuantityInfo quantityInfo = product.f;
        if (quantityInfo != null) {
            str = str14;
            str2 = str15;
            cartProductQuantityInfo = new CartProductQuantityInfo(quantityInfo.f21549a, quantityInfo.b, quantityInfo.c, quantityInfo.d, quantityInfo.e);
        } else {
            str = str14;
            str2 = str15;
            cartProductQuantityInfo = null;
        }
        ProductReviewCard productReviewCard = new ProductReviewCard(str, str2, d, str16, badgeApiData, cartProductQuantityInfo, product.g, product.i, null, product.h, null);
        ArrayList arrayList8 = productReviewAlternative.f;
        ArrayList arrayList9 = new ArrayList(CollectionsKt.s(arrayList8, 10));
        Iterator it = arrayList8.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            emptyList = EmptyList.d;
            if (!zHasNext) {
                break;
            }
            ProductReviewAlternativeQuery.Alternative alternative = (ProductReviewAlternativeQuery.Alternative) it.next();
            Intrinsics.h(alternative, "<this>");
            ProductCard productCard = alternative.b;
            String str17 = productCard.f8949a;
            String str18 = productCard.b;
            String str19 = productCard.e;
            String str20 = productCard.j;
            Integer num = productCard.h;
            String str21 = productCard.i;
            String str22 = productCard.l;
            boolean z = productCard.f;
            boolean z2 = productCard.c;
            String str23 = productCard.m;
            String str24 = productCard.n;
            Iterator it2 = it;
            ProductCard.Trolley trolley = productCard.p;
            ProductTrolleyData uiModel = trolley != null ? ProductCardKt.toUiModel(trolley) : null;
            List list = productCard.q;
            if (list != null) {
                List list2 = list;
                str9 = str24;
                emptyList2 = emptyList;
                str10 = str17;
                arrayList5 = new ArrayList(CollectionsKt.s(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(ProductCardKt.toUiModel((ProductCard.Trolley1) it3.next()));
                }
            } else {
                str9 = str24;
                emptyList2 = emptyList;
                str10 = str17;
                arrayList5 = 0;
            }
            EmptyList emptyList3 = arrayList5 == 0 ? emptyList2 : arrayList5;
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
            EmptyList emptyList4 = arrayList6 == 0 ? emptyList2 : arrayList6;
            ProductCard.PromotionInfo promotionInfo = productCard.k;
            PromotionInfo uiModel6 = promotionInfo != null ? ProductCardPromotionInfoExtKt.toUiModel(promotionInfo) : null;
            String str25 = productCard.u;
            String str26 = productCard.v;
            ProductCard.Marketplace marketplace = productCard.w;
            ProductListMarketplace uiModel7 = marketplace != null ? ProductCardMarketplaceExtKt.toUiModel(marketplace) : null;
            ProductCard.RewardsOfferInfo rewardsOfferInfo = productCard.x;
            RewardsOfferInfo uiModel8 = rewardsOfferInfo != null ? ProductCardRewardsOfferInfoExtKt.toUiModel(rewardsOfferInfo) : null;
            String str27 = productCard.y;
            ProductCard.TagLabel tagLabel = productCard.z;
            TagLabel uiModel9 = tagLabel != null ? ProductCardTagLabelExtKt.toUiModel(tagLabel) : null;
            ProductCard.InStoreAvailabilityInfo inStoreAvailabilityInfo = productCard.g;
            InStoreAvailabilityInfo uiModel10 = inStoreAvailabilityInfo != null ? ProductCardInStoreAvailabilityInfoExtKt.toUiModel(inStoreAvailabilityInfo) : null;
            ProductCard.ProductVarieties productVarieties = productCard.A;
            ProductVarieties uiModel11 = productVarieties != null ? ProductCardProductVarietiesExtKt.toUiModel(productVarieties) : null;
            List list4 = productCard.B;
            if (list4 != null) {
                List list5 = list4;
                str11 = str25;
                str12 = str26;
                str13 = str27;
                arrayList7 = new ArrayList(CollectionsKt.s(list5, 10));
                Iterator it4 = list5.iterator();
                while (it4.hasNext()) {
                    arrayList7.add(ProductCardCategoryExtKt.toUiModel((ProductCard.Category) it4.next()));
                }
            } else {
                str11 = str25;
                str12 = str26;
                str13 = str27;
                arrayList7 = 0;
            }
            EmptyList emptyList5 = arrayList7 == 0 ? emptyList2 : arrayList7;
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
            arrayList9.add(new au.com.woolworths.product.models.ProductCard(str10, str18, str19, str20, num, str21, null, null, str22, z, z2, str23, null, null, str9, uiModel, emptyList3, uiModel2, uiModel3, uiModel4, emptyList4, uiModel6, str11, str12, uiModel7, uiModel8, str13, uiModel9, uiModel10, uiModel11, emptyList5, z3, uiModel12, uiModel13, uiModel14, uiModel15, uiModel16, null, productCardAction != null ? ProductCardProductCardActionExtKt.toUiModel(productCardAction) : null, productCard.I, 12480, 32, null));
            it = it2;
        }
        String str28 = productReviewAlternative.f21548a;
        String str29 = productReviewAlternative.b;
        String str30 = productReviewAlternative.c;
        String str31 = productReviewAlternative.d;
        ProductReviewAlternativeQuery.Info info = productReviewAlternative.g;
        String str32 = info.f21542a;
        String str33 = info.b;
        ProductReviewAlternativeQuery.PrimaryCta primaryCta = info.c;
        String str34 = primaryCta.f21546a;
        ProductReviewAlternativeQuery.OnCtaClickAnalytics onCtaClickAnalytics = primaryCta.b;
        if (onCtaClickAnalytics != null) {
            AnalyticsFields analyticsFields = onCtaClickAnalytics.b;
            String str35 = analyticsFields.f10032a;
            String str36 = analyticsFields.b;
            String str37 = analyticsFields.c;
            str3 = str28;
            String str38 = analyticsFields.e;
            String str39 = analyticsFields.f;
            String str40 = analyticsFields.g;
            String str41 = analyticsFields.d;
            String str42 = analyticsFields.h;
            String str43 = analyticsFields.i;
            List list6 = analyticsFields.j;
            if (list6 != null) {
                List list7 = list6;
                str8 = str43;
                arrayList = arrayList9;
                str4 = str29;
                arrayList4 = new ArrayList(CollectionsKt.s(list7, 10));
                Iterator it5 = list7.iterator();
                while (it5.hasNext()) {
                    arrayList4.add(au.com.woolworths.product.models.AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it5.next()));
                }
            } else {
                str8 = str43;
                arrayList = arrayList9;
                str4 = str29;
                arrayList4 = 0;
            }
            analyticsData = new AnalyticsData((EventConfig) null, str35, str36, str37, str38, str39, str40, str41, str42, str8, arrayList4 == 0 ? emptyList : arrayList4, 1, (DefaultConstructorMarker) null);
        } else {
            str3 = str28;
            arrayList = arrayList9;
            str4 = str29;
            analyticsData = null;
        }
        ProductReviewAlternativeResponseInfoCta productReviewAlternativeResponseInfoCta = new ProductReviewAlternativeResponseInfoCta(str34, analyticsData);
        AnalyticsFields analyticsFields2 = info.d.b;
        String str44 = analyticsFields2.f10032a;
        String str45 = analyticsFields2.b;
        String str46 = analyticsFields2.c;
        String str47 = analyticsFields2.e;
        String str48 = analyticsFields2.f;
        String str49 = analyticsFields2.g;
        String str50 = analyticsFields2.d;
        String str51 = analyticsFields2.h;
        String str52 = analyticsFields2.i;
        List list8 = analyticsFields2.j;
        if (list8 != null) {
            List list9 = list8;
            str5 = str52;
            str6 = str45;
            str7 = str30;
            arrayList2 = new ArrayList(CollectionsKt.s(list9, 10));
            Iterator it6 = list9.iterator();
            while (it6.hasNext()) {
                arrayList2.add(au.com.woolworths.product.models.AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it6.next()));
            }
        } else {
            str5 = str52;
            str6 = str45;
            str7 = str30;
            arrayList2 = 0;
        }
        ProductReviewAlternativeResponseInfoData productReviewAlternativeResponseInfoData = new ProductReviewAlternativeResponseInfoData(str32, str33, productReviewAlternativeResponseInfoCta, new AnalyticsData((EventConfig) null, str44, str6, str46, str47, str48, str49, str50, str51, str5, arrayList2 == 0 ? emptyList : arrayList2, 1, (DefaultConstructorMarker) null));
        AnalyticsFields analyticsFields3 = productReviewAlternative.h.b;
        String str53 = analyticsFields3.f10032a;
        String str54 = analyticsFields3.b;
        String str55 = analyticsFields3.c;
        String str56 = analyticsFields3.e;
        String str57 = analyticsFields3.f;
        String str58 = analyticsFields3.g;
        String str59 = analyticsFields3.d;
        String str60 = analyticsFields3.h;
        String str61 = analyticsFields3.i;
        List list10 = analyticsFields3.j;
        if (list10 != null) {
            List list11 = list10;
            arrayList3 = new ArrayList(CollectionsKt.s(list11, 10));
            Iterator it7 = list11.iterator();
            while (it7.hasNext()) {
                arrayList3.add(au.com.woolworths.product.models.AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it7.next()));
            }
        } else {
            arrayList3 = 0;
        }
        return new ProductReviewAlternativeResponseData(productReviewCard, arrayList, str3, str4, str7, str31, productReviewAlternativeResponseInfoData, new AnalyticsData((EventConfig) null, str53, str54, str55, str56, str57, str58, str59, str60, str61, arrayList3 == 0 ? emptyList : arrayList3, 1, (DefaultConstructorMarker) null));
    }
}
