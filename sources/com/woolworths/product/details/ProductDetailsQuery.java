package com.woolworths.product.details;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.graphql.TealiumAnalytics;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.BarcodeType;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.CardHeight;
import au.com.woolworths.shop.graphql.type.CouponBannerColorTheme;
import au.com.woolworths.shop.graphql.type.FormattedBannerStyle;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.ProductListChannelType;
import au.com.woolworths.shop.graphql.type.ProductListFacetType;
import au.com.woolworths.shop.graphql.type.ProductRatingsAndReviewsPreviewInput;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.woolworths.product.details.adapter.ProductDetailsQuery_ResponseAdapter;
import com.woolworths.product.details.adapter.ProductDetailsQuery_VariablesAdapter;
import com.woolworths.product.details.selections.ProductDetailsQuerySelections;
import fragment.RatingsAndReviewsPreviewCta;
import fragment.RatingsAndReviewsPreviewHeader;
import fragment.RatingsAndReviewsRatingsDetails;
import fragment.RatingsAndReviewsReviewDetails;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b7\b\u0087\b\u0018\u0000 \u0081\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:7MNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007f\u0080\u0001\u0081\u0001BÇ\u0001\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b0\u0004\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\u0006\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010)\u001a\u00020\u0005H\u0016J\b\u0010*\u001a\u00020\u0005H\u0016J\b\u0010+\u001a\u00020\u0005H\u0016J \u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\rH\u0016J\u000e\u00103\u001a\b\u0012\u0004\u0012\u00020\u000204H\u0016J\b\u00105\u001a\u000206H\u0016J\u0011\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003J\u0011\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003J\u0011\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004HÆ\u0003J\u0011\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003J\u0017\u0010;\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b0\u0004HÆ\u0003J\t\u0010<\u001a\u00020\rHÆ\u0003J\t\u0010=\u001a\u00020\rHÆ\u0003J\t\u0010>\u001a\u00020\rHÆ\u0003J\t\u0010?\u001a\u00020\rHÆ\u0003J\u000f\u0010@\u001a\b\u0012\u0004\u0012\u00020\r0\u0004HÆ\u0003J\t\u0010A\u001a\u00020\rHÆ\u0003J\t\u0010B\u001a\u00020\u0014HÆ\u0003J\t\u0010C\u001a\u00020\rHÆ\u0003J\u000f\u0010D\u001a\b\u0012\u0004\u0012\u00020\r0\u0004HÆ\u0003J\t\u0010E\u001a\u00020\rHÆ\u0003JÙ\u0001\u0010F\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0016\b\u0002\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b0\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\r2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0002\u0010\u0017\u001a\u00020\rHÆ\u0001J\u0013\u0010G\u001a\u00020\r2\b\u0010H\u001a\u0004\u0018\u00010IHÖ\u0003J\t\u0010J\u001a\u00020KHÖ\u0001J\t\u0010L\u001a\u00020\u0005HÖ\u0001R\u0019\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u001f\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010 R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010 R\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010 R\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0011\u0010\u0012\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0015\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0011\u0010\u0017\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 ¨\u0006\u0082\u0001"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/product/details/ProductDetailsQuery$Data;", "productId", "Lcom/apollographql/apollo/api/Optional;", "", "barcode", "barcodeType", "Lau/com/woolworths/shop/graphql/type/BarcodeType;", "storeId", "supportedLinks", "", "isRatingsAndReviewsSummaryEnabled", "", "isHealthierOptionsEnabled", "isMarkdownEnabled", "includeOfferMinimumSpend", "includeAvailabilityInfoStatus", "includeProductAvailabilityStates", "productRatingsAndReviewsPreviewInput", "Lau/com/woolworths/shop/graphql/type/ProductRatingsAndReviewsPreviewInput;", "includeActionableCard", "includePricingFootnote", "includeLowestPrice14Days", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;ZZZZLcom/apollographql/apollo/api/Optional;ZLau/com/woolworths/shop/graphql/type/ProductRatingsAndReviewsPreviewInput;ZLcom/apollographql/apollo/api/Optional;Z)V", "getProductId", "()Lcom/apollographql/apollo/api/Optional;", "getBarcode", "getBarcodeType", "getStoreId", "getSupportedLinks", "()Z", "getIncludeOfferMinimumSpend", "getIncludeAvailabilityInfoStatus", "getIncludeProductAvailabilityStates", "getProductRatingsAndReviewsPreviewInput", "()Lau/com/woolworths/shop/graphql/type/ProductRatingsAndReviewsPreviewInput;", "getIncludeActionableCard", "getIncludePricingFootnote", "getIncludeLowestPrice14Days", "id", "document", AppMeasurementSdk.ConditionalUserProperty.NAME, "serializeVariables", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "withDefaultValues", "adapter", "Lcom/apollographql/apollo/api/Adapter;", "rootField", "Lcom/apollographql/apollo/api/CompiledField;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "other", "", "hashCode", "", "toString", "Data", ProductDetailsQuery.OPERATION_NAME, "Feed", "OnActionableCard", "OnCouponBanner", "CouponBannerTermsAndConditions", "OnFormattedBanner", "OnProductCard", "OnInsetBanner", "Action", "OnProductRatingsAndReviewsSummary", "RatingText", "Cta", "CtaText", "Action1", "OnPromotionBanner", "Banner", "Action2", "PromotionContent", "OnPromotionMarkdownContent", "OnFormattedContent", "OnProductDisclaimer", "OnProductOriginAndHealthInfo", "CountryOfOrigin", "HealthStarRating", "OnProductNutritionInfo", "OnProductDetailsMarketplace", "Info", "Item", "Footer", "BottomSheet", "PrimaryCta", "SecondaryCta", "OnHealthierHorizontalList", "LinkedInfo", "Link", "HealthierOption", "ProductCard", "HealthStarRating1", "OnDividerCard", "OnFooter", "Button", "OnProductHorizontalList", "Item1", "OnProductCard1", "ImageList", "ProductRatingsAndReviewsPreview", "Section", "OnRatingsAndReviewsPreviewHeader", "OnRatingsAndReviewsRatingsDetails", "OnRatingsAndReviewsReviewDetails", "OnRatingsAndReviewsPreviewCta", "Companion", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductDetailsQuery implements Query<Data> {

    @NotNull
    public static final String OPERATION_ID = "dbaec37905343a7653b3fe727d512d506846a0c374098a681f7880689aba3f61";

    @NotNull
    public static final String OPERATION_NAME = "ProductDetails";

    @NotNull
    private final Optional<String> barcode;

    @NotNull
    private final Optional<BarcodeType> barcodeType;
    private final boolean includeActionableCard;

    @NotNull
    private final Optional<Boolean> includeAvailabilityInfoStatus;
    private final boolean includeLowestPrice14Days;
    private final boolean includeOfferMinimumSpend;

    @NotNull
    private final Optional<Boolean> includePricingFootnote;
    private final boolean includeProductAvailabilityStates;
    private final boolean isHealthierOptionsEnabled;
    private final boolean isMarkdownEnabled;
    private final boolean isRatingsAndReviewsSummaryEnabled;

    @NotNull
    private final Optional<String> productId;

    @NotNull
    private final ProductRatingsAndReviewsPreviewInput productRatingsAndReviewsPreviewInput;

    @NotNull
    private final Optional<String> storeId;

    @NotNull
    private final Optional<List<String>> supportedLinks;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @StabilityInferred
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$Action;", "", "placement", "Lau/com/woolworths/shop/graphql/type/InsetBannerActionPlacement;", "type", "Lau/com/woolworths/shop/graphql/type/InsetBannerActionType;", AnnotatedPrivateKey.LABEL, "", "url", "<init>", "(Lau/com/woolworths/shop/graphql/type/InsetBannerActionPlacement;Lau/com/woolworths/shop/graphql/type/InsetBannerActionType;Ljava/lang/String;Ljava/lang/String;)V", "getPlacement", "()Lau/com/woolworths/shop/graphql/type/InsetBannerActionPlacement;", "getType", "()Lau/com/woolworths/shop/graphql/type/InsetBannerActionType;", "getLabel", "()Ljava/lang/String;", "getUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action {
        public static final int $stable = 0;

        @NotNull
        private final String label;

        @NotNull
        private final InsetBannerActionPlacement placement;

        @NotNull
        private final InsetBannerActionType type;

        @Nullable
        private final String url;

        public Action(@NotNull InsetBannerActionPlacement placement, @NotNull InsetBannerActionType type, @NotNull String label, @Nullable String str) {
            Intrinsics.h(placement, "placement");
            Intrinsics.h(type, "type");
            Intrinsics.h(label, "label");
            this.placement = placement;
            this.type = type;
            this.label = label;
            this.url = str;
        }

        public static /* synthetic */ Action copy$default(Action action, InsetBannerActionPlacement insetBannerActionPlacement, InsetBannerActionType insetBannerActionType, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                insetBannerActionPlacement = action.placement;
            }
            if ((i & 2) != 0) {
                insetBannerActionType = action.type;
            }
            if ((i & 4) != 0) {
                str = action.label;
            }
            if ((i & 8) != 0) {
                str2 = action.url;
            }
            return action.copy(insetBannerActionPlacement, insetBannerActionType, str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final InsetBannerActionPlacement getPlacement() {
            return this.placement;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final InsetBannerActionType getType() {
            return this.type;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        public final Action copy(@NotNull InsetBannerActionPlacement placement, @NotNull InsetBannerActionType type, @NotNull String label, @Nullable String url) {
            Intrinsics.h(placement, "placement");
            Intrinsics.h(type, "type");
            Intrinsics.h(label, "label");
            return new Action(placement, type, label, url);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Action)) {
                return false;
            }
            Action action = (Action) other;
            return this.placement == action.placement && this.type == action.type && Intrinsics.c(this.label, action.label) && Intrinsics.c(this.url, action.url);
        }

        @NotNull
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        public final InsetBannerActionPlacement getPlacement() {
            return this.placement;
        }

        @NotNull
        public final InsetBannerActionType getType() {
            return this.type;
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int iC = b.c(d.c(this.type, this.placement.hashCode() * 31, 31), 31, this.label);
            String str = this.url;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            InsetBannerActionPlacement insetBannerActionPlacement = this.placement;
            InsetBannerActionType insetBannerActionType = this.type;
            return a.l(d.t("Action(placement=", insetBannerActionPlacement, ", type=", insetBannerActionType, ", label="), this.label, ", url=", this.url, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$Action1;", "", "type", "Lau/com/woolworths/shop/graphql/type/ActionType;", UrlHandler.ACTION, "", "id", "<init>", "(Lau/com/woolworths/shop/graphql/type/ActionType;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Lau/com/woolworths/shop/graphql/type/ActionType;", "getAction", "()Ljava/lang/String;", "getId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action1 {
        public static final int $stable = 0;

        @NotNull
        private final String action;

        @Nullable
        private final String id;

        @NotNull
        private final ActionType type;

        public Action1(@NotNull ActionType type, @NotNull String action, @Nullable String str) {
            Intrinsics.h(type, "type");
            Intrinsics.h(action, "action");
            this.type = type;
            this.action = action;
            this.id = str;
        }

        public static /* synthetic */ Action1 copy$default(Action1 action1, ActionType actionType, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                actionType = action1.type;
            }
            if ((i & 2) != 0) {
                str = action1.action;
            }
            if ((i & 4) != 0) {
                str2 = action1.id;
            }
            return action1.copy(actionType, str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ActionType getType() {
            return this.type;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final Action1 copy(@NotNull ActionType type, @NotNull String action, @Nullable String id) {
            Intrinsics.h(type, "type");
            Intrinsics.h(action, "action");
            return new Action1(type, action, id);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Action1)) {
                return false;
            }
            Action1 action1 = (Action1) other;
            return this.type == action1.type && Intrinsics.c(this.action, action1.action) && Intrinsics.c(this.id, action1.id);
        }

        @NotNull
        public final String getAction() {
            return this.action;
        }

        @Nullable
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final ActionType getType() {
            return this.type;
        }

        public int hashCode() {
            int iC = b.c(this.type.hashCode() * 31, 31, this.action);
            String str = this.id;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            ActionType actionType = this.type;
            String str = this.action;
            return YU.a.o(d.s("Action1(type=", actionType, ", action=", str, ", id="), this.id, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$Action2;", "", "placement", "Lau/com/woolworths/shop/graphql/type/InsetBannerActionPlacement;", "type", "Lau/com/woolworths/shop/graphql/type/InsetBannerActionType;", AnnotatedPrivateKey.LABEL, "", "url", "<init>", "(Lau/com/woolworths/shop/graphql/type/InsetBannerActionPlacement;Lau/com/woolworths/shop/graphql/type/InsetBannerActionType;Ljava/lang/String;Ljava/lang/String;)V", "getPlacement", "()Lau/com/woolworths/shop/graphql/type/InsetBannerActionPlacement;", "getType", "()Lau/com/woolworths/shop/graphql/type/InsetBannerActionType;", "getLabel", "()Ljava/lang/String;", "getUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action2 {
        public static final int $stable = 0;

        @NotNull
        private final String label;

        @NotNull
        private final InsetBannerActionPlacement placement;

        @NotNull
        private final InsetBannerActionType type;

        @Nullable
        private final String url;

        public Action2(@NotNull InsetBannerActionPlacement placement, @NotNull InsetBannerActionType type, @NotNull String label, @Nullable String str) {
            Intrinsics.h(placement, "placement");
            Intrinsics.h(type, "type");
            Intrinsics.h(label, "label");
            this.placement = placement;
            this.type = type;
            this.label = label;
            this.url = str;
        }

        public static /* synthetic */ Action2 copy$default(Action2 action2, InsetBannerActionPlacement insetBannerActionPlacement, InsetBannerActionType insetBannerActionType, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                insetBannerActionPlacement = action2.placement;
            }
            if ((i & 2) != 0) {
                insetBannerActionType = action2.type;
            }
            if ((i & 4) != 0) {
                str = action2.label;
            }
            if ((i & 8) != 0) {
                str2 = action2.url;
            }
            return action2.copy(insetBannerActionPlacement, insetBannerActionType, str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final InsetBannerActionPlacement getPlacement() {
            return this.placement;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final InsetBannerActionType getType() {
            return this.type;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        public final Action2 copy(@NotNull InsetBannerActionPlacement placement, @NotNull InsetBannerActionType type, @NotNull String label, @Nullable String url) {
            Intrinsics.h(placement, "placement");
            Intrinsics.h(type, "type");
            Intrinsics.h(label, "label");
            return new Action2(placement, type, label, url);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Action2)) {
                return false;
            }
            Action2 action2 = (Action2) other;
            return this.placement == action2.placement && this.type == action2.type && Intrinsics.c(this.label, action2.label) && Intrinsics.c(this.url, action2.url);
        }

        @NotNull
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        public final InsetBannerActionPlacement getPlacement() {
            return this.placement;
        }

        @NotNull
        public final InsetBannerActionType getType() {
            return this.type;
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int iC = b.c(d.c(this.type, this.placement.hashCode() * 31, 31), 31, this.label);
            String str = this.url;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            InsetBannerActionPlacement insetBannerActionPlacement = this.placement;
            InsetBannerActionType insetBannerActionType = this.type;
            return a.l(d.t("Action2(placement=", insetBannerActionPlacement, ", type=", insetBannerActionType, ", label="), this.label, ", url=", this.url, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$Banner;", "", "displayType", "Lau/com/woolworths/shop/graphql/type/InsetBannerDisplayType;", "message", "", "iconUrl", "bannerTitle", UrlHandler.ACTION, "Lcom/woolworths/product/details/ProductDetailsQuery$Action2;", "<init>", "(Lau/com/woolworths/shop/graphql/type/InsetBannerDisplayType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/woolworths/product/details/ProductDetailsQuery$Action2;)V", "getDisplayType", "()Lau/com/woolworths/shop/graphql/type/InsetBannerDisplayType;", "getMessage", "()Ljava/lang/String;", "getIconUrl", "getBannerTitle", "getAction", "()Lcom/woolworths/product/details/ProductDetailsQuery$Action2;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Banner {
        public static final int $stable = 0;

        @Nullable
        private final Action2 action;

        @Nullable
        private final String bannerTitle;

        @NotNull
        private final InsetBannerDisplayType displayType;

        @Nullable
        private final String iconUrl;

        @NotNull
        private final String message;

        public Banner(@NotNull InsetBannerDisplayType displayType, @NotNull String message, @Nullable String str, @Nullable String str2, @Nullable Action2 action2) {
            Intrinsics.h(displayType, "displayType");
            Intrinsics.h(message, "message");
            this.displayType = displayType;
            this.message = message;
            this.iconUrl = str;
            this.bannerTitle = str2;
            this.action = action2;
        }

        public static /* synthetic */ Banner copy$default(Banner banner, InsetBannerDisplayType insetBannerDisplayType, String str, String str2, String str3, Action2 action2, int i, Object obj) {
            if ((i & 1) != 0) {
                insetBannerDisplayType = banner.displayType;
            }
            if ((i & 2) != 0) {
                str = banner.message;
            }
            if ((i & 4) != 0) {
                str2 = banner.iconUrl;
            }
            if ((i & 8) != 0) {
                str3 = banner.bannerTitle;
            }
            if ((i & 16) != 0) {
                action2 = banner.action;
            }
            Action2 action22 = action2;
            String str4 = str2;
            return banner.copy(insetBannerDisplayType, str, str4, str3, action22);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final InsetBannerDisplayType getDisplayType() {
            return this.displayType;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getBannerTitle() {
            return this.bannerTitle;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final Action2 getAction() {
            return this.action;
        }

        @NotNull
        public final Banner copy(@NotNull InsetBannerDisplayType displayType, @NotNull String message, @Nullable String iconUrl, @Nullable String bannerTitle, @Nullable Action2 action) {
            Intrinsics.h(displayType, "displayType");
            Intrinsics.h(message, "message");
            return new Banner(displayType, message, iconUrl, bannerTitle, action);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Banner)) {
                return false;
            }
            Banner banner = (Banner) other;
            return this.displayType == banner.displayType && Intrinsics.c(this.message, banner.message) && Intrinsics.c(this.iconUrl, banner.iconUrl) && Intrinsics.c(this.bannerTitle, banner.bannerTitle) && Intrinsics.c(this.action, banner.action);
        }

        @Nullable
        public final Action2 getAction() {
            return this.action;
        }

        @Nullable
        public final String getBannerTitle() {
            return this.bannerTitle;
        }

        @NotNull
        public final InsetBannerDisplayType getDisplayType() {
            return this.displayType;
        }

        @Nullable
        public final String getIconUrl() {
            return this.iconUrl;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int iC = b.c(this.displayType.hashCode() * 31, 31, this.message);
            String str = this.iconUrl;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.bannerTitle;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Action2 action2 = this.action;
            return iHashCode2 + (action2 != null ? action2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            InsetBannerDisplayType insetBannerDisplayType = this.displayType;
            String str = this.message;
            String str2 = this.iconUrl;
            String str3 = this.bannerTitle;
            Action2 action2 = this.action;
            StringBuilder sbU = d.u("Banner(displayType=", insetBannerDisplayType, ", message=", str, ", iconUrl=");
            a.B(sbU, str2, ", bannerTitle=", str3, ", action=");
            sbU.append(action2);
            sbU.append(")");
            return sbU.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0015JF\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$BottomSheet;", "", "bottomSheetTitle", "", "bottomSheetBody", "primaryCta", "Lcom/woolworths/product/details/ProductDetailsQuery$PrimaryCta;", "secondaryCta", "Lcom/woolworths/product/details/ProductDetailsQuery$SecondaryCta;", "showOnceOnly", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/woolworths/product/details/ProductDetailsQuery$PrimaryCta;Lcom/woolworths/product/details/ProductDetailsQuery$SecondaryCta;Ljava/lang/Boolean;)V", "getBottomSheetTitle", "()Ljava/lang/String;", "getBottomSheetBody", "getPrimaryCta", "()Lcom/woolworths/product/details/ProductDetailsQuery$PrimaryCta;", "getSecondaryCta", "()Lcom/woolworths/product/details/ProductDetailsQuery$SecondaryCta;", "getShowOnceOnly", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/woolworths/product/details/ProductDetailsQuery$PrimaryCta;Lcom/woolworths/product/details/ProductDetailsQuery$SecondaryCta;Ljava/lang/Boolean;)Lcom/woolworths/product/details/ProductDetailsQuery$BottomSheet;", "equals", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BottomSheet {
        public static final int $stable = 0;

        @NotNull
        private final String bottomSheetBody;

        @NotNull
        private final String bottomSheetTitle;

        @Nullable
        private final PrimaryCta primaryCta;

        @Nullable
        private final SecondaryCta secondaryCta;

        @Nullable
        private final Boolean showOnceOnly;

        public BottomSheet(@NotNull String bottomSheetTitle, @NotNull String bottomSheetBody, @Nullable PrimaryCta primaryCta, @Nullable SecondaryCta secondaryCta, @Nullable Boolean bool) {
            Intrinsics.h(bottomSheetTitle, "bottomSheetTitle");
            Intrinsics.h(bottomSheetBody, "bottomSheetBody");
            this.bottomSheetTitle = bottomSheetTitle;
            this.bottomSheetBody = bottomSheetBody;
            this.primaryCta = primaryCta;
            this.secondaryCta = secondaryCta;
            this.showOnceOnly = bool;
        }

        public static /* synthetic */ BottomSheet copy$default(BottomSheet bottomSheet, String str, String str2, PrimaryCta primaryCta, SecondaryCta secondaryCta, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bottomSheet.bottomSheetTitle;
            }
            if ((i & 2) != 0) {
                str2 = bottomSheet.bottomSheetBody;
            }
            if ((i & 4) != 0) {
                primaryCta = bottomSheet.primaryCta;
            }
            if ((i & 8) != 0) {
                secondaryCta = bottomSheet.secondaryCta;
            }
            if ((i & 16) != 0) {
                bool = bottomSheet.showOnceOnly;
            }
            Boolean bool2 = bool;
            PrimaryCta primaryCta2 = primaryCta;
            return bottomSheet.copy(str, str2, primaryCta2, secondaryCta, bool2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getBottomSheetTitle() {
            return this.bottomSheetTitle;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getBottomSheetBody() {
            return this.bottomSheetBody;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final PrimaryCta getPrimaryCta() {
            return this.primaryCta;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final SecondaryCta getSecondaryCta() {
            return this.secondaryCta;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final Boolean getShowOnceOnly() {
            return this.showOnceOnly;
        }

        @NotNull
        public final BottomSheet copy(@NotNull String bottomSheetTitle, @NotNull String bottomSheetBody, @Nullable PrimaryCta primaryCta, @Nullable SecondaryCta secondaryCta, @Nullable Boolean showOnceOnly) {
            Intrinsics.h(bottomSheetTitle, "bottomSheetTitle");
            Intrinsics.h(bottomSheetBody, "bottomSheetBody");
            return new BottomSheet(bottomSheetTitle, bottomSheetBody, primaryCta, secondaryCta, showOnceOnly);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BottomSheet)) {
                return false;
            }
            BottomSheet bottomSheet = (BottomSheet) other;
            return Intrinsics.c(this.bottomSheetTitle, bottomSheet.bottomSheetTitle) && Intrinsics.c(this.bottomSheetBody, bottomSheet.bottomSheetBody) && Intrinsics.c(this.primaryCta, bottomSheet.primaryCta) && Intrinsics.c(this.secondaryCta, bottomSheet.secondaryCta) && Intrinsics.c(this.showOnceOnly, bottomSheet.showOnceOnly);
        }

        @NotNull
        public final String getBottomSheetBody() {
            return this.bottomSheetBody;
        }

        @NotNull
        public final String getBottomSheetTitle() {
            return this.bottomSheetTitle;
        }

        @Nullable
        public final PrimaryCta getPrimaryCta() {
            return this.primaryCta;
        }

        @Nullable
        public final SecondaryCta getSecondaryCta() {
            return this.secondaryCta;
        }

        @Nullable
        public final Boolean getShowOnceOnly() {
            return this.showOnceOnly;
        }

        public int hashCode() {
            int iC = b.c(this.bottomSheetTitle.hashCode() * 31, 31, this.bottomSheetBody);
            PrimaryCta primaryCta = this.primaryCta;
            int iHashCode = (iC + (primaryCta == null ? 0 : primaryCta.hashCode())) * 31;
            SecondaryCta secondaryCta = this.secondaryCta;
            int iHashCode2 = (iHashCode + (secondaryCta == null ? 0 : secondaryCta.hashCode())) * 31;
            Boolean bool = this.showOnceOnly;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.bottomSheetTitle;
            String str2 = this.bottomSheetBody;
            PrimaryCta primaryCta = this.primaryCta;
            SecondaryCta secondaryCta = this.secondaryCta;
            Boolean bool = this.showOnceOnly;
            StringBuilder sbV = YU.a.v("BottomSheet(bottomSheetTitle=", str, ", bottomSheetBody=", str2, ", primaryCta=");
            sbV.append(primaryCta);
            sbV.append(", secondaryCta=");
            sbV.append(secondaryCta);
            sbV.append(", showOnceOnly=");
            return au.com.woolworths.android.onesite.a.o(sbV, bool, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$Button;", "", AnnotatedPrivateKey.LABEL, "", UrlHandler.ACTION, "style", "Lau/com/woolworths/shop/graphql/type/ButtonStyle;", "enabled", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/shop/graphql/type/ButtonStyle;Z)V", "getLabel", "()Ljava/lang/String;", "getAction$annotations", "()V", "getAction", "getStyle", "()Lau/com/woolworths/shop/graphql/type/ButtonStyle;", "getEnabled", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button {
        public static final int $stable = 0;

        @Nullable
        private final String action;
        private final boolean enabled;

        @NotNull
        private final String label;

        @Nullable
        private final ButtonStyle style;

        public Button(@NotNull String label, @Nullable String str, @Nullable ButtonStyle buttonStyle, boolean z) {
            Intrinsics.h(label, "label");
            this.label = label;
            this.action = str;
            this.style = buttonStyle;
            this.enabled = z;
        }

        public static /* synthetic */ Button copy$default(Button button, String str, String str2, ButtonStyle buttonStyle, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = button.label;
            }
            if ((i & 2) != 0) {
                str2 = button.action;
            }
            if ((i & 4) != 0) {
                buttonStyle = button.style;
            }
            if ((i & 8) != 0) {
                z = button.enabled;
            }
            return button.copy(str, str2, buttonStyle, z);
        }

        @Deprecated
        public static /* synthetic */ void getAction$annotations() {
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final ButtonStyle getStyle() {
            return this.style;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        @NotNull
        public final Button copy(@NotNull String label, @Nullable String action, @Nullable ButtonStyle style, boolean enabled) {
            Intrinsics.h(label, "label");
            return new Button(label, action, style, enabled);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return Intrinsics.c(this.label, button.label) && Intrinsics.c(this.action, button.action) && this.style == button.style && this.enabled == button.enabled;
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

        public int hashCode() {
            int iHashCode = this.label.hashCode() * 31;
            String str = this.action;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ButtonStyle buttonStyle = this.style;
            return Boolean.hashCode(this.enabled) + ((iHashCode2 + (buttonStyle != null ? buttonStyle.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.label;
            String str2 = this.action;
            return au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.n(YU.a.v("Button(label=", str, ", action=", str2, ", style="), this.style, ", enabled=", this.enabled, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$Companion;", "", "<init>", "()V", "OPERATION_ID", "", "OPERATION_DOCUMENT", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_NAME", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getOPERATION_DOCUMENT() {
            return "query ProductDetails($productId: String, $barcode: String, $barcodeType: BarcodeType, $storeId: String, $supportedLinks: [String!], $isRatingsAndReviewsSummaryEnabled: Boolean!, $isHealthierOptionsEnabled: Boolean!, $isMarkdownEnabled: Boolean!, $includeOfferMinimumSpend: Boolean!, $includeAvailabilityInfoStatus: Boolean! = false , $includeProductAvailabilityStates: Boolean!, $productRatingsAndReviewsPreviewInput: ProductRatingsAndReviewsPreviewInput!, $includeActionableCard: Boolean!, $includePricingFootnote: Boolean! = false , $includeLowestPrice14Days: Boolean!) { productDetails(productId: $productId, storeId: $storeId, supportedLinks: $supportedLinks, barcode: $barcode, barcodeType: $barcodeType) { feed { __typename ... on ActionableCard @include(if: $includeActionableCard) { image altText cardHeight link analytics _excluded } ... on CouponBanner { couponBannerColorTheme couponBannerCouponCode couponBannerDescription couponBannerImage couponBannerMinimumSpend couponBannerTermsAndConditions { url title } } ... on FormattedBanner { hasIcon content style } ... on ProductCard { __typename ...productCard } ... on InsetBanner { displayType message bannerTitle: title iconUrl action { placement type label url } } ... on ProductRatingsAndReviewsSummary @include(if: $isRatingsAndReviewsSummaryEnabled) { averageRatings displayRatings maximumRating ratingText { text altText } cta { ctaText { text altText } action { type action id } } } ... on PromotionBanner { banner { displayType message iconUrl bannerTitle: title action { placement type label url } } promotionContent { __typename ... on PromotionMarkdownContent { promotionMarkdownTitle promotionMarkdownText } } } ... on FormattedContent { formattedContentTitle: title content framedContent isCollapsable } ... on ProductDisclaimer { content } ... on ProductOriginAndHealthInfo { countryOfOrigin { url text altText } healthStarRating { url text altText } } ... on ProductNutritionInfo { productNutritionTitle: title servingsPerPack servingSize bottomCaption tableHeaderRow tableRows } ... on ProductDetailsMarketplace { imageUrl marketplaceTitle: title dispatchNote sellerName brandName channel facet info { title items { title description imageUrl } footer { title subtitle linkUrl } } bottomSheet { bottomSheetTitle bottomSheetBody primaryCta { label } secondaryCta { label } showOnceOnly } } ... on HealthierHorizontalList { title subtitle linkedInfo { buttonLabel title content markdownContent @include(if: $isMarkdownEnabled) links { url text } } healthierOptions { productCard { __typename ...productCard } healthStarRating { url text altText } } } ... on DividerCard { ignored: _ } ... on Footer { buttons { label action style enabled } } ... on ProductHorizontalList { title subtitle deepLink actionTitle items { __typename ... on ProductCard { __typename ...productCard } } } } imageList { largeUrl altText } } productRatingsAndReviewsPreview(productRatingsAndReviewsPreviewInput: $productRatingsAndReviewsPreviewInput) @include(if: $isRatingsAndReviewsSummaryEnabled) { sections { __typename ... on RatingsAndReviewsPreviewHeader { __typename ...ratingsAndReviewsPreviewHeader } ... on RatingsAndReviewsRatingsDetails { __typename ...ratingsAndReviewsRatingsDetails } ... on RatingsAndReviewsReviewDetails { __typename ...ratingsAndReviewsReviewDetails } ... on RatingsAndReviewsPreviewCta { __typename ...ratingsAndReviewsPreviewCta } } } }  fragment productTrolley on ProductTrolley { minimum maximum increment defaultValue: default unit inTrolley buttonState buttonLabel buttonQuantity title }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment productCard on ProductCard { productId name isNew purchaseRestriction productImage isAvailable inStoreAvailabilityInfo @include(if: $includeProductAvailabilityStates) { button { label action style enabled } status @include(if: $includeAvailabilityInfoStatus) infoSheet { title message button { label action style enabled } } } price unitOfMeasureLabel badgeImage promotionInfo { type label } unitPriceDescription wasPrice purchaseWarning inlineLabels { type label priority } trolley { __typename ...productTrolley } trolleys { __typename ...productTrolley } list { minimum maximum increment defaultValue: default unit } inStoreDetails { locationText locationType } inStoreLocation { details { aisleNumber aisleSide bayNumber bayNumberAlternate floorNumber location x y z } displayInfo { locationText locationType } } adId source marketplace { imageUrl title sellerName brandName lowestMarketPriceDescription @include(if: $includeLowestPrice14Days) } rewardsOfferInfo { offerId offerStatus displayStatus displayExpiry minimumSpend @include(if: $includeOfferMinimumSpend) offerAnalytics { offerName campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode } boostButton { label style enabled } } disclaimer tagLabel { text style } productVarieties { totalCount label priceFamilyId } categories { name categoryLevel } isTobacco memberPriceInfo { header title subtitle } multiBuyPriceInfo { price unitPrice } cartProductInfo { totalPrice totalOriginalPrice totalDiscount } productCardAnalytics { __typename ...analyticsFields } productCardAction { action type id analytics { __typename ...analyticsFields } } pricingFootnoteMd @include(if: $includePricingFootnote) }  fragment ratingsAndReviewsPreviewHeader on RatingsAndReviewsPreviewHeader { title subtitle }  fragment ratingsAndReviewsRatingsDetails on RatingsAndReviewsRatingsDetails { sections { __typename ... on RatingsAndReviewsRatingDistributionOverview { averageRating displayRatings ratingText { text altText } maximumRating totalReviewsText cta { linkId linkAction { type action id } linkTextWithAlt { text altText } } } ... on RatingsAndReviewsRatingDistributionDetails { items { ratingScore percentage ratingCount } } ... on RatingsAndReviewsRatingDistributionWriteReview { button { buttonId label enabled buttonAction { type action id } iconUrl altText } } } }  fragment ratingsAndReviewsReviewDetails on RatingsAndReviewsReviewDetails { items { sections { __typename ... on RatingsAndReviewsReviewItemRating { rating maximumRating text } ... on RatingsAndReviewsReviewItemReviewTitle { title } ... on RatingsAndReviewsReviewItemRecommendation { recommendationText: text } ... on RatingsAndReviewsReviewItemInfo { userName createdAt } ... on RatingsAndReviewsReviewItemBody { content } } } }  fragment ratingsAndReviewsPreviewCta on RatingsAndReviewsPreviewCta { button { buttonId label enabled buttonAction { type action id } iconUrl altText } }";
        }

        private Companion() {
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$CountryOfOrigin;", "", "url", "", TextBundle.TEXT_ENTRY, "altText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getText", "getAltText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CountryOfOrigin {
        public static final int $stable = 0;

        @NotNull
        private final String altText;

        @Nullable
        private final String text;

        @Nullable
        private final String url;

        public CountryOfOrigin(@Nullable String str, @Nullable String str2, @NotNull String altText) {
            Intrinsics.h(altText, "altText");
            this.url = str;
            this.text = str2;
            this.altText = altText;
        }

        public static /* synthetic */ CountryOfOrigin copy$default(CountryOfOrigin countryOfOrigin, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = countryOfOrigin.url;
            }
            if ((i & 2) != 0) {
                str2 = countryOfOrigin.text;
            }
            if ((i & 4) != 0) {
                str3 = countryOfOrigin.altText;
            }
            return countryOfOrigin.copy(str, str2, str3);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getAltText() {
            return this.altText;
        }

        @NotNull
        public final CountryOfOrigin copy(@Nullable String url, @Nullable String text, @NotNull String altText) {
            Intrinsics.h(altText, "altText");
            return new CountryOfOrigin(url, text, altText);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CountryOfOrigin)) {
                return false;
            }
            CountryOfOrigin countryOfOrigin = (CountryOfOrigin) other;
            return Intrinsics.c(this.url, countryOfOrigin.url) && Intrinsics.c(this.text, countryOfOrigin.text) && Intrinsics.c(this.altText, countryOfOrigin.altText);
        }

        @NotNull
        public final String getAltText() {
            return this.altText;
        }

        @Nullable
        public final String getText() {
            return this.text;
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String str = this.url;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.text;
            return this.altText.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.url;
            String str2 = this.text;
            return YU.a.o(YU.a.v("CountryOfOrigin(url=", str, ", text=", str2, ", altText="), this.altText, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$CouponBannerTermsAndConditions;", "", "url", "", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CouponBannerTermsAndConditions {
        public static final int $stable = 0;

        @NotNull
        private final String title;

        @NotNull
        private final String url;

        public CouponBannerTermsAndConditions(@NotNull String url, @NotNull String title) {
            Intrinsics.h(url, "url");
            Intrinsics.h(title, "title");
            this.url = url;
            this.title = title;
        }

        public static /* synthetic */ CouponBannerTermsAndConditions copy$default(CouponBannerTermsAndConditions couponBannerTermsAndConditions, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = couponBannerTermsAndConditions.url;
            }
            if ((i & 2) != 0) {
                str2 = couponBannerTermsAndConditions.title;
            }
            return couponBannerTermsAndConditions.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final CouponBannerTermsAndConditions copy(@NotNull String url, @NotNull String title) {
            Intrinsics.h(url, "url");
            Intrinsics.h(title, "title");
            return new CouponBannerTermsAndConditions(url, title);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CouponBannerTermsAndConditions)) {
                return false;
            }
            CouponBannerTermsAndConditions couponBannerTermsAndConditions = (CouponBannerTermsAndConditions) other;
            return Intrinsics.c(this.url, couponBannerTermsAndConditions.url) && Intrinsics.c(this.title, couponBannerTermsAndConditions.title);
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.title.hashCode() + (this.url.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return YU.a.j("CouponBannerTermsAndConditions(url=", this.url, ", title=", this.title, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$Cta;", "", "ctaText", "Lcom/woolworths/product/details/ProductDetailsQuery$CtaText;", UrlHandler.ACTION, "Lcom/woolworths/product/details/ProductDetailsQuery$Action1;", "<init>", "(Lcom/woolworths/product/details/ProductDetailsQuery$CtaText;Lcom/woolworths/product/details/ProductDetailsQuery$Action1;)V", "getCtaText", "()Lcom/woolworths/product/details/ProductDetailsQuery$CtaText;", "getAction", "()Lcom/woolworths/product/details/ProductDetailsQuery$Action1;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Cta {
        public static final int $stable = 0;

        @NotNull
        private final Action1 action;

        @NotNull
        private final CtaText ctaText;

        public Cta(@NotNull CtaText ctaText, @NotNull Action1 action) {
            Intrinsics.h(ctaText, "ctaText");
            Intrinsics.h(action, "action");
            this.ctaText = ctaText;
            this.action = action;
        }

        public static /* synthetic */ Cta copy$default(Cta cta, CtaText ctaText, Action1 action1, int i, Object obj) {
            if ((i & 1) != 0) {
                ctaText = cta.ctaText;
            }
            if ((i & 2) != 0) {
                action1 = cta.action;
            }
            return cta.copy(ctaText, action1);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CtaText getCtaText() {
            return this.ctaText;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Action1 getAction() {
            return this.action;
        }

        @NotNull
        public final Cta copy(@NotNull CtaText ctaText, @NotNull Action1 action) {
            Intrinsics.h(ctaText, "ctaText");
            Intrinsics.h(action, "action");
            return new Cta(ctaText, action);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Cta)) {
                return false;
            }
            Cta cta = (Cta) other;
            return Intrinsics.c(this.ctaText, cta.ctaText) && Intrinsics.c(this.action, cta.action);
        }

        @NotNull
        public final Action1 getAction() {
            return this.action;
        }

        @NotNull
        public final CtaText getCtaText() {
            return this.ctaText;
        }

        public int hashCode() {
            return this.action.hashCode() + (this.ctaText.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Cta(ctaText=" + this.ctaText + ", action=" + this.action + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$CtaText;", "", TextBundle.TEXT_ENTRY, "", "altText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getAltText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CtaText {
        public static final int $stable = 0;

        @NotNull
        private final String altText;

        @NotNull
        private final String text;

        public CtaText(@NotNull String text, @NotNull String altText) {
            Intrinsics.h(text, "text");
            Intrinsics.h(altText, "altText");
            this.text = text;
            this.altText = altText;
        }

        public static /* synthetic */ CtaText copy$default(CtaText ctaText, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ctaText.text;
            }
            if ((i & 2) != 0) {
                str2 = ctaText.altText;
            }
            return ctaText.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getAltText() {
            return this.altText;
        }

        @NotNull
        public final CtaText copy(@NotNull String text, @NotNull String altText) {
            Intrinsics.h(text, "text");
            Intrinsics.h(altText, "altText");
            return new CtaText(text, altText);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CtaText)) {
                return false;
            }
            CtaText ctaText = (CtaText) other;
            return Intrinsics.c(this.text, ctaText.text) && Intrinsics.c(this.altText, ctaText.altText);
        }

        @NotNull
        public final String getAltText() {
            return this.altText;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.altText.hashCode() + (this.text.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return YU.a.j("CtaText(text=", this.text, ", altText=", this.altText, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "productDetails", "Lcom/woolworths/product/details/ProductDetailsQuery$ProductDetails;", "productRatingsAndReviewsPreview", "Lcom/woolworths/product/details/ProductDetailsQuery$ProductRatingsAndReviewsPreview;", "<init>", "(Lcom/woolworths/product/details/ProductDetailsQuery$ProductDetails;Lcom/woolworths/product/details/ProductDetailsQuery$ProductRatingsAndReviewsPreview;)V", "getProductDetails", "()Lcom/woolworths/product/details/ProductDetailsQuery$ProductDetails;", "getProductRatingsAndReviewsPreview", "()Lcom/woolworths/product/details/ProductDetailsQuery$ProductRatingsAndReviewsPreview;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {
        public static final int $stable = 8;

        @Nullable
        private final ProductDetails productDetails;

        @Nullable
        private final ProductRatingsAndReviewsPreview productRatingsAndReviewsPreview;

        public Data(@Nullable ProductDetails productDetails, @Nullable ProductRatingsAndReviewsPreview productRatingsAndReviewsPreview) {
            this.productDetails = productDetails;
            this.productRatingsAndReviewsPreview = productRatingsAndReviewsPreview;
        }

        public static /* synthetic */ Data copy$default(Data data, ProductDetails productDetails, ProductRatingsAndReviewsPreview productRatingsAndReviewsPreview, int i, Object obj) {
            if ((i & 1) != 0) {
                productDetails = data.productDetails;
            }
            if ((i & 2) != 0) {
                productRatingsAndReviewsPreview = data.productRatingsAndReviewsPreview;
            }
            return data.copy(productDetails, productRatingsAndReviewsPreview);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final ProductDetails getProductDetails() {
            return this.productDetails;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final ProductRatingsAndReviewsPreview getProductRatingsAndReviewsPreview() {
            return this.productRatingsAndReviewsPreview;
        }

        @NotNull
        public final Data copy(@Nullable ProductDetails productDetails, @Nullable ProductRatingsAndReviewsPreview productRatingsAndReviewsPreview) {
            return new Data(productDetails, productRatingsAndReviewsPreview);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return Intrinsics.c(this.productDetails, data.productDetails) && Intrinsics.c(this.productRatingsAndReviewsPreview, data.productRatingsAndReviewsPreview);
        }

        @Nullable
        public final ProductDetails getProductDetails() {
            return this.productDetails;
        }

        @Nullable
        public final ProductRatingsAndReviewsPreview getProductRatingsAndReviewsPreview() {
            return this.productRatingsAndReviewsPreview;
        }

        public int hashCode() {
            ProductDetails productDetails = this.productDetails;
            int iHashCode = (productDetails == null ? 0 : productDetails.hashCode()) * 31;
            ProductRatingsAndReviewsPreview productRatingsAndReviewsPreview = this.productRatingsAndReviewsPreview;
            return iHashCode + (productRatingsAndReviewsPreview != null ? productRatingsAndReviewsPreview.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Data(productDetails=" + this.productDetails + ", productRatingsAndReviewsPreview=" + this.productRatingsAndReviewsPreview + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010 \u001a\u0004\u0018\u00010!\u0012\b\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\u0004\b$\u0010%J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010!HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010#HÆ\u0003JÓ\u0001\u0010Y\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#HÆ\u0001J\u0013\u0010Z\u001a\u00020[2\b\u0010\\\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010]\u001a\u00020^HÖ\u0001J\t\u0010_\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0013\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\b\n\u0000\u001a\u0004\bF\u0010G¨\u0006`"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$Feed;", "", "__typename", "", "onActionableCard", "Lcom/woolworths/product/details/ProductDetailsQuery$OnActionableCard;", "onCouponBanner", "Lcom/woolworths/product/details/ProductDetailsQuery$OnCouponBanner;", "onFormattedBanner", "Lcom/woolworths/product/details/ProductDetailsQuery$OnFormattedBanner;", "onProductCard", "Lcom/woolworths/product/details/ProductDetailsQuery$OnProductCard;", "onInsetBanner", "Lcom/woolworths/product/details/ProductDetailsQuery$OnInsetBanner;", "onProductRatingsAndReviewsSummary", "Lcom/woolworths/product/details/ProductDetailsQuery$OnProductRatingsAndReviewsSummary;", "onPromotionBanner", "Lcom/woolworths/product/details/ProductDetailsQuery$OnPromotionBanner;", "onFormattedContent", "Lcom/woolworths/product/details/ProductDetailsQuery$OnFormattedContent;", "onProductDisclaimer", "Lcom/woolworths/product/details/ProductDetailsQuery$OnProductDisclaimer;", "onProductOriginAndHealthInfo", "Lcom/woolworths/product/details/ProductDetailsQuery$OnProductOriginAndHealthInfo;", "onProductNutritionInfo", "Lcom/woolworths/product/details/ProductDetailsQuery$OnProductNutritionInfo;", "onProductDetailsMarketplace", "Lcom/woolworths/product/details/ProductDetailsQuery$OnProductDetailsMarketplace;", "onHealthierHorizontalList", "Lcom/woolworths/product/details/ProductDetailsQuery$OnHealthierHorizontalList;", "onDividerCard", "Lcom/woolworths/product/details/ProductDetailsQuery$OnDividerCard;", "onFooter", "Lcom/woolworths/product/details/ProductDetailsQuery$OnFooter;", "onProductHorizontalList", "Lcom/woolworths/product/details/ProductDetailsQuery$OnProductHorizontalList;", "<init>", "(Ljava/lang/String;Lcom/woolworths/product/details/ProductDetailsQuery$OnActionableCard;Lcom/woolworths/product/details/ProductDetailsQuery$OnCouponBanner;Lcom/woolworths/product/details/ProductDetailsQuery$OnFormattedBanner;Lcom/woolworths/product/details/ProductDetailsQuery$OnProductCard;Lcom/woolworths/product/details/ProductDetailsQuery$OnInsetBanner;Lcom/woolworths/product/details/ProductDetailsQuery$OnProductRatingsAndReviewsSummary;Lcom/woolworths/product/details/ProductDetailsQuery$OnPromotionBanner;Lcom/woolworths/product/details/ProductDetailsQuery$OnFormattedContent;Lcom/woolworths/product/details/ProductDetailsQuery$OnProductDisclaimer;Lcom/woolworths/product/details/ProductDetailsQuery$OnProductOriginAndHealthInfo;Lcom/woolworths/product/details/ProductDetailsQuery$OnProductNutritionInfo;Lcom/woolworths/product/details/ProductDetailsQuery$OnProductDetailsMarketplace;Lcom/woolworths/product/details/ProductDetailsQuery$OnHealthierHorizontalList;Lcom/woolworths/product/details/ProductDetailsQuery$OnDividerCard;Lcom/woolworths/product/details/ProductDetailsQuery$OnFooter;Lcom/woolworths/product/details/ProductDetailsQuery$OnProductHorizontalList;)V", "get__typename", "()Ljava/lang/String;", "getOnActionableCard", "()Lcom/woolworths/product/details/ProductDetailsQuery$OnActionableCard;", "getOnCouponBanner", "()Lcom/woolworths/product/details/ProductDetailsQuery$OnCouponBanner;", "getOnFormattedBanner", "()Lcom/woolworths/product/details/ProductDetailsQuery$OnFormattedBanner;", "getOnProductCard", "()Lcom/woolworths/product/details/ProductDetailsQuery$OnProductCard;", "getOnInsetBanner", "()Lcom/woolworths/product/details/ProductDetailsQuery$OnInsetBanner;", "getOnProductRatingsAndReviewsSummary", "()Lcom/woolworths/product/details/ProductDetailsQuery$OnProductRatingsAndReviewsSummary;", "getOnPromotionBanner", "()Lcom/woolworths/product/details/ProductDetailsQuery$OnPromotionBanner;", "getOnFormattedContent", "()Lcom/woolworths/product/details/ProductDetailsQuery$OnFormattedContent;", "getOnProductDisclaimer", "()Lcom/woolworths/product/details/ProductDetailsQuery$OnProductDisclaimer;", "getOnProductOriginAndHealthInfo", "()Lcom/woolworths/product/details/ProductDetailsQuery$OnProductOriginAndHealthInfo;", "getOnProductNutritionInfo", "()Lcom/woolworths/product/details/ProductDetailsQuery$OnProductNutritionInfo;", "getOnProductDetailsMarketplace", "()Lcom/woolworths/product/details/ProductDetailsQuery$OnProductDetailsMarketplace;", "getOnHealthierHorizontalList", "()Lcom/woolworths/product/details/ProductDetailsQuery$OnHealthierHorizontalList;", "getOnDividerCard", "()Lcom/woolworths/product/details/ProductDetailsQuery$OnDividerCard;", "getOnFooter", "()Lcom/woolworths/product/details/ProductDetailsQuery$OnFooter;", "getOnProductHorizontalList", "()Lcom/woolworths/product/details/ProductDetailsQuery$OnProductHorizontalList;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Feed {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @Nullable
        private final OnActionableCard onActionableCard;

        @Nullable
        private final OnCouponBanner onCouponBanner;

        @Nullable
        private final OnDividerCard onDividerCard;

        @Nullable
        private final OnFooter onFooter;

        @Nullable
        private final OnFormattedBanner onFormattedBanner;

        @Nullable
        private final OnFormattedContent onFormattedContent;

        @Nullable
        private final OnHealthierHorizontalList onHealthierHorizontalList;

        @Nullable
        private final OnInsetBanner onInsetBanner;

        @Nullable
        private final OnProductCard onProductCard;

        @Nullable
        private final OnProductDetailsMarketplace onProductDetailsMarketplace;

        @Nullable
        private final OnProductDisclaimer onProductDisclaimer;

        @Nullable
        private final OnProductHorizontalList onProductHorizontalList;

        @Nullable
        private final OnProductNutritionInfo onProductNutritionInfo;

        @Nullable
        private final OnProductOriginAndHealthInfo onProductOriginAndHealthInfo;

        @Nullable
        private final OnProductRatingsAndReviewsSummary onProductRatingsAndReviewsSummary;

        @Nullable
        private final OnPromotionBanner onPromotionBanner;

        public Feed(@NotNull String __typename, @Nullable OnActionableCard onActionableCard, @Nullable OnCouponBanner onCouponBanner, @Nullable OnFormattedBanner onFormattedBanner, @Nullable OnProductCard onProductCard, @Nullable OnInsetBanner onInsetBanner, @Nullable OnProductRatingsAndReviewsSummary onProductRatingsAndReviewsSummary, @Nullable OnPromotionBanner onPromotionBanner, @Nullable OnFormattedContent onFormattedContent, @Nullable OnProductDisclaimer onProductDisclaimer, @Nullable OnProductOriginAndHealthInfo onProductOriginAndHealthInfo, @Nullable OnProductNutritionInfo onProductNutritionInfo, @Nullable OnProductDetailsMarketplace onProductDetailsMarketplace, @Nullable OnHealthierHorizontalList onHealthierHorizontalList, @Nullable OnDividerCard onDividerCard, @Nullable OnFooter onFooter, @Nullable OnProductHorizontalList onProductHorizontalList) {
            Intrinsics.h(__typename, "__typename");
            this.__typename = __typename;
            this.onActionableCard = onActionableCard;
            this.onCouponBanner = onCouponBanner;
            this.onFormattedBanner = onFormattedBanner;
            this.onProductCard = onProductCard;
            this.onInsetBanner = onInsetBanner;
            this.onProductRatingsAndReviewsSummary = onProductRatingsAndReviewsSummary;
            this.onPromotionBanner = onPromotionBanner;
            this.onFormattedContent = onFormattedContent;
            this.onProductDisclaimer = onProductDisclaimer;
            this.onProductOriginAndHealthInfo = onProductOriginAndHealthInfo;
            this.onProductNutritionInfo = onProductNutritionInfo;
            this.onProductDetailsMarketplace = onProductDetailsMarketplace;
            this.onHealthierHorizontalList = onHealthierHorizontalList;
            this.onDividerCard = onDividerCard;
            this.onFooter = onFooter;
            this.onProductHorizontalList = onProductHorizontalList;
        }

        public static /* synthetic */ Feed copy$default(Feed feed, String str, OnActionableCard onActionableCard, OnCouponBanner onCouponBanner, OnFormattedBanner onFormattedBanner, OnProductCard onProductCard, OnInsetBanner onInsetBanner, OnProductRatingsAndReviewsSummary onProductRatingsAndReviewsSummary, OnPromotionBanner onPromotionBanner, OnFormattedContent onFormattedContent, OnProductDisclaimer onProductDisclaimer, OnProductOriginAndHealthInfo onProductOriginAndHealthInfo, OnProductNutritionInfo onProductNutritionInfo, OnProductDetailsMarketplace onProductDetailsMarketplace, OnHealthierHorizontalList onHealthierHorizontalList, OnDividerCard onDividerCard, OnFooter onFooter, OnProductHorizontalList onProductHorizontalList, int i, Object obj) {
            OnProductHorizontalList onProductHorizontalList2;
            OnFooter onFooter2;
            String str2;
            Feed feed2;
            OnDividerCard onDividerCard2;
            OnActionableCard onActionableCard2;
            OnCouponBanner onCouponBanner2;
            OnFormattedBanner onFormattedBanner2;
            OnProductCard onProductCard2;
            OnInsetBanner onInsetBanner2;
            OnProductRatingsAndReviewsSummary onProductRatingsAndReviewsSummary2;
            OnPromotionBanner onPromotionBanner2;
            OnFormattedContent onFormattedContent2;
            OnProductDisclaimer onProductDisclaimer2;
            OnProductOriginAndHealthInfo onProductOriginAndHealthInfo2;
            OnProductNutritionInfo onProductNutritionInfo2;
            OnProductDetailsMarketplace onProductDetailsMarketplace2;
            OnHealthierHorizontalList onHealthierHorizontalList2;
            String str3 = (i & 1) != 0 ? feed.__typename : str;
            OnActionableCard onActionableCard3 = (i & 2) != 0 ? feed.onActionableCard : onActionableCard;
            OnCouponBanner onCouponBanner3 = (i & 4) != 0 ? feed.onCouponBanner : onCouponBanner;
            OnFormattedBanner onFormattedBanner3 = (i & 8) != 0 ? feed.onFormattedBanner : onFormattedBanner;
            OnProductCard onProductCard3 = (i & 16) != 0 ? feed.onProductCard : onProductCard;
            OnInsetBanner onInsetBanner3 = (i & 32) != 0 ? feed.onInsetBanner : onInsetBanner;
            OnProductRatingsAndReviewsSummary onProductRatingsAndReviewsSummary3 = (i & 64) != 0 ? feed.onProductRatingsAndReviewsSummary : onProductRatingsAndReviewsSummary;
            OnPromotionBanner onPromotionBanner3 = (i & 128) != 0 ? feed.onPromotionBanner : onPromotionBanner;
            OnFormattedContent onFormattedContent3 = (i & 256) != 0 ? feed.onFormattedContent : onFormattedContent;
            OnProductDisclaimer onProductDisclaimer3 = (i & 512) != 0 ? feed.onProductDisclaimer : onProductDisclaimer;
            OnProductOriginAndHealthInfo onProductOriginAndHealthInfo3 = (i & 1024) != 0 ? feed.onProductOriginAndHealthInfo : onProductOriginAndHealthInfo;
            OnProductNutritionInfo onProductNutritionInfo3 = (i & 2048) != 0 ? feed.onProductNutritionInfo : onProductNutritionInfo;
            OnProductDetailsMarketplace onProductDetailsMarketplace3 = (i & 4096) != 0 ? feed.onProductDetailsMarketplace : onProductDetailsMarketplace;
            OnHealthierHorizontalList onHealthierHorizontalList3 = (i & 8192) != 0 ? feed.onHealthierHorizontalList : onHealthierHorizontalList;
            String str4 = str3;
            OnDividerCard onDividerCard3 = (i & 16384) != 0 ? feed.onDividerCard : onDividerCard;
            OnFooter onFooter3 = (i & 32768) != 0 ? feed.onFooter : onFooter;
            if ((i & 65536) != 0) {
                onFooter2 = onFooter3;
                onProductHorizontalList2 = feed.onProductHorizontalList;
                onDividerCard2 = onDividerCard3;
                onActionableCard2 = onActionableCard3;
                onCouponBanner2 = onCouponBanner3;
                onFormattedBanner2 = onFormattedBanner3;
                onProductCard2 = onProductCard3;
                onInsetBanner2 = onInsetBanner3;
                onProductRatingsAndReviewsSummary2 = onProductRatingsAndReviewsSummary3;
                onPromotionBanner2 = onPromotionBanner3;
                onFormattedContent2 = onFormattedContent3;
                onProductDisclaimer2 = onProductDisclaimer3;
                onProductOriginAndHealthInfo2 = onProductOriginAndHealthInfo3;
                onProductNutritionInfo2 = onProductNutritionInfo3;
                onProductDetailsMarketplace2 = onProductDetailsMarketplace3;
                onHealthierHorizontalList2 = onHealthierHorizontalList3;
                str2 = str4;
                feed2 = feed;
            } else {
                onProductHorizontalList2 = onProductHorizontalList;
                onFooter2 = onFooter3;
                str2 = str4;
                feed2 = feed;
                onDividerCard2 = onDividerCard3;
                onActionableCard2 = onActionableCard3;
                onCouponBanner2 = onCouponBanner3;
                onFormattedBanner2 = onFormattedBanner3;
                onProductCard2 = onProductCard3;
                onInsetBanner2 = onInsetBanner3;
                onProductRatingsAndReviewsSummary2 = onProductRatingsAndReviewsSummary3;
                onPromotionBanner2 = onPromotionBanner3;
                onFormattedContent2 = onFormattedContent3;
                onProductDisclaimer2 = onProductDisclaimer3;
                onProductOriginAndHealthInfo2 = onProductOriginAndHealthInfo3;
                onProductNutritionInfo2 = onProductNutritionInfo3;
                onProductDetailsMarketplace2 = onProductDetailsMarketplace3;
                onHealthierHorizontalList2 = onHealthierHorizontalList3;
            }
            return feed2.copy(str2, onActionableCard2, onCouponBanner2, onFormattedBanner2, onProductCard2, onInsetBanner2, onProductRatingsAndReviewsSummary2, onPromotionBanner2, onFormattedContent2, onProductDisclaimer2, onProductOriginAndHealthInfo2, onProductNutritionInfo2, onProductDetailsMarketplace2, onHealthierHorizontalList2, onDividerCard2, onFooter2, onProductHorizontalList2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @Nullable
        /* renamed from: component10, reason: from getter */
        public final OnProductDisclaimer getOnProductDisclaimer() {
            return this.onProductDisclaimer;
        }

        @Nullable
        /* renamed from: component11, reason: from getter */
        public final OnProductOriginAndHealthInfo getOnProductOriginAndHealthInfo() {
            return this.onProductOriginAndHealthInfo;
        }

        @Nullable
        /* renamed from: component12, reason: from getter */
        public final OnProductNutritionInfo getOnProductNutritionInfo() {
            return this.onProductNutritionInfo;
        }

        @Nullable
        /* renamed from: component13, reason: from getter */
        public final OnProductDetailsMarketplace getOnProductDetailsMarketplace() {
            return this.onProductDetailsMarketplace;
        }

        @Nullable
        /* renamed from: component14, reason: from getter */
        public final OnHealthierHorizontalList getOnHealthierHorizontalList() {
            return this.onHealthierHorizontalList;
        }

        @Nullable
        /* renamed from: component15, reason: from getter */
        public final OnDividerCard getOnDividerCard() {
            return this.onDividerCard;
        }

        @Nullable
        /* renamed from: component16, reason: from getter */
        public final OnFooter getOnFooter() {
            return this.onFooter;
        }

        @Nullable
        /* renamed from: component17, reason: from getter */
        public final OnProductHorizontalList getOnProductHorizontalList() {
            return this.onProductHorizontalList;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final OnActionableCard getOnActionableCard() {
            return this.onActionableCard;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final OnCouponBanner getOnCouponBanner() {
            return this.onCouponBanner;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final OnFormattedBanner getOnFormattedBanner() {
            return this.onFormattedBanner;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final OnProductCard getOnProductCard() {
            return this.onProductCard;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final OnInsetBanner getOnInsetBanner() {
            return this.onInsetBanner;
        }

        @Nullable
        /* renamed from: component7, reason: from getter */
        public final OnProductRatingsAndReviewsSummary getOnProductRatingsAndReviewsSummary() {
            return this.onProductRatingsAndReviewsSummary;
        }

        @Nullable
        /* renamed from: component8, reason: from getter */
        public final OnPromotionBanner getOnPromotionBanner() {
            return this.onPromotionBanner;
        }

        @Nullable
        /* renamed from: component9, reason: from getter */
        public final OnFormattedContent getOnFormattedContent() {
            return this.onFormattedContent;
        }

        @NotNull
        public final Feed copy(@NotNull String __typename, @Nullable OnActionableCard onActionableCard, @Nullable OnCouponBanner onCouponBanner, @Nullable OnFormattedBanner onFormattedBanner, @Nullable OnProductCard onProductCard, @Nullable OnInsetBanner onInsetBanner, @Nullable OnProductRatingsAndReviewsSummary onProductRatingsAndReviewsSummary, @Nullable OnPromotionBanner onPromotionBanner, @Nullable OnFormattedContent onFormattedContent, @Nullable OnProductDisclaimer onProductDisclaimer, @Nullable OnProductOriginAndHealthInfo onProductOriginAndHealthInfo, @Nullable OnProductNutritionInfo onProductNutritionInfo, @Nullable OnProductDetailsMarketplace onProductDetailsMarketplace, @Nullable OnHealthierHorizontalList onHealthierHorizontalList, @Nullable OnDividerCard onDividerCard, @Nullable OnFooter onFooter, @Nullable OnProductHorizontalList onProductHorizontalList) {
            Intrinsics.h(__typename, "__typename");
            return new Feed(__typename, onActionableCard, onCouponBanner, onFormattedBanner, onProductCard, onInsetBanner, onProductRatingsAndReviewsSummary, onPromotionBanner, onFormattedContent, onProductDisclaimer, onProductOriginAndHealthInfo, onProductNutritionInfo, onProductDetailsMarketplace, onHealthierHorizontalList, onDividerCard, onFooter, onProductHorizontalList);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Feed)) {
                return false;
            }
            Feed feed = (Feed) other;
            return Intrinsics.c(this.__typename, feed.__typename) && Intrinsics.c(this.onActionableCard, feed.onActionableCard) && Intrinsics.c(this.onCouponBanner, feed.onCouponBanner) && Intrinsics.c(this.onFormattedBanner, feed.onFormattedBanner) && Intrinsics.c(this.onProductCard, feed.onProductCard) && Intrinsics.c(this.onInsetBanner, feed.onInsetBanner) && Intrinsics.c(this.onProductRatingsAndReviewsSummary, feed.onProductRatingsAndReviewsSummary) && Intrinsics.c(this.onPromotionBanner, feed.onPromotionBanner) && Intrinsics.c(this.onFormattedContent, feed.onFormattedContent) && Intrinsics.c(this.onProductDisclaimer, feed.onProductDisclaimer) && Intrinsics.c(this.onProductOriginAndHealthInfo, feed.onProductOriginAndHealthInfo) && Intrinsics.c(this.onProductNutritionInfo, feed.onProductNutritionInfo) && Intrinsics.c(this.onProductDetailsMarketplace, feed.onProductDetailsMarketplace) && Intrinsics.c(this.onHealthierHorizontalList, feed.onHealthierHorizontalList) && Intrinsics.c(this.onDividerCard, feed.onDividerCard) && Intrinsics.c(this.onFooter, feed.onFooter) && Intrinsics.c(this.onProductHorizontalList, feed.onProductHorizontalList);
        }

        @Nullable
        public final OnActionableCard getOnActionableCard() {
            return this.onActionableCard;
        }

        @Nullable
        public final OnCouponBanner getOnCouponBanner() {
            return this.onCouponBanner;
        }

        @Nullable
        public final OnDividerCard getOnDividerCard() {
            return this.onDividerCard;
        }

        @Nullable
        public final OnFooter getOnFooter() {
            return this.onFooter;
        }

        @Nullable
        public final OnFormattedBanner getOnFormattedBanner() {
            return this.onFormattedBanner;
        }

        @Nullable
        public final OnFormattedContent getOnFormattedContent() {
            return this.onFormattedContent;
        }

        @Nullable
        public final OnHealthierHorizontalList getOnHealthierHorizontalList() {
            return this.onHealthierHorizontalList;
        }

        @Nullable
        public final OnInsetBanner getOnInsetBanner() {
            return this.onInsetBanner;
        }

        @Nullable
        public final OnProductCard getOnProductCard() {
            return this.onProductCard;
        }

        @Nullable
        public final OnProductDetailsMarketplace getOnProductDetailsMarketplace() {
            return this.onProductDetailsMarketplace;
        }

        @Nullable
        public final OnProductDisclaimer getOnProductDisclaimer() {
            return this.onProductDisclaimer;
        }

        @Nullable
        public final OnProductHorizontalList getOnProductHorizontalList() {
            return this.onProductHorizontalList;
        }

        @Nullable
        public final OnProductNutritionInfo getOnProductNutritionInfo() {
            return this.onProductNutritionInfo;
        }

        @Nullable
        public final OnProductOriginAndHealthInfo getOnProductOriginAndHealthInfo() {
            return this.onProductOriginAndHealthInfo;
        }

        @Nullable
        public final OnProductRatingsAndReviewsSummary getOnProductRatingsAndReviewsSummary() {
            return this.onProductRatingsAndReviewsSummary;
        }

        @Nullable
        public final OnPromotionBanner getOnPromotionBanner() {
            return this.onPromotionBanner;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int iHashCode = this.__typename.hashCode() * 31;
            OnActionableCard onActionableCard = this.onActionableCard;
            int iHashCode2 = (iHashCode + (onActionableCard == null ? 0 : onActionableCard.hashCode())) * 31;
            OnCouponBanner onCouponBanner = this.onCouponBanner;
            int iHashCode3 = (iHashCode2 + (onCouponBanner == null ? 0 : onCouponBanner.hashCode())) * 31;
            OnFormattedBanner onFormattedBanner = this.onFormattedBanner;
            int iHashCode4 = (iHashCode3 + (onFormattedBanner == null ? 0 : onFormattedBanner.hashCode())) * 31;
            OnProductCard onProductCard = this.onProductCard;
            int iHashCode5 = (iHashCode4 + (onProductCard == null ? 0 : onProductCard.hashCode())) * 31;
            OnInsetBanner onInsetBanner = this.onInsetBanner;
            int iHashCode6 = (iHashCode5 + (onInsetBanner == null ? 0 : onInsetBanner.hashCode())) * 31;
            OnProductRatingsAndReviewsSummary onProductRatingsAndReviewsSummary = this.onProductRatingsAndReviewsSummary;
            int iHashCode7 = (iHashCode6 + (onProductRatingsAndReviewsSummary == null ? 0 : onProductRatingsAndReviewsSummary.hashCode())) * 31;
            OnPromotionBanner onPromotionBanner = this.onPromotionBanner;
            int iHashCode8 = (iHashCode7 + (onPromotionBanner == null ? 0 : onPromotionBanner.hashCode())) * 31;
            OnFormattedContent onFormattedContent = this.onFormattedContent;
            int iHashCode9 = (iHashCode8 + (onFormattedContent == null ? 0 : onFormattedContent.hashCode())) * 31;
            OnProductDisclaimer onProductDisclaimer = this.onProductDisclaimer;
            int iHashCode10 = (iHashCode9 + (onProductDisclaimer == null ? 0 : onProductDisclaimer.hashCode())) * 31;
            OnProductOriginAndHealthInfo onProductOriginAndHealthInfo = this.onProductOriginAndHealthInfo;
            int iHashCode11 = (iHashCode10 + (onProductOriginAndHealthInfo == null ? 0 : onProductOriginAndHealthInfo.hashCode())) * 31;
            OnProductNutritionInfo onProductNutritionInfo = this.onProductNutritionInfo;
            int iHashCode12 = (iHashCode11 + (onProductNutritionInfo == null ? 0 : onProductNutritionInfo.hashCode())) * 31;
            OnProductDetailsMarketplace onProductDetailsMarketplace = this.onProductDetailsMarketplace;
            int iHashCode13 = (iHashCode12 + (onProductDetailsMarketplace == null ? 0 : onProductDetailsMarketplace.hashCode())) * 31;
            OnHealthierHorizontalList onHealthierHorizontalList = this.onHealthierHorizontalList;
            int iHashCode14 = (iHashCode13 + (onHealthierHorizontalList == null ? 0 : onHealthierHorizontalList.hashCode())) * 31;
            OnDividerCard onDividerCard = this.onDividerCard;
            int iHashCode15 = (iHashCode14 + (onDividerCard == null ? 0 : onDividerCard.hashCode())) * 31;
            OnFooter onFooter = this.onFooter;
            int iHashCode16 = (iHashCode15 + (onFooter == null ? 0 : onFooter.hashCode())) * 31;
            OnProductHorizontalList onProductHorizontalList = this.onProductHorizontalList;
            return iHashCode16 + (onProductHorizontalList != null ? onProductHorizontalList.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Feed(__typename=" + this.__typename + ", onActionableCard=" + this.onActionableCard + ", onCouponBanner=" + this.onCouponBanner + ", onFormattedBanner=" + this.onFormattedBanner + ", onProductCard=" + this.onProductCard + ", onInsetBanner=" + this.onInsetBanner + ", onProductRatingsAndReviewsSummary=" + this.onProductRatingsAndReviewsSummary + ", onPromotionBanner=" + this.onPromotionBanner + ", onFormattedContent=" + this.onFormattedContent + ", onProductDisclaimer=" + this.onProductDisclaimer + ", onProductOriginAndHealthInfo=" + this.onProductOriginAndHealthInfo + ", onProductNutritionInfo=" + this.onProductNutritionInfo + ", onProductDetailsMarketplace=" + this.onProductDetailsMarketplace + ", onHealthierHorizontalList=" + this.onHealthierHorizontalList + ", onDividerCard=" + this.onDividerCard + ", onFooter=" + this.onFooter + ", onProductHorizontalList=" + this.onProductHorizontalList + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$Footer;", "", "title", "", NotificationMessage.NOTIF_KEY_SUB_TITLE, "linkUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getLinkUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Footer {
        public static final int $stable = 0;

        @NotNull
        private final String linkUrl;

        @NotNull
        private final String subtitle;

        @NotNull
        private final String title;

        public Footer(@NotNull String title, @NotNull String subtitle, @NotNull String linkUrl) {
            Intrinsics.h(title, "title");
            Intrinsics.h(subtitle, "subtitle");
            Intrinsics.h(linkUrl, "linkUrl");
            this.title = title;
            this.subtitle = subtitle;
            this.linkUrl = linkUrl;
        }

        public static /* synthetic */ Footer copy$default(Footer footer, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = footer.title;
            }
            if ((i & 2) != 0) {
                str2 = footer.subtitle;
            }
            if ((i & 4) != 0) {
                str3 = footer.linkUrl;
            }
            return footer.copy(str, str2, str3);
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
        public final String getLinkUrl() {
            return this.linkUrl;
        }

        @NotNull
        public final Footer copy(@NotNull String title, @NotNull String subtitle, @NotNull String linkUrl) {
            Intrinsics.h(title, "title");
            Intrinsics.h(subtitle, "subtitle");
            Intrinsics.h(linkUrl, "linkUrl");
            return new Footer(title, subtitle, linkUrl);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Footer)) {
                return false;
            }
            Footer footer = (Footer) other;
            return Intrinsics.c(this.title, footer.title) && Intrinsics.c(this.subtitle, footer.subtitle) && Intrinsics.c(this.linkUrl, footer.linkUrl);
        }

        @NotNull
        public final String getLinkUrl() {
            return this.linkUrl;
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
            return this.linkUrl.hashCode() + b.c(this.title.hashCode() * 31, 31, this.subtitle);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.subtitle;
            return YU.a.o(YU.a.v("Footer(title=", str, ", subtitle=", str2, ", linkUrl="), this.linkUrl, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$HealthStarRating;", "", "url", "", TextBundle.TEXT_ENTRY, "altText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getText", "getAltText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HealthStarRating {
        public static final int $stable = 0;

        @NotNull
        private final String altText;

        @Nullable
        private final String text;

        @Nullable
        private final String url;

        public HealthStarRating(@Nullable String str, @Nullable String str2, @NotNull String altText) {
            Intrinsics.h(altText, "altText");
            this.url = str;
            this.text = str2;
            this.altText = altText;
        }

        public static /* synthetic */ HealthStarRating copy$default(HealthStarRating healthStarRating, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = healthStarRating.url;
            }
            if ((i & 2) != 0) {
                str2 = healthStarRating.text;
            }
            if ((i & 4) != 0) {
                str3 = healthStarRating.altText;
            }
            return healthStarRating.copy(str, str2, str3);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getAltText() {
            return this.altText;
        }

        @NotNull
        public final HealthStarRating copy(@Nullable String url, @Nullable String text, @NotNull String altText) {
            Intrinsics.h(altText, "altText");
            return new HealthStarRating(url, text, altText);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HealthStarRating)) {
                return false;
            }
            HealthStarRating healthStarRating = (HealthStarRating) other;
            return Intrinsics.c(this.url, healthStarRating.url) && Intrinsics.c(this.text, healthStarRating.text) && Intrinsics.c(this.altText, healthStarRating.altText);
        }

        @NotNull
        public final String getAltText() {
            return this.altText;
        }

        @Nullable
        public final String getText() {
            return this.text;
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String str = this.url;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.text;
            return this.altText.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.url;
            String str2 = this.text;
            return YU.a.o(YU.a.v("HealthStarRating(url=", str, ", text=", str2, ", altText="), this.altText, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$HealthStarRating1;", "", "url", "", TextBundle.TEXT_ENTRY, "altText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getText", "getAltText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HealthStarRating1 {
        public static final int $stable = 0;

        @NotNull
        private final String altText;

        @Nullable
        private final String text;

        @Nullable
        private final String url;

        public HealthStarRating1(@Nullable String str, @Nullable String str2, @NotNull String altText) {
            Intrinsics.h(altText, "altText");
            this.url = str;
            this.text = str2;
            this.altText = altText;
        }

        public static /* synthetic */ HealthStarRating1 copy$default(HealthStarRating1 healthStarRating1, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = healthStarRating1.url;
            }
            if ((i & 2) != 0) {
                str2 = healthStarRating1.text;
            }
            if ((i & 4) != 0) {
                str3 = healthStarRating1.altText;
            }
            return healthStarRating1.copy(str, str2, str3);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getAltText() {
            return this.altText;
        }

        @NotNull
        public final HealthStarRating1 copy(@Nullable String url, @Nullable String text, @NotNull String altText) {
            Intrinsics.h(altText, "altText");
            return new HealthStarRating1(url, text, altText);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HealthStarRating1)) {
                return false;
            }
            HealthStarRating1 healthStarRating1 = (HealthStarRating1) other;
            return Intrinsics.c(this.url, healthStarRating1.url) && Intrinsics.c(this.text, healthStarRating1.text) && Intrinsics.c(this.altText, healthStarRating1.altText);
        }

        @NotNull
        public final String getAltText() {
            return this.altText;
        }

        @Nullable
        public final String getText() {
            return this.text;
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String str = this.url;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.text;
            return this.altText.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.url;
            String str2 = this.text;
            return YU.a.o(YU.a.v("HealthStarRating1(url=", str, ", text=", str2, ", altText="), this.altText, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$HealthierOption;", "", "productCard", "Lcom/woolworths/product/details/ProductDetailsQuery$ProductCard;", "healthStarRating", "Lcom/woolworths/product/details/ProductDetailsQuery$HealthStarRating1;", "<init>", "(Lcom/woolworths/product/details/ProductDetailsQuery$ProductCard;Lcom/woolworths/product/details/ProductDetailsQuery$HealthStarRating1;)V", "getProductCard", "()Lcom/woolworths/product/details/ProductDetailsQuery$ProductCard;", "getHealthStarRating", "()Lcom/woolworths/product/details/ProductDetailsQuery$HealthStarRating1;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HealthierOption {
        public static final int $stable = 8;

        @Nullable
        private final HealthStarRating1 healthStarRating;

        @NotNull
        private final ProductCard productCard;

        public HealthierOption(@NotNull ProductCard productCard, @Nullable HealthStarRating1 healthStarRating1) {
            Intrinsics.h(productCard, "productCard");
            this.productCard = productCard;
            this.healthStarRating = healthStarRating1;
        }

        public static /* synthetic */ HealthierOption copy$default(HealthierOption healthierOption, ProductCard productCard, HealthStarRating1 healthStarRating1, int i, Object obj) {
            if ((i & 1) != 0) {
                productCard = healthierOption.productCard;
            }
            if ((i & 2) != 0) {
                healthStarRating1 = healthierOption.healthStarRating;
            }
            return healthierOption.copy(productCard, healthStarRating1);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ProductCard getProductCard() {
            return this.productCard;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final HealthStarRating1 getHealthStarRating() {
            return this.healthStarRating;
        }

        @NotNull
        public final HealthierOption copy(@NotNull ProductCard productCard, @Nullable HealthStarRating1 healthStarRating) {
            Intrinsics.h(productCard, "productCard");
            return new HealthierOption(productCard, healthStarRating);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HealthierOption)) {
                return false;
            }
            HealthierOption healthierOption = (HealthierOption) other;
            return Intrinsics.c(this.productCard, healthierOption.productCard) && Intrinsics.c(this.healthStarRating, healthierOption.healthStarRating);
        }

        @Nullable
        public final HealthStarRating1 getHealthStarRating() {
            return this.healthStarRating;
        }

        @NotNull
        public final ProductCard getProductCard() {
            return this.productCard;
        }

        public int hashCode() {
            int iHashCode = this.productCard.hashCode() * 31;
            HealthStarRating1 healthStarRating1 = this.healthStarRating;
            return iHashCode + (healthStarRating1 == null ? 0 : healthStarRating1.hashCode());
        }

        @NotNull
        public String toString() {
            return "HealthierOption(productCard=" + this.productCard + ", healthStarRating=" + this.healthStarRating + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$ImageList;", "", "largeUrl", "", "altText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLargeUrl", "()Ljava/lang/String;", "getAltText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImageList {
        public static final int $stable = 0;

        @Nullable
        private final String altText;

        @Nullable
        private final String largeUrl;

        public ImageList(@Nullable String str, @Nullable String str2) {
            this.largeUrl = str;
            this.altText = str2;
        }

        public static /* synthetic */ ImageList copy$default(ImageList imageList, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = imageList.largeUrl;
            }
            if ((i & 2) != 0) {
                str2 = imageList.altText;
            }
            return imageList.copy(str, str2);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getLargeUrl() {
            return this.largeUrl;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getAltText() {
            return this.altText;
        }

        @NotNull
        public final ImageList copy(@Nullable String largeUrl, @Nullable String altText) {
            return new ImageList(largeUrl, altText);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImageList)) {
                return false;
            }
            ImageList imageList = (ImageList) other;
            return Intrinsics.c(this.largeUrl, imageList.largeUrl) && Intrinsics.c(this.altText, imageList.altText);
        }

        @Nullable
        public final String getAltText() {
            return this.altText;
        }

        @Nullable
        public final String getLargeUrl() {
            return this.largeUrl;
        }

        public int hashCode() {
            String str = this.largeUrl;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.altText;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return YU.a.j("ImageList(largeUrl=", this.largeUrl, ", altText=", this.altText, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$Info;", "", "title", "", "items", "", "Lcom/woolworths/product/details/ProductDetailsQuery$Item;", "footer", "Lcom/woolworths/product/details/ProductDetailsQuery$Footer;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/woolworths/product/details/ProductDetailsQuery$Footer;)V", "getTitle", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "getFooter", "()Lcom/woolworths/product/details/ProductDetailsQuery$Footer;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Info {
        public static final int $stable = 8;

        @Nullable
        private final Footer footer;

        @NotNull
        private final List<Item> items;

        @NotNull
        private final String title;

        public Info(@NotNull String title, @NotNull List<Item> items, @Nullable Footer footer) {
            Intrinsics.h(title, "title");
            Intrinsics.h(items, "items");
            this.title = title;
            this.items = items;
            this.footer = footer;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Info copy$default(Info info, String str, List list, Footer footer, int i, Object obj) {
            if ((i & 1) != 0) {
                str = info.title;
            }
            if ((i & 2) != 0) {
                list = info.items;
            }
            if ((i & 4) != 0) {
                footer = info.footer;
            }
            return info.copy(str, list, footer);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final List<Item> component2() {
            return this.items;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final Footer getFooter() {
            return this.footer;
        }

        @NotNull
        public final Info copy(@NotNull String title, @NotNull List<Item> items, @Nullable Footer footer) {
            Intrinsics.h(title, "title");
            Intrinsics.h(items, "items");
            return new Info(title, items, footer);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Info)) {
                return false;
            }
            Info info = (Info) other;
            return Intrinsics.c(this.title, info.title) && Intrinsics.c(this.items, info.items) && Intrinsics.c(this.footer, info.footer);
        }

        @Nullable
        public final Footer getFooter() {
            return this.footer;
        }

        @NotNull
        public final List<Item> getItems() {
            return this.items;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iD = b.d(this.title.hashCode() * 31, 31, this.items);
            Footer footer = this.footer;
            return iD + (footer == null ? 0 : footer.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.title;
            List<Item> list = this.items;
            Footer footer = this.footer;
            StringBuilder sbS = au.com.woolworths.android.onesite.a.s("Info(title=", str, ", items=", ", footer=", list);
            sbS.append(footer);
            sbS.append(")");
            return sbS.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$Item;", "", "title", "", lqlqqlq.mmm006Dm006Dm, "imageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getImageUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 0;

        @NotNull
        private final String description;

        @NotNull
        private final String imageUrl;

        @NotNull
        private final String title;

        public Item(@NotNull String title, @NotNull String description, @NotNull String imageUrl) {
            Intrinsics.h(title, "title");
            Intrinsics.h(description, "description");
            Intrinsics.h(imageUrl, "imageUrl");
            this.title = title;
            this.description = description;
            this.imageUrl = imageUrl;
        }

        public static /* synthetic */ Item copy$default(Item item, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = item.title;
            }
            if ((i & 2) != 0) {
                str2 = item.description;
            }
            if ((i & 4) != 0) {
                str3 = item.imageUrl;
            }
            return item.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        @NotNull
        public final Item copy(@NotNull String title, @NotNull String description, @NotNull String imageUrl) {
            Intrinsics.h(title, "title");
            Intrinsics.h(description, "description");
            Intrinsics.h(imageUrl, "imageUrl");
            return new Item(title, description, imageUrl);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.c(this.title, item.title) && Intrinsics.c(this.description, item.description) && Intrinsics.c(this.imageUrl, item.imageUrl);
        }

        @NotNull
        public final String getDescription() {
            return this.description;
        }

        @NotNull
        public final String getImageUrl() {
            return this.imageUrl;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.imageUrl.hashCode() + b.c(this.title.hashCode() * 31, 31, this.description);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.description;
            return YU.a.o(YU.a.v("Item(title=", str, ", description=", str2, ", imageUrl="), this.imageUrl, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$Item1;", "", "__typename", "", "onProductCard", "Lcom/woolworths/product/details/ProductDetailsQuery$OnProductCard1;", "<init>", "(Ljava/lang/String;Lcom/woolworths/product/details/ProductDetailsQuery$OnProductCard1;)V", "get__typename", "()Ljava/lang/String;", "getOnProductCard", "()Lcom/woolworths/product/details/ProductDetailsQuery$OnProductCard1;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item1 {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @Nullable
        private final OnProductCard1 onProductCard;

        public Item1(@NotNull String __typename, @Nullable OnProductCard1 onProductCard1) {
            Intrinsics.h(__typename, "__typename");
            this.__typename = __typename;
            this.onProductCard = onProductCard1;
        }

        public static /* synthetic */ Item1 copy$default(Item1 item1, String str, OnProductCard1 onProductCard1, int i, Object obj) {
            if ((i & 1) != 0) {
                str = item1.__typename;
            }
            if ((i & 2) != 0) {
                onProductCard1 = item1.onProductCard;
            }
            return item1.copy(str, onProductCard1);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final OnProductCard1 getOnProductCard() {
            return this.onProductCard;
        }

        @NotNull
        public final Item1 copy(@NotNull String __typename, @Nullable OnProductCard1 onProductCard) {
            Intrinsics.h(__typename, "__typename");
            return new Item1(__typename, onProductCard);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item1)) {
                return false;
            }
            Item1 item1 = (Item1) other;
            return Intrinsics.c(this.__typename, item1.__typename) && Intrinsics.c(this.onProductCard, item1.onProductCard);
        }

        @Nullable
        public final OnProductCard1 getOnProductCard() {
            return this.onProductCard;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int iHashCode = this.__typename.hashCode() * 31;
            OnProductCard1 onProductCard1 = this.onProductCard;
            return iHashCode + (onProductCard1 == null ? 0 : onProductCard1.hashCode());
        }

        @NotNull
        public String toString() {
            return "Item1(__typename=" + this.__typename + ", onProductCard=" + this.onProductCard + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$Link;", "", "url", "", TextBundle.TEXT_ENTRY, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Link {
        public static final int $stable = 0;

        @NotNull
        private final String text;

        @NotNull
        private final String url;

        public Link(@NotNull String url, @NotNull String text) {
            Intrinsics.h(url, "url");
            Intrinsics.h(text, "text");
            this.url = url;
            this.text = text;
        }

        public static /* synthetic */ Link copy$default(Link link, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = link.url;
            }
            if ((i & 2) != 0) {
                str2 = link.text;
            }
            return link.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final Link copy(@NotNull String url, @NotNull String text) {
            Intrinsics.h(url, "url");
            Intrinsics.h(text, "text");
            return new Link(url, text);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Link)) {
                return false;
            }
            Link link = (Link) other;
            return Intrinsics.c(this.url, link.url) && Intrinsics.c(this.text, link.text);
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.text.hashCode() + (this.url.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return YU.a.j("Link(url=", this.url, ", text=", this.text, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003JC\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$LinkedInfo;", "", "buttonLabel", "", "title", "content", "markdownContent", "links", "", "Lcom/woolworths/product/details/ProductDetailsQuery$Link;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getButtonLabel", "()Ljava/lang/String;", "getTitle", "getContent", "getMarkdownContent", "getLinks", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkedInfo {
        public static final int $stable = 8;

        @NotNull
        private final String buttonLabel;

        @NotNull
        private final String content;

        @NotNull
        private final List<Link> links;

        @Nullable
        private final String markdownContent;

        @NotNull
        private final String title;

        public LinkedInfo(@NotNull String buttonLabel, @NotNull String title, @NotNull String content, @Nullable String str, @NotNull List<Link> links) {
            Intrinsics.h(buttonLabel, "buttonLabel");
            Intrinsics.h(title, "title");
            Intrinsics.h(content, "content");
            Intrinsics.h(links, "links");
            this.buttonLabel = buttonLabel;
            this.title = title;
            this.content = content;
            this.markdownContent = str;
            this.links = links;
        }

        public static /* synthetic */ LinkedInfo copy$default(LinkedInfo linkedInfo, String str, String str2, String str3, String str4, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = linkedInfo.buttonLabel;
            }
            if ((i & 2) != 0) {
                str2 = linkedInfo.title;
            }
            if ((i & 4) != 0) {
                str3 = linkedInfo.content;
            }
            if ((i & 8) != 0) {
                str4 = linkedInfo.markdownContent;
            }
            if ((i & 16) != 0) {
                list = linkedInfo.links;
            }
            List list2 = list;
            String str5 = str3;
            return linkedInfo.copy(str, str2, str5, str4, list2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getButtonLabel() {
            return this.buttonLabel;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getMarkdownContent() {
            return this.markdownContent;
        }

        @NotNull
        public final List<Link> component5() {
            return this.links;
        }

        @NotNull
        public final LinkedInfo copy(@NotNull String buttonLabel, @NotNull String title, @NotNull String content, @Nullable String markdownContent, @NotNull List<Link> links) {
            Intrinsics.h(buttonLabel, "buttonLabel");
            Intrinsics.h(title, "title");
            Intrinsics.h(content, "content");
            Intrinsics.h(links, "links");
            return new LinkedInfo(buttonLabel, title, content, markdownContent, links);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LinkedInfo)) {
                return false;
            }
            LinkedInfo linkedInfo = (LinkedInfo) other;
            return Intrinsics.c(this.buttonLabel, linkedInfo.buttonLabel) && Intrinsics.c(this.title, linkedInfo.title) && Intrinsics.c(this.content, linkedInfo.content) && Intrinsics.c(this.markdownContent, linkedInfo.markdownContent) && Intrinsics.c(this.links, linkedInfo.links);
        }

        @NotNull
        public final String getButtonLabel() {
            return this.buttonLabel;
        }

        @NotNull
        public final String getContent() {
            return this.content;
        }

        @NotNull
        public final List<Link> getLinks() {
            return this.links;
        }

        @Nullable
        public final String getMarkdownContent() {
            return this.markdownContent;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iC = b.c(b.c(this.buttonLabel.hashCode() * 31, 31, this.title), 31, this.content);
            String str = this.markdownContent;
            return this.links.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.buttonLabel;
            String str2 = this.title;
            String str3 = this.content;
            String str4 = this.markdownContent;
            List<Link> list = this.links;
            StringBuilder sbV = YU.a.v("LinkedInfo(buttonLabel=", str, ", title=", str2, ", content=");
            a.B(sbV, str3, ", markdownContent=", str4, ", links=");
            return android.support.v4.media.session.a.t(sbV, list, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0017JN\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$OnActionableCard;", "", "image", "", "altText", "cardHeight", "Lau/com/woolworths/shop/graphql/type/CardHeight;", "link", "analytics", "Lau/com/woolworths/analytics/graphql/TealiumAnalytics;", "_excluded", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/shop/graphql/type/CardHeight;Ljava/lang/String;Lau/com/woolworths/analytics/graphql/TealiumAnalytics;Ljava/lang/Boolean;)V", "getImage", "()Ljava/lang/String;", "getAltText", "getCardHeight", "()Lau/com/woolworths/shop/graphql/type/CardHeight;", "getLink", "getAnalytics", "()Lau/com/woolworths/analytics/graphql/TealiumAnalytics;", "get_excluded", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/shop/graphql/type/CardHeight;Ljava/lang/String;Lau/com/woolworths/analytics/graphql/TealiumAnalytics;Ljava/lang/Boolean;)Lcom/woolworths/product/details/ProductDetailsQuery$OnActionableCard;", "equals", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnActionableCard {
        public static final int $stable = 8;

        @Nullable
        private final Boolean _excluded;

        @NotNull
        private final String altText;

        @Nullable
        private final TealiumAnalytics analytics;

        @NotNull
        private final CardHeight cardHeight;

        @NotNull
        private final String image;

        @NotNull
        private final String link;

        public OnActionableCard(@NotNull String image, @NotNull String altText, @NotNull CardHeight cardHeight, @NotNull String link, @Nullable TealiumAnalytics tealiumAnalytics, @Nullable Boolean bool) {
            Intrinsics.h(image, "image");
            Intrinsics.h(altText, "altText");
            Intrinsics.h(cardHeight, "cardHeight");
            Intrinsics.h(link, "link");
            this.image = image;
            this.altText = altText;
            this.cardHeight = cardHeight;
            this.link = link;
            this.analytics = tealiumAnalytics;
            this._excluded = bool;
        }

        public static /* synthetic */ OnActionableCard copy$default(OnActionableCard onActionableCard, String str, String str2, CardHeight cardHeight, String str3, TealiumAnalytics tealiumAnalytics, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onActionableCard.image;
            }
            if ((i & 2) != 0) {
                str2 = onActionableCard.altText;
            }
            if ((i & 4) != 0) {
                cardHeight = onActionableCard.cardHeight;
            }
            if ((i & 8) != 0) {
                str3 = onActionableCard.link;
            }
            if ((i & 16) != 0) {
                tealiumAnalytics = onActionableCard.analytics;
            }
            if ((i & 32) != 0) {
                bool = onActionableCard._excluded;
            }
            TealiumAnalytics tealiumAnalytics2 = tealiumAnalytics;
            Boolean bool2 = bool;
            return onActionableCard.copy(str, str2, cardHeight, str3, tealiumAnalytics2, bool2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getAltText() {
            return this.altText;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final CardHeight getCardHeight() {
            return this.cardHeight;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getLink() {
            return this.link;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final TealiumAnalytics getAnalytics() {
            return this.analytics;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final Boolean get_excluded() {
            return this._excluded;
        }

        @NotNull
        public final OnActionableCard copy(@NotNull String image, @NotNull String altText, @NotNull CardHeight cardHeight, @NotNull String link, @Nullable TealiumAnalytics analytics, @Nullable Boolean _excluded) {
            Intrinsics.h(image, "image");
            Intrinsics.h(altText, "altText");
            Intrinsics.h(cardHeight, "cardHeight");
            Intrinsics.h(link, "link");
            return new OnActionableCard(image, altText, cardHeight, link, analytics, _excluded);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnActionableCard)) {
                return false;
            }
            OnActionableCard onActionableCard = (OnActionableCard) other;
            return Intrinsics.c(this.image, onActionableCard.image) && Intrinsics.c(this.altText, onActionableCard.altText) && this.cardHeight == onActionableCard.cardHeight && Intrinsics.c(this.link, onActionableCard.link) && Intrinsics.c(this.analytics, onActionableCard.analytics) && Intrinsics.c(this._excluded, onActionableCard._excluded);
        }

        @NotNull
        public final String getAltText() {
            return this.altText;
        }

        @Nullable
        public final TealiumAnalytics getAnalytics() {
            return this.analytics;
        }

        @NotNull
        public final CardHeight getCardHeight() {
            return this.cardHeight;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        @NotNull
        public final String getLink() {
            return this.link;
        }

        @Nullable
        public final Boolean get_excluded() {
            return this._excluded;
        }

        public int hashCode() {
            int iC = b.c(d.b(this.cardHeight, b.c(this.image.hashCode() * 31, 31, this.altText), 31), 31, this.link);
            TealiumAnalytics tealiumAnalytics = this.analytics;
            int iHashCode = (iC + (tealiumAnalytics == null ? 0 : tealiumAnalytics.hashCode())) * 31;
            Boolean bool = this._excluded;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.image;
            String str2 = this.altText;
            CardHeight cardHeight = this.cardHeight;
            String str3 = this.link;
            TealiumAnalytics tealiumAnalytics = this.analytics;
            Boolean bool = this._excluded;
            StringBuilder sbV = YU.a.v("OnActionableCard(image=", str, ", altText=", str2, ", cardHeight=");
            sbV.append(cardHeight);
            sbV.append(", link=");
            sbV.append(str3);
            sbV.append(", analytics=");
            sbV.append(tealiumAnalytics);
            sbV.append(", _excluded=");
            sbV.append(bool);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$OnCouponBanner;", "", "couponBannerColorTheme", "Lau/com/woolworths/shop/graphql/type/CouponBannerColorTheme;", "couponBannerCouponCode", "", "couponBannerDescription", "couponBannerImage", "couponBannerMinimumSpend", "couponBannerTermsAndConditions", "Lcom/woolworths/product/details/ProductDetailsQuery$CouponBannerTermsAndConditions;", "<init>", "(Lau/com/woolworths/shop/graphql/type/CouponBannerColorTheme;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/woolworths/product/details/ProductDetailsQuery$CouponBannerTermsAndConditions;)V", "getCouponBannerColorTheme", "()Lau/com/woolworths/shop/graphql/type/CouponBannerColorTheme;", "getCouponBannerCouponCode", "()Ljava/lang/String;", "getCouponBannerDescription", "getCouponBannerImage", "getCouponBannerMinimumSpend", "getCouponBannerTermsAndConditions", "()Lcom/woolworths/product/details/ProductDetailsQuery$CouponBannerTermsAndConditions;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCouponBanner {
        public static final int $stable = 0;

        @NotNull
        private final CouponBannerColorTheme couponBannerColorTheme;

        @NotNull
        private final String couponBannerCouponCode;

        @NotNull
        private final String couponBannerDescription;

        @Nullable
        private final String couponBannerImage;

        @NotNull
        private final String couponBannerMinimumSpend;

        @NotNull
        private final CouponBannerTermsAndConditions couponBannerTermsAndConditions;

        public OnCouponBanner(@NotNull CouponBannerColorTheme couponBannerColorTheme, @NotNull String couponBannerCouponCode, @NotNull String couponBannerDescription, @Nullable String str, @NotNull String couponBannerMinimumSpend, @NotNull CouponBannerTermsAndConditions couponBannerTermsAndConditions) {
            Intrinsics.h(couponBannerColorTheme, "couponBannerColorTheme");
            Intrinsics.h(couponBannerCouponCode, "couponBannerCouponCode");
            Intrinsics.h(couponBannerDescription, "couponBannerDescription");
            Intrinsics.h(couponBannerMinimumSpend, "couponBannerMinimumSpend");
            Intrinsics.h(couponBannerTermsAndConditions, "couponBannerTermsAndConditions");
            this.couponBannerColorTheme = couponBannerColorTheme;
            this.couponBannerCouponCode = couponBannerCouponCode;
            this.couponBannerDescription = couponBannerDescription;
            this.couponBannerImage = str;
            this.couponBannerMinimumSpend = couponBannerMinimumSpend;
            this.couponBannerTermsAndConditions = couponBannerTermsAndConditions;
        }

        public static /* synthetic */ OnCouponBanner copy$default(OnCouponBanner onCouponBanner, CouponBannerColorTheme couponBannerColorTheme, String str, String str2, String str3, String str4, CouponBannerTermsAndConditions couponBannerTermsAndConditions, int i, Object obj) {
            if ((i & 1) != 0) {
                couponBannerColorTheme = onCouponBanner.couponBannerColorTheme;
            }
            if ((i & 2) != 0) {
                str = onCouponBanner.couponBannerCouponCode;
            }
            if ((i & 4) != 0) {
                str2 = onCouponBanner.couponBannerDescription;
            }
            if ((i & 8) != 0) {
                str3 = onCouponBanner.couponBannerImage;
            }
            if ((i & 16) != 0) {
                str4 = onCouponBanner.couponBannerMinimumSpend;
            }
            if ((i & 32) != 0) {
                couponBannerTermsAndConditions = onCouponBanner.couponBannerTermsAndConditions;
            }
            String str5 = str4;
            CouponBannerTermsAndConditions couponBannerTermsAndConditions2 = couponBannerTermsAndConditions;
            return onCouponBanner.copy(couponBannerColorTheme, str, str2, str3, str5, couponBannerTermsAndConditions2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CouponBannerColorTheme getCouponBannerColorTheme() {
            return this.couponBannerColorTheme;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getCouponBannerCouponCode() {
            return this.couponBannerCouponCode;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getCouponBannerDescription() {
            return this.couponBannerDescription;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getCouponBannerImage() {
            return this.couponBannerImage;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final String getCouponBannerMinimumSpend() {
            return this.couponBannerMinimumSpend;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final CouponBannerTermsAndConditions getCouponBannerTermsAndConditions() {
            return this.couponBannerTermsAndConditions;
        }

        @NotNull
        public final OnCouponBanner copy(@NotNull CouponBannerColorTheme couponBannerColorTheme, @NotNull String couponBannerCouponCode, @NotNull String couponBannerDescription, @Nullable String couponBannerImage, @NotNull String couponBannerMinimumSpend, @NotNull CouponBannerTermsAndConditions couponBannerTermsAndConditions) {
            Intrinsics.h(couponBannerColorTheme, "couponBannerColorTheme");
            Intrinsics.h(couponBannerCouponCode, "couponBannerCouponCode");
            Intrinsics.h(couponBannerDescription, "couponBannerDescription");
            Intrinsics.h(couponBannerMinimumSpend, "couponBannerMinimumSpend");
            Intrinsics.h(couponBannerTermsAndConditions, "couponBannerTermsAndConditions");
            return new OnCouponBanner(couponBannerColorTheme, couponBannerCouponCode, couponBannerDescription, couponBannerImage, couponBannerMinimumSpend, couponBannerTermsAndConditions);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnCouponBanner)) {
                return false;
            }
            OnCouponBanner onCouponBanner = (OnCouponBanner) other;
            return this.couponBannerColorTheme == onCouponBanner.couponBannerColorTheme && Intrinsics.c(this.couponBannerCouponCode, onCouponBanner.couponBannerCouponCode) && Intrinsics.c(this.couponBannerDescription, onCouponBanner.couponBannerDescription) && Intrinsics.c(this.couponBannerImage, onCouponBanner.couponBannerImage) && Intrinsics.c(this.couponBannerMinimumSpend, onCouponBanner.couponBannerMinimumSpend) && Intrinsics.c(this.couponBannerTermsAndConditions, onCouponBanner.couponBannerTermsAndConditions);
        }

        @NotNull
        public final CouponBannerColorTheme getCouponBannerColorTheme() {
            return this.couponBannerColorTheme;
        }

        @NotNull
        public final String getCouponBannerCouponCode() {
            return this.couponBannerCouponCode;
        }

        @NotNull
        public final String getCouponBannerDescription() {
            return this.couponBannerDescription;
        }

        @Nullable
        public final String getCouponBannerImage() {
            return this.couponBannerImage;
        }

        @NotNull
        public final String getCouponBannerMinimumSpend() {
            return this.couponBannerMinimumSpend;
        }

        @NotNull
        public final CouponBannerTermsAndConditions getCouponBannerTermsAndConditions() {
            return this.couponBannerTermsAndConditions;
        }

        public int hashCode() {
            int iC = b.c(b.c(this.couponBannerColorTheme.hashCode() * 31, 31, this.couponBannerCouponCode), 31, this.couponBannerDescription);
            String str = this.couponBannerImage;
            return this.couponBannerTermsAndConditions.hashCode() + b.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.couponBannerMinimumSpend);
        }

        @NotNull
        public String toString() {
            CouponBannerColorTheme couponBannerColorTheme = this.couponBannerColorTheme;
            String str = this.couponBannerCouponCode;
            String str2 = this.couponBannerDescription;
            String str3 = this.couponBannerImage;
            String str4 = this.couponBannerMinimumSpend;
            CouponBannerTermsAndConditions couponBannerTermsAndConditions = this.couponBannerTermsAndConditions;
            StringBuilder sb = new StringBuilder("OnCouponBanner(couponBannerColorTheme=");
            sb.append(couponBannerColorTheme);
            sb.append(", couponBannerCouponCode=");
            sb.append(str);
            sb.append(", couponBannerDescription=");
            a.B(sb, str2, ", couponBannerImage=", str3, ", couponBannerMinimumSpend=");
            sb.append(str4);
            sb.append(", couponBannerTermsAndConditions=");
            sb.append(couponBannerTermsAndConditions);
            sb.append(")");
            return sb.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$OnDividerCard;", "", "ignored", "", "<init>", "(Ljava/lang/Boolean;)V", "getIgnored", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lcom/woolworths/product/details/ProductDetailsQuery$OnDividerCard;", "equals", "other", "hashCode", "", "toString", "", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnDividerCard {
        public static final int $stable = 0;

        @Nullable
        private final Boolean ignored;

        public OnDividerCard(@Nullable Boolean bool) {
            this.ignored = bool;
        }

        public static /* synthetic */ OnDividerCard copy$default(OnDividerCard onDividerCard, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = onDividerCard.ignored;
            }
            return onDividerCard.copy(bool);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final Boolean getIgnored() {
            return this.ignored;
        }

        @NotNull
        public final OnDividerCard copy(@Nullable Boolean ignored) {
            return new OnDividerCard(ignored);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnDividerCard) && Intrinsics.c(this.ignored, ((OnDividerCard) other).ignored);
        }

        @Nullable
        public final Boolean getIgnored() {
            return this.ignored;
        }

        public int hashCode() {
            Boolean bool = this.ignored;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        @NotNull
        public String toString() {
            return androidx.compose.ui.input.pointer.a.k(this.ignored, "OnDividerCard(ignored=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$OnFooter;", "", "buttons", "", "Lcom/woolworths/product/details/ProductDetailsQuery$Button;", "<init>", "(Ljava/util/List;)V", "getButtons", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnFooter {
        public static final int $stable = 8;

        @NotNull
        private final List<Button> buttons;

        public OnFooter(@NotNull List<Button> buttons) {
            Intrinsics.h(buttons, "buttons");
            this.buttons = buttons;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OnFooter copy$default(OnFooter onFooter, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = onFooter.buttons;
            }
            return onFooter.copy(list);
        }

        @NotNull
        public final List<Button> component1() {
            return this.buttons;
        }

        @NotNull
        public final OnFooter copy(@NotNull List<Button> buttons) {
            Intrinsics.h(buttons, "buttons");
            return new OnFooter(buttons);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnFooter) && Intrinsics.c(this.buttons, ((OnFooter) other).buttons);
        }

        @NotNull
        public final List<Button> getButtons() {
            return this.buttons;
        }

        public int hashCode() {
            return this.buttons.hashCode();
        }

        @NotNull
        public String toString() {
            return au.com.woolworths.android.onesite.a.l("OnFooter(buttons=", ")", this.buttons);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$OnFormattedBanner;", "", "hasIcon", "", "content", "", "style", "Lau/com/woolworths/shop/graphql/type/FormattedBannerStyle;", "<init>", "(ZLjava/lang/String;Lau/com/woolworths/shop/graphql/type/FormattedBannerStyle;)V", "getHasIcon", "()Z", "getContent", "()Ljava/lang/String;", "getStyle", "()Lau/com/woolworths/shop/graphql/type/FormattedBannerStyle;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnFormattedBanner {
        public static final int $stable = 0;

        @NotNull
        private final String content;
        private final boolean hasIcon;

        @NotNull
        private final FormattedBannerStyle style;

        public OnFormattedBanner(boolean z, @NotNull String content, @NotNull FormattedBannerStyle style) {
            Intrinsics.h(content, "content");
            Intrinsics.h(style, "style");
            this.hasIcon = z;
            this.content = content;
            this.style = style;
        }

        public static /* synthetic */ OnFormattedBanner copy$default(OnFormattedBanner onFormattedBanner, boolean z, String str, FormattedBannerStyle formattedBannerStyle, int i, Object obj) {
            if ((i & 1) != 0) {
                z = onFormattedBanner.hasIcon;
            }
            if ((i & 2) != 0) {
                str = onFormattedBanner.content;
            }
            if ((i & 4) != 0) {
                formattedBannerStyle = onFormattedBanner.style;
            }
            return onFormattedBanner.copy(z, str, formattedBannerStyle);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getHasIcon() {
            return this.hasIcon;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final FormattedBannerStyle getStyle() {
            return this.style;
        }

        @NotNull
        public final OnFormattedBanner copy(boolean hasIcon, @NotNull String content, @NotNull FormattedBannerStyle style) {
            Intrinsics.h(content, "content");
            Intrinsics.h(style, "style");
            return new OnFormattedBanner(hasIcon, content, style);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnFormattedBanner)) {
                return false;
            }
            OnFormattedBanner onFormattedBanner = (OnFormattedBanner) other;
            return this.hasIcon == onFormattedBanner.hasIcon && Intrinsics.c(this.content, onFormattedBanner.content) && this.style == onFormattedBanner.style;
        }

        @NotNull
        public final String getContent() {
            return this.content;
        }

        public final boolean getHasIcon() {
            return this.hasIcon;
        }

        @NotNull
        public final FormattedBannerStyle getStyle() {
            return this.style;
        }

        public int hashCode() {
            return this.style.hashCode() + b.c(Boolean.hashCode(this.hasIcon) * 31, 31, this.content);
        }

        @NotNull
        public String toString() {
            boolean z = this.hasIcon;
            String str = this.content;
            FormattedBannerStyle formattedBannerStyle = this.style;
            StringBuilder sbT = au.com.woolworths.android.onesite.a.t("OnFormattedBanner(hasIcon=", ", content=", str, ", style=", z);
            sbT.append(formattedBannerStyle);
            sbT.append(")");
            return sbT.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$OnFormattedContent;", "", "formattedContentTitle", "", "content", "framedContent", "isCollapsable", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getFormattedContentTitle", "()Ljava/lang/String;", "getContent", "getFramedContent", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnFormattedContent {
        public static final int $stable = 0;

        @NotNull
        private final String content;

        @NotNull
        private final String formattedContentTitle;

        @Nullable
        private final String framedContent;
        private final boolean isCollapsable;

        public OnFormattedContent(@NotNull String formattedContentTitle, @NotNull String content, @Nullable String str, boolean z) {
            Intrinsics.h(formattedContentTitle, "formattedContentTitle");
            Intrinsics.h(content, "content");
            this.formattedContentTitle = formattedContentTitle;
            this.content = content;
            this.framedContent = str;
            this.isCollapsable = z;
        }

        public static /* synthetic */ OnFormattedContent copy$default(OnFormattedContent onFormattedContent, String str, String str2, String str3, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onFormattedContent.formattedContentTitle;
            }
            if ((i & 2) != 0) {
                str2 = onFormattedContent.content;
            }
            if ((i & 4) != 0) {
                str3 = onFormattedContent.framedContent;
            }
            if ((i & 8) != 0) {
                z = onFormattedContent.isCollapsable;
            }
            return onFormattedContent.copy(str, str2, str3, z);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getFormattedContentTitle() {
            return this.formattedContentTitle;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getFramedContent() {
            return this.framedContent;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsCollapsable() {
            return this.isCollapsable;
        }

        @NotNull
        public final OnFormattedContent copy(@NotNull String formattedContentTitle, @NotNull String content, @Nullable String framedContent, boolean isCollapsable) {
            Intrinsics.h(formattedContentTitle, "formattedContentTitle");
            Intrinsics.h(content, "content");
            return new OnFormattedContent(formattedContentTitle, content, framedContent, isCollapsable);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnFormattedContent)) {
                return false;
            }
            OnFormattedContent onFormattedContent = (OnFormattedContent) other;
            return Intrinsics.c(this.formattedContentTitle, onFormattedContent.formattedContentTitle) && Intrinsics.c(this.content, onFormattedContent.content) && Intrinsics.c(this.framedContent, onFormattedContent.framedContent) && this.isCollapsable == onFormattedContent.isCollapsable;
        }

        @NotNull
        public final String getContent() {
            return this.content;
        }

        @NotNull
        public final String getFormattedContentTitle() {
            return this.formattedContentTitle;
        }

        @Nullable
        public final String getFramedContent() {
            return this.framedContent;
        }

        public int hashCode() {
            int iC = b.c(this.formattedContentTitle.hashCode() * 31, 31, this.content);
            String str = this.framedContent;
            return Boolean.hashCode(this.isCollapsable) + ((iC + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final boolean isCollapsable() {
            return this.isCollapsable;
        }

        @NotNull
        public String toString() {
            String str = this.formattedContentTitle;
            String str2 = this.content;
            return d.r(this.framedContent, ", isCollapsable=", ")", YU.a.v("OnFormattedContent(formattedContentTitle=", str, ", content=", str2, ", framedContent="), this.isCollapsable);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$OnHealthierHorizontalList;", "", "title", "", NotificationMessage.NOTIF_KEY_SUB_TITLE, "linkedInfo", "Lcom/woolworths/product/details/ProductDetailsQuery$LinkedInfo;", "healthierOptions", "", "Lcom/woolworths/product/details/ProductDetailsQuery$HealthierOption;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/woolworths/product/details/ProductDetailsQuery$LinkedInfo;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getLinkedInfo", "()Lcom/woolworths/product/details/ProductDetailsQuery$LinkedInfo;", "getHealthierOptions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHealthierHorizontalList {
        public static final int $stable = 8;

        @NotNull
        private final List<HealthierOption> healthierOptions;

        @Nullable
        private final LinkedInfo linkedInfo;

        @Nullable
        private final String subtitle;

        @NotNull
        private final String title;

        public OnHealthierHorizontalList(@NotNull String title, @Nullable String str, @Nullable LinkedInfo linkedInfo, @NotNull List<HealthierOption> healthierOptions) {
            Intrinsics.h(title, "title");
            Intrinsics.h(healthierOptions, "healthierOptions");
            this.title = title;
            this.subtitle = str;
            this.linkedInfo = linkedInfo;
            this.healthierOptions = healthierOptions;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OnHealthierHorizontalList copy$default(OnHealthierHorizontalList onHealthierHorizontalList, String str, String str2, LinkedInfo linkedInfo, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onHealthierHorizontalList.title;
            }
            if ((i & 2) != 0) {
                str2 = onHealthierHorizontalList.subtitle;
            }
            if ((i & 4) != 0) {
                linkedInfo = onHealthierHorizontalList.linkedInfo;
            }
            if ((i & 8) != 0) {
                list = onHealthierHorizontalList.healthierOptions;
            }
            return onHealthierHorizontalList.copy(str, str2, linkedInfo, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final LinkedInfo getLinkedInfo() {
            return this.linkedInfo;
        }

        @NotNull
        public final List<HealthierOption> component4() {
            return this.healthierOptions;
        }

        @NotNull
        public final OnHealthierHorizontalList copy(@NotNull String title, @Nullable String subtitle, @Nullable LinkedInfo linkedInfo, @NotNull List<HealthierOption> healthierOptions) {
            Intrinsics.h(title, "title");
            Intrinsics.h(healthierOptions, "healthierOptions");
            return new OnHealthierHorizontalList(title, subtitle, linkedInfo, healthierOptions);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnHealthierHorizontalList)) {
                return false;
            }
            OnHealthierHorizontalList onHealthierHorizontalList = (OnHealthierHorizontalList) other;
            return Intrinsics.c(this.title, onHealthierHorizontalList.title) && Intrinsics.c(this.subtitle, onHealthierHorizontalList.subtitle) && Intrinsics.c(this.linkedInfo, onHealthierHorizontalList.linkedInfo) && Intrinsics.c(this.healthierOptions, onHealthierHorizontalList.healthierOptions);
        }

        @NotNull
        public final List<HealthierOption> getHealthierOptions() {
            return this.healthierOptions;
        }

        @Nullable
        public final LinkedInfo getLinkedInfo() {
            return this.linkedInfo;
        }

        @Nullable
        public final String getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            LinkedInfo linkedInfo = this.linkedInfo;
            return this.healthierOptions.hashCode() + ((iHashCode2 + (linkedInfo != null ? linkedInfo.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.subtitle;
            LinkedInfo linkedInfo = this.linkedInfo;
            List<HealthierOption> list = this.healthierOptions;
            StringBuilder sbV = YU.a.v("OnHealthierHorizontalList(title=", str, ", subtitle=", str2, ", linkedInfo=");
            sbV.append(linkedInfo);
            sbV.append(", healthierOptions=");
            sbV.append(list);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$OnInsetBanner;", "", "displayType", "Lau/com/woolworths/shop/graphql/type/InsetBannerDisplayType;", "message", "", "bannerTitle", "iconUrl", UrlHandler.ACTION, "Lcom/woolworths/product/details/ProductDetailsQuery$Action;", "<init>", "(Lau/com/woolworths/shop/graphql/type/InsetBannerDisplayType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/woolworths/product/details/ProductDetailsQuery$Action;)V", "getDisplayType", "()Lau/com/woolworths/shop/graphql/type/InsetBannerDisplayType;", "getMessage", "()Ljava/lang/String;", "getBannerTitle", "getIconUrl", "getAction", "()Lcom/woolworths/product/details/ProductDetailsQuery$Action;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnInsetBanner {
        public static final int $stable = 0;

        @Nullable
        private final Action action;

        @Nullable
        private final String bannerTitle;

        @NotNull
        private final InsetBannerDisplayType displayType;

        @Nullable
        private final String iconUrl;

        @NotNull
        private final String message;

        public OnInsetBanner(@NotNull InsetBannerDisplayType displayType, @NotNull String message, @Nullable String str, @Nullable String str2, @Nullable Action action) {
            Intrinsics.h(displayType, "displayType");
            Intrinsics.h(message, "message");
            this.displayType = displayType;
            this.message = message;
            this.bannerTitle = str;
            this.iconUrl = str2;
            this.action = action;
        }

        public static /* synthetic */ OnInsetBanner copy$default(OnInsetBanner onInsetBanner, InsetBannerDisplayType insetBannerDisplayType, String str, String str2, String str3, Action action, int i, Object obj) {
            if ((i & 1) != 0) {
                insetBannerDisplayType = onInsetBanner.displayType;
            }
            if ((i & 2) != 0) {
                str = onInsetBanner.message;
            }
            if ((i & 4) != 0) {
                str2 = onInsetBanner.bannerTitle;
            }
            if ((i & 8) != 0) {
                str3 = onInsetBanner.iconUrl;
            }
            if ((i & 16) != 0) {
                action = onInsetBanner.action;
            }
            Action action2 = action;
            String str4 = str2;
            return onInsetBanner.copy(insetBannerDisplayType, str, str4, str3, action2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final InsetBannerDisplayType getDisplayType() {
            return this.displayType;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getBannerTitle() {
            return this.bannerTitle;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final Action getAction() {
            return this.action;
        }

        @NotNull
        public final OnInsetBanner copy(@NotNull InsetBannerDisplayType displayType, @NotNull String message, @Nullable String bannerTitle, @Nullable String iconUrl, @Nullable Action action) {
            Intrinsics.h(displayType, "displayType");
            Intrinsics.h(message, "message");
            return new OnInsetBanner(displayType, message, bannerTitle, iconUrl, action);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnInsetBanner)) {
                return false;
            }
            OnInsetBanner onInsetBanner = (OnInsetBanner) other;
            return this.displayType == onInsetBanner.displayType && Intrinsics.c(this.message, onInsetBanner.message) && Intrinsics.c(this.bannerTitle, onInsetBanner.bannerTitle) && Intrinsics.c(this.iconUrl, onInsetBanner.iconUrl) && Intrinsics.c(this.action, onInsetBanner.action);
        }

        @Nullable
        public final Action getAction() {
            return this.action;
        }

        @Nullable
        public final String getBannerTitle() {
            return this.bannerTitle;
        }

        @NotNull
        public final InsetBannerDisplayType getDisplayType() {
            return this.displayType;
        }

        @Nullable
        public final String getIconUrl() {
            return this.iconUrl;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int iC = b.c(this.displayType.hashCode() * 31, 31, this.message);
            String str = this.bannerTitle;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.iconUrl;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Action action = this.action;
            return iHashCode2 + (action != null ? action.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            InsetBannerDisplayType insetBannerDisplayType = this.displayType;
            String str = this.message;
            String str2 = this.bannerTitle;
            String str3 = this.iconUrl;
            Action action = this.action;
            StringBuilder sbU = d.u("OnInsetBanner(displayType=", insetBannerDisplayType, ", message=", str, ", bannerTitle=");
            a.B(sbU, str2, ", iconUrl=", str3, ", action=");
            sbU.append(action);
            sbU.append(")");
            return sbU.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$OnProductCard;", "", "__typename", "", "productCard", "Lau/com/woolworths/graphql/common/fragment/ProductCard;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/graphql/common/fragment/ProductCard;)V", "get__typename", "()Ljava/lang/String;", "getProductCard", "()Lau/com/woolworths/graphql/common/fragment/ProductCard;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductCard {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final au.com.woolworths.graphql.common.fragment.ProductCard productCard;

        public OnProductCard(@NotNull String __typename, @NotNull au.com.woolworths.graphql.common.fragment.ProductCard productCard) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(productCard, "productCard");
            this.__typename = __typename;
            this.productCard = productCard;
        }

        public static /* synthetic */ OnProductCard copy$default(OnProductCard onProductCard, String str, au.com.woolworths.graphql.common.fragment.ProductCard productCard, int i, Object obj) {
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
        public final au.com.woolworths.graphql.common.fragment.ProductCard getProductCard() {
            return this.productCard;
        }

        @NotNull
        public final OnProductCard copy(@NotNull String __typename, @NotNull au.com.woolworths.graphql.common.fragment.ProductCard productCard) {
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
        public final au.com.woolworths.graphql.common.fragment.ProductCard getProductCard() {
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
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$OnProductCard1;", "", "__typename", "", "productCard", "Lau/com/woolworths/graphql/common/fragment/ProductCard;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/graphql/common/fragment/ProductCard;)V", "get__typename", "()Ljava/lang/String;", "getProductCard", "()Lau/com/woolworths/graphql/common/fragment/ProductCard;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductCard1 {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final au.com.woolworths.graphql.common.fragment.ProductCard productCard;

        public OnProductCard1(@NotNull String __typename, @NotNull au.com.woolworths.graphql.common.fragment.ProductCard productCard) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(productCard, "productCard");
            this.__typename = __typename;
            this.productCard = productCard;
        }

        public static /* synthetic */ OnProductCard1 copy$default(OnProductCard1 onProductCard1, String str, au.com.woolworths.graphql.common.fragment.ProductCard productCard, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onProductCard1.__typename;
            }
            if ((i & 2) != 0) {
                productCard = onProductCard1.productCard;
            }
            return onProductCard1.copy(str, productCard);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final au.com.woolworths.graphql.common.fragment.ProductCard getProductCard() {
            return this.productCard;
        }

        @NotNull
        public final OnProductCard1 copy(@NotNull String __typename, @NotNull au.com.woolworths.graphql.common.fragment.ProductCard productCard) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(productCard, "productCard");
            return new OnProductCard1(__typename, productCard);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnProductCard1)) {
                return false;
            }
            OnProductCard1 onProductCard1 = (OnProductCard1) other;
            return Intrinsics.c(this.__typename, onProductCard1.__typename) && Intrinsics.c(this.productCard, onProductCard1.productCard);
        }

        @NotNull
        public final au.com.woolworths.graphql.common.fragment.ProductCard getProductCard() {
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
            return d.o("OnProductCard1(__typename=", this.__typename, ", productCard=", this.productCard, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jg\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00060"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$OnProductDetailsMarketplace;", "", "imageUrl", "", "marketplaceTitle", "dispatchNote", "sellerName", "brandName", "channel", "Lau/com/woolworths/shop/graphql/type/ProductListChannelType;", "facet", "Lau/com/woolworths/shop/graphql/type/ProductListFacetType;", "info", "Lcom/woolworths/product/details/ProductDetailsQuery$Info;", "bottomSheet", "Lcom/woolworths/product/details/ProductDetailsQuery$BottomSheet;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/shop/graphql/type/ProductListChannelType;Lau/com/woolworths/shop/graphql/type/ProductListFacetType;Lcom/woolworths/product/details/ProductDetailsQuery$Info;Lcom/woolworths/product/details/ProductDetailsQuery$BottomSheet;)V", "getImageUrl", "()Ljava/lang/String;", "getMarketplaceTitle", "getDispatchNote", "getSellerName", "getBrandName", "getChannel", "()Lau/com/woolworths/shop/graphql/type/ProductListChannelType;", "getFacet", "()Lau/com/woolworths/shop/graphql/type/ProductListFacetType;", "getInfo", "()Lcom/woolworths/product/details/ProductDetailsQuery$Info;", "getBottomSheet", "()Lcom/woolworths/product/details/ProductDetailsQuery$BottomSheet;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductDetailsMarketplace {
        public static final int $stable = 8;

        @Nullable
        private final BottomSheet bottomSheet;

        @NotNull
        private final String brandName;

        @NotNull
        private final ProductListChannelType channel;

        @NotNull
        private final String dispatchNote;

        @NotNull
        private final ProductListFacetType facet;

        @NotNull
        private final String imageUrl;

        @Nullable
        private final Info info;

        @NotNull
        private final String marketplaceTitle;

        @NotNull
        private final String sellerName;

        public OnProductDetailsMarketplace(@NotNull String imageUrl, @NotNull String marketplaceTitle, @NotNull String dispatchNote, @NotNull String sellerName, @NotNull String brandName, @NotNull ProductListChannelType channel, @NotNull ProductListFacetType facet, @Nullable Info info, @Nullable BottomSheet bottomSheet) {
            Intrinsics.h(imageUrl, "imageUrl");
            Intrinsics.h(marketplaceTitle, "marketplaceTitle");
            Intrinsics.h(dispatchNote, "dispatchNote");
            Intrinsics.h(sellerName, "sellerName");
            Intrinsics.h(brandName, "brandName");
            Intrinsics.h(channel, "channel");
            Intrinsics.h(facet, "facet");
            this.imageUrl = imageUrl;
            this.marketplaceTitle = marketplaceTitle;
            this.dispatchNote = dispatchNote;
            this.sellerName = sellerName;
            this.brandName = brandName;
            this.channel = channel;
            this.facet = facet;
            this.info = info;
            this.bottomSheet = bottomSheet;
        }

        public static /* synthetic */ OnProductDetailsMarketplace copy$default(OnProductDetailsMarketplace onProductDetailsMarketplace, String str, String str2, String str3, String str4, String str5, ProductListChannelType productListChannelType, ProductListFacetType productListFacetType, Info info, BottomSheet bottomSheet, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onProductDetailsMarketplace.imageUrl;
            }
            if ((i & 2) != 0) {
                str2 = onProductDetailsMarketplace.marketplaceTitle;
            }
            if ((i & 4) != 0) {
                str3 = onProductDetailsMarketplace.dispatchNote;
            }
            if ((i & 8) != 0) {
                str4 = onProductDetailsMarketplace.sellerName;
            }
            if ((i & 16) != 0) {
                str5 = onProductDetailsMarketplace.brandName;
            }
            if ((i & 32) != 0) {
                productListChannelType = onProductDetailsMarketplace.channel;
            }
            if ((i & 64) != 0) {
                productListFacetType = onProductDetailsMarketplace.facet;
            }
            if ((i & 128) != 0) {
                info = onProductDetailsMarketplace.info;
            }
            if ((i & 256) != 0) {
                bottomSheet = onProductDetailsMarketplace.bottomSheet;
            }
            Info info2 = info;
            BottomSheet bottomSheet2 = bottomSheet;
            ProductListChannelType productListChannelType2 = productListChannelType;
            ProductListFacetType productListFacetType2 = productListFacetType;
            String str6 = str5;
            String str7 = str3;
            return onProductDetailsMarketplace.copy(str, str2, str7, str4, str6, productListChannelType2, productListFacetType2, info2, bottomSheet2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getMarketplaceTitle() {
            return this.marketplaceTitle;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getDispatchNote() {
            return this.dispatchNote;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getSellerName() {
            return this.sellerName;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final String getBrandName() {
            return this.brandName;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final ProductListChannelType getChannel() {
            return this.channel;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final ProductListFacetType getFacet() {
            return this.facet;
        }

        @Nullable
        /* renamed from: component8, reason: from getter */
        public final Info getInfo() {
            return this.info;
        }

        @Nullable
        /* renamed from: component9, reason: from getter */
        public final BottomSheet getBottomSheet() {
            return this.bottomSheet;
        }

        @NotNull
        public final OnProductDetailsMarketplace copy(@NotNull String imageUrl, @NotNull String marketplaceTitle, @NotNull String dispatchNote, @NotNull String sellerName, @NotNull String brandName, @NotNull ProductListChannelType channel, @NotNull ProductListFacetType facet, @Nullable Info info, @Nullable BottomSheet bottomSheet) {
            Intrinsics.h(imageUrl, "imageUrl");
            Intrinsics.h(marketplaceTitle, "marketplaceTitle");
            Intrinsics.h(dispatchNote, "dispatchNote");
            Intrinsics.h(sellerName, "sellerName");
            Intrinsics.h(brandName, "brandName");
            Intrinsics.h(channel, "channel");
            Intrinsics.h(facet, "facet");
            return new OnProductDetailsMarketplace(imageUrl, marketplaceTitle, dispatchNote, sellerName, brandName, channel, facet, info, bottomSheet);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnProductDetailsMarketplace)) {
                return false;
            }
            OnProductDetailsMarketplace onProductDetailsMarketplace = (OnProductDetailsMarketplace) other;
            return Intrinsics.c(this.imageUrl, onProductDetailsMarketplace.imageUrl) && Intrinsics.c(this.marketplaceTitle, onProductDetailsMarketplace.marketplaceTitle) && Intrinsics.c(this.dispatchNote, onProductDetailsMarketplace.dispatchNote) && Intrinsics.c(this.sellerName, onProductDetailsMarketplace.sellerName) && Intrinsics.c(this.brandName, onProductDetailsMarketplace.brandName) && this.channel == onProductDetailsMarketplace.channel && this.facet == onProductDetailsMarketplace.facet && Intrinsics.c(this.info, onProductDetailsMarketplace.info) && Intrinsics.c(this.bottomSheet, onProductDetailsMarketplace.bottomSheet);
        }

        @Nullable
        public final BottomSheet getBottomSheet() {
            return this.bottomSheet;
        }

        @NotNull
        public final String getBrandName() {
            return this.brandName;
        }

        @NotNull
        public final ProductListChannelType getChannel() {
            return this.channel;
        }

        @NotNull
        public final String getDispatchNote() {
            return this.dispatchNote;
        }

        @NotNull
        public final ProductListFacetType getFacet() {
            return this.facet;
        }

        @NotNull
        public final String getImageUrl() {
            return this.imageUrl;
        }

        @Nullable
        public final Info getInfo() {
            return this.info;
        }

        @NotNull
        public final String getMarketplaceTitle() {
            return this.marketplaceTitle;
        }

        @NotNull
        public final String getSellerName() {
            return this.sellerName;
        }

        public int hashCode() {
            int iHashCode = (this.facet.hashCode() + ((this.channel.hashCode() + b.c(b.c(b.c(b.c(this.imageUrl.hashCode() * 31, 31, this.marketplaceTitle), 31, this.dispatchNote), 31, this.sellerName), 31, this.brandName)) * 31)) * 31;
            Info info = this.info;
            int iHashCode2 = (iHashCode + (info == null ? 0 : info.hashCode())) * 31;
            BottomSheet bottomSheet = this.bottomSheet;
            return iHashCode2 + (bottomSheet != null ? bottomSheet.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.imageUrl;
            String str2 = this.marketplaceTitle;
            String str3 = this.dispatchNote;
            String str4 = this.sellerName;
            String str5 = this.brandName;
            ProductListChannelType productListChannelType = this.channel;
            ProductListFacetType productListFacetType = this.facet;
            Info info = this.info;
            BottomSheet bottomSheet = this.bottomSheet;
            StringBuilder sbV = YU.a.v("OnProductDetailsMarketplace(imageUrl=", str, ", marketplaceTitle=", str2, ", dispatchNote=");
            a.B(sbV, str3, ", sellerName=", str4, ", brandName=");
            sbV.append(str5);
            sbV.append(", channel=");
            sbV.append(productListChannelType);
            sbV.append(", facet=");
            sbV.append(productListFacetType);
            sbV.append(", info=");
            sbV.append(info);
            sbV.append(", bottomSheet=");
            sbV.append(bottomSheet);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$OnProductDisclaimer;", "", "content", "", "<init>", "(Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductDisclaimer {
        public static final int $stable = 0;

        @NotNull
        private final String content;

        public OnProductDisclaimer(@NotNull String content) {
            Intrinsics.h(content, "content");
            this.content = content;
        }

        public static /* synthetic */ OnProductDisclaimer copy$default(OnProductDisclaimer onProductDisclaimer, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onProductDisclaimer.content;
            }
            return onProductDisclaimer.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        @NotNull
        public final OnProductDisclaimer copy(@NotNull String content) {
            Intrinsics.h(content, "content");
            return new OnProductDisclaimer(content);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnProductDisclaimer) && Intrinsics.c(this.content, ((OnProductDisclaimer) other).content);
        }

        @NotNull
        public final String getContent() {
            return this.content;
        }

        public int hashCode() {
            return this.content.hashCode();
        }

        @NotNull
        public String toString() {
            return YU.a.h("OnProductDisclaimer(content=", this.content, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003JG\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$OnProductHorizontalList;", "", "title", "", NotificationMessage.NOTIF_KEY_SUB_TITLE, "deepLink", "actionTitle", "items", "", "Lcom/woolworths/product/details/ProductDetailsQuery$Item1;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getDeepLink", "getActionTitle", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductHorizontalList {
        public static final int $stable = 8;

        @Nullable
        private final String actionTitle;

        @Nullable
        private final String deepLink;

        @NotNull
        private final List<Item1> items;

        @Nullable
        private final String subtitle;

        @NotNull
        private final String title;

        public OnProductHorizontalList(@NotNull String title, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull List<Item1> items) {
            Intrinsics.h(title, "title");
            Intrinsics.h(items, "items");
            this.title = title;
            this.subtitle = str;
            this.deepLink = str2;
            this.actionTitle = str3;
            this.items = items;
        }

        public static /* synthetic */ OnProductHorizontalList copy$default(OnProductHorizontalList onProductHorizontalList, String str, String str2, String str3, String str4, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onProductHorizontalList.title;
            }
            if ((i & 2) != 0) {
                str2 = onProductHorizontalList.subtitle;
            }
            if ((i & 4) != 0) {
                str3 = onProductHorizontalList.deepLink;
            }
            if ((i & 8) != 0) {
                str4 = onProductHorizontalList.actionTitle;
            }
            if ((i & 16) != 0) {
                list = onProductHorizontalList.items;
            }
            List list2 = list;
            String str5 = str3;
            return onProductHorizontalList.copy(str, str2, str5, str4, list2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getDeepLink() {
            return this.deepLink;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getActionTitle() {
            return this.actionTitle;
        }

        @NotNull
        public final List<Item1> component5() {
            return this.items;
        }

        @NotNull
        public final OnProductHorizontalList copy(@NotNull String title, @Nullable String subtitle, @Nullable String deepLink, @Nullable String actionTitle, @NotNull List<Item1> items) {
            Intrinsics.h(title, "title");
            Intrinsics.h(items, "items");
            return new OnProductHorizontalList(title, subtitle, deepLink, actionTitle, items);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnProductHorizontalList)) {
                return false;
            }
            OnProductHorizontalList onProductHorizontalList = (OnProductHorizontalList) other;
            return Intrinsics.c(this.title, onProductHorizontalList.title) && Intrinsics.c(this.subtitle, onProductHorizontalList.subtitle) && Intrinsics.c(this.deepLink, onProductHorizontalList.deepLink) && Intrinsics.c(this.actionTitle, onProductHorizontalList.actionTitle) && Intrinsics.c(this.items, onProductHorizontalList.items);
        }

        @Nullable
        public final String getActionTitle() {
            return this.actionTitle;
        }

        @Nullable
        public final String getDeepLink() {
            return this.deepLink;
        }

        @NotNull
        public final List<Item1> getItems() {
            return this.items;
        }

        @Nullable
        public final String getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.deepLink;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.actionTitle;
            return this.items.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.subtitle;
            String str3 = this.deepLink;
            String str4 = this.actionTitle;
            List<Item1> list = this.items;
            StringBuilder sbV = YU.a.v("OnProductHorizontalList(title=", str, ", subtitle=", str2, ", deepLink=");
            a.B(sbV, str3, ", actionTitle=", str4, ", items=");
            return android.support.v4.media.session.a.t(sbV, list, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\bHÆ\u0003JW\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006!"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$OnProductNutritionInfo;", "", "productNutritionTitle", "", "servingsPerPack", "servingSize", "bottomCaption", "tableHeaderRow", "", "tableRows", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getProductNutritionTitle", "()Ljava/lang/String;", "getServingsPerPack", "getServingSize", "getBottomCaption", "getTableHeaderRow", "()Ljava/util/List;", "getTableRows", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductNutritionInfo {
        public static final int $stable = 8;

        @NotNull
        private final String bottomCaption;

        @NotNull
        private final String productNutritionTitle;

        @NotNull
        private final String servingSize;

        @NotNull
        private final String servingsPerPack;

        @NotNull
        private final List<String> tableHeaderRow;

        @NotNull
        private final List<List<String>> tableRows;

        /* JADX WARN: Multi-variable type inference failed */
        public OnProductNutritionInfo(@NotNull String productNutritionTitle, @NotNull String servingsPerPack, @NotNull String servingSize, @NotNull String bottomCaption, @NotNull List<String> tableHeaderRow, @NotNull List<? extends List<String>> tableRows) {
            Intrinsics.h(productNutritionTitle, "productNutritionTitle");
            Intrinsics.h(servingsPerPack, "servingsPerPack");
            Intrinsics.h(servingSize, "servingSize");
            Intrinsics.h(bottomCaption, "bottomCaption");
            Intrinsics.h(tableHeaderRow, "tableHeaderRow");
            Intrinsics.h(tableRows, "tableRows");
            this.productNutritionTitle = productNutritionTitle;
            this.servingsPerPack = servingsPerPack;
            this.servingSize = servingSize;
            this.bottomCaption = bottomCaption;
            this.tableHeaderRow = tableHeaderRow;
            this.tableRows = tableRows;
        }

        public static /* synthetic */ OnProductNutritionInfo copy$default(OnProductNutritionInfo onProductNutritionInfo, String str, String str2, String str3, String str4, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onProductNutritionInfo.productNutritionTitle;
            }
            if ((i & 2) != 0) {
                str2 = onProductNutritionInfo.servingsPerPack;
            }
            if ((i & 4) != 0) {
                str3 = onProductNutritionInfo.servingSize;
            }
            if ((i & 8) != 0) {
                str4 = onProductNutritionInfo.bottomCaption;
            }
            if ((i & 16) != 0) {
                list = onProductNutritionInfo.tableHeaderRow;
            }
            if ((i & 32) != 0) {
                list2 = onProductNutritionInfo.tableRows;
            }
            List list3 = list;
            List list4 = list2;
            return onProductNutritionInfo.copy(str, str2, str3, str4, list3, list4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getProductNutritionTitle() {
            return this.productNutritionTitle;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getServingsPerPack() {
            return this.servingsPerPack;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getServingSize() {
            return this.servingSize;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getBottomCaption() {
            return this.bottomCaption;
        }

        @NotNull
        public final List<String> component5() {
            return this.tableHeaderRow;
        }

        @NotNull
        public final List<List<String>> component6() {
            return this.tableRows;
        }

        @NotNull
        public final OnProductNutritionInfo copy(@NotNull String productNutritionTitle, @NotNull String servingsPerPack, @NotNull String servingSize, @NotNull String bottomCaption, @NotNull List<String> tableHeaderRow, @NotNull List<? extends List<String>> tableRows) {
            Intrinsics.h(productNutritionTitle, "productNutritionTitle");
            Intrinsics.h(servingsPerPack, "servingsPerPack");
            Intrinsics.h(servingSize, "servingSize");
            Intrinsics.h(bottomCaption, "bottomCaption");
            Intrinsics.h(tableHeaderRow, "tableHeaderRow");
            Intrinsics.h(tableRows, "tableRows");
            return new OnProductNutritionInfo(productNutritionTitle, servingsPerPack, servingSize, bottomCaption, tableHeaderRow, tableRows);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnProductNutritionInfo)) {
                return false;
            }
            OnProductNutritionInfo onProductNutritionInfo = (OnProductNutritionInfo) other;
            return Intrinsics.c(this.productNutritionTitle, onProductNutritionInfo.productNutritionTitle) && Intrinsics.c(this.servingsPerPack, onProductNutritionInfo.servingsPerPack) && Intrinsics.c(this.servingSize, onProductNutritionInfo.servingSize) && Intrinsics.c(this.bottomCaption, onProductNutritionInfo.bottomCaption) && Intrinsics.c(this.tableHeaderRow, onProductNutritionInfo.tableHeaderRow) && Intrinsics.c(this.tableRows, onProductNutritionInfo.tableRows);
        }

        @NotNull
        public final String getBottomCaption() {
            return this.bottomCaption;
        }

        @NotNull
        public final String getProductNutritionTitle() {
            return this.productNutritionTitle;
        }

        @NotNull
        public final String getServingSize() {
            return this.servingSize;
        }

        @NotNull
        public final String getServingsPerPack() {
            return this.servingsPerPack;
        }

        @NotNull
        public final List<String> getTableHeaderRow() {
            return this.tableHeaderRow;
        }

        @NotNull
        public final List<List<String>> getTableRows() {
            return this.tableRows;
        }

        public int hashCode() {
            return this.tableRows.hashCode() + b.d(b.c(b.c(b.c(this.productNutritionTitle.hashCode() * 31, 31, this.servingsPerPack), 31, this.servingSize), 31, this.bottomCaption), 31, this.tableHeaderRow);
        }

        @NotNull
        public String toString() {
            String str = this.productNutritionTitle;
            String str2 = this.servingsPerPack;
            String str3 = this.servingSize;
            String str4 = this.bottomCaption;
            List<String> list = this.tableHeaderRow;
            List<List<String>> list2 = this.tableRows;
            StringBuilder sbV = YU.a.v("OnProductNutritionInfo(productNutritionTitle=", str, ", servingsPerPack=", str2, ", servingSize=");
            a.B(sbV, str3, ", bottomCaption=", str4, ", tableHeaderRow=");
            sbV.append(list);
            sbV.append(", tableRows=");
            sbV.append(list2);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$OnProductOriginAndHealthInfo;", "", "countryOfOrigin", "Lcom/woolworths/product/details/ProductDetailsQuery$CountryOfOrigin;", "healthStarRating", "Lcom/woolworths/product/details/ProductDetailsQuery$HealthStarRating;", "<init>", "(Lcom/woolworths/product/details/ProductDetailsQuery$CountryOfOrigin;Lcom/woolworths/product/details/ProductDetailsQuery$HealthStarRating;)V", "getCountryOfOrigin", "()Lcom/woolworths/product/details/ProductDetailsQuery$CountryOfOrigin;", "getHealthStarRating", "()Lcom/woolworths/product/details/ProductDetailsQuery$HealthStarRating;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductOriginAndHealthInfo {
        public static final int $stable = 0;

        @Nullable
        private final CountryOfOrigin countryOfOrigin;

        @Nullable
        private final HealthStarRating healthStarRating;

        public OnProductOriginAndHealthInfo(@Nullable CountryOfOrigin countryOfOrigin, @Nullable HealthStarRating healthStarRating) {
            this.countryOfOrigin = countryOfOrigin;
            this.healthStarRating = healthStarRating;
        }

        public static /* synthetic */ OnProductOriginAndHealthInfo copy$default(OnProductOriginAndHealthInfo onProductOriginAndHealthInfo, CountryOfOrigin countryOfOrigin, HealthStarRating healthStarRating, int i, Object obj) {
            if ((i & 1) != 0) {
                countryOfOrigin = onProductOriginAndHealthInfo.countryOfOrigin;
            }
            if ((i & 2) != 0) {
                healthStarRating = onProductOriginAndHealthInfo.healthStarRating;
            }
            return onProductOriginAndHealthInfo.copy(countryOfOrigin, healthStarRating);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final CountryOfOrigin getCountryOfOrigin() {
            return this.countryOfOrigin;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final HealthStarRating getHealthStarRating() {
            return this.healthStarRating;
        }

        @NotNull
        public final OnProductOriginAndHealthInfo copy(@Nullable CountryOfOrigin countryOfOrigin, @Nullable HealthStarRating healthStarRating) {
            return new OnProductOriginAndHealthInfo(countryOfOrigin, healthStarRating);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnProductOriginAndHealthInfo)) {
                return false;
            }
            OnProductOriginAndHealthInfo onProductOriginAndHealthInfo = (OnProductOriginAndHealthInfo) other;
            return Intrinsics.c(this.countryOfOrigin, onProductOriginAndHealthInfo.countryOfOrigin) && Intrinsics.c(this.healthStarRating, onProductOriginAndHealthInfo.healthStarRating);
        }

        @Nullable
        public final CountryOfOrigin getCountryOfOrigin() {
            return this.countryOfOrigin;
        }

        @Nullable
        public final HealthStarRating getHealthStarRating() {
            return this.healthStarRating;
        }

        public int hashCode() {
            CountryOfOrigin countryOfOrigin = this.countryOfOrigin;
            int iHashCode = (countryOfOrigin == null ? 0 : countryOfOrigin.hashCode()) * 31;
            HealthStarRating healthStarRating = this.healthStarRating;
            return iHashCode + (healthStarRating != null ? healthStarRating.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "OnProductOriginAndHealthInfo(countryOfOrigin=" + this.countryOfOrigin + ", healthStarRating=" + this.healthStarRating + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$OnProductRatingsAndReviewsSummary;", "", "averageRatings", "", "displayRatings", "maximumRating", "", "ratingText", "Lcom/woolworths/product/details/ProductDetailsQuery$RatingText;", "cta", "Lcom/woolworths/product/details/ProductDetailsQuery$Cta;", "<init>", "(DDILcom/woolworths/product/details/ProductDetailsQuery$RatingText;Lcom/woolworths/product/details/ProductDetailsQuery$Cta;)V", "getAverageRatings", "()D", "getDisplayRatings", "getMaximumRating", "()I", "getRatingText", "()Lcom/woolworths/product/details/ProductDetailsQuery$RatingText;", "getCta", "()Lcom/woolworths/product/details/ProductDetailsQuery$Cta;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductRatingsAndReviewsSummary {
        public static final int $stable = 0;
        private final double averageRatings;

        @Nullable
        private final Cta cta;
        private final double displayRatings;
        private final int maximumRating;

        @NotNull
        private final RatingText ratingText;

        public OnProductRatingsAndReviewsSummary(double d, double d2, int i, @NotNull RatingText ratingText, @Nullable Cta cta) {
            Intrinsics.h(ratingText, "ratingText");
            this.averageRatings = d;
            this.displayRatings = d2;
            this.maximumRating = i;
            this.ratingText = ratingText;
            this.cta = cta;
        }

        public static /* synthetic */ OnProductRatingsAndReviewsSummary copy$default(OnProductRatingsAndReviewsSummary onProductRatingsAndReviewsSummary, double d, double d2, int i, RatingText ratingText, Cta cta, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                d = onProductRatingsAndReviewsSummary.averageRatings;
            }
            double d3 = d;
            if ((i2 & 2) != 0) {
                d2 = onProductRatingsAndReviewsSummary.displayRatings;
            }
            double d4 = d2;
            if ((i2 & 4) != 0) {
                i = onProductRatingsAndReviewsSummary.maximumRating;
            }
            int i3 = i;
            if ((i2 & 8) != 0) {
                ratingText = onProductRatingsAndReviewsSummary.ratingText;
            }
            RatingText ratingText2 = ratingText;
            if ((i2 & 16) != 0) {
                cta = onProductRatingsAndReviewsSummary.cta;
            }
            return onProductRatingsAndReviewsSummary.copy(d3, d4, i3, ratingText2, cta);
        }

        /* renamed from: component1, reason: from getter */
        public final double getAverageRatings() {
            return this.averageRatings;
        }

        /* renamed from: component2, reason: from getter */
        public final double getDisplayRatings() {
            return this.displayRatings;
        }

        /* renamed from: component3, reason: from getter */
        public final int getMaximumRating() {
            return this.maximumRating;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final RatingText getRatingText() {
            return this.ratingText;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final Cta getCta() {
            return this.cta;
        }

        @NotNull
        public final OnProductRatingsAndReviewsSummary copy(double averageRatings, double displayRatings, int maximumRating, @NotNull RatingText ratingText, @Nullable Cta cta) {
            Intrinsics.h(ratingText, "ratingText");
            return new OnProductRatingsAndReviewsSummary(averageRatings, displayRatings, maximumRating, ratingText, cta);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnProductRatingsAndReviewsSummary)) {
                return false;
            }
            OnProductRatingsAndReviewsSummary onProductRatingsAndReviewsSummary = (OnProductRatingsAndReviewsSummary) other;
            return Double.compare(this.averageRatings, onProductRatingsAndReviewsSummary.averageRatings) == 0 && Double.compare(this.displayRatings, onProductRatingsAndReviewsSummary.displayRatings) == 0 && this.maximumRating == onProductRatingsAndReviewsSummary.maximumRating && Intrinsics.c(this.ratingText, onProductRatingsAndReviewsSummary.ratingText) && Intrinsics.c(this.cta, onProductRatingsAndReviewsSummary.cta);
        }

        public final double getAverageRatings() {
            return this.averageRatings;
        }

        @Nullable
        public final Cta getCta() {
            return this.cta;
        }

        public final double getDisplayRatings() {
            return this.displayRatings;
        }

        public final int getMaximumRating() {
            return this.maximumRating;
        }

        @NotNull
        public final RatingText getRatingText() {
            return this.ratingText;
        }

        public int hashCode() {
            int iHashCode = (this.ratingText.hashCode() + b.a(this.maximumRating, android.support.v4.media.session.a.a(this.displayRatings, Double.hashCode(this.averageRatings) * 31, 31), 31)) * 31;
            Cta cta = this.cta;
            return iHashCode + (cta == null ? 0 : cta.hashCode());
        }

        @NotNull
        public String toString() {
            double d = this.averageRatings;
            double d2 = this.displayRatings;
            int i = this.maximumRating;
            RatingText ratingText = this.ratingText;
            Cta cta = this.cta;
            StringBuilder sbN = a.n(d, "OnProductRatingsAndReviewsSummary(averageRatings=", ", displayRatings=");
            sbN.append(d2);
            sbN.append(", maximumRating=");
            sbN.append(i);
            sbN.append(", ratingText=");
            sbN.append(ratingText);
            sbN.append(", cta=");
            sbN.append(cta);
            sbN.append(")");
            return sbN.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$OnPromotionBanner;", "", "banner", "Lcom/woolworths/product/details/ProductDetailsQuery$Banner;", "promotionContent", "Lcom/woolworths/product/details/ProductDetailsQuery$PromotionContent;", "<init>", "(Lcom/woolworths/product/details/ProductDetailsQuery$Banner;Lcom/woolworths/product/details/ProductDetailsQuery$PromotionContent;)V", "getBanner", "()Lcom/woolworths/product/details/ProductDetailsQuery$Banner;", "getPromotionContent", "()Lcom/woolworths/product/details/ProductDetailsQuery$PromotionContent;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPromotionBanner {
        public static final int $stable = 0;

        @NotNull
        private final Banner banner;

        @Nullable
        private final PromotionContent promotionContent;

        public OnPromotionBanner(@NotNull Banner banner, @Nullable PromotionContent promotionContent) {
            Intrinsics.h(banner, "banner");
            this.banner = banner;
            this.promotionContent = promotionContent;
        }

        public static /* synthetic */ OnPromotionBanner copy$default(OnPromotionBanner onPromotionBanner, Banner banner, PromotionContent promotionContent, int i, Object obj) {
            if ((i & 1) != 0) {
                banner = onPromotionBanner.banner;
            }
            if ((i & 2) != 0) {
                promotionContent = onPromotionBanner.promotionContent;
            }
            return onPromotionBanner.copy(banner, promotionContent);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Banner getBanner() {
            return this.banner;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final PromotionContent getPromotionContent() {
            return this.promotionContent;
        }

        @NotNull
        public final OnPromotionBanner copy(@NotNull Banner banner, @Nullable PromotionContent promotionContent) {
            Intrinsics.h(banner, "banner");
            return new OnPromotionBanner(banner, promotionContent);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnPromotionBanner)) {
                return false;
            }
            OnPromotionBanner onPromotionBanner = (OnPromotionBanner) other;
            return Intrinsics.c(this.banner, onPromotionBanner.banner) && Intrinsics.c(this.promotionContent, onPromotionBanner.promotionContent);
        }

        @NotNull
        public final Banner getBanner() {
            return this.banner;
        }

        @Nullable
        public final PromotionContent getPromotionContent() {
            return this.promotionContent;
        }

        public int hashCode() {
            int iHashCode = this.banner.hashCode() * 31;
            PromotionContent promotionContent = this.promotionContent;
            return iHashCode + (promotionContent == null ? 0 : promotionContent.hashCode());
        }

        @NotNull
        public String toString() {
            return "OnPromotionBanner(banner=" + this.banner + ", promotionContent=" + this.promotionContent + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$OnPromotionMarkdownContent;", "", "promotionMarkdownTitle", "", "promotionMarkdownText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPromotionMarkdownTitle", "()Ljava/lang/String;", "getPromotionMarkdownText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPromotionMarkdownContent {
        public static final int $stable = 0;

        @NotNull
        private final String promotionMarkdownText;

        @NotNull
        private final String promotionMarkdownTitle;

        public OnPromotionMarkdownContent(@NotNull String promotionMarkdownTitle, @NotNull String promotionMarkdownText) {
            Intrinsics.h(promotionMarkdownTitle, "promotionMarkdownTitle");
            Intrinsics.h(promotionMarkdownText, "promotionMarkdownText");
            this.promotionMarkdownTitle = promotionMarkdownTitle;
            this.promotionMarkdownText = promotionMarkdownText;
        }

        public static /* synthetic */ OnPromotionMarkdownContent copy$default(OnPromotionMarkdownContent onPromotionMarkdownContent, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onPromotionMarkdownContent.promotionMarkdownTitle;
            }
            if ((i & 2) != 0) {
                str2 = onPromotionMarkdownContent.promotionMarkdownText;
            }
            return onPromotionMarkdownContent.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getPromotionMarkdownTitle() {
            return this.promotionMarkdownTitle;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getPromotionMarkdownText() {
            return this.promotionMarkdownText;
        }

        @NotNull
        public final OnPromotionMarkdownContent copy(@NotNull String promotionMarkdownTitle, @NotNull String promotionMarkdownText) {
            Intrinsics.h(promotionMarkdownTitle, "promotionMarkdownTitle");
            Intrinsics.h(promotionMarkdownText, "promotionMarkdownText");
            return new OnPromotionMarkdownContent(promotionMarkdownTitle, promotionMarkdownText);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnPromotionMarkdownContent)) {
                return false;
            }
            OnPromotionMarkdownContent onPromotionMarkdownContent = (OnPromotionMarkdownContent) other;
            return Intrinsics.c(this.promotionMarkdownTitle, onPromotionMarkdownContent.promotionMarkdownTitle) && Intrinsics.c(this.promotionMarkdownText, onPromotionMarkdownContent.promotionMarkdownText);
        }

        @NotNull
        public final String getPromotionMarkdownText() {
            return this.promotionMarkdownText;
        }

        @NotNull
        public final String getPromotionMarkdownTitle() {
            return this.promotionMarkdownTitle;
        }

        public int hashCode() {
            return this.promotionMarkdownText.hashCode() + (this.promotionMarkdownTitle.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return YU.a.j("OnPromotionMarkdownContent(promotionMarkdownTitle=", this.promotionMarkdownTitle, ", promotionMarkdownText=", this.promotionMarkdownText, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$OnRatingsAndReviewsPreviewCta;", "", "__typename", "", "ratingsAndReviewsPreviewCta", "Lfragment/RatingsAndReviewsPreviewCta;", "<init>", "(Ljava/lang/String;Lfragment/RatingsAndReviewsPreviewCta;)V", "get__typename", "()Ljava/lang/String;", "getRatingsAndReviewsPreviewCta", "()Lfragment/RatingsAndReviewsPreviewCta;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRatingsAndReviewsPreviewCta {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final RatingsAndReviewsPreviewCta ratingsAndReviewsPreviewCta;

        public OnRatingsAndReviewsPreviewCta(@NotNull String __typename, @NotNull RatingsAndReviewsPreviewCta ratingsAndReviewsPreviewCta) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(ratingsAndReviewsPreviewCta, "ratingsAndReviewsPreviewCta");
            this.__typename = __typename;
            this.ratingsAndReviewsPreviewCta = ratingsAndReviewsPreviewCta;
        }

        public static /* synthetic */ OnRatingsAndReviewsPreviewCta copy$default(OnRatingsAndReviewsPreviewCta onRatingsAndReviewsPreviewCta, String str, RatingsAndReviewsPreviewCta ratingsAndReviewsPreviewCta, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onRatingsAndReviewsPreviewCta.__typename;
            }
            if ((i & 2) != 0) {
                ratingsAndReviewsPreviewCta = onRatingsAndReviewsPreviewCta.ratingsAndReviewsPreviewCta;
            }
            return onRatingsAndReviewsPreviewCta.copy(str, ratingsAndReviewsPreviewCta);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final RatingsAndReviewsPreviewCta getRatingsAndReviewsPreviewCta() {
            return this.ratingsAndReviewsPreviewCta;
        }

        @NotNull
        public final OnRatingsAndReviewsPreviewCta copy(@NotNull String __typename, @NotNull RatingsAndReviewsPreviewCta ratingsAndReviewsPreviewCta) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(ratingsAndReviewsPreviewCta, "ratingsAndReviewsPreviewCta");
            return new OnRatingsAndReviewsPreviewCta(__typename, ratingsAndReviewsPreviewCta);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnRatingsAndReviewsPreviewCta)) {
                return false;
            }
            OnRatingsAndReviewsPreviewCta onRatingsAndReviewsPreviewCta = (OnRatingsAndReviewsPreviewCta) other;
            return Intrinsics.c(this.__typename, onRatingsAndReviewsPreviewCta.__typename) && Intrinsics.c(this.ratingsAndReviewsPreviewCta, onRatingsAndReviewsPreviewCta.ratingsAndReviewsPreviewCta);
        }

        @NotNull
        public final RatingsAndReviewsPreviewCta getRatingsAndReviewsPreviewCta() {
            return this.ratingsAndReviewsPreviewCta;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.ratingsAndReviewsPreviewCta.f23785a.hashCode() + (this.__typename.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "OnRatingsAndReviewsPreviewCta(__typename=" + this.__typename + ", ratingsAndReviewsPreviewCta=" + this.ratingsAndReviewsPreviewCta + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$OnRatingsAndReviewsPreviewHeader;", "", "__typename", "", "ratingsAndReviewsPreviewHeader", "Lfragment/RatingsAndReviewsPreviewHeader;", "<init>", "(Ljava/lang/String;Lfragment/RatingsAndReviewsPreviewHeader;)V", "get__typename", "()Ljava/lang/String;", "getRatingsAndReviewsPreviewHeader", "()Lfragment/RatingsAndReviewsPreviewHeader;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRatingsAndReviewsPreviewHeader {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final RatingsAndReviewsPreviewHeader ratingsAndReviewsPreviewHeader;

        public OnRatingsAndReviewsPreviewHeader(@NotNull String __typename, @NotNull RatingsAndReviewsPreviewHeader ratingsAndReviewsPreviewHeader) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(ratingsAndReviewsPreviewHeader, "ratingsAndReviewsPreviewHeader");
            this.__typename = __typename;
            this.ratingsAndReviewsPreviewHeader = ratingsAndReviewsPreviewHeader;
        }

        public static /* synthetic */ OnRatingsAndReviewsPreviewHeader copy$default(OnRatingsAndReviewsPreviewHeader onRatingsAndReviewsPreviewHeader, String str, RatingsAndReviewsPreviewHeader ratingsAndReviewsPreviewHeader, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onRatingsAndReviewsPreviewHeader.__typename;
            }
            if ((i & 2) != 0) {
                ratingsAndReviewsPreviewHeader = onRatingsAndReviewsPreviewHeader.ratingsAndReviewsPreviewHeader;
            }
            return onRatingsAndReviewsPreviewHeader.copy(str, ratingsAndReviewsPreviewHeader);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final RatingsAndReviewsPreviewHeader getRatingsAndReviewsPreviewHeader() {
            return this.ratingsAndReviewsPreviewHeader;
        }

        @NotNull
        public final OnRatingsAndReviewsPreviewHeader copy(@NotNull String __typename, @NotNull RatingsAndReviewsPreviewHeader ratingsAndReviewsPreviewHeader) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(ratingsAndReviewsPreviewHeader, "ratingsAndReviewsPreviewHeader");
            return new OnRatingsAndReviewsPreviewHeader(__typename, ratingsAndReviewsPreviewHeader);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnRatingsAndReviewsPreviewHeader)) {
                return false;
            }
            OnRatingsAndReviewsPreviewHeader onRatingsAndReviewsPreviewHeader = (OnRatingsAndReviewsPreviewHeader) other;
            return Intrinsics.c(this.__typename, onRatingsAndReviewsPreviewHeader.__typename) && Intrinsics.c(this.ratingsAndReviewsPreviewHeader, onRatingsAndReviewsPreviewHeader.ratingsAndReviewsPreviewHeader);
        }

        @NotNull
        public final RatingsAndReviewsPreviewHeader getRatingsAndReviewsPreviewHeader() {
            return this.ratingsAndReviewsPreviewHeader;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.ratingsAndReviewsPreviewHeader.hashCode() + (this.__typename.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "OnRatingsAndReviewsPreviewHeader(__typename=" + this.__typename + ", ratingsAndReviewsPreviewHeader=" + this.ratingsAndReviewsPreviewHeader + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$OnRatingsAndReviewsRatingsDetails;", "", "__typename", "", "ratingsAndReviewsRatingsDetails", "Lfragment/RatingsAndReviewsRatingsDetails;", "<init>", "(Ljava/lang/String;Lfragment/RatingsAndReviewsRatingsDetails;)V", "get__typename", "()Ljava/lang/String;", "getRatingsAndReviewsRatingsDetails", "()Lfragment/RatingsAndReviewsRatingsDetails;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRatingsAndReviewsRatingsDetails {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final RatingsAndReviewsRatingsDetails ratingsAndReviewsRatingsDetails;

        public OnRatingsAndReviewsRatingsDetails(@NotNull String __typename, @NotNull RatingsAndReviewsRatingsDetails ratingsAndReviewsRatingsDetails) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(ratingsAndReviewsRatingsDetails, "ratingsAndReviewsRatingsDetails");
            this.__typename = __typename;
            this.ratingsAndReviewsRatingsDetails = ratingsAndReviewsRatingsDetails;
        }

        public static /* synthetic */ OnRatingsAndReviewsRatingsDetails copy$default(OnRatingsAndReviewsRatingsDetails onRatingsAndReviewsRatingsDetails, String str, RatingsAndReviewsRatingsDetails ratingsAndReviewsRatingsDetails, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onRatingsAndReviewsRatingsDetails.__typename;
            }
            if ((i & 2) != 0) {
                ratingsAndReviewsRatingsDetails = onRatingsAndReviewsRatingsDetails.ratingsAndReviewsRatingsDetails;
            }
            return onRatingsAndReviewsRatingsDetails.copy(str, ratingsAndReviewsRatingsDetails);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final RatingsAndReviewsRatingsDetails getRatingsAndReviewsRatingsDetails() {
            return this.ratingsAndReviewsRatingsDetails;
        }

        @NotNull
        public final OnRatingsAndReviewsRatingsDetails copy(@NotNull String __typename, @NotNull RatingsAndReviewsRatingsDetails ratingsAndReviewsRatingsDetails) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(ratingsAndReviewsRatingsDetails, "ratingsAndReviewsRatingsDetails");
            return new OnRatingsAndReviewsRatingsDetails(__typename, ratingsAndReviewsRatingsDetails);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnRatingsAndReviewsRatingsDetails)) {
                return false;
            }
            OnRatingsAndReviewsRatingsDetails onRatingsAndReviewsRatingsDetails = (OnRatingsAndReviewsRatingsDetails) other;
            return Intrinsics.c(this.__typename, onRatingsAndReviewsRatingsDetails.__typename) && Intrinsics.c(this.ratingsAndReviewsRatingsDetails, onRatingsAndReviewsRatingsDetails.ratingsAndReviewsRatingsDetails);
        }

        @NotNull
        public final RatingsAndReviewsRatingsDetails getRatingsAndReviewsRatingsDetails() {
            return this.ratingsAndReviewsRatingsDetails;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.ratingsAndReviewsRatingsDetails.f23793a.hashCode() + (this.__typename.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "OnRatingsAndReviewsRatingsDetails(__typename=" + this.__typename + ", ratingsAndReviewsRatingsDetails=" + this.ratingsAndReviewsRatingsDetails + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$OnRatingsAndReviewsReviewDetails;", "", "__typename", "", "ratingsAndReviewsReviewDetails", "Lfragment/RatingsAndReviewsReviewDetails;", "<init>", "(Ljava/lang/String;Lfragment/RatingsAndReviewsReviewDetails;)V", "get__typename", "()Ljava/lang/String;", "getRatingsAndReviewsReviewDetails", "()Lfragment/RatingsAndReviewsReviewDetails;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRatingsAndReviewsReviewDetails {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final RatingsAndReviewsReviewDetails ratingsAndReviewsReviewDetails;

        public OnRatingsAndReviewsReviewDetails(@NotNull String __typename, @NotNull RatingsAndReviewsReviewDetails ratingsAndReviewsReviewDetails) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(ratingsAndReviewsReviewDetails, "ratingsAndReviewsReviewDetails");
            this.__typename = __typename;
            this.ratingsAndReviewsReviewDetails = ratingsAndReviewsReviewDetails;
        }

        public static /* synthetic */ OnRatingsAndReviewsReviewDetails copy$default(OnRatingsAndReviewsReviewDetails onRatingsAndReviewsReviewDetails, String str, RatingsAndReviewsReviewDetails ratingsAndReviewsReviewDetails, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onRatingsAndReviewsReviewDetails.__typename;
            }
            if ((i & 2) != 0) {
                ratingsAndReviewsReviewDetails = onRatingsAndReviewsReviewDetails.ratingsAndReviewsReviewDetails;
            }
            return onRatingsAndReviewsReviewDetails.copy(str, ratingsAndReviewsReviewDetails);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final RatingsAndReviewsReviewDetails getRatingsAndReviewsReviewDetails() {
            return this.ratingsAndReviewsReviewDetails;
        }

        @NotNull
        public final OnRatingsAndReviewsReviewDetails copy(@NotNull String __typename, @NotNull RatingsAndReviewsReviewDetails ratingsAndReviewsReviewDetails) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(ratingsAndReviewsReviewDetails, "ratingsAndReviewsReviewDetails");
            return new OnRatingsAndReviewsReviewDetails(__typename, ratingsAndReviewsReviewDetails);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnRatingsAndReviewsReviewDetails)) {
                return false;
            }
            OnRatingsAndReviewsReviewDetails onRatingsAndReviewsReviewDetails = (OnRatingsAndReviewsReviewDetails) other;
            return Intrinsics.c(this.__typename, onRatingsAndReviewsReviewDetails.__typename) && Intrinsics.c(this.ratingsAndReviewsReviewDetails, onRatingsAndReviewsReviewDetails.ratingsAndReviewsReviewDetails);
        }

        @NotNull
        public final RatingsAndReviewsReviewDetails getRatingsAndReviewsReviewDetails() {
            return this.ratingsAndReviewsReviewDetails;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.ratingsAndReviewsReviewDetails.f23817a.hashCode() + (this.__typename.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "OnRatingsAndReviewsReviewDetails(__typename=" + this.__typename + ", ratingsAndReviewsReviewDetails=" + this.ratingsAndReviewsReviewDetails + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$PrimaryCta;", "", AnnotatedPrivateKey.LABEL, "", "<init>", "(Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PrimaryCta {
        public static final int $stable = 0;

        @NotNull
        private final String label;

        public PrimaryCta(@NotNull String label) {
            Intrinsics.h(label, "label");
            this.label = label;
        }

        public static /* synthetic */ PrimaryCta copy$default(PrimaryCta primaryCta, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = primaryCta.label;
            }
            return primaryCta.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        public final PrimaryCta copy(@NotNull String label) {
            Intrinsics.h(label, "label");
            return new PrimaryCta(label);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PrimaryCta) && Intrinsics.c(this.label, ((PrimaryCta) other).label);
        }

        @NotNull
        public final String getLabel() {
            return this.label;
        }

        public int hashCode() {
            return this.label.hashCode();
        }

        @NotNull
        public String toString() {
            return YU.a.h("PrimaryCta(label=", this.label, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$ProductCard;", "", "__typename", "", "productCard", "Lau/com/woolworths/graphql/common/fragment/ProductCard;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/graphql/common/fragment/ProductCard;)V", "get__typename", "()Ljava/lang/String;", "getProductCard", "()Lau/com/woolworths/graphql/common/fragment/ProductCard;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductCard {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final au.com.woolworths.graphql.common.fragment.ProductCard productCard;

        public ProductCard(@NotNull String __typename, @NotNull au.com.woolworths.graphql.common.fragment.ProductCard productCard) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(productCard, "productCard");
            this.__typename = __typename;
            this.productCard = productCard;
        }

        public static /* synthetic */ ProductCard copy$default(ProductCard productCard, String str, au.com.woolworths.graphql.common.fragment.ProductCard productCard2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = productCard.__typename;
            }
            if ((i & 2) != 0) {
                productCard2 = productCard.productCard;
            }
            return productCard.copy(str, productCard2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final au.com.woolworths.graphql.common.fragment.ProductCard getProductCard() {
            return this.productCard;
        }

        @NotNull
        public final ProductCard copy(@NotNull String __typename, @NotNull au.com.woolworths.graphql.common.fragment.ProductCard productCard) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(productCard, "productCard");
            return new ProductCard(__typename, productCard);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductCard)) {
                return false;
            }
            ProductCard productCard = (ProductCard) other;
            return Intrinsics.c(this.__typename, productCard.__typename) && Intrinsics.c(this.productCard, productCard.productCard);
        }

        @NotNull
        public final au.com.woolworths.graphql.common.fragment.ProductCard getProductCard() {
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
            return d.o("ProductCard(__typename=", this.__typename, ", productCard=", this.productCard, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$ProductDetails;", "", "feed", "", "Lcom/woolworths/product/details/ProductDetailsQuery$Feed;", "imageList", "Lcom/woolworths/product/details/ProductDetailsQuery$ImageList;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getFeed", "()Ljava/util/List;", "getImageList", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductDetails {
        public static final int $stable = 8;

        @NotNull
        private final List<Feed> feed;

        @NotNull
        private final List<ImageList> imageList;

        public ProductDetails(@NotNull List<Feed> feed, @NotNull List<ImageList> imageList) {
            Intrinsics.h(feed, "feed");
            Intrinsics.h(imageList, "imageList");
            this.feed = feed;
            this.imageList = imageList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ProductDetails copy$default(ProductDetails productDetails, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = productDetails.feed;
            }
            if ((i & 2) != 0) {
                list2 = productDetails.imageList;
            }
            return productDetails.copy(list, list2);
        }

        @NotNull
        public final List<Feed> component1() {
            return this.feed;
        }

        @NotNull
        public final List<ImageList> component2() {
            return this.imageList;
        }

        @NotNull
        public final ProductDetails copy(@NotNull List<Feed> feed, @NotNull List<ImageList> imageList) {
            Intrinsics.h(feed, "feed");
            Intrinsics.h(imageList, "imageList");
            return new ProductDetails(feed, imageList);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductDetails)) {
                return false;
            }
            ProductDetails productDetails = (ProductDetails) other;
            return Intrinsics.c(this.feed, productDetails.feed) && Intrinsics.c(this.imageList, productDetails.imageList);
        }

        @NotNull
        public final List<Feed> getFeed() {
            return this.feed;
        }

        @NotNull
        public final List<ImageList> getImageList() {
            return this.imageList;
        }

        public int hashCode() {
            return this.imageList.hashCode() + (this.feed.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "ProductDetails(feed=" + this.feed + ", imageList=" + this.imageList + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$ProductRatingsAndReviewsPreview;", "", "sections", "", "Lcom/woolworths/product/details/ProductDetailsQuery$Section;", "<init>", "(Ljava/util/List;)V", "getSections", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductRatingsAndReviewsPreview {
        public static final int $stable = 8;

        @NotNull
        private final List<Section> sections;

        public ProductRatingsAndReviewsPreview(@NotNull List<Section> sections) {
            Intrinsics.h(sections, "sections");
            this.sections = sections;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ProductRatingsAndReviewsPreview copy$default(ProductRatingsAndReviewsPreview productRatingsAndReviewsPreview, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = productRatingsAndReviewsPreview.sections;
            }
            return productRatingsAndReviewsPreview.copy(list);
        }

        @NotNull
        public final List<Section> component1() {
            return this.sections;
        }

        @NotNull
        public final ProductRatingsAndReviewsPreview copy(@NotNull List<Section> sections) {
            Intrinsics.h(sections, "sections");
            return new ProductRatingsAndReviewsPreview(sections);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ProductRatingsAndReviewsPreview) && Intrinsics.c(this.sections, ((ProductRatingsAndReviewsPreview) other).sections);
        }

        @NotNull
        public final List<Section> getSections() {
            return this.sections;
        }

        public int hashCode() {
            return this.sections.hashCode();
        }

        @NotNull
        public String toString() {
            return au.com.woolworths.android.onesite.a.l("ProductRatingsAndReviewsPreview(sections=", ")", this.sections);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$PromotionContent;", "", "__typename", "", "onPromotionMarkdownContent", "Lcom/woolworths/product/details/ProductDetailsQuery$OnPromotionMarkdownContent;", "<init>", "(Ljava/lang/String;Lcom/woolworths/product/details/ProductDetailsQuery$OnPromotionMarkdownContent;)V", "get__typename", "()Ljava/lang/String;", "getOnPromotionMarkdownContent", "()Lcom/woolworths/product/details/ProductDetailsQuery$OnPromotionMarkdownContent;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PromotionContent {
        public static final int $stable = 0;

        @NotNull
        private final String __typename;

        @Nullable
        private final OnPromotionMarkdownContent onPromotionMarkdownContent;

        public PromotionContent(@NotNull String __typename, @Nullable OnPromotionMarkdownContent onPromotionMarkdownContent) {
            Intrinsics.h(__typename, "__typename");
            this.__typename = __typename;
            this.onPromotionMarkdownContent = onPromotionMarkdownContent;
        }

        public static /* synthetic */ PromotionContent copy$default(PromotionContent promotionContent, String str, OnPromotionMarkdownContent onPromotionMarkdownContent, int i, Object obj) {
            if ((i & 1) != 0) {
                str = promotionContent.__typename;
            }
            if ((i & 2) != 0) {
                onPromotionMarkdownContent = promotionContent.onPromotionMarkdownContent;
            }
            return promotionContent.copy(str, onPromotionMarkdownContent);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final OnPromotionMarkdownContent getOnPromotionMarkdownContent() {
            return this.onPromotionMarkdownContent;
        }

        @NotNull
        public final PromotionContent copy(@NotNull String __typename, @Nullable OnPromotionMarkdownContent onPromotionMarkdownContent) {
            Intrinsics.h(__typename, "__typename");
            return new PromotionContent(__typename, onPromotionMarkdownContent);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PromotionContent)) {
                return false;
            }
            PromotionContent promotionContent = (PromotionContent) other;
            return Intrinsics.c(this.__typename, promotionContent.__typename) && Intrinsics.c(this.onPromotionMarkdownContent, promotionContent.onPromotionMarkdownContent);
        }

        @Nullable
        public final OnPromotionMarkdownContent getOnPromotionMarkdownContent() {
            return this.onPromotionMarkdownContent;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int iHashCode = this.__typename.hashCode() * 31;
            OnPromotionMarkdownContent onPromotionMarkdownContent = this.onPromotionMarkdownContent;
            return iHashCode + (onPromotionMarkdownContent == null ? 0 : onPromotionMarkdownContent.hashCode());
        }

        @NotNull
        public String toString() {
            return "PromotionContent(__typename=" + this.__typename + ", onPromotionMarkdownContent=" + this.onPromotionMarkdownContent + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$RatingText;", "", TextBundle.TEXT_ENTRY, "", "altText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getAltText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RatingText {
        public static final int $stable = 0;

        @NotNull
        private final String altText;

        @NotNull
        private final String text;

        public RatingText(@NotNull String text, @NotNull String altText) {
            Intrinsics.h(text, "text");
            Intrinsics.h(altText, "altText");
            this.text = text;
            this.altText = altText;
        }

        public static /* synthetic */ RatingText copy$default(RatingText ratingText, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ratingText.text;
            }
            if ((i & 2) != 0) {
                str2 = ratingText.altText;
            }
            return ratingText.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getAltText() {
            return this.altText;
        }

        @NotNull
        public final RatingText copy(@NotNull String text, @NotNull String altText) {
            Intrinsics.h(text, "text");
            Intrinsics.h(altText, "altText");
            return new RatingText(text, altText);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RatingText)) {
                return false;
            }
            RatingText ratingText = (RatingText) other;
            return Intrinsics.c(this.text, ratingText.text) && Intrinsics.c(this.altText, ratingText.altText);
        }

        @NotNull
        public final String getAltText() {
            return this.altText;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.altText.hashCode() + (this.text.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return YU.a.j("RatingText(text=", this.text, ", altText=", this.altText, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$SecondaryCta;", "", AnnotatedPrivateKey.LABEL, "", "<init>", "(Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SecondaryCta {
        public static final int $stable = 0;

        @NotNull
        private final String label;

        public SecondaryCta(@NotNull String label) {
            Intrinsics.h(label, "label");
            this.label = label;
        }

        public static /* synthetic */ SecondaryCta copy$default(SecondaryCta secondaryCta, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = secondaryCta.label;
            }
            return secondaryCta.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        public final SecondaryCta copy(@NotNull String label) {
            Intrinsics.h(label, "label");
            return new SecondaryCta(label);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SecondaryCta) && Intrinsics.c(this.label, ((SecondaryCta) other).label);
        }

        @NotNull
        public final String getLabel() {
            return this.label;
        }

        public int hashCode() {
            return this.label.hashCode();
        }

        @NotNull
        public String toString() {
            return YU.a.h("SecondaryCta(label=", this.label, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JC\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/woolworths/product/details/ProductDetailsQuery$Section;", "", "__typename", "", "onRatingsAndReviewsPreviewHeader", "Lcom/woolworths/product/details/ProductDetailsQuery$OnRatingsAndReviewsPreviewHeader;", "onRatingsAndReviewsRatingsDetails", "Lcom/woolworths/product/details/ProductDetailsQuery$OnRatingsAndReviewsRatingsDetails;", "onRatingsAndReviewsReviewDetails", "Lcom/woolworths/product/details/ProductDetailsQuery$OnRatingsAndReviewsReviewDetails;", "onRatingsAndReviewsPreviewCta", "Lcom/woolworths/product/details/ProductDetailsQuery$OnRatingsAndReviewsPreviewCta;", "<init>", "(Ljava/lang/String;Lcom/woolworths/product/details/ProductDetailsQuery$OnRatingsAndReviewsPreviewHeader;Lcom/woolworths/product/details/ProductDetailsQuery$OnRatingsAndReviewsRatingsDetails;Lcom/woolworths/product/details/ProductDetailsQuery$OnRatingsAndReviewsReviewDetails;Lcom/woolworths/product/details/ProductDetailsQuery$OnRatingsAndReviewsPreviewCta;)V", "get__typename", "()Ljava/lang/String;", "getOnRatingsAndReviewsPreviewHeader", "()Lcom/woolworths/product/details/ProductDetailsQuery$OnRatingsAndReviewsPreviewHeader;", "getOnRatingsAndReviewsRatingsDetails", "()Lcom/woolworths/product/details/ProductDetailsQuery$OnRatingsAndReviewsRatingsDetails;", "getOnRatingsAndReviewsReviewDetails", "()Lcom/woolworths/product/details/ProductDetailsQuery$OnRatingsAndReviewsReviewDetails;", "getOnRatingsAndReviewsPreviewCta", "()Lcom/woolworths/product/details/ProductDetailsQuery$OnRatingsAndReviewsPreviewCta;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Section {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @Nullable
        private final OnRatingsAndReviewsPreviewCta onRatingsAndReviewsPreviewCta;

        @Nullable
        private final OnRatingsAndReviewsPreviewHeader onRatingsAndReviewsPreviewHeader;

        @Nullable
        private final OnRatingsAndReviewsRatingsDetails onRatingsAndReviewsRatingsDetails;

        @Nullable
        private final OnRatingsAndReviewsReviewDetails onRatingsAndReviewsReviewDetails;

        public Section(@NotNull String __typename, @Nullable OnRatingsAndReviewsPreviewHeader onRatingsAndReviewsPreviewHeader, @Nullable OnRatingsAndReviewsRatingsDetails onRatingsAndReviewsRatingsDetails, @Nullable OnRatingsAndReviewsReviewDetails onRatingsAndReviewsReviewDetails, @Nullable OnRatingsAndReviewsPreviewCta onRatingsAndReviewsPreviewCta) {
            Intrinsics.h(__typename, "__typename");
            this.__typename = __typename;
            this.onRatingsAndReviewsPreviewHeader = onRatingsAndReviewsPreviewHeader;
            this.onRatingsAndReviewsRatingsDetails = onRatingsAndReviewsRatingsDetails;
            this.onRatingsAndReviewsReviewDetails = onRatingsAndReviewsReviewDetails;
            this.onRatingsAndReviewsPreviewCta = onRatingsAndReviewsPreviewCta;
        }

        public static /* synthetic */ Section copy$default(Section section, String str, OnRatingsAndReviewsPreviewHeader onRatingsAndReviewsPreviewHeader, OnRatingsAndReviewsRatingsDetails onRatingsAndReviewsRatingsDetails, OnRatingsAndReviewsReviewDetails onRatingsAndReviewsReviewDetails, OnRatingsAndReviewsPreviewCta onRatingsAndReviewsPreviewCta, int i, Object obj) {
            if ((i & 1) != 0) {
                str = section.__typename;
            }
            if ((i & 2) != 0) {
                onRatingsAndReviewsPreviewHeader = section.onRatingsAndReviewsPreviewHeader;
            }
            if ((i & 4) != 0) {
                onRatingsAndReviewsRatingsDetails = section.onRatingsAndReviewsRatingsDetails;
            }
            if ((i & 8) != 0) {
                onRatingsAndReviewsReviewDetails = section.onRatingsAndReviewsReviewDetails;
            }
            if ((i & 16) != 0) {
                onRatingsAndReviewsPreviewCta = section.onRatingsAndReviewsPreviewCta;
            }
            OnRatingsAndReviewsPreviewCta onRatingsAndReviewsPreviewCta2 = onRatingsAndReviewsPreviewCta;
            OnRatingsAndReviewsRatingsDetails onRatingsAndReviewsRatingsDetails2 = onRatingsAndReviewsRatingsDetails;
            return section.copy(str, onRatingsAndReviewsPreviewHeader, onRatingsAndReviewsRatingsDetails2, onRatingsAndReviewsReviewDetails, onRatingsAndReviewsPreviewCta2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final OnRatingsAndReviewsPreviewHeader getOnRatingsAndReviewsPreviewHeader() {
            return this.onRatingsAndReviewsPreviewHeader;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final OnRatingsAndReviewsRatingsDetails getOnRatingsAndReviewsRatingsDetails() {
            return this.onRatingsAndReviewsRatingsDetails;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final OnRatingsAndReviewsReviewDetails getOnRatingsAndReviewsReviewDetails() {
            return this.onRatingsAndReviewsReviewDetails;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final OnRatingsAndReviewsPreviewCta getOnRatingsAndReviewsPreviewCta() {
            return this.onRatingsAndReviewsPreviewCta;
        }

        @NotNull
        public final Section copy(@NotNull String __typename, @Nullable OnRatingsAndReviewsPreviewHeader onRatingsAndReviewsPreviewHeader, @Nullable OnRatingsAndReviewsRatingsDetails onRatingsAndReviewsRatingsDetails, @Nullable OnRatingsAndReviewsReviewDetails onRatingsAndReviewsReviewDetails, @Nullable OnRatingsAndReviewsPreviewCta onRatingsAndReviewsPreviewCta) {
            Intrinsics.h(__typename, "__typename");
            return new Section(__typename, onRatingsAndReviewsPreviewHeader, onRatingsAndReviewsRatingsDetails, onRatingsAndReviewsReviewDetails, onRatingsAndReviewsPreviewCta);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Section)) {
                return false;
            }
            Section section = (Section) other;
            return Intrinsics.c(this.__typename, section.__typename) && Intrinsics.c(this.onRatingsAndReviewsPreviewHeader, section.onRatingsAndReviewsPreviewHeader) && Intrinsics.c(this.onRatingsAndReviewsRatingsDetails, section.onRatingsAndReviewsRatingsDetails) && Intrinsics.c(this.onRatingsAndReviewsReviewDetails, section.onRatingsAndReviewsReviewDetails) && Intrinsics.c(this.onRatingsAndReviewsPreviewCta, section.onRatingsAndReviewsPreviewCta);
        }

        @Nullable
        public final OnRatingsAndReviewsPreviewCta getOnRatingsAndReviewsPreviewCta() {
            return this.onRatingsAndReviewsPreviewCta;
        }

        @Nullable
        public final OnRatingsAndReviewsPreviewHeader getOnRatingsAndReviewsPreviewHeader() {
            return this.onRatingsAndReviewsPreviewHeader;
        }

        @Nullable
        public final OnRatingsAndReviewsRatingsDetails getOnRatingsAndReviewsRatingsDetails() {
            return this.onRatingsAndReviewsRatingsDetails;
        }

        @Nullable
        public final OnRatingsAndReviewsReviewDetails getOnRatingsAndReviewsReviewDetails() {
            return this.onRatingsAndReviewsReviewDetails;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int iHashCode = this.__typename.hashCode() * 31;
            OnRatingsAndReviewsPreviewHeader onRatingsAndReviewsPreviewHeader = this.onRatingsAndReviewsPreviewHeader;
            int iHashCode2 = (iHashCode + (onRatingsAndReviewsPreviewHeader == null ? 0 : onRatingsAndReviewsPreviewHeader.hashCode())) * 31;
            OnRatingsAndReviewsRatingsDetails onRatingsAndReviewsRatingsDetails = this.onRatingsAndReviewsRatingsDetails;
            int iHashCode3 = (iHashCode2 + (onRatingsAndReviewsRatingsDetails == null ? 0 : onRatingsAndReviewsRatingsDetails.hashCode())) * 31;
            OnRatingsAndReviewsReviewDetails onRatingsAndReviewsReviewDetails = this.onRatingsAndReviewsReviewDetails;
            int iHashCode4 = (iHashCode3 + (onRatingsAndReviewsReviewDetails == null ? 0 : onRatingsAndReviewsReviewDetails.hashCode())) * 31;
            OnRatingsAndReviewsPreviewCta onRatingsAndReviewsPreviewCta = this.onRatingsAndReviewsPreviewCta;
            return iHashCode4 + (onRatingsAndReviewsPreviewCta != null ? onRatingsAndReviewsPreviewCta.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Section(__typename=" + this.__typename + ", onRatingsAndReviewsPreviewHeader=" + this.onRatingsAndReviewsPreviewHeader + ", onRatingsAndReviewsRatingsDetails=" + this.onRatingsAndReviewsRatingsDetails + ", onRatingsAndReviewsReviewDetails=" + this.onRatingsAndReviewsReviewDetails + ", onRatingsAndReviewsPreviewCta=" + this.onRatingsAndReviewsPreviewCta + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProductDetailsQuery(@NotNull Optional<String> productId, @NotNull Optional<String> barcode, @NotNull Optional<? extends BarcodeType> barcodeType, @NotNull Optional<String> storeId, @NotNull Optional<? extends List<String>> supportedLinks, boolean z, boolean z2, boolean z3, boolean z4, @NotNull Optional<Boolean> includeAvailabilityInfoStatus, boolean z5, @NotNull ProductRatingsAndReviewsPreviewInput productRatingsAndReviewsPreviewInput, boolean z6, @NotNull Optional<Boolean> includePricingFootnote, boolean z7) {
        Intrinsics.h(productId, "productId");
        Intrinsics.h(barcode, "barcode");
        Intrinsics.h(barcodeType, "barcodeType");
        Intrinsics.h(storeId, "storeId");
        Intrinsics.h(supportedLinks, "supportedLinks");
        Intrinsics.h(includeAvailabilityInfoStatus, "includeAvailabilityInfoStatus");
        Intrinsics.h(productRatingsAndReviewsPreviewInput, "productRatingsAndReviewsPreviewInput");
        Intrinsics.h(includePricingFootnote, "includePricingFootnote");
        this.productId = productId;
        this.barcode = barcode;
        this.barcodeType = barcodeType;
        this.storeId = storeId;
        this.supportedLinks = supportedLinks;
        this.isRatingsAndReviewsSummaryEnabled = z;
        this.isHealthierOptionsEnabled = z2;
        this.isMarkdownEnabled = z3;
        this.includeOfferMinimumSpend = z4;
        this.includeAvailabilityInfoStatus = includeAvailabilityInfoStatus;
        this.includeProductAvailabilityStates = z5;
        this.productRatingsAndReviewsPreviewInput = productRatingsAndReviewsPreviewInput;
        this.includeActionableCard = z6;
        this.includePricingFootnote = includePricingFootnote;
        this.includeLowestPrice14Days = z7;
    }

    @Override // com.apollographql.apollo.api.Executable
    @NotNull
    public Adapter<Data> adapter() {
        return Adapters.c(ProductDetailsQuery_ResponseAdapter.Data.INSTANCE, false);
    }

    @NotNull
    public final Optional<String> component1() {
        return this.productId;
    }

    @NotNull
    public final Optional<Boolean> component10() {
        return this.includeAvailabilityInfoStatus;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIncludeProductAvailabilityStates() {
        return this.includeProductAvailabilityStates;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final ProductRatingsAndReviewsPreviewInput getProductRatingsAndReviewsPreviewInput() {
        return this.productRatingsAndReviewsPreviewInput;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getIncludeActionableCard() {
        return this.includeActionableCard;
    }

    @NotNull
    public final Optional<Boolean> component14() {
        return this.includePricingFootnote;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getIncludeLowestPrice14Days() {
        return this.includeLowestPrice14Days;
    }

    @NotNull
    public final Optional<String> component2() {
        return this.barcode;
    }

    @NotNull
    public final Optional<BarcodeType> component3() {
        return this.barcodeType;
    }

    @NotNull
    public final Optional<String> component4() {
        return this.storeId;
    }

    @NotNull
    public final Optional<List<String>> component5() {
        return this.supportedLinks;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsRatingsAndReviewsSummaryEnabled() {
        return this.isRatingsAndReviewsSummaryEnabled;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsHealthierOptionsEnabled() {
        return this.isHealthierOptionsEnabled;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsMarkdownEnabled() {
        return this.isMarkdownEnabled;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIncludeOfferMinimumSpend() {
        return this.includeOfferMinimumSpend;
    }

    @NotNull
    public final ProductDetailsQuery copy(@NotNull Optional<String> productId, @NotNull Optional<String> barcode, @NotNull Optional<? extends BarcodeType> barcodeType, @NotNull Optional<String> storeId, @NotNull Optional<? extends List<String>> supportedLinks, boolean isRatingsAndReviewsSummaryEnabled, boolean isHealthierOptionsEnabled, boolean isMarkdownEnabled, boolean includeOfferMinimumSpend, @NotNull Optional<Boolean> includeAvailabilityInfoStatus, boolean includeProductAvailabilityStates, @NotNull ProductRatingsAndReviewsPreviewInput productRatingsAndReviewsPreviewInput, boolean includeActionableCard, @NotNull Optional<Boolean> includePricingFootnote, boolean includeLowestPrice14Days) {
        Intrinsics.h(productId, "productId");
        Intrinsics.h(barcode, "barcode");
        Intrinsics.h(barcodeType, "barcodeType");
        Intrinsics.h(storeId, "storeId");
        Intrinsics.h(supportedLinks, "supportedLinks");
        Intrinsics.h(includeAvailabilityInfoStatus, "includeAvailabilityInfoStatus");
        Intrinsics.h(productRatingsAndReviewsPreviewInput, "productRatingsAndReviewsPreviewInput");
        Intrinsics.h(includePricingFootnote, "includePricingFootnote");
        return new ProductDetailsQuery(productId, barcode, barcodeType, storeId, supportedLinks, isRatingsAndReviewsSummaryEnabled, isHealthierOptionsEnabled, isMarkdownEnabled, includeOfferMinimumSpend, includeAvailabilityInfoStatus, includeProductAvailabilityStates, productRatingsAndReviewsPreviewInput, includeActionableCard, includePricingFootnote, includeLowestPrice14Days);
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
        if (!(other instanceof ProductDetailsQuery)) {
            return false;
        }
        ProductDetailsQuery productDetailsQuery = (ProductDetailsQuery) other;
        return Intrinsics.c(this.productId, productDetailsQuery.productId) && Intrinsics.c(this.barcode, productDetailsQuery.barcode) && Intrinsics.c(this.barcodeType, productDetailsQuery.barcodeType) && Intrinsics.c(this.storeId, productDetailsQuery.storeId) && Intrinsics.c(this.supportedLinks, productDetailsQuery.supportedLinks) && this.isRatingsAndReviewsSummaryEnabled == productDetailsQuery.isRatingsAndReviewsSummaryEnabled && this.isHealthierOptionsEnabled == productDetailsQuery.isHealthierOptionsEnabled && this.isMarkdownEnabled == productDetailsQuery.isMarkdownEnabled && this.includeOfferMinimumSpend == productDetailsQuery.includeOfferMinimumSpend && Intrinsics.c(this.includeAvailabilityInfoStatus, productDetailsQuery.includeAvailabilityInfoStatus) && this.includeProductAvailabilityStates == productDetailsQuery.includeProductAvailabilityStates && Intrinsics.c(this.productRatingsAndReviewsPreviewInput, productDetailsQuery.productRatingsAndReviewsPreviewInput) && this.includeActionableCard == productDetailsQuery.includeActionableCard && Intrinsics.c(this.includePricingFootnote, productDetailsQuery.includePricingFootnote) && this.includeLowestPrice14Days == productDetailsQuery.includeLowestPrice14Days;
    }

    @NotNull
    public final Optional<String> getBarcode() {
        return this.barcode;
    }

    @NotNull
    public final Optional<BarcodeType> getBarcodeType() {
        return this.barcodeType;
    }

    public final boolean getIncludeActionableCard() {
        return this.includeActionableCard;
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
    public final Optional<String> getProductId() {
        return this.productId;
    }

    @NotNull
    public final ProductRatingsAndReviewsPreviewInput getProductRatingsAndReviewsPreviewInput() {
        return this.productRatingsAndReviewsPreviewInput;
    }

    @NotNull
    public final Optional<String> getStoreId() {
        return this.storeId;
    }

    @NotNull
    public final Optional<List<String>> getSupportedLinks() {
        return this.supportedLinks;
    }

    public int hashCode() {
        return Boolean.hashCode(this.includeLowestPrice14Days) + au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.includePricingFootnote, b.e((this.productRatingsAndReviewsPreviewInput.hashCode() + b.e(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.includeAvailabilityInfoStatus, b.e(b.e(b.e(b.e(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.supportedLinks, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.storeId, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.barcodeType, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.barcode, this.productId.hashCode() * 31, 31), 31), 31), 31), 31, this.isRatingsAndReviewsSummaryEnabled), 31, this.isHealthierOptionsEnabled), 31, this.isMarkdownEnabled), 31, this.includeOfferMinimumSpend), 31), 31, this.includeProductAvailabilityStates)) * 31, 31, this.includeActionableCard), 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    @NotNull
    public String id() {
        return OPERATION_ID;
    }

    public final boolean isHealthierOptionsEnabled() {
        return this.isHealthierOptionsEnabled;
    }

    public final boolean isMarkdownEnabled() {
        return this.isMarkdownEnabled;
    }

    public final boolean isRatingsAndReviewsSummaryEnabled() {
        return this.isRatingsAndReviewsSummaryEnabled;
    }

    @Override // com.apollographql.apollo.api.Operation
    @NotNull
    public String name() {
        return OPERATION_NAME;
    }

    @NotNull
    public CompiledField rootField() {
        CompiledField.Builder builder = new CompiledField.Builder("data", au.com.woolworths.shop.graphql.type.Query.H2);
        builder.e(ProductDetailsQuerySelections.INSTANCE.get__root());
        return builder.c();
    }

    @Override // com.apollographql.apollo.api.Executable
    public void serializeVariables(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        ProductDetailsQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @NotNull
    public String toString() {
        Optional<String> optional = this.productId;
        Optional<String> optional2 = this.barcode;
        Optional<BarcodeType> optional3 = this.barcodeType;
        Optional<String> optional4 = this.storeId;
        Optional<List<String>> optional5 = this.supportedLinks;
        boolean z = this.isRatingsAndReviewsSummaryEnabled;
        boolean z2 = this.isHealthierOptionsEnabled;
        boolean z3 = this.isMarkdownEnabled;
        boolean z4 = this.includeOfferMinimumSpend;
        Optional<Boolean> optional6 = this.includeAvailabilityInfoStatus;
        boolean z5 = this.includeProductAvailabilityStates;
        ProductRatingsAndReviewsPreviewInput productRatingsAndReviewsPreviewInput = this.productRatingsAndReviewsPreviewInput;
        boolean z6 = this.includeActionableCard;
        Optional<Boolean> optional7 = this.includePricingFootnote;
        boolean z7 = this.includeLowestPrice14Days;
        StringBuilder sbP = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.p("ProductDetailsQuery(productId=", optional, ", barcode=", optional2, ", barcodeType=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sbP, optional3, ", storeId=", optional4, ", supportedLinks=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.y(sbP, optional5, ", isRatingsAndReviewsSummaryEnabled=", z, ", isHealthierOptionsEnabled=");
        au.com.woolworths.android.onesite.a.D(sbP, z2, ", isMarkdownEnabled=", z3, ", includeOfferMinimumSpend=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.z(sbP, z4, ", includeAvailabilityInfoStatus=", optional6, ", includeProductAvailabilityStates=");
        sbP.append(z5);
        sbP.append(", productRatingsAndReviewsPreviewInput=");
        sbP.append(productRatingsAndReviewsPreviewInput);
        sbP.append(", includeActionableCard=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.z(sbP, z6, ", includePricingFootnote=", optional7, ", includeLowestPrice14Days=");
        return YU.a.k(")", sbP, z7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ProductDetailsQuery(Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, boolean z, boolean z2, boolean z3, boolean z4, Optional optional6, boolean z5, ProductRatingsAndReviewsPreviewInput productRatingsAndReviewsPreviewInput, boolean z6, Optional optional7, boolean z7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i & 1;
        Optional.Absent absent = Optional.Absent.f13523a;
        this(i2 != 0 ? absent : optional, (i & 2) != 0 ? absent : optional2, (i & 4) != 0 ? absent : optional3, (i & 8) != 0 ? absent : optional4, (i & 16) != 0 ? absent : optional5, z, z2, z3, z4, (i & 512) != 0 ? absent : optional6, z5, productRatingsAndReviewsPreviewInput, z6, (i & 8192) != 0 ? absent : optional7, z7);
    }
}
