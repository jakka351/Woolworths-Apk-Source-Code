package au.com.woolworths.foundation.appcomms.inbox.datasource.shop.adapter;

import au.com.woolworths.foundation.appcomms.inbox.datasource.shop.NotificationMessagesQuery;
import au.com.woolworths.foundation.appcomms.inbox.datasource.shop.fragment.NotificationMessageImpl_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/adapter/NotificationMessagesQuery_ResponseAdapter;", "", "Data", "NotificationMessage", "inbox-datasource-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationMessagesQuery_ResponseAdapter {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/adapter/NotificationMessagesQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/NotificationMessagesQuery$Data;", "inbox-datasource-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<NotificationMessagesQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f8462a = new Data();
        public static final List b = CollectionsKt.Q("notificationMessages");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(b) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(NotificationMessage.f8463a, true)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new NotificationMessagesQuery.Data(arrayListFromJson);
            }
            Assertions.a(reader, "notificationMessages");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            NotificationMessagesQuery.Data value = (NotificationMessagesQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("notificationMessages");
            Adapters.a(Adapters.c(NotificationMessage.f8463a, true)).toJson(writer, customScalarAdapters, value.f8454a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/adapter/NotificationMessagesQuery_ResponseAdapter$NotificationMessage;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/NotificationMessagesQuery$NotificationMessage;", "inbox-datasource-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NotificationMessage implements Adapter<NotificationMessagesQuery.NotificationMessage> {

        /* renamed from: a, reason: collision with root package name */
        public static final NotificationMessage f8463a = new NotificationMessage();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            au.com.woolworths.foundation.appcomms.inbox.datasource.shop.fragment.NotificationMessage notificationMessageA = NotificationMessageImpl_ResponseAdapter.NotificationMessage.a(reader, customScalarAdapters);
            if (str != null) {
                return new NotificationMessagesQuery.NotificationMessage(str, notificationMessageA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            NotificationMessagesQuery.NotificationMessage value = (NotificationMessagesQuery.NotificationMessage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f8455a);
            List list = NotificationMessageImpl_ResponseAdapter.NotificationMessage.f8469a;
            NotificationMessageImpl_ResponseAdapter.NotificationMessage.b(writer, customScalarAdapters, value.b);
        }
    }
}
