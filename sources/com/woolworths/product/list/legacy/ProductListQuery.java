package com.woolworths.product.list.legacy;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.graphql.TealiumAnalytics;
import au.com.woolworths.android.onesite.graphql.GoogleAdCustomTargeting;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.AdBannerNativeSize;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.CardHeight;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.ProductListInput;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.woolworths.product.list.legacy.adapter.ProductListQuery_ResponseAdapter;
import com.woolworths.product.list.legacy.adapter.ProductListQuery_VariablesAdapter;
import com.woolworths.product.list.legacy.fragment.InsetBanner;
import com.woolworths.product.list.legacy.fragment.VideoAdBottomSheet;
import com.woolworths.product.list.legacy.selections.ProductListQuerySelections;
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
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\bi\b\u0087\b\u0018\u0000 ´\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u009c\u0001NOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001\u008b\u0001\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001\u009e\u0001\u009f\u0001 \u0001¡\u0001¢\u0001£\u0001¤\u0001¥\u0001¦\u0001§\u0001¨\u0001©\u0001ª\u0001«\u0001¬\u0001\u00ad\u0001®\u0001¯\u0001°\u0001±\u0001²\u0001³\u0001´\u0001B\u009f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020*H\u0016J\b\u0010,\u001a\u00020*H\u0016J \u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0006H\u0016J\u000e\u00104\u001a\b\u0012\u0004\u0012\u00020\u000205H\u0016J\b\u00106\u001a\u000207H\u0016J\t\u00108\u001a\u00020\u0004HÆ\u0003J\t\u00109\u001a\u00020\u0006HÆ\u0003J\t\u0010:\u001a\u00020\u0006HÆ\u0003J\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0003J\t\u0010<\u001a\u00020\u0006HÆ\u0003J\t\u0010=\u001a\u00020\u0006HÆ\u0003J\t\u0010>\u001a\u00020\u0006HÆ\u0003J\t\u0010?\u001a\u00020\u0006HÆ\u0003J\t\u0010@\u001a\u00020\u0006HÆ\u0003J\t\u0010A\u001a\u00020\u0006HÆ\u0003J\u000f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0003J\u000f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0003J\u000f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0003J\t\u0010E\u001a\u00020\u0006HÆ\u0003J\t\u0010F\u001a\u00020\u0006HÆ\u0003J·\u0001\u0010G\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u0006HÆ\u0001J\u0013\u0010H\u001a\u00020\u00062\b\u0010I\u001a\u0004\u0018\u00010JHÖ\u0003J\t\u0010K\u001a\u00020LHÖ\u0001J\t\u0010M\u001a\u00020*HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0011\u0010\u0013\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0011\u0010\u0014\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001a¨\u0006µ\u0001"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/product/list/legacy/ProductListQuery$Data;", "productListInput", "Lau/com/woolworths/shop/graphql/type/ProductListInput;", "includeProductAvailabilityStates", "", "includeOfferMinimumSpend", "includeAvailabilityInfoStatus", "Lcom/apollographql/apollo/api/Optional;", "includeUnitPriceInsetBanner", "includeUniversalInventoryFallback", "includeZeroResultPage", "includeVideoAdUnit", "includeMerchCard", "includeHorizontalList", "includePricingFootnote", "includeNhpEdrBanner", "includeNhpPersonalisedProductsBanner", "includeProductListPersistentChip", "includeLowestPrice14Days", "<init>", "(Lau/com/woolworths/shop/graphql/type/ProductListInput;ZZLcom/apollographql/apollo/api/Optional;ZZZZZZLcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;ZZ)V", "getProductListInput", "()Lau/com/woolworths/shop/graphql/type/ProductListInput;", "getIncludeProductAvailabilityStates", "()Z", "getIncludeOfferMinimumSpend", "getIncludeAvailabilityInfoStatus", "()Lcom/apollographql/apollo/api/Optional;", "getIncludeUnitPriceInsetBanner", "getIncludeUniversalInventoryFallback", "getIncludeZeroResultPage", "getIncludeVideoAdUnit", "getIncludeMerchCard", "getIncludeHorizontalList", "getIncludePricingFootnote", "getIncludeNhpEdrBanner", "getIncludeNhpPersonalisedProductsBanner", "getIncludeProductListPersistentChip", "getIncludeLowestPrice14Days", "id", "", "document", AppMeasurementSdk.ConditionalUserProperty.NAME, "serializeVariables", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "withDefaultValues", "adapter", "Lcom/apollographql/apollo/api/Adapter;", "rootField", "Lcom/apollographql/apollo/api/CompiledField;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "other", "", "hashCode", "", "toString", "Data", "ProductList", "Analytic", "OnAdobeTargetAnalytics", "ProductsFeed", "OnActionableCard", "OnGoogleAdBannerCard", "OnUniversalInventoryContainer", "GoogleAdBannerCard", "NextBestAction", "OnActionableCard1", "OnEdrOfferBanner", "BannerButtonAction", "Analytics", "BannerButtonLabel", "BannerAction", "Analytics1", "BannerAnalytics", "BannerImpressionAnalytics", "CommonAnalytics", "OnPersonalisedProductsBanner", "BannerImage", "Product", "BannerAction1", "Analytics2", "BannerAnalytics1", "BannerImpressionAnalytics1", "OnHorizontalList", "Item", "OnProductCard", "OnMerchCardFullImage", "MerchCardFullImageAction", "MerchCardFullImageBackgroundImageWithAlt", "MerchCardFullImageButton", "ButtonAction", "OnVideoAdUnit", "VideoAdUnitVideoAd", "FallbackImage", "Transcript", "TermsAndConditions", "Analytics3", "EventAnalytics", "Impression", "VideoPlay", "VideoPause", "VideoErrorImpression", "VideoAdUnitProductCard", "OnMerchCard", "MerchCardGridImageWithAlt", "MerchCardListImageWithAlt", "MerchCardButton", "ButtonAction1", "Analytics4", "MerchCardAction", "Analytics5", "MerchCardAnalytics", "MerchCardImpressionAnalytics", "OnInsetBanner", "Action", "OnProductCard1", "Filter", "FilterItem", "Banner", "Action1", "SortOption", "SortOptionsBanner", "MarketplaceFilterSwitch", "ButtonCta", "MarketplaceInfo", "Item1", "Footer", "MarketplaceBottomSheet", "PrimaryCta", "SecondaryCta", "Chip", "Text", "FacetChip", "Text1", "ZeroResultContent", "Item2", "OnZeroResultProductCategories", "ZeroResultProductCategoriesItem", "ProductCategoryTileAction", "OnHorizontalList1", "Item3", "OnProductCard2", "ZeroResult", "OnProductListZeroResult", "Item4", "OnZeroResultProductCategories1", "ZeroResultProductCategoriesItem1", "ProductCategoryTileAction1", "OnHorizontalList2", "Item5", "OnProductCard3", "OnProductListFullScreenError", "Analytics6", "ImpressionAnalytics", "Cta", "LinkTextWithAlt", "LinkAction", "Analytics7", "Companion", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ProductListQuery implements Query<Data> {

    @NotNull
    public static final String OPERATION_ID = "0ee1cf442dc0cbfd90fa49a6213d70d5bc8b3ce31f1a98ce0fa8d7d8a6088c8f";

    @NotNull
    public static final String OPERATION_NAME = "productList";

    @NotNull
    private final Optional<Boolean> includeAvailabilityInfoStatus;
    private final boolean includeHorizontalList;
    private final boolean includeLowestPrice14Days;
    private final boolean includeMerchCard;

    @NotNull
    private final Optional<Boolean> includeNhpEdrBanner;

    @NotNull
    private final Optional<Boolean> includeNhpPersonalisedProductsBanner;
    private final boolean includeOfferMinimumSpend;

    @NotNull
    private final Optional<Boolean> includePricingFootnote;
    private final boolean includeProductAvailabilityStates;
    private final boolean includeProductListPersistentChip;
    private final boolean includeUnitPriceInsetBanner;
    private final boolean includeUniversalInventoryFallback;
    private final boolean includeVideoAdUnit;
    private final boolean includeZeroResultPage;

    @NotNull
    private final ProductListInput productListInput;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @StabilityInferred
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$Action;", "", "placement", "Lau/com/woolworths/shop/graphql/type/InsetBannerActionPlacement;", "type", "Lau/com/woolworths/shop/graphql/type/InsetBannerActionType;", AnnotatedPrivateKey.LABEL, "", "url", "<init>", "(Lau/com/woolworths/shop/graphql/type/InsetBannerActionPlacement;Lau/com/woolworths/shop/graphql/type/InsetBannerActionType;Ljava/lang/String;Ljava/lang/String;)V", "getPlacement", "()Lau/com/woolworths/shop/graphql/type/InsetBannerActionPlacement;", "getType", "()Lau/com/woolworths/shop/graphql/type/InsetBannerActionType;", "getLabel", "()Ljava/lang/String;", "getUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$Action1;", "", "placement", "Lau/com/woolworths/shop/graphql/type/InsetBannerActionPlacement;", "type", "Lau/com/woolworths/shop/graphql/type/InsetBannerActionType;", AnnotatedPrivateKey.LABEL, "", "url", "<init>", "(Lau/com/woolworths/shop/graphql/type/InsetBannerActionPlacement;Lau/com/woolworths/shop/graphql/type/InsetBannerActionType;Ljava/lang/String;Ljava/lang/String;)V", "getPlacement", "()Lau/com/woolworths/shop/graphql/type/InsetBannerActionPlacement;", "getType", "()Lau/com/woolworths/shop/graphql/type/InsetBannerActionType;", "getLabel", "()Ljava/lang/String;", "getUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action1 {
        public static final int $stable = 0;

        @NotNull
        private final String label;

        @NotNull
        private final InsetBannerActionPlacement placement;

        @NotNull
        private final InsetBannerActionType type;

        @Nullable
        private final String url;

        public Action1(@NotNull InsetBannerActionPlacement placement, @NotNull InsetBannerActionType type, @NotNull String label, @Nullable String str) {
            Intrinsics.h(placement, "placement");
            Intrinsics.h(type, "type");
            Intrinsics.h(label, "label");
            this.placement = placement;
            this.type = type;
            this.label = label;
            this.url = str;
        }

        public static /* synthetic */ Action1 copy$default(Action1 action1, InsetBannerActionPlacement insetBannerActionPlacement, InsetBannerActionType insetBannerActionType, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                insetBannerActionPlacement = action1.placement;
            }
            if ((i & 2) != 0) {
                insetBannerActionType = action1.type;
            }
            if ((i & 4) != 0) {
                str = action1.label;
            }
            if ((i & 8) != 0) {
                str2 = action1.url;
            }
            return action1.copy(insetBannerActionPlacement, insetBannerActionType, str, str2);
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
        public final Action1 copy(@NotNull InsetBannerActionPlacement placement, @NotNull InsetBannerActionType type, @NotNull String label, @Nullable String url) {
            Intrinsics.h(placement, "placement");
            Intrinsics.h(type, "type");
            Intrinsics.h(label, "label");
            return new Action1(placement, type, label, url);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Action1)) {
                return false;
            }
            Action1 action1 = (Action1) other;
            return this.placement == action1.placement && this.type == action1.type && Intrinsics.c(this.label, action1.label) && Intrinsics.c(this.url, action1.url);
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
            return a.l(d.t("Action1(placement=", insetBannerActionPlacement, ", type=", insetBannerActionType, ", label="), this.label, ", url=", this.url, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$Analytic;", "", "__typename", "", "onAdobeTargetAnalytics", "Lcom/woolworths/product/list/legacy/ProductListQuery$OnAdobeTargetAnalytics;", "<init>", "(Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductListQuery$OnAdobeTargetAnalytics;)V", "get__typename", "()Ljava/lang/String;", "getOnAdobeTargetAnalytics", "()Lcom/woolworths/product/list/legacy/ProductListQuery$OnAdobeTargetAnalytics;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytic {
        public static final int $stable = 0;

        @NotNull
        private final String __typename;

        @Nullable
        private final OnAdobeTargetAnalytics onAdobeTargetAnalytics;

        public Analytic(@NotNull String __typename, @Nullable OnAdobeTargetAnalytics onAdobeTargetAnalytics) {
            Intrinsics.h(__typename, "__typename");
            this.__typename = __typename;
            this.onAdobeTargetAnalytics = onAdobeTargetAnalytics;
        }

        public static /* synthetic */ Analytic copy$default(Analytic analytic, String str, OnAdobeTargetAnalytics onAdobeTargetAnalytics, int i, Object obj) {
            if ((i & 1) != 0) {
                str = analytic.__typename;
            }
            if ((i & 2) != 0) {
                onAdobeTargetAnalytics = analytic.onAdobeTargetAnalytics;
            }
            return analytic.copy(str, onAdobeTargetAnalytics);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final OnAdobeTargetAnalytics getOnAdobeTargetAnalytics() {
            return this.onAdobeTargetAnalytics;
        }

        @NotNull
        public final Analytic copy(@NotNull String __typename, @Nullable OnAdobeTargetAnalytics onAdobeTargetAnalytics) {
            Intrinsics.h(__typename, "__typename");
            return new Analytic(__typename, onAdobeTargetAnalytics);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Analytic)) {
                return false;
            }
            Analytic analytic = (Analytic) other;
            return Intrinsics.c(this.__typename, analytic.__typename) && Intrinsics.c(this.onAdobeTargetAnalytics, analytic.onAdobeTargetAnalytics);
        }

        @Nullable
        public final OnAdobeTargetAnalytics getOnAdobeTargetAnalytics() {
            return this.onAdobeTargetAnalytics;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int iHashCode = this.__typename.hashCode() * 31;
            OnAdobeTargetAnalytics onAdobeTargetAnalytics = this.onAdobeTargetAnalytics;
            return iHashCode + (onAdobeTargetAnalytics == null ? 0 : onAdobeTargetAnalytics.hashCode());
        }

        @NotNull
        public String toString() {
            return "Analytic(__typename=" + this.__typename + ", onAdobeTargetAnalytics=" + this.onAdobeTargetAnalytics + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$Analytics;", "", "__typename", "", "analyticsFields", "Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;)V", "get__typename", "()Ljava/lang/String;", "getAnalyticsFields", "()Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final AnalyticsFields analyticsFields;

        public Analytics(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            this.__typename = __typename;
            this.analyticsFields = analyticsFields;
        }

        public static /* synthetic */ Analytics copy$default(Analytics analytics, String str, AnalyticsFields analyticsFields, int i, Object obj) {
            if ((i & 1) != 0) {
                str = analytics.__typename;
            }
            if ((i & 2) != 0) {
                analyticsFields = analytics.analyticsFields;
            }
            return analytics.copy(str, analyticsFields);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final Analytics copy(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            return new Analytics(__typename, analyticsFields);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Analytics)) {
                return false;
            }
            Analytics analytics = (Analytics) other;
            return Intrinsics.c(this.__typename, analytics.__typename) && Intrinsics.c(this.analyticsFields, analytics.analyticsFields);
        }

        @NotNull
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.analyticsFields.hashCode() + (this.__typename.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return d.p("Analytics(__typename=", this.__typename, ", analyticsFields=", this.analyticsFields, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$Analytics1;", "", "__typename", "", "analyticsFields", "Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;)V", "get__typename", "()Ljava/lang/String;", "getAnalyticsFields", "()Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics1 {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final AnalyticsFields analyticsFields;

        public Analytics1(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            this.__typename = __typename;
            this.analyticsFields = analyticsFields;
        }

        public static /* synthetic */ Analytics1 copy$default(Analytics1 analytics1, String str, AnalyticsFields analyticsFields, int i, Object obj) {
            if ((i & 1) != 0) {
                str = analytics1.__typename;
            }
            if ((i & 2) != 0) {
                analyticsFields = analytics1.analyticsFields;
            }
            return analytics1.copy(str, analyticsFields);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final Analytics1 copy(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            return new Analytics1(__typename, analyticsFields);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Analytics1)) {
                return false;
            }
            Analytics1 analytics1 = (Analytics1) other;
            return Intrinsics.c(this.__typename, analytics1.__typename) && Intrinsics.c(this.analyticsFields, analytics1.analyticsFields);
        }

        @NotNull
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.analyticsFields.hashCode() + (this.__typename.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return d.p("Analytics1(__typename=", this.__typename, ", analyticsFields=", this.analyticsFields, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$Analytics2;", "", "__typename", "", "analyticsFields", "Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;)V", "get__typename", "()Ljava/lang/String;", "getAnalyticsFields", "()Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics2 {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final AnalyticsFields analyticsFields;

        public Analytics2(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            this.__typename = __typename;
            this.analyticsFields = analyticsFields;
        }

        public static /* synthetic */ Analytics2 copy$default(Analytics2 analytics2, String str, AnalyticsFields analyticsFields, int i, Object obj) {
            if ((i & 1) != 0) {
                str = analytics2.__typename;
            }
            if ((i & 2) != 0) {
                analyticsFields = analytics2.analyticsFields;
            }
            return analytics2.copy(str, analyticsFields);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final Analytics2 copy(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            return new Analytics2(__typename, analyticsFields);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Analytics2)) {
                return false;
            }
            Analytics2 analytics2 = (Analytics2) other;
            return Intrinsics.c(this.__typename, analytics2.__typename) && Intrinsics.c(this.analyticsFields, analytics2.analyticsFields);
        }

        @NotNull
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.analyticsFields.hashCode() + (this.__typename.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return d.p("Analytics2(__typename=", this.__typename, ", analyticsFields=", this.analyticsFields, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$Analytics3;", "", "__typename", "", "analyticsFields", "Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;)V", "get__typename", "()Ljava/lang/String;", "getAnalyticsFields", "()Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics3 {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final AnalyticsFields analyticsFields;

        public Analytics3(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            this.__typename = __typename;
            this.analyticsFields = analyticsFields;
        }

        public static /* synthetic */ Analytics3 copy$default(Analytics3 analytics3, String str, AnalyticsFields analyticsFields, int i, Object obj) {
            if ((i & 1) != 0) {
                str = analytics3.__typename;
            }
            if ((i & 2) != 0) {
                analyticsFields = analytics3.analyticsFields;
            }
            return analytics3.copy(str, analyticsFields);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final Analytics3 copy(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            return new Analytics3(__typename, analyticsFields);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Analytics3)) {
                return false;
            }
            Analytics3 analytics3 = (Analytics3) other;
            return Intrinsics.c(this.__typename, analytics3.__typename) && Intrinsics.c(this.analyticsFields, analytics3.analyticsFields);
        }

        @NotNull
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.analyticsFields.hashCode() + (this.__typename.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return d.p("Analytics3(__typename=", this.__typename, ", analyticsFields=", this.analyticsFields, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$Analytics4;", "", "__typename", "", "analyticsFields", "Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;)V", "get__typename", "()Ljava/lang/String;", "getAnalyticsFields", "()Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics4 {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final AnalyticsFields analyticsFields;

        public Analytics4(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            this.__typename = __typename;
            this.analyticsFields = analyticsFields;
        }

        public static /* synthetic */ Analytics4 copy$default(Analytics4 analytics4, String str, AnalyticsFields analyticsFields, int i, Object obj) {
            if ((i & 1) != 0) {
                str = analytics4.__typename;
            }
            if ((i & 2) != 0) {
                analyticsFields = analytics4.analyticsFields;
            }
            return analytics4.copy(str, analyticsFields);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final Analytics4 copy(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            return new Analytics4(__typename, analyticsFields);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Analytics4)) {
                return false;
            }
            Analytics4 analytics4 = (Analytics4) other;
            return Intrinsics.c(this.__typename, analytics4.__typename) && Intrinsics.c(this.analyticsFields, analytics4.analyticsFields);
        }

        @NotNull
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.analyticsFields.hashCode() + (this.__typename.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return d.p("Analytics4(__typename=", this.__typename, ", analyticsFields=", this.analyticsFields, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$Analytics5;", "", "__typename", "", "analyticsFields", "Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;)V", "get__typename", "()Ljava/lang/String;", "getAnalyticsFields", "()Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics5 {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final AnalyticsFields analyticsFields;

        public Analytics5(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            this.__typename = __typename;
            this.analyticsFields = analyticsFields;
        }

        public static /* synthetic */ Analytics5 copy$default(Analytics5 analytics5, String str, AnalyticsFields analyticsFields, int i, Object obj) {
            if ((i & 1) != 0) {
                str = analytics5.__typename;
            }
            if ((i & 2) != 0) {
                analyticsFields = analytics5.analyticsFields;
            }
            return analytics5.copy(str, analyticsFields);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final Analytics5 copy(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            return new Analytics5(__typename, analyticsFields);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Analytics5)) {
                return false;
            }
            Analytics5 analytics5 = (Analytics5) other;
            return Intrinsics.c(this.__typename, analytics5.__typename) && Intrinsics.c(this.analyticsFields, analytics5.analyticsFields);
        }

        @NotNull
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.analyticsFields.hashCode() + (this.__typename.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return d.p("Analytics5(__typename=", this.__typename, ", analyticsFields=", this.analyticsFields, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$Analytics6;", "", "__typename", "", "analyticsFields", "Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;)V", "get__typename", "()Ljava/lang/String;", "getAnalyticsFields", "()Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics6 {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final AnalyticsFields analyticsFields;

        public Analytics6(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            this.__typename = __typename;
            this.analyticsFields = analyticsFields;
        }

        public static /* synthetic */ Analytics6 copy$default(Analytics6 analytics6, String str, AnalyticsFields analyticsFields, int i, Object obj) {
            if ((i & 1) != 0) {
                str = analytics6.__typename;
            }
            if ((i & 2) != 0) {
                analyticsFields = analytics6.analyticsFields;
            }
            return analytics6.copy(str, analyticsFields);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final Analytics6 copy(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            return new Analytics6(__typename, analyticsFields);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Analytics6)) {
                return false;
            }
            Analytics6 analytics6 = (Analytics6) other;
            return Intrinsics.c(this.__typename, analytics6.__typename) && Intrinsics.c(this.analyticsFields, analytics6.analyticsFields);
        }

        @NotNull
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.analyticsFields.hashCode() + (this.__typename.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return d.p("Analytics6(__typename=", this.__typename, ", analyticsFields=", this.analyticsFields, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$Analytics7;", "", "__typename", "", "analyticsFields", "Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;)V", "get__typename", "()Ljava/lang/String;", "getAnalyticsFields", "()Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics7 {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final AnalyticsFields analyticsFields;

        public Analytics7(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            this.__typename = __typename;
            this.analyticsFields = analyticsFields;
        }

        public static /* synthetic */ Analytics7 copy$default(Analytics7 analytics7, String str, AnalyticsFields analyticsFields, int i, Object obj) {
            if ((i & 1) != 0) {
                str = analytics7.__typename;
            }
            if ((i & 2) != 0) {
                analyticsFields = analytics7.analyticsFields;
            }
            return analytics7.copy(str, analyticsFields);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final Analytics7 copy(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            return new Analytics7(__typename, analyticsFields);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Analytics7)) {
                return false;
            }
            Analytics7 analytics7 = (Analytics7) other;
            return Intrinsics.c(this.__typename, analytics7.__typename) && Intrinsics.c(this.analyticsFields, analytics7.analyticsFields);
        }

        @NotNull
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.analyticsFields.hashCode() + (this.__typename.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return d.p("Analytics7(__typename=", this.__typename, ", analyticsFields=", this.analyticsFields, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006 "}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$Banner;", "", "displayType", "Lau/com/woolworths/shop/graphql/type/InsetBannerDisplayType;", "message", "", "iconUrl", UrlHandler.ACTION, "Lcom/woolworths/product/list/legacy/ProductListQuery$Action1;", "bannerTitle", "<init>", "(Lau/com/woolworths/shop/graphql/type/InsetBannerDisplayType;Ljava/lang/String;Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductListQuery$Action1;Ljava/lang/String;)V", "getDisplayType", "()Lau/com/woolworths/shop/graphql/type/InsetBannerDisplayType;", "getMessage", "()Ljava/lang/String;", "getIconUrl", "getAction", "()Lcom/woolworths/product/list/legacy/ProductListQuery$Action1;", "getBannerTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Banner {
        public static final int $stable = 0;

        @Nullable
        private final Action1 action;

        @Nullable
        private final String bannerTitle;

        @NotNull
        private final InsetBannerDisplayType displayType;

        @Nullable
        private final String iconUrl;

        @NotNull
        private final String message;

        public Banner(@NotNull InsetBannerDisplayType displayType, @NotNull String message, @Nullable String str, @Nullable Action1 action1, @Nullable String str2) {
            Intrinsics.h(displayType, "displayType");
            Intrinsics.h(message, "message");
            this.displayType = displayType;
            this.message = message;
            this.iconUrl = str;
            this.action = action1;
            this.bannerTitle = str2;
        }

        public static /* synthetic */ Banner copy$default(Banner banner, InsetBannerDisplayType insetBannerDisplayType, String str, String str2, Action1 action1, String str3, int i, Object obj) {
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
                action1 = banner.action;
            }
            if ((i & 16) != 0) {
                str3 = banner.bannerTitle;
            }
            String str4 = str3;
            String str5 = str2;
            return banner.copy(insetBannerDisplayType, str, str5, action1, str4);
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
        public final Action1 getAction() {
            return this.action;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final String getBannerTitle() {
            return this.bannerTitle;
        }

        @NotNull
        public final Banner copy(@NotNull InsetBannerDisplayType displayType, @NotNull String message, @Nullable String iconUrl, @Nullable Action1 action, @Nullable String bannerTitle) {
            Intrinsics.h(displayType, "displayType");
            Intrinsics.h(message, "message");
            return new Banner(displayType, message, iconUrl, action, bannerTitle);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Banner)) {
                return false;
            }
            Banner banner = (Banner) other;
            return this.displayType == banner.displayType && Intrinsics.c(this.message, banner.message) && Intrinsics.c(this.iconUrl, banner.iconUrl) && Intrinsics.c(this.action, banner.action) && Intrinsics.c(this.bannerTitle, banner.bannerTitle);
        }

        @Nullable
        public final Action1 getAction() {
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
            Action1 action1 = this.action;
            int iHashCode2 = (iHashCode + (action1 == null ? 0 : action1.hashCode())) * 31;
            String str2 = this.bannerTitle;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            InsetBannerDisplayType insetBannerDisplayType = this.displayType;
            String str = this.message;
            String str2 = this.iconUrl;
            Action1 action1 = this.action;
            String str3 = this.bannerTitle;
            StringBuilder sbU = d.u("Banner(displayType=", insetBannerDisplayType, ", message=", str, ", iconUrl=");
            sbU.append(str2);
            sbU.append(", action=");
            sbU.append(action1);
            sbU.append(", bannerTitle=");
            return YU.a.o(sbU, str3, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006 "}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$BannerAction;", "", "__typename", "", "type", "Lau/com/woolworths/shop/graphql/type/ActionType;", UrlHandler.ACTION, "analytics", "Lcom/woolworths/product/list/legacy/ProductListQuery$Analytics1;", "id", "<init>", "(Ljava/lang/String;Lau/com/woolworths/shop/graphql/type/ActionType;Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductListQuery$Analytics1;Ljava/lang/String;)V", "get__typename", "()Ljava/lang/String;", "getType", "()Lau/com/woolworths/shop/graphql/type/ActionType;", "getAction", "getAnalytics", "()Lcom/woolworths/product/list/legacy/ProductListQuery$Analytics1;", "getId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BannerAction {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final String action;

        @Nullable
        private final Analytics1 analytics;

        @Nullable
        private final String id;

        @NotNull
        private final ActionType type;

        public BannerAction(@NotNull String __typename, @NotNull ActionType type, @NotNull String action, @Nullable Analytics1 analytics1, @Nullable String str) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(type, "type");
            Intrinsics.h(action, "action");
            this.__typename = __typename;
            this.type = type;
            this.action = action;
            this.analytics = analytics1;
            this.id = str;
        }

        public static /* synthetic */ BannerAction copy$default(BannerAction bannerAction, String str, ActionType actionType, String str2, Analytics1 analytics1, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bannerAction.__typename;
            }
            if ((i & 2) != 0) {
                actionType = bannerAction.type;
            }
            if ((i & 4) != 0) {
                str2 = bannerAction.action;
            }
            if ((i & 8) != 0) {
                analytics1 = bannerAction.analytics;
            }
            if ((i & 16) != 0) {
                str3 = bannerAction.id;
            }
            String str4 = str3;
            String str5 = str2;
            return bannerAction.copy(str, actionType, str5, analytics1, str4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ActionType getType() {
            return this.type;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final Analytics1 getAnalytics() {
            return this.analytics;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final BannerAction copy(@NotNull String __typename, @NotNull ActionType type, @NotNull String action, @Nullable Analytics1 analytics, @Nullable String id) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(type, "type");
            Intrinsics.h(action, "action");
            return new BannerAction(__typename, type, action, analytics, id);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BannerAction)) {
                return false;
            }
            BannerAction bannerAction = (BannerAction) other;
            return Intrinsics.c(this.__typename, bannerAction.__typename) && this.type == bannerAction.type && Intrinsics.c(this.action, bannerAction.action) && Intrinsics.c(this.analytics, bannerAction.analytics) && Intrinsics.c(this.id, bannerAction.id);
        }

        @NotNull
        public final String getAction() {
            return this.action;
        }

        @Nullable
        public final Analytics1 getAnalytics() {
            return this.analytics;
        }

        @Nullable
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final ActionType getType() {
            return this.type;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int iC = b.c(d.a(this.type, this.__typename.hashCode() * 31, 31), 31, this.action);
            Analytics1 analytics1 = this.analytics;
            int iHashCode = (iC + (analytics1 == null ? 0 : analytics1.hashCode())) * 31;
            String str = this.id;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.__typename;
            ActionType actionType = this.type;
            String str2 = this.action;
            Analytics1 analytics1 = this.analytics;
            String str3 = this.id;
            StringBuilder sbW = d.w("BannerAction(__typename=", str, ", type=", actionType, ", action=");
            sbW.append(str2);
            sbW.append(", analytics=");
            sbW.append(analytics1);
            sbW.append(", id=");
            return YU.a.o(sbW, str3, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006 "}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$BannerAction1;", "", "__typename", "", "type", "Lau/com/woolworths/shop/graphql/type/ActionType;", UrlHandler.ACTION, "analytics", "Lcom/woolworths/product/list/legacy/ProductListQuery$Analytics2;", "id", "<init>", "(Ljava/lang/String;Lau/com/woolworths/shop/graphql/type/ActionType;Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductListQuery$Analytics2;Ljava/lang/String;)V", "get__typename", "()Ljava/lang/String;", "getType", "()Lau/com/woolworths/shop/graphql/type/ActionType;", "getAction", "getAnalytics", "()Lcom/woolworths/product/list/legacy/ProductListQuery$Analytics2;", "getId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BannerAction1 {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final String action;

        @Nullable
        private final Analytics2 analytics;

        @Nullable
        private final String id;

        @NotNull
        private final ActionType type;

        public BannerAction1(@NotNull String __typename, @NotNull ActionType type, @NotNull String action, @Nullable Analytics2 analytics2, @Nullable String str) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(type, "type");
            Intrinsics.h(action, "action");
            this.__typename = __typename;
            this.type = type;
            this.action = action;
            this.analytics = analytics2;
            this.id = str;
        }

        public static /* synthetic */ BannerAction1 copy$default(BannerAction1 bannerAction1, String str, ActionType actionType, String str2, Analytics2 analytics2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bannerAction1.__typename;
            }
            if ((i & 2) != 0) {
                actionType = bannerAction1.type;
            }
            if ((i & 4) != 0) {
                str2 = bannerAction1.action;
            }
            if ((i & 8) != 0) {
                analytics2 = bannerAction1.analytics;
            }
            if ((i & 16) != 0) {
                str3 = bannerAction1.id;
            }
            String str4 = str3;
            String str5 = str2;
            return bannerAction1.copy(str, actionType, str5, analytics2, str4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ActionType getType() {
            return this.type;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final Analytics2 getAnalytics() {
            return this.analytics;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final BannerAction1 copy(@NotNull String __typename, @NotNull ActionType type, @NotNull String action, @Nullable Analytics2 analytics, @Nullable String id) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(type, "type");
            Intrinsics.h(action, "action");
            return new BannerAction1(__typename, type, action, analytics, id);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BannerAction1)) {
                return false;
            }
            BannerAction1 bannerAction1 = (BannerAction1) other;
            return Intrinsics.c(this.__typename, bannerAction1.__typename) && this.type == bannerAction1.type && Intrinsics.c(this.action, bannerAction1.action) && Intrinsics.c(this.analytics, bannerAction1.analytics) && Intrinsics.c(this.id, bannerAction1.id);
        }

        @NotNull
        public final String getAction() {
            return this.action;
        }

        @Nullable
        public final Analytics2 getAnalytics() {
            return this.analytics;
        }

        @Nullable
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final ActionType getType() {
            return this.type;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int iC = b.c(d.a(this.type, this.__typename.hashCode() * 31, 31), 31, this.action);
            Analytics2 analytics2 = this.analytics;
            int iHashCode = (iC + (analytics2 == null ? 0 : analytics2.hashCode())) * 31;
            String str = this.id;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.__typename;
            ActionType actionType = this.type;
            String str2 = this.action;
            Analytics2 analytics2 = this.analytics;
            String str3 = this.id;
            StringBuilder sbW = d.w("BannerAction1(__typename=", str, ", type=", actionType, ", action=");
            sbW.append(str2);
            sbW.append(", analytics=");
            sbW.append(analytics2);
            sbW.append(", id=");
            return YU.a.o(sbW, str3, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$BannerAnalytics;", "", "__typename", "", "analyticsFields", "Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;)V", "get__typename", "()Ljava/lang/String;", "getAnalyticsFields", "()Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BannerAnalytics {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final AnalyticsFields analyticsFields;

        public BannerAnalytics(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            this.__typename = __typename;
            this.analyticsFields = analyticsFields;
        }

        public static /* synthetic */ BannerAnalytics copy$default(BannerAnalytics bannerAnalytics, String str, AnalyticsFields analyticsFields, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bannerAnalytics.__typename;
            }
            if ((i & 2) != 0) {
                analyticsFields = bannerAnalytics.analyticsFields;
            }
            return bannerAnalytics.copy(str, analyticsFields);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final BannerAnalytics copy(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            return new BannerAnalytics(__typename, analyticsFields);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BannerAnalytics)) {
                return false;
            }
            BannerAnalytics bannerAnalytics = (BannerAnalytics) other;
            return Intrinsics.c(this.__typename, bannerAnalytics.__typename) && Intrinsics.c(this.analyticsFields, bannerAnalytics.analyticsFields);
        }

        @NotNull
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.analyticsFields.hashCode() + (this.__typename.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return d.p("BannerAnalytics(__typename=", this.__typename, ", analyticsFields=", this.analyticsFields, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$BannerAnalytics1;", "", "__typename", "", "analyticsFields", "Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;)V", "get__typename", "()Ljava/lang/String;", "getAnalyticsFields", "()Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BannerAnalytics1 {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final AnalyticsFields analyticsFields;

        public BannerAnalytics1(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            this.__typename = __typename;
            this.analyticsFields = analyticsFields;
        }

        public static /* synthetic */ BannerAnalytics1 copy$default(BannerAnalytics1 bannerAnalytics1, String str, AnalyticsFields analyticsFields, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bannerAnalytics1.__typename;
            }
            if ((i & 2) != 0) {
                analyticsFields = bannerAnalytics1.analyticsFields;
            }
            return bannerAnalytics1.copy(str, analyticsFields);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final BannerAnalytics1 copy(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            return new BannerAnalytics1(__typename, analyticsFields);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BannerAnalytics1)) {
                return false;
            }
            BannerAnalytics1 bannerAnalytics1 = (BannerAnalytics1) other;
            return Intrinsics.c(this.__typename, bannerAnalytics1.__typename) && Intrinsics.c(this.analyticsFields, bannerAnalytics1.analyticsFields);
        }

        @NotNull
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.analyticsFields.hashCode() + (this.__typename.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return d.p("BannerAnalytics1(__typename=", this.__typename, ", analyticsFields=", this.analyticsFields, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006 "}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$BannerButtonAction;", "", "__typename", "", "type", "Lau/com/woolworths/shop/graphql/type/ActionType;", UrlHandler.ACTION, "analytics", "Lcom/woolworths/product/list/legacy/ProductListQuery$Analytics;", "id", "<init>", "(Ljava/lang/String;Lau/com/woolworths/shop/graphql/type/ActionType;Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductListQuery$Analytics;Ljava/lang/String;)V", "get__typename", "()Ljava/lang/String;", "getType", "()Lau/com/woolworths/shop/graphql/type/ActionType;", "getAction", "getAnalytics", "()Lcom/woolworths/product/list/legacy/ProductListQuery$Analytics;", "getId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BannerButtonAction {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final String action;

        @Nullable
        private final Analytics analytics;

        @Nullable
        private final String id;

        @NotNull
        private final ActionType type;

        public BannerButtonAction(@NotNull String __typename, @NotNull ActionType type, @NotNull String action, @Nullable Analytics analytics, @Nullable String str) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(type, "type");
            Intrinsics.h(action, "action");
            this.__typename = __typename;
            this.type = type;
            this.action = action;
            this.analytics = analytics;
            this.id = str;
        }

        public static /* synthetic */ BannerButtonAction copy$default(BannerButtonAction bannerButtonAction, String str, ActionType actionType, String str2, Analytics analytics, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bannerButtonAction.__typename;
            }
            if ((i & 2) != 0) {
                actionType = bannerButtonAction.type;
            }
            if ((i & 4) != 0) {
                str2 = bannerButtonAction.action;
            }
            if ((i & 8) != 0) {
                analytics = bannerButtonAction.analytics;
            }
            if ((i & 16) != 0) {
                str3 = bannerButtonAction.id;
            }
            String str4 = str3;
            String str5 = str2;
            return bannerButtonAction.copy(str, actionType, str5, analytics, str4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ActionType getType() {
            return this.type;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final Analytics getAnalytics() {
            return this.analytics;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final BannerButtonAction copy(@NotNull String __typename, @NotNull ActionType type, @NotNull String action, @Nullable Analytics analytics, @Nullable String id) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(type, "type");
            Intrinsics.h(action, "action");
            return new BannerButtonAction(__typename, type, action, analytics, id);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BannerButtonAction)) {
                return false;
            }
            BannerButtonAction bannerButtonAction = (BannerButtonAction) other;
            return Intrinsics.c(this.__typename, bannerButtonAction.__typename) && this.type == bannerButtonAction.type && Intrinsics.c(this.action, bannerButtonAction.action) && Intrinsics.c(this.analytics, bannerButtonAction.analytics) && Intrinsics.c(this.id, bannerButtonAction.id);
        }

        @NotNull
        public final String getAction() {
            return this.action;
        }

        @Nullable
        public final Analytics getAnalytics() {
            return this.analytics;
        }

        @Nullable
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final ActionType getType() {
            return this.type;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int iC = b.c(d.a(this.type, this.__typename.hashCode() * 31, 31), 31, this.action);
            Analytics analytics = this.analytics;
            int iHashCode = (iC + (analytics == null ? 0 : analytics.hashCode())) * 31;
            String str = this.id;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.__typename;
            ActionType actionType = this.type;
            String str2 = this.action;
            Analytics analytics = this.analytics;
            String str3 = this.id;
            StringBuilder sbW = d.w("BannerButtonAction(__typename=", str, ", type=", actionType, ", action=");
            sbW.append(str2);
            sbW.append(", analytics=");
            sbW.append(analytics);
            sbW.append(", id=");
            return YU.a.o(sbW, str3, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$BannerButtonLabel;", "", "__typename", "", TextBundle.TEXT_ENTRY, "altText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "get__typename", "()Ljava/lang/String;", "getText", "getAltText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BannerButtonLabel {
        public static final int $stable = 0;

        @NotNull
        private final String __typename;

        @NotNull
        private final String altText;

        @NotNull
        private final String text;

        public BannerButtonLabel(@NotNull String __typename, @NotNull String text, @NotNull String altText) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(text, "text");
            Intrinsics.h(altText, "altText");
            this.__typename = __typename;
            this.text = text;
            this.altText = altText;
        }

        public static /* synthetic */ BannerButtonLabel copy$default(BannerButtonLabel bannerButtonLabel, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bannerButtonLabel.__typename;
            }
            if ((i & 2) != 0) {
                str2 = bannerButtonLabel.text;
            }
            if ((i & 4) != 0) {
                str3 = bannerButtonLabel.altText;
            }
            return bannerButtonLabel.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
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
        public final BannerButtonLabel copy(@NotNull String __typename, @NotNull String text, @NotNull String altText) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(text, "text");
            Intrinsics.h(altText, "altText");
            return new BannerButtonLabel(__typename, text, altText);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BannerButtonLabel)) {
                return false;
            }
            BannerButtonLabel bannerButtonLabel = (BannerButtonLabel) other;
            return Intrinsics.c(this.__typename, bannerButtonLabel.__typename) && Intrinsics.c(this.text, bannerButtonLabel.text) && Intrinsics.c(this.altText, bannerButtonLabel.altText);
        }

        @NotNull
        public final String getAltText() {
            return this.altText;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.altText.hashCode() + b.c(this.__typename.hashCode() * 31, 31, this.text);
        }

        @NotNull
        public String toString() {
            String str = this.__typename;
            String str2 = this.text;
            return YU.a.o(YU.a.v("BannerButtonLabel(__typename=", str, ", text=", str2, ", altText="), this.altText, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$BannerImage;", "", "__typename", "", "imageUrl", "altText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "get__typename", "()Ljava/lang/String;", "getImageUrl", "getAltText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BannerImage {
        public static final int $stable = 0;

        @NotNull
        private final String __typename;

        @NotNull
        private final String altText;

        @NotNull
        private final String imageUrl;

        public BannerImage(@NotNull String __typename, @NotNull String imageUrl, @NotNull String altText) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(imageUrl, "imageUrl");
            Intrinsics.h(altText, "altText");
            this.__typename = __typename;
            this.imageUrl = imageUrl;
            this.altText = altText;
        }

        public static /* synthetic */ BannerImage copy$default(BannerImage bannerImage, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bannerImage.__typename;
            }
            if ((i & 2) != 0) {
                str2 = bannerImage.imageUrl;
            }
            if ((i & 4) != 0) {
                str3 = bannerImage.altText;
            }
            return bannerImage.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getAltText() {
            return this.altText;
        }

        @NotNull
        public final BannerImage copy(@NotNull String __typename, @NotNull String imageUrl, @NotNull String altText) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(imageUrl, "imageUrl");
            Intrinsics.h(altText, "altText");
            return new BannerImage(__typename, imageUrl, altText);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BannerImage)) {
                return false;
            }
            BannerImage bannerImage = (BannerImage) other;
            return Intrinsics.c(this.__typename, bannerImage.__typename) && Intrinsics.c(this.imageUrl, bannerImage.imageUrl) && Intrinsics.c(this.altText, bannerImage.altText);
        }

        @NotNull
        public final String getAltText() {
            return this.altText;
        }

        @NotNull
        public final String getImageUrl() {
            return this.imageUrl;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.altText.hashCode() + b.c(this.__typename.hashCode() * 31, 31, this.imageUrl);
        }

        @NotNull
        public String toString() {
            String str = this.__typename;
            String str2 = this.imageUrl;
            return YU.a.o(YU.a.v("BannerImage(__typename=", str, ", imageUrl=", str2, ", altText="), this.altText, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$BannerImpressionAnalytics;", "", "__typename", "", "analyticsFields", "Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;)V", "get__typename", "()Ljava/lang/String;", "getAnalyticsFields", "()Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BannerImpressionAnalytics {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final AnalyticsFields analyticsFields;

        public BannerImpressionAnalytics(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            this.__typename = __typename;
            this.analyticsFields = analyticsFields;
        }

        public static /* synthetic */ BannerImpressionAnalytics copy$default(BannerImpressionAnalytics bannerImpressionAnalytics, String str, AnalyticsFields analyticsFields, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bannerImpressionAnalytics.__typename;
            }
            if ((i & 2) != 0) {
                analyticsFields = bannerImpressionAnalytics.analyticsFields;
            }
            return bannerImpressionAnalytics.copy(str, analyticsFields);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final BannerImpressionAnalytics copy(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            return new BannerImpressionAnalytics(__typename, analyticsFields);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BannerImpressionAnalytics)) {
                return false;
            }
            BannerImpressionAnalytics bannerImpressionAnalytics = (BannerImpressionAnalytics) other;
            return Intrinsics.c(this.__typename, bannerImpressionAnalytics.__typename) && Intrinsics.c(this.analyticsFields, bannerImpressionAnalytics.analyticsFields);
        }

        @NotNull
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.analyticsFields.hashCode() + (this.__typename.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return d.p("BannerImpressionAnalytics(__typename=", this.__typename, ", analyticsFields=", this.analyticsFields, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$BannerImpressionAnalytics1;", "", "__typename", "", "analyticsFields", "Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;)V", "get__typename", "()Ljava/lang/String;", "getAnalyticsFields", "()Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BannerImpressionAnalytics1 {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final AnalyticsFields analyticsFields;

        public BannerImpressionAnalytics1(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            this.__typename = __typename;
            this.analyticsFields = analyticsFields;
        }

        public static /* synthetic */ BannerImpressionAnalytics1 copy$default(BannerImpressionAnalytics1 bannerImpressionAnalytics1, String str, AnalyticsFields analyticsFields, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bannerImpressionAnalytics1.__typename;
            }
            if ((i & 2) != 0) {
                analyticsFields = bannerImpressionAnalytics1.analyticsFields;
            }
            return bannerImpressionAnalytics1.copy(str, analyticsFields);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final BannerImpressionAnalytics1 copy(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            return new BannerImpressionAnalytics1(__typename, analyticsFields);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BannerImpressionAnalytics1)) {
                return false;
            }
            BannerImpressionAnalytics1 bannerImpressionAnalytics1 = (BannerImpressionAnalytics1) other;
            return Intrinsics.c(this.__typename, bannerImpressionAnalytics1.__typename) && Intrinsics.c(this.analyticsFields, bannerImpressionAnalytics1.analyticsFields);
        }

        @NotNull
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.analyticsFields.hashCode() + (this.__typename.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return d.p("BannerImpressionAnalytics1(__typename=", this.__typename, ", analyticsFields=", this.analyticsFields, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$ButtonAction;", "", "__typename", "", "type", "Lau/com/woolworths/shop/graphql/type/ActionType;", UrlHandler.ACTION, "id", "<init>", "(Ljava/lang/String;Lau/com/woolworths/shop/graphql/type/ActionType;Ljava/lang/String;Ljava/lang/String;)V", "get__typename", "()Ljava/lang/String;", "getType", "()Lau/com/woolworths/shop/graphql/type/ActionType;", "getAction", "getId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ButtonAction {
        public static final int $stable = 0;

        @NotNull
        private final String __typename;

        @NotNull
        private final String action;

        @Nullable
        private final String id;

        @NotNull
        private final ActionType type;

        public ButtonAction(@NotNull String __typename, @NotNull ActionType type, @NotNull String action, @Nullable String str) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(type, "type");
            Intrinsics.h(action, "action");
            this.__typename = __typename;
            this.type = type;
            this.action = action;
            this.id = str;
        }

        public static /* synthetic */ ButtonAction copy$default(ButtonAction buttonAction, String str, ActionType actionType, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = buttonAction.__typename;
            }
            if ((i & 2) != 0) {
                actionType = buttonAction.type;
            }
            if ((i & 4) != 0) {
                str2 = buttonAction.action;
            }
            if ((i & 8) != 0) {
                str3 = buttonAction.id;
            }
            return buttonAction.copy(str, actionType, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ActionType getType() {
            return this.type;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final ButtonAction copy(@NotNull String __typename, @NotNull ActionType type, @NotNull String action, @Nullable String id) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(type, "type");
            Intrinsics.h(action, "action");
            return new ButtonAction(__typename, type, action, id);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonAction)) {
                return false;
            }
            ButtonAction buttonAction = (ButtonAction) other;
            return Intrinsics.c(this.__typename, buttonAction.__typename) && this.type == buttonAction.type && Intrinsics.c(this.action, buttonAction.action) && Intrinsics.c(this.id, buttonAction.id);
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

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int iC = b.c(d.a(this.type, this.__typename.hashCode() * 31, 31), 31, this.action);
            String str = this.id;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.__typename;
            ActionType actionType = this.type;
            return a.l(d.w("ButtonAction(__typename=", str, ", type=", actionType, ", action="), this.action, ", id=", this.id, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J?\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$ButtonAction1;", "", "__typename", "", "type", "Lau/com/woolworths/shop/graphql/type/ActionType;", UrlHandler.ACTION, "id", "analytics", "Lcom/woolworths/product/list/legacy/ProductListQuery$Analytics4;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/shop/graphql/type/ActionType;Ljava/lang/String;Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductListQuery$Analytics4;)V", "get__typename", "()Ljava/lang/String;", "getType", "()Lau/com/woolworths/shop/graphql/type/ActionType;", "getAction", "getId", "getAnalytics", "()Lcom/woolworths/product/list/legacy/ProductListQuery$Analytics4;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ButtonAction1 {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final String action;

        @Nullable
        private final Analytics4 analytics;

        @Nullable
        private final String id;

        @NotNull
        private final ActionType type;

        public ButtonAction1(@NotNull String __typename, @NotNull ActionType type, @NotNull String action, @Nullable String str, @Nullable Analytics4 analytics4) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(type, "type");
            Intrinsics.h(action, "action");
            this.__typename = __typename;
            this.type = type;
            this.action = action;
            this.id = str;
            this.analytics = analytics4;
        }

        public static /* synthetic */ ButtonAction1 copy$default(ButtonAction1 buttonAction1, String str, ActionType actionType, String str2, String str3, Analytics4 analytics4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = buttonAction1.__typename;
            }
            if ((i & 2) != 0) {
                actionType = buttonAction1.type;
            }
            if ((i & 4) != 0) {
                str2 = buttonAction1.action;
            }
            if ((i & 8) != 0) {
                str3 = buttonAction1.id;
            }
            if ((i & 16) != 0) {
                analytics4 = buttonAction1.analytics;
            }
            Analytics4 analytics42 = analytics4;
            String str4 = str2;
            return buttonAction1.copy(str, actionType, str4, str3, analytics42);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ActionType getType() {
            return this.type;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final Analytics4 getAnalytics() {
            return this.analytics;
        }

        @NotNull
        public final ButtonAction1 copy(@NotNull String __typename, @NotNull ActionType type, @NotNull String action, @Nullable String id, @Nullable Analytics4 analytics) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(type, "type");
            Intrinsics.h(action, "action");
            return new ButtonAction1(__typename, type, action, id, analytics);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonAction1)) {
                return false;
            }
            ButtonAction1 buttonAction1 = (ButtonAction1) other;
            return Intrinsics.c(this.__typename, buttonAction1.__typename) && this.type == buttonAction1.type && Intrinsics.c(this.action, buttonAction1.action) && Intrinsics.c(this.id, buttonAction1.id) && Intrinsics.c(this.analytics, buttonAction1.analytics);
        }

        @NotNull
        public final String getAction() {
            return this.action;
        }

        @Nullable
        public final Analytics4 getAnalytics() {
            return this.analytics;
        }

        @Nullable
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final ActionType getType() {
            return this.type;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int iC = b.c(d.a(this.type, this.__typename.hashCode() * 31, 31), 31, this.action);
            String str = this.id;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            Analytics4 analytics4 = this.analytics;
            return iHashCode + (analytics4 != null ? analytics4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.__typename;
            ActionType actionType = this.type;
            String str2 = this.action;
            String str3 = this.id;
            Analytics4 analytics4 = this.analytics;
            StringBuilder sbW = d.w("ButtonAction1(__typename=", str, ", type=", actionType, ", action=");
            a.B(sbW, str2, ", id=", str3, ", analytics=");
            sbW.append(analytics4);
            sbW.append(")");
            return sbW.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$ButtonCta;", "", AnnotatedPrivateKey.LABEL, "", "<init>", "(Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ButtonCta {
        public static final int $stable = 0;

        @NotNull
        private final String label;

        public ButtonCta(@NotNull String label) {
            Intrinsics.h(label, "label");
            this.label = label;
        }

        public static /* synthetic */ ButtonCta copy$default(ButtonCta buttonCta, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = buttonCta.label;
            }
            return buttonCta.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        public final ButtonCta copy(@NotNull String label) {
            Intrinsics.h(label, "label");
            return new ButtonCta(label);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ButtonCta) && Intrinsics.c(this.label, ((ButtonCta) other).label);
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
            return YU.a.h("ButtonCta(label=", this.label, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$Chip;", "", "id", "", "isSelected", "", TextBundle.TEXT_ENTRY, "Lcom/woolworths/product/list/legacy/ProductListQuery$Text;", "persistentId", "<init>", "(Ljava/lang/String;ZLcom/woolworths/product/list/legacy/ProductListQuery$Text;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "()Z", "getText", "()Lcom/woolworths/product/list/legacy/ProductListQuery$Text;", "getPersistentId", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Chip {
        public static final int $stable = 0;

        @NotNull
        private final String id;
        private final boolean isSelected;

        @Nullable
        private final String persistentId;

        @NotNull
        private final Text text;

        public Chip(@NotNull String id, boolean z, @NotNull Text text, @Nullable String str) {
            Intrinsics.h(id, "id");
            Intrinsics.h(text, "text");
            this.id = id;
            this.isSelected = z;
            this.text = text;
            this.persistentId = str;
        }

        public static /* synthetic */ Chip copy$default(Chip chip, String str, boolean z, Text text, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = chip.id;
            }
            if ((i & 2) != 0) {
                z = chip.isSelected;
            }
            if ((i & 4) != 0) {
                text = chip.text;
            }
            if ((i & 8) != 0) {
                str2 = chip.persistentId;
            }
            return chip.copy(str, z, text, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Text getText() {
            return this.text;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getPersistentId() {
            return this.persistentId;
        }

        @NotNull
        public final Chip copy(@NotNull String id, boolean isSelected, @NotNull Text text, @Nullable String persistentId) {
            Intrinsics.h(id, "id");
            Intrinsics.h(text, "text");
            return new Chip(id, isSelected, text, persistentId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Chip)) {
                return false;
            }
            Chip chip = (Chip) other;
            return Intrinsics.c(this.id, chip.id) && this.isSelected == chip.isSelected && Intrinsics.c(this.text, chip.text) && Intrinsics.c(this.persistentId, chip.persistentId);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @Nullable
        public final String getPersistentId() {
            return this.persistentId;
        }

        @NotNull
        public final Text getText() {
            return this.text;
        }

        public int hashCode() {
            int iHashCode = (this.text.hashCode() + b.e(this.id.hashCode() * 31, 31, this.isSelected)) * 31;
            String str = this.persistentId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            String str = this.id;
            boolean z = this.isSelected;
            Text text = this.text;
            String str2 = this.persistentId;
            StringBuilder sbQ = a.q("Chip(id=", str, ", isSelected=", ", text=", z);
            sbQ.append(text);
            sbQ.append(", persistentId=");
            sbQ.append(str2);
            sbQ.append(")");
            return sbQ.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$CommonAnalytics;", "", "__typename", "", "analyticsFields", "Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;)V", "get__typename", "()Ljava/lang/String;", "getAnalyticsFields", "()Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CommonAnalytics {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final AnalyticsFields analyticsFields;

        public CommonAnalytics(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            this.__typename = __typename;
            this.analyticsFields = analyticsFields;
        }

        public static /* synthetic */ CommonAnalytics copy$default(CommonAnalytics commonAnalytics, String str, AnalyticsFields analyticsFields, int i, Object obj) {
            if ((i & 1) != 0) {
                str = commonAnalytics.__typename;
            }
            if ((i & 2) != 0) {
                analyticsFields = commonAnalytics.analyticsFields;
            }
            return commonAnalytics.copy(str, analyticsFields);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final CommonAnalytics copy(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            return new CommonAnalytics(__typename, analyticsFields);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CommonAnalytics)) {
                return false;
            }
            CommonAnalytics commonAnalytics = (CommonAnalytics) other;
            return Intrinsics.c(this.__typename, commonAnalytics.__typename) && Intrinsics.c(this.analyticsFields, commonAnalytics.analyticsFields);
        }

        @NotNull
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.analyticsFields.hashCode() + (this.__typename.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return d.p("CommonAnalytics(__typename=", this.__typename, ", analyticsFields=", this.analyticsFields, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$Companion;", "", "<init>", "()V", "OPERATION_ID", "", "OPERATION_DOCUMENT", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_NAME", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getOPERATION_DOCUMENT() {
            return "query productList($productListInput: ProductListInput!, $includeProductAvailabilityStates: Boolean!, $includeOfferMinimumSpend: Boolean!, $includeAvailabilityInfoStatus: Boolean! = false , $includeUnitPriceInsetBanner: Boolean!, $includeUniversalInventoryFallback: Boolean!, $includeZeroResultPage: Boolean!, $includeVideoAdUnit: Boolean!, $includeMerchCard: Boolean!, $includeHorizontalList: Boolean!, $includePricingFootnote: Boolean! = false , $includeNhpEdrBanner: Boolean! = false , $includeNhpPersonalisedProductsBanner: Boolean! = false , $includeProductListPersistentChip: Boolean!, $includeLowestPrice14Days: Boolean!) { productList(productListInput: $productListInput) { totalNumberOfProducts nextPage pageTitle analytics { __typename ... on AdobeTargetAnalytics { tnta pe } } productsFeed { __typename ... on ActionableCard { image altText cardHeight link analytics _excluded } ... on GoogleAdBannerCard @skip(if: $includeUniversalInventoryFallback) { adUnit nativeCustomTemplateId targeting iabSize correlator } ... on UniversalInventoryContainer @include(if: $includeUniversalInventoryFallback) { googleAdBannerCard { adUnit nativeCustomTemplateId iabSpec iabSize height targeting correlator _excluded } nextBestAction { __typename ... on ActionableCard { __typename link image altText cardHeight analytics _excluded } ... on EdrOfferBanner @include(if: $includeNhpEdrBanner) { __typename offerId offerIdV1 linkedEdrHashCrn bannerTitle bannerDescription bannerIconUrl bannerButtonAction { __typename type action analytics { __typename ...analyticsFields } id } bannerButtonLabel { __typename text altText } bannerAction { __typename type action analytics { __typename ...analyticsFields } id } bannerAnalytics { __typename ...analyticsFields } bannerImpressionAnalytics { __typename ...analyticsFields } commonAnalytics { __typename ...analyticsFields } } ... on PersonalisedProductsBanner @include(if: $includeNhpPersonalisedProductsBanner) { __typename bannerTitle bannerForegroundColour bannerBackgroundColour bannerImage { __typename imageUrl altText } products { __typename productId name productImage } bannerAction { __typename type action analytics { __typename ...analyticsFields } id } bannerAnalytics { __typename ...analyticsFields } bannerImpressionAnalytics { __typename ...analyticsFields } } } } ... on HorizontalList @include(if: $includeHorizontalList) { __typename title subtitle actionTitle deepLink items { __typename ... on ProductCard { __typename ...productCard } ... on MerchCardFullImage { __typename merchCardFullImageAction { __typename type action } merchCardFullImageBackgroundImageWithAlt { __typename imageUrl altText } merchCardFullImageButton { __typename buttonId label style enabled iconUrl altText buttonAction { __typename type action id } } merchCardFullImageTitle merchCardFullImageDescription } } } ... on VideoAdUnit @include(if: $includeVideoAdUnit) { __typename videoAdUnitVideoAd { __typename url fallbackImage { imageUrl altText } duration transcript { __typename ...videoAdBottomSheet } termsAndConditions { __typename ...videoAdBottomSheet } analytics { __typename ...analyticsFields } eventAnalytics { impression { __typename ...analyticsFields } videoPlay { __typename ...analyticsFields } videoPause { __typename ...analyticsFields } videoErrorImpression { __typename ...analyticsFields } } } videoAdUnitProductCard { __typename ...productCard } } ... on MerchCard @include(if: $includeMerchCard) { __typename merchCardGridImageWithAlt { __typename imageUrl altText } merchCardListImageWithAlt { __typename imageUrl altText } merchCardTitle merchCardDescription merchCardButton { __typename buttonId label style enabled iconUrl altText buttonAction { __typename type action id analytics { __typename ...analyticsFields } } } merchCardAction { __typename type action id analytics { __typename ...analyticsFields } } merchCardAnalytics { __typename ...analyticsFields } merchCardImpressionAnalytics { __typename ...analyticsFields } } ... on InsetBanner { displayType message bannerTitle: title iconUrl action { placement type label url } } ... on ProductCard { __typename ...productCard } } filters { headerKey headerTitle filterItems { key title label parentKey hasChildren isApplied } banner { displayType message iconUrl action { placement type label url } bannerTitle: title } } sortOptions { key title subtitle isApplied } sortOptionsBanner @include(if: $includeUnitPriceInsetBanner) { __typename ...insetBanner } marketplaceFilterSwitch { title subtitle imageUrl buttonCta { label } value } marketplaceInfo { title items { title description imageUrl } footer { title subtitle linkUrl } } marketplaceBottomSheet { bottomSheetTitle bottomSheetBody primaryCta { label } secondaryCta { label } showOnceOnly } chips { id isSelected text { text altText } persistentId @include(if: $includeProductListPersistentChip) } facetChips { id isSelected text { text altText } } zeroResultContent @skip(if: $includeProductListPersistentChip) { title message items { __typename ... on ZeroResultProductCategories { zeroResultProductCategoriesTitle zeroResultProductCategoriesItems { productCategoryTileAction { type action id } productCategoryTileImageUrl productCategoryTileLabel } } ... on HorizontalList { title items { __typename ... on ProductCard { __typename ...productCard } } } } } zeroResult @include(if: $includeProductListPersistentChip) { __typename ... on ProductListZeroResult { title message items { __typename ... on ZeroResultProductCategories { zeroResultProductCategoriesTitle zeroResultProductCategoriesItems { productCategoryTileAction { type action id } productCategoryTileImageUrl productCategoryTileLabel } } ... on HorizontalList { title items { __typename ... on ProductCard { __typename ...productCard } } } } } ... on ProductListFullScreenError { analytics { __typename ...analyticsFields } impressionAnalytics { __typename ...analyticsFields } image title description cta { linkId linkTextWithAlt { text altText } linkAction { action id type analytics { __typename ...analyticsFields } } } } } } }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment productTrolley on ProductTrolley { minimum maximum increment defaultValue: default unit inTrolley buttonState buttonLabel buttonQuantity title }  fragment productCard on ProductCard { productId name isNew purchaseRestriction productImage isAvailable inStoreAvailabilityInfo @include(if: $includeProductAvailabilityStates) { button { label action style enabled } status @include(if: $includeAvailabilityInfoStatus) infoSheet { title message button { label action style enabled } } } price unitOfMeasureLabel badgeImage promotionInfo { type label } unitPriceDescription wasPrice purchaseWarning inlineLabels { type label priority } trolley { __typename ...productTrolley } trolleys { __typename ...productTrolley } list { minimum maximum increment defaultValue: default unit } inStoreDetails { locationText locationType } inStoreLocation { details { aisleNumber aisleSide bayNumber bayNumberAlternate floorNumber location x y z } displayInfo { locationText locationType } } adId source marketplace { imageUrl title sellerName brandName lowestMarketPriceDescription @include(if: $includeLowestPrice14Days) } rewardsOfferInfo { offerId offerStatus displayStatus displayExpiry minimumSpend @include(if: $includeOfferMinimumSpend) offerAnalytics { offerName campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode } boostButton { label style enabled } } disclaimer tagLabel { text style } productVarieties { totalCount label priceFamilyId } categories { name categoryLevel } isTobacco memberPriceInfo { header title subtitle } multiBuyPriceInfo { price unitPrice } cartProductInfo { totalPrice totalOriginalPrice totalDiscount } productCardAnalytics { __typename ...analyticsFields } productCardAction { action type id analytics { __typename ...analyticsFields } } pricingFootnoteMd @include(if: $includePricingFootnote) }  fragment videoAdBottomSheet on VideoAdBottomSheet { __typename contentMarkdown title buttonText accessibilityText impressionAnalytics { __typename ...analyticsFields } }  fragment insetBanner on InsetBanner { displayType message bannerTitle: title iconUrl action { placement type label url } }";
        }

        private Companion() {
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$Cta;", "", "linkId", "", "linkTextWithAlt", "Lcom/woolworths/product/list/legacy/ProductListQuery$LinkTextWithAlt;", "linkAction", "Lcom/woolworths/product/list/legacy/ProductListQuery$LinkAction;", "<init>", "(Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductListQuery$LinkTextWithAlt;Lcom/woolworths/product/list/legacy/ProductListQuery$LinkAction;)V", "getLinkId", "()Ljava/lang/String;", "getLinkTextWithAlt", "()Lcom/woolworths/product/list/legacy/ProductListQuery$LinkTextWithAlt;", "getLinkAction", "()Lcom/woolworths/product/list/legacy/ProductListQuery$LinkAction;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Cta {
        public static final int $stable = 8;

        @NotNull
        private final LinkAction linkAction;

        @Nullable
        private final String linkId;

        @NotNull
        private final LinkTextWithAlt linkTextWithAlt;

        public Cta(@Nullable String str, @NotNull LinkTextWithAlt linkTextWithAlt, @NotNull LinkAction linkAction) {
            Intrinsics.h(linkTextWithAlt, "linkTextWithAlt");
            Intrinsics.h(linkAction, "linkAction");
            this.linkId = str;
            this.linkTextWithAlt = linkTextWithAlt;
            this.linkAction = linkAction;
        }

        public static /* synthetic */ Cta copy$default(Cta cta, String str, LinkTextWithAlt linkTextWithAlt, LinkAction linkAction, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cta.linkId;
            }
            if ((i & 2) != 0) {
                linkTextWithAlt = cta.linkTextWithAlt;
            }
            if ((i & 4) != 0) {
                linkAction = cta.linkAction;
            }
            return cta.copy(str, linkTextWithAlt, linkAction);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getLinkId() {
            return this.linkId;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final LinkTextWithAlt getLinkTextWithAlt() {
            return this.linkTextWithAlt;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final LinkAction getLinkAction() {
            return this.linkAction;
        }

        @NotNull
        public final Cta copy(@Nullable String linkId, @NotNull LinkTextWithAlt linkTextWithAlt, @NotNull LinkAction linkAction) {
            Intrinsics.h(linkTextWithAlt, "linkTextWithAlt");
            Intrinsics.h(linkAction, "linkAction");
            return new Cta(linkId, linkTextWithAlt, linkAction);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Cta)) {
                return false;
            }
            Cta cta = (Cta) other;
            return Intrinsics.c(this.linkId, cta.linkId) && Intrinsics.c(this.linkTextWithAlt, cta.linkTextWithAlt) && Intrinsics.c(this.linkAction, cta.linkAction);
        }

        @NotNull
        public final LinkAction getLinkAction() {
            return this.linkAction;
        }

        @Nullable
        public final String getLinkId() {
            return this.linkId;
        }

        @NotNull
        public final LinkTextWithAlt getLinkTextWithAlt() {
            return this.linkTextWithAlt;
        }

        public int hashCode() {
            String str = this.linkId;
            return this.linkAction.hashCode() + ((this.linkTextWithAlt.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "Cta(linkId=" + this.linkId + ", linkTextWithAlt=" + this.linkTextWithAlt + ", linkAction=" + this.linkAction + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "productList", "Lcom/woolworths/product/list/legacy/ProductListQuery$ProductList;", "<init>", "(Lcom/woolworths/product/list/legacy/ProductListQuery$ProductList;)V", "getProductList", "()Lcom/woolworths/product/list/legacy/ProductListQuery$ProductList;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {
        public static final int $stable = 8;

        @NotNull
        private final ProductList productList;

        public Data(@NotNull ProductList productList) {
            Intrinsics.h(productList, "productList");
            this.productList = productList;
        }

        public static /* synthetic */ Data copy$default(Data data, ProductList productList, int i, Object obj) {
            if ((i & 1) != 0) {
                productList = data.productList;
            }
            return data.copy(productList);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ProductList getProductList() {
            return this.productList;
        }

        @NotNull
        public final Data copy(@NotNull ProductList productList) {
            Intrinsics.h(productList, "productList");
            return new Data(productList);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Data) && Intrinsics.c(this.productList, ((Data) other).productList);
        }

        @NotNull
        public final ProductList getProductList() {
            return this.productList;
        }

        public int hashCode() {
            return this.productList.hashCode();
        }

        @NotNull
        public String toString() {
            return "Data(productList=" + this.productList + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$EventAnalytics;", "", "impression", "Lcom/woolworths/product/list/legacy/ProductListQuery$Impression;", "videoPlay", "Lcom/woolworths/product/list/legacy/ProductListQuery$VideoPlay;", "videoPause", "Lcom/woolworths/product/list/legacy/ProductListQuery$VideoPause;", "videoErrorImpression", "Lcom/woolworths/product/list/legacy/ProductListQuery$VideoErrorImpression;", "<init>", "(Lcom/woolworths/product/list/legacy/ProductListQuery$Impression;Lcom/woolworths/product/list/legacy/ProductListQuery$VideoPlay;Lcom/woolworths/product/list/legacy/ProductListQuery$VideoPause;Lcom/woolworths/product/list/legacy/ProductListQuery$VideoErrorImpression;)V", "getImpression", "()Lcom/woolworths/product/list/legacy/ProductListQuery$Impression;", "getVideoPlay", "()Lcom/woolworths/product/list/legacy/ProductListQuery$VideoPlay;", "getVideoPause", "()Lcom/woolworths/product/list/legacy/ProductListQuery$VideoPause;", "getVideoErrorImpression", "()Lcom/woolworths/product/list/legacy/ProductListQuery$VideoErrorImpression;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EventAnalytics {
        public static final int $stable = 8;

        @Nullable
        private final Impression impression;

        @Nullable
        private final VideoErrorImpression videoErrorImpression;

        @Nullable
        private final VideoPause videoPause;

        @Nullable
        private final VideoPlay videoPlay;

        public EventAnalytics(@Nullable Impression impression, @Nullable VideoPlay videoPlay, @Nullable VideoPause videoPause, @Nullable VideoErrorImpression videoErrorImpression) {
            this.impression = impression;
            this.videoPlay = videoPlay;
            this.videoPause = videoPause;
            this.videoErrorImpression = videoErrorImpression;
        }

        public static /* synthetic */ EventAnalytics copy$default(EventAnalytics eventAnalytics, Impression impression, VideoPlay videoPlay, VideoPause videoPause, VideoErrorImpression videoErrorImpression, int i, Object obj) {
            if ((i & 1) != 0) {
                impression = eventAnalytics.impression;
            }
            if ((i & 2) != 0) {
                videoPlay = eventAnalytics.videoPlay;
            }
            if ((i & 4) != 0) {
                videoPause = eventAnalytics.videoPause;
            }
            if ((i & 8) != 0) {
                videoErrorImpression = eventAnalytics.videoErrorImpression;
            }
            return eventAnalytics.copy(impression, videoPlay, videoPause, videoErrorImpression);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final Impression getImpression() {
            return this.impression;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final VideoPlay getVideoPlay() {
            return this.videoPlay;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final VideoPause getVideoPause() {
            return this.videoPause;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final VideoErrorImpression getVideoErrorImpression() {
            return this.videoErrorImpression;
        }

        @NotNull
        public final EventAnalytics copy(@Nullable Impression impression, @Nullable VideoPlay videoPlay, @Nullable VideoPause videoPause, @Nullable VideoErrorImpression videoErrorImpression) {
            return new EventAnalytics(impression, videoPlay, videoPause, videoErrorImpression);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EventAnalytics)) {
                return false;
            }
            EventAnalytics eventAnalytics = (EventAnalytics) other;
            return Intrinsics.c(this.impression, eventAnalytics.impression) && Intrinsics.c(this.videoPlay, eventAnalytics.videoPlay) && Intrinsics.c(this.videoPause, eventAnalytics.videoPause) && Intrinsics.c(this.videoErrorImpression, eventAnalytics.videoErrorImpression);
        }

        @Nullable
        public final Impression getImpression() {
            return this.impression;
        }

        @Nullable
        public final VideoErrorImpression getVideoErrorImpression() {
            return this.videoErrorImpression;
        }

        @Nullable
        public final VideoPause getVideoPause() {
            return this.videoPause;
        }

        @Nullable
        public final VideoPlay getVideoPlay() {
            return this.videoPlay;
        }

        public int hashCode() {
            Impression impression = this.impression;
            int iHashCode = (impression == null ? 0 : impression.hashCode()) * 31;
            VideoPlay videoPlay = this.videoPlay;
            int iHashCode2 = (iHashCode + (videoPlay == null ? 0 : videoPlay.hashCode())) * 31;
            VideoPause videoPause = this.videoPause;
            int iHashCode3 = (iHashCode2 + (videoPause == null ? 0 : videoPause.hashCode())) * 31;
            VideoErrorImpression videoErrorImpression = this.videoErrorImpression;
            return iHashCode3 + (videoErrorImpression != null ? videoErrorImpression.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "EventAnalytics(impression=" + this.impression + ", videoPlay=" + this.videoPlay + ", videoPause=" + this.videoPause + ", videoErrorImpression=" + this.videoErrorImpression + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$FacetChip;", "", "id", "", "isSelected", "", TextBundle.TEXT_ENTRY, "Lcom/woolworths/product/list/legacy/ProductListQuery$Text1;", "<init>", "(Ljava/lang/String;ZLcom/woolworths/product/list/legacy/ProductListQuery$Text1;)V", "getId", "()Ljava/lang/String;", "()Z", "getText", "()Lcom/woolworths/product/list/legacy/ProductListQuery$Text1;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FacetChip {
        public static final int $stable = 0;

        @NotNull
        private final String id;
        private final boolean isSelected;

        @NotNull
        private final Text1 text;

        public FacetChip(@NotNull String id, boolean z, @NotNull Text1 text) {
            Intrinsics.h(id, "id");
            Intrinsics.h(text, "text");
            this.id = id;
            this.isSelected = z;
            this.text = text;
        }

        public static /* synthetic */ FacetChip copy$default(FacetChip facetChip, String str, boolean z, Text1 text1, int i, Object obj) {
            if ((i & 1) != 0) {
                str = facetChip.id;
            }
            if ((i & 2) != 0) {
                z = facetChip.isSelected;
            }
            if ((i & 4) != 0) {
                text1 = facetChip.text;
            }
            return facetChip.copy(str, z, text1);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Text1 getText() {
            return this.text;
        }

        @NotNull
        public final FacetChip copy(@NotNull String id, boolean isSelected, @NotNull Text1 text) {
            Intrinsics.h(id, "id");
            Intrinsics.h(text, "text");
            return new FacetChip(id, isSelected, text);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FacetChip)) {
                return false;
            }
            FacetChip facetChip = (FacetChip) other;
            return Intrinsics.c(this.id, facetChip.id) && this.isSelected == facetChip.isSelected && Intrinsics.c(this.text, facetChip.text);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final Text1 getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode() + b.e(this.id.hashCode() * 31, 31, this.isSelected);
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            String str = this.id;
            boolean z = this.isSelected;
            Text1 text1 = this.text;
            StringBuilder sbQ = a.q("FacetChip(id=", str, ", isSelected=", ", text=", z);
            sbQ.append(text1);
            sbQ.append(")");
            return sbQ.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$FallbackImage;", "", "imageUrl", "", "altText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getImageUrl", "()Ljava/lang/String;", "getAltText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FallbackImage {
        public static final int $stable = 0;

        @NotNull
        private final String altText;

        @NotNull
        private final String imageUrl;

        public FallbackImage(@NotNull String imageUrl, @NotNull String altText) {
            Intrinsics.h(imageUrl, "imageUrl");
            Intrinsics.h(altText, "altText");
            this.imageUrl = imageUrl;
            this.altText = altText;
        }

        public static /* synthetic */ FallbackImage copy$default(FallbackImage fallbackImage, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fallbackImage.imageUrl;
            }
            if ((i & 2) != 0) {
                str2 = fallbackImage.altText;
            }
            return fallbackImage.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getAltText() {
            return this.altText;
        }

        @NotNull
        public final FallbackImage copy(@NotNull String imageUrl, @NotNull String altText) {
            Intrinsics.h(imageUrl, "imageUrl");
            Intrinsics.h(altText, "altText");
            return new FallbackImage(imageUrl, altText);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FallbackImage)) {
                return false;
            }
            FallbackImage fallbackImage = (FallbackImage) other;
            return Intrinsics.c(this.imageUrl, fallbackImage.imageUrl) && Intrinsics.c(this.altText, fallbackImage.altText);
        }

        @NotNull
        public final String getAltText() {
            return this.altText;
        }

        @NotNull
        public final String getImageUrl() {
            return this.imageUrl;
        }

        public int hashCode() {
            return this.altText.hashCode() + (this.imageUrl.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return YU.a.j("FallbackImage(imageUrl=", this.imageUrl, ", altText=", this.altText, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$Filter;", "", "headerKey", "", "headerTitle", "filterItems", "", "Lcom/woolworths/product/list/legacy/ProductListQuery$FilterItem;", "banner", "Lcom/woolworths/product/list/legacy/ProductListQuery$Banner;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/woolworths/product/list/legacy/ProductListQuery$Banner;)V", "getHeaderKey", "()Ljava/lang/String;", "getHeaderTitle", "getFilterItems", "()Ljava/util/List;", "getBanner", "()Lcom/woolworths/product/list/legacy/ProductListQuery$Banner;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Filter {
        public static final int $stable = 8;

        @Nullable
        private final Banner banner;

        @NotNull
        private final List<FilterItem> filterItems;

        @NotNull
        private final String headerKey;

        @NotNull
        private final String headerTitle;

        public Filter(@NotNull String headerKey, @NotNull String headerTitle, @NotNull List<FilterItem> filterItems, @Nullable Banner banner) {
            Intrinsics.h(headerKey, "headerKey");
            Intrinsics.h(headerTitle, "headerTitle");
            Intrinsics.h(filterItems, "filterItems");
            this.headerKey = headerKey;
            this.headerTitle = headerTitle;
            this.filterItems = filterItems;
            this.banner = banner;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Filter copy$default(Filter filter, String str, String str2, List list, Banner banner, int i, Object obj) {
            if ((i & 1) != 0) {
                str = filter.headerKey;
            }
            if ((i & 2) != 0) {
                str2 = filter.headerTitle;
            }
            if ((i & 4) != 0) {
                list = filter.filterItems;
            }
            if ((i & 8) != 0) {
                banner = filter.banner;
            }
            return filter.copy(str, str2, list, banner);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getHeaderKey() {
            return this.headerKey;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getHeaderTitle() {
            return this.headerTitle;
        }

        @NotNull
        public final List<FilterItem> component3() {
            return this.filterItems;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final Banner getBanner() {
            return this.banner;
        }

        @NotNull
        public final Filter copy(@NotNull String headerKey, @NotNull String headerTitle, @NotNull List<FilterItem> filterItems, @Nullable Banner banner) {
            Intrinsics.h(headerKey, "headerKey");
            Intrinsics.h(headerTitle, "headerTitle");
            Intrinsics.h(filterItems, "filterItems");
            return new Filter(headerKey, headerTitle, filterItems, banner);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Filter)) {
                return false;
            }
            Filter filter = (Filter) other;
            return Intrinsics.c(this.headerKey, filter.headerKey) && Intrinsics.c(this.headerTitle, filter.headerTitle) && Intrinsics.c(this.filterItems, filter.filterItems) && Intrinsics.c(this.banner, filter.banner);
        }

        @Nullable
        public final Banner getBanner() {
            return this.banner;
        }

        @NotNull
        public final List<FilterItem> getFilterItems() {
            return this.filterItems;
        }

        @NotNull
        public final String getHeaderKey() {
            return this.headerKey;
        }

        @NotNull
        public final String getHeaderTitle() {
            return this.headerTitle;
        }

        public int hashCode() {
            int iD = b.d(b.c(this.headerKey.hashCode() * 31, 31, this.headerTitle), 31, this.filterItems);
            Banner banner = this.banner;
            return iD + (banner == null ? 0 : banner.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.headerKey;
            String str2 = this.headerTitle;
            List<FilterItem> list = this.filterItems;
            Banner banner = this.banner;
            StringBuilder sbV = YU.a.v("Filter(headerKey=", str, ", headerTitle=", str2, ", filterItems=");
            sbV.append(list);
            sbV.append(", banner=");
            sbV.append(banner);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003JG\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$FilterItem;", "", "key", "", "title", AnnotatedPrivateKey.LABEL, "parentKey", "hasChildren", "", "isApplied", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getKey", "()Ljava/lang/String;", "getTitle", "getLabel", "getParentKey", "getHasChildren", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FilterItem {
        public static final int $stable = 0;
        private final boolean hasChildren;
        private final boolean isApplied;

        @NotNull
        private final String key;

        @NotNull
        private final String label;

        @Nullable
        private final String parentKey;

        @NotNull
        private final String title;

        public FilterItem(@NotNull String key, @NotNull String title, @NotNull String label, @Nullable String str, boolean z, boolean z2) {
            Intrinsics.h(key, "key");
            Intrinsics.h(title, "title");
            Intrinsics.h(label, "label");
            this.key = key;
            this.title = title;
            this.label = label;
            this.parentKey = str;
            this.hasChildren = z;
            this.isApplied = z2;
        }

        public static /* synthetic */ FilterItem copy$default(FilterItem filterItem, String str, String str2, String str3, String str4, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = filterItem.key;
            }
            if ((i & 2) != 0) {
                str2 = filterItem.title;
            }
            if ((i & 4) != 0) {
                str3 = filterItem.label;
            }
            if ((i & 8) != 0) {
                str4 = filterItem.parentKey;
            }
            if ((i & 16) != 0) {
                z = filterItem.hasChildren;
            }
            if ((i & 32) != 0) {
                z2 = filterItem.isApplied;
            }
            boolean z3 = z;
            boolean z4 = z2;
            return filterItem.copy(str, str2, str3, str4, z3, z4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getParentKey() {
            return this.parentKey;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getHasChildren() {
            return this.hasChildren;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsApplied() {
            return this.isApplied;
        }

        @NotNull
        public final FilterItem copy(@NotNull String key, @NotNull String title, @NotNull String label, @Nullable String parentKey, boolean hasChildren, boolean isApplied) {
            Intrinsics.h(key, "key");
            Intrinsics.h(title, "title");
            Intrinsics.h(label, "label");
            return new FilterItem(key, title, label, parentKey, hasChildren, isApplied);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FilterItem)) {
                return false;
            }
            FilterItem filterItem = (FilterItem) other;
            return Intrinsics.c(this.key, filterItem.key) && Intrinsics.c(this.title, filterItem.title) && Intrinsics.c(this.label, filterItem.label) && Intrinsics.c(this.parentKey, filterItem.parentKey) && this.hasChildren == filterItem.hasChildren && this.isApplied == filterItem.isApplied;
        }

        public final boolean getHasChildren() {
            return this.hasChildren;
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }

        @NotNull
        public final String getLabel() {
            return this.label;
        }

        @Nullable
        public final String getParentKey() {
            return this.parentKey;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iC = b.c(b.c(this.key.hashCode() * 31, 31, this.title), 31, this.label);
            String str = this.parentKey;
            return Boolean.hashCode(this.isApplied) + b.e((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.hasChildren);
        }

        public final boolean isApplied() {
            return this.isApplied;
        }

        @NotNull
        public String toString() {
            String str = this.key;
            String str2 = this.title;
            String str3 = this.label;
            String str4 = this.parentKey;
            boolean z = this.hasChildren;
            boolean z2 = this.isApplied;
            StringBuilder sbV = YU.a.v("FilterItem(key=", str, ", title=", str2, ", label=");
            a.B(sbV, str3, ", parentKey=", str4, ", hasChildren=");
            return au.com.woolworths.android.onesite.a.q(sbV, z, ", isApplied=", z2, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$Footer;", "", "title", "", NotificationMessage.NOTIF_KEY_SUB_TITLE, "linkUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getLinkUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJf\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020\u00062\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001c¨\u0006-"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$GoogleAdBannerCard;", "", OutOfContextTestingActivity.AD_UNIT_KEY, "", "nativeCustomTemplateId", "iabSpec", "", "iabSize", "height", "Lau/com/woolworths/shop/graphql/type/AdBannerNativeSize;", "targeting", "Lau/com/woolworths/android/onesite/graphql/GoogleAdCustomTargeting;", "correlator", "_excluded", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lau/com/woolworths/shop/graphql/type/AdBannerNativeSize;Lau/com/woolworths/android/onesite/graphql/GoogleAdCustomTargeting;Ljava/lang/String;Ljava/lang/Boolean;)V", "getAdUnit", "()Ljava/lang/String;", "getNativeCustomTemplateId", "getIabSpec", "()Z", "getIabSize", "getHeight", "()Lau/com/woolworths/shop/graphql/type/AdBannerNativeSize;", "getTargeting", "()Lau/com/woolworths/android/onesite/graphql/GoogleAdCustomTargeting;", "getCorrelator", "get_excluded", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lau/com/woolworths/shop/graphql/type/AdBannerNativeSize;Lau/com/woolworths/android/onesite/graphql/GoogleAdCustomTargeting;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/woolworths/product/list/legacy/ProductListQuery$GoogleAdBannerCard;", "equals", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class GoogleAdBannerCard {
        public static final int $stable = 8;

        @Nullable
        private final Boolean _excluded;

        @NotNull
        private final String adUnit;

        @Nullable
        private final String correlator;

        @NotNull
        private final AdBannerNativeSize height;

        @Nullable
        private final String iabSize;
        private final boolean iabSpec;

        @NotNull
        private final String nativeCustomTemplateId;

        @Nullable
        private final GoogleAdCustomTargeting targeting;

        public GoogleAdBannerCard(@NotNull String adUnit, @NotNull String nativeCustomTemplateId, boolean z, @Nullable String str, @NotNull AdBannerNativeSize height, @Nullable GoogleAdCustomTargeting googleAdCustomTargeting, @Nullable String str2, @Nullable Boolean bool) {
            Intrinsics.h(adUnit, "adUnit");
            Intrinsics.h(nativeCustomTemplateId, "nativeCustomTemplateId");
            Intrinsics.h(height, "height");
            this.adUnit = adUnit;
            this.nativeCustomTemplateId = nativeCustomTemplateId;
            this.iabSpec = z;
            this.iabSize = str;
            this.height = height;
            this.targeting = googleAdCustomTargeting;
            this.correlator = str2;
            this._excluded = bool;
        }

        public static /* synthetic */ GoogleAdBannerCard copy$default(GoogleAdBannerCard googleAdBannerCard, String str, String str2, boolean z, String str3, AdBannerNativeSize adBannerNativeSize, GoogleAdCustomTargeting googleAdCustomTargeting, String str4, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                str = googleAdBannerCard.adUnit;
            }
            if ((i & 2) != 0) {
                str2 = googleAdBannerCard.nativeCustomTemplateId;
            }
            if ((i & 4) != 0) {
                z = googleAdBannerCard.iabSpec;
            }
            if ((i & 8) != 0) {
                str3 = googleAdBannerCard.iabSize;
            }
            if ((i & 16) != 0) {
                adBannerNativeSize = googleAdBannerCard.height;
            }
            if ((i & 32) != 0) {
                googleAdCustomTargeting = googleAdBannerCard.targeting;
            }
            if ((i & 64) != 0) {
                str4 = googleAdBannerCard.correlator;
            }
            if ((i & 128) != 0) {
                bool = googleAdBannerCard._excluded;
            }
            String str5 = str4;
            Boolean bool2 = bool;
            AdBannerNativeSize adBannerNativeSize2 = adBannerNativeSize;
            GoogleAdCustomTargeting googleAdCustomTargeting2 = googleAdCustomTargeting;
            return googleAdBannerCard.copy(str, str2, z, str3, adBannerNativeSize2, googleAdCustomTargeting2, str5, bool2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getAdUnit() {
            return this.adUnit;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getNativeCustomTemplateId() {
            return this.nativeCustomTemplateId;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIabSpec() {
            return this.iabSpec;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getIabSize() {
            return this.iabSize;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final AdBannerNativeSize getHeight() {
            return this.height;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final GoogleAdCustomTargeting getTargeting() {
            return this.targeting;
        }

        @Nullable
        /* renamed from: component7, reason: from getter */
        public final String getCorrelator() {
            return this.correlator;
        }

        @Nullable
        /* renamed from: component8, reason: from getter */
        public final Boolean get_excluded() {
            return this._excluded;
        }

        @NotNull
        public final GoogleAdBannerCard copy(@NotNull String adUnit, @NotNull String nativeCustomTemplateId, boolean iabSpec, @Nullable String iabSize, @NotNull AdBannerNativeSize height, @Nullable GoogleAdCustomTargeting targeting, @Nullable String correlator, @Nullable Boolean _excluded) {
            Intrinsics.h(adUnit, "adUnit");
            Intrinsics.h(nativeCustomTemplateId, "nativeCustomTemplateId");
            Intrinsics.h(height, "height");
            return new GoogleAdBannerCard(adUnit, nativeCustomTemplateId, iabSpec, iabSize, height, targeting, correlator, _excluded);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GoogleAdBannerCard)) {
                return false;
            }
            GoogleAdBannerCard googleAdBannerCard = (GoogleAdBannerCard) other;
            return Intrinsics.c(this.adUnit, googleAdBannerCard.adUnit) && Intrinsics.c(this.nativeCustomTemplateId, googleAdBannerCard.nativeCustomTemplateId) && this.iabSpec == googleAdBannerCard.iabSpec && Intrinsics.c(this.iabSize, googleAdBannerCard.iabSize) && this.height == googleAdBannerCard.height && Intrinsics.c(this.targeting, googleAdBannerCard.targeting) && Intrinsics.c(this.correlator, googleAdBannerCard.correlator) && Intrinsics.c(this._excluded, googleAdBannerCard._excluded);
        }

        @NotNull
        public final String getAdUnit() {
            return this.adUnit;
        }

        @Nullable
        public final String getCorrelator() {
            return this.correlator;
        }

        @NotNull
        public final AdBannerNativeSize getHeight() {
            return this.height;
        }

        @Nullable
        public final String getIabSize() {
            return this.iabSize;
        }

        public final boolean getIabSpec() {
            return this.iabSpec;
        }

        @NotNull
        public final String getNativeCustomTemplateId() {
            return this.nativeCustomTemplateId;
        }

        @Nullable
        public final GoogleAdCustomTargeting getTargeting() {
            return this.targeting;
        }

        @Nullable
        public final Boolean get_excluded() {
            return this._excluded;
        }

        public int hashCode() {
            int iE = b.e(b.c(this.adUnit.hashCode() * 31, 31, this.nativeCustomTemplateId), 31, this.iabSpec);
            String str = this.iabSize;
            int iHashCode = (this.height.hashCode() + ((iE + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            GoogleAdCustomTargeting googleAdCustomTargeting = this.targeting;
            int iHashCode2 = (iHashCode + (googleAdCustomTargeting == null ? 0 : googleAdCustomTargeting.hashCode())) * 31;
            String str2 = this.correlator;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this._excluded;
            return iHashCode3 + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.adUnit;
            String str2 = this.nativeCustomTemplateId;
            boolean z = this.iabSpec;
            String str3 = this.iabSize;
            AdBannerNativeSize adBannerNativeSize = this.height;
            GoogleAdCustomTargeting googleAdCustomTargeting = this.targeting;
            String str4 = this.correlator;
            Boolean bool = this._excluded;
            StringBuilder sbV = YU.a.v("GoogleAdBannerCard(adUnit=", str, ", nativeCustomTemplateId=", str2, ", iabSpec=");
            au.com.woolworths.android.onesite.a.y(", iabSize=", str3, ", height=", sbV, z);
            sbV.append(adBannerNativeSize);
            sbV.append(", targeting=");
            sbV.append(googleAdCustomTargeting);
            sbV.append(", correlator=");
            sbV.append(str4);
            sbV.append(", _excluded=");
            sbV.append(bool);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$Impression;", "", "__typename", "", "analyticsFields", "Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;)V", "get__typename", "()Ljava/lang/String;", "getAnalyticsFields", "()Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Impression {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final AnalyticsFields analyticsFields;

        public Impression(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            this.__typename = __typename;
            this.analyticsFields = analyticsFields;
        }

        public static /* synthetic */ Impression copy$default(Impression impression, String str, AnalyticsFields analyticsFields, int i, Object obj) {
            if ((i & 1) != 0) {
                str = impression.__typename;
            }
            if ((i & 2) != 0) {
                analyticsFields = impression.analyticsFields;
            }
            return impression.copy(str, analyticsFields);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final Impression copy(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            return new Impression(__typename, analyticsFields);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Impression)) {
                return false;
            }
            Impression impression = (Impression) other;
            return Intrinsics.c(this.__typename, impression.__typename) && Intrinsics.c(this.analyticsFields, impression.analyticsFields);
        }

        @NotNull
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.analyticsFields.hashCode() + (this.__typename.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return d.p("Impression(__typename=", this.__typename, ", analyticsFields=", this.analyticsFields, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$ImpressionAnalytics;", "", "__typename", "", "analyticsFields", "Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;)V", "get__typename", "()Ljava/lang/String;", "getAnalyticsFields", "()Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImpressionAnalytics {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final AnalyticsFields analyticsFields;

        public ImpressionAnalytics(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            this.__typename = __typename;
            this.analyticsFields = analyticsFields;
        }

        public static /* synthetic */ ImpressionAnalytics copy$default(ImpressionAnalytics impressionAnalytics, String str, AnalyticsFields analyticsFields, int i, Object obj) {
            if ((i & 1) != 0) {
                str = impressionAnalytics.__typename;
            }
            if ((i & 2) != 0) {
                analyticsFields = impressionAnalytics.analyticsFields;
            }
            return impressionAnalytics.copy(str, analyticsFields);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final ImpressionAnalytics copy(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            return new ImpressionAnalytics(__typename, analyticsFields);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImpressionAnalytics)) {
                return false;
            }
            ImpressionAnalytics impressionAnalytics = (ImpressionAnalytics) other;
            return Intrinsics.c(this.__typename, impressionAnalytics.__typename) && Intrinsics.c(this.analyticsFields, impressionAnalytics.analyticsFields);
        }

        @NotNull
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.analyticsFields.hashCode() + (this.__typename.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return d.p("ImpressionAnalytics(__typename=", this.__typename, ", analyticsFields=", this.analyticsFields, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$Item;", "", "__typename", "", "onProductCard", "Lcom/woolworths/product/list/legacy/ProductListQuery$OnProductCard;", "onMerchCardFullImage", "Lcom/woolworths/product/list/legacy/ProductListQuery$OnMerchCardFullImage;", "<init>", "(Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductListQuery$OnProductCard;Lcom/woolworths/product/list/legacy/ProductListQuery$OnMerchCardFullImage;)V", "get__typename", "()Ljava/lang/String;", "getOnProductCard", "()Lcom/woolworths/product/list/legacy/ProductListQuery$OnProductCard;", "getOnMerchCardFullImage", "()Lcom/woolworths/product/list/legacy/ProductListQuery$OnMerchCardFullImage;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @Nullable
        private final OnMerchCardFullImage onMerchCardFullImage;

        @Nullable
        private final OnProductCard onProductCard;

        public Item(@NotNull String __typename, @Nullable OnProductCard onProductCard, @Nullable OnMerchCardFullImage onMerchCardFullImage) {
            Intrinsics.h(__typename, "__typename");
            this.__typename = __typename;
            this.onProductCard = onProductCard;
            this.onMerchCardFullImage = onMerchCardFullImage;
        }

        public static /* synthetic */ Item copy$default(Item item, String str, OnProductCard onProductCard, OnMerchCardFullImage onMerchCardFullImage, int i, Object obj) {
            if ((i & 1) != 0) {
                str = item.__typename;
            }
            if ((i & 2) != 0) {
                onProductCard = item.onProductCard;
            }
            if ((i & 4) != 0) {
                onMerchCardFullImage = item.onMerchCardFullImage;
            }
            return item.copy(str, onProductCard, onMerchCardFullImage);
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

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final OnMerchCardFullImage getOnMerchCardFullImage() {
            return this.onMerchCardFullImage;
        }

        @NotNull
        public final Item copy(@NotNull String __typename, @Nullable OnProductCard onProductCard, @Nullable OnMerchCardFullImage onMerchCardFullImage) {
            Intrinsics.h(__typename, "__typename");
            return new Item(__typename, onProductCard, onMerchCardFullImage);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.c(this.__typename, item.__typename) && Intrinsics.c(this.onProductCard, item.onProductCard) && Intrinsics.c(this.onMerchCardFullImage, item.onMerchCardFullImage);
        }

        @Nullable
        public final OnMerchCardFullImage getOnMerchCardFullImage() {
            return this.onMerchCardFullImage;
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
            int iHashCode2 = (iHashCode + (onProductCard == null ? 0 : onProductCard.hashCode())) * 31;
            OnMerchCardFullImage onMerchCardFullImage = this.onMerchCardFullImage;
            return iHashCode2 + (onMerchCardFullImage != null ? onMerchCardFullImage.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Item(__typename=" + this.__typename + ", onProductCard=" + this.onProductCard + ", onMerchCardFullImage=" + this.onMerchCardFullImage + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$Item1;", "", "title", "", lqlqqlq.mmm006Dm006Dm, "imageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getImageUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item1 {
        public static final int $stable = 0;

        @NotNull
        private final String description;

        @NotNull
        private final String imageUrl;

        @NotNull
        private final String title;

        public Item1(@NotNull String title, @NotNull String description, @NotNull String imageUrl) {
            Intrinsics.h(title, "title");
            Intrinsics.h(description, "description");
            Intrinsics.h(imageUrl, "imageUrl");
            this.title = title;
            this.description = description;
            this.imageUrl = imageUrl;
        }

        public static /* synthetic */ Item1 copy$default(Item1 item1, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = item1.title;
            }
            if ((i & 2) != 0) {
                str2 = item1.description;
            }
            if ((i & 4) != 0) {
                str3 = item1.imageUrl;
            }
            return item1.copy(str, str2, str3);
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
        public final Item1 copy(@NotNull String title, @NotNull String description, @NotNull String imageUrl) {
            Intrinsics.h(title, "title");
            Intrinsics.h(description, "description");
            Intrinsics.h(imageUrl, "imageUrl");
            return new Item1(title, description, imageUrl);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item1)) {
                return false;
            }
            Item1 item1 = (Item1) other;
            return Intrinsics.c(this.title, item1.title) && Intrinsics.c(this.description, item1.description) && Intrinsics.c(this.imageUrl, item1.imageUrl);
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
            return YU.a.o(YU.a.v("Item1(title=", str, ", description=", str2, ", imageUrl="), this.imageUrl, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$Item2;", "", "__typename", "", "onZeroResultProductCategories", "Lcom/woolworths/product/list/legacy/ProductListQuery$OnZeroResultProductCategories;", "onHorizontalList", "Lcom/woolworths/product/list/legacy/ProductListQuery$OnHorizontalList1;", "<init>", "(Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductListQuery$OnZeroResultProductCategories;Lcom/woolworths/product/list/legacy/ProductListQuery$OnHorizontalList1;)V", "get__typename", "()Ljava/lang/String;", "getOnZeroResultProductCategories", "()Lcom/woolworths/product/list/legacy/ProductListQuery$OnZeroResultProductCategories;", "getOnHorizontalList", "()Lcom/woolworths/product/list/legacy/ProductListQuery$OnHorizontalList1;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item2 {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @Nullable
        private final OnHorizontalList1 onHorizontalList;

        @Nullable
        private final OnZeroResultProductCategories onZeroResultProductCategories;

        public Item2(@NotNull String __typename, @Nullable OnZeroResultProductCategories onZeroResultProductCategories, @Nullable OnHorizontalList1 onHorizontalList1) {
            Intrinsics.h(__typename, "__typename");
            this.__typename = __typename;
            this.onZeroResultProductCategories = onZeroResultProductCategories;
            this.onHorizontalList = onHorizontalList1;
        }

        public static /* synthetic */ Item2 copy$default(Item2 item2, String str, OnZeroResultProductCategories onZeroResultProductCategories, OnHorizontalList1 onHorizontalList1, int i, Object obj) {
            if ((i & 1) != 0) {
                str = item2.__typename;
            }
            if ((i & 2) != 0) {
                onZeroResultProductCategories = item2.onZeroResultProductCategories;
            }
            if ((i & 4) != 0) {
                onHorizontalList1 = item2.onHorizontalList;
            }
            return item2.copy(str, onZeroResultProductCategories, onHorizontalList1);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final OnZeroResultProductCategories getOnZeroResultProductCategories() {
            return this.onZeroResultProductCategories;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final OnHorizontalList1 getOnHorizontalList() {
            return this.onHorizontalList;
        }

        @NotNull
        public final Item2 copy(@NotNull String __typename, @Nullable OnZeroResultProductCategories onZeroResultProductCategories, @Nullable OnHorizontalList1 onHorizontalList) {
            Intrinsics.h(__typename, "__typename");
            return new Item2(__typename, onZeroResultProductCategories, onHorizontalList);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item2)) {
                return false;
            }
            Item2 item2 = (Item2) other;
            return Intrinsics.c(this.__typename, item2.__typename) && Intrinsics.c(this.onZeroResultProductCategories, item2.onZeroResultProductCategories) && Intrinsics.c(this.onHorizontalList, item2.onHorizontalList);
        }

        @Nullable
        public final OnHorizontalList1 getOnHorizontalList() {
            return this.onHorizontalList;
        }

        @Nullable
        public final OnZeroResultProductCategories getOnZeroResultProductCategories() {
            return this.onZeroResultProductCategories;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int iHashCode = this.__typename.hashCode() * 31;
            OnZeroResultProductCategories onZeroResultProductCategories = this.onZeroResultProductCategories;
            int iHashCode2 = (iHashCode + (onZeroResultProductCategories == null ? 0 : onZeroResultProductCategories.hashCode())) * 31;
            OnHorizontalList1 onHorizontalList1 = this.onHorizontalList;
            return iHashCode2 + (onHorizontalList1 != null ? onHorizontalList1.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Item2(__typename=" + this.__typename + ", onZeroResultProductCategories=" + this.onZeroResultProductCategories + ", onHorizontalList=" + this.onHorizontalList + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$Item3;", "", "__typename", "", "onProductCard", "Lcom/woolworths/product/list/legacy/ProductListQuery$OnProductCard2;", "<init>", "(Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductListQuery$OnProductCard2;)V", "get__typename", "()Ljava/lang/String;", "getOnProductCard", "()Lcom/woolworths/product/list/legacy/ProductListQuery$OnProductCard2;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item3 {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @Nullable
        private final OnProductCard2 onProductCard;

        public Item3(@NotNull String __typename, @Nullable OnProductCard2 onProductCard2) {
            Intrinsics.h(__typename, "__typename");
            this.__typename = __typename;
            this.onProductCard = onProductCard2;
        }

        public static /* synthetic */ Item3 copy$default(Item3 item3, String str, OnProductCard2 onProductCard2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = item3.__typename;
            }
            if ((i & 2) != 0) {
                onProductCard2 = item3.onProductCard;
            }
            return item3.copy(str, onProductCard2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final OnProductCard2 getOnProductCard() {
            return this.onProductCard;
        }

        @NotNull
        public final Item3 copy(@NotNull String __typename, @Nullable OnProductCard2 onProductCard) {
            Intrinsics.h(__typename, "__typename");
            return new Item3(__typename, onProductCard);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item3)) {
                return false;
            }
            Item3 item3 = (Item3) other;
            return Intrinsics.c(this.__typename, item3.__typename) && Intrinsics.c(this.onProductCard, item3.onProductCard);
        }

        @Nullable
        public final OnProductCard2 getOnProductCard() {
            return this.onProductCard;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int iHashCode = this.__typename.hashCode() * 31;
            OnProductCard2 onProductCard2 = this.onProductCard;
            return iHashCode + (onProductCard2 == null ? 0 : onProductCard2.hashCode());
        }

        @NotNull
        public String toString() {
            return "Item3(__typename=" + this.__typename + ", onProductCard=" + this.onProductCard + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$Item4;", "", "__typename", "", "onZeroResultProductCategories", "Lcom/woolworths/product/list/legacy/ProductListQuery$OnZeroResultProductCategories1;", "onHorizontalList", "Lcom/woolworths/product/list/legacy/ProductListQuery$OnHorizontalList2;", "<init>", "(Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductListQuery$OnZeroResultProductCategories1;Lcom/woolworths/product/list/legacy/ProductListQuery$OnHorizontalList2;)V", "get__typename", "()Ljava/lang/String;", "getOnZeroResultProductCategories", "()Lcom/woolworths/product/list/legacy/ProductListQuery$OnZeroResultProductCategories1;", "getOnHorizontalList", "()Lcom/woolworths/product/list/legacy/ProductListQuery$OnHorizontalList2;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item4 {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @Nullable
        private final OnHorizontalList2 onHorizontalList;

        @Nullable
        private final OnZeroResultProductCategories1 onZeroResultProductCategories;

        public Item4(@NotNull String __typename, @Nullable OnZeroResultProductCategories1 onZeroResultProductCategories1, @Nullable OnHorizontalList2 onHorizontalList2) {
            Intrinsics.h(__typename, "__typename");
            this.__typename = __typename;
            this.onZeroResultProductCategories = onZeroResultProductCategories1;
            this.onHorizontalList = onHorizontalList2;
        }

        public static /* synthetic */ Item4 copy$default(Item4 item4, String str, OnZeroResultProductCategories1 onZeroResultProductCategories1, OnHorizontalList2 onHorizontalList2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = item4.__typename;
            }
            if ((i & 2) != 0) {
                onZeroResultProductCategories1 = item4.onZeroResultProductCategories;
            }
            if ((i & 4) != 0) {
                onHorizontalList2 = item4.onHorizontalList;
            }
            return item4.copy(str, onZeroResultProductCategories1, onHorizontalList2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final OnZeroResultProductCategories1 getOnZeroResultProductCategories() {
            return this.onZeroResultProductCategories;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final OnHorizontalList2 getOnHorizontalList() {
            return this.onHorizontalList;
        }

        @NotNull
        public final Item4 copy(@NotNull String __typename, @Nullable OnZeroResultProductCategories1 onZeroResultProductCategories, @Nullable OnHorizontalList2 onHorizontalList) {
            Intrinsics.h(__typename, "__typename");
            return new Item4(__typename, onZeroResultProductCategories, onHorizontalList);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item4)) {
                return false;
            }
            Item4 item4 = (Item4) other;
            return Intrinsics.c(this.__typename, item4.__typename) && Intrinsics.c(this.onZeroResultProductCategories, item4.onZeroResultProductCategories) && Intrinsics.c(this.onHorizontalList, item4.onHorizontalList);
        }

        @Nullable
        public final OnHorizontalList2 getOnHorizontalList() {
            return this.onHorizontalList;
        }

        @Nullable
        public final OnZeroResultProductCategories1 getOnZeroResultProductCategories() {
            return this.onZeroResultProductCategories;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int iHashCode = this.__typename.hashCode() * 31;
            OnZeroResultProductCategories1 onZeroResultProductCategories1 = this.onZeroResultProductCategories;
            int iHashCode2 = (iHashCode + (onZeroResultProductCategories1 == null ? 0 : onZeroResultProductCategories1.hashCode())) * 31;
            OnHorizontalList2 onHorizontalList2 = this.onHorizontalList;
            return iHashCode2 + (onHorizontalList2 != null ? onHorizontalList2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Item4(__typename=" + this.__typename + ", onZeroResultProductCategories=" + this.onZeroResultProductCategories + ", onHorizontalList=" + this.onHorizontalList + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$Item5;", "", "__typename", "", "onProductCard", "Lcom/woolworths/product/list/legacy/ProductListQuery$OnProductCard3;", "<init>", "(Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductListQuery$OnProductCard3;)V", "get__typename", "()Ljava/lang/String;", "getOnProductCard", "()Lcom/woolworths/product/list/legacy/ProductListQuery$OnProductCard3;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item5 {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @Nullable
        private final OnProductCard3 onProductCard;

        public Item5(@NotNull String __typename, @Nullable OnProductCard3 onProductCard3) {
            Intrinsics.h(__typename, "__typename");
            this.__typename = __typename;
            this.onProductCard = onProductCard3;
        }

        public static /* synthetic */ Item5 copy$default(Item5 item5, String str, OnProductCard3 onProductCard3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = item5.__typename;
            }
            if ((i & 2) != 0) {
                onProductCard3 = item5.onProductCard;
            }
            return item5.copy(str, onProductCard3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final OnProductCard3 getOnProductCard() {
            return this.onProductCard;
        }

        @NotNull
        public final Item5 copy(@NotNull String __typename, @Nullable OnProductCard3 onProductCard) {
            Intrinsics.h(__typename, "__typename");
            return new Item5(__typename, onProductCard);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item5)) {
                return false;
            }
            Item5 item5 = (Item5) other;
            return Intrinsics.c(this.__typename, item5.__typename) && Intrinsics.c(this.onProductCard, item5.onProductCard);
        }

        @Nullable
        public final OnProductCard3 getOnProductCard() {
            return this.onProductCard;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int iHashCode = this.__typename.hashCode() * 31;
            OnProductCard3 onProductCard3 = this.onProductCard;
            return iHashCode + (onProductCard3 == null ? 0 : onProductCard3.hashCode());
        }

        @NotNull
        public String toString() {
            return "Item5(__typename=" + this.__typename + ", onProductCard=" + this.onProductCard + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$LinkAction;", "", UrlHandler.ACTION, "", "id", "type", "Lau/com/woolworths/shop/graphql/type/ActionType;", "analytics", "Lcom/woolworths/product/list/legacy/ProductListQuery$Analytics7;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/shop/graphql/type/ActionType;Lcom/woolworths/product/list/legacy/ProductListQuery$Analytics7;)V", "getAction", "()Ljava/lang/String;", "getId", "getType", "()Lau/com/woolworths/shop/graphql/type/ActionType;", "getAnalytics", "()Lcom/woolworths/product/list/legacy/ProductListQuery$Analytics7;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkAction {
        public static final int $stable = 8;

        @NotNull
        private final String action;

        @Nullable
        private final Analytics7 analytics;

        @Nullable
        private final String id;

        @NotNull
        private final ActionType type;

        public LinkAction(@NotNull String action, @Nullable String str, @NotNull ActionType type, @Nullable Analytics7 analytics7) {
            Intrinsics.h(action, "action");
            Intrinsics.h(type, "type");
            this.action = action;
            this.id = str;
            this.type = type;
            this.analytics = analytics7;
        }

        public static /* synthetic */ LinkAction copy$default(LinkAction linkAction, String str, String str2, ActionType actionType, Analytics7 analytics7, int i, Object obj) {
            if ((i & 1) != 0) {
                str = linkAction.action;
            }
            if ((i & 2) != 0) {
                str2 = linkAction.id;
            }
            if ((i & 4) != 0) {
                actionType = linkAction.type;
            }
            if ((i & 8) != 0) {
                analytics7 = linkAction.analytics;
            }
            return linkAction.copy(str, str2, actionType, analytics7);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final ActionType getType() {
            return this.type;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final Analytics7 getAnalytics() {
            return this.analytics;
        }

        @NotNull
        public final LinkAction copy(@NotNull String action, @Nullable String id, @NotNull ActionType type, @Nullable Analytics7 analytics) {
            Intrinsics.h(action, "action");
            Intrinsics.h(type, "type");
            return new LinkAction(action, id, type, analytics);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LinkAction)) {
                return false;
            }
            LinkAction linkAction = (LinkAction) other;
            return Intrinsics.c(this.action, linkAction.action) && Intrinsics.c(this.id, linkAction.id) && this.type == linkAction.type && Intrinsics.c(this.analytics, linkAction.analytics);
        }

        @NotNull
        public final String getAction() {
            return this.action;
        }

        @Nullable
        public final Analytics7 getAnalytics() {
            return this.analytics;
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
            int iHashCode = this.action.hashCode() * 31;
            String str = this.id;
            int iA = d.a(this.type, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            Analytics7 analytics7 = this.analytics;
            return iA + (analytics7 != null ? analytics7.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.action;
            String str2 = this.id;
            ActionType actionType = this.type;
            Analytics7 analytics7 = this.analytics;
            StringBuilder sbV = YU.a.v("LinkAction(action=", str, ", id=", str2, ", type=");
            sbV.append(actionType);
            sbV.append(", analytics=");
            sbV.append(analytics7);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$LinkTextWithAlt;", "", TextBundle.TEXT_ENTRY, "", "altText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getAltText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkTextWithAlt {
        public static final int $stable = 0;

        @NotNull
        private final String altText;

        @NotNull
        private final String text;

        public LinkTextWithAlt(@NotNull String text, @NotNull String altText) {
            Intrinsics.h(text, "text");
            Intrinsics.h(altText, "altText");
            this.text = text;
            this.altText = altText;
        }

        public static /* synthetic */ LinkTextWithAlt copy$default(LinkTextWithAlt linkTextWithAlt, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = linkTextWithAlt.text;
            }
            if ((i & 2) != 0) {
                str2 = linkTextWithAlt.altText;
            }
            return linkTextWithAlt.copy(str, str2);
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
        public final LinkTextWithAlt copy(@NotNull String text, @NotNull String altText) {
            Intrinsics.h(text, "text");
            Intrinsics.h(altText, "altText");
            return new LinkTextWithAlt(text, altText);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LinkTextWithAlt)) {
                return false;
            }
            LinkTextWithAlt linkTextWithAlt = (LinkTextWithAlt) other;
            return Intrinsics.c(this.text, linkTextWithAlt.text) && Intrinsics.c(this.altText, linkTextWithAlt.altText);
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
            return YU.a.j("LinkTextWithAlt(text=", this.text, ", altText=", this.altText, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0015JF\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$MarketplaceBottomSheet;", "", "bottomSheetTitle", "", "bottomSheetBody", "primaryCta", "Lcom/woolworths/product/list/legacy/ProductListQuery$PrimaryCta;", "secondaryCta", "Lcom/woolworths/product/list/legacy/ProductListQuery$SecondaryCta;", "showOnceOnly", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductListQuery$PrimaryCta;Lcom/woolworths/product/list/legacy/ProductListQuery$SecondaryCta;Ljava/lang/Boolean;)V", "getBottomSheetTitle", "()Ljava/lang/String;", "getBottomSheetBody", "getPrimaryCta", "()Lcom/woolworths/product/list/legacy/ProductListQuery$PrimaryCta;", "getSecondaryCta", "()Lcom/woolworths/product/list/legacy/ProductListQuery$SecondaryCta;", "getShowOnceOnly", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductListQuery$PrimaryCta;Lcom/woolworths/product/list/legacy/ProductListQuery$SecondaryCta;Ljava/lang/Boolean;)Lcom/woolworths/product/list/legacy/ProductListQuery$MarketplaceBottomSheet;", "equals", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MarketplaceBottomSheet {
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

        public MarketplaceBottomSheet(@NotNull String bottomSheetTitle, @NotNull String bottomSheetBody, @Nullable PrimaryCta primaryCta, @Nullable SecondaryCta secondaryCta, @Nullable Boolean bool) {
            Intrinsics.h(bottomSheetTitle, "bottomSheetTitle");
            Intrinsics.h(bottomSheetBody, "bottomSheetBody");
            this.bottomSheetTitle = bottomSheetTitle;
            this.bottomSheetBody = bottomSheetBody;
            this.primaryCta = primaryCta;
            this.secondaryCta = secondaryCta;
            this.showOnceOnly = bool;
        }

        public static /* synthetic */ MarketplaceBottomSheet copy$default(MarketplaceBottomSheet marketplaceBottomSheet, String str, String str2, PrimaryCta primaryCta, SecondaryCta secondaryCta, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                str = marketplaceBottomSheet.bottomSheetTitle;
            }
            if ((i & 2) != 0) {
                str2 = marketplaceBottomSheet.bottomSheetBody;
            }
            if ((i & 4) != 0) {
                primaryCta = marketplaceBottomSheet.primaryCta;
            }
            if ((i & 8) != 0) {
                secondaryCta = marketplaceBottomSheet.secondaryCta;
            }
            if ((i & 16) != 0) {
                bool = marketplaceBottomSheet.showOnceOnly;
            }
            Boolean bool2 = bool;
            PrimaryCta primaryCta2 = primaryCta;
            return marketplaceBottomSheet.copy(str, str2, primaryCta2, secondaryCta, bool2);
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
        public final MarketplaceBottomSheet copy(@NotNull String bottomSheetTitle, @NotNull String bottomSheetBody, @Nullable PrimaryCta primaryCta, @Nullable SecondaryCta secondaryCta, @Nullable Boolean showOnceOnly) {
            Intrinsics.h(bottomSheetTitle, "bottomSheetTitle");
            Intrinsics.h(bottomSheetBody, "bottomSheetBody");
            return new MarketplaceBottomSheet(bottomSheetTitle, bottomSheetBody, primaryCta, secondaryCta, showOnceOnly);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MarketplaceBottomSheet)) {
                return false;
            }
            MarketplaceBottomSheet marketplaceBottomSheet = (MarketplaceBottomSheet) other;
            return Intrinsics.c(this.bottomSheetTitle, marketplaceBottomSheet.bottomSheetTitle) && Intrinsics.c(this.bottomSheetBody, marketplaceBottomSheet.bottomSheetBody) && Intrinsics.c(this.primaryCta, marketplaceBottomSheet.primaryCta) && Intrinsics.c(this.secondaryCta, marketplaceBottomSheet.secondaryCta) && Intrinsics.c(this.showOnceOnly, marketplaceBottomSheet.showOnceOnly);
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
            StringBuilder sbV = YU.a.v("MarketplaceBottomSheet(bottomSheetTitle=", str, ", bottomSheetBody=", str2, ", primaryCta=");
            sbV.append(primaryCta);
            sbV.append(", secondaryCta=");
            sbV.append(secondaryCta);
            sbV.append(", showOnceOnly=");
            return au.com.woolworths.android.onesite.a.o(sbV, bool, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$MarketplaceFilterSwitch;", "", "title", "", NotificationMessage.NOTIF_KEY_SUB_TITLE, "imageUrl", "buttonCta", "Lcom/woolworths/product/list/legacy/ProductListQuery$ButtonCta;", "value", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductListQuery$ButtonCta;Z)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getImageUrl", "getButtonCta", "()Lcom/woolworths/product/list/legacy/ProductListQuery$ButtonCta;", "getValue", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MarketplaceFilterSwitch {
        public static final int $stable = 0;

        @Nullable
        private final ButtonCta buttonCta;

        @Nullable
        private final String imageUrl;

        @Nullable
        private final String subtitle;

        @NotNull
        private final String title;
        private final boolean value;

        public MarketplaceFilterSwitch(@NotNull String title, @Nullable String str, @Nullable String str2, @Nullable ButtonCta buttonCta, boolean z) {
            Intrinsics.h(title, "title");
            this.title = title;
            this.subtitle = str;
            this.imageUrl = str2;
            this.buttonCta = buttonCta;
            this.value = z;
        }

        public static /* synthetic */ MarketplaceFilterSwitch copy$default(MarketplaceFilterSwitch marketplaceFilterSwitch, String str, String str2, String str3, ButtonCta buttonCta, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = marketplaceFilterSwitch.title;
            }
            if ((i & 2) != 0) {
                str2 = marketplaceFilterSwitch.subtitle;
            }
            if ((i & 4) != 0) {
                str3 = marketplaceFilterSwitch.imageUrl;
            }
            if ((i & 8) != 0) {
                buttonCta = marketplaceFilterSwitch.buttonCta;
            }
            if ((i & 16) != 0) {
                z = marketplaceFilterSwitch.value;
            }
            boolean z2 = z;
            String str4 = str3;
            return marketplaceFilterSwitch.copy(str, str2, str4, buttonCta, z2);
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
        public final String getImageUrl() {
            return this.imageUrl;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final ButtonCta getButtonCta() {
            return this.buttonCta;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getValue() {
            return this.value;
        }

        @NotNull
        public final MarketplaceFilterSwitch copy(@NotNull String title, @Nullable String subtitle, @Nullable String imageUrl, @Nullable ButtonCta buttonCta, boolean value) {
            Intrinsics.h(title, "title");
            return new MarketplaceFilterSwitch(title, subtitle, imageUrl, buttonCta, value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MarketplaceFilterSwitch)) {
                return false;
            }
            MarketplaceFilterSwitch marketplaceFilterSwitch = (MarketplaceFilterSwitch) other;
            return Intrinsics.c(this.title, marketplaceFilterSwitch.title) && Intrinsics.c(this.subtitle, marketplaceFilterSwitch.subtitle) && Intrinsics.c(this.imageUrl, marketplaceFilterSwitch.imageUrl) && Intrinsics.c(this.buttonCta, marketplaceFilterSwitch.buttonCta) && this.value == marketplaceFilterSwitch.value;
        }

        @Nullable
        public final ButtonCta getButtonCta() {
            return this.buttonCta;
        }

        @Nullable
        public final String getImageUrl() {
            return this.imageUrl;
        }

        @Nullable
        public final String getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final boolean getValue() {
            return this.value;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.imageUrl;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            ButtonCta buttonCta = this.buttonCta;
            return Boolean.hashCode(this.value) + ((iHashCode3 + (buttonCta != null ? buttonCta.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.subtitle;
            String str3 = this.imageUrl;
            ButtonCta buttonCta = this.buttonCta;
            boolean z = this.value;
            StringBuilder sbV = YU.a.v("MarketplaceFilterSwitch(title=", str, ", subtitle=", str2, ", imageUrl=");
            sbV.append(str3);
            sbV.append(", buttonCta=");
            sbV.append(buttonCta);
            sbV.append(", value=");
            return YU.a.k(")", sbV, z);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$MarketplaceInfo;", "", "title", "", "items", "", "Lcom/woolworths/product/list/legacy/ProductListQuery$Item1;", "footer", "Lcom/woolworths/product/list/legacy/ProductListQuery$Footer;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/woolworths/product/list/legacy/ProductListQuery$Footer;)V", "getTitle", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "getFooter", "()Lcom/woolworths/product/list/legacy/ProductListQuery$Footer;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MarketplaceInfo {
        public static final int $stable = 8;

        @Nullable
        private final Footer footer;

        @NotNull
        private final List<Item1> items;

        @NotNull
        private final String title;

        public MarketplaceInfo(@NotNull String title, @NotNull List<Item1> items, @Nullable Footer footer) {
            Intrinsics.h(title, "title");
            Intrinsics.h(items, "items");
            this.title = title;
            this.items = items;
            this.footer = footer;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MarketplaceInfo copy$default(MarketplaceInfo marketplaceInfo, String str, List list, Footer footer, int i, Object obj) {
            if ((i & 1) != 0) {
                str = marketplaceInfo.title;
            }
            if ((i & 2) != 0) {
                list = marketplaceInfo.items;
            }
            if ((i & 4) != 0) {
                footer = marketplaceInfo.footer;
            }
            return marketplaceInfo.copy(str, list, footer);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final List<Item1> component2() {
            return this.items;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final Footer getFooter() {
            return this.footer;
        }

        @NotNull
        public final MarketplaceInfo copy(@NotNull String title, @NotNull List<Item1> items, @Nullable Footer footer) {
            Intrinsics.h(title, "title");
            Intrinsics.h(items, "items");
            return new MarketplaceInfo(title, items, footer);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MarketplaceInfo)) {
                return false;
            }
            MarketplaceInfo marketplaceInfo = (MarketplaceInfo) other;
            return Intrinsics.c(this.title, marketplaceInfo.title) && Intrinsics.c(this.items, marketplaceInfo.items) && Intrinsics.c(this.footer, marketplaceInfo.footer);
        }

        @Nullable
        public final Footer getFooter() {
            return this.footer;
        }

        @NotNull
        public final List<Item1> getItems() {
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
            List<Item1> list = this.items;
            Footer footer = this.footer;
            StringBuilder sbS = au.com.woolworths.android.onesite.a.s("MarketplaceInfo(title=", str, ", items=", ", footer=", list);
            sbS.append(footer);
            sbS.append(")");
            return sbS.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J?\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$MerchCardAction;", "", "__typename", "", "type", "Lau/com/woolworths/shop/graphql/type/ActionType;", UrlHandler.ACTION, "id", "analytics", "Lcom/woolworths/product/list/legacy/ProductListQuery$Analytics5;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/shop/graphql/type/ActionType;Ljava/lang/String;Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductListQuery$Analytics5;)V", "get__typename", "()Ljava/lang/String;", "getType", "()Lau/com/woolworths/shop/graphql/type/ActionType;", "getAction", "getId", "getAnalytics", "()Lcom/woolworths/product/list/legacy/ProductListQuery$Analytics5;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MerchCardAction {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final String action;

        @Nullable
        private final Analytics5 analytics;

        @Nullable
        private final String id;

        @NotNull
        private final ActionType type;

        public MerchCardAction(@NotNull String __typename, @NotNull ActionType type, @NotNull String action, @Nullable String str, @Nullable Analytics5 analytics5) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(type, "type");
            Intrinsics.h(action, "action");
            this.__typename = __typename;
            this.type = type;
            this.action = action;
            this.id = str;
            this.analytics = analytics5;
        }

        public static /* synthetic */ MerchCardAction copy$default(MerchCardAction merchCardAction, String str, ActionType actionType, String str2, String str3, Analytics5 analytics5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = merchCardAction.__typename;
            }
            if ((i & 2) != 0) {
                actionType = merchCardAction.type;
            }
            if ((i & 4) != 0) {
                str2 = merchCardAction.action;
            }
            if ((i & 8) != 0) {
                str3 = merchCardAction.id;
            }
            if ((i & 16) != 0) {
                analytics5 = merchCardAction.analytics;
            }
            Analytics5 analytics52 = analytics5;
            String str4 = str2;
            return merchCardAction.copy(str, actionType, str4, str3, analytics52);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ActionType getType() {
            return this.type;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final Analytics5 getAnalytics() {
            return this.analytics;
        }

        @NotNull
        public final MerchCardAction copy(@NotNull String __typename, @NotNull ActionType type, @NotNull String action, @Nullable String id, @Nullable Analytics5 analytics) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(type, "type");
            Intrinsics.h(action, "action");
            return new MerchCardAction(__typename, type, action, id, analytics);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MerchCardAction)) {
                return false;
            }
            MerchCardAction merchCardAction = (MerchCardAction) other;
            return Intrinsics.c(this.__typename, merchCardAction.__typename) && this.type == merchCardAction.type && Intrinsics.c(this.action, merchCardAction.action) && Intrinsics.c(this.id, merchCardAction.id) && Intrinsics.c(this.analytics, merchCardAction.analytics);
        }

        @NotNull
        public final String getAction() {
            return this.action;
        }

        @Nullable
        public final Analytics5 getAnalytics() {
            return this.analytics;
        }

        @Nullable
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final ActionType getType() {
            return this.type;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int iC = b.c(d.a(this.type, this.__typename.hashCode() * 31, 31), 31, this.action);
            String str = this.id;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            Analytics5 analytics5 = this.analytics;
            return iHashCode + (analytics5 != null ? analytics5.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.__typename;
            ActionType actionType = this.type;
            String str2 = this.action;
            String str3 = this.id;
            Analytics5 analytics5 = this.analytics;
            StringBuilder sbW = d.w("MerchCardAction(__typename=", str, ", type=", actionType, ", action=");
            a.B(sbW, str2, ", id=", str3, ", analytics=");
            sbW.append(analytics5);
            sbW.append(")");
            return sbW.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$MerchCardAnalytics;", "", "__typename", "", "analyticsFields", "Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;)V", "get__typename", "()Ljava/lang/String;", "getAnalyticsFields", "()Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MerchCardAnalytics {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final AnalyticsFields analyticsFields;

        public MerchCardAnalytics(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            this.__typename = __typename;
            this.analyticsFields = analyticsFields;
        }

        public static /* synthetic */ MerchCardAnalytics copy$default(MerchCardAnalytics merchCardAnalytics, String str, AnalyticsFields analyticsFields, int i, Object obj) {
            if ((i & 1) != 0) {
                str = merchCardAnalytics.__typename;
            }
            if ((i & 2) != 0) {
                analyticsFields = merchCardAnalytics.analyticsFields;
            }
            return merchCardAnalytics.copy(str, analyticsFields);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final MerchCardAnalytics copy(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            return new MerchCardAnalytics(__typename, analyticsFields);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MerchCardAnalytics)) {
                return false;
            }
            MerchCardAnalytics merchCardAnalytics = (MerchCardAnalytics) other;
            return Intrinsics.c(this.__typename, merchCardAnalytics.__typename) && Intrinsics.c(this.analyticsFields, merchCardAnalytics.analyticsFields);
        }

        @NotNull
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.analyticsFields.hashCode() + (this.__typename.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return d.p("MerchCardAnalytics(__typename=", this.__typename, ", analyticsFields=", this.analyticsFields, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003Jc\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010%\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$MerchCardButton;", "", "__typename", "", "buttonId", AnnotatedPrivateKey.LABEL, "style", "Lau/com/woolworths/shop/graphql/type/ButtonStyle;", "enabled", "", "iconUrl", "altText", "buttonAction", "Lcom/woolworths/product/list/legacy/ProductListQuery$ButtonAction1;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/shop/graphql/type/ButtonStyle;ZLjava/lang/String;Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductListQuery$ButtonAction1;)V", "get__typename", "()Ljava/lang/String;", "getButtonId", "getLabel", "getStyle", "()Lau/com/woolworths/shop/graphql/type/ButtonStyle;", "getEnabled", "()Z", "getIconUrl", "getAltText", "getButtonAction", "()Lcom/woolworths/product/list/legacy/ProductListQuery$ButtonAction1;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MerchCardButton {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @Nullable
        private final String altText;

        @Nullable
        private final ButtonAction1 buttonAction;

        @Nullable
        private final String buttonId;
        private final boolean enabled;

        @Nullable
        private final String iconUrl;

        @NotNull
        private final String label;

        @Nullable
        private final ButtonStyle style;

        public MerchCardButton(@NotNull String __typename, @Nullable String str, @NotNull String label, @Nullable ButtonStyle buttonStyle, boolean z, @Nullable String str2, @Nullable String str3, @Nullable ButtonAction1 buttonAction1) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(label, "label");
            this.__typename = __typename;
            this.buttonId = str;
            this.label = label;
            this.style = buttonStyle;
            this.enabled = z;
            this.iconUrl = str2;
            this.altText = str3;
            this.buttonAction = buttonAction1;
        }

        public static /* synthetic */ MerchCardButton copy$default(MerchCardButton merchCardButton, String str, String str2, String str3, ButtonStyle buttonStyle, boolean z, String str4, String str5, ButtonAction1 buttonAction1, int i, Object obj) {
            if ((i & 1) != 0) {
                str = merchCardButton.__typename;
            }
            if ((i & 2) != 0) {
                str2 = merchCardButton.buttonId;
            }
            if ((i & 4) != 0) {
                str3 = merchCardButton.label;
            }
            if ((i & 8) != 0) {
                buttonStyle = merchCardButton.style;
            }
            if ((i & 16) != 0) {
                z = merchCardButton.enabled;
            }
            if ((i & 32) != 0) {
                str4 = merchCardButton.iconUrl;
            }
            if ((i & 64) != 0) {
                str5 = merchCardButton.altText;
            }
            if ((i & 128) != 0) {
                buttonAction1 = merchCardButton.buttonAction;
            }
            String str6 = str5;
            ButtonAction1 buttonAction12 = buttonAction1;
            boolean z2 = z;
            String str7 = str4;
            return merchCardButton.copy(str, str2, str3, buttonStyle, z2, str7, str6, buttonAction12);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getButtonId() {
            return this.buttonId;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final ButtonStyle getStyle() {
            return this.style;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        @Nullable
        /* renamed from: component7, reason: from getter */
        public final String getAltText() {
            return this.altText;
        }

        @Nullable
        /* renamed from: component8, reason: from getter */
        public final ButtonAction1 getButtonAction() {
            return this.buttonAction;
        }

        @NotNull
        public final MerchCardButton copy(@NotNull String __typename, @Nullable String buttonId, @NotNull String label, @Nullable ButtonStyle style, boolean enabled, @Nullable String iconUrl, @Nullable String altText, @Nullable ButtonAction1 buttonAction) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(label, "label");
            return new MerchCardButton(__typename, buttonId, label, style, enabled, iconUrl, altText, buttonAction);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MerchCardButton)) {
                return false;
            }
            MerchCardButton merchCardButton = (MerchCardButton) other;
            return Intrinsics.c(this.__typename, merchCardButton.__typename) && Intrinsics.c(this.buttonId, merchCardButton.buttonId) && Intrinsics.c(this.label, merchCardButton.label) && this.style == merchCardButton.style && this.enabled == merchCardButton.enabled && Intrinsics.c(this.iconUrl, merchCardButton.iconUrl) && Intrinsics.c(this.altText, merchCardButton.altText) && Intrinsics.c(this.buttonAction, merchCardButton.buttonAction);
        }

        @Nullable
        public final String getAltText() {
            return this.altText;
        }

        @Nullable
        public final ButtonAction1 getButtonAction() {
            return this.buttonAction;
        }

        @Nullable
        public final String getButtonId() {
            return this.buttonId;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        @Nullable
        public final String getIconUrl() {
            return this.iconUrl;
        }

        @NotNull
        public final String getLabel() {
            return this.label;
        }

        @Nullable
        public final ButtonStyle getStyle() {
            return this.style;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int iHashCode = this.__typename.hashCode() * 31;
            String str = this.buttonId;
            int iC = b.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.label);
            ButtonStyle buttonStyle = this.style;
            int iE = b.e((iC + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31, 31, this.enabled);
            String str2 = this.iconUrl;
            int iHashCode2 = (iE + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.altText;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            ButtonAction1 buttonAction1 = this.buttonAction;
            return iHashCode3 + (buttonAction1 != null ? buttonAction1.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.__typename;
            String str2 = this.buttonId;
            String str3 = this.label;
            ButtonStyle buttonStyle = this.style;
            boolean z = this.enabled;
            String str4 = this.iconUrl;
            String str5 = this.altText;
            ButtonAction1 buttonAction1 = this.buttonAction;
            StringBuilder sbV = YU.a.v("MerchCardButton(__typename=", str, ", buttonId=", str2, ", label=");
            sbV.append(str3);
            sbV.append(", style=");
            sbV.append(buttonStyle);
            sbV.append(", enabled=");
            au.com.woolworths.android.onesite.a.y(", iconUrl=", str4, ", altText=", sbV, z);
            sbV.append(str5);
            sbV.append(", buttonAction=");
            sbV.append(buttonAction1);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$MerchCardFullImageAction;", "", "__typename", "", "type", "Lau/com/woolworths/shop/graphql/type/ActionType;", UrlHandler.ACTION, "<init>", "(Ljava/lang/String;Lau/com/woolworths/shop/graphql/type/ActionType;Ljava/lang/String;)V", "get__typename", "()Ljava/lang/String;", "getType", "()Lau/com/woolworths/shop/graphql/type/ActionType;", "getAction", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MerchCardFullImageAction {
        public static final int $stable = 0;

        @NotNull
        private final String __typename;

        @NotNull
        private final String action;

        @NotNull
        private final ActionType type;

        public MerchCardFullImageAction(@NotNull String __typename, @NotNull ActionType type, @NotNull String action) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(type, "type");
            Intrinsics.h(action, "action");
            this.__typename = __typename;
            this.type = type;
            this.action = action;
        }

        public static /* synthetic */ MerchCardFullImageAction copy$default(MerchCardFullImageAction merchCardFullImageAction, String str, ActionType actionType, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = merchCardFullImageAction.__typename;
            }
            if ((i & 2) != 0) {
                actionType = merchCardFullImageAction.type;
            }
            if ((i & 4) != 0) {
                str2 = merchCardFullImageAction.action;
            }
            return merchCardFullImageAction.copy(str, actionType, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ActionType getType() {
            return this.type;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        @NotNull
        public final MerchCardFullImageAction copy(@NotNull String __typename, @NotNull ActionType type, @NotNull String action) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(type, "type");
            Intrinsics.h(action, "action");
            return new MerchCardFullImageAction(__typename, type, action);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MerchCardFullImageAction)) {
                return false;
            }
            MerchCardFullImageAction merchCardFullImageAction = (MerchCardFullImageAction) other;
            return Intrinsics.c(this.__typename, merchCardFullImageAction.__typename) && this.type == merchCardFullImageAction.type && Intrinsics.c(this.action, merchCardFullImageAction.action);
        }

        @NotNull
        public final String getAction() {
            return this.action;
        }

        @NotNull
        public final ActionType getType() {
            return this.type;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.action.hashCode() + d.a(this.type, this.__typename.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            String str = this.__typename;
            ActionType actionType = this.type;
            return YU.a.o(d.w("MerchCardFullImageAction(__typename=", str, ", type=", actionType, ", action="), this.action, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$MerchCardFullImageBackgroundImageWithAlt;", "", "__typename", "", "imageUrl", "altText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "get__typename", "()Ljava/lang/String;", "getImageUrl", "getAltText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MerchCardFullImageBackgroundImageWithAlt {
        public static final int $stable = 0;

        @NotNull
        private final String __typename;

        @NotNull
        private final String altText;

        @NotNull
        private final String imageUrl;

        public MerchCardFullImageBackgroundImageWithAlt(@NotNull String __typename, @NotNull String imageUrl, @NotNull String altText) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(imageUrl, "imageUrl");
            Intrinsics.h(altText, "altText");
            this.__typename = __typename;
            this.imageUrl = imageUrl;
            this.altText = altText;
        }

        public static /* synthetic */ MerchCardFullImageBackgroundImageWithAlt copy$default(MerchCardFullImageBackgroundImageWithAlt merchCardFullImageBackgroundImageWithAlt, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = merchCardFullImageBackgroundImageWithAlt.__typename;
            }
            if ((i & 2) != 0) {
                str2 = merchCardFullImageBackgroundImageWithAlt.imageUrl;
            }
            if ((i & 4) != 0) {
                str3 = merchCardFullImageBackgroundImageWithAlt.altText;
            }
            return merchCardFullImageBackgroundImageWithAlt.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getAltText() {
            return this.altText;
        }

        @NotNull
        public final MerchCardFullImageBackgroundImageWithAlt copy(@NotNull String __typename, @NotNull String imageUrl, @NotNull String altText) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(imageUrl, "imageUrl");
            Intrinsics.h(altText, "altText");
            return new MerchCardFullImageBackgroundImageWithAlt(__typename, imageUrl, altText);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MerchCardFullImageBackgroundImageWithAlt)) {
                return false;
            }
            MerchCardFullImageBackgroundImageWithAlt merchCardFullImageBackgroundImageWithAlt = (MerchCardFullImageBackgroundImageWithAlt) other;
            return Intrinsics.c(this.__typename, merchCardFullImageBackgroundImageWithAlt.__typename) && Intrinsics.c(this.imageUrl, merchCardFullImageBackgroundImageWithAlt.imageUrl) && Intrinsics.c(this.altText, merchCardFullImageBackgroundImageWithAlt.altText);
        }

        @NotNull
        public final String getAltText() {
            return this.altText;
        }

        @NotNull
        public final String getImageUrl() {
            return this.imageUrl;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.altText.hashCode() + b.c(this.__typename.hashCode() * 31, 31, this.imageUrl);
        }

        @NotNull
        public String toString() {
            String str = this.__typename;
            String str2 = this.imageUrl;
            return YU.a.o(YU.a.v("MerchCardFullImageBackgroundImageWithAlt(__typename=", str, ", imageUrl=", str2, ", altText="), this.altText, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003Jc\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010%\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$MerchCardFullImageButton;", "", "__typename", "", "buttonId", AnnotatedPrivateKey.LABEL, "style", "Lau/com/woolworths/shop/graphql/type/ButtonStyle;", "enabled", "", "iconUrl", "altText", "buttonAction", "Lcom/woolworths/product/list/legacy/ProductListQuery$ButtonAction;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/shop/graphql/type/ButtonStyle;ZLjava/lang/String;Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductListQuery$ButtonAction;)V", "get__typename", "()Ljava/lang/String;", "getButtonId", "getLabel", "getStyle", "()Lau/com/woolworths/shop/graphql/type/ButtonStyle;", "getEnabled", "()Z", "getIconUrl", "getAltText", "getButtonAction", "()Lcom/woolworths/product/list/legacy/ProductListQuery$ButtonAction;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MerchCardFullImageButton {
        public static final int $stable = 0;

        @NotNull
        private final String __typename;

        @Nullable
        private final String altText;

        @Nullable
        private final ButtonAction buttonAction;

        @Nullable
        private final String buttonId;
        private final boolean enabled;

        @Nullable
        private final String iconUrl;

        @NotNull
        private final String label;

        @Nullable
        private final ButtonStyle style;

        public MerchCardFullImageButton(@NotNull String __typename, @Nullable String str, @NotNull String label, @Nullable ButtonStyle buttonStyle, boolean z, @Nullable String str2, @Nullable String str3, @Nullable ButtonAction buttonAction) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(label, "label");
            this.__typename = __typename;
            this.buttonId = str;
            this.label = label;
            this.style = buttonStyle;
            this.enabled = z;
            this.iconUrl = str2;
            this.altText = str3;
            this.buttonAction = buttonAction;
        }

        public static /* synthetic */ MerchCardFullImageButton copy$default(MerchCardFullImageButton merchCardFullImageButton, String str, String str2, String str3, ButtonStyle buttonStyle, boolean z, String str4, String str5, ButtonAction buttonAction, int i, Object obj) {
            if ((i & 1) != 0) {
                str = merchCardFullImageButton.__typename;
            }
            if ((i & 2) != 0) {
                str2 = merchCardFullImageButton.buttonId;
            }
            if ((i & 4) != 0) {
                str3 = merchCardFullImageButton.label;
            }
            if ((i & 8) != 0) {
                buttonStyle = merchCardFullImageButton.style;
            }
            if ((i & 16) != 0) {
                z = merchCardFullImageButton.enabled;
            }
            if ((i & 32) != 0) {
                str4 = merchCardFullImageButton.iconUrl;
            }
            if ((i & 64) != 0) {
                str5 = merchCardFullImageButton.altText;
            }
            if ((i & 128) != 0) {
                buttonAction = merchCardFullImageButton.buttonAction;
            }
            String str6 = str5;
            ButtonAction buttonAction2 = buttonAction;
            boolean z2 = z;
            String str7 = str4;
            return merchCardFullImageButton.copy(str, str2, str3, buttonStyle, z2, str7, str6, buttonAction2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getButtonId() {
            return this.buttonId;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final ButtonStyle getStyle() {
            return this.style;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        @Nullable
        /* renamed from: component7, reason: from getter */
        public final String getAltText() {
            return this.altText;
        }

        @Nullable
        /* renamed from: component8, reason: from getter */
        public final ButtonAction getButtonAction() {
            return this.buttonAction;
        }

        @NotNull
        public final MerchCardFullImageButton copy(@NotNull String __typename, @Nullable String buttonId, @NotNull String label, @Nullable ButtonStyle style, boolean enabled, @Nullable String iconUrl, @Nullable String altText, @Nullable ButtonAction buttonAction) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(label, "label");
            return new MerchCardFullImageButton(__typename, buttonId, label, style, enabled, iconUrl, altText, buttonAction);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MerchCardFullImageButton)) {
                return false;
            }
            MerchCardFullImageButton merchCardFullImageButton = (MerchCardFullImageButton) other;
            return Intrinsics.c(this.__typename, merchCardFullImageButton.__typename) && Intrinsics.c(this.buttonId, merchCardFullImageButton.buttonId) && Intrinsics.c(this.label, merchCardFullImageButton.label) && this.style == merchCardFullImageButton.style && this.enabled == merchCardFullImageButton.enabled && Intrinsics.c(this.iconUrl, merchCardFullImageButton.iconUrl) && Intrinsics.c(this.altText, merchCardFullImageButton.altText) && Intrinsics.c(this.buttonAction, merchCardFullImageButton.buttonAction);
        }

        @Nullable
        public final String getAltText() {
            return this.altText;
        }

        @Nullable
        public final ButtonAction getButtonAction() {
            return this.buttonAction;
        }

        @Nullable
        public final String getButtonId() {
            return this.buttonId;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        @Nullable
        public final String getIconUrl() {
            return this.iconUrl;
        }

        @NotNull
        public final String getLabel() {
            return this.label;
        }

        @Nullable
        public final ButtonStyle getStyle() {
            return this.style;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int iHashCode = this.__typename.hashCode() * 31;
            String str = this.buttonId;
            int iC = b.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.label);
            ButtonStyle buttonStyle = this.style;
            int iE = b.e((iC + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31, 31, this.enabled);
            String str2 = this.iconUrl;
            int iHashCode2 = (iE + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.altText;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            ButtonAction buttonAction = this.buttonAction;
            return iHashCode3 + (buttonAction != null ? buttonAction.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.__typename;
            String str2 = this.buttonId;
            String str3 = this.label;
            ButtonStyle buttonStyle = this.style;
            boolean z = this.enabled;
            String str4 = this.iconUrl;
            String str5 = this.altText;
            ButtonAction buttonAction = this.buttonAction;
            StringBuilder sbV = YU.a.v("MerchCardFullImageButton(__typename=", str, ", buttonId=", str2, ", label=");
            sbV.append(str3);
            sbV.append(", style=");
            sbV.append(buttonStyle);
            sbV.append(", enabled=");
            au.com.woolworths.android.onesite.a.y(", iconUrl=", str4, ", altText=", sbV, z);
            sbV.append(str5);
            sbV.append(", buttonAction=");
            sbV.append(buttonAction);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$MerchCardGridImageWithAlt;", "", "__typename", "", "imageUrl", "altText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "get__typename", "()Ljava/lang/String;", "getImageUrl", "getAltText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MerchCardGridImageWithAlt {
        public static final int $stable = 0;

        @NotNull
        private final String __typename;

        @NotNull
        private final String altText;

        @NotNull
        private final String imageUrl;

        public MerchCardGridImageWithAlt(@NotNull String __typename, @NotNull String imageUrl, @NotNull String altText) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(imageUrl, "imageUrl");
            Intrinsics.h(altText, "altText");
            this.__typename = __typename;
            this.imageUrl = imageUrl;
            this.altText = altText;
        }

        public static /* synthetic */ MerchCardGridImageWithAlt copy$default(MerchCardGridImageWithAlt merchCardGridImageWithAlt, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = merchCardGridImageWithAlt.__typename;
            }
            if ((i & 2) != 0) {
                str2 = merchCardGridImageWithAlt.imageUrl;
            }
            if ((i & 4) != 0) {
                str3 = merchCardGridImageWithAlt.altText;
            }
            return merchCardGridImageWithAlt.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getAltText() {
            return this.altText;
        }

        @NotNull
        public final MerchCardGridImageWithAlt copy(@NotNull String __typename, @NotNull String imageUrl, @NotNull String altText) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(imageUrl, "imageUrl");
            Intrinsics.h(altText, "altText");
            return new MerchCardGridImageWithAlt(__typename, imageUrl, altText);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MerchCardGridImageWithAlt)) {
                return false;
            }
            MerchCardGridImageWithAlt merchCardGridImageWithAlt = (MerchCardGridImageWithAlt) other;
            return Intrinsics.c(this.__typename, merchCardGridImageWithAlt.__typename) && Intrinsics.c(this.imageUrl, merchCardGridImageWithAlt.imageUrl) && Intrinsics.c(this.altText, merchCardGridImageWithAlt.altText);
        }

        @NotNull
        public final String getAltText() {
            return this.altText;
        }

        @NotNull
        public final String getImageUrl() {
            return this.imageUrl;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.altText.hashCode() + b.c(this.__typename.hashCode() * 31, 31, this.imageUrl);
        }

        @NotNull
        public String toString() {
            String str = this.__typename;
            String str2 = this.imageUrl;
            return YU.a.o(YU.a.v("MerchCardGridImageWithAlt(__typename=", str, ", imageUrl=", str2, ", altText="), this.altText, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$MerchCardImpressionAnalytics;", "", "__typename", "", "analyticsFields", "Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;)V", "get__typename", "()Ljava/lang/String;", "getAnalyticsFields", "()Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MerchCardImpressionAnalytics {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final AnalyticsFields analyticsFields;

        public MerchCardImpressionAnalytics(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            this.__typename = __typename;
            this.analyticsFields = analyticsFields;
        }

        public static /* synthetic */ MerchCardImpressionAnalytics copy$default(MerchCardImpressionAnalytics merchCardImpressionAnalytics, String str, AnalyticsFields analyticsFields, int i, Object obj) {
            if ((i & 1) != 0) {
                str = merchCardImpressionAnalytics.__typename;
            }
            if ((i & 2) != 0) {
                analyticsFields = merchCardImpressionAnalytics.analyticsFields;
            }
            return merchCardImpressionAnalytics.copy(str, analyticsFields);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final MerchCardImpressionAnalytics copy(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            return new MerchCardImpressionAnalytics(__typename, analyticsFields);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MerchCardImpressionAnalytics)) {
                return false;
            }
            MerchCardImpressionAnalytics merchCardImpressionAnalytics = (MerchCardImpressionAnalytics) other;
            return Intrinsics.c(this.__typename, merchCardImpressionAnalytics.__typename) && Intrinsics.c(this.analyticsFields, merchCardImpressionAnalytics.analyticsFields);
        }

        @NotNull
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.analyticsFields.hashCode() + (this.__typename.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return d.p("MerchCardImpressionAnalytics(__typename=", this.__typename, ", analyticsFields=", this.analyticsFields, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$MerchCardListImageWithAlt;", "", "__typename", "", "imageUrl", "altText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "get__typename", "()Ljava/lang/String;", "getImageUrl", "getAltText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MerchCardListImageWithAlt {
        public static final int $stable = 0;

        @NotNull
        private final String __typename;

        @NotNull
        private final String altText;

        @NotNull
        private final String imageUrl;

        public MerchCardListImageWithAlt(@NotNull String __typename, @NotNull String imageUrl, @NotNull String altText) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(imageUrl, "imageUrl");
            Intrinsics.h(altText, "altText");
            this.__typename = __typename;
            this.imageUrl = imageUrl;
            this.altText = altText;
        }

        public static /* synthetic */ MerchCardListImageWithAlt copy$default(MerchCardListImageWithAlt merchCardListImageWithAlt, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = merchCardListImageWithAlt.__typename;
            }
            if ((i & 2) != 0) {
                str2 = merchCardListImageWithAlt.imageUrl;
            }
            if ((i & 4) != 0) {
                str3 = merchCardListImageWithAlt.altText;
            }
            return merchCardListImageWithAlt.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getAltText() {
            return this.altText;
        }

        @NotNull
        public final MerchCardListImageWithAlt copy(@NotNull String __typename, @NotNull String imageUrl, @NotNull String altText) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(imageUrl, "imageUrl");
            Intrinsics.h(altText, "altText");
            return new MerchCardListImageWithAlt(__typename, imageUrl, altText);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MerchCardListImageWithAlt)) {
                return false;
            }
            MerchCardListImageWithAlt merchCardListImageWithAlt = (MerchCardListImageWithAlt) other;
            return Intrinsics.c(this.__typename, merchCardListImageWithAlt.__typename) && Intrinsics.c(this.imageUrl, merchCardListImageWithAlt.imageUrl) && Intrinsics.c(this.altText, merchCardListImageWithAlt.altText);
        }

        @NotNull
        public final String getAltText() {
            return this.altText;
        }

        @NotNull
        public final String getImageUrl() {
            return this.imageUrl;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.altText.hashCode() + b.c(this.__typename.hashCode() * 31, 31, this.imageUrl);
        }

        @NotNull
        public String toString() {
            String str = this.__typename;
            String str2 = this.imageUrl;
            return YU.a.o(YU.a.v("MerchCardListImageWithAlt(__typename=", str, ", imageUrl=", str2, ", altText="), this.altText, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$NextBestAction;", "", "__typename", "", "onActionableCard", "Lcom/woolworths/product/list/legacy/ProductListQuery$OnActionableCard1;", "onEdrOfferBanner", "Lcom/woolworths/product/list/legacy/ProductListQuery$OnEdrOfferBanner;", "onPersonalisedProductsBanner", "Lcom/woolworths/product/list/legacy/ProductListQuery$OnPersonalisedProductsBanner;", "<init>", "(Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductListQuery$OnActionableCard1;Lcom/woolworths/product/list/legacy/ProductListQuery$OnEdrOfferBanner;Lcom/woolworths/product/list/legacy/ProductListQuery$OnPersonalisedProductsBanner;)V", "get__typename", "()Ljava/lang/String;", "getOnActionableCard", "()Lcom/woolworths/product/list/legacy/ProductListQuery$OnActionableCard1;", "getOnEdrOfferBanner", "()Lcom/woolworths/product/list/legacy/ProductListQuery$OnEdrOfferBanner;", "getOnPersonalisedProductsBanner", "()Lcom/woolworths/product/list/legacy/ProductListQuery$OnPersonalisedProductsBanner;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NextBestAction {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @Nullable
        private final OnActionableCard1 onActionableCard;

        @Nullable
        private final OnEdrOfferBanner onEdrOfferBanner;

        @Nullable
        private final OnPersonalisedProductsBanner onPersonalisedProductsBanner;

        public NextBestAction(@NotNull String __typename, @Nullable OnActionableCard1 onActionableCard1, @Nullable OnEdrOfferBanner onEdrOfferBanner, @Nullable OnPersonalisedProductsBanner onPersonalisedProductsBanner) {
            Intrinsics.h(__typename, "__typename");
            this.__typename = __typename;
            this.onActionableCard = onActionableCard1;
            this.onEdrOfferBanner = onEdrOfferBanner;
            this.onPersonalisedProductsBanner = onPersonalisedProductsBanner;
        }

        public static /* synthetic */ NextBestAction copy$default(NextBestAction nextBestAction, String str, OnActionableCard1 onActionableCard1, OnEdrOfferBanner onEdrOfferBanner, OnPersonalisedProductsBanner onPersonalisedProductsBanner, int i, Object obj) {
            if ((i & 1) != 0) {
                str = nextBestAction.__typename;
            }
            if ((i & 2) != 0) {
                onActionableCard1 = nextBestAction.onActionableCard;
            }
            if ((i & 4) != 0) {
                onEdrOfferBanner = nextBestAction.onEdrOfferBanner;
            }
            if ((i & 8) != 0) {
                onPersonalisedProductsBanner = nextBestAction.onPersonalisedProductsBanner;
            }
            return nextBestAction.copy(str, onActionableCard1, onEdrOfferBanner, onPersonalisedProductsBanner);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final OnActionableCard1 getOnActionableCard() {
            return this.onActionableCard;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final OnEdrOfferBanner getOnEdrOfferBanner() {
            return this.onEdrOfferBanner;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final OnPersonalisedProductsBanner getOnPersonalisedProductsBanner() {
            return this.onPersonalisedProductsBanner;
        }

        @NotNull
        public final NextBestAction copy(@NotNull String __typename, @Nullable OnActionableCard1 onActionableCard, @Nullable OnEdrOfferBanner onEdrOfferBanner, @Nullable OnPersonalisedProductsBanner onPersonalisedProductsBanner) {
            Intrinsics.h(__typename, "__typename");
            return new NextBestAction(__typename, onActionableCard, onEdrOfferBanner, onPersonalisedProductsBanner);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NextBestAction)) {
                return false;
            }
            NextBestAction nextBestAction = (NextBestAction) other;
            return Intrinsics.c(this.__typename, nextBestAction.__typename) && Intrinsics.c(this.onActionableCard, nextBestAction.onActionableCard) && Intrinsics.c(this.onEdrOfferBanner, nextBestAction.onEdrOfferBanner) && Intrinsics.c(this.onPersonalisedProductsBanner, nextBestAction.onPersonalisedProductsBanner);
        }

        @Nullable
        public final OnActionableCard1 getOnActionableCard() {
            return this.onActionableCard;
        }

        @Nullable
        public final OnEdrOfferBanner getOnEdrOfferBanner() {
            return this.onEdrOfferBanner;
        }

        @Nullable
        public final OnPersonalisedProductsBanner getOnPersonalisedProductsBanner() {
            return this.onPersonalisedProductsBanner;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int iHashCode = this.__typename.hashCode() * 31;
            OnActionableCard1 onActionableCard1 = this.onActionableCard;
            int iHashCode2 = (iHashCode + (onActionableCard1 == null ? 0 : onActionableCard1.hashCode())) * 31;
            OnEdrOfferBanner onEdrOfferBanner = this.onEdrOfferBanner;
            int iHashCode3 = (iHashCode2 + (onEdrOfferBanner == null ? 0 : onEdrOfferBanner.hashCode())) * 31;
            OnPersonalisedProductsBanner onPersonalisedProductsBanner = this.onPersonalisedProductsBanner;
            return iHashCode3 + (onPersonalisedProductsBanner != null ? onPersonalisedProductsBanner.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "NextBestAction(__typename=" + this.__typename + ", onActionableCard=" + this.onActionableCard + ", onEdrOfferBanner=" + this.onEdrOfferBanner + ", onPersonalisedProductsBanner=" + this.onPersonalisedProductsBanner + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0017JN\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$OnActionableCard;", "", "image", "", "altText", "cardHeight", "Lau/com/woolworths/shop/graphql/type/CardHeight;", "link", "analytics", "Lau/com/woolworths/analytics/graphql/TealiumAnalytics;", "_excluded", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/shop/graphql/type/CardHeight;Ljava/lang/String;Lau/com/woolworths/analytics/graphql/TealiumAnalytics;Ljava/lang/Boolean;)V", "getImage", "()Ljava/lang/String;", "getAltText", "getCardHeight", "()Lau/com/woolworths/shop/graphql/type/CardHeight;", "getLink", "getAnalytics", "()Lau/com/woolworths/analytics/graphql/TealiumAnalytics;", "get_excluded", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/shop/graphql/type/CardHeight;Ljava/lang/String;Lau/com/woolworths/analytics/graphql/TealiumAnalytics;Ljava/lang/Boolean;)Lcom/woolworths/product/list/legacy/ProductListQuery$OnActionableCard;", "equals", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0019JX\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019¨\u0006)"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$OnActionableCard1;", "", "__typename", "", "link", "image", "altText", "cardHeight", "Lau/com/woolworths/shop/graphql/type/CardHeight;", "analytics", "Lau/com/woolworths/analytics/graphql/TealiumAnalytics;", "_excluded", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/shop/graphql/type/CardHeight;Lau/com/woolworths/analytics/graphql/TealiumAnalytics;Ljava/lang/Boolean;)V", "get__typename", "()Ljava/lang/String;", "getLink", "getImage", "getAltText", "getCardHeight", "()Lau/com/woolworths/shop/graphql/type/CardHeight;", "getAnalytics", "()Lau/com/woolworths/analytics/graphql/TealiumAnalytics;", "get_excluded", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/shop/graphql/type/CardHeight;Lau/com/woolworths/analytics/graphql/TealiumAnalytics;Ljava/lang/Boolean;)Lcom/woolworths/product/list/legacy/ProductListQuery$OnActionableCard1;", "equals", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnActionableCard1 {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

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

        public OnActionableCard1(@NotNull String __typename, @NotNull String link, @NotNull String image, @NotNull String altText, @NotNull CardHeight cardHeight, @Nullable TealiumAnalytics tealiumAnalytics, @Nullable Boolean bool) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(link, "link");
            Intrinsics.h(image, "image");
            Intrinsics.h(altText, "altText");
            Intrinsics.h(cardHeight, "cardHeight");
            this.__typename = __typename;
            this.link = link;
            this.image = image;
            this.altText = altText;
            this.cardHeight = cardHeight;
            this.analytics = tealiumAnalytics;
            this._excluded = bool;
        }

        public static /* synthetic */ OnActionableCard1 copy$default(OnActionableCard1 onActionableCard1, String str, String str2, String str3, String str4, CardHeight cardHeight, TealiumAnalytics tealiumAnalytics, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onActionableCard1.__typename;
            }
            if ((i & 2) != 0) {
                str2 = onActionableCard1.link;
            }
            if ((i & 4) != 0) {
                str3 = onActionableCard1.image;
            }
            if ((i & 8) != 0) {
                str4 = onActionableCard1.altText;
            }
            if ((i & 16) != 0) {
                cardHeight = onActionableCard1.cardHeight;
            }
            if ((i & 32) != 0) {
                tealiumAnalytics = onActionableCard1.analytics;
            }
            if ((i & 64) != 0) {
                bool = onActionableCard1._excluded;
            }
            TealiumAnalytics tealiumAnalytics2 = tealiumAnalytics;
            Boolean bool2 = bool;
            CardHeight cardHeight2 = cardHeight;
            String str5 = str3;
            return onActionableCard1.copy(str, str2, str5, str4, cardHeight2, tealiumAnalytics2, bool2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getLink() {
            return this.link;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getAltText() {
            return this.altText;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final CardHeight getCardHeight() {
            return this.cardHeight;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final TealiumAnalytics getAnalytics() {
            return this.analytics;
        }

        @Nullable
        /* renamed from: component7, reason: from getter */
        public final Boolean get_excluded() {
            return this._excluded;
        }

        @NotNull
        public final OnActionableCard1 copy(@NotNull String __typename, @NotNull String link, @NotNull String image, @NotNull String altText, @NotNull CardHeight cardHeight, @Nullable TealiumAnalytics analytics, @Nullable Boolean _excluded) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(link, "link");
            Intrinsics.h(image, "image");
            Intrinsics.h(altText, "altText");
            Intrinsics.h(cardHeight, "cardHeight");
            return new OnActionableCard1(__typename, link, image, altText, cardHeight, analytics, _excluded);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnActionableCard1)) {
                return false;
            }
            OnActionableCard1 onActionableCard1 = (OnActionableCard1) other;
            return Intrinsics.c(this.__typename, onActionableCard1.__typename) && Intrinsics.c(this.link, onActionableCard1.link) && Intrinsics.c(this.image, onActionableCard1.image) && Intrinsics.c(this.altText, onActionableCard1.altText) && this.cardHeight == onActionableCard1.cardHeight && Intrinsics.c(this.analytics, onActionableCard1.analytics) && Intrinsics.c(this._excluded, onActionableCard1._excluded);
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

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        @Nullable
        public final Boolean get_excluded() {
            return this._excluded;
        }

        public int hashCode() {
            int iB = d.b(this.cardHeight, b.c(b.c(b.c(this.__typename.hashCode() * 31, 31, this.link), 31, this.image), 31, this.altText), 31);
            TealiumAnalytics tealiumAnalytics = this.analytics;
            int iHashCode = (iB + (tealiumAnalytics == null ? 0 : tealiumAnalytics.hashCode())) * 31;
            Boolean bool = this._excluded;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.__typename;
            String str2 = this.link;
            String str3 = this.image;
            String str4 = this.altText;
            CardHeight cardHeight = this.cardHeight;
            TealiumAnalytics tealiumAnalytics = this.analytics;
            Boolean bool = this._excluded;
            StringBuilder sbV = YU.a.v("OnActionableCard1(__typename=", str, ", link=", str2, ", image=");
            a.B(sbV, str3, ", altText=", str4, ", cardHeight=");
            sbV.append(cardHeight);
            sbV.append(", analytics=");
            sbV.append(tealiumAnalytics);
            sbV.append(", _excluded=");
            return au.com.woolworths.android.onesite.a.o(sbV, bool, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$OnAdobeTargetAnalytics;", "", "tnta", "", "pe", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTnta", "()Ljava/lang/String;", "getPe", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnAdobeTargetAnalytics {
        public static final int $stable = 0;

        @Nullable
        private final String pe;

        @Nullable
        private final String tnta;

        public OnAdobeTargetAnalytics(@Nullable String str, @Nullable String str2) {
            this.tnta = str;
            this.pe = str2;
        }

        public static /* synthetic */ OnAdobeTargetAnalytics copy$default(OnAdobeTargetAnalytics onAdobeTargetAnalytics, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onAdobeTargetAnalytics.tnta;
            }
            if ((i & 2) != 0) {
                str2 = onAdobeTargetAnalytics.pe;
            }
            return onAdobeTargetAnalytics.copy(str, str2);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getTnta() {
            return this.tnta;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getPe() {
            return this.pe;
        }

        @NotNull
        public final OnAdobeTargetAnalytics copy(@Nullable String tnta, @Nullable String pe) {
            return new OnAdobeTargetAnalytics(tnta, pe);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnAdobeTargetAnalytics)) {
                return false;
            }
            OnAdobeTargetAnalytics onAdobeTargetAnalytics = (OnAdobeTargetAnalytics) other;
            return Intrinsics.c(this.tnta, onAdobeTargetAnalytics.tnta) && Intrinsics.c(this.pe, onAdobeTargetAnalytics.pe);
        }

        @Nullable
        public final String getPe() {
            return this.pe;
        }

        @Nullable
        public final String getTnta() {
            return this.tnta;
        }

        public int hashCode() {
            String str = this.tnta;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.pe;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return YU.a.j("OnAdobeTargetAnalytics(tnta=", this.tnta, ", pe=", this.pe, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u009f\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020>HÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006@"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$OnEdrOfferBanner;", "", "__typename", "", "offerId", "offerIdV1", "linkedEdrHashCrn", "bannerTitle", "bannerDescription", "bannerIconUrl", "bannerButtonAction", "Lcom/woolworths/product/list/legacy/ProductListQuery$BannerButtonAction;", "bannerButtonLabel", "Lcom/woolworths/product/list/legacy/ProductListQuery$BannerButtonLabel;", "bannerAction", "Lcom/woolworths/product/list/legacy/ProductListQuery$BannerAction;", "bannerAnalytics", "Lcom/woolworths/product/list/legacy/ProductListQuery$BannerAnalytics;", "bannerImpressionAnalytics", "Lcom/woolworths/product/list/legacy/ProductListQuery$BannerImpressionAnalytics;", "commonAnalytics", "Lcom/woolworths/product/list/legacy/ProductListQuery$CommonAnalytics;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductListQuery$BannerButtonAction;Lcom/woolworths/product/list/legacy/ProductListQuery$BannerButtonLabel;Lcom/woolworths/product/list/legacy/ProductListQuery$BannerAction;Lcom/woolworths/product/list/legacy/ProductListQuery$BannerAnalytics;Lcom/woolworths/product/list/legacy/ProductListQuery$BannerImpressionAnalytics;Lcom/woolworths/product/list/legacy/ProductListQuery$CommonAnalytics;)V", "get__typename", "()Ljava/lang/String;", "getOfferId", "getOfferIdV1", "getLinkedEdrHashCrn", "getBannerTitle", "getBannerDescription", "getBannerIconUrl", "getBannerButtonAction", "()Lcom/woolworths/product/list/legacy/ProductListQuery$BannerButtonAction;", "getBannerButtonLabel", "()Lcom/woolworths/product/list/legacy/ProductListQuery$BannerButtonLabel;", "getBannerAction", "()Lcom/woolworths/product/list/legacy/ProductListQuery$BannerAction;", "getBannerAnalytics", "()Lcom/woolworths/product/list/legacy/ProductListQuery$BannerAnalytics;", "getBannerImpressionAnalytics", "()Lcom/woolworths/product/list/legacy/ProductListQuery$BannerImpressionAnalytics;", "getCommonAnalytics", "()Lcom/woolworths/product/list/legacy/ProductListQuery$CommonAnalytics;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnEdrOfferBanner {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @Nullable
        private final BannerAction bannerAction;

        @Nullable
        private final BannerAnalytics bannerAnalytics;

        @Nullable
        private final BannerButtonAction bannerButtonAction;

        @Nullable
        private final BannerButtonLabel bannerButtonLabel;

        @Nullable
        private final String bannerDescription;

        @Nullable
        private final String bannerIconUrl;

        @Nullable
        private final BannerImpressionAnalytics bannerImpressionAnalytics;

        @Nullable
        private final String bannerTitle;

        @Nullable
        private final CommonAnalytics commonAnalytics;

        @NotNull
        private final String linkedEdrHashCrn;

        @NotNull
        private final String offerId;

        @Nullable
        private final String offerIdV1;

        public OnEdrOfferBanner(@NotNull String __typename, @NotNull String offerId, @Nullable String str, @NotNull String linkedEdrHashCrn, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable BannerButtonAction bannerButtonAction, @Nullable BannerButtonLabel bannerButtonLabel, @Nullable BannerAction bannerAction, @Nullable BannerAnalytics bannerAnalytics, @Nullable BannerImpressionAnalytics bannerImpressionAnalytics, @Nullable CommonAnalytics commonAnalytics) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(offerId, "offerId");
            Intrinsics.h(linkedEdrHashCrn, "linkedEdrHashCrn");
            this.__typename = __typename;
            this.offerId = offerId;
            this.offerIdV1 = str;
            this.linkedEdrHashCrn = linkedEdrHashCrn;
            this.bannerTitle = str2;
            this.bannerDescription = str3;
            this.bannerIconUrl = str4;
            this.bannerButtonAction = bannerButtonAction;
            this.bannerButtonLabel = bannerButtonLabel;
            this.bannerAction = bannerAction;
            this.bannerAnalytics = bannerAnalytics;
            this.bannerImpressionAnalytics = bannerImpressionAnalytics;
            this.commonAnalytics = commonAnalytics;
        }

        public static /* synthetic */ OnEdrOfferBanner copy$default(OnEdrOfferBanner onEdrOfferBanner, String str, String str2, String str3, String str4, String str5, String str6, String str7, BannerButtonAction bannerButtonAction, BannerButtonLabel bannerButtonLabel, BannerAction bannerAction, BannerAnalytics bannerAnalytics, BannerImpressionAnalytics bannerImpressionAnalytics, CommonAnalytics commonAnalytics, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onEdrOfferBanner.__typename;
            }
            return onEdrOfferBanner.copy(str, (i & 2) != 0 ? onEdrOfferBanner.offerId : str2, (i & 4) != 0 ? onEdrOfferBanner.offerIdV1 : str3, (i & 8) != 0 ? onEdrOfferBanner.linkedEdrHashCrn : str4, (i & 16) != 0 ? onEdrOfferBanner.bannerTitle : str5, (i & 32) != 0 ? onEdrOfferBanner.bannerDescription : str6, (i & 64) != 0 ? onEdrOfferBanner.bannerIconUrl : str7, (i & 128) != 0 ? onEdrOfferBanner.bannerButtonAction : bannerButtonAction, (i & 256) != 0 ? onEdrOfferBanner.bannerButtonLabel : bannerButtonLabel, (i & 512) != 0 ? onEdrOfferBanner.bannerAction : bannerAction, (i & 1024) != 0 ? onEdrOfferBanner.bannerAnalytics : bannerAnalytics, (i & 2048) != 0 ? onEdrOfferBanner.bannerImpressionAnalytics : bannerImpressionAnalytics, (i & 4096) != 0 ? onEdrOfferBanner.commonAnalytics : commonAnalytics);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @Nullable
        /* renamed from: component10, reason: from getter */
        public final BannerAction getBannerAction() {
            return this.bannerAction;
        }

        @Nullable
        /* renamed from: component11, reason: from getter */
        public final BannerAnalytics getBannerAnalytics() {
            return this.bannerAnalytics;
        }

        @Nullable
        /* renamed from: component12, reason: from getter */
        public final BannerImpressionAnalytics getBannerImpressionAnalytics() {
            return this.bannerImpressionAnalytics;
        }

        @Nullable
        /* renamed from: component13, reason: from getter */
        public final CommonAnalytics getCommonAnalytics() {
            return this.commonAnalytics;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getOfferId() {
            return this.offerId;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getOfferIdV1() {
            return this.offerIdV1;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getLinkedEdrHashCrn() {
            return this.linkedEdrHashCrn;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final String getBannerTitle() {
            return this.bannerTitle;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final String getBannerDescription() {
            return this.bannerDescription;
        }

        @Nullable
        /* renamed from: component7, reason: from getter */
        public final String getBannerIconUrl() {
            return this.bannerIconUrl;
        }

        @Nullable
        /* renamed from: component8, reason: from getter */
        public final BannerButtonAction getBannerButtonAction() {
            return this.bannerButtonAction;
        }

        @Nullable
        /* renamed from: component9, reason: from getter */
        public final BannerButtonLabel getBannerButtonLabel() {
            return this.bannerButtonLabel;
        }

        @NotNull
        public final OnEdrOfferBanner copy(@NotNull String __typename, @NotNull String offerId, @Nullable String offerIdV1, @NotNull String linkedEdrHashCrn, @Nullable String bannerTitle, @Nullable String bannerDescription, @Nullable String bannerIconUrl, @Nullable BannerButtonAction bannerButtonAction, @Nullable BannerButtonLabel bannerButtonLabel, @Nullable BannerAction bannerAction, @Nullable BannerAnalytics bannerAnalytics, @Nullable BannerImpressionAnalytics bannerImpressionAnalytics, @Nullable CommonAnalytics commonAnalytics) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(offerId, "offerId");
            Intrinsics.h(linkedEdrHashCrn, "linkedEdrHashCrn");
            return new OnEdrOfferBanner(__typename, offerId, offerIdV1, linkedEdrHashCrn, bannerTitle, bannerDescription, bannerIconUrl, bannerButtonAction, bannerButtonLabel, bannerAction, bannerAnalytics, bannerImpressionAnalytics, commonAnalytics);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnEdrOfferBanner)) {
                return false;
            }
            OnEdrOfferBanner onEdrOfferBanner = (OnEdrOfferBanner) other;
            return Intrinsics.c(this.__typename, onEdrOfferBanner.__typename) && Intrinsics.c(this.offerId, onEdrOfferBanner.offerId) && Intrinsics.c(this.offerIdV1, onEdrOfferBanner.offerIdV1) && Intrinsics.c(this.linkedEdrHashCrn, onEdrOfferBanner.linkedEdrHashCrn) && Intrinsics.c(this.bannerTitle, onEdrOfferBanner.bannerTitle) && Intrinsics.c(this.bannerDescription, onEdrOfferBanner.bannerDescription) && Intrinsics.c(this.bannerIconUrl, onEdrOfferBanner.bannerIconUrl) && Intrinsics.c(this.bannerButtonAction, onEdrOfferBanner.bannerButtonAction) && Intrinsics.c(this.bannerButtonLabel, onEdrOfferBanner.bannerButtonLabel) && Intrinsics.c(this.bannerAction, onEdrOfferBanner.bannerAction) && Intrinsics.c(this.bannerAnalytics, onEdrOfferBanner.bannerAnalytics) && Intrinsics.c(this.bannerImpressionAnalytics, onEdrOfferBanner.bannerImpressionAnalytics) && Intrinsics.c(this.commonAnalytics, onEdrOfferBanner.commonAnalytics);
        }

        @Nullable
        public final BannerAction getBannerAction() {
            return this.bannerAction;
        }

        @Nullable
        public final BannerAnalytics getBannerAnalytics() {
            return this.bannerAnalytics;
        }

        @Nullable
        public final BannerButtonAction getBannerButtonAction() {
            return this.bannerButtonAction;
        }

        @Nullable
        public final BannerButtonLabel getBannerButtonLabel() {
            return this.bannerButtonLabel;
        }

        @Nullable
        public final String getBannerDescription() {
            return this.bannerDescription;
        }

        @Nullable
        public final String getBannerIconUrl() {
            return this.bannerIconUrl;
        }

        @Nullable
        public final BannerImpressionAnalytics getBannerImpressionAnalytics() {
            return this.bannerImpressionAnalytics;
        }

        @Nullable
        public final String getBannerTitle() {
            return this.bannerTitle;
        }

        @Nullable
        public final CommonAnalytics getCommonAnalytics() {
            return this.commonAnalytics;
        }

        @NotNull
        public final String getLinkedEdrHashCrn() {
            return this.linkedEdrHashCrn;
        }

        @NotNull
        public final String getOfferId() {
            return this.offerId;
        }

        @Nullable
        public final String getOfferIdV1() {
            return this.offerIdV1;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int iC = b.c(this.__typename.hashCode() * 31, 31, this.offerId);
            String str = this.offerIdV1;
            int iC2 = b.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.linkedEdrHashCrn);
            String str2 = this.bannerTitle;
            int iHashCode = (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.bannerDescription;
            int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.bannerIconUrl;
            int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
            BannerButtonAction bannerButtonAction = this.bannerButtonAction;
            int iHashCode4 = (iHashCode3 + (bannerButtonAction == null ? 0 : bannerButtonAction.hashCode())) * 31;
            BannerButtonLabel bannerButtonLabel = this.bannerButtonLabel;
            int iHashCode5 = (iHashCode4 + (bannerButtonLabel == null ? 0 : bannerButtonLabel.hashCode())) * 31;
            BannerAction bannerAction = this.bannerAction;
            int iHashCode6 = (iHashCode5 + (bannerAction == null ? 0 : bannerAction.hashCode())) * 31;
            BannerAnalytics bannerAnalytics = this.bannerAnalytics;
            int iHashCode7 = (iHashCode6 + (bannerAnalytics == null ? 0 : bannerAnalytics.hashCode())) * 31;
            BannerImpressionAnalytics bannerImpressionAnalytics = this.bannerImpressionAnalytics;
            int iHashCode8 = (iHashCode7 + (bannerImpressionAnalytics == null ? 0 : bannerImpressionAnalytics.hashCode())) * 31;
            CommonAnalytics commonAnalytics = this.commonAnalytics;
            return iHashCode8 + (commonAnalytics != null ? commonAnalytics.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.__typename;
            String str2 = this.offerId;
            String str3 = this.offerIdV1;
            String str4 = this.linkedEdrHashCrn;
            String str5 = this.bannerTitle;
            String str6 = this.bannerDescription;
            String str7 = this.bannerIconUrl;
            BannerButtonAction bannerButtonAction = this.bannerButtonAction;
            BannerButtonLabel bannerButtonLabel = this.bannerButtonLabel;
            BannerAction bannerAction = this.bannerAction;
            BannerAnalytics bannerAnalytics = this.bannerAnalytics;
            BannerImpressionAnalytics bannerImpressionAnalytics = this.bannerImpressionAnalytics;
            CommonAnalytics commonAnalytics = this.commonAnalytics;
            StringBuilder sbV = YU.a.v("OnEdrOfferBanner(__typename=", str, ", offerId=", str2, ", offerIdV1=");
            a.B(sbV, str3, ", linkedEdrHashCrn=", str4, ", bannerTitle=");
            a.B(sbV, str5, ", bannerDescription=", str6, ", bannerIconUrl=");
            sbV.append(str7);
            sbV.append(", bannerButtonAction=");
            sbV.append(bannerButtonAction);
            sbV.append(", bannerButtonLabel=");
            sbV.append(bannerButtonLabel);
            sbV.append(", bannerAction=");
            sbV.append(bannerAction);
            sbV.append(", bannerAnalytics=");
            sbV.append(bannerAnalytics);
            sbV.append(", bannerImpressionAnalytics=");
            sbV.append(bannerImpressionAnalytics);
            sbV.append(", commonAnalytics=");
            sbV.append(commonAnalytics);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$OnGoogleAdBannerCard;", "", OutOfContextTestingActivity.AD_UNIT_KEY, "", "nativeCustomTemplateId", "targeting", "Lau/com/woolworths/android/onesite/graphql/GoogleAdCustomTargeting;", "iabSize", "correlator", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/android/onesite/graphql/GoogleAdCustomTargeting;Ljava/lang/String;Ljava/lang/String;)V", "getAdUnit", "()Ljava/lang/String;", "getNativeCustomTemplateId", "getTargeting", "()Lau/com/woolworths/android/onesite/graphql/GoogleAdCustomTargeting;", "getIabSize", "getCorrelator", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnGoogleAdBannerCard {
        public static final int $stable = 8;

        @NotNull
        private final String adUnit;

        @Nullable
        private final String correlator;

        @Nullable
        private final String iabSize;

        @NotNull
        private final String nativeCustomTemplateId;

        @Nullable
        private final GoogleAdCustomTargeting targeting;

        public OnGoogleAdBannerCard(@NotNull String adUnit, @NotNull String nativeCustomTemplateId, @Nullable GoogleAdCustomTargeting googleAdCustomTargeting, @Nullable String str, @Nullable String str2) {
            Intrinsics.h(adUnit, "adUnit");
            Intrinsics.h(nativeCustomTemplateId, "nativeCustomTemplateId");
            this.adUnit = adUnit;
            this.nativeCustomTemplateId = nativeCustomTemplateId;
            this.targeting = googleAdCustomTargeting;
            this.iabSize = str;
            this.correlator = str2;
        }

        public static /* synthetic */ OnGoogleAdBannerCard copy$default(OnGoogleAdBannerCard onGoogleAdBannerCard, String str, String str2, GoogleAdCustomTargeting googleAdCustomTargeting, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onGoogleAdBannerCard.adUnit;
            }
            if ((i & 2) != 0) {
                str2 = onGoogleAdBannerCard.nativeCustomTemplateId;
            }
            if ((i & 4) != 0) {
                googleAdCustomTargeting = onGoogleAdBannerCard.targeting;
            }
            if ((i & 8) != 0) {
                str3 = onGoogleAdBannerCard.iabSize;
            }
            if ((i & 16) != 0) {
                str4 = onGoogleAdBannerCard.correlator;
            }
            String str5 = str4;
            GoogleAdCustomTargeting googleAdCustomTargeting2 = googleAdCustomTargeting;
            return onGoogleAdBannerCard.copy(str, str2, googleAdCustomTargeting2, str3, str5);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getAdUnit() {
            return this.adUnit;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getNativeCustomTemplateId() {
            return this.nativeCustomTemplateId;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final GoogleAdCustomTargeting getTargeting() {
            return this.targeting;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getIabSize() {
            return this.iabSize;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final String getCorrelator() {
            return this.correlator;
        }

        @NotNull
        public final OnGoogleAdBannerCard copy(@NotNull String adUnit, @NotNull String nativeCustomTemplateId, @Nullable GoogleAdCustomTargeting targeting, @Nullable String iabSize, @Nullable String correlator) {
            Intrinsics.h(adUnit, "adUnit");
            Intrinsics.h(nativeCustomTemplateId, "nativeCustomTemplateId");
            return new OnGoogleAdBannerCard(adUnit, nativeCustomTemplateId, targeting, iabSize, correlator);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnGoogleAdBannerCard)) {
                return false;
            }
            OnGoogleAdBannerCard onGoogleAdBannerCard = (OnGoogleAdBannerCard) other;
            return Intrinsics.c(this.adUnit, onGoogleAdBannerCard.adUnit) && Intrinsics.c(this.nativeCustomTemplateId, onGoogleAdBannerCard.nativeCustomTemplateId) && Intrinsics.c(this.targeting, onGoogleAdBannerCard.targeting) && Intrinsics.c(this.iabSize, onGoogleAdBannerCard.iabSize) && Intrinsics.c(this.correlator, onGoogleAdBannerCard.correlator);
        }

        @NotNull
        public final String getAdUnit() {
            return this.adUnit;
        }

        @Nullable
        public final String getCorrelator() {
            return this.correlator;
        }

        @Nullable
        public final String getIabSize() {
            return this.iabSize;
        }

        @NotNull
        public final String getNativeCustomTemplateId() {
            return this.nativeCustomTemplateId;
        }

        @Nullable
        public final GoogleAdCustomTargeting getTargeting() {
            return this.targeting;
        }

        public int hashCode() {
            int iC = b.c(this.adUnit.hashCode() * 31, 31, this.nativeCustomTemplateId);
            GoogleAdCustomTargeting googleAdCustomTargeting = this.targeting;
            int iHashCode = (iC + (googleAdCustomTargeting == null ? 0 : googleAdCustomTargeting.hashCode())) * 31;
            String str = this.iabSize;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.correlator;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.adUnit;
            String str2 = this.nativeCustomTemplateId;
            GoogleAdCustomTargeting googleAdCustomTargeting = this.targeting;
            String str3 = this.iabSize;
            String str4 = this.correlator;
            StringBuilder sbV = YU.a.v("OnGoogleAdBannerCard(adUnit=", str, ", nativeCustomTemplateId=", str2, ", targeting=");
            sbV.append(googleAdCustomTargeting);
            sbV.append(", iabSize=");
            sbV.append(str3);
            sbV.append(", correlator=");
            return YU.a.o(sbV, str4, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JQ\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$OnHorizontalList;", "", "__typename", "", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "actionTitle", "deepLink", "items", "", "Lcom/woolworths/product/list/legacy/ProductListQuery$Item;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "get__typename", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getActionTitle", "getDeepLink", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHorizontalList {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @Nullable
        private final String actionTitle;

        @Nullable
        private final String deepLink;

        @NotNull
        private final List<Item> items;

        @Nullable
        private final String subtitle;

        @NotNull
        private final String title;

        public OnHorizontalList(@NotNull String __typename, @NotNull String title, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull List<Item> items) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(title, "title");
            Intrinsics.h(items, "items");
            this.__typename = __typename;
            this.title = title;
            this.subtitle = str;
            this.actionTitle = str2;
            this.deepLink = str3;
            this.items = items;
        }

        public static /* synthetic */ OnHorizontalList copy$default(OnHorizontalList onHorizontalList, String str, String str2, String str3, String str4, String str5, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onHorizontalList.__typename;
            }
            if ((i & 2) != 0) {
                str2 = onHorizontalList.title;
            }
            if ((i & 4) != 0) {
                str3 = onHorizontalList.subtitle;
            }
            if ((i & 8) != 0) {
                str4 = onHorizontalList.actionTitle;
            }
            if ((i & 16) != 0) {
                str5 = onHorizontalList.deepLink;
            }
            if ((i & 32) != 0) {
                list = onHorizontalList.items;
            }
            String str6 = str5;
            List list2 = list;
            return onHorizontalList.copy(str, str2, str3, str4, str6, list2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getActionTitle() {
            return this.actionTitle;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final String getDeepLink() {
            return this.deepLink;
        }

        @NotNull
        public final List<Item> component6() {
            return this.items;
        }

        @NotNull
        public final OnHorizontalList copy(@NotNull String __typename, @NotNull String title, @Nullable String subtitle, @Nullable String actionTitle, @Nullable String deepLink, @NotNull List<Item> items) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(title, "title");
            Intrinsics.h(items, "items");
            return new OnHorizontalList(__typename, title, subtitle, actionTitle, deepLink, items);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnHorizontalList)) {
                return false;
            }
            OnHorizontalList onHorizontalList = (OnHorizontalList) other;
            return Intrinsics.c(this.__typename, onHorizontalList.__typename) && Intrinsics.c(this.title, onHorizontalList.title) && Intrinsics.c(this.subtitle, onHorizontalList.subtitle) && Intrinsics.c(this.actionTitle, onHorizontalList.actionTitle) && Intrinsics.c(this.deepLink, onHorizontalList.deepLink) && Intrinsics.c(this.items, onHorizontalList.items);
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
        public final List<Item> getItems() {
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

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int iC = b.c(this.__typename.hashCode() * 31, 31, this.title);
            String str = this.subtitle;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.actionTitle;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.deepLink;
            return this.items.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.__typename;
            String str2 = this.title;
            String str3 = this.subtitle;
            String str4 = this.actionTitle;
            String str5 = this.deepLink;
            List<Item> list = this.items;
            StringBuilder sbV = YU.a.v("OnHorizontalList(__typename=", str, ", title=", str2, ", subtitle=");
            a.B(sbV, str3, ", actionTitle=", str4, ", deepLink=");
            sbV.append(str5);
            sbV.append(", items=");
            sbV.append(list);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$OnHorizontalList1;", "", "title", "", "items", "", "Lcom/woolworths/product/list/legacy/ProductListQuery$Item3;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHorizontalList1 {
        public static final int $stable = 8;

        @NotNull
        private final List<Item3> items;

        @NotNull
        private final String title;

        public OnHorizontalList1(@NotNull String title, @NotNull List<Item3> items) {
            Intrinsics.h(title, "title");
            Intrinsics.h(items, "items");
            this.title = title;
            this.items = items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OnHorizontalList1 copy$default(OnHorizontalList1 onHorizontalList1, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onHorizontalList1.title;
            }
            if ((i & 2) != 0) {
                list = onHorizontalList1.items;
            }
            return onHorizontalList1.copy(str, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final List<Item3> component2() {
            return this.items;
        }

        @NotNull
        public final OnHorizontalList1 copy(@NotNull String title, @NotNull List<Item3> items) {
            Intrinsics.h(title, "title");
            Intrinsics.h(items, "items");
            return new OnHorizontalList1(title, items);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnHorizontalList1)) {
                return false;
            }
            OnHorizontalList1 onHorizontalList1 = (OnHorizontalList1) other;
            return Intrinsics.c(this.title, onHorizontalList1.title) && Intrinsics.c(this.items, onHorizontalList1.items);
        }

        @NotNull
        public final List<Item3> getItems() {
            return this.items;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.items.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return au.com.woolworths.android.onesite.a.i("OnHorizontalList1(title=", this.title, ", items=", ")", this.items);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$OnHorizontalList2;", "", "title", "", "items", "", "Lcom/woolworths/product/list/legacy/ProductListQuery$Item5;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHorizontalList2 {
        public static final int $stable = 8;

        @NotNull
        private final List<Item5> items;

        @NotNull
        private final String title;

        public OnHorizontalList2(@NotNull String title, @NotNull List<Item5> items) {
            Intrinsics.h(title, "title");
            Intrinsics.h(items, "items");
            this.title = title;
            this.items = items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OnHorizontalList2 copy$default(OnHorizontalList2 onHorizontalList2, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onHorizontalList2.title;
            }
            if ((i & 2) != 0) {
                list = onHorizontalList2.items;
            }
            return onHorizontalList2.copy(str, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final List<Item5> component2() {
            return this.items;
        }

        @NotNull
        public final OnHorizontalList2 copy(@NotNull String title, @NotNull List<Item5> items) {
            Intrinsics.h(title, "title");
            Intrinsics.h(items, "items");
            return new OnHorizontalList2(title, items);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnHorizontalList2)) {
                return false;
            }
            OnHorizontalList2 onHorizontalList2 = (OnHorizontalList2) other;
            return Intrinsics.c(this.title, onHorizontalList2.title) && Intrinsics.c(this.items, onHorizontalList2.items);
        }

        @NotNull
        public final List<Item5> getItems() {
            return this.items;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.items.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return au.com.woolworths.android.onesite.a.i("OnHorizontalList2(title=", this.title, ", items=", ")", this.items);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$OnInsetBanner;", "", "displayType", "Lau/com/woolworths/shop/graphql/type/InsetBannerDisplayType;", "message", "", "bannerTitle", "iconUrl", UrlHandler.ACTION, "Lcom/woolworths/product/list/legacy/ProductListQuery$Action;", "<init>", "(Lau/com/woolworths/shop/graphql/type/InsetBannerDisplayType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductListQuery$Action;)V", "getDisplayType", "()Lau/com/woolworths/shop/graphql/type/InsetBannerDisplayType;", "getMessage", "()Ljava/lang/String;", "getBannerTitle", "getIconUrl", "getAction", "()Lcom/woolworths/product/list/legacy/ProductListQuery$Action;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jm\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00064"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$OnMerchCard;", "", "__typename", "", "merchCardGridImageWithAlt", "Lcom/woolworths/product/list/legacy/ProductListQuery$MerchCardGridImageWithAlt;", "merchCardListImageWithAlt", "Lcom/woolworths/product/list/legacy/ProductListQuery$MerchCardListImageWithAlt;", "merchCardTitle", "merchCardDescription", "merchCardButton", "Lcom/woolworths/product/list/legacy/ProductListQuery$MerchCardButton;", "merchCardAction", "Lcom/woolworths/product/list/legacy/ProductListQuery$MerchCardAction;", "merchCardAnalytics", "Lcom/woolworths/product/list/legacy/ProductListQuery$MerchCardAnalytics;", "merchCardImpressionAnalytics", "Lcom/woolworths/product/list/legacy/ProductListQuery$MerchCardImpressionAnalytics;", "<init>", "(Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductListQuery$MerchCardGridImageWithAlt;Lcom/woolworths/product/list/legacy/ProductListQuery$MerchCardListImageWithAlt;Ljava/lang/String;Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductListQuery$MerchCardButton;Lcom/woolworths/product/list/legacy/ProductListQuery$MerchCardAction;Lcom/woolworths/product/list/legacy/ProductListQuery$MerchCardAnalytics;Lcom/woolworths/product/list/legacy/ProductListQuery$MerchCardImpressionAnalytics;)V", "get__typename", "()Ljava/lang/String;", "getMerchCardGridImageWithAlt", "()Lcom/woolworths/product/list/legacy/ProductListQuery$MerchCardGridImageWithAlt;", "getMerchCardListImageWithAlt", "()Lcom/woolworths/product/list/legacy/ProductListQuery$MerchCardListImageWithAlt;", "getMerchCardTitle", "getMerchCardDescription", "getMerchCardButton", "()Lcom/woolworths/product/list/legacy/ProductListQuery$MerchCardButton;", "getMerchCardAction", "()Lcom/woolworths/product/list/legacy/ProductListQuery$MerchCardAction;", "getMerchCardAnalytics", "()Lcom/woolworths/product/list/legacy/ProductListQuery$MerchCardAnalytics;", "getMerchCardImpressionAnalytics", "()Lcom/woolworths/product/list/legacy/ProductListQuery$MerchCardImpressionAnalytics;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnMerchCard {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @Nullable
        private final MerchCardAction merchCardAction;

        @Nullable
        private final MerchCardAnalytics merchCardAnalytics;

        @Nullable
        private final MerchCardButton merchCardButton;

        @Nullable
        private final String merchCardDescription;

        @NotNull
        private final MerchCardGridImageWithAlt merchCardGridImageWithAlt;

        @Nullable
        private final MerchCardImpressionAnalytics merchCardImpressionAnalytics;

        @NotNull
        private final MerchCardListImageWithAlt merchCardListImageWithAlt;

        @NotNull
        private final String merchCardTitle;

        public OnMerchCard(@NotNull String __typename, @NotNull MerchCardGridImageWithAlt merchCardGridImageWithAlt, @NotNull MerchCardListImageWithAlt merchCardListImageWithAlt, @NotNull String merchCardTitle, @Nullable String str, @Nullable MerchCardButton merchCardButton, @Nullable MerchCardAction merchCardAction, @Nullable MerchCardAnalytics merchCardAnalytics, @Nullable MerchCardImpressionAnalytics merchCardImpressionAnalytics) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(merchCardGridImageWithAlt, "merchCardGridImageWithAlt");
            Intrinsics.h(merchCardListImageWithAlt, "merchCardListImageWithAlt");
            Intrinsics.h(merchCardTitle, "merchCardTitle");
            this.__typename = __typename;
            this.merchCardGridImageWithAlt = merchCardGridImageWithAlt;
            this.merchCardListImageWithAlt = merchCardListImageWithAlt;
            this.merchCardTitle = merchCardTitle;
            this.merchCardDescription = str;
            this.merchCardButton = merchCardButton;
            this.merchCardAction = merchCardAction;
            this.merchCardAnalytics = merchCardAnalytics;
            this.merchCardImpressionAnalytics = merchCardImpressionAnalytics;
        }

        public static /* synthetic */ OnMerchCard copy$default(OnMerchCard onMerchCard, String str, MerchCardGridImageWithAlt merchCardGridImageWithAlt, MerchCardListImageWithAlt merchCardListImageWithAlt, String str2, String str3, MerchCardButton merchCardButton, MerchCardAction merchCardAction, MerchCardAnalytics merchCardAnalytics, MerchCardImpressionAnalytics merchCardImpressionAnalytics, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onMerchCard.__typename;
            }
            if ((i & 2) != 0) {
                merchCardGridImageWithAlt = onMerchCard.merchCardGridImageWithAlt;
            }
            if ((i & 4) != 0) {
                merchCardListImageWithAlt = onMerchCard.merchCardListImageWithAlt;
            }
            if ((i & 8) != 0) {
                str2 = onMerchCard.merchCardTitle;
            }
            if ((i & 16) != 0) {
                str3 = onMerchCard.merchCardDescription;
            }
            if ((i & 32) != 0) {
                merchCardButton = onMerchCard.merchCardButton;
            }
            if ((i & 64) != 0) {
                merchCardAction = onMerchCard.merchCardAction;
            }
            if ((i & 128) != 0) {
                merchCardAnalytics = onMerchCard.merchCardAnalytics;
            }
            if ((i & 256) != 0) {
                merchCardImpressionAnalytics = onMerchCard.merchCardImpressionAnalytics;
            }
            MerchCardAnalytics merchCardAnalytics2 = merchCardAnalytics;
            MerchCardImpressionAnalytics merchCardImpressionAnalytics2 = merchCardImpressionAnalytics;
            MerchCardButton merchCardButton2 = merchCardButton;
            MerchCardAction merchCardAction2 = merchCardAction;
            String str4 = str3;
            MerchCardListImageWithAlt merchCardListImageWithAlt2 = merchCardListImageWithAlt;
            return onMerchCard.copy(str, merchCardGridImageWithAlt, merchCardListImageWithAlt2, str2, str4, merchCardButton2, merchCardAction2, merchCardAnalytics2, merchCardImpressionAnalytics2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final MerchCardGridImageWithAlt getMerchCardGridImageWithAlt() {
            return this.merchCardGridImageWithAlt;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final MerchCardListImageWithAlt getMerchCardListImageWithAlt() {
            return this.merchCardListImageWithAlt;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getMerchCardTitle() {
            return this.merchCardTitle;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final String getMerchCardDescription() {
            return this.merchCardDescription;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final MerchCardButton getMerchCardButton() {
            return this.merchCardButton;
        }

        @Nullable
        /* renamed from: component7, reason: from getter */
        public final MerchCardAction getMerchCardAction() {
            return this.merchCardAction;
        }

        @Nullable
        /* renamed from: component8, reason: from getter */
        public final MerchCardAnalytics getMerchCardAnalytics() {
            return this.merchCardAnalytics;
        }

        @Nullable
        /* renamed from: component9, reason: from getter */
        public final MerchCardImpressionAnalytics getMerchCardImpressionAnalytics() {
            return this.merchCardImpressionAnalytics;
        }

        @NotNull
        public final OnMerchCard copy(@NotNull String __typename, @NotNull MerchCardGridImageWithAlt merchCardGridImageWithAlt, @NotNull MerchCardListImageWithAlt merchCardListImageWithAlt, @NotNull String merchCardTitle, @Nullable String merchCardDescription, @Nullable MerchCardButton merchCardButton, @Nullable MerchCardAction merchCardAction, @Nullable MerchCardAnalytics merchCardAnalytics, @Nullable MerchCardImpressionAnalytics merchCardImpressionAnalytics) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(merchCardGridImageWithAlt, "merchCardGridImageWithAlt");
            Intrinsics.h(merchCardListImageWithAlt, "merchCardListImageWithAlt");
            Intrinsics.h(merchCardTitle, "merchCardTitle");
            return new OnMerchCard(__typename, merchCardGridImageWithAlt, merchCardListImageWithAlt, merchCardTitle, merchCardDescription, merchCardButton, merchCardAction, merchCardAnalytics, merchCardImpressionAnalytics);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnMerchCard)) {
                return false;
            }
            OnMerchCard onMerchCard = (OnMerchCard) other;
            return Intrinsics.c(this.__typename, onMerchCard.__typename) && Intrinsics.c(this.merchCardGridImageWithAlt, onMerchCard.merchCardGridImageWithAlt) && Intrinsics.c(this.merchCardListImageWithAlt, onMerchCard.merchCardListImageWithAlt) && Intrinsics.c(this.merchCardTitle, onMerchCard.merchCardTitle) && Intrinsics.c(this.merchCardDescription, onMerchCard.merchCardDescription) && Intrinsics.c(this.merchCardButton, onMerchCard.merchCardButton) && Intrinsics.c(this.merchCardAction, onMerchCard.merchCardAction) && Intrinsics.c(this.merchCardAnalytics, onMerchCard.merchCardAnalytics) && Intrinsics.c(this.merchCardImpressionAnalytics, onMerchCard.merchCardImpressionAnalytics);
        }

        @Nullable
        public final MerchCardAction getMerchCardAction() {
            return this.merchCardAction;
        }

        @Nullable
        public final MerchCardAnalytics getMerchCardAnalytics() {
            return this.merchCardAnalytics;
        }

        @Nullable
        public final MerchCardButton getMerchCardButton() {
            return this.merchCardButton;
        }

        @Nullable
        public final String getMerchCardDescription() {
            return this.merchCardDescription;
        }

        @NotNull
        public final MerchCardGridImageWithAlt getMerchCardGridImageWithAlt() {
            return this.merchCardGridImageWithAlt;
        }

        @Nullable
        public final MerchCardImpressionAnalytics getMerchCardImpressionAnalytics() {
            return this.merchCardImpressionAnalytics;
        }

        @NotNull
        public final MerchCardListImageWithAlt getMerchCardListImageWithAlt() {
            return this.merchCardListImageWithAlt;
        }

        @NotNull
        public final String getMerchCardTitle() {
            return this.merchCardTitle;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int iC = b.c((this.merchCardListImageWithAlt.hashCode() + ((this.merchCardGridImageWithAlt.hashCode() + (this.__typename.hashCode() * 31)) * 31)) * 31, 31, this.merchCardTitle);
            String str = this.merchCardDescription;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            MerchCardButton merchCardButton = this.merchCardButton;
            int iHashCode2 = (iHashCode + (merchCardButton == null ? 0 : merchCardButton.hashCode())) * 31;
            MerchCardAction merchCardAction = this.merchCardAction;
            int iHashCode3 = (iHashCode2 + (merchCardAction == null ? 0 : merchCardAction.hashCode())) * 31;
            MerchCardAnalytics merchCardAnalytics = this.merchCardAnalytics;
            int iHashCode4 = (iHashCode3 + (merchCardAnalytics == null ? 0 : merchCardAnalytics.hashCode())) * 31;
            MerchCardImpressionAnalytics merchCardImpressionAnalytics = this.merchCardImpressionAnalytics;
            return iHashCode4 + (merchCardImpressionAnalytics != null ? merchCardImpressionAnalytics.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "OnMerchCard(__typename=" + this.__typename + ", merchCardGridImageWithAlt=" + this.merchCardGridImageWithAlt + ", merchCardListImageWithAlt=" + this.merchCardListImageWithAlt + ", merchCardTitle=" + this.merchCardTitle + ", merchCardDescription=" + this.merchCardDescription + ", merchCardButton=" + this.merchCardButton + ", merchCardAction=" + this.merchCardAction + ", merchCardAnalytics=" + this.merchCardAnalytics + ", merchCardImpressionAnalytics=" + this.merchCardImpressionAnalytics + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003JM\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006%"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$OnMerchCardFullImage;", "", "__typename", "", "merchCardFullImageAction", "Lcom/woolworths/product/list/legacy/ProductListQuery$MerchCardFullImageAction;", "merchCardFullImageBackgroundImageWithAlt", "Lcom/woolworths/product/list/legacy/ProductListQuery$MerchCardFullImageBackgroundImageWithAlt;", "merchCardFullImageButton", "Lcom/woolworths/product/list/legacy/ProductListQuery$MerchCardFullImageButton;", "merchCardFullImageTitle", "merchCardFullImageDescription", "<init>", "(Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductListQuery$MerchCardFullImageAction;Lcom/woolworths/product/list/legacy/ProductListQuery$MerchCardFullImageBackgroundImageWithAlt;Lcom/woolworths/product/list/legacy/ProductListQuery$MerchCardFullImageButton;Ljava/lang/String;Ljava/lang/String;)V", "get__typename", "()Ljava/lang/String;", "getMerchCardFullImageAction", "()Lcom/woolworths/product/list/legacy/ProductListQuery$MerchCardFullImageAction;", "getMerchCardFullImageBackgroundImageWithAlt", "()Lcom/woolworths/product/list/legacy/ProductListQuery$MerchCardFullImageBackgroundImageWithAlt;", "getMerchCardFullImageButton", "()Lcom/woolworths/product/list/legacy/ProductListQuery$MerchCardFullImageButton;", "getMerchCardFullImageTitle", "getMerchCardFullImageDescription", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnMerchCardFullImage {
        public static final int $stable = 0;

        @NotNull
        private final String __typename;

        @Nullable
        private final MerchCardFullImageAction merchCardFullImageAction;

        @NotNull
        private final MerchCardFullImageBackgroundImageWithAlt merchCardFullImageBackgroundImageWithAlt;

        @Nullable
        private final MerchCardFullImageButton merchCardFullImageButton;

        @Nullable
        private final String merchCardFullImageDescription;

        @Nullable
        private final String merchCardFullImageTitle;

        public OnMerchCardFullImage(@NotNull String __typename, @Nullable MerchCardFullImageAction merchCardFullImageAction, @NotNull MerchCardFullImageBackgroundImageWithAlt merchCardFullImageBackgroundImageWithAlt, @Nullable MerchCardFullImageButton merchCardFullImageButton, @Nullable String str, @Nullable String str2) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(merchCardFullImageBackgroundImageWithAlt, "merchCardFullImageBackgroundImageWithAlt");
            this.__typename = __typename;
            this.merchCardFullImageAction = merchCardFullImageAction;
            this.merchCardFullImageBackgroundImageWithAlt = merchCardFullImageBackgroundImageWithAlt;
            this.merchCardFullImageButton = merchCardFullImageButton;
            this.merchCardFullImageTitle = str;
            this.merchCardFullImageDescription = str2;
        }

        public static /* synthetic */ OnMerchCardFullImage copy$default(OnMerchCardFullImage onMerchCardFullImage, String str, MerchCardFullImageAction merchCardFullImageAction, MerchCardFullImageBackgroundImageWithAlt merchCardFullImageBackgroundImageWithAlt, MerchCardFullImageButton merchCardFullImageButton, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onMerchCardFullImage.__typename;
            }
            if ((i & 2) != 0) {
                merchCardFullImageAction = onMerchCardFullImage.merchCardFullImageAction;
            }
            if ((i & 4) != 0) {
                merchCardFullImageBackgroundImageWithAlt = onMerchCardFullImage.merchCardFullImageBackgroundImageWithAlt;
            }
            if ((i & 8) != 0) {
                merchCardFullImageButton = onMerchCardFullImage.merchCardFullImageButton;
            }
            if ((i & 16) != 0) {
                str2 = onMerchCardFullImage.merchCardFullImageTitle;
            }
            if ((i & 32) != 0) {
                str3 = onMerchCardFullImage.merchCardFullImageDescription;
            }
            String str4 = str2;
            String str5 = str3;
            return onMerchCardFullImage.copy(str, merchCardFullImageAction, merchCardFullImageBackgroundImageWithAlt, merchCardFullImageButton, str4, str5);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final MerchCardFullImageAction getMerchCardFullImageAction() {
            return this.merchCardFullImageAction;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final MerchCardFullImageBackgroundImageWithAlt getMerchCardFullImageBackgroundImageWithAlt() {
            return this.merchCardFullImageBackgroundImageWithAlt;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final MerchCardFullImageButton getMerchCardFullImageButton() {
            return this.merchCardFullImageButton;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final String getMerchCardFullImageTitle() {
            return this.merchCardFullImageTitle;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final String getMerchCardFullImageDescription() {
            return this.merchCardFullImageDescription;
        }

        @NotNull
        public final OnMerchCardFullImage copy(@NotNull String __typename, @Nullable MerchCardFullImageAction merchCardFullImageAction, @NotNull MerchCardFullImageBackgroundImageWithAlt merchCardFullImageBackgroundImageWithAlt, @Nullable MerchCardFullImageButton merchCardFullImageButton, @Nullable String merchCardFullImageTitle, @Nullable String merchCardFullImageDescription) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(merchCardFullImageBackgroundImageWithAlt, "merchCardFullImageBackgroundImageWithAlt");
            return new OnMerchCardFullImage(__typename, merchCardFullImageAction, merchCardFullImageBackgroundImageWithAlt, merchCardFullImageButton, merchCardFullImageTitle, merchCardFullImageDescription);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnMerchCardFullImage)) {
                return false;
            }
            OnMerchCardFullImage onMerchCardFullImage = (OnMerchCardFullImage) other;
            return Intrinsics.c(this.__typename, onMerchCardFullImage.__typename) && Intrinsics.c(this.merchCardFullImageAction, onMerchCardFullImage.merchCardFullImageAction) && Intrinsics.c(this.merchCardFullImageBackgroundImageWithAlt, onMerchCardFullImage.merchCardFullImageBackgroundImageWithAlt) && Intrinsics.c(this.merchCardFullImageButton, onMerchCardFullImage.merchCardFullImageButton) && Intrinsics.c(this.merchCardFullImageTitle, onMerchCardFullImage.merchCardFullImageTitle) && Intrinsics.c(this.merchCardFullImageDescription, onMerchCardFullImage.merchCardFullImageDescription);
        }

        @Nullable
        public final MerchCardFullImageAction getMerchCardFullImageAction() {
            return this.merchCardFullImageAction;
        }

        @NotNull
        public final MerchCardFullImageBackgroundImageWithAlt getMerchCardFullImageBackgroundImageWithAlt() {
            return this.merchCardFullImageBackgroundImageWithAlt;
        }

        @Nullable
        public final MerchCardFullImageButton getMerchCardFullImageButton() {
            return this.merchCardFullImageButton;
        }

        @Nullable
        public final String getMerchCardFullImageDescription() {
            return this.merchCardFullImageDescription;
        }

        @Nullable
        public final String getMerchCardFullImageTitle() {
            return this.merchCardFullImageTitle;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int iHashCode = this.__typename.hashCode() * 31;
            MerchCardFullImageAction merchCardFullImageAction = this.merchCardFullImageAction;
            int iHashCode2 = (this.merchCardFullImageBackgroundImageWithAlt.hashCode() + ((iHashCode + (merchCardFullImageAction == null ? 0 : merchCardFullImageAction.hashCode())) * 31)) * 31;
            MerchCardFullImageButton merchCardFullImageButton = this.merchCardFullImageButton;
            int iHashCode3 = (iHashCode2 + (merchCardFullImageButton == null ? 0 : merchCardFullImageButton.hashCode())) * 31;
            String str = this.merchCardFullImageTitle;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.merchCardFullImageDescription;
            return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.__typename;
            MerchCardFullImageAction merchCardFullImageAction = this.merchCardFullImageAction;
            MerchCardFullImageBackgroundImageWithAlt merchCardFullImageBackgroundImageWithAlt = this.merchCardFullImageBackgroundImageWithAlt;
            MerchCardFullImageButton merchCardFullImageButton = this.merchCardFullImageButton;
            String str2 = this.merchCardFullImageTitle;
            String str3 = this.merchCardFullImageDescription;
            StringBuilder sb = new StringBuilder("OnMerchCardFullImage(__typename=");
            sb.append(str);
            sb.append(", merchCardFullImageAction=");
            sb.append(merchCardFullImageAction);
            sb.append(", merchCardFullImageBackgroundImageWithAlt=");
            sb.append(merchCardFullImageBackgroundImageWithAlt);
            sb.append(", merchCardFullImageButton=");
            sb.append(merchCardFullImageButton);
            sb.append(", merchCardFullImageTitle=");
            return a.l(sb, str2, ", merchCardFullImageDescription=", str3, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jy\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00063"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$OnPersonalisedProductsBanner;", "", "__typename", "", "bannerTitle", "bannerForegroundColour", "bannerBackgroundColour", "bannerImage", "Lcom/woolworths/product/list/legacy/ProductListQuery$BannerImage;", "products", "", "Lcom/woolworths/product/list/legacy/ProductListQuery$Product;", "bannerAction", "Lcom/woolworths/product/list/legacy/ProductListQuery$BannerAction1;", "bannerAnalytics", "Lcom/woolworths/product/list/legacy/ProductListQuery$BannerAnalytics1;", "bannerImpressionAnalytics", "Lcom/woolworths/product/list/legacy/ProductListQuery$BannerImpressionAnalytics1;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductListQuery$BannerImage;Ljava/util/List;Lcom/woolworths/product/list/legacy/ProductListQuery$BannerAction1;Lcom/woolworths/product/list/legacy/ProductListQuery$BannerAnalytics1;Lcom/woolworths/product/list/legacy/ProductListQuery$BannerImpressionAnalytics1;)V", "get__typename", "()Ljava/lang/String;", "getBannerTitle", "getBannerForegroundColour", "getBannerBackgroundColour", "getBannerImage", "()Lcom/woolworths/product/list/legacy/ProductListQuery$BannerImage;", "getProducts", "()Ljava/util/List;", "getBannerAction", "()Lcom/woolworths/product/list/legacy/ProductListQuery$BannerAction1;", "getBannerAnalytics", "()Lcom/woolworths/product/list/legacy/ProductListQuery$BannerAnalytics1;", "getBannerImpressionAnalytics", "()Lcom/woolworths/product/list/legacy/ProductListQuery$BannerImpressionAnalytics1;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPersonalisedProductsBanner {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @Nullable
        private final BannerAction1 bannerAction;

        @Nullable
        private final BannerAnalytics1 bannerAnalytics;

        @Nullable
        private final String bannerBackgroundColour;

        @Nullable
        private final String bannerForegroundColour;

        @Nullable
        private final BannerImage bannerImage;

        @Nullable
        private final BannerImpressionAnalytics1 bannerImpressionAnalytics;

        @Nullable
        private final String bannerTitle;

        @Nullable
        private final List<Product> products;

        public OnPersonalisedProductsBanner(@NotNull String __typename, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable BannerImage bannerImage, @Nullable List<Product> list, @Nullable BannerAction1 bannerAction1, @Nullable BannerAnalytics1 bannerAnalytics1, @Nullable BannerImpressionAnalytics1 bannerImpressionAnalytics1) {
            Intrinsics.h(__typename, "__typename");
            this.__typename = __typename;
            this.bannerTitle = str;
            this.bannerForegroundColour = str2;
            this.bannerBackgroundColour = str3;
            this.bannerImage = bannerImage;
            this.products = list;
            this.bannerAction = bannerAction1;
            this.bannerAnalytics = bannerAnalytics1;
            this.bannerImpressionAnalytics = bannerImpressionAnalytics1;
        }

        public static /* synthetic */ OnPersonalisedProductsBanner copy$default(OnPersonalisedProductsBanner onPersonalisedProductsBanner, String str, String str2, String str3, String str4, BannerImage bannerImage, List list, BannerAction1 bannerAction1, BannerAnalytics1 bannerAnalytics1, BannerImpressionAnalytics1 bannerImpressionAnalytics1, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onPersonalisedProductsBanner.__typename;
            }
            if ((i & 2) != 0) {
                str2 = onPersonalisedProductsBanner.bannerTitle;
            }
            if ((i & 4) != 0) {
                str3 = onPersonalisedProductsBanner.bannerForegroundColour;
            }
            if ((i & 8) != 0) {
                str4 = onPersonalisedProductsBanner.bannerBackgroundColour;
            }
            if ((i & 16) != 0) {
                bannerImage = onPersonalisedProductsBanner.bannerImage;
            }
            if ((i & 32) != 0) {
                list = onPersonalisedProductsBanner.products;
            }
            if ((i & 64) != 0) {
                bannerAction1 = onPersonalisedProductsBanner.bannerAction;
            }
            if ((i & 128) != 0) {
                bannerAnalytics1 = onPersonalisedProductsBanner.bannerAnalytics;
            }
            if ((i & 256) != 0) {
                bannerImpressionAnalytics1 = onPersonalisedProductsBanner.bannerImpressionAnalytics;
            }
            BannerAnalytics1 bannerAnalytics12 = bannerAnalytics1;
            BannerImpressionAnalytics1 bannerImpressionAnalytics12 = bannerImpressionAnalytics1;
            List list2 = list;
            BannerAction1 bannerAction12 = bannerAction1;
            BannerImage bannerImage2 = bannerImage;
            String str5 = str3;
            return onPersonalisedProductsBanner.copy(str, str2, str5, str4, bannerImage2, list2, bannerAction12, bannerAnalytics12, bannerImpressionAnalytics12);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getBannerTitle() {
            return this.bannerTitle;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getBannerForegroundColour() {
            return this.bannerForegroundColour;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getBannerBackgroundColour() {
            return this.bannerBackgroundColour;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final BannerImage getBannerImage() {
            return this.bannerImage;
        }

        @Nullable
        public final List<Product> component6() {
            return this.products;
        }

        @Nullable
        /* renamed from: component7, reason: from getter */
        public final BannerAction1 getBannerAction() {
            return this.bannerAction;
        }

        @Nullable
        /* renamed from: component8, reason: from getter */
        public final BannerAnalytics1 getBannerAnalytics() {
            return this.bannerAnalytics;
        }

        @Nullable
        /* renamed from: component9, reason: from getter */
        public final BannerImpressionAnalytics1 getBannerImpressionAnalytics() {
            return this.bannerImpressionAnalytics;
        }

        @NotNull
        public final OnPersonalisedProductsBanner copy(@NotNull String __typename, @Nullable String bannerTitle, @Nullable String bannerForegroundColour, @Nullable String bannerBackgroundColour, @Nullable BannerImage bannerImage, @Nullable List<Product> products, @Nullable BannerAction1 bannerAction, @Nullable BannerAnalytics1 bannerAnalytics, @Nullable BannerImpressionAnalytics1 bannerImpressionAnalytics) {
            Intrinsics.h(__typename, "__typename");
            return new OnPersonalisedProductsBanner(__typename, bannerTitle, bannerForegroundColour, bannerBackgroundColour, bannerImage, products, bannerAction, bannerAnalytics, bannerImpressionAnalytics);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnPersonalisedProductsBanner)) {
                return false;
            }
            OnPersonalisedProductsBanner onPersonalisedProductsBanner = (OnPersonalisedProductsBanner) other;
            return Intrinsics.c(this.__typename, onPersonalisedProductsBanner.__typename) && Intrinsics.c(this.bannerTitle, onPersonalisedProductsBanner.bannerTitle) && Intrinsics.c(this.bannerForegroundColour, onPersonalisedProductsBanner.bannerForegroundColour) && Intrinsics.c(this.bannerBackgroundColour, onPersonalisedProductsBanner.bannerBackgroundColour) && Intrinsics.c(this.bannerImage, onPersonalisedProductsBanner.bannerImage) && Intrinsics.c(this.products, onPersonalisedProductsBanner.products) && Intrinsics.c(this.bannerAction, onPersonalisedProductsBanner.bannerAction) && Intrinsics.c(this.bannerAnalytics, onPersonalisedProductsBanner.bannerAnalytics) && Intrinsics.c(this.bannerImpressionAnalytics, onPersonalisedProductsBanner.bannerImpressionAnalytics);
        }

        @Nullable
        public final BannerAction1 getBannerAction() {
            return this.bannerAction;
        }

        @Nullable
        public final BannerAnalytics1 getBannerAnalytics() {
            return this.bannerAnalytics;
        }

        @Nullable
        public final String getBannerBackgroundColour() {
            return this.bannerBackgroundColour;
        }

        @Nullable
        public final String getBannerForegroundColour() {
            return this.bannerForegroundColour;
        }

        @Nullable
        public final BannerImage getBannerImage() {
            return this.bannerImage;
        }

        @Nullable
        public final BannerImpressionAnalytics1 getBannerImpressionAnalytics() {
            return this.bannerImpressionAnalytics;
        }

        @Nullable
        public final String getBannerTitle() {
            return this.bannerTitle;
        }

        @Nullable
        public final List<Product> getProducts() {
            return this.products;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int iHashCode = this.__typename.hashCode() * 31;
            String str = this.bannerTitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.bannerForegroundColour;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.bannerBackgroundColour;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            BannerImage bannerImage = this.bannerImage;
            int iHashCode5 = (iHashCode4 + (bannerImage == null ? 0 : bannerImage.hashCode())) * 31;
            List<Product> list = this.products;
            int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
            BannerAction1 bannerAction1 = this.bannerAction;
            int iHashCode7 = (iHashCode6 + (bannerAction1 == null ? 0 : bannerAction1.hashCode())) * 31;
            BannerAnalytics1 bannerAnalytics1 = this.bannerAnalytics;
            int iHashCode8 = (iHashCode7 + (bannerAnalytics1 == null ? 0 : bannerAnalytics1.hashCode())) * 31;
            BannerImpressionAnalytics1 bannerImpressionAnalytics1 = this.bannerImpressionAnalytics;
            return iHashCode8 + (bannerImpressionAnalytics1 != null ? bannerImpressionAnalytics1.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.__typename;
            String str2 = this.bannerTitle;
            String str3 = this.bannerForegroundColour;
            String str4 = this.bannerBackgroundColour;
            BannerImage bannerImage = this.bannerImage;
            List<Product> list = this.products;
            BannerAction1 bannerAction1 = this.bannerAction;
            BannerAnalytics1 bannerAnalytics1 = this.bannerAnalytics;
            BannerImpressionAnalytics1 bannerImpressionAnalytics1 = this.bannerImpressionAnalytics;
            StringBuilder sbV = YU.a.v("OnPersonalisedProductsBanner(__typename=", str, ", bannerTitle=", str2, ", bannerForegroundColour=");
            a.B(sbV, str3, ", bannerBackgroundColour=", str4, ", bannerImage=");
            sbV.append(bannerImage);
            sbV.append(", products=");
            sbV.append(list);
            sbV.append(", bannerAction=");
            sbV.append(bannerAction1);
            sbV.append(", bannerAnalytics=");
            sbV.append(bannerAnalytics1);
            sbV.append(", bannerImpressionAnalytics=");
            sbV.append(bannerImpressionAnalytics1);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$OnProductCard;", "", "__typename", "", "productCard", "Lau/com/woolworths/graphql/common/fragment/ProductCard;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/graphql/common/fragment/ProductCard;)V", "get__typename", "()Ljava/lang/String;", "getProductCard", "()Lau/com/woolworths/graphql/common/fragment/ProductCard;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$OnProductCard1;", "", "__typename", "", "productCard", "Lau/com/woolworths/graphql/common/fragment/ProductCard;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/graphql/common/fragment/ProductCard;)V", "get__typename", "()Ljava/lang/String;", "getProductCard", "()Lau/com/woolworths/graphql/common/fragment/ProductCard;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductCard1 {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final ProductCard productCard;

        public OnProductCard1(@NotNull String __typename, @NotNull ProductCard productCard) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(productCard, "productCard");
            this.__typename = __typename;
            this.productCard = productCard;
        }

        public static /* synthetic */ OnProductCard1 copy$default(OnProductCard1 onProductCard1, String str, ProductCard productCard, int i, Object obj) {
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
        public final ProductCard getProductCard() {
            return this.productCard;
        }

        @NotNull
        public final OnProductCard1 copy(@NotNull String __typename, @NotNull ProductCard productCard) {
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
            return d.o("OnProductCard1(__typename=", this.__typename, ", productCard=", this.productCard, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$OnProductCard2;", "", "__typename", "", "productCard", "Lau/com/woolworths/graphql/common/fragment/ProductCard;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/graphql/common/fragment/ProductCard;)V", "get__typename", "()Ljava/lang/String;", "getProductCard", "()Lau/com/woolworths/graphql/common/fragment/ProductCard;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductCard2 {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final ProductCard productCard;

        public OnProductCard2(@NotNull String __typename, @NotNull ProductCard productCard) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(productCard, "productCard");
            this.__typename = __typename;
            this.productCard = productCard;
        }

        public static /* synthetic */ OnProductCard2 copy$default(OnProductCard2 onProductCard2, String str, ProductCard productCard, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onProductCard2.__typename;
            }
            if ((i & 2) != 0) {
                productCard = onProductCard2.productCard;
            }
            return onProductCard2.copy(str, productCard);
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
        public final OnProductCard2 copy(@NotNull String __typename, @NotNull ProductCard productCard) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(productCard, "productCard");
            return new OnProductCard2(__typename, productCard);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnProductCard2)) {
                return false;
            }
            OnProductCard2 onProductCard2 = (OnProductCard2) other;
            return Intrinsics.c(this.__typename, onProductCard2.__typename) && Intrinsics.c(this.productCard, onProductCard2.productCard);
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
            return d.o("OnProductCard2(__typename=", this.__typename, ", productCard=", this.productCard, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$OnProductCard3;", "", "__typename", "", "productCard", "Lau/com/woolworths/graphql/common/fragment/ProductCard;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/graphql/common/fragment/ProductCard;)V", "get__typename", "()Ljava/lang/String;", "getProductCard", "()Lau/com/woolworths/graphql/common/fragment/ProductCard;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductCard3 {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final ProductCard productCard;

        public OnProductCard3(@NotNull String __typename, @NotNull ProductCard productCard) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(productCard, "productCard");
            this.__typename = __typename;
            this.productCard = productCard;
        }

        public static /* synthetic */ OnProductCard3 copy$default(OnProductCard3 onProductCard3, String str, ProductCard productCard, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onProductCard3.__typename;
            }
            if ((i & 2) != 0) {
                productCard = onProductCard3.productCard;
            }
            return onProductCard3.copy(str, productCard);
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
        public final OnProductCard3 copy(@NotNull String __typename, @NotNull ProductCard productCard) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(productCard, "productCard");
            return new OnProductCard3(__typename, productCard);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnProductCard3)) {
                return false;
            }
            OnProductCard3 onProductCard3 = (OnProductCard3) other;
            return Intrinsics.c(this.__typename, onProductCard3.__typename) && Intrinsics.c(this.productCard, onProductCard3.productCard);
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
            return d.o("OnProductCard3(__typename=", this.__typename, ", productCard=", this.productCard, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003JQ\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$OnProductListFullScreenError;", "", "analytics", "Lcom/woolworths/product/list/legacy/ProductListQuery$Analytics6;", "impressionAnalytics", "Lcom/woolworths/product/list/legacy/ProductListQuery$ImpressionAnalytics;", "image", "", "title", lqlqqlq.mmm006Dm006Dm, "cta", "Lcom/woolworths/product/list/legacy/ProductListQuery$Cta;", "<init>", "(Lcom/woolworths/product/list/legacy/ProductListQuery$Analytics6;Lcom/woolworths/product/list/legacy/ProductListQuery$ImpressionAnalytics;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductListQuery$Cta;)V", "getAnalytics", "()Lcom/woolworths/product/list/legacy/ProductListQuery$Analytics6;", "getImpressionAnalytics", "()Lcom/woolworths/product/list/legacy/ProductListQuery$ImpressionAnalytics;", "getImage", "()Ljava/lang/String;", "getTitle", "getDescription", "getCta", "()Lcom/woolworths/product/list/legacy/ProductListQuery$Cta;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductListFullScreenError {
        public static final int $stable = 8;

        @Nullable
        private final Analytics6 analytics;

        @Nullable
        private final Cta cta;

        @Nullable
        private final String description;

        @Nullable
        private final String image;

        @Nullable
        private final ImpressionAnalytics impressionAnalytics;

        @Nullable
        private final String title;

        public OnProductListFullScreenError(@Nullable Analytics6 analytics6, @Nullable ImpressionAnalytics impressionAnalytics, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Cta cta) {
            this.analytics = analytics6;
            this.impressionAnalytics = impressionAnalytics;
            this.image = str;
            this.title = str2;
            this.description = str3;
            this.cta = cta;
        }

        public static /* synthetic */ OnProductListFullScreenError copy$default(OnProductListFullScreenError onProductListFullScreenError, Analytics6 analytics6, ImpressionAnalytics impressionAnalytics, String str, String str2, String str3, Cta cta, int i, Object obj) {
            if ((i & 1) != 0) {
                analytics6 = onProductListFullScreenError.analytics;
            }
            if ((i & 2) != 0) {
                impressionAnalytics = onProductListFullScreenError.impressionAnalytics;
            }
            if ((i & 4) != 0) {
                str = onProductListFullScreenError.image;
            }
            if ((i & 8) != 0) {
                str2 = onProductListFullScreenError.title;
            }
            if ((i & 16) != 0) {
                str3 = onProductListFullScreenError.description;
            }
            if ((i & 32) != 0) {
                cta = onProductListFullScreenError.cta;
            }
            String str4 = str3;
            Cta cta2 = cta;
            return onProductListFullScreenError.copy(analytics6, impressionAnalytics, str, str2, str4, cta2);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final Analytics6 getAnalytics() {
            return this.analytics;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final ImpressionAnalytics getImpressionAnalytics() {
            return this.impressionAnalytics;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final Cta getCta() {
            return this.cta;
        }

        @NotNull
        public final OnProductListFullScreenError copy(@Nullable Analytics6 analytics, @Nullable ImpressionAnalytics impressionAnalytics, @Nullable String image, @Nullable String title, @Nullable String description, @Nullable Cta cta) {
            return new OnProductListFullScreenError(analytics, impressionAnalytics, image, title, description, cta);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnProductListFullScreenError)) {
                return false;
            }
            OnProductListFullScreenError onProductListFullScreenError = (OnProductListFullScreenError) other;
            return Intrinsics.c(this.analytics, onProductListFullScreenError.analytics) && Intrinsics.c(this.impressionAnalytics, onProductListFullScreenError.impressionAnalytics) && Intrinsics.c(this.image, onProductListFullScreenError.image) && Intrinsics.c(this.title, onProductListFullScreenError.title) && Intrinsics.c(this.description, onProductListFullScreenError.description) && Intrinsics.c(this.cta, onProductListFullScreenError.cta);
        }

        @Nullable
        public final Analytics6 getAnalytics() {
            return this.analytics;
        }

        @Nullable
        public final Cta getCta() {
            return this.cta;
        }

        @Nullable
        public final String getDescription() {
            return this.description;
        }

        @Nullable
        public final String getImage() {
            return this.image;
        }

        @Nullable
        public final ImpressionAnalytics getImpressionAnalytics() {
            return this.impressionAnalytics;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            Analytics6 analytics6 = this.analytics;
            int iHashCode = (analytics6 == null ? 0 : analytics6.hashCode()) * 31;
            ImpressionAnalytics impressionAnalytics = this.impressionAnalytics;
            int iHashCode2 = (iHashCode + (impressionAnalytics == null ? 0 : impressionAnalytics.hashCode())) * 31;
            String str = this.image;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.title;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.description;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Cta cta = this.cta;
            return iHashCode5 + (cta != null ? cta.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Analytics6 analytics6 = this.analytics;
            ImpressionAnalytics impressionAnalytics = this.impressionAnalytics;
            String str = this.image;
            String str2 = this.title;
            String str3 = this.description;
            Cta cta = this.cta;
            StringBuilder sb = new StringBuilder("OnProductListFullScreenError(analytics=");
            sb.append(analytics6);
            sb.append(", impressionAnalytics=");
            sb.append(impressionAnalytics);
            sb.append(", image=");
            a.B(sb, str, ", title=", str2, ", description=");
            sb.append(str3);
            sb.append(", cta=");
            sb.append(cta);
            sb.append(")");
            return sb.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$OnProductListZeroResult;", "", "title", "", "message", "items", "", "Lcom/woolworths/product/list/legacy/ProductListQuery$Item4;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getMessage", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductListZeroResult {
        public static final int $stable = 8;

        @NotNull
        private final List<Item4> items;

        @Nullable
        private final String message;

        @Nullable
        private final String title;

        public OnProductListZeroResult(@Nullable String str, @Nullable String str2, @NotNull List<Item4> items) {
            Intrinsics.h(items, "items");
            this.title = str;
            this.message = str2;
            this.items = items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OnProductListZeroResult copy$default(OnProductListZeroResult onProductListZeroResult, String str, String str2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onProductListZeroResult.title;
            }
            if ((i & 2) != 0) {
                str2 = onProductListZeroResult.message;
            }
            if ((i & 4) != 0) {
                list = onProductListZeroResult.items;
            }
            return onProductListZeroResult.copy(str, str2, list);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final List<Item4> component3() {
            return this.items;
        }

        @NotNull
        public final OnProductListZeroResult copy(@Nullable String title, @Nullable String message, @NotNull List<Item4> items) {
            Intrinsics.h(items, "items");
            return new OnProductListZeroResult(title, message, items);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnProductListZeroResult)) {
                return false;
            }
            OnProductListZeroResult onProductListZeroResult = (OnProductListZeroResult) other;
            return Intrinsics.c(this.title, onProductListZeroResult.title) && Intrinsics.c(this.message, onProductListZeroResult.message) && Intrinsics.c(this.items, onProductListZeroResult.items);
        }

        @NotNull
        public final List<Item4> getItems() {
            return this.items;
        }

        @Nullable
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.message;
            return this.items.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.message;
            return android.support.v4.media.session.a.t(YU.a.v("OnProductListZeroResult(title=", str, ", message=", str2, ", items="), this.items, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$OnUniversalInventoryContainer;", "", "googleAdBannerCard", "Lcom/woolworths/product/list/legacy/ProductListQuery$GoogleAdBannerCard;", "nextBestAction", "Lcom/woolworths/product/list/legacy/ProductListQuery$NextBestAction;", "<init>", "(Lcom/woolworths/product/list/legacy/ProductListQuery$GoogleAdBannerCard;Lcom/woolworths/product/list/legacy/ProductListQuery$NextBestAction;)V", "getGoogleAdBannerCard", "()Lcom/woolworths/product/list/legacy/ProductListQuery$GoogleAdBannerCard;", "getNextBestAction", "()Lcom/woolworths/product/list/legacy/ProductListQuery$NextBestAction;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnUniversalInventoryContainer {
        public static final int $stable = 8;

        @Nullable
        private final GoogleAdBannerCard googleAdBannerCard;

        @Nullable
        private final NextBestAction nextBestAction;

        public OnUniversalInventoryContainer(@Nullable GoogleAdBannerCard googleAdBannerCard, @Nullable NextBestAction nextBestAction) {
            this.googleAdBannerCard = googleAdBannerCard;
            this.nextBestAction = nextBestAction;
        }

        public static /* synthetic */ OnUniversalInventoryContainer copy$default(OnUniversalInventoryContainer onUniversalInventoryContainer, GoogleAdBannerCard googleAdBannerCard, NextBestAction nextBestAction, int i, Object obj) {
            if ((i & 1) != 0) {
                googleAdBannerCard = onUniversalInventoryContainer.googleAdBannerCard;
            }
            if ((i & 2) != 0) {
                nextBestAction = onUniversalInventoryContainer.nextBestAction;
            }
            return onUniversalInventoryContainer.copy(googleAdBannerCard, nextBestAction);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final GoogleAdBannerCard getGoogleAdBannerCard() {
            return this.googleAdBannerCard;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final NextBestAction getNextBestAction() {
            return this.nextBestAction;
        }

        @NotNull
        public final OnUniversalInventoryContainer copy(@Nullable GoogleAdBannerCard googleAdBannerCard, @Nullable NextBestAction nextBestAction) {
            return new OnUniversalInventoryContainer(googleAdBannerCard, nextBestAction);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnUniversalInventoryContainer)) {
                return false;
            }
            OnUniversalInventoryContainer onUniversalInventoryContainer = (OnUniversalInventoryContainer) other;
            return Intrinsics.c(this.googleAdBannerCard, onUniversalInventoryContainer.googleAdBannerCard) && Intrinsics.c(this.nextBestAction, onUniversalInventoryContainer.nextBestAction);
        }

        @Nullable
        public final GoogleAdBannerCard getGoogleAdBannerCard() {
            return this.googleAdBannerCard;
        }

        @Nullable
        public final NextBestAction getNextBestAction() {
            return this.nextBestAction;
        }

        public int hashCode() {
            GoogleAdBannerCard googleAdBannerCard = this.googleAdBannerCard;
            int iHashCode = (googleAdBannerCard == null ? 0 : googleAdBannerCard.hashCode()) * 31;
            NextBestAction nextBestAction = this.nextBestAction;
            return iHashCode + (nextBestAction != null ? nextBestAction.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "OnUniversalInventoryContainer(googleAdBannerCard=" + this.googleAdBannerCard + ", nextBestAction=" + this.nextBestAction + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$OnVideoAdUnit;", "", "__typename", "", "videoAdUnitVideoAd", "Lcom/woolworths/product/list/legacy/ProductListQuery$VideoAdUnitVideoAd;", "videoAdUnitProductCard", "Lcom/woolworths/product/list/legacy/ProductListQuery$VideoAdUnitProductCard;", "<init>", "(Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductListQuery$VideoAdUnitVideoAd;Lcom/woolworths/product/list/legacy/ProductListQuery$VideoAdUnitProductCard;)V", "get__typename", "()Ljava/lang/String;", "getVideoAdUnitVideoAd", "()Lcom/woolworths/product/list/legacy/ProductListQuery$VideoAdUnitVideoAd;", "getVideoAdUnitProductCard", "()Lcom/woolworths/product/list/legacy/ProductListQuery$VideoAdUnitProductCard;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnVideoAdUnit {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @Nullable
        private final VideoAdUnitProductCard videoAdUnitProductCard;

        @NotNull
        private final VideoAdUnitVideoAd videoAdUnitVideoAd;

        public OnVideoAdUnit(@NotNull String __typename, @NotNull VideoAdUnitVideoAd videoAdUnitVideoAd, @Nullable VideoAdUnitProductCard videoAdUnitProductCard) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(videoAdUnitVideoAd, "videoAdUnitVideoAd");
            this.__typename = __typename;
            this.videoAdUnitVideoAd = videoAdUnitVideoAd;
            this.videoAdUnitProductCard = videoAdUnitProductCard;
        }

        public static /* synthetic */ OnVideoAdUnit copy$default(OnVideoAdUnit onVideoAdUnit, String str, VideoAdUnitVideoAd videoAdUnitVideoAd, VideoAdUnitProductCard videoAdUnitProductCard, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onVideoAdUnit.__typename;
            }
            if ((i & 2) != 0) {
                videoAdUnitVideoAd = onVideoAdUnit.videoAdUnitVideoAd;
            }
            if ((i & 4) != 0) {
                videoAdUnitProductCard = onVideoAdUnit.videoAdUnitProductCard;
            }
            return onVideoAdUnit.copy(str, videoAdUnitVideoAd, videoAdUnitProductCard);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final VideoAdUnitVideoAd getVideoAdUnitVideoAd() {
            return this.videoAdUnitVideoAd;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final VideoAdUnitProductCard getVideoAdUnitProductCard() {
            return this.videoAdUnitProductCard;
        }

        @NotNull
        public final OnVideoAdUnit copy(@NotNull String __typename, @NotNull VideoAdUnitVideoAd videoAdUnitVideoAd, @Nullable VideoAdUnitProductCard videoAdUnitProductCard) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(videoAdUnitVideoAd, "videoAdUnitVideoAd");
            return new OnVideoAdUnit(__typename, videoAdUnitVideoAd, videoAdUnitProductCard);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnVideoAdUnit)) {
                return false;
            }
            OnVideoAdUnit onVideoAdUnit = (OnVideoAdUnit) other;
            return Intrinsics.c(this.__typename, onVideoAdUnit.__typename) && Intrinsics.c(this.videoAdUnitVideoAd, onVideoAdUnit.videoAdUnitVideoAd) && Intrinsics.c(this.videoAdUnitProductCard, onVideoAdUnit.videoAdUnitProductCard);
        }

        @Nullable
        public final VideoAdUnitProductCard getVideoAdUnitProductCard() {
            return this.videoAdUnitProductCard;
        }

        @NotNull
        public final VideoAdUnitVideoAd getVideoAdUnitVideoAd() {
            return this.videoAdUnitVideoAd;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int iHashCode = (this.videoAdUnitVideoAd.hashCode() + (this.__typename.hashCode() * 31)) * 31;
            VideoAdUnitProductCard videoAdUnitProductCard = this.videoAdUnitProductCard;
            return iHashCode + (videoAdUnitProductCard == null ? 0 : videoAdUnitProductCard.hashCode());
        }

        @NotNull
        public String toString() {
            return "OnVideoAdUnit(__typename=" + this.__typename + ", videoAdUnitVideoAd=" + this.videoAdUnitVideoAd + ", videoAdUnitProductCard=" + this.videoAdUnitProductCard + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$OnZeroResultProductCategories;", "", "zeroResultProductCategoriesTitle", "", "zeroResultProductCategoriesItems", "", "Lcom/woolworths/product/list/legacy/ProductListQuery$ZeroResultProductCategoriesItem;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getZeroResultProductCategoriesTitle", "()Ljava/lang/String;", "getZeroResultProductCategoriesItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnZeroResultProductCategories {
        public static final int $stable = 8;

        @NotNull
        private final List<ZeroResultProductCategoriesItem> zeroResultProductCategoriesItems;

        @Nullable
        private final String zeroResultProductCategoriesTitle;

        public OnZeroResultProductCategories(@Nullable String str, @NotNull List<ZeroResultProductCategoriesItem> zeroResultProductCategoriesItems) {
            Intrinsics.h(zeroResultProductCategoriesItems, "zeroResultProductCategoriesItems");
            this.zeroResultProductCategoriesTitle = str;
            this.zeroResultProductCategoriesItems = zeroResultProductCategoriesItems;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OnZeroResultProductCategories copy$default(OnZeroResultProductCategories onZeroResultProductCategories, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onZeroResultProductCategories.zeroResultProductCategoriesTitle;
            }
            if ((i & 2) != 0) {
                list = onZeroResultProductCategories.zeroResultProductCategoriesItems;
            }
            return onZeroResultProductCategories.copy(str, list);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getZeroResultProductCategoriesTitle() {
            return this.zeroResultProductCategoriesTitle;
        }

        @NotNull
        public final List<ZeroResultProductCategoriesItem> component2() {
            return this.zeroResultProductCategoriesItems;
        }

        @NotNull
        public final OnZeroResultProductCategories copy(@Nullable String zeroResultProductCategoriesTitle, @NotNull List<ZeroResultProductCategoriesItem> zeroResultProductCategoriesItems) {
            Intrinsics.h(zeroResultProductCategoriesItems, "zeroResultProductCategoriesItems");
            return new OnZeroResultProductCategories(zeroResultProductCategoriesTitle, zeroResultProductCategoriesItems);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnZeroResultProductCategories)) {
                return false;
            }
            OnZeroResultProductCategories onZeroResultProductCategories = (OnZeroResultProductCategories) other;
            return Intrinsics.c(this.zeroResultProductCategoriesTitle, onZeroResultProductCategories.zeroResultProductCategoriesTitle) && Intrinsics.c(this.zeroResultProductCategoriesItems, onZeroResultProductCategories.zeroResultProductCategoriesItems);
        }

        @NotNull
        public final List<ZeroResultProductCategoriesItem> getZeroResultProductCategoriesItems() {
            return this.zeroResultProductCategoriesItems;
        }

        @Nullable
        public final String getZeroResultProductCategoriesTitle() {
            return this.zeroResultProductCategoriesTitle;
        }

        public int hashCode() {
            String str = this.zeroResultProductCategoriesTitle;
            return this.zeroResultProductCategoriesItems.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return au.com.woolworths.android.onesite.a.i("OnZeroResultProductCategories(zeroResultProductCategoriesTitle=", this.zeroResultProductCategoriesTitle, ", zeroResultProductCategoriesItems=", ")", this.zeroResultProductCategoriesItems);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$OnZeroResultProductCategories1;", "", "zeroResultProductCategoriesTitle", "", "zeroResultProductCategoriesItems", "", "Lcom/woolworths/product/list/legacy/ProductListQuery$ZeroResultProductCategoriesItem1;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getZeroResultProductCategoriesTitle", "()Ljava/lang/String;", "getZeroResultProductCategoriesItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnZeroResultProductCategories1 {
        public static final int $stable = 8;

        @NotNull
        private final List<ZeroResultProductCategoriesItem1> zeroResultProductCategoriesItems;

        @Nullable
        private final String zeroResultProductCategoriesTitle;

        public OnZeroResultProductCategories1(@Nullable String str, @NotNull List<ZeroResultProductCategoriesItem1> zeroResultProductCategoriesItems) {
            Intrinsics.h(zeroResultProductCategoriesItems, "zeroResultProductCategoriesItems");
            this.zeroResultProductCategoriesTitle = str;
            this.zeroResultProductCategoriesItems = zeroResultProductCategoriesItems;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OnZeroResultProductCategories1 copy$default(OnZeroResultProductCategories1 onZeroResultProductCategories1, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onZeroResultProductCategories1.zeroResultProductCategoriesTitle;
            }
            if ((i & 2) != 0) {
                list = onZeroResultProductCategories1.zeroResultProductCategoriesItems;
            }
            return onZeroResultProductCategories1.copy(str, list);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getZeroResultProductCategoriesTitle() {
            return this.zeroResultProductCategoriesTitle;
        }

        @NotNull
        public final List<ZeroResultProductCategoriesItem1> component2() {
            return this.zeroResultProductCategoriesItems;
        }

        @NotNull
        public final OnZeroResultProductCategories1 copy(@Nullable String zeroResultProductCategoriesTitle, @NotNull List<ZeroResultProductCategoriesItem1> zeroResultProductCategoriesItems) {
            Intrinsics.h(zeroResultProductCategoriesItems, "zeroResultProductCategoriesItems");
            return new OnZeroResultProductCategories1(zeroResultProductCategoriesTitle, zeroResultProductCategoriesItems);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnZeroResultProductCategories1)) {
                return false;
            }
            OnZeroResultProductCategories1 onZeroResultProductCategories1 = (OnZeroResultProductCategories1) other;
            return Intrinsics.c(this.zeroResultProductCategoriesTitle, onZeroResultProductCategories1.zeroResultProductCategoriesTitle) && Intrinsics.c(this.zeroResultProductCategoriesItems, onZeroResultProductCategories1.zeroResultProductCategoriesItems);
        }

        @NotNull
        public final List<ZeroResultProductCategoriesItem1> getZeroResultProductCategoriesItems() {
            return this.zeroResultProductCategoriesItems;
        }

        @Nullable
        public final String getZeroResultProductCategoriesTitle() {
            return this.zeroResultProductCategoriesTitle;
        }

        public int hashCode() {
            String str = this.zeroResultProductCategoriesTitle;
            return this.zeroResultProductCategoriesItems.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return au.com.woolworths.android.onesite.a.i("OnZeroResultProductCategories1(zeroResultProductCategoriesTitle=", this.zeroResultProductCategoriesTitle, ", zeroResultProductCategoriesItems=", ")", this.zeroResultProductCategoriesItems);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$PrimaryCta;", "", AnnotatedPrivateKey.LABEL, "", "<init>", "(Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$Product;", "", "__typename", "", "productId", AppMeasurementSdk.ConditionalUserProperty.NAME, "productImage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "get__typename", "()Ljava/lang/String;", "getProductId", "getName", "getProductImage", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Product {
        public static final int $stable = 0;

        @NotNull
        private final String __typename;

        @NotNull
        private final String name;

        @NotNull
        private final String productId;

        @Nullable
        private final String productImage;

        public Product(@NotNull String __typename, @NotNull String productId, @NotNull String name, @Nullable String str) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(productId, "productId");
            Intrinsics.h(name, "name");
            this.__typename = __typename;
            this.productId = productId;
            this.name = name;
            this.productImage = str;
        }

        public static /* synthetic */ Product copy$default(Product product, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = product.__typename;
            }
            if ((i & 2) != 0) {
                str2 = product.productId;
            }
            if ((i & 4) != 0) {
                str3 = product.name;
            }
            if ((i & 8) != 0) {
                str4 = product.productImage;
            }
            return product.copy(str, str2, str3, str4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getProductId() {
            return this.productId;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getProductImage() {
            return this.productImage;
        }

        @NotNull
        public final Product copy(@NotNull String __typename, @NotNull String productId, @NotNull String name, @Nullable String productImage) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(productId, "productId");
            Intrinsics.h(name, "name");
            return new Product(__typename, productId, name, productImage);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Product)) {
                return false;
            }
            Product product = (Product) other;
            return Intrinsics.c(this.__typename, product.__typename) && Intrinsics.c(this.productId, product.productId) && Intrinsics.c(this.name, product.name) && Intrinsics.c(this.productImage, product.productImage);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getProductId() {
            return this.productId;
        }

        @Nullable
        public final String getProductImage() {
            return this.productImage;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int iC = b.c(b.c(this.__typename.hashCode() * 31, 31, this.productId), 31, this.name);
            String str = this.productImage;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.__typename;
            String str2 = this.productId;
            return a.l(YU.a.v("Product(__typename=", str, ", productId=", str2, ", name="), this.name, ", productImage=", this.productImage, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$ProductCategoryTileAction;", "", "type", "Lau/com/woolworths/shop/graphql/type/ActionType;", UrlHandler.ACTION, "", "id", "<init>", "(Lau/com/woolworths/shop/graphql/type/ActionType;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Lau/com/woolworths/shop/graphql/type/ActionType;", "getAction", "()Ljava/lang/String;", "getId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductCategoryTileAction {
        public static final int $stable = 0;

        @NotNull
        private final String action;

        @Nullable
        private final String id;

        @NotNull
        private final ActionType type;

        public ProductCategoryTileAction(@NotNull ActionType type, @NotNull String action, @Nullable String str) {
            Intrinsics.h(type, "type");
            Intrinsics.h(action, "action");
            this.type = type;
            this.action = action;
            this.id = str;
        }

        public static /* synthetic */ ProductCategoryTileAction copy$default(ProductCategoryTileAction productCategoryTileAction, ActionType actionType, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                actionType = productCategoryTileAction.type;
            }
            if ((i & 2) != 0) {
                str = productCategoryTileAction.action;
            }
            if ((i & 4) != 0) {
                str2 = productCategoryTileAction.id;
            }
            return productCategoryTileAction.copy(actionType, str, str2);
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
        public final ProductCategoryTileAction copy(@NotNull ActionType type, @NotNull String action, @Nullable String id) {
            Intrinsics.h(type, "type");
            Intrinsics.h(action, "action");
            return new ProductCategoryTileAction(type, action, id);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductCategoryTileAction)) {
                return false;
            }
            ProductCategoryTileAction productCategoryTileAction = (ProductCategoryTileAction) other;
            return this.type == productCategoryTileAction.type && Intrinsics.c(this.action, productCategoryTileAction.action) && Intrinsics.c(this.id, productCategoryTileAction.id);
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
            return YU.a.o(d.s("ProductCategoryTileAction(type=", actionType, ", action=", str, ", id="), this.id, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$ProductCategoryTileAction1;", "", "type", "Lau/com/woolworths/shop/graphql/type/ActionType;", UrlHandler.ACTION, "", "id", "<init>", "(Lau/com/woolworths/shop/graphql/type/ActionType;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Lau/com/woolworths/shop/graphql/type/ActionType;", "getAction", "()Ljava/lang/String;", "getId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductCategoryTileAction1 {
        public static final int $stable = 0;

        @NotNull
        private final String action;

        @Nullable
        private final String id;

        @NotNull
        private final ActionType type;

        public ProductCategoryTileAction1(@NotNull ActionType type, @NotNull String action, @Nullable String str) {
            Intrinsics.h(type, "type");
            Intrinsics.h(action, "action");
            this.type = type;
            this.action = action;
            this.id = str;
        }

        public static /* synthetic */ ProductCategoryTileAction1 copy$default(ProductCategoryTileAction1 productCategoryTileAction1, ActionType actionType, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                actionType = productCategoryTileAction1.type;
            }
            if ((i & 2) != 0) {
                str = productCategoryTileAction1.action;
            }
            if ((i & 4) != 0) {
                str2 = productCategoryTileAction1.id;
            }
            return productCategoryTileAction1.copy(actionType, str, str2);
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
        public final ProductCategoryTileAction1 copy(@NotNull ActionType type, @NotNull String action, @Nullable String id) {
            Intrinsics.h(type, "type");
            Intrinsics.h(action, "action");
            return new ProductCategoryTileAction1(type, action, id);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductCategoryTileAction1)) {
                return false;
            }
            ProductCategoryTileAction1 productCategoryTileAction1 = (ProductCategoryTileAction1) other;
            return this.type == productCategoryTileAction1.type && Intrinsics.c(this.action, productCategoryTileAction1.action) && Intrinsics.c(this.id, productCategoryTileAction1.id);
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
            return YU.a.o(d.s("ProductCategoryTileAction1(type=", actionType, ", action=", str, ", id="), this.id, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B»\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\b\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b \u0010!J\u0010\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#J\u000b\u0010?\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010@\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000b0\bHÆ\u0003J\u000f\u0010B\u001a\b\u0012\u0004\u0012\u00020\r0\bHÆ\u0003J\u000f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u000f0\bHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u0011\u0010H\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\bHÆ\u0003J\u0011\u0010I\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\bHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u001fHÆ\u0003Jà\u0001\u0010L\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\b2\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÆ\u0001¢\u0006\u0002\u0010MJ\u0013\u0010N\u001a\u00020O2\b\u0010P\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Q\u001a\u00020\u0003HÖ\u0001J\t\u0010R\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010$\u001a\u0004\b%\u0010#R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010)R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b5\u0010)R\u0019\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b6\u0010)R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<¨\u0006S"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$ProductList;", "", "totalNumberOfProducts", "", "nextPage", "pageTitle", "", "analytics", "", "Lcom/woolworths/product/list/legacy/ProductListQuery$Analytic;", "productsFeed", "Lcom/woolworths/product/list/legacy/ProductListQuery$ProductsFeed;", "filters", "Lcom/woolworths/product/list/legacy/ProductListQuery$Filter;", "sortOptions", "Lcom/woolworths/product/list/legacy/ProductListQuery$SortOption;", "sortOptionsBanner", "Lcom/woolworths/product/list/legacy/ProductListQuery$SortOptionsBanner;", "marketplaceFilterSwitch", "Lcom/woolworths/product/list/legacy/ProductListQuery$MarketplaceFilterSwitch;", "marketplaceInfo", "Lcom/woolworths/product/list/legacy/ProductListQuery$MarketplaceInfo;", "marketplaceBottomSheet", "Lcom/woolworths/product/list/legacy/ProductListQuery$MarketplaceBottomSheet;", "chips", "Lcom/woolworths/product/list/legacy/ProductListQuery$Chip;", "facetChips", "Lcom/woolworths/product/list/legacy/ProductListQuery$FacetChip;", "zeroResultContent", "Lcom/woolworths/product/list/legacy/ProductListQuery$ZeroResultContent;", "zeroResult", "Lcom/woolworths/product/list/legacy/ProductListQuery$ZeroResult;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/woolworths/product/list/legacy/ProductListQuery$SortOptionsBanner;Lcom/woolworths/product/list/legacy/ProductListQuery$MarketplaceFilterSwitch;Lcom/woolworths/product/list/legacy/ProductListQuery$MarketplaceInfo;Lcom/woolworths/product/list/legacy/ProductListQuery$MarketplaceBottomSheet;Ljava/util/List;Ljava/util/List;Lcom/woolworths/product/list/legacy/ProductListQuery$ZeroResultContent;Lcom/woolworths/product/list/legacy/ProductListQuery$ZeroResult;)V", "getTotalNumberOfProducts", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNextPage", "getPageTitle", "()Ljava/lang/String;", "getAnalytics", "()Ljava/util/List;", "getProductsFeed", "getFilters", "getSortOptions", "getSortOptionsBanner", "()Lcom/woolworths/product/list/legacy/ProductListQuery$SortOptionsBanner;", "getMarketplaceFilterSwitch", "()Lcom/woolworths/product/list/legacy/ProductListQuery$MarketplaceFilterSwitch;", "getMarketplaceInfo", "()Lcom/woolworths/product/list/legacy/ProductListQuery$MarketplaceInfo;", "getMarketplaceBottomSheet", "()Lcom/woolworths/product/list/legacy/ProductListQuery$MarketplaceBottomSheet;", "getChips", "getFacetChips", "getZeroResultContent$annotations", "()V", "getZeroResultContent", "()Lcom/woolworths/product/list/legacy/ProductListQuery$ZeroResultContent;", "getZeroResult", "()Lcom/woolworths/product/list/legacy/ProductListQuery$ZeroResult;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/woolworths/product/list/legacy/ProductListQuery$SortOptionsBanner;Lcom/woolworths/product/list/legacy/ProductListQuery$MarketplaceFilterSwitch;Lcom/woolworths/product/list/legacy/ProductListQuery$MarketplaceInfo;Lcom/woolworths/product/list/legacy/ProductListQuery$MarketplaceBottomSheet;Ljava/util/List;Ljava/util/List;Lcom/woolworths/product/list/legacy/ProductListQuery$ZeroResultContent;Lcom/woolworths/product/list/legacy/ProductListQuery$ZeroResult;)Lcom/woolworths/product/list/legacy/ProductListQuery$ProductList;", "equals", "", "other", "hashCode", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductList {
        public static final int $stable = 8;

        @Nullable
        private final List<Analytic> analytics;

        @Nullable
        private final List<Chip> chips;

        @Nullable
        private final List<FacetChip> facetChips;

        @NotNull
        private final List<Filter> filters;

        @Nullable
        private final MarketplaceBottomSheet marketplaceBottomSheet;

        @Nullable
        private final MarketplaceFilterSwitch marketplaceFilterSwitch;

        @Nullable
        private final MarketplaceInfo marketplaceInfo;

        @Nullable
        private final Integer nextPage;

        @Nullable
        private final String pageTitle;

        @NotNull
        private final List<ProductsFeed> productsFeed;

        @NotNull
        private final List<SortOption> sortOptions;

        @Nullable
        private final SortOptionsBanner sortOptionsBanner;

        @Nullable
        private final Integer totalNumberOfProducts;

        @Nullable
        private final ZeroResult zeroResult;

        @Nullable
        private final ZeroResultContent zeroResultContent;

        public ProductList(@Nullable Integer num, @Nullable Integer num2, @Nullable String str, @Nullable List<Analytic> list, @NotNull List<ProductsFeed> productsFeed, @NotNull List<Filter> filters, @NotNull List<SortOption> sortOptions, @Nullable SortOptionsBanner sortOptionsBanner, @Nullable MarketplaceFilterSwitch marketplaceFilterSwitch, @Nullable MarketplaceInfo marketplaceInfo, @Nullable MarketplaceBottomSheet marketplaceBottomSheet, @Nullable List<Chip> list2, @Nullable List<FacetChip> list3, @Nullable ZeroResultContent zeroResultContent, @Nullable ZeroResult zeroResult) {
            Intrinsics.h(productsFeed, "productsFeed");
            Intrinsics.h(filters, "filters");
            Intrinsics.h(sortOptions, "sortOptions");
            this.totalNumberOfProducts = num;
            this.nextPage = num2;
            this.pageTitle = str;
            this.analytics = list;
            this.productsFeed = productsFeed;
            this.filters = filters;
            this.sortOptions = sortOptions;
            this.sortOptionsBanner = sortOptionsBanner;
            this.marketplaceFilterSwitch = marketplaceFilterSwitch;
            this.marketplaceInfo = marketplaceInfo;
            this.marketplaceBottomSheet = marketplaceBottomSheet;
            this.chips = list2;
            this.facetChips = list3;
            this.zeroResultContent = zeroResultContent;
            this.zeroResult = zeroResult;
        }

        @Deprecated
        public static /* synthetic */ void getZeroResultContent$annotations() {
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final Integer getTotalNumberOfProducts() {
            return this.totalNumberOfProducts;
        }

        @Nullable
        /* renamed from: component10, reason: from getter */
        public final MarketplaceInfo getMarketplaceInfo() {
            return this.marketplaceInfo;
        }

        @Nullable
        /* renamed from: component11, reason: from getter */
        public final MarketplaceBottomSheet getMarketplaceBottomSheet() {
            return this.marketplaceBottomSheet;
        }

        @Nullable
        public final List<Chip> component12() {
            return this.chips;
        }

        @Nullable
        public final List<FacetChip> component13() {
            return this.facetChips;
        }

        @Nullable
        /* renamed from: component14, reason: from getter */
        public final ZeroResultContent getZeroResultContent() {
            return this.zeroResultContent;
        }

        @Nullable
        /* renamed from: component15, reason: from getter */
        public final ZeroResult getZeroResult() {
            return this.zeroResult;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Integer getNextPage() {
            return this.nextPage;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getPageTitle() {
            return this.pageTitle;
        }

        @Nullable
        public final List<Analytic> component4() {
            return this.analytics;
        }

        @NotNull
        public final List<ProductsFeed> component5() {
            return this.productsFeed;
        }

        @NotNull
        public final List<Filter> component6() {
            return this.filters;
        }

        @NotNull
        public final List<SortOption> component7() {
            return this.sortOptions;
        }

        @Nullable
        /* renamed from: component8, reason: from getter */
        public final SortOptionsBanner getSortOptionsBanner() {
            return this.sortOptionsBanner;
        }

        @Nullable
        /* renamed from: component9, reason: from getter */
        public final MarketplaceFilterSwitch getMarketplaceFilterSwitch() {
            return this.marketplaceFilterSwitch;
        }

        @NotNull
        public final ProductList copy(@Nullable Integer totalNumberOfProducts, @Nullable Integer nextPage, @Nullable String pageTitle, @Nullable List<Analytic> analytics, @NotNull List<ProductsFeed> productsFeed, @NotNull List<Filter> filters, @NotNull List<SortOption> sortOptions, @Nullable SortOptionsBanner sortOptionsBanner, @Nullable MarketplaceFilterSwitch marketplaceFilterSwitch, @Nullable MarketplaceInfo marketplaceInfo, @Nullable MarketplaceBottomSheet marketplaceBottomSheet, @Nullable List<Chip> chips, @Nullable List<FacetChip> facetChips, @Nullable ZeroResultContent zeroResultContent, @Nullable ZeroResult zeroResult) {
            Intrinsics.h(productsFeed, "productsFeed");
            Intrinsics.h(filters, "filters");
            Intrinsics.h(sortOptions, "sortOptions");
            return new ProductList(totalNumberOfProducts, nextPage, pageTitle, analytics, productsFeed, filters, sortOptions, sortOptionsBanner, marketplaceFilterSwitch, marketplaceInfo, marketplaceBottomSheet, chips, facetChips, zeroResultContent, zeroResult);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductList)) {
                return false;
            }
            ProductList productList = (ProductList) other;
            return Intrinsics.c(this.totalNumberOfProducts, productList.totalNumberOfProducts) && Intrinsics.c(this.nextPage, productList.nextPage) && Intrinsics.c(this.pageTitle, productList.pageTitle) && Intrinsics.c(this.analytics, productList.analytics) && Intrinsics.c(this.productsFeed, productList.productsFeed) && Intrinsics.c(this.filters, productList.filters) && Intrinsics.c(this.sortOptions, productList.sortOptions) && Intrinsics.c(this.sortOptionsBanner, productList.sortOptionsBanner) && Intrinsics.c(this.marketplaceFilterSwitch, productList.marketplaceFilterSwitch) && Intrinsics.c(this.marketplaceInfo, productList.marketplaceInfo) && Intrinsics.c(this.marketplaceBottomSheet, productList.marketplaceBottomSheet) && Intrinsics.c(this.chips, productList.chips) && Intrinsics.c(this.facetChips, productList.facetChips) && Intrinsics.c(this.zeroResultContent, productList.zeroResultContent) && Intrinsics.c(this.zeroResult, productList.zeroResult);
        }

        @Nullable
        public final List<Analytic> getAnalytics() {
            return this.analytics;
        }

        @Nullable
        public final List<Chip> getChips() {
            return this.chips;
        }

        @Nullable
        public final List<FacetChip> getFacetChips() {
            return this.facetChips;
        }

        @NotNull
        public final List<Filter> getFilters() {
            return this.filters;
        }

        @Nullable
        public final MarketplaceBottomSheet getMarketplaceBottomSheet() {
            return this.marketplaceBottomSheet;
        }

        @Nullable
        public final MarketplaceFilterSwitch getMarketplaceFilterSwitch() {
            return this.marketplaceFilterSwitch;
        }

        @Nullable
        public final MarketplaceInfo getMarketplaceInfo() {
            return this.marketplaceInfo;
        }

        @Nullable
        public final Integer getNextPage() {
            return this.nextPage;
        }

        @Nullable
        public final String getPageTitle() {
            return this.pageTitle;
        }

        @NotNull
        public final List<ProductsFeed> getProductsFeed() {
            return this.productsFeed;
        }

        @NotNull
        public final List<SortOption> getSortOptions() {
            return this.sortOptions;
        }

        @Nullable
        public final SortOptionsBanner getSortOptionsBanner() {
            return this.sortOptionsBanner;
        }

        @Nullable
        public final Integer getTotalNumberOfProducts() {
            return this.totalNumberOfProducts;
        }

        @Nullable
        public final ZeroResult getZeroResult() {
            return this.zeroResult;
        }

        @Nullable
        public final ZeroResultContent getZeroResultContent() {
            return this.zeroResultContent;
        }

        public int hashCode() {
            Integer num = this.totalNumberOfProducts;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.nextPage;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str = this.pageTitle;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            List<Analytic> list = this.analytics;
            int iD = b.d(b.d(b.d((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31, 31, this.productsFeed), 31, this.filters), 31, this.sortOptions);
            SortOptionsBanner sortOptionsBanner = this.sortOptionsBanner;
            int iHashCode4 = (iD + (sortOptionsBanner == null ? 0 : sortOptionsBanner.hashCode())) * 31;
            MarketplaceFilterSwitch marketplaceFilterSwitch = this.marketplaceFilterSwitch;
            int iHashCode5 = (iHashCode4 + (marketplaceFilterSwitch == null ? 0 : marketplaceFilterSwitch.hashCode())) * 31;
            MarketplaceInfo marketplaceInfo = this.marketplaceInfo;
            int iHashCode6 = (iHashCode5 + (marketplaceInfo == null ? 0 : marketplaceInfo.hashCode())) * 31;
            MarketplaceBottomSheet marketplaceBottomSheet = this.marketplaceBottomSheet;
            int iHashCode7 = (iHashCode6 + (marketplaceBottomSheet == null ? 0 : marketplaceBottomSheet.hashCode())) * 31;
            List<Chip> list2 = this.chips;
            int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<FacetChip> list3 = this.facetChips;
            int iHashCode9 = (iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
            ZeroResultContent zeroResultContent = this.zeroResultContent;
            int iHashCode10 = (iHashCode9 + (zeroResultContent == null ? 0 : zeroResultContent.hashCode())) * 31;
            ZeroResult zeroResult = this.zeroResult;
            return iHashCode10 + (zeroResult != null ? zeroResult.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Integer num = this.totalNumberOfProducts;
            Integer num2 = this.nextPage;
            String str = this.pageTitle;
            List<Analytic> list = this.analytics;
            List<ProductsFeed> list2 = this.productsFeed;
            List<Filter> list3 = this.filters;
            List<SortOption> list4 = this.sortOptions;
            SortOptionsBanner sortOptionsBanner = this.sortOptionsBanner;
            MarketplaceFilterSwitch marketplaceFilterSwitch = this.marketplaceFilterSwitch;
            MarketplaceInfo marketplaceInfo = this.marketplaceInfo;
            MarketplaceBottomSheet marketplaceBottomSheet = this.marketplaceBottomSheet;
            List<Chip> list5 = this.chips;
            List<FacetChip> list6 = this.facetChips;
            ZeroResultContent zeroResultContent = this.zeroResultContent;
            ZeroResult zeroResult = this.zeroResult;
            StringBuilder sbV = d.v("ProductList(totalNumberOfProducts=", num, ", nextPage=", num2, ", pageTitle=");
            au.com.woolworths.android.onesite.a.B(sbV, str, ", analytics=", list, ", productsFeed=");
            au.com.woolworths.android.onesite.a.C(sbV, list2, ", filters=", list3, ", sortOptions=");
            sbV.append(list4);
            sbV.append(", sortOptionsBanner=");
            sbV.append(sortOptionsBanner);
            sbV.append(", marketplaceFilterSwitch=");
            sbV.append(marketplaceFilterSwitch);
            sbV.append(", marketplaceInfo=");
            sbV.append(marketplaceInfo);
            sbV.append(", marketplaceBottomSheet=");
            sbV.append(marketplaceBottomSheet);
            sbV.append(", chips=");
            sbV.append(list5);
            sbV.append(", facetChips=");
            sbV.append(list6);
            sbV.append(", zeroResultContent=");
            sbV.append(zeroResultContent);
            sbV.append(", zeroResult=");
            sbV.append(zeroResult);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0013HÆ\u0003Js\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u00068"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$ProductsFeed;", "", "__typename", "", "onActionableCard", "Lcom/woolworths/product/list/legacy/ProductListQuery$OnActionableCard;", "onGoogleAdBannerCard", "Lcom/woolworths/product/list/legacy/ProductListQuery$OnGoogleAdBannerCard;", "onUniversalInventoryContainer", "Lcom/woolworths/product/list/legacy/ProductListQuery$OnUniversalInventoryContainer;", "onHorizontalList", "Lcom/woolworths/product/list/legacy/ProductListQuery$OnHorizontalList;", "onVideoAdUnit", "Lcom/woolworths/product/list/legacy/ProductListQuery$OnVideoAdUnit;", "onMerchCard", "Lcom/woolworths/product/list/legacy/ProductListQuery$OnMerchCard;", "onInsetBanner", "Lcom/woolworths/product/list/legacy/ProductListQuery$OnInsetBanner;", "onProductCard", "Lcom/woolworths/product/list/legacy/ProductListQuery$OnProductCard1;", "<init>", "(Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductListQuery$OnActionableCard;Lcom/woolworths/product/list/legacy/ProductListQuery$OnGoogleAdBannerCard;Lcom/woolworths/product/list/legacy/ProductListQuery$OnUniversalInventoryContainer;Lcom/woolworths/product/list/legacy/ProductListQuery$OnHorizontalList;Lcom/woolworths/product/list/legacy/ProductListQuery$OnVideoAdUnit;Lcom/woolworths/product/list/legacy/ProductListQuery$OnMerchCard;Lcom/woolworths/product/list/legacy/ProductListQuery$OnInsetBanner;Lcom/woolworths/product/list/legacy/ProductListQuery$OnProductCard1;)V", "get__typename", "()Ljava/lang/String;", "getOnActionableCard", "()Lcom/woolworths/product/list/legacy/ProductListQuery$OnActionableCard;", "getOnGoogleAdBannerCard", "()Lcom/woolworths/product/list/legacy/ProductListQuery$OnGoogleAdBannerCard;", "getOnUniversalInventoryContainer", "()Lcom/woolworths/product/list/legacy/ProductListQuery$OnUniversalInventoryContainer;", "getOnHorizontalList", "()Lcom/woolworths/product/list/legacy/ProductListQuery$OnHorizontalList;", "getOnVideoAdUnit", "()Lcom/woolworths/product/list/legacy/ProductListQuery$OnVideoAdUnit;", "getOnMerchCard", "()Lcom/woolworths/product/list/legacy/ProductListQuery$OnMerchCard;", "getOnInsetBanner", "()Lcom/woolworths/product/list/legacy/ProductListQuery$OnInsetBanner;", "getOnProductCard", "()Lcom/woolworths/product/list/legacy/ProductListQuery$OnProductCard1;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductsFeed {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @Nullable
        private final OnActionableCard onActionableCard;

        @Nullable
        private final OnGoogleAdBannerCard onGoogleAdBannerCard;

        @Nullable
        private final OnHorizontalList onHorizontalList;

        @Nullable
        private final OnInsetBanner onInsetBanner;

        @Nullable
        private final OnMerchCard onMerchCard;

        @Nullable
        private final OnProductCard1 onProductCard;

        @Nullable
        private final OnUniversalInventoryContainer onUniversalInventoryContainer;

        @Nullable
        private final OnVideoAdUnit onVideoAdUnit;

        public ProductsFeed(@NotNull String __typename, @Nullable OnActionableCard onActionableCard, @Nullable OnGoogleAdBannerCard onGoogleAdBannerCard, @Nullable OnUniversalInventoryContainer onUniversalInventoryContainer, @Nullable OnHorizontalList onHorizontalList, @Nullable OnVideoAdUnit onVideoAdUnit, @Nullable OnMerchCard onMerchCard, @Nullable OnInsetBanner onInsetBanner, @Nullable OnProductCard1 onProductCard1) {
            Intrinsics.h(__typename, "__typename");
            this.__typename = __typename;
            this.onActionableCard = onActionableCard;
            this.onGoogleAdBannerCard = onGoogleAdBannerCard;
            this.onUniversalInventoryContainer = onUniversalInventoryContainer;
            this.onHorizontalList = onHorizontalList;
            this.onVideoAdUnit = onVideoAdUnit;
            this.onMerchCard = onMerchCard;
            this.onInsetBanner = onInsetBanner;
            this.onProductCard = onProductCard1;
        }

        public static /* synthetic */ ProductsFeed copy$default(ProductsFeed productsFeed, String str, OnActionableCard onActionableCard, OnGoogleAdBannerCard onGoogleAdBannerCard, OnUniversalInventoryContainer onUniversalInventoryContainer, OnHorizontalList onHorizontalList, OnVideoAdUnit onVideoAdUnit, OnMerchCard onMerchCard, OnInsetBanner onInsetBanner, OnProductCard1 onProductCard1, int i, Object obj) {
            if ((i & 1) != 0) {
                str = productsFeed.__typename;
            }
            if ((i & 2) != 0) {
                onActionableCard = productsFeed.onActionableCard;
            }
            if ((i & 4) != 0) {
                onGoogleAdBannerCard = productsFeed.onGoogleAdBannerCard;
            }
            if ((i & 8) != 0) {
                onUniversalInventoryContainer = productsFeed.onUniversalInventoryContainer;
            }
            if ((i & 16) != 0) {
                onHorizontalList = productsFeed.onHorizontalList;
            }
            if ((i & 32) != 0) {
                onVideoAdUnit = productsFeed.onVideoAdUnit;
            }
            if ((i & 64) != 0) {
                onMerchCard = productsFeed.onMerchCard;
            }
            if ((i & 128) != 0) {
                onInsetBanner = productsFeed.onInsetBanner;
            }
            if ((i & 256) != 0) {
                onProductCard1 = productsFeed.onProductCard;
            }
            OnInsetBanner onInsetBanner2 = onInsetBanner;
            OnProductCard1 onProductCard12 = onProductCard1;
            OnVideoAdUnit onVideoAdUnit2 = onVideoAdUnit;
            OnMerchCard onMerchCard2 = onMerchCard;
            OnHorizontalList onHorizontalList2 = onHorizontalList;
            OnGoogleAdBannerCard onGoogleAdBannerCard2 = onGoogleAdBannerCard;
            return productsFeed.copy(str, onActionableCard, onGoogleAdBannerCard2, onUniversalInventoryContainer, onHorizontalList2, onVideoAdUnit2, onMerchCard2, onInsetBanner2, onProductCard12);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final OnActionableCard getOnActionableCard() {
            return this.onActionableCard;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final OnGoogleAdBannerCard getOnGoogleAdBannerCard() {
            return this.onGoogleAdBannerCard;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final OnUniversalInventoryContainer getOnUniversalInventoryContainer() {
            return this.onUniversalInventoryContainer;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final OnHorizontalList getOnHorizontalList() {
            return this.onHorizontalList;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final OnVideoAdUnit getOnVideoAdUnit() {
            return this.onVideoAdUnit;
        }

        @Nullable
        /* renamed from: component7, reason: from getter */
        public final OnMerchCard getOnMerchCard() {
            return this.onMerchCard;
        }

        @Nullable
        /* renamed from: component8, reason: from getter */
        public final OnInsetBanner getOnInsetBanner() {
            return this.onInsetBanner;
        }

        @Nullable
        /* renamed from: component9, reason: from getter */
        public final OnProductCard1 getOnProductCard() {
            return this.onProductCard;
        }

        @NotNull
        public final ProductsFeed copy(@NotNull String __typename, @Nullable OnActionableCard onActionableCard, @Nullable OnGoogleAdBannerCard onGoogleAdBannerCard, @Nullable OnUniversalInventoryContainer onUniversalInventoryContainer, @Nullable OnHorizontalList onHorizontalList, @Nullable OnVideoAdUnit onVideoAdUnit, @Nullable OnMerchCard onMerchCard, @Nullable OnInsetBanner onInsetBanner, @Nullable OnProductCard1 onProductCard) {
            Intrinsics.h(__typename, "__typename");
            return new ProductsFeed(__typename, onActionableCard, onGoogleAdBannerCard, onUniversalInventoryContainer, onHorizontalList, onVideoAdUnit, onMerchCard, onInsetBanner, onProductCard);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductsFeed)) {
                return false;
            }
            ProductsFeed productsFeed = (ProductsFeed) other;
            return Intrinsics.c(this.__typename, productsFeed.__typename) && Intrinsics.c(this.onActionableCard, productsFeed.onActionableCard) && Intrinsics.c(this.onGoogleAdBannerCard, productsFeed.onGoogleAdBannerCard) && Intrinsics.c(this.onUniversalInventoryContainer, productsFeed.onUniversalInventoryContainer) && Intrinsics.c(this.onHorizontalList, productsFeed.onHorizontalList) && Intrinsics.c(this.onVideoAdUnit, productsFeed.onVideoAdUnit) && Intrinsics.c(this.onMerchCard, productsFeed.onMerchCard) && Intrinsics.c(this.onInsetBanner, productsFeed.onInsetBanner) && Intrinsics.c(this.onProductCard, productsFeed.onProductCard);
        }

        @Nullable
        public final OnActionableCard getOnActionableCard() {
            return this.onActionableCard;
        }

        @Nullable
        public final OnGoogleAdBannerCard getOnGoogleAdBannerCard() {
            return this.onGoogleAdBannerCard;
        }

        @Nullable
        public final OnHorizontalList getOnHorizontalList() {
            return this.onHorizontalList;
        }

        @Nullable
        public final OnInsetBanner getOnInsetBanner() {
            return this.onInsetBanner;
        }

        @Nullable
        public final OnMerchCard getOnMerchCard() {
            return this.onMerchCard;
        }

        @Nullable
        public final OnProductCard1 getOnProductCard() {
            return this.onProductCard;
        }

        @Nullable
        public final OnUniversalInventoryContainer getOnUniversalInventoryContainer() {
            return this.onUniversalInventoryContainer;
        }

        @Nullable
        public final OnVideoAdUnit getOnVideoAdUnit() {
            return this.onVideoAdUnit;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int iHashCode = this.__typename.hashCode() * 31;
            OnActionableCard onActionableCard = this.onActionableCard;
            int iHashCode2 = (iHashCode + (onActionableCard == null ? 0 : onActionableCard.hashCode())) * 31;
            OnGoogleAdBannerCard onGoogleAdBannerCard = this.onGoogleAdBannerCard;
            int iHashCode3 = (iHashCode2 + (onGoogleAdBannerCard == null ? 0 : onGoogleAdBannerCard.hashCode())) * 31;
            OnUniversalInventoryContainer onUniversalInventoryContainer = this.onUniversalInventoryContainer;
            int iHashCode4 = (iHashCode3 + (onUniversalInventoryContainer == null ? 0 : onUniversalInventoryContainer.hashCode())) * 31;
            OnHorizontalList onHorizontalList = this.onHorizontalList;
            int iHashCode5 = (iHashCode4 + (onHorizontalList == null ? 0 : onHorizontalList.hashCode())) * 31;
            OnVideoAdUnit onVideoAdUnit = this.onVideoAdUnit;
            int iHashCode6 = (iHashCode5 + (onVideoAdUnit == null ? 0 : onVideoAdUnit.hashCode())) * 31;
            OnMerchCard onMerchCard = this.onMerchCard;
            int iHashCode7 = (iHashCode6 + (onMerchCard == null ? 0 : onMerchCard.hashCode())) * 31;
            OnInsetBanner onInsetBanner = this.onInsetBanner;
            int iHashCode8 = (iHashCode7 + (onInsetBanner == null ? 0 : onInsetBanner.hashCode())) * 31;
            OnProductCard1 onProductCard1 = this.onProductCard;
            return iHashCode8 + (onProductCard1 != null ? onProductCard1.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ProductsFeed(__typename=" + this.__typename + ", onActionableCard=" + this.onActionableCard + ", onGoogleAdBannerCard=" + this.onGoogleAdBannerCard + ", onUniversalInventoryContainer=" + this.onUniversalInventoryContainer + ", onHorizontalList=" + this.onHorizontalList + ", onVideoAdUnit=" + this.onVideoAdUnit + ", onMerchCard=" + this.onMerchCard + ", onInsetBanner=" + this.onInsetBanner + ", onProductCard=" + this.onProductCard + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$SecondaryCta;", "", AnnotatedPrivateKey.LABEL, "", "<init>", "(Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$SortOption;", "", "key", "", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "isApplied", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getKey", "()Ljava/lang/String;", "getTitle", "getSubtitle", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SortOption {
        public static final int $stable = 0;
        private final boolean isApplied;

        @NotNull
        private final String key;

        @Nullable
        private final String subtitle;

        @NotNull
        private final String title;

        public SortOption(@NotNull String key, @NotNull String title, @Nullable String str, boolean z) {
            Intrinsics.h(key, "key");
            Intrinsics.h(title, "title");
            this.key = key;
            this.title = title;
            this.subtitle = str;
            this.isApplied = z;
        }

        public static /* synthetic */ SortOption copy$default(SortOption sortOption, String str, String str2, String str3, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sortOption.key;
            }
            if ((i & 2) != 0) {
                str2 = sortOption.title;
            }
            if ((i & 4) != 0) {
                str3 = sortOption.subtitle;
            }
            if ((i & 8) != 0) {
                z = sortOption.isApplied;
            }
            return sortOption.copy(str, str2, str3, z);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsApplied() {
            return this.isApplied;
        }

        @NotNull
        public final SortOption copy(@NotNull String key, @NotNull String title, @Nullable String subtitle, boolean isApplied) {
            Intrinsics.h(key, "key");
            Intrinsics.h(title, "title");
            return new SortOption(key, title, subtitle, isApplied);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SortOption)) {
                return false;
            }
            SortOption sortOption = (SortOption) other;
            return Intrinsics.c(this.key, sortOption.key) && Intrinsics.c(this.title, sortOption.title) && Intrinsics.c(this.subtitle, sortOption.subtitle) && this.isApplied == sortOption.isApplied;
        }

        @NotNull
        public final String getKey() {
            return this.key;
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
            int iC = b.c(this.key.hashCode() * 31, 31, this.title);
            String str = this.subtitle;
            return Boolean.hashCode(this.isApplied) + ((iC + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final boolean isApplied() {
            return this.isApplied;
        }

        @NotNull
        public String toString() {
            String str = this.key;
            String str2 = this.title;
            return d.r(this.subtitle, ", isApplied=", ")", YU.a.v("SortOption(key=", str, ", title=", str2, ", subtitle="), this.isApplied);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$SortOptionsBanner;", "", "__typename", "", "insetBanner", "Lcom/woolworths/product/list/legacy/fragment/InsetBanner;", "<init>", "(Ljava/lang/String;Lcom/woolworths/product/list/legacy/fragment/InsetBanner;)V", "get__typename", "()Ljava/lang/String;", "getInsetBanner", "()Lcom/woolworths/product/list/legacy/fragment/InsetBanner;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SortOptionsBanner {
        public static final int $stable = 0;

        @NotNull
        private final String __typename;

        @NotNull
        private final InsetBanner insetBanner;

        public SortOptionsBanner(@NotNull String __typename, @NotNull InsetBanner insetBanner) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(insetBanner, "insetBanner");
            this.__typename = __typename;
            this.insetBanner = insetBanner;
        }

        public static /* synthetic */ SortOptionsBanner copy$default(SortOptionsBanner sortOptionsBanner, String str, InsetBanner insetBanner, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sortOptionsBanner.__typename;
            }
            if ((i & 2) != 0) {
                insetBanner = sortOptionsBanner.insetBanner;
            }
            return sortOptionsBanner.copy(str, insetBanner);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final InsetBanner getInsetBanner() {
            return this.insetBanner;
        }

        @NotNull
        public final SortOptionsBanner copy(@NotNull String __typename, @NotNull InsetBanner insetBanner) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(insetBanner, "insetBanner");
            return new SortOptionsBanner(__typename, insetBanner);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SortOptionsBanner)) {
                return false;
            }
            SortOptionsBanner sortOptionsBanner = (SortOptionsBanner) other;
            return Intrinsics.c(this.__typename, sortOptionsBanner.__typename) && Intrinsics.c(this.insetBanner, sortOptionsBanner.insetBanner);
        }

        @NotNull
        public final InsetBanner getInsetBanner() {
            return this.insetBanner;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.insetBanner.hashCode() + (this.__typename.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "SortOptionsBanner(__typename=" + this.__typename + ", insetBanner=" + this.insetBanner + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$TermsAndConditions;", "", "__typename", "", "videoAdBottomSheet", "Lcom/woolworths/product/list/legacy/fragment/VideoAdBottomSheet;", "<init>", "(Ljava/lang/String;Lcom/woolworths/product/list/legacy/fragment/VideoAdBottomSheet;)V", "get__typename", "()Ljava/lang/String;", "getVideoAdBottomSheet", "()Lcom/woolworths/product/list/legacy/fragment/VideoAdBottomSheet;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TermsAndConditions {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final VideoAdBottomSheet videoAdBottomSheet;

        public TermsAndConditions(@NotNull String __typename, @NotNull VideoAdBottomSheet videoAdBottomSheet) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(videoAdBottomSheet, "videoAdBottomSheet");
            this.__typename = __typename;
            this.videoAdBottomSheet = videoAdBottomSheet;
        }

        public static /* synthetic */ TermsAndConditions copy$default(TermsAndConditions termsAndConditions, String str, VideoAdBottomSheet videoAdBottomSheet, int i, Object obj) {
            if ((i & 1) != 0) {
                str = termsAndConditions.__typename;
            }
            if ((i & 2) != 0) {
                videoAdBottomSheet = termsAndConditions.videoAdBottomSheet;
            }
            return termsAndConditions.copy(str, videoAdBottomSheet);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final VideoAdBottomSheet getVideoAdBottomSheet() {
            return this.videoAdBottomSheet;
        }

        @NotNull
        public final TermsAndConditions copy(@NotNull String __typename, @NotNull VideoAdBottomSheet videoAdBottomSheet) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(videoAdBottomSheet, "videoAdBottomSheet");
            return new TermsAndConditions(__typename, videoAdBottomSheet);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TermsAndConditions)) {
                return false;
            }
            TermsAndConditions termsAndConditions = (TermsAndConditions) other;
            return Intrinsics.c(this.__typename, termsAndConditions.__typename) && Intrinsics.c(this.videoAdBottomSheet, termsAndConditions.videoAdBottomSheet);
        }

        @NotNull
        public final VideoAdBottomSheet getVideoAdBottomSheet() {
            return this.videoAdBottomSheet;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.videoAdBottomSheet.hashCode() + (this.__typename.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "TermsAndConditions(__typename=" + this.__typename + ", videoAdBottomSheet=" + this.videoAdBottomSheet + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$Text;", "", TextBundle.TEXT_ENTRY, "", "altText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getAltText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Text {
        public static final int $stable = 0;

        @NotNull
        private final String altText;

        @NotNull
        private final String text;

        public Text(@NotNull String text, @NotNull String altText) {
            Intrinsics.h(text, "text");
            Intrinsics.h(altText, "altText");
            this.text = text;
            this.altText = altText;
        }

        public static /* synthetic */ Text copy$default(Text text, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = text.text;
            }
            if ((i & 2) != 0) {
                str2 = text.altText;
            }
            return text.copy(str, str2);
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
        public final Text copy(@NotNull String text, @NotNull String altText) {
            Intrinsics.h(text, "text");
            Intrinsics.h(altText, "altText");
            return new Text(text, altText);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Text)) {
                return false;
            }
            Text text = (Text) other;
            return Intrinsics.c(this.text, text.text) && Intrinsics.c(this.altText, text.altText);
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
            return YU.a.j("Text(text=", this.text, ", altText=", this.altText, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$Text1;", "", TextBundle.TEXT_ENTRY, "", "altText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getAltText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Text1 {
        public static final int $stable = 0;

        @NotNull
        private final String altText;

        @NotNull
        private final String text;

        public Text1(@NotNull String text, @NotNull String altText) {
            Intrinsics.h(text, "text");
            Intrinsics.h(altText, "altText");
            this.text = text;
            this.altText = altText;
        }

        public static /* synthetic */ Text1 copy$default(Text1 text1, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = text1.text;
            }
            if ((i & 2) != 0) {
                str2 = text1.altText;
            }
            return text1.copy(str, str2);
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
        public final Text1 copy(@NotNull String text, @NotNull String altText) {
            Intrinsics.h(text, "text");
            Intrinsics.h(altText, "altText");
            return new Text1(text, altText);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Text1)) {
                return false;
            }
            Text1 text1 = (Text1) other;
            return Intrinsics.c(this.text, text1.text) && Intrinsics.c(this.altText, text1.altText);
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
            return YU.a.j("Text1(text=", this.text, ", altText=", this.altText, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$Transcript;", "", "__typename", "", "videoAdBottomSheet", "Lcom/woolworths/product/list/legacy/fragment/VideoAdBottomSheet;", "<init>", "(Ljava/lang/String;Lcom/woolworths/product/list/legacy/fragment/VideoAdBottomSheet;)V", "get__typename", "()Ljava/lang/String;", "getVideoAdBottomSheet", "()Lcom/woolworths/product/list/legacy/fragment/VideoAdBottomSheet;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Transcript {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final VideoAdBottomSheet videoAdBottomSheet;

        public Transcript(@NotNull String __typename, @NotNull VideoAdBottomSheet videoAdBottomSheet) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(videoAdBottomSheet, "videoAdBottomSheet");
            this.__typename = __typename;
            this.videoAdBottomSheet = videoAdBottomSheet;
        }

        public static /* synthetic */ Transcript copy$default(Transcript transcript, String str, VideoAdBottomSheet videoAdBottomSheet, int i, Object obj) {
            if ((i & 1) != 0) {
                str = transcript.__typename;
            }
            if ((i & 2) != 0) {
                videoAdBottomSheet = transcript.videoAdBottomSheet;
            }
            return transcript.copy(str, videoAdBottomSheet);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final VideoAdBottomSheet getVideoAdBottomSheet() {
            return this.videoAdBottomSheet;
        }

        @NotNull
        public final Transcript copy(@NotNull String __typename, @NotNull VideoAdBottomSheet videoAdBottomSheet) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(videoAdBottomSheet, "videoAdBottomSheet");
            return new Transcript(__typename, videoAdBottomSheet);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Transcript)) {
                return false;
            }
            Transcript transcript = (Transcript) other;
            return Intrinsics.c(this.__typename, transcript.__typename) && Intrinsics.c(this.videoAdBottomSheet, transcript.videoAdBottomSheet);
        }

        @NotNull
        public final VideoAdBottomSheet getVideoAdBottomSheet() {
            return this.videoAdBottomSheet;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.videoAdBottomSheet.hashCode() + (this.__typename.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Transcript(__typename=" + this.__typename + ", videoAdBottomSheet=" + this.videoAdBottomSheet + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$VideoAdUnitProductCard;", "", "__typename", "", "productCard", "Lau/com/woolworths/graphql/common/fragment/ProductCard;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/graphql/common/fragment/ProductCard;)V", "get__typename", "()Ljava/lang/String;", "getProductCard", "()Lau/com/woolworths/graphql/common/fragment/ProductCard;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class VideoAdUnitProductCard {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final ProductCard productCard;

        public VideoAdUnitProductCard(@NotNull String __typename, @NotNull ProductCard productCard) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(productCard, "productCard");
            this.__typename = __typename;
            this.productCard = productCard;
        }

        public static /* synthetic */ VideoAdUnitProductCard copy$default(VideoAdUnitProductCard videoAdUnitProductCard, String str, ProductCard productCard, int i, Object obj) {
            if ((i & 1) != 0) {
                str = videoAdUnitProductCard.__typename;
            }
            if ((i & 2) != 0) {
                productCard = videoAdUnitProductCard.productCard;
            }
            return videoAdUnitProductCard.copy(str, productCard);
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
        public final VideoAdUnitProductCard copy(@NotNull String __typename, @NotNull ProductCard productCard) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(productCard, "productCard");
            return new VideoAdUnitProductCard(__typename, productCard);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VideoAdUnitProductCard)) {
                return false;
            }
            VideoAdUnitProductCard videoAdUnitProductCard = (VideoAdUnitProductCard) other;
            return Intrinsics.c(this.__typename, videoAdUnitProductCard.__typename) && Intrinsics.c(this.productCard, videoAdUnitProductCard.productCard);
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
            return d.o("VideoAdUnitProductCard(__typename=", this.__typename, ", productCard=", this.productCard, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jc\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\bHÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00060"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$VideoAdUnitVideoAd;", "", "__typename", "", "url", "fallbackImage", "Lcom/woolworths/product/list/legacy/ProductListQuery$FallbackImage;", "duration", "", "transcript", "Lcom/woolworths/product/list/legacy/ProductListQuery$Transcript;", "termsAndConditions", "Lcom/woolworths/product/list/legacy/ProductListQuery$TermsAndConditions;", "analytics", "Lcom/woolworths/product/list/legacy/ProductListQuery$Analytics3;", "eventAnalytics", "Lcom/woolworths/product/list/legacy/ProductListQuery$EventAnalytics;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductListQuery$FallbackImage;ILcom/woolworths/product/list/legacy/ProductListQuery$Transcript;Lcom/woolworths/product/list/legacy/ProductListQuery$TermsAndConditions;Lcom/woolworths/product/list/legacy/ProductListQuery$Analytics3;Lcom/woolworths/product/list/legacy/ProductListQuery$EventAnalytics;)V", "get__typename", "()Ljava/lang/String;", "getUrl", "getFallbackImage", "()Lcom/woolworths/product/list/legacy/ProductListQuery$FallbackImage;", "getDuration", "()I", "getTranscript", "()Lcom/woolworths/product/list/legacy/ProductListQuery$Transcript;", "getTermsAndConditions", "()Lcom/woolworths/product/list/legacy/ProductListQuery$TermsAndConditions;", "getAnalytics", "()Lcom/woolworths/product/list/legacy/ProductListQuery$Analytics3;", "getEventAnalytics", "()Lcom/woolworths/product/list/legacy/ProductListQuery$EventAnalytics;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class VideoAdUnitVideoAd {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @Nullable
        private final Analytics3 analytics;
        private final int duration;

        @Nullable
        private final EventAnalytics eventAnalytics;

        @Nullable
        private final FallbackImage fallbackImage;

        @Nullable
        private final TermsAndConditions termsAndConditions;

        @Nullable
        private final Transcript transcript;

        @NotNull
        private final String url;

        public VideoAdUnitVideoAd(@NotNull String __typename, @NotNull String url, @Nullable FallbackImage fallbackImage, int i, @Nullable Transcript transcript, @Nullable TermsAndConditions termsAndConditions, @Nullable Analytics3 analytics3, @Nullable EventAnalytics eventAnalytics) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(url, "url");
            this.__typename = __typename;
            this.url = url;
            this.fallbackImage = fallbackImage;
            this.duration = i;
            this.transcript = transcript;
            this.termsAndConditions = termsAndConditions;
            this.analytics = analytics3;
            this.eventAnalytics = eventAnalytics;
        }

        public static /* synthetic */ VideoAdUnitVideoAd copy$default(VideoAdUnitVideoAd videoAdUnitVideoAd, String str, String str2, FallbackImage fallbackImage, int i, Transcript transcript, TermsAndConditions termsAndConditions, Analytics3 analytics3, EventAnalytics eventAnalytics, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = videoAdUnitVideoAd.__typename;
            }
            if ((i2 & 2) != 0) {
                str2 = videoAdUnitVideoAd.url;
            }
            if ((i2 & 4) != 0) {
                fallbackImage = videoAdUnitVideoAd.fallbackImage;
            }
            if ((i2 & 8) != 0) {
                i = videoAdUnitVideoAd.duration;
            }
            if ((i2 & 16) != 0) {
                transcript = videoAdUnitVideoAd.transcript;
            }
            if ((i2 & 32) != 0) {
                termsAndConditions = videoAdUnitVideoAd.termsAndConditions;
            }
            if ((i2 & 64) != 0) {
                analytics3 = videoAdUnitVideoAd.analytics;
            }
            if ((i2 & 128) != 0) {
                eventAnalytics = videoAdUnitVideoAd.eventAnalytics;
            }
            Analytics3 analytics32 = analytics3;
            EventAnalytics eventAnalytics2 = eventAnalytics;
            Transcript transcript2 = transcript;
            TermsAndConditions termsAndConditions2 = termsAndConditions;
            return videoAdUnitVideoAd.copy(str, str2, fallbackImage, i, transcript2, termsAndConditions2, analytics32, eventAnalytics2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final FallbackImage getFallbackImage() {
            return this.fallbackImage;
        }

        /* renamed from: component4, reason: from getter */
        public final int getDuration() {
            return this.duration;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final Transcript getTranscript() {
            return this.transcript;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final TermsAndConditions getTermsAndConditions() {
            return this.termsAndConditions;
        }

        @Nullable
        /* renamed from: component7, reason: from getter */
        public final Analytics3 getAnalytics() {
            return this.analytics;
        }

        @Nullable
        /* renamed from: component8, reason: from getter */
        public final EventAnalytics getEventAnalytics() {
            return this.eventAnalytics;
        }

        @NotNull
        public final VideoAdUnitVideoAd copy(@NotNull String __typename, @NotNull String url, @Nullable FallbackImage fallbackImage, int duration, @Nullable Transcript transcript, @Nullable TermsAndConditions termsAndConditions, @Nullable Analytics3 analytics, @Nullable EventAnalytics eventAnalytics) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(url, "url");
            return new VideoAdUnitVideoAd(__typename, url, fallbackImage, duration, transcript, termsAndConditions, analytics, eventAnalytics);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VideoAdUnitVideoAd)) {
                return false;
            }
            VideoAdUnitVideoAd videoAdUnitVideoAd = (VideoAdUnitVideoAd) other;
            return Intrinsics.c(this.__typename, videoAdUnitVideoAd.__typename) && Intrinsics.c(this.url, videoAdUnitVideoAd.url) && Intrinsics.c(this.fallbackImage, videoAdUnitVideoAd.fallbackImage) && this.duration == videoAdUnitVideoAd.duration && Intrinsics.c(this.transcript, videoAdUnitVideoAd.transcript) && Intrinsics.c(this.termsAndConditions, videoAdUnitVideoAd.termsAndConditions) && Intrinsics.c(this.analytics, videoAdUnitVideoAd.analytics) && Intrinsics.c(this.eventAnalytics, videoAdUnitVideoAd.eventAnalytics);
        }

        @Nullable
        public final Analytics3 getAnalytics() {
            return this.analytics;
        }

        public final int getDuration() {
            return this.duration;
        }

        @Nullable
        public final EventAnalytics getEventAnalytics() {
            return this.eventAnalytics;
        }

        @Nullable
        public final FallbackImage getFallbackImage() {
            return this.fallbackImage;
        }

        @Nullable
        public final TermsAndConditions getTermsAndConditions() {
            return this.termsAndConditions;
        }

        @Nullable
        public final Transcript getTranscript() {
            return this.transcript;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int iC = b.c(this.__typename.hashCode() * 31, 31, this.url);
            FallbackImage fallbackImage = this.fallbackImage;
            int iA = b.a(this.duration, (iC + (fallbackImage == null ? 0 : fallbackImage.hashCode())) * 31, 31);
            Transcript transcript = this.transcript;
            int iHashCode = (iA + (transcript == null ? 0 : transcript.hashCode())) * 31;
            TermsAndConditions termsAndConditions = this.termsAndConditions;
            int iHashCode2 = (iHashCode + (termsAndConditions == null ? 0 : termsAndConditions.hashCode())) * 31;
            Analytics3 analytics3 = this.analytics;
            int iHashCode3 = (iHashCode2 + (analytics3 == null ? 0 : analytics3.hashCode())) * 31;
            EventAnalytics eventAnalytics = this.eventAnalytics;
            return iHashCode3 + (eventAnalytics != null ? eventAnalytics.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.__typename;
            String str2 = this.url;
            FallbackImage fallbackImage = this.fallbackImage;
            int i = this.duration;
            Transcript transcript = this.transcript;
            TermsAndConditions termsAndConditions = this.termsAndConditions;
            Analytics3 analytics3 = this.analytics;
            EventAnalytics eventAnalytics = this.eventAnalytics;
            StringBuilder sbV = YU.a.v("VideoAdUnitVideoAd(__typename=", str, ", url=", str2, ", fallbackImage=");
            sbV.append(fallbackImage);
            sbV.append(", duration=");
            sbV.append(i);
            sbV.append(", transcript=");
            sbV.append(transcript);
            sbV.append(", termsAndConditions=");
            sbV.append(termsAndConditions);
            sbV.append(", analytics=");
            sbV.append(analytics3);
            sbV.append(", eventAnalytics=");
            sbV.append(eventAnalytics);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$VideoErrorImpression;", "", "__typename", "", "analyticsFields", "Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;)V", "get__typename", "()Ljava/lang/String;", "getAnalyticsFields", "()Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class VideoErrorImpression {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final AnalyticsFields analyticsFields;

        public VideoErrorImpression(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            this.__typename = __typename;
            this.analyticsFields = analyticsFields;
        }

        public static /* synthetic */ VideoErrorImpression copy$default(VideoErrorImpression videoErrorImpression, String str, AnalyticsFields analyticsFields, int i, Object obj) {
            if ((i & 1) != 0) {
                str = videoErrorImpression.__typename;
            }
            if ((i & 2) != 0) {
                analyticsFields = videoErrorImpression.analyticsFields;
            }
            return videoErrorImpression.copy(str, analyticsFields);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final VideoErrorImpression copy(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            return new VideoErrorImpression(__typename, analyticsFields);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VideoErrorImpression)) {
                return false;
            }
            VideoErrorImpression videoErrorImpression = (VideoErrorImpression) other;
            return Intrinsics.c(this.__typename, videoErrorImpression.__typename) && Intrinsics.c(this.analyticsFields, videoErrorImpression.analyticsFields);
        }

        @NotNull
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.analyticsFields.hashCode() + (this.__typename.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return d.p("VideoErrorImpression(__typename=", this.__typename, ", analyticsFields=", this.analyticsFields, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$VideoPause;", "", "__typename", "", "analyticsFields", "Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;)V", "get__typename", "()Ljava/lang/String;", "getAnalyticsFields", "()Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class VideoPause {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final AnalyticsFields analyticsFields;

        public VideoPause(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            this.__typename = __typename;
            this.analyticsFields = analyticsFields;
        }

        public static /* synthetic */ VideoPause copy$default(VideoPause videoPause, String str, AnalyticsFields analyticsFields, int i, Object obj) {
            if ((i & 1) != 0) {
                str = videoPause.__typename;
            }
            if ((i & 2) != 0) {
                analyticsFields = videoPause.analyticsFields;
            }
            return videoPause.copy(str, analyticsFields);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final VideoPause copy(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            return new VideoPause(__typename, analyticsFields);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VideoPause)) {
                return false;
            }
            VideoPause videoPause = (VideoPause) other;
            return Intrinsics.c(this.__typename, videoPause.__typename) && Intrinsics.c(this.analyticsFields, videoPause.analyticsFields);
        }

        @NotNull
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.analyticsFields.hashCode() + (this.__typename.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return d.p("VideoPause(__typename=", this.__typename, ", analyticsFields=", this.analyticsFields, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$VideoPlay;", "", "__typename", "", "analyticsFields", "Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;)V", "get__typename", "()Ljava/lang/String;", "getAnalyticsFields", "()Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class VideoPlay {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final AnalyticsFields analyticsFields;

        public VideoPlay(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            this.__typename = __typename;
            this.analyticsFields = analyticsFields;
        }

        public static /* synthetic */ VideoPlay copy$default(VideoPlay videoPlay, String str, AnalyticsFields analyticsFields, int i, Object obj) {
            if ((i & 1) != 0) {
                str = videoPlay.__typename;
            }
            if ((i & 2) != 0) {
                analyticsFields = videoPlay.analyticsFields;
            }
            return videoPlay.copy(str, analyticsFields);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final VideoPlay copy(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            return new VideoPlay(__typename, analyticsFields);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VideoPlay)) {
                return false;
            }
            VideoPlay videoPlay = (VideoPlay) other;
            return Intrinsics.c(this.__typename, videoPlay.__typename) && Intrinsics.c(this.analyticsFields, videoPlay.analyticsFields);
        }

        @NotNull
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.analyticsFields.hashCode() + (this.__typename.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return d.p("VideoPlay(__typename=", this.__typename, ", analyticsFields=", this.analyticsFields, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$ZeroResult;", "", "__typename", "", "onProductListZeroResult", "Lcom/woolworths/product/list/legacy/ProductListQuery$OnProductListZeroResult;", "onProductListFullScreenError", "Lcom/woolworths/product/list/legacy/ProductListQuery$OnProductListFullScreenError;", "<init>", "(Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductListQuery$OnProductListZeroResult;Lcom/woolworths/product/list/legacy/ProductListQuery$OnProductListFullScreenError;)V", "get__typename", "()Ljava/lang/String;", "getOnProductListZeroResult", "()Lcom/woolworths/product/list/legacy/ProductListQuery$OnProductListZeroResult;", "getOnProductListFullScreenError", "()Lcom/woolworths/product/list/legacy/ProductListQuery$OnProductListFullScreenError;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ZeroResult {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @Nullable
        private final OnProductListFullScreenError onProductListFullScreenError;

        @Nullable
        private final OnProductListZeroResult onProductListZeroResult;

        public ZeroResult(@NotNull String __typename, @Nullable OnProductListZeroResult onProductListZeroResult, @Nullable OnProductListFullScreenError onProductListFullScreenError) {
            Intrinsics.h(__typename, "__typename");
            this.__typename = __typename;
            this.onProductListZeroResult = onProductListZeroResult;
            this.onProductListFullScreenError = onProductListFullScreenError;
        }

        public static /* synthetic */ ZeroResult copy$default(ZeroResult zeroResult, String str, OnProductListZeroResult onProductListZeroResult, OnProductListFullScreenError onProductListFullScreenError, int i, Object obj) {
            if ((i & 1) != 0) {
                str = zeroResult.__typename;
            }
            if ((i & 2) != 0) {
                onProductListZeroResult = zeroResult.onProductListZeroResult;
            }
            if ((i & 4) != 0) {
                onProductListFullScreenError = zeroResult.onProductListFullScreenError;
            }
            return zeroResult.copy(str, onProductListZeroResult, onProductListFullScreenError);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final OnProductListZeroResult getOnProductListZeroResult() {
            return this.onProductListZeroResult;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final OnProductListFullScreenError getOnProductListFullScreenError() {
            return this.onProductListFullScreenError;
        }

        @NotNull
        public final ZeroResult copy(@NotNull String __typename, @Nullable OnProductListZeroResult onProductListZeroResult, @Nullable OnProductListFullScreenError onProductListFullScreenError) {
            Intrinsics.h(__typename, "__typename");
            return new ZeroResult(__typename, onProductListZeroResult, onProductListFullScreenError);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ZeroResult)) {
                return false;
            }
            ZeroResult zeroResult = (ZeroResult) other;
            return Intrinsics.c(this.__typename, zeroResult.__typename) && Intrinsics.c(this.onProductListZeroResult, zeroResult.onProductListZeroResult) && Intrinsics.c(this.onProductListFullScreenError, zeroResult.onProductListFullScreenError);
        }

        @Nullable
        public final OnProductListFullScreenError getOnProductListFullScreenError() {
            return this.onProductListFullScreenError;
        }

        @Nullable
        public final OnProductListZeroResult getOnProductListZeroResult() {
            return this.onProductListZeroResult;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int iHashCode = this.__typename.hashCode() * 31;
            OnProductListZeroResult onProductListZeroResult = this.onProductListZeroResult;
            int iHashCode2 = (iHashCode + (onProductListZeroResult == null ? 0 : onProductListZeroResult.hashCode())) * 31;
            OnProductListFullScreenError onProductListFullScreenError = this.onProductListFullScreenError;
            return iHashCode2 + (onProductListFullScreenError != null ? onProductListFullScreenError.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ZeroResult(__typename=" + this.__typename + ", onProductListZeroResult=" + this.onProductListZeroResult + ", onProductListFullScreenError=" + this.onProductListFullScreenError + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$ZeroResultContent;", "", "title", "", "message", "items", "", "Lcom/woolworths/product/list/legacy/ProductListQuery$Item2;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getMessage", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ZeroResultContent {
        public static final int $stable = 8;

        @NotNull
        private final List<Item2> items;

        @Nullable
        private final String message;

        @Nullable
        private final String title;

        public ZeroResultContent(@Nullable String str, @Nullable String str2, @NotNull List<Item2> items) {
            Intrinsics.h(items, "items");
            this.title = str;
            this.message = str2;
            this.items = items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ZeroResultContent copy$default(ZeroResultContent zeroResultContent, String str, String str2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = zeroResultContent.title;
            }
            if ((i & 2) != 0) {
                str2 = zeroResultContent.message;
            }
            if ((i & 4) != 0) {
                list = zeroResultContent.items;
            }
            return zeroResultContent.copy(str, str2, list);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final List<Item2> component3() {
            return this.items;
        }

        @NotNull
        public final ZeroResultContent copy(@Nullable String title, @Nullable String message, @NotNull List<Item2> items) {
            Intrinsics.h(items, "items");
            return new ZeroResultContent(title, message, items);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ZeroResultContent)) {
                return false;
            }
            ZeroResultContent zeroResultContent = (ZeroResultContent) other;
            return Intrinsics.c(this.title, zeroResultContent.title) && Intrinsics.c(this.message, zeroResultContent.message) && Intrinsics.c(this.items, zeroResultContent.items);
        }

        @NotNull
        public final List<Item2> getItems() {
            return this.items;
        }

        @Nullable
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.message;
            return this.items.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.message;
            return android.support.v4.media.session.a.t(YU.a.v("ZeroResultContent(title=", str, ", message=", str2, ", items="), this.items, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$ZeroResultProductCategoriesItem;", "", "productCategoryTileAction", "Lcom/woolworths/product/list/legacy/ProductListQuery$ProductCategoryTileAction;", "productCategoryTileImageUrl", "", "productCategoryTileLabel", "<init>", "(Lcom/woolworths/product/list/legacy/ProductListQuery$ProductCategoryTileAction;Ljava/lang/String;Ljava/lang/String;)V", "getProductCategoryTileAction", "()Lcom/woolworths/product/list/legacy/ProductListQuery$ProductCategoryTileAction;", "getProductCategoryTileImageUrl", "()Ljava/lang/String;", "getProductCategoryTileLabel", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ZeroResultProductCategoriesItem {
        public static final int $stable = 0;

        @NotNull
        private final ProductCategoryTileAction productCategoryTileAction;

        @NotNull
        private final String productCategoryTileImageUrl;

        @NotNull
        private final String productCategoryTileLabel;

        public ZeroResultProductCategoriesItem(@NotNull ProductCategoryTileAction productCategoryTileAction, @NotNull String productCategoryTileImageUrl, @NotNull String productCategoryTileLabel) {
            Intrinsics.h(productCategoryTileAction, "productCategoryTileAction");
            Intrinsics.h(productCategoryTileImageUrl, "productCategoryTileImageUrl");
            Intrinsics.h(productCategoryTileLabel, "productCategoryTileLabel");
            this.productCategoryTileAction = productCategoryTileAction;
            this.productCategoryTileImageUrl = productCategoryTileImageUrl;
            this.productCategoryTileLabel = productCategoryTileLabel;
        }

        public static /* synthetic */ ZeroResultProductCategoriesItem copy$default(ZeroResultProductCategoriesItem zeroResultProductCategoriesItem, ProductCategoryTileAction productCategoryTileAction, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                productCategoryTileAction = zeroResultProductCategoriesItem.productCategoryTileAction;
            }
            if ((i & 2) != 0) {
                str = zeroResultProductCategoriesItem.productCategoryTileImageUrl;
            }
            if ((i & 4) != 0) {
                str2 = zeroResultProductCategoriesItem.productCategoryTileLabel;
            }
            return zeroResultProductCategoriesItem.copy(productCategoryTileAction, str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ProductCategoryTileAction getProductCategoryTileAction() {
            return this.productCategoryTileAction;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getProductCategoryTileImageUrl() {
            return this.productCategoryTileImageUrl;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getProductCategoryTileLabel() {
            return this.productCategoryTileLabel;
        }

        @NotNull
        public final ZeroResultProductCategoriesItem copy(@NotNull ProductCategoryTileAction productCategoryTileAction, @NotNull String productCategoryTileImageUrl, @NotNull String productCategoryTileLabel) {
            Intrinsics.h(productCategoryTileAction, "productCategoryTileAction");
            Intrinsics.h(productCategoryTileImageUrl, "productCategoryTileImageUrl");
            Intrinsics.h(productCategoryTileLabel, "productCategoryTileLabel");
            return new ZeroResultProductCategoriesItem(productCategoryTileAction, productCategoryTileImageUrl, productCategoryTileLabel);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ZeroResultProductCategoriesItem)) {
                return false;
            }
            ZeroResultProductCategoriesItem zeroResultProductCategoriesItem = (ZeroResultProductCategoriesItem) other;
            return Intrinsics.c(this.productCategoryTileAction, zeroResultProductCategoriesItem.productCategoryTileAction) && Intrinsics.c(this.productCategoryTileImageUrl, zeroResultProductCategoriesItem.productCategoryTileImageUrl) && Intrinsics.c(this.productCategoryTileLabel, zeroResultProductCategoriesItem.productCategoryTileLabel);
        }

        @NotNull
        public final ProductCategoryTileAction getProductCategoryTileAction() {
            return this.productCategoryTileAction;
        }

        @NotNull
        public final String getProductCategoryTileImageUrl() {
            return this.productCategoryTileImageUrl;
        }

        @NotNull
        public final String getProductCategoryTileLabel() {
            return this.productCategoryTileLabel;
        }

        public int hashCode() {
            return this.productCategoryTileLabel.hashCode() + b.c(this.productCategoryTileAction.hashCode() * 31, 31, this.productCategoryTileImageUrl);
        }

        @NotNull
        public String toString() {
            ProductCategoryTileAction productCategoryTileAction = this.productCategoryTileAction;
            String str = this.productCategoryTileImageUrl;
            String str2 = this.productCategoryTileLabel;
            StringBuilder sb = new StringBuilder("ZeroResultProductCategoriesItem(productCategoryTileAction=");
            sb.append(productCategoryTileAction);
            sb.append(", productCategoryTileImageUrl=");
            sb.append(str);
            sb.append(", productCategoryTileLabel=");
            return YU.a.o(sb, str2, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductListQuery$ZeroResultProductCategoriesItem1;", "", "productCategoryTileAction", "Lcom/woolworths/product/list/legacy/ProductListQuery$ProductCategoryTileAction1;", "productCategoryTileImageUrl", "", "productCategoryTileLabel", "<init>", "(Lcom/woolworths/product/list/legacy/ProductListQuery$ProductCategoryTileAction1;Ljava/lang/String;Ljava/lang/String;)V", "getProductCategoryTileAction", "()Lcom/woolworths/product/list/legacy/ProductListQuery$ProductCategoryTileAction1;", "getProductCategoryTileImageUrl", "()Ljava/lang/String;", "getProductCategoryTileLabel", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ZeroResultProductCategoriesItem1 {
        public static final int $stable = 0;

        @NotNull
        private final ProductCategoryTileAction1 productCategoryTileAction;

        @NotNull
        private final String productCategoryTileImageUrl;

        @NotNull
        private final String productCategoryTileLabel;

        public ZeroResultProductCategoriesItem1(@NotNull ProductCategoryTileAction1 productCategoryTileAction, @NotNull String productCategoryTileImageUrl, @NotNull String productCategoryTileLabel) {
            Intrinsics.h(productCategoryTileAction, "productCategoryTileAction");
            Intrinsics.h(productCategoryTileImageUrl, "productCategoryTileImageUrl");
            Intrinsics.h(productCategoryTileLabel, "productCategoryTileLabel");
            this.productCategoryTileAction = productCategoryTileAction;
            this.productCategoryTileImageUrl = productCategoryTileImageUrl;
            this.productCategoryTileLabel = productCategoryTileLabel;
        }

        public static /* synthetic */ ZeroResultProductCategoriesItem1 copy$default(ZeroResultProductCategoriesItem1 zeroResultProductCategoriesItem1, ProductCategoryTileAction1 productCategoryTileAction1, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                productCategoryTileAction1 = zeroResultProductCategoriesItem1.productCategoryTileAction;
            }
            if ((i & 2) != 0) {
                str = zeroResultProductCategoriesItem1.productCategoryTileImageUrl;
            }
            if ((i & 4) != 0) {
                str2 = zeroResultProductCategoriesItem1.productCategoryTileLabel;
            }
            return zeroResultProductCategoriesItem1.copy(productCategoryTileAction1, str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ProductCategoryTileAction1 getProductCategoryTileAction() {
            return this.productCategoryTileAction;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getProductCategoryTileImageUrl() {
            return this.productCategoryTileImageUrl;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getProductCategoryTileLabel() {
            return this.productCategoryTileLabel;
        }

        @NotNull
        public final ZeroResultProductCategoriesItem1 copy(@NotNull ProductCategoryTileAction1 productCategoryTileAction, @NotNull String productCategoryTileImageUrl, @NotNull String productCategoryTileLabel) {
            Intrinsics.h(productCategoryTileAction, "productCategoryTileAction");
            Intrinsics.h(productCategoryTileImageUrl, "productCategoryTileImageUrl");
            Intrinsics.h(productCategoryTileLabel, "productCategoryTileLabel");
            return new ZeroResultProductCategoriesItem1(productCategoryTileAction, productCategoryTileImageUrl, productCategoryTileLabel);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ZeroResultProductCategoriesItem1)) {
                return false;
            }
            ZeroResultProductCategoriesItem1 zeroResultProductCategoriesItem1 = (ZeroResultProductCategoriesItem1) other;
            return Intrinsics.c(this.productCategoryTileAction, zeroResultProductCategoriesItem1.productCategoryTileAction) && Intrinsics.c(this.productCategoryTileImageUrl, zeroResultProductCategoriesItem1.productCategoryTileImageUrl) && Intrinsics.c(this.productCategoryTileLabel, zeroResultProductCategoriesItem1.productCategoryTileLabel);
        }

        @NotNull
        public final ProductCategoryTileAction1 getProductCategoryTileAction() {
            return this.productCategoryTileAction;
        }

        @NotNull
        public final String getProductCategoryTileImageUrl() {
            return this.productCategoryTileImageUrl;
        }

        @NotNull
        public final String getProductCategoryTileLabel() {
            return this.productCategoryTileLabel;
        }

        public int hashCode() {
            return this.productCategoryTileLabel.hashCode() + b.c(this.productCategoryTileAction.hashCode() * 31, 31, this.productCategoryTileImageUrl);
        }

        @NotNull
        public String toString() {
            ProductCategoryTileAction1 productCategoryTileAction1 = this.productCategoryTileAction;
            String str = this.productCategoryTileImageUrl;
            String str2 = this.productCategoryTileLabel;
            StringBuilder sb = new StringBuilder("ZeroResultProductCategoriesItem1(productCategoryTileAction=");
            sb.append(productCategoryTileAction1);
            sb.append(", productCategoryTileImageUrl=");
            sb.append(str);
            sb.append(", productCategoryTileLabel=");
            return YU.a.o(sb, str2, ")");
        }
    }

    public ProductListQuery(@NotNull ProductListInput productListInput, boolean z, boolean z2, @NotNull Optional<Boolean> includeAvailabilityInfoStatus, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, @NotNull Optional<Boolean> includePricingFootnote, @NotNull Optional<Boolean> includeNhpEdrBanner, @NotNull Optional<Boolean> includeNhpPersonalisedProductsBanner, boolean z9, boolean z10) {
        Intrinsics.h(productListInput, "productListInput");
        Intrinsics.h(includeAvailabilityInfoStatus, "includeAvailabilityInfoStatus");
        Intrinsics.h(includePricingFootnote, "includePricingFootnote");
        Intrinsics.h(includeNhpEdrBanner, "includeNhpEdrBanner");
        Intrinsics.h(includeNhpPersonalisedProductsBanner, "includeNhpPersonalisedProductsBanner");
        this.productListInput = productListInput;
        this.includeProductAvailabilityStates = z;
        this.includeOfferMinimumSpend = z2;
        this.includeAvailabilityInfoStatus = includeAvailabilityInfoStatus;
        this.includeUnitPriceInsetBanner = z3;
        this.includeUniversalInventoryFallback = z4;
        this.includeZeroResultPage = z5;
        this.includeVideoAdUnit = z6;
        this.includeMerchCard = z7;
        this.includeHorizontalList = z8;
        this.includePricingFootnote = includePricingFootnote;
        this.includeNhpEdrBanner = includeNhpEdrBanner;
        this.includeNhpPersonalisedProductsBanner = includeNhpPersonalisedProductsBanner;
        this.includeProductListPersistentChip = z9;
        this.includeLowestPrice14Days = z10;
    }

    @Override // com.apollographql.apollo.api.Executable
    @NotNull
    public Adapter<Data> adapter() {
        return Adapters.c(ProductListQuery_ResponseAdapter.Data.INSTANCE, false);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ProductListInput getProductListInput() {
        return this.productListInput;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIncludeHorizontalList() {
        return this.includeHorizontalList;
    }

    @NotNull
    public final Optional<Boolean> component11() {
        return this.includePricingFootnote;
    }

    @NotNull
    public final Optional<Boolean> component12() {
        return this.includeNhpEdrBanner;
    }

    @NotNull
    public final Optional<Boolean> component13() {
        return this.includeNhpPersonalisedProductsBanner;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIncludeProductListPersistentChip() {
        return this.includeProductListPersistentChip;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getIncludeLowestPrice14Days() {
        return this.includeLowestPrice14Days;
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

    /* renamed from: component5, reason: from getter */
    public final boolean getIncludeUnitPriceInsetBanner() {
        return this.includeUnitPriceInsetBanner;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIncludeUniversalInventoryFallback() {
        return this.includeUniversalInventoryFallback;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIncludeZeroResultPage() {
        return this.includeZeroResultPage;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIncludeVideoAdUnit() {
        return this.includeVideoAdUnit;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIncludeMerchCard() {
        return this.includeMerchCard;
    }

    @NotNull
    public final ProductListQuery copy(@NotNull ProductListInput productListInput, boolean includeProductAvailabilityStates, boolean includeOfferMinimumSpend, @NotNull Optional<Boolean> includeAvailabilityInfoStatus, boolean includeUnitPriceInsetBanner, boolean includeUniversalInventoryFallback, boolean includeZeroResultPage, boolean includeVideoAdUnit, boolean includeMerchCard, boolean includeHorizontalList, @NotNull Optional<Boolean> includePricingFootnote, @NotNull Optional<Boolean> includeNhpEdrBanner, @NotNull Optional<Boolean> includeNhpPersonalisedProductsBanner, boolean includeProductListPersistentChip, boolean includeLowestPrice14Days) {
        Intrinsics.h(productListInput, "productListInput");
        Intrinsics.h(includeAvailabilityInfoStatus, "includeAvailabilityInfoStatus");
        Intrinsics.h(includePricingFootnote, "includePricingFootnote");
        Intrinsics.h(includeNhpEdrBanner, "includeNhpEdrBanner");
        Intrinsics.h(includeNhpPersonalisedProductsBanner, "includeNhpPersonalisedProductsBanner");
        return new ProductListQuery(productListInput, includeProductAvailabilityStates, includeOfferMinimumSpend, includeAvailabilityInfoStatus, includeUnitPriceInsetBanner, includeUniversalInventoryFallback, includeZeroResultPage, includeVideoAdUnit, includeMerchCard, includeHorizontalList, includePricingFootnote, includeNhpEdrBanner, includeNhpPersonalisedProductsBanner, includeProductListPersistentChip, includeLowestPrice14Days);
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
        if (!(other instanceof ProductListQuery)) {
            return false;
        }
        ProductListQuery productListQuery = (ProductListQuery) other;
        return Intrinsics.c(this.productListInput, productListQuery.productListInput) && this.includeProductAvailabilityStates == productListQuery.includeProductAvailabilityStates && this.includeOfferMinimumSpend == productListQuery.includeOfferMinimumSpend && Intrinsics.c(this.includeAvailabilityInfoStatus, productListQuery.includeAvailabilityInfoStatus) && this.includeUnitPriceInsetBanner == productListQuery.includeUnitPriceInsetBanner && this.includeUniversalInventoryFallback == productListQuery.includeUniversalInventoryFallback && this.includeZeroResultPage == productListQuery.includeZeroResultPage && this.includeVideoAdUnit == productListQuery.includeVideoAdUnit && this.includeMerchCard == productListQuery.includeMerchCard && this.includeHorizontalList == productListQuery.includeHorizontalList && Intrinsics.c(this.includePricingFootnote, productListQuery.includePricingFootnote) && Intrinsics.c(this.includeNhpEdrBanner, productListQuery.includeNhpEdrBanner) && Intrinsics.c(this.includeNhpPersonalisedProductsBanner, productListQuery.includeNhpPersonalisedProductsBanner) && this.includeProductListPersistentChip == productListQuery.includeProductListPersistentChip && this.includeLowestPrice14Days == productListQuery.includeLowestPrice14Days;
    }

    @NotNull
    public final Optional<Boolean> getIncludeAvailabilityInfoStatus() {
        return this.includeAvailabilityInfoStatus;
    }

    public final boolean getIncludeHorizontalList() {
        return this.includeHorizontalList;
    }

    public final boolean getIncludeLowestPrice14Days() {
        return this.includeLowestPrice14Days;
    }

    public final boolean getIncludeMerchCard() {
        return this.includeMerchCard;
    }

    @NotNull
    public final Optional<Boolean> getIncludeNhpEdrBanner() {
        return this.includeNhpEdrBanner;
    }

    @NotNull
    public final Optional<Boolean> getIncludeNhpPersonalisedProductsBanner() {
        return this.includeNhpPersonalisedProductsBanner;
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

    public final boolean getIncludeProductListPersistentChip() {
        return this.includeProductListPersistentChip;
    }

    public final boolean getIncludeUnitPriceInsetBanner() {
        return this.includeUnitPriceInsetBanner;
    }

    public final boolean getIncludeUniversalInventoryFallback() {
        return this.includeUniversalInventoryFallback;
    }

    public final boolean getIncludeVideoAdUnit() {
        return this.includeVideoAdUnit;
    }

    public final boolean getIncludeZeroResultPage() {
        return this.includeZeroResultPage;
    }

    @NotNull
    public final ProductListInput getProductListInput() {
        return this.productListInput;
    }

    public int hashCode() {
        return Boolean.hashCode(this.includeLowestPrice14Days) + b.e(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.includeNhpPersonalisedProductsBanner, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.includeNhpEdrBanner, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.includePricingFootnote, b.e(b.e(b.e(b.e(b.e(b.e(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.includeAvailabilityInfoStatus, b.e(b.e(this.productListInput.hashCode() * 31, 31, this.includeProductAvailabilityStates), 31, this.includeOfferMinimumSpend), 31), 31, this.includeUnitPriceInsetBanner), 31, this.includeUniversalInventoryFallback), 31, this.includeZeroResultPage), 31, this.includeVideoAdUnit), 31, this.includeMerchCard), 31, this.includeHorizontalList), 31), 31), 31), 31, this.includeProductListPersistentChip);
    }

    @Override // com.apollographql.apollo.api.Operation
    @NotNull
    public String id() {
        return "0ee1cf442dc0cbfd90fa49a6213d70d5bc8b3ce31f1a98ce0fa8d7d8a6088c8f";
    }

    @Override // com.apollographql.apollo.api.Operation
    @NotNull
    public String name() {
        return "productList";
    }

    @NotNull
    public CompiledField rootField() {
        CompiledField.Builder builder = new CompiledField.Builder("data", au.com.woolworths.shop.graphql.type.Query.H2);
        builder.e(ProductListQuerySelections.INSTANCE.get__root());
        return builder.c();
    }

    @Override // com.apollographql.apollo.api.Executable
    public void serializeVariables(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        ProductListQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @NotNull
    public String toString() {
        ProductListInput productListInput = this.productListInput;
        boolean z = this.includeProductAvailabilityStates;
        boolean z2 = this.includeOfferMinimumSpend;
        Optional<Boolean> optional = this.includeAvailabilityInfoStatus;
        boolean z3 = this.includeUnitPriceInsetBanner;
        boolean z4 = this.includeUniversalInventoryFallback;
        boolean z5 = this.includeZeroResultPage;
        boolean z6 = this.includeVideoAdUnit;
        boolean z7 = this.includeMerchCard;
        boolean z8 = this.includeHorizontalList;
        Optional<Boolean> optional2 = this.includePricingFootnote;
        Optional<Boolean> optional3 = this.includeNhpEdrBanner;
        Optional<Boolean> optional4 = this.includeNhpPersonalisedProductsBanner;
        boolean z9 = this.includeProductListPersistentChip;
        boolean z10 = this.includeLowestPrice14Days;
        StringBuilder sb = new StringBuilder("ProductListQuery(productListInput=");
        sb.append(productListInput);
        sb.append(", includeProductAvailabilityStates=");
        sb.append(z);
        sb.append(", includeOfferMinimumSpend=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.z(sb, z2, ", includeAvailabilityInfoStatus=", optional, ", includeUnitPriceInsetBanner=");
        au.com.woolworths.android.onesite.a.D(sb, z3, ", includeUniversalInventoryFallback=", z4, ", includeZeroResultPage=");
        au.com.woolworths.android.onesite.a.D(sb, z5, ", includeVideoAdUnit=", z6, ", includeMerchCard=");
        au.com.woolworths.android.onesite.a.D(sb, z7, ", includeHorizontalList=", z8, ", includePricingFootnote=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sb, optional2, ", includeNhpEdrBanner=", optional3, ", includeNhpPersonalisedProductsBanner=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.y(sb, optional4, ", includeProductListPersistentChip=", z9, ", includeLowestPrice14Days=");
        return YU.a.k(")", sb, z10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ProductListQuery(ProductListInput productListInput, boolean z, boolean z2, Optional optional, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, Optional optional2, Optional optional3, Optional optional4, boolean z9, boolean z10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i & 8;
        Optional.Absent absent = Optional.Absent.f13523a;
        this(productListInput, z, z2, i2 != 0 ? absent : optional, z3, z4, z5, z6, z7, z8, (i & 1024) != 0 ? absent : optional2, (i & 2048) != 0 ? absent : optional3, (i & 4096) != 0 ? absent : optional4, z9, z10);
    }
}
