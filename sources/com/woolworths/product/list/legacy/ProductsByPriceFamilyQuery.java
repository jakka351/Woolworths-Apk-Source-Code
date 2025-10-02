package com.woolworths.product.list.legacy;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.woolworths.product.list.legacy.adapter.ProductsByPriceFamilyQuery_ResponseAdapter;
import com.woolworths.product.list.legacy.adapter.ProductsByPriceFamilyQuery_VariablesAdapter;
import com.woolworths.product.list.legacy.selections.ProductsByPriceFamilyQuerySelections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000556789BY\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0006\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0019\u001a\u00020\u0004H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016J \u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\bH\u0016J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020$H\u0016J\b\u0010%\u001a\u00020&H\u0016J\t\u0010'\u001a\u00020\u0004HÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006HÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003Jc\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00062\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001J\u0013\u0010/\u001a\u00020\b2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014¨\u0006:"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsByPriceFamilyQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/product/list/legacy/ProductsByPriceFamilyQuery$Data;", "priceFamilyId", "", "storeId", "Lcom/apollographql/apollo/api/Optional;", "includeProductAvailabilityStates", "", "includeOfferMinimumSpend", "includeAvailabilityInfoStatus", "includePricingFootnote", "includeLowestPrice14Days", "<init>", "(Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;ZZLcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Z)V", "getPriceFamilyId", "()Ljava/lang/String;", "getStoreId", "()Lcom/apollographql/apollo/api/Optional;", "getIncludeProductAvailabilityStates", "()Z", "getIncludeOfferMinimumSpend", "getIncludeAvailabilityInfoStatus", "getIncludePricingFootnote", "getIncludeLowestPrice14Days", "id", "document", AppMeasurementSdk.ConditionalUserProperty.NAME, "serializeVariables", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "withDefaultValues", "adapter", "Lcom/apollographql/apollo/api/Adapter;", "rootField", "Lcom/apollographql/apollo/api/CompiledField;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "", "toString", "Data", "ProductsByPriceFamily", "ProductsFeed", "OnProductCard", "Companion", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ProductsByPriceFamilyQuery implements Query<Data> {

    @NotNull
    public static final String OPERATION_ID = "94e7b5409ddaf662b2dc47d0695b6306b1d6c4a7b4eabf4ca2468e3923974a05";

    @NotNull
    public static final String OPERATION_NAME = "productsByPriceFamily";

    @NotNull
    private final Optional<Boolean> includeAvailabilityInfoStatus;
    private final boolean includeLowestPrice14Days;
    private final boolean includeOfferMinimumSpend;

    @NotNull
    private final Optional<Boolean> includePricingFootnote;
    private final boolean includeProductAvailabilityStates;

    @NotNull
    private final String priceFamilyId;

    @NotNull
    private final Optional<String> storeId;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsByPriceFamilyQuery$Companion;", "", "<init>", "()V", "OPERATION_ID", "", "OPERATION_DOCUMENT", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_NAME", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getOPERATION_DOCUMENT() {
            return "query productsByPriceFamily($priceFamilyId: String!, $storeId: String, $includeProductAvailabilityStates: Boolean!, $includeOfferMinimumSpend: Boolean!, $includeAvailabilityInfoStatus: Boolean! = false , $includePricingFootnote: Boolean! = false , $includeLowestPrice14Days: Boolean!) { productsByPriceFamily(priceFamilyId: $priceFamilyId, storeId: $storeId) { totalNumberOfProducts productsFeed { __typename ... on ProductCard { __typename ...productCard } } } }  fragment productTrolley on ProductTrolley { minimum maximum increment defaultValue: default unit inTrolley buttonState buttonLabel buttonQuantity title }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment productCard on ProductCard { productId name isNew purchaseRestriction productImage isAvailable inStoreAvailabilityInfo @include(if: $includeProductAvailabilityStates) { button { label action style enabled } status @include(if: $includeAvailabilityInfoStatus) infoSheet { title message button { label action style enabled } } } price unitOfMeasureLabel badgeImage promotionInfo { type label } unitPriceDescription wasPrice purchaseWarning inlineLabels { type label priority } trolley { __typename ...productTrolley } trolleys { __typename ...productTrolley } list { minimum maximum increment defaultValue: default unit } inStoreDetails { locationText locationType } inStoreLocation { details { aisleNumber aisleSide bayNumber bayNumberAlternate floorNumber location x y z } displayInfo { locationText locationType } } adId source marketplace { imageUrl title sellerName brandName lowestMarketPriceDescription @include(if: $includeLowestPrice14Days) } rewardsOfferInfo { offerId offerStatus displayStatus displayExpiry minimumSpend @include(if: $includeOfferMinimumSpend) offerAnalytics { offerName campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode } boostButton { label style enabled } } disclaimer tagLabel { text style } productVarieties { totalCount label priceFamilyId } categories { name categoryLevel } isTobacco memberPriceInfo { header title subtitle } multiBuyPriceInfo { price unitPrice } cartProductInfo { totalPrice totalOriginalPrice totalDiscount } productCardAnalytics { __typename ...analyticsFields } productCardAction { action type id analytics { __typename ...analyticsFields } } pricingFootnoteMd @include(if: $includePricingFootnote) }";
        }

        private Companion() {
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsByPriceFamilyQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "productsByPriceFamily", "Lcom/woolworths/product/list/legacy/ProductsByPriceFamilyQuery$ProductsByPriceFamily;", "<init>", "(Lcom/woolworths/product/list/legacy/ProductsByPriceFamilyQuery$ProductsByPriceFamily;)V", "getProductsByPriceFamily", "()Lcom/woolworths/product/list/legacy/ProductsByPriceFamilyQuery$ProductsByPriceFamily;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {
        public static final int $stable = 8;

        @Nullable
        private final ProductsByPriceFamily productsByPriceFamily;

        public Data(@Nullable ProductsByPriceFamily productsByPriceFamily) {
            this.productsByPriceFamily = productsByPriceFamily;
        }

        public static /* synthetic */ Data copy$default(Data data, ProductsByPriceFamily productsByPriceFamily, int i, Object obj) {
            if ((i & 1) != 0) {
                productsByPriceFamily = data.productsByPriceFamily;
            }
            return data.copy(productsByPriceFamily);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final ProductsByPriceFamily getProductsByPriceFamily() {
            return this.productsByPriceFamily;
        }

        @NotNull
        public final Data copy(@Nullable ProductsByPriceFamily productsByPriceFamily) {
            return new Data(productsByPriceFamily);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Data) && Intrinsics.c(this.productsByPriceFamily, ((Data) other).productsByPriceFamily);
        }

        @Nullable
        public final ProductsByPriceFamily getProductsByPriceFamily() {
            return this.productsByPriceFamily;
        }

        public int hashCode() {
            ProductsByPriceFamily productsByPriceFamily = this.productsByPriceFamily;
            if (productsByPriceFamily == null) {
                return 0;
            }
            return productsByPriceFamily.hashCode();
        }

        @NotNull
        public String toString() {
            return "Data(productsByPriceFamily=" + this.productsByPriceFamily + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsByPriceFamilyQuery$OnProductCard;", "", "__typename", "", "productCard", "Lau/com/woolworths/graphql/common/fragment/ProductCard;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/graphql/common/fragment/ProductCard;)V", "get__typename", "()Ljava/lang/String;", "getProductCard", "()Lau/com/woolworths/graphql/common/fragment/ProductCard;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductCard {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final ProductCard productCard;

        public OnProductCard(@NotNull String __typename, @NotNull ProductCard productCard) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(productCard, "productCard");
            this.__typename = __typename;
            this.productCard = productCard;
        }

        public static /* synthetic */ OnProductCard copy$default(OnProductCard onProductCard, String str, ProductCard productCard, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onProductCard.__typename;
            }
            if ((i & 2) != 0) {
                productCard = onProductCard.productCard;
            }
            return onProductCard.copy(str, productCard);
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
        public final OnProductCard copy(@NotNull String __typename, @NotNull ProductCard productCard) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(productCard, "productCard");
            return new OnProductCard(__typename, productCard);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnProductCard)) {
                return false;
            }
            OnProductCard onProductCard = (OnProductCard) other;
            return Intrinsics.c(this.__typename, onProductCard.__typename) && Intrinsics.c(this.productCard, onProductCard.productCard);
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
            return d.o("OnProductCard(__typename=", this.__typename, ", productCard=", this.productCard, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J*\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsByPriceFamilyQuery$ProductsByPriceFamily;", "", "totalNumberOfProducts", "", "productsFeed", "", "Lcom/woolworths/product/list/legacy/ProductsByPriceFamilyQuery$ProductsFeed;", "<init>", "(Ljava/lang/Integer;Ljava/util/List;)V", "getTotalNumberOfProducts", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getProductsFeed", "()Ljava/util/List;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/util/List;)Lcom/woolworths/product/list/legacy/ProductsByPriceFamilyQuery$ProductsByPriceFamily;", "equals", "", "other", "hashCode", "toString", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductsByPriceFamily {
        public static final int $stable = 8;

        @NotNull
        private final List<ProductsFeed> productsFeed;

        @Nullable
        private final Integer totalNumberOfProducts;

        public ProductsByPriceFamily(@Nullable Integer num, @NotNull List<ProductsFeed> productsFeed) {
            Intrinsics.h(productsFeed, "productsFeed");
            this.totalNumberOfProducts = num;
            this.productsFeed = productsFeed;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ProductsByPriceFamily copy$default(ProductsByPriceFamily productsByPriceFamily, Integer num, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                num = productsByPriceFamily.totalNumberOfProducts;
            }
            if ((i & 2) != 0) {
                list = productsByPriceFamily.productsFeed;
            }
            return productsByPriceFamily.copy(num, list);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final Integer getTotalNumberOfProducts() {
            return this.totalNumberOfProducts;
        }

        @NotNull
        public final List<ProductsFeed> component2() {
            return this.productsFeed;
        }

        @NotNull
        public final ProductsByPriceFamily copy(@Nullable Integer totalNumberOfProducts, @NotNull List<ProductsFeed> productsFeed) {
            Intrinsics.h(productsFeed, "productsFeed");
            return new ProductsByPriceFamily(totalNumberOfProducts, productsFeed);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductsByPriceFamily)) {
                return false;
            }
            ProductsByPriceFamily productsByPriceFamily = (ProductsByPriceFamily) other;
            return Intrinsics.c(this.totalNumberOfProducts, productsByPriceFamily.totalNumberOfProducts) && Intrinsics.c(this.productsFeed, productsByPriceFamily.productsFeed);
        }

        @NotNull
        public final List<ProductsFeed> getProductsFeed() {
            return this.productsFeed;
        }

        @Nullable
        public final Integer getTotalNumberOfProducts() {
            return this.totalNumberOfProducts;
        }

        public int hashCode() {
            Integer num = this.totalNumberOfProducts;
            return this.productsFeed.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "ProductsByPriceFamily(totalNumberOfProducts=" + this.totalNumberOfProducts + ", productsFeed=" + this.productsFeed + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsByPriceFamilyQuery$ProductsFeed;", "", "__typename", "", "onProductCard", "Lcom/woolworths/product/list/legacy/ProductsByPriceFamilyQuery$OnProductCard;", "<init>", "(Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductsByPriceFamilyQuery$OnProductCard;)V", "get__typename", "()Ljava/lang/String;", "getOnProductCard", "()Lcom/woolworths/product/list/legacy/ProductsByPriceFamilyQuery$OnProductCard;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductsFeed {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @Nullable
        private final OnProductCard onProductCard;

        public ProductsFeed(@NotNull String __typename, @Nullable OnProductCard onProductCard) {
            Intrinsics.h(__typename, "__typename");
            this.__typename = __typename;
            this.onProductCard = onProductCard;
        }

        public static /* synthetic */ ProductsFeed copy$default(ProductsFeed productsFeed, String str, OnProductCard onProductCard, int i, Object obj) {
            if ((i & 1) != 0) {
                str = productsFeed.__typename;
            }
            if ((i & 2) != 0) {
                onProductCard = productsFeed.onProductCard;
            }
            return productsFeed.copy(str, onProductCard);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final OnProductCard getOnProductCard() {
            return this.onProductCard;
        }

        @NotNull
        public final ProductsFeed copy(@NotNull String __typename, @Nullable OnProductCard onProductCard) {
            Intrinsics.h(__typename, "__typename");
            return new ProductsFeed(__typename, onProductCard);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductsFeed)) {
                return false;
            }
            ProductsFeed productsFeed = (ProductsFeed) other;
            return Intrinsics.c(this.__typename, productsFeed.__typename) && Intrinsics.c(this.onProductCard, productsFeed.onProductCard);
        }

        @Nullable
        public final OnProductCard getOnProductCard() {
            return this.onProductCard;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int iHashCode = this.__typename.hashCode() * 31;
            OnProductCard onProductCard = this.onProductCard;
            return iHashCode + (onProductCard == null ? 0 : onProductCard.hashCode());
        }

        @NotNull
        public String toString() {
            return "ProductsFeed(__typename=" + this.__typename + ", onProductCard=" + this.onProductCard + ")";
        }
    }

    public ProductsByPriceFamilyQuery(@NotNull String priceFamilyId, @NotNull Optional<String> storeId, boolean z, boolean z2, @NotNull Optional<Boolean> includeAvailabilityInfoStatus, @NotNull Optional<Boolean> includePricingFootnote, boolean z3) {
        Intrinsics.h(priceFamilyId, "priceFamilyId");
        Intrinsics.h(storeId, "storeId");
        Intrinsics.h(includeAvailabilityInfoStatus, "includeAvailabilityInfoStatus");
        Intrinsics.h(includePricingFootnote, "includePricingFootnote");
        this.priceFamilyId = priceFamilyId;
        this.storeId = storeId;
        this.includeProductAvailabilityStates = z;
        this.includeOfferMinimumSpend = z2;
        this.includeAvailabilityInfoStatus = includeAvailabilityInfoStatus;
        this.includePricingFootnote = includePricingFootnote;
        this.includeLowestPrice14Days = z3;
    }

    public static /* synthetic */ ProductsByPriceFamilyQuery copy$default(ProductsByPriceFamilyQuery productsByPriceFamilyQuery, String str, Optional optional, boolean z, boolean z2, Optional optional2, Optional optional3, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productsByPriceFamilyQuery.priceFamilyId;
        }
        if ((i & 2) != 0) {
            optional = productsByPriceFamilyQuery.storeId;
        }
        if ((i & 4) != 0) {
            z = productsByPriceFamilyQuery.includeProductAvailabilityStates;
        }
        if ((i & 8) != 0) {
            z2 = productsByPriceFamilyQuery.includeOfferMinimumSpend;
        }
        if ((i & 16) != 0) {
            optional2 = productsByPriceFamilyQuery.includeAvailabilityInfoStatus;
        }
        if ((i & 32) != 0) {
            optional3 = productsByPriceFamilyQuery.includePricingFootnote;
        }
        if ((i & 64) != 0) {
            z3 = productsByPriceFamilyQuery.includeLowestPrice14Days;
        }
        Optional optional4 = optional3;
        boolean z4 = z3;
        Optional optional5 = optional2;
        boolean z5 = z;
        return productsByPriceFamilyQuery.copy(str, optional, z5, z2, optional5, optional4, z4);
    }

    @Override // com.apollographql.apollo.api.Executable
    @NotNull
    public Adapter<Data> adapter() {
        return Adapters.c(ProductsByPriceFamilyQuery_ResponseAdapter.Data.INSTANCE, false);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPriceFamilyId() {
        return this.priceFamilyId;
    }

    @NotNull
    public final Optional<String> component2() {
        return this.storeId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIncludeProductAvailabilityStates() {
        return this.includeProductAvailabilityStates;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIncludeOfferMinimumSpend() {
        return this.includeOfferMinimumSpend;
    }

    @NotNull
    public final Optional<Boolean> component5() {
        return this.includeAvailabilityInfoStatus;
    }

    @NotNull
    public final Optional<Boolean> component6() {
        return this.includePricingFootnote;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIncludeLowestPrice14Days() {
        return this.includeLowestPrice14Days;
    }

    @NotNull
    public final ProductsByPriceFamilyQuery copy(@NotNull String priceFamilyId, @NotNull Optional<String> storeId, boolean includeProductAvailabilityStates, boolean includeOfferMinimumSpend, @NotNull Optional<Boolean> includeAvailabilityInfoStatus, @NotNull Optional<Boolean> includePricingFootnote, boolean includeLowestPrice14Days) {
        Intrinsics.h(priceFamilyId, "priceFamilyId");
        Intrinsics.h(storeId, "storeId");
        Intrinsics.h(includeAvailabilityInfoStatus, "includeAvailabilityInfoStatus");
        Intrinsics.h(includePricingFootnote, "includePricingFootnote");
        return new ProductsByPriceFamilyQuery(priceFamilyId, storeId, includeProductAvailabilityStates, includeOfferMinimumSpend, includeAvailabilityInfoStatus, includePricingFootnote, includeLowestPrice14Days);
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
        if (!(other instanceof ProductsByPriceFamilyQuery)) {
            return false;
        }
        ProductsByPriceFamilyQuery productsByPriceFamilyQuery = (ProductsByPriceFamilyQuery) other;
        return Intrinsics.c(this.priceFamilyId, productsByPriceFamilyQuery.priceFamilyId) && Intrinsics.c(this.storeId, productsByPriceFamilyQuery.storeId) && this.includeProductAvailabilityStates == productsByPriceFamilyQuery.includeProductAvailabilityStates && this.includeOfferMinimumSpend == productsByPriceFamilyQuery.includeOfferMinimumSpend && Intrinsics.c(this.includeAvailabilityInfoStatus, productsByPriceFamilyQuery.includeAvailabilityInfoStatus) && Intrinsics.c(this.includePricingFootnote, productsByPriceFamilyQuery.includePricingFootnote) && this.includeLowestPrice14Days == productsByPriceFamilyQuery.includeLowestPrice14Days;
    }

    @NotNull
    public final Optional<Boolean> getIncludeAvailabilityInfoStatus() {
        return this.includeAvailabilityInfoStatus;
    }

    public final boolean getIncludeLowestPrice14Days() {
        return this.includeLowestPrice14Days;
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
    public final String getPriceFamilyId() {
        return this.priceFamilyId;
    }

    @NotNull
    public final Optional<String> getStoreId() {
        return this.storeId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.includeLowestPrice14Days) + a.c(this.includePricingFootnote, a.c(this.includeAvailabilityInfoStatus, b.e(b.e(a.c(this.storeId, this.priceFamilyId.hashCode() * 31, 31), 31, this.includeProductAvailabilityStates), 31, this.includeOfferMinimumSpend), 31), 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    @NotNull
    public String id() {
        return "94e7b5409ddaf662b2dc47d0695b6306b1d6c4a7b4eabf4ca2468e3923974a05";
    }

    @Override // com.apollographql.apollo.api.Operation
    @NotNull
    public String name() {
        return "productsByPriceFamily";
    }

    @NotNull
    public CompiledField rootField() {
        CompiledField.Builder builder = new CompiledField.Builder("data", au.com.woolworths.shop.graphql.type.Query.H2);
        builder.e(ProductsByPriceFamilyQuerySelections.INSTANCE.get__root());
        return builder.c();
    }

    @Override // com.apollographql.apollo.api.Executable
    public void serializeVariables(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        ProductsByPriceFamilyQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @NotNull
    public String toString() {
        String str = this.priceFamilyId;
        Optional<String> optional = this.storeId;
        boolean z = this.includeProductAvailabilityStates;
        boolean z2 = this.includeOfferMinimumSpend;
        Optional<Boolean> optional2 = this.includeAvailabilityInfoStatus;
        Optional<Boolean> optional3 = this.includePricingFootnote;
        boolean z3 = this.includeLowestPrice14Days;
        StringBuilder sbR = a.r("ProductsByPriceFamilyQuery(priceFamilyId=", str, ", storeId=", optional, ", includeProductAvailabilityStates=");
        au.com.woolworths.android.onesite.a.D(sbR, z, ", includeOfferMinimumSpend=", z2, ", includeAvailabilityInfoStatus=");
        a.x(sbR, optional2, ", includePricingFootnote=", optional3, ", includeLowestPrice14Days=");
        return YU.a.k(")", sbR, z3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ProductsByPriceFamilyQuery(String str, Optional optional, boolean z, boolean z2, Optional optional2, Optional optional3, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z4;
        Optional optional4;
        int i2 = i & 2;
        Optional.Absent absent = Optional.Absent.f13523a;
        optional = i2 != 0 ? absent : optional;
        optional2 = (i & 16) != 0 ? absent : optional2;
        if ((i & 32) != 0) {
            z4 = z3;
            optional4 = absent;
        } else {
            z4 = z3;
            optional4 = optional3;
        }
        this(str, optional, z, z2, optional2, optional4, z4);
    }
}
