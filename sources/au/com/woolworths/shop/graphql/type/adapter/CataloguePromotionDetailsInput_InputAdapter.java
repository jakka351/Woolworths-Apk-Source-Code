package au.com.woolworths.shop.graphql.type.adapter;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.CataloguePromotionDetailsInput;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/adapter/CataloguePromotionDetailsInput_InputAdapter;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/graphql/type/CataloguePromotionDetailsInput;", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CataloguePromotionDetailsInput_InputAdapter implements Adapter<CataloguePromotionDetailsInput> {

    /* renamed from: a, reason: collision with root package name */
    public static final CataloguePromotionDetailsInput_InputAdapter f12048a = new CataloguePromotionDetailsInput_InputAdapter();

    @Override // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
        throw a.j(jsonReader, "reader", customScalarAdapters, "customScalarAdapters", "Input type used in output position");
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
        CataloguePromotionDetailsInput value = (CataloguePromotionDetailsInput) obj;
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Intrinsics.h(value, "value");
        Optional optional = value.i;
        Optional optional2 = value.h;
        Optional optional3 = value.g;
        Optional optional4 = value.f;
        Optional optional5 = value.e;
        Optional optional6 = value.d;
        Optional optional7 = value.c;
        Optional optional8 = value.f11160a;
        if (optional8 instanceof Optional.Present) {
            writer.F1("storeId");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) optional8);
        }
        writer.F1("mode");
        ShoppingModeType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
        if (optional7 instanceof Optional.Present) {
            writer.F1("pagePath");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) optional7);
        }
        if (optional6 instanceof Optional.Present) {
            writer.F1("sneakWarningPath");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) optional6);
        }
        if (optional5 instanceof Optional.Present) {
            writer.F1("productId");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) optional5);
        }
        if (optional4 instanceof Optional.Present) {
            writer.F1("offerId");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) optional4);
        }
        if (optional3 instanceof Optional.Present) {
            writer.F1("pageSize");
            Adapters.d(Adapters.k).toJson(writer, customScalarAdapters, (Optional.Present) optional3);
        }
        if (optional2 instanceof Optional.Present) {
            writer.F1("pageNumber");
            Adapters.d(Adapters.k).toJson(writer, customScalarAdapters, (Optional.Present) optional2);
        }
        if (optional instanceof Optional.Present) {
            writer.F1("requestSource");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) optional);
        }
    }
}
