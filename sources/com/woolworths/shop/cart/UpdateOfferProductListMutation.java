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
import au.com.woolworths.shop.graphql.type.adapter.UpdateOfferProductQuantityUpdate_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.cart.adapter.UpdateOfferProductListMutation_ResponseAdapter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/woolworths/shop/cart/UpdateOfferProductListMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/shop/cart/UpdateOfferProductListMutation$Data;", "Data", "UpdateOfferProductList", "OnOfferProductListResponseSuccess", "Progress", "OfferProduct", "ImpressionAnalytics", "OnOfferProductListResponseFailure", "Companion", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class UpdateOfferProductListMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f21566a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final Optional f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/cart/UpdateOfferProductListMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/UpdateOfferProductListMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final UpdateOfferProductList f21567a;

        public Data(UpdateOfferProductList updateOfferProductList) {
            this.f21567a = updateOfferProductList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21567a, ((Data) obj).f21567a);
        }

        public final int hashCode() {
            return this.f21567a.hashCode();
        }

        public final String toString() {
            return "Data(updateOfferProductList=" + this.f21567a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/UpdateOfferProductListMutation$ImpressionAnalytics;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImpressionAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f21568a;
        public final AnalyticsFields b;

        public ImpressionAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f21568a = str;
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
            return Intrinsics.c(this.f21568a, impressionAnalytics.f21568a) && Intrinsics.c(this.b, impressionAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21568a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ImpressionAnalytics(__typename=", this.f21568a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/UpdateOfferProductListMutation$OfferProduct;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OfferProduct {

        /* renamed from: a, reason: collision with root package name */
        public final String f21569a;
        public final ProductCard b;

        public OfferProduct(String str, ProductCard productCard) {
            this.f21569a = str;
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
            return Intrinsics.c(this.f21569a, offerProduct.f21569a) && Intrinsics.c(this.b, offerProduct.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21569a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("OfferProduct(__typename=", this.f21569a, ", productCard=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/UpdateOfferProductListMutation$OnOfferProductListResponseFailure;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnOfferProductListResponseFailure {

        /* renamed from: a, reason: collision with root package name */
        public final String f21570a;

        public OnOfferProductListResponseFailure(String str) {
            this.f21570a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnOfferProductListResponseFailure) && Intrinsics.c(this.f21570a, ((OnOfferProductListResponseFailure) obj).f21570a);
        }

        public final int hashCode() {
            return this.f21570a.hashCode();
        }

        public final String toString() {
            return a.h("OnOfferProductListResponseFailure(errorDescription=", this.f21570a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/UpdateOfferProductListMutation$OnOfferProductListResponseSuccess;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnOfferProductListResponseSuccess {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f21571a;
        public final String b;
        public final String c;
        public final String d;
        public final Progress e;
        public final OfferType f;
        public final ArrayList g;
        public final ImpressionAnalytics h;

        public OnOfferProductListResponseSuccess(boolean z, String str, String str2, String str3, Progress progress, OfferType offerType, ArrayList arrayList, ImpressionAnalytics impressionAnalytics) {
            this.f21571a = z;
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
            return this.f21571a == onOfferProductListResponseSuccess.f21571a && this.b.equals(onOfferProductListResponseSuccess.b) && this.c.equals(onOfferProductListResponseSuccess.c) && this.d.equals(onOfferProductListResponseSuccess.d) && this.e.equals(onOfferProductListResponseSuccess.e) && this.f == onOfferProductListResponseSuccess.f && this.g.equals(onOfferProductListResponseSuccess.g) && this.h.equals(onOfferProductListResponseSuccess.h);
        }

        public final int hashCode() {
            return this.h.hashCode() + androidx.compose.ui.input.pointer.a.b((this.f.hashCode() + ((this.e.hashCode() + b.c(b.c(b.c(Boolean.hashCode(this.f21571a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31, 31, this.g);
        }

        public final String toString() {
            StringBuilder sbT = au.com.woolworths.android.onesite.a.t("OnOfferProductListResponseSuccess(isApplied=", ", badgeImage=", this.b, ", title=", this.f21571a);
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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/UpdateOfferProductListMutation$Progress;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Progress {

        /* renamed from: a, reason: collision with root package name */
        public final String f21572a;
        public final int b;
        public final ProgressStepType c;
        public final int d;
        public final TooltipType e;

        public Progress(String str, int i, ProgressStepType progressStepType, int i2, TooltipType tooltipType) {
            this.f21572a = str;
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
            return Intrinsics.c(this.f21572a, progress.f21572a) && this.b == progress.b && this.c == progress.c && this.d == progress.d && this.e == progress.e;
        }

        public final int hashCode() {
            int iA = b.a(this.d, (this.c.hashCode() + b.a(this.b, this.f21572a.hashCode() * 31, 31)) * 31, 31);
            TooltipType tooltipType = this.e;
            return iA + (tooltipType == null ? 0 : tooltipType.hashCode());
        }

        public final String toString() {
            StringBuilder sbU = b.u("Progress(currentStep=", this.b, this.f21572a, ", currentStepPosition=", ", currentStepType=");
            sbU.append(this.c);
            sbU.append(", totalSteps=");
            sbU.append(this.d);
            sbU.append(", imageName=");
            sbU.append(this.e);
            sbU.append(")");
            return sbU.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/UpdateOfferProductListMutation$UpdateOfferProductList;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdateOfferProductList {

        /* renamed from: a, reason: collision with root package name */
        public final String f21573a;
        public final OnOfferProductListResponseSuccess b;
        public final OnOfferProductListResponseFailure c;

        public UpdateOfferProductList(String __typename, OnOfferProductListResponseSuccess onOfferProductListResponseSuccess, OnOfferProductListResponseFailure onOfferProductListResponseFailure) {
            Intrinsics.h(__typename, "__typename");
            this.f21573a = __typename;
            this.b = onOfferProductListResponseSuccess;
            this.c = onOfferProductListResponseFailure;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateOfferProductList)) {
                return false;
            }
            UpdateOfferProductList updateOfferProductList = (UpdateOfferProductList) obj;
            return Intrinsics.c(this.f21573a, updateOfferProductList.f21573a) && Intrinsics.c(this.b, updateOfferProductList.b) && Intrinsics.c(this.c, updateOfferProductList.c);
        }

        public final int hashCode() {
            int iHashCode = this.f21573a.hashCode() * 31;
            OnOfferProductListResponseSuccess onOfferProductListResponseSuccess = this.b;
            int iHashCode2 = (iHashCode + (onOfferProductListResponseSuccess == null ? 0 : onOfferProductListResponseSuccess.hashCode())) * 31;
            OnOfferProductListResponseFailure onOfferProductListResponseFailure = this.c;
            return iHashCode2 + (onOfferProductListResponseFailure != null ? onOfferProductListResponseFailure.f21570a.hashCode() : 0);
        }

        public final String toString() {
            return "UpdateOfferProductList(__typename=" + this.f21573a + ", onOfferProductListResponseSuccess=" + this.b + ", onOfferProductListResponseFailure=" + this.c + ")";
        }
    }

    public UpdateOfferProductListMutation(ArrayList arrayList) {
        this.f21566a = arrayList;
        Optional.Absent absent = Optional.Absent.f13523a;
        this.b = absent;
        this.c = absent;
        this.d = absent;
        this.e = absent;
        this.f = absent;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(UpdateOfferProductListMutation_ResponseAdapter.Data.f21621a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation UpdateOfferProductList($input: [UpdateOfferProductQuantityUpdate!]!, $includeAvailabilityInfoStatus: Boolean! = false , $includeProductAvailabilityStates: Boolean! = false , $includeLowestPrice14Days: Boolean! = false , $includeOfferMinimumSpend: Boolean! = false , $includePricingFootnote: Boolean! = false ) { updateOfferProductList(input: $input) { __typename ... on OfferProductListResponseSuccess { isApplied badgeImage title subtitle progress { currentStep currentStepPosition currentStepType totalSteps imageName } offerType offerProducts { __typename ...productCard } impressionAnalytics { __typename ...analyticsFields } } ... on OfferProductListResponseFailure { errorDescription } } }  fragment productTrolley on ProductTrolley { minimum maximum increment defaultValue: default unit inTrolley buttonState buttonLabel buttonQuantity title }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment productCard on ProductCard { productId name isNew purchaseRestriction productImage isAvailable inStoreAvailabilityInfo @include(if: $includeProductAvailabilityStates) { button { label action style enabled } status @include(if: $includeAvailabilityInfoStatus) infoSheet { title message button { label action style enabled } } } price unitOfMeasureLabel badgeImage promotionInfo { type label } unitPriceDescription wasPrice purchaseWarning inlineLabels { type label priority } trolley { __typename ...productTrolley } trolleys { __typename ...productTrolley } list { minimum maximum increment defaultValue: default unit } inStoreDetails { locationText locationType } inStoreLocation { details { aisleNumber aisleSide bayNumber bayNumberAlternate floorNumber location x y z } displayInfo { locationText locationType } } adId source marketplace { imageUrl title sellerName brandName lowestMarketPriceDescription @include(if: $includeLowestPrice14Days) } rewardsOfferInfo { offerId offerStatus displayStatus displayExpiry minimumSpend @include(if: $includeOfferMinimumSpend) offerAnalytics { offerName campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode } boostButton { label style enabled } } disclaimer tagLabel { text style } productVarieties { totalCount label priceFamilyId } categories { name categoryLevel } isTobacco memberPriceInfo { header title subtitle } multiBuyPriceInfo { price unitPrice } cartProductInfo { totalPrice totalOriginalPrice totalDiscount } productCardAnalytics { __typename ...analyticsFields } productCardAction { action type id analytics { __typename ...analyticsFields } } pricingFootnoteMd @include(if: $includePricingFootnote) }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateOfferProductListMutation)) {
            return false;
        }
        UpdateOfferProductListMutation updateOfferProductListMutation = (UpdateOfferProductListMutation) obj;
        return this.f21566a.equals(updateOfferProductListMutation.f21566a) && this.b.equals(updateOfferProductListMutation.b) && this.c.equals(updateOfferProductListMutation.c) && this.d.equals(updateOfferProductListMutation.d) && this.e.equals(updateOfferProductListMutation.e) && this.f.equals(updateOfferProductListMutation.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.e, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.d, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.c, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.b, this.f21566a.hashCode() * 31, 31), 31), 31), 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "9f928c662e84d0831ed43f5754055943a28329abd7036826a37c0d5124b66f0f";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "UpdateOfferProductList";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("input");
        Adapters.a(Adapters.c(UpdateOfferProductQuantityUpdate_InputAdapter.f12137a, false)).toJson(jsonWriter, customScalarAdapters, this.f21566a);
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
        StringBuilder sb = new StringBuilder("UpdateOfferProductListMutation(input=");
        sb.append(this.f21566a);
        sb.append(", includeAvailabilityInfoStatus=");
        sb.append(this.b);
        sb.append(", includeProductAvailabilityStates=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sb, this.c, ", includeLowestPrice14Days=", this.d, ", includeOfferMinimumSpend=");
        sb.append(this.e);
        sb.append(", includePricingFootnote=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
