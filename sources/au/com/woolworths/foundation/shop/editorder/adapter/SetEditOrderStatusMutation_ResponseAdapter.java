package au.com.woolworths.foundation.shop.editorder.adapter;

import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.foundation.shop.editorder.SetEditOrderStatusMutation;
import au.com.woolworths.shop.graphql.type.EditOrderMode;
import au.com.woolworths.shop.graphql.type.EditOrderReason;
import au.com.woolworths.shop.graphql.type.adapter.EditOrderMode_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.EditOrderReason_ResponseAdapter;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/adapter/SetEditOrderStatusMutation_ResponseAdapter;", "", "Data", "SetEditOrderStatus", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SetEditOrderStatusMutation_ResponseAdapter {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/adapter/SetEditOrderStatusMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/shop/editorder/SetEditOrderStatusMutation$Data;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<SetEditOrderStatusMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f8738a = new Data();
        public static final List b = CollectionsKt.Q("setEditOrderStatus");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            SetEditOrderStatusMutation.SetEditOrderStatus setEditOrderStatus = null;
            while (reader.o2(b) == 0) {
                setEditOrderStatus = (SetEditOrderStatusMutation.SetEditOrderStatus) Adapters.c(SetEditOrderStatus.f8739a, false).fromJson(reader, customScalarAdapters);
            }
            if (setEditOrderStatus != null) {
                return new SetEditOrderStatusMutation.Data(setEditOrderStatus);
            }
            Assertions.a(reader, "setEditOrderStatus");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SetEditOrderStatusMutation.Data value = (SetEditOrderStatusMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("setEditOrderStatus");
            Adapters.c(SetEditOrderStatus.f8739a, false).toJson(writer, customScalarAdapters, value.f8730a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/adapter/SetEditOrderStatusMutation_ResponseAdapter$SetEditOrderStatus;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/shop/editorder/SetEditOrderStatusMutation$SetEditOrderStatus;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SetEditOrderStatus implements Adapter<SetEditOrderStatusMutation.SetEditOrderStatus> {

        /* renamed from: a, reason: collision with root package name */
        public static final SetEditOrderStatus f8739a = new SetEditOrderStatus();
        public static final List b = CollectionsKt.R("success", "reason", "message", "currentMode");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            EditOrderReason editOrderReason = null;
            String str = null;
            EditOrderMode editOrderModeA = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    editOrderReason = (EditOrderReason) Adapters.b(EditOrderReason_ResponseAdapter.f12074a).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    editOrderModeA = EditOrderMode_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (bool == null) {
                Assertions.a(reader, "success");
                throw null;
            }
            boolean zBooleanValue = bool.booleanValue();
            if (editOrderModeA != null) {
                return new SetEditOrderStatusMutation.SetEditOrderStatus(zBooleanValue, editOrderReason, str, editOrderModeA);
            }
            Assertions.a(reader, "currentMode");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SetEditOrderStatusMutation.SetEditOrderStatus value = (SetEditOrderStatusMutation.SetEditOrderStatus) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("success");
            d.B(value.f8731a, Adapters.f, writer, customScalarAdapters, "reason");
            Adapters.b(EditOrderReason_ResponseAdapter.f12074a).toJson(writer, customScalarAdapters, value.b);
            writer.F1("message");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
            writer.F1("currentMode");
            EditOrderMode_ResponseAdapter.b(writer, customScalarAdapters, value.d);
        }
    }
}
