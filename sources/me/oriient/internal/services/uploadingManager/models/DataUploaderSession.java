package me.oriient.internal.services.uploadingManager.models;

import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.oriient.internal.infra.locationManager.J;
import me.oriient.internal.infra.locationManager.K;
import me.oriient.internal.infra.serializerJson.Jsonable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00016Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012&\u0010\r\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\t\u0010-\u001a\u00020\fHÆ\u0003J)\u0010.\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\u0010HÆ\u0003J\t\u0010/\u001a\u00020\u0012HÆ\u0003J\u0083\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2(\b\u0002\u0010\r\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\u0013\u00101\u001a\u00020\u00122\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\b\u00105\u001a\u00020\u0003H\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R:\u0010\r\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0015¨\u00067"}, d2 = {"Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession;", "", "id", "", "uploadingUrl", "apiKey", "spaceId", "sessionStartTimeMillis", "", "dataFormatVersion", "", "sessionType", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderSessionType;", "clientMetadata", "Ljava/util/HashMap;", "Lme/oriient/internal/infra/serializerJson/Jsonable;", "Lkotlin/collections/HashMap;", "shouldBeUploaded", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JDLme/oriient/internal/services/uploadingManager/models/DataUploaderSessionType;Ljava/util/HashMap;Z)V", "getApiKey", "()Ljava/lang/String;", "getClientMetadata", "()Ljava/util/HashMap;", "setClientMetadata", "(Ljava/util/HashMap;)V", "getDataFormatVersion", "()D", "getId", "getSessionStartTimeMillis", "()J", "getSessionType", "()Lme/oriient/internal/services/uploadingManager/models/DataUploaderSessionType;", "getShouldBeUploaded", "()Z", "setShouldBeUploaded", "(Z)V", "getSpaceId", "getUploadingUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "EndReason", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DataUploaderSession {

    @NotNull
    private final String apiKey;

    @Nullable
    private HashMap<String, Jsonable> clientMetadata;
    private final double dataFormatVersion;

    @NotNull
    private final String id;
    private final long sessionStartTimeMillis;

    @NotNull
    private final DataUploaderSessionType sessionType;
    private boolean shouldBeUploaded;

    @NotNull
    private final String spaceId;

    @NotNull
    private final String uploadingUrl;

    @Keep
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000e\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u000e\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason;", "", "key", "", "(Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "toString", "AutomaticPositioningTimeout", "ChargingAutoStop", "Custom", "Error", "ExitRegion", "LocationPermissionRevoked", "LocationTurnedOff", "NewCredentials", "OutOfExternalRegion", "OutOfGeofence", "OutOfGeofenceAutoStop", "SensorFailure", "SessionLimit", "StoppedByUser", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason$AutomaticPositioningTimeout;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason$ChargingAutoStop;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason$Custom;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason$Error;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason$ExitRegion;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason$LocationPermissionRevoked;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason$LocationTurnedOff;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason$NewCredentials;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason$OutOfExternalRegion;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason$OutOfGeofence;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason$OutOfGeofenceAutoStop;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason$SensorFailure;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason$SessionLimit;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason$StoppedByUser;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class EndReason {

        @NotNull
        private final String key;

        @Keep
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason$AutomaticPositioningTimeout;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason;", "timeoutMillis", "", "(J)V", "getTimeoutMillis", "()J", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class AutomaticPositioningTimeout extends EndReason {
            private final long timeoutMillis;

            public AutomaticPositioningTimeout(long j) {
                super("automaticPositioningTimeout", null);
                this.timeoutMillis = j;
            }

            public final long getTimeoutMillis() {
                return this.timeoutMillis;
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason$ChargingAutoStop;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason;", "()V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ChargingAutoStop extends EndReason {
            public ChargingAutoStop() {
                super("Charging Auto Stop", null);
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason$Custom;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason;", "reason", "", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Custom extends EndReason {

            @NotNull
            private final String reason;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Custom(@NotNull String reason) {
                super("custom_".concat(reason), null);
                Intrinsics.h(reason, "reason");
                this.reason = reason;
            }

            @NotNull
            public final String getReason() {
                return this.reason;
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason$Error;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason;", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "getError", "()Ljava/lang/Exception;", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Error extends EndReason {

            @NotNull
            private final Exception error;

            public Error(@NotNull Exception error) {
                Intrinsics.h(error, "error");
                StringBuilder sb = new StringBuilder("error_");
                String message = error.getMessage();
                DefaultConstructorMarker defaultConstructorMarker = null;
                sb.append(message != null ? StringsKt.f0(40, message) : null);
                super(sb.toString(), defaultConstructorMarker);
                this.error = error;
            }

            @NotNull
            public final Exception getError() {
                return this.error;
            }

            @Override // me.oriient.internal.services.uploadingManager.models.DataUploaderSession.EndReason
            @NotNull
            public String toString() {
                return YU.a.f(this.error, new StringBuilder("error. "));
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason$ExitRegion;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason;", "()V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ExitRegion extends EndReason {
            public ExitRegion() {
                super("Exit region", null);
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason$LocationPermissionRevoked;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason;", "()V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class LocationPermissionRevoked extends EndReason {
            public LocationPermissionRevoked() {
                super("locationPermissionRevoked", null);
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason$LocationTurnedOff;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason;", "()V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class LocationTurnedOff extends EndReason {
            public LocationTurnedOff() {
                super("locationTurnedOff", null);
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason$NewCredentials;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason;", "()V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class NewCredentials extends EndReason {
            public NewCredentials() {
                super("newCredentials", null);
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason$OutOfExternalRegion;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason;", "()V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class OutOfExternalRegion extends EndReason {
            public OutOfExternalRegion() {
                super("Out of External Region Auto Stop", null);
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason$OutOfGeofence;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason;", "()V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class OutOfGeofence extends EndReason {
            public OutOfGeofence() {
                super("outOfGeofence", null);
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason$OutOfGeofenceAutoStop;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason;", "()V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class OutOfGeofenceAutoStop extends EndReason {
            public OutOfGeofenceAutoStop() {
                super("Out of Geofence Auto Stop", null);
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason$SensorFailure;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason;", "reason", "", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class SensorFailure extends EndReason {

            @NotNull
            private final String reason;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SensorFailure(@NotNull String reason) {
                super("SensorFailure - ".concat(reason), null);
                Intrinsics.h(reason, "reason");
                this.reason = reason;
            }

            @NotNull
            public final String getReason() {
                return this.reason;
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason$SessionLimit;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason;", "limitMillis", "", "(J)V", "getLimitMillis", "()J", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class SessionLimit extends EndReason {
            private final long limitMillis;

            public SessionLimit(long j) {
                super(b.k(j, "sessionLimit_"), null);
                this.limitMillis = j;
            }

            public final long getLimitMillis() {
                return this.limitMillis;
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason$StoppedByUser;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason;", "()V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class StoppedByUser extends EndReason {
            public StoppedByUser() {
                super("stoppedByUser", null);
            }
        }

        public /* synthetic */ EndReason(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }

        @NotNull
        public String toString() {
            return this.key;
        }

        private EndReason(String str) {
            this.key = str;
        }
    }

    public DataUploaderSession(@NotNull String id, @NotNull String uploadingUrl, @NotNull String apiKey, @NotNull String spaceId, long j, double d, @NotNull DataUploaderSessionType sessionType, @Nullable HashMap<String, Jsonable> map, boolean z) {
        Intrinsics.h(id, "id");
        Intrinsics.h(uploadingUrl, "uploadingUrl");
        Intrinsics.h(apiKey, "apiKey");
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(sessionType, "sessionType");
        this.id = id;
        this.uploadingUrl = uploadingUrl;
        this.apiKey = apiKey;
        this.spaceId = spaceId;
        this.sessionStartTimeMillis = j;
        this.dataFormatVersion = d;
        this.sessionType = sessionType;
        this.clientMetadata = map;
        this.shouldBeUploaded = z;
    }

    public static /* synthetic */ DataUploaderSession copy$default(DataUploaderSession dataUploaderSession, String str, String str2, String str3, String str4, long j, double d, DataUploaderSessionType dataUploaderSessionType, HashMap map, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dataUploaderSession.id;
        }
        if ((i & 2) != 0) {
            str2 = dataUploaderSession.uploadingUrl;
        }
        if ((i & 4) != 0) {
            str3 = dataUploaderSession.apiKey;
        }
        if ((i & 8) != 0) {
            str4 = dataUploaderSession.spaceId;
        }
        if ((i & 16) != 0) {
            j = dataUploaderSession.sessionStartTimeMillis;
        }
        if ((i & 32) != 0) {
            d = dataUploaderSession.dataFormatVersion;
        }
        if ((i & 64) != 0) {
            dataUploaderSessionType = dataUploaderSession.sessionType;
        }
        if ((i & 128) != 0) {
            map = dataUploaderSession.clientMetadata;
        }
        if ((i & 256) != 0) {
            z = dataUploaderSession.shouldBeUploaded;
        }
        boolean z2 = z;
        DataUploaderSessionType dataUploaderSessionType2 = dataUploaderSessionType;
        double d2 = d;
        long j2 = j;
        String str5 = str3;
        String str6 = str4;
        return dataUploaderSession.copy(str, str2, str5, str6, j2, d2, dataUploaderSessionType2, map, z2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getUploadingUrl() {
        return this.uploadingUrl;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getApiKey() {
        return this.apiKey;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getSpaceId() {
        return this.spaceId;
    }

    /* renamed from: component5, reason: from getter */
    public final long getSessionStartTimeMillis() {
        return this.sessionStartTimeMillis;
    }

    /* renamed from: component6, reason: from getter */
    public final double getDataFormatVersion() {
        return this.dataFormatVersion;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final DataUploaderSessionType getSessionType() {
        return this.sessionType;
    }

    @Nullable
    public final HashMap<String, Jsonable> component8() {
        return this.clientMetadata;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getShouldBeUploaded() {
        return this.shouldBeUploaded;
    }

    @NotNull
    public final DataUploaderSession copy(@NotNull String id, @NotNull String uploadingUrl, @NotNull String apiKey, @NotNull String spaceId, long sessionStartTimeMillis, double dataFormatVersion, @NotNull DataUploaderSessionType sessionType, @Nullable HashMap<String, Jsonable> clientMetadata, boolean shouldBeUploaded) {
        Intrinsics.h(id, "id");
        Intrinsics.h(uploadingUrl, "uploadingUrl");
        Intrinsics.h(apiKey, "apiKey");
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(sessionType, "sessionType");
        return new DataUploaderSession(id, uploadingUrl, apiKey, spaceId, sessionStartTimeMillis, dataFormatVersion, sessionType, clientMetadata, shouldBeUploaded);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataUploaderSession)) {
            return false;
        }
        DataUploaderSession dataUploaderSession = (DataUploaderSession) other;
        return Intrinsics.c(this.id, dataUploaderSession.id) && Intrinsics.c(this.uploadingUrl, dataUploaderSession.uploadingUrl) && Intrinsics.c(this.apiKey, dataUploaderSession.apiKey) && Intrinsics.c(this.spaceId, dataUploaderSession.spaceId) && this.sessionStartTimeMillis == dataUploaderSession.sessionStartTimeMillis && Double.compare(this.dataFormatVersion, dataUploaderSession.dataFormatVersion) == 0 && this.sessionType == dataUploaderSession.sessionType && Intrinsics.c(this.clientMetadata, dataUploaderSession.clientMetadata) && this.shouldBeUploaded == dataUploaderSession.shouldBeUploaded;
    }

    @NotNull
    public final String getApiKey() {
        return this.apiKey;
    }

    @Nullable
    public final HashMap<String, Jsonable> getClientMetadata() {
        return this.clientMetadata;
    }

    public final double getDataFormatVersion() {
        return this.dataFormatVersion;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final long getSessionStartTimeMillis() {
        return this.sessionStartTimeMillis;
    }

    @NotNull
    public final DataUploaderSessionType getSessionType() {
        return this.sessionType;
    }

    public final boolean getShouldBeUploaded() {
        return this.shouldBeUploaded;
    }

    @NotNull
    public final String getSpaceId() {
        return this.spaceId;
    }

    @NotNull
    public final String getUploadingUrl() {
        return this.uploadingUrl;
    }

    public int hashCode() {
        int iHashCode = (this.sessionType.hashCode() + J.a(this.dataFormatVersion, K.a(this.sessionStartTimeMillis, me.oriient.internal.infra.rest.a.a(this.spaceId, me.oriient.internal.infra.rest.a.a(this.apiKey, me.oriient.internal.infra.rest.a.a(this.uploadingUrl, this.id.hashCode() * 31, 31), 31), 31), 31), 31)) * 31;
        HashMap<String, Jsonable> map = this.clientMetadata;
        return Boolean.hashCode(this.shouldBeUploaded) + ((iHashCode + (map == null ? 0 : map.hashCode())) * 31);
    }

    public final void setClientMetadata(@Nullable HashMap<String, Jsonable> map) {
        this.clientMetadata = map;
    }

    public final void setShouldBeUploaded(boolean z) {
        this.shouldBeUploaded = z;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("DataUploaderSession(id='");
        sb.append(this.id);
        sb.append("', uploadingUrl='");
        sb.append(this.uploadingUrl);
        sb.append("', apiKey='");
        sb.append(this.apiKey);
        sb.append("', spaceId='");
        sb.append(this.spaceId);
        sb.append("', sessionStartTimeMillis=");
        sb.append(this.sessionStartTimeMillis);
        sb.append(", dataFormatVersion=");
        sb.append(this.dataFormatVersion);
        sb.append(", sessionType=");
        sb.append(this.sessionType);
        sb.append(", shouldBeUploaded=");
        return b.s(sb, this.shouldBeUploaded, ')');
    }
}
