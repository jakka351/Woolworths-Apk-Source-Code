package com.woolworths.product.details.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.adapter.BarcodeType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ProductRatingsAndReviewsPreviewInput_InputAdapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.product.details.ProductDetailsQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_VariablesAdapter;", "", "<init>", "()V", "serializeVariables", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "Lcom/woolworths/product/details/ProductDetailsQuery;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "withDefaultValues", "", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductDetailsQuery_VariablesAdapter {
    public static final int $stable = 0;

    @NotNull
    public static final ProductDetailsQuery_VariablesAdapter INSTANCE = new ProductDetailsQuery_VariablesAdapter();

    private ProductDetailsQuery_VariablesAdapter() {
    }

    public final void serializeVariables(@NotNull JsonWriter writer, @NotNull ProductDetailsQuery value, @NotNull CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        Intrinsics.h(writer, "writer");
        Intrinsics.h(value, "value");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        if (value.getProductId() instanceof Optional.Present) {
            writer.F1("productId");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) value.getProductId());
        }
        if (value.getBarcode() instanceof Optional.Present) {
            writer.F1("barcode");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) value.getBarcode());
        }
        if (value.getBarcodeType() instanceof Optional.Present) {
            writer.F1("barcodeType");
            Adapters.d(Adapters.b(BarcodeType_ResponseAdapter.f12037a)).toJson(writer, customScalarAdapters, (Optional.Present) value.getBarcodeType());
        }
        if (value.getStoreId() instanceof Optional.Present) {
            writer.F1("storeId");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) value.getStoreId());
        }
        if (value.getSupportedLinks() instanceof Optional.Present) {
            writer.F1("supportedLinks");
            Adapters.d(Adapters.b(Adapters.a(Adapters.f13493a))).toJson(writer, customScalarAdapters, (Optional.Present) value.getSupportedLinks());
        }
        writer.F1("isRatingsAndReviewsSummaryEnabled");
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
        adapters$BooleanAdapter$1.toJson(writer, customScalarAdapters, Boolean.valueOf(value.isRatingsAndReviewsSummaryEnabled()));
        writer.F1("isHealthierOptionsEnabled");
        adapters$BooleanAdapter$1.toJson(writer, customScalarAdapters, Boolean.valueOf(value.isHealthierOptionsEnabled()));
        writer.F1("isMarkdownEnabled");
        adapters$BooleanAdapter$1.toJson(writer, customScalarAdapters, Boolean.valueOf(value.isMarkdownEnabled()));
        writer.F1("includeOfferMinimumSpend");
        adapters$BooleanAdapter$1.toJson(writer, customScalarAdapters, Boolean.valueOf(value.getIncludeOfferMinimumSpend()));
        if (value.getIncludeAvailabilityInfoStatus() instanceof Optional.Present) {
            writer.F1("includeAvailabilityInfoStatus");
            Adapters.d(adapters$BooleanAdapter$1).toJson(writer, customScalarAdapters, (Optional.Present) value.getIncludeAvailabilityInfoStatus());
        } else if (withDefaultValues) {
            writer.F1("includeAvailabilityInfoStatus");
            Adapters.m.toJson(writer, customScalarAdapters, Boolean.FALSE);
        }
        writer.F1("includeProductAvailabilityStates");
        adapters$BooleanAdapter$1.toJson(writer, customScalarAdapters, Boolean.valueOf(value.getIncludeProductAvailabilityStates()));
        writer.F1("productRatingsAndReviewsPreviewInput");
        Adapters.c(ProductRatingsAndReviewsPreviewInput_InputAdapter.f12104a, false).toJson(writer, customScalarAdapters, value.getProductRatingsAndReviewsPreviewInput());
        writer.F1("includeActionableCard");
        adapters$BooleanAdapter$1.toJson(writer, customScalarAdapters, Boolean.valueOf(value.getIncludeActionableCard()));
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
