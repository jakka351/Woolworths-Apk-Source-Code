package au.com.woolworths.feature.product.list.data;

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
import com.woolworths.product.list.ProductsBySearchQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/product/models/ProductCard;", "Lcom/woolworths/product/list/ProductsBySearchQuery$OnProductCard1;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductsBySearchQueryOnProductCard1ExtKt {
    @NotNull
    public static final ProductCard toUiModel(@NotNull ProductsBySearchQuery.OnProductCard1 onProductCard1) {
        List arrayList;
        List arrayList2;
        String str;
        List arrayList3;
        Intrinsics.h(onProductCard1, "<this>");
        String str2 = onProductCard1.getProductCard().f8949a;
        String str3 = onProductCard1.getProductCard().b;
        String str4 = onProductCard1.getProductCard().e;
        String str5 = onProductCard1.getProductCard().j;
        Integer num = onProductCard1.getProductCard().h;
        String str6 = onProductCard1.getProductCard().i;
        String str7 = onProductCard1.getProductCard().l;
        boolean z = onProductCard1.getProductCard().f;
        boolean z2 = onProductCard1.getProductCard().c;
        String str8 = onProductCard1.getProductCard().m;
        String str9 = onProductCard1.getProductCard().n;
        ProductCard.Trolley trolley = onProductCard1.getProductCard().p;
        ProductTrolleyData uiModel = trolley != null ? ProductCardKt.toUiModel(trolley) : null;
        List list = onProductCard1.getProductCard().q;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(CollectionsKt.s(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(ProductCardKt.toUiModel((ProductCard.Trolley1) it.next()));
            }
        } else {
            arrayList = null;
        }
        List list3 = EmptyList.d;
        List list4 = arrayList == null ? list3 : arrayList;
        ProductShoppingList uiModel2 = ProductCardListExtKt.toUiModel(onProductCard1.getProductCard().r);
        ProductCard.InStoreDetails inStoreDetails = onProductCard1.getProductCard().s;
        InstoreDetailsData uiModel3 = inStoreDetails != null ? ProductCardInStoreDetailsExtKt.toUiModel(inStoreDetails) : null;
        PurchaseRestriction purchaseRestriction = onProductCard1.getProductCard().d;
        au.com.woolworths.product.models.PurchaseRestriction uiModel4 = purchaseRestriction != null ? au.com.woolworths.product.models.PurchaseRestrictionExtKt.toUiModel(purchaseRestriction) : null;
        List<ProductCard.InlineLabel> list5 = onProductCard1.getProductCard().o;
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
        if (arrayList2 == null) {
            arrayList2 = list3;
        }
        ProductCard.PromotionInfo promotionInfo = onProductCard1.getProductCard().k;
        PromotionInfo uiModel6 = promotionInfo != null ? ProductCardPromotionInfoExtKt.toUiModel(promotionInfo) : null;
        String str10 = onProductCard1.getProductCard().u;
        String str11 = onProductCard1.getProductCard().v;
        ProductCard.Marketplace marketplace = onProductCard1.getProductCard().w;
        ProductListMarketplace uiModel7 = marketplace != null ? ProductCardMarketplaceExtKt.toUiModel(marketplace) : null;
        ProductCard.RewardsOfferInfo rewardsOfferInfo = onProductCard1.getProductCard().x;
        RewardsOfferInfo uiModel8 = rewardsOfferInfo != null ? ProductCardRewardsOfferInfoExtKt.toUiModel(rewardsOfferInfo) : null;
        String str12 = onProductCard1.getProductCard().y;
        ProductCard.TagLabel tagLabel = onProductCard1.getProductCard().z;
        TagLabel uiModel9 = tagLabel != null ? ProductCardTagLabelExtKt.toUiModel(tagLabel) : null;
        ProductCard.InStoreAvailabilityInfo inStoreAvailabilityInfo = onProductCard1.getProductCard().g;
        InStoreAvailabilityInfo uiModel10 = inStoreAvailabilityInfo != null ? ProductCardInStoreAvailabilityInfoExtKt.toUiModel(inStoreAvailabilityInfo) : null;
        ProductCard.ProductVarieties productVarieties = onProductCard1.getProductCard().A;
        ProductVarieties uiModel11 = productVarieties != null ? ProductCardProductVarietiesExtKt.toUiModel(productVarieties) : null;
        List list6 = onProductCard1.getProductCard().B;
        if (list6 != null) {
            List list7 = list6;
            str = str2;
            arrayList3 = new ArrayList(CollectionsKt.s(list7, 10));
            Iterator it2 = list7.iterator();
            while (it2.hasNext()) {
                arrayList3.add(ProductCardCategoryExtKt.toUiModel((ProductCard.Category) it2.next()));
            }
        } else {
            str = str2;
            arrayList3 = null;
        }
        List list8 = arrayList3 == null ? list3 : arrayList3;
        boolean z3 = onProductCard1.getProductCard().C;
        ProductCard.MultiBuyPriceInfo multiBuyPriceInfo = onProductCard1.getProductCard().E;
        MultiBuyPriceInfo uiModel12 = multiBuyPriceInfo != null ? ProductCardMultiBuyPriceInfoExtKt.toUiModel(multiBuyPriceInfo) : null;
        ProductCard.MemberPriceInfo memberPriceInfo = onProductCard1.getProductCard().D;
        MemberPriceInfo uiModel13 = memberPriceInfo != null ? ProductCardMemberPriceInfoExtKt.toUiModel(memberPriceInfo) : null;
        ProductCard.CartProductInfo cartProductInfo = onProductCard1.getProductCard().F;
        CartProductInfo uiModel14 = cartProductInfo != null ? ProductCardCartProductInfoExtKt.toUiModel(cartProductInfo) : null;
        ProductCard.InStoreLocation inStoreLocation = onProductCard1.getProductCard().t;
        InStoreLocationData uiModel15 = inStoreLocation != null ? ProductCardInStoreLocationExtKt.toUiModel(inStoreLocation) : null;
        ProductCard.ProductCardAnalytics productCardAnalytics = onProductCard1.getProductCard().G;
        AnalyticsData uiModel16 = productCardAnalytics != null ? ProductCardProductCardAnalyticsExtKt.toUiModel(productCardAnalytics) : null;
        ProductCard.ProductCardAction productCardAction = onProductCard1.getProductCard().H;
        return new au.com.woolworths.product.models.ProductCard(str, str3, str4, str5, num, str6, null, null, str7, z, z2, str8, null, null, str9, uiModel, list4, uiModel2, uiModel3, uiModel4, arrayList2, uiModel6, str10, str11, uiModel7, uiModel8, str12, uiModel9, uiModel10, uiModel11, list8, z3, uiModel12, uiModel13, uiModel14, uiModel15, uiModel16, null, productCardAction != null ? ProductCardProductCardActionExtKt.toUiModel(productCardAction) : null, onProductCard1.getProductCard().I, 12480, 32, null);
    }
}
