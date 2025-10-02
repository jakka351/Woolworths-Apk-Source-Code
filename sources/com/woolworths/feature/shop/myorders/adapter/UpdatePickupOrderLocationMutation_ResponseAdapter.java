package com.woolworths.feature.shop.myorders.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$IntAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.myorders.UpdatePickupOrderLocationMutation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/UpdatePickupOrderLocationMutation_ResponseAdapter;", "", "Data", "UpdatePickupOrderLocation", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UpdatePickupOrderLocationMutation_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/UpdatePickupOrderLocationMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/UpdatePickupOrderLocationMutation$Data;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<UpdatePickupOrderLocationMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f20190a = new Data();
        public static final List b = CollectionsKt.Q("updatePickupOrderLocation");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            UpdatePickupOrderLocationMutation.UpdatePickupOrderLocation updatePickupOrderLocation = null;
            while (reader.o2(b) == 0) {
                updatePickupOrderLocation = (UpdatePickupOrderLocationMutation.UpdatePickupOrderLocation) Adapters.b(Adapters.c(UpdatePickupOrderLocation.f20191a, false)).fromJson(reader, customScalarAdapters);
            }
            return new UpdatePickupOrderLocationMutation.Data(updatePickupOrderLocation);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdatePickupOrderLocationMutation.Data value = (UpdatePickupOrderLocationMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("updatePickupOrderLocation");
            Adapters.b(Adapters.c(UpdatePickupOrderLocation.f20191a, false)).toJson(writer, customScalarAdapters, value.f20026a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/UpdatePickupOrderLocationMutation_ResponseAdapter$UpdatePickupOrderLocation;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/UpdatePickupOrderLocationMutation$UpdatePickupOrderLocation;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UpdatePickupOrderLocation implements Adapter<UpdatePickupOrderLocationMutation.UpdatePickupOrderLocation> {

        /* renamed from: a, reason: collision with root package name */
        public static final UpdatePickupOrderLocation f20191a = new UpdatePickupOrderLocation();
        public static final List b = CollectionsKt.R("travelTimeInSec", "bufferTimeInSec", "stopLocationTracking");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            Integer num2 = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (num == null) {
                Assertions.a(reader, "travelTimeInSec");
                throw null;
            }
            int iIntValue = num.intValue();
            if (num2 == null) {
                Assertions.a(reader, "bufferTimeInSec");
                throw null;
            }
            int iIntValue2 = num2.intValue();
            if (bool != null) {
                return new UpdatePickupOrderLocationMutation.UpdatePickupOrderLocation(iIntValue, iIntValue2, bool.booleanValue());
            }
            Assertions.a(reader, "stopLocationTracking");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdatePickupOrderLocationMutation.UpdatePickupOrderLocation value = (UpdatePickupOrderLocationMutation.UpdatePickupOrderLocation) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("travelTimeInSec");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.f20027a, adapters$IntAdapter$1, writer, customScalarAdapters, "bufferTimeInSec");
            d.y(value.b, adapters$IntAdapter$1, writer, customScalarAdapters, "stopLocationTracking");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.c));
        }
    }
}
