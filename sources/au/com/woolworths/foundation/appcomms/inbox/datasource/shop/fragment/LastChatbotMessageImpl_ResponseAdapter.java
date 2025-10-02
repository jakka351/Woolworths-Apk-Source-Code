package au.com.woolworths.foundation.appcomms.inbox.datasource.shop.fragment;

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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/fragment/LastChatbotMessageImpl_ResponseAdapter;", "", "LastChatbotMessage", "inbox-datasource-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LastChatbotMessageImpl_ResponseAdapter {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/fragment/LastChatbotMessageImpl_ResponseAdapter$LastChatbotMessage;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/fragment/LastChatbotMessage;", "inbox-datasource-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LastChatbotMessage implements Adapter<au.com.woolworths.foundation.appcomms.inbox.datasource.shop.fragment.LastChatbotMessage> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f8465a = CollectionsKt.R("title", "body", "source", "unreadChatbotMsgCount");

        public static au.com.woolworths.foundation.appcomms.inbox.datasource.shop.fragment.LastChatbotMessage a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            Integer num = null;
            while (true) {
                int iO2 = reader.o2(f8465a);
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
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "body");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, "source");
                throw null;
            }
            if (num != null) {
                return new au.com.woolworths.foundation.appcomms.inbox.datasource.shop.fragment.LastChatbotMessage(num.intValue(), str, str2, str3);
            }
            Assertions.a(reader, "unreadChatbotMsgCount");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, au.com.woolworths.foundation.appcomms.inbox.datasource.shop.fragment.LastChatbotMessage value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f8464a);
            writer.F1("body");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("source");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("unreadChatbotMsgCount");
            Adapters.b.toJson(writer, customScalarAdapters, Integer.valueOf(value.d));
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (au.com.woolworths.foundation.appcomms.inbox.datasource.shop.fragment.LastChatbotMessage) obj);
        }
    }
}
