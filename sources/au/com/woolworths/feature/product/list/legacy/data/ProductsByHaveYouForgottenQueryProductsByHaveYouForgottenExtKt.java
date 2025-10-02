package au.com.woolworths.feature.product.list.legacy.data;

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
import au.com.woolworths.product.models.ProductInlineLabelApiData;
import au.com.woolworths.product.models.ProductShoppingList;
import au.com.woolworths.product.models.ProductTrolleyData;
import au.com.woolworths.product.models.ProductVarieties;
import au.com.woolworths.product.models.RewardsOfferInfo;
import au.com.woolworths.product.models.TagLabel;
import au.com.woolworths.shop.graphql.type.PurchaseRestriction;
import au.com.woolworths.shop.legacy.graphql.ProductsByHaveYouForgottenQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list-legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductsByHaveYouForgottenQueryProductsByHaveYouForgottenExtKt {
    public static final ProductListByHaveYouForgottenApiData a(ProductsByHaveYouForgottenQuery.ProductsByHaveYouForgotten productsByHaveYouForgotten) {
        Iterator it;
        ProductCard productCard;
        boolean z;
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        List list;
        String str2;
        ArrayList arrayList3;
        Intrinsics.h(productsByHaveYouForgotten, "<this>");
        ArrayList arrayList4 = productsByHaveYouForgotten.b;
        ArrayList arrayList5 = new ArrayList();
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            ProductsByHaveYouForgottenQuery.OnProductCard onProductCard = ((ProductsByHaveYouForgottenQuery.ProductsFeed) it2.next()).b;
            if (onProductCard != null) {
                au.com.woolworths.graphql.common.fragment.ProductCard productCard2 = onProductCard.b;
                String str3 = productCard2.f8949a;
                String str4 = productCard2.b;
                String str5 = productCard2.e;
                String str6 = productCard2.j;
                Integer num = productCard2.h;
                String str7 = productCard2.i;
                String str8 = productCard2.l;
                boolean z2 = productCard2.f;
                boolean z3 = productCard2.c;
                String str9 = productCard2.m;
                String str10 = productCard2.n;
                ProductCard.Trolley trolley = productCard2.p;
                ProductTrolleyData uiModel = trolley != null ? ProductCardKt.toUiModel(trolley) : null;
                List list2 = productCard2.q;
                it = it2;
                if (list2 != null) {
                    List list3 = list2;
                    z = z3;
                    str = str3;
                    arrayList = new ArrayList(CollectionsKt.s(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(ProductCardKt.toUiModel((ProductCard.Trolley1) it3.next()));
                    }
                } else {
                    z = z3;
                    str = str3;
                    arrayList = null;
                }
                List list4 = EmptyList.d;
                List list5 = arrayList == null ? list4 : arrayList;
                ProductShoppingList uiModel2 = ProductCardListExtKt.toUiModel(productCard2.r);
                ProductCard.InStoreDetails inStoreDetails = productCard2.s;
                InstoreDetailsData uiModel3 = inStoreDetails != null ? ProductCardInStoreDetailsExtKt.toUiModel(inStoreDetails) : null;
                PurchaseRestriction purchaseRestriction = productCard2.d;
                au.com.woolworths.product.models.PurchaseRestriction uiModel4 = purchaseRestriction != null ? au.com.woolworths.product.models.PurchaseRestrictionExtKt.toUiModel(purchaseRestriction) : null;
                List<ProductCard.InlineLabel> list6 = productCard2.o;
                if (list6 != null) {
                    arrayList2 = new ArrayList();
                    for (ProductCard.InlineLabel inlineLabel : list6) {
                        ProductInlineLabelApiData uiModel5 = inlineLabel != null ? ProductCardInlineLabelExtKt.toUiModel(inlineLabel) : null;
                        if (uiModel5 != null) {
                            arrayList2.add(uiModel5);
                        }
                    }
                } else {
                    arrayList2 = null;
                }
                List list7 = arrayList2 == null ? list4 : arrayList2;
                ProductCard.PromotionInfo promotionInfo = productCard2.k;
                PromotionInfo uiModel6 = promotionInfo != null ? ProductCardPromotionInfoExtKt.toUiModel(promotionInfo) : null;
                String str11 = productCard2.u;
                String str12 = productCard2.v;
                ProductCard.Marketplace marketplace = productCard2.w;
                ProductListMarketplace uiModel7 = marketplace != null ? ProductCardMarketplaceExtKt.toUiModel(marketplace) : null;
                ProductCard.RewardsOfferInfo rewardsOfferInfo = productCard2.x;
                RewardsOfferInfo uiModel8 = rewardsOfferInfo != null ? ProductCardRewardsOfferInfoExtKt.toUiModel(rewardsOfferInfo) : null;
                String str13 = productCard2.y;
                ProductCard.TagLabel tagLabel = productCard2.z;
                TagLabel uiModel9 = tagLabel != null ? ProductCardTagLabelExtKt.toUiModel(tagLabel) : null;
                ProductCard.InStoreAvailabilityInfo inStoreAvailabilityInfo = productCard2.g;
                InStoreAvailabilityInfo uiModel10 = inStoreAvailabilityInfo != null ? ProductCardInStoreAvailabilityInfoExtKt.toUiModel(inStoreAvailabilityInfo) : null;
                ProductCard.ProductVarieties productVarieties = productCard2.A;
                ProductVarieties uiModel11 = productVarieties != null ? ProductCardProductVarietiesExtKt.toUiModel(productVarieties) : null;
                List list8 = productCard2.B;
                if (list8 != null) {
                    List list9 = list8;
                    list = list4;
                    str2 = str12;
                    arrayList3 = new ArrayList(CollectionsKt.s(list9, 10));
                    Iterator it4 = list9.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(ProductCardCategoryExtKt.toUiModel((ProductCard.Category) it4.next()));
                    }
                } else {
                    list = list4;
                    str2 = str12;
                    arrayList3 = null;
                }
                List list10 = arrayList3 == null ? list : arrayList3;
                boolean z4 = productCard2.C;
                ProductCard.MultiBuyPriceInfo multiBuyPriceInfo = productCard2.E;
                MultiBuyPriceInfo uiModel12 = multiBuyPriceInfo != null ? ProductCardMultiBuyPriceInfoExtKt.toUiModel(multiBuyPriceInfo) : null;
                ProductCard.MemberPriceInfo memberPriceInfo = productCard2.D;
                MemberPriceInfo uiModel13 = memberPriceInfo != null ? ProductCardMemberPriceInfoExtKt.toUiModel(memberPriceInfo) : null;
                ProductCard.CartProductInfo cartProductInfo = productCard2.F;
                CartProductInfo uiModel14 = cartProductInfo != null ? ProductCardCartProductInfoExtKt.toUiModel(cartProductInfo) : null;
                ProductCard.InStoreLocation inStoreLocation = productCard2.t;
                InStoreLocationData uiModel15 = inStoreLocation != null ? ProductCardInStoreLocationExtKt.toUiModel(inStoreLocation) : null;
                ProductCard.ProductCardAnalytics productCardAnalytics = productCard2.G;
                AnalyticsData uiModel16 = productCardAnalytics != null ? ProductCardProductCardAnalyticsExtKt.toUiModel(productCardAnalytics) : null;
                ProductCard.ProductCardAction productCardAction = productCard2.H;
                productCard = new au.com.woolworths.product.models.ProductCard(str, str4, str5, str6, num, str7, null, null, str8, z2, z, str9, null, null, str10, uiModel, list5, uiModel2, uiModel3, uiModel4, list7, uiModel6, str11, str2, uiModel7, uiModel8, str13, uiModel9, uiModel10, uiModel11, list10, z4, uiModel12, uiModel13, uiModel14, uiModel15, uiModel16, null, productCardAction != null ? ProductCardProductCardActionExtKt.toUiModel(productCardAction) : null, productCard2.I, 12480, 32, null);
            } else {
                it = it2;
                productCard = null;
            }
            if (productCard != null) {
                arrayList5.add(productCard);
            }
            it2 = it;
        }
        return new ProductListByHaveYouForgottenApiData(productsByHaveYouForgotten.f12162a, arrayList5);
    }
}
