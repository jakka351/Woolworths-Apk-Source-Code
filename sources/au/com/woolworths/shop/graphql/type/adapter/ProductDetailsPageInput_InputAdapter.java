package au.com.woolworths.shop.graphql.type.adapter;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.ProductDetailsPageInput;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/adapter/ProductDetailsPageInput_InputAdapter;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/graphql/type/ProductDetailsPageInput;", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductDetailsPageInput_InputAdapter implements Adapter<ProductDetailsPageInput> {

    /* renamed from: a, reason: collision with root package name */
    public static final ProductDetailsPageInput_InputAdapter f12099a = new ProductDetailsPageInput_InputAdapter();

    @Override // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
        throw a.j(jsonReader, "reader", customScalarAdapters, "customScalarAdapters", "Input type used in output position");
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
        ProductDetailsPageInput value = (ProductDetailsPageInput) obj;
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Intrinsics.h(value, "value");
        Optional optional = value.f;
        Optional optional2 = value.d;
        Optional optional3 = value.c;
        Optional optional4 = value.b;
        Optional optional5 = value.f11730a;
        if (optional5 instanceof Optional.Present) {
            writer.F1("productId");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) optional5);
        }
        if (optional4 instanceof Optional.Present) {
            writer.F1("barcode");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) optional4);
        }
        if (optional3 instanceof Optional.Present) {
            writer.F1("barcodeType");
            Adapters.d(Adapters.b(BarcodeType_ResponseAdapter.f12037a)).toJson(writer, customScalarAdapters, (Optional.Present) optional3);
        }
        if (optional2 instanceof Optional.Present) {
            writer.F1("marketplaceShippingInfo");
            Adapters.d(Adapters.b(Adapters.c(MarketplaceShippingInfo_InputAdapter.f12086a, false))).toJson(writer, customScalarAdapters, (Optional.Present) optional2);
        }
        writer.F1("mode");
        ShoppingModeType_ResponseAdapter.b(writer, customScalarAdapters, value.e);
        if (optional instanceof Optional.Present) {
            writer.F1("storeId");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) optional);
        }
        writer.F1("supportedActions");
        Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
        Adapters.a(adapters$StringAdapter$1).toJson(writer, customScalarAdapters, value.g);
        writer.F1("supportedLinks");
        Adapters.a(adapters$StringAdapter$1).toJson(writer, customScalarAdapters, value.h);
    }
}
