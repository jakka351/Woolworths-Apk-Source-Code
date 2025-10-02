package me.oriient.internal.services.eventManager.model;

import androidx.annotation.Keep;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import me.oriient.internal.infra.rest.e;
import me.oriient.internal.infra.serializerJson.JsonHelpersKt;
import me.oriient.internal.infra.serializerJson.JsonableString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u0000 <2\u00020\u0001:\u0002=<B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000eBk\b\u0011\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\n\u0010\u0014J(\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018HÁ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\"J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\"J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\"J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\"JV\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\"J\u0010\u0010,\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b1\u00102R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b5\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b6\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b7\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b8\u0010\"R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b9\u0010\"R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b:\u0010\"R\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u00103\u001a\u0004\b;\u0010\"¨\u0006>"}, d2 = {"Lme/oriient/internal/services/eventManager/model/UnsubscribeMessage;", "Lme/oriient/internal/services/eventManager/model/d;", "", "topic", "requestId", "userSessionId", "jwt", "senderName", "senderId", "spaceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lme/oriient/internal/services/eventManager/model/EventManagerContext;", "context", "(Lme/oriient/internal/services/eventManager/model/EventManagerContext;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "type", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$internal_publishRelease", "(Lme/oriient/internal/services/eventManager/model/UnsubscribeMessage;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lkotlinx/serialization/json/JsonElement;", "toJsonElement", "()Lkotlinx/serialization/json/JsonElement;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lme/oriient/internal/services/eventManager/model/UnsubscribeMessage;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTopic", "getRequestId", "getUserSessionId", "getJwt", "getSenderName", "getSenderId", "getSpaceId", "getType", "Companion", "$serializer", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class UnsubscribeMessage implements d {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private final String jwt;

    @NotNull
    private final String requestId;

    @NotNull
    private final String senderId;

    @NotNull
    private final String senderName;

    @NotNull
    private final String spaceId;

    @NotNull
    private final String topic;

    @NotNull
    private final String type;

    @NotNull
    private final String userSessionId;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/eventManager/model/UnsubscribeMessage$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/eventManager/model/UnsubscribeMessage;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<UnsubscribeMessage> serializer() {
            return UnsubscribeMessage$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ UnsubscribeMessage(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.a(i, 127, UnsubscribeMessage$$serializer.INSTANCE.getB());
            throw null;
        }
        this.topic = str;
        this.requestId = str2;
        this.userSessionId = str3;
        this.jwt = str4;
        this.senderName = str5;
        this.senderId = str6;
        this.spaceId = str7;
        if ((i & 128) == 0) {
            this.type = a.UNSUBSCRIBE.getPath();
        } else {
            this.type = str8;
        }
    }

    public static /* synthetic */ UnsubscribeMessage copy$default(UnsubscribeMessage unsubscribeMessage, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unsubscribeMessage.topic;
        }
        if ((i & 2) != 0) {
            str2 = unsubscribeMessage.requestId;
        }
        if ((i & 4) != 0) {
            str3 = unsubscribeMessage.userSessionId;
        }
        if ((i & 8) != 0) {
            str4 = unsubscribeMessage.jwt;
        }
        if ((i & 16) != 0) {
            str5 = unsubscribeMessage.senderName;
        }
        if ((i & 32) != 0) {
            str6 = unsubscribeMessage.senderId;
        }
        if ((i & 64) != 0) {
            str7 = unsubscribeMessage.spaceId;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return unsubscribeMessage.copy(str, str2, str11, str4, str10, str8, str9);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(UnsubscribeMessage self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.p(serialDesc, 0, self.getTopic());
        output.p(serialDesc, 1, self.getRequestId());
        output.p(serialDesc, 2, self.userSessionId);
        output.p(serialDesc, 3, self.jwt);
        output.p(serialDesc, 4, self.senderName);
        output.p(serialDesc, 5, self.senderId);
        output.p(serialDesc, 6, self.spaceId);
        if (!output.q(serialDesc, 7) && Intrinsics.c(self.getType(), a.UNSUBSCRIBE.getPath())) {
            return;
        }
        output.p(serialDesc, 7, self.getType());
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTopic() {
        return this.topic;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getUserSessionId() {
        return this.userSessionId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getJwt() {
        return this.jwt;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getSenderName() {
        return this.senderName;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getSenderId() {
        return this.senderId;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getSpaceId() {
        return this.spaceId;
    }

    @NotNull
    public final UnsubscribeMessage copy(@NotNull String topic, @NotNull String requestId, @NotNull String userSessionId, @NotNull String jwt, @NotNull String senderName, @NotNull String senderId, @NotNull String spaceId) {
        Intrinsics.h(topic, "topic");
        Intrinsics.h(requestId, "requestId");
        Intrinsics.h(userSessionId, "userSessionId");
        Intrinsics.h(jwt, "jwt");
        Intrinsics.h(senderName, "senderName");
        Intrinsics.h(senderId, "senderId");
        Intrinsics.h(spaceId, "spaceId");
        return new UnsubscribeMessage(topic, requestId, userSessionId, jwt, senderName, senderId, spaceId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnsubscribeMessage)) {
            return false;
        }
        UnsubscribeMessage unsubscribeMessage = (UnsubscribeMessage) other;
        return Intrinsics.c(this.topic, unsubscribeMessage.topic) && Intrinsics.c(this.requestId, unsubscribeMessage.requestId) && Intrinsics.c(this.userSessionId, unsubscribeMessage.userSessionId) && Intrinsics.c(this.jwt, unsubscribeMessage.jwt) && Intrinsics.c(this.senderName, unsubscribeMessage.senderName) && Intrinsics.c(this.senderId, unsubscribeMessage.senderId) && Intrinsics.c(this.spaceId, unsubscribeMessage.spaceId);
    }

    @NotNull
    public final String getJwt() {
        return this.jwt;
    }

    @Override // me.oriient.internal.services.eventManager.model.d
    @NotNull
    public String getRequestId() {
        return this.requestId;
    }

    @NotNull
    public final String getSenderId() {
        return this.senderId;
    }

    @NotNull
    public final String getSenderName() {
        return this.senderName;
    }

    @NotNull
    public final String getSpaceId() {
        return this.spaceId;
    }

    @Override // me.oriient.internal.services.eventManager.model.d
    @NotNull
    public String getTopic() {
        return this.topic;
    }

    @NotNull
    public String getType() {
        return this.type;
    }

    @NotNull
    public final String getUserSessionId() {
        return this.userSessionId;
    }

    public int hashCode() {
        return this.spaceId.hashCode() + me.oriient.internal.infra.rest.a.a(this.senderId, me.oriient.internal.infra.rest.a.a(this.senderName, me.oriient.internal.infra.rest.a.a(this.jwt, me.oriient.internal.infra.rest.a.a(this.userSessionId, me.oriient.internal.infra.rest.a.a(this.requestId, this.topic.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    @Override // me.oriient.internal.infra.serializerJson.Jsonable
    @NotNull
    public JsonElement toJsonElement() {
        return new JsonObject(MapsKt.j(new Pair("topic", JsonableString.m390toJsonElementimpl(JsonHelpersKt.toJsonableString(getTopic()))), new Pair("requestId", JsonableString.m390toJsonElementimpl(JsonHelpersKt.toJsonableString(getRequestId()))), new Pair("userSessionId", JsonableString.m390toJsonElementimpl(JsonHelpersKt.toJsonableString(this.userSessionId))), new Pair("token", JsonableString.m390toJsonElementimpl(JsonHelpersKt.toJsonableString(this.jwt))), new Pair("spaceId", JsonableString.m390toJsonElementimpl(JsonHelpersKt.toJsonableString(this.spaceId))), new Pair("senderId", JsonableString.m390toJsonElementimpl(JsonHelpersKt.toJsonableString(this.senderId))), new Pair("senderName", JsonableString.m390toJsonElementimpl(JsonHelpersKt.toJsonableString(this.senderName)))));
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("UnsubscribeMessage(topic=");
        sb.append(this.topic);
        sb.append(", requestId=");
        sb.append(this.requestId);
        sb.append(", userSessionId=");
        sb.append(this.userSessionId);
        sb.append(", jwt=");
        sb.append(this.jwt);
        sb.append(", senderName=");
        sb.append(this.senderName);
        sb.append(", senderId=");
        sb.append(this.senderId);
        sb.append(", spaceId=");
        return e.a(sb, this.spaceId, ')');
    }

    public UnsubscribeMessage(@NotNull String topic, @NotNull String requestId, @NotNull String userSessionId, @NotNull String jwt, @NotNull String senderName, @NotNull String senderId, @NotNull String spaceId) {
        Intrinsics.h(topic, "topic");
        Intrinsics.h(requestId, "requestId");
        Intrinsics.h(userSessionId, "userSessionId");
        Intrinsics.h(jwt, "jwt");
        Intrinsics.h(senderName, "senderName");
        Intrinsics.h(senderId, "senderId");
        Intrinsics.h(spaceId, "spaceId");
        this.topic = topic;
        this.requestId = requestId;
        this.userSessionId = userSessionId;
        this.jwt = jwt;
        this.senderName = senderName;
        this.senderId = senderId;
        this.spaceId = spaceId;
        this.type = a.UNSUBSCRIBE.getPath();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UnsubscribeMessage(@NotNull EventManagerContext context, @NotNull String topic, @NotNull String jwt) {
        Intrinsics.h(context, "context");
        Intrinsics.h(topic, "topic");
        Intrinsics.h(jwt, "jwt");
        String sessionId = context.getSessionId();
        String senderName = context.getSenderName();
        senderName = senderName == null ? "UnknownSenderName" : senderName;
        String senderId = context.getSenderId();
        String spaceId = context.getSpaceId();
        String string = UUID.randomUUID().toString();
        Intrinsics.e(string);
        this(topic, string, sessionId, jwt, senderName, senderId, spaceId);
    }
}
