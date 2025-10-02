package au.com.woolworths.shop.graphql;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.shop.graphql.adapter.ProductsByHaveYouForgottenQuery_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/shop/graphql/ProductsByHaveYouForgottenQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/shop/graphql/ProductsByHaveYouForgottenQuery$Data;", "Data", "ProductsByHaveYouForgotten", "ProductsFeed", "OnProductCard", "Companion", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductsByHaveYouForgottenQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f10941a = Optional.Absent.f13523a;
    public final Optional b;
    public final boolean c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/graphql/ProductsByHaveYouForgottenQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/ProductsByHaveYouForgottenQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final ProductsByHaveYouForgotten f10942a;

        public Data(ProductsByHaveYouForgotten productsByHaveYouForgotten) {
            this.f10942a = productsByHaveYouForgotten;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f10942a, ((Data) obj).f10942a);
        }

        public final int hashCode() {
            ProductsByHaveYouForgotten productsByHaveYouForgotten = this.f10942a;
            if (productsByHaveYouForgotten == null) {
                return 0;
            }
            return productsByHaveYouForgotten.hashCode();
        }

        public final String toString() {
            return "Data(productsByHaveYouForgotten=" + this.f10942a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/ProductsByHaveYouForgottenQuery$OnProductCard;", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f10943a;
        public final ProductCard b;

        public OnProductCard(String str, ProductCard productCard) {
            this.f10943a = str;
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
            return Intrinsics.c(this.f10943a, onProductCard.f10943a) && Intrinsics.c(this.b, onProductCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10943a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("OnProductCard(__typename=", this.f10943a, ", productCard=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/ProductsByHaveYouForgottenQuery$ProductsByHaveYouForgotten;", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductsByHaveYouForgotten {

        /* renamed from: a, reason: collision with root package name */
        public final Integer f10944a;
        public final ArrayList b;

        public ProductsByHaveYouForgotten(Integer num, ArrayList arrayList) {
            this.f10944a = num;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductsByHaveYouForgotten)) {
                return false;
            }
            ProductsByHaveYouForgotten productsByHaveYouForgotten = (ProductsByHaveYouForgotten) obj;
            return Intrinsics.c(this.f10944a, productsByHaveYouForgotten.f10944a) && this.b.equals(productsByHaveYouForgotten.b);
        }

        public final int hashCode() {
            Integer num = this.f10944a;
            return this.b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
        }

        public final String toString() {
            return "ProductsByHaveYouForgotten(totalNumberOfProducts=" + this.f10944a + ", productsFeed=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/ProductsByHaveYouForgottenQuery$ProductsFeed;", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductsFeed {

        /* renamed from: a, reason: collision with root package name */
        public final String f10945a;
        public final OnProductCard b;

        public ProductsFeed(String __typename, OnProductCard onProductCard) {
            Intrinsics.h(__typename, "__typename");
            this.f10945a = __typename;
            this.b = onProductCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductsFeed)) {
                return false;
            }
            ProductsFeed productsFeed = (ProductsFeed) obj;
            return Intrinsics.c(this.f10945a, productsFeed.f10945a) && Intrinsics.c(this.b, productsFeed.b);
        }

        public final int hashCode() {
            int iHashCode = this.f10945a.hashCode() * 31;
            OnProductCard onProductCard = this.b;
            return iHashCode + (onProductCard == null ? 0 : onProductCard.hashCode());
        }

        public final String toString() {
            return "ProductsFeed(__typename=" + this.f10945a + ", onProductCard=" + this.b + ")";
        }
    }

    public ProductsByHaveYouForgottenQuery(Optional optional, boolean z) {
        this.b = optional;
        this.c = z;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(ProductsByHaveYouForgottenQuery_ResponseAdapter.Data.f10975a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query productsByHaveYouForgotten($includeProductAvailabilityStates: Boolean!, $includeOfferMinimumSpend: Boolean!, $includeAvailabilityInfoStatus: Boolean! = false , $includePricingFootnote: Boolean! = false , $includeLowestPrice14Days: Boolean!) { productsByHaveYouForgotten { totalNumberOfProducts productsFeed { __typename ... on ProductCard { __typename ...productCard } } } }  fragment productTrolley on ProductTrolley { minimum maximum increment defaultValue: default unit inTrolley buttonState buttonLabel buttonQuantity title }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment productCard on ProductCard { productId name isNew purchaseRestriction productImage isAvailable inStoreAvailabilityInfo @include(if: $includeProductAvailabilityStates) { button { label action style enabled } status @include(if: $includeAvailabilityInfoStatus) infoSheet { title message button { label action style enabled } } } price unitOfMeasureLabel badgeImage promotionInfo { type label } unitPriceDescription wasPrice purchaseWarning inlineLabels { type label priority } trolley { __typename ...productTrolley } trolleys { __typename ...productTrolley } list { minimum maximum increment defaultValue: default unit } inStoreDetails { locationText locationType } inStoreLocation { details { aisleNumber aisleSide bayNumber bayNumberAlternate floorNumber location x y z } displayInfo { locationText locationType } } adId source marketplace { imageUrl title sellerName brandName lowestMarketPriceDescription @include(if: $includeLowestPrice14Days) } rewardsOfferInfo { offerId offerStatus displayStatus displayExpiry minimumSpend @include(if: $includeOfferMinimumSpend) offerAnalytics { offerName campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode } boostButton { label style enabled } } disclaimer tagLabel { text style } productVarieties { totalCount label priceFamilyId } categories { name categoryLevel } isTobacco memberPriceInfo { header title subtitle } multiBuyPriceInfo { price unitPrice } cartProductInfo { totalPrice totalOriginalPrice totalDiscount } productCardAnalytics { __typename ...analyticsFields } productCardAction { action type id analytics { __typename ...analyticsFields } } pricingFootnoteMd @include(if: $includePricingFootnote) }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductsByHaveYouForgottenQuery)) {
            return false;
        }
        ProductsByHaveYouForgottenQuery productsByHaveYouForgottenQuery = (ProductsByHaveYouForgottenQuery) obj;
        return this.f10941a.equals(productsByHaveYouForgottenQuery.f10941a) && this.b.equals(productsByHaveYouForgottenQuery.b) && this.c == productsByHaveYouForgottenQuery.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + a.c(this.b, a.c(this.f10941a, b.e(Boolean.hashCode(false) * 31, 31, false), 31), 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "d6c90c97d9176cdf08a76b7ed70d8c6d0f2bfdfa37a7cc659ba91cd4ec637bef";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "productsByHaveYouForgotten";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("includeProductAvailabilityStates");
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
        Boolean bool = Boolean.FALSE;
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, bool);
        jsonWriter.F1("includeOfferMinimumSpend");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, bool);
        Optional optional = this.f10941a;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("includeAvailabilityInfoStatus");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        } else if (z) {
            jsonWriter.F1("includeAvailabilityInfoStatus");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, bool);
        }
        Optional optional2 = this.b;
        if (optional2 instanceof Optional.Present) {
            jsonWriter.F1("includePricingFootnote");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional2);
        } else if (z) {
            jsonWriter.F1("includePricingFootnote");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, bool);
        }
        jsonWriter.F1("includeLowestPrice14Days");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.c));
    }

    public final String toString() {
        return YU.a.k(")", a.p("ProductsByHaveYouForgottenQuery(includeProductAvailabilityStates=false, includeOfferMinimumSpend=false, includeAvailabilityInfoStatus=", this.f10941a, ", includePricingFootnote=", this.b, ", includeLowestPrice14Days="), this.c);
    }
}
