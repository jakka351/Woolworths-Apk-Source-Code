package com.woolworths.product.list.legacy.fragment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.apollographql.apollo.api.Fragment;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u0017\u0018\u0019\u001aB#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/woolworths/product/list/legacy/fragment/ProductListOptions;", "Lcom/apollographql/apollo/api/Fragment$Data;", "filters", "", "Lcom/woolworths/product/list/legacy/fragment/ProductListOptions$Filter;", "sortOptions", "Lcom/woolworths/product/list/legacy/fragment/ProductListOptions$SortOption;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getFilters", "()Ljava/util/List;", "getSortOptions", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Filter", "SortOption", "FilterItem", "Banner", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ProductListOptions implements Fragment.Data {
    public static final int $stable = 8;

    @NotNull
    private final List<Filter> filters;

    @NotNull
    private final List<SortOption> sortOptions;

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/legacy/fragment/ProductListOptions$Banner;", "", "__typename", "", "insetBanner", "Lcom/woolworths/product/list/legacy/fragment/InsetBanner;", "<init>", "(Ljava/lang/String;Lcom/woolworths/product/list/legacy/fragment/InsetBanner;)V", "get__typename", "()Ljava/lang/String;", "getInsetBanner", "()Lcom/woolworths/product/list/legacy/fragment/InsetBanner;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Banner {
        public static final int $stable = 0;

        @NotNull
        private final String __typename;

        @NotNull
        private final InsetBanner insetBanner;

        public Banner(@NotNull String __typename, @NotNull InsetBanner insetBanner) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(insetBanner, "insetBanner");
            this.__typename = __typename;
            this.insetBanner = insetBanner;
        }

        public static /* synthetic */ Banner copy$default(Banner banner, String str, InsetBanner insetBanner, int i, Object obj) {
            if ((i & 1) != 0) {
                str = banner.__typename;
            }
            if ((i & 2) != 0) {
                insetBanner = banner.insetBanner;
            }
            return banner.copy(str, insetBanner);
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
        public final Banner copy(@NotNull String __typename, @NotNull InsetBanner insetBanner) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(insetBanner, "insetBanner");
            return new Banner(__typename, insetBanner);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Banner)) {
                return false;
            }
            Banner banner = (Banner) other;
            return Intrinsics.c(this.__typename, banner.__typename) && Intrinsics.c(this.insetBanner, banner.insetBanner);
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
            return "Banner(__typename=" + this.__typename + ", insetBanner=" + this.insetBanner + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/woolworths/product/list/legacy/fragment/ProductListOptions$Filter;", "", "headerKey", "", "headerTitle", "filterItems", "", "Lcom/woolworths/product/list/legacy/fragment/ProductListOptions$FilterItem;", "banner", "Lcom/woolworths/product/list/legacy/fragment/ProductListOptions$Banner;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/woolworths/product/list/legacy/fragment/ProductListOptions$Banner;)V", "getHeaderKey", "()Ljava/lang/String;", "getHeaderTitle", "getFilterItems", "()Ljava/util/List;", "getBanner", "()Lcom/woolworths/product/list/legacy/fragment/ProductListOptions$Banner;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
            StringBuilder sbV = a.v("Filter(headerKey=", str, ", headerTitle=", str2, ", filterItems=");
            sbV.append(list);
            sbV.append(", banner=");
            sbV.append(banner);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003JG\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/woolworths/product/list/legacy/fragment/ProductListOptions$FilterItem;", "", "key", "", "title", AnnotatedPrivateKey.LABEL, "parentKey", "hasChildren", "", "isApplied", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getKey", "()Ljava/lang/String;", "getTitle", "getLabel", "getParentKey", "getHasChildren", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
            StringBuilder sbV = a.v("FilterItem(key=", str, ", title=", str2, ", label=");
            androidx.constraintlayout.core.state.a.B(sbV, str3, ", parentKey=", str4, ", hasChildren=");
            return au.com.woolworths.android.onesite.a.q(sbV, z, ", isApplied=", z2, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/woolworths/product/list/legacy/fragment/ProductListOptions$SortOption;", "", "key", "", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "isApplied", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getKey", "()Ljava/lang/String;", "getTitle", "getSubtitle", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
            return d.r(this.subtitle, ", isApplied=", ")", a.v("SortOption(key=", str, ", title=", str2, ", subtitle="), this.isApplied);
        }
    }

    public ProductListOptions(@NotNull List<Filter> filters, @NotNull List<SortOption> sortOptions) {
        Intrinsics.h(filters, "filters");
        Intrinsics.h(sortOptions, "sortOptions");
        this.filters = filters;
        this.sortOptions = sortOptions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductListOptions copy$default(ProductListOptions productListOptions, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = productListOptions.filters;
        }
        if ((i & 2) != 0) {
            list2 = productListOptions.sortOptions;
        }
        return productListOptions.copy(list, list2);
    }

    @NotNull
    public final List<Filter> component1() {
        return this.filters;
    }

    @NotNull
    public final List<SortOption> component2() {
        return this.sortOptions;
    }

    @NotNull
    public final ProductListOptions copy(@NotNull List<Filter> filters, @NotNull List<SortOption> sortOptions) {
        Intrinsics.h(filters, "filters");
        Intrinsics.h(sortOptions, "sortOptions");
        return new ProductListOptions(filters, sortOptions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductListOptions)) {
            return false;
        }
        ProductListOptions productListOptions = (ProductListOptions) other;
        return Intrinsics.c(this.filters, productListOptions.filters) && Intrinsics.c(this.sortOptions, productListOptions.sortOptions);
    }

    @NotNull
    public final List<Filter> getFilters() {
        return this.filters;
    }

    @NotNull
    public final List<SortOption> getSortOptions() {
        return this.sortOptions;
    }

    public int hashCode() {
        return this.sortOptions.hashCode() + (this.filters.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ProductListOptions(filters=" + this.filters + ", sortOptions=" + this.sortOptions + ")";
    }
}
