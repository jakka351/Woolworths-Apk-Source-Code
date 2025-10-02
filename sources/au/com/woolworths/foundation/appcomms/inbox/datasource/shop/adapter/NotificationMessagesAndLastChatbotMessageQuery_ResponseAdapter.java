package au.com.woolworths.foundation.appcomms.inbox.datasource.shop.adapter;

import au.com.woolworths.foundation.appcomms.inbox.datasource.shop.NotificationMessagesAndLastChatbotMessageQuery;
import au.com.woolworths.foundation.appcomms.inbox.datasource.shop.fragment.LastChatbotMessage;
import au.com.woolworths.foundation.appcomms.inbox.datasource.shop.fragment.LastChatbotMessageImpl_ResponseAdapter;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/adapter/NotificationMessagesAndLastChatbotMessageQuery_ResponseAdapter;", "", "Data", "NotificationMessage", "LastChatbotMsg", "inbox-datasource-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationMessagesAndLastChatbotMessageQuery_ResponseAdapter {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/adapter/NotificationMessagesAndLastChatbotMessageQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/NotificationMessagesAndLastChatbotMessageQuery$Data;", "inbox-datasource-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<NotificationMessagesAndLastChatbotMessageQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f8459a = new Data();
        public static final List b = CollectionsKt.R("notificationMessages", "lastChatbotMsg");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            NotificationMessagesAndLastChatbotMessageQuery.LastChatbotMsg lastChatbotMsg = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    arrayListFromJson = Adapters.a(Adapters.c(NotificationMessage.f8461a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    lastChatbotMsg = (NotificationMessagesAndLastChatbotMessageQuery.LastChatbotMsg) Adapters.c(LastChatbotMsg.f8460a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "notificationMessages");
                throw null;
            }
            if (lastChatbotMsg != null) {
                return new NotificationMessagesAndLastChatbotMessageQuery.Data(arrayListFromJson, lastChatbotMsg);
            }
            Assertions.a(reader, "lastChatbotMsg");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            NotificationMessagesAndLastChatbotMessageQuery.Data value = (NotificationMessagesAndLastChatbotMessageQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("notificationMessages");
            Adapters.a(Adapters.c(NotificationMessage.f8461a, true)).toJson(writer, customScalarAdapters, value.f8451a);
            writer.F1("lastChatbotMsg");
            Adapters.c(LastChatbotMsg.f8460a, true).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/adapter/NotificationMessagesAndLastChatbotMessageQuery_ResponseAdapter$LastChatbotMsg;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/NotificationMessagesAndLastChatbotMessageQuery$LastChatbotMsg;", "inbox-datasource-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LastChatbotMsg implements Adapter<NotificationMessagesAndLastChatbotMessageQuery.LastChatbotMsg> {

        /* renamed from: a, reason: collision with root package name */
        public static final LastChatbotMsg f8460a = new LastChatbotMsg();
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
            LastChatbotMessage lastChatbotMessageA = LastChatbotMessageImpl_ResponseAdapter.LastChatbotMessage.a(reader, customScalarAdapters);
            if (str != null) {
                return new NotificationMessagesAndLastChatbotMessageQuery.LastChatbotMsg(str, lastChatbotMessageA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            NotificationMessagesAndLastChatbotMessageQuery.LastChatbotMsg value = (NotificationMessagesAndLastChatbotMessageQuery.LastChatbotMsg) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f8452a);
            List list = LastChatbotMessageImpl_ResponseAdapter.LastChatbotMessage.f8465a;
            LastChatbotMessageImpl_ResponseAdapter.LastChatbotMessage.b(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/adapter/NotificationMessagesAndLastChatbotMessageQuery_ResponseAdapter$NotificationMessage;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/NotificationMessagesAndLastChatbotMessageQuery$NotificationMessage;", "inbox-datasource-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NotificationMessage implements Adapter<NotificationMessagesAndLastChatbotMessageQuery.NotificationMessage> {

        /* renamed from: a, reason: collision with root package name */
        public static final NotificationMessage f8461a = new NotificationMessage();
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
                return new NotificationMessagesAndLastChatbotMessageQuery.NotificationMessage(str, notificationMessageA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            NotificationMessagesAndLastChatbotMessageQuery.NotificationMessage value = (NotificationMessagesAndLastChatbotMessageQuery.NotificationMessage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f8453a);
            List list = NotificationMessageImpl_ResponseAdapter.NotificationMessage.f8469a;
            NotificationMessageImpl_ResponseAdapter.NotificationMessage.b(writer, customScalarAdapters, value.b);
        }
    }
}
