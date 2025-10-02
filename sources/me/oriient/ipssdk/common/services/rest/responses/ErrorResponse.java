package me.oriient.ipssdk.common.services.rest.responses;

import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 /2\u00020\u0001:\u0002./BU\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eBM\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0015JV\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001J&\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,HÁ\u0001¢\u0006\u0002\b-R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\n\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0019\u0010\u0013¨\u00060"}, d2 = {"Lme/oriient/ipssdk/common/services/rest/responses/ErrorResponse;", "", "seen1", "", "message", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "errorCode", "statusCode", "code", "isCustomError", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)V", "getCode", "()Ljava/lang/String;", "getErrorCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMessage", "getName", "getStatusCode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)Lme/oriient/ipssdk/common/services/rest/responses/ErrorResponse;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$me_oriient_sdk_common", "$serializer", "Companion", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes2.dex */
public final /* data */ class ErrorResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String code;

    @Nullable
    private final Integer errorCode;

    @Nullable
    private final Boolean isCustomError;

    @Nullable
    private final String message;

    @Nullable
    private final String name;

    @Nullable
    private final Integer statusCode;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/ipssdk/common/services/rest/responses/ErrorResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/ipssdk/common/services/rest/responses/ErrorResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final KSerializer<ErrorResponse> serializer() {
            return ErrorResponse$$serializer.INSTANCE;
        }
    }

    public ErrorResponse() {
        this((String) null, (String) null, (Integer) null, (Integer) null, (String) null, (Boolean) null, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ErrorResponse copy$default(ErrorResponse errorResponse, String str, String str2, Integer num, Integer num2, String str3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = errorResponse.message;
        }
        if ((i & 2) != 0) {
            str2 = errorResponse.name;
        }
        if ((i & 4) != 0) {
            num = errorResponse.errorCode;
        }
        if ((i & 8) != 0) {
            num2 = errorResponse.statusCode;
        }
        if ((i & 16) != 0) {
            str3 = errorResponse.code;
        }
        if ((i & 32) != 0) {
            bool = errorResponse.isCustomError;
        }
        String str4 = str3;
        Boolean bool2 = bool;
        return errorResponse.copy(str, str2, num, num2, str4, bool2);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$me_oriient_sdk_common(ErrorResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.q(serialDesc, 0) || !Intrinsics.c(self.message, "no message")) {
            output.w(serialDesc, 0, StringSerializer.f24821a, self.message);
        }
        if (output.q(serialDesc, 1) || self.name != null) {
            output.w(serialDesc, 1, StringSerializer.f24821a, self.name);
        }
        if (output.q(serialDesc, 2) || self.errorCode != null) {
            output.w(serialDesc, 2, IntSerializer.f24800a, self.errorCode);
        }
        if (output.q(serialDesc, 3) || self.statusCode != null) {
            output.w(serialDesc, 3, IntSerializer.f24800a, self.statusCode);
        }
        if (output.q(serialDesc, 4) || self.code != null) {
            output.w(serialDesc, 4, StringSerializer.f24821a, self.code);
        }
        if (!output.q(serialDesc, 5) && self.isCustomError == null) {
            return;
        }
        output.w(serialDesc, 5, BooleanSerializer.f24779a, self.isCustomError);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getStatusCode() {
        return this.statusCode;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Boolean getIsCustomError() {
        return this.isCustomError;
    }

    @NotNull
    public final ErrorResponse copy(@Nullable String message, @Nullable String name, @Nullable Integer errorCode, @Nullable Integer statusCode, @Nullable String code, @Nullable Boolean isCustomError) {
        return new ErrorResponse(message, name, errorCode, statusCode, code, isCustomError);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorResponse)) {
            return false;
        }
        ErrorResponse errorResponse = (ErrorResponse) other;
        return Intrinsics.c(this.message, errorResponse.message) && Intrinsics.c(this.name, errorResponse.name) && Intrinsics.c(this.errorCode, errorResponse.errorCode) && Intrinsics.c(this.statusCode, errorResponse.statusCode) && Intrinsics.c(this.code, errorResponse.code) && Intrinsics.c(this.isCustomError, errorResponse.isCustomError);
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final Integer getErrorCode() {
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
    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        String str = this.message;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.errorCode;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.statusCode;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.code;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isCustomError;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    @Nullable
    public final Boolean isCustomError() {
        return this.isCustomError;
    }

    @NotNull
    public String toString() {
        return "ErrorResponse(message=" + this.message + ", name=" + this.name + ", errorCode=" + this.errorCode + ", statusCode=" + this.statusCode + ", code=" + this.code + ", isCustomError=" + this.isCustomError + ')';
    }

    @Deprecated
    public /* synthetic */ ErrorResponse(int i, String str, String str2, Integer num, Integer num2, String str3, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        this.message = (i & 1) == 0 ? "no message" : str;
        if ((i & 2) == 0) {
            this.name = null;
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.errorCode = null;
        } else {
            this.errorCode = num;
        }
        if ((i & 8) == 0) {
            this.statusCode = null;
        } else {
            this.statusCode = num2;
        }
        if ((i & 16) == 0) {
            this.code = null;
        } else {
            this.code = str3;
        }
        if ((i & 32) == 0) {
            this.isCustomError = null;
        } else {
            this.isCustomError = bool;
        }
    }

    public ErrorResponse(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Integer num2, @Nullable String str3, @Nullable Boolean bool) {
        this.message = str;
        this.name = str2;
        this.errorCode = num;
        this.statusCode = num2;
        this.code = str3;
        this.isCustomError = bool;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ErrorResponse(java.lang.String r2, java.lang.String r3, java.lang.Integer r4, java.lang.Integer r5, java.lang.String r6, java.lang.Boolean r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L6
            java.lang.String r2 = "no message"
        L6:
            r9 = r8 & 2
            r0 = 0
            if (r9 == 0) goto Lc
            r3 = r0
        Lc:
            r9 = r8 & 4
            if (r9 == 0) goto L11
            r4 = r0
        L11:
            r9 = r8 & 8
            if (r9 == 0) goto L16
            r5 = r0
        L16:
            r9 = r8 & 16
            if (r9 == 0) goto L1b
            r6 = r0
        L1b:
            r8 = r8 & 32
            if (r8 == 0) goto L27
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L2e
        L27:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L2e:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.common.services.rest.responses.ErrorResponse.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
