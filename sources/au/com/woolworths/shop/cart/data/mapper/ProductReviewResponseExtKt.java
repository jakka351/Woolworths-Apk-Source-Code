package au.com.woolworths.shop.cart.data.mapper;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerActionApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerActionPlacementTypeApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerActionTypeApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerTypeApiData;
import au.com.woolworths.base.shopapp.modules.badge.BadgeApiData;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantityInfo;
import au.com.woolworths.graphql.common.fragment.ProductReviewResponse;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.cart.domain.model.ProductAlternative;
import au.com.woolworths.shop.cart.domain.model.ProductReviewAlternativeType;
import au.com.woolworths.shop.cart.domain.model.ProductReviewCard;
import au.com.woolworths.shop.cart.domain.model.ProductReviewFeed;
import au.com.woolworths.shop.cart.domain.model.ProductReviewGroupType;
import au.com.woolworths.shop.cart.domain.model.ProductReviewResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-cart_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductReviewResponseExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.util.ArrayList] */
    public static final ProductReviewResult.Response a(ProductReviewResponse productReviewResponse) {
        EmptyList emptyList;
        Iterator it;
        String str;
        ?? arrayList;
        Iterator it2;
        ProductReviewFeed.ProductReviewGroup productReviewGroup;
        int i;
        InsetBannerActionApiData insetBannerActionApiData;
        String str2;
        String str3;
        ?? arrayList2;
        Iterator it3;
        String str4;
        BadgeApiData badgeApiData;
        String str5;
        CartProductQuantityInfo cartProductQuantityInfo;
        Integer num;
        ProductAlternative productAlternative;
        ProductReviewAlternativeType productReviewAlternativeType;
        InsetBannerActionTypeApiData insetBannerActionTypeApiData;
        String str6 = "<this>";
        Intrinsics.h(productReviewResponse, "<this>");
        String str7 = productReviewResponse.f9003a;
        ArrayList arrayList3 = productReviewResponse.b;
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = arrayList3.iterator();
        while (true) {
            boolean zHasNext = it4.hasNext();
            emptyList = EmptyList.d;
            if (!zHasNext) {
                break;
            }
            ProductReviewResponse.OnProductReviewGroup onProductReviewGroup = ((ProductReviewResponse.Feed) it4.next()).b;
            if (onProductReviewGroup != null) {
                ProductReviewResponse.Banner banner = onProductReviewGroup.f9011a;
                int iOrdinal = banner.f9009a.ordinal();
                InsetBannerTypeApiData insetBannerTypeApiData = iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? InsetBannerTypeApiData.INFO : InsetBannerTypeApiData.GREEN : InsetBannerTypeApiData.REWARDS : InsetBannerTypeApiData.ERROR : InsetBannerTypeApiData.WARNING : InsetBannerTypeApiData.INFO;
                String str8 = banner.b;
                String str9 = banner.d;
                ProductReviewResponse.Action action = banner.e;
                if (action != null) {
                    String str10 = action.c;
                    String str11 = action.d;
                    int iOrdinal2 = action.b.ordinal();
                    if (iOrdinal2 != 0) {
                        it2 = it4;
                        i = 1;
                        insetBannerActionTypeApiData = iOrdinal2 != 1 ? InsetBannerActionTypeApiData.UNKNOWN : InsetBannerActionTypeApiData.APPLOCAL;
                    } else {
                        it2 = it4;
                        i = 1;
                        insetBannerActionTypeApiData = InsetBannerActionTypeApiData.LINK;
                    }
                    InsetBannerActionTypeApiData insetBannerActionTypeApiData2 = insetBannerActionTypeApiData;
                    int iOrdinal3 = action.f9004a.ordinal();
                    InsetBannerActionPlacementTypeApiData insetBannerActionPlacementTypeApiData = (iOrdinal3 == 0 || iOrdinal3 != i) ? InsetBannerActionPlacementTypeApiData.BOTTOM : InsetBannerActionPlacementTypeApiData.RIGHT;
                    insetBannerActionApiData = new InsetBannerActionApiData(str10, str11, insetBannerActionTypeApiData2, insetBannerActionPlacementTypeApiData, null);
                } else {
                    it2 = it4;
                    i = 1;
                    insetBannerActionApiData = null;
                }
                InsetBannerApiData insetBannerApiData = new InsetBannerApiData(insetBannerTypeApiData, str8, str9, insetBannerActionApiData, banner.c, null, 32, null);
                int iOrdinal4 = onProductReviewGroup.b.ordinal();
                ProductReviewGroupType productReviewGroupType = iOrdinal4 != 0 ? iOrdinal4 != i ? ProductReviewGroupType.f : ProductReviewGroupType.e : ProductReviewGroupType.d;
                ArrayList arrayList5 = onProductReviewGroup.c;
                ArrayList arrayList6 = new ArrayList(CollectionsKt.s(arrayList5, 10));
                Iterator it5 = arrayList5.iterator();
                while (it5.hasNext()) {
                    ProductReviewResponse.Product product = (ProductReviewResponse.Product) it5.next();
                    Intrinsics.h(product, "<this>");
                    String str12 = product.f9012a;
                    String str13 = product.b;
                    double d = product.c;
                    String str14 = product.d;
                    ProductReviewResponse.Badge badge = product.e;
                    EmptyList emptyList2 = emptyList;
                    if (badge != null) {
                        it3 = it5;
                        str4 = str12;
                        badgeApiData = new BadgeApiData(badge.f9008a, BadgeTypeExtKt.a(badge.b), null);
                    } else {
                        it3 = it5;
                        str4 = str12;
                        badgeApiData = null;
                    }
                    ProductReviewResponse.QuantityInfo quantityInfo = product.f;
                    if (quantityInfo != null) {
                        str5 = str13;
                        cartProductQuantityInfo = new CartProductQuantityInfo(quantityInfo.f9013a, quantityInfo.b, quantityInfo.c, quantityInfo.d, quantityInfo.e);
                    } else {
                        str5 = str13;
                        cartProductQuantityInfo = null;
                    }
                    Integer num2 = product.g;
                    boolean z = product.h;
                    ProductReviewResponse.Alternative alternative = product.i;
                    if (alternative != null) {
                        String str15 = alternative.f9005a;
                        int iOrdinal5 = alternative.b.ordinal();
                        if (iOrdinal5 != 0) {
                            num = num2;
                            productReviewAlternativeType = iOrdinal5 != 1 ? ProductReviewAlternativeType.e : ProductReviewAlternativeType.e;
                        } else {
                            num = num2;
                            productReviewAlternativeType = ProductReviewAlternativeType.d;
                        }
                        productAlternative = new ProductAlternative(str15, productReviewAlternativeType);
                    } else {
                        num = num2;
                        productAlternative = null;
                    }
                    arrayList6.add(new ProductReviewCard(str4, str5, d, str14, badgeApiData, cartProductQuantityInfo, num, z, productAlternative, null, product.j));
                    emptyList = emptyList2;
                    it5 = it3;
                }
                EmptyList emptyList3 = emptyList;
                AnalyticsFields analyticsFields = onProductReviewGroup.d.b;
                String str16 = analyticsFields.f10032a;
                String str17 = analyticsFields.b;
                String str18 = analyticsFields.c;
                String str19 = analyticsFields.e;
                String str20 = analyticsFields.f;
                String str21 = analyticsFields.g;
                String str22 = analyticsFields.d;
                String str23 = analyticsFields.h;
                String str24 = analyticsFields.i;
                List list = analyticsFields.j;
                if (list != null) {
                    List list2 = list;
                    str2 = str24;
                    str3 = str17;
                    arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
                    Iterator it6 = list2.iterator();
                    while (it6.hasNext()) {
                        arrayList2.add(au.com.woolworths.product.models.AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it6.next()));
                    }
                } else {
                    str2 = str24;
                    str3 = str17;
                    arrayList2 = 0;
                }
                productReviewGroup = new ProductReviewFeed.ProductReviewGroup(insetBannerApiData, productReviewGroupType, arrayList6, new AnalyticsData((EventConfig) null, str16, str3, str18, str19, str20, str21, str22, str23, str2, arrayList2 == 0 ? emptyList3 : arrayList2, 1, (DefaultConstructorMarker) null));
            } else {
                it2 = it4;
                productReviewGroup = null;
            }
            if (productReviewGroup != null) {
                arrayList4.add(productReviewGroup);
            }
            it4 = it2;
        }
        ArrayList arrayList7 = productReviewResponse.c;
        ArrayList arrayList8 = new ArrayList(CollectionsKt.s(arrayList7, 10));
        Iterator it7 = arrayList7.iterator();
        while (it7.hasNext()) {
            ProductReviewResponse.Analytic analytic = (ProductReviewResponse.Analytic) it7.next();
            Intrinsics.h(analytic, str6);
            AnalyticsFields analyticsFields2 = analytic.b;
            String str25 = analyticsFields2.f10032a;
            String str26 = analyticsFields2.b;
            String str27 = analyticsFields2.c;
            String str28 = analyticsFields2.e;
            String str29 = analyticsFields2.f;
            String str30 = analyticsFields2.g;
            String str31 = analyticsFields2.d;
            String str32 = analyticsFields2.h;
            String str33 = analyticsFields2.i;
            List list3 = analyticsFields2.j;
            if (list3 != null) {
                List list4 = list3;
                it = it7;
                str = str6;
                arrayList = new ArrayList(CollectionsKt.s(list4, 10));
                Iterator it8 = list4.iterator();
                while (it8.hasNext()) {
                    arrayList.add(au.com.woolworths.product.models.AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it8.next()));
                }
            } else {
                it = it7;
                str = str6;
                arrayList = 0;
            }
            arrayList8.add(new AnalyticsData((EventConfig) null, str25, str26, str27, str28, str29, str30, str31, str32, str33, arrayList == 0 ? emptyList : arrayList, 1, (DefaultConstructorMarker) null));
            it7 = it;
            str6 = str;
        }
        return new ProductReviewResult.Response(str7, arrayList4, arrayList8);
    }
}
