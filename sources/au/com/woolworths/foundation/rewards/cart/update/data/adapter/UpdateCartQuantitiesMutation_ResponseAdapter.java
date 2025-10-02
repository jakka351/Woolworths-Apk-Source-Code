package au.com.woolworths.foundation.rewards.cart.update.data.adapter;

import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.foundation.rewards.cart.update.data.UpdateCartQuantitiesMutation;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$IntAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/rewards/cart/update/data/adapter/UpdateCartQuantitiesMutation_ResponseAdapter;", "", "Data", "UpdateCartQuantitiesPage", "UpdateCartQuantitiesPage1", "UpdatedCartQuantity", "cart-update-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UpdateCartQuantitiesMutation_ResponseAdapter {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/rewards/cart/update/data/adapter/UpdateCartQuantitiesMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/rewards/cart/update/data/UpdateCartQuantitiesMutation$Data;", "cart-update-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<UpdateCartQuantitiesMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f8562a = new Data();
        public static final List b = CollectionsKt.Q("updateCartQuantitiesPage");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            UpdateCartQuantitiesMutation.UpdateCartQuantitiesPage updateCartQuantitiesPage = null;
            while (reader.o2(b) == 0) {
                updateCartQuantitiesPage = (UpdateCartQuantitiesMutation.UpdateCartQuantitiesPage) Adapters.c(UpdateCartQuantitiesPage.f8563a, false).fromJson(reader, customScalarAdapters);
            }
            if (updateCartQuantitiesPage != null) {
                return new UpdateCartQuantitiesMutation.Data(updateCartQuantitiesPage);
            }
            Assertions.a(reader, "updateCartQuantitiesPage");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdateCartQuantitiesMutation.Data value = (UpdateCartQuantitiesMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("updateCartQuantitiesPage");
            Adapters.c(UpdateCartQuantitiesPage.f8563a, false).toJson(writer, customScalarAdapters, value.f8558a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/rewards/cart/update/data/adapter/UpdateCartQuantitiesMutation_ResponseAdapter$UpdateCartQuantitiesPage;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/rewards/cart/update/data/UpdateCartQuantitiesMutation$UpdateCartQuantitiesPage;", "cart-update-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UpdateCartQuantitiesPage implements Adapter<UpdateCartQuantitiesMutation.UpdateCartQuantitiesPage> {

        /* renamed from: a, reason: collision with root package name */
        public static final UpdateCartQuantitiesPage f8563a = new UpdateCartQuantitiesPage();
        public static final List b = CollectionsKt.Q("updateCartQuantitiesPage");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            UpdateCartQuantitiesMutation.UpdateCartQuantitiesPage1 updateCartQuantitiesPage1 = null;
            while (reader.o2(b) == 0) {
                updateCartQuantitiesPage1 = (UpdateCartQuantitiesMutation.UpdateCartQuantitiesPage1) Adapters.b(Adapters.c(UpdateCartQuantitiesPage1.f8564a, false)).fromJson(reader, customScalarAdapters);
            }
            return new UpdateCartQuantitiesMutation.UpdateCartQuantitiesPage(updateCartQuantitiesPage1);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdateCartQuantitiesMutation.UpdateCartQuantitiesPage value = (UpdateCartQuantitiesMutation.UpdateCartQuantitiesPage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("updateCartQuantitiesPage");
            Adapters.b(Adapters.c(UpdateCartQuantitiesPage1.f8564a, false)).toJson(writer, customScalarAdapters, value.f8559a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/rewards/cart/update/data/adapter/UpdateCartQuantitiesMutation_ResponseAdapter$UpdateCartQuantitiesPage1;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/rewards/cart/update/data/UpdateCartQuantitiesMutation$UpdateCartQuantitiesPage1;", "cart-update-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UpdateCartQuantitiesPage1 implements Adapter<UpdateCartQuantitiesMutation.UpdateCartQuantitiesPage1> {

        /* renamed from: a, reason: collision with root package name */
        public static final UpdateCartQuantitiesPage1 f8564a = new UpdateCartQuantitiesPage1();
        public static final List b = CollectionsKt.R("productCount", "updatedCartQuantities", "totalProductCount", "totalProductCountAltText", "totalPrice");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Integer num;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num2 = null;
            Integer num3 = null;
            List list = null;
            String str = null;
            Object objFromJson = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 != 0) {
                    if (iO2 == 1) {
                        num = num3;
                        list = (List) Adapters.b(Adapters.a(Adapters.c(UpdatedCartQuantity.f8565a, false))).fromJson(reader, customScalarAdapters);
                    } else if (iO2 == 2) {
                        num3 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                    } else if (iO2 == 3) {
                        num = num3;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                    } else {
                        if (iO2 != 4) {
                            break;
                        }
                        num = num3;
                        objFromJson = Adapters.g.fromJson(reader, customScalarAdapters);
                    }
                    num3 = num;
                } else {
                    num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                }
            }
            Integer num4 = num3;
            if (num2 == null) {
                Assertions.a(reader, "productCount");
                throw null;
            }
            int iIntValue = num2.intValue();
            if (num4 == null) {
                Assertions.a(reader, "totalProductCount");
                throw null;
            }
            int iIntValue2 = num4.intValue();
            if (str == null) {
                Assertions.a(reader, "totalProductCountAltText");
                throw null;
            }
            if (objFromJson != null) {
                return new UpdateCartQuantitiesMutation.UpdateCartQuantitiesPage1(iIntValue, list, iIntValue2, str, objFromJson);
            }
            Assertions.a(reader, "totalPrice");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdateCartQuantitiesMutation.UpdateCartQuantitiesPage1 value = (UpdateCartQuantitiesMutation.UpdateCartQuantitiesPage1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productCount");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.f8560a, adapters$IntAdapter$1, writer, customScalarAdapters, "updatedCartQuantities");
            Adapters.b(Adapters.a(Adapters.c(UpdatedCartQuantity.f8565a, false))).toJson(writer, customScalarAdapters, value.b);
            writer.F1("totalProductCount");
            d.y(value.c, adapters$IntAdapter$1, writer, customScalarAdapters, "totalProductCountAltText");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.d);
            writer.F1("totalPrice");
            Adapters.g.toJson(writer, customScalarAdapters, value.e);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/rewards/cart/update/data/adapter/UpdateCartQuantitiesMutation_ResponseAdapter$UpdatedCartQuantity;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/rewards/cart/update/data/UpdateCartQuantitiesMutation$UpdatedCartQuantity;", "cart-update-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UpdatedCartQuantity implements Adapter<UpdateCartQuantitiesMutation.UpdatedCartQuantity> {

        /* renamed from: a, reason: collision with root package name */
        public static final UpdatedCartQuantity f8565a = new UpdatedCartQuantity();
        public static final List b = CollectionsKt.R("productId", "updatedQuantity", "success");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Integer num = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "productId");
                throw null;
            }
            if (num == null) {
                Assertions.a(reader, "updatedQuantity");
                throw null;
            }
            int iIntValue = num.intValue();
            if (bool != null) {
                return new UpdateCartQuantitiesMutation.UpdatedCartQuantity(str, iIntValue, bool.booleanValue());
            }
            Assertions.a(reader, "success");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdateCartQuantitiesMutation.UpdatedCartQuantity value = (UpdateCartQuantitiesMutation.UpdatedCartQuantity) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productId");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f8561a);
            writer.F1("updatedQuantity");
            d.y(value.b, Adapters.b, writer, customScalarAdapters, "success");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.c));
        }
    }
}
