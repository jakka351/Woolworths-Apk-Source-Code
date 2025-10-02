package com.woolworths.feature.shop.myorders.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.ToggleOrderLeaveUnattendedReason;
import au.com.woolworths.shop.graphql.type.adapter.ToggleOrderLeaveUnattendedReason_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.myorders.ToggleOrderLeaveUnattendedMutation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/ToggleOrderLeaveUnattendedMutation_ResponseAdapter;", "", "Data", "ToggleOrderLeaveUnattended", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ToggleOrderLeaveUnattendedMutation_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/ToggleOrderLeaveUnattendedMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/ToggleOrderLeaveUnattendedMutation$Data;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<ToggleOrderLeaveUnattendedMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f20188a = new Data();
        public static final List b = CollectionsKt.Q("toggleOrderLeaveUnattended");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ToggleOrderLeaveUnattendedMutation.ToggleOrderLeaveUnattended toggleOrderLeaveUnattended = null;
            while (reader.o2(b) == 0) {
                toggleOrderLeaveUnattended = (ToggleOrderLeaveUnattendedMutation.ToggleOrderLeaveUnattended) Adapters.c(ToggleOrderLeaveUnattended.f20189a, false).fromJson(reader, customScalarAdapters);
            }
            if (toggleOrderLeaveUnattended != null) {
                return new ToggleOrderLeaveUnattendedMutation.Data(toggleOrderLeaveUnattended);
            }
            Assertions.a(reader, "toggleOrderLeaveUnattended");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ToggleOrderLeaveUnattendedMutation.Data value = (ToggleOrderLeaveUnattendedMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("toggleOrderLeaveUnattended");
            Adapters.c(ToggleOrderLeaveUnattended.f20189a, false).toJson(writer, customScalarAdapters, value.f20023a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/ToggleOrderLeaveUnattendedMutation_ResponseAdapter$ToggleOrderLeaveUnattended;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/ToggleOrderLeaveUnattendedMutation$ToggleOrderLeaveUnattended;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ToggleOrderLeaveUnattended implements Adapter<ToggleOrderLeaveUnattendedMutation.ToggleOrderLeaveUnattended> {

        /* renamed from: a, reason: collision with root package name */
        public static final ToggleOrderLeaveUnattended f20189a = new ToggleOrderLeaveUnattended();
        public static final List b = CollectionsKt.R("success", "reason", "message");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            ToggleOrderLeaveUnattendedReason toggleOrderLeaveUnattendedReason = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    toggleOrderLeaveUnattendedReason = (ToggleOrderLeaveUnattendedReason) Adapters.b(ToggleOrderLeaveUnattendedReason_ResponseAdapter.f12129a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (bool != null) {
                return new ToggleOrderLeaveUnattendedMutation.ToggleOrderLeaveUnattended(bool.booleanValue(), toggleOrderLeaveUnattendedReason, str);
            }
            Assertions.a(reader, "success");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ToggleOrderLeaveUnattendedMutation.ToggleOrderLeaveUnattended value = (ToggleOrderLeaveUnattendedMutation.ToggleOrderLeaveUnattended) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("success");
            d.B(value.f20024a, Adapters.f, writer, customScalarAdapters, "reason");
            Adapters.b(ToggleOrderLeaveUnattendedReason_ResponseAdapter.f12129a).toJson(writer, customScalarAdapters, value.b);
            writer.F1("message");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
        }
    }
}
