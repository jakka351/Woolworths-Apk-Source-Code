package me.oriient.internal.services.eventManager.model;

import androidx.annotation.Keep;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import me.oriient.internal.infra.serializerJson.JsonHelpersKt;
import me.oriient.internal.infra.serializerJson.Jsonable;
import me.oriient.internal.infra.serializerJson.JsonableString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u0000 L*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0004:\u0002MLBS\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B1\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00028\u0000\u0012\u0006\u0010\u0014\u001a\u00028\u0001¢\u0006\u0004\b\u000f\u0010\u0015B\u0081\u0001\b\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\r\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u000f\u0010\u001bJ\\\u0010)\u001a\u00020&\"\u0004\b\u0002\u0010\u001c\"\u0004\b\u0003\u0010\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00020#2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00030#HÁ\u0001¢\u0006\u0004\b'\u0010(J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b/\u0010.J\u0010\u00100\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b0\u0010.J\u0010\u00101\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b1\u0010.J\u0010\u00102\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b2\u0010.J\u0010\u00103\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b3\u0010.J\u0010\u00104\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b4\u0010.J\u001c\u00105\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rHÆ\u0003¢\u0006\u0004\b5\u00106Jx\u00107\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rHÆ\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b9\u0010.J\u0010\u0010:\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b:\u0010;J\u001a\u0010?\u001a\u00020>2\b\u0010=\u001a\u0004\u0018\u00010<HÖ\u0003¢\u0006\u0004\b?\u0010@R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010A\u001a\u0004\bB\u0010.R\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010A\u001a\u0004\bC\u0010.R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010A\u001a\u0004\bD\u0010.R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010A\u001a\u0004\bE\u0010.R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010A\u001a\u0004\bF\u0010.R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010A\u001a\u0004\bG\u0010.R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bH\u0010.R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010I\u001a\u0004\bJ\u00106R\u001a\u0010\u0018\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010A\u001a\u0004\bK\u0010.¨\u0006N"}, d2 = {"Lme/oriient/internal/services/eventManager/model/PublishMessage;", "Lme/oriient/internal/infra/serializerJson/Jsonable;", "Data", "Parameters", "Lme/oriient/internal/services/eventManager/model/d;", "", "topic", "requestId", "userSessionId", "jwt", "spaceId", "senderId", "senderName", "Lme/oriient/internal/services/eventManager/model/EventPayload;", "payload", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lme/oriient/internal/services/eventManager/model/EventPayload;)V", "Lme/oriient/internal/services/eventManager/model/EventManagerContext;", "context", "data", "parameters", "(Lme/oriient/internal/services/eventManager/model/EventManagerContext;Ljava/lang/String;Ljava/lang/String;Lme/oriient/internal/infra/serializerJson/Jsonable;Lme/oriient/internal/infra/serializerJson/Jsonable;)V", "", "seen1", "type", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lme/oriient/internal/services/eventManager/model/EventPayload;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "T0", "T1", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "typeSerial1", "", "write$Self$internal_publishRelease", "(Lme/oriient/internal/services/eventManager/model/PublishMessage;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "write$Self", "Lkotlinx/serialization/json/JsonElement;", "toJsonElement", "()Lkotlinx/serialization/json/JsonElement;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Lme/oriient/internal/services/eventManager/model/EventPayload;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lme/oriient/internal/services/eventManager/model/EventPayload;)Lme/oriient/internal/services/eventManager/model/PublishMessage;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTopic", "getRequestId", "getUserSessionId", "getJwt", "getSpaceId", "getSenderId", "getSenderName", "Lme/oriient/internal/services/eventManager/model/EventPayload;", "getPayload", "getType", "Companion", "$serializer", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class PublishMessage<Data extends Jsonable, Parameters extends Jsonable> implements d {

    @JvmField
    @NotNull
    private static final SerialDescriptor $cachedDescriptor;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private final String jwt;

    @NotNull
    private final EventPayload<Data, Parameters> payload;

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

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001JJ\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00070\u0004\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00030\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lme/oriient/internal/services/eventManager/model/PublishMessage$Companion;", "", "T0", "T1", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "typeSerial1", "Lme/oriient/internal/services/eventManager/model/PublishMessage;", "serializer", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final <T0, T1> KSerializer<PublishMessage<T0, T1>> serializer(@NotNull KSerializer<T0> typeSerial0, @NotNull KSerializer<T1> typeSerial1) {
            Intrinsics.h(typeSerial0, "typeSerial0");
            Intrinsics.h(typeSerial1, "typeSerial1");
            return new PublishMessage$$serializer(typeSerial0, typeSerial1);
        }
    }

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.internal.services.eventManager.model.PublishMessage", null, 9);
        pluginGeneratedSerialDescriptor.k("topic", false);
        pluginGeneratedSerialDescriptor.k("requestId", false);
        pluginGeneratedSerialDescriptor.k("userSessionId", false);
        pluginGeneratedSerialDescriptor.k("jwt", false);
        pluginGeneratedSerialDescriptor.k("spaceId", false);
        pluginGeneratedSerialDescriptor.k("senderId", false);
        pluginGeneratedSerialDescriptor.k("senderName", false);
        pluginGeneratedSerialDescriptor.k("payload", false);
        pluginGeneratedSerialDescriptor.k("type", true);
        $cachedDescriptor = pluginGeneratedSerialDescriptor;
    }

    @Deprecated
    public /* synthetic */ PublishMessage(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, EventPayload eventPayload, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i & 255)) {
            PluginExceptionsKt.a(i, 255, $cachedDescriptor);
            throw null;
        }
        this.topic = str;
        this.requestId = str2;
        this.userSessionId = str3;
        this.jwt = str4;
        this.spaceId = str5;
        this.senderId = str6;
        this.senderName = str7;
        this.payload = eventPayload;
        if ((i & 256) == 0) {
            this.type = a.PUBLISH.getPath();
        } else {
            this.type = str8;
        }
    }

    public static /* synthetic */ PublishMessage copy$default(PublishMessage publishMessage, String str, String str2, String str3, String str4, String str5, String str6, String str7, EventPayload eventPayload, int i, Object obj) {
        if ((i & 1) != 0) {
            str = publishMessage.topic;
        }
        if ((i & 2) != 0) {
            str2 = publishMessage.requestId;
        }
        if ((i & 4) != 0) {
            str3 = publishMessage.userSessionId;
        }
        if ((i & 8) != 0) {
            str4 = publishMessage.jwt;
        }
        if ((i & 16) != 0) {
            str5 = publishMessage.spaceId;
        }
        if ((i & 32) != 0) {
            str6 = publishMessage.senderId;
        }
        if ((i & 64) != 0) {
            str7 = publishMessage.senderName;
        }
        if ((i & 128) != 0) {
            eventPayload = publishMessage.payload;
        }
        String str8 = str7;
        EventPayload eventPayload2 = eventPayload;
        String str9 = str5;
        String str10 = str6;
        return publishMessage.copy(str, str2, str3, str4, str9, str10, str8, eventPayload2);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(PublishMessage self, CompositeEncoder output, SerialDescriptor serialDesc, KSerializer typeSerial0, KSerializer typeSerial1) {
        output.p(serialDesc, 0, self.getTopic());
        output.p(serialDesc, 1, self.getRequestId());
        output.p(serialDesc, 2, self.userSessionId);
        output.p(serialDesc, 3, self.jwt);
        output.p(serialDesc, 4, self.spaceId);
        output.p(serialDesc, 5, self.senderId);
        output.p(serialDesc, 6, self.senderName);
        output.F(serialDesc, 7, EventPayload.INSTANCE.serializer(typeSerial0, typeSerial1), self.payload);
        if (!output.q(serialDesc, 8) && Intrinsics.c(self.getType(), a.PUBLISH.getPath())) {
            return;
        }
        output.p(serialDesc, 8, self.getType());
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
    public final String getSpaceId() {
        return this.spaceId;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getSenderId() {
        return this.senderId;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getSenderName() {
        return this.senderName;
    }

    @NotNull
    public final EventPayload<Data, Parameters> component8() {
        return this.payload;
    }

    @NotNull
    public final PublishMessage<Data, Parameters> copy(@NotNull String topic, @NotNull String requestId, @NotNull String userSessionId, @NotNull String jwt, @NotNull String spaceId, @NotNull String senderId, @NotNull String senderName, @NotNull EventPayload<Data, Parameters> payload) {
        Intrinsics.h(topic, "topic");
        Intrinsics.h(requestId, "requestId");
        Intrinsics.h(userSessionId, "userSessionId");
        Intrinsics.h(jwt, "jwt");
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(senderId, "senderId");
        Intrinsics.h(senderName, "senderName");
        Intrinsics.h(payload, "payload");
        return new PublishMessage<>(topic, requestId, userSessionId, jwt, spaceId, senderId, senderName, payload);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PublishMessage)) {
            return false;
        }
        PublishMessage publishMessage = (PublishMessage) other;
        return Intrinsics.c(this.topic, publishMessage.topic) && Intrinsics.c(this.requestId, publishMessage.requestId) && Intrinsics.c(this.userSessionId, publishMessage.userSessionId) && Intrinsics.c(this.jwt, publishMessage.jwt) && Intrinsics.c(this.spaceId, publishMessage.spaceId) && Intrinsics.c(this.senderId, publishMessage.senderId) && Intrinsics.c(this.senderName, publishMessage.senderName) && Intrinsics.c(this.payload, publishMessage.payload);
    }

    @NotNull
    public final String getJwt() {
        return this.jwt;
    }

    @NotNull
    public final EventPayload<Data, Parameters> getPayload() {
        return this.payload;
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
        return this.payload.hashCode() + me.oriient.internal.infra.rest.a.a(this.senderName, me.oriient.internal.infra.rest.a.a(this.senderId, me.oriient.internal.infra.rest.a.a(this.spaceId, me.oriient.internal.infra.rest.a.a(this.jwt, me.oriient.internal.infra.rest.a.a(this.userSessionId, me.oriient.internal.infra.rest.a.a(this.requestId, this.topic.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    @Override // me.oriient.internal.infra.serializerJson.Jsonable
    @NotNull
    public JsonElement toJsonElement() {
        return new JsonObject(MapsKt.j(new Pair("type", JsonableString.m390toJsonElementimpl(JsonHelpersKt.toJsonableString(getType()))), new Pair("topic", JsonableString.m390toJsonElementimpl(JsonHelpersKt.toJsonableString(getTopic()))), new Pair("requestId", JsonableString.m390toJsonElementimpl(JsonHelpersKt.toJsonableString(getRequestId()))), new Pair("userSessionId", JsonableString.m390toJsonElementimpl(JsonHelpersKt.toJsonableString(this.userSessionId))), new Pair("token", JsonableString.m390toJsonElementimpl(JsonHelpersKt.toJsonableString(this.jwt))), new Pair("spaceId", JsonableString.m390toJsonElementimpl(JsonHelpersKt.toJsonableString(this.spaceId))), new Pair("senderId", JsonableString.m390toJsonElementimpl(JsonHelpersKt.toJsonableString(this.senderId))), new Pair("senderName", JsonableString.m390toJsonElementimpl(JsonHelpersKt.toJsonableString(this.senderName))), new Pair("payload", this.payload.toJsonElement())));
    }

    @NotNull
    public String toString() {
        return "PublishMessage(topic=" + this.topic + ", requestId=" + this.requestId + ", userSessionId=" + this.userSessionId + ", jwt=" + this.jwt + ", spaceId=" + this.spaceId + ", senderId=" + this.senderId + ", senderName=" + this.senderName + ", payload=" + this.payload + ')';
    }

    public PublishMessage(@NotNull String topic, @NotNull String requestId, @NotNull String userSessionId, @NotNull String jwt, @NotNull String spaceId, @NotNull String senderId, @NotNull String senderName, @NotNull EventPayload<Data, Parameters> payload) {
        Intrinsics.h(topic, "topic");
        Intrinsics.h(requestId, "requestId");
        Intrinsics.h(userSessionId, "userSessionId");
        Intrinsics.h(jwt, "jwt");
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(senderId, "senderId");
        Intrinsics.h(senderName, "senderName");
        Intrinsics.h(payload, "payload");
        this.topic = topic;
        this.requestId = requestId;
        this.userSessionId = userSessionId;
        this.jwt = jwt;
        this.spaceId = spaceId;
        this.senderId = senderId;
        this.senderName = senderName;
        this.payload = payload;
        this.type = a.PUBLISH.getPath();
    }

    public PublishMessage(@NotNull EventManagerContext context, @NotNull String jwt, @NotNull String topic, @NotNull Data data, @NotNull Parameters parameters) {
        Intrinsics.h(context, "context");
        Intrinsics.h(jwt, "jwt");
        Intrinsics.h(topic, "topic");
        Intrinsics.h(data, "data");
        Intrinsics.h(parameters, "parameters");
        String string = UUID.randomUUID().toString();
        String sessionId = context.getSessionId();
        String senderId = context.getSenderId();
        String senderName = context.getSenderName();
        senderName = senderName == null ? "UnknownSenderName" : senderName;
        String spaceId = context.getSpaceId();
        EventPayload eventPayload = new EventPayload(data, parameters);
        Intrinsics.e(string);
        this(topic, string, sessionId, jwt, spaceId, senderId, senderName, eventPayload);
    }
}
