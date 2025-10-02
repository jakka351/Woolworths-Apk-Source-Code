package au.com.woolworths.shop.lists.data.remote.fragment;

import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$DoubleAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/fragment/ProductItemFragmentImpl_ResponseAdapter;", "", "<init>", "()V", "ProductItemFragment", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductItemFragmentImpl_ResponseAdapter {

    @NotNull
    public static final ProductItemFragmentImpl_ResponseAdapter INSTANCE = new ProductItemFragmentImpl_ResponseAdapter();

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/fragment/ProductItemFragmentImpl_ResponseAdapter$ProductItemFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/lists/data/remote/fragment/ProductItemFragment;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductItemFragment implements Adapter<au.com.woolworths.shop.lists.data.remote.fragment.ProductItemFragment> {

        @NotNull
        public static final ProductItemFragment INSTANCE = new ProductItemFragment();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("timestamp", "id", "productId", "quantity", "checked");

        private ProductItemFragment() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public au.com.woolworths.shop.lists.data.remote.fragment.ProductItemFragment fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Double d;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Double d2 = null;
            Double d3 = null;
            Boolean bool = null;
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 != 0) {
                    if (iO2 == 1) {
                        d = d3;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                    } else if (iO2 == 2) {
                        d = d3;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                    } else if (iO2 == 3) {
                        d3 = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                    } else {
                        if (iO2 != 4) {
                            break;
                        }
                        d = d3;
                        bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                    }
                    d3 = d;
                } else {
                    d2 = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                }
            }
            Double d4 = d3;
            if (d2 == null) {
                Assertions.a(reader, "timestamp");
                throw null;
            }
            Boolean bool2 = bool;
            double dDoubleValue = d2.doubleValue();
            if (str == null) {
                Assertions.a(reader, "id");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "productId");
                throw null;
            }
            if (d4 == null) {
                Assertions.a(reader, "quantity");
                throw null;
            }
            double dDoubleValue2 = d4.doubleValue();
            if (bool2 != null) {
                return new au.com.woolworths.shop.lists.data.remote.fragment.ProductItemFragment(dDoubleValue, str, str2, dDoubleValue2, bool2.booleanValue());
            }
            Assertions.a(reader, "checked");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull au.com.woolworths.shop.lists.data.remote.fragment.ProductItemFragment value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("timestamp");
            Adapters$DoubleAdapter$1 adapters$DoubleAdapter$1 = Adapters.c;
            adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, Double.valueOf(value.getTimestamp()));
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getId());
            writer.F1("productId");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getProductId());
            writer.F1("quantity");
            adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, Double.valueOf(value.getQuantity()));
            writer.F1("checked");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.getChecked()));
        }
    }

    private ProductItemFragmentImpl_ResponseAdapter() {
    }
}
