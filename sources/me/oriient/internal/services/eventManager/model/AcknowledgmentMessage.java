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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B-\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u001d\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J&\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dHÁ\u0001¢\u0006\u0002\b\u001eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006!"}, d2 = {"Lme/oriient/internal/services/eventManager/model/AcknowledgmentMessage;", "Lme/oriient/internal/services/eventManager/model/IncomingMessage;", "seen1", "", "requestId", "", "requestMessageType", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getRequestId", "()Ljava/lang/String;", "getRequestMessageType", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
@SerialName
/* loaded from: classes7.dex */
public final /* data */ class AcknowledgmentMessage extends IncomingMessage {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @Nullable
    private final String requestId;

    @Nullable
    private final String requestMessageType;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/eventManager/model/AcknowledgmentMessage$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/eventManager/model/AcknowledgmentMessage;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<AcknowledgmentMessage> serializer() {
            return AcknowledgmentMessage$$serializer.INSTANCE;
        }
    }

    public AcknowledgmentMessage() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ AcknowledgmentMessage copy$default(AcknowledgmentMessage acknowledgmentMessage, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = acknowledgmentMessage.requestId;
        }
        if ((i & 2) != 0) {
            str2 = acknowledgmentMessage.requestMessageType;
        }
        return acknowledgmentMessage.copy(str, str2);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(AcknowledgmentMessage self, CompositeEncoder output, SerialDescriptor serialDesc) {
        IncomingMessage.write$Self(self, output, serialDesc);
        if (output.q(serialDesc, 0) || self.requestId != null) {
            output.w(serialDesc, 0, StringSerializer.f24821a, self.requestId);
        }
        if (!output.q(serialDesc, 1) && self.requestMessageType == null) {
            return;
        }
        output.w(serialDesc, 1, StringSerializer.f24821a, self.requestMessageType);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getRequestMessageType() {
        return this.requestMessageType;
    }

    @NotNull
    public final AcknowledgmentMessage copy(@Nullable String requestId, @Nullable String requestMessageType) {
        return new AcknowledgmentMessage(requestId, requestMessageType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcknowledgmentMessage)) {
            return false;
        }
        AcknowledgmentMessage acknowledgmentMessage = (AcknowledgmentMessage) other;
        return Intrinsics.c(this.requestId, acknowledgmentMessage.requestId) && Intrinsics.c(this.requestMessageType, acknowledgmentMessage.requestMessageType);
    }

    @Nullable
    public final String getRequestId() {
        return this.requestId;
    }

    @Nullable
    public final String getRequestMessageType() {
        return this.requestMessageType;
    }

    public int hashCode() {
        String str = this.requestId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.requestMessageType;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("AcknowledgmentMessage(requestId=");
        sb.append(this.requestId);
        sb.append(", requestMessageType=");
        return e.a(sb, this.requestMessageType, ')');
    }

    @Deprecated
    public /* synthetic */ AcknowledgmentMessage(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if ((i & 1) == 0) {
            this.requestId = null;
        } else {
            this.requestId = str;
        }
        if ((i & 2) == 0) {
            this.requestMessageType = null;
        } else {
            this.requestMessageType = str2;
        }
    }

    public /* synthetic */ AcknowledgmentMessage(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public AcknowledgmentMessage(@Nullable String str, @Nullable String str2) {
        super(null);
        this.requestId = str;
        this.requestMessageType = str2;
    }
}
