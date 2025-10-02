package au.com.woolworths.modules.collectionmode.adapter;

import au.com.woolworths.modules.collectionmode.ShoppingModeVariantQuery;
import au.com.woolworths.shop.graphql.type.ShoppingModeVariantState;
import au.com.woolworths.shop.graphql.type.adapter.ShoppingModeVariantState_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/ShoppingModeVariantQuery_ResponseAdapter;", "", "Data", "ShoppingMode", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShoppingModeVariantQuery_ResponseAdapter {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/ShoppingModeVariantQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/collectionmode/ShoppingModeVariantQuery$Data;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<ShoppingModeVariantQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f9158a = new Data();
        public static final List b = CollectionsKt.Q("shoppingMode");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ShoppingModeVariantQuery.ShoppingMode shoppingMode = null;
            while (reader.o2(b) == 0) {
                shoppingMode = (ShoppingModeVariantQuery.ShoppingMode) Adapters.c(ShoppingMode.f9159a, false).fromJson(reader, customScalarAdapters);
            }
            if (shoppingMode != null) {
                return new ShoppingModeVariantQuery.Data(shoppingMode);
            }
            Assertions.a(reader, "shoppingMode");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ShoppingModeVariantQuery.Data value = (ShoppingModeVariantQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("shoppingMode");
            Adapters.c(ShoppingMode.f9159a, false).toJson(writer, customScalarAdapters, value.f9119a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/ShoppingModeVariantQuery_ResponseAdapter$ShoppingMode;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/collectionmode/ShoppingModeVariantQuery$ShoppingMode;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShoppingMode implements Adapter<ShoppingModeVariantQuery.ShoppingMode> {

        /* renamed from: a, reason: collision with root package name */
        public static final ShoppingMode f9159a = new ShoppingMode();
        public static final List b = CollectionsKt.Q("state");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ShoppingModeVariantState shoppingModeVariantStateA = null;
            while (reader.o2(b) == 0) {
                shoppingModeVariantStateA = ShoppingModeVariantState_ResponseAdapter.a(reader, customScalarAdapters);
            }
            if (shoppingModeVariantStateA != null) {
                return new ShoppingModeVariantQuery.ShoppingMode(shoppingModeVariantStateA);
            }
            Assertions.a(reader, "state");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ShoppingModeVariantQuery.ShoppingMode value = (ShoppingModeVariantQuery.ShoppingMode) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("state");
            ShoppingModeVariantState_ResponseAdapter.b(writer, customScalarAdapters, value.f9120a);
        }
    }
}
