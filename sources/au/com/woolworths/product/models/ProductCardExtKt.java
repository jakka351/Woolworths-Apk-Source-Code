package au.com.woolworths.product.models;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.models.products.ProductListMarketplace;
import au.com.woolworths.android.onesite.models.products.PromotionInfo;
import au.com.woolworths.base.shopapp.data.models.CartProductInfo;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/product/models/ProductCard;", "Lau/com/woolworths/graphql/common/fragment/ProductCard;", "shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductCardExtKt {
    @NotNull
    public static final ProductCard toUiModel(@NotNull au.com.woolworths.graphql.common.fragment.ProductCard productCard) {
        List arrayList;
        List arrayList2;
        List list;
        String str;
        List arrayList3;
        Intrinsics.h(productCard, "<this>");
        String str2 = productCard.f8949a;
        String str3 = productCard.b;
        String str4 = productCard.e;
        String str5 = productCard.j;
        Integer num = productCard.h;
        String str6 = productCard.i;
        String str7 = productCard.l;
        boolean z = productCard.f;
        boolean z2 = productCard.c;
        String str8 = productCard.m;
        String str9 = productCard.n;
        ProductCard.Trolley trolley = productCard.p;
        ProductTrolleyData uiModel = trolley != null ? ProductCardKt.toUiModel(trolley) : null;
        List list2 = productCard.q;
        if (list2 != null) {
            List list3 = list2;
            arrayList = new ArrayList(CollectionsKt.s(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(ProductCardKt.toUiModel((ProductCard.Trolley1) it.next()));
            }
        } else {
            arrayList = null;
        }
        List list4 = EmptyList.d;
        List list5 = arrayList == null ? list4 : arrayList;
        ProductShoppingList uiModel2 = ProductCardListExtKt.toUiModel(productCard.r);
        ProductCard.InStoreDetails inStoreDetails = productCard.s;
        InstoreDetailsData uiModel3 = inStoreDetails != null ? ProductCardInStoreDetailsExtKt.toUiModel(inStoreDetails) : null;
        au.com.woolworths.shop.graphql.type.PurchaseRestriction purchaseRestriction = productCard.d;
        PurchaseRestriction uiModel4 = purchaseRestriction != null ? PurchaseRestrictionExtKt.toUiModel(purchaseRestriction) : null;
        List<ProductCard.InlineLabel> list6 = productCard.o;
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
        ProductCard.PromotionInfo promotionInfo = productCard.k;
        PromotionInfo uiModel6 = promotionInfo != null ? ProductCardPromotionInfoExtKt.toUiModel(promotionInfo) : null;
        String str10 = productCard.u;
        String str11 = productCard.v;
        ProductCard.Marketplace marketplace = productCard.w;
        ProductListMarketplace uiModel7 = marketplace != null ? ProductCardMarketplaceExtKt.toUiModel(marketplace) : null;
        ProductCard.RewardsOfferInfo rewardsOfferInfo = productCard.x;
        RewardsOfferInfo uiModel8 = rewardsOfferInfo != null ? ProductCardRewardsOfferInfoExtKt.toUiModel(rewardsOfferInfo) : null;
        String str12 = productCard.y;
        ProductCard.TagLabel tagLabel = productCard.z;
        TagLabel uiModel9 = tagLabel != null ? ProductCardTagLabelExtKt.toUiModel(tagLabel) : null;
        ProductCard.InStoreAvailabilityInfo inStoreAvailabilityInfo = productCard.g;
        InStoreAvailabilityInfo uiModel10 = inStoreAvailabilityInfo != null ? ProductCardInStoreAvailabilityInfoExtKt.toUiModel(inStoreAvailabilityInfo) : null;
        ProductCard.ProductVarieties productVarieties = productCard.A;
        ProductVarieties uiModel11 = productVarieties != null ? ProductCardProductVarietiesExtKt.toUiModel(productVarieties) : null;
        List list8 = productCard.B;
        if (list8 != null) {
            List list9 = list8;
            list = list4;
            str = str2;
            arrayList3 = new ArrayList(CollectionsKt.s(list9, 10));
            Iterator it2 = list9.iterator();
            while (it2.hasNext()) {
                arrayList3.add(ProductCardCategoryExtKt.toUiModel((ProductCard.Category) it2.next()));
            }
        } else {
            list = list4;
            str = str2;
            arrayList3 = null;
        }
        List list10 = arrayList3 == null ? list : arrayList3;
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
        return new ProductCard(str, str3, str4, str5, num, str6, null, null, str7, z, z2, str8, null, null, str9, uiModel, list5, uiModel2, uiModel3, uiModel4, list7, uiModel6, str10, str11, uiModel7, uiModel8, str12, uiModel9, uiModel10, uiModel11, list10, z3, uiModel12, uiModel13, uiModel14, uiModel15, uiModel16, null, productCardAction != null ? ProductCardProductCardActionExtKt.toUiModel(productCardAction) : null, productCard.I, 12480, 32, null);
    }
}
