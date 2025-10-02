package au.com.woolworths.shop.graphql.type.adapter;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.ProductRatingsAndReviewsDetailsInput;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/adapter/ProductRatingsAndReviewsDetailsInput_InputAdapter;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/graphql/type/ProductRatingsAndReviewsDetailsInput;", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductRatingsAndReviewsDetailsInput_InputAdapter implements Adapter<ProductRatingsAndReviewsDetailsInput> {

    /* renamed from: a, reason: collision with root package name */
    public static final ProductRatingsAndReviewsDetailsInput_InputAdapter f12103a = new ProductRatingsAndReviewsDetailsInput_InputAdapter();

    @Override // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
        throw a.j(jsonReader, "reader", customScalarAdapters, "customScalarAdapters", "Input type used in output position");
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
        ProductRatingsAndReviewsDetailsInput value = (ProductRatingsAndReviewsDetailsInput) obj;
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Intrinsics.h(value, "value");
        Optional.Present present = value.e;
        Optional.Present present2 = value.d;
        Optional.Present present3 = value.c;
        writer.F1("productId");
        Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
        adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f11764a);
        Optional.Present present4 = value.b;
        writer.F1("sortOption");
        Adapters.d(Adapters.b(RatingsReviewSortType_ResponseAdapter.f12110a)).toJson(writer, customScalarAdapters, present4);
        writer.F1("pageSize");
        NullableAdapter nullableAdapter = Adapters.k;
        Adapters.d(nullableAdapter).toJson(writer, customScalarAdapters, present3);
        writer.F1("pageNumber");
        Adapters.d(nullableAdapter).toJson(writer, customScalarAdapters, present2);
        writer.F1("supportedLinks");
        Adapters.d(Adapters.b(Adapters.a(adapters$StringAdapter$1))).toJson(writer, customScalarAdapters, present);
    }
}
