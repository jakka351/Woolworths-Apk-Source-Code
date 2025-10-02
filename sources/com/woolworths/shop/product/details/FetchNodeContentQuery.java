package com.woolworths.shop.product.details;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.shop.graphql.type.NodeInput;
import au.com.woolworths.shop.graphql.type.adapter.NodeInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.product.details.adapter.FetchNodeContentQuery_ResponseAdapter;
import com.woolworths.shop.productcard.data.fragment.ProductTile;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/woolworths/shop/product/details/FetchNodeContentQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/shop/product/details/FetchNodeContentQuery$Data;", "Data", "FetchNodeContent", "OnHorizontalList", "Item", "OnProductCard", "OnProductTile", "Companion", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FetchNodeContentQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final NodeInput f23401a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final Optional f;
    public final boolean g;
    public final boolean h;
    public final Optional i;
    public final boolean j;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/product/details/FetchNodeContentQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/FetchNodeContentQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final FetchNodeContent f23402a;

        public Data(FetchNodeContent fetchNodeContent) {
            this.f23402a = fetchNodeContent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f23402a, ((Data) obj).f23402a);
        }

        public final int hashCode() {
            FetchNodeContent fetchNodeContent = this.f23402a;
            if (fetchNodeContent == null) {
                return 0;
            }
            return fetchNodeContent.hashCode();
        }

        public final String toString() {
            return "Data(fetchNodeContent=" + this.f23402a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/FetchNodeContentQuery$FetchNodeContent;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FetchNodeContent {

        /* renamed from: a, reason: collision with root package name */
        public final String f23403a;
        public final OnHorizontalList b;

        public FetchNodeContent(String __typename, OnHorizontalList onHorizontalList) {
            Intrinsics.h(__typename, "__typename");
            this.f23403a = __typename;
            this.b = onHorizontalList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FetchNodeContent)) {
                return false;
            }
            FetchNodeContent fetchNodeContent = (FetchNodeContent) obj;
            return Intrinsics.c(this.f23403a, fetchNodeContent.f23403a) && Intrinsics.c(this.b, fetchNodeContent.b);
        }

        public final int hashCode() {
            int iHashCode = this.f23403a.hashCode() * 31;
            OnHorizontalList onHorizontalList = this.b;
            return iHashCode + (onHorizontalList == null ? 0 : onHorizontalList.f23405a.hashCode());
        }

        public final String toString() {
            return "FetchNodeContent(__typename=" + this.f23403a + ", onHorizontalList=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/FetchNodeContentQuery$Item;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final String f23404a;
        public final OnProductCard b;
        public final OnProductTile c;

        public Item(String __typename, OnProductCard onProductCard, OnProductTile onProductTile) {
            Intrinsics.h(__typename, "__typename");
            this.f23404a = __typename;
            this.b = onProductCard;
            this.c = onProductTile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.c(this.f23404a, item.f23404a) && Intrinsics.c(this.b, item.b) && Intrinsics.c(this.c, item.c);
        }

        public final int hashCode() {
            int iHashCode = this.f23404a.hashCode() * 31;
            OnProductCard onProductCard = this.b;
            int iHashCode2 = (iHashCode + (onProductCard == null ? 0 : onProductCard.hashCode())) * 31;
            OnProductTile onProductTile = this.c;
            return iHashCode2 + (onProductTile != null ? onProductTile.hashCode() : 0);
        }

        public final String toString() {
            return "Item(__typename=" + this.f23404a + ", onProductCard=" + this.b + ", onProductTile=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/FetchNodeContentQuery$OnHorizontalList;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHorizontalList {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f23405a;

        public OnHorizontalList(ArrayList arrayList) {
            this.f23405a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnHorizontalList) && this.f23405a.equals(((OnHorizontalList) obj).f23405a);
        }

        public final int hashCode() {
            return this.f23405a.hashCode();
        }

        public final String toString() {
            return a.k("OnHorizontalList(items=", ")", this.f23405a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/FetchNodeContentQuery$OnProductCard;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f23406a;
        public final ProductCard b;

        public OnProductCard(String str, ProductCard productCard) {
            this.f23406a = str;
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
            return Intrinsics.c(this.f23406a, onProductCard.f23406a) && Intrinsics.c(this.b, onProductCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23406a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("OnProductCard(__typename=", this.f23406a, ", productCard=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/FetchNodeContentQuery$OnProductTile;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductTile {

        /* renamed from: a, reason: collision with root package name */
        public final String f23407a;
        public final ProductTile b;

        public OnProductTile(String str, ProductTile productTile) {
            this.f23407a = str;
            this.b = productTile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnProductTile)) {
                return false;
            }
            OnProductTile onProductTile = (OnProductTile) obj;
            return Intrinsics.c(this.f23407a, onProductTile.f23407a) && Intrinsics.c(this.b, onProductTile.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23407a.hashCode() * 31);
        }

        public final String toString() {
            return "OnProductTile(__typename=" + this.f23407a + ", productTile=" + this.b + ")";
        }
    }

    public FetchNodeContentQuery(NodeInput nodeInput, boolean z, boolean z2, Optional optional, boolean z3) {
        Intrinsics.h(nodeInput, "nodeInput");
        this.f23401a = nodeInput;
        Optional.Absent absent = Optional.Absent.f13523a;
        this.b = absent;
        this.c = absent;
        this.d = absent;
        this.e = absent;
        this.f = absent;
        this.g = z;
        this.h = z2;
        this.i = optional;
        this.j = z3;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(FetchNodeContentQuery_ResponseAdapter.Data.f23502a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query fetchNodeContent($nodeInput: NodeInput!, $storeId: String, $shoppingMode: String, $supportedLinks: [String], $supportedActions: [String], $includeOfferMinimumSpend: Boolean!, $includeAvailabilityInfoStatus: Boolean! = false , $includeProductAvailabilityStates: Boolean!, $isProductTileUpliftEnabled: Boolean!, $includePricingFootnote: Boolean! = false , $includeLowestPrice14Days: Boolean!) { fetchNodeContent(nodeInput: $nodeInput) { __typename ... on HorizontalList { items { __typename ... on ProductCard { __typename ...productCard } ... on ProductTile @include(if: $isProductTileUpliftEnabled) { __typename ...productTile } } } } }  fragment productTrolley on ProductTrolley { minimum maximum increment defaultValue: default unit inTrolley buttonState buttonLabel buttonQuantity title }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment productCard on ProductCard { productId name isNew purchaseRestriction productImage isAvailable inStoreAvailabilityInfo @include(if: $includeProductAvailabilityStates) { button { label action style enabled } status @include(if: $includeAvailabilityInfoStatus) infoSheet { title message button { label action style enabled } } } price unitOfMeasureLabel badgeImage promotionInfo { type label } unitPriceDescription wasPrice purchaseWarning inlineLabels { type label priority } trolley { __typename ...productTrolley } trolleys { __typename ...productTrolley } list { minimum maximum increment defaultValue: default unit } inStoreDetails { locationText locationType } inStoreLocation { details { aisleNumber aisleSide bayNumber bayNumberAlternate floorNumber location x y z } displayInfo { locationText locationType } } adId source marketplace { imageUrl title sellerName brandName lowestMarketPriceDescription @include(if: $includeLowestPrice14Days) } rewardsOfferInfo { offerId offerStatus displayStatus displayExpiry minimumSpend @include(if: $includeOfferMinimumSpend) offerAnalytics { offerName campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode } boostButton { label style enabled } } disclaimer tagLabel { text style } productVarieties { totalCount label priceFamilyId } categories { name categoryLevel } isTobacco memberPriceInfo { header title subtitle } multiBuyPriceInfo { price unitPrice } cartProductInfo { totalPrice totalOriginalPrice totalDiscount } productCardAnalytics { __typename ...analyticsFields } productCardAction { action type id analytics { __typename ...analyticsFields } } pricingFootnoteMd @include(if: $includePricingFootnote) }  fragment compatibleColor on CompatibleColor { lightHexCode }  fragment iconFragment on IconAsset { __typename ... on HostedIcon { __typename url } ... on CoreIcon { __typename coreIconName } }  fragment coreTagUI on CoreTagUI { __typename label coreColorTheme { __typename background { __typename ...compatibleColor } foreground { __typename primary { __typename ...compatibleColor } secondary { __typename ...compatibleColor } highlight { __typename ...compatibleColor } } } hasBorder icon { __typename ...iconFragment } }  fragment productTile on ProductTile { productId productName roundelImage { url altText priority } mainProductImage { smallUrl mediumUrl largeUrl altText } productTags { __typename ...coreTagUI } priceInfo { leadPriceHeaderText leadPrice leadPriceMeasure unitPriceDescriptions { text altText } wasPrice { text altText } savePrice { text altText } variablePrice { text altText } priceClarificationMessage { text altText } } productStatuses { text { text altText } colorScheme } middleMessage { text altText } ratingsAndReviews { rating reviewsCount displayText { text altText } } footer { footerText footerIcon { coreIconName } isEnhanced footerAction { type action id } } list { minimum maximum increment defaultValue: default unit } trolleys { __typename ...productTrolley } adId rewardsOfferInfo { offerId } categories { name categoryLevel } source productCardAction { type action id } inStoreInfo { location { displayInfo { locationText locationType } details { x y z aisleSide location aisleNumber bayNumber bayNumberAlternate floorNumber } } availability { button { buttonId label style enabled action url buttonAction { type action id } iconUrl: altText } status infoSheet { title message button { buttonId label style enabled action url buttonAction { type action id } iconUrl altText } } } } marketplaceInfo { iconUrl description { altText text } } restrictionInfo { purchaseRestriction disclaimer isTobacco } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FetchNodeContentQuery)) {
            return false;
        }
        FetchNodeContentQuery fetchNodeContentQuery = (FetchNodeContentQuery) obj;
        return Intrinsics.c(this.f23401a, fetchNodeContentQuery.f23401a) && this.b.equals(fetchNodeContentQuery.b) && this.c.equals(fetchNodeContentQuery.c) && this.d.equals(fetchNodeContentQuery.d) && this.e.equals(fetchNodeContentQuery.e) && this.f.equals(fetchNodeContentQuery.f) && this.g == fetchNodeContentQuery.g && this.h == fetchNodeContentQuery.h && this.i.equals(fetchNodeContentQuery.i) && this.j == fetchNodeContentQuery.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.i, b.e(b.e(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.f, b.e(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.e, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.d, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.c, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.b, this.f23401a.hashCode() * 31, 31), 31), 31), 31), 31, true), 31), 31, this.g), 31, this.h), 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "93627ea27ca85be3062b146ee0dd6b7f5c327eb10c285435aa12d7c32e1bea4f";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "fetchNodeContent";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("nodeInput");
        Adapters.c(NodeInput_InputAdapter.f12088a, false).toJson(jsonWriter, customScalarAdapters, this.f23401a);
        Optional optional = this.b;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("storeId");
            Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        }
        Optional optional2 = this.c;
        if (optional2 instanceof Optional.Present) {
            jsonWriter.F1("shoppingMode");
            Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional2);
        }
        Optional optional3 = this.d;
        if (optional3 instanceof Optional.Present) {
            jsonWriter.F1("supportedLinks");
            Adapters.d(Adapters.b(Adapters.a(Adapters.i))).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional3);
        }
        Optional optional4 = this.e;
        if (optional4 instanceof Optional.Present) {
            jsonWriter.F1("supportedActions");
            Adapters.d(Adapters.b(Adapters.a(Adapters.i))).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional4);
        }
        jsonWriter.F1("includeOfferMinimumSpend");
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.TRUE);
        Optional optional5 = this.f;
        if (optional5 instanceof Optional.Present) {
            jsonWriter.F1("includeAvailabilityInfoStatus");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional5);
        } else if (z) {
            jsonWriter.F1("includeAvailabilityInfoStatus");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        jsonWriter.F1("includeProductAvailabilityStates");
        d.B(this.g, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "isProductTileUpliftEnabled");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.h));
        Optional optional6 = this.i;
        if (optional6 instanceof Optional.Present) {
            jsonWriter.F1("includePricingFootnote");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional6);
        } else if (z) {
            jsonWriter.F1("includePricingFootnote");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        jsonWriter.F1("includeLowestPrice14Days");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FetchNodeContentQuery(nodeInput=");
        sb.append(this.f23401a);
        sb.append(", storeId=");
        sb.append(this.b);
        sb.append(", shoppingMode=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sb, this.c, ", supportedLinks=", this.d, ", supportedActions=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sb, this.e, ", includeOfferMinimumSpend=true, includeAvailabilityInfoStatus=", this.f, ", includeProductAvailabilityStates=");
        a.D(sb, this.g, ", isProductTileUpliftEnabled=", this.h, ", includePricingFootnote=");
        sb.append(this.i);
        sb.append(", includeLowestPrice14Days=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }
}
