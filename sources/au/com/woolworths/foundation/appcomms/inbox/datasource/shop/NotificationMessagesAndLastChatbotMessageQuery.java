package au.com.woolworths.foundation.appcomms.inbox.datasource.shop;

import au.com.woolworths.foundation.appcomms.inbox.datasource.shop.adapter.NotificationMessagesAndLastChatbotMessageQuery_ResponseAdapter;
import au.com.woolworths.foundation.appcomms.inbox.datasource.shop.fragment.LastChatbotMessage;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/NotificationMessagesAndLastChatbotMessageQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/NotificationMessagesAndLastChatbotMessageQuery$Data;", "Data", "NotificationMessage", "LastChatbotMsg", "Companion", "inbox-datasource-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class NotificationMessagesAndLastChatbotMessageQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f8450a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/NotificationMessagesAndLastChatbotMessageQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "inbox-datasource-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/NotificationMessagesAndLastChatbotMessageQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "inbox-datasource-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f8451a;
        public final LastChatbotMsg b;

        public Data(ArrayList arrayList, LastChatbotMsg lastChatbotMsg) {
            this.f8451a = arrayList;
            this.b = lastChatbotMsg;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return this.f8451a.equals(data.f8451a) && this.b.equals(data.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f8451a.hashCode() * 31);
        }

        public final String toString() {
            return "Data(notificationMessages=" + this.f8451a + ", lastChatbotMsg=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/NotificationMessagesAndLastChatbotMessageQuery$LastChatbotMsg;", "", "inbox-datasource-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LastChatbotMsg {

        /* renamed from: a, reason: collision with root package name */
        public final String f8452a;
        public final LastChatbotMessage b;

        public LastChatbotMsg(String str, LastChatbotMessage lastChatbotMessage) {
            this.f8452a = str;
            this.b = lastChatbotMessage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LastChatbotMsg)) {
                return false;
            }
            LastChatbotMsg lastChatbotMsg = (LastChatbotMsg) obj;
            return Intrinsics.c(this.f8452a, lastChatbotMsg.f8452a) && Intrinsics.c(this.b, lastChatbotMsg.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f8452a.hashCode() * 31);
        }

        public final String toString() {
            return "LastChatbotMsg(__typename=" + this.f8452a + ", lastChatbotMessage=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/NotificationMessagesAndLastChatbotMessageQuery$NotificationMessage;", "", "inbox-datasource-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NotificationMessage {

        /* renamed from: a, reason: collision with root package name */
        public final String f8453a;
        public final au.com.woolworths.foundation.appcomms.inbox.datasource.shop.fragment.NotificationMessage b;

        public NotificationMessage(String str, au.com.woolworths.foundation.appcomms.inbox.datasource.shop.fragment.NotificationMessage notificationMessage) {
            this.f8453a = str;
            this.b = notificationMessage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationMessage)) {
                return false;
            }
            NotificationMessage notificationMessage = (NotificationMessage) obj;
            return Intrinsics.c(this.f8453a, notificationMessage.f8453a) && Intrinsics.c(this.b, notificationMessage.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f8453a.hashCode() * 31);
        }

        public final String toString() {
            return "NotificationMessage(__typename=" + this.f8453a + ", notificationMessage=" + this.b + ")";
        }
    }

    public NotificationMessagesAndLastChatbotMessageQuery(Optional optional) {
        this.f8450a = optional;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(NotificationMessagesAndLastChatbotMessageQuery_ResponseAdapter.Data.f8459a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query NotificationMessagesAndLastChatbotMessage($chatbotSessionId: String) { notificationMessages { __typename ...NotificationMessage } lastChatbotMsg(chatbotSessionId: $chatbotSessionId) { __typename ...LastChatbotMessage } }  fragment NotificationMessage on NCMessage { id campaignCode campaignVariant title body cta { label url } createdOn ttl }  fragment LastChatbotMessage on LastChatbotMsg { title body source unreadChatbotMsgCount }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NotificationMessagesAndLastChatbotMessageQuery) && Intrinsics.c(this.f8450a, ((NotificationMessagesAndLastChatbotMessageQuery) obj).f8450a);
    }

    public final int hashCode() {
        return this.f8450a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "b9e3c69e1f6fb2884a9974f6c8534a68c65282078b4b789fe3a09ee35e973fd3";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "NotificationMessagesAndLastChatbotMessage";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Optional optional = this.f8450a;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("chatbotSessionId");
            Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        }
    }

    public final String toString() {
        return "NotificationMessagesAndLastChatbotMessageQuery(chatbotSessionId=" + this.f8450a + ")";
    }
}
