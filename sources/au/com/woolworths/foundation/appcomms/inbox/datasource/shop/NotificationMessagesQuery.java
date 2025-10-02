package au.com.woolworths.foundation.appcomms.inbox.datasource.shop;

import au.com.woolworths.android.onesite.a;
import au.com.woolworths.foundation.appcomms.inbox.datasource.shop.adapter.NotificationMessagesQuery_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/NotificationMessagesQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/NotificationMessagesQuery$Data;", "Data", "NotificationMessage", "Companion", "inbox-datasource-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationMessagesQuery implements Query<Data> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/NotificationMessagesQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "inbox-datasource-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/NotificationMessagesQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "inbox-datasource-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f8454a;

        public Data(ArrayList arrayList) {
            this.f8454a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && this.f8454a.equals(((Data) obj).f8454a);
        }

        public final int hashCode() {
            return this.f8454a.hashCode();
        }

        public final String toString() {
            return a.k("Data(notificationMessages=", ")", this.f8454a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/NotificationMessagesQuery$NotificationMessage;", "", "inbox-datasource-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NotificationMessage {

        /* renamed from: a, reason: collision with root package name */
        public final String f8455a;
        public final au.com.woolworths.foundation.appcomms.inbox.datasource.shop.fragment.NotificationMessage b;

        public NotificationMessage(String str, au.com.woolworths.foundation.appcomms.inbox.datasource.shop.fragment.NotificationMessage notificationMessage) {
            this.f8455a = str;
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
            return Intrinsics.c(this.f8455a, notificationMessage.f8455a) && Intrinsics.c(this.b, notificationMessage.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f8455a.hashCode() * 31);
        }

        public final String toString() {
            return "NotificationMessage(__typename=" + this.f8455a + ", notificationMessage=" + this.b + ")";
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(NotificationMessagesQuery_ResponseAdapter.Data.f8462a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query NotificationMessages { notificationMessages { __typename ...NotificationMessage } }  fragment NotificationMessage on NCMessage { id campaignCode campaignVariant title body cta { label url } createdOn ttl }";
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == NotificationMessagesQuery.class;
    }

    public final int hashCode() {
        return Reflection.f24268a.b(NotificationMessagesQuery.class).hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "70a22f19a4f04c950383a5b7563b49922054c48affe1a64b219dcc5dd09699c8";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "NotificationMessages";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
    }
}
