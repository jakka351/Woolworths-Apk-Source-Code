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
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.shop.graphql.type.PurchaseRestriction;
import au.com.woolworths.shop.lists.data.remote.SuggestedProductListQuery;
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
public final class SuggestedProductListQuerySuggestedListItemsExtKt {
    public static final ProductListBySuggestedListApiData a(SuggestedProductListQuery.SuggestedListItems suggestedListItems) {
        String str;
        SuggestedProductListQuery.Product product;
        String str2;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str3;
        String str4;
        boolean z;
        char c;
        ArrayList arrayList3;
        Integer totalNumberOfProducts = suggestedListItems.getTotalNumberOfProducts();
        Integer nextPage = suggestedListItems.getNextPage();
        List<SuggestedProductListQuery.Product> products = suggestedListItems.getProducts();
        ArrayList arrayList4 = new ArrayList(CollectionsKt.s(products, 10));
        Iterator it = products.iterator();
        while (it.hasNext()) {
            SuggestedProductListQuery.Product product2 = (SuggestedProductListQuery.Product) it.next();
            Intrinsics.h(product2, "<this>");
            String str5 = product2.getProductCard().f8949a;
            String str6 = product2.getProductCard().b;
            String str7 = product2.getProductCard().e;
            String str8 = product2.getProductCard().j;
            Integer num = product2.getProductCard().h;
            String str9 = product2.getProductCard().i;
            String str10 = product2.getProductCard().l;
            boolean z2 = product2.getProductCard().f;
            boolean z3 = product2.getProductCard().c;
            String str11 = product2.getProductCard().m;
            String str12 = product2.getProductCard().n;
            Iterator it2 = it;
            ProductCard.Trolley trolley = product2.getProductCard().p;
            ActionData uiModel = null;
            ProductTrolleyData uiModel2 = trolley != null ? ProductCardKt.toUiModel(trolley) : null;
            List list = product2.getProductCard().q;
            if (list != null) {
                List list2 = list;
                str = str12;
                product = product2;
                str2 = str10;
                arrayList = new ArrayList(CollectionsKt.s(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList.add(ProductCardKt.toUiModel((ProductCard.Trolley1) it3.next()));
                }
            } else {
                str = str12;
                product = product2;
                str2 = str10;
                arrayList = null;
            }
            List list3 = EmptyList.d;
            List list4 = arrayList == null ? list3 : arrayList;
            ProductShoppingList uiModel3 = ProductCardListExtKt.toUiModel(product.getProductCard().r);
            ProductCard.InStoreDetails inStoreDetails = product.getProductCard().s;
            InstoreDetailsData uiModel4 = inStoreDetails != null ? ProductCardInStoreDetailsExtKt.toUiModel(inStoreDetails) : null;
            PurchaseRestriction purchaseRestriction = product.getProductCard().d;
            au.com.woolworths.product.models.PurchaseRestriction uiModel5 = purchaseRestriction != null ? au.com.woolworths.product.models.PurchaseRestrictionExtKt.toUiModel(purchaseRestriction) : null;
            List<ProductCard.InlineLabel> list5 = product.getProductCard().o;
            if (list5 != null) {
                arrayList2 = new ArrayList();
                for (ProductCard.InlineLabel inlineLabel : list5) {
                    ProductInlineLabelApiData uiModel6 = inlineLabel != null ? ProductCardInlineLabelExtKt.toUiModel(inlineLabel) : null;
                    if (uiModel6 != null) {
                        arrayList2.add(uiModel6);
                    }
                }
            } else {
                arrayList2 = null;
            }
            List list6 = arrayList2 == null ? list3 : arrayList2;
            ProductCard.PromotionInfo promotionInfo = product.getProductCard().k;
            PromotionInfo uiModel7 = promotionInfo != null ? ProductCardPromotionInfoExtKt.toUiModel(promotionInfo) : null;
            String str13 = product.getProductCard().u;
            String str14 = product.getProductCard().v;
            ProductCard.Marketplace marketplace = product.getProductCard().w;
            ProductListMarketplace uiModel8 = marketplace != null ? ProductCardMarketplaceExtKt.toUiModel(marketplace) : null;
            ProductCard.RewardsOfferInfo rewardsOfferInfo = product.getProductCard().x;
            RewardsOfferInfo uiModel9 = rewardsOfferInfo != null ? ProductCardRewardsOfferInfoExtKt.toUiModel(rewardsOfferInfo) : null;
            String str15 = product.getProductCard().y;
            ProductCard.TagLabel tagLabel = product.getProductCard().z;
            TagLabel uiModel10 = tagLabel != null ? ProductCardTagLabelExtKt.toUiModel(tagLabel) : null;
            ProductCard.InStoreAvailabilityInfo inStoreAvailabilityInfo = product.getProductCard().g;
            InStoreAvailabilityInfo uiModel11 = inStoreAvailabilityInfo != null ? ProductCardInStoreAvailabilityInfoExtKt.toUiModel(inStoreAvailabilityInfo) : null;
            ProductCard.ProductVarieties productVarieties = product.getProductCard().A;
            ProductVarieties uiModel12 = productVarieties != null ? ProductCardProductVarietiesExtKt.toUiModel(productVarieties) : null;
            List list7 = product.getProductCard().B;
            if (list7 != null) {
                List list8 = list7;
                str3 = str13;
                str4 = str14;
                z = z3;
                c = '\n';
                arrayList3 = new ArrayList(CollectionsKt.s(list8, 10));
                Iterator it4 = list8.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(ProductCardCategoryExtKt.toUiModel((ProductCard.Category) it4.next()));
                }
            } else {
                str3 = str13;
                str4 = str14;
                z = z3;
                c = '\n';
                arrayList3 = null;
            }
            List list9 = arrayList3 == null ? list3 : arrayList3;
            boolean z4 = product.getProductCard().C;
            ProductCard.MultiBuyPriceInfo multiBuyPriceInfo = product.getProductCard().E;
            MultiBuyPriceInfo uiModel13 = multiBuyPriceInfo != null ? ProductCardMultiBuyPriceInfoExtKt.toUiModel(multiBuyPriceInfo) : null;
            ProductCard.MemberPriceInfo memberPriceInfo = product.getProductCard().D;
            MemberPriceInfo uiModel14 = memberPriceInfo != null ? ProductCardMemberPriceInfoExtKt.toUiModel(memberPriceInfo) : null;
            ProductCard.CartProductInfo cartProductInfo = product.getProductCard().F;
            CartProductInfo uiModel15 = cartProductInfo != null ? ProductCardCartProductInfoExtKt.toUiModel(cartProductInfo) : null;
            ProductCard.InStoreLocation inStoreLocation = product.getProductCard().t;
            InStoreLocationData uiModel16 = inStoreLocation != null ? ProductCardInStoreLocationExtKt.toUiModel(inStoreLocation) : null;
            ProductCard.ProductCardAnalytics productCardAnalytics = product.getProductCard().G;
            AnalyticsData uiModel17 = productCardAnalytics != null ? ProductCardProductCardAnalyticsExtKt.toUiModel(productCardAnalytics) : null;
            ProductCard.ProductCardAction productCardAction = product.getProductCard().H;
            if (productCardAction != null) {
                uiModel = ProductCardProductCardActionExtKt.toUiModel(productCardAction);
            }
            arrayList4.add(new au.com.woolworths.product.models.ProductCard(str5, str6, str7, str8, num, str9, null, null, str2, z2, z, str11, null, null, str, uiModel2, list4, uiModel3, uiModel4, uiModel5, list6, uiModel7, str3, str4, uiModel8, uiModel9, str15, uiModel10, uiModel11, uiModel12, list9, z4, uiModel13, uiModel14, uiModel15, uiModel16, uiModel17, null, uiModel, product.getProductCard().I, 12480, 32, null));
            it = it2;
        }
        return new ProductListBySuggestedListApiData(totalNumberOfProducts, nextPage, arrayList4);
    }
}
