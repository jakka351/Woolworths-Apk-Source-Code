package au.com.woolworths.foundation.shop.editorder.adapter;

import au.com.woolworths.foundation.shop.editorder.EditOrderStatusQuery;
import au.com.woolworths.shop.graphql.type.EditOrderMode;
import au.com.woolworths.shop.graphql.type.adapter.EditOrderMode_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/adapter/EditOrderStatusQuery_ResponseAdapter;", "", "Data", "EditOrderStatus", "Details", "Banner", "Confirmation", "Message", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EditOrderStatusQuery_ResponseAdapter {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/adapter/EditOrderStatusQuery_ResponseAdapter$Banner;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/shop/editorder/EditOrderStatusQuery$Banner;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Banner implements Adapter<EditOrderStatusQuery.Banner> {

        /* renamed from: a, reason: collision with root package name */
        public static final Banner f8732a = new Banner();
        public static final List b = CollectionsKt.R("title", "message", "buttonTitle", "confirmation");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            EditOrderStatusQuery.Confirmation confirmation = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    confirmation = (EditOrderStatusQuery.Confirmation) Adapters.c(Confirmation.f8733a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "message");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, "buttonTitle");
                throw null;
            }
            if (confirmation != null) {
                return new EditOrderStatusQuery.Banner(str, str2, str3, confirmation);
            }
            Assertions.a(reader, "confirmation");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EditOrderStatusQuery.Banner value = (EditOrderStatusQuery.Banner) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f8723a);
            writer.F1("message");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("buttonTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("confirmation");
            Adapters.c(Confirmation.f8733a, false).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/adapter/EditOrderStatusQuery_ResponseAdapter$Confirmation;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/shop/editorder/EditOrderStatusQuery$Confirmation;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Confirmation implements Adapter<EditOrderStatusQuery.Confirmation> {

        /* renamed from: a, reason: collision with root package name */
        public static final Confirmation f8733a = new Confirmation();
        public static final List b = CollectionsKt.R("title", "message");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 != null) {
                return new EditOrderStatusQuery.Confirmation(str, str2);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EditOrderStatusQuery.Confirmation value = (EditOrderStatusQuery.Confirmation) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f8724a);
            writer.F1("message");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/adapter/EditOrderStatusQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/shop/editorder/EditOrderStatusQuery$Data;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<EditOrderStatusQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f8734a = new Data();
        public static final List b = CollectionsKt.Q("editOrderStatus");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            EditOrderStatusQuery.EditOrderStatus editOrderStatus = null;
            while (reader.o2(b) == 0) {
                editOrderStatus = (EditOrderStatusQuery.EditOrderStatus) Adapters.c(EditOrderStatus.f8736a, false).fromJson(reader, customScalarAdapters);
            }
            if (editOrderStatus != null) {
                return new EditOrderStatusQuery.Data(editOrderStatus);
            }
            Assertions.a(reader, "editOrderStatus");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EditOrderStatusQuery.Data value = (EditOrderStatusQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("editOrderStatus");
            Adapters.c(EditOrderStatus.f8736a, false).toJson(writer, customScalarAdapters, value.f8725a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/adapter/EditOrderStatusQuery_ResponseAdapter$Details;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/shop/editorder/EditOrderStatusQuery$Details;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Details implements Adapter<EditOrderStatusQuery.Details> {

        /* renamed from: a, reason: collision with root package name */
        public static final Details f8735a = new Details();
        public static final List b = CollectionsKt.R("orderId", "banner");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            EditOrderStatusQuery.Banner banner = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    banner = (EditOrderStatusQuery.Banner) Adapters.c(Banner.f8732a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "orderId");
                throw null;
            }
            if (banner != null) {
                return new EditOrderStatusQuery.Details(str, banner);
            }
            Assertions.a(reader, "banner");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EditOrderStatusQuery.Details value = (EditOrderStatusQuery.Details) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("orderId");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f8726a);
            writer.F1("banner");
            Adapters.c(Banner.f8732a, false).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/adapter/EditOrderStatusQuery_ResponseAdapter$EditOrderStatus;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/shop/editorder/EditOrderStatusQuery$EditOrderStatus;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EditOrderStatus implements Adapter<EditOrderStatusQuery.EditOrderStatus> {

        /* renamed from: a, reason: collision with root package name */
        public static final EditOrderStatus f8736a = new EditOrderStatus();
        public static final List b = CollectionsKt.R("mode", ErrorBundle.DETAIL_ENTRY, "message");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            EditOrderMode editOrderModeA = null;
            EditOrderStatusQuery.Details details = null;
            EditOrderStatusQuery.Message message = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    editOrderModeA = EditOrderMode_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    details = (EditOrderStatusQuery.Details) Adapters.b(Adapters.c(Details.f8735a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    message = (EditOrderStatusQuery.Message) Adapters.b(Adapters.c(Message.f8737a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (editOrderModeA != null) {
                return new EditOrderStatusQuery.EditOrderStatus(editOrderModeA, details, message);
            }
            Assertions.a(reader, "mode");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EditOrderStatusQuery.EditOrderStatus value = (EditOrderStatusQuery.EditOrderStatus) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("mode");
            EditOrderMode_ResponseAdapter.b(writer, customScalarAdapters, value.f8727a);
            writer.F1(ErrorBundle.DETAIL_ENTRY);
            Adapters.b(Adapters.c(Details.f8735a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("message");
            Adapters.b(Adapters.c(Message.f8737a, false)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/adapter/EditOrderStatusQuery_ResponseAdapter$Message;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/shop/editorder/EditOrderStatusQuery$Message;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Message implements Adapter<EditOrderStatusQuery.Message> {

        /* renamed from: a, reason: collision with root package name */
        public static final Message f8737a = new Message();
        public static final List b = CollectionsKt.R("title", "message", "buttonTitle");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "message");
                throw null;
            }
            if (str3 != null) {
                return new EditOrderStatusQuery.Message(str, str2, str3);
            }
            Assertions.a(reader, "buttonTitle");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EditOrderStatusQuery.Message value = (EditOrderStatusQuery.Message) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f8728a);
            writer.F1("message");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("buttonTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }
}
