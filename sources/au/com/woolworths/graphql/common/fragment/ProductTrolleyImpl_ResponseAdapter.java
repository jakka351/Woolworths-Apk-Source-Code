package au.com.woolworths.graphql.common.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$DoubleAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductTrolleyImpl_ResponseAdapter;", "", "ProductTrolley", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductTrolleyImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductTrolleyImpl_ResponseAdapter$ProductTrolley;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/graphql/common/fragment/ProductTrolley;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductTrolley implements Adapter<au.com.woolworths.graphql.common.fragment.ProductTrolley> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f9026a = CollectionsKt.R("minimum", "maximum", "increment", "defaultValue", "unit", "inTrolley", "buttonState", "buttonLabel", "buttonQuantity", "title");

        public static au.com.woolworths.graphql.common.fragment.ProductTrolley a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Double d = null;
            Double d2 = null;
            Double d3 = null;
            Double d4 = null;
            String str = null;
            Double d5 = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (true) {
                switch (reader.o2(f9026a)) {
                    case 0:
                        d = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        d2 = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        d3 = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        d4 = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        d5 = (Double) Adapters.j.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (d == null) {
                            Assertions.a(reader, "minimum");
                            throw null;
                        }
                        double dDoubleValue = d.doubleValue();
                        if (d2 == null) {
                            Assertions.a(reader, "maximum");
                            throw null;
                        }
                        double dDoubleValue2 = d2.doubleValue();
                        if (d3 == null) {
                            Assertions.a(reader, "increment");
                            throw null;
                        }
                        double dDoubleValue3 = d3.doubleValue();
                        if (d4 == null) {
                            Assertions.a(reader, "defaultValue");
                            throw null;
                        }
                        double dDoubleValue4 = d4.doubleValue();
                        if (str2 == null) {
                            Assertions.a(reader, "buttonState");
                            throw null;
                        }
                        if (str3 != null) {
                            return new au.com.woolworths.graphql.common.fragment.ProductTrolley(dDoubleValue, dDoubleValue2, dDoubleValue3, dDoubleValue4, str, d5, str2, str3, str4, str5);
                        }
                        Assertions.a(reader, "buttonLabel");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, au.com.woolworths.graphql.common.fragment.ProductTrolley value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("minimum");
            Adapters$DoubleAdapter$1 adapters$DoubleAdapter$1 = Adapters.c;
            adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, Double.valueOf(value.f9025a));
            writer.F1("maximum");
            adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, Double.valueOf(value.b));
            writer.F1("increment");
            adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, Double.valueOf(value.c));
            writer.F1("defaultValue");
            adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, Double.valueOf(value.d));
            writer.F1("unit");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("inTrolley");
            Adapters.j.toJson(writer, customScalarAdapters, value.f);
            writer.F1("buttonState");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.g);
            writer.F1("buttonLabel");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.h);
            writer.F1("buttonQuantity");
            nullableAdapter.toJson(writer, customScalarAdapters, value.i);
            writer.F1("title");
            nullableAdapter.toJson(writer, customScalarAdapters, value.j);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (au.com.woolworths.graphql.common.fragment.ProductTrolley) obj);
        }
    }
}
