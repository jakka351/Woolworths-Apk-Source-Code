package au.com.woolworths.shop.lists.data.remote.adapter;

import au.com.woolworths.shop.lists.data.remote.PastShopsQuery;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/adapter/PastShopsQuery_VariablesAdapter;", "", "<init>", "()V", "serializeVariables", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "Lau/com/woolworths/shop/lists/data/remote/PastShopsQuery;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "withDefaultValues", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PastShopsQuery_VariablesAdapter {

    @NotNull
    public static final PastShopsQuery_VariablesAdapter INSTANCE = new PastShopsQuery_VariablesAdapter();

    private PastShopsQuery_VariablesAdapter() {
    }

    public final void serializeVariables(@NotNull JsonWriter writer, @NotNull PastShopsQuery value, @NotNull CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        Intrinsics.h(writer, "writer");
        Intrinsics.h(value, "value");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        if (value.getPageNumber() instanceof Optional.Present) {
            writer.F1("pageNumber");
            Adapters.d(Adapters.k).toJson(writer, customScalarAdapters, (Optional.Present) value.getPageNumber());
        }
        if (value.getPageSize() instanceof Optional.Present) {
            writer.F1("pageSize");
            Adapters.d(Adapters.k).toJson(writer, customScalarAdapters, (Optional.Present) value.getPageSize());
        }
    }
}
