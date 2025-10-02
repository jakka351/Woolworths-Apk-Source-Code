package com.woolworths.shop.catalogue;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.ShoppingModeType;
import au.com.woolworths.shop.graphql.type.adapter.ShoppingModeType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.catalogue.adapter.CatalogueBrowseQuery_ResponseAdapter;
import com.woolworths.shop.catalogue.fragment.CatalogueBrowseCategoryPage;
import com.woolworths.shop.catalogue.fragment.CatalogueBrowsePromotionPage;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/woolworths/shop/catalogue/CatalogueBrowseQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/shop/catalogue/CatalogueBrowseQuery$Data;", "Data", "CatalogueBrowse", "Page", "OnCatalogueBrowseCategoryPage", "OnCatalogueBrowsePromotionPage", "Companion", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CatalogueBrowseQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f21645a;
    public final ShoppingModeType b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final Optional f;
    public final Optional g;
    public final Optional h;
    public final boolean i;
    public final Optional j;
    public final boolean k;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CatalogueBrowseQuery$CatalogueBrowse;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CatalogueBrowse {

        /* renamed from: a, reason: collision with root package name */
        public final int f21646a;
        public final ArrayList b;

        public CatalogueBrowse(int i, ArrayList arrayList) {
            this.f21646a = i;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CatalogueBrowse)) {
                return false;
            }
            CatalogueBrowse catalogueBrowse = (CatalogueBrowse) obj;
            return this.f21646a == catalogueBrowse.f21646a && this.b.equals(catalogueBrowse.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.f21646a) * 31);
        }

        public final String toString() {
            return "CatalogueBrowse(totalNumberOfPages=" + this.f21646a + ", pages=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/catalogue/CatalogueBrowseQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CatalogueBrowseQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final CatalogueBrowse f21647a;

        public Data(CatalogueBrowse catalogueBrowse) {
            this.f21647a = catalogueBrowse;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21647a, ((Data) obj).f21647a);
        }

        public final int hashCode() {
            CatalogueBrowse catalogueBrowse = this.f21647a;
            if (catalogueBrowse == null) {
                return 0;
            }
            return catalogueBrowse.hashCode();
        }

        public final String toString() {
            return "Data(catalogueBrowse=" + this.f21647a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CatalogueBrowseQuery$OnCatalogueBrowseCategoryPage;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCatalogueBrowseCategoryPage {

        /* renamed from: a, reason: collision with root package name */
        public final String f21648a;
        public final CatalogueBrowseCategoryPage b;

        public OnCatalogueBrowseCategoryPage(String str, CatalogueBrowseCategoryPage catalogueBrowseCategoryPage) {
            this.f21648a = str;
            this.b = catalogueBrowseCategoryPage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCatalogueBrowseCategoryPage)) {
                return false;
            }
            OnCatalogueBrowseCategoryPage onCatalogueBrowseCategoryPage = (OnCatalogueBrowseCategoryPage) obj;
            return Intrinsics.c(this.f21648a, onCatalogueBrowseCategoryPage.f21648a) && Intrinsics.c(this.b, onCatalogueBrowseCategoryPage.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21648a.hashCode() * 31);
        }

        public final String toString() {
            return "OnCatalogueBrowseCategoryPage(__typename=" + this.f21648a + ", catalogueBrowseCategoryPage=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CatalogueBrowseQuery$OnCatalogueBrowsePromotionPage;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCatalogueBrowsePromotionPage {

        /* renamed from: a, reason: collision with root package name */
        public final String f21649a;
        public final CatalogueBrowsePromotionPage b;

        public OnCatalogueBrowsePromotionPage(String str, CatalogueBrowsePromotionPage catalogueBrowsePromotionPage) {
            this.f21649a = str;
            this.b = catalogueBrowsePromotionPage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCatalogueBrowsePromotionPage)) {
                return false;
            }
            OnCatalogueBrowsePromotionPage onCatalogueBrowsePromotionPage = (OnCatalogueBrowsePromotionPage) obj;
            return Intrinsics.c(this.f21649a, onCatalogueBrowsePromotionPage.f21649a) && Intrinsics.c(this.b, onCatalogueBrowsePromotionPage.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21649a.hashCode() * 31);
        }

        public final String toString() {
            return "OnCatalogueBrowsePromotionPage(__typename=" + this.f21649a + ", catalogueBrowsePromotionPage=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CatalogueBrowseQuery$Page;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Page {

        /* renamed from: a, reason: collision with root package name */
        public final String f21650a;
        public final OnCatalogueBrowseCategoryPage b;
        public final OnCatalogueBrowsePromotionPage c;

        public Page(String __typename, OnCatalogueBrowseCategoryPage onCatalogueBrowseCategoryPage, OnCatalogueBrowsePromotionPage onCatalogueBrowsePromotionPage) {
            Intrinsics.h(__typename, "__typename");
            this.f21650a = __typename;
            this.b = onCatalogueBrowseCategoryPage;
            this.c = onCatalogueBrowsePromotionPage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Page)) {
                return false;
            }
            Page page = (Page) obj;
            return Intrinsics.c(this.f21650a, page.f21650a) && Intrinsics.c(this.b, page.b) && Intrinsics.c(this.c, page.c);
        }

        public final int hashCode() {
            int iHashCode = this.f21650a.hashCode() * 31;
            OnCatalogueBrowseCategoryPage onCatalogueBrowseCategoryPage = this.b;
            int iHashCode2 = (iHashCode + (onCatalogueBrowseCategoryPage == null ? 0 : onCatalogueBrowseCategoryPage.hashCode())) * 31;
            OnCatalogueBrowsePromotionPage onCatalogueBrowsePromotionPage = this.c;
            return iHashCode2 + (onCatalogueBrowsePromotionPage != null ? onCatalogueBrowsePromotionPage.hashCode() : 0);
        }

        public final String toString() {
            return "Page(__typename=" + this.f21650a + ", onCatalogueBrowseCategoryPage=" + this.b + ", onCatalogueBrowsePromotionPage=" + this.c + ")";
        }
    }

    public CatalogueBrowseQuery(Optional.Present present, ShoppingModeType shoppingModeType, Optional.Present present2, Optional.Present present3, Optional.Present present4, boolean z, boolean z2) {
        this.f21645a = present;
        this.b = shoppingModeType;
        this.c = present2;
        this.d = present3;
        this.e = present4;
        Optional.Absent absent = Optional.Absent.f13523a;
        this.f = absent;
        this.g = absent;
        this.h = absent;
        this.i = z;
        this.j = absent;
        this.k = z2;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(CatalogueBrowseQuery_ResponseAdapter.Data.f21700a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query CatalogueBrowse($storeId: String, $shoppingMode: ShoppingModeType!, $pageSize: Int, $pageNumber: Int, $catalogueId: String, $includeAvailabilityInfoStatus: Boolean! = false , $includeProductAvailabilityStates: Boolean! = false , $includeOfferMinimumSpend: Boolean! = false , $includePromotionPage: Boolean!, $includePricingFootnote: Boolean! = false , $includeLowestPrice14Days: Boolean!) { catalogueBrowse(storeId: $storeId, mode: $shoppingMode, pageSize: $pageSize, pageNumber: $pageNumber, catalogueId: $catalogueId) { totalNumberOfPages pages { __typename ... on CatalogueBrowseCategoryPage { __typename ...catalogueBrowseCategoryPage } ... on CatalogueBrowsePromotionPage @include(if: $includePromotionPage) { __typename ...catalogueBrowsePromotionPage } } } }  fragment productTrolley on ProductTrolley { minimum maximum increment defaultValue: default unit inTrolley buttonState buttonLabel buttonQuantity title }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment productCard on ProductCard { productId name isNew purchaseRestriction productImage isAvailable inStoreAvailabilityInfo @include(if: $includeProductAvailabilityStates) { button { label action style enabled } status @include(if: $includeAvailabilityInfoStatus) infoSheet { title message button { label action style enabled } } } price unitOfMeasureLabel badgeImage promotionInfo { type label } unitPriceDescription wasPrice purchaseWarning inlineLabels { type label priority } trolley { __typename ...productTrolley } trolleys { __typename ...productTrolley } list { minimum maximum increment defaultValue: default unit } inStoreDetails { locationText locationType } inStoreLocation { details { aisleNumber aisleSide bayNumber bayNumberAlternate floorNumber location x y z } displayInfo { locationText locationType } } adId source marketplace { imageUrl title sellerName brandName lowestMarketPriceDescription @include(if: $includeLowestPrice14Days) } rewardsOfferInfo { offerId offerStatus displayStatus displayExpiry minimumSpend @include(if: $includeOfferMinimumSpend) offerAnalytics { offerName campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode } boostButton { label style enabled } } disclaimer tagLabel { text style } productVarieties { totalCount label priceFamilyId } categories { name categoryLevel } isTobacco memberPriceInfo { header title subtitle } multiBuyPriceInfo { price unitPrice } cartProductInfo { totalPrice totalOriginalPrice totalDiscount } productCardAnalytics { __typename ...analyticsFields } productCardAction { action type id analytics { __typename ...analyticsFields } } pricingFootnoteMd @include(if: $includePricingFootnote) }  fragment catalogueButton on Button { label action style enabled }  fragment catalogueBrowseCategoryPage on CatalogueBrowseCategoryPage { id pageNumber backgroundUrl backgroundColor items { __typename ... on CatalogueBrowseCategoryPageHeader { title iconUrl } ... on ProductCard { __typename ...productCard } ... on CatalogueBrowseCategoryPageButton { button { __typename ...catalogueButton } } } }  fragment catalogueBrowsePromotionPage on CatalogueBrowsePromotionPage { id pageNumber backgroundUrl backgroundColor items { __typename ... on CatalogueBrowsePromotionPageHeader { title iconUrl } ... on ProductCard { __typename ...productCard } ... on CatalogueBrowsePromotionPageButton { button { __typename ...catalogueButton } } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogueBrowseQuery)) {
            return false;
        }
        CatalogueBrowseQuery catalogueBrowseQuery = (CatalogueBrowseQuery) obj;
        return Intrinsics.c(this.f21645a, catalogueBrowseQuery.f21645a) && this.b == catalogueBrowseQuery.b && Intrinsics.c(this.c, catalogueBrowseQuery.c) && Intrinsics.c(this.d, catalogueBrowseQuery.d) && Intrinsics.c(this.e, catalogueBrowseQuery.e) && Intrinsics.c(this.f, catalogueBrowseQuery.f) && Intrinsics.c(this.g, catalogueBrowseQuery.g) && Intrinsics.c(this.h, catalogueBrowseQuery.h) && this.i == catalogueBrowseQuery.i && Intrinsics.c(this.j, catalogueBrowseQuery.j) && this.k == catalogueBrowseQuery.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + a.c(this.j, b.e(a.c(this.h, a.c(this.g, a.c(this.f, a.c(this.e, a.c(this.d, a.c(this.c, (this.b.hashCode() + (this.f21645a.hashCode() * 31)) * 31, 31), 31), 31), 31), 31), 31), 31, this.i), 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "c953ae47f553860978fc8d28cfb8953c7e263da6372c6647fbfe22bcd068b52c";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "CatalogueBrowse";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Optional optional = this.f21645a;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("storeId");
            Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        }
        jsonWriter.F1("shoppingMode");
        ShoppingModeType_ResponseAdapter.b(jsonWriter, customScalarAdapters, this.b);
        Optional optional2 = this.c;
        if (optional2 instanceof Optional.Present) {
            jsonWriter.F1("pageSize");
            Adapters.d(Adapters.k).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional2);
        }
        Optional optional3 = this.d;
        if (optional3 instanceof Optional.Present) {
            jsonWriter.F1("pageNumber");
            Adapters.d(Adapters.k).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional3);
        }
        Optional optional4 = this.e;
        if (optional4 instanceof Optional.Present) {
            jsonWriter.F1("catalogueId");
            Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional4);
        }
        Optional optional5 = this.f;
        if (optional5 instanceof Optional.Present) {
            jsonWriter.F1("includeAvailabilityInfoStatus");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional5);
        } else if (z) {
            jsonWriter.F1("includeAvailabilityInfoStatus");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional6 = this.g;
        if (optional6 instanceof Optional.Present) {
            jsonWriter.F1("includeProductAvailabilityStates");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional6);
        } else if (z) {
            jsonWriter.F1("includeProductAvailabilityStates");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional7 = this.h;
        if (optional7 instanceof Optional.Present) {
            jsonWriter.F1("includeOfferMinimumSpend");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional7);
        } else if (z) {
            jsonWriter.F1("includeOfferMinimumSpend");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        jsonWriter.F1("includePromotionPage");
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.i));
        Optional optional8 = this.j;
        if (optional8 instanceof Optional.Present) {
            jsonWriter.F1("includePricingFootnote");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional8);
        } else if (z) {
            jsonWriter.F1("includePricingFootnote");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        jsonWriter.F1("includeLowestPrice14Days");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.k));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogueBrowseQuery(storeId=");
        sb.append(this.f21645a);
        sb.append(", shoppingMode=");
        sb.append(this.b);
        sb.append(", pageSize=");
        a.x(sb, this.c, ", pageNumber=", this.d, ", catalogueId=");
        a.x(sb, this.e, ", includeAvailabilityInfoStatus=", this.f, ", includeProductAvailabilityStates=");
        a.x(sb, this.g, ", includeOfferMinimumSpend=", this.h, ", includePromotionPage=");
        a.z(sb, this.i, ", includePricingFootnote=", this.j, ", includeLowestPrice14Days=");
        return YU.a.k(")", sb, this.k);
    }
}
