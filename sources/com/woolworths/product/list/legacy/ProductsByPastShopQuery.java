package com.woolworths.product.list.legacy;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.graphql.TealiumAnalytics;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.shop.graphql.type.CardHeight;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.lists.data.remote.PurchaseHistoryQuery;
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
import com.woolworths.product.list.legacy.adapter.ProductsByPastShopQuery_ResponseAdapter;
import com.woolworths.product.list.legacy.adapter.ProductsByPastShopQuery_VariablesAdapter;
import com.woolworths.product.list.legacy.fragment.InsetBanner;
import com.woolworths.product.list.legacy.selections.ProductsByPastShopQuerySelections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u0000 L2\b\u0012\u0004\u0012\u00020\u00020\u0001:\r@ABCDEFGHIJKLB\u0097\u0001\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010!\u001a\u00020\u0005H\u0016J\b\u0010\"\u001a\u00020\u0005H\u0016J\b\u0010#\u001a\u00020\u0005H\u0016J \u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u000bH\u0016J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020,H\u0016J\b\u0010-\u001a\u00020.H\u0016J\u0011\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003J\u0011\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003J\u0011\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004HÆ\u0003J\u0011\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004HÆ\u0003J\t\u00103\u001a\u00020\u000bHÆ\u0003J\t\u00104\u001a\u00020\u000bHÆ\u0003J\t\u00105\u001a\u00020\u000bHÆ\u0003J\t\u00106\u001a\u00020\u000bHÆ\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004HÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004HÆ\u0003J\t\u00109\u001a\u00020\u000bHÆ\u0003J£\u0001\u0010:\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u000bHÆ\u0001J\u0013\u0010;\u001a\u00020\u000b2\b\u0010<\u001a\u0004\u0018\u00010=HÖ\u0003J\t\u0010>\u001a\u00020\bHÖ\u0001J\t\u0010?\u001a\u00020\u0005HÖ\u0001R\u0019\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\u0011\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001a¨\u0006M"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$Data;", "storeId", "Lcom/apollographql/apollo/api/Optional;", "", "basketId", "pageNumber", "", "pageSize", "fetchActionableCard", "", "includeProductAvailabilityStates", "includeOfferMinimumSpend", "includeUnitPriceInsetBanner", "includeAvailabilityInfoStatus", "includePricingFootnote", "includeLowestPrice14Days", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;ZZZZLcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Z)V", "getStoreId", "()Lcom/apollographql/apollo/api/Optional;", "getBasketId", "getPageNumber", "getPageSize", "getFetchActionableCard", "()Z", "getIncludeProductAvailabilityStates", "getIncludeOfferMinimumSpend", "getIncludeUnitPriceInsetBanner", "getIncludeAvailabilityInfoStatus", "getIncludePricingFootnote", "getIncludeLowestPrice14Days", "id", "document", AppMeasurementSdk.ConditionalUserProperty.NAME, "serializeVariables", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "withDefaultValues", "adapter", "Lcom/apollographql/apollo/api/Adapter;", "rootField", "Lcom/apollographql/apollo/api/CompiledField;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "", "hashCode", "toString", "Data", PurchaseHistoryQuery.OPERATION_NAME, "ProductsFeed", "OnActionableCard", "OnProductCard", "OnImageTextBanner", "Filter", "FilterItem", "Banner", "Action", "SortOption", "SortOptionsBanner", "Companion", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ProductsByPastShopQuery implements Query<Data> {

    @NotNull
    public static final String OPERATION_ID = "d538dc57b3fb9edc39f03dfcdbed1ae18663665ace545c07ef2dfca926ec6e88";

    @NotNull
    public static final String OPERATION_NAME = "productsByPastShop";

    @NotNull
    private final Optional<String> basketId;
    private final boolean fetchActionableCard;

    @NotNull
    private final Optional<Boolean> includeAvailabilityInfoStatus;
    private final boolean includeLowestPrice14Days;
    private final boolean includeOfferMinimumSpend;

    @NotNull
    private final Optional<Boolean> includePricingFootnote;
    private final boolean includeProductAvailabilityStates;
    private final boolean includeUnitPriceInsetBanner;

    @NotNull
    private final Optional<Integer> pageNumber;

    @NotNull
    private final Optional<Integer> pageSize;

    @NotNull
    private final Optional<String> storeId;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @StabilityInferred
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$Action;", "", "placement", "Lau/com/woolworths/shop/graphql/type/InsetBannerActionPlacement;", "type", "Lau/com/woolworths/shop/graphql/type/InsetBannerActionType;", AnnotatedPrivateKey.LABEL, "", "url", "<init>", "(Lau/com/woolworths/shop/graphql/type/InsetBannerActionPlacement;Lau/com/woolworths/shop/graphql/type/InsetBannerActionType;Ljava/lang/String;Ljava/lang/String;)V", "getPlacement", "()Lau/com/woolworths/shop/graphql/type/InsetBannerActionPlacement;", "getType", "()Lau/com/woolworths/shop/graphql/type/InsetBannerActionType;", "getLabel", "()Ljava/lang/String;", "getUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006 "}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$Banner;", "", "displayType", "Lau/com/woolworths/shop/graphql/type/InsetBannerDisplayType;", "message", "", "iconUrl", UrlHandler.ACTION, "Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$Action;", "bannerTitle", "<init>", "(Lau/com/woolworths/shop/graphql/type/InsetBannerDisplayType;Ljava/lang/String;Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$Action;Ljava/lang/String;)V", "getDisplayType", "()Lau/com/woolworths/shop/graphql/type/InsetBannerDisplayType;", "getMessage", "()Ljava/lang/String;", "getIconUrl", "getAction", "()Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$Action;", "getBannerTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Banner {
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

        public Banner(@NotNull InsetBannerDisplayType displayType, @NotNull String message, @Nullable String str, @Nullable Action action, @Nullable String str2) {
            Intrinsics.h(displayType, "displayType");
            Intrinsics.h(message, "message");
            this.displayType = displayType;
            this.message = message;
            this.iconUrl = str;
            this.action = action;
            this.bannerTitle = str2;
        }

        public static /* synthetic */ Banner copy$default(Banner banner, InsetBannerDisplayType insetBannerDisplayType, String str, String str2, Action action, String str3, int i, Object obj) {
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
                action = banner.action;
            }
            if ((i & 16) != 0) {
                str3 = banner.bannerTitle;
            }
            String str4 = str3;
            String str5 = str2;
            return banner.copy(insetBannerDisplayType, str, str5, action, str4);
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
        public final Action getAction() {
            return this.action;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final String getBannerTitle() {
            return this.bannerTitle;
        }

        @NotNull
        public final Banner copy(@NotNull InsetBannerDisplayType displayType, @NotNull String message, @Nullable String iconUrl, @Nullable Action action, @Nullable String bannerTitle) {
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
            String str = this.iconUrl;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            Action action = this.action;
            int iHashCode2 = (iHashCode + (action == null ? 0 : action.hashCode())) * 31;
            String str2 = this.bannerTitle;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            InsetBannerDisplayType insetBannerDisplayType = this.displayType;
            String str = this.message;
            String str2 = this.iconUrl;
            Action action = this.action;
            String str3 = this.bannerTitle;
            StringBuilder sbU = d.u("Banner(displayType=", insetBannerDisplayType, ", message=", str, ", iconUrl=");
            sbU.append(str2);
            sbU.append(", action=");
            sbU.append(action);
            sbU.append(", bannerTitle=");
            return YU.a.o(sbU, str3, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$Companion;", "", "<init>", "()V", "OPERATION_ID", "", "OPERATION_DOCUMENT", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_NAME", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getOPERATION_DOCUMENT() {
            return "query productsByPastShop($storeId: String, $basketId: ID, $pageNumber: Int, $pageSize: Int, $fetchActionableCard: Boolean!, $includeProductAvailabilityStates: Boolean!, $includeOfferMinimumSpend: Boolean!, $includeUnitPriceInsetBanner: Boolean!, $includeAvailabilityInfoStatus: Boolean! = false , $includePricingFootnote: Boolean! = false , $includeLowestPrice14Days: Boolean!) { purchaseHistory(storeId: $storeId, basketID: $basketId, pageSize: $pageSize, pageNumber: $pageNumber) { totalNumberOfProducts nextPage productsFeed { __typename ... on ActionableCard @include(if: $fetchActionableCard) { image altText cardHeight link analytics _excluded } ... on ProductCard { __typename ...productCard } ... on ImageTextBanner { imageUrl message } } filters { headerKey headerTitle filterItems { key title label parentKey hasChildren isApplied } banner { displayType message iconUrl action { placement type label url } bannerTitle: title } } sortOptions { key title subtitle isApplied } sortOptionsBanner @include(if: $includeUnitPriceInsetBanner) { __typename ...insetBanner } } }  fragment productTrolley on ProductTrolley { minimum maximum increment defaultValue: default unit inTrolley buttonState buttonLabel buttonQuantity title }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment productCard on ProductCard { productId name isNew purchaseRestriction productImage isAvailable inStoreAvailabilityInfo @include(if: $includeProductAvailabilityStates) { button { label action style enabled } status @include(if: $includeAvailabilityInfoStatus) infoSheet { title message button { label action style enabled } } } price unitOfMeasureLabel badgeImage promotionInfo { type label } unitPriceDescription wasPrice purchaseWarning inlineLabels { type label priority } trolley { __typename ...productTrolley } trolleys { __typename ...productTrolley } list { minimum maximum increment defaultValue: default unit } inStoreDetails { locationText locationType } inStoreLocation { details { aisleNumber aisleSide bayNumber bayNumberAlternate floorNumber location x y z } displayInfo { locationText locationType } } adId source marketplace { imageUrl title sellerName brandName lowestMarketPriceDescription @include(if: $includeLowestPrice14Days) } rewardsOfferInfo { offerId offerStatus displayStatus displayExpiry minimumSpend @include(if: $includeOfferMinimumSpend) offerAnalytics { offerName campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode } boostButton { label style enabled } } disclaimer tagLabel { text style } productVarieties { totalCount label priceFamilyId } categories { name categoryLevel } isTobacco memberPriceInfo { header title subtitle } multiBuyPriceInfo { price unitPrice } cartProductInfo { totalPrice totalOriginalPrice totalDiscount } productCardAnalytics { __typename ...analyticsFields } productCardAction { action type id analytics { __typename ...analyticsFields } } pricingFootnoteMd @include(if: $includePricingFootnote) }  fragment insetBanner on InsetBanner { displayType message bannerTitle: title iconUrl action { placement type label url } }";
        }

        private Companion() {
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "purchaseHistory", "Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$PurchaseHistory;", "<init>", "(Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$PurchaseHistory;)V", "getPurchaseHistory", "()Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$PurchaseHistory;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {
        public static final int $stable = 8;

        @Nullable
        private final PurchaseHistory purchaseHistory;

        public Data(@Nullable PurchaseHistory purchaseHistory) {
            this.purchaseHistory = purchaseHistory;
        }

        public static /* synthetic */ Data copy$default(Data data, PurchaseHistory purchaseHistory, int i, Object obj) {
            if ((i & 1) != 0) {
                purchaseHistory = data.purchaseHistory;
            }
            return data.copy(purchaseHistory);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final PurchaseHistory getPurchaseHistory() {
            return this.purchaseHistory;
        }

        @NotNull
        public final Data copy(@Nullable PurchaseHistory purchaseHistory) {
            return new Data(purchaseHistory);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Data) && Intrinsics.c(this.purchaseHistory, ((Data) other).purchaseHistory);
        }

        @Nullable
        public final PurchaseHistory getPurchaseHistory() {
            return this.purchaseHistory;
        }

        public int hashCode() {
            PurchaseHistory purchaseHistory = this.purchaseHistory;
            if (purchaseHistory == null) {
                return 0;
            }
            return purchaseHistory.hashCode();
        }

        @NotNull
        public String toString() {
            return "Data(purchaseHistory=" + this.purchaseHistory + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$Filter;", "", "headerKey", "", "headerTitle", "filterItems", "", "Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$FilterItem;", "banner", "Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$Banner;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$Banner;)V", "getHeaderKey", "()Ljava/lang/String;", "getHeaderTitle", "getFilterItems", "()Ljava/util/List;", "getBanner", "()Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$Banner;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003JG\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$FilterItem;", "", "key", "", "title", AnnotatedPrivateKey.LABEL, "parentKey", "hasChildren", "", "isApplied", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getKey", "()Ljava/lang/String;", "getTitle", "getLabel", "getParentKey", "getHasChildren", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0017JN\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$OnActionableCard;", "", "image", "", "altText", "cardHeight", "Lau/com/woolworths/shop/graphql/type/CardHeight;", "link", "analytics", "Lau/com/woolworths/analytics/graphql/TealiumAnalytics;", "_excluded", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/shop/graphql/type/CardHeight;Ljava/lang/String;Lau/com/woolworths/analytics/graphql/TealiumAnalytics;Ljava/lang/Boolean;)V", "getImage", "()Ljava/lang/String;", "getAltText", "getCardHeight", "()Lau/com/woolworths/shop/graphql/type/CardHeight;", "getLink", "getAnalytics", "()Lau/com/woolworths/analytics/graphql/TealiumAnalytics;", "get_excluded", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/shop/graphql/type/CardHeight;Ljava/lang/String;Lau/com/woolworths/analytics/graphql/TealiumAnalytics;Ljava/lang/Boolean;)Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$OnActionableCard;", "equals", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$OnImageTextBanner;", "", "imageUrl", "", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getImageUrl", "()Ljava/lang/String;", "getMessage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnImageTextBanner {
        public static final int $stable = 0;

        @NotNull
        private final String imageUrl;

        @NotNull
        private final String message;

        public OnImageTextBanner(@NotNull String imageUrl, @NotNull String message) {
            Intrinsics.h(imageUrl, "imageUrl");
            Intrinsics.h(message, "message");
            this.imageUrl = imageUrl;
            this.message = message;
        }

        public static /* synthetic */ OnImageTextBanner copy$default(OnImageTextBanner onImageTextBanner, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onImageTextBanner.imageUrl;
            }
            if ((i & 2) != 0) {
                str2 = onImageTextBanner.message;
            }
            return onImageTextBanner.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final OnImageTextBanner copy(@NotNull String imageUrl, @NotNull String message) {
            Intrinsics.h(imageUrl, "imageUrl");
            Intrinsics.h(message, "message");
            return new OnImageTextBanner(imageUrl, message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnImageTextBanner)) {
                return false;
            }
            OnImageTextBanner onImageTextBanner = (OnImageTextBanner) other;
            return Intrinsics.c(this.imageUrl, onImageTextBanner.imageUrl) && Intrinsics.c(this.message, onImageTextBanner.message);
        }

        @NotNull
        public final String getImageUrl() {
            return this.imageUrl;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode() + (this.imageUrl.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return YU.a.j("OnImageTextBanner(imageUrl=", this.imageUrl, ", message=", this.message, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$OnProductCard;", "", "__typename", "", "productCard", "Lau/com/woolworths/graphql/common/fragment/ProductCard;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/graphql/common/fragment/ProductCard;)V", "get__typename", "()Ljava/lang/String;", "getProductCard", "()Lau/com/woolworths/graphql/common/fragment/ProductCard;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$ProductsFeed;", "", "__typename", "", "onActionableCard", "Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$OnActionableCard;", "onProductCard", "Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$OnProductCard;", "onImageTextBanner", "Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$OnImageTextBanner;", "<init>", "(Ljava/lang/String;Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$OnActionableCard;Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$OnProductCard;Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$OnImageTextBanner;)V", "get__typename", "()Ljava/lang/String;", "getOnActionableCard", "()Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$OnActionableCard;", "getOnProductCard", "()Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$OnProductCard;", "getOnImageTextBanner", "()Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$OnImageTextBanner;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductsFeed {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @Nullable
        private final OnActionableCard onActionableCard;

        @Nullable
        private final OnImageTextBanner onImageTextBanner;

        @Nullable
        private final OnProductCard onProductCard;

        public ProductsFeed(@NotNull String __typename, @Nullable OnActionableCard onActionableCard, @Nullable OnProductCard onProductCard, @Nullable OnImageTextBanner onImageTextBanner) {
            Intrinsics.h(__typename, "__typename");
            this.__typename = __typename;
            this.onActionableCard = onActionableCard;
            this.onProductCard = onProductCard;
            this.onImageTextBanner = onImageTextBanner;
        }

        public static /* synthetic */ ProductsFeed copy$default(ProductsFeed productsFeed, String str, OnActionableCard onActionableCard, OnProductCard onProductCard, OnImageTextBanner onImageTextBanner, int i, Object obj) {
            if ((i & 1) != 0) {
                str = productsFeed.__typename;
            }
            if ((i & 2) != 0) {
                onActionableCard = productsFeed.onActionableCard;
            }
            if ((i & 4) != 0) {
                onProductCard = productsFeed.onProductCard;
            }
            if ((i & 8) != 0) {
                onImageTextBanner = productsFeed.onImageTextBanner;
            }
            return productsFeed.copy(str, onActionableCard, onProductCard, onImageTextBanner);
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
        public final OnProductCard getOnProductCard() {
            return this.onProductCard;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final OnImageTextBanner getOnImageTextBanner() {
            return this.onImageTextBanner;
        }

        @NotNull
        public final ProductsFeed copy(@NotNull String __typename, @Nullable OnActionableCard onActionableCard, @Nullable OnProductCard onProductCard, @Nullable OnImageTextBanner onImageTextBanner) {
            Intrinsics.h(__typename, "__typename");
            return new ProductsFeed(__typename, onActionableCard, onProductCard, onImageTextBanner);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductsFeed)) {
                return false;
            }
            ProductsFeed productsFeed = (ProductsFeed) other;
            return Intrinsics.c(this.__typename, productsFeed.__typename) && Intrinsics.c(this.onActionableCard, productsFeed.onActionableCard) && Intrinsics.c(this.onProductCard, productsFeed.onProductCard) && Intrinsics.c(this.onImageTextBanner, productsFeed.onImageTextBanner);
        }

        @Nullable
        public final OnActionableCard getOnActionableCard() {
            return this.onActionableCard;
        }

        @Nullable
        public final OnImageTextBanner getOnImageTextBanner() {
            return this.onImageTextBanner;
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
            OnActionableCard onActionableCard = this.onActionableCard;
            int iHashCode2 = (iHashCode + (onActionableCard == null ? 0 : onActionableCard.hashCode())) * 31;
            OnProductCard onProductCard = this.onProductCard;
            int iHashCode3 = (iHashCode2 + (onProductCard == null ? 0 : onProductCard.hashCode())) * 31;
            OnImageTextBanner onImageTextBanner = this.onImageTextBanner;
            return iHashCode3 + (onImageTextBanner != null ? onImageTextBanner.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ProductsFeed(__typename=" + this.__typename + ", onActionableCard=" + this.onActionableCard + ", onProductCard=" + this.onProductCard + ", onImageTextBanner=" + this.onImageTextBanner + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\rHÆ\u0003Jb\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$PurchaseHistory;", "", "totalNumberOfProducts", "", "nextPage", "productsFeed", "", "Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$ProductsFeed;", "filters", "Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$Filter;", "sortOptions", "Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$SortOption;", "sortOptionsBanner", "Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$SortOptionsBanner;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$SortOptionsBanner;)V", "getTotalNumberOfProducts", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNextPage", "getProductsFeed", "()Ljava/util/List;", "getFilters", "getSortOptions", "getSortOptionsBanner", "()Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$SortOptionsBanner;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$SortOptionsBanner;)Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$PurchaseHistory;", "equals", "", "other", "hashCode", "toString", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PurchaseHistory {
        public static final int $stable = 8;

        @NotNull
        private final List<Filter> filters;

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

        public PurchaseHistory(@Nullable Integer num, @Nullable Integer num2, @NotNull List<ProductsFeed> productsFeed, @NotNull List<Filter> filters, @NotNull List<SortOption> sortOptions, @Nullable SortOptionsBanner sortOptionsBanner) {
            Intrinsics.h(productsFeed, "productsFeed");
            Intrinsics.h(filters, "filters");
            Intrinsics.h(sortOptions, "sortOptions");
            this.totalNumberOfProducts = num;
            this.nextPage = num2;
            this.productsFeed = productsFeed;
            this.filters = filters;
            this.sortOptions = sortOptions;
            this.sortOptionsBanner = sortOptionsBanner;
        }

        public static /* synthetic */ PurchaseHistory copy$default(PurchaseHistory purchaseHistory, Integer num, Integer num2, List list, List list2, List list3, SortOptionsBanner sortOptionsBanner, int i, Object obj) {
            if ((i & 1) != 0) {
                num = purchaseHistory.totalNumberOfProducts;
            }
            if ((i & 2) != 0) {
                num2 = purchaseHistory.nextPage;
            }
            if ((i & 4) != 0) {
                list = purchaseHistory.productsFeed;
            }
            if ((i & 8) != 0) {
                list2 = purchaseHistory.filters;
            }
            if ((i & 16) != 0) {
                list3 = purchaseHistory.sortOptions;
            }
            if ((i & 32) != 0) {
                sortOptionsBanner = purchaseHistory.sortOptionsBanner;
            }
            List list4 = list3;
            SortOptionsBanner sortOptionsBanner2 = sortOptionsBanner;
            return purchaseHistory.copy(num, num2, list, list2, list4, sortOptionsBanner2);
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
        public final List<ProductsFeed> component3() {
            return this.productsFeed;
        }

        @NotNull
        public final List<Filter> component4() {
            return this.filters;
        }

        @NotNull
        public final List<SortOption> component5() {
            return this.sortOptions;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final SortOptionsBanner getSortOptionsBanner() {
            return this.sortOptionsBanner;
        }

        @NotNull
        public final PurchaseHistory copy(@Nullable Integer totalNumberOfProducts, @Nullable Integer nextPage, @NotNull List<ProductsFeed> productsFeed, @NotNull List<Filter> filters, @NotNull List<SortOption> sortOptions, @Nullable SortOptionsBanner sortOptionsBanner) {
            Intrinsics.h(productsFeed, "productsFeed");
            Intrinsics.h(filters, "filters");
            Intrinsics.h(sortOptions, "sortOptions");
            return new PurchaseHistory(totalNumberOfProducts, nextPage, productsFeed, filters, sortOptions, sortOptionsBanner);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PurchaseHistory)) {
                return false;
            }
            PurchaseHistory purchaseHistory = (PurchaseHistory) other;
            return Intrinsics.c(this.totalNumberOfProducts, purchaseHistory.totalNumberOfProducts) && Intrinsics.c(this.nextPage, purchaseHistory.nextPage) && Intrinsics.c(this.productsFeed, purchaseHistory.productsFeed) && Intrinsics.c(this.filters, purchaseHistory.filters) && Intrinsics.c(this.sortOptions, purchaseHistory.sortOptions) && Intrinsics.c(this.sortOptionsBanner, purchaseHistory.sortOptionsBanner);
        }

        @NotNull
        public final List<Filter> getFilters() {
            return this.filters;
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

        public int hashCode() {
            Integer num = this.totalNumberOfProducts;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.nextPage;
            int iD = b.d(b.d(b.d((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.productsFeed), 31, this.filters), 31, this.sortOptions);
            SortOptionsBanner sortOptionsBanner = this.sortOptionsBanner;
            return iD + (sortOptionsBanner != null ? sortOptionsBanner.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Integer num = this.totalNumberOfProducts;
            Integer num2 = this.nextPage;
            List<ProductsFeed> list = this.productsFeed;
            List<Filter> list2 = this.filters;
            List<SortOption> list3 = this.sortOptions;
            SortOptionsBanner sortOptionsBanner = this.sortOptionsBanner;
            StringBuilder sbV = d.v("PurchaseHistory(totalNumberOfProducts=", num, ", nextPage=", num2, ", productsFeed=");
            au.com.woolworths.android.onesite.a.C(sbV, list, ", filters=", list2, ", sortOptions=");
            sbV.append(list3);
            sbV.append(", sortOptionsBanner=");
            sbV.append(sortOptionsBanner);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$SortOption;", "", "key", "", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "isApplied", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getKey", "()Ljava/lang/String;", "getTitle", "getSubtitle", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/ProductsByPastShopQuery$SortOptionsBanner;", "", "__typename", "", "insetBanner", "Lcom/woolworths/product/list/legacy/fragment/InsetBanner;", "<init>", "(Ljava/lang/String;Lcom/woolworths/product/list/legacy/fragment/InsetBanner;)V", "get__typename", "()Ljava/lang/String;", "getInsetBanner", "()Lcom/woolworths/product/list/legacy/fragment/InsetBanner;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    public ProductsByPastShopQuery(@NotNull Optional<String> storeId, @NotNull Optional<String> basketId, @NotNull Optional<Integer> pageNumber, @NotNull Optional<Integer> pageSize, boolean z, boolean z2, boolean z3, boolean z4, @NotNull Optional<Boolean> includeAvailabilityInfoStatus, @NotNull Optional<Boolean> includePricingFootnote, boolean z5) {
        Intrinsics.h(storeId, "storeId");
        Intrinsics.h(basketId, "basketId");
        Intrinsics.h(pageNumber, "pageNumber");
        Intrinsics.h(pageSize, "pageSize");
        Intrinsics.h(includeAvailabilityInfoStatus, "includeAvailabilityInfoStatus");
        Intrinsics.h(includePricingFootnote, "includePricingFootnote");
        this.storeId = storeId;
        this.basketId = basketId;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.fetchActionableCard = z;
        this.includeProductAvailabilityStates = z2;
        this.includeOfferMinimumSpend = z3;
        this.includeUnitPriceInsetBanner = z4;
        this.includeAvailabilityInfoStatus = includeAvailabilityInfoStatus;
        this.includePricingFootnote = includePricingFootnote;
        this.includeLowestPrice14Days = z5;
    }

    public static /* synthetic */ ProductsByPastShopQuery copy$default(ProductsByPastShopQuery productsByPastShopQuery, Optional optional, Optional optional2, Optional optional3, Optional optional4, boolean z, boolean z2, boolean z3, boolean z4, Optional optional5, Optional optional6, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            optional = productsByPastShopQuery.storeId;
        }
        if ((i & 2) != 0) {
            optional2 = productsByPastShopQuery.basketId;
        }
        if ((i & 4) != 0) {
            optional3 = productsByPastShopQuery.pageNumber;
        }
        if ((i & 8) != 0) {
            optional4 = productsByPastShopQuery.pageSize;
        }
        if ((i & 16) != 0) {
            z = productsByPastShopQuery.fetchActionableCard;
        }
        if ((i & 32) != 0) {
            z2 = productsByPastShopQuery.includeProductAvailabilityStates;
        }
        if ((i & 64) != 0) {
            z3 = productsByPastShopQuery.includeOfferMinimumSpend;
        }
        if ((i & 128) != 0) {
            z4 = productsByPastShopQuery.includeUnitPriceInsetBanner;
        }
        if ((i & 256) != 0) {
            optional5 = productsByPastShopQuery.includeAvailabilityInfoStatus;
        }
        if ((i & 512) != 0) {
            optional6 = productsByPastShopQuery.includePricingFootnote;
        }
        if ((i & 1024) != 0) {
            z5 = productsByPastShopQuery.includeLowestPrice14Days;
        }
        Optional optional7 = optional6;
        boolean z6 = z5;
        boolean z7 = z4;
        Optional optional8 = optional5;
        boolean z8 = z2;
        boolean z9 = z3;
        boolean z10 = z;
        Optional optional9 = optional3;
        return productsByPastShopQuery.copy(optional, optional2, optional9, optional4, z10, z8, z9, z7, optional8, optional7, z6);
    }

    @Override // com.apollographql.apollo.api.Executable
    @NotNull
    public Adapter<Data> adapter() {
        return Adapters.c(ProductsByPastShopQuery_ResponseAdapter.Data.INSTANCE, false);
    }

    @NotNull
    public final Optional<String> component1() {
        return this.storeId;
    }

    @NotNull
    public final Optional<Boolean> component10() {
        return this.includePricingFootnote;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIncludeLowestPrice14Days() {
        return this.includeLowestPrice14Days;
    }

    @NotNull
    public final Optional<String> component2() {
        return this.basketId;
    }

    @NotNull
    public final Optional<Integer> component3() {
        return this.pageNumber;
    }

    @NotNull
    public final Optional<Integer> component4() {
        return this.pageSize;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getFetchActionableCard() {
        return this.fetchActionableCard;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIncludeProductAvailabilityStates() {
        return this.includeProductAvailabilityStates;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIncludeOfferMinimumSpend() {
        return this.includeOfferMinimumSpend;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIncludeUnitPriceInsetBanner() {
        return this.includeUnitPriceInsetBanner;
    }

    @NotNull
    public final Optional<Boolean> component9() {
        return this.includeAvailabilityInfoStatus;
    }

    @NotNull
    public final ProductsByPastShopQuery copy(@NotNull Optional<String> storeId, @NotNull Optional<String> basketId, @NotNull Optional<Integer> pageNumber, @NotNull Optional<Integer> pageSize, boolean fetchActionableCard, boolean includeProductAvailabilityStates, boolean includeOfferMinimumSpend, boolean includeUnitPriceInsetBanner, @NotNull Optional<Boolean> includeAvailabilityInfoStatus, @NotNull Optional<Boolean> includePricingFootnote, boolean includeLowestPrice14Days) {
        Intrinsics.h(storeId, "storeId");
        Intrinsics.h(basketId, "basketId");
        Intrinsics.h(pageNumber, "pageNumber");
        Intrinsics.h(pageSize, "pageSize");
        Intrinsics.h(includeAvailabilityInfoStatus, "includeAvailabilityInfoStatus");
        Intrinsics.h(includePricingFootnote, "includePricingFootnote");
        return new ProductsByPastShopQuery(storeId, basketId, pageNumber, pageSize, fetchActionableCard, includeProductAvailabilityStates, includeOfferMinimumSpend, includeUnitPriceInsetBanner, includeAvailabilityInfoStatus, includePricingFootnote, includeLowestPrice14Days);
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
        if (!(other instanceof ProductsByPastShopQuery)) {
            return false;
        }
        ProductsByPastShopQuery productsByPastShopQuery = (ProductsByPastShopQuery) other;
        return Intrinsics.c(this.storeId, productsByPastShopQuery.storeId) && Intrinsics.c(this.basketId, productsByPastShopQuery.basketId) && Intrinsics.c(this.pageNumber, productsByPastShopQuery.pageNumber) && Intrinsics.c(this.pageSize, productsByPastShopQuery.pageSize) && this.fetchActionableCard == productsByPastShopQuery.fetchActionableCard && this.includeProductAvailabilityStates == productsByPastShopQuery.includeProductAvailabilityStates && this.includeOfferMinimumSpend == productsByPastShopQuery.includeOfferMinimumSpend && this.includeUnitPriceInsetBanner == productsByPastShopQuery.includeUnitPriceInsetBanner && Intrinsics.c(this.includeAvailabilityInfoStatus, productsByPastShopQuery.includeAvailabilityInfoStatus) && Intrinsics.c(this.includePricingFootnote, productsByPastShopQuery.includePricingFootnote) && this.includeLowestPrice14Days == productsByPastShopQuery.includeLowestPrice14Days;
    }

    @NotNull
    public final Optional<String> getBasketId() {
        return this.basketId;
    }

    public final boolean getFetchActionableCard() {
        return this.fetchActionableCard;
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

    public final boolean getIncludeUnitPriceInsetBanner() {
        return this.includeUnitPriceInsetBanner;
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
        return Boolean.hashCode(this.includeLowestPrice14Days) + au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.includePricingFootnote, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.includeAvailabilityInfoStatus, b.e(b.e(b.e(b.e(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.pageSize, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.pageNumber, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.basketId, this.storeId.hashCode() * 31, 31), 31), 31), 31, this.fetchActionableCard), 31, this.includeProductAvailabilityStates), 31, this.includeOfferMinimumSpend), 31, this.includeUnitPriceInsetBanner), 31), 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    @NotNull
    public String id() {
        return "d538dc57b3fb9edc39f03dfcdbed1ae18663665ace545c07ef2dfca926ec6e88";
    }

    @Override // com.apollographql.apollo.api.Operation
    @NotNull
    public String name() {
        return "productsByPastShop";
    }

    @NotNull
    public CompiledField rootField() {
        CompiledField.Builder builder = new CompiledField.Builder("data", au.com.woolworths.shop.graphql.type.Query.H2);
        builder.e(ProductsByPastShopQuerySelections.INSTANCE.get__root());
        return builder.c();
    }

    @Override // com.apollographql.apollo.api.Executable
    public void serializeVariables(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        ProductsByPastShopQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @NotNull
    public String toString() {
        Optional<String> optional = this.storeId;
        Optional<String> optional2 = this.basketId;
        Optional<Integer> optional3 = this.pageNumber;
        Optional<Integer> optional4 = this.pageSize;
        boolean z = this.fetchActionableCard;
        boolean z2 = this.includeProductAvailabilityStates;
        boolean z3 = this.includeOfferMinimumSpend;
        boolean z4 = this.includeUnitPriceInsetBanner;
        Optional<Boolean> optional5 = this.includeAvailabilityInfoStatus;
        Optional<Boolean> optional6 = this.includePricingFootnote;
        boolean z5 = this.includeLowestPrice14Days;
        StringBuilder sbP = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.p("ProductsByPastShopQuery(storeId=", optional, ", basketId=", optional2, ", pageNumber=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sbP, optional3, ", pageSize=", optional4, ", fetchActionableCard=");
        au.com.woolworths.android.onesite.a.D(sbP, z, ", includeProductAvailabilityStates=", z2, ", includeOfferMinimumSpend=");
        au.com.woolworths.android.onesite.a.D(sbP, z3, ", includeUnitPriceInsetBanner=", z4, ", includeAvailabilityInfoStatus=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sbP, optional5, ", includePricingFootnote=", optional6, ", includeLowestPrice14Days=");
        return YU.a.k(")", sbP, z5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ProductsByPastShopQuery(Optional optional, Optional optional2, Optional optional3, Optional optional4, boolean z, boolean z2, boolean z3, boolean z4, Optional optional5, Optional optional6, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z6;
        Optional optional7;
        int i2 = i & 1;
        Optional.Absent absent = Optional.Absent.f13523a;
        optional = i2 != 0 ? absent : optional;
        optional2 = (i & 2) != 0 ? absent : optional2;
        optional3 = (i & 4) != 0 ? absent : optional3;
        optional4 = (i & 8) != 0 ? absent : optional4;
        optional5 = (i & 256) != 0 ? absent : optional5;
        if ((i & 512) != 0) {
            z6 = z5;
            optional7 = absent;
        } else {
            z6 = z5;
            optional7 = optional6;
        }
        this(optional, optional2, optional3, optional4, z, z2, z3, z4, optional5, optional7, z6);
    }
}
