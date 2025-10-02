package com.woolworths.shop.catalogue;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.shop.graphql.type.ShoppingModeType;
import au.com.woolworths.shop.graphql.type.adapter.ShoppingModeType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.catalogue.adapter.CatalogueListingQuery_ResponseAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/woolworths/shop/catalogue/CatalogueListingQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/shop/catalogue/CatalogueListingQuery$Data;", "Data", "CatalogueListing", "Header", "Item", "OnProductCard", "Companion", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CatalogueListingQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f21671a;
    public final ShoppingModeType b;
    public final List c;
    public final Optional d;
    public final Optional e;
    public final Optional f;
    public final Optional g;
    public final Optional h;
    public final Optional i;
    public final Optional j;
    public final boolean k;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CatalogueListingQuery$CatalogueListing;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CatalogueListing {

        /* renamed from: a, reason: collision with root package name */
        public final Header f21672a;
        public final ArrayList b;

        public CatalogueListing(Header header, ArrayList arrayList) {
            this.f21672a = header;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CatalogueListing)) {
                return false;
            }
            CatalogueListing catalogueListing = (CatalogueListing) obj;
            return Intrinsics.c(this.f21672a, catalogueListing.f21672a) && this.b.equals(catalogueListing.b);
        }

        public final int hashCode() {
            Header header = this.f21672a;
            return this.b.hashCode() + ((header == null ? 0 : header.hashCode()) * 31);
        }

        public final String toString() {
            return "CatalogueListing(header=" + this.f21672a + ", items=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/catalogue/CatalogueListingQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CatalogueListingQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final CatalogueListing f21673a;

        public Data(CatalogueListing catalogueListing) {
            this.f21673a = catalogueListing;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21673a, ((Data) obj).f21673a);
        }

        public final int hashCode() {
            CatalogueListing catalogueListing = this.f21673a;
            if (catalogueListing == null) {
                return 0;
            }
            return catalogueListing.hashCode();
        }

        public final String toString() {
            return "Data(catalogueListing=" + this.f21673a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CatalogueListingQuery$Header;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Header {

        /* renamed from: a, reason: collision with root package name */
        public final String f21674a;
        public final String b;
        public final String c;

        public Header(String str, String str2, String str3) {
            this.f21674a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Header)) {
                return false;
            }
            Header header = (Header) obj;
            return Intrinsics.c(this.f21674a, header.f21674a) && Intrinsics.c(this.b, header.b) && Intrinsics.c(this.c, header.c);
        }

        public final int hashCode() {
            int iHashCode = this.f21674a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return a.o(a.v("Header(title=", this.f21674a, ", backgroundImageUrl=", this.b, ", backgroundColor="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CatalogueListingQuery$Item;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final String f21675a;
        public final OnProductCard b;

        public Item(String __typename, OnProductCard onProductCard) {
            Intrinsics.h(__typename, "__typename");
            this.f21675a = __typename;
            this.b = onProductCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.c(this.f21675a, item.f21675a) && Intrinsics.c(this.b, item.b);
        }

        public final int hashCode() {
            int iHashCode = this.f21675a.hashCode() * 31;
            OnProductCard onProductCard = this.b;
            return iHashCode + (onProductCard == null ? 0 : onProductCard.hashCode());
        }

        public final String toString() {
            return "Item(__typename=" + this.f21675a + ", onProductCard=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CatalogueListingQuery$OnProductCard;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f21676a;
        public final ProductCard b;

        public OnProductCard(String str, ProductCard productCard) {
            this.f21676a = str;
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
            return Intrinsics.c(this.f21676a, onProductCard.f21676a) && Intrinsics.c(this.b, onProductCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21676a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("OnProductCard(__typename=", this.f21676a, ", productCard=", this.b, ")");
        }
    }

    public CatalogueListingQuery(Optional.Present present, ShoppingModeType shoppingModeType, List list, Optional.Present present2, Optional.Present present3, boolean z) {
        this.f21671a = present;
        this.b = shoppingModeType;
        this.c = list;
        this.d = present2;
        this.e = present3;
        Optional.Absent absent = Optional.Absent.f13523a;
        this.f = absent;
        this.g = absent;
        this.h = absent;
        this.i = absent;
        this.j = absent;
        this.k = z;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(CatalogueListingQuery_ResponseAdapter.Data.f21723a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query CatalogueListing($storeId: String, $mode: ShoppingModeType!, $categoryIds: [String!]!, $pageSize: Int, $pageNumber: Int, $requestSource: String! = \"Catalogue My Specials\" , $includeAvailabilityInfoStatus: Boolean! = false , $includeProductAvailabilityStates: Boolean! = false , $includeOfferMinimumSpend: Boolean! = false , $includePricingFootnote: Boolean! = false , $includeLowestPrice14Days: Boolean!) { catalogueListing(storeId: $storeId, mode: $mode, categoryIds: $categoryIds, pageSize: $pageSize, pageNumber: $pageNumber, requestSource: $requestSource) { header { title backgroundImageUrl backgroundColor } items { __typename ... on ProductCard { __typename ...productCard } } } }  fragment productTrolley on ProductTrolley { minimum maximum increment defaultValue: default unit inTrolley buttonState buttonLabel buttonQuantity title }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment productCard on ProductCard { productId name isNew purchaseRestriction productImage isAvailable inStoreAvailabilityInfo @include(if: $includeProductAvailabilityStates) { button { label action style enabled } status @include(if: $includeAvailabilityInfoStatus) infoSheet { title message button { label action style enabled } } } price unitOfMeasureLabel badgeImage promotionInfo { type label } unitPriceDescription wasPrice purchaseWarning inlineLabels { type label priority } trolley { __typename ...productTrolley } trolleys { __typename ...productTrolley } list { minimum maximum increment defaultValue: default unit } inStoreDetails { locationText locationType } inStoreLocation { details { aisleNumber aisleSide bayNumber bayNumberAlternate floorNumber location x y z } displayInfo { locationText locationType } } adId source marketplace { imageUrl title sellerName brandName lowestMarketPriceDescription @include(if: $includeLowestPrice14Days) } rewardsOfferInfo { offerId offerStatus displayStatus displayExpiry minimumSpend @include(if: $includeOfferMinimumSpend) offerAnalytics { offerName campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode } boostButton { label style enabled } } disclaimer tagLabel { text style } productVarieties { totalCount label priceFamilyId } categories { name categoryLevel } isTobacco memberPriceInfo { header title subtitle } multiBuyPriceInfo { price unitPrice } cartProductInfo { totalPrice totalOriginalPrice totalDiscount } productCardAnalytics { __typename ...analyticsFields } productCardAction { action type id analytics { __typename ...analyticsFields } } pricingFootnoteMd @include(if: $includePricingFootnote) }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogueListingQuery)) {
            return false;
        }
        CatalogueListingQuery catalogueListingQuery = (CatalogueListingQuery) obj;
        return Intrinsics.c(this.f21671a, catalogueListingQuery.f21671a) && this.b == catalogueListingQuery.b && Intrinsics.c(this.c, catalogueListingQuery.c) && Intrinsics.c(this.d, catalogueListingQuery.d) && Intrinsics.c(this.e, catalogueListingQuery.e) && Intrinsics.c(this.f, catalogueListingQuery.f) && Intrinsics.c(this.g, catalogueListingQuery.g) && Intrinsics.c(this.h, catalogueListingQuery.h) && Intrinsics.c(this.i, catalogueListingQuery.i) && Intrinsics.c(this.j, catalogueListingQuery.j) && this.k == catalogueListingQuery.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.j, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.i, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.h, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.g, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.f, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.e, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.d, b.d((this.b.hashCode() + (this.f21671a.hashCode() * 31)) * 31, 31, this.c), 31), 31), 31), 31), 31), 31), 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "cb234e324a3441da72330ed888d673754ad3261db9f6d818d5d210d3248f7791";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "CatalogueListing";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Optional optional = this.f21671a;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("storeId");
            Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        }
        jsonWriter.F1("mode");
        ShoppingModeType_ResponseAdapter.b(jsonWriter, customScalarAdapters, this.b);
        jsonWriter.F1("categoryIds");
        Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
        Adapters.a(adapters$StringAdapter$1).toJson(jsonWriter, customScalarAdapters, this.c);
        Optional optional2 = this.d;
        if (optional2 instanceof Optional.Present) {
            jsonWriter.F1("pageSize");
            Adapters.d(Adapters.k).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional2);
        }
        Optional optional3 = this.e;
        if (optional3 instanceof Optional.Present) {
            jsonWriter.F1("pageNumber");
            Adapters.d(Adapters.k).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional3);
        }
        Optional optional4 = this.f;
        if (optional4 instanceof Optional.Present) {
            jsonWriter.F1("requestSource");
            Adapters.d(adapters$StringAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional4);
        } else if (z) {
            jsonWriter.F1("requestSource");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, "Catalogue My Specials");
        }
        Optional optional5 = this.g;
        if (optional5 instanceof Optional.Present) {
            jsonWriter.F1("includeAvailabilityInfoStatus");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional5);
        } else if (z) {
            jsonWriter.F1("includeAvailabilityInfoStatus");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional6 = this.h;
        if (optional6 instanceof Optional.Present) {
            jsonWriter.F1("includeProductAvailabilityStates");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional6);
        } else if (z) {
            jsonWriter.F1("includeProductAvailabilityStates");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional7 = this.i;
        if (optional7 instanceof Optional.Present) {
            jsonWriter.F1("includeOfferMinimumSpend");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional7);
        } else if (z) {
            jsonWriter.F1("includeOfferMinimumSpend");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional8 = this.j;
        if (optional8 instanceof Optional.Present) {
            jsonWriter.F1("includePricingFootnote");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional8);
        } else if (z) {
            jsonWriter.F1("includePricingFootnote");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        jsonWriter.F1("includeLowestPrice14Days");
        Adapters.f.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.k));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogueListingQuery(storeId=");
        sb.append(this.f21671a);
        sb.append(", mode=");
        sb.append(this.b);
        sb.append(", categoryIds=");
        sb.append(this.c);
        sb.append(", pageSize=");
        sb.append(this.d);
        sb.append(", pageNumber=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sb, this.e, ", requestSource=", this.f, ", includeAvailabilityInfoStatus=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sb, this.g, ", includeProductAvailabilityStates=", this.h, ", includeOfferMinimumSpend=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sb, this.i, ", includePricingFootnote=", this.j, ", includeLowestPrice14Days=");
        return a.k(")", sb, this.k);
    }
}
