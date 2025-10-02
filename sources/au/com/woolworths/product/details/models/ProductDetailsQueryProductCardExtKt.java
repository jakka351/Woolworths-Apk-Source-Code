package au.com.woolworths.product.details.models;

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
import au.com.woolworths.product.models.PurchaseRestrictionExtKt;
import au.com.woolworths.product.models.RewardsOfferInfo;
import au.com.woolworths.product.models.TagLabel;
import au.com.woolworths.shop.graphql.type.PurchaseRestriction;
import com.woolworths.product.details.ProductDetailsQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/product/models/ProductCard;", "Lcom/woolworths/product/details/ProductDetailsQuery$ProductCard;", "shop-product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductDetailsQueryProductCardExtKt {
    @NotNull
    public static final ProductCard toUiModel(@NotNull ProductDetailsQuery.ProductCard productCard) {
        List arrayList;
        List arrayList2;
        String str;
        List arrayList3;
        Intrinsics.h(productCard, "<this>");
        String str2 = productCard.getProductCard().f8949a;
        String str3 = productCard.getProductCard().b;
        String str4 = productCard.getProductCard().e;
        String str5 = productCard.getProductCard().j;
        Integer num = productCard.getProductCard().h;
        String str6 = productCard.getProductCard().i;
        String str7 = productCard.getProductCard().l;
        boolean z = productCard.getProductCard().f;
        boolean z2 = productCard.getProductCard().c;
        String str8 = productCard.getProductCard().m;
        String str9 = productCard.getProductCard().n;
        ProductCard.Trolley trolley = productCard.getProductCard().p;
        ProductTrolleyData uiModel = trolley != null ? ProductCardKt.toUiModel(trolley) : null;
        List list = productCard.getProductCard().q;
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
        ProductShoppingList uiModel2 = ProductCardListExtKt.toUiModel(productCard.getProductCard().r);
        ProductCard.InStoreDetails inStoreDetails = productCard.getProductCard().s;
        InstoreDetailsData uiModel3 = inStoreDetails != null ? ProductCardInStoreDetailsExtKt.toUiModel(inStoreDetails) : null;
        PurchaseRestriction purchaseRestriction = productCard.getProductCard().d;
        au.com.woolworths.product.models.PurchaseRestriction uiModel4 = purchaseRestriction != null ? PurchaseRestrictionExtKt.toUiModel(purchaseRestriction) : null;
        List<ProductCard.InlineLabel> list5 = productCard.getProductCard().o;
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
        ProductCard.PromotionInfo promotionInfo = productCard.getProductCard().k;
        PromotionInfo uiModel6 = promotionInfo != null ? ProductCardPromotionInfoExtKt.toUiModel(promotionInfo) : null;
        String str10 = productCard.getProductCard().u;
        String str11 = productCard.getProductCard().v;
        ProductCard.Marketplace marketplace = productCard.getProductCard().w;
        ProductListMarketplace uiModel7 = marketplace != null ? ProductCardMarketplaceExtKt.toUiModel(marketplace) : null;
        ProductCard.RewardsOfferInfo rewardsOfferInfo = productCard.getProductCard().x;
        RewardsOfferInfo uiModel8 = rewardsOfferInfo != null ? ProductCardRewardsOfferInfoExtKt.toUiModel(rewardsOfferInfo) : null;
        String str12 = productCard.getProductCard().y;
        ProductCard.TagLabel tagLabel = productCard.getProductCard().z;
        TagLabel uiModel9 = tagLabel != null ? ProductCardTagLabelExtKt.toUiModel(tagLabel) : null;
        ProductCard.InStoreAvailabilityInfo inStoreAvailabilityInfo = productCard.getProductCard().g;
        InStoreAvailabilityInfo uiModel10 = inStoreAvailabilityInfo != null ? ProductCardInStoreAvailabilityInfoExtKt.toUiModel(inStoreAvailabilityInfo) : null;
        ProductCard.ProductVarieties productVarieties = productCard.getProductCard().A;
        ProductVarieties uiModel11 = productVarieties != null ? ProductCardProductVarietiesExtKt.toUiModel(productVarieties) : null;
        List list6 = productCard.getProductCard().B;
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
        boolean z3 = productCard.getProductCard().C;
        ProductCard.MultiBuyPriceInfo multiBuyPriceInfo = productCard.getProductCard().E;
        MultiBuyPriceInfo uiModel12 = multiBuyPriceInfo != null ? ProductCardMultiBuyPriceInfoExtKt.toUiModel(multiBuyPriceInfo) : null;
        ProductCard.MemberPriceInfo memberPriceInfo = productCard.getProductCard().D;
        MemberPriceInfo uiModel13 = memberPriceInfo != null ? ProductCardMemberPriceInfoExtKt.toUiModel(memberPriceInfo) : null;
        ProductCard.CartProductInfo cartProductInfo = productCard.getProductCard().F;
        CartProductInfo uiModel14 = cartProductInfo != null ? ProductCardCartProductInfoExtKt.toUiModel(cartProductInfo) : null;
        ProductCard.InStoreLocation inStoreLocation = productCard.getProductCard().t;
        InStoreLocationData uiModel15 = inStoreLocation != null ? ProductCardInStoreLocationExtKt.toUiModel(inStoreLocation) : null;
        ProductCard.ProductCardAnalytics productCardAnalytics = productCard.getProductCard().G;
        AnalyticsData uiModel16 = productCardAnalytics != null ? ProductCardProductCardAnalyticsExtKt.toUiModel(productCardAnalytics) : null;
        ProductCard.ProductCardAction productCardAction = productCard.getProductCard().H;
        return new au.com.woolworths.product.models.ProductCard(str, str3, str4, str5, num, str6, null, null, str7, z, z2, str8, null, null, str9, uiModel, list4, uiModel2, uiModel3, uiModel4, arrayList2, uiModel6, str10, str11, uiModel7, uiModel8, str12, uiModel9, uiModel10, uiModel11, list8, z3, uiModel12, uiModel13, uiModel14, uiModel15, uiModel16, null, productCardAction != null ? ProductCardProductCardActionExtKt.toUiModel(productCardAction) : null, productCard.getProductCard().I, 12480, 32, null);
    }
}
