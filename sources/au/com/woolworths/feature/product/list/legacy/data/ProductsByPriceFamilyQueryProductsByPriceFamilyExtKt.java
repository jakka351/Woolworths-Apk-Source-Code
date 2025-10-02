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
import com.woolworths.product.list.legacy.ProductsByPriceFamilyQuery;
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
public final class ProductsByPriceFamilyQueryProductsByPriceFamilyExtKt {
    public static final ProductListByPriceFamilyApiData a(ProductsByPriceFamilyQuery.ProductsByPriceFamily productsByPriceFamily) {
        Iterator it;
        ProductCard productCard;
        ProductsByPriceFamilyQuery.OnProductCard onProductCard;
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        List list;
        ArrayList arrayList3;
        Integer totalNumberOfProducts = productsByPriceFamily.getTotalNumberOfProducts();
        List<ProductsByPriceFamilyQuery.ProductsFeed> productsFeed = productsByPriceFamily.getProductsFeed();
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = productsFeed.iterator();
        while (it2.hasNext()) {
            ProductsByPriceFamilyQuery.ProductsFeed productsFeed2 = (ProductsByPriceFamilyQuery.ProductsFeed) it2.next();
            if (productsFeed2.getOnProductCard() != null) {
                ProductsByPriceFamilyQuery.OnProductCard onProductCard2 = productsFeed2.getOnProductCard();
                Intrinsics.h(onProductCard2, "<this>");
                String str2 = onProductCard2.getProductCard().f8949a;
                String str3 = onProductCard2.getProductCard().b;
                String str4 = onProductCard2.getProductCard().e;
                String str5 = onProductCard2.getProductCard().j;
                Integer num = onProductCard2.getProductCard().h;
                String str6 = onProductCard2.getProductCard().i;
                String str7 = onProductCard2.getProductCard().l;
                boolean z2 = onProductCard2.getProductCard().f;
                boolean z3 = onProductCard2.getProductCard().c;
                String str8 = onProductCard2.getProductCard().m;
                String str9 = onProductCard2.getProductCard().n;
                ProductCard.Trolley trolley = onProductCard2.getProductCard().p;
                ProductTrolleyData uiModel = trolley != null ? ProductCardKt.toUiModel(trolley) : null;
                List list2 = onProductCard2.getProductCard().q;
                it = it2;
                if (list2 != null) {
                    List list3 = list2;
                    onProductCard = onProductCard2;
                    z = z2;
                    arrayList = new ArrayList(CollectionsKt.s(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(ProductCardKt.toUiModel((ProductCard.Trolley1) it3.next()));
                    }
                } else {
                    onProductCard = onProductCard2;
                    z = z2;
                    arrayList = null;
                }
                List list4 = EmptyList.d;
                List list5 = arrayList == null ? list4 : arrayList;
                ProductShoppingList uiModel2 = ProductCardListExtKt.toUiModel(onProductCard.getProductCard().r);
                ProductCard.InStoreDetails inStoreDetails = onProductCard.getProductCard().s;
                InstoreDetailsData uiModel3 = inStoreDetails != null ? ProductCardInStoreDetailsExtKt.toUiModel(inStoreDetails) : null;
                PurchaseRestriction purchaseRestriction = onProductCard.getProductCard().d;
                au.com.woolworths.product.models.PurchaseRestriction uiModel4 = purchaseRestriction != null ? au.com.woolworths.product.models.PurchaseRestrictionExtKt.toUiModel(purchaseRestriction) : null;
                List<ProductCard.InlineLabel> list6 = onProductCard.getProductCard().o;
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
                ProductCard.PromotionInfo promotionInfo = onProductCard.getProductCard().k;
                PromotionInfo uiModel6 = promotionInfo != null ? ProductCardPromotionInfoExtKt.toUiModel(promotionInfo) : null;
                String str10 = onProductCard.getProductCard().u;
                String str11 = onProductCard.getProductCard().v;
                ProductCard.Marketplace marketplace = onProductCard.getProductCard().w;
                ProductListMarketplace uiModel7 = marketplace != null ? ProductCardMarketplaceExtKt.toUiModel(marketplace) : null;
                ProductCard.RewardsOfferInfo rewardsOfferInfo = onProductCard.getProductCard().x;
                RewardsOfferInfo uiModel8 = rewardsOfferInfo != null ? ProductCardRewardsOfferInfoExtKt.toUiModel(rewardsOfferInfo) : null;
                String str12 = onProductCard.getProductCard().y;
                ProductCard.TagLabel tagLabel = onProductCard.getProductCard().z;
                TagLabel uiModel9 = tagLabel != null ? ProductCardTagLabelExtKt.toUiModel(tagLabel) : null;
                ProductCard.InStoreAvailabilityInfo inStoreAvailabilityInfo = onProductCard.getProductCard().g;
                InStoreAvailabilityInfo uiModel10 = inStoreAvailabilityInfo != null ? ProductCardInStoreAvailabilityInfoExtKt.toUiModel(inStoreAvailabilityInfo) : null;
                ProductCard.ProductVarieties productVarieties = onProductCard.getProductCard().A;
                ProductVarieties uiModel11 = productVarieties != null ? ProductCardProductVarietiesExtKt.toUiModel(productVarieties) : null;
                List list8 = onProductCard.getProductCard().B;
                if (list8 != null) {
                    List list9 = list8;
                    str = str11;
                    list = list4;
                    arrayList3 = new ArrayList(CollectionsKt.s(list9, 10));
                    Iterator it4 = list9.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(ProductCardCategoryExtKt.toUiModel((ProductCard.Category) it4.next()));
                    }
                } else {
                    str = str11;
                    list = list4;
                    arrayList3 = null;
                }
                List list10 = arrayList3 == null ? list : arrayList3;
                boolean z4 = onProductCard.getProductCard().C;
                ProductCard.MultiBuyPriceInfo multiBuyPriceInfo = onProductCard.getProductCard().E;
                MultiBuyPriceInfo uiModel12 = multiBuyPriceInfo != null ? ProductCardMultiBuyPriceInfoExtKt.toUiModel(multiBuyPriceInfo) : null;
                ProductCard.MemberPriceInfo memberPriceInfo = onProductCard.getProductCard().D;
                MemberPriceInfo uiModel13 = memberPriceInfo != null ? ProductCardMemberPriceInfoExtKt.toUiModel(memberPriceInfo) : null;
                ProductCard.CartProductInfo cartProductInfo = onProductCard.getProductCard().F;
                CartProductInfo uiModel14 = cartProductInfo != null ? ProductCardCartProductInfoExtKt.toUiModel(cartProductInfo) : null;
                ProductCard.InStoreLocation inStoreLocation = onProductCard.getProductCard().t;
                InStoreLocationData uiModel15 = inStoreLocation != null ? ProductCardInStoreLocationExtKt.toUiModel(inStoreLocation) : null;
                ProductCard.ProductCardAnalytics productCardAnalytics = onProductCard.getProductCard().G;
                AnalyticsData uiModel16 = productCardAnalytics != null ? ProductCardProductCardAnalyticsExtKt.toUiModel(productCardAnalytics) : null;
                ProductCard.ProductCardAction productCardAction = onProductCard.getProductCard().H;
                productCard = new au.com.woolworths.product.models.ProductCard(str2, str3, str4, str5, num, str6, null, null, str7, z, z3, str8, null, null, str9, uiModel, list5, uiModel2, uiModel3, uiModel4, list7, uiModel6, str10, str, uiModel7, uiModel8, str12, uiModel9, uiModel10, uiModel11, list10, z4, uiModel12, uiModel13, uiModel14, uiModel15, uiModel16, null, productCardAction != null ? ProductCardProductCardActionExtKt.toUiModel(productCardAction) : null, onProductCard.getProductCard().I, 12480, 32, null);
            } else {
                it = it2;
                productCard = null;
            }
            if (productCard != null) {
                arrayList4.add(productCard);
            }
            it2 = it;
        }
        return new ProductListByPriceFamilyApiData(totalNumberOfProducts, arrayList4);
    }
}
