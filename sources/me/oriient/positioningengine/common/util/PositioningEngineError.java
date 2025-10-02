package me.oriient.positioningengine.common.util;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.utils.core.InternalError;
import me.oriient.internal.infra.utils.core.OriientError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0013\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001aB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007\u0082\u0001\u0013\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-¨\u0006."}, d2 = {"Lme/oriient/positioningengine/common/util/PositioningEngineError;", "Ljava/lang/Exception;", lqlqqlq.mmm006Dm006Dm, "", "(Ljava/lang/String;)V", "toOriientError", "Lme/oriient/internal/infra/utils/core/OriientError;", "toOriientError$service_positioning_engine_publishRelease", "AnalyticsWasNotReceived", "AuthError", "ConnectionLost", "DbError", "DecryptionError", "EngineCoreError", "EngineCoreStopped", "EngineLibrariesUnavailable", "EnginePreInitializationNotFinished", "General", "IOError", "InvalidOperation", "NoEngine", "NoModel", "OperationCanceled", "ParsingError", "ServerError", "SocketError", "UnexpectedRecovery", "Lme/oriient/positioningengine/common/util/PositioningEngineError$AnalyticsWasNotReceived;", "Lme/oriient/positioningengine/common/util/PositioningEngineError$AuthError;", "Lme/oriient/positioningengine/common/util/PositioningEngineError$ConnectionLost;", "Lme/oriient/positioningengine/common/util/PositioningEngineError$DbError;", "Lme/oriient/positioningengine/common/util/PositioningEngineError$DecryptionError;", "Lme/oriient/positioningengine/common/util/PositioningEngineError$EngineCoreError;", "Lme/oriient/positioningengine/common/util/PositioningEngineError$EngineCoreStopped;", "Lme/oriient/positioningengine/common/util/PositioningEngineError$EngineLibrariesUnavailable;", "Lme/oriient/positioningengine/common/util/PositioningEngineError$EnginePreInitializationNotFinished;", "Lme/oriient/positioningengine/common/util/PositioningEngineError$General;", "Lme/oriient/positioningengine/common/util/PositioningEngineError$IOError;", "Lme/oriient/positioningengine/common/util/PositioningEngineError$InvalidOperation;", "Lme/oriient/positioningengine/common/util/PositioningEngineError$NoEngine;", "Lme/oriient/positioningengine/common/util/PositioningEngineError$NoModel;", "Lme/oriient/positioningengine/common/util/PositioningEngineError$OperationCanceled;", "Lme/oriient/positioningengine/common/util/PositioningEngineError$ParsingError;", "Lme/oriient/positioningengine/common/util/PositioningEngineError$ServerError;", "Lme/oriient/positioningengine/common/util/PositioningEngineError$SocketError;", "Lme/oriient/positioningengine/common/util/PositioningEngineError$UnexpectedRecovery;", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class PositioningEngineError extends Exception {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/positioningengine/common/util/PositioningEngineError$AnalyticsWasNotReceived;", "Lme/oriient/positioningengine/common/util/PositioningEngineError;", "()V", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnalyticsWasNotReceived extends PositioningEngineError {

        @NotNull
        public static final AnalyticsWasNotReceived INSTANCE = new AnalyticsWasNotReceived();

        private AnalyticsWasNotReceived() {
            super("Error: failed to get engine analytics", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/positioningengine/common/util/PositioningEngineError$AuthError;", "Lme/oriient/positioningengine/common/util/PositioningEngineError;", "()V", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AuthError extends PositioningEngineError {

        @NotNull
        public static final AuthError INSTANCE = new AuthError();

        private AuthError() {
            super("Error: not logged in", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/positioningengine/common/util/PositioningEngineError$ConnectionLost;", "Lme/oriient/positioningengine/common/util/PositioningEngineError;", "()V", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ConnectionLost extends PositioningEngineError {

        @NotNull
        public static final ConnectionLost INSTANCE = new ConnectionLost();

        private ConnectionLost() {
            super("Connection lost", null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/positioningengine/common/util/PositioningEngineError$DbError;", "Lme/oriient/positioningengine/common/util/PositioningEngineError;", lqlqqlq.mmm006Dm006Dm, "", "(Ljava/lang/String;)V", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DbError extends PositioningEngineError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DbError(@NotNull String description) {
            super("Error: DB operation failed - ".concat(description), null);
            Intrinsics.h(description, "description");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/positioningengine/common/util/PositioningEngineError$DecryptionError;", "Lme/oriient/positioningengine/common/util/PositioningEngineError;", "toDecrypt", "", "(Ljava/lang/Object;)V", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DecryptionError extends PositioningEngineError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DecryptionError(@NotNull Object toDecrypt) {
            super("Error: failed to decrypt " + toDecrypt, null);
            Intrinsics.h(toDecrypt, "toDecrypt");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/positioningengine/common/util/PositioningEngineError$EngineCoreError;", "Lme/oriient/positioningengine/common/util/PositioningEngineError;", "message", "", "(Ljava/lang/String;)V", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EngineCoreError extends PositioningEngineError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EngineCoreError(@NotNull String message) {
            super(message, null);
            Intrinsics.h(message, "message");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/positioningengine/common/util/PositioningEngineError$EngineCoreStopped;", "Lme/oriient/positioningengine/common/util/PositioningEngineError;", "reason", "", "(Ljava/lang/String;)V", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EngineCoreStopped extends PositioningEngineError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EngineCoreStopped(@NotNull String reason) {
            super("engine core stopped - ".concat(reason), null);
            Intrinsics.h(reason, "reason");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/positioningengine/common/util/PositioningEngineError$EngineLibrariesUnavailable;", "Lme/oriient/positioningengine/common/util/PositioningEngineError;", "()V", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EngineLibrariesUnavailable extends PositioningEngineError {
        public EngineLibrariesUnavailable() {
            super("Error: Engine libraries are unavailable", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/positioningengine/common/util/PositioningEngineError$EnginePreInitializationNotFinished;", "Lme/oriient/positioningengine/common/util/PositioningEngineError;", "()V", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EnginePreInitializationNotFinished extends PositioningEngineError {
        public EnginePreInitializationNotFinished() {
            super("Error: Engine preparations not finished", null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/positioningengine/common/util/PositioningEngineError$General;", "Lme/oriient/positioningengine/common/util/PositioningEngineError;", lqlqqlq.mmm006Dm006Dm, "", "(Ljava/lang/String;)V", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class General extends PositioningEngineError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public General(@NotNull String description) {
            super(description, null);
            Intrinsics.h(description, "description");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/positioningengine/common/util/PositioningEngineError$IOError;", "Lme/oriient/positioningengine/common/util/PositioningEngineError;", "()V", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IOError extends PositioningEngineError {

        @NotNull
        public static final IOError INSTANCE = new IOError();

        private IOError() {
            super("Error: error while reading or writing from/to file", null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/positioningengine/common/util/PositioningEngineError$InvalidOperation;", "Lme/oriient/positioningengine/common/util/PositioningEngineError;", "operation", "", "currentState", "(Ljava/lang/String;Ljava/lang/String;)V", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InvalidOperation extends PositioningEngineError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidOperation(@NotNull String operation, @NotNull String currentState) {
            super(YU.a.p(new StringBuilder("can't perform "), operation, " while ", currentState), null);
            Intrinsics.h(operation, "operation");
            Intrinsics.h(currentState, "currentState");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/positioningengine/common/util/PositioningEngineError$NoEngine;", "Lme/oriient/positioningengine/common/util/PositioningEngineError;", "()V", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NoEngine extends PositioningEngineError {
        public NoEngine() {
            super("Error: No Engine", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/positioningengine/common/util/PositioningEngineError$NoModel;", "Lme/oriient/positioningengine/common/util/PositioningEngineError;", "()V", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NoModel extends PositioningEngineError {
        public NoModel() {
            super("Error: No Model", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/positioningengine/common/util/PositioningEngineError$OperationCanceled;", "Lme/oriient/positioningengine/common/util/PositioningEngineError;", "()V", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OperationCanceled extends PositioningEngineError {

        @NotNull
        public static final OperationCanceled INSTANCE = new OperationCanceled();

        private OperationCanceled() {
            super("The operation was canceled", null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/positioningengine/common/util/PositioningEngineError$ParsingError;", "Lme/oriient/positioningengine/common/util/PositioningEngineError;", "toParse", "", "(Ljava/lang/Object;)V", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ParsingError extends PositioningEngineError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParsingError(@NotNull Object toParse) {
            super("Error: failed to parse " + toParse, null);
            Intrinsics.h(toParse, "toParse");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lme/oriient/positioningengine/common/util/PositioningEngineError$ServerError;", "Lme/oriient/positioningengine/common/util/PositioningEngineError;", "code", "", "serverMessage", "", "(ILjava/lang/String;)V", "getCode", "()I", "getServerMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ServerError extends PositioningEngineError {
        private final int code;

        @NotNull
        private final String serverMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ServerError(int i, @NotNull String serverMessage) {
            super("ServerError. Code: " + i + ". Message: " + serverMessage, null);
            Intrinsics.h(serverMessage, "serverMessage");
            this.code = i;
            this.serverMessage = serverMessage;
        }

        public static /* synthetic */ ServerError copy$default(ServerError serverError, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = serverError.code;
            }
            if ((i2 & 2) != 0) {
                str = serverError.serverMessage;
            }
            return serverError.copy(i, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getServerMessage() {
            return this.serverMessage;
        }

        @NotNull
        public final ServerError copy(int code, @NotNull String serverMessage) {
            Intrinsics.h(serverMessage, "serverMessage");
            return new ServerError(code, serverMessage);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ServerError)) {
                return false;
            }
            ServerError serverError = (ServerError) other;
            return this.code == serverError.code && Intrinsics.c(this.serverMessage, serverError.serverMessage);
        }

        public final int getCode() {
            return this.code;
        }

        @NotNull
        public final String getServerMessage() {
            return this.serverMessage;
        }

        public int hashCode() {
            return this.serverMessage.hashCode() + (Integer.hashCode(this.code) * 31);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("ServerError(code=");
            sb.append(this.code);
            sb.append(", serverMessage=");
            return androidx.camera.core.impl.b.r(sb, this.serverMessage, ')');
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/positioningengine/common/util/PositioningEngineError$SocketError;", "Lme/oriient/positioningengine/common/util/PositioningEngineError;", lqlqqlq.mmm006Dm006Dm, "", "(Ljava/lang/String;)V", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SocketError extends PositioningEngineError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SocketError(@NotNull String description) {
            super(description, null);
            Intrinsics.h(description, "description");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/positioningengine/common/util/PositioningEngineError$UnexpectedRecovery;", "Lme/oriient/positioningengine/common/util/PositioningEngineError;", "process", "", "(Ljava/lang/String;)V", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UnexpectedRecovery extends PositioningEngineError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnexpectedRecovery(@NotNull String process) {
            super("Engine recovered in the middle of ".concat(process), null);
            Intrinsics.h(process, "process");
        }
    }

    public /* synthetic */ PositioningEngineError(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public final OriientError toOriientError$service_positioning_engine_publishRelease() {
        String message = getMessage();
        if (message == null) {
            message = "error!";
        }
        return new InternalError(message);
    }

    private PositioningEngineError(String str) {
        super(str);
    }
}
