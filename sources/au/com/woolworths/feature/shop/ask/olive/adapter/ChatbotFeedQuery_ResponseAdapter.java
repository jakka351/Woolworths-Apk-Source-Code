package au.com.woolworths.feature.shop.ask.olive.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.feature.shop.ask.olive.ChatbotFeedQuery;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/ask/olive/adapter/ChatbotFeedQuery_ResponseAdapter;", "", "Data", "More", "Feed", "OnMoreChat", "ask-olive_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatbotFeedQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/ask/olive/adapter/ChatbotFeedQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/ask/olive/ChatbotFeedQuery$Data;", "ask-olive_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<ChatbotFeedQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f6609a = new Data();
        public static final List b = CollectionsKt.Q("more");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ChatbotFeedQuery.More more = null;
            while (reader.o2(b) == 0) {
                more = (ChatbotFeedQuery.More) Adapters.c(More.f6611a, false).fromJson(reader, customScalarAdapters);
            }
            if (more != null) {
                return new ChatbotFeedQuery.Data(more);
            }
            Assertions.a(reader, "more");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ChatbotFeedQuery.Data value = (ChatbotFeedQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("more");
            Adapters.c(More.f6611a, false).toJson(writer, customScalarAdapters, value.f6603a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/ask/olive/adapter/ChatbotFeedQuery_ResponseAdapter$Feed;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/ask/olive/ChatbotFeedQuery$Feed;", "ask-olive_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Feed implements Adapter<ChatbotFeedQuery.Feed> {

        /* renamed from: a, reason: collision with root package name */
        public static final Feed f6610a = new Feed();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ChatbotFeedQuery.OnMoreChat onMoreChatA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("MoreChat"))) {
                reader.o();
                onMoreChatA = OnMoreChat.a(reader, customScalarAdapters);
            }
            return new ChatbotFeedQuery.Feed(str, onMoreChatA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ChatbotFeedQuery.Feed value = (ChatbotFeedQuery.Feed) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f6604a);
            ChatbotFeedQuery.OnMoreChat onMoreChat = value.b;
            if (onMoreChat != null) {
                OnMoreChat.b(writer, customScalarAdapters, onMoreChat);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/ask/olive/adapter/ChatbotFeedQuery_ResponseAdapter$More;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/ask/olive/ChatbotFeedQuery$More;", "ask-olive_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class More implements Adapter<ChatbotFeedQuery.More> {

        /* renamed from: a, reason: collision with root package name */
        public static final More f6611a = new More();
        public static final List b = CollectionsKt.Q("feed");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(b) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(Feed.f6610a, true)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new ChatbotFeedQuery.More(arrayListFromJson);
            }
            Assertions.a(reader, "feed");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ChatbotFeedQuery.More value = (ChatbotFeedQuery.More) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("feed");
            Adapters.a(Adapters.c(Feed.f6610a, true)).toJson(writer, customScalarAdapters, value.f6605a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/ask/olive/adapter/ChatbotFeedQuery_ResponseAdapter$OnMoreChat;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/ask/olive/ChatbotFeedQuery$OnMoreChat;", "ask-olive_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnMoreChat implements Adapter<ChatbotFeedQuery.OnMoreChat> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f6612a = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "url");

        public static ChatbotFeedQuery.OnMoreChat a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(f6612a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new ChatbotFeedQuery.OnMoreChat(str, str2, str3);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ChatbotFeedQuery.OnMoreChat value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f6606a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("url");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ChatbotFeedQuery.OnMoreChat) obj);
        }
    }
}
