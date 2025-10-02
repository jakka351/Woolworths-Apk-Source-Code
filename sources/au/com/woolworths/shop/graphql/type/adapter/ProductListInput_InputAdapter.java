package au.com.woolworths.shop.graphql.type.adapter;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.ProductListInput;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/adapter/ProductListInput_InputAdapter;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/graphql/type/ProductListInput;", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductListInput_InputAdapter implements Adapter<ProductListInput> {

    /* renamed from: a, reason: collision with root package name */
    public static final ProductListInput_InputAdapter f12102a = new ProductListInput_InputAdapter();

    @Override // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
        throw a.j(jsonReader, "reader", customScalarAdapters, "customScalarAdapters", "Input type used in output position");
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
        ProductListInput value = (ProductListInput) obj;
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Intrinsics.h(value, "value");
        Optional optional = value.n;
        Optional optional2 = value.m;
        Optional optional3 = value.l;
        Optional optional4 = value.k;
        Optional optional5 = value.j;
        Optional optional6 = value.i;
        Optional optional7 = value.h;
        Optional optional8 = value.g;
        Optional optional9 = value.f;
        Optional optional10 = value.e;
        Optional optional11 = value.d;
        Optional optional12 = value.c;
        writer.F1("type");
        Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
        adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f11753a);
        Optional optional13 = value.b;
        if (optional13 instanceof Optional.Present) {
            writer.F1("argument");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) optional13);
        }
        if (optional12 instanceof Optional.Present) {
            writer.F1("storeId");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) optional12);
        }
        if (optional11 instanceof Optional.Present) {
            writer.F1("facetChip");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) optional11);
        }
        if (optional10 instanceof Optional.Present) {
            writer.F1("chips");
            Adapters.d(Adapters.b(Adapters.c(ChipsProductListInputArgs_InputAdapter.f12054a, false))).toJson(writer, customScalarAdapters, (Optional.Present) optional10);
        }
        if (optional9 instanceof Optional.Present) {
            writer.F1("filterOptions");
            Adapters.d(Adapters.b(Adapters.a(Adapters.b(Adapters.c(ProductFilterOption_InputAdapter.f12100a, false))))).toJson(writer, customScalarAdapters, (Optional.Present) optional9);
        }
        if (optional8 instanceof Optional.Present) {
            writer.F1("includeMarketProducts");
            Adapters.d(Adapters.l).toJson(writer, customScalarAdapters, (Optional.Present) optional8);
        }
        if (optional7 instanceof Optional.Present) {
            writer.F1("initialLoad");
            Adapters.d(Adapters.l).toJson(writer, customScalarAdapters, (Optional.Present) optional7);
        }
        if (optional6 instanceof Optional.Present) {
            writer.F1("pageNumber");
            Adapters.d(Adapters.k).toJson(writer, customScalarAdapters, (Optional.Present) optional6);
        }
        if (optional5 instanceof Optional.Present) {
            writer.F1("pageSize");
            Adapters.d(Adapters.k).toJson(writer, customScalarAdapters, (Optional.Present) optional5);
        }
        if (optional4 instanceof Optional.Present) {
            writer.F1("sortOption");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) optional4);
        }
        if (optional3 instanceof Optional.Present) {
            writer.F1("source");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) optional3);
        }
        if (optional2 instanceof Optional.Present) {
            writer.F1("supportedLinks");
            Adapters.d(Adapters.b(Adapters.a(adapters$StringAdapter$1))).toJson(writer, customScalarAdapters, (Optional.Present) optional2);
        }
        if (optional instanceof Optional.Present) {
            writer.F1("persistedChipIds");
            Adapters.d(Adapters.b(Adapters.a(adapters$StringAdapter$1))).toJson(writer, customScalarAdapters, (Optional.Present) optional);
        }
    }
}
