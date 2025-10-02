package au.com.woolworths.feature.product.list.legacy.data;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.models.products.ProductListMarketplace;
import au.com.woolworths.android.onesite.models.products.PromotionInfo;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerActionApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerTypeApiData;
import au.com.woolworths.base.shopapp.data.models.CartProductInfo;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.base.shopapp.data.models.InfoSectionFooter;
import au.com.woolworths.base.shopapp.data.models.InfoSectionItem;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
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
import au.com.woolworths.shop.graphql.type.PurchaseRestriction;
import au.com.woolworths.shop.legacy.graphql.ProductsByFacetQuery;
import com.woolworths.product.list.legacy.fragment.InsetBanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.BERTags;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list-legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductsByFacetQueryProductsByFacetExtKt {
    public static final ProductListByFacetApiData a(ProductsByFacetQuery.ProductsByFacet productsByFacet) {
        InsetBannerApiData insetBannerApiData;
        InfoSection infoSection;
        BottomSheetContent.Marketplace marketplace;
        InsetBannerApiData insetBannerApiData2;
        String str;
        String str2;
        String str3;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str4;
        String str5;
        String str6;
        ArrayList arrayList3;
        Intrinsics.h(productsByFacet, "<this>");
        ArrayList arrayList4 = productsByFacet.c;
        ArrayList arrayList5 = new ArrayList(CollectionsKt.s(arrayList4, 10));
        Iterator it = arrayList4.iterator();
        while (it.hasNext()) {
            ProductsByFacetQuery.Product product = (ProductsByFacetQuery.Product) it.next();
            Intrinsics.h(product, "<this>");
            ProductCard productCard = product.b;
            String str7 = productCard.f8949a;
            String str8 = productCard.b;
            String str9 = productCard.e;
            String str10 = productCard.j;
            Integer num = productCard.h;
            String str11 = productCard.i;
            String str12 = productCard.l;
            boolean z = productCard.f;
            boolean z2 = productCard.c;
            String str13 = productCard.m;
            String str14 = productCard.n;
            Iterator it2 = it;
            ProductCard.Trolley trolley = productCard.p;
            ProductTrolleyData uiModel = trolley != null ? ProductCardKt.toUiModel(trolley) : null;
            List list = productCard.q;
            if (list != null) {
                List list2 = list;
                str = str14;
                str2 = str13;
                str3 = str12;
                arrayList = new ArrayList(CollectionsKt.s(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList.add(ProductCardKt.toUiModel((ProductCard.Trolley1) it3.next()));
                }
            } else {
                str = str14;
                str2 = str13;
                str3 = str12;
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
            String str15 = productCard.u;
            String str16 = productCard.v;
            ProductCard.Marketplace marketplace2 = productCard.w;
            ProductListMarketplace uiModel7 = marketplace2 != null ? ProductCardMarketplaceExtKt.toUiModel(marketplace2) : null;
            ProductCard.RewardsOfferInfo rewardsOfferInfo = productCard.x;
            RewardsOfferInfo uiModel8 = rewardsOfferInfo != null ? ProductCardRewardsOfferInfoExtKt.toUiModel(rewardsOfferInfo) : null;
            String str17 = productCard.y;
            ProductCard.TagLabel tagLabel = productCard.z;
            TagLabel uiModel9 = tagLabel != null ? ProductCardTagLabelExtKt.toUiModel(tagLabel) : null;
            ProductCard.InStoreAvailabilityInfo inStoreAvailabilityInfo = productCard.g;
            InStoreAvailabilityInfo uiModel10 = inStoreAvailabilityInfo != null ? ProductCardInStoreAvailabilityInfoExtKt.toUiModel(inStoreAvailabilityInfo) : null;
            ProductCard.ProductVarieties productVarieties = productCard.A;
            ProductVarieties uiModel11 = productVarieties != null ? ProductCardProductVarietiesExtKt.toUiModel(productVarieties) : null;
            List list7 = productCard.B;
            if (list7 != null) {
                List list8 = list7;
                str4 = str15;
                str5 = str16;
                str6 = str17;
                arrayList3 = new ArrayList(CollectionsKt.s(list8, 10));
                Iterator it4 = list8.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(ProductCardCategoryExtKt.toUiModel((ProductCard.Category) it4.next()));
                }
            } else {
                str4 = str15;
                str5 = str16;
                str6 = str17;
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
            arrayList5.add(new au.com.woolworths.product.models.ProductCard(str7, str8, str9, str10, num, str11, null, null, str3, z, z2, str2, null, null, str, uiModel, list4, uiModel2, uiModel3, uiModel4, list6, uiModel6, str4, str5, uiModel7, uiModel8, str6, uiModel9, uiModel10, uiModel11, list9, z3, uiModel12, uiModel13, uiModel14, uiModel15, uiModel16, null, productCardAction != null ? ProductCardProductCardActionExtKt.toUiModel(productCardAction) : null, productCard.I, 12480, 32, null));
            it = it2;
        }
        Integer num2 = productsByFacet.f12155a;
        Integer num3 = productsByFacet.b;
        ArrayList arrayList6 = productsByFacet.d;
        ArrayList arrayList7 = new ArrayList(CollectionsKt.s(arrayList6, 10));
        Iterator it5 = arrayList6.iterator();
        while (it5.hasNext()) {
            ProductsByFacetQuery.Filter filter = (ProductsByFacetQuery.Filter) it5.next();
            Intrinsics.h(filter, "<this>");
            String str18 = filter.f12147a;
            String str19 = filter.b;
            ArrayList<ProductsByFacetQuery.FilterItem> arrayList8 = filter.c;
            ArrayList arrayList9 = new ArrayList(CollectionsKt.s(arrayList8, 10));
            for (ProductsByFacetQuery.FilterItem filterItem : arrayList8) {
                Intrinsics.h(filterItem, "<this>");
                arrayList9.add(new FilterMenuItemApiData(filterItem.f12148a, filterItem.b, filterItem.c, filterItem.d, filterItem.e, filterItem.f));
                it5 = it5;
            }
            Iterator it6 = it5;
            ProductsByFacetQuery.Banner banner = filter.d;
            if (banner != null) {
                InsetBannerTypeApiData insetBannerTypeApiDataA = InsetBannerDisplayTypeExtKt.a(banner.f12145a);
                String str20 = banner.b;
                String str21 = banner.c;
                ProductsByFacetQuery.Action action = banner.e;
                insetBannerApiData2 = new InsetBannerApiData(insetBannerTypeApiDataA, str20, str21, action != null ? new InsetBannerActionApiData(action.c, action.d, InsetBannerActionTypeExtKt.a(action.b), InsetBannerActionPlacementExtKt.a(action.f12144a), null) : null, banner.d, null, 32, null);
            } else {
                insetBannerApiData2 = null;
            }
            arrayList7.add(new FilterOptionApiData(str18, str19, arrayList9, insetBannerApiData2));
            it5 = it6;
        }
        ArrayList<ProductsByFacetQuery.SortOption> arrayList10 = productsByFacet.e;
        ArrayList arrayList11 = new ArrayList(CollectionsKt.s(arrayList10, 10));
        for (ProductsByFacetQuery.SortOption sortOption : arrayList10) {
            Intrinsics.h(sortOption, "<this>");
            arrayList11.add(new SortOption(sortOption.f12157a, sortOption.b, sortOption.c, sortOption.d));
        }
        ProductsByFacetQuery.SortOptionsBanner sortOptionsBanner = productsByFacet.f;
        if (sortOptionsBanner != null) {
            InsetBanner insetBanner = sortOptionsBanner.b;
            InsetBannerTypeApiData insetBannerTypeApiDataA2 = InsetBannerDisplayTypeExtKt.a(insetBanner.getDisplayType());
            String message = insetBanner.getMessage();
            String bannerTitle = insetBanner.getBannerTitle();
            InsetBanner.Action action2 = insetBanner.getAction();
            insetBannerApiData = new InsetBannerApiData(insetBannerTypeApiDataA2, message, bannerTitle, action2 != null ? InsetBannerActionExtKt.a(action2) : null, insetBanner.getIconUrl(), null, 32, null);
        } else {
            insetBannerApiData = null;
        }
        ProductsByFacetQuery.MarketplaceInfo marketplaceInfo = productsByFacet.g;
        if (marketplaceInfo != null) {
            String str22 = marketplaceInfo.f12152a;
            ArrayList<ProductsByFacetQuery.Item> arrayList12 = marketplaceInfo.b;
            ArrayList arrayList13 = new ArrayList(CollectionsKt.s(arrayList12, 10));
            for (ProductsByFacetQuery.Item item : arrayList12) {
                Intrinsics.h(item, "<this>");
                arrayList13.add(new InfoSectionItem(item.f12150a, item.b, item.c));
            }
            ProductsByFacetQuery.Footer footer = marketplaceInfo.c;
            infoSection = new InfoSection(str22, arrayList13, footer != null ? new InfoSectionFooter(footer.f12149a, footer.b, footer.c) : null);
        } else {
            infoSection = null;
        }
        ProductsByFacetQuery.MarketplaceBottomSheet marketplaceBottomSheet = productsByFacet.h;
        if (marketplaceBottomSheet != null) {
            Boolean bool = marketplaceBottomSheet.e;
            String str23 = marketplaceBottomSheet.f12151a;
            String str24 = marketplaceBottomSheet.b;
            ProductsByFacetQuery.PrimaryCta primaryCta = marketplaceBottomSheet.c;
            ContentCta contentCta = primaryCta != null ? new ContentCta(primaryCta.f12153a, (String) null, (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null) : null;
            ProductsByFacetQuery.SecondaryCta secondaryCta = marketplaceBottomSheet.d;
            marketplace = new BottomSheetContent.Marketplace(bool, str23, str24, contentCta, secondaryCta != null ? new ContentCta(secondaryCta.f12156a, (String) null, (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null) : null, null, null, null, BERTags.FLAGS, null);
        } else {
            marketplace = null;
        }
        return new ProductListByFacetApiData(arrayList5, num2, num3, arrayList7, arrayList11, insetBannerApiData, infoSection, marketplace);
    }
}
