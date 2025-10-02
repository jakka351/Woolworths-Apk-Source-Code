package au.com.woolworths.shop.lists.data.remote;

import YU.a;
import androidx.camera.core.impl.b;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.shop.graphql.type.AlternativeProductsType;
import au.com.woolworths.shop.graphql.type.GetAlternativeProductsInput;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.lists.data.remote.adapter.AlternativeProductsQuery_ResponseAdapter;
import au.com.woolworths.shop.lists.data.remote.adapter.AlternativeProductsQuery_VariablesAdapter;
import au.com.woolworths.shop.lists.data.remote.selections.AlternativeProductsQuerySelections;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u0000 B2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00103456789:;<=>?@ABBG\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u0018H\u0016J \u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0006H\u0016J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020#H\u0016J\b\u0010$\u001a\u00020%H\u0016J\t\u0010&\u001a\u00020\u0004HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003JQ\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010-\u001a\u00020\u00062\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011¨\u0006C"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$Data;", "getAlternativeProductsInput", "Lau/com/woolworths/shop/graphql/type/GetAlternativeProductsInput;", "includeProductAvailabilityStates", "", "includeOfferMinimumSpend", "includeAvailabilityInfoStatus", "Lcom/apollographql/apollo/api/Optional;", "includePricingFootnote", "includeLowestPrice14Days", "<init>", "(Lau/com/woolworths/shop/graphql/type/GetAlternativeProductsInput;ZZLcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Z)V", "getGetAlternativeProductsInput", "()Lau/com/woolworths/shop/graphql/type/GetAlternativeProductsInput;", "getIncludeProductAvailabilityStates", "()Z", "getIncludeOfferMinimumSpend", "getIncludeAvailabilityInfoStatus", "()Lcom/apollographql/apollo/api/Optional;", "getIncludePricingFootnote", "getIncludeLowestPrice14Days", "id", "", "document", AppMeasurementSdk.ConditionalUserProperty.NAME, "serializeVariables", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "withDefaultValues", "adapter", "Lcom/apollographql/apollo/api/Adapter;", "rootField", "Lcom/apollographql/apollo/api/CompiledField;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "Data", "GetAlternativeProducts", "Section", "OnAlternativeProductsTargetProductSection", "TargetProduct", "OnAlternativeProductsProductSection", "Product", "SectionHeader", "Disclaimer", "TypeTag", "OnAlternativeProductsNoResultSection", "OnAlternativeProductsCtaSection", "OnAlternativeProductsInsetBannerSection", "InsetBanner", "Disclaimer1", "Companion", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AlternativeProductsQuery implements Query<Data> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String OPERATION_ID = "530cd69741cf3c1fe69088966d99315c686fe2dfd3782a2f9340802c61fc481e";

    @NotNull
    public static final String OPERATION_NAME = "alternativeProducts";

    @NotNull
    private final GetAlternativeProductsInput getAlternativeProductsInput;

    @NotNull
    private final Optional<Boolean> includeAvailabilityInfoStatus;
    private final boolean includeLowestPrice14Days;
    private final boolean includeOfferMinimumSpend;

    @NotNull
    private final Optional<Boolean> includePricingFootnote;
    private final boolean includeProductAvailabilityStates;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$Companion;", "", "<init>", "()V", "OPERATION_ID", "", "OPERATION_DOCUMENT", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_NAME", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getOPERATION_DOCUMENT() {
            return "query alternativeProducts($getAlternativeProductsInput: GetAlternativeProductsInput!, $includeProductAvailabilityStates: Boolean!, $includeOfferMinimumSpend: Boolean!, $includeAvailabilityInfoStatus: Boolean! = false , $includePricingFootnote: Boolean! = false , $includeLowestPrice14Days: Boolean!) { getAlternativeProducts(getAlternativeProductsInput: $getAlternativeProductsInput) { sections { __typename ... on AlternativeProductsTargetProductSection { targetProduct: product { __typename ...productCard } } ... on AlternativeProductsProductSection { substitutionSource products { __typename ...productCard } sectionHeader { title disclaimer { title subtitle dismissCtaText } typeTag { swapType text } } } ... on AlternativeProductsNoResultSection { text } ... on AlternativeProductsCtaSection { text action actionTerm } ... on AlternativeProductsInsetBannerSection { insetBanner { displayType bannerTitle: title message } } } disclaimer { title subtitle dismissCtaText } } }  fragment productTrolley on ProductTrolley { minimum maximum increment defaultValue: default unit inTrolley buttonState buttonLabel buttonQuantity title }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment productCard on ProductCard { productId name isNew purchaseRestriction productImage isAvailable inStoreAvailabilityInfo @include(if: $includeProductAvailabilityStates) { button { label action style enabled } status @include(if: $includeAvailabilityInfoStatus) infoSheet { title message button { label action style enabled } } } price unitOfMeasureLabel badgeImage promotionInfo { type label } unitPriceDescription wasPrice purchaseWarning inlineLabels { type label priority } trolley { __typename ...productTrolley } trolleys { __typename ...productTrolley } list { minimum maximum increment defaultValue: default unit } inStoreDetails { locationText locationType } inStoreLocation { details { aisleNumber aisleSide bayNumber bayNumberAlternate floorNumber location x y z } displayInfo { locationText locationType } } adId source marketplace { imageUrl title sellerName brandName lowestMarketPriceDescription @include(if: $includeLowestPrice14Days) } rewardsOfferInfo { offerId offerStatus displayStatus displayExpiry minimumSpend @include(if: $includeOfferMinimumSpend) offerAnalytics { offerName campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode } boostButton { label style enabled } } disclaimer tagLabel { text style } productVarieties { totalCount label priceFamilyId } categories { name categoryLevel } isTobacco memberPriceInfo { header title subtitle } multiBuyPriceInfo { price unitPrice } cartProductInfo { totalPrice totalOriginalPrice totalDiscount } productCardAnalytics { __typename ...analyticsFields } productCardAction { action type id analytics { __typename ...analyticsFields } } pricingFootnoteMd @include(if: $includePricingFootnote) }";
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "getAlternativeProducts", "Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$GetAlternativeProducts;", "<init>", "(Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$GetAlternativeProducts;)V", "getGetAlternativeProducts", "()Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$GetAlternativeProducts;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        @Nullable
        private final GetAlternativeProducts getAlternativeProducts;

        public Data(@Nullable GetAlternativeProducts getAlternativeProducts) {
            this.getAlternativeProducts = getAlternativeProducts;
        }

        public static /* synthetic */ Data copy$default(Data data, GetAlternativeProducts getAlternativeProducts, int i, Object obj) {
            if ((i & 1) != 0) {
                getAlternativeProducts = data.getAlternativeProducts;
            }
            return data.copy(getAlternativeProducts);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final GetAlternativeProducts getGetAlternativeProducts() {
            return this.getAlternativeProducts;
        }

        @NotNull
        public final Data copy(@Nullable GetAlternativeProducts getAlternativeProducts) {
            return new Data(getAlternativeProducts);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Data) && Intrinsics.c(this.getAlternativeProducts, ((Data) other).getAlternativeProducts);
        }

        @Nullable
        public final GetAlternativeProducts getGetAlternativeProducts() {
            return this.getAlternativeProducts;
        }

        public int hashCode() {
            GetAlternativeProducts getAlternativeProducts = this.getAlternativeProducts;
            if (getAlternativeProducts == null) {
                return 0;
            }
            return getAlternativeProducts.hashCode();
        }

        @NotNull
        public String toString() {
            return "Data(getAlternativeProducts=" + this.getAlternativeProducts + ")";
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$Disclaimer;", "", "title", "", NotificationMessage.NOTIF_KEY_SUB_TITLE, "dismissCtaText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getDismissCtaText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Disclaimer {

        @NotNull
        private final String dismissCtaText;

        @NotNull
        private final String subtitle;

        @NotNull
        private final String title;

        public Disclaimer(@NotNull String title, @NotNull String subtitle, @NotNull String dismissCtaText) {
            Intrinsics.h(title, "title");
            Intrinsics.h(subtitle, "subtitle");
            Intrinsics.h(dismissCtaText, "dismissCtaText");
            this.title = title;
            this.subtitle = subtitle;
            this.dismissCtaText = dismissCtaText;
        }

        public static /* synthetic */ Disclaimer copy$default(Disclaimer disclaimer, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = disclaimer.title;
            }
            if ((i & 2) != 0) {
                str2 = disclaimer.subtitle;
            }
            if ((i & 4) != 0) {
                str3 = disclaimer.dismissCtaText;
            }
            return disclaimer.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getDismissCtaText() {
            return this.dismissCtaText;
        }

        @NotNull
        public final Disclaimer copy(@NotNull String title, @NotNull String subtitle, @NotNull String dismissCtaText) {
            Intrinsics.h(title, "title");
            Intrinsics.h(subtitle, "subtitle");
            Intrinsics.h(dismissCtaText, "dismissCtaText");
            return new Disclaimer(title, subtitle, dismissCtaText);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Disclaimer)) {
                return false;
            }
            Disclaimer disclaimer = (Disclaimer) other;
            return Intrinsics.c(this.title, disclaimer.title) && Intrinsics.c(this.subtitle, disclaimer.subtitle) && Intrinsics.c(this.dismissCtaText, disclaimer.dismissCtaText);
        }

        @NotNull
        public final String getDismissCtaText() {
            return this.dismissCtaText;
        }

        @NotNull
        public final String getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.dismissCtaText.hashCode() + b.c(this.title.hashCode() * 31, 31, this.subtitle);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.subtitle;
            return a.o(a.v("Disclaimer(title=", str, ", subtitle=", str2, ", dismissCtaText="), this.dismissCtaText, ")");
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$Disclaimer1;", "", "title", "", NotificationMessage.NOTIF_KEY_SUB_TITLE, "dismissCtaText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getDismissCtaText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Disclaimer1 {

        @NotNull
        private final String dismissCtaText;

        @NotNull
        private final String subtitle;

        @NotNull
        private final String title;

        public Disclaimer1(@NotNull String title, @NotNull String subtitle, @NotNull String dismissCtaText) {
            Intrinsics.h(title, "title");
            Intrinsics.h(subtitle, "subtitle");
            Intrinsics.h(dismissCtaText, "dismissCtaText");
            this.title = title;
            this.subtitle = subtitle;
            this.dismissCtaText = dismissCtaText;
        }

        public static /* synthetic */ Disclaimer1 copy$default(Disclaimer1 disclaimer1, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = disclaimer1.title;
            }
            if ((i & 2) != 0) {
                str2 = disclaimer1.subtitle;
            }
            if ((i & 4) != 0) {
                str3 = disclaimer1.dismissCtaText;
            }
            return disclaimer1.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getDismissCtaText() {
            return this.dismissCtaText;
        }

        @NotNull
        public final Disclaimer1 copy(@NotNull String title, @NotNull String subtitle, @NotNull String dismissCtaText) {
            Intrinsics.h(title, "title");
            Intrinsics.h(subtitle, "subtitle");
            Intrinsics.h(dismissCtaText, "dismissCtaText");
            return new Disclaimer1(title, subtitle, dismissCtaText);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Disclaimer1)) {
                return false;
            }
            Disclaimer1 disclaimer1 = (Disclaimer1) other;
            return Intrinsics.c(this.title, disclaimer1.title) && Intrinsics.c(this.subtitle, disclaimer1.subtitle) && Intrinsics.c(this.dismissCtaText, disclaimer1.dismissCtaText);
        }

        @NotNull
        public final String getDismissCtaText() {
            return this.dismissCtaText;
        }

        @NotNull
        public final String getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.dismissCtaText.hashCode() + b.c(this.title.hashCode() * 31, 31, this.subtitle);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.subtitle;
            return a.o(a.v("Disclaimer1(title=", str, ", subtitle=", str2, ", dismissCtaText="), this.dismissCtaText, ")");
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$GetAlternativeProducts;", "", "sections", "", "Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$Section;", "disclaimer", "Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$Disclaimer1;", "<init>", "(Ljava/util/List;Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$Disclaimer1;)V", "getSections", "()Ljava/util/List;", "getDisclaimer", "()Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$Disclaimer1;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class GetAlternativeProducts {

        @Nullable
        private final Disclaimer1 disclaimer;

        @NotNull
        private final List<Section> sections;

        public GetAlternativeProducts(@NotNull List<Section> sections, @Nullable Disclaimer1 disclaimer1) {
            Intrinsics.h(sections, "sections");
            this.sections = sections;
            this.disclaimer = disclaimer1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GetAlternativeProducts copy$default(GetAlternativeProducts getAlternativeProducts, List list, Disclaimer1 disclaimer1, int i, Object obj) {
            if ((i & 1) != 0) {
                list = getAlternativeProducts.sections;
            }
            if ((i & 2) != 0) {
                disclaimer1 = getAlternativeProducts.disclaimer;
            }
            return getAlternativeProducts.copy(list, disclaimer1);
        }

        @NotNull
        public final List<Section> component1() {
            return this.sections;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Disclaimer1 getDisclaimer() {
            return this.disclaimer;
        }

        @NotNull
        public final GetAlternativeProducts copy(@NotNull List<Section> sections, @Nullable Disclaimer1 disclaimer) {
            Intrinsics.h(sections, "sections");
            return new GetAlternativeProducts(sections, disclaimer);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GetAlternativeProducts)) {
                return false;
            }
            GetAlternativeProducts getAlternativeProducts = (GetAlternativeProducts) other;
            return Intrinsics.c(this.sections, getAlternativeProducts.sections) && Intrinsics.c(this.disclaimer, getAlternativeProducts.disclaimer);
        }

        @Nullable
        public final Disclaimer1 getDisclaimer() {
            return this.disclaimer;
        }

        @NotNull
        public final List<Section> getSections() {
            return this.sections;
        }

        public int hashCode() {
            int iHashCode = this.sections.hashCode() * 31;
            Disclaimer1 disclaimer1 = this.disclaimer;
            return iHashCode + (disclaimer1 == null ? 0 : disclaimer1.hashCode());
        }

        @NotNull
        public String toString() {
            return "GetAlternativeProducts(sections=" + this.sections + ", disclaimer=" + this.disclaimer + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$InsetBanner;", "", "displayType", "Lau/com/woolworths/shop/graphql/type/InsetBannerDisplayType;", "bannerTitle", "", "message", "<init>", "(Lau/com/woolworths/shop/graphql/type/InsetBannerDisplayType;Ljava/lang/String;Ljava/lang/String;)V", "getDisplayType", "()Lau/com/woolworths/shop/graphql/type/InsetBannerDisplayType;", "getBannerTitle", "()Ljava/lang/String;", "getMessage", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InsetBanner {

        @Nullable
        private final String bannerTitle;

        @NotNull
        private final InsetBannerDisplayType displayType;

        @NotNull
        private final String message;

        public InsetBanner(@NotNull InsetBannerDisplayType displayType, @Nullable String str, @NotNull String message) {
            Intrinsics.h(displayType, "displayType");
            Intrinsics.h(message, "message");
            this.displayType = displayType;
            this.bannerTitle = str;
            this.message = message;
        }

        public static /* synthetic */ InsetBanner copy$default(InsetBanner insetBanner, InsetBannerDisplayType insetBannerDisplayType, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                insetBannerDisplayType = insetBanner.displayType;
            }
            if ((i & 2) != 0) {
                str = insetBanner.bannerTitle;
            }
            if ((i & 4) != 0) {
                str2 = insetBanner.message;
            }
            return insetBanner.copy(insetBannerDisplayType, str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final InsetBannerDisplayType getDisplayType() {
            return this.displayType;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getBannerTitle() {
            return this.bannerTitle;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final InsetBanner copy(@NotNull InsetBannerDisplayType displayType, @Nullable String bannerTitle, @NotNull String message) {
            Intrinsics.h(displayType, "displayType");
            Intrinsics.h(message, "message");
            return new InsetBanner(displayType, bannerTitle, message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InsetBanner)) {
                return false;
            }
            InsetBanner insetBanner = (InsetBanner) other;
            return this.displayType == insetBanner.displayType && Intrinsics.c(this.bannerTitle, insetBanner.bannerTitle) && Intrinsics.c(this.message, insetBanner.message);
        }

        @Nullable
        public final String getBannerTitle() {
            return this.bannerTitle;
        }

        @NotNull
        public final InsetBannerDisplayType getDisplayType() {
            return this.displayType;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int iHashCode = this.displayType.hashCode() * 31;
            String str = this.bannerTitle;
            return this.message.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            InsetBannerDisplayType insetBannerDisplayType = this.displayType;
            String str = this.bannerTitle;
            return a.o(d.u("InsetBanner(displayType=", insetBannerDisplayType, ", bannerTitle=", str, ", message="), this.message, ")");
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$OnAlternativeProductsCtaSection;", "", TextBundle.TEXT_ENTRY, "", UrlHandler.ACTION, "actionTerm", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getAction", "getActionTerm", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnAlternativeProductsCtaSection {

        @NotNull
        private final String action;

        @Nullable
        private final String actionTerm;

        @NotNull
        private final String text;

        public OnAlternativeProductsCtaSection(@NotNull String text, @NotNull String action, @Nullable String str) {
            Intrinsics.h(text, "text");
            Intrinsics.h(action, "action");
            this.text = text;
            this.action = action;
            this.actionTerm = str;
        }

        public static /* synthetic */ OnAlternativeProductsCtaSection copy$default(OnAlternativeProductsCtaSection onAlternativeProductsCtaSection, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onAlternativeProductsCtaSection.text;
            }
            if ((i & 2) != 0) {
                str2 = onAlternativeProductsCtaSection.action;
            }
            if ((i & 4) != 0) {
                str3 = onAlternativeProductsCtaSection.actionTerm;
            }
            return onAlternativeProductsCtaSection.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getActionTerm() {
            return this.actionTerm;
        }

        @NotNull
        public final OnAlternativeProductsCtaSection copy(@NotNull String text, @NotNull String action, @Nullable String actionTerm) {
            Intrinsics.h(text, "text");
            Intrinsics.h(action, "action");
            return new OnAlternativeProductsCtaSection(text, action, actionTerm);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnAlternativeProductsCtaSection)) {
                return false;
            }
            OnAlternativeProductsCtaSection onAlternativeProductsCtaSection = (OnAlternativeProductsCtaSection) other;
            return Intrinsics.c(this.text, onAlternativeProductsCtaSection.text) && Intrinsics.c(this.action, onAlternativeProductsCtaSection.action) && Intrinsics.c(this.actionTerm, onAlternativeProductsCtaSection.actionTerm);
        }

        @NotNull
        public final String getAction() {
            return this.action;
        }

        @Nullable
        public final String getActionTerm() {
            return this.actionTerm;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int iC = b.c(this.text.hashCode() * 31, 31, this.action);
            String str = this.actionTerm;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.text;
            String str2 = this.action;
            return a.o(a.v("OnAlternativeProductsCtaSection(text=", str, ", action=", str2, ", actionTerm="), this.actionTerm, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$OnAlternativeProductsInsetBannerSection;", "", "insetBanner", "Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$InsetBanner;", "<init>", "(Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$InsetBanner;)V", "getInsetBanner", "()Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$InsetBanner;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnAlternativeProductsInsetBannerSection {

        @Nullable
        private final InsetBanner insetBanner;

        public OnAlternativeProductsInsetBannerSection(@Nullable InsetBanner insetBanner) {
            this.insetBanner = insetBanner;
        }

        public static /* synthetic */ OnAlternativeProductsInsetBannerSection copy$default(OnAlternativeProductsInsetBannerSection onAlternativeProductsInsetBannerSection, InsetBanner insetBanner, int i, Object obj) {
            if ((i & 1) != 0) {
                insetBanner = onAlternativeProductsInsetBannerSection.insetBanner;
            }
            return onAlternativeProductsInsetBannerSection.copy(insetBanner);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final InsetBanner getInsetBanner() {
            return this.insetBanner;
        }

        @NotNull
        public final OnAlternativeProductsInsetBannerSection copy(@Nullable InsetBanner insetBanner) {
            return new OnAlternativeProductsInsetBannerSection(insetBanner);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnAlternativeProductsInsetBannerSection) && Intrinsics.c(this.insetBanner, ((OnAlternativeProductsInsetBannerSection) other).insetBanner);
        }

        @Nullable
        public final InsetBanner getInsetBanner() {
            return this.insetBanner;
        }

        public int hashCode() {
            InsetBanner insetBanner = this.insetBanner;
            if (insetBanner == null) {
                return 0;
            }
            return insetBanner.hashCode();
        }

        @NotNull
        public String toString() {
            return "OnAlternativeProductsInsetBannerSection(insetBanner=" + this.insetBanner + ")";
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$OnAlternativeProductsNoResultSection;", "", TextBundle.TEXT_ENTRY, "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnAlternativeProductsNoResultSection {

        @NotNull
        private final String text;

        public OnAlternativeProductsNoResultSection(@NotNull String text) {
            Intrinsics.h(text, "text");
            this.text = text;
        }

        public static /* synthetic */ OnAlternativeProductsNoResultSection copy$default(OnAlternativeProductsNoResultSection onAlternativeProductsNoResultSection, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onAlternativeProductsNoResultSection.text;
            }
            return onAlternativeProductsNoResultSection.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final OnAlternativeProductsNoResultSection copy(@NotNull String text) {
            Intrinsics.h(text, "text");
            return new OnAlternativeProductsNoResultSection(text);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnAlternativeProductsNoResultSection) && Intrinsics.c(this.text, ((OnAlternativeProductsNoResultSection) other).text);
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        @NotNull
        public String toString() {
            return a.h("OnAlternativeProductsNoResultSection(text=", this.text, ")");
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$OnAlternativeProductsProductSection;", "", "substitutionSource", "", "products", "", "Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$Product;", "sectionHeader", "Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$SectionHeader;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$SectionHeader;)V", "getSubstitutionSource", "()Ljava/lang/String;", "getProducts", "()Ljava/util/List;", "getSectionHeader", "()Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$SectionHeader;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnAlternativeProductsProductSection {

        @NotNull
        private final List<Product> products;

        @Nullable
        private final SectionHeader sectionHeader;

        @NotNull
        private final String substitutionSource;

        public OnAlternativeProductsProductSection(@NotNull String substitutionSource, @NotNull List<Product> products, @Nullable SectionHeader sectionHeader) {
            Intrinsics.h(substitutionSource, "substitutionSource");
            Intrinsics.h(products, "products");
            this.substitutionSource = substitutionSource;
            this.products = products;
            this.sectionHeader = sectionHeader;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OnAlternativeProductsProductSection copy$default(OnAlternativeProductsProductSection onAlternativeProductsProductSection, String str, List list, SectionHeader sectionHeader, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onAlternativeProductsProductSection.substitutionSource;
            }
            if ((i & 2) != 0) {
                list = onAlternativeProductsProductSection.products;
            }
            if ((i & 4) != 0) {
                sectionHeader = onAlternativeProductsProductSection.sectionHeader;
            }
            return onAlternativeProductsProductSection.copy(str, list, sectionHeader);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getSubstitutionSource() {
            return this.substitutionSource;
        }

        @NotNull
        public final List<Product> component2() {
            return this.products;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final SectionHeader getSectionHeader() {
            return this.sectionHeader;
        }

        @NotNull
        public final OnAlternativeProductsProductSection copy(@NotNull String substitutionSource, @NotNull List<Product> products, @Nullable SectionHeader sectionHeader) {
            Intrinsics.h(substitutionSource, "substitutionSource");
            Intrinsics.h(products, "products");
            return new OnAlternativeProductsProductSection(substitutionSource, products, sectionHeader);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnAlternativeProductsProductSection)) {
                return false;
            }
            OnAlternativeProductsProductSection onAlternativeProductsProductSection = (OnAlternativeProductsProductSection) other;
            return Intrinsics.c(this.substitutionSource, onAlternativeProductsProductSection.substitutionSource) && Intrinsics.c(this.products, onAlternativeProductsProductSection.products) && Intrinsics.c(this.sectionHeader, onAlternativeProductsProductSection.sectionHeader);
        }

        @NotNull
        public final List<Product> getProducts() {
            return this.products;
        }

        @Nullable
        public final SectionHeader getSectionHeader() {
            return this.sectionHeader;
        }

        @NotNull
        public final String getSubstitutionSource() {
            return this.substitutionSource;
        }

        public int hashCode() {
            int iD = b.d(this.substitutionSource.hashCode() * 31, 31, this.products);
            SectionHeader sectionHeader = this.sectionHeader;
            return iD + (sectionHeader == null ? 0 : sectionHeader.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.substitutionSource;
            List<Product> list = this.products;
            SectionHeader sectionHeader = this.sectionHeader;
            StringBuilder sbS = au.com.woolworths.android.onesite.a.s("OnAlternativeProductsProductSection(substitutionSource=", str, ", products=", ", sectionHeader=", list);
            sbS.append(sectionHeader);
            sbS.append(")");
            return sbS.toString();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$OnAlternativeProductsTargetProductSection;", "", "targetProduct", "Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$TargetProduct;", "<init>", "(Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$TargetProduct;)V", "getTargetProduct", "()Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$TargetProduct;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnAlternativeProductsTargetProductSection {

        @NotNull
        private final TargetProduct targetProduct;

        public OnAlternativeProductsTargetProductSection(@NotNull TargetProduct targetProduct) {
            Intrinsics.h(targetProduct, "targetProduct");
            this.targetProduct = targetProduct;
        }

        public static /* synthetic */ OnAlternativeProductsTargetProductSection copy$default(OnAlternativeProductsTargetProductSection onAlternativeProductsTargetProductSection, TargetProduct targetProduct, int i, Object obj) {
            if ((i & 1) != 0) {
                targetProduct = onAlternativeProductsTargetProductSection.targetProduct;
            }
            return onAlternativeProductsTargetProductSection.copy(targetProduct);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TargetProduct getTargetProduct() {
            return this.targetProduct;
        }

        @NotNull
        public final OnAlternativeProductsTargetProductSection copy(@NotNull TargetProduct targetProduct) {
            Intrinsics.h(targetProduct, "targetProduct");
            return new OnAlternativeProductsTargetProductSection(targetProduct);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnAlternativeProductsTargetProductSection) && Intrinsics.c(this.targetProduct, ((OnAlternativeProductsTargetProductSection) other).targetProduct);
        }

        @NotNull
        public final TargetProduct getTargetProduct() {
            return this.targetProduct;
        }

        public int hashCode() {
            return this.targetProduct.hashCode();
        }

        @NotNull
        public String toString() {
            return "OnAlternativeProductsTargetProductSection(targetProduct=" + this.targetProduct + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$Product;", "", "__typename", "", "productCard", "Lau/com/woolworths/graphql/common/fragment/ProductCard;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/graphql/common/fragment/ProductCard;)V", "get__typename", "()Ljava/lang/String;", "getProductCard", "()Lau/com/woolworths/graphql/common/fragment/ProductCard;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003JO\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$Section;", "", "__typename", "", "onAlternativeProductsTargetProductSection", "Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$OnAlternativeProductsTargetProductSection;", "onAlternativeProductsProductSection", "Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$OnAlternativeProductsProductSection;", "onAlternativeProductsNoResultSection", "Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$OnAlternativeProductsNoResultSection;", "onAlternativeProductsCtaSection", "Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$OnAlternativeProductsCtaSection;", "onAlternativeProductsInsetBannerSection", "Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$OnAlternativeProductsInsetBannerSection;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$OnAlternativeProductsTargetProductSection;Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$OnAlternativeProductsProductSection;Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$OnAlternativeProductsNoResultSection;Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$OnAlternativeProductsCtaSection;Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$OnAlternativeProductsInsetBannerSection;)V", "get__typename", "()Ljava/lang/String;", "getOnAlternativeProductsTargetProductSection", "()Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$OnAlternativeProductsTargetProductSection;", "getOnAlternativeProductsProductSection", "()Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$OnAlternativeProductsProductSection;", "getOnAlternativeProductsNoResultSection", "()Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$OnAlternativeProductsNoResultSection;", "getOnAlternativeProductsCtaSection", "()Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$OnAlternativeProductsCtaSection;", "getOnAlternativeProductsInsetBannerSection", "()Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$OnAlternativeProductsInsetBannerSection;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Section {

        @NotNull
        private final String __typename;

        @Nullable
        private final OnAlternativeProductsCtaSection onAlternativeProductsCtaSection;

        @Nullable
        private final OnAlternativeProductsInsetBannerSection onAlternativeProductsInsetBannerSection;

        @Nullable
        private final OnAlternativeProductsNoResultSection onAlternativeProductsNoResultSection;

        @Nullable
        private final OnAlternativeProductsProductSection onAlternativeProductsProductSection;

        @Nullable
        private final OnAlternativeProductsTargetProductSection onAlternativeProductsTargetProductSection;

        public Section(@NotNull String __typename, @Nullable OnAlternativeProductsTargetProductSection onAlternativeProductsTargetProductSection, @Nullable OnAlternativeProductsProductSection onAlternativeProductsProductSection, @Nullable OnAlternativeProductsNoResultSection onAlternativeProductsNoResultSection, @Nullable OnAlternativeProductsCtaSection onAlternativeProductsCtaSection, @Nullable OnAlternativeProductsInsetBannerSection onAlternativeProductsInsetBannerSection) {
            Intrinsics.h(__typename, "__typename");
            this.__typename = __typename;
            this.onAlternativeProductsTargetProductSection = onAlternativeProductsTargetProductSection;
            this.onAlternativeProductsProductSection = onAlternativeProductsProductSection;
            this.onAlternativeProductsNoResultSection = onAlternativeProductsNoResultSection;
            this.onAlternativeProductsCtaSection = onAlternativeProductsCtaSection;
            this.onAlternativeProductsInsetBannerSection = onAlternativeProductsInsetBannerSection;
        }

        public static /* synthetic */ Section copy$default(Section section, String str, OnAlternativeProductsTargetProductSection onAlternativeProductsTargetProductSection, OnAlternativeProductsProductSection onAlternativeProductsProductSection, OnAlternativeProductsNoResultSection onAlternativeProductsNoResultSection, OnAlternativeProductsCtaSection onAlternativeProductsCtaSection, OnAlternativeProductsInsetBannerSection onAlternativeProductsInsetBannerSection, int i, Object obj) {
            if ((i & 1) != 0) {
                str = section.__typename;
            }
            if ((i & 2) != 0) {
                onAlternativeProductsTargetProductSection = section.onAlternativeProductsTargetProductSection;
            }
            if ((i & 4) != 0) {
                onAlternativeProductsProductSection = section.onAlternativeProductsProductSection;
            }
            if ((i & 8) != 0) {
                onAlternativeProductsNoResultSection = section.onAlternativeProductsNoResultSection;
            }
            if ((i & 16) != 0) {
                onAlternativeProductsCtaSection = section.onAlternativeProductsCtaSection;
            }
            if ((i & 32) != 0) {
                onAlternativeProductsInsetBannerSection = section.onAlternativeProductsInsetBannerSection;
            }
            OnAlternativeProductsCtaSection onAlternativeProductsCtaSection2 = onAlternativeProductsCtaSection;
            OnAlternativeProductsInsetBannerSection onAlternativeProductsInsetBannerSection2 = onAlternativeProductsInsetBannerSection;
            return section.copy(str, onAlternativeProductsTargetProductSection, onAlternativeProductsProductSection, onAlternativeProductsNoResultSection, onAlternativeProductsCtaSection2, onAlternativeProductsInsetBannerSection2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final OnAlternativeProductsTargetProductSection getOnAlternativeProductsTargetProductSection() {
            return this.onAlternativeProductsTargetProductSection;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final OnAlternativeProductsProductSection getOnAlternativeProductsProductSection() {
            return this.onAlternativeProductsProductSection;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final OnAlternativeProductsNoResultSection getOnAlternativeProductsNoResultSection() {
            return this.onAlternativeProductsNoResultSection;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final OnAlternativeProductsCtaSection getOnAlternativeProductsCtaSection() {
            return this.onAlternativeProductsCtaSection;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final OnAlternativeProductsInsetBannerSection getOnAlternativeProductsInsetBannerSection() {
            return this.onAlternativeProductsInsetBannerSection;
        }

        @NotNull
        public final Section copy(@NotNull String __typename, @Nullable OnAlternativeProductsTargetProductSection onAlternativeProductsTargetProductSection, @Nullable OnAlternativeProductsProductSection onAlternativeProductsProductSection, @Nullable OnAlternativeProductsNoResultSection onAlternativeProductsNoResultSection, @Nullable OnAlternativeProductsCtaSection onAlternativeProductsCtaSection, @Nullable OnAlternativeProductsInsetBannerSection onAlternativeProductsInsetBannerSection) {
            Intrinsics.h(__typename, "__typename");
            return new Section(__typename, onAlternativeProductsTargetProductSection, onAlternativeProductsProductSection, onAlternativeProductsNoResultSection, onAlternativeProductsCtaSection, onAlternativeProductsInsetBannerSection);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Section)) {
                return false;
            }
            Section section = (Section) other;
            return Intrinsics.c(this.__typename, section.__typename) && Intrinsics.c(this.onAlternativeProductsTargetProductSection, section.onAlternativeProductsTargetProductSection) && Intrinsics.c(this.onAlternativeProductsProductSection, section.onAlternativeProductsProductSection) && Intrinsics.c(this.onAlternativeProductsNoResultSection, section.onAlternativeProductsNoResultSection) && Intrinsics.c(this.onAlternativeProductsCtaSection, section.onAlternativeProductsCtaSection) && Intrinsics.c(this.onAlternativeProductsInsetBannerSection, section.onAlternativeProductsInsetBannerSection);
        }

        @Nullable
        public final OnAlternativeProductsCtaSection getOnAlternativeProductsCtaSection() {
            return this.onAlternativeProductsCtaSection;
        }

        @Nullable
        public final OnAlternativeProductsInsetBannerSection getOnAlternativeProductsInsetBannerSection() {
            return this.onAlternativeProductsInsetBannerSection;
        }

        @Nullable
        public final OnAlternativeProductsNoResultSection getOnAlternativeProductsNoResultSection() {
            return this.onAlternativeProductsNoResultSection;
        }

        @Nullable
        public final OnAlternativeProductsProductSection getOnAlternativeProductsProductSection() {
            return this.onAlternativeProductsProductSection;
        }

        @Nullable
        public final OnAlternativeProductsTargetProductSection getOnAlternativeProductsTargetProductSection() {
            return this.onAlternativeProductsTargetProductSection;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int iHashCode = this.__typename.hashCode() * 31;
            OnAlternativeProductsTargetProductSection onAlternativeProductsTargetProductSection = this.onAlternativeProductsTargetProductSection;
            int iHashCode2 = (iHashCode + (onAlternativeProductsTargetProductSection == null ? 0 : onAlternativeProductsTargetProductSection.hashCode())) * 31;
            OnAlternativeProductsProductSection onAlternativeProductsProductSection = this.onAlternativeProductsProductSection;
            int iHashCode3 = (iHashCode2 + (onAlternativeProductsProductSection == null ? 0 : onAlternativeProductsProductSection.hashCode())) * 31;
            OnAlternativeProductsNoResultSection onAlternativeProductsNoResultSection = this.onAlternativeProductsNoResultSection;
            int iHashCode4 = (iHashCode3 + (onAlternativeProductsNoResultSection == null ? 0 : onAlternativeProductsNoResultSection.hashCode())) * 31;
            OnAlternativeProductsCtaSection onAlternativeProductsCtaSection = this.onAlternativeProductsCtaSection;
            int iHashCode5 = (iHashCode4 + (onAlternativeProductsCtaSection == null ? 0 : onAlternativeProductsCtaSection.hashCode())) * 31;
            OnAlternativeProductsInsetBannerSection onAlternativeProductsInsetBannerSection = this.onAlternativeProductsInsetBannerSection;
            return iHashCode5 + (onAlternativeProductsInsetBannerSection != null ? onAlternativeProductsInsetBannerSection.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Section(__typename=" + this.__typename + ", onAlternativeProductsTargetProductSection=" + this.onAlternativeProductsTargetProductSection + ", onAlternativeProductsProductSection=" + this.onAlternativeProductsProductSection + ", onAlternativeProductsNoResultSection=" + this.onAlternativeProductsNoResultSection + ", onAlternativeProductsCtaSection=" + this.onAlternativeProductsCtaSection + ", onAlternativeProductsInsetBannerSection=" + this.onAlternativeProductsInsetBannerSection + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$SectionHeader;", "", "title", "", "disclaimer", "Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$Disclaimer;", "typeTag", "Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$TypeTag;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$Disclaimer;Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$TypeTag;)V", "getTitle", "()Ljava/lang/String;", "getDisclaimer", "()Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$Disclaimer;", "getTypeTag", "()Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$TypeTag;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SectionHeader {

        @Nullable
        private final Disclaimer disclaimer;

        @Nullable
        private final String title;

        @Nullable
        private final TypeTag typeTag;

        public SectionHeader(@Nullable String str, @Nullable Disclaimer disclaimer, @Nullable TypeTag typeTag) {
            this.title = str;
            this.disclaimer = disclaimer;
            this.typeTag = typeTag;
        }

        public static /* synthetic */ SectionHeader copy$default(SectionHeader sectionHeader, String str, Disclaimer disclaimer, TypeTag typeTag, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sectionHeader.title;
            }
            if ((i & 2) != 0) {
                disclaimer = sectionHeader.disclaimer;
            }
            if ((i & 4) != 0) {
                typeTag = sectionHeader.typeTag;
            }
            return sectionHeader.copy(str, disclaimer, typeTag);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Disclaimer getDisclaimer() {
            return this.disclaimer;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final TypeTag getTypeTag() {
            return this.typeTag;
        }

        @NotNull
        public final SectionHeader copy(@Nullable String title, @Nullable Disclaimer disclaimer, @Nullable TypeTag typeTag) {
            return new SectionHeader(title, disclaimer, typeTag);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SectionHeader)) {
                return false;
            }
            SectionHeader sectionHeader = (SectionHeader) other;
            return Intrinsics.c(this.title, sectionHeader.title) && Intrinsics.c(this.disclaimer, sectionHeader.disclaimer) && Intrinsics.c(this.typeTag, sectionHeader.typeTag);
        }

        @Nullable
        public final Disclaimer getDisclaimer() {
            return this.disclaimer;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        public final TypeTag getTypeTag() {
            return this.typeTag;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Disclaimer disclaimer = this.disclaimer;
            int iHashCode2 = (iHashCode + (disclaimer == null ? 0 : disclaimer.hashCode())) * 31;
            TypeTag typeTag = this.typeTag;
            return iHashCode2 + (typeTag != null ? typeTag.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "SectionHeader(title=" + this.title + ", disclaimer=" + this.disclaimer + ", typeTag=" + this.typeTag + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$TargetProduct;", "", "__typename", "", "productCard", "Lau/com/woolworths/graphql/common/fragment/ProductCard;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/graphql/common/fragment/ProductCard;)V", "get__typename", "()Ljava/lang/String;", "getProductCard", "()Lau/com/woolworths/graphql/common/fragment/ProductCard;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TargetProduct {

        @NotNull
        private final String __typename;

        @NotNull
        private final ProductCard productCard;

        public TargetProduct(@NotNull String __typename, @NotNull ProductCard productCard) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(productCard, "productCard");
            this.__typename = __typename;
            this.productCard = productCard;
        }

        public static /* synthetic */ TargetProduct copy$default(TargetProduct targetProduct, String str, ProductCard productCard, int i, Object obj) {
            if ((i & 1) != 0) {
                str = targetProduct.__typename;
            }
            if ((i & 2) != 0) {
                productCard = targetProduct.productCard;
            }
            return targetProduct.copy(str, productCard);
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
        public final TargetProduct copy(@NotNull String __typename, @NotNull ProductCard productCard) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(productCard, "productCard");
            return new TargetProduct(__typename, productCard);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TargetProduct)) {
                return false;
            }
            TargetProduct targetProduct = (TargetProduct) other;
            return Intrinsics.c(this.__typename, targetProduct.__typename) && Intrinsics.c(this.productCard, targetProduct.productCard);
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
            return d.o("TargetProduct(__typename=", this.__typename, ", productCard=", this.productCard, ")");
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$TypeTag;", "", "swapType", "Lau/com/woolworths/shop/graphql/type/AlternativeProductsType;", TextBundle.TEXT_ENTRY, "", "<init>", "(Lau/com/woolworths/shop/graphql/type/AlternativeProductsType;Ljava/lang/String;)V", "getSwapType", "()Lau/com/woolworths/shop/graphql/type/AlternativeProductsType;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TypeTag {

        @NotNull
        private final AlternativeProductsType swapType;

        @NotNull
        private final String text;

        public TypeTag(@NotNull AlternativeProductsType swapType, @NotNull String text) {
            Intrinsics.h(swapType, "swapType");
            Intrinsics.h(text, "text");
            this.swapType = swapType;
            this.text = text;
        }

        public static /* synthetic */ TypeTag copy$default(TypeTag typeTag, AlternativeProductsType alternativeProductsType, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                alternativeProductsType = typeTag.swapType;
            }
            if ((i & 2) != 0) {
                str = typeTag.text;
            }
            return typeTag.copy(alternativeProductsType, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AlternativeProductsType getSwapType() {
            return this.swapType;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final TypeTag copy(@NotNull AlternativeProductsType swapType, @NotNull String text) {
            Intrinsics.h(swapType, "swapType");
            Intrinsics.h(text, "text");
            return new TypeTag(swapType, text);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TypeTag)) {
                return false;
            }
            TypeTag typeTag = (TypeTag) other;
            return this.swapType == typeTag.swapType && Intrinsics.c(this.text, typeTag.text);
        }

        @NotNull
        public final AlternativeProductsType getSwapType() {
            return this.swapType;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode() + (this.swapType.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "TypeTag(swapType=" + this.swapType + ", text=" + this.text + ")";
        }
    }

    public AlternativeProductsQuery(@NotNull GetAlternativeProductsInput getAlternativeProductsInput, boolean z, boolean z2, @NotNull Optional<Boolean> includeAvailabilityInfoStatus, @NotNull Optional<Boolean> includePricingFootnote, boolean z3) {
        Intrinsics.h(getAlternativeProductsInput, "getAlternativeProductsInput");
        Intrinsics.h(includeAvailabilityInfoStatus, "includeAvailabilityInfoStatus");
        Intrinsics.h(includePricingFootnote, "includePricingFootnote");
        this.getAlternativeProductsInput = getAlternativeProductsInput;
        this.includeProductAvailabilityStates = z;
        this.includeOfferMinimumSpend = z2;
        this.includeAvailabilityInfoStatus = includeAvailabilityInfoStatus;
        this.includePricingFootnote = includePricingFootnote;
        this.includeLowestPrice14Days = z3;
    }

    public static /* synthetic */ AlternativeProductsQuery copy$default(AlternativeProductsQuery alternativeProductsQuery, GetAlternativeProductsInput getAlternativeProductsInput, boolean z, boolean z2, Optional optional, Optional optional2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            getAlternativeProductsInput = alternativeProductsQuery.getAlternativeProductsInput;
        }
        if ((i & 2) != 0) {
            z = alternativeProductsQuery.includeProductAvailabilityStates;
        }
        if ((i & 4) != 0) {
            z2 = alternativeProductsQuery.includeOfferMinimumSpend;
        }
        if ((i & 8) != 0) {
            optional = alternativeProductsQuery.includeAvailabilityInfoStatus;
        }
        if ((i & 16) != 0) {
            optional2 = alternativeProductsQuery.includePricingFootnote;
        }
        if ((i & 32) != 0) {
            z3 = alternativeProductsQuery.includeLowestPrice14Days;
        }
        Optional optional3 = optional2;
        boolean z4 = z3;
        return alternativeProductsQuery.copy(getAlternativeProductsInput, z, z2, optional, optional3, z4);
    }

    @Override // com.apollographql.apollo.api.Executable
    @NotNull
    public Adapter<Data> adapter() {
        return Adapters.c(AlternativeProductsQuery_ResponseAdapter.Data.INSTANCE, false);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final GetAlternativeProductsInput getGetAlternativeProductsInput() {
        return this.getAlternativeProductsInput;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIncludeProductAvailabilityStates() {
        return this.includeProductAvailabilityStates;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIncludeOfferMinimumSpend() {
        return this.includeOfferMinimumSpend;
    }

    @NotNull
    public final Optional<Boolean> component4() {
        return this.includeAvailabilityInfoStatus;
    }

    @NotNull
    public final Optional<Boolean> component5() {
        return this.includePricingFootnote;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIncludeLowestPrice14Days() {
        return this.includeLowestPrice14Days;
    }

    @NotNull
    public final AlternativeProductsQuery copy(@NotNull GetAlternativeProductsInput getAlternativeProductsInput, boolean includeProductAvailabilityStates, boolean includeOfferMinimumSpend, @NotNull Optional<Boolean> includeAvailabilityInfoStatus, @NotNull Optional<Boolean> includePricingFootnote, boolean includeLowestPrice14Days) {
        Intrinsics.h(getAlternativeProductsInput, "getAlternativeProductsInput");
        Intrinsics.h(includeAvailabilityInfoStatus, "includeAvailabilityInfoStatus");
        Intrinsics.h(includePricingFootnote, "includePricingFootnote");
        return new AlternativeProductsQuery(getAlternativeProductsInput, includeProductAvailabilityStates, includeOfferMinimumSpend, includeAvailabilityInfoStatus, includePricingFootnote, includeLowestPrice14Days);
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
        if (!(other instanceof AlternativeProductsQuery)) {
            return false;
        }
        AlternativeProductsQuery alternativeProductsQuery = (AlternativeProductsQuery) other;
        return Intrinsics.c(this.getAlternativeProductsInput, alternativeProductsQuery.getAlternativeProductsInput) && this.includeProductAvailabilityStates == alternativeProductsQuery.includeProductAvailabilityStates && this.includeOfferMinimumSpend == alternativeProductsQuery.includeOfferMinimumSpend && Intrinsics.c(this.includeAvailabilityInfoStatus, alternativeProductsQuery.includeAvailabilityInfoStatus) && Intrinsics.c(this.includePricingFootnote, alternativeProductsQuery.includePricingFootnote) && this.includeLowestPrice14Days == alternativeProductsQuery.includeLowestPrice14Days;
    }

    @NotNull
    public final GetAlternativeProductsInput getGetAlternativeProductsInput() {
        return this.getAlternativeProductsInput;
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

    public int hashCode() {
        return Boolean.hashCode(this.includeLowestPrice14Days) + au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.includePricingFootnote, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.includeAvailabilityInfoStatus, b.e(b.e(this.getAlternativeProductsInput.hashCode() * 31, 31, this.includeProductAvailabilityStates), 31, this.includeOfferMinimumSpend), 31), 31);
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
        builder.e(AlternativeProductsQuerySelections.INSTANCE.get__root());
        return builder.c();
    }

    @Override // com.apollographql.apollo.api.Executable
    public void serializeVariables(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        AlternativeProductsQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @NotNull
    public String toString() {
        GetAlternativeProductsInput getAlternativeProductsInput = this.getAlternativeProductsInput;
        boolean z = this.includeProductAvailabilityStates;
        boolean z2 = this.includeOfferMinimumSpend;
        Optional<Boolean> optional = this.includeAvailabilityInfoStatus;
        Optional<Boolean> optional2 = this.includePricingFootnote;
        boolean z3 = this.includeLowestPrice14Days;
        StringBuilder sb = new StringBuilder("AlternativeProductsQuery(getAlternativeProductsInput=");
        sb.append(getAlternativeProductsInput);
        sb.append(", includeProductAvailabilityStates=");
        sb.append(z);
        sb.append(", includeOfferMinimumSpend=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.z(sb, z2, ", includeAvailabilityInfoStatus=", optional, ", includePricingFootnote=");
        sb.append(optional2);
        sb.append(", includeLowestPrice14Days=");
        sb.append(z3);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AlternativeProductsQuery(GetAlternativeProductsInput getAlternativeProductsInput, boolean z, boolean z2, Optional optional, Optional optional2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z4;
        Optional optional3;
        int i2 = i & 8;
        Optional.Absent absent = Optional.Absent.f13523a;
        optional = i2 != 0 ? absent : optional;
        if ((i & 16) != 0) {
            z4 = z3;
            optional3 = absent;
        } else {
            z4 = z3;
            optional3 = optional2;
        }
        this(getAlternativeProductsInput, z, z2, optional, optional3, z4);
    }
}
