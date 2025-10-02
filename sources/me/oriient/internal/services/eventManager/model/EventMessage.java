package me.oriient.internal.services.eventManager.model;

import androidx.annotation.Keep;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import me.oriient.internal.infra.rest.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002()BK\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fBA\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\rJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J&\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&HÁ\u0001¢\u0006\u0002\b'R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006*"}, d2 = {"Lme/oriient/internal/services/eventManager/model/EventMessage;", "Lme/oriient/internal/services/eventManager/model/IncomingMessage;", "seen1", "", "topic", "", "timestamp", "eventId", "senderId", "senderName", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEventId", "()Ljava/lang/String;", "getSenderId", "getSenderName", "getTimestamp", "getTopic", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
@SerialName
/* loaded from: classes7.dex */
public final /* data */ class EventMessage extends IncomingMessage {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @Nullable
    private final String eventId;

    @Nullable
    private final String senderId;

    @Nullable
    private final String senderName;

    @Nullable
    private final String timestamp;

    @Nullable
    private final String topic;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/eventManager/model/EventMessage$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/eventManager/model/EventMessage;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<EventMessage> serializer() {
            return EventMessage$$serializer.INSTANCE;
        }
    }

    public EventMessage() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ EventMessage copy$default(EventMessage eventMessage, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventMessage.topic;
        }
        if ((i & 2) != 0) {
            str2 = eventMessage.timestamp;
        }
        if ((i & 4) != 0) {
            str3 = eventMessage.eventId;
        }
        if ((i & 8) != 0) {
            str4 = eventMessage.senderId;
        }
        if ((i & 16) != 0) {
            str5 = eventMessage.senderName;
        }
        String str6 = str5;
        String str7 = str3;
        return eventMessage.copy(str, str2, str7, str4, str6);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(EventMessage self, CompositeEncoder output, SerialDescriptor serialDesc) {
        IncomingMessage.write$Self(self, output, serialDesc);
        if (output.q(serialDesc, 0) || self.topic != null) {
            output.w(serialDesc, 0, StringSerializer.f24821a, self.topic);
        }
        if (output.q(serialDesc, 1) || self.timestamp != null) {
            output.w(serialDesc, 1, StringSerializer.f24821a, self.timestamp);
        }
        if (output.q(serialDesc, 2) || self.eventId != null) {
            output.w(serialDesc, 2, StringSerializer.f24821a, self.eventId);
        }
        if (output.q(serialDesc, 3) || self.senderId != null) {
            output.w(serialDesc, 3, StringSerializer.f24821a, self.senderId);
        }
        if (!output.q(serialDesc, 4) && self.senderName == null) {
            return;
        }
        output.w(serialDesc, 4, StringSerializer.f24821a, self.senderName);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getTopic() {
        return this.topic;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getSenderId() {
        return this.senderId;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getSenderName() {
        return this.senderName;
    }

    @NotNull
    public final EventMessage copy(@Nullable String topic, @Nullable String timestamp, @Nullable String eventId, @Nullable String senderId, @Nullable String senderName) {
        return new EventMessage(topic, timestamp, eventId, senderId, senderName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventMessage)) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) other;
        return Intrinsics.c(this.topic, eventMessage.topic) && Intrinsics.c(this.timestamp, eventMessage.timestamp) && Intrinsics.c(this.eventId, eventMessage.eventId) && Intrinsics.c(this.senderId, eventMessage.senderId) && Intrinsics.c(this.senderName, eventMessage.senderName);
    }

    @Nullable
    public final String getEventId() {
        return this.eventId;
    }

    @Nullable
    public final String getSenderId() {
        return this.senderId;
    }

    @Nullable
    public final String getSenderName() {
        return this.senderName;
    }

    @Nullable
    public final String getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final String getTopic() {
        return this.topic;
    }

    public int hashCode() {
        String str = this.topic;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.timestamp;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.eventId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.senderId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.senderName;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("EventMessage(topic=");
        sb.append(this.topic);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(", eventId=");
        sb.append(this.eventId);
        sb.append(", senderId=");
        sb.append(this.senderId);
        sb.append(", senderName=");
        return e.a(sb, this.senderName, ')');
    }

    @Deprecated
    public /* synthetic */ EventMessage(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if ((i & 1) == 0) {
            this.topic = null;
        } else {
            this.topic = str;
        }
        if ((i & 2) == 0) {
            this.timestamp = null;
        } else {
            this.timestamp = str2;
        }
        if ((i & 4) == 0) {
            this.eventId = null;
        } else {
            this.eventId = str3;
        }
        if ((i & 8) == 0) {
            this.senderId = null;
        } else {
            this.senderId = str4;
        }
        if ((i & 16) == 0) {
            this.senderName = null;
        } else {
            this.senderName = str5;
        }
    }

    public /* synthetic */ EventMessage(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public EventMessage(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        super(null);
        this.topic = str;
        this.timestamp = str2;
        this.eventId = str3;
        this.senderId = str4;
        this.senderName = str5;
    }
}
