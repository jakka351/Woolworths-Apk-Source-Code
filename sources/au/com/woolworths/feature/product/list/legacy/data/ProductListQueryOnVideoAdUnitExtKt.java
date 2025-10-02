package au.com.woolworths.feature.product.list.legacy.data;

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
import au.com.woolworths.product.models.RewardsOfferInfo;
import au.com.woolworths.product.models.TagLabel;
import au.com.woolworths.product.models.VideoAdUnitData;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.aem.components.model.ImageWithAltText;
import au.com.woolworths.shop.graphql.type.PurchaseRestriction;
import com.woolworths.product.list.legacy.ProductListQuery;
import com.woolworths.product.list.legacy.fragment.VideoAdBottomSheet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list-legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListQueryOnVideoAdUnitExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.ArrayList] */
    public static final VideoAdUnitData a(ProductListQuery.OnVideoAdUnit onVideoAdUnit) {
        VideoAdBottomSheet videoAdBottomSheet;
        VideoAdBottomSheet videoAdBottomSheet2;
        ProductListQuery.VideoAdUnitVideoAd videoAdUnitVideoAd;
        AnalyticsData analyticsData;
        String str;
        int i;
        ImageWithAltText imageWithAltText;
        VideoAdEventAnalytics videoAdEventAnalytics;
        ProductCard productCard;
        ProductListQuery.VideoAdUnitProductCard videoAdUnitProductCard;
        String str2;
        String str3;
        ?? arrayList;
        ?? arrayList2;
        String str4;
        String str5;
        ?? arrayList3;
        ProductListQuery.EventAnalytics eventAnalytics;
        AnalyticsData analyticsData2;
        AnalyticsData analyticsData3;
        AnalyticsData analyticsData4;
        AnalyticsData analyticsData5;
        String str6;
        String str7;
        ?? arrayList4;
        String str8;
        String str9;
        ?? arrayList5;
        String str10;
        String str11;
        String str12;
        ?? arrayList6;
        String str13;
        String str14;
        ?? arrayList7;
        String str15;
        ?? arrayList8;
        Intrinsics.h(onVideoAdUnit, "<this>");
        ProductListQuery.VideoAdUnitVideoAd videoAdUnitVideoAd2 = onVideoAdUnit.getVideoAdUnitVideoAd();
        Intrinsics.h(videoAdUnitVideoAd2, "<this>");
        String url = videoAdUnitVideoAd2.getUrl();
        int duration = videoAdUnitVideoAd2.getDuration();
        ProductListQuery.FallbackImage fallbackImage = videoAdUnitVideoAd2.getFallbackImage();
        ImageWithAltText imageWithAltText2 = fallbackImage != null ? new ImageWithAltText(fallbackImage.getImageUrl(), fallbackImage.getAltText()) : null;
        ProductListQuery.Transcript transcript = videoAdUnitVideoAd2.getTranscript();
        if (transcript != null) {
            String contentMarkdown = transcript.getVideoAdBottomSheet().getContentMarkdown();
            String title = transcript.getVideoAdBottomSheet().getTitle();
            String buttonText = transcript.getVideoAdBottomSheet().getButtonText();
            String accessibilityText = transcript.getVideoAdBottomSheet().getAccessibilityText();
            VideoAdBottomSheet.ImpressionAnalytics impressionAnalytics = transcript.getVideoAdBottomSheet().getImpressionAnalytics();
            videoAdBottomSheet = new au.com.woolworths.foundation.shop.video.advertising.data.VideoAdBottomSheet(contentMarkdown, title, buttonText, accessibilityText, impressionAnalytics != null ? VideoAdBottomSheetImpressionAnalyticsExtKt.a(impressionAnalytics) : null);
        } else {
            videoAdBottomSheet = null;
        }
        ProductListQuery.TermsAndConditions termsAndConditions = videoAdUnitVideoAd2.getTermsAndConditions();
        if (termsAndConditions != null) {
            String contentMarkdown2 = termsAndConditions.getVideoAdBottomSheet().getContentMarkdown();
            String title2 = termsAndConditions.getVideoAdBottomSheet().getTitle();
            String buttonText2 = termsAndConditions.getVideoAdBottomSheet().getButtonText();
            String accessibilityText2 = termsAndConditions.getVideoAdBottomSheet().getAccessibilityText();
            VideoAdBottomSheet.ImpressionAnalytics impressionAnalytics2 = termsAndConditions.getVideoAdBottomSheet().getImpressionAnalytics();
            videoAdBottomSheet2 = new au.com.woolworths.foundation.shop.video.advertising.data.VideoAdBottomSheet(contentMarkdown2, title2, buttonText2, accessibilityText2, impressionAnalytics2 != null ? VideoAdBottomSheetImpressionAnalyticsExtKt.a(impressionAnalytics2) : null);
        } else {
            videoAdBottomSheet2 = null;
        }
        ProductListQuery.Analytics3 analytics = videoAdUnitVideoAd2.getAnalytics();
        EmptyList emptyList = EmptyList.d;
        if (analytics != null) {
            String str16 = analytics.getAnalyticsFields().f10032a;
            String str17 = analytics.getAnalyticsFields().b;
            String str18 = analytics.getAnalyticsFields().c;
            String str19 = analytics.getAnalyticsFields().e;
            String str20 = analytics.getAnalyticsFields().f;
            String str21 = analytics.getAnalyticsFields().g;
            String str22 = analytics.getAnalyticsFields().d;
            String str23 = analytics.getAnalyticsFields().h;
            String str24 = analytics.getAnalyticsFields().i;
            List list = analytics.getAnalyticsFields().j;
            if (list != null) {
                List list2 = list;
                videoAdUnitVideoAd = videoAdUnitVideoAd2;
                str15 = str16;
                arrayList8 = new ArrayList(CollectionsKt.s(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList8.add(au.com.woolworths.product.models.AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it.next()));
                }
            } else {
                videoAdUnitVideoAd = videoAdUnitVideoAd2;
                str15 = str16;
                arrayList8 = 0;
            }
            analyticsData = new AnalyticsData((EventConfig) null, str15, str17, str18, str19, str20, str21, str22, str23, str24, arrayList8 == 0 ? emptyList : arrayList8, 1, (DefaultConstructorMarker) null);
        } else {
            videoAdUnitVideoAd = videoAdUnitVideoAd2;
            analyticsData = null;
        }
        ProductListQuery.EventAnalytics eventAnalytics2 = videoAdUnitVideoAd.getEventAnalytics();
        if (eventAnalytics2 != null) {
            ProductListQuery.Impression impression = eventAnalytics2.getImpression();
            if (impression != null) {
                String str25 = impression.getAnalyticsFields().f10032a;
                String str26 = impression.getAnalyticsFields().b;
                String str27 = impression.getAnalyticsFields().c;
                String str28 = impression.getAnalyticsFields().e;
                String str29 = impression.getAnalyticsFields().f;
                eventAnalytics = eventAnalytics2;
                String str30 = impression.getAnalyticsFields().g;
                String str31 = impression.getAnalyticsFields().d;
                String str32 = impression.getAnalyticsFields().h;
                String str33 = impression.getAnalyticsFields().i;
                List list3 = impression.getAnalyticsFields().j;
                if (list3 != null) {
                    List list4 = list3;
                    str13 = str33;
                    str14 = str25;
                    str = url;
                    arrayList7 = new ArrayList(CollectionsKt.s(list4, 10));
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        arrayList7.add(au.com.woolworths.product.models.AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it2.next()));
                    }
                } else {
                    str13 = str33;
                    str14 = str25;
                    str = url;
                    arrayList7 = 0;
                }
                analyticsData2 = new AnalyticsData((EventConfig) null, str14, str26, str27, str28, str29, str30, str31, str32, str13, arrayList7 == 0 ? emptyList : arrayList7, 1, (DefaultConstructorMarker) null);
            } else {
                eventAnalytics = eventAnalytics2;
                str = url;
                analyticsData2 = null;
            }
            ProductListQuery.VideoPlay videoPlay = eventAnalytics.getVideoPlay();
            if (videoPlay != null) {
                String str34 = videoPlay.getAnalyticsFields().f10032a;
                String str35 = videoPlay.getAnalyticsFields().b;
                String str36 = videoPlay.getAnalyticsFields().c;
                String str37 = videoPlay.getAnalyticsFields().e;
                String str38 = videoPlay.getAnalyticsFields().f;
                String str39 = videoPlay.getAnalyticsFields().g;
                String str40 = videoPlay.getAnalyticsFields().d;
                String str41 = videoPlay.getAnalyticsFields().h;
                String str42 = videoPlay.getAnalyticsFields().i;
                List list5 = videoPlay.getAnalyticsFields().j;
                if (list5 != null) {
                    List list6 = list5;
                    str10 = str34;
                    str11 = str35;
                    str12 = str36;
                    arrayList6 = new ArrayList(CollectionsKt.s(list6, 10));
                    Iterator it3 = list6.iterator();
                    while (it3.hasNext()) {
                        arrayList6.add(au.com.woolworths.product.models.AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it3.next()));
                    }
                } else {
                    str10 = str34;
                    str11 = str35;
                    str12 = str36;
                    arrayList6 = 0;
                }
                analyticsData3 = new AnalyticsData((EventConfig) null, str10, str11, str12, str37, str38, str39, str40, str41, str42, arrayList6 == 0 ? emptyList : arrayList6, 1, (DefaultConstructorMarker) null);
            } else {
                analyticsData3 = null;
            }
            ProductListQuery.VideoPause videoPause = eventAnalytics.getVideoPause();
            if (videoPause != null) {
                String str43 = videoPause.getAnalyticsFields().f10032a;
                String str44 = videoPause.getAnalyticsFields().b;
                String str45 = videoPause.getAnalyticsFields().c;
                String str46 = videoPause.getAnalyticsFields().e;
                String str47 = videoPause.getAnalyticsFields().f;
                String str48 = videoPause.getAnalyticsFields().g;
                String str49 = videoPause.getAnalyticsFields().d;
                String str50 = videoPause.getAnalyticsFields().h;
                String str51 = videoPause.getAnalyticsFields().i;
                List list7 = videoPause.getAnalyticsFields().j;
                if (list7 != null) {
                    List list8 = list7;
                    str8 = str43;
                    str9 = str44;
                    i = duration;
                    arrayList5 = new ArrayList(CollectionsKt.s(list8, 10));
                    Iterator it4 = list8.iterator();
                    while (it4.hasNext()) {
                        arrayList5.add(au.com.woolworths.product.models.AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it4.next()));
                    }
                } else {
                    str8 = str43;
                    str9 = str44;
                    i = duration;
                    arrayList5 = 0;
                }
                analyticsData4 = new AnalyticsData((EventConfig) null, str8, str9, str45, str46, str47, str48, str49, str50, str51, arrayList5 == 0 ? emptyList : arrayList5, 1, (DefaultConstructorMarker) null);
            } else {
                i = duration;
                analyticsData4 = null;
            }
            ProductListQuery.VideoErrorImpression videoErrorImpression = eventAnalytics.getVideoErrorImpression();
            if (videoErrorImpression != null) {
                String str52 = videoErrorImpression.getAnalyticsFields().f10032a;
                String str53 = videoErrorImpression.getAnalyticsFields().b;
                String str54 = videoErrorImpression.getAnalyticsFields().c;
                String str55 = videoErrorImpression.getAnalyticsFields().e;
                String str56 = videoErrorImpression.getAnalyticsFields().f;
                String str57 = videoErrorImpression.getAnalyticsFields().g;
                String str58 = videoErrorImpression.getAnalyticsFields().d;
                String str59 = videoErrorImpression.getAnalyticsFields().h;
                String str60 = videoErrorImpression.getAnalyticsFields().i;
                List list9 = videoErrorImpression.getAnalyticsFields().j;
                if (list9 != null) {
                    List list10 = list9;
                    str6 = str52;
                    str7 = str53;
                    imageWithAltText = imageWithAltText2;
                    arrayList4 = new ArrayList(CollectionsKt.s(list10, 10));
                    Iterator it5 = list10.iterator();
                    while (it5.hasNext()) {
                        arrayList4.add(au.com.woolworths.product.models.AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it5.next()));
                    }
                } else {
                    str6 = str52;
                    str7 = str53;
                    imageWithAltText = imageWithAltText2;
                    arrayList4 = 0;
                }
                analyticsData5 = new AnalyticsData((EventConfig) null, str6, str7, str54, str55, str56, str57, str58, str59, str60, arrayList4 == 0 ? emptyList : arrayList4, 1, (DefaultConstructorMarker) null);
            } else {
                imageWithAltText = imageWithAltText2;
                analyticsData5 = null;
            }
            videoAdEventAnalytics = new VideoAdEventAnalytics(analyticsData2, analyticsData3, analyticsData4, analyticsData5);
        } else {
            str = url;
            i = duration;
            imageWithAltText = imageWithAltText2;
            videoAdEventAnalytics = null;
        }
        VideoAdData videoAdData = new VideoAdData(str, i, imageWithAltText, videoAdBottomSheet, videoAdBottomSheet2, analyticsData, videoAdEventAnalytics);
        ProductListQuery.VideoAdUnitProductCard videoAdUnitProductCard2 = onVideoAdUnit.getVideoAdUnitProductCard();
        if (videoAdUnitProductCard2 != null) {
            String str61 = videoAdUnitProductCard2.getProductCard().f8949a;
            String str62 = videoAdUnitProductCard2.getProductCard().b;
            String str63 = videoAdUnitProductCard2.getProductCard().e;
            String str64 = videoAdUnitProductCard2.getProductCard().j;
            Integer num = videoAdUnitProductCard2.getProductCard().h;
            String str65 = videoAdUnitProductCard2.getProductCard().i;
            String str66 = videoAdUnitProductCard2.getProductCard().l;
            boolean z = videoAdUnitProductCard2.getProductCard().f;
            boolean z2 = videoAdUnitProductCard2.getProductCard().c;
            String str67 = videoAdUnitProductCard2.getProductCard().m;
            String str68 = videoAdUnitProductCard2.getProductCard().n;
            ProductCard.Trolley trolley = videoAdUnitProductCard2.getProductCard().p;
            ProductTrolleyData uiModel = trolley != null ? ProductCardKt.toUiModel(trolley) : null;
            List list11 = videoAdUnitProductCard2.getProductCard().q;
            if (list11 != null) {
                List list12 = list11;
                videoAdUnitProductCard = videoAdUnitProductCard2;
                str2 = str61;
                str3 = str62;
                arrayList = new ArrayList(CollectionsKt.s(list12, 10));
                Iterator it6 = list12.iterator();
                while (it6.hasNext()) {
                    arrayList.add(ProductCardKt.toUiModel((ProductCard.Trolley1) it6.next()));
                }
            } else {
                videoAdUnitProductCard = videoAdUnitProductCard2;
                str2 = str61;
                str3 = str62;
                arrayList = 0;
            }
            EmptyList emptyList2 = arrayList == 0 ? emptyList : arrayList;
            ProductShoppingList uiModel2 = ProductCardListExtKt.toUiModel(videoAdUnitProductCard.getProductCard().r);
            ProductCard.InStoreDetails inStoreDetails = videoAdUnitProductCard.getProductCard().s;
            InstoreDetailsData uiModel3 = inStoreDetails != null ? ProductCardInStoreDetailsExtKt.toUiModel(inStoreDetails) : null;
            PurchaseRestriction purchaseRestriction = videoAdUnitProductCard.getProductCard().d;
            au.com.woolworths.product.models.PurchaseRestriction uiModel4 = purchaseRestriction != null ? au.com.woolworths.product.models.PurchaseRestrictionExtKt.toUiModel(purchaseRestriction) : null;
            List<ProductCard.InlineLabel> list13 = videoAdUnitProductCard.getProductCard().o;
            if (list13 != null) {
                arrayList2 = new ArrayList();
                for (ProductCard.InlineLabel inlineLabel : list13) {
                    ProductInlineLabelApiData uiModel5 = inlineLabel != null ? ProductCardInlineLabelExtKt.toUiModel(inlineLabel) : null;
                    if (uiModel5 != null) {
                        arrayList2.add(uiModel5);
                    }
                }
            } else {
                arrayList2 = 0;
            }
            EmptyList emptyList3 = arrayList2 == 0 ? emptyList : arrayList2;
            ProductCard.PromotionInfo promotionInfo = videoAdUnitProductCard.getProductCard().k;
            PromotionInfo uiModel6 = promotionInfo != null ? ProductCardPromotionInfoExtKt.toUiModel(promotionInfo) : null;
            String str69 = videoAdUnitProductCard.getProductCard().u;
            String str70 = videoAdUnitProductCard.getProductCard().v;
            ProductCard.Marketplace marketplace = videoAdUnitProductCard.getProductCard().w;
            ProductListMarketplace uiModel7 = marketplace != null ? ProductCardMarketplaceExtKt.toUiModel(marketplace) : null;
            ProductCard.RewardsOfferInfo rewardsOfferInfo = videoAdUnitProductCard.getProductCard().x;
            RewardsOfferInfo uiModel8 = rewardsOfferInfo != null ? ProductCardRewardsOfferInfoExtKt.toUiModel(rewardsOfferInfo) : null;
            String str71 = videoAdUnitProductCard.getProductCard().y;
            ProductCard.TagLabel tagLabel = videoAdUnitProductCard.getProductCard().z;
            TagLabel uiModel9 = tagLabel != null ? ProductCardTagLabelExtKt.toUiModel(tagLabel) : null;
            ProductCard.InStoreAvailabilityInfo inStoreAvailabilityInfo = videoAdUnitProductCard.getProductCard().g;
            InStoreAvailabilityInfo uiModel10 = inStoreAvailabilityInfo != null ? ProductCardInStoreAvailabilityInfoExtKt.toUiModel(inStoreAvailabilityInfo) : null;
            ProductCard.ProductVarieties productVarieties = videoAdUnitProductCard.getProductCard().A;
            ProductVarieties uiModel11 = productVarieties != null ? ProductCardProductVarietiesExtKt.toUiModel(productVarieties) : null;
            List list14 = videoAdUnitProductCard.getProductCard().B;
            if (list14 != null) {
                List list15 = list14;
                str4 = str69;
                str5 = str70;
                arrayList3 = new ArrayList(CollectionsKt.s(list15, 10));
                Iterator it7 = list15.iterator();
                while (it7.hasNext()) {
                    arrayList3.add(ProductCardCategoryExtKt.toUiModel((ProductCard.Category) it7.next()));
                }
            } else {
                str4 = str69;
                str5 = str70;
                arrayList3 = 0;
            }
            EmptyList emptyList4 = arrayList3 == 0 ? emptyList : arrayList3;
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
            productCard = new au.com.woolworths.product.models.ProductCard(str2, str3, str63, str64, num, str65, null, null, str66, z, z2, str67, null, null, str68, uiModel, emptyList2, uiModel2, uiModel3, uiModel4, emptyList3, uiModel6, str4, str5, uiModel7, uiModel8, str71, uiModel9, uiModel10, uiModel11, emptyList4, z3, uiModel12, uiModel13, uiModel14, uiModel15, uiModel16, null, productCardAction != null ? ProductCardProductCardActionExtKt.toUiModel(productCardAction) : null, videoAdUnitProductCard.getProductCard().I, 12480, 32, null);
        } else {
            productCard = null;
        }
        return new VideoAdUnitData(videoAdData, productCard, null, null);
    }
}
