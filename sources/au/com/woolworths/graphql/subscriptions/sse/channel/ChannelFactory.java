package au.com.woolworths.graphql.subscriptions.sse.channel;

import androidx.compose.runtime.snapshots.a;
import au.com.woolworths.graphql.subscriptions.sse.data.SseTransportMessage;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/graphql/subscriptions/sse/channel/ChannelFactory;", "", "SideChannel", "MainChannel", "sse-protocol"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChannelFactory {

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f9036a;
    public final Gson b;
    public final a c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/graphql/subscriptions/sse/channel/ChannelFactory$MainChannel;", "", "SseEvent", "SsePayloadWrapper", "sse-protocol"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface MainChannel {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/graphql/subscriptions/sse/channel/ChannelFactory$MainChannel$SseEvent;", "", "SsePayload", "SseError", "Lau/com/woolworths/graphql/subscriptions/sse/channel/ChannelFactory$MainChannel$SseEvent$SseError;", "Lau/com/woolworths/graphql/subscriptions/sse/channel/ChannelFactory$MainChannel$SseEvent$SsePayload;", "sse-protocol"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public interface SseEvent {

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/subscriptions/sse/channel/ChannelFactory$MainChannel$SseEvent$SseError;", "Lau/com/woolworths/graphql/subscriptions/sse/channel/ChannelFactory$MainChannel$SseEvent;", "sse-protocol"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class SseError implements SseEvent {

                /* renamed from: a, reason: collision with root package name */
                public final IOException f9037a;

                public SseError(IOException iOException) {
                    this.f9037a = iOException;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof SseError) && this.f9037a.equals(((SseError) obj).f9037a);
                }

                public final int hashCode() {
                    return this.f9037a.hashCode();
                }

                public final String toString() {
                    return "SseError(error=" + this.f9037a + ")";
                }
            }

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/subscriptions/sse/channel/ChannelFactory$MainChannel$SseEvent$SsePayload;", "Lau/com/woolworths/graphql/subscriptions/sse/channel/ChannelFactory$MainChannel$SseEvent;", "sse-protocol"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class SsePayload implements SseEvent {

                /* renamed from: a, reason: collision with root package name */
                public final String f9038a;
                public final String b;
                public final String c;

                public SsePayload(String str, String str2, String str3) {
                    this.f9038a = str;
                    this.b = str2;
                    this.c = str3;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof SsePayload)) {
                        return false;
                    }
                    SsePayload ssePayload = (SsePayload) obj;
                    return Intrinsics.c(this.f9038a, ssePayload.f9038a) && Intrinsics.c(this.b, ssePayload.b) && Intrinsics.c(this.c, ssePayload.c);
                }

                public final int hashCode() {
                    int iHashCode = this.f9038a.hashCode() * 31;
                    String str = this.b;
                    int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.c;
                    return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
                }

                public final String toString() {
                    return YU.a.o(YU.a.v("SsePayload(data=", this.f9038a, ", id=", this.b, ", type="), this.c, ")");
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\f\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lau/com/woolworths/graphql/subscriptions/sse/channel/ChannelFactory$MainChannel$SsePayloadWrapper;", "", "", "subscriptionId", "payload", "type", "", "activeSubscriptions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "d", "Ljava/util/List;", "a", "()Ljava/util/List;", "sse-protocol"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class SsePayloadWrapper {

            @SerializedName("activeSubscriptions")
            @Nullable
            private final List<String> activeSubscriptions;

            @SerializedName("payload")
            @NotNull
            private final String payload;

            @SerializedName("subscriptionId")
            @NotNull
            private final String subscriptionId;

            @SerializedName("type")
            @Nullable
            private final String type;

            public SsePayloadWrapper(@NotNull String subscriptionId, @NotNull String payload, @Nullable String str, @Nullable List<String> list) {
                Intrinsics.h(subscriptionId, "subscriptionId");
                Intrinsics.h(payload, "payload");
                this.subscriptionId = subscriptionId;
                this.payload = payload;
                this.type = str;
                this.activeSubscriptions = list;
            }

            /* renamed from: a, reason: from getter */
            public final List getActiveSubscriptions() {
                return this.activeSubscriptions;
            }

            /* renamed from: b, reason: from getter */
            public final String getPayload() {
                return this.payload;
            }

            /* renamed from: c, reason: from getter */
            public final String getSubscriptionId() {
                return this.subscriptionId;
            }

            /* renamed from: d, reason: from getter */
            public final String getType() {
                return this.type;
            }
        }

        void close();

        Flow getData();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/graphql/subscriptions/sse/channel/ChannelFactory$SideChannel;", "", "sse-protocol"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface SideChannel {
        SseTransportMessage.Response a(SseTransportMessage.Request request);
    }

    public ChannelFactory(OkHttpClient okHttpClient, Gson gson, a aVar) {
        Intrinsics.h(okHttpClient, "okHttpClient");
        Intrinsics.h(gson, "gson");
        this.f9036a = okHttpClient;
        this.b = gson;
        this.c = aVar;
    }
}
