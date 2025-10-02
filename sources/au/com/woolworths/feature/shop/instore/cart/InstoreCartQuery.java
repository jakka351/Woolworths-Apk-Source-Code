package au.com.woolworths.feature.shop.instore.cart;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.shop.instore.cart.adapter.InstoreCartQuery_ResponseAdapter;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shop/instore/cart/InstoreCartQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/feature/shop/instore/cart/InstoreCartQuery$Data;", "Data", "InStoreCart", "ProductsFeed", "OnProductCard", "Companion", "instore-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InstoreCartQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f7307a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final boolean f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/instore/cart/InstoreCartQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "instore-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/cart/InstoreCartQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "instore-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final InStoreCart f7308a;

        public Data(InStoreCart inStoreCart) {
            this.f7308a = inStoreCart;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f7308a, ((Data) obj).f7308a);
        }

        public final int hashCode() {
            return this.f7308a.hashCode();
        }

        public final String toString() {
            return "Data(inStoreCart=" + this.f7308a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/cart/InstoreCartQuery$InStoreCart;", "", "instore-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InStoreCart {

        /* renamed from: a, reason: collision with root package name */
        public final int f7309a;
        public final ArrayList b;

        public InStoreCart(int i, ArrayList arrayList) {
            this.f7309a = i;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InStoreCart)) {
                return false;
            }
            InStoreCart inStoreCart = (InStoreCart) obj;
            return this.f7309a == inStoreCart.f7309a && this.b.equals(inStoreCart.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.f7309a) * 31);
        }

        public final String toString() {
            return "InStoreCart(totalProducts=" + this.f7309a + ", productsFeed=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/cart/InstoreCartQuery$OnProductCard;", "", "instore-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f7310a;
        public final ProductCard b;

        public OnProductCard(String str, ProductCard productCard) {
            this.f7310a = str;
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
            return Intrinsics.c(this.f7310a, onProductCard.f7310a) && Intrinsics.c(this.b, onProductCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f7310a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("OnProductCard(__typename=", this.f7310a, ", productCard=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/cart/InstoreCartQuery$ProductsFeed;", "", "instore-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductsFeed {

        /* renamed from: a, reason: collision with root package name */
        public final String f7311a;
        public final OnProductCard b;

        public ProductsFeed(String __typename, OnProductCard onProductCard) {
            Intrinsics.h(__typename, "__typename");
            this.f7311a = __typename;
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
            return Intrinsics.c(this.f7311a, productsFeed.f7311a) && Intrinsics.c(this.b, productsFeed.b);
        }

        public final int hashCode() {
            int iHashCode = this.f7311a.hashCode() * 31;
            OnProductCard onProductCard = this.b;
            return iHashCode + (onProductCard == null ? 0 : onProductCard.hashCode());
        }

        public final String toString() {
            return "ProductsFeed(__typename=" + this.f7311a + ", onProductCard=" + this.b + ")";
        }
    }

    public InstoreCartQuery(String storeId, boolean z) {
        Intrinsics.h(storeId, "storeId");
        this.f7307a = storeId;
        Optional.Absent absent = Optional.Absent.f13523a;
        this.b = absent;
        this.c = absent;
        this.d = absent;
        this.e = absent;
        this.f = z;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(InstoreCartQuery_ResponseAdapter.Data.f7314a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query InstoreCart($storeId: String!, $includeAvailabilityInfoStatus: Boolean! = false , $includeProductAvailabilityStates: Boolean! = false , $includeOfferMinimumSpend: Boolean! = false , $includePricingFootnote: Boolean! = false , $includeLowestPrice14Days: Boolean!) { inStoreCart(storeId: $storeId) { totalProducts productsFeed { __typename ... on ProductCard { __typename ...productCard } } } }  fragment productTrolley on ProductTrolley { minimum maximum increment defaultValue: default unit inTrolley buttonState buttonLabel buttonQuantity title }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment productCard on ProductCard { productId name isNew purchaseRestriction productImage isAvailable inStoreAvailabilityInfo @include(if: $includeProductAvailabilityStates) { button { label action style enabled } status @include(if: $includeAvailabilityInfoStatus) infoSheet { title message button { label action style enabled } } } price unitOfMeasureLabel badgeImage promotionInfo { type label } unitPriceDescription wasPrice purchaseWarning inlineLabels { type label priority } trolley { __typename ...productTrolley } trolleys { __typename ...productTrolley } list { minimum maximum increment defaultValue: default unit } inStoreDetails { locationText locationType } inStoreLocation { details { aisleNumber aisleSide bayNumber bayNumberAlternate floorNumber location x y z } displayInfo { locationText locationType } } adId source marketplace { imageUrl title sellerName brandName lowestMarketPriceDescription @include(if: $includeLowestPrice14Days) } rewardsOfferInfo { offerId offerStatus displayStatus displayExpiry minimumSpend @include(if: $includeOfferMinimumSpend) offerAnalytics { offerName campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode } boostButton { label style enabled } } disclaimer tagLabel { text style } productVarieties { totalCount label priceFamilyId } categories { name categoryLevel } isTobacco memberPriceInfo { header title subtitle } multiBuyPriceInfo { price unitPrice } cartProductInfo { totalPrice totalOriginalPrice totalDiscount } productCardAnalytics { __typename ...analyticsFields } productCardAction { action type id analytics { __typename ...analyticsFields } } pricingFootnoteMd @include(if: $includePricingFootnote) }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstoreCartQuery)) {
            return false;
        }
        InstoreCartQuery instoreCartQuery = (InstoreCartQuery) obj;
        return Intrinsics.c(this.f7307a, instoreCartQuery.f7307a) && Intrinsics.c(this.b, instoreCartQuery.b) && Intrinsics.c(this.c, instoreCartQuery.c) && Intrinsics.c(this.d, instoreCartQuery.d) && Intrinsics.c(this.e, instoreCartQuery.e) && this.f == instoreCartQuery.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.e, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.d, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.c, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.b, this.f7307a.hashCode() * 31, 31), 31), 31), 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "7212b0eaff8e64280a16f15e05537b32b780a19637ba1b5ed5e1fb4452052492";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "InstoreCart";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("storeId");
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, this.f7307a);
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
        StringBuilder sbR = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.r("InstoreCartQuery(storeId=", this.f7307a, ", includeAvailabilityInfoStatus=", this.b, ", includeProductAvailabilityStates=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sbR, this.c, ", includeOfferMinimumSpend=", this.d, ", includePricingFootnote=");
        sbR.append(this.e);
        sbR.append(", includeLowestPrice14Days=");
        sbR.append(this.f);
        sbR.append(")");
        return sbR.toString();
    }
}
