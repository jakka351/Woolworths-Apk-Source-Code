package com.woolworths.product.list.legacy;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.DownloadableAssetFit;
import au.com.woolworths.shop.graphql.type.DownloadableAssetType;
import au.com.woolworths.shop.graphql.type.RewardsOfferStatus;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.salesforce.marketingcloud.UrlHandler;
import com.woolworths.product.list.legacy.adapter.ProductsByRewardsOffersQuery_ResponseAdapter;
import com.woolworths.product.list.legacy.adapter.ProductsByRewardsOffersQuery_VariablesAdapter;
import com.woolworths.product.list.legacy.selections.ProductsByRewardsOffersQuerySelections;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u0000 C2\b\u0012\u0004\u0012\u00020\u00020\u0001:\n:;<=>?@ABCBq\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001d\u001a\u00020\u0005H\u0016J\b\u0010\u001e\u001a\u00020\u0005H\u0016J\b\u0010\u001f\u001a\u00020\u0005H\u0016J \u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000bH\u0016J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020(H\u0016J\b\u0010)\u001a\u00020*H\u0016J\u0011\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010.\u001a\u00020\u000bHÆ\u0003J\t\u0010/\u001a\u00020\u000bHÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004HÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004HÆ\u0003J\t\u00102\u001a\u00020\u000bHÆ\u0003J{\u00103\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000bHÆ\u0001J\u0013\u00104\u001a\u00020\u000b2\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0005HÖ\u0001R\u0019\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018¨\u0006D"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsByRewardsOffersQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/product/list/legacy/ProductsByRewardsOffersQuery$Data;", "storeId", "Lcom/apollographql/apollo/api/Optional;", "", "hashCrn", "offerStatus", "", "Lau/com/woolworths/shop/graphql/type/RewardsOfferStatus;", "includeProductAvailabilityStates", "", "includeOfferMinimumSpend", "includeAvailabilityInfoStatus", "includePricingFootnote", "includeLowestPrice14Days", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Ljava/util/List;ZZLcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Z)V", "getStoreId", "()Lcom/apollographql/apollo/api/Optional;", "getHashCrn", "getOfferStatus", "()Ljava/util/List;", "getIncludeProductAvailabilityStates", "()Z", "getIncludeOfferMinimumSpend", "getIncludeAvailabilityInfoStatus", "getIncludePricingFootnote", "getIncludeLowestPrice14Days", "id", "document", AppMeasurementSdk.ConditionalUserProperty.NAME, "serializeVariables", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "withDefaultValues", "adapter", "Lcom/apollographql/apollo/api/Adapter;", "rootField", "Lcom/apollographql/apollo/api/CompiledField;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "Data", "ProductsByRewardsOffers", "ProductsFeed", "OnProductCard", "CustomMessage", "OnPopupMessage", "OnFullScreenMessage", "MessageAsset", "MessageButton", "Companion", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ProductsByRewardsOffersQuery implements Query<Data> {

    @NotNull
    public static final String OPERATION_ID = "c5f6693725a1bc916c3e9bf62af9d9f50af6d2af25f253b0b0e295acf14252a4";

    @NotNull
    public static final String OPERATION_NAME = "productsByRewardsOffers";

    @NotNull
    private final Optional<String> hashCrn;

    @NotNull
    private final Optional<Boolean> includeAvailabilityInfoStatus;
    private final boolean includeLowestPrice14Days;
    private final boolean includeOfferMinimumSpend;

    @NotNull
    private final Optional<Boolean> includePricingFootnote;
    private final boolean includeProductAvailabilityStates;

    @NotNull
    private final List<RewardsOfferStatus> offerStatus;

    @NotNull
    private final Optional<String> storeId;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsByRewardsOffersQuery$Companion;", "", "<init>", "()V", "OPERATION_ID", "", "OPERATION_DOCUMENT", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_NAME", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getOPERATION_DOCUMENT() {
            return "query productsByRewardsOffers($storeId: String, $hashCrn: String, $offerStatus: [RewardsOfferStatus!]!, $includeProductAvailabilityStates: Boolean!, $includeOfferMinimumSpend: Boolean!, $includeAvailabilityInfoStatus: Boolean! = false , $includePricingFootnote: Boolean! = false , $includeLowestPrice14Days: Boolean!) { productsByRewardsOffers(storeId: $storeId, hashCrn: $hashCrn, offerStatus: $offerStatus) { totalNumberOfProducts productsFeed { __typename ... on ProductCard { __typename ...productCard } } customMessages { __typename ... on PopupMessage { messageTitle messageDescription messageCtaLabel } ... on FullScreenMessage { messageTitle messageDescription messageAsset { assetType assetUrl assetWidth assetHeight fit altText } messageButtons { label style enabled action url } } } } }  fragment productTrolley on ProductTrolley { minimum maximum increment defaultValue: default unit inTrolley buttonState buttonLabel buttonQuantity title }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment productCard on ProductCard { productId name isNew purchaseRestriction productImage isAvailable inStoreAvailabilityInfo @include(if: $includeProductAvailabilityStates) { button { label action style enabled } status @include(if: $includeAvailabilityInfoStatus) infoSheet { title message button { label action style enabled } } } price unitOfMeasureLabel badgeImage promotionInfo { type label } unitPriceDescription wasPrice purchaseWarning inlineLabels { type label priority } trolley { __typename ...productTrolley } trolleys { __typename ...productTrolley } list { minimum maximum increment defaultValue: default unit } inStoreDetails { locationText locationType } inStoreLocation { details { aisleNumber aisleSide bayNumber bayNumberAlternate floorNumber location x y z } displayInfo { locationText locationType } } adId source marketplace { imageUrl title sellerName brandName lowestMarketPriceDescription @include(if: $includeLowestPrice14Days) } rewardsOfferInfo { offerId offerStatus displayStatus displayExpiry minimumSpend @include(if: $includeOfferMinimumSpend) offerAnalytics { offerName campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode } boostButton { label style enabled } } disclaimer tagLabel { text style } productVarieties { totalCount label priceFamilyId } categories { name categoryLevel } isTobacco memberPriceInfo { header title subtitle } multiBuyPriceInfo { price unitPrice } cartProductInfo { totalPrice totalOriginalPrice totalDiscount } productCardAnalytics { __typename ...analyticsFields } productCardAction { action type id analytics { __typename ...analyticsFields } } pricingFootnoteMd @include(if: $includePricingFootnote) }";
        }

        private Companion() {
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsByRewardsOffersQuery$CustomMessage;", "", "__typename", "", "onPopupMessage", "Lcom/woolworths/product/list/legacy/ProductsByRewardsOffersQuery$OnPopupMessage;", "onFullScreenMessage", "Lcom/woolworths/product/list/legacy/ProductsByRewardsOffersQuery$OnFullScreenMessage;", "<init>", "(Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductsByRewardsOffersQuery$OnPopupMessage;Lcom/woolworths/product/list/legacy/ProductsByRewardsOffersQuery$OnFullScreenMessage;)V", "get__typename", "()Ljava/lang/String;", "getOnPopupMessage", "()Lcom/woolworths/product/list/legacy/ProductsByRewardsOffersQuery$OnPopupMessage;", "getOnFullScreenMessage", "()Lcom/woolworths/product/list/legacy/ProductsByRewardsOffersQuery$OnFullScreenMessage;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CustomMessage {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @Nullable
        private final OnFullScreenMessage onFullScreenMessage;

        @Nullable
        private final OnPopupMessage onPopupMessage;

        public CustomMessage(@NotNull String __typename, @Nullable OnPopupMessage onPopupMessage, @Nullable OnFullScreenMessage onFullScreenMessage) {
            Intrinsics.h(__typename, "__typename");
            this.__typename = __typename;
            this.onPopupMessage = onPopupMessage;
            this.onFullScreenMessage = onFullScreenMessage;
        }

        public static /* synthetic */ CustomMessage copy$default(CustomMessage customMessage, String str, OnPopupMessage onPopupMessage, OnFullScreenMessage onFullScreenMessage, int i, Object obj) {
            if ((i & 1) != 0) {
                str = customMessage.__typename;
            }
            if ((i & 2) != 0) {
                onPopupMessage = customMessage.onPopupMessage;
            }
            if ((i & 4) != 0) {
                onFullScreenMessage = customMessage.onFullScreenMessage;
            }
            return customMessage.copy(str, onPopupMessage, onFullScreenMessage);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final OnPopupMessage getOnPopupMessage() {
            return this.onPopupMessage;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final OnFullScreenMessage getOnFullScreenMessage() {
            return this.onFullScreenMessage;
        }

        @NotNull
        public final CustomMessage copy(@NotNull String __typename, @Nullable OnPopupMessage onPopupMessage, @Nullable OnFullScreenMessage onFullScreenMessage) {
            Intrinsics.h(__typename, "__typename");
            return new CustomMessage(__typename, onPopupMessage, onFullScreenMessage);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomMessage)) {
                return false;
            }
            CustomMessage customMessage = (CustomMessage) other;
            return Intrinsics.c(this.__typename, customMessage.__typename) && Intrinsics.c(this.onPopupMessage, customMessage.onPopupMessage) && Intrinsics.c(this.onFullScreenMessage, customMessage.onFullScreenMessage);
        }

        @Nullable
        public final OnFullScreenMessage getOnFullScreenMessage() {
            return this.onFullScreenMessage;
        }

        @Nullable
        public final OnPopupMessage getOnPopupMessage() {
            return this.onPopupMessage;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int iHashCode = this.__typename.hashCode() * 31;
            OnPopupMessage onPopupMessage = this.onPopupMessage;
            int iHashCode2 = (iHashCode + (onPopupMessage == null ? 0 : onPopupMessage.hashCode())) * 31;
            OnFullScreenMessage onFullScreenMessage = this.onFullScreenMessage;
            return iHashCode2 + (onFullScreenMessage != null ? onFullScreenMessage.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "CustomMessage(__typename=" + this.__typename + ", onPopupMessage=" + this.onPopupMessage + ", onFullScreenMessage=" + this.onFullScreenMessage + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsByRewardsOffersQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "productsByRewardsOffers", "Lcom/woolworths/product/list/legacy/ProductsByRewardsOffersQuery$ProductsByRewardsOffers;", "<init>", "(Lcom/woolworths/product/list/legacy/ProductsByRewardsOffersQuery$ProductsByRewardsOffers;)V", "getProductsByRewardsOffers", "()Lcom/woolworths/product/list/legacy/ProductsByRewardsOffersQuery$ProductsByRewardsOffers;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {
        public static final int $stable = 8;

        @Nullable
        private final ProductsByRewardsOffers productsByRewardsOffers;

        public Data(@Nullable ProductsByRewardsOffers productsByRewardsOffers) {
            this.productsByRewardsOffers = productsByRewardsOffers;
        }

        public static /* synthetic */ Data copy$default(Data data, ProductsByRewardsOffers productsByRewardsOffers, int i, Object obj) {
            if ((i & 1) != 0) {
                productsByRewardsOffers = data.productsByRewardsOffers;
            }
            return data.copy(productsByRewardsOffers);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final ProductsByRewardsOffers getProductsByRewardsOffers() {
            return this.productsByRewardsOffers;
        }

        @NotNull
        public final Data copy(@Nullable ProductsByRewardsOffers productsByRewardsOffers) {
            return new Data(productsByRewardsOffers);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Data) && Intrinsics.c(this.productsByRewardsOffers, ((Data) other).productsByRewardsOffers);
        }

        @Nullable
        public final ProductsByRewardsOffers getProductsByRewardsOffers() {
            return this.productsByRewardsOffers;
        }

        public int hashCode() {
            ProductsByRewardsOffers productsByRewardsOffers = this.productsByRewardsOffers;
            if (productsByRewardsOffers == null) {
                return 0;
            }
            return productsByRewardsOffers.hashCode();
        }

        @NotNull
        public String toString() {
            return "Data(productsByRewardsOffers=" + this.productsByRewardsOffers + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003JI\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u0006$"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsByRewardsOffersQuery$MessageAsset;", "", "assetType", "Lau/com/woolworths/shop/graphql/type/DownloadableAssetType;", "assetUrl", "", "assetWidth", "", "assetHeight", "fit", "Lau/com/woolworths/shop/graphql/type/DownloadableAssetFit;", "altText", "<init>", "(Lau/com/woolworths/shop/graphql/type/DownloadableAssetType;Ljava/lang/String;IILau/com/woolworths/shop/graphql/type/DownloadableAssetFit;Ljava/lang/String;)V", "getAssetType", "()Lau/com/woolworths/shop/graphql/type/DownloadableAssetType;", "getAssetUrl", "()Ljava/lang/String;", "getAssetWidth", "()I", "getAssetHeight", "getFit", "()Lau/com/woolworths/shop/graphql/type/DownloadableAssetFit;", "getAltText", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MessageAsset {
        public static final int $stable = 0;

        @Nullable
        private final String altText;
        private final int assetHeight;

        @NotNull
        private final DownloadableAssetType assetType;

        @NotNull
        private final String assetUrl;
        private final int assetWidth;

        @Nullable
        private final DownloadableAssetFit fit;

        public MessageAsset(@NotNull DownloadableAssetType assetType, @NotNull String assetUrl, int i, int i2, @Nullable DownloadableAssetFit downloadableAssetFit, @Nullable String str) {
            Intrinsics.h(assetType, "assetType");
            Intrinsics.h(assetUrl, "assetUrl");
            this.assetType = assetType;
            this.assetUrl = assetUrl;
            this.assetWidth = i;
            this.assetHeight = i2;
            this.fit = downloadableAssetFit;
            this.altText = str;
        }

        public static /* synthetic */ MessageAsset copy$default(MessageAsset messageAsset, DownloadableAssetType downloadableAssetType, String str, int i, int i2, DownloadableAssetFit downloadableAssetFit, String str2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                downloadableAssetType = messageAsset.assetType;
            }
            if ((i3 & 2) != 0) {
                str = messageAsset.assetUrl;
            }
            if ((i3 & 4) != 0) {
                i = messageAsset.assetWidth;
            }
            if ((i3 & 8) != 0) {
                i2 = messageAsset.assetHeight;
            }
            if ((i3 & 16) != 0) {
                downloadableAssetFit = messageAsset.fit;
            }
            if ((i3 & 32) != 0) {
                str2 = messageAsset.altText;
            }
            DownloadableAssetFit downloadableAssetFit2 = downloadableAssetFit;
            String str3 = str2;
            return messageAsset.copy(downloadableAssetType, str, i, i2, downloadableAssetFit2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final DownloadableAssetType getAssetType() {
            return this.assetType;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getAssetUrl() {
            return this.assetUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final int getAssetWidth() {
            return this.assetWidth;
        }

        /* renamed from: component4, reason: from getter */
        public final int getAssetHeight() {
            return this.assetHeight;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final DownloadableAssetFit getFit() {
            return this.fit;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final String getAltText() {
            return this.altText;
        }

        @NotNull
        public final MessageAsset copy(@NotNull DownloadableAssetType assetType, @NotNull String assetUrl, int assetWidth, int assetHeight, @Nullable DownloadableAssetFit fit, @Nullable String altText) {
            Intrinsics.h(assetType, "assetType");
            Intrinsics.h(assetUrl, "assetUrl");
            return new MessageAsset(assetType, assetUrl, assetWidth, assetHeight, fit, altText);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MessageAsset)) {
                return false;
            }
            MessageAsset messageAsset = (MessageAsset) other;
            return this.assetType == messageAsset.assetType && Intrinsics.c(this.assetUrl, messageAsset.assetUrl) && this.assetWidth == messageAsset.assetWidth && this.assetHeight == messageAsset.assetHeight && this.fit == messageAsset.fit && Intrinsics.c(this.altText, messageAsset.altText);
        }

        @Nullable
        public final String getAltText() {
            return this.altText;
        }

        public final int getAssetHeight() {
            return this.assetHeight;
        }

        @NotNull
        public final DownloadableAssetType getAssetType() {
            return this.assetType;
        }

        @NotNull
        public final String getAssetUrl() {
            return this.assetUrl;
        }

        public final int getAssetWidth() {
            return this.assetWidth;
        }

        @Nullable
        public final DownloadableAssetFit getFit() {
            return this.fit;
        }

        public int hashCode() {
            int iA = b.a(this.assetHeight, b.a(this.assetWidth, b.c(this.assetType.hashCode() * 31, 31, this.assetUrl), 31), 31);
            DownloadableAssetFit downloadableAssetFit = this.fit;
            int iHashCode = (iA + (downloadableAssetFit == null ? 0 : downloadableAssetFit.hashCode())) * 31;
            String str = this.altText;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            DownloadableAssetType downloadableAssetType = this.assetType;
            String str = this.assetUrl;
            int i = this.assetWidth;
            int i2 = this.assetHeight;
            DownloadableAssetFit downloadableAssetFit = this.fit;
            String str2 = this.altText;
            StringBuilder sb = new StringBuilder("MessageAsset(assetType=");
            sb.append(downloadableAssetType);
            sb.append(", assetUrl=");
            sb.append(str);
            sb.append(", assetWidth=");
            a.w(i, i2, ", assetHeight=", ", fit=", sb);
            sb.append(downloadableAssetFit);
            sb.append(", altText=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u001e\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\r¨\u0006\""}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsByRewardsOffersQuery$MessageButton;", "", AnnotatedPrivateKey.LABEL, "", "style", "Lau/com/woolworths/shop/graphql/type/ButtonStyle;", "enabled", "", UrlHandler.ACTION, "url", "<init>", "(Ljava/lang/String;Lau/com/woolworths/shop/graphql/type/ButtonStyle;ZLjava/lang/String;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getStyle", "()Lau/com/woolworths/shop/graphql/type/ButtonStyle;", "getEnabled", "()Z", "getAction$annotations", "()V", "getAction", "getUrl$annotations", "getUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MessageButton {
        public static final int $stable = 0;

        @Nullable
        private final String action;
        private final boolean enabled;

        @NotNull
        private final String label;

        @Nullable
        private final ButtonStyle style;

        @Nullable
        private final String url;

        public MessageButton(@NotNull String label, @Nullable ButtonStyle buttonStyle, boolean z, @Nullable String str, @Nullable String str2) {
            Intrinsics.h(label, "label");
            this.label = label;
            this.style = buttonStyle;
            this.enabled = z;
            this.action = str;
            this.url = str2;
        }

        public static /* synthetic */ MessageButton copy$default(MessageButton messageButton, String str, ButtonStyle buttonStyle, boolean z, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = messageButton.label;
            }
            if ((i & 2) != 0) {
                buttonStyle = messageButton.style;
            }
            if ((i & 4) != 0) {
                z = messageButton.enabled;
            }
            if ((i & 8) != 0) {
                str2 = messageButton.action;
            }
            if ((i & 16) != 0) {
                str3 = messageButton.url;
            }
            String str4 = str3;
            boolean z2 = z;
            return messageButton.copy(str, buttonStyle, z2, str2, str4);
        }

        @Deprecated
        public static /* synthetic */ void getAction$annotations() {
        }

        @Deprecated
        public static /* synthetic */ void getUrl$annotations() {
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final ButtonStyle getStyle() {
            return this.style;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        public final MessageButton copy(@NotNull String label, @Nullable ButtonStyle style, boolean enabled, @Nullable String action, @Nullable String url) {
            Intrinsics.h(label, "label");
            return new MessageButton(label, style, enabled, action, url);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MessageButton)) {
                return false;
            }
            MessageButton messageButton = (MessageButton) other;
            return Intrinsics.c(this.label, messageButton.label) && this.style == messageButton.style && this.enabled == messageButton.enabled && Intrinsics.c(this.action, messageButton.action) && Intrinsics.c(this.url, messageButton.url);
        }

        @Nullable
        public final String getAction() {
            return this.action;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        @NotNull
        public final String getLabel() {
            return this.label;
        }

        @Nullable
        public final ButtonStyle getStyle() {
            return this.style;
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int iHashCode = this.label.hashCode() * 31;
            ButtonStyle buttonStyle = this.style;
            int iE = b.e((iHashCode + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31, 31, this.enabled);
            String str = this.action;
            int iHashCode2 = (iE + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.url;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.label;
            ButtonStyle buttonStyle = this.style;
            boolean z = this.enabled;
            String str2 = this.action;
            String str3 = this.url;
            StringBuilder sbQ = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.q("MessageButton(label=", str, ", style=", buttonStyle, ", enabled=");
            au.com.woolworths.android.onesite.a.y(", action=", str2, ", url=", sbQ, z);
            return a.o(sbQ, str3, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsByRewardsOffersQuery$OnFullScreenMessage;", "", "messageTitle", "", "messageDescription", "messageAsset", "Lcom/woolworths/product/list/legacy/ProductsByRewardsOffersQuery$MessageAsset;", "messageButtons", "", "Lcom/woolworths/product/list/legacy/ProductsByRewardsOffersQuery$MessageButton;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductsByRewardsOffersQuery$MessageAsset;Ljava/util/List;)V", "getMessageTitle", "()Ljava/lang/String;", "getMessageDescription", "getMessageAsset", "()Lcom/woolworths/product/list/legacy/ProductsByRewardsOffersQuery$MessageAsset;", "getMessageButtons", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnFullScreenMessage {
        public static final int $stable = 8;

        @Nullable
        private final MessageAsset messageAsset;

        @NotNull
        private final List<MessageButton> messageButtons;

        @Nullable
        private final String messageDescription;

        @Nullable
        private final String messageTitle;

        public OnFullScreenMessage(@Nullable String str, @Nullable String str2, @Nullable MessageAsset messageAsset, @NotNull List<MessageButton> messageButtons) {
            Intrinsics.h(messageButtons, "messageButtons");
            this.messageTitle = str;
            this.messageDescription = str2;
            this.messageAsset = messageAsset;
            this.messageButtons = messageButtons;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OnFullScreenMessage copy$default(OnFullScreenMessage onFullScreenMessage, String str, String str2, MessageAsset messageAsset, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onFullScreenMessage.messageTitle;
            }
            if ((i & 2) != 0) {
                str2 = onFullScreenMessage.messageDescription;
            }
            if ((i & 4) != 0) {
                messageAsset = onFullScreenMessage.messageAsset;
            }
            if ((i & 8) != 0) {
                list = onFullScreenMessage.messageButtons;
            }
            return onFullScreenMessage.copy(str, str2, messageAsset, list);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getMessageTitle() {
            return this.messageTitle;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getMessageDescription() {
            return this.messageDescription;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final MessageAsset getMessageAsset() {
            return this.messageAsset;
        }

        @NotNull
        public final List<MessageButton> component4() {
            return this.messageButtons;
        }

        @NotNull
        public final OnFullScreenMessage copy(@Nullable String messageTitle, @Nullable String messageDescription, @Nullable MessageAsset messageAsset, @NotNull List<MessageButton> messageButtons) {
            Intrinsics.h(messageButtons, "messageButtons");
            return new OnFullScreenMessage(messageTitle, messageDescription, messageAsset, messageButtons);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnFullScreenMessage)) {
                return false;
            }
            OnFullScreenMessage onFullScreenMessage = (OnFullScreenMessage) other;
            return Intrinsics.c(this.messageTitle, onFullScreenMessage.messageTitle) && Intrinsics.c(this.messageDescription, onFullScreenMessage.messageDescription) && Intrinsics.c(this.messageAsset, onFullScreenMessage.messageAsset) && Intrinsics.c(this.messageButtons, onFullScreenMessage.messageButtons);
        }

        @Nullable
        public final MessageAsset getMessageAsset() {
            return this.messageAsset;
        }

        @NotNull
        public final List<MessageButton> getMessageButtons() {
            return this.messageButtons;
        }

        @Nullable
        public final String getMessageDescription() {
            return this.messageDescription;
        }

        @Nullable
        public final String getMessageTitle() {
            return this.messageTitle;
        }

        public int hashCode() {
            String str = this.messageTitle;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.messageDescription;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            MessageAsset messageAsset = this.messageAsset;
            return this.messageButtons.hashCode() + ((iHashCode2 + (messageAsset != null ? messageAsset.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.messageTitle;
            String str2 = this.messageDescription;
            MessageAsset messageAsset = this.messageAsset;
            List<MessageButton> list = this.messageButtons;
            StringBuilder sbV = a.v("OnFullScreenMessage(messageTitle=", str, ", messageDescription=", str2, ", messageAsset=");
            sbV.append(messageAsset);
            sbV.append(", messageButtons=");
            sbV.append(list);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsByRewardsOffersQuery$OnPopupMessage;", "", "messageTitle", "", "messageDescription", "messageCtaLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMessageTitle", "()Ljava/lang/String;", "getMessageDescription", "getMessageCtaLabel", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPopupMessage {
        public static final int $stable = 0;

        @Nullable
        private final String messageCtaLabel;

        @Nullable
        private final String messageDescription;

        @Nullable
        private final String messageTitle;

        public OnPopupMessage(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.messageTitle = str;
            this.messageDescription = str2;
            this.messageCtaLabel = str3;
        }

        public static /* synthetic */ OnPopupMessage copy$default(OnPopupMessage onPopupMessage, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onPopupMessage.messageTitle;
            }
            if ((i & 2) != 0) {
                str2 = onPopupMessage.messageDescription;
            }
            if ((i & 4) != 0) {
                str3 = onPopupMessage.messageCtaLabel;
            }
            return onPopupMessage.copy(str, str2, str3);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getMessageTitle() {
            return this.messageTitle;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getMessageDescription() {
            return this.messageDescription;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getMessageCtaLabel() {
            return this.messageCtaLabel;
        }

        @NotNull
        public final OnPopupMessage copy(@Nullable String messageTitle, @Nullable String messageDescription, @Nullable String messageCtaLabel) {
            return new OnPopupMessage(messageTitle, messageDescription, messageCtaLabel);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnPopupMessage)) {
                return false;
            }
            OnPopupMessage onPopupMessage = (OnPopupMessage) other;
            return Intrinsics.c(this.messageTitle, onPopupMessage.messageTitle) && Intrinsics.c(this.messageDescription, onPopupMessage.messageDescription) && Intrinsics.c(this.messageCtaLabel, onPopupMessage.messageCtaLabel);
        }

        @Nullable
        public final String getMessageCtaLabel() {
            return this.messageCtaLabel;
        }

        @Nullable
        public final String getMessageDescription() {
            return this.messageDescription;
        }

        @Nullable
        public final String getMessageTitle() {
            return this.messageTitle;
        }

        public int hashCode() {
            String str = this.messageTitle;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.messageDescription;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.messageCtaLabel;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.messageTitle;
            String str2 = this.messageDescription;
            return a.o(a.v("OnPopupMessage(messageTitle=", str, ", messageDescription=", str2, ", messageCtaLabel="), this.messageCtaLabel, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsByRewardsOffersQuery$OnProductCard;", "", "__typename", "", "productCard", "Lau/com/woolworths/graphql/common/fragment/ProductCard;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/graphql/common/fragment/ProductCard;)V", "get__typename", "()Ljava/lang/String;", "getProductCard", "()Lau/com/woolworths/graphql/common/fragment/ProductCard;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J:\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsByRewardsOffersQuery$ProductsByRewardsOffers;", "", "totalNumberOfProducts", "", "productsFeed", "", "Lcom/woolworths/product/list/legacy/ProductsByRewardsOffersQuery$ProductsFeed;", "customMessages", "Lcom/woolworths/product/list/legacy/ProductsByRewardsOffersQuery$CustomMessage;", "<init>", "(Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)V", "getTotalNumberOfProducts", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getProductsFeed", "()Ljava/util/List;", "getCustomMessages", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)Lcom/woolworths/product/list/legacy/ProductsByRewardsOffersQuery$ProductsByRewardsOffers;", "equals", "", "other", "hashCode", "toString", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductsByRewardsOffers {
        public static final int $stable = 8;

        @NotNull
        private final List<CustomMessage> customMessages;

        @NotNull
        private final List<ProductsFeed> productsFeed;

        @Nullable
        private final Integer totalNumberOfProducts;

        public ProductsByRewardsOffers(@Nullable Integer num, @NotNull List<ProductsFeed> productsFeed, @NotNull List<CustomMessage> customMessages) {
            Intrinsics.h(productsFeed, "productsFeed");
            Intrinsics.h(customMessages, "customMessages");
            this.totalNumberOfProducts = num;
            this.productsFeed = productsFeed;
            this.customMessages = customMessages;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ProductsByRewardsOffers copy$default(ProductsByRewardsOffers productsByRewardsOffers, Integer num, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                num = productsByRewardsOffers.totalNumberOfProducts;
            }
            if ((i & 2) != 0) {
                list = productsByRewardsOffers.productsFeed;
            }
            if ((i & 4) != 0) {
                list2 = productsByRewardsOffers.customMessages;
            }
            return productsByRewardsOffers.copy(num, list, list2);
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
        public final List<CustomMessage> component3() {
            return this.customMessages;
        }

        @NotNull
        public final ProductsByRewardsOffers copy(@Nullable Integer totalNumberOfProducts, @NotNull List<ProductsFeed> productsFeed, @NotNull List<CustomMessage> customMessages) {
            Intrinsics.h(productsFeed, "productsFeed");
            Intrinsics.h(customMessages, "customMessages");
            return new ProductsByRewardsOffers(totalNumberOfProducts, productsFeed, customMessages);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductsByRewardsOffers)) {
                return false;
            }
            ProductsByRewardsOffers productsByRewardsOffers = (ProductsByRewardsOffers) other;
            return Intrinsics.c(this.totalNumberOfProducts, productsByRewardsOffers.totalNumberOfProducts) && Intrinsics.c(this.productsFeed, productsByRewardsOffers.productsFeed) && Intrinsics.c(this.customMessages, productsByRewardsOffers.customMessages);
        }

        @NotNull
        public final List<CustomMessage> getCustomMessages() {
            return this.customMessages;
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
            return this.customMessages.hashCode() + b.d((num == null ? 0 : num.hashCode()) * 31, 31, this.productsFeed);
        }

        @NotNull
        public String toString() {
            Integer num = this.totalNumberOfProducts;
            List<ProductsFeed> list = this.productsFeed;
            List<CustomMessage> list2 = this.customMessages;
            StringBuilder sb = new StringBuilder("ProductsByRewardsOffers(totalNumberOfProducts=");
            sb.append(num);
            sb.append(", productsFeed=");
            sb.append(list);
            sb.append(", customMessages=");
            return android.support.v4.media.session.a.t(sb, list2, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsByRewardsOffersQuery$ProductsFeed;", "", "__typename", "", "onProductCard", "Lcom/woolworths/product/list/legacy/ProductsByRewardsOffersQuery$OnProductCard;", "<init>", "(Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductsByRewardsOffersQuery$OnProductCard;)V", "get__typename", "()Ljava/lang/String;", "getOnProductCard", "()Lcom/woolworths/product/list/legacy/ProductsByRewardsOffersQuery$OnProductCard;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    /* JADX WARN: Multi-variable type inference failed */
    public ProductsByRewardsOffersQuery(@NotNull Optional<String> storeId, @NotNull Optional<String> hashCrn, @NotNull List<? extends RewardsOfferStatus> offerStatus, boolean z, boolean z2, @NotNull Optional<Boolean> includeAvailabilityInfoStatus, @NotNull Optional<Boolean> includePricingFootnote, boolean z3) {
        Intrinsics.h(storeId, "storeId");
        Intrinsics.h(hashCrn, "hashCrn");
        Intrinsics.h(offerStatus, "offerStatus");
        Intrinsics.h(includeAvailabilityInfoStatus, "includeAvailabilityInfoStatus");
        Intrinsics.h(includePricingFootnote, "includePricingFootnote");
        this.storeId = storeId;
        this.hashCrn = hashCrn;
        this.offerStatus = offerStatus;
        this.includeProductAvailabilityStates = z;
        this.includeOfferMinimumSpend = z2;
        this.includeAvailabilityInfoStatus = includeAvailabilityInfoStatus;
        this.includePricingFootnote = includePricingFootnote;
        this.includeLowestPrice14Days = z3;
    }

    public static /* synthetic */ ProductsByRewardsOffersQuery copy$default(ProductsByRewardsOffersQuery productsByRewardsOffersQuery, Optional optional, Optional optional2, List list, boolean z, boolean z2, Optional optional3, Optional optional4, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            optional = productsByRewardsOffersQuery.storeId;
        }
        if ((i & 2) != 0) {
            optional2 = productsByRewardsOffersQuery.hashCrn;
        }
        if ((i & 4) != 0) {
            list = productsByRewardsOffersQuery.offerStatus;
        }
        if ((i & 8) != 0) {
            z = productsByRewardsOffersQuery.includeProductAvailabilityStates;
        }
        if ((i & 16) != 0) {
            z2 = productsByRewardsOffersQuery.includeOfferMinimumSpend;
        }
        if ((i & 32) != 0) {
            optional3 = productsByRewardsOffersQuery.includeAvailabilityInfoStatus;
        }
        if ((i & 64) != 0) {
            optional4 = productsByRewardsOffersQuery.includePricingFootnote;
        }
        if ((i & 128) != 0) {
            z3 = productsByRewardsOffersQuery.includeLowestPrice14Days;
        }
        Optional optional5 = optional4;
        boolean z4 = z3;
        boolean z5 = z2;
        Optional optional6 = optional3;
        return productsByRewardsOffersQuery.copy(optional, optional2, list, z, z5, optional6, optional5, z4);
    }

    @Override // com.apollographql.apollo.api.Executable
    @NotNull
    public Adapter<Data> adapter() {
        return Adapters.c(ProductsByRewardsOffersQuery_ResponseAdapter.Data.INSTANCE, false);
    }

    @NotNull
    public final Optional<String> component1() {
        return this.storeId;
    }

    @NotNull
    public final Optional<String> component2() {
        return this.hashCrn;
    }

    @NotNull
    public final List<RewardsOfferStatus> component3() {
        return this.offerStatus;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIncludeProductAvailabilityStates() {
        return this.includeProductAvailabilityStates;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIncludeOfferMinimumSpend() {
        return this.includeOfferMinimumSpend;
    }

    @NotNull
    public final Optional<Boolean> component6() {
        return this.includeAvailabilityInfoStatus;
    }

    @NotNull
    public final Optional<Boolean> component7() {
        return this.includePricingFootnote;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIncludeLowestPrice14Days() {
        return this.includeLowestPrice14Days;
    }

    @NotNull
    public final ProductsByRewardsOffersQuery copy(@NotNull Optional<String> storeId, @NotNull Optional<String> hashCrn, @NotNull List<? extends RewardsOfferStatus> offerStatus, boolean includeProductAvailabilityStates, boolean includeOfferMinimumSpend, @NotNull Optional<Boolean> includeAvailabilityInfoStatus, @NotNull Optional<Boolean> includePricingFootnote, boolean includeLowestPrice14Days) {
        Intrinsics.h(storeId, "storeId");
        Intrinsics.h(hashCrn, "hashCrn");
        Intrinsics.h(offerStatus, "offerStatus");
        Intrinsics.h(includeAvailabilityInfoStatus, "includeAvailabilityInfoStatus");
        Intrinsics.h(includePricingFootnote, "includePricingFootnote");
        return new ProductsByRewardsOffersQuery(storeId, hashCrn, offerStatus, includeProductAvailabilityStates, includeOfferMinimumSpend, includeAvailabilityInfoStatus, includePricingFootnote, includeLowestPrice14Days);
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
        if (!(other instanceof ProductsByRewardsOffersQuery)) {
            return false;
        }
        ProductsByRewardsOffersQuery productsByRewardsOffersQuery = (ProductsByRewardsOffersQuery) other;
        return Intrinsics.c(this.storeId, productsByRewardsOffersQuery.storeId) && Intrinsics.c(this.hashCrn, productsByRewardsOffersQuery.hashCrn) && Intrinsics.c(this.offerStatus, productsByRewardsOffersQuery.offerStatus) && this.includeProductAvailabilityStates == productsByRewardsOffersQuery.includeProductAvailabilityStates && this.includeOfferMinimumSpend == productsByRewardsOffersQuery.includeOfferMinimumSpend && Intrinsics.c(this.includeAvailabilityInfoStatus, productsByRewardsOffersQuery.includeAvailabilityInfoStatus) && Intrinsics.c(this.includePricingFootnote, productsByRewardsOffersQuery.includePricingFootnote) && this.includeLowestPrice14Days == productsByRewardsOffersQuery.includeLowestPrice14Days;
    }

    @NotNull
    public final Optional<String> getHashCrn() {
        return this.hashCrn;
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
    public final List<RewardsOfferStatus> getOfferStatus() {
        return this.offerStatus;
    }

    @NotNull
    public final Optional<String> getStoreId() {
        return this.storeId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.includeLowestPrice14Days) + au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.includePricingFootnote, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.includeAvailabilityInfoStatus, b.e(b.e(b.d(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.hashCrn, this.storeId.hashCode() * 31, 31), 31, this.offerStatus), 31, this.includeProductAvailabilityStates), 31, this.includeOfferMinimumSpend), 31), 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    @NotNull
    public String id() {
        return "c5f6693725a1bc916c3e9bf62af9d9f50af6d2af25f253b0b0e295acf14252a4";
    }

    @Override // com.apollographql.apollo.api.Operation
    @NotNull
    public String name() {
        return "productsByRewardsOffers";
    }

    @NotNull
    public CompiledField rootField() {
        CompiledField.Builder builder = new CompiledField.Builder("data", au.com.woolworths.shop.graphql.type.Query.H2);
        builder.e(ProductsByRewardsOffersQuerySelections.INSTANCE.get__root());
        return builder.c();
    }

    @Override // com.apollographql.apollo.api.Executable
    public void serializeVariables(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        ProductsByRewardsOffersQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @NotNull
    public String toString() {
        Optional<String> optional = this.storeId;
        Optional<String> optional2 = this.hashCrn;
        List<RewardsOfferStatus> list = this.offerStatus;
        boolean z = this.includeProductAvailabilityStates;
        boolean z2 = this.includeOfferMinimumSpend;
        Optional<Boolean> optional3 = this.includeAvailabilityInfoStatus;
        Optional<Boolean> optional4 = this.includePricingFootnote;
        boolean z3 = this.includeLowestPrice14Days;
        StringBuilder sbP = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.p("ProductsByRewardsOffersQuery(storeId=", optional, ", hashCrn=", optional2, ", offerStatus=");
        sbP.append(list);
        sbP.append(", includeProductAvailabilityStates=");
        sbP.append(z);
        sbP.append(", includeOfferMinimumSpend=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.z(sbP, z2, ", includeAvailabilityInfoStatus=", optional3, ", includePricingFootnote=");
        sbP.append(optional4);
        sbP.append(", includeLowestPrice14Days=");
        sbP.append(z3);
        sbP.append(")");
        return sbP.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ProductsByRewardsOffersQuery(Optional optional, Optional optional2, List list, boolean z, boolean z2, Optional optional3, Optional optional4, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z4;
        Optional optional5;
        int i2 = i & 1;
        Optional.Absent absent = Optional.Absent.f13523a;
        optional = i2 != 0 ? absent : optional;
        optional2 = (i & 2) != 0 ? absent : optional2;
        optional3 = (i & 32) != 0 ? absent : optional3;
        if ((i & 64) != 0) {
            z4 = z3;
            optional5 = absent;
        } else {
            z4 = z3;
            optional5 = optional4;
        }
        this(optional, optional2, list, z, z2, optional3, optional5, z4);
    }
}
