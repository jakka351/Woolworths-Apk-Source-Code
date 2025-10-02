package com.woolworths.shop.cart;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.graphql.type.OfferType;
import au.com.woolworths.shop.graphql.type.ProgressStepType;
import au.com.woolworths.shop.graphql.type.TooltipType;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.cart.adapter.GetOfferProductListQuery_ResponseAdapter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/woolworths/shop/cart/GetOfferProductListQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/shop/cart/GetOfferProductListQuery$Data;", "Data", "GetOfferProductList", "OnOfferProductListResponseSuccess", "Progress", "OfferProduct", "ImpressionAnalytics", "OnOfferProductListResponseFailure", "Companion", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class GetOfferProductListQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f21530a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final Optional f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/cart/GetOfferProductListQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/GetOfferProductListQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final GetOfferProductList f21531a;

        public Data(GetOfferProductList getOfferProductList) {
            this.f21531a = getOfferProductList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21531a, ((Data) obj).f21531a);
        }

        public final int hashCode() {
            return this.f21531a.hashCode();
        }

        public final String toString() {
            return "Data(getOfferProductList=" + this.f21531a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/GetOfferProductListQuery$GetOfferProductList;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class GetOfferProductList {

        /* renamed from: a, reason: collision with root package name */
        public final String f21532a;
        public final OnOfferProductListResponseSuccess b;
        public final OnOfferProductListResponseFailure c;

        public GetOfferProductList(String __typename, OnOfferProductListResponseSuccess onOfferProductListResponseSuccess, OnOfferProductListResponseFailure onOfferProductListResponseFailure) {
            Intrinsics.h(__typename, "__typename");
            this.f21532a = __typename;
            this.b = onOfferProductListResponseSuccess;
            this.c = onOfferProductListResponseFailure;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GetOfferProductList)) {
                return false;
            }
            GetOfferProductList getOfferProductList = (GetOfferProductList) obj;
            return Intrinsics.c(this.f21532a, getOfferProductList.f21532a) && Intrinsics.c(this.b, getOfferProductList.b) && Intrinsics.c(this.c, getOfferProductList.c);
        }

        public final int hashCode() {
            int iHashCode = this.f21532a.hashCode() * 31;
            OnOfferProductListResponseSuccess onOfferProductListResponseSuccess = this.b;
            int iHashCode2 = (iHashCode + (onOfferProductListResponseSuccess == null ? 0 : onOfferProductListResponseSuccess.hashCode())) * 31;
            OnOfferProductListResponseFailure onOfferProductListResponseFailure = this.c;
            return iHashCode2 + (onOfferProductListResponseFailure != null ? onOfferProductListResponseFailure.f21535a.hashCode() : 0);
        }

        public final String toString() {
            return "GetOfferProductList(__typename=" + this.f21532a + ", onOfferProductListResponseSuccess=" + this.b + ", onOfferProductListResponseFailure=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/GetOfferProductListQuery$ImpressionAnalytics;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImpressionAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f21533a;
        public final AnalyticsFields b;

        public ImpressionAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f21533a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImpressionAnalytics)) {
                return false;
            }
            ImpressionAnalytics impressionAnalytics = (ImpressionAnalytics) obj;
            return Intrinsics.c(this.f21533a, impressionAnalytics.f21533a) && Intrinsics.c(this.b, impressionAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21533a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ImpressionAnalytics(__typename=", this.f21533a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/GetOfferProductListQuery$OfferProduct;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OfferProduct {

        /* renamed from: a, reason: collision with root package name */
        public final String f21534a;
        public final ProductCard b;

        public OfferProduct(String str, ProductCard productCard) {
            this.f21534a = str;
            this.b = productCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfferProduct)) {
                return false;
            }
            OfferProduct offerProduct = (OfferProduct) obj;
            return Intrinsics.c(this.f21534a, offerProduct.f21534a) && Intrinsics.c(this.b, offerProduct.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21534a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("OfferProduct(__typename=", this.f21534a, ", productCard=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/GetOfferProductListQuery$OnOfferProductListResponseFailure;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnOfferProductListResponseFailure {

        /* renamed from: a, reason: collision with root package name */
        public final String f21535a;

        public OnOfferProductListResponseFailure(String str) {
            this.f21535a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnOfferProductListResponseFailure) && Intrinsics.c(this.f21535a, ((OnOfferProductListResponseFailure) obj).f21535a);
        }

        public final int hashCode() {
            return this.f21535a.hashCode();
        }

        public final String toString() {
            return a.h("OnOfferProductListResponseFailure(errorDescription=", this.f21535a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/GetOfferProductListQuery$OnOfferProductListResponseSuccess;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnOfferProductListResponseSuccess {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f21536a;
        public final String b;
        public final String c;
        public final String d;
        public final Progress e;
        public final OfferType f;
        public final ArrayList g;
        public final ImpressionAnalytics h;

        public OnOfferProductListResponseSuccess(boolean z, String str, String str2, String str3, Progress progress, OfferType offerType, ArrayList arrayList, ImpressionAnalytics impressionAnalytics) {
            this.f21536a = z;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = progress;
            this.f = offerType;
            this.g = arrayList;
            this.h = impressionAnalytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnOfferProductListResponseSuccess)) {
                return false;
            }
            OnOfferProductListResponseSuccess onOfferProductListResponseSuccess = (OnOfferProductListResponseSuccess) obj;
            return this.f21536a == onOfferProductListResponseSuccess.f21536a && this.b.equals(onOfferProductListResponseSuccess.b) && this.c.equals(onOfferProductListResponseSuccess.c) && this.d.equals(onOfferProductListResponseSuccess.d) && this.e.equals(onOfferProductListResponseSuccess.e) && this.f == onOfferProductListResponseSuccess.f && this.g.equals(onOfferProductListResponseSuccess.g) && this.h.equals(onOfferProductListResponseSuccess.h);
        }

        public final int hashCode() {
            return this.h.hashCode() + androidx.compose.ui.input.pointer.a.b((this.f.hashCode() + ((this.e.hashCode() + b.c(b.c(b.c(Boolean.hashCode(this.f21536a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31, 31, this.g);
        }

        public final String toString() {
            StringBuilder sbT = au.com.woolworths.android.onesite.a.t("OnOfferProductListResponseSuccess(isApplied=", ", badgeImage=", this.b, ", title=", this.f21536a);
            androidx.constraintlayout.core.state.a.B(sbT, this.c, ", subtitle=", this.d, ", progress=");
            sbT.append(this.e);
            sbT.append(", offerType=");
            sbT.append(this.f);
            sbT.append(", offerProducts=");
            sbT.append(this.g);
            sbT.append(", impressionAnalytics=");
            sbT.append(this.h);
            sbT.append(")");
            return sbT.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/GetOfferProductListQuery$Progress;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Progress {

        /* renamed from: a, reason: collision with root package name */
        public final String f21537a;
        public final int b;
        public final ProgressStepType c;
        public final int d;
        public final TooltipType e;

        public Progress(String str, int i, ProgressStepType progressStepType, int i2, TooltipType tooltipType) {
            this.f21537a = str;
            this.b = i;
            this.c = progressStepType;
            this.d = i2;
            this.e = tooltipType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Progress)) {
                return false;
            }
            Progress progress = (Progress) obj;
            return Intrinsics.c(this.f21537a, progress.f21537a) && this.b == progress.b && this.c == progress.c && this.d == progress.d && this.e == progress.e;
        }

        public final int hashCode() {
            int iA = b.a(this.d, (this.c.hashCode() + b.a(this.b, this.f21537a.hashCode() * 31, 31)) * 31, 31);
            TooltipType tooltipType = this.e;
            return iA + (tooltipType == null ? 0 : tooltipType.hashCode());
        }

        public final String toString() {
            StringBuilder sbU = b.u("Progress(currentStep=", this.b, this.f21537a, ", currentStepPosition=", ", currentStepType=");
            sbU.append(this.c);
            sbU.append(", totalSteps=");
            sbU.append(this.d);
            sbU.append(", imageName=");
            sbU.append(this.e);
            sbU.append(")");
            return sbU.toString();
        }
    }

    public GetOfferProductListQuery(String offerId) {
        Intrinsics.h(offerId, "offerId");
        this.f21530a = offerId;
        Optional.Absent absent = Optional.Absent.f13523a;
        this.b = absent;
        this.c = absent;
        this.d = absent;
        this.e = absent;
        this.f = absent;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(GetOfferProductListQuery_ResponseAdapter.Data.f21590a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query GetOfferProductList($offerId: String!, $includeAvailabilityInfoStatus: Boolean! = false , $includeProductAvailabilityStates: Boolean! = false , $includeLowestPrice14Days: Boolean! = false , $includeOfferMinimumSpend: Boolean! = false , $includePricingFootnote: Boolean! = false ) { getOfferProductList(offerId: $offerId) { __typename ... on OfferProductListResponseSuccess { isApplied badgeImage title subtitle progress { currentStep currentStepPosition currentStepType totalSteps imageName } offerType offerProducts { __typename ...productCard } impressionAnalytics { __typename ...analyticsFields } } ... on OfferProductListResponseFailure { errorDescription } } }  fragment productTrolley on ProductTrolley { minimum maximum increment defaultValue: default unit inTrolley buttonState buttonLabel buttonQuantity title }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment productCard on ProductCard { productId name isNew purchaseRestriction productImage isAvailable inStoreAvailabilityInfo @include(if: $includeProductAvailabilityStates) { button { label action style enabled } status @include(if: $includeAvailabilityInfoStatus) infoSheet { title message button { label action style enabled } } } price unitOfMeasureLabel badgeImage promotionInfo { type label } unitPriceDescription wasPrice purchaseWarning inlineLabels { type label priority } trolley { __typename ...productTrolley } trolleys { __typename ...productTrolley } list { minimum maximum increment defaultValue: default unit } inStoreDetails { locationText locationType } inStoreLocation { details { aisleNumber aisleSide bayNumber bayNumberAlternate floorNumber location x y z } displayInfo { locationText locationType } } adId source marketplace { imageUrl title sellerName brandName lowestMarketPriceDescription @include(if: $includeLowestPrice14Days) } rewardsOfferInfo { offerId offerStatus displayStatus displayExpiry minimumSpend @include(if: $includeOfferMinimumSpend) offerAnalytics { offerName campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode } boostButton { label style enabled } } disclaimer tagLabel { text style } productVarieties { totalCount label priceFamilyId } categories { name categoryLevel } isTobacco memberPriceInfo { header title subtitle } multiBuyPriceInfo { price unitPrice } cartProductInfo { totalPrice totalOriginalPrice totalDiscount } productCardAnalytics { __typename ...analyticsFields } productCardAction { action type id analytics { __typename ...analyticsFields } } pricingFootnoteMd @include(if: $includePricingFootnote) }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetOfferProductListQuery)) {
            return false;
        }
        GetOfferProductListQuery getOfferProductListQuery = (GetOfferProductListQuery) obj;
        return Intrinsics.c(this.f21530a, getOfferProductListQuery.f21530a) && Intrinsics.c(this.b, getOfferProductListQuery.b) && Intrinsics.c(this.c, getOfferProductListQuery.c) && Intrinsics.c(this.d, getOfferProductListQuery.d) && Intrinsics.c(this.e, getOfferProductListQuery.e) && Intrinsics.c(this.f, getOfferProductListQuery.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.e, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.d, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.c, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.b, this.f21530a.hashCode() * 31, 31), 31), 31), 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "f54223a643428cfba2ce2451a5f6d2a8affc5a1446048d39fbe850fbf4b33afa";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "GetOfferProductList";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("offerId");
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, this.f21530a);
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
            jsonWriter.F1("includeLowestPrice14Days");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional3);
        } else if (z) {
            jsonWriter.F1("includeLowestPrice14Days");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional4 = this.e;
        if (optional4 instanceof Optional.Present) {
            jsonWriter.F1("includeOfferMinimumSpend");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional4);
        } else if (z) {
            jsonWriter.F1("includeOfferMinimumSpend");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional5 = this.f;
        if (optional5 instanceof Optional.Present) {
            jsonWriter.F1("includePricingFootnote");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional5);
        } else if (z) {
            jsonWriter.F1("includePricingFootnote");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
    }

    public final String toString() {
        StringBuilder sbR = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.r("GetOfferProductListQuery(offerId=", this.f21530a, ", includeAvailabilityInfoStatus=", this.b, ", includeProductAvailabilityStates=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sbR, this.c, ", includeLowestPrice14Days=", this.d, ", includeOfferMinimumSpend=");
        sbR.append(this.e);
        sbR.append(", includePricingFootnote=");
        sbR.append(this.f);
        sbR.append(")");
        return sbR.toString();
    }
}
