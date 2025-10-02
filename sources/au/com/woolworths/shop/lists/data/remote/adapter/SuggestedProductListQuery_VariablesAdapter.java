package au.com.woolworths.shop.lists.data.remote.adapter;

import au.com.woolworths.shop.lists.data.remote.SuggestedProductListQuery;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/adapter/SuggestedProductListQuery_VariablesAdapter;", "", "<init>", "()V", "serializeVariables", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "Lau/com/woolworths/shop/lists/data/remote/SuggestedProductListQuery;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "withDefaultValues", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SuggestedProductListQuery_VariablesAdapter {

    @NotNull
    public static final SuggestedProductListQuery_VariablesAdapter INSTANCE = new SuggestedProductListQuery_VariablesAdapter();

    private SuggestedProductListQuery_VariablesAdapter() {
    }

    public final void serializeVariables(@NotNull JsonWriter writer, @NotNull SuggestedProductListQuery value, @NotNull CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        Intrinsics.h(writer, "writer");
        Intrinsics.h(value, "value");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        if (value.getStoreId() instanceof Optional.Present) {
            writer.F1("storeId");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) value.getStoreId());
        }
        writer.F1("id");
        Adapters.b.toJson(writer, customScalarAdapters, Integer.valueOf(value.getId()));
        if (value.getPageSize() instanceof Optional.Present) {
            writer.F1("pageSize");
            Adapters.d(Adapters.k).toJson(writer, customScalarAdapters, (Optional.Present) value.getPageSize());
        }
        if (value.getPageNumber() instanceof Optional.Present) {
            writer.F1("pageNumber");
            Adapters.d(Adapters.k).toJson(writer, customScalarAdapters, (Optional.Present) value.getPageNumber());
        }
        writer.F1("includeMarketplaceSwitch");
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
        adapters$BooleanAdapter$1.toJson(writer, customScalarAdapters, Boolean.valueOf(value.getIncludeMarketplaceSwitch()));
        writer.F1("includeProductAvailabilityStates");
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
