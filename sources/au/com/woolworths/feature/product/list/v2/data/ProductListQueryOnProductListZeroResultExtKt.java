package au.com.woolworths.feature.product.list.v2.data;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.models.products.ProductListMarketplace;
import au.com.woolworths.android.onesite.models.products.PromotionInfo;
import au.com.woolworths.base.shopapp.data.models.CartProductInfo;
import au.com.woolworths.feature.product.list.v2.ProductListQuery;
import au.com.woolworths.feature.product.list.v2.data.ProductListZeroResults;
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
import au.com.woolworths.product.models.PurchaseRestrictionExtKt;
import au.com.woolworths.product.models.RewardsOfferInfo;
import au.com.woolworths.product.models.TagLabel;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.shop.aem.components.model.productcategorytile.ProductCategoryTileData;
import au.com.woolworths.shop.graphql.type.PurchaseRestriction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list-v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductListQueryOnProductListZeroResultExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [au.com.woolworths.feature.shop.contentpage.data.HorizontalListData] */
    public static final ProductListZeroResults.ZeroResultData a(ProductListQuery.OnProductListZeroResult onProductListZeroResult) {
        Iterator it;
        String str;
        ZeroResultProductCategories horizontalListData;
        Iterator it2;
        String str2;
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
        String str8 = onProductListZeroResult.f5475a;
        String str9 = onProductListZeroResult.b;
        ArrayList arrayList4 = onProductListZeroResult.c;
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            ProductListQuery.Item2 item2 = (ProductListQuery.Item2) it4.next();
            ProductListQuery.OnZeroResultProductCategories onZeroResultProductCategories = item2.b;
            char c2 = '\n';
            if (onZeroResultProductCategories != null) {
                String str10 = onZeroResultProductCategories.f5478a;
                ArrayList<ProductListQuery.ZeroResultProductCategoriesItem> arrayList6 = onZeroResultProductCategories.b;
                ArrayList arrayList7 = new ArrayList(CollectionsKt.s(arrayList6, 10));
                for (ProductListQuery.ZeroResultProductCategoriesItem zeroResultProductCategoriesItem : arrayList6) {
                    Intrinsics.h(zeroResultProductCategoriesItem, str7);
                    String str11 = zeroResultProductCategoriesItem.b;
                    String str12 = zeroResultProductCategoriesItem.c;
                    ProductListQuery.ProductCategoryTileAction productCategoryTileAction = zeroResultProductCategoriesItem.f5497a;
                    arrayList7.add(new ProductCategoryTileData(str11, str12, new ActionData(productCategoryTileAction.b, ActionTypeExtKt.toUiModel(productCategoryTileAction.f5481a), productCategoryTileAction.c, null)));
                }
                horizontalListData = new ZeroResultProductCategories(str10, arrayList7);
                it = it4;
                str = str7;
            } else {
                ProductListQuery.OnHorizontalList1 onHorizontalList1 = item2.c;
                if (onHorizontalList1 != null) {
                    String str13 = onHorizontalList1.f5466a;
                    ArrayList arrayList8 = onHorizontalList1.b;
                    ArrayList arrayList9 = new ArrayList();
                    Iterator it5 = arrayList8.iterator();
                    while (it5.hasNext()) {
                        ProductListQuery.OnProductCard2 onProductCard2 = ((ProductListQuery.Item3) it5.next()).b;
                        if (onProductCard2 != null) {
                            au.com.woolworths.graphql.common.fragment.ProductCard productCard2 = onProductCard2.b;
                            String str14 = productCard2.f8949a;
                            String str15 = productCard2.b;
                            String str16 = productCard2.e;
                            String str17 = productCard2.j;
                            Integer num = productCard2.h;
                            String str18 = productCard2.i;
                            String str19 = productCard2.l;
                            it2 = it4;
                            boolean z = productCard2.f;
                            boolean z2 = productCard2.c;
                            String str20 = productCard2.m;
                            String str21 = productCard2.n;
                            ProductCard.Trolley trolley = productCard2.p;
                            ProductTrolleyData uiModel = trolley != null ? ProductCardKt.toUiModel(trolley) : null;
                            List list = productCard2.q;
                            if (list != null) {
                                List list2 = list;
                                str2 = str7;
                                it3 = it5;
                                str3 = str18;
                                arrayList = new ArrayList(CollectionsKt.s(list2, 10));
                                Iterator it6 = list2.iterator();
                                while (it6.hasNext()) {
                                    arrayList.add(ProductCardKt.toUiModel((ProductCard.Trolley1) it6.next()));
                                }
                            } else {
                                str2 = str7;
                                it3 = it5;
                                str3 = str18;
                                arrayList = null;
                            }
                            List list3 = EmptyList.d;
                            List list4 = arrayList == null ? list3 : arrayList;
                            ProductShoppingList uiModel2 = ProductCardListExtKt.toUiModel(productCard2.r);
                            ProductCard.InStoreDetails inStoreDetails = productCard2.s;
                            InstoreDetailsData uiModel3 = inStoreDetails != null ? ProductCardInStoreDetailsExtKt.toUiModel(inStoreDetails) : null;
                            PurchaseRestriction purchaseRestriction = productCard2.d;
                            au.com.woolworths.product.models.PurchaseRestriction uiModel4 = purchaseRestriction != null ? PurchaseRestrictionExtKt.toUiModel(purchaseRestriction) : null;
                            List<ProductCard.InlineLabel> list5 = productCard2.o;
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
                            ProductCard.PromotionInfo promotionInfo = productCard2.k;
                            PromotionInfo uiModel6 = promotionInfo != null ? ProductCardPromotionInfoExtKt.toUiModel(promotionInfo) : null;
                            String str22 = productCard2.u;
                            String str23 = productCard2.v;
                            ProductCard.Marketplace marketplace = productCard2.w;
                            ProductListMarketplace uiModel7 = marketplace != null ? ProductCardMarketplaceExtKt.toUiModel(marketplace) : null;
                            ProductCard.RewardsOfferInfo rewardsOfferInfo = productCard2.x;
                            RewardsOfferInfo uiModel8 = rewardsOfferInfo != null ? ProductCardRewardsOfferInfoExtKt.toUiModel(rewardsOfferInfo) : null;
                            String str24 = productCard2.y;
                            ProductCard.TagLabel tagLabel = productCard2.z;
                            TagLabel uiModel9 = tagLabel != null ? ProductCardTagLabelExtKt.toUiModel(tagLabel) : null;
                            ProductCard.InStoreAvailabilityInfo inStoreAvailabilityInfo = productCard2.g;
                            InStoreAvailabilityInfo uiModel10 = inStoreAvailabilityInfo != null ? ProductCardInStoreAvailabilityInfoExtKt.toUiModel(inStoreAvailabilityInfo) : null;
                            ProductCard.ProductVarieties productVarieties = productCard2.A;
                            ProductVarieties uiModel11 = productVarieties != null ? ProductCardProductVarietiesExtKt.toUiModel(productVarieties) : null;
                            List list7 = productCard2.B;
                            if (list7 != null) {
                                List list8 = list7;
                                str4 = str22;
                                str5 = str23;
                                str6 = str24;
                                c = '\n';
                                arrayList3 = new ArrayList(CollectionsKt.s(list8, 10));
                                Iterator it7 = list8.iterator();
                                while (it7.hasNext()) {
                                    arrayList3.add(ProductCardCategoryExtKt.toUiModel((ProductCard.Category) it7.next()));
                                }
                            } else {
                                str4 = str22;
                                str5 = str23;
                                str6 = str24;
                                c = '\n';
                                arrayList3 = null;
                            }
                            List list9 = arrayList3 == null ? list3 : arrayList3;
                            boolean z3 = productCard2.C;
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
                            productCard = new au.com.woolworths.product.models.ProductCard(str14, str15, str16, str17, num, str3, null, null, str19, z, z2, str20, null, null, str21, uiModel, list4, uiModel2, uiModel3, uiModel4, list6, uiModel6, str4, str5, uiModel7, uiModel8, str6, uiModel9, uiModel10, uiModel11, list9, z3, uiModel12, uiModel13, uiModel14, uiModel15, uiModel16, null, productCardAction != null ? ProductCardProductCardActionExtKt.toUiModel(productCardAction) : null, productCard2.I, 12480, 32, null);
                        } else {
                            it2 = it4;
                            str2 = str7;
                            it3 = it5;
                            c = c2;
                            productCard = null;
                        }
                        if (productCard != null) {
                            arrayList9.add(productCard);
                        }
                        c2 = c;
                        it4 = it2;
                        str7 = str2;
                        it5 = it3;
                    }
                    it = it4;
                    str = str7;
                    horizontalListData = new HorizontalListData(str13, null, null, null, null, arrayList9, null, null, null, null, null, null, 16, null);
                } else {
                    it = it4;
                    str = str7;
                    horizontalListData = null;
                }
            }
            if (horizontalListData != null) {
                arrayList5.add(horizontalListData);
            }
            it4 = it;
            str7 = str;
        }
        return new ProductListZeroResults.ZeroResultData(str8, null, str9, arrayList5);
    }
}
