package com.woolworths.product.list.legacy;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.graphql.TealiumAnalytics;
import au.com.woolworths.android.onesite.graphql.GoogleAdCustomTargeting;
import au.com.woolworths.android.onesite.models.search.RecentSearch;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.AdBannerNativeSize;
import au.com.woolworths.shop.graphql.type.CardHeight;
import au.com.woolworths.shop.graphql.type.ChipsProductListInputArgs;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.ProductFilterOption;
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
import com.woolworths.product.list.legacy.adapter.ProductsBySearchQuery_ResponseAdapter;
import com.woolworths.product.list.legacy.adapter.ProductsBySearchQuery_VariablesAdapter;
import com.woolworths.product.list.legacy.fragment.InsetBanner;
import com.woolworths.product.list.legacy.selections.ProductsBySearchQuerySelections;
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
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b,\b\u0087\b\u0018\u0000 \u0081\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:+YZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007f\u0080\u0001\u0081\u0001B\u008f\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006\u0012\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f0\u0006\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0006\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f0\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0006\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u00103\u001a\u00020\u0004H\u0016J\b\u00104\u001a\u00020\u0004H\u0016J\b\u00105\u001a\u00020\u0004H\u0016J \u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u000fH\u0016J\u000e\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020>H\u0016J\b\u0010?\u001a\u00020@H\u0016J\t\u0010A\u001a\u00020\u0004HÆ\u0003J\u0011\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006HÆ\u0003J\u0011\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006HÆ\u0003J\u0011\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006HÆ\u0003J\u0011\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006HÆ\u0003J\u0019\u0010F\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f0\u0006HÆ\u0003J\u0011\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0006HÆ\u0003J\u0017\u0010H\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f0\u0006HÆ\u0003J\t\u0010I\u001a\u00020\u000fHÆ\u0003J\t\u0010J\u001a\u00020\u000fHÆ\u0003J\u000f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006HÆ\u0003J\u0011\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0006HÆ\u0003J\u0011\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006HÆ\u0003J\t\u0010N\u001a\u00020\u000fHÆ\u0003J\t\u0010O\u001a\u00020\u000fHÆ\u0003J\t\u0010P\u001a\u00020\u000fHÆ\u0003J\u000f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006HÆ\u0003J\t\u0010R\u001a\u00020\u000fHÆ\u0003J\u009f\u0002\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f0\u00062\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00062\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f0\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00062\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u000f2\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u000fHÆ\u0001J\u0013\u0010T\u001a\u00020\u000f2\b\u0010U\u001a\u0004\u0018\u00010VHÖ\u0003J\t\u0010W\u001a\u00020\bHÖ\u0001J\t\u0010X\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0019\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R!\u0010\u000b\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f0\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u001f\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f0\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u0011\u0010\u0011\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010!R\u0019\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0006¢\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u0019\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u0011\u0010\u0017\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b.\u0010)R\u0011\u0010\u0018\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b/\u0010)R\u0011\u0010\u0019\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b0\u0010)R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006¢\u0006\b\n\u0000\u001a\u0004\b1\u0010!R\u0011\u0010\u001b\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b2\u0010)¨\u0006\u0082\u0001"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$Data;", RecentSearch.COLUMN_NAME_SEARCH_TERM, "", "storeId", "Lcom/apollographql/apollo/api/Optional;", "pageSize", "", "pageNumber", "sortOption", "filterOptions", "", "Lau/com/woolworths/shop/graphql/type/ProductFilterOption;", "includeMarketplaceProducts", "", "supportedLinks", "includeProductAvailabilityStates", "includeOfferMinimumSpend", "includeAvailabilityInfoStatus", "chips", "Lau/com/woolworths/shop/graphql/type/ChipsProductListInputArgs;", "facetChip", "includeUnitPriceInsetBanner", "includeUniversalInventoryFallback", "includeZeroResultPage", "includePricingFootnote", "includeLowestPrice14Days", "<init>", "(Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;ZZLcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;ZZZLcom/apollographql/apollo/api/Optional;Z)V", "getSearchTerm", "()Ljava/lang/String;", "getStoreId", "()Lcom/apollographql/apollo/api/Optional;", "getPageSize", "getPageNumber", "getSortOption", "getFilterOptions", "getIncludeMarketplaceProducts", "getSupportedLinks", "getIncludeProductAvailabilityStates", "()Z", "getIncludeOfferMinimumSpend", "getIncludeAvailabilityInfoStatus", "getChips", "getFacetChip", "getIncludeUnitPriceInsetBanner", "getIncludeUniversalInventoryFallback", "getIncludeZeroResultPage", "getIncludePricingFootnote", "getIncludeLowestPrice14Days", "id", "document", AppMeasurementSdk.ConditionalUserProperty.NAME, "serializeVariables", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "withDefaultValues", "adapter", "Lcom/apollographql/apollo/api/Adapter;", "rootField", "Lcom/apollographql/apollo/api/CompiledField;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "equals", "other", "", "hashCode", "toString", "Data", "ProductsBySearch", "Analytic", "OnAdobeTargetAnalytics", "ProductsFeed", "OnActionableCard", "OnGoogleAdBannerCard", "OnUniversalInventoryContainer", "GoogleAdBannerCard", "NextBestAction", "OnActionableCard1", "OnInsetBanner", "Action", "OnProductCard", "Filter", "FilterItem", "Banner", "Action1", "SortOption", "SortOptionsBanner", "MarketplaceFilterSwitch", "ButtonCta", "MarketplaceInfo", "Item", "Footer", "MarketplaceBottomSheet", "PrimaryCta", "SecondaryCta", "Chip", "Text", "FacetChip", "Text1", "ZeroResultContent", "Item1", "OnZeroResultProductCategories", "ZeroResultProductCategoriesItem", "ProductCategoryTileAction", "OnHorizontalList", "Item2", "OnProductCard1", "Companion", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ProductsBySearchQuery implements Query<Data> {

    @NotNull
    public static final String OPERATION_ID = "4949c158e1f6dd4c6e0f1348795b54d23ef96c5dc994382a7fc316c4208aee9c";

    @NotNull
    public static final String OPERATION_NAME = "productsBySearch";

    @NotNull
    private final Optional<ChipsProductListInputArgs> chips;

    @NotNull
    private final Optional<String> facetChip;

    @NotNull
    private final Optional<List<ProductFilterOption>> filterOptions;

    @NotNull
    private final Optional<Boolean> includeAvailabilityInfoStatus;
    private final boolean includeLowestPrice14Days;

    @NotNull
    private final Optional<Boolean> includeMarketplaceProducts;
    private final boolean includeOfferMinimumSpend;

    @NotNull
    private final Optional<Boolean> includePricingFootnote;
    private final boolean includeProductAvailabilityStates;
    private final boolean includeUnitPriceInsetBanner;
    private final boolean includeUniversalInventoryFallback;
    private final boolean includeZeroResultPage;

    @NotNull
    private final Optional<Integer> pageNumber;

    @NotNull
    private final Optional<Integer> pageSize;

    @NotNull
    private final String searchTerm;

    @NotNull
    private final Optional<String> sortOption;

    @NotNull
    private final Optional<String> storeId;

    @NotNull
    private final Optional<List<String>> supportedLinks;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @StabilityInferred
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$Action;", "", "placement", "Lau/com/woolworths/shop/graphql/type/InsetBannerActionPlacement;", "type", "Lau/com/woolworths/shop/graphql/type/InsetBannerActionType;", AnnotatedPrivateKey.LABEL, "", "url", "<init>", "(Lau/com/woolworths/shop/graphql/type/InsetBannerActionPlacement;Lau/com/woolworths/shop/graphql/type/InsetBannerActionType;Ljava/lang/String;Ljava/lang/String;)V", "getPlacement", "()Lau/com/woolworths/shop/graphql/type/InsetBannerActionPlacement;", "getType", "()Lau/com/woolworths/shop/graphql/type/InsetBannerActionType;", "getLabel", "()Ljava/lang/String;", "getUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$Action1;", "", "placement", "Lau/com/woolworths/shop/graphql/type/InsetBannerActionPlacement;", "type", "Lau/com/woolworths/shop/graphql/type/InsetBannerActionType;", AnnotatedPrivateKey.LABEL, "", "url", "<init>", "(Lau/com/woolworths/shop/graphql/type/InsetBannerActionPlacement;Lau/com/woolworths/shop/graphql/type/InsetBannerActionType;Ljava/lang/String;Ljava/lang/String;)V", "getPlacement", "()Lau/com/woolworths/shop/graphql/type/InsetBannerActionPlacement;", "getType", "()Lau/com/woolworths/shop/graphql/type/InsetBannerActionType;", "getLabel", "()Ljava/lang/String;", "getUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$Analytic;", "", "__typename", "", "onAdobeTargetAnalytics", "Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnAdobeTargetAnalytics;", "<init>", "(Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnAdobeTargetAnalytics;)V", "get__typename", "()Ljava/lang/String;", "getOnAdobeTargetAnalytics", "()Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnAdobeTargetAnalytics;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006 "}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$Banner;", "", "displayType", "Lau/com/woolworths/shop/graphql/type/InsetBannerDisplayType;", "message", "", "iconUrl", UrlHandler.ACTION, "Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$Action1;", "bannerTitle", "<init>", "(Lau/com/woolworths/shop/graphql/type/InsetBannerDisplayType;Ljava/lang/String;Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$Action1;Ljava/lang/String;)V", "getDisplayType", "()Lau/com/woolworths/shop/graphql/type/InsetBannerDisplayType;", "getMessage", "()Ljava/lang/String;", "getIconUrl", "getAction", "()Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$Action1;", "getBannerTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$ButtonCta;", "", AnnotatedPrivateKey.LABEL, "", "<init>", "(Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$Chip;", "", "id", "", "isSelected", "", TextBundle.TEXT_ENTRY, "Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$Text;", "<init>", "(Ljava/lang/String;ZLcom/woolworths/product/list/legacy/ProductsBySearchQuery$Text;)V", "getId", "()Ljava/lang/String;", "()Z", "getText", "()Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$Text;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Chip {
        public static final int $stable = 0;

        @NotNull
        private final String id;
        private final boolean isSelected;

        @NotNull
        private final Text text;

        public Chip(@NotNull String id, boolean z, @NotNull Text text) {
            Intrinsics.h(id, "id");
            Intrinsics.h(text, "text");
            this.id = id;
            this.isSelected = z;
            this.text = text;
        }

        public static /* synthetic */ Chip copy$default(Chip chip, String str, boolean z, Text text, int i, Object obj) {
            if ((i & 1) != 0) {
                str = chip.id;
            }
            if ((i & 2) != 0) {
                z = chip.isSelected;
            }
            if ((i & 4) != 0) {
                text = chip.text;
            }
            return chip.copy(str, z, text);
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

        @NotNull
        public final Chip copy(@NotNull String id, boolean isSelected, @NotNull Text text) {
            Intrinsics.h(id, "id");
            Intrinsics.h(text, "text");
            return new Chip(id, isSelected, text);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Chip)) {
                return false;
            }
            Chip chip = (Chip) other;
            return Intrinsics.c(this.id, chip.id) && this.isSelected == chip.isSelected && Intrinsics.c(this.text, chip.text);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final Text getText() {
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
            Text text = this.text;
            StringBuilder sbQ = a.q("Chip(id=", str, ", isSelected=", ", text=", z);
            sbQ.append(text);
            sbQ.append(")");
            return sbQ.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$Companion;", "", "<init>", "()V", "OPERATION_ID", "", "OPERATION_DOCUMENT", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_NAME", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getOPERATION_DOCUMENT() {
            return "query productsBySearch($searchTerm: String!, $storeId: String, $pageSize: Int, $pageNumber: Int, $sortOption: String, $filterOptions: [ProductFilterOption], $includeMarketplaceProducts: Boolean, $supportedLinks: [String!], $includeProductAvailabilityStates: Boolean!, $includeOfferMinimumSpend: Boolean!, $includeAvailabilityInfoStatus: Boolean! = false , $chips: ChipsProductListInputArgs, $facetChip: ID, $includeUnitPriceInsetBanner: Boolean!, $includeUniversalInventoryFallback: Boolean!, $includeZeroResultPage: Boolean!, $includePricingFootnote: Boolean! = false , $includeLowestPrice14Days: Boolean!) { productsBySearch(searchTerm: $searchTerm, storeId: $storeId, pageSize: $pageSize, pageNumber: $pageNumber, sortOption: $sortOption, filterOptions: $filterOptions, supportedLinks: $supportedLinks, includeMarketProducts: $includeMarketplaceProducts, chips: $chips, facetChip: $facetChip) { totalNumberOfProducts nextPage analytics { __typename ... on AdobeTargetAnalytics { tnta pe } } productsFeed { __typename ... on ActionableCard { image altText cardHeight link analytics _excluded } ... on GoogleAdBannerCard @skip(if: $includeUniversalInventoryFallback) { adUnit nativeCustomTemplateId targeting iabSize correlator } ... on UniversalInventoryContainer @include(if: $includeUniversalInventoryFallback) { googleAdBannerCard { adUnit nativeCustomTemplateId iabSpec iabSize height targeting correlator _excluded } nextBestAction { __typename ... on ActionableCard { link image altText cardHeight analytics _excluded } } } ... on InsetBanner { displayType message bannerTitle: title iconUrl action { placement type label url } } ... on ProductCard { __typename ...productCard } } filters { headerKey headerTitle filterItems { key title label parentKey hasChildren isApplied } banner { displayType message iconUrl action { placement type label url } bannerTitle: title } } sortOptions { key title subtitle isApplied } sortOptionsBanner @include(if: $includeUnitPriceInsetBanner) { __typename ...insetBanner } marketplaceFilterSwitch { title subtitle imageUrl buttonCta { label } value } marketplaceInfo { title items { title description imageUrl } footer { title subtitle linkUrl } } marketplaceBottomSheet { bottomSheetTitle bottomSheetBody primaryCta { label } secondaryCta { label } showOnceOnly } chips { id isSelected text { text altText } } facetChips { id isSelected text { text altText } } zeroResultContent @include(if: $includeZeroResultPage) { title message items { __typename ... on ZeroResultProductCategories { zeroResultProductCategoriesTitle zeroResultProductCategoriesItems { productCategoryTileAction { type action id } productCategoryTileImageUrl productCategoryTileLabel } } ... on HorizontalList { title items { __typename ... on ProductCard { __typename ...productCard } } } } } } }  fragment productTrolley on ProductTrolley { minimum maximum increment defaultValue: default unit inTrolley buttonState buttonLabel buttonQuantity title }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment productCard on ProductCard { productId name isNew purchaseRestriction productImage isAvailable inStoreAvailabilityInfo @include(if: $includeProductAvailabilityStates) { button { label action style enabled } status @include(if: $includeAvailabilityInfoStatus) infoSheet { title message button { label action style enabled } } } price unitOfMeasureLabel badgeImage promotionInfo { type label } unitPriceDescription wasPrice purchaseWarning inlineLabels { type label priority } trolley { __typename ...productTrolley } trolleys { __typename ...productTrolley } list { minimum maximum increment defaultValue: default unit } inStoreDetails { locationText locationType } inStoreLocation { details { aisleNumber aisleSide bayNumber bayNumberAlternate floorNumber location x y z } displayInfo { locationText locationType } } adId source marketplace { imageUrl title sellerName brandName lowestMarketPriceDescription @include(if: $includeLowestPrice14Days) } rewardsOfferInfo { offerId offerStatus displayStatus displayExpiry minimumSpend @include(if: $includeOfferMinimumSpend) offerAnalytics { offerName campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode } boostButton { label style enabled } } disclaimer tagLabel { text style } productVarieties { totalCount label priceFamilyId } categories { name categoryLevel } isTobacco memberPriceInfo { header title subtitle } multiBuyPriceInfo { price unitPrice } cartProductInfo { totalPrice totalOriginalPrice totalDiscount } productCardAnalytics { __typename ...analyticsFields } productCardAction { action type id analytics { __typename ...analyticsFields } } pricingFootnoteMd @include(if: $includePricingFootnote) }  fragment insetBanner on InsetBanner { displayType message bannerTitle: title iconUrl action { placement type label url } }";
        }

        private Companion() {
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "productsBySearch", "Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$ProductsBySearch;", "<init>", "(Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$ProductsBySearch;)V", "getProductsBySearch", "()Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$ProductsBySearch;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {
        public static final int $stable = 8;

        @Nullable
        private final ProductsBySearch productsBySearch;

        public Data(@Nullable ProductsBySearch productsBySearch) {
            this.productsBySearch = productsBySearch;
        }

        public static /* synthetic */ Data copy$default(Data data, ProductsBySearch productsBySearch, int i, Object obj) {
            if ((i & 1) != 0) {
                productsBySearch = data.productsBySearch;
            }
            return data.copy(productsBySearch);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final ProductsBySearch getProductsBySearch() {
            return this.productsBySearch;
        }

        @NotNull
        public final Data copy(@Nullable ProductsBySearch productsBySearch) {
            return new Data(productsBySearch);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Data) && Intrinsics.c(this.productsBySearch, ((Data) other).productsBySearch);
        }

        @Nullable
        public final ProductsBySearch getProductsBySearch() {
            return this.productsBySearch;
        }

        public int hashCode() {
            ProductsBySearch productsBySearch = this.productsBySearch;
            if (productsBySearch == null) {
                return 0;
            }
            return productsBySearch.hashCode();
        }

        @NotNull
        public String toString() {
            return "Data(productsBySearch=" + this.productsBySearch + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$FacetChip;", "", "id", "", "isSelected", "", TextBundle.TEXT_ENTRY, "Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$Text1;", "<init>", "(Ljava/lang/String;ZLcom/woolworths/product/list/legacy/ProductsBySearchQuery$Text1;)V", "getId", "()Ljava/lang/String;", "()Z", "getText", "()Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$Text1;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$Filter;", "", "headerKey", "", "headerTitle", "filterItems", "", "Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$FilterItem;", "banner", "Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$Banner;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$Banner;)V", "getHeaderKey", "()Ljava/lang/String;", "getHeaderTitle", "getFilterItems", "()Ljava/util/List;", "getBanner", "()Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$Banner;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003JG\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$FilterItem;", "", "key", "", "title", AnnotatedPrivateKey.LABEL, "parentKey", "hasChildren", "", "isApplied", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getKey", "()Ljava/lang/String;", "getTitle", "getLabel", "getParentKey", "getHasChildren", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$Footer;", "", "title", "", NotificationMessage.NOTIF_KEY_SUB_TITLE, "linkUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getLinkUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJf\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020\u00062\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001c¨\u0006-"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$GoogleAdBannerCard;", "", OutOfContextTestingActivity.AD_UNIT_KEY, "", "nativeCustomTemplateId", "iabSpec", "", "iabSize", "height", "Lau/com/woolworths/shop/graphql/type/AdBannerNativeSize;", "targeting", "Lau/com/woolworths/android/onesite/graphql/GoogleAdCustomTargeting;", "correlator", "_excluded", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lau/com/woolworths/shop/graphql/type/AdBannerNativeSize;Lau/com/woolworths/android/onesite/graphql/GoogleAdCustomTargeting;Ljava/lang/String;Ljava/lang/Boolean;)V", "getAdUnit", "()Ljava/lang/String;", "getNativeCustomTemplateId", "getIabSpec", "()Z", "getIabSize", "getHeight", "()Lau/com/woolworths/shop/graphql/type/AdBannerNativeSize;", "getTargeting", "()Lau/com/woolworths/android/onesite/graphql/GoogleAdCustomTargeting;", "getCorrelator", "get_excluded", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lau/com/woolworths/shop/graphql/type/AdBannerNativeSize;Lau/com/woolworths/android/onesite/graphql/GoogleAdCustomTargeting;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$GoogleAdBannerCard;", "equals", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$Item;", "", "title", "", lqlqqlq.mmm006Dm006Dm, "imageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getImageUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$Item1;", "", "__typename", "", "onZeroResultProductCategories", "Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnZeroResultProductCategories;", "onHorizontalList", "Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnHorizontalList;", "<init>", "(Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnZeroResultProductCategories;Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnHorizontalList;)V", "get__typename", "()Ljava/lang/String;", "getOnZeroResultProductCategories", "()Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnZeroResultProductCategories;", "getOnHorizontalList", "()Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnHorizontalList;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item1 {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @Nullable
        private final OnHorizontalList onHorizontalList;

        @Nullable
        private final OnZeroResultProductCategories onZeroResultProductCategories;

        public Item1(@NotNull String __typename, @Nullable OnZeroResultProductCategories onZeroResultProductCategories, @Nullable OnHorizontalList onHorizontalList) {
            Intrinsics.h(__typename, "__typename");
            this.__typename = __typename;
            this.onZeroResultProductCategories = onZeroResultProductCategories;
            this.onHorizontalList = onHorizontalList;
        }

        public static /* synthetic */ Item1 copy$default(Item1 item1, String str, OnZeroResultProductCategories onZeroResultProductCategories, OnHorizontalList onHorizontalList, int i, Object obj) {
            if ((i & 1) != 0) {
                str = item1.__typename;
            }
            if ((i & 2) != 0) {
                onZeroResultProductCategories = item1.onZeroResultProductCategories;
            }
            if ((i & 4) != 0) {
                onHorizontalList = item1.onHorizontalList;
            }
            return item1.copy(str, onZeroResultProductCategories, onHorizontalList);
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
        public final OnHorizontalList getOnHorizontalList() {
            return this.onHorizontalList;
        }

        @NotNull
        public final Item1 copy(@NotNull String __typename, @Nullable OnZeroResultProductCategories onZeroResultProductCategories, @Nullable OnHorizontalList onHorizontalList) {
            Intrinsics.h(__typename, "__typename");
            return new Item1(__typename, onZeroResultProductCategories, onHorizontalList);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item1)) {
                return false;
            }
            Item1 item1 = (Item1) other;
            return Intrinsics.c(this.__typename, item1.__typename) && Intrinsics.c(this.onZeroResultProductCategories, item1.onZeroResultProductCategories) && Intrinsics.c(this.onHorizontalList, item1.onHorizontalList);
        }

        @Nullable
        public final OnHorizontalList getOnHorizontalList() {
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
            OnHorizontalList onHorizontalList = this.onHorizontalList;
            return iHashCode2 + (onHorizontalList != null ? onHorizontalList.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Item1(__typename=" + this.__typename + ", onZeroResultProductCategories=" + this.onZeroResultProductCategories + ", onHorizontalList=" + this.onHorizontalList + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$Item2;", "", "__typename", "", "onProductCard", "Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnProductCard1;", "<init>", "(Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnProductCard1;)V", "get__typename", "()Ljava/lang/String;", "getOnProductCard", "()Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnProductCard1;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item2 {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @Nullable
        private final OnProductCard1 onProductCard;

        public Item2(@NotNull String __typename, @Nullable OnProductCard1 onProductCard1) {
            Intrinsics.h(__typename, "__typename");
            this.__typename = __typename;
            this.onProductCard = onProductCard1;
        }

        public static /* synthetic */ Item2 copy$default(Item2 item2, String str, OnProductCard1 onProductCard1, int i, Object obj) {
            if ((i & 1) != 0) {
                str = item2.__typename;
            }
            if ((i & 2) != 0) {
                onProductCard1 = item2.onProductCard;
            }
            return item2.copy(str, onProductCard1);
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
        public final Item2 copy(@NotNull String __typename, @Nullable OnProductCard1 onProductCard) {
            Intrinsics.h(__typename, "__typename");
            return new Item2(__typename, onProductCard);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item2)) {
                return false;
            }
            Item2 item2 = (Item2) other;
            return Intrinsics.c(this.__typename, item2.__typename) && Intrinsics.c(this.onProductCard, item2.onProductCard);
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
            return "Item2(__typename=" + this.__typename + ", onProductCard=" + this.onProductCard + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0015JF\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$MarketplaceBottomSheet;", "", "bottomSheetTitle", "", "bottomSheetBody", "primaryCta", "Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$PrimaryCta;", "secondaryCta", "Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$SecondaryCta;", "showOnceOnly", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$PrimaryCta;Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$SecondaryCta;Ljava/lang/Boolean;)V", "getBottomSheetTitle", "()Ljava/lang/String;", "getBottomSheetBody", "getPrimaryCta", "()Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$PrimaryCta;", "getSecondaryCta", "()Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$SecondaryCta;", "getShowOnceOnly", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$PrimaryCta;Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$SecondaryCta;Ljava/lang/Boolean;)Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$MarketplaceBottomSheet;", "equals", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$MarketplaceFilterSwitch;", "", "title", "", NotificationMessage.NOTIF_KEY_SUB_TITLE, "imageUrl", "buttonCta", "Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$ButtonCta;", "value", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$ButtonCta;Z)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getImageUrl", "getButtonCta", "()Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$ButtonCta;", "getValue", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$MarketplaceInfo;", "", "title", "", "items", "", "Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$Item;", "footer", "Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$Footer;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$Footer;)V", "getTitle", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "getFooter", "()Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$Footer;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MarketplaceInfo {
        public static final int $stable = 8;

        @Nullable
        private final Footer footer;

        @NotNull
        private final List<Item> items;

        @NotNull
        private final String title;

        public MarketplaceInfo(@NotNull String title, @NotNull List<Item> items, @Nullable Footer footer) {
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
        public final List<Item> component2() {
            return this.items;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final Footer getFooter() {
            return this.footer;
        }

        @NotNull
        public final MarketplaceInfo copy(@NotNull String title, @NotNull List<Item> items, @Nullable Footer footer) {
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
            StringBuilder sbS = au.com.woolworths.android.onesite.a.s("MarketplaceInfo(title=", str, ", items=", ", footer=", list);
            sbS.append(footer);
            sbS.append(")");
            return sbS.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$NextBestAction;", "", "__typename", "", "onActionableCard", "Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnActionableCard1;", "<init>", "(Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnActionableCard1;)V", "get__typename", "()Ljava/lang/String;", "getOnActionableCard", "()Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnActionableCard1;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NextBestAction {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @Nullable
        private final OnActionableCard1 onActionableCard;

        public NextBestAction(@NotNull String __typename, @Nullable OnActionableCard1 onActionableCard1) {
            Intrinsics.h(__typename, "__typename");
            this.__typename = __typename;
            this.onActionableCard = onActionableCard1;
        }

        public static /* synthetic */ NextBestAction copy$default(NextBestAction nextBestAction, String str, OnActionableCard1 onActionableCard1, int i, Object obj) {
            if ((i & 1) != 0) {
                str = nextBestAction.__typename;
            }
            if ((i & 2) != 0) {
                onActionableCard1 = nextBestAction.onActionableCard;
            }
            return nextBestAction.copy(str, onActionableCard1);
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

        @NotNull
        public final NextBestAction copy(@NotNull String __typename, @Nullable OnActionableCard1 onActionableCard) {
            Intrinsics.h(__typename, "__typename");
            return new NextBestAction(__typename, onActionableCard);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NextBestAction)) {
                return false;
            }
            NextBestAction nextBestAction = (NextBestAction) other;
            return Intrinsics.c(this.__typename, nextBestAction.__typename) && Intrinsics.c(this.onActionableCard, nextBestAction.onActionableCard);
        }

        @Nullable
        public final OnActionableCard1 getOnActionableCard() {
            return this.onActionableCard;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int iHashCode = this.__typename.hashCode() * 31;
            OnActionableCard1 onActionableCard1 = this.onActionableCard;
            return iHashCode + (onActionableCard1 == null ? 0 : onActionableCard1.hashCode());
        }

        @NotNull
        public String toString() {
            return "NextBestAction(__typename=" + this.__typename + ", onActionableCard=" + this.onActionableCard + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0017JN\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnActionableCard;", "", "image", "", "altText", "cardHeight", "Lau/com/woolworths/shop/graphql/type/CardHeight;", "link", "analytics", "Lau/com/woolworths/analytics/graphql/TealiumAnalytics;", "_excluded", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/shop/graphql/type/CardHeight;Ljava/lang/String;Lau/com/woolworths/analytics/graphql/TealiumAnalytics;Ljava/lang/Boolean;)V", "getImage", "()Ljava/lang/String;", "getAltText", "getCardHeight", "()Lau/com/woolworths/shop/graphql/type/CardHeight;", "getLink", "getAnalytics", "()Lau/com/woolworths/analytics/graphql/TealiumAnalytics;", "get_excluded", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/shop/graphql/type/CardHeight;Ljava/lang/String;Lau/com/woolworths/analytics/graphql/TealiumAnalytics;Ljava/lang/Boolean;)Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnActionableCard;", "equals", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0017JN\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnActionableCard1;", "", "link", "", "image", "altText", "cardHeight", "Lau/com/woolworths/shop/graphql/type/CardHeight;", "analytics", "Lau/com/woolworths/analytics/graphql/TealiumAnalytics;", "_excluded", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/shop/graphql/type/CardHeight;Lau/com/woolworths/analytics/graphql/TealiumAnalytics;Ljava/lang/Boolean;)V", "getLink", "()Ljava/lang/String;", "getImage", "getAltText", "getCardHeight", "()Lau/com/woolworths/shop/graphql/type/CardHeight;", "getAnalytics", "()Lau/com/woolworths/analytics/graphql/TealiumAnalytics;", "get_excluded", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/shop/graphql/type/CardHeight;Lau/com/woolworths/analytics/graphql/TealiumAnalytics;Ljava/lang/Boolean;)Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnActionableCard1;", "equals", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnActionableCard1 {
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

        public OnActionableCard1(@NotNull String link, @NotNull String image, @NotNull String altText, @NotNull CardHeight cardHeight, @Nullable TealiumAnalytics tealiumAnalytics, @Nullable Boolean bool) {
            Intrinsics.h(link, "link");
            Intrinsics.h(image, "image");
            Intrinsics.h(altText, "altText");
            Intrinsics.h(cardHeight, "cardHeight");
            this.link = link;
            this.image = image;
            this.altText = altText;
            this.cardHeight = cardHeight;
            this.analytics = tealiumAnalytics;
            this._excluded = bool;
        }

        public static /* synthetic */ OnActionableCard1 copy$default(OnActionableCard1 onActionableCard1, String str, String str2, String str3, CardHeight cardHeight, TealiumAnalytics tealiumAnalytics, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onActionableCard1.link;
            }
            if ((i & 2) != 0) {
                str2 = onActionableCard1.image;
            }
            if ((i & 4) != 0) {
                str3 = onActionableCard1.altText;
            }
            if ((i & 8) != 0) {
                cardHeight = onActionableCard1.cardHeight;
            }
            if ((i & 16) != 0) {
                tealiumAnalytics = onActionableCard1.analytics;
            }
            if ((i & 32) != 0) {
                bool = onActionableCard1._excluded;
            }
            TealiumAnalytics tealiumAnalytics2 = tealiumAnalytics;
            Boolean bool2 = bool;
            return onActionableCard1.copy(str, str2, str3, cardHeight, tealiumAnalytics2, bool2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getLink() {
            return this.link;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getAltText() {
            return this.altText;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final CardHeight getCardHeight() {
            return this.cardHeight;
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
        public final OnActionableCard1 copy(@NotNull String link, @NotNull String image, @NotNull String altText, @NotNull CardHeight cardHeight, @Nullable TealiumAnalytics analytics, @Nullable Boolean _excluded) {
            Intrinsics.h(link, "link");
            Intrinsics.h(image, "image");
            Intrinsics.h(altText, "altText");
            Intrinsics.h(cardHeight, "cardHeight");
            return new OnActionableCard1(link, image, altText, cardHeight, analytics, _excluded);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnActionableCard1)) {
                return false;
            }
            OnActionableCard1 onActionableCard1 = (OnActionableCard1) other;
            return Intrinsics.c(this.link, onActionableCard1.link) && Intrinsics.c(this.image, onActionableCard1.image) && Intrinsics.c(this.altText, onActionableCard1.altText) && this.cardHeight == onActionableCard1.cardHeight && Intrinsics.c(this.analytics, onActionableCard1.analytics) && Intrinsics.c(this._excluded, onActionableCard1._excluded);
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
            int iB = d.b(this.cardHeight, b.c(b.c(this.link.hashCode() * 31, 31, this.image), 31, this.altText), 31);
            TealiumAnalytics tealiumAnalytics = this.analytics;
            int iHashCode = (iB + (tealiumAnalytics == null ? 0 : tealiumAnalytics.hashCode())) * 31;
            Boolean bool = this._excluded;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.link;
            String str2 = this.image;
            String str3 = this.altText;
            CardHeight cardHeight = this.cardHeight;
            TealiumAnalytics tealiumAnalytics = this.analytics;
            Boolean bool = this._excluded;
            StringBuilder sbV = YU.a.v("OnActionableCard1(link=", str, ", image=", str2, ", altText=");
            sbV.append(str3);
            sbV.append(", cardHeight=");
            sbV.append(cardHeight);
            sbV.append(", analytics=");
            sbV.append(tealiumAnalytics);
            sbV.append(", _excluded=");
            sbV.append(bool);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnAdobeTargetAnalytics;", "", "tnta", "", "pe", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTnta", "()Ljava/lang/String;", "getPe", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnGoogleAdBannerCard;", "", OutOfContextTestingActivity.AD_UNIT_KEY, "", "nativeCustomTemplateId", "targeting", "Lau/com/woolworths/android/onesite/graphql/GoogleAdCustomTargeting;", "iabSize", "correlator", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/android/onesite/graphql/GoogleAdCustomTargeting;Ljava/lang/String;Ljava/lang/String;)V", "getAdUnit", "()Ljava/lang/String;", "getNativeCustomTemplateId", "getTargeting", "()Lau/com/woolworths/android/onesite/graphql/GoogleAdCustomTargeting;", "getIabSize", "getCorrelator", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnHorizontalList;", "", "title", "", "items", "", "Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$Item2;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHorizontalList {
        public static final int $stable = 8;

        @NotNull
        private final List<Item2> items;

        @NotNull
        private final String title;

        public OnHorizontalList(@NotNull String title, @NotNull List<Item2> items) {
            Intrinsics.h(title, "title");
            Intrinsics.h(items, "items");
            this.title = title;
            this.items = items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OnHorizontalList copy$default(OnHorizontalList onHorizontalList, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onHorizontalList.title;
            }
            if ((i & 2) != 0) {
                list = onHorizontalList.items;
            }
            return onHorizontalList.copy(str, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final List<Item2> component2() {
            return this.items;
        }

        @NotNull
        public final OnHorizontalList copy(@NotNull String title, @NotNull List<Item2> items) {
            Intrinsics.h(title, "title");
            Intrinsics.h(items, "items");
            return new OnHorizontalList(title, items);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnHorizontalList)) {
                return false;
            }
            OnHorizontalList onHorizontalList = (OnHorizontalList) other;
            return Intrinsics.c(this.title, onHorizontalList.title) && Intrinsics.c(this.items, onHorizontalList.items);
        }

        @NotNull
        public final List<Item2> getItems() {
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
            return au.com.woolworths.android.onesite.a.i("OnHorizontalList(title=", this.title, ", items=", ")", this.items);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnInsetBanner;", "", "displayType", "Lau/com/woolworths/shop/graphql/type/InsetBannerDisplayType;", "message", "", "bannerTitle", "iconUrl", UrlHandler.ACTION, "Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$Action;", "<init>", "(Lau/com/woolworths/shop/graphql/type/InsetBannerDisplayType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$Action;)V", "getDisplayType", "()Lau/com/woolworths/shop/graphql/type/InsetBannerDisplayType;", "getMessage", "()Ljava/lang/String;", "getBannerTitle", "getIconUrl", "getAction", "()Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$Action;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnProductCard;", "", "__typename", "", "productCard", "Lau/com/woolworths/graphql/common/fragment/ProductCard;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/graphql/common/fragment/ProductCard;)V", "get__typename", "()Ljava/lang/String;", "getProductCard", "()Lau/com/woolworths/graphql/common/fragment/ProductCard;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnProductCard1;", "", "__typename", "", "productCard", "Lau/com/woolworths/graphql/common/fragment/ProductCard;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/graphql/common/fragment/ProductCard;)V", "get__typename", "()Ljava/lang/String;", "getProductCard", "()Lau/com/woolworths/graphql/common/fragment/ProductCard;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnUniversalInventoryContainer;", "", "googleAdBannerCard", "Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$GoogleAdBannerCard;", "nextBestAction", "Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$NextBestAction;", "<init>", "(Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$GoogleAdBannerCard;Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$NextBestAction;)V", "getGoogleAdBannerCard", "()Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$GoogleAdBannerCard;", "getNextBestAction", "()Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$NextBestAction;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnZeroResultProductCategories;", "", "zeroResultProductCategoriesTitle", "", "zeroResultProductCategoriesItems", "", "Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$ZeroResultProductCategoriesItem;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getZeroResultProductCategoriesTitle", "()Ljava/lang/String;", "getZeroResultProductCategoriesItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$PrimaryCta;", "", AnnotatedPrivateKey.LABEL, "", "<init>", "(Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$ProductCategoryTileAction;", "", "type", "Lau/com/woolworths/shop/graphql/type/ActionType;", UrlHandler.ACTION, "", "id", "<init>", "(Lau/com/woolworths/shop/graphql/type/ActionType;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Lau/com/woolworths/shop/graphql/type/ActionType;", "getAction", "()Ljava/lang/String;", "getId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B§\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0006\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0006\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0011\u00107\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003J\u000f\u00109\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006HÆ\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\r0\u0006HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0011\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0006HÆ\u0003J\u0011\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0006HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u001bHÆ\u0003JÈ\u0001\u0010B\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00062\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÆ\u0001¢\u0006\u0002\u0010CJ\u0013\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010G\u001a\u00020\u0003HÖ\u0001J\t\u0010H\u001a\u00020IHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010 \u001a\u0004\b!\u0010\u001fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u0006J"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$ProductsBySearch;", "", "totalNumberOfProducts", "", "nextPage", "analytics", "", "Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$Analytic;", "productsFeed", "Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$ProductsFeed;", "filters", "Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$Filter;", "sortOptions", "Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$SortOption;", "sortOptionsBanner", "Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$SortOptionsBanner;", "marketplaceFilterSwitch", "Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$MarketplaceFilterSwitch;", "marketplaceInfo", "Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$MarketplaceInfo;", "marketplaceBottomSheet", "Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$MarketplaceBottomSheet;", "chips", "Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$Chip;", "facetChips", "Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$FacetChip;", "zeroResultContent", "Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$ZeroResultContent;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$SortOptionsBanner;Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$MarketplaceFilterSwitch;Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$MarketplaceInfo;Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$MarketplaceBottomSheet;Ljava/util/List;Ljava/util/List;Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$ZeroResultContent;)V", "getTotalNumberOfProducts", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNextPage", "getAnalytics", "()Ljava/util/List;", "getProductsFeed", "getFilters", "getSortOptions", "getSortOptionsBanner", "()Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$SortOptionsBanner;", "getMarketplaceFilterSwitch", "()Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$MarketplaceFilterSwitch;", "getMarketplaceInfo", "()Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$MarketplaceInfo;", "getMarketplaceBottomSheet", "()Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$MarketplaceBottomSheet;", "getChips", "getFacetChips", "getZeroResultContent$annotations", "()V", "getZeroResultContent", "()Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$ZeroResultContent;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$SortOptionsBanner;Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$MarketplaceFilterSwitch;Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$MarketplaceInfo;Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$MarketplaceBottomSheet;Ljava/util/List;Ljava/util/List;Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$ZeroResultContent;)Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$ProductsBySearch;", "equals", "", "other", "hashCode", "toString", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductsBySearch {
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

        @NotNull
        private final List<ProductsFeed> productsFeed;

        @NotNull
        private final List<SortOption> sortOptions;

        @Nullable
        private final SortOptionsBanner sortOptionsBanner;

        @Nullable
        private final Integer totalNumberOfProducts;

        @Nullable
        private final ZeroResultContent zeroResultContent;

        public ProductsBySearch(@Nullable Integer num, @Nullable Integer num2, @Nullable List<Analytic> list, @NotNull List<ProductsFeed> productsFeed, @NotNull List<Filter> filters, @NotNull List<SortOption> sortOptions, @Nullable SortOptionsBanner sortOptionsBanner, @Nullable MarketplaceFilterSwitch marketplaceFilterSwitch, @Nullable MarketplaceInfo marketplaceInfo, @Nullable MarketplaceBottomSheet marketplaceBottomSheet, @Nullable List<Chip> list2, @Nullable List<FacetChip> list3, @Nullable ZeroResultContent zeroResultContent) {
            Intrinsics.h(productsFeed, "productsFeed");
            Intrinsics.h(filters, "filters");
            Intrinsics.h(sortOptions, "sortOptions");
            this.totalNumberOfProducts = num;
            this.nextPage = num2;
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
        }

        public static /* synthetic */ ProductsBySearch copy$default(ProductsBySearch productsBySearch, Integer num, Integer num2, List list, List list2, List list3, List list4, SortOptionsBanner sortOptionsBanner, MarketplaceFilterSwitch marketplaceFilterSwitch, MarketplaceInfo marketplaceInfo, MarketplaceBottomSheet marketplaceBottomSheet, List list5, List list6, ZeroResultContent zeroResultContent, int i, Object obj) {
            if ((i & 1) != 0) {
                num = productsBySearch.totalNumberOfProducts;
            }
            return productsBySearch.copy(num, (i & 2) != 0 ? productsBySearch.nextPage : num2, (i & 4) != 0 ? productsBySearch.analytics : list, (i & 8) != 0 ? productsBySearch.productsFeed : list2, (i & 16) != 0 ? productsBySearch.filters : list3, (i & 32) != 0 ? productsBySearch.sortOptions : list4, (i & 64) != 0 ? productsBySearch.sortOptionsBanner : sortOptionsBanner, (i & 128) != 0 ? productsBySearch.marketplaceFilterSwitch : marketplaceFilterSwitch, (i & 256) != 0 ? productsBySearch.marketplaceInfo : marketplaceInfo, (i & 512) != 0 ? productsBySearch.marketplaceBottomSheet : marketplaceBottomSheet, (i & 1024) != 0 ? productsBySearch.chips : list5, (i & 2048) != 0 ? productsBySearch.facetChips : list6, (i & 4096) != 0 ? productsBySearch.zeroResultContent : zeroResultContent);
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
        public final MarketplaceBottomSheet getMarketplaceBottomSheet() {
            return this.marketplaceBottomSheet;
        }

        @Nullable
        public final List<Chip> component11() {
            return this.chips;
        }

        @Nullable
        public final List<FacetChip> component12() {
            return this.facetChips;
        }

        @Nullable
        /* renamed from: component13, reason: from getter */
        public final ZeroResultContent getZeroResultContent() {
            return this.zeroResultContent;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Integer getNextPage() {
            return this.nextPage;
        }

        @Nullable
        public final List<Analytic> component3() {
            return this.analytics;
        }

        @NotNull
        public final List<ProductsFeed> component4() {
            return this.productsFeed;
        }

        @NotNull
        public final List<Filter> component5() {
            return this.filters;
        }

        @NotNull
        public final List<SortOption> component6() {
            return this.sortOptions;
        }

        @Nullable
        /* renamed from: component7, reason: from getter */
        public final SortOptionsBanner getSortOptionsBanner() {
            return this.sortOptionsBanner;
        }

        @Nullable
        /* renamed from: component8, reason: from getter */
        public final MarketplaceFilterSwitch getMarketplaceFilterSwitch() {
            return this.marketplaceFilterSwitch;
        }

        @Nullable
        /* renamed from: component9, reason: from getter */
        public final MarketplaceInfo getMarketplaceInfo() {
            return this.marketplaceInfo;
        }

        @NotNull
        public final ProductsBySearch copy(@Nullable Integer totalNumberOfProducts, @Nullable Integer nextPage, @Nullable List<Analytic> analytics, @NotNull List<ProductsFeed> productsFeed, @NotNull List<Filter> filters, @NotNull List<SortOption> sortOptions, @Nullable SortOptionsBanner sortOptionsBanner, @Nullable MarketplaceFilterSwitch marketplaceFilterSwitch, @Nullable MarketplaceInfo marketplaceInfo, @Nullable MarketplaceBottomSheet marketplaceBottomSheet, @Nullable List<Chip> chips, @Nullable List<FacetChip> facetChips, @Nullable ZeroResultContent zeroResultContent) {
            Intrinsics.h(productsFeed, "productsFeed");
            Intrinsics.h(filters, "filters");
            Intrinsics.h(sortOptions, "sortOptions");
            return new ProductsBySearch(totalNumberOfProducts, nextPage, analytics, productsFeed, filters, sortOptions, sortOptionsBanner, marketplaceFilterSwitch, marketplaceInfo, marketplaceBottomSheet, chips, facetChips, zeroResultContent);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductsBySearch)) {
                return false;
            }
            ProductsBySearch productsBySearch = (ProductsBySearch) other;
            return Intrinsics.c(this.totalNumberOfProducts, productsBySearch.totalNumberOfProducts) && Intrinsics.c(this.nextPage, productsBySearch.nextPage) && Intrinsics.c(this.analytics, productsBySearch.analytics) && Intrinsics.c(this.productsFeed, productsBySearch.productsFeed) && Intrinsics.c(this.filters, productsBySearch.filters) && Intrinsics.c(this.sortOptions, productsBySearch.sortOptions) && Intrinsics.c(this.sortOptionsBanner, productsBySearch.sortOptionsBanner) && Intrinsics.c(this.marketplaceFilterSwitch, productsBySearch.marketplaceFilterSwitch) && Intrinsics.c(this.marketplaceInfo, productsBySearch.marketplaceInfo) && Intrinsics.c(this.marketplaceBottomSheet, productsBySearch.marketplaceBottomSheet) && Intrinsics.c(this.chips, productsBySearch.chips) && Intrinsics.c(this.facetChips, productsBySearch.facetChips) && Intrinsics.c(this.zeroResultContent, productsBySearch.zeroResultContent);
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
        public final ZeroResultContent getZeroResultContent() {
            return this.zeroResultContent;
        }

        public int hashCode() {
            Integer num = this.totalNumberOfProducts;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.nextPage;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            List<Analytic> list = this.analytics;
            int iD = b.d(b.d(b.d((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.productsFeed), 31, this.filters), 31, this.sortOptions);
            SortOptionsBanner sortOptionsBanner = this.sortOptionsBanner;
            int iHashCode3 = (iD + (sortOptionsBanner == null ? 0 : sortOptionsBanner.hashCode())) * 31;
            MarketplaceFilterSwitch marketplaceFilterSwitch = this.marketplaceFilterSwitch;
            int iHashCode4 = (iHashCode3 + (marketplaceFilterSwitch == null ? 0 : marketplaceFilterSwitch.hashCode())) * 31;
            MarketplaceInfo marketplaceInfo = this.marketplaceInfo;
            int iHashCode5 = (iHashCode4 + (marketplaceInfo == null ? 0 : marketplaceInfo.hashCode())) * 31;
            MarketplaceBottomSheet marketplaceBottomSheet = this.marketplaceBottomSheet;
            int iHashCode6 = (iHashCode5 + (marketplaceBottomSheet == null ? 0 : marketplaceBottomSheet.hashCode())) * 31;
            List<Chip> list2 = this.chips;
            int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<FacetChip> list3 = this.facetChips;
            int iHashCode8 = (iHashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
            ZeroResultContent zeroResultContent = this.zeroResultContent;
            return iHashCode8 + (zeroResultContent != null ? zeroResultContent.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Integer num = this.totalNumberOfProducts;
            Integer num2 = this.nextPage;
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
            StringBuilder sbV = d.v("ProductsBySearch(totalNumberOfProducts=", num, ", nextPage=", num2, ", analytics=");
            au.com.woolworths.android.onesite.a.C(sbV, list, ", productsFeed=", list2, ", filters=");
            au.com.woolworths.android.onesite.a.C(sbV, list3, ", sortOptions=", list4, ", sortOptionsBanner=");
            sbV.append(sortOptionsBanner);
            sbV.append(", marketplaceFilterSwitch=");
            sbV.append(marketplaceFilterSwitch);
            sbV.append(", marketplaceInfo=");
            sbV.append(marketplaceInfo);
            sbV.append(", marketplaceBottomSheet=");
            sbV.append(marketplaceBottomSheet);
            sbV.append(", chips=");
            au.com.woolworths.android.onesite.a.C(sbV, list5, ", facetChips=", list6, ", zeroResultContent=");
            sbV.append(zeroResultContent);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003JO\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$ProductsFeed;", "", "__typename", "", "onActionableCard", "Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnActionableCard;", "onGoogleAdBannerCard", "Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnGoogleAdBannerCard;", "onUniversalInventoryContainer", "Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnUniversalInventoryContainer;", "onInsetBanner", "Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnInsetBanner;", "onProductCard", "Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnProductCard;", "<init>", "(Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnActionableCard;Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnGoogleAdBannerCard;Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnUniversalInventoryContainer;Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnInsetBanner;Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnProductCard;)V", "get__typename", "()Ljava/lang/String;", "getOnActionableCard", "()Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnActionableCard;", "getOnGoogleAdBannerCard", "()Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnGoogleAdBannerCard;", "getOnUniversalInventoryContainer", "()Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnUniversalInventoryContainer;", "getOnInsetBanner", "()Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnInsetBanner;", "getOnProductCard", "()Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$OnProductCard;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductsFeed {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @Nullable
        private final OnActionableCard onActionableCard;

        @Nullable
        private final OnGoogleAdBannerCard onGoogleAdBannerCard;

        @Nullable
        private final OnInsetBanner onInsetBanner;

        @Nullable
        private final OnProductCard onProductCard;

        @Nullable
        private final OnUniversalInventoryContainer onUniversalInventoryContainer;

        public ProductsFeed(@NotNull String __typename, @Nullable OnActionableCard onActionableCard, @Nullable OnGoogleAdBannerCard onGoogleAdBannerCard, @Nullable OnUniversalInventoryContainer onUniversalInventoryContainer, @Nullable OnInsetBanner onInsetBanner, @Nullable OnProductCard onProductCard) {
            Intrinsics.h(__typename, "__typename");
            this.__typename = __typename;
            this.onActionableCard = onActionableCard;
            this.onGoogleAdBannerCard = onGoogleAdBannerCard;
            this.onUniversalInventoryContainer = onUniversalInventoryContainer;
            this.onInsetBanner = onInsetBanner;
            this.onProductCard = onProductCard;
        }

        public static /* synthetic */ ProductsFeed copy$default(ProductsFeed productsFeed, String str, OnActionableCard onActionableCard, OnGoogleAdBannerCard onGoogleAdBannerCard, OnUniversalInventoryContainer onUniversalInventoryContainer, OnInsetBanner onInsetBanner, OnProductCard onProductCard, int i, Object obj) {
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
                onInsetBanner = productsFeed.onInsetBanner;
            }
            if ((i & 32) != 0) {
                onProductCard = productsFeed.onProductCard;
            }
            OnInsetBanner onInsetBanner2 = onInsetBanner;
            OnProductCard onProductCard2 = onProductCard;
            return productsFeed.copy(str, onActionableCard, onGoogleAdBannerCard, onUniversalInventoryContainer, onInsetBanner2, onProductCard2);
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
        public final OnInsetBanner getOnInsetBanner() {
            return this.onInsetBanner;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final OnProductCard getOnProductCard() {
            return this.onProductCard;
        }

        @NotNull
        public final ProductsFeed copy(@NotNull String __typename, @Nullable OnActionableCard onActionableCard, @Nullable OnGoogleAdBannerCard onGoogleAdBannerCard, @Nullable OnUniversalInventoryContainer onUniversalInventoryContainer, @Nullable OnInsetBanner onInsetBanner, @Nullable OnProductCard onProductCard) {
            Intrinsics.h(__typename, "__typename");
            return new ProductsFeed(__typename, onActionableCard, onGoogleAdBannerCard, onUniversalInventoryContainer, onInsetBanner, onProductCard);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductsFeed)) {
                return false;
            }
            ProductsFeed productsFeed = (ProductsFeed) other;
            return Intrinsics.c(this.__typename, productsFeed.__typename) && Intrinsics.c(this.onActionableCard, productsFeed.onActionableCard) && Intrinsics.c(this.onGoogleAdBannerCard, productsFeed.onGoogleAdBannerCard) && Intrinsics.c(this.onUniversalInventoryContainer, productsFeed.onUniversalInventoryContainer) && Intrinsics.c(this.onInsetBanner, productsFeed.onInsetBanner) && Intrinsics.c(this.onProductCard, productsFeed.onProductCard);
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
        public final OnInsetBanner getOnInsetBanner() {
            return this.onInsetBanner;
        }

        @Nullable
        public final OnProductCard getOnProductCard() {
            return this.onProductCard;
        }

        @Nullable
        public final OnUniversalInventoryContainer getOnUniversalInventoryContainer() {
            return this.onUniversalInventoryContainer;
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
            OnInsetBanner onInsetBanner = this.onInsetBanner;
            int iHashCode5 = (iHashCode4 + (onInsetBanner == null ? 0 : onInsetBanner.hashCode())) * 31;
            OnProductCard onProductCard = this.onProductCard;
            return iHashCode5 + (onProductCard != null ? onProductCard.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ProductsFeed(__typename=" + this.__typename + ", onActionableCard=" + this.onActionableCard + ", onGoogleAdBannerCard=" + this.onGoogleAdBannerCard + ", onUniversalInventoryContainer=" + this.onUniversalInventoryContainer + ", onInsetBanner=" + this.onInsetBanner + ", onProductCard=" + this.onProductCard + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$SecondaryCta;", "", AnnotatedPrivateKey.LABEL, "", "<init>", "(Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$SortOption;", "", "key", "", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "isApplied", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getKey", "()Ljava/lang/String;", "getTitle", "getSubtitle", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$SortOptionsBanner;", "", "__typename", "", "insetBanner", "Lcom/woolworths/product/list/legacy/fragment/InsetBanner;", "<init>", "(Ljava/lang/String;Lcom/woolworths/product/list/legacy/fragment/InsetBanner;)V", "get__typename", "()Ljava/lang/String;", "getInsetBanner", "()Lcom/woolworths/product/list/legacy/fragment/InsetBanner;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$Text;", "", TextBundle.TEXT_ENTRY, "", "altText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getAltText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$Text1;", "", TextBundle.TEXT_ENTRY, "", "altText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getAltText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$ZeroResultContent;", "", "title", "", "message", "items", "", "Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$Item1;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getMessage", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ZeroResultContent {
        public static final int $stable = 8;

        @NotNull
        private final List<Item1> items;

        @Nullable
        private final String message;

        @Nullable
        private final String title;

        public ZeroResultContent(@Nullable String str, @Nullable String str2, @NotNull List<Item1> items) {
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
        public final List<Item1> component3() {
            return this.items;
        }

        @NotNull
        public final ZeroResultContent copy(@Nullable String title, @Nullable String message, @NotNull List<Item1> items) {
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
        public final List<Item1> getItems() {
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
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$ZeroResultProductCategoriesItem;", "", "productCategoryTileAction", "Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$ProductCategoryTileAction;", "productCategoryTileImageUrl", "", "productCategoryTileLabel", "<init>", "(Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$ProductCategoryTileAction;Ljava/lang/String;Ljava/lang/String;)V", "getProductCategoryTileAction", "()Lcom/woolworths/product/list/legacy/ProductsBySearchQuery$ProductCategoryTileAction;", "getProductCategoryTileImageUrl", "()Ljava/lang/String;", "getProductCategoryTileLabel", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    /* JADX WARN: Multi-variable type inference failed */
    public ProductsBySearchQuery(@NotNull String searchTerm, @NotNull Optional<String> storeId, @NotNull Optional<Integer> pageSize, @NotNull Optional<Integer> pageNumber, @NotNull Optional<String> sortOption, @NotNull Optional<? extends List<ProductFilterOption>> filterOptions, @NotNull Optional<Boolean> includeMarketplaceProducts, @NotNull Optional<? extends List<String>> supportedLinks, boolean z, boolean z2, @NotNull Optional<Boolean> includeAvailabilityInfoStatus, @NotNull Optional<ChipsProductListInputArgs> chips, @NotNull Optional<String> facetChip, boolean z3, boolean z4, boolean z5, @NotNull Optional<Boolean> includePricingFootnote, boolean z6) {
        Intrinsics.h(searchTerm, "searchTerm");
        Intrinsics.h(storeId, "storeId");
        Intrinsics.h(pageSize, "pageSize");
        Intrinsics.h(pageNumber, "pageNumber");
        Intrinsics.h(sortOption, "sortOption");
        Intrinsics.h(filterOptions, "filterOptions");
        Intrinsics.h(includeMarketplaceProducts, "includeMarketplaceProducts");
        Intrinsics.h(supportedLinks, "supportedLinks");
        Intrinsics.h(includeAvailabilityInfoStatus, "includeAvailabilityInfoStatus");
        Intrinsics.h(chips, "chips");
        Intrinsics.h(facetChip, "facetChip");
        Intrinsics.h(includePricingFootnote, "includePricingFootnote");
        this.searchTerm = searchTerm;
        this.storeId = storeId;
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
        this.sortOption = sortOption;
        this.filterOptions = filterOptions;
        this.includeMarketplaceProducts = includeMarketplaceProducts;
        this.supportedLinks = supportedLinks;
        this.includeProductAvailabilityStates = z;
        this.includeOfferMinimumSpend = z2;
        this.includeAvailabilityInfoStatus = includeAvailabilityInfoStatus;
        this.chips = chips;
        this.facetChip = facetChip;
        this.includeUnitPriceInsetBanner = z3;
        this.includeUniversalInventoryFallback = z4;
        this.includeZeroResultPage = z5;
        this.includePricingFootnote = includePricingFootnote;
        this.includeLowestPrice14Days = z6;
    }

    public static /* synthetic */ ProductsBySearchQuery copy$default(ProductsBySearchQuery productsBySearchQuery, String str, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, Optional optional7, boolean z, boolean z2, Optional optional8, Optional optional9, Optional optional10, boolean z3, boolean z4, boolean z5, Optional optional11, boolean z6, int i, Object obj) {
        boolean z7;
        Optional optional12;
        String str2 = (i & 1) != 0 ? productsBySearchQuery.searchTerm : str;
        Optional optional13 = (i & 2) != 0 ? productsBySearchQuery.storeId : optional;
        Optional optional14 = (i & 4) != 0 ? productsBySearchQuery.pageSize : optional2;
        Optional optional15 = (i & 8) != 0 ? productsBySearchQuery.pageNumber : optional3;
        Optional optional16 = (i & 16) != 0 ? productsBySearchQuery.sortOption : optional4;
        Optional optional17 = (i & 32) != 0 ? productsBySearchQuery.filterOptions : optional5;
        Optional optional18 = (i & 64) != 0 ? productsBySearchQuery.includeMarketplaceProducts : optional6;
        Optional optional19 = (i & 128) != 0 ? productsBySearchQuery.supportedLinks : optional7;
        boolean z8 = (i & 256) != 0 ? productsBySearchQuery.includeProductAvailabilityStates : z;
        boolean z9 = (i & 512) != 0 ? productsBySearchQuery.includeOfferMinimumSpend : z2;
        Optional optional20 = (i & 1024) != 0 ? productsBySearchQuery.includeAvailabilityInfoStatus : optional8;
        Optional optional21 = (i & 2048) != 0 ? productsBySearchQuery.chips : optional9;
        Optional optional22 = (i & 4096) != 0 ? productsBySearchQuery.facetChip : optional10;
        boolean z10 = (i & 8192) != 0 ? productsBySearchQuery.includeUnitPriceInsetBanner : z3;
        String str3 = str2;
        boolean z11 = (i & 16384) != 0 ? productsBySearchQuery.includeUniversalInventoryFallback : z4;
        boolean z12 = (i & 32768) != 0 ? productsBySearchQuery.includeZeroResultPage : z5;
        Optional optional23 = (i & 65536) != 0 ? productsBySearchQuery.includePricingFootnote : optional11;
        if ((i & 131072) != 0) {
            optional12 = optional23;
            z7 = productsBySearchQuery.includeLowestPrice14Days;
        } else {
            z7 = z6;
            optional12 = optional23;
        }
        return productsBySearchQuery.copy(str3, optional13, optional14, optional15, optional16, optional17, optional18, optional19, z8, z9, optional20, optional21, optional22, z10, z11, z12, optional12, z7);
    }

    @Override // com.apollographql.apollo.api.Executable
    @NotNull
    public Adapter<Data> adapter() {
        return Adapters.c(ProductsBySearchQuery_ResponseAdapter.Data.INSTANCE, false);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSearchTerm() {
        return this.searchTerm;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIncludeOfferMinimumSpend() {
        return this.includeOfferMinimumSpend;
    }

    @NotNull
    public final Optional<Boolean> component11() {
        return this.includeAvailabilityInfoStatus;
    }

    @NotNull
    public final Optional<ChipsProductListInputArgs> component12() {
        return this.chips;
    }

    @NotNull
    public final Optional<String> component13() {
        return this.facetChip;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIncludeUnitPriceInsetBanner() {
        return this.includeUnitPriceInsetBanner;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getIncludeUniversalInventoryFallback() {
        return this.includeUniversalInventoryFallback;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getIncludeZeroResultPage() {
        return this.includeZeroResultPage;
    }

    @NotNull
    public final Optional<Boolean> component17() {
        return this.includePricingFootnote;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getIncludeLowestPrice14Days() {
        return this.includeLowestPrice14Days;
    }

    @NotNull
    public final Optional<String> component2() {
        return this.storeId;
    }

    @NotNull
    public final Optional<Integer> component3() {
        return this.pageSize;
    }

    @NotNull
    public final Optional<Integer> component4() {
        return this.pageNumber;
    }

    @NotNull
    public final Optional<String> component5() {
        return this.sortOption;
    }

    @NotNull
    public final Optional<List<ProductFilterOption>> component6() {
        return this.filterOptions;
    }

    @NotNull
    public final Optional<Boolean> component7() {
        return this.includeMarketplaceProducts;
    }

    @NotNull
    public final Optional<List<String>> component8() {
        return this.supportedLinks;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIncludeProductAvailabilityStates() {
        return this.includeProductAvailabilityStates;
    }

    @NotNull
    public final ProductsBySearchQuery copy(@NotNull String searchTerm, @NotNull Optional<String> storeId, @NotNull Optional<Integer> pageSize, @NotNull Optional<Integer> pageNumber, @NotNull Optional<String> sortOption, @NotNull Optional<? extends List<ProductFilterOption>> filterOptions, @NotNull Optional<Boolean> includeMarketplaceProducts, @NotNull Optional<? extends List<String>> supportedLinks, boolean includeProductAvailabilityStates, boolean includeOfferMinimumSpend, @NotNull Optional<Boolean> includeAvailabilityInfoStatus, @NotNull Optional<ChipsProductListInputArgs> chips, @NotNull Optional<String> facetChip, boolean includeUnitPriceInsetBanner, boolean includeUniversalInventoryFallback, boolean includeZeroResultPage, @NotNull Optional<Boolean> includePricingFootnote, boolean includeLowestPrice14Days) {
        Intrinsics.h(searchTerm, "searchTerm");
        Intrinsics.h(storeId, "storeId");
        Intrinsics.h(pageSize, "pageSize");
        Intrinsics.h(pageNumber, "pageNumber");
        Intrinsics.h(sortOption, "sortOption");
        Intrinsics.h(filterOptions, "filterOptions");
        Intrinsics.h(includeMarketplaceProducts, "includeMarketplaceProducts");
        Intrinsics.h(supportedLinks, "supportedLinks");
        Intrinsics.h(includeAvailabilityInfoStatus, "includeAvailabilityInfoStatus");
        Intrinsics.h(chips, "chips");
        Intrinsics.h(facetChip, "facetChip");
        Intrinsics.h(includePricingFootnote, "includePricingFootnote");
        return new ProductsBySearchQuery(searchTerm, storeId, pageSize, pageNumber, sortOption, filterOptions, includeMarketplaceProducts, supportedLinks, includeProductAvailabilityStates, includeOfferMinimumSpend, includeAvailabilityInfoStatus, chips, facetChip, includeUnitPriceInsetBanner, includeUniversalInventoryFallback, includeZeroResultPage, includePricingFootnote, includeLowestPrice14Days);
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
        if (!(other instanceof ProductsBySearchQuery)) {
            return false;
        }
        ProductsBySearchQuery productsBySearchQuery = (ProductsBySearchQuery) other;
        return Intrinsics.c(this.searchTerm, productsBySearchQuery.searchTerm) && Intrinsics.c(this.storeId, productsBySearchQuery.storeId) && Intrinsics.c(this.pageSize, productsBySearchQuery.pageSize) && Intrinsics.c(this.pageNumber, productsBySearchQuery.pageNumber) && Intrinsics.c(this.sortOption, productsBySearchQuery.sortOption) && Intrinsics.c(this.filterOptions, productsBySearchQuery.filterOptions) && Intrinsics.c(this.includeMarketplaceProducts, productsBySearchQuery.includeMarketplaceProducts) && Intrinsics.c(this.supportedLinks, productsBySearchQuery.supportedLinks) && this.includeProductAvailabilityStates == productsBySearchQuery.includeProductAvailabilityStates && this.includeOfferMinimumSpend == productsBySearchQuery.includeOfferMinimumSpend && Intrinsics.c(this.includeAvailabilityInfoStatus, productsBySearchQuery.includeAvailabilityInfoStatus) && Intrinsics.c(this.chips, productsBySearchQuery.chips) && Intrinsics.c(this.facetChip, productsBySearchQuery.facetChip) && this.includeUnitPriceInsetBanner == productsBySearchQuery.includeUnitPriceInsetBanner && this.includeUniversalInventoryFallback == productsBySearchQuery.includeUniversalInventoryFallback && this.includeZeroResultPage == productsBySearchQuery.includeZeroResultPage && Intrinsics.c(this.includePricingFootnote, productsBySearchQuery.includePricingFootnote) && this.includeLowestPrice14Days == productsBySearchQuery.includeLowestPrice14Days;
    }

    @NotNull
    public final Optional<ChipsProductListInputArgs> getChips() {
        return this.chips;
    }

    @NotNull
    public final Optional<String> getFacetChip() {
        return this.facetChip;
    }

    @NotNull
    public final Optional<List<ProductFilterOption>> getFilterOptions() {
        return this.filterOptions;
    }

    @NotNull
    public final Optional<Boolean> getIncludeAvailabilityInfoStatus() {
        return this.includeAvailabilityInfoStatus;
    }

    public final boolean getIncludeLowestPrice14Days() {
        return this.includeLowestPrice14Days;
    }

    @NotNull
    public final Optional<Boolean> getIncludeMarketplaceProducts() {
        return this.includeMarketplaceProducts;
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

    public final boolean getIncludeUnitPriceInsetBanner() {
        return this.includeUnitPriceInsetBanner;
    }

    public final boolean getIncludeUniversalInventoryFallback() {
        return this.includeUniversalInventoryFallback;
    }

    public final boolean getIncludeZeroResultPage() {
        return this.includeZeroResultPage;
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
    public final String getSearchTerm() {
        return this.searchTerm;
    }

    @NotNull
    public final Optional<String> getSortOption() {
        return this.sortOption;
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
        return Boolean.hashCode(this.includeLowestPrice14Days) + au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.includePricingFootnote, b.e(b.e(b.e(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.facetChip, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.chips, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.includeAvailabilityInfoStatus, b.e(b.e(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.supportedLinks, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.includeMarketplaceProducts, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.filterOptions, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.sortOption, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.pageNumber, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.pageSize, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.storeId, this.searchTerm.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.includeProductAvailabilityStates), 31, this.includeOfferMinimumSpend), 31), 31), 31), 31, this.includeUnitPriceInsetBanner), 31, this.includeUniversalInventoryFallback), 31, this.includeZeroResultPage), 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    @NotNull
    public String id() {
        return "4949c158e1f6dd4c6e0f1348795b54d23ef96c5dc994382a7fc316c4208aee9c";
    }

    @Override // com.apollographql.apollo.api.Operation
    @NotNull
    public String name() {
        return "productsBySearch";
    }

    @NotNull
    public CompiledField rootField() {
        CompiledField.Builder builder = new CompiledField.Builder("data", au.com.woolworths.shop.graphql.type.Query.H2);
        builder.e(ProductsBySearchQuerySelections.INSTANCE.get__root());
        return builder.c();
    }

    @Override // com.apollographql.apollo.api.Executable
    public void serializeVariables(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        ProductsBySearchQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @NotNull
    public String toString() {
        String str = this.searchTerm;
        Optional<String> optional = this.storeId;
        Optional<Integer> optional2 = this.pageSize;
        Optional<Integer> optional3 = this.pageNumber;
        Optional<String> optional4 = this.sortOption;
        Optional<List<ProductFilterOption>> optional5 = this.filterOptions;
        Optional<Boolean> optional6 = this.includeMarketplaceProducts;
        Optional<List<String>> optional7 = this.supportedLinks;
        boolean z = this.includeProductAvailabilityStates;
        boolean z2 = this.includeOfferMinimumSpend;
        Optional<Boolean> optional8 = this.includeAvailabilityInfoStatus;
        Optional<ChipsProductListInputArgs> optional9 = this.chips;
        Optional<String> optional10 = this.facetChip;
        boolean z3 = this.includeUnitPriceInsetBanner;
        boolean z4 = this.includeUniversalInventoryFallback;
        boolean z5 = this.includeZeroResultPage;
        Optional<Boolean> optional11 = this.includePricingFootnote;
        boolean z6 = this.includeLowestPrice14Days;
        StringBuilder sbR = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.r("ProductsBySearchQuery(searchTerm=", str, ", storeId=", optional, ", pageSize=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sbR, optional2, ", pageNumber=", optional3, ", sortOption=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sbR, optional4, ", filterOptions=", optional5, ", includeMarketplaceProducts=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sbR, optional6, ", supportedLinks=", optional7, ", includeProductAvailabilityStates=");
        au.com.woolworths.android.onesite.a.D(sbR, z, ", includeOfferMinimumSpend=", z2, ", includeAvailabilityInfoStatus=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sbR, optional8, ", chips=", optional9, ", facetChip=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.y(sbR, optional10, ", includeUnitPriceInsetBanner=", z3, ", includeUniversalInventoryFallback=");
        au.com.woolworths.android.onesite.a.D(sbR, z4, ", includeZeroResultPage=", z5, ", includePricingFootnote=");
        sbR.append(optional11);
        sbR.append(", includeLowestPrice14Days=");
        sbR.append(z6);
        sbR.append(")");
        return sbR.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ProductsBySearchQuery(String str, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, Optional optional7, boolean z, boolean z2, Optional optional8, Optional optional9, Optional optional10, boolean z3, boolean z4, boolean z5, Optional optional11, boolean z6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i & 2;
        Optional.Absent absent = Optional.Absent.f13523a;
        this(str, i2 != 0 ? absent : optional, (i & 4) != 0 ? absent : optional2, (i & 8) != 0 ? absent : optional3, (i & 16) != 0 ? absent : optional4, (i & 32) != 0 ? absent : optional5, (i & 64) != 0 ? absent : optional6, (i & 128) != 0 ? absent : optional7, z, z2, (i & 1024) != 0 ? absent : optional8, (i & 2048) != 0 ? absent : optional9, (i & 4096) != 0 ? absent : optional10, z3, z4, z5, (i & 65536) != 0 ? absent : optional11, z6);
    }
}
