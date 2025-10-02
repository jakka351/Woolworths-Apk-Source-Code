package au.com.woolworths.foundation.appcomms.inbox.datasource.shop.adapter;

import au.com.woolworths.foundation.appcomms.inbox.datasource.shop.LastChatbotMessageQuery;
import au.com.woolworths.foundation.appcomms.inbox.datasource.shop.fragment.LastChatbotMessage;
import au.com.woolworths.foundation.appcomms.inbox.datasource.shop.fragment.LastChatbotMessageImpl_ResponseAdapter;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/adapter/LastChatbotMessageQuery_ResponseAdapter;", "", "Data", "LastChatbotMsg", "inbox-datasource-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LastChatbotMessageQuery_ResponseAdapter {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/adapter/LastChatbotMessageQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/LastChatbotMessageQuery$Data;", "inbox-datasource-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<LastChatbotMessageQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f8457a = new Data();
        public static final List b = CollectionsKt.Q("lastChatbotMsg");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            LastChatbotMessageQuery.LastChatbotMsg lastChatbotMsg = null;
            while (reader.o2(b) == 0) {
                lastChatbotMsg = (LastChatbotMessageQuery.LastChatbotMsg) Adapters.c(LastChatbotMsg.f8458a, true).fromJson(reader, customScalarAdapters);
            }
            if (lastChatbotMsg != null) {
                return new LastChatbotMessageQuery.Data(lastChatbotMsg);
            }
            Assertions.a(reader, "lastChatbotMsg");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            LastChatbotMessageQuery.Data value = (LastChatbotMessageQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("lastChatbotMsg");
            Adapters.c(LastChatbotMsg.f8458a, true).toJson(writer, customScalarAdapters, value.f8448a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/adapter/LastChatbotMessageQuery_ResponseAdapter$LastChatbotMsg;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/LastChatbotMessageQuery$LastChatbotMsg;", "inbox-datasource-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LastChatbotMsg implements Adapter<LastChatbotMessageQuery.LastChatbotMsg> {

        /* renamed from: a, reason: collision with root package name */
        public static final LastChatbotMsg f8458a = new LastChatbotMsg();
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
                return new LastChatbotMessageQuery.LastChatbotMsg(str, lastChatbotMessageA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            LastChatbotMessageQuery.LastChatbotMsg value = (LastChatbotMessageQuery.LastChatbotMsg) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f8449a);
            List list = LastChatbotMessageImpl_ResponseAdapter.LastChatbotMessage.f8465a;
            LastChatbotMessageImpl_ResponseAdapter.LastChatbotMessage.b(writer, customScalarAdapters, value.b);
        }
    }
}
