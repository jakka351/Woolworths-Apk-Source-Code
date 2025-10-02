package com.woolworths.product.list.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.adapter.ChipsProductListInputArgs_InputAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ProductFilterOption_InputAdapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.product.list.ProductsByCategoryQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, d2 = {"Lcom/woolworths/product/list/adapter/ProductsByCategoryQuery_VariablesAdapter;", "", "<init>", "()V", "serializeVariables", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "Lcom/woolworths/product/list/ProductsByCategoryQuery;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "withDefaultValues", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProductsByCategoryQuery_VariablesAdapter {
    public static final int $stable = 0;

    @NotNull
    public static final ProductsByCategoryQuery_VariablesAdapter INSTANCE = new ProductsByCategoryQuery_VariablesAdapter();

    private ProductsByCategoryQuery_VariablesAdapter() {
    }

    public final void serializeVariables(@NotNull JsonWriter writer, @NotNull ProductsByCategoryQuery value, @NotNull CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        Intrinsics.h(writer, "writer");
        Intrinsics.h(value, "value");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        writer.F1("categoryId");
        Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
        adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getCategoryId());
        if (value.getStoreId() instanceof Optional.Present) {
            writer.F1("storeId");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) value.getStoreId());
        }
        if (value.getPageSize() instanceof Optional.Present) {
            writer.F1("pageSize");
            Adapters.d(Adapters.k).toJson(writer, customScalarAdapters, (Optional.Present) value.getPageSize());
        }
        if (value.getPageNumber() instanceof Optional.Present) {
            writer.F1("pageNumber");
            Adapters.d(Adapters.k).toJson(writer, customScalarAdapters, (Optional.Present) value.getPageNumber());
        }
        if (value.getSortOption() instanceof Optional.Present) {
            writer.F1("sortOption");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) value.getSortOption());
        }
        if (value.getFilterOptions() instanceof Optional.Present) {
            writer.F1("filterOptions");
            Adapters.d(Adapters.b(Adapters.a(Adapters.b(Adapters.c(ProductFilterOption_InputAdapter.f12100a, false))))).toJson(writer, customScalarAdapters, (Optional.Present) value.getFilterOptions());
        }
        if (value.getIncludeMarketplaceProducts() instanceof Optional.Present) {
            writer.F1("includeMarketplaceProducts");
            Adapters.d(Adapters.l).toJson(writer, customScalarAdapters, (Optional.Present) value.getIncludeMarketplaceProducts());
        }
        if (value.getSupportedLinks() instanceof Optional.Present) {
            writer.F1("supportedLinks");
            Adapters.d(Adapters.b(Adapters.a(adapters$StringAdapter$1))).toJson(writer, customScalarAdapters, (Optional.Present) value.getSupportedLinks());
        }
        if (value.getProductSource() instanceof Optional.Present) {
            writer.F1("productSource");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) value.getProductSource());
        }
        writer.F1("includeProductAvailabilityStates");
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
        adapters$BooleanAdapter$1.toJson(writer, customScalarAdapters, Boolean.valueOf(value.getIncludeProductAvailabilityStates()));
        writer.F1("includeOfferMinimumSpend");
        adapters$BooleanAdapter$1.toJson(writer, customScalarAdapters, Boolean.valueOf(value.getIncludeOfferMinimumSpend()));
        if (value.getIncludeAvailabilityInfoStatus() instanceof Optional.Present) {
            writer.F1("includeAvailabilityInfoStatus");
            Adapters.d(adapters$BooleanAdapter$1).toJson(writer, customScalarAdapters, (Optional.Present) value.getIncludeAvailabilityInfoStatus());
        } else if (withDefaultValues) {
            writer.F1("includeAvailabilityInfoStatus");
            Adapters.m.toJson(writer, customScalarAdapters, Boolean.FALSE);
        }
        if (value.getChips() instanceof Optional.Present) {
            writer.F1("chips");
            Adapters.d(Adapters.b(Adapters.c(ChipsProductListInputArgs_InputAdapter.f12054a, false))).toJson(writer, customScalarAdapters, (Optional.Present) value.getChips());
        }
        writer.F1("includeUnitPriceInsetBanner");
        adapters$BooleanAdapter$1.toJson(writer, customScalarAdapters, Boolean.valueOf(value.getIncludeUnitPriceInsetBanner()));
        writer.F1("includeUniversalInventoryFallback");
        adapters$BooleanAdapter$1.toJson(writer, customScalarAdapters, Boolean.valueOf(value.getIncludeUniversalInventoryFallback()));
        writer.F1("includeHorizontalList");
        adapters$BooleanAdapter$1.toJson(writer, customScalarAdapters, Boolean.valueOf(value.getIncludeHorizontalList()));
        if (value.getIncludePricingFootnote() instanceof Optional.Present) {
            writer.F1("includePricingFootnote");
            Adapters.d(adapters$BooleanAdapter$1).toJson(writer, customScalarAdapters, (Optional.Present) value.getIncludePricingFootnote());
        } else if (withDefaultValues) {
            writer.F1("includePricingFootnote");
            Adapters.m.toJson(writer, customScalarAdapters, Boolean.FALSE);
        }
        writer.F1("includeLowestPrice14Days");
        adapters$BooleanAdapter$1.toJson(writer, customScalarAdapters, Boolean.valueOf(value.getIncludeLowestPrice14Days()));
    }
}
