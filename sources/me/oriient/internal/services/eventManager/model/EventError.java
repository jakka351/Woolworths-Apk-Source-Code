package me.oriient.internal.services.eventManager.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\u000e\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017B\u0019\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0082\u0001\u000e\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%¨\u0006&"}, d2 = {"Lme/oriient/internal/services/eventManager/model/EventError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "code", "", "(Ljava/lang/String;I)V", "getCode", "()I", "AuthError", "EngineBindFailure", "EngineError", "InternalError", "InvalidInput", "InvalidState", "NoLocationPermission", "NotConnected", "OperationCancelled", "OutOfSpace", "ServerError", "ServerInternal", "Timeout", "Unknown", "Lme/oriient/internal/services/eventManager/model/EventError$AuthError;", "Lme/oriient/internal/services/eventManager/model/EventError$EngineBindFailure;", "Lme/oriient/internal/services/eventManager/model/EventError$EngineError;", "Lme/oriient/internal/services/eventManager/model/EventError$InternalError;", "Lme/oriient/internal/services/eventManager/model/EventError$InvalidInput;", "Lme/oriient/internal/services/eventManager/model/EventError$InvalidState;", "Lme/oriient/internal/services/eventManager/model/EventError$NoLocationPermission;", "Lme/oriient/internal/services/eventManager/model/EventError$NotConnected;", "Lme/oriient/internal/services/eventManager/model/EventError$OperationCancelled;", "Lme/oriient/internal/services/eventManager/model/EventError$OutOfSpace;", "Lme/oriient/internal/services/eventManager/model/EventError$ServerError;", "Lme/oriient/internal/services/eventManager/model/EventError$ServerInternal;", "Lme/oriient/internal/services/eventManager/model/EventError$Timeout;", "Lme/oriient/internal/services/eventManager/model/EventError$Unknown;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class EventError extends Exception {
    private final int code;

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/internal/services/eventManager/model/EventError$AuthError;", "Lme/oriient/internal/services/eventManager/model/EventError;", "()V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AuthError extends EventError {
        public AuthError() {
            super("Auth Error", 13, null);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/internal/services/eventManager/model/EventError$EngineBindFailure;", "Lme/oriient/internal/services/eventManager/model/EventError;", "message", "", "(Ljava/lang/String;)V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EngineBindFailure extends EventError {
        public EngineBindFailure(@Nullable String str) {
            super(str, 6, null);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/internal/services/eventManager/model/EventError$EngineError;", "Lme/oriient/internal/services/eventManager/model/EventError;", "message", "", "(Ljava/lang/String;)V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EngineError extends EventError {
        public EngineError(@Nullable String str) {
            super(str, 5, null);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/internal/services/eventManager/model/EventError$InternalError;", "Lme/oriient/internal/services/eventManager/model/EventError;", "message", "", "(Ljava/lang/String;)V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InternalError extends EventError {
        public InternalError(@Nullable String str) {
            super(str, 0, null);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/internal/services/eventManager/model/EventError$InvalidInput;", "Lme/oriient/internal/services/eventManager/model/EventError;", "message", "", "(Ljava/lang/String;)V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InvalidInput extends EventError {
        public InvalidInput(@Nullable String str) {
            super(str, 4, null);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/internal/services/eventManager/model/EventError$InvalidState;", "Lme/oriient/internal/services/eventManager/model/EventError;", "message", "", "(Ljava/lang/String;)V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InvalidState extends EventError {
        public InvalidState(@Nullable String str) {
            super(str, 3, null);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/internal/services/eventManager/model/EventError$NoLocationPermission;", "Lme/oriient/internal/services/eventManager/model/EventError;", "message", "", "(Ljava/lang/String;)V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NoLocationPermission extends EventError {
        public NoLocationPermission(@Nullable String str) {
            super(str, 12, null);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/internal/services/eventManager/model/EventError$NotConnected;", "Lme/oriient/internal/services/eventManager/model/EventError;", "message", "", "(Ljava/lang/String;)V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NotConnected extends EventError {
        public NotConnected(@Nullable String str) {
            super(str, 1, null);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/internal/services/eventManager/model/EventError$OperationCancelled;", "Lme/oriient/internal/services/eventManager/model/EventError;", "message", "", "(Ljava/lang/String;)V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OperationCancelled extends EventError {
        public OperationCancelled(@Nullable String str) {
            super(str, 10, null);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/internal/services/eventManager/model/EventError$OutOfSpace;", "Lme/oriient/internal/services/eventManager/model/EventError;", "message", "", "(Ljava/lang/String;)V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OutOfSpace extends EventError {
        public OutOfSpace(@Nullable String str) {
            super(str, 11, null);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/internal/services/eventManager/model/EventError$ServerError;", "Lme/oriient/internal/services/eventManager/model/EventError;", "message", "", "(Ljava/lang/String;)V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ServerError extends EventError {
        public ServerError(@Nullable String str) {
            super(str, 7, null);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/internal/services/eventManager/model/EventError$ServerInternal;", "Lme/oriient/internal/services/eventManager/model/EventError;", "message", "", "(Ljava/lang/String;)V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ServerInternal extends EventError {
        public ServerInternal(@Nullable String str) {
            super(str, 2, null);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/internal/services/eventManager/model/EventError$Timeout;", "Lme/oriient/internal/services/eventManager/model/EventError;", "message", "", "(Ljava/lang/String;)V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Timeout extends EventError {
        public Timeout() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public Timeout(@Nullable String str) {
            super(str, 8, null);
        }

        public /* synthetic */ Timeout(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "Message was not sent" : str);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/internal/services/eventManager/model/EventError$Unknown;", "Lme/oriient/internal/services/eventManager/model/EventError;", "message", "", "(Ljava/lang/String;)V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Unknown extends EventError {
        public Unknown(@Nullable String str) {
            super(str, -1, null);
        }
    }

    public /* synthetic */ EventError(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public final int getCode() {
        return this.code;
    }

    private EventError(String str, int i) {
        super(str);
        this.code = i;
    }
}
