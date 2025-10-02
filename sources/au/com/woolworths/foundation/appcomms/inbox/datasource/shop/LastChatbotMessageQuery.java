package au.com.woolworths.foundation.appcomms.inbox.datasource.shop;

import au.com.woolworths.foundation.appcomms.inbox.datasource.shop.adapter.LastChatbotMessageQuery_ResponseAdapter;
import au.com.woolworths.foundation.appcomms.inbox.datasource.shop.fragment.LastChatbotMessage;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/LastChatbotMessageQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/LastChatbotMessageQuery$Data;", "Data", "LastChatbotMsg", "Companion", "inbox-datasource-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LastChatbotMessageQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f8447a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/LastChatbotMessageQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "inbox-datasource-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/LastChatbotMessageQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "inbox-datasource-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final LastChatbotMsg f8448a;

        public Data(LastChatbotMsg lastChatbotMsg) {
            this.f8448a = lastChatbotMsg;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f8448a, ((Data) obj).f8448a);
        }

        public final int hashCode() {
            return this.f8448a.hashCode();
        }

        public final String toString() {
            return "Data(lastChatbotMsg=" + this.f8448a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/LastChatbotMessageQuery$LastChatbotMsg;", "", "inbox-datasource-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LastChatbotMsg {

        /* renamed from: a, reason: collision with root package name */
        public final String f8449a;
        public final LastChatbotMessage b;

        public LastChatbotMsg(String str, LastChatbotMessage lastChatbotMessage) {
            this.f8449a = str;
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
            return Intrinsics.c(this.f8449a, lastChatbotMsg.f8449a) && Intrinsics.c(this.b, lastChatbotMsg.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f8449a.hashCode() * 31);
        }

        public final String toString() {
            return "LastChatbotMsg(__typename=" + this.f8449a + ", lastChatbotMessage=" + this.b + ")";
        }
    }

    public LastChatbotMessageQuery(Optional optional) {
        this.f8447a = optional;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(LastChatbotMessageQuery_ResponseAdapter.Data.f8457a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query LastChatbotMessage($chatbotSessionId: String) { lastChatbotMsg(chatbotSessionId: $chatbotSessionId) { __typename ...LastChatbotMessage } }  fragment LastChatbotMessage on LastChatbotMsg { title body source unreadChatbotMsgCount }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LastChatbotMessageQuery) && Intrinsics.c(this.f8447a, ((LastChatbotMessageQuery) obj).f8447a);
    }

    public final int hashCode() {
        return this.f8447a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "8a30c29704bc41edeba4a808ecd7de313ba16f6e7c087d2b553c8ce18426dfc6";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "LastChatbotMessage";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Optional optional = this.f8447a;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("chatbotSessionId");
            Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        }
    }

    public final String toString() {
        return "LastChatbotMessageQuery(chatbotSessionId=" + this.f8447a + ")";
    }
}
