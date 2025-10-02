package com.woolworths.shop.catalogue;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.shop.graphql.type.CataloguePromotionDetailsInput;
import au.com.woolworths.shop.graphql.type.adapter.CataloguePromotionDetailsInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.catalogue.adapter.CataloguePromotionDetailsQuery_ResponseAdapter;
import com.woolworths.shop.catalogue.fragment.CatalogueInsetBanner;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/woolworths/shop/catalogue/CataloguePromotionDetailsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/shop/catalogue/CataloguePromotionDetailsQuery$Data;", "Data", "CataloguePromotionDetails", "Item", "OnPromotionDetailsHeader", "OnInsetBanner", "OnTermsAndConditions", "OnProductCard", "Companion", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CataloguePromotionDetailsQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final CataloguePromotionDetailsInput f21677a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final boolean f;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CataloguePromotionDetailsQuery$CataloguePromotionDetails;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CataloguePromotionDetails {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f21678a;

        public CataloguePromotionDetails(ArrayList arrayList) {
            this.f21678a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CataloguePromotionDetails) && this.f21678a.equals(((CataloguePromotionDetails) obj).f21678a);
        }

        public final int hashCode() {
            return this.f21678a.hashCode();
        }

        public final String toString() {
            return a.k("CataloguePromotionDetails(items=", ")", this.f21678a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/catalogue/CataloguePromotionDetailsQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CataloguePromotionDetailsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final CataloguePromotionDetails f21679a;

        public Data(CataloguePromotionDetails cataloguePromotionDetails) {
            this.f21679a = cataloguePromotionDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21679a, ((Data) obj).f21679a);
        }

        public final int hashCode() {
            CataloguePromotionDetails cataloguePromotionDetails = this.f21679a;
            if (cataloguePromotionDetails == null) {
                return 0;
            }
            return cataloguePromotionDetails.f21678a.hashCode();
        }

        public final String toString() {
            return "Data(cataloguePromotionDetails=" + this.f21679a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CataloguePromotionDetailsQuery$Item;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final String f21680a;
        public final OnPromotionDetailsHeader b;
        public final OnInsetBanner c;
        public final OnTermsAndConditions d;
        public final OnProductCard e;

        public Item(String __typename, OnPromotionDetailsHeader onPromotionDetailsHeader, OnInsetBanner onInsetBanner, OnTermsAndConditions onTermsAndConditions, OnProductCard onProductCard) {
            Intrinsics.h(__typename, "__typename");
            this.f21680a = __typename;
            this.b = onPromotionDetailsHeader;
            this.c = onInsetBanner;
            this.d = onTermsAndConditions;
            this.e = onProductCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.c(this.f21680a, item.f21680a) && Intrinsics.c(this.b, item.b) && Intrinsics.c(this.c, item.c) && Intrinsics.c(this.d, item.d) && Intrinsics.c(this.e, item.e);
        }

        public final int hashCode() {
            int iHashCode = this.f21680a.hashCode() * 31;
            OnPromotionDetailsHeader onPromotionDetailsHeader = this.b;
            int iHashCode2 = (iHashCode + (onPromotionDetailsHeader == null ? 0 : onPromotionDetailsHeader.hashCode())) * 31;
            OnInsetBanner onInsetBanner = this.c;
            int iHashCode3 = (iHashCode2 + (onInsetBanner == null ? 0 : onInsetBanner.hashCode())) * 31;
            OnTermsAndConditions onTermsAndConditions = this.d;
            int iHashCode4 = (iHashCode3 + (onTermsAndConditions == null ? 0 : onTermsAndConditions.hashCode())) * 31;
            OnProductCard onProductCard = this.e;
            return iHashCode4 + (onProductCard != null ? onProductCard.hashCode() : 0);
        }

        public final String toString() {
            return "Item(__typename=" + this.f21680a + ", onPromotionDetailsHeader=" + this.b + ", onInsetBanner=" + this.c + ", onTermsAndConditions=" + this.d + ", onProductCard=" + this.e + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CataloguePromotionDetailsQuery$OnInsetBanner;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnInsetBanner {

        /* renamed from: a, reason: collision with root package name */
        public final String f21681a;
        public final CatalogueInsetBanner b;

        public OnInsetBanner(String str, CatalogueInsetBanner catalogueInsetBanner) {
            this.f21681a = str;
            this.b = catalogueInsetBanner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnInsetBanner)) {
                return false;
            }
            OnInsetBanner onInsetBanner = (OnInsetBanner) obj;
            return Intrinsics.c(this.f21681a, onInsetBanner.f21681a) && Intrinsics.c(this.b, onInsetBanner.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21681a.hashCode() * 31);
        }

        public final String toString() {
            return "OnInsetBanner(__typename=" + this.f21681a + ", catalogueInsetBanner=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CataloguePromotionDetailsQuery$OnProductCard;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f21682a;
        public final ProductCard b;

        public OnProductCard(String str, ProductCard productCard) {
            this.f21682a = str;
            this.b = productCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnProductCard)) {
                return false;
            }
            OnProductCard onProductCard = (OnProductCard) obj;
            return Intrinsics.c(this.f21682a, onProductCard.f21682a) && Intrinsics.c(this.b, onProductCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21682a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("OnProductCard(__typename=", this.f21682a, ", productCard=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CataloguePromotionDetailsQuery$OnPromotionDetailsHeader;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPromotionDetailsHeader {

        /* renamed from: a, reason: collision with root package name */
        public final String f21683a;
        public final String b;
        public final String c;
        public final String d;

        public OnPromotionDetailsHeader(String str, String str2, String str3, String str4) {
            this.f21683a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnPromotionDetailsHeader)) {
                return false;
            }
            OnPromotionDetailsHeader onPromotionDetailsHeader = (OnPromotionDetailsHeader) obj;
            return Intrinsics.c(this.f21683a, onPromotionDetailsHeader.f21683a) && Intrinsics.c(this.b, onPromotionDetailsHeader.b) && Intrinsics.c(this.c, onPromotionDetailsHeader.c) && Intrinsics.c(this.d, onPromotionDetailsHeader.d);
        }

        public final int hashCode() {
            int iHashCode = this.f21683a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return androidx.constraintlayout.core.state.a.l(YU.a.v("OnPromotionDetailsHeader(promotionDetailsHeaderTitle=", this.f21683a, ", promotionDetailsHeaderTitleColor=", this.b, ", promotionDetailsHeaderSubtitle="), this.c, ", promotionDetailsHeaderImage=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CataloguePromotionDetailsQuery$OnTermsAndConditions;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnTermsAndConditions {

        /* renamed from: a, reason: collision with root package name */
        public final String f21684a;
        public final String b;

        public OnTermsAndConditions(String str, String str2) {
            this.f21684a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnTermsAndConditions)) {
                return false;
            }
            OnTermsAndConditions onTermsAndConditions = (OnTermsAndConditions) obj;
            return Intrinsics.c(this.f21684a, onTermsAndConditions.f21684a) && Intrinsics.c(this.b, onTermsAndConditions.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21684a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("OnTermsAndConditions(termsAndConditionsTitle=", this.f21684a, ", termsAndConditionsContent=", this.b, ")");
        }
    }

    public CataloguePromotionDetailsQuery(CataloguePromotionDetailsInput cataloguePromotionDetailsInput, boolean z) {
        this.f21677a = cataloguePromotionDetailsInput;
        Optional.Absent absent = Optional.Absent.f13523a;
        this.b = absent;
        this.c = absent;
        this.d = absent;
        this.e = absent;
        this.f = z;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(CataloguePromotionDetailsQuery_ResponseAdapter.Data.f21728a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query CataloguePromotionDetails($input: CataloguePromotionDetailsInput!, $includeAvailabilityInfoStatus: Boolean! = false , $includeProductAvailabilityStates: Boolean! = false , $includeOfferMinimumSpend: Boolean! = false , $includePricingFootnote: Boolean! = false , $includeLowestPrice14Days: Boolean!) { cataloguePromotionDetails(cataloguePromotionDetailsInput: $input) { items { __typename ... on PromotionDetailsHeader { promotionDetailsHeaderTitle promotionDetailsHeaderTitleColor promotionDetailsHeaderSubtitle promotionDetailsHeaderImage } ... on InsetBanner { __typename ...catalogueInsetBanner } ... on TermsAndConditions { termsAndConditionsTitle termsAndConditionsContent } ... on ProductCard { __typename ...productCard } } } }  fragment catalogueInsetBanner on InsetBanner { displayType message bannerTitle: title iconUrl action { placement type label url } }  fragment productTrolley on ProductTrolley { minimum maximum increment defaultValue: default unit inTrolley buttonState buttonLabel buttonQuantity title }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment productCard on ProductCard { productId name isNew purchaseRestriction productImage isAvailable inStoreAvailabilityInfo @include(if: $includeProductAvailabilityStates) { button { label action style enabled } status @include(if: $includeAvailabilityInfoStatus) infoSheet { title message button { label action style enabled } } } price unitOfMeasureLabel badgeImage promotionInfo { type label } unitPriceDescription wasPrice purchaseWarning inlineLabels { type label priority } trolley { __typename ...productTrolley } trolleys { __typename ...productTrolley } list { minimum maximum increment defaultValue: default unit } inStoreDetails { locationText locationType } inStoreLocation { details { aisleNumber aisleSide bayNumber bayNumberAlternate floorNumber location x y z } displayInfo { locationText locationType } } adId source marketplace { imageUrl title sellerName brandName lowestMarketPriceDescription @include(if: $includeLowestPrice14Days) } rewardsOfferInfo { offerId offerStatus displayStatus displayExpiry minimumSpend @include(if: $includeOfferMinimumSpend) offerAnalytics { offerName campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode } boostButton { label style enabled } } disclaimer tagLabel { text style } productVarieties { totalCount label priceFamilyId } categories { name categoryLevel } isTobacco memberPriceInfo { header title subtitle } multiBuyPriceInfo { price unitPrice } cartProductInfo { totalPrice totalOriginalPrice totalDiscount } productCardAnalytics { __typename ...analyticsFields } productCardAction { action type id analytics { __typename ...analyticsFields } } pricingFootnoteMd @include(if: $includePricingFootnote) }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CataloguePromotionDetailsQuery)) {
            return false;
        }
        CataloguePromotionDetailsQuery cataloguePromotionDetailsQuery = (CataloguePromotionDetailsQuery) obj;
        return Intrinsics.c(this.f21677a, cataloguePromotionDetailsQuery.f21677a) && Intrinsics.c(this.b, cataloguePromotionDetailsQuery.b) && Intrinsics.c(this.c, cataloguePromotionDetailsQuery.c) && Intrinsics.c(this.d, cataloguePromotionDetailsQuery.d) && Intrinsics.c(this.e, cataloguePromotionDetailsQuery.e) && this.f == cataloguePromotionDetailsQuery.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.e, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.d, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.c, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.b, this.f21677a.hashCode() * 31, 31), 31), 31), 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "2240b3981b1e706c832023639aa4200facb3c1432872166d1744fe6482971b4b";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "CataloguePromotionDetails";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("input");
        Adapters.c(CataloguePromotionDetailsInput_InputAdapter.f12048a, false).toJson(jsonWriter, customScalarAdapters, this.f21677a);
        Optional optional = this.b;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("includeAvailabilityInfoStatus");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        } else if (z) {
            jsonWriter.F1("includeAvailabilityInfoStatus");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional2 = this.c;
        if (optional2 instanceof Optional.Present) {
            jsonWriter.F1("includeProductAvailabilityStates");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional2);
        } else if (z) {
            jsonWriter.F1("includeProductAvailabilityStates");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional3 = this.d;
        if (optional3 instanceof Optional.Present) {
            jsonWriter.F1("includeOfferMinimumSpend");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional3);
        } else if (z) {
            jsonWriter.F1("includeOfferMinimumSpend");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional4 = this.e;
        if (optional4 instanceof Optional.Present) {
            jsonWriter.F1("includePricingFootnote");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional4);
        } else if (z) {
            jsonWriter.F1("includePricingFootnote");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        jsonWriter.F1("includeLowestPrice14Days");
        Adapters.f.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.f));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CataloguePromotionDetailsQuery(input=");
        sb.append(this.f21677a);
        sb.append(", includeAvailabilityInfoStatus=");
        sb.append(this.b);
        sb.append(", includeProductAvailabilityStates=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sb, this.c, ", includeOfferMinimumSpend=", this.d, ", includePricingFootnote=");
        sb.append(this.e);
        sb.append(", includeLowestPrice14Days=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
