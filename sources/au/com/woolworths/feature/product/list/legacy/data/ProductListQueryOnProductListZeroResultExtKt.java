package au.com.woolworths.feature.product.list.legacy.data;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.models.products.ProductListMarketplace;
import au.com.woolworths.android.onesite.models.products.PromotionInfo;
import au.com.woolworths.base.shopapp.data.models.CartProductInfo;
import au.com.woolworths.feature.product.list.legacy.data.ProductListZeroResults;
import au.com.woolworths.feature.shop.contentpage.data.HorizontalListData;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.product.models.ActionTypeExtKt;
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
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.shop.aem.components.model.productcategorytile.ProductCategoryTileData;
import au.com.woolworths.shop.graphql.type.PurchaseRestriction;
import com.woolworths.product.list.legacy.ProductListQuery;
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
public final class ProductListQueryOnProductListZeroResultExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [au.com.woolworths.feature.shop.contentpage.data.HorizontalListData] */
    public static final ProductListZeroResults.ZeroResultData a(ProductListQuery.OnProductListZeroResult onProductListZeroResult) {
        String str;
        Iterator it;
        ZeroResultProductCategories horizontalListData;
        String str2;
        Iterator it2;
        Iterator it3;
        char c;
        ProductCard productCard;
        String str3;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str4;
        String str5;
        String str6;
        ArrayList arrayList3;
        String str7 = "<this>";
        Intrinsics.h(onProductListZeroResult, "<this>");
        String title = onProductListZeroResult.getTitle();
        String message = onProductListZeroResult.getMessage();
        List<ProductListQuery.Item4> items = onProductListZeroResult.getItems();
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = items.iterator();
        while (it4.hasNext()) {
            ProductListQuery.Item4 item4 = (ProductListQuery.Item4) it4.next();
            char c2 = '\n';
            if (item4.getOnZeroResultProductCategories() != null) {
                ProductListQuery.OnZeroResultProductCategories1 onZeroResultProductCategories = item4.getOnZeroResultProductCategories();
                Intrinsics.h(onZeroResultProductCategories, str7);
                String zeroResultProductCategoriesTitle = onZeroResultProductCategories.getZeroResultProductCategoriesTitle();
                List<ProductListQuery.ZeroResultProductCategoriesItem1> zeroResultProductCategoriesItems = onZeroResultProductCategories.getZeroResultProductCategoriesItems();
                ArrayList arrayList5 = new ArrayList(CollectionsKt.s(zeroResultProductCategoriesItems, 10));
                for (ProductListQuery.ZeroResultProductCategoriesItem1 zeroResultProductCategoriesItem1 : zeroResultProductCategoriesItems) {
                    Intrinsics.h(zeroResultProductCategoriesItem1, str7);
                    String productCategoryTileImageUrl = zeroResultProductCategoriesItem1.getProductCategoryTileImageUrl();
                    String productCategoryTileLabel = zeroResultProductCategoriesItem1.getProductCategoryTileLabel();
                    ProductListQuery.ProductCategoryTileAction1 productCategoryTileAction = zeroResultProductCategoriesItem1.getProductCategoryTileAction();
                    Intrinsics.h(productCategoryTileAction, str7);
                    arrayList5.add(new ProductCategoryTileData(productCategoryTileImageUrl, productCategoryTileLabel, new ActionData(productCategoryTileAction.getAction(), ActionTypeExtKt.toUiModel(productCategoryTileAction.getType()), productCategoryTileAction.getId(), null)));
                }
                horizontalListData = new ZeroResultProductCategories(zeroResultProductCategoriesTitle, arrayList5);
                str = str7;
                it = it4;
            } else if (item4.getOnHorizontalList() != null) {
                ProductListQuery.OnHorizontalList2 onHorizontalList = item4.getOnHorizontalList();
                Intrinsics.h(onHorizontalList, str7);
                String title2 = onHorizontalList.getTitle();
                List<ProductListQuery.Item5> items2 = onHorizontalList.getItems();
                ArrayList arrayList6 = new ArrayList();
                Iterator it5 = items2.iterator();
                while (it5.hasNext()) {
                    ProductListQuery.Item5 item5 = (ProductListQuery.Item5) it5.next();
                    if (item5.getOnProductCard() != null) {
                        ProductListQuery.OnProductCard3 onProductCard = item5.getOnProductCard();
                        Intrinsics.h(onProductCard, str7);
                        String str8 = onProductCard.getProductCard().f8949a;
                        String str9 = onProductCard.getProductCard().b;
                        String str10 = onProductCard.getProductCard().e;
                        String str11 = onProductCard.getProductCard().j;
                        Integer num = onProductCard.getProductCard().h;
                        String str12 = onProductCard.getProductCard().i;
                        String str13 = onProductCard.getProductCard().l;
                        str2 = str7;
                        boolean z = onProductCard.getProductCard().f;
                        boolean z2 = onProductCard.getProductCard().c;
                        String str14 = onProductCard.getProductCard().m;
                        String str15 = onProductCard.getProductCard().n;
                        ProductCard.Trolley trolley = onProductCard.getProductCard().p;
                        ProductTrolleyData uiModel = trolley != null ? ProductCardKt.toUiModel(trolley) : null;
                        List list = onProductCard.getProductCard().q;
                        if (list != null) {
                            List list2 = list;
                            it2 = it4;
                            it3 = it5;
                            str3 = str12;
                            arrayList = new ArrayList(CollectionsKt.s(list2, 10));
                            Iterator it6 = list2.iterator();
                            while (it6.hasNext()) {
                                arrayList.add(ProductCardKt.toUiModel((ProductCard.Trolley1) it6.next()));
                            }
                        } else {
                            it2 = it4;
                            it3 = it5;
                            str3 = str12;
                            arrayList = null;
                        }
                        List list3 = EmptyList.d;
                        List list4 = arrayList == null ? list3 : arrayList;
                        ProductShoppingList uiModel2 = ProductCardListExtKt.toUiModel(onProductCard.getProductCard().r);
                        ProductCard.InStoreDetails inStoreDetails = onProductCard.getProductCard().s;
                        InstoreDetailsData uiModel3 = inStoreDetails != null ? ProductCardInStoreDetailsExtKt.toUiModel(inStoreDetails) : null;
                        PurchaseRestriction purchaseRestriction = onProductCard.getProductCard().d;
                        au.com.woolworths.product.models.PurchaseRestriction uiModel4 = purchaseRestriction != null ? au.com.woolworths.product.models.PurchaseRestrictionExtKt.toUiModel(purchaseRestriction) : null;
                        List<ProductCard.InlineLabel> list5 = onProductCard.getProductCard().o;
                        if (list5 != null) {
                            arrayList2 = new ArrayList();
                            for (ProductCard.InlineLabel inlineLabel : list5) {
                                ProductInlineLabelApiData uiModel5 = inlineLabel != null ? ProductCardInlineLabelExtKt.toUiModel(inlineLabel) : null;
                                if (uiModel5 != null) {
                                    arrayList2.add(uiModel5);
                                }
                            }
                        } else {
                            arrayList2 = null;
                        }
                        List list6 = arrayList2 == null ? list3 : arrayList2;
                        ProductCard.PromotionInfo promotionInfo = onProductCard.getProductCard().k;
                        PromotionInfo uiModel6 = promotionInfo != null ? ProductCardPromotionInfoExtKt.toUiModel(promotionInfo) : null;
                        String str16 = onProductCard.getProductCard().u;
                        String str17 = onProductCard.getProductCard().v;
                        ProductCard.Marketplace marketplace = onProductCard.getProductCard().w;
                        ProductListMarketplace uiModel7 = marketplace != null ? ProductCardMarketplaceExtKt.toUiModel(marketplace) : null;
                        ProductCard.RewardsOfferInfo rewardsOfferInfo = onProductCard.getProductCard().x;
                        RewardsOfferInfo uiModel8 = rewardsOfferInfo != null ? ProductCardRewardsOfferInfoExtKt.toUiModel(rewardsOfferInfo) : null;
                        String str18 = onProductCard.getProductCard().y;
                        ProductCard.TagLabel tagLabel = onProductCard.getProductCard().z;
                        TagLabel uiModel9 = tagLabel != null ? ProductCardTagLabelExtKt.toUiModel(tagLabel) : null;
                        ProductCard.InStoreAvailabilityInfo inStoreAvailabilityInfo = onProductCard.getProductCard().g;
                        InStoreAvailabilityInfo uiModel10 = inStoreAvailabilityInfo != null ? ProductCardInStoreAvailabilityInfoExtKt.toUiModel(inStoreAvailabilityInfo) : null;
                        ProductCard.ProductVarieties productVarieties = onProductCard.getProductCard().A;
                        ProductVarieties uiModel11 = productVarieties != null ? ProductCardProductVarietiesExtKt.toUiModel(productVarieties) : null;
                        List list7 = onProductCard.getProductCard().B;
                        if (list7 != null) {
                            List list8 = list7;
                            str4 = str16;
                            str5 = str17;
                            str6 = str18;
                            c = '\n';
                            arrayList3 = new ArrayList(CollectionsKt.s(list8, 10));
                            Iterator it7 = list8.iterator();
                            while (it7.hasNext()) {
                                arrayList3.add(ProductCardCategoryExtKt.toUiModel((ProductCard.Category) it7.next()));
                            }
                        } else {
                            str4 = str16;
                            str5 = str17;
                            str6 = str18;
                            c = '\n';
                            arrayList3 = null;
                        }
                        List list9 = arrayList3 == null ? list3 : arrayList3;
                        boolean z3 = onProductCard.getProductCard().C;
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
                        productCard = new au.com.woolworths.product.models.ProductCard(str8, str9, str10, str11, num, str3, null, null, str13, z, z2, str14, null, null, str15, uiModel, list4, uiModel2, uiModel3, uiModel4, list6, uiModel6, str4, str5, uiModel7, uiModel8, str6, uiModel9, uiModel10, uiModel11, list9, z3, uiModel12, uiModel13, uiModel14, uiModel15, uiModel16, null, productCardAction != null ? ProductCardProductCardActionExtKt.toUiModel(productCardAction) : null, onProductCard.getProductCard().I, 12480, 32, null);
                    } else {
                        str2 = str7;
                        it2 = it4;
                        it3 = it5;
                        c = c2;
                        productCard = null;
                    }
                    if (productCard != null) {
                        arrayList6.add(productCard);
                    }
                    c2 = c;
                    str7 = str2;
                    it4 = it2;
                    it5 = it3;
                }
                str = str7;
                it = it4;
                horizontalListData = new HorizontalListData(title2, null, null, null, null, arrayList6, null, null, null, null, null, null, 16, null);
            } else {
                str = str7;
                it = it4;
                horizontalListData = null;
            }
            if (horizontalListData != null) {
                arrayList4.add(horizontalListData);
            }
            str7 = str;
            it4 = it;
        }
        return new ProductListZeroResults.ZeroResultData(title, null, message, arrayList4);
    }
}
