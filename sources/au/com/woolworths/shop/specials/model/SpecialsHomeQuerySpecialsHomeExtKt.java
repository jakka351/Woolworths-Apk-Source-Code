package au.com.woolworths.shop.specials.model;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.android.onesite.data.HorizontalListData;
import au.com.woolworths.android.onesite.models.products.ProductListMarketplace;
import au.com.woolworths.android.onesite.models.products.PromotionInfo;
import au.com.woolworths.base.shopapp.data.models.CartProductInfo;
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
import au.com.woolworths.product.models.PromotionCard;
import au.com.woolworths.product.models.PurchaseRestrictionExtKt;
import au.com.woolworths.product.models.RewardsOfferInfo;
import au.com.woolworths.product.models.TagLabel;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.model.action.ActionType;
import au.com.woolworths.sdui.shop.actionablecard.ActionableCard;
import au.com.woolworths.sdui.shop.dynamicsizecard.DefaultCardHeight;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.aem.components.contentcard.fragment.ContentCard;
import au.com.woolworths.shop.aem.components.model.CatalogueCard;
import au.com.woolworths.shop.aem.components.model.CatalogueCardType;
import au.com.woolworths.shop.aem.components.model.ImageWithAltText;
import au.com.woolworths.shop.aem.components.model.QuickLinkCard;
import au.com.woolworths.shop.aem.components.model.chatentrycard.ChatEntryCard;
import au.com.woolworths.shop.aem.components.model.contentcard.ContentCardData;
import au.com.woolworths.shop.aem.components.model.contentcard.ContentCardFooter;
import au.com.woolworths.shop.aem.components.model.editorialbanner.EditorialBannerData;
import au.com.woolworths.shop.aem.components.model.editorialbanner.EditorialBannerFooter;
import au.com.woolworths.shop.aem.components.model.editorialbanner.EditorialBannerImageFormat;
import au.com.woolworths.shop.aem.components.model.footer.ContentFooterStyle;
import au.com.woolworths.shop.aem.components.model.offercard.OfferCardData;
import au.com.woolworths.shop.aem.components.model.offercard.OfferCardPriceInfo;
import au.com.woolworths.shop.aem.components.model.offercard.OfferCardTextColor;
import au.com.woolworths.shop.aem.components.model.offercard.OfferCardVariant;
import au.com.woolworths.shop.aem.components.model.paragraph.ParagraphTextItemData;
import au.com.woolworths.shop.aem.components.model.paragraph.ParagraphTextItemType;
import au.com.woolworths.shop.aem.components.offercard.fragment.OfferCard;
import au.com.woolworths.shop.graphql.type.PurchaseRestriction;
import com.woolworths.shop.specials.SpecialsHomeQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"specials_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SpecialsHomeQuerySpecialsHomeExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r25v4, types: [au.com.woolworths.product.models.PromotionCard] */
    /* JADX WARN: Type inference failed for: r25v5, types: [au.com.woolworths.shop.aem.components.model.contentcard.ContentCardData] */
    /* JADX WARN: Type inference failed for: r25v6, types: [au.com.woolworths.shop.aem.components.model.offercard.OfferCardData] */
    /* JADX WARN: Type inference failed for: r25v8, types: [au.com.woolworths.product.models.ProductCard] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v73, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v74, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v25, types: [au.com.woolworths.analytics.model.AnalyticsData, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v41, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v52 */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r4v54, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v65, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v88 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v69, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v72, types: [java.util.ArrayList] */
    public static final SpecialsHome a(SpecialsHomeQuery.SpecialsHome specialsHome) {
        Iterator it;
        Object horizontalListData;
        EditorialBannerFooter editorialBannerFooter;
        String str;
        String str2;
        String str3;
        ActionData actionData;
        AnalyticsData analyticsData;
        EmptyList emptyList;
        AnalyticsData analyticsData2;
        String str4;
        EmptyList emptyList2;
        Object editorialBannerData;
        String str5;
        String str6;
        AnalyticsData analyticsData3;
        String str7;
        EmptyList emptyList3;
        Object paragraphTextItemData;
        CatalogueCardType catalogueCardType;
        Iterator it2;
        Iterator it3;
        String str8;
        QuickLinkCard quickLinkCard;
        String str9;
        String str10;
        String str11;
        ?? arrayList;
        ?? arrayList2;
        String str12;
        String str13;
        String str14;
        EmptyList emptyList4;
        String str15;
        ContentCardFooter contentCardFooter;
        ImageWithAltText imageWithAltText;
        String str16;
        OfferCardPriceInfo offerCardPriceInfo;
        String str17;
        String str18;
        String str19;
        ActionData actionData2;
        AnalyticsData analyticsData4;
        OfferCardVariant offerCardVariant;
        String str20;
        String str21;
        String str22;
        ?? arrayList3;
        AnalyticsData analyticsData5;
        String str23;
        ?? arrayList4;
        QuickLinkCard promotionCard;
        Integer num;
        ?? arrayList5;
        ?? arrayList6;
        String str24;
        String str25;
        String str26;
        ?? arrayList7;
        Intrinsics.h(specialsHome, "<this>");
        ArrayList arrayList8 = specialsHome.f23729a;
        ArrayList arrayList9 = new ArrayList();
        Iterator it4 = arrayList8.iterator();
        while (it4.hasNext()) {
            SpecialsHomeQuery.Item item = (SpecialsHomeQuery.Item) it4.next();
            ?? r4 = 0;
            SpecialsHomeQuery.OnHorizontalList onHorizontalList = item != null ? item.b : null;
            EmptyList emptyList5 = EmptyList.d;
            if (onHorizontalList != null) {
                SpecialsHomeQuery.OnHorizontalList onHorizontalList2 = item.b;
                Intrinsics.h(onHorizontalList2, "<this>");
                String str27 = onHorizontalList2.f23722a;
                String str28 = onHorizontalList2.b;
                String str29 = onHorizontalList2.c;
                String str30 = onHorizontalList2.d;
                ArrayList arrayList10 = onHorizontalList2.e;
                ArrayList arrayList11 = new ArrayList();
                Iterator it5 = arrayList10.iterator();
                while (it5.hasNext()) {
                    SpecialsHomeQuery.Item1 item1 = (SpecialsHomeQuery.Item1) it5.next();
                    SpecialsHomeQuery.OnQuickLinkCard onQuickLinkCard = item1.b;
                    if (onQuickLinkCard != null) {
                        String str31 = onQuickLinkCard.b;
                        SpecialsHomeQuery.LinkCardAction linkCardAction = onQuickLinkCard.c;
                        it2 = it4;
                        it3 = it5;
                        str8 = str30;
                        quickLinkCard = new QuickLinkCard(str31, new ActionData(linkCardAction.b, au.com.woolworths.product.models.ActionTypeExtKt.toUiModel(linkCardAction.f23715a), r4, r4), null, onQuickLinkCard.f23727a, null, null, 52, null);
                    } else {
                        SpecialsHomeQuery.OnProductCard onProductCard = item1.c;
                        if (onProductCard != null) {
                            ProductCard productCard = onProductCard.b;
                            String str32 = productCard.f8949a;
                            String str33 = productCard.b;
                            String str34 = productCard.e;
                            String str35 = productCard.j;
                            Integer num2 = productCard.h;
                            it2 = it4;
                            String str36 = productCard.i;
                            String str37 = productCard.l;
                            boolean z = productCard.f;
                            boolean z2 = productCard.c;
                            String str38 = productCard.m;
                            String str39 = productCard.n;
                            ProductCard.Trolley trolley = productCard.p;
                            ProductTrolleyData uiModel = trolley != null ? ProductCardKt.toUiModel(trolley) : null;
                            List list = productCard.q;
                            if (list != null) {
                                List list2 = list;
                                it3 = it5;
                                num = num2;
                                str8 = str30;
                                arrayList5 = new ArrayList(CollectionsKt.s(list2, 10));
                                Iterator it6 = list2.iterator();
                                while (it6.hasNext()) {
                                    arrayList5.add(ProductCardKt.toUiModel((ProductCard.Trolley1) it6.next()));
                                }
                            } else {
                                it3 = it5;
                                num = num2;
                                str8 = str30;
                                arrayList5 = 0;
                            }
                            EmptyList emptyList6 = arrayList5 == 0 ? emptyList5 : arrayList5;
                            ProductShoppingList uiModel2 = ProductCardListExtKt.toUiModel(productCard.r);
                            ProductCard.InStoreDetails inStoreDetails = productCard.s;
                            InstoreDetailsData uiModel3 = inStoreDetails != null ? ProductCardInStoreDetailsExtKt.toUiModel(inStoreDetails) : null;
                            PurchaseRestriction purchaseRestriction = productCard.d;
                            au.com.woolworths.product.models.PurchaseRestriction uiModel4 = purchaseRestriction != null ? PurchaseRestrictionExtKt.toUiModel(purchaseRestriction) : null;
                            List<ProductCard.InlineLabel> list3 = productCard.o;
                            if (list3 != null) {
                                arrayList6 = new ArrayList();
                                for (ProductCard.InlineLabel inlineLabel : list3) {
                                    ProductInlineLabelApiData uiModel5 = inlineLabel != null ? ProductCardInlineLabelExtKt.toUiModel(inlineLabel) : null;
                                    if (uiModel5 != null) {
                                        arrayList6.add(uiModel5);
                                    }
                                }
                            } else {
                                arrayList6 = 0;
                            }
                            EmptyList emptyList7 = arrayList6 == 0 ? emptyList5 : arrayList6;
                            ProductCard.PromotionInfo promotionInfo = productCard.k;
                            PromotionInfo uiModel6 = promotionInfo != null ? ProductCardPromotionInfoExtKt.toUiModel(promotionInfo) : null;
                            String str40 = productCard.u;
                            String str41 = productCard.v;
                            ProductCard.Marketplace marketplace = productCard.w;
                            ProductListMarketplace uiModel7 = marketplace != null ? ProductCardMarketplaceExtKt.toUiModel(marketplace) : null;
                            ProductCard.RewardsOfferInfo rewardsOfferInfo = productCard.x;
                            RewardsOfferInfo uiModel8 = rewardsOfferInfo != null ? ProductCardRewardsOfferInfoExtKt.toUiModel(rewardsOfferInfo) : null;
                            String str42 = productCard.y;
                            ProductCard.TagLabel tagLabel = productCard.z;
                            TagLabel uiModel9 = tagLabel != null ? ProductCardTagLabelExtKt.toUiModel(tagLabel) : null;
                            ProductCard.InStoreAvailabilityInfo inStoreAvailabilityInfo = productCard.g;
                            InStoreAvailabilityInfo uiModel10 = inStoreAvailabilityInfo != null ? ProductCardInStoreAvailabilityInfoExtKt.toUiModel(inStoreAvailabilityInfo) : null;
                            ProductCard.ProductVarieties productVarieties = productCard.A;
                            ProductVarieties uiModel11 = productVarieties != null ? ProductCardProductVarietiesExtKt.toUiModel(productVarieties) : null;
                            List list4 = productCard.B;
                            if (list4 != null) {
                                List list5 = list4;
                                str24 = str40;
                                str25 = str41;
                                str26 = str42;
                                arrayList7 = new ArrayList(CollectionsKt.s(list5, 10));
                                Iterator it7 = list5.iterator();
                                while (it7.hasNext()) {
                                    arrayList7.add(ProductCardCategoryExtKt.toUiModel((ProductCard.Category) it7.next()));
                                }
                            } else {
                                str24 = str40;
                                str25 = str41;
                                str26 = str42;
                                arrayList7 = 0;
                            }
                            EmptyList emptyList8 = arrayList7 == 0 ? emptyList5 : arrayList7;
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
                            promotionCard = new au.com.woolworths.product.models.ProductCard(str32, str33, str34, str35, num, str36, null, null, str37, z, z2, str38, null, null, str39, uiModel, emptyList6, uiModel2, uiModel3, uiModel4, emptyList7, uiModel6, str24, str25, uiModel7, uiModel8, str26, uiModel9, uiModel10, uiModel11, emptyList8, z3, uiModel12, uiModel13, uiModel14, uiModel15, uiModel16, null, productCardAction != null ? ProductCardProductCardActionExtKt.toUiModel(productCardAction) : null, productCard.I, 12480, 32, null);
                        } else {
                            it2 = it4;
                            it3 = it5;
                            str8 = str30;
                            SpecialsHomeQuery.OnOfferCard onOfferCard = item1.d;
                            if (onOfferCard != null) {
                                OfferCard offerCard = onOfferCard.b;
                                String str43 = offerCard.f10187a;
                                String str44 = offerCard.b;
                                String str45 = offerCard.c;
                                OfferCard.OfferCardBadgeImage offerCardBadgeImage = offerCard.d;
                                ImageWithAltText imageWithAltText2 = offerCardBadgeImage != null ? new ImageWithAltText(offerCardBadgeImage.f10191a, offerCardBadgeImage.b) : null;
                                int iOrdinal = offerCard.e.ordinal();
                                OfferCardTextColor offerCardTextColor = iOrdinal != 0 ? iOrdinal != 1 ? OfferCardTextColor.e : OfferCardTextColor.e : OfferCardTextColor.d;
                                String str46 = offerCard.f;
                                OfferCard.OfferCardPriceInfo offerCardPriceInfo2 = offerCard.g;
                                if (offerCardPriceInfo2 != null) {
                                    str16 = str43;
                                    offerCardPriceInfo = new OfferCardPriceInfo(offerCardPriceInfo2.f10192a, offerCardPriceInfo2.b, offerCardPriceInfo2.c, offerCardPriceInfo2.d, offerCardPriceInfo2.e);
                                } else {
                                    str16 = str43;
                                    offerCardPriceInfo = null;
                                }
                                OfferCard.OfferCardAction offerCardAction = offerCard.i;
                                if (offerCardAction != null) {
                                    String str47 = offerCardAction.f10189a;
                                    ActionType uiModel17 = au.com.woolworths.product.models.ActionTypeExtKt.toUiModel(offerCardAction.c);
                                    OfferCard.Analytics analytics = offerCardAction.b;
                                    if (analytics != null) {
                                        AnalyticsFields analyticsFields = analytics.b;
                                        String str48 = analyticsFields.f10032a;
                                        String str49 = analyticsFields.b;
                                        str17 = str44;
                                        String str50 = analyticsFields.c;
                                        String str51 = analyticsFields.e;
                                        String str52 = analyticsFields.f;
                                        String str53 = analyticsFields.g;
                                        String str54 = analyticsFields.d;
                                        String str55 = analyticsFields.h;
                                        String str56 = analyticsFields.i;
                                        List list6 = analyticsFields.j;
                                        if (list6 != null) {
                                            List list7 = list6;
                                            str23 = str56;
                                            str18 = str45;
                                            str19 = str46;
                                            arrayList4 = new ArrayList(CollectionsKt.s(list7, 10));
                                            Iterator it8 = list7.iterator();
                                            while (it8.hasNext()) {
                                                arrayList4.add(au.com.woolworths.product.models.AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it8.next()));
                                            }
                                        } else {
                                            str23 = str56;
                                            str18 = str45;
                                            str19 = str46;
                                            arrayList4 = 0;
                                        }
                                        analyticsData5 = new AnalyticsData((EventConfig) null, str48, str49, str50, str51, str52, str53, str54, str55, str23, arrayList4 == 0 ? emptyList5 : arrayList4, 1, (DefaultConstructorMarker) null);
                                    } else {
                                        str17 = str44;
                                        str18 = str45;
                                        str19 = str46;
                                        analyticsData5 = null;
                                    }
                                    actionData2 = new ActionData(str47, uiModel17, null, analyticsData5);
                                } else {
                                    str17 = str44;
                                    str18 = str45;
                                    str19 = str46;
                                    actionData2 = null;
                                }
                                OfferCard.OfferCardAnalytics offerCardAnalytics = offerCard.h;
                                if (offerCardAnalytics != null) {
                                    AnalyticsFields analyticsFields2 = offerCardAnalytics.b;
                                    String str57 = analyticsFields2.f10032a;
                                    String str58 = analyticsFields2.b;
                                    String str59 = analyticsFields2.c;
                                    String str60 = analyticsFields2.e;
                                    String str61 = analyticsFields2.f;
                                    String str62 = analyticsFields2.g;
                                    String str63 = analyticsFields2.d;
                                    String str64 = analyticsFields2.h;
                                    String str65 = analyticsFields2.i;
                                    List list8 = analyticsFields2.j;
                                    if (list8 != null) {
                                        List list9 = list8;
                                        str20 = str65;
                                        str21 = str58;
                                        str22 = str59;
                                        arrayList3 = new ArrayList(CollectionsKt.s(list9, 10));
                                        Iterator it9 = list9.iterator();
                                        while (it9.hasNext()) {
                                            arrayList3.add(au.com.woolworths.product.models.AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it9.next()));
                                        }
                                    } else {
                                        str20 = str65;
                                        str21 = str58;
                                        str22 = str59;
                                        arrayList3 = 0;
                                    }
                                    analyticsData4 = new AnalyticsData((EventConfig) null, str57, str21, str22, str60, str61, str62, str63, str64, str20, arrayList3 == 0 ? emptyList5 : arrayList3, 1, (DefaultConstructorMarker) null);
                                } else {
                                    analyticsData4 = null;
                                }
                                au.com.woolworths.shop.graphql.type.OfferCardVariant offerCardVariant2 = offerCard.j;
                                if (offerCardVariant2 != null) {
                                    int iOrdinal2 = offerCardVariant2.ordinal();
                                    offerCardVariant = iOrdinal2 != 0 ? iOrdinal2 != 1 ? iOrdinal2 != 2 ? iOrdinal2 != 3 ? iOrdinal2 != 4 ? iOrdinal2 != 5 ? OfferCardVariant.i : OfferCardVariant.h : OfferCardVariant.g : OfferCardVariant.f : OfferCardVariant.e : OfferCardVariant.i : OfferCardVariant.d;
                                } else {
                                    offerCardVariant = null;
                                }
                                promotionCard = new OfferCardData(str16, str17, str18, null, imageWithAltText2, offerCardTextColor, str19, offerCardPriceInfo, actionData2, analyticsData4, offerCardVariant);
                            } else {
                                SpecialsHomeQuery.OnContentCard onContentCard = item1.e;
                                if (onContentCard != null) {
                                    ContentCard contentCard = onContentCard.b;
                                    String str66 = contentCard.f10129a;
                                    String str67 = contentCard.b;
                                    String str68 = contentCard.c;
                                    String str69 = contentCard.d;
                                    ContentCard.ContentCardAction contentCardAction = contentCard.e;
                                    ActionData actionData3 = contentCardAction != null ? new ActionData(contentCardAction.b, au.com.woolworths.product.models.ActionTypeExtKt.toUiModel(contentCardAction.f10130a), null, null) : null;
                                    ContentCard.ContentCardBrandImage contentCardBrandImage = contentCard.f;
                                    ImageWithAltText imageWithAltText3 = contentCardBrandImage != null ? new ImageWithAltText(contentCardBrandImage.f10131a, contentCardBrandImage.b) : null;
                                    ContentCard.ContentCardFooter contentCardFooter2 = contentCard.g;
                                    if (contentCardFooter2 != null) {
                                        int iOrdinal3 = contentCardFooter2.f10132a.ordinal();
                                        ContentFooterStyle contentFooterStyle = iOrdinal3 != 0 ? iOrdinal3 != 1 ? ContentFooterStyle.e : ContentFooterStyle.e : ContentFooterStyle.d;
                                        String str70 = contentCardFooter2.b;
                                        ContentCard.Logo logo = contentCardFooter2.c;
                                        if (logo != null) {
                                            str15 = str66;
                                            imageWithAltText = new ImageWithAltText(logo.f10133a, logo.b);
                                        } else {
                                            str15 = str66;
                                            imageWithAltText = null;
                                        }
                                        contentCardFooter = new ContentCardFooter(contentFooterStyle, str70, imageWithAltText);
                                    } else {
                                        str15 = str66;
                                        contentCardFooter = null;
                                    }
                                    promotionCard = new ContentCardData(str15, str67, str68, str69, actionData3, imageWithAltText3, contentCardFooter, null, null, null, null);
                                } else {
                                    SpecialsHomeQuery.OnPromotionCard onPromotionCard = item1.f;
                                    if (onPromotionCard != null) {
                                        ProductCard productCard2 = onPromotionCard.f23726a.b;
                                        String str71 = productCard2.f8949a;
                                        String str72 = productCard2.b;
                                        String str73 = productCard2.e;
                                        String str74 = productCard2.j;
                                        Integer num3 = productCard2.h;
                                        String str75 = productCard2.i;
                                        String str76 = productCard2.l;
                                        boolean z4 = productCard2.f;
                                        boolean z5 = productCard2.c;
                                        String str77 = productCard2.m;
                                        String str78 = productCard2.n;
                                        ProductCard.Trolley trolley2 = productCard2.p;
                                        ProductTrolleyData uiModel18 = trolley2 != null ? ProductCardKt.toUiModel(trolley2) : null;
                                        List list10 = productCard2.q;
                                        if (list10 != null) {
                                            List list11 = list10;
                                            str9 = str72;
                                            str10 = str73;
                                            str11 = str74;
                                            arrayList = new ArrayList(CollectionsKt.s(list11, 10));
                                            Iterator it10 = list11.iterator();
                                            while (it10.hasNext()) {
                                                arrayList.add(ProductCardKt.toUiModel((ProductCard.Trolley1) it10.next()));
                                            }
                                        } else {
                                            str9 = str72;
                                            str10 = str73;
                                            str11 = str74;
                                            arrayList = 0;
                                        }
                                        EmptyList emptyList9 = arrayList == 0 ? emptyList5 : arrayList;
                                        ProductShoppingList uiModel19 = ProductCardListExtKt.toUiModel(productCard2.r);
                                        ProductCard.InStoreDetails inStoreDetails2 = productCard2.s;
                                        InstoreDetailsData uiModel20 = inStoreDetails2 != null ? ProductCardInStoreDetailsExtKt.toUiModel(inStoreDetails2) : null;
                                        PurchaseRestriction purchaseRestriction2 = productCard2.d;
                                        au.com.woolworths.product.models.PurchaseRestriction uiModel21 = purchaseRestriction2 != null ? PurchaseRestrictionExtKt.toUiModel(purchaseRestriction2) : null;
                                        List<ProductCard.InlineLabel> list12 = productCard2.o;
                                        if (list12 != null) {
                                            arrayList2 = new ArrayList();
                                            for (ProductCard.InlineLabel inlineLabel2 : list12) {
                                                ProductInlineLabelApiData uiModel22 = inlineLabel2 != null ? ProductCardInlineLabelExtKt.toUiModel(inlineLabel2) : null;
                                                if (uiModel22 != null) {
                                                    arrayList2.add(uiModel22);
                                                }
                                            }
                                        } else {
                                            arrayList2 = 0;
                                        }
                                        EmptyList emptyList10 = arrayList2 == 0 ? emptyList5 : arrayList2;
                                        ProductCard.PromotionInfo promotionInfo2 = productCard2.k;
                                        PromotionInfo uiModel23 = promotionInfo2 != null ? ProductCardPromotionInfoExtKt.toUiModel(promotionInfo2) : null;
                                        String str79 = productCard2.u;
                                        String str80 = productCard2.v;
                                        ProductCard.Marketplace marketplace2 = productCard2.w;
                                        ProductListMarketplace uiModel24 = marketplace2 != null ? ProductCardMarketplaceExtKt.toUiModel(marketplace2) : null;
                                        ProductCard.RewardsOfferInfo rewardsOfferInfo2 = productCard2.x;
                                        RewardsOfferInfo uiModel25 = rewardsOfferInfo2 != null ? ProductCardRewardsOfferInfoExtKt.toUiModel(rewardsOfferInfo2) : null;
                                        String str81 = productCard2.y;
                                        ProductCard.TagLabel tagLabel2 = productCard2.z;
                                        TagLabel uiModel26 = tagLabel2 != null ? ProductCardTagLabelExtKt.toUiModel(tagLabel2) : null;
                                        ProductCard.InStoreAvailabilityInfo inStoreAvailabilityInfo2 = productCard2.g;
                                        InStoreAvailabilityInfo uiModel27 = inStoreAvailabilityInfo2 != null ? ProductCardInStoreAvailabilityInfoExtKt.toUiModel(inStoreAvailabilityInfo2) : null;
                                        ProductCard.ProductVarieties productVarieties2 = productCard2.A;
                                        ProductVarieties uiModel28 = productVarieties2 != null ? ProductCardProductVarietiesExtKt.toUiModel(productVarieties2) : null;
                                        List list13 = productCard2.B;
                                        if (list13 != null) {
                                            List list14 = list13;
                                            str12 = str79;
                                            str13 = str80;
                                            str14 = str81;
                                            ?? arrayList12 = new ArrayList(CollectionsKt.s(list14, 10));
                                            Iterator it11 = list14.iterator();
                                            while (it11.hasNext()) {
                                                arrayList12.add(ProductCardCategoryExtKt.toUiModel((ProductCard.Category) it11.next()));
                                            }
                                            emptyList4 = arrayList12;
                                        } else {
                                            str12 = str79;
                                            str13 = str80;
                                            str14 = str81;
                                            emptyList4 = null;
                                        }
                                        EmptyList emptyList11 = emptyList4 == null ? emptyList5 : emptyList4;
                                        boolean z6 = productCard2.C;
                                        ProductCard.MultiBuyPriceInfo multiBuyPriceInfo2 = productCard2.E;
                                        MultiBuyPriceInfo uiModel29 = multiBuyPriceInfo2 != null ? ProductCardMultiBuyPriceInfoExtKt.toUiModel(multiBuyPriceInfo2) : null;
                                        ProductCard.MemberPriceInfo memberPriceInfo2 = productCard2.D;
                                        MemberPriceInfo uiModel30 = memberPriceInfo2 != null ? ProductCardMemberPriceInfoExtKt.toUiModel(memberPriceInfo2) : null;
                                        ProductCard.CartProductInfo cartProductInfo2 = productCard2.F;
                                        CartProductInfo uiModel31 = cartProductInfo2 != null ? ProductCardCartProductInfoExtKt.toUiModel(cartProductInfo2) : null;
                                        ProductCard.InStoreLocation inStoreLocation2 = productCard2.t;
                                        InStoreLocationData uiModel32 = inStoreLocation2 != null ? ProductCardInStoreLocationExtKt.toUiModel(inStoreLocation2) : null;
                                        ProductCard.ProductCardAnalytics productCardAnalytics2 = productCard2.G;
                                        AnalyticsData uiModel33 = productCardAnalytics2 != null ? ProductCardProductCardAnalyticsExtKt.toUiModel(productCardAnalytics2) : null;
                                        ProductCard.ProductCardAction productCardAction2 = productCard2.H;
                                        promotionCard = new PromotionCard(new au.com.woolworths.product.models.ProductCard(str71, str9, str10, str11, num3, str75, null, null, str76, z4, z5, str77, null, null, str78, uiModel18, emptyList9, uiModel19, uiModel20, uiModel21, emptyList10, uiModel23, str12, str13, uiModel24, uiModel25, str14, uiModel26, uiModel27, uiModel28, emptyList11, z6, uiModel29, uiModel30, uiModel31, uiModel32, uiModel33, null, productCardAction2 != null ? ProductCardProductCardActionExtKt.toUiModel(productCardAction2) : null, productCard2.I, 12480, 32, null), onPromotionCard.b, null, null, null, 28, null);
                                    } else {
                                        quickLinkCard = null;
                                    }
                                }
                            }
                        }
                        quickLinkCard = promotionCard;
                    }
                    if (quickLinkCard != null) {
                        arrayList11.add(quickLinkCard);
                    }
                    it5 = it3;
                    str30 = str8;
                    it4 = it2;
                    r4 = 0;
                }
                it = it4;
                horizontalListData = new HorizontalListData(str27, str28, str29, null, str30, arrayList11, null, null, null, null);
            } else {
                it = it4;
                if ((item != null ? item.c : null) != null) {
                    SpecialsHomeQuery.OnCatalogueCard onCatalogueCard = item.c;
                    Intrinsics.h(onCatalogueCard, "<this>");
                    String str82 = onCatalogueCard.f23718a;
                    String str83 = onCatalogueCard.b;
                    String str84 = onCatalogueCard.c;
                    String str85 = onCatalogueCard.d;
                    au.com.woolworths.shop.graphql.type.CatalogueCardType catalogueCardType2 = onCatalogueCard.e;
                    if (catalogueCardType2 != null) {
                        int iOrdinal4 = catalogueCardType2.ordinal();
                        CatalogueCardType catalogueCardType3 = (iOrdinal4 == 0 || iOrdinal4 != 1) ? CatalogueCardType.d : CatalogueCardType.e;
                        catalogueCardType = catalogueCardType3;
                    } else {
                        catalogueCardType = null;
                    }
                    paragraphTextItemData = new CatalogueCard(str82, str83, str84, str85, catalogueCardType, null, null, 96, null);
                } else {
                    if ((item != null ? item.d : null) != null) {
                        SpecialsHomeQuery.OnChatEntryCard onChatEntryCard = item.d;
                        Intrinsics.h(onChatEntryCard, "<this>");
                        String str86 = onChatEntryCard.f23719a;
                        String str87 = onChatEntryCard.b;
                        Boolean bool = onChatEntryCard.c;
                        ArrayList arrayList13 = onChatEntryCard.d;
                        ArrayList arrayList14 = new ArrayList(CollectionsKt.s(arrayList13, 10));
                        Iterator it12 = arrayList13.iterator();
                        while (it12.hasNext()) {
                            arrayList14.add((String) it12.next());
                        }
                        String str88 = onChatEntryCard.e;
                        SpecialsHomeQuery.ChatEntryCardAction chatEntryCardAction = onChatEntryCard.f;
                        String str89 = chatEntryCardAction.b;
                        ActionType uiModel34 = au.com.woolworths.product.models.ActionTypeExtKt.toUiModel(chatEntryCardAction.f23707a);
                        String str90 = chatEntryCardAction.c;
                        SpecialsHomeQuery.Analytics analytics2 = chatEntryCardAction.d;
                        if (analytics2 != null) {
                            AnalyticsFields analyticsFields3 = analytics2.b;
                            String str91 = analyticsFields3.f10032a;
                            String str92 = analyticsFields3.b;
                            String str93 = analyticsFields3.c;
                            str5 = str86;
                            String str94 = analyticsFields3.e;
                            String str95 = analyticsFields3.f;
                            String str96 = analyticsFields3.g;
                            String str97 = analyticsFields3.d;
                            String str98 = analyticsFields3.h;
                            String str99 = analyticsFields3.i;
                            List list15 = analyticsFields3.j;
                            if (list15 != null) {
                                List list16 = list15;
                                str7 = str99;
                                str6 = str87;
                                ?? arrayList15 = new ArrayList(CollectionsKt.s(list16, 10));
                                Iterator it13 = list16.iterator();
                                while (it13.hasNext()) {
                                    arrayList15.add(au.com.woolworths.product.models.AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it13.next()));
                                }
                                emptyList3 = arrayList15;
                            } else {
                                str7 = str99;
                                str6 = str87;
                                emptyList3 = null;
                            }
                            analyticsData3 = new AnalyticsData((EventConfig) null, str91, str92, str93, str94, str95, str96, str97, str98, str7, emptyList3 == null ? emptyList5 : emptyList3, 1, (DefaultConstructorMarker) null);
                        } else {
                            str5 = str86;
                            str6 = str87;
                            analyticsData3 = null;
                        }
                        editorialBannerData = new ChatEntryCard(str5, str6, bool, arrayList14, str88, new ActionData(str89, uiModel34, str90, analyticsData3));
                    } else if ((item != null ? item.e : null) != null) {
                        SpecialsHomeQuery.OnActionableCard onActionableCard = item.e;
                        Intrinsics.h(onActionableCard, "<this>");
                        String str100 = onActionableCard.c;
                        String str101 = onActionableCard.b;
                        int iOrdinal5 = onActionableCard.f23717a.ordinal();
                        paragraphTextItemData = new ActionableCard(str100, str101, iOrdinal5 != 0 ? iOrdinal5 != 1 ? iOrdinal5 != 2 ? DefaultCardHeight.SMALL : DefaultCardHeight.LARGE : DefaultCardHeight.MEDIUM : DefaultCardHeight.SMALL, onActionableCard.d, null, null, null);
                    } else if ((item != null ? item.f : null) != null) {
                        SpecialsHomeQuery.OnEditorialBanner onEditorialBanner = item.f;
                        Intrinsics.h(onEditorialBanner, "<this>");
                        String str102 = onEditorialBanner.f23721a;
                        String str103 = onEditorialBanner.b;
                        SpecialsHomeQuery.EditorialBannerImage editorialBannerImage = onEditorialBanner.c;
                        ImageWithAltText imageWithAltText4 = editorialBannerImage != null ? new ImageWithAltText(editorialBannerImage.f23712a, editorialBannerImage.b) : null;
                        int iOrdinal6 = onEditorialBanner.h.ordinal();
                        EditorialBannerImageFormat editorialBannerImageFormat = iOrdinal6 != 0 ? iOrdinal6 != 1 ? iOrdinal6 != 2 ? iOrdinal6 != 3 ? EditorialBannerImageFormat.d : EditorialBannerImageFormat.g : EditorialBannerImageFormat.f : EditorialBannerImageFormat.d : EditorialBannerImageFormat.e;
                        String str104 = onEditorialBanner.d;
                        String str105 = onEditorialBanner.e;
                        SpecialsHomeQuery.EditorialBannerFooter editorialBannerFooter2 = onEditorialBanner.g;
                        if (editorialBannerFooter2 != null) {
                            int iOrdinal7 = editorialBannerFooter2.f23711a.ordinal();
                            ContentFooterStyle contentFooterStyle2 = iOrdinal7 != 0 ? iOrdinal7 != 1 ? ContentFooterStyle.e : ContentFooterStyle.e : ContentFooterStyle.d;
                            String str106 = editorialBannerFooter2.b;
                            SpecialsHomeQuery.Logo logo2 = editorialBannerFooter2.c;
                            editorialBannerFooter = new EditorialBannerFooter(contentFooterStyle2, str106, logo2 != null ? new ImageWithAltText(logo2.f23716a, logo2.b) : null);
                        } else {
                            editorialBannerFooter = null;
                        }
                        SpecialsHomeQuery.EditorialBannerAction editorialBannerAction = onEditorialBanner.f;
                        if (editorialBannerAction != null) {
                            String str107 = editorialBannerAction.b;
                            ActionType uiModel35 = au.com.woolworths.product.models.ActionTypeExtKt.toUiModel(editorialBannerAction.f23709a);
                            String str108 = editorialBannerAction.c;
                            SpecialsHomeQuery.Analytics1 analytics1 = editorialBannerAction.d;
                            if (analytics1 != null) {
                                AnalyticsFields analyticsFields4 = analytics1.b;
                                String str109 = analyticsFields4.f10032a;
                                String str110 = analyticsFields4.b;
                                String str111 = analyticsFields4.c;
                                str = str102;
                                String str112 = analyticsFields4.e;
                                String str113 = analyticsFields4.f;
                                String str114 = analyticsFields4.g;
                                String str115 = analyticsFields4.d;
                                String str116 = analyticsFields4.h;
                                String str117 = analyticsFields4.i;
                                List list17 = analyticsFields4.j;
                                if (list17 != null) {
                                    List list18 = list17;
                                    str4 = str117;
                                    str2 = str103;
                                    str3 = str104;
                                    ?? arrayList16 = new ArrayList(CollectionsKt.s(list18, 10));
                                    Iterator it14 = list18.iterator();
                                    while (it14.hasNext()) {
                                        arrayList16.add(au.com.woolworths.product.models.AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it14.next()));
                                    }
                                    emptyList2 = arrayList16;
                                } else {
                                    str4 = str117;
                                    str2 = str103;
                                    str3 = str104;
                                    emptyList2 = null;
                                }
                                analyticsData2 = new AnalyticsData((EventConfig) null, str109, str110, str111, str112, str113, str114, str115, str116, str4, emptyList2 == null ? emptyList5 : emptyList2, 1, (DefaultConstructorMarker) null);
                            } else {
                                str = str102;
                                str2 = str103;
                                str3 = str104;
                                analyticsData2 = null;
                            }
                            actionData = new ActionData(str107, uiModel35, str108, analyticsData2);
                        } else {
                            str = str102;
                            str2 = str103;
                            str3 = str104;
                            actionData = null;
                        }
                        SpecialsHomeQuery.EditorialBannerAnalytics editorialBannerAnalytics = onEditorialBanner.i;
                        if (editorialBannerAnalytics != null) {
                            AnalyticsFields analyticsFields5 = editorialBannerAnalytics.b;
                            String str118 = analyticsFields5.f10032a;
                            String str119 = analyticsFields5.b;
                            String str120 = analyticsFields5.c;
                            String str121 = analyticsFields5.e;
                            String str122 = analyticsFields5.f;
                            String str123 = analyticsFields5.g;
                            String str124 = analyticsFields5.d;
                            String str125 = analyticsFields5.h;
                            String str126 = analyticsFields5.i;
                            List list19 = analyticsFields5.j;
                            if (list19 != null) {
                                List list20 = list19;
                                ?? arrayList17 = new ArrayList(CollectionsKt.s(list20, 10));
                                Iterator it15 = list20.iterator();
                                while (it15.hasNext()) {
                                    arrayList17.add(au.com.woolworths.product.models.AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it15.next()));
                                }
                                emptyList = arrayList17;
                            } else {
                                emptyList = null;
                            }
                            analyticsData = new AnalyticsData((EventConfig) null, str118, str119, str120, str121, str122, str123, str124, str125, str126, emptyList == null ? emptyList5 : emptyList, 1, (DefaultConstructorMarker) null);
                        } else {
                            analyticsData = null;
                        }
                        editorialBannerData = new EditorialBannerData(str, str2, imageWithAltText4, editorialBannerImageFormat, null, str3, str105, editorialBannerFooter, actionData, analyticsData);
                    } else if ((item != null ? item.g : null) != null) {
                        SpecialsHomeQuery.OnParagraphTextItem onParagraphTextItem = item.g;
                        Intrinsics.h(onParagraphTextItem, "<this>");
                        String str127 = onParagraphTextItem.f23724a;
                        int iOrdinal8 = onParagraphTextItem.b.ordinal();
                        paragraphTextItemData = new ParagraphTextItemData(null, str127, iOrdinal8 != 0 ? iOrdinal8 != 1 ? ParagraphTextItemType.f : ParagraphTextItemType.e : ParagraphTextItemType.d);
                    } else {
                        horizontalListData = null;
                    }
                    horizontalListData = editorialBannerData;
                }
                horizontalListData = paragraphTextItemData;
            }
            if (horizontalListData != null) {
                arrayList9.add(horizontalListData);
            }
            it4 = it;
        }
        return new SpecialsHome(arrayList9);
    }
}
