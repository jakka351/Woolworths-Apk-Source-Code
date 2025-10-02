package me.oriient.internal.services.eventManager.model;

import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002()BK\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fBA\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\rJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J&\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&HÁ\u0001¢\u0006\u0002\b'R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006*"}, d2 = {"Lme/oriient/internal/services/eventManager/model/ErrorMessage;", "Lme/oriient/internal/services/eventManager/model/IncomingMessage;", "seen1", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "errorCode", "message", "requestId", "requestMessageType", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getErrorCode", "()Ljava/lang/String;", "getMessage", "getName", "getRequestId", "getRequestMessageType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
@SerialName
/* loaded from: classes7.dex */
public final /* data */ class ErrorMessage extends IncomingMessage {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @Nullable
    private final String errorCode;

    @Nullable
    private final String message;

    @Nullable
    private final String name;

    @Nullable
    private final String requestId;

    @Nullable
    private final String requestMessageType;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/eventManager/model/ErrorMessage$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/eventManager/model/ErrorMessage;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<ErrorMessage> serializer() {
            return ErrorMessage$$serializer.INSTANCE;
        }
    }

    public ErrorMessage() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ErrorMessage copy$default(ErrorMessage errorMessage, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = errorMessage.name;
        }
        if ((i & 2) != 0) {
            str2 = errorMessage.errorCode;
        }
        if ((i & 4) != 0) {
            str3 = errorMessage.message;
        }
        if ((i & 8) != 0) {
            str4 = errorMessage.requestId;
        }
        if ((i & 16) != 0) {
            str5 = errorMessage.requestMessageType;
        }
        String str6 = str5;
        String str7 = str3;
        return errorMessage.copy(str, str2, str7, str4, str6);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(ErrorMessage self, CompositeEncoder output, SerialDescriptor serialDesc) {
        IncomingMessage.write$Self(self, output, serialDesc);
        if (output.q(serialDesc, 0) || self.name != null) {
            output.w(serialDesc, 0, StringSerializer.f24821a, self.name);
        }
        if (output.q(serialDesc, 1) || self.errorCode != null) {
            output.w(serialDesc, 1, StringSerializer.f24821a, self.errorCode);
        }
        if (output.q(serialDesc, 2) || self.message != null) {
            output.w(serialDesc, 2, StringSerializer.f24821a, self.message);
        }
        if (output.q(serialDesc, 3) || self.requestId != null) {
            output.w(serialDesc, 3, StringSerializer.f24821a, self.requestId);
        }
        if (!output.q(serialDesc, 4) && self.requestMessageType == null) {
            return;
        }
        output.w(serialDesc, 4, StringSerializer.f24821a, self.requestMessageType);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getRequestMessageType() {
        return this.requestMessageType;
    }

    @NotNull
    public final ErrorMessage copy(@Nullable String name, @Nullable String errorCode, @Nullable String message, @Nullable String requestId, @Nullable String requestMessageType) {
        return new ErrorMessage(name, errorCode, message, requestId, requestMessageType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorMessage)) {
            return false;
        }
        ErrorMessage errorMessage = (ErrorMessage) other;
        return Intrinsics.c(this.name, errorMessage.name) && Intrinsics.c(this.errorCode, errorMessage.errorCode) && Intrinsics.c(this.message, errorMessage.message) && Intrinsics.c(this.requestId, errorMessage.requestId) && Intrinsics.c(this.requestMessageType, errorMessage.requestMessageType);
    }

    @Nullable
    public final String getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final String getName() {
        return this.name;
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
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.errorCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.message;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.requestId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.requestMessageType;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ErrorMessage(name=");
        sb.append(this.name);
        sb.append(", errorCode=");
        sb.append(this.errorCode);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", requestId=");
        sb.append(this.requestId);
        sb.append(", requestMessageType=");
        return e.a(sb, this.requestMessageType, ')');
    }

    @Deprecated
    public /* synthetic */ ErrorMessage(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if ((i & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.errorCode = null;
        } else {
            this.errorCode = str2;
        }
        if ((i & 4) == 0) {
            this.message = null;
        } else {
            this.message = str3;
        }
        if ((i & 8) == 0) {
            this.requestId = null;
        } else {
            this.requestId = str4;
        }
        if ((i & 16) == 0) {
            this.requestMessageType = null;
        } else {
            this.requestMessageType = str5;
        }
    }

    public /* synthetic */ ErrorMessage(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public ErrorMessage(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        super(null);
        this.name = str;
        this.errorCode = str2;
        this.message = str3;
        this.requestId = str4;
        this.requestMessageType = str5;
    }
}
