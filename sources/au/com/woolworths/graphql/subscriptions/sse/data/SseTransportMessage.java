package au.com.woolworths.graphql.subscriptions.sse.data;

import YU.a;
import androidx.camera.core.impl.b;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Executables;
import com.google.android.gms.actions.SearchIntents;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/graphql/subscriptions/sse/data/SseTransportMessage;", "", "MessageType", "Request", "Response", "Operation", "Lau/com/woolworths/graphql/subscriptions/sse/data/SseTransportMessage$Request;", "Lau/com/woolworths/graphql/subscriptions/sse/data/SseTransportMessage$Response;", "sse-protocol"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class SseTransportMessage {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/subscriptions/sse/data/SseTransportMessage$MessageType;", "", "sse-protocol"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class MessageType {

        /* renamed from: a, reason: collision with root package name */
        public final String f9042a = "connection_init";
        public final String b = "connection_ack";
        public final String c = "start";
        public final String d = "complete";
        public final String e = "error";

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MessageType)) {
                return false;
            }
            MessageType messageType = (MessageType) obj;
            return Intrinsics.c(this.f9042a, messageType.f9042a) && Intrinsics.c(this.b, messageType.b) && Intrinsics.c(this.c, messageType.c) && Intrinsics.c(this.d, messageType.d) && Intrinsics.c(this.e, messageType.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + b.c(b.c(b.c(this.f9042a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sbV = a.v("MessageType(initRequest=", this.f9042a, ", acknowledgeResponse=", this.b, ", startRequest=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", stopRequest=", this.d, ", errorResponse=");
            return a.o(sbV, this.e, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lau/com/woolworths/graphql/subscriptions/sse/data/SseTransportMessage$Operation;", "", "", "operationName", SearchIntents.EXTRA_QUERY, "", "variables", "ttl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "Ljava/lang/String;", "getOperationName", "()Ljava/lang/String;", "getQuery", "Ljava/util/Map;", "getVariables", "()Ljava/util/Map;", "getTtl", "sse-protocol"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Operation {

        @SerializedName("operationName")
        @Nullable
        private final String operationName;

        @SerializedName(SearchIntents.EXTRA_QUERY)
        @Nullable
        private final String query;

        @SerializedName("ttl")
        @Nullable
        private final String ttl;

        @SerializedName("variables")
        @NotNull
        private final Map<String, Object> variables;

        public Operation() {
            this(null, null, null, null, 15, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Operation)) {
                return false;
            }
            Operation operation = (Operation) obj;
            return Intrinsics.c(this.operationName, operation.operationName) && Intrinsics.c(this.query, operation.query) && Intrinsics.c(this.variables, operation.variables) && Intrinsics.c(this.ttl, operation.ttl);
        }

        public final int hashCode() {
            String str = this.operationName;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.query;
            int iD = d.d(this.variables, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
            String str3 = this.ttl;
            return iD + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            String str = this.operationName;
            String str2 = this.query;
            Map<String, Object> map = this.variables;
            String str3 = this.ttl;
            StringBuilder sbV = a.v("Operation(operationName=", str, ", query=", str2, ", variables=");
            sbV.append(map);
            sbV.append(", ttl=");
            sbV.append(str3);
            sbV.append(")");
            return sbV.toString();
        }

        public Operation(@Nullable String str, @Nullable String str2, @NotNull Map<String, ? extends Object> variables, @Nullable String str3) {
            Intrinsics.h(variables, "variables");
            this.operationName = str;
            this.query = str2;
            this.variables = variables;
            this.ttl = str3;
        }

        public /* synthetic */ Operation(String str, String str2, Map map, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? EmptyMap.d : map, (i & 8) != 0 ? null : str3);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lau/com/woolworths/graphql/subscriptions/sse/data/SseTransportMessage$Response;", "Lau/com/woolworths/graphql/subscriptions/sse/data/SseTransportMessage;", "", "type", "", "success", "error", "Lau/com/woolworths/graphql/subscriptions/sse/data/SseTransportMessage$Response$ConnectionData;", "connectionData", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lau/com/woolworths/graphql/subscriptions/sse/data/SseTransportMessage$Response$ConnectionData;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "getSuccess", "()Ljava/lang/Boolean;", "getError", "Lau/com/woolworths/graphql/subscriptions/sse/data/SseTransportMessage$Response$ConnectionData;", "a", "()Lau/com/woolworths/graphql/subscriptions/sse/data/SseTransportMessage$Response$ConnectionData;", "ConnectionData", "sse-protocol"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Response extends SseTransportMessage {

        @SerializedName("payload")
        @Nullable
        private final ConnectionData connectionData;

        @SerializedName("error")
        @Nullable
        private final String error;

        @SerializedName("success")
        @Nullable
        private final Boolean success;

        @SerializedName("type")
        @Nullable
        private final String type;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/graphql/subscriptions/sse/data/SseTransportMessage$Response$ConnectionData;", "", "", "connectionId", "connectionUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "sse-protocol"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ConnectionData {

            @SerializedName("connection-id")
            @NotNull
            private final String connectionId;

            @SerializedName("connection-url")
            @NotNull
            private final String connectionUrl;

            public ConnectionData(@NotNull String connectionId, @NotNull String connectionUrl) {
                Intrinsics.h(connectionId, "connectionId");
                Intrinsics.h(connectionUrl, "connectionUrl");
                this.connectionId = connectionId;
                this.connectionUrl = connectionUrl;
            }

            /* renamed from: a, reason: from getter */
            public final String getConnectionId() {
                return this.connectionId;
            }

            /* renamed from: b, reason: from getter */
            public final String getConnectionUrl() {
                return this.connectionUrl;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ConnectionData)) {
                    return false;
                }
                ConnectionData connectionData = (ConnectionData) obj;
                return Intrinsics.c(this.connectionId, connectionData.connectionId) && Intrinsics.c(this.connectionUrl, connectionData.connectionUrl);
            }

            public final int hashCode() {
                return this.connectionUrl.hashCode() + (this.connectionId.hashCode() * 31);
            }

            public final String toString() {
                return a.j("ConnectionData(connectionId=", this.connectionId, ", connectionUrl=", this.connectionUrl, ")");
            }
        }

        public Response() {
            this(null, null, null, null, 15, null);
        }

        /* renamed from: a, reason: from getter */
        public final ConnectionData getConnectionData() {
            return this.connectionData;
        }

        /* renamed from: b, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Response)) {
                return false;
            }
            Response response = (Response) obj;
            return Intrinsics.c(this.type, response.type) && Intrinsics.c(this.success, response.success) && Intrinsics.c(this.error, response.error) && Intrinsics.c(this.connectionData, response.connectionData);
        }

        public final int hashCode() {
            String str = this.type;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.success;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.error;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            ConnectionData connectionData = this.connectionData;
            return iHashCode3 + (connectionData != null ? connectionData.hashCode() : 0);
        }

        public final String toString() {
            return "Response(type=" + this.type + ", success=" + this.success + ", error=" + this.error + ", connectionData=" + this.connectionData + ")";
        }

        public Response(@Nullable String str, @Nullable Boolean bool, @Nullable String str2, @Nullable ConnectionData connectionData) {
            this.type = str;
            this.success = bool;
            this.error = str2;
            this.connectionData = connectionData;
        }

        public /* synthetic */ Response(String str, Boolean bool, String str2, ConnectionData connectionData, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : connectionData);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lau/com/woolworths/graphql/subscriptions/sse/data/SseTransportMessage$Request;", "Lau/com/woolworths/graphql/subscriptions/sse/data/SseTransportMessage;", "", "type", "Ljava/util/UUID;", "subscriptionId", "connectionId", "Lau/com/woolworths/graphql/subscriptions/sse/data/SseTransportMessage$Operation;", "operation", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;Lau/com/woolworths/graphql/subscriptions/sse/data/SseTransportMessage$Operation;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/util/UUID;", "getSubscriptionId", "()Ljava/util/UUID;", "getConnectionId", "Lau/com/woolworths/graphql/subscriptions/sse/data/SseTransportMessage$Operation;", "getOperation", "()Lau/com/woolworths/graphql/subscriptions/sse/data/SseTransportMessage$Operation;", "Companion", "sse-protocol"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Request extends SseTransportMessage {

        @SerializedName("connectionId")
        @Nullable
        private final String connectionId;

        @SerializedName("payload")
        @Nullable
        private final Operation operation;

        @SerializedName("id")
        @Nullable
        private final UUID subscriptionId;

        @SerializedName("type")
        @NotNull
        private final String type;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/subscriptions/sse/data/SseTransportMessage$Request$Companion;", "", "sse-protocol"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public static Request a(UUID uuid, String connectionId, MessageType messageType, com.apollographql.apollo.api.Operation operation, CustomScalarAdapters customScalarAdapters) {
                Intrinsics.h(connectionId, "connectionId");
                Intrinsics.h(messageType, "messageType");
                Intrinsics.h(customScalarAdapters, "customScalarAdapters");
                return new Request(messageType.c, uuid, connectionId, new Operation(operation.name(), operation.document(), Executables.a(operation, customScalarAdapters, false).f13516a, null, 8, null));
            }
        }

        public Request(@NotNull String type, @Nullable UUID uuid, @Nullable String str, @Nullable Operation operation) {
            Intrinsics.h(type, "type");
            this.type = type;
            this.subscriptionId = uuid;
            this.connectionId = str;
            this.operation = operation;
        }

        /* renamed from: a, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Request)) {
                return false;
            }
            Request request = (Request) obj;
            return Intrinsics.c(this.type, request.type) && Intrinsics.c(this.subscriptionId, request.subscriptionId) && Intrinsics.c(this.connectionId, request.connectionId) && Intrinsics.c(this.operation, request.operation);
        }

        public final int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            UUID uuid = this.subscriptionId;
            int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
            String str = this.connectionId;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Operation operation = this.operation;
            return iHashCode3 + (operation != null ? operation.hashCode() : 0);
        }

        public final String toString() {
            return "Request(type=" + this.type + ", subscriptionId=" + this.subscriptionId + ", connectionId=" + this.connectionId + ", operation=" + this.operation + ")";
        }

        public /* synthetic */ Request(String str, UUID uuid, String str2, Operation operation, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : uuid, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : operation);
        }
    }
}
