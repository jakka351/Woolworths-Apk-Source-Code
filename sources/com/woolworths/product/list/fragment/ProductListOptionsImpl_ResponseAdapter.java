package com.woolworths.product.list.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.woolworths.product.list.fragment.InsetBannerImpl_ResponseAdapter;
import com.woolworths.product.list.fragment.ProductListOptions;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"Lcom/woolworths/product/list/fragment/ProductListOptionsImpl_ResponseAdapter;", "", "<init>", "()V", "ProductListOptions", "Filter", "FilterItem", "Banner", "SortOption", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProductListOptionsImpl_ResponseAdapter {
    public static final int $stable = 0;

    @NotNull
    public static final ProductListOptionsImpl_ResponseAdapter INSTANCE = new ProductListOptionsImpl_ResponseAdapter();

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/fragment/ProductListOptionsImpl_ResponseAdapter$Banner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/fragment/ProductListOptions$Banner;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Banner implements Adapter<ProductListOptions.Banner> {

        @NotNull
        public static final Banner INSTANCE = new Banner();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q("__typename");
        public static final int $stable = 8;

        private Banner() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductListOptions.Banner fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            InsetBanner insetBannerFromJson = InsetBannerImpl_ResponseAdapter.InsetBanner.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new ProductListOptions.Banner(str, insetBannerFromJson);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductListOptions.Banner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.get__typename());
            InsetBannerImpl_ResponseAdapter.InsetBanner.INSTANCE.toJson(writer, customScalarAdapters, value.getInsetBanner());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/fragment/ProductListOptionsImpl_ResponseAdapter$Filter;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/fragment/ProductListOptions$Filter;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Filter implements Adapter<ProductListOptions.Filter> {

        @NotNull
        public static final Filter INSTANCE = new Filter();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("headerKey", "headerTitle", "filterItems", "banner");
        public static final int $stable = 8;

        private Filter() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductListOptions.Filter fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            ProductListOptions.Banner banner = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    arrayListFromJson = Adapters.a(Adapters.c(FilterItem.INSTANCE, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    banner = (ProductListOptions.Banner) Adapters.b(Adapters.c(Banner.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "headerKey");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "headerTitle");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new ProductListOptions.Filter(str, str2, arrayListFromJson, banner);
            }
            Assertions.a(reader, "filterItems");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductListOptions.Filter value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("headerKey");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getHeaderKey());
            writer.F1("headerTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getHeaderTitle());
            writer.F1("filterItems");
            Adapters.a(Adapters.c(FilterItem.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getFilterItems());
            writer.F1("banner");
            Adapters.b(Adapters.c(Banner.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getBanner());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/fragment/ProductListOptionsImpl_ResponseAdapter$FilterItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/fragment/ProductListOptions$FilterItem;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FilterItem implements Adapter<ProductListOptions.FilterItem> {

        @NotNull
        public static final FilterItem INSTANCE = new FilterItem();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("key", "title", AnnotatedPrivateKey.LABEL, "parentKey", "hasChildren", "isApplied");
        public static final int $stable = 8;

        private FilterItem() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductListOptions.FilterItem fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Boolean bool3 = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    bool = bool2;
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = bool2;
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    bool = bool2;
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    bool = bool2;
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    bool = bool2;
                    bool3 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
                bool2 = bool;
            }
            Boolean bool4 = bool2;
            if (str == null) {
                Assertions.a(reader, "key");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool4 == null) {
                Assertions.a(reader, "hasChildren");
                throw null;
            }
            Boolean bool5 = bool3;
            boolean zBooleanValue = bool4.booleanValue();
            if (bool5 != null) {
                return new ProductListOptions.FilterItem(str, str2, str3, str4, zBooleanValue, bool5.booleanValue());
            }
            Assertions.a(reader, "isApplied");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductListOptions.FilterItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("key");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getKey());
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getTitle());
            writer.F1(AnnotatedPrivateKey.LABEL);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getLabel());
            writer.F1("parentKey");
            Adapters.i.toJson(writer, customScalarAdapters, value.getParentKey());
            writer.F1("hasChildren");
            Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
            adapters$BooleanAdapter$1.toJson(writer, customScalarAdapters, Boolean.valueOf(value.getHasChildren()));
            writer.F1("isApplied");
            adapters$BooleanAdapter$1.toJson(writer, customScalarAdapters, Boolean.valueOf(value.isApplied()));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/fragment/ProductListOptionsImpl_ResponseAdapter$ProductListOptions;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/fragment/ProductListOptions;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductListOptions implements Adapter<com.woolworths.product.list.fragment.ProductListOptions> {

        @NotNull
        public static final ProductListOptions INSTANCE = new ProductListOptions();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("filters", "sortOptions");
        public static final int $stable = 8;

        private ProductListOptions() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public com.woolworths.product.list.fragment.ProductListOptions fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            ArrayList arrayListFromJson2 = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    arrayListFromJson = Adapters.a(Adapters.c(Filter.INSTANCE, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson2 = Adapters.a(Adapters.c(SortOption.INSTANCE, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "filters");
                throw null;
            }
            if (arrayListFromJson2 != null) {
                return new com.woolworths.product.list.fragment.ProductListOptions(arrayListFromJson, arrayListFromJson2);
            }
            Assertions.a(reader, "sortOptions");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull com.woolworths.product.list.fragment.ProductListOptions value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("filters");
            Adapters.a(Adapters.c(Filter.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getFilters());
            writer.F1("sortOptions");
            Adapters.a(Adapters.c(SortOption.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getSortOptions());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/fragment/ProductListOptionsImpl_ResponseAdapter$SortOption;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/list/fragment/ProductListOptions$SortOption;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SortOption implements Adapter<ProductListOptions.SortOption> {

        @NotNull
        public static final SortOption INSTANCE = new SortOption();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("key", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "isApplied");
        public static final int $stable = 8;

        private SortOption() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductListOptions.SortOption fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "key");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (bool != null) {
                return new ProductListOptions.SortOption(str, str2, str3, bool.booleanValue());
            }
            Assertions.a(reader, "isApplied");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductListOptions.SortOption value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("key");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getKey());
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getTitle());
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            Adapters.i.toJson(writer, customScalarAdapters, value.getSubtitle());
            writer.F1("isApplied");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.isApplied()));
        }
    }

    private ProductListOptionsImpl_ResponseAdapter() {
    }
}
