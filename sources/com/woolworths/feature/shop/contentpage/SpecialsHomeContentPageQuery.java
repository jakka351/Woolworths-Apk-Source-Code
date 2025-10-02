package com.woolworths.feature.shop.contentpage;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.SpecialsHomeInput;
import au.com.woolworths.shop.graphql.type.adapter.SpecialsHomeInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.contentpage.adapter.SpecialsHomeContentPageQuery_ResponseAdapter;
import com.woolworths.feature.shop.contentpage.fragment.ContentPage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/SpecialsHomeContentPageQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/feature/shop/contentpage/SpecialsHomeContentPageQuery$Data;", "Data", "SpecialsHome", "Companion", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SpecialsHomeContentPageQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final SpecialsHomeInput f19513a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final Optional h;
    public final Optional i;
    public final boolean j;
    public final Optional k;
    public final Optional l;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/SpecialsHomeContentPageQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/SpecialsHomeContentPageQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final SpecialsHome f19514a;

        public Data(SpecialsHome specialsHome) {
            this.f19514a = specialsHome;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f19514a, ((Data) obj).f19514a);
        }

        public final int hashCode() {
            SpecialsHome specialsHome = this.f19514a;
            if (specialsHome == null) {
                return 0;
            }
            return specialsHome.hashCode();
        }

        public final String toString() {
            return "Data(specialsHome=" + this.f19514a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/SpecialsHomeContentPageQuery$SpecialsHome;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SpecialsHome {

        /* renamed from: a, reason: collision with root package name */
        public final String f19515a;
        public final ContentPage b;

        public SpecialsHome(String str, ContentPage contentPage) {
            this.f19515a = str;
            this.b = contentPage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpecialsHome)) {
                return false;
            }
            SpecialsHome specialsHome = (SpecialsHome) obj;
            return Intrinsics.c(this.f19515a, specialsHome.f19515a) && Intrinsics.c(this.b, specialsHome.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19515a.hashCode() * 31);
        }

        public final String toString() {
            return "SpecialsHome(__typename=" + this.f19515a + ", contentPage=" + this.b + ")";
        }
    }

    public SpecialsHomeContentPageQuery(SpecialsHomeInput specialsHomeInput, boolean z, boolean z2, boolean z3, Optional optional, boolean z4, Optional.Present present) {
        this.f19513a = specialsHomeInput;
        Optional.Absent absent = Optional.Absent.f13523a;
        this.b = absent;
        this.c = absent;
        this.d = absent;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = absent;
        this.i = optional;
        this.j = z4;
        this.k = present;
        this.l = absent;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(SpecialsHomeContentPageQuery_ResponseAdapter.Data.f19522a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query SpecialsHomeContentPage($specialsHomeInput: SpecialsHomeInput!, $includeProductAvailabilityStates: Boolean! = false , $includeOfferMinimumSpend: Boolean! = false , $includeAvailabilityInfoStatus: Boolean! = false , $isVideoTagOnRecipeCardEnabled: Boolean!, $includeUniversalInventoryFallback: Boolean!, $isButtonSectionEnabled: Boolean!, $includePricingFootnote: Boolean! = false , $isSavedRecipesContentPageMigrationEnabled: Boolean! = false , $includeLowestPrice14Days: Boolean!, $isInfoTileEnabled: Boolean! = true , $includeChatEntryCard: Boolean! = false ) { specialsHome(specialsHomeInput: $specialsHomeInput) { __typename ...contentPage } }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment actionFields on Action { id action type analytics { __typename ...analyticsFields } }  fragment hostedIconFields on HostedIcon { url }  fragment infoTileFields on InfoTile { infoTileIconSlot { icon { __typename ... on HostedIcon { __typename ...hostedIconFields } ... on InfoTileBadge { number } } size } infoTileTitle infoTileBodyMarkdown infoTileCta { infoTileCtaLabel infoTileCtaAction { __typename ...actionFields } } infoTileStyle }  fragment productTrolley on ProductTrolley { minimum maximum increment defaultValue: default unit inTrolley buttonState buttonLabel buttonQuantity title }  fragment productCard on ProductCard { productId name isNew purchaseRestriction productImage isAvailable inStoreAvailabilityInfo @include(if: $includeProductAvailabilityStates) { button { label action style enabled } status @include(if: $includeAvailabilityInfoStatus) infoSheet { title message button { label action style enabled } } } price unitOfMeasureLabel badgeImage promotionInfo { type label } unitPriceDescription wasPrice purchaseWarning inlineLabels { type label priority } trolley { __typename ...productTrolley } trolleys { __typename ...productTrolley } list { minimum maximum increment defaultValue: default unit } inStoreDetails { locationText locationType } inStoreLocation { details { aisleNumber aisleSide bayNumber bayNumberAlternate floorNumber location x y z } displayInfo { locationText locationType } } adId source marketplace { imageUrl title sellerName brandName lowestMarketPriceDescription @include(if: $includeLowestPrice14Days) } rewardsOfferInfo { offerId offerStatus displayStatus displayExpiry minimumSpend @include(if: $includeOfferMinimumSpend) offerAnalytics { offerName campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode } boostButton { label style enabled } } disclaimer tagLabel { text style } productVarieties { totalCount label priceFamilyId } categories { name categoryLevel } isTobacco memberPriceInfo { header title subtitle } multiBuyPriceInfo { price unitPrice } cartProductInfo { totalPrice totalOriginalPrice totalDiscount } productCardAnalytics { __typename ...analyticsFields } productCardAction { action type id analytics { __typename ...analyticsFields } } pricingFootnoteMd @include(if: $includePricingFootnote) }  fragment recipeSummaryCardFragment on RecipeSummaryCard { title image id tags sourceName isVideoAvailable @include(if: $isVideoTagOnRecipeCardEnabled) recipePrepDuration { duration altText } recipeCookDuration { duration altText } recipeCostPerServe { recipeCostPerServePrice } }  fragment offerCard on OfferCard { offerCardImageUrl offerCardTitle offerCardDescription offerCardBadgeImage { imageUrl altText } offerCardTextColor offerCardTextBackgroundColor offerCardPriceInfo { offerCardPriceInfoPriceDollars offerCardPriceInfoPriceCents offerCardPriceInfoPrefix1 offerCardPriceInfoPrefix2 offerCardPriceInfoSuffix } offerCardAnalytics { __typename ...analyticsFields } offerCardAction { action analytics { __typename ...analyticsFields } type } offerCardVariant }  fragment editorialBanner on EditorialBanner { editorialBannerId editorialBannerBackgroundColour editorialBannerImage { imageUrl altText } editorialBannerTitle editorialBannerSubtitle editorialBannerAction { __typename ...actionFields } editorialBannerFooter { style text logo { imageUrl altText } } editorialBannerImageFormat editorialBannerTextPosition editorialBannerAnalytics { __typename ...analyticsFields } }  fragment coreIconFields on CoreIcon { coreIconName }  fragment coreButtonFields on CoreButton { coreButtonStyle coreButtonLabel coreButtonLeadingIcon { __typename ...coreIconFields } coreButtonTrailingIcon { __typename ...coreIconFields } coreButtonAction { __typename ...actionFields } coreButtonEnabled }  fragment contentPage on GenericPage { header { pageTitle heroImage heroImageType video { url title thumbnail duration id } } impressionAnalytics { __typename ...analyticsFields } analytics { __typename ...analyticsFields } nextPageNumber @include(if: $isSavedRecipesContentPageMigrationEnabled) items { __typename ... on PageCover { __typename pageCoverContentFormat pageCoverContentAlignment pageCoverContentTheme { background { lightHexCode } foreground { primary { lightHexCode } secondary { lightHexCode } highlight { lightHexCode } } } pageCoverPrimaryImage { imageUrl altText } pageCoverPrimaryImagePosition pageCoverLogos { imageUrl altText } pageCoverTitle pageCoverTitleSize pageCoverSubTitle } ... on UniversalInventoryContainer { googleAdBannerCard { __typename adUnit nativeCustomTemplateId targeting iabSize correlator _excluded } nextBestAction @include(if: $includeUniversalInventoryFallback) { __typename ... on ActionableCard { __typename link image altText cardHeight analytics _excluded actionableCardImpressionAnalytics { __typename ...analyticsFields } actionableCardClickAnalytics { __typename ...analyticsFields } } } } ... on TitleSection { titleSectionType titleSectionText } ... on DownloadableAsset { assetType assetUrl assetWidth assetHeight fit alternativeText: altText } ... on ParagraphTextItem { content type } ... on VerticalList { verticalListTitle verticalListSubtitle verticalListItems { __typename ... on FullWidthContentCard { contentCardId contentCardImageUrl contentCardTitle contentCardDescription contentCardIsVideoAvailable contentCardAction { __typename ...actionFields } } ... on InfoTile @include(if: $isInfoTileEnabled) { __typename ...infoTileFields } } verticalListAction { actionTitle action { __typename ...actionFields } } } ... on HorizontalList { horizontalListTrailingLink { linkTextWithAlt { altText text } linkId linkAction { __typename ...actionFields } } horizontalListAnalytics { __typename ...analyticsFields } horizontalListImpressionAnalytics { __typename ...analyticsFields } title subtitle deepLink actionTitle actionPath items { __typename ... on ProductCard { __typename ...productCard } ... on RecipeSummaryCard { __typename ...recipeSummaryCardFragment } ... on RecipeMoreCard { actionMetadata { __typename ... on RecipeTagList { tags } ... on RecipeSource { source } } } ... on NavRoundel { navRoundelId navRoundelImageUrl navRoundelTitle navRoundelAction { __typename ...actionFields } } ... on Pill { pillText pillAction { __typename ...actionFields } } ... on ContentCard { contentCardId contentCardImageUrl contentCardTitle contentCardDescription contentCardAction { __typename ...actionFields } contentCardFooter { style text logo { imageUrl altText } } contentCardBrandImage { imageUrl altText } contentCardIsVideoAvailable contentCardSize contentCardSponsoredText contentCardAnalytics { __typename ...analyticsFields } } ... on MoreCard { moreCardStyle moreCardAction { __typename ...actionFields } } ... on ProductCategoryTile { productCategoryTileImageUrl productCategoryTileLabel productCategoryTileAction { __typename ...actionFields } } ... on OfferCard { __typename ...offerCard } ... on QuickLinkCard { __typename linkCardTitle linkCardSubtitle linkCardImage linkCardAction { __typename ...actionFields } isQuickLinkView } ... on PromotionCard { promotionCardProduct { __typename ...productCard } promotionCardOfferId analytics { __typename ...analyticsFields } impressionAnalytics { __typename ...analyticsFields } } } actionPath actionTitle deepLink } ... on RecipeMethod { panelTitle caption items { title content methodImage: image } disclaimer } ... on InsetBanner { displayType message bannerTitle: title action { placement type label url } } ... on BasicCoreRowList { basicCoreRowListSectionTitle basicCoreRowListItems { row { leadingAsset { __typename ... on HostedIcon { __typename ...hostedIconFields } } description label } action { __typename ...actionFields } } basicCoreRowListAnalytics { __typename ...analyticsFields } basicCoreRowListImpressionAnalytics { __typename ...analyticsFields } } ... on Video { url title thumbnail duration id } ... on EditorialCarousel { editorialCarouselItems { __typename ... on EditorialBanner { __typename ...editorialBanner } } } ... on EditorialBanner { __typename ...editorialBanner } ... on SearchNavCard { searchNavCardPlaceholderText searchNavCardAction { __typename ...actionFields } } ... on BasicCoreBroadcastBanner { impressionAnalytics { __typename ...analyticsFields } broadcastBannerDismissAnalytics { __typename ...analyticsFields } broadcastBannerUI { title subtitle style icon { __typename ... on CoreIcon { __typename ...coreIconFields } ... on HostedIcon { __typename ...hostedIconFields } } } broadcastBannerAction { __typename ...actionFields } broadcastBannerActionLabel broadcastBannerId broadcastBannerDismissible } ... on ButtonSection @include(if: $isButtonSectionEnabled) { buttonSectionButton { __typename ...coreButtonFields } } ... on GridList @include(if: $isSavedRecipesContentPageMigrationEnabled) { gridListItemCount gridListAnalytics { __typename ...analyticsFields } gridListImpressionAnalytics { __typename ...analyticsFields } gridListItems { __typename ... on RecipeSummaryCard { __typename ...recipeSummaryCardFragment } } } ... on InfoTile @include(if: $isInfoTileEnabled) { __typename ...infoTileFields } ... on ChatEntryCardV3 @include(if: $includeChatEntryCard) { chatEntryCardTitle chatEntryCardShowBeta chatEntryCardSuggestedPrompts chatEntryCardAction { id action type analytics { __typename ...analyticsFields } } } ... on CatalogueCard { catalogueCardId: id title catalogueCardSubtitle: subtitle imageLeft catalogueCardType clickAnalytics { __typename ...analyticsFields } impressionAnalytics { __typename ...analyticsFields } } ... on ActionableCard { image altText cardHeight link _excluded analytics actionableCardImpressionAnalytics { __typename ...analyticsFields } actionableCardClickAnalytics { __typename ...analyticsFields } } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpecialsHomeContentPageQuery)) {
            return false;
        }
        SpecialsHomeContentPageQuery specialsHomeContentPageQuery = (SpecialsHomeContentPageQuery) obj;
        return Intrinsics.c(this.f19513a, specialsHomeContentPageQuery.f19513a) && Intrinsics.c(this.b, specialsHomeContentPageQuery.b) && Intrinsics.c(this.c, specialsHomeContentPageQuery.c) && Intrinsics.c(this.d, specialsHomeContentPageQuery.d) && this.e == specialsHomeContentPageQuery.e && this.f == specialsHomeContentPageQuery.f && this.g == specialsHomeContentPageQuery.g && Intrinsics.c(this.h, specialsHomeContentPageQuery.h) && Intrinsics.c(this.i, specialsHomeContentPageQuery.i) && this.j == specialsHomeContentPageQuery.j && Intrinsics.c(this.k, specialsHomeContentPageQuery.k) && Intrinsics.c(this.l, specialsHomeContentPageQuery.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + a.c(this.k, b.e(a.c(this.i, a.c(this.h, b.e(b.e(b.e(a.c(this.d, a.c(this.c, a.c(this.b, this.f19513a.hashCode() * 31, 31), 31), 31), 31, this.e), 31, this.f), 31, this.g), 31), 31), 31, this.j), 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "169ebf409d55b9a00feb29af17318485803215cc54c200d1732fb2a86248765f";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "SpecialsHomeContentPage";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("specialsHomeInput");
        Adapters.c(SpecialsHomeInput_InputAdapter.f12119a, false).toJson(jsonWriter, customScalarAdapters, this.f19513a);
        Optional optional = this.b;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("includeProductAvailabilityStates");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        } else if (z) {
            jsonWriter.F1("includeProductAvailabilityStates");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional2 = this.c;
        if (optional2 instanceof Optional.Present) {
            jsonWriter.F1("includeOfferMinimumSpend");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional2);
        } else if (z) {
            jsonWriter.F1("includeOfferMinimumSpend");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional3 = this.d;
        if (optional3 instanceof Optional.Present) {
            jsonWriter.F1("includeAvailabilityInfoStatus");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional3);
        } else if (z) {
            jsonWriter.F1("includeAvailabilityInfoStatus");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        jsonWriter.F1("isVideoTagOnRecipeCardEnabled");
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
        d.B(this.e, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeUniversalInventoryFallback");
        d.B(this.f, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "isButtonSectionEnabled");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.g));
        Optional optional4 = this.h;
        if (optional4 instanceof Optional.Present) {
            jsonWriter.F1("includePricingFootnote");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional4);
        } else if (z) {
            jsonWriter.F1("includePricingFootnote");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional5 = this.i;
        if (optional5 instanceof Optional.Present) {
            jsonWriter.F1("isSavedRecipesContentPageMigrationEnabled");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional5);
        } else if (z) {
            jsonWriter.F1("isSavedRecipesContentPageMigrationEnabled");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        jsonWriter.F1("includeLowestPrice14Days");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.j));
        Optional optional6 = this.k;
        if (optional6 instanceof Optional.Present) {
            jsonWriter.F1("isInfoTileEnabled");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional6);
        } else if (z) {
            jsonWriter.F1("isInfoTileEnabled");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.TRUE);
        }
        Optional optional7 = this.l;
        if (optional7 instanceof Optional.Present) {
            jsonWriter.F1("includeChatEntryCard");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional7);
        } else if (z) {
            jsonWriter.F1("includeChatEntryCard");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpecialsHomeContentPageQuery(specialsHomeInput=");
        sb.append(this.f19513a);
        sb.append(", includeProductAvailabilityStates=");
        sb.append(this.b);
        sb.append(", includeOfferMinimumSpend=");
        a.x(sb, this.c, ", includeAvailabilityInfoStatus=", this.d, ", isVideoTagOnRecipeCardEnabled=");
        au.com.woolworths.android.onesite.a.D(sb, this.e, ", includeUniversalInventoryFallback=", this.f, ", isButtonSectionEnabled=");
        a.z(sb, this.g, ", includePricingFootnote=", this.h, ", isSavedRecipesContentPageMigrationEnabled=");
        a.y(sb, this.i, ", includeLowestPrice14Days=", this.j, ", isInfoTileEnabled=");
        sb.append(this.k);
        sb.append(", includeChatEntryCard=");
        sb.append(this.l);
        sb.append(")");
        return sb.toString();
    }
}
