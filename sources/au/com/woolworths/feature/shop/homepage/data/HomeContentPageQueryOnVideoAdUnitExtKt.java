package au.com.woolworths.feature.shop.homepage.data;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.android.onesite.models.products.ProductListMarketplace;
import au.com.woolworths.android.onesite.models.products.PromotionInfo;
import au.com.woolworths.base.shopapp.data.models.CartProductInfo;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdBottomSheet;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdData;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdEventAnalytics;
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
import au.com.woolworths.product.models.VideoAdUnitCarousel;
import au.com.woolworths.product.models.VideoAdUnitData;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.model.action.ActionType;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.aem.components.model.ImageWithAltText;
import au.com.woolworths.shop.aem.components.model.link.LinkData;
import au.com.woolworths.shop.aem.components.model.link.TextWithAltData;
import au.com.woolworths.shop.graphql.type.PurchaseRestriction;
import com.woolworths.shop.homepage.HomeContentPageQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"homepage_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HomeContentPageQueryOnVideoAdUnitExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v30, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42, types: [java.util.ArrayList] */
    public static final VideoAdUnitData a(HomeContentPageQuery.OnVideoAdUnit onVideoAdUnit) {
        String str;
        int i;
        ImageWithAltText imageWithAltText;
        VideoAdBottomSheet videoAdBottomSheet;
        VideoAdBottomSheet videoAdBottomSheet2;
        AnalyticsData analyticsData;
        VideoAdBottomSheet videoAdBottomSheet3;
        VideoAdBottomSheet videoAdBottomSheet4;
        VideoAdEventAnalytics videoAdEventAnalytics;
        VideoAdUnitCarousel videoAdUnitCarousel;
        LinkData linkData;
        AnalyticsData analyticsData2;
        String str2;
        EmptyList emptyList;
        ?? arrayList;
        Iterator it;
        ProductCard productCard;
        String str3;
        String str4;
        String str5;
        ?? arrayList2;
        ?? arrayList3;
        String str6;
        String str7;
        String str8;
        ?? arrayList4;
        AnalyticsData analyticsData3;
        AnalyticsData analyticsData4;
        AnalyticsData analyticsData5;
        AnalyticsData analyticsData6;
        String str9;
        String str10;
        String str11;
        ?? arrayList5;
        String str12;
        String str13;
        ?? arrayList6;
        String str14;
        String str15;
        String str16;
        ?? arrayList7;
        String str17;
        String str18;
        ?? arrayList8;
        String str19;
        String str20;
        ?? arrayList9;
        String str21;
        AnalyticsData analyticsData7;
        String str22;
        String str23;
        String str24;
        ?? arrayList10;
        AnalyticsData analyticsData8;
        String str25;
        String str26;
        String str27;
        ?? arrayList11;
        Intrinsics.h(onVideoAdUnit, "<this>");
        HomeContentPageQuery.VideoAdUnitVideoAd videoAdUnitVideoAd = onVideoAdUnit.b;
        String str28 = videoAdUnitVideoAd.b;
        int i2 = videoAdUnitVideoAd.d;
        HomeContentPageQuery.FallbackImage fallbackImage = videoAdUnitVideoAd.c;
        ImageWithAltText imageWithAltText2 = fallbackImage != null ? new ImageWithAltText(fallbackImage.f22818a, fallbackImage.b) : null;
        HomeContentPageQuery.Transcript transcript = videoAdUnitVideoAd.e;
        EmptyList emptyList2 = EmptyList.d;
        if (transcript != null) {
            String str29 = transcript.b;
            String str30 = transcript.c;
            String str31 = transcript.d;
            String str32 = transcript.e;
            HomeContentPageQuery.ImpressionAnalytics2 impressionAnalytics2 = transcript.f;
            if (impressionAnalytics2 != null) {
                AnalyticsFields analyticsFields = impressionAnalytics2.b;
                String str33 = analyticsFields.f10032a;
                String str34 = analyticsFields.b;
                String str35 = analyticsFields.c;
                String str36 = analyticsFields.e;
                str = str28;
                String str37 = analyticsFields.f;
                String str38 = analyticsFields.g;
                String str39 = analyticsFields.d;
                String str40 = analyticsFields.h;
                String str41 = analyticsFields.i;
                List list = analyticsFields.j;
                if (list != null) {
                    List list2 = list;
                    str27 = str41;
                    i = i2;
                    imageWithAltText = imageWithAltText2;
                    arrayList11 = new ArrayList(CollectionsKt.s(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList11.add(au.com.woolworths.product.models.AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it2.next()));
                    }
                } else {
                    str27 = str41;
                    i = i2;
                    imageWithAltText = imageWithAltText2;
                    arrayList11 = 0;
                }
                analyticsData8 = new AnalyticsData((EventConfig) null, str33, str34, str35, str36, str37, str38, str39, str40, str27, arrayList11 == 0 ? emptyList2 : arrayList11, 1, (DefaultConstructorMarker) null);
                str26 = str32;
                str25 = str31;
            } else {
                str = str28;
                i = i2;
                imageWithAltText = imageWithAltText2;
                analyticsData8 = null;
                str25 = str31;
                str26 = str32;
            }
            videoAdBottomSheet = new VideoAdBottomSheet(str29, str30, str25, str26, analyticsData8);
        } else {
            str = str28;
            i = i2;
            imageWithAltText = imageWithAltText2;
            videoAdBottomSheet = null;
        }
        HomeContentPageQuery.TermsAndConditions termsAndConditions = videoAdUnitVideoAd.f;
        if (termsAndConditions != null) {
            String str42 = termsAndConditions.b;
            String str43 = termsAndConditions.c;
            String str44 = termsAndConditions.d;
            String str45 = termsAndConditions.e;
            HomeContentPageQuery.ImpressionAnalytics3 impressionAnalytics3 = termsAndConditions.f;
            if (impressionAnalytics3 != null) {
                AnalyticsFields analyticsFields2 = impressionAnalytics3.b;
                String str46 = analyticsFields2.f10032a;
                String str47 = analyticsFields2.b;
                String str48 = analyticsFields2.c;
                String str49 = analyticsFields2.e;
                String str50 = analyticsFields2.f;
                String str51 = analyticsFields2.g;
                String str52 = analyticsFields2.d;
                String str53 = analyticsFields2.h;
                String str54 = analyticsFields2.i;
                List list3 = analyticsFields2.j;
                if (list3 != null) {
                    List list4 = list3;
                    str22 = str54;
                    str23 = str46;
                    str24 = str47;
                    arrayList10 = new ArrayList(CollectionsKt.s(list4, 10));
                    Iterator it3 = list4.iterator();
                    while (it3.hasNext()) {
                        arrayList10.add(au.com.woolworths.product.models.AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it3.next()));
                    }
                } else {
                    str22 = str54;
                    str23 = str46;
                    str24 = str47;
                    arrayList10 = 0;
                }
                analyticsData7 = new AnalyticsData((EventConfig) null, str23, str24, str48, str49, str50, str51, str52, str53, str22, arrayList10 == 0 ? emptyList2 : arrayList10, 1, (DefaultConstructorMarker) null);
                str21 = str45;
            } else {
                str21 = str45;
                analyticsData7 = null;
            }
            videoAdBottomSheet2 = new VideoAdBottomSheet(str42, str43, str44, str21, analyticsData7);
        } else {
            videoAdBottomSheet2 = null;
        }
        HomeContentPageQuery.Analytics6 analytics6 = videoAdUnitVideoAd.g;
        if (analytics6 != null) {
            AnalyticsFields analyticsFields3 = analytics6.b;
            String str55 = analyticsFields3.f10032a;
            String str56 = analyticsFields3.b;
            String str57 = analyticsFields3.c;
            String str58 = analyticsFields3.e;
            String str59 = analyticsFields3.f;
            String str60 = analyticsFields3.g;
            String str61 = analyticsFields3.d;
            String str62 = analyticsFields3.h;
            String str63 = analyticsFields3.i;
            List list5 = analyticsFields3.j;
            if (list5 != null) {
                List list6 = list5;
                str19 = str57;
                str20 = str58;
                arrayList9 = new ArrayList(CollectionsKt.s(list6, 10));
                Iterator it4 = list6.iterator();
                while (it4.hasNext()) {
                    arrayList9.add(au.com.woolworths.product.models.AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it4.next()));
                }
            } else {
                str19 = str57;
                str20 = str58;
                arrayList9 = 0;
            }
            analyticsData = new AnalyticsData((EventConfig) null, str55, str56, str19, str20, str59, str60, str61, str62, str63, arrayList9 == 0 ? emptyList2 : arrayList9, 1, (DefaultConstructorMarker) null);
        } else {
            analyticsData = null;
        }
        HomeContentPageQuery.EventAnalytics eventAnalytics = videoAdUnitVideoAd.h;
        if (eventAnalytics != null) {
            HomeContentPageQuery.Impression impression = eventAnalytics.f22816a;
            if (impression != null) {
                AnalyticsFields analyticsFields4 = impression.b;
                String str64 = analyticsFields4.f10032a;
                String str65 = analyticsFields4.b;
                String str66 = analyticsFields4.c;
                String str67 = analyticsFields4.e;
                String str68 = analyticsFields4.f;
                String str69 = analyticsFields4.g;
                String str70 = analyticsFields4.d;
                String str71 = analyticsFields4.h;
                String str72 = analyticsFields4.i;
                List list7 = analyticsFields4.j;
                if (list7 != null) {
                    List list8 = list7;
                    str17 = str72;
                    str18 = str67;
                    videoAdBottomSheet3 = videoAdBottomSheet;
                    arrayList8 = new ArrayList(CollectionsKt.s(list8, 10));
                    Iterator it5 = list8.iterator();
                    while (it5.hasNext()) {
                        arrayList8.add(au.com.woolworths.product.models.AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it5.next()));
                    }
                } else {
                    str17 = str72;
                    str18 = str67;
                    videoAdBottomSheet3 = videoAdBottomSheet;
                    arrayList8 = 0;
                }
                analyticsData3 = new AnalyticsData((EventConfig) null, str64, str65, str66, str18, str68, str69, str70, str71, str17, arrayList8 == 0 ? emptyList2 : arrayList8, 1, (DefaultConstructorMarker) null);
            } else {
                videoAdBottomSheet3 = videoAdBottomSheet;
                analyticsData3 = null;
            }
            HomeContentPageQuery.VideoPlay videoPlay = eventAnalytics.b;
            if (videoPlay != null) {
                AnalyticsFields analyticsFields5 = videoPlay.b;
                String str73 = analyticsFields5.f10032a;
                String str74 = analyticsFields5.b;
                String str75 = analyticsFields5.c;
                String str76 = analyticsFields5.e;
                String str77 = analyticsFields5.f;
                String str78 = analyticsFields5.g;
                String str79 = analyticsFields5.d;
                String str80 = analyticsFields5.h;
                String str81 = analyticsFields5.i;
                List list9 = analyticsFields5.j;
                if (list9 != null) {
                    List list10 = list9;
                    str14 = str81;
                    str15 = str74;
                    str16 = str75;
                    arrayList7 = new ArrayList(CollectionsKt.s(list10, 10));
                    Iterator it6 = list10.iterator();
                    while (it6.hasNext()) {
                        arrayList7.add(au.com.woolworths.product.models.AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it6.next()));
                    }
                } else {
                    str14 = str81;
                    str15 = str74;
                    str16 = str75;
                    arrayList7 = 0;
                }
                analyticsData4 = new AnalyticsData((EventConfig) null, str73, str15, str16, str76, str77, str78, str79, str80, str14, arrayList7 == 0 ? emptyList2 : arrayList7, 1, (DefaultConstructorMarker) null);
            } else {
                analyticsData4 = null;
            }
            HomeContentPageQuery.VideoPause videoPause = eventAnalytics.c;
            if (videoPause != null) {
                AnalyticsFields analyticsFields6 = videoPause.b;
                String str82 = analyticsFields6.f10032a;
                String str83 = analyticsFields6.b;
                String str84 = analyticsFields6.c;
                String str85 = analyticsFields6.e;
                String str86 = analyticsFields6.f;
                String str87 = analyticsFields6.g;
                String str88 = analyticsFields6.d;
                String str89 = analyticsFields6.h;
                String str90 = analyticsFields6.i;
                List list11 = analyticsFields6.j;
                if (list11 != null) {
                    List list12 = list11;
                    str12 = str90;
                    str13 = str83;
                    videoAdBottomSheet4 = videoAdBottomSheet2;
                    arrayList6 = new ArrayList(CollectionsKt.s(list12, 10));
                    Iterator it7 = list12.iterator();
                    while (it7.hasNext()) {
                        arrayList6.add(au.com.woolworths.product.models.AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it7.next()));
                    }
                } else {
                    str12 = str90;
                    str13 = str83;
                    videoAdBottomSheet4 = videoAdBottomSheet2;
                    arrayList6 = 0;
                }
                analyticsData5 = new AnalyticsData((EventConfig) null, str82, str13, str84, str85, str86, str87, str88, str89, str12, arrayList6 == 0 ? emptyList2 : arrayList6, 1, (DefaultConstructorMarker) null);
            } else {
                videoAdBottomSheet4 = videoAdBottomSheet2;
                analyticsData5 = null;
            }
            HomeContentPageQuery.VideoErrorImpression videoErrorImpression = eventAnalytics.d;
            if (videoErrorImpression != null) {
                AnalyticsFields analyticsFields7 = videoErrorImpression.b;
                String str91 = analyticsFields7.f10032a;
                String str92 = analyticsFields7.b;
                String str93 = analyticsFields7.c;
                String str94 = analyticsFields7.e;
                String str95 = analyticsFields7.f;
                String str96 = analyticsFields7.g;
                String str97 = analyticsFields7.d;
                String str98 = analyticsFields7.h;
                String str99 = analyticsFields7.i;
                List list13 = analyticsFields7.j;
                if (list13 != null) {
                    List list14 = list13;
                    str9 = str99;
                    str10 = str92;
                    str11 = str93;
                    arrayList5 = new ArrayList(CollectionsKt.s(list14, 10));
                    Iterator it8 = list14.iterator();
                    while (it8.hasNext()) {
                        arrayList5.add(au.com.woolworths.product.models.AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it8.next()));
                    }
                } else {
                    str9 = str99;
                    str10 = str92;
                    str11 = str93;
                    arrayList5 = 0;
                }
                analyticsData6 = new AnalyticsData((EventConfig) null, str91, str10, str11, str94, str95, str96, str97, str98, str9, arrayList5 == 0 ? emptyList2 : arrayList5, 1, (DefaultConstructorMarker) null);
            } else {
                analyticsData6 = null;
            }
            videoAdEventAnalytics = new VideoAdEventAnalytics(analyticsData3, analyticsData4, analyticsData5, analyticsData6);
        } else {
            videoAdBottomSheet3 = videoAdBottomSheet;
            videoAdBottomSheet4 = videoAdBottomSheet2;
            videoAdEventAnalytics = null;
        }
        VideoAdData videoAdData = new VideoAdData(str, i, imageWithAltText, videoAdBottomSheet3, videoAdBottomSheet4, analyticsData, videoAdEventAnalytics);
        HomeContentPageQuery.VideoAdUnitCarousel videoAdUnitCarousel2 = onVideoAdUnit.c;
        if (videoAdUnitCarousel2 != null) {
            ArrayList arrayList12 = videoAdUnitCarousel2.b;
            ArrayList arrayList13 = new ArrayList();
            Iterator it9 = arrayList12.iterator();
            while (it9.hasNext()) {
                HomeContentPageQuery.OnProductCard1 onProductCard1 = ((HomeContentPageQuery.Item2) it9.next()).b;
                if (onProductCard1 != null) {
                    au.com.woolworths.graphql.common.fragment.ProductCard productCard2 = onProductCard1.b;
                    String str100 = productCard2.f8949a;
                    String str101 = productCard2.b;
                    String str102 = productCard2.e;
                    String str103 = productCard2.j;
                    Integer num = productCard2.h;
                    String str104 = productCard2.i;
                    String str105 = productCard2.l;
                    boolean z = productCard2.f;
                    boolean z2 = productCard2.c;
                    String str106 = productCard2.m;
                    it = it9;
                    String str107 = productCard2.n;
                    ProductCard.Trolley trolley = productCard2.p;
                    ProductTrolleyData uiModel = trolley != null ? ProductCardKt.toUiModel(trolley) : null;
                    List list15 = productCard2.q;
                    if (list15 != null) {
                        List list16 = list15;
                        str3 = str100;
                        str4 = str101;
                        str5 = str102;
                        arrayList2 = new ArrayList(CollectionsKt.s(list16, 10));
                        Iterator it10 = list16.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(ProductCardKt.toUiModel((ProductCard.Trolley1) it10.next()));
                        }
                    } else {
                        str3 = str100;
                        str4 = str101;
                        str5 = str102;
                        arrayList2 = 0;
                    }
                    EmptyList emptyList3 = arrayList2 == 0 ? emptyList2 : arrayList2;
                    ProductShoppingList uiModel2 = ProductCardListExtKt.toUiModel(productCard2.r);
                    ProductCard.InStoreDetails inStoreDetails = productCard2.s;
                    InstoreDetailsData uiModel3 = inStoreDetails != null ? ProductCardInStoreDetailsExtKt.toUiModel(inStoreDetails) : null;
                    PurchaseRestriction purchaseRestriction = productCard2.d;
                    au.com.woolworths.product.models.PurchaseRestriction uiModel4 = purchaseRestriction != null ? PurchaseRestrictionExtKt.toUiModel(purchaseRestriction) : null;
                    List<ProductCard.InlineLabel> list17 = productCard2.o;
                    if (list17 != null) {
                        arrayList3 = new ArrayList();
                        for (ProductCard.InlineLabel inlineLabel : list17) {
                            ProductInlineLabelApiData uiModel5 = inlineLabel != null ? ProductCardInlineLabelExtKt.toUiModel(inlineLabel) : null;
                            if (uiModel5 != null) {
                                arrayList3.add(uiModel5);
                            }
                        }
                    } else {
                        arrayList3 = 0;
                    }
                    EmptyList emptyList4 = arrayList3 == 0 ? emptyList2 : arrayList3;
                    ProductCard.PromotionInfo promotionInfo = productCard2.k;
                    PromotionInfo uiModel6 = promotionInfo != null ? ProductCardPromotionInfoExtKt.toUiModel(promotionInfo) : null;
                    String str108 = productCard2.u;
                    String str109 = productCard2.v;
                    ProductCard.Marketplace marketplace = productCard2.w;
                    ProductListMarketplace uiModel7 = marketplace != null ? ProductCardMarketplaceExtKt.toUiModel(marketplace) : null;
                    ProductCard.RewardsOfferInfo rewardsOfferInfo = productCard2.x;
                    RewardsOfferInfo uiModel8 = rewardsOfferInfo != null ? ProductCardRewardsOfferInfoExtKt.toUiModel(rewardsOfferInfo) : null;
                    String str110 = productCard2.y;
                    ProductCard.TagLabel tagLabel = productCard2.z;
                    TagLabel uiModel9 = tagLabel != null ? ProductCardTagLabelExtKt.toUiModel(tagLabel) : null;
                    ProductCard.InStoreAvailabilityInfo inStoreAvailabilityInfo = productCard2.g;
                    InStoreAvailabilityInfo uiModel10 = inStoreAvailabilityInfo != null ? ProductCardInStoreAvailabilityInfoExtKt.toUiModel(inStoreAvailabilityInfo) : null;
                    ProductCard.ProductVarieties productVarieties = productCard2.A;
                    ProductVarieties uiModel11 = productVarieties != null ? ProductCardProductVarietiesExtKt.toUiModel(productVarieties) : null;
                    List list18 = productCard2.B;
                    if (list18 != null) {
                        List list19 = list18;
                        str6 = str108;
                        str7 = str109;
                        str8 = str110;
                        arrayList4 = new ArrayList(CollectionsKt.s(list19, 10));
                        Iterator it11 = list19.iterator();
                        while (it11.hasNext()) {
                            arrayList4.add(ProductCardCategoryExtKt.toUiModel((ProductCard.Category) it11.next()));
                        }
                    } else {
                        str6 = str108;
                        str7 = str109;
                        str8 = str110;
                        arrayList4 = 0;
                    }
                    EmptyList emptyList5 = arrayList4 == 0 ? emptyList2 : arrayList4;
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
                    productCard = new au.com.woolworths.product.models.ProductCard(str3, str4, str5, str103, num, str104, null, null, str105, z, z2, str106, null, null, str107, uiModel, emptyList3, uiModel2, uiModel3, uiModel4, emptyList4, uiModel6, str6, str7, uiModel7, uiModel8, str8, uiModel9, uiModel10, uiModel11, emptyList5, z3, uiModel12, uiModel13, uiModel14, uiModel15, uiModel16, null, productCardAction != null ? ProductCardProductCardActionExtKt.toUiModel(productCardAction) : null, productCard2.I, 12480, 32, null);
                } else {
                    it = it9;
                    productCard = null;
                }
                if (productCard != null) {
                    arrayList13.add(productCard);
                }
                it9 = it;
            }
            videoAdUnitCarousel = new VideoAdUnitCarousel(arrayList13);
        } else {
            videoAdUnitCarousel = null;
        }
        HomeContentPageQuery.VideoAdUnitBottomLink videoAdUnitBottomLink = onVideoAdUnit.d;
        if (videoAdUnitBottomLink != null) {
            String str111 = videoAdUnitBottomLink.b;
            HomeContentPageQuery.LinkAction linkAction = videoAdUnitBottomLink.d;
            String str112 = linkAction.c;
            ActionType uiModel17 = au.com.woolworths.product.models.ActionTypeExtKt.toUiModel(linkAction.b);
            String str113 = linkAction.e;
            HomeContentPageQuery.Analytics7 analytics7 = linkAction.d;
            if (analytics7 != null) {
                AnalyticsFields analyticsFields8 = analytics7.b;
                String str114 = analyticsFields8.f10032a;
                String str115 = analyticsFields8.b;
                String str116 = analyticsFields8.c;
                String str117 = analyticsFields8.e;
                String str118 = analyticsFields8.f;
                String str119 = analyticsFields8.g;
                String str120 = analyticsFields8.d;
                String str121 = analyticsFields8.h;
                String str122 = analyticsFields8.i;
                List list20 = analyticsFields8.j;
                if (list20 != null) {
                    List list21 = list20;
                    str2 = str122;
                    emptyList = emptyList2;
                    arrayList = new ArrayList(CollectionsKt.s(list21, 10));
                    Iterator it12 = list21.iterator();
                    while (it12.hasNext()) {
                        arrayList.add(au.com.woolworths.product.models.AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it12.next()));
                    }
                } else {
                    str2 = str122;
                    emptyList = emptyList2;
                    arrayList = 0;
                }
                analyticsData2 = new AnalyticsData((EventConfig) null, str114, str115, str116, str117, str118, str119, str120, str121, str2, arrayList == 0 ? emptyList : arrayList, 1, (DefaultConstructorMarker) null);
            } else {
                analyticsData2 = null;
            }
            ActionData actionData = new ActionData(str112, uiModel17, str113, analyticsData2);
            HomeContentPageQuery.LinkTextWithAlt linkTextWithAlt = videoAdUnitBottomLink.c;
            linkData = new LinkData(str111, actionData, new TextWithAltData(linkTextWithAlt.b, linkTextWithAlt.c));
        } else {
            linkData = null;
        }
        return new VideoAdUnitData(videoAdData, null, videoAdUnitCarousel, linkData);
    }
}
