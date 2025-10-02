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
import com.woolworths.product.list.ProductListQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/product/models/ProductCard;", "Lcom/woolworths/product/list/ProductListQuery$VideoAdUnitProductCard;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductListQueryVideoAdUnitProductCardExtKt {
    @NotNull
    public static final ProductCard toUiModel(@NotNull ProductListQuery.VideoAdUnitProductCard videoAdUnitProductCard) {
        List arrayList;
        List arrayList2;
        String str;
        List arrayList3;
        Intrinsics.h(videoAdUnitProductCard, "<this>");
        String str2 = videoAdUnitProductCard.getProductCard().f8949a;
        String str3 = videoAdUnitProductCard.getProductCard().b;
        String str4 = videoAdUnitProductCard.getProductCard().e;
        String str5 = videoAdUnitProductCard.getProductCard().j;
        Integer num = videoAdUnitProductCard.getProductCard().h;
        String str6 = videoAdUnitProductCard.getProductCard().i;
        String str7 = videoAdUnitProductCard.getProductCard().l;
        boolean z = videoAdUnitProductCard.getProductCard().f;
        boolean z2 = videoAdUnitProductCard.getProductCard().c;
        String str8 = videoAdUnitProductCard.getProductCard().m;
        String str9 = videoAdUnitProductCard.getProductCard().n;
        ProductCard.Trolley trolley = videoAdUnitProductCard.getProductCard().p;
        ProductTrolleyData uiModel = trolley != null ? ProductCardKt.toUiModel(trolley) : null;
        List list = videoAdUnitProductCard.getProductCard().q;
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
        ProductShoppingList uiModel2 = ProductCardListExtKt.toUiModel(videoAdUnitProductCard.getProductCard().r);
        ProductCard.InStoreDetails inStoreDetails = videoAdUnitProductCard.getProductCard().s;
        InstoreDetailsData uiModel3 = inStoreDetails != null ? ProductCardInStoreDetailsExtKt.toUiModel(inStoreDetails) : null;
        PurchaseRestriction purchaseRestriction = videoAdUnitProductCard.getProductCard().d;
        au.com.woolworths.product.models.PurchaseRestriction uiModel4 = purchaseRestriction != null ? au.com.woolworths.product.models.PurchaseRestrictionExtKt.toUiModel(purchaseRestriction) : null;
        List<ProductCard.InlineLabel> list5 = videoAdUnitProductCard.getProductCard().o;
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
        ProductCard.PromotionInfo promotionInfo = videoAdUnitProductCard.getProductCard().k;
        PromotionInfo uiModel6 = promotionInfo != null ? ProductCardPromotionInfoExtKt.toUiModel(promotionInfo) : null;
        String str10 = videoAdUnitProductCard.getProductCard().u;
        String str11 = videoAdUnitProductCard.getProductCard().v;
        ProductCard.Marketplace marketplace = videoAdUnitProductCard.getProductCard().w;
        ProductListMarketplace uiModel7 = marketplace != null ? ProductCardMarketplaceExtKt.toUiModel(marketplace) : null;
        ProductCard.RewardsOfferInfo rewardsOfferInfo = videoAdUnitProductCard.getProductCard().x;
        RewardsOfferInfo uiModel8 = rewardsOfferInfo != null ? ProductCardRewardsOfferInfoExtKt.toUiModel(rewardsOfferInfo) : null;
        String str12 = videoAdUnitProductCard.getProductCard().y;
        ProductCard.TagLabel tagLabel = videoAdUnitProductCard.getProductCard().z;
        TagLabel uiModel9 = tagLabel != null ? ProductCardTagLabelExtKt.toUiModel(tagLabel) : null;
        ProductCard.InStoreAvailabilityInfo inStoreAvailabilityInfo = videoAdUnitProductCard.getProductCard().g;
        InStoreAvailabilityInfo uiModel10 = inStoreAvailabilityInfo != null ? ProductCardInStoreAvailabilityInfoExtKt.toUiModel(inStoreAvailabilityInfo) : null;
        ProductCard.ProductVarieties productVarieties = videoAdUnitProductCard.getProductCard().A;
        ProductVarieties uiModel11 = productVarieties != null ? ProductCardProductVarietiesExtKt.toUiModel(productVarieties) : null;
        List list6 = videoAdUnitProductCard.getProductCard().B;
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
        boolean z3 = videoAdUnitProductCard.getProductCard().C;
        ProductCard.MultiBuyPriceInfo multiBuyPriceInfo = videoAdUnitProductCard.getProductCard().E;
        MultiBuyPriceInfo uiModel12 = multiBuyPriceInfo != null ? ProductCardMultiBuyPriceInfoExtKt.toUiModel(multiBuyPriceInfo) : null;
        ProductCard.MemberPriceInfo memberPriceInfo = videoAdUnitProductCard.getProductCard().D;
        MemberPriceInfo uiModel13 = memberPriceInfo != null ? ProductCardMemberPriceInfoExtKt.toUiModel(memberPriceInfo) : null;
        ProductCard.CartProductInfo cartProductInfo = videoAdUnitProductCard.getProductCard().F;
        CartProductInfo uiModel14 = cartProductInfo != null ? ProductCardCartProductInfoExtKt.toUiModel(cartProductInfo) : null;
        ProductCard.InStoreLocation inStoreLocation = videoAdUnitProductCard.getProductCard().t;
        InStoreLocationData uiModel15 = inStoreLocation != null ? ProductCardInStoreLocationExtKt.toUiModel(inStoreLocation) : null;
        ProductCard.ProductCardAnalytics productCardAnalytics = videoAdUnitProductCard.getProductCard().G;
        AnalyticsData uiModel16 = productCardAnalytics != null ? ProductCardProductCardAnalyticsExtKt.toUiModel(productCardAnalytics) : null;
        ProductCard.ProductCardAction productCardAction = videoAdUnitProductCard.getProductCard().H;
        return new au.com.woolworths.product.models.ProductCard(str, str3, str4, str5, num, str6, null, null, str7, z, z2, str8, null, null, str9, uiModel, list4, uiModel2, uiModel3, uiModel4, arrayList2, uiModel6, str10, str11, uiModel7, uiModel8, str12, uiModel9, uiModel10, uiModel11, list8, z3, uiModel12, uiModel13, uiModel14, uiModel15, uiModel16, null, productCardAction != null ? ProductCardProductCardActionExtKt.toUiModel(productCardAction) : null, videoAdUnitProductCard.getProductCard().I, 12480, 32, null);
    }
}
