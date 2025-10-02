package au.com.woolworths.shop.lists.data.remote;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.shop.lists.data.remote.adapter.SuggestedProductListQuery_ResponseAdapter;
import au.com.woolworths.shop.lists.data.remote.adapter.SuggestedProductListQuery_VariablesAdapter;
import au.com.woolworths.shop.lists.data.remote.selections.SuggestedProductListQuerySelections;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u0000 @2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004=>?@B\u0085\u0001\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010 \u001a\u00020\u0005H\u0016J\b\u0010!\u001a\u00020\u0005H\u0016J \u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u000bH\u0016J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020*H\u0016J\b\u0010+\u001a\u00020,H\u0016J\u0011\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\u0011\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004HÆ\u0003J\u0011\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004HÆ\u0003J\t\u00101\u001a\u00020\u000bHÆ\u0003J\t\u00102\u001a\u00020\u000bHÆ\u0003J\t\u00103\u001a\u00020\u000bHÆ\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004HÆ\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004HÆ\u0003J\t\u00106\u001a\u00020\u000bHÆ\u0003J\u0091\u0001\u00107\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000bHÆ\u0001J\u0013\u00108\u001a\u00020\u000b2\b\u00109\u001a\u0004\u0018\u00010:HÖ\u0003J\t\u0010;\u001a\u00020\u0007HÖ\u0001J\t\u0010<\u001a\u00020\u0005HÖ\u0001R\u0019\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001a¨\u0006A"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/SuggestedProductListQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/shop/lists/data/remote/SuggestedProductListQuery$Data;", "storeId", "Lcom/apollographql/apollo/api/Optional;", "", "id", "", "pageSize", "pageNumber", "includeMarketplaceSwitch", "", "includeProductAvailabilityStates", "includeOfferMinimumSpend", "includeAvailabilityInfoStatus", "includePricingFootnote", "includeLowestPrice14Days", "<init>", "(Lcom/apollographql/apollo/api/Optional;ILcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;ZZZLcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Z)V", "getStoreId", "()Lcom/apollographql/apollo/api/Optional;", "getId", "()I", "getPageSize", "getPageNumber", "getIncludeMarketplaceSwitch", "()Z", "getIncludeProductAvailabilityStates", "getIncludeOfferMinimumSpend", "getIncludeAvailabilityInfoStatus", "getIncludePricingFootnote", "getIncludeLowestPrice14Days", "document", AppMeasurementSdk.ConditionalUserProperty.NAME, "serializeVariables", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "withDefaultValues", "adapter", "Lcom/apollographql/apollo/api/Adapter;", "rootField", "Lcom/apollographql/apollo/api/CompiledField;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "", "hashCode", "toString", "Data", "SuggestedListItems", "Product", "Companion", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SuggestedProductListQuery implements Query<Data> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String OPERATION_ID = "5e48a003408a4b0ac9be426374617250c69c0764811ae2829e9ef8c0fdd4fcba";

    @NotNull
    public static final String OPERATION_NAME = "suggestedProductList";
    private final int id;

    @NotNull
    private final Optional<Boolean> includeAvailabilityInfoStatus;
    private final boolean includeLowestPrice14Days;
    private final boolean includeMarketplaceSwitch;
    private final boolean includeOfferMinimumSpend;

    @NotNull
    private final Optional<Boolean> includePricingFootnote;
    private final boolean includeProductAvailabilityStates;

    @NotNull
    private final Optional<Integer> pageNumber;

    @NotNull
    private final Optional<Integer> pageSize;

    @NotNull
    private final Optional<String> storeId;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/SuggestedProductListQuery$Companion;", "", "<init>", "()V", "OPERATION_ID", "", "OPERATION_DOCUMENT", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_NAME", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getOPERATION_DOCUMENT() {
            return "query suggestedProductList($storeId: String, $id: Int!, $pageSize: Int, $pageNumber: Int, $includeMarketplaceSwitch: Boolean!, $includeProductAvailabilityStates: Boolean!, $includeOfferMinimumSpend: Boolean!, $includeAvailabilityInfoStatus: Boolean! = false , $includePricingFootnote: Boolean! = false , $includeLowestPrice14Days: Boolean!) { suggestedListItems(storeId: $storeId, id: $id, pageSize: $pageSize, pageNumber: $pageNumber) { totalNumberOfProducts nextPage products { __typename ...productCard } } }  fragment productTrolley on ProductTrolley { minimum maximum increment defaultValue: default unit inTrolley buttonState buttonLabel buttonQuantity title }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment productCard on ProductCard { productId name isNew purchaseRestriction productImage isAvailable inStoreAvailabilityInfo @include(if: $includeProductAvailabilityStates) { button { label action style enabled } status @include(if: $includeAvailabilityInfoStatus) infoSheet { title message button { label action style enabled } } } price unitOfMeasureLabel badgeImage promotionInfo { type label } unitPriceDescription wasPrice purchaseWarning inlineLabels { type label priority } trolley { __typename ...productTrolley } trolleys { __typename ...productTrolley } list { minimum maximum increment defaultValue: default unit } inStoreDetails { locationText locationType } inStoreLocation { details { aisleNumber aisleSide bayNumber bayNumberAlternate floorNumber location x y z } displayInfo { locationText locationType } } adId source marketplace { imageUrl title sellerName brandName lowestMarketPriceDescription @include(if: $includeLowestPrice14Days) } rewardsOfferInfo { offerId offerStatus displayStatus displayExpiry minimumSpend @include(if: $includeOfferMinimumSpend) offerAnalytics { offerName campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode } boostButton { label style enabled } } disclaimer tagLabel { text style } productVarieties { totalCount label priceFamilyId } categories { name categoryLevel } isTobacco memberPriceInfo { header title subtitle } multiBuyPriceInfo { price unitPrice } cartProductInfo { totalPrice totalOriginalPrice totalDiscount } productCardAnalytics { __typename ...analyticsFields } productCardAction { action type id analytics { __typename ...analyticsFields } } pricingFootnoteMd @include(if: $includePricingFootnote) }";
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/SuggestedProductListQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "suggestedListItems", "Lau/com/woolworths/shop/lists/data/remote/SuggestedProductListQuery$SuggestedListItems;", "<init>", "(Lau/com/woolworths/shop/lists/data/remote/SuggestedProductListQuery$SuggestedListItems;)V", "getSuggestedListItems", "()Lau/com/woolworths/shop/lists/data/remote/SuggestedProductListQuery$SuggestedListItems;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        @Nullable
        private final SuggestedListItems suggestedListItems;

        public Data(@Nullable SuggestedListItems suggestedListItems) {
            this.suggestedListItems = suggestedListItems;
        }

        public static /* synthetic */ Data copy$default(Data data, SuggestedListItems suggestedListItems, int i, Object obj) {
            if ((i & 1) != 0) {
                suggestedListItems = data.suggestedListItems;
            }
            return data.copy(suggestedListItems);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final SuggestedListItems getSuggestedListItems() {
            return this.suggestedListItems;
        }

        @NotNull
        public final Data copy(@Nullable SuggestedListItems suggestedListItems) {
            return new Data(suggestedListItems);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Data) && Intrinsics.c(this.suggestedListItems, ((Data) other).suggestedListItems);
        }

        @Nullable
        public final SuggestedListItems getSuggestedListItems() {
            return this.suggestedListItems;
        }

        public int hashCode() {
            SuggestedListItems suggestedListItems = this.suggestedListItems;
            if (suggestedListItems == null) {
                return 0;
            }
            return suggestedListItems.hashCode();
        }

        @NotNull
        public String toString() {
            return "Data(suggestedListItems=" + this.suggestedListItems + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/SuggestedProductListQuery$Product;", "", "__typename", "", "productCard", "Lau/com/woolworths/graphql/common/fragment/ProductCard;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/graphql/common/fragment/ProductCard;)V", "get__typename", "()Ljava/lang/String;", "getProductCard", "()Lau/com/woolworths/graphql/common/fragment/ProductCard;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Product {

        @NotNull
        private final String __typename;

        @NotNull
        private final ProductCard productCard;

        public Product(@NotNull String __typename, @NotNull ProductCard productCard) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(productCard, "productCard");
            this.__typename = __typename;
            this.productCard = productCard;
        }

        public static /* synthetic */ Product copy$default(Product product, String str, ProductCard productCard, int i, Object obj) {
            if ((i & 1) != 0) {
                str = product.__typename;
            }
            if ((i & 2) != 0) {
                productCard = product.productCard;
            }
            return product.copy(str, productCard);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ProductCard getProductCard() {
            return this.productCard;
        }

        @NotNull
        public final Product copy(@NotNull String __typename, @NotNull ProductCard productCard) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(productCard, "productCard");
            return new Product(__typename, productCard);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Product)) {
                return false;
            }
            Product product = (Product) other;
            return Intrinsics.c(this.__typename, product.__typename) && Intrinsics.c(this.productCard, product.productCard);
        }

        @NotNull
        public final ProductCard getProductCard() {
            return this.productCard;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.productCard.hashCode() + (this.__typename.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return d.o("Product(__typename=", this.__typename, ", productCard=", this.productCard, ")");
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J6\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/SuggestedProductListQuery$SuggestedListItems;", "", "totalNumberOfProducts", "", "nextPage", "products", "", "Lau/com/woolworths/shop/lists/data/remote/SuggestedProductListQuery$Product;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "getTotalNumberOfProducts", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNextPage", "getProducts$annotations", "()V", "getProducts", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lau/com/woolworths/shop/lists/data/remote/SuggestedProductListQuery$SuggestedListItems;", "equals", "", "other", "hashCode", "toString", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SuggestedListItems {

        @Nullable
        private final Integer nextPage;

        @NotNull
        private final List<Product> products;

        @Nullable
        private final Integer totalNumberOfProducts;

        public SuggestedListItems(@Nullable Integer num, @Nullable Integer num2, @NotNull List<Product> products) {
            Intrinsics.h(products, "products");
            this.totalNumberOfProducts = num;
            this.nextPage = num2;
            this.products = products;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SuggestedListItems copy$default(SuggestedListItems suggestedListItems, Integer num, Integer num2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                num = suggestedListItems.totalNumberOfProducts;
            }
            if ((i & 2) != 0) {
                num2 = suggestedListItems.nextPage;
            }
            if ((i & 4) != 0) {
                list = suggestedListItems.products;
            }
            return suggestedListItems.copy(num, num2, list);
        }

        @Deprecated
        public static /* synthetic */ void getProducts$annotations() {
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final Integer getTotalNumberOfProducts() {
            return this.totalNumberOfProducts;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Integer getNextPage() {
            return this.nextPage;
        }

        @NotNull
        public final List<Product> component3() {
            return this.products;
        }

        @NotNull
        public final SuggestedListItems copy(@Nullable Integer totalNumberOfProducts, @Nullable Integer nextPage, @NotNull List<Product> products) {
            Intrinsics.h(products, "products");
            return new SuggestedListItems(totalNumberOfProducts, nextPage, products);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SuggestedListItems)) {
                return false;
            }
            SuggestedListItems suggestedListItems = (SuggestedListItems) other;
            return Intrinsics.c(this.totalNumberOfProducts, suggestedListItems.totalNumberOfProducts) && Intrinsics.c(this.nextPage, suggestedListItems.nextPage) && Intrinsics.c(this.products, suggestedListItems.products);
        }

        @Nullable
        public final Integer getNextPage() {
            return this.nextPage;
        }

        @NotNull
        public final List<Product> getProducts() {
            return this.products;
        }

        @Nullable
        public final Integer getTotalNumberOfProducts() {
            return this.totalNumberOfProducts;
        }

        public int hashCode() {
            Integer num = this.totalNumberOfProducts;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.nextPage;
            return this.products.hashCode() + ((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            Integer num = this.totalNumberOfProducts;
            Integer num2 = this.nextPage;
            return a.t(d.v("SuggestedListItems(totalNumberOfProducts=", num, ", nextPage=", num2, ", products="), this.products, ")");
        }
    }

    public SuggestedProductListQuery(@NotNull Optional<String> storeId, int i, @NotNull Optional<Integer> pageSize, @NotNull Optional<Integer> pageNumber, boolean z, boolean z2, boolean z3, @NotNull Optional<Boolean> includeAvailabilityInfoStatus, @NotNull Optional<Boolean> includePricingFootnote, boolean z4) {
        Intrinsics.h(storeId, "storeId");
        Intrinsics.h(pageSize, "pageSize");
        Intrinsics.h(pageNumber, "pageNumber");
        Intrinsics.h(includeAvailabilityInfoStatus, "includeAvailabilityInfoStatus");
        Intrinsics.h(includePricingFootnote, "includePricingFootnote");
        this.storeId = storeId;
        this.id = i;
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
        this.includeMarketplaceSwitch = z;
        this.includeProductAvailabilityStates = z2;
        this.includeOfferMinimumSpend = z3;
        this.includeAvailabilityInfoStatus = includeAvailabilityInfoStatus;
        this.includePricingFootnote = includePricingFootnote;
        this.includeLowestPrice14Days = z4;
    }

    public static /* synthetic */ SuggestedProductListQuery copy$default(SuggestedProductListQuery suggestedProductListQuery, Optional optional, int i, Optional optional2, Optional optional3, boolean z, boolean z2, boolean z3, Optional optional4, Optional optional5, boolean z4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            optional = suggestedProductListQuery.storeId;
        }
        if ((i2 & 2) != 0) {
            i = suggestedProductListQuery.id;
        }
        if ((i2 & 4) != 0) {
            optional2 = suggestedProductListQuery.pageSize;
        }
        if ((i2 & 8) != 0) {
            optional3 = suggestedProductListQuery.pageNumber;
        }
        if ((i2 & 16) != 0) {
            z = suggestedProductListQuery.includeMarketplaceSwitch;
        }
        if ((i2 & 32) != 0) {
            z2 = suggestedProductListQuery.includeProductAvailabilityStates;
        }
        if ((i2 & 64) != 0) {
            z3 = suggestedProductListQuery.includeOfferMinimumSpend;
        }
        if ((i2 & 128) != 0) {
            optional4 = suggestedProductListQuery.includeAvailabilityInfoStatus;
        }
        if ((i2 & 256) != 0) {
            optional5 = suggestedProductListQuery.includePricingFootnote;
        }
        if ((i2 & 512) != 0) {
            z4 = suggestedProductListQuery.includeLowestPrice14Days;
        }
        Optional optional6 = optional5;
        boolean z5 = z4;
        boolean z6 = z3;
        Optional optional7 = optional4;
        boolean z7 = z;
        boolean z8 = z2;
        return suggestedProductListQuery.copy(optional, i, optional2, optional3, z7, z8, z6, optional7, optional6, z5);
    }

    @Override // com.apollographql.apollo.api.Executable
    @NotNull
    public Adapter<Data> adapter() {
        return Adapters.c(SuggestedProductListQuery_ResponseAdapter.Data.INSTANCE, false);
    }

    @NotNull
    public final Optional<String> component1() {
        return this.storeId;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIncludeLowestPrice14Days() {
        return this.includeLowestPrice14Days;
    }

    /* renamed from: component2, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    public final Optional<Integer> component3() {
        return this.pageSize;
    }

    @NotNull
    public final Optional<Integer> component4() {
        return this.pageNumber;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIncludeMarketplaceSwitch() {
        return this.includeMarketplaceSwitch;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIncludeProductAvailabilityStates() {
        return this.includeProductAvailabilityStates;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIncludeOfferMinimumSpend() {
        return this.includeOfferMinimumSpend;
    }

    @NotNull
    public final Optional<Boolean> component8() {
        return this.includeAvailabilityInfoStatus;
    }

    @NotNull
    public final Optional<Boolean> component9() {
        return this.includePricingFootnote;
    }

    @NotNull
    public final SuggestedProductListQuery copy(@NotNull Optional<String> storeId, int id, @NotNull Optional<Integer> pageSize, @NotNull Optional<Integer> pageNumber, boolean includeMarketplaceSwitch, boolean includeProductAvailabilityStates, boolean includeOfferMinimumSpend, @NotNull Optional<Boolean> includeAvailabilityInfoStatus, @NotNull Optional<Boolean> includePricingFootnote, boolean includeLowestPrice14Days) {
        Intrinsics.h(storeId, "storeId");
        Intrinsics.h(pageSize, "pageSize");
        Intrinsics.h(pageNumber, "pageNumber");
        Intrinsics.h(includeAvailabilityInfoStatus, "includeAvailabilityInfoStatus");
        Intrinsics.h(includePricingFootnote, "includePricingFootnote");
        return new SuggestedProductListQuery(storeId, id, pageSize, pageNumber, includeMarketplaceSwitch, includeProductAvailabilityStates, includeOfferMinimumSpend, includeAvailabilityInfoStatus, includePricingFootnote, includeLowestPrice14Days);
    }

    @Override // com.apollographql.apollo.api.Operation
    @NotNull
    public String document() {
        return INSTANCE.getOPERATION_DOCUMENT();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuggestedProductListQuery)) {
            return false;
        }
        SuggestedProductListQuery suggestedProductListQuery = (SuggestedProductListQuery) other;
        return Intrinsics.c(this.storeId, suggestedProductListQuery.storeId) && this.id == suggestedProductListQuery.id && Intrinsics.c(this.pageSize, suggestedProductListQuery.pageSize) && Intrinsics.c(this.pageNumber, suggestedProductListQuery.pageNumber) && this.includeMarketplaceSwitch == suggestedProductListQuery.includeMarketplaceSwitch && this.includeProductAvailabilityStates == suggestedProductListQuery.includeProductAvailabilityStates && this.includeOfferMinimumSpend == suggestedProductListQuery.includeOfferMinimumSpend && Intrinsics.c(this.includeAvailabilityInfoStatus, suggestedProductListQuery.includeAvailabilityInfoStatus) && Intrinsics.c(this.includePricingFootnote, suggestedProductListQuery.includePricingFootnote) && this.includeLowestPrice14Days == suggestedProductListQuery.includeLowestPrice14Days;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final Optional<Boolean> getIncludeAvailabilityInfoStatus() {
        return this.includeAvailabilityInfoStatus;
    }

    public final boolean getIncludeLowestPrice14Days() {
        return this.includeLowestPrice14Days;
    }

    public final boolean getIncludeMarketplaceSwitch() {
        return this.includeMarketplaceSwitch;
    }

    public final boolean getIncludeOfferMinimumSpend() {
        return this.includeOfferMinimumSpend;
    }

    @NotNull
    public final Optional<Boolean> getIncludePricingFootnote() {
        return this.includePricingFootnote;
    }

    public final boolean getIncludeProductAvailabilityStates() {
        return this.includeProductAvailabilityStates;
    }

    @NotNull
    public final Optional<Integer> getPageNumber() {
        return this.pageNumber;
    }

    @NotNull
    public final Optional<Integer> getPageSize() {
        return this.pageSize;
    }

    @NotNull
    public final Optional<String> getStoreId() {
        return this.storeId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.includeLowestPrice14Days) + au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.includePricingFootnote, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.includeAvailabilityInfoStatus, b.e(b.e(b.e(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.pageNumber, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.pageSize, b.a(this.id, this.storeId.hashCode() * 31, 31), 31), 31), 31, this.includeMarketplaceSwitch), 31, this.includeProductAvailabilityStates), 31, this.includeOfferMinimumSpend), 31), 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    @NotNull
    public String id() {
        return OPERATION_ID;
    }

    @Override // com.apollographql.apollo.api.Operation
    @NotNull
    public String name() {
        return OPERATION_NAME;
    }

    @NotNull
    public CompiledField rootField() {
        CompiledField.Builder builder = new CompiledField.Builder("data", au.com.woolworths.shop.graphql.type.Query.H2);
        builder.e(SuggestedProductListQuerySelections.INSTANCE.get__root());
        return builder.c();
    }

    @Override // com.apollographql.apollo.api.Executable
    public void serializeVariables(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        SuggestedProductListQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @NotNull
    public String toString() {
        Optional<String> optional = this.storeId;
        int i = this.id;
        Optional<Integer> optional2 = this.pageSize;
        Optional<Integer> optional3 = this.pageNumber;
        boolean z = this.includeMarketplaceSwitch;
        boolean z2 = this.includeProductAvailabilityStates;
        boolean z3 = this.includeOfferMinimumSpend;
        Optional<Boolean> optional4 = this.includeAvailabilityInfoStatus;
        Optional<Boolean> optional5 = this.includePricingFootnote;
        boolean z4 = this.includeLowestPrice14Days;
        StringBuilder sb = new StringBuilder("SuggestedProductListQuery(storeId=");
        sb.append(optional);
        sb.append(", id=");
        sb.append(i);
        sb.append(", pageSize=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sb, optional2, ", pageNumber=", optional3, ", includeMarketplaceSwitch=");
        au.com.woolworths.android.onesite.a.D(sb, z, ", includeProductAvailabilityStates=", z2, ", includeOfferMinimumSpend=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.z(sb, z3, ", includeAvailabilityInfoStatus=", optional4, ", includePricingFootnote=");
        sb.append(optional5);
        sb.append(", includeLowestPrice14Days=");
        sb.append(z4);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SuggestedProductListQuery(Optional optional, int i, Optional optional2, Optional optional3, boolean z, boolean z2, boolean z3, Optional optional4, Optional optional5, boolean z4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z5;
        Optional optional6;
        int i3 = i2 & 1;
        Optional.Absent absent = Optional.Absent.f13523a;
        optional = i3 != 0 ? absent : optional;
        optional2 = (i2 & 4) != 0 ? absent : optional2;
        optional3 = (i2 & 8) != 0 ? absent : optional3;
        optional4 = (i2 & 128) != 0 ? absent : optional4;
        if ((i2 & 256) != 0) {
            z5 = z4;
            optional6 = absent;
        } else {
            z5 = z4;
            optional6 = optional5;
        }
        this(optional, i, optional2, optional3, z, z2, z3, optional4, optional6, z5);
    }
}
