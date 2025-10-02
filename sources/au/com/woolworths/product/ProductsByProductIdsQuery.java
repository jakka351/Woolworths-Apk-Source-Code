package au.com.woolworths.product;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.product.adapter.ProductsByProductIdsQuery_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/product/ProductsByProductIdsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/product/ProductsByProductIdsQuery$Data;", "Data", "ProductsByProductIds", "Product", "Companion", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductsByProductIdsQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final List f9229a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final boolean f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/product/ProductsByProductIdsQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/ProductsByProductIdsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final ProductsByProductIds f9230a;

        public Data(ProductsByProductIds productsByProductIds) {
            this.f9230a = productsByProductIds;
        }

        /* renamed from: a, reason: from getter */
        public final ProductsByProductIds getF9230a() {
            return this.f9230a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f9230a, ((Data) obj).f9230a);
        }

        public final int hashCode() {
            ProductsByProductIds productsByProductIds = this.f9230a;
            if (productsByProductIds == null) {
                return 0;
            }
            return productsByProductIds.f9232a.hashCode();
        }

        public final String toString() {
            return "Data(productsByProductIds=" + this.f9230a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/ProductsByProductIdsQuery$Product;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Product {

        /* renamed from: a, reason: collision with root package name */
        public final String f9231a;
        public final ProductCard b;

        public Product(String str, ProductCard productCard) {
            this.f9231a = str;
            this.b = productCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Product)) {
                return false;
            }
            Product product = (Product) obj;
            return Intrinsics.c(this.f9231a, product.f9231a) && Intrinsics.c(this.b, product.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f9231a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("Product(__typename=", this.f9231a, ", productCard=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/ProductsByProductIdsQuery$ProductsByProductIds;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductsByProductIds {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f9232a;

        public ProductsByProductIds(ArrayList arrayList) {
            this.f9232a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProductsByProductIds) && this.f9232a.equals(((ProductsByProductIds) obj).f9232a);
        }

        public final int hashCode() {
            return this.f9232a.hashCode();
        }

        public final String toString() {
            return a.k("ProductsByProductIds(products=", ")", this.f9232a);
        }
    }

    public ProductsByProductIdsQuery(List productIds, Optional optional, Optional optional2, Optional optional3, boolean z) {
        Intrinsics.h(productIds, "productIds");
        this.f9229a = productIds;
        this.b = optional;
        this.c = optional2;
        this.d = optional3;
        this.e = Optional.Absent.f13523a;
        this.f = z;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(ProductsByProductIdsQuery_ResponseAdapter.Data.f9239a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query productsByProductIds($productIds: [String!]!, $storeId: String, $requestSource: String, $includeProductAvailabilityStates: Boolean!, $includeOfferMinimumSpend: Boolean!, $includeAvailabilityInfoStatus: Boolean! = false , $includePricingFootnote: Boolean! = false , $includeLowestPrice14Days: Boolean!) { productsByProductIds(productIds: $productIds, storeId: $storeId, requestSource: $requestSource) { products { __typename ...productCard } } }  fragment productTrolley on ProductTrolley { minimum maximum increment defaultValue: default unit inTrolley buttonState buttonLabel buttonQuantity title }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment productCard on ProductCard { productId name isNew purchaseRestriction productImage isAvailable inStoreAvailabilityInfo @include(if: $includeProductAvailabilityStates) { button { label action style enabled } status @include(if: $includeAvailabilityInfoStatus) infoSheet { title message button { label action style enabled } } } price unitOfMeasureLabel badgeImage promotionInfo { type label } unitPriceDescription wasPrice purchaseWarning inlineLabels { type label priority } trolley { __typename ...productTrolley } trolleys { __typename ...productTrolley } list { minimum maximum increment defaultValue: default unit } inStoreDetails { locationText locationType } inStoreLocation { details { aisleNumber aisleSide bayNumber bayNumberAlternate floorNumber location x y z } displayInfo { locationText locationType } } adId source marketplace { imageUrl title sellerName brandName lowestMarketPriceDescription @include(if: $includeLowestPrice14Days) } rewardsOfferInfo { offerId offerStatus displayStatus displayExpiry minimumSpend @include(if: $includeOfferMinimumSpend) offerAnalytics { offerName campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode } boostButton { label style enabled } } disclaimer tagLabel { text style } productVarieties { totalCount label priceFamilyId } categories { name categoryLevel } isTobacco memberPriceInfo { header title subtitle } multiBuyPriceInfo { price unitPrice } cartProductInfo { totalPrice totalOriginalPrice totalDiscount } productCardAnalytics { __typename ...analyticsFields } productCardAction { action type id analytics { __typename ...analyticsFields } } pricingFootnoteMd @include(if: $includePricingFootnote) }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductsByProductIdsQuery)) {
            return false;
        }
        ProductsByProductIdsQuery productsByProductIdsQuery = (ProductsByProductIdsQuery) obj;
        return Intrinsics.c(this.f9229a, productsByProductIdsQuery.f9229a) && this.b.equals(productsByProductIdsQuery.b) && this.c.equals(productsByProductIdsQuery.c) && this.d.equals(productsByProductIdsQuery.d) && this.e.equals(productsByProductIdsQuery.e) && this.f == productsByProductIdsQuery.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.e, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.d, b.e(b.e(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.c, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.b, this.f9229a.hashCode() * 31, 31), 31), 31, true), 31, false), 31), 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "3fa22a2adae46474ce8e0cefb7cef255bb211df0d77a6aef9057a6925437eed2";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "productsByProductIds";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("productIds");
        Adapters.a(Adapters.f13493a).toJson(jsonWriter, customScalarAdapters, this.f9229a);
        Optional optional = this.b;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("storeId");
            Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        }
        Optional optional2 = this.c;
        if (optional2 instanceof Optional.Present) {
            jsonWriter.F1("requestSource");
            Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional2);
        }
        jsonWriter.F1("includeProductAvailabilityStates");
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.TRUE);
        jsonWriter.F1("includeOfferMinimumSpend");
        Boolean bool = Boolean.FALSE;
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, bool);
        Optional optional3 = this.d;
        if (optional3 instanceof Optional.Present) {
            jsonWriter.F1("includeAvailabilityInfoStatus");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional3);
        } else if (z) {
            jsonWriter.F1("includeAvailabilityInfoStatus");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, bool);
        }
        Optional optional4 = this.e;
        if (optional4 instanceof Optional.Present) {
            jsonWriter.F1("includePricingFootnote");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional4);
        } else if (z) {
            jsonWriter.F1("includePricingFootnote");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, bool);
        }
        jsonWriter.F1("includeLowestPrice14Days");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.f));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductsByProductIdsQuery(productIds=");
        sb.append(this.f9229a);
        sb.append(", storeId=");
        sb.append(this.b);
        sb.append(", requestSource=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sb, this.c, ", includeProductAvailabilityStates=true, includeOfferMinimumSpend=false, includeAvailabilityInfoStatus=", this.d, ", includePricingFootnote=");
        sb.append(this.e);
        sb.append(", includeLowestPrice14Days=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
