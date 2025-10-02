package au.com.woolworths.shop.lists;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.shop.graphql.type.MagicMatchInput;
import au.com.woolworths.shop.graphql.type.adapter.MagicMatchInput_InputAdapter;
import au.com.woolworths.shop.lists.adapter.MagicMatchProductListQuery_ResponseAdapter;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/shop/lists/MagicMatchProductListQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/shop/lists/MagicMatchProductListQuery$Data;", "Data", "MagicMatchProductList", "ProductList", "MatchedProduct", "Product", "SuggestedProductList", "Product1", "Companion", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MagicMatchProductListQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final MagicMatchInput f12227a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final Optional f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/lists/MagicMatchProductListQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/MagicMatchProductListQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final MagicMatchProductList f12228a;

        public Data(MagicMatchProductList magicMatchProductList) {
            this.f12228a = magicMatchProductList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f12228a, ((Data) obj).f12228a);
        }

        public final int hashCode() {
            return this.f12228a.f12229a.hashCode();
        }

        public final String toString() {
            return "Data(magicMatchProductList=" + this.f12228a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/MagicMatchProductListQuery$MagicMatchProductList;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MagicMatchProductList {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f12229a;

        public MagicMatchProductList(ArrayList arrayList) {
            this.f12229a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MagicMatchProductList) && this.f12229a.equals(((MagicMatchProductList) obj).f12229a);
        }

        public final int hashCode() {
            return this.f12229a.hashCode();
        }

        public final String toString() {
            return a.k("MagicMatchProductList(productList=", ")", this.f12229a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/MagicMatchProductListQuery$MatchedProduct;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MatchedProduct {

        /* renamed from: a, reason: collision with root package name */
        public final double f12230a;
        public final Product b;

        public MatchedProduct(double d, Product product) {
            this.f12230a = d;
            this.b = product;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MatchedProduct)) {
                return false;
            }
            MatchedProduct matchedProduct = (MatchedProduct) obj;
            return Double.compare(this.f12230a, matchedProduct.f12230a) == 0 && Intrinsics.c(this.b, matchedProduct.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Double.hashCode(this.f12230a) * 31);
        }

        public final String toString() {
            return "MatchedProduct(quantity=" + this.f12230a + ", product=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/MagicMatchProductListQuery$Product;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Product {

        /* renamed from: a, reason: collision with root package name */
        public final String f12231a;
        public final ProductCard b;

        public Product(String str, ProductCard productCard) {
            this.f12231a = str;
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
            return Intrinsics.c(this.f12231a, product.f12231a) && Intrinsics.c(this.b, product.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f12231a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("Product(__typename=", this.f12231a, ", productCard=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/MagicMatchProductListQuery$Product1;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Product1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f12232a;
        public final ProductCard b;

        public Product1(String str, ProductCard productCard) {
            this.f12232a = str;
            this.b = productCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Product1)) {
                return false;
            }
            Product1 product1 = (Product1) obj;
            return Intrinsics.c(this.f12232a, product1.f12232a) && Intrinsics.c(this.b, product1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f12232a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("Product1(__typename=", this.f12232a, ", productCard=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/MagicMatchProductListQuery$ProductList;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductList {

        /* renamed from: a, reason: collision with root package name */
        public final String f12233a;
        public final String b;
        public final MatchedProduct c;
        public final ArrayList d;

        public ProductList(String str, String str2, MatchedProduct matchedProduct, ArrayList arrayList) {
            this.f12233a = str;
            this.b = str2;
            this.c = matchedProduct;
            this.d = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductList)) {
                return false;
            }
            ProductList productList = (ProductList) obj;
            return this.f12233a.equals(productList.f12233a) && this.b.equals(productList.b) && Intrinsics.c(this.c, productList.c) && this.d.equals(productList.d);
        }

        public final int hashCode() {
            int iC = b.c(this.f12233a.hashCode() * 31, 31, this.b);
            MatchedProduct matchedProduct = this.c;
            return this.d.hashCode() + ((iC + (matchedProduct == null ? 0 : matchedProduct.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("ProductList(searchText=", this.f12233a, ", listItemId=", this.b, ", matchedProduct=");
            sbV.append(this.c);
            sbV.append(", suggestedProductList=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/MagicMatchProductListQuery$SuggestedProductList;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SuggestedProductList {

        /* renamed from: a, reason: collision with root package name */
        public final double f12234a;
        public final Product1 b;

        public SuggestedProductList(double d, Product1 product1) {
            this.f12234a = d;
            this.b = product1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuggestedProductList)) {
                return false;
            }
            SuggestedProductList suggestedProductList = (SuggestedProductList) obj;
            return Double.compare(this.f12234a, suggestedProductList.f12234a) == 0 && Intrinsics.c(this.b, suggestedProductList.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Double.hashCode(this.f12234a) * 31);
        }

        public final String toString() {
            return "SuggestedProductList(quantity=" + this.f12234a + ", product=" + this.b + ")";
        }
    }

    public MagicMatchProductListQuery(MagicMatchInput magicMatchInput) {
        this.f12227a = magicMatchInput;
        Optional.Absent absent = Optional.Absent.f13523a;
        this.b = absent;
        this.c = absent;
        this.d = absent;
        this.e = absent;
        this.f = absent;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(MagicMatchProductListQuery_ResponseAdapter.Data.f12246a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query MagicMatchProductList($magicMatchInput: MagicMatchInput!, $includeProductAvailabilityStates: Boolean! = false , $includeOfferMinimumSpend: Boolean! = false , $includeAvailabilityInfoStatus: Boolean! = false , $includePricingFootnote: Boolean! = false , $includeLowestPrice14Days: Boolean! = false ) { magicMatchProductList(magicMatchInput: $magicMatchInput) { productList { searchText listItemId matchedProduct { quantity product { __typename ...productCard } } suggestedProductList { quantity product { __typename ...productCard } } } } }  fragment productTrolley on ProductTrolley { minimum maximum increment defaultValue: default unit inTrolley buttonState buttonLabel buttonQuantity title }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment productCard on ProductCard { productId name isNew purchaseRestriction productImage isAvailable inStoreAvailabilityInfo @include(if: $includeProductAvailabilityStates) { button { label action style enabled } status @include(if: $includeAvailabilityInfoStatus) infoSheet { title message button { label action style enabled } } } price unitOfMeasureLabel badgeImage promotionInfo { type label } unitPriceDescription wasPrice purchaseWarning inlineLabels { type label priority } trolley { __typename ...productTrolley } trolleys { __typename ...productTrolley } list { minimum maximum increment defaultValue: default unit } inStoreDetails { locationText locationType } inStoreLocation { details { aisleNumber aisleSide bayNumber bayNumberAlternate floorNumber location x y z } displayInfo { locationText locationType } } adId source marketplace { imageUrl title sellerName brandName lowestMarketPriceDescription @include(if: $includeLowestPrice14Days) } rewardsOfferInfo { offerId offerStatus displayStatus displayExpiry minimumSpend @include(if: $includeOfferMinimumSpend) offerAnalytics { offerName campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode } boostButton { label style enabled } } disclaimer tagLabel { text style } productVarieties { totalCount label priceFamilyId } categories { name categoryLevel } isTobacco memberPriceInfo { header title subtitle } multiBuyPriceInfo { price unitPrice } cartProductInfo { totalPrice totalOriginalPrice totalDiscount } productCardAnalytics { __typename ...analyticsFields } productCardAction { action type id analytics { __typename ...analyticsFields } } pricingFootnoteMd @include(if: $includePricingFootnote) }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagicMatchProductListQuery)) {
            return false;
        }
        MagicMatchProductListQuery magicMatchProductListQuery = (MagicMatchProductListQuery) obj;
        return Intrinsics.c(this.f12227a, magicMatchProductListQuery.f12227a) && Intrinsics.c(this.b, magicMatchProductListQuery.b) && Intrinsics.c(this.c, magicMatchProductListQuery.c) && Intrinsics.c(this.d, magicMatchProductListQuery.d) && Intrinsics.c(this.e, magicMatchProductListQuery.e) && Intrinsics.c(this.f, magicMatchProductListQuery.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.e, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.d, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.c, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.b, this.f12227a.hashCode() * 31, 31), 31), 31), 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "565b38ca4999167aaf921f74dc5023e3a4330bc0572393ca7405f0bbc341c6e6";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "MagicMatchProductList";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("magicMatchInput");
        Adapters.c(MagicMatchInput_InputAdapter.f12084a, false).toJson(jsonWriter, customScalarAdapters, this.f12227a);
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
        Optional optional4 = this.e;
        if (optional4 instanceof Optional.Present) {
            jsonWriter.F1("includePricingFootnote");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional4);
        } else if (z) {
            jsonWriter.F1("includePricingFootnote");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional5 = this.f;
        if (optional5 instanceof Optional.Present) {
            jsonWriter.F1("includeLowestPrice14Days");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional5);
        } else if (z) {
            jsonWriter.F1("includeLowestPrice14Days");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MagicMatchProductListQuery(magicMatchInput=");
        sb.append(this.f12227a);
        sb.append(", includeProductAvailabilityStates=");
        sb.append(this.b);
        sb.append(", includeOfferMinimumSpend=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sb, this.c, ", includeAvailabilityInfoStatus=", this.d, ", includePricingFootnote=");
        sb.append(this.e);
        sb.append(", includeLowestPrice14Days=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
