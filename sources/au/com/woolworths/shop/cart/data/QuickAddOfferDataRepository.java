package au.com.woolworths.shop.cart.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.android.onesite.models.products.ProductListMarketplace;
import au.com.woolworths.android.onesite.models.products.PromotionInfo;
import au.com.woolworths.base.shopapp.data.models.CartProductInfo;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.product.models.AnalyticsFieldsExtraContentExtKt;
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
import au.com.woolworths.product.models.PurchaseRestrictionExtKt;
import au.com.woolworths.product.models.RewardsOfferInfo;
import au.com.woolworths.product.models.TagLabel;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.cart.data.mapper.ProgressStepTypeExtKt;
import au.com.woolworths.shop.cart.domain.model.OfferProductList;
import au.com.woolworths.shop.cart.domain.repository.QuickAddOfferRepository;
import au.com.woolworths.shop.graphql.type.PurchaseRestriction;
import com.apollographql.apollo.ApolloClient;
import com.woolworths.shop.cart.GetOfferProductListQuery;
import com.woolworths.shop.cart.UpdateOfferProductListMutation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/QuickAddOfferDataRepository;", "Lau/com/woolworths/shop/cart/domain/repository/QuickAddOfferRepository;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class QuickAddOfferDataRepository implements QuickAddOfferRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f10307a;

    public QuickAddOfferDataRepository(ApolloClient apolloClient) {
        Intrinsics.h(apolloClient, "apolloClient");
        this.f10307a = apolloClient;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.util.ArrayList] */
    public static OfferProductList b(GetOfferProductListQuery.GetOfferProductList getOfferProductList) {
        EmptyList emptyList;
        String str;
        String str2;
        ?? arrayList;
        Integer num;
        boolean z;
        String str3;
        ?? arrayList2;
        ?? arrayList3;
        String str4;
        String str5;
        String str6;
        ?? arrayList4;
        GetOfferProductListQuery.OnOfferProductListResponseSuccess onOfferProductListResponseSuccess = getOfferProductList.b;
        if (onOfferProductListResponseSuccess == null) {
            GetOfferProductListQuery.OnOfferProductListResponseFailure onOfferProductListResponseFailure = getOfferProductList.c;
            if (onOfferProductListResponseFailure != null) {
                return new OfferProductList.Fail(onOfferProductListResponseFailure.f21535a);
            }
            throw new IllegalStateException("Error mapping `GetOfferProductList`: missing non-null synthetic field!");
        }
        boolean z2 = onOfferProductListResponseSuccess.f21536a;
        String str7 = onOfferProductListResponseSuccess.b;
        String str8 = onOfferProductListResponseSuccess.c;
        String str9 = onOfferProductListResponseSuccess.d;
        GetOfferProductListQuery.Progress progress = onOfferProductListResponseSuccess.e;
        OfferProductList.Success.Progress progress2 = new OfferProductList.Success.Progress(progress.f21537a, progress.b, ProgressStepTypeExtKt.a(progress.c), progress.d);
        int iOrdinal = onOfferProductListResponseSuccess.f.ordinal();
        OfferProductList.Success.OfferType offerType = iOrdinal != 0 ? iOrdinal != 1 ? OfferProductList.Success.OfferType.d : OfferProductList.Success.OfferType.f : OfferProductList.Success.OfferType.e;
        ArrayList arrayList5 = onOfferProductListResponseSuccess.g;
        ArrayList arrayList6 = new ArrayList(CollectionsKt.s(arrayList5, 10));
        Iterator it = arrayList5.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            emptyList = EmptyList.d;
            if (!zHasNext) {
                break;
            }
            GetOfferProductListQuery.OfferProduct offerProduct = (GetOfferProductListQuery.OfferProduct) it.next();
            Intrinsics.h(offerProduct, "<this>");
            ProductCard productCard = offerProduct.b;
            String str10 = productCard.f8949a;
            String str11 = productCard.b;
            String str12 = productCard.e;
            String str13 = productCard.j;
            Integer num2 = productCard.h;
            Iterator it2 = it;
            String str14 = productCard.i;
            String str15 = productCard.l;
            boolean z3 = productCard.f;
            boolean z4 = productCard.c;
            String str16 = productCard.m;
            String str17 = productCard.n;
            ProductCard.Trolley trolley = productCard.p;
            ProductTrolleyData uiModel = trolley != null ? ProductCardKt.toUiModel(trolley) : null;
            List list = productCard.q;
            if (list != null) {
                List list2 = list;
                num = num2;
                z = z2;
                str3 = str7;
                arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(ProductCardKt.toUiModel((ProductCard.Trolley1) it3.next()));
                }
            } else {
                num = num2;
                z = z2;
                str3 = str7;
                arrayList2 = 0;
            }
            EmptyList emptyList2 = arrayList2 == 0 ? emptyList : arrayList2;
            ProductShoppingList uiModel2 = ProductCardListExtKt.toUiModel(productCard.r);
            ProductCard.InStoreDetails inStoreDetails = productCard.s;
            InstoreDetailsData uiModel3 = inStoreDetails != null ? ProductCardInStoreDetailsExtKt.toUiModel(inStoreDetails) : null;
            PurchaseRestriction purchaseRestriction = productCard.d;
            au.com.woolworths.product.models.PurchaseRestriction uiModel4 = purchaseRestriction != null ? PurchaseRestrictionExtKt.toUiModel(purchaseRestriction) : null;
            List<ProductCard.InlineLabel> list3 = productCard.o;
            if (list3 != null) {
                arrayList3 = new ArrayList();
                for (ProductCard.InlineLabel inlineLabel : list3) {
                    ProductInlineLabelApiData uiModel5 = inlineLabel != null ? ProductCardInlineLabelExtKt.toUiModel(inlineLabel) : null;
                    if (uiModel5 != null) {
                        arrayList3.add(uiModel5);
                    }
                }
            } else {
                arrayList3 = 0;
            }
            EmptyList emptyList3 = arrayList3 == 0 ? emptyList : arrayList3;
            ProductCard.PromotionInfo promotionInfo = productCard.k;
            PromotionInfo uiModel6 = promotionInfo != null ? ProductCardPromotionInfoExtKt.toUiModel(promotionInfo) : null;
            String str18 = productCard.u;
            String str19 = productCard.v;
            ProductCard.Marketplace marketplace = productCard.w;
            ProductListMarketplace uiModel7 = marketplace != null ? ProductCardMarketplaceExtKt.toUiModel(marketplace) : null;
            ProductCard.RewardsOfferInfo rewardsOfferInfo = productCard.x;
            RewardsOfferInfo uiModel8 = rewardsOfferInfo != null ? ProductCardRewardsOfferInfoExtKt.toUiModel(rewardsOfferInfo) : null;
            String str20 = productCard.y;
            ProductCard.TagLabel tagLabel = productCard.z;
            TagLabel uiModel9 = tagLabel != null ? ProductCardTagLabelExtKt.toUiModel(tagLabel) : null;
            ProductCard.InStoreAvailabilityInfo inStoreAvailabilityInfo = productCard.g;
            InStoreAvailabilityInfo uiModel10 = inStoreAvailabilityInfo != null ? ProductCardInStoreAvailabilityInfoExtKt.toUiModel(inStoreAvailabilityInfo) : null;
            ProductCard.ProductVarieties productVarieties = productCard.A;
            ProductVarieties uiModel11 = productVarieties != null ? ProductCardProductVarietiesExtKt.toUiModel(productVarieties) : null;
            List list4 = productCard.B;
            if (list4 != null) {
                List list5 = list4;
                str4 = str18;
                str5 = str19;
                str6 = str20;
                arrayList4 = new ArrayList(CollectionsKt.s(list5, 10));
                Iterator it4 = list5.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(ProductCardCategoryExtKt.toUiModel((ProductCard.Category) it4.next()));
                }
            } else {
                str4 = str18;
                str5 = str19;
                str6 = str20;
                arrayList4 = 0;
            }
            EmptyList emptyList4 = arrayList4 == 0 ? emptyList : arrayList4;
            boolean z5 = productCard.C;
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
            arrayList6.add(new au.com.woolworths.product.models.ProductCard(str10, str11, str12, str13, num, str14, null, null, str15, z3, z4, str16, null, null, str17, uiModel, emptyList2, uiModel2, uiModel3, uiModel4, emptyList3, uiModel6, str4, str5, uiModel7, uiModel8, str6, uiModel9, uiModel10, uiModel11, emptyList4, z5, uiModel12, uiModel13, uiModel14, uiModel15, uiModel16, null, productCardAction != null ? ProductCardProductCardActionExtKt.toUiModel(productCardAction) : null, productCard.I, 12480, 32, null));
            it = it2;
            z2 = z;
            str7 = str3;
        }
        boolean z6 = z2;
        String str21 = str7;
        AnalyticsFields analyticsFields = onOfferProductListResponseSuccess.h.b;
        String str22 = analyticsFields.f10032a;
        String str23 = analyticsFields.b;
        String str24 = analyticsFields.c;
        String str25 = analyticsFields.e;
        String str26 = analyticsFields.f;
        String str27 = analyticsFields.g;
        String str28 = analyticsFields.d;
        String str29 = analyticsFields.h;
        String str30 = analyticsFields.i;
        List list6 = analyticsFields.j;
        if (list6 != null) {
            List list7 = list6;
            str = str23;
            str2 = str24;
            arrayList = new ArrayList(CollectionsKt.s(list7, 10));
            Iterator it5 = list7.iterator();
            while (it5.hasNext()) {
                arrayList.add(AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it5.next()));
            }
        } else {
            str = str23;
            str2 = str24;
            arrayList = 0;
        }
        return new OfferProductList.Success(z6, str21, str8, str9, progress2, offerType, arrayList6, new AnalyticsData((EventConfig) null, str22, str, str2, str25, str26, str27, str28, str29, str30, arrayList == 0 ? emptyList : arrayList, 1, (DefaultConstructorMarker) null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.util.ArrayList] */
    public static OfferProductList c(UpdateOfferProductListMutation.UpdateOfferProductList updateOfferProductList) {
        EmptyList emptyList;
        String str;
        String str2;
        ?? arrayList;
        Integer num;
        boolean z;
        String str3;
        ?? arrayList2;
        ?? arrayList3;
        String str4;
        String str5;
        String str6;
        ?? arrayList4;
        UpdateOfferProductListMutation.OnOfferProductListResponseSuccess onOfferProductListResponseSuccess = updateOfferProductList.b;
        if (onOfferProductListResponseSuccess == null) {
            UpdateOfferProductListMutation.OnOfferProductListResponseFailure onOfferProductListResponseFailure = updateOfferProductList.c;
            if (onOfferProductListResponseFailure != null) {
                return new OfferProductList.Fail(onOfferProductListResponseFailure.f21570a);
            }
            throw new IllegalStateException("Error mapping `UpdateOfferProductList`: missing non-null synthetic field!");
        }
        boolean z2 = onOfferProductListResponseSuccess.f21571a;
        String str7 = onOfferProductListResponseSuccess.b;
        String str8 = onOfferProductListResponseSuccess.c;
        String str9 = onOfferProductListResponseSuccess.d;
        UpdateOfferProductListMutation.Progress progress = onOfferProductListResponseSuccess.e;
        OfferProductList.Success.Progress progress2 = new OfferProductList.Success.Progress(progress.f21572a, progress.b, ProgressStepTypeExtKt.a(progress.c), progress.d);
        int iOrdinal = onOfferProductListResponseSuccess.f.ordinal();
        OfferProductList.Success.OfferType offerType = iOrdinal != 0 ? iOrdinal != 1 ? OfferProductList.Success.OfferType.d : OfferProductList.Success.OfferType.f : OfferProductList.Success.OfferType.e;
        ArrayList arrayList5 = onOfferProductListResponseSuccess.g;
        ArrayList arrayList6 = new ArrayList(CollectionsKt.s(arrayList5, 10));
        Iterator it = arrayList5.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            emptyList = EmptyList.d;
            if (!zHasNext) {
                break;
            }
            UpdateOfferProductListMutation.OfferProduct offerProduct = (UpdateOfferProductListMutation.OfferProduct) it.next();
            Intrinsics.h(offerProduct, "<this>");
            ProductCard productCard = offerProduct.b;
            String str10 = productCard.f8949a;
            String str11 = productCard.b;
            String str12 = productCard.e;
            String str13 = productCard.j;
            Integer num2 = productCard.h;
            Iterator it2 = it;
            String str14 = productCard.i;
            String str15 = productCard.l;
            boolean z3 = productCard.f;
            boolean z4 = productCard.c;
            String str16 = productCard.m;
            String str17 = productCard.n;
            ProductCard.Trolley trolley = productCard.p;
            ProductTrolleyData uiModel = trolley != null ? ProductCardKt.toUiModel(trolley) : null;
            List list = productCard.q;
            if (list != null) {
                List list2 = list;
                num = num2;
                z = z2;
                str3 = str7;
                arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(ProductCardKt.toUiModel((ProductCard.Trolley1) it3.next()));
                }
            } else {
                num = num2;
                z = z2;
                str3 = str7;
                arrayList2 = 0;
            }
            EmptyList emptyList2 = arrayList2 == 0 ? emptyList : arrayList2;
            ProductShoppingList uiModel2 = ProductCardListExtKt.toUiModel(productCard.r);
            ProductCard.InStoreDetails inStoreDetails = productCard.s;
            InstoreDetailsData uiModel3 = inStoreDetails != null ? ProductCardInStoreDetailsExtKt.toUiModel(inStoreDetails) : null;
            PurchaseRestriction purchaseRestriction = productCard.d;
            au.com.woolworths.product.models.PurchaseRestriction uiModel4 = purchaseRestriction != null ? PurchaseRestrictionExtKt.toUiModel(purchaseRestriction) : null;
            List<ProductCard.InlineLabel> list3 = productCard.o;
            if (list3 != null) {
                arrayList3 = new ArrayList();
                for (ProductCard.InlineLabel inlineLabel : list3) {
                    ProductInlineLabelApiData uiModel5 = inlineLabel != null ? ProductCardInlineLabelExtKt.toUiModel(inlineLabel) : null;
                    if (uiModel5 != null) {
                        arrayList3.add(uiModel5);
                    }
                }
            } else {
                arrayList3 = 0;
            }
            EmptyList emptyList3 = arrayList3 == 0 ? emptyList : arrayList3;
            ProductCard.PromotionInfo promotionInfo = productCard.k;
            PromotionInfo uiModel6 = promotionInfo != null ? ProductCardPromotionInfoExtKt.toUiModel(promotionInfo) : null;
            String str18 = productCard.u;
            String str19 = productCard.v;
            ProductCard.Marketplace marketplace = productCard.w;
            ProductListMarketplace uiModel7 = marketplace != null ? ProductCardMarketplaceExtKt.toUiModel(marketplace) : null;
            ProductCard.RewardsOfferInfo rewardsOfferInfo = productCard.x;
            RewardsOfferInfo uiModel8 = rewardsOfferInfo != null ? ProductCardRewardsOfferInfoExtKt.toUiModel(rewardsOfferInfo) : null;
            String str20 = productCard.y;
            ProductCard.TagLabel tagLabel = productCard.z;
            TagLabel uiModel9 = tagLabel != null ? ProductCardTagLabelExtKt.toUiModel(tagLabel) : null;
            ProductCard.InStoreAvailabilityInfo inStoreAvailabilityInfo = productCard.g;
            InStoreAvailabilityInfo uiModel10 = inStoreAvailabilityInfo != null ? ProductCardInStoreAvailabilityInfoExtKt.toUiModel(inStoreAvailabilityInfo) : null;
            ProductCard.ProductVarieties productVarieties = productCard.A;
            ProductVarieties uiModel11 = productVarieties != null ? ProductCardProductVarietiesExtKt.toUiModel(productVarieties) : null;
            List list4 = productCard.B;
            if (list4 != null) {
                List list5 = list4;
                str4 = str18;
                str5 = str19;
                str6 = str20;
                arrayList4 = new ArrayList(CollectionsKt.s(list5, 10));
                Iterator it4 = list5.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(ProductCardCategoryExtKt.toUiModel((ProductCard.Category) it4.next()));
                }
            } else {
                str4 = str18;
                str5 = str19;
                str6 = str20;
                arrayList4 = 0;
            }
            EmptyList emptyList4 = arrayList4 == 0 ? emptyList : arrayList4;
            boolean z5 = productCard.C;
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
            arrayList6.add(new au.com.woolworths.product.models.ProductCard(str10, str11, str12, str13, num, str14, null, null, str15, z3, z4, str16, null, null, str17, uiModel, emptyList2, uiModel2, uiModel3, uiModel4, emptyList3, uiModel6, str4, str5, uiModel7, uiModel8, str6, uiModel9, uiModel10, uiModel11, emptyList4, z5, uiModel12, uiModel13, uiModel14, uiModel15, uiModel16, null, productCardAction != null ? ProductCardProductCardActionExtKt.toUiModel(productCardAction) : null, productCard.I, 12480, 32, null));
            it = it2;
            z2 = z;
            str7 = str3;
        }
        boolean z6 = z2;
        String str21 = str7;
        AnalyticsFields analyticsFields = onOfferProductListResponseSuccess.h.b;
        String str22 = analyticsFields.f10032a;
        String str23 = analyticsFields.b;
        String str24 = analyticsFields.c;
        String str25 = analyticsFields.e;
        String str26 = analyticsFields.f;
        String str27 = analyticsFields.g;
        String str28 = analyticsFields.d;
        String str29 = analyticsFields.h;
        String str30 = analyticsFields.i;
        List list6 = analyticsFields.j;
        if (list6 != null) {
            List list7 = list6;
            str = str23;
            str2 = str24;
            arrayList = new ArrayList(CollectionsKt.s(list7, 10));
            Iterator it5 = list7.iterator();
            while (it5.hasNext()) {
                arrayList.add(AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it5.next()));
            }
        } else {
            str = str23;
            str2 = str24;
            arrayList = 0;
        }
        return new OfferProductList.Success(z6, str21, str8, str9, progress2, offerType, arrayList6, new AnalyticsData((EventConfig) null, str22, str, str2, str25, str26, str27, str28, str29, str30, arrayList == 0 ? emptyList : arrayList, 1, (DefaultConstructorMarker) null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r6 instanceof au.com.woolworths.shop.cart.data.QuickAddOfferDataRepository$queryOfferProductList$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.shop.cart.data.QuickAddOfferDataRepository$queryOfferProductList$1 r0 = (au.com.woolworths.shop.cart.data.QuickAddOfferDataRepository$queryOfferProductList$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.cart.data.QuickAddOfferDataRepository$queryOfferProductList$1 r0 = new au.com.woolworths.shop.cart.data.QuickAddOfferDataRepository$queryOfferProductList$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L4e
        L27:
            r5 = move-exception
            goto L5d
        L29:
            r5 = move-exception
            goto L62
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.b(r6)
            com.apollographql.apollo.ApolloClient r6 = r4.f10307a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.shop.cart.GetOfferProductListQuery r2 = new com.woolworths.shop.cart.GetOfferProductListQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r2.<init>(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r6.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.ApolloCall r5 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r5.<init>(r6, r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Object r6 = r5.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r6 != r1) goto L4e
            return r1
        L4e:
            com.apollographql.apollo.api.ApolloResponse r6 = (com.apollographql.apollo.api.ApolloResponse) r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Operation$Data r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.shop.cart.GetOfferProductListQuery$Data r5 = (com.woolworths.shop.cart.GetOfferProductListQuery.Data) r5     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.shop.cart.GetOfferProductListQuery$GetOfferProductList r5 = r5.f21531a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.shop.cart.domain.model.OfferProductList r5 = b(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            return r5
        L5d:
            au.com.woolworths.android.onesite.network.ServerErrorException r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r5)
            throw r5
        L62:
            java.lang.Exception r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.cart.data.QuickAddOfferDataRepository.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.util.Map r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws java.lang.Exception {
        /*
            r9 = this;
            boolean r0 = r11 instanceof au.com.woolworths.shop.cart.data.QuickAddOfferDataRepository$updateOfferProductList$1
            if (r0 == 0) goto L13
            r0 = r11
            au.com.woolworths.shop.cart.data.QuickAddOfferDataRepository$updateOfferProductList$1 r0 = (au.com.woolworths.shop.cart.data.QuickAddOfferDataRepository$updateOfferProductList$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.cart.data.QuickAddOfferDataRepository$updateOfferProductList$1 r0 = new au.com.woolworths.shop.cart.data.QuickAddOfferDataRepository$updateOfferProductList$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r11)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L84
        L27:
            r10 = move-exception
            goto L93
        L29:
            r10 = move-exception
            goto L98
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            kotlin.ResultKt.b(r11)
            com.apollographql.apollo.ApolloClient r11 = r9.f10307a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            int r4 = r10.size()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r2.<init>(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.util.Set r10 = r10.entrySet()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.util.Iterator r10 = r10.iterator()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
        L49:
            boolean r4 = r10.hasNext()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r4 == 0) goto L6e
            java.lang.Object r4 = r10.next()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.shop.graphql.type.UpdateOfferProductQuantityUpdate r5 = new au.com.woolworths.shop.graphql.type.UpdateOfferProductQuantityUpdate     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Object r6 = r4.getKey()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.String r6 = (java.lang.String) r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Object r4 = r4.getValue()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Number r4 = (java.lang.Number) r4     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            double r7 = r4.doubleValue()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r5.<init>(r6, r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r2.add(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L49
        L6e:
            com.woolworths.shop.cart.UpdateOfferProductListMutation r10 = new com.woolworths.shop.cart.UpdateOfferProductListMutation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r10.<init>(r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r11.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.ApolloCall r2 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r2.<init>(r11, r10)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Object r11 = r2.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r11 != r1) goto L84
            return r1
        L84:
            com.apollographql.apollo.api.ApolloResponse r11 = (com.apollographql.apollo.api.ApolloResponse) r11     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Operation$Data r10 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r11)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.shop.cart.UpdateOfferProductListMutation$Data r10 = (com.woolworths.shop.cart.UpdateOfferProductListMutation.Data) r10     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.shop.cart.UpdateOfferProductListMutation$UpdateOfferProductList r10 = r10.f21567a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.shop.cart.domain.model.OfferProductList r10 = c(r10)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            return r10
        L93:
            au.com.woolworths.android.onesite.network.ServerErrorException r10 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r10)
            throw r10
        L98:
            java.lang.Exception r10 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.cart.data.QuickAddOfferDataRepository.d(java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
