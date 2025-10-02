package com.woolworths.shop.checkout.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.CollectionModeId;
import au.com.woolworths.shop.graphql.type.adapter.CollectionModeId_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.checkout.SetFulfilmentWindowMutation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/SetFulfilmentWindowMutation_ResponseAdapter;", "", "Data", "SetFulfilmentWindow", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SetFulfilmentWindowMutation_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/SetFulfilmentWindowMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/SetFulfilmentWindowMutation$Data;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<SetFulfilmentWindowMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f22022a = new Data();
        public static final List b = CollectionsKt.Q("setFulfilmentWindow");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            SetFulfilmentWindowMutation.SetFulfilmentWindow setFulfilmentWindow = null;
            while (reader.o2(b) == 0) {
                setFulfilmentWindow = (SetFulfilmentWindowMutation.SetFulfilmentWindow) Adapters.b(Adapters.c(SetFulfilmentWindow.f22023a, false)).fromJson(reader, customScalarAdapters);
            }
            return new SetFulfilmentWindowMutation.Data(setFulfilmentWindow);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SetFulfilmentWindowMutation.Data value = (SetFulfilmentWindowMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("setFulfilmentWindow");
            Adapters.b(Adapters.c(SetFulfilmentWindow.f22023a, false)).toJson(writer, customScalarAdapters, value.f21893a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/SetFulfilmentWindowMutation_ResponseAdapter$SetFulfilmentWindow;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/SetFulfilmentWindowMutation$SetFulfilmentWindow;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SetFulfilmentWindow implements Adapter<SetFulfilmentWindowMutation.SetFulfilmentWindow> {

        /* renamed from: a, reason: collision with root package name */
        public static final SetFulfilmentWindow f22023a = new SetFulfilmentWindow();
        public static final List b = CollectionsKt.R("_excluded", "modeId");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            CollectionModeId collectionModeIdA = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    collectionModeIdA = CollectionModeId_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (collectionModeIdA != null) {
                return new SetFulfilmentWindowMutation.SetFulfilmentWindow(bool, collectionModeIdA);
            }
            Assertions.a(reader, "modeId");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SetFulfilmentWindowMutation.SetFulfilmentWindow value = (SetFulfilmentWindowMutation.SetFulfilmentWindow) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("_excluded");
            Adapters.l.toJson(writer, customScalarAdapters, value.f21894a);
            writer.F1("modeId");
            CollectionModeId_ResponseAdapter.b(writer, customScalarAdapters, value.b);
        }
    }
}
