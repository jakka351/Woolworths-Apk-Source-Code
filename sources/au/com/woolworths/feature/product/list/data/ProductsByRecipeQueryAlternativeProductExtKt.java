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
import au.com.woolworths.shop.graphql.ProductsByRecipeQuery;
import au.com.woolworths.shop.graphql.type.PurchaseRestriction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/product/models/ProductCard;", "Lau/com/woolworths/shop/graphql/ProductsByRecipeQuery$AlternativeProduct;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductsByRecipeQueryAlternativeProductExtKt {
    @NotNull
    public static final ProductCard toUiModel(@NotNull ProductsByRecipeQuery.AlternativeProduct alternativeProduct) {
        List arrayList;
        List arrayList2;
        String str;
        String str2;
        List arrayList3;
        Intrinsics.h(alternativeProduct, "<this>");
        au.com.woolworths.graphql.common.fragment.ProductCard productCard = alternativeProduct.b;
        String str3 = productCard.f8949a;
        String str4 = productCard.b;
        String str5 = productCard.e;
        String str6 = productCard.j;
        Integer num = productCard.h;
        String str7 = productCard.i;
        String str8 = productCard.l;
        boolean z = productCard.f;
        boolean z2 = productCard.c;
        String str9 = productCard.m;
        String str10 = productCard.n;
        ProductCard.Trolley trolley = productCard.p;
        ProductTrolleyData uiModel = trolley != null ? ProductCardKt.toUiModel(trolley) : null;
        List list = productCard.q;
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
        ProductShoppingList uiModel2 = ProductCardListExtKt.toUiModel(productCard.r);
        ProductCard.InStoreDetails inStoreDetails = productCard.s;
        InstoreDetailsData uiModel3 = inStoreDetails != null ? ProductCardInStoreDetailsExtKt.toUiModel(inStoreDetails) : null;
        PurchaseRestriction purchaseRestriction = productCard.d;
        au.com.woolworths.product.models.PurchaseRestriction uiModel4 = purchaseRestriction != null ? au.com.woolworths.product.models.PurchaseRestrictionExtKt.toUiModel(purchaseRestriction) : null;
        List<ProductCard.InlineLabel> list5 = productCard.o;
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
        ProductCard.PromotionInfo promotionInfo = productCard.k;
        PromotionInfo uiModel6 = promotionInfo != null ? ProductCardPromotionInfoExtKt.toUiModel(promotionInfo) : null;
        String str11 = productCard.u;
        String str12 = productCard.v;
        ProductCard.Marketplace marketplace = productCard.w;
        ProductListMarketplace uiModel7 = marketplace != null ? ProductCardMarketplaceExtKt.toUiModel(marketplace) : null;
        ProductCard.RewardsOfferInfo rewardsOfferInfo = productCard.x;
        RewardsOfferInfo uiModel8 = rewardsOfferInfo != null ? ProductCardRewardsOfferInfoExtKt.toUiModel(rewardsOfferInfo) : null;
        String str13 = productCard.y;
        ProductCard.TagLabel tagLabel = productCard.z;
        TagLabel uiModel9 = tagLabel != null ? ProductCardTagLabelExtKt.toUiModel(tagLabel) : null;
        ProductCard.InStoreAvailabilityInfo inStoreAvailabilityInfo = productCard.g;
        InStoreAvailabilityInfo uiModel10 = inStoreAvailabilityInfo != null ? ProductCardInStoreAvailabilityInfoExtKt.toUiModel(inStoreAvailabilityInfo) : null;
        ProductCard.ProductVarieties productVarieties = productCard.A;
        ProductVarieties uiModel11 = productVarieties != null ? ProductCardProductVarietiesExtKt.toUiModel(productVarieties) : null;
        List list7 = productCard.B;
        if (list7 != null) {
            List list8 = list7;
            str = str3;
            str2 = str4;
            arrayList3 = new ArrayList(CollectionsKt.s(list8, 10));
            Iterator it2 = list8.iterator();
            while (it2.hasNext()) {
                arrayList3.add(ProductCardCategoryExtKt.toUiModel((ProductCard.Category) it2.next()));
            }
        } else {
            str = str3;
            str2 = str4;
            arrayList3 = null;
        }
        List list9 = arrayList3 == null ? list3 : arrayList3;
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
        return new au.com.woolworths.product.models.ProductCard(str, str2, str5, str6, num, str7, null, null, str8, z, z2, str9, null, null, str10, uiModel, list4, uiModel2, uiModel3, uiModel4, list6, uiModel6, str11, str12, uiModel7, uiModel8, str13, uiModel9, uiModel10, uiModel11, list9, z3, uiModel12, uiModel13, uiModel14, uiModel15, uiModel16, null, productCardAction != null ? ProductCardProductCardActionExtKt.toUiModel(productCardAction) : null, productCard.I, 12480, 32, null);
    }
}
