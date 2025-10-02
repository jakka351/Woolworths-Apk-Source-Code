package me.oriient.navigation.common.util;

import androidx.annotation.Keep;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.utils.core.OriientError;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\n\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\u000f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\b\u001a\u00020\tR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\n\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lme/oriient/navigation/common/util/NavigationError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "toOriientError", "Lme/oriient/internal/infra/utils/core/OriientError;", "AlgoCoreError", "AuthError", "DbError", "GeneralError", "IOError", "InternalError", "InvalidInputError", "OperationCanceled", "ParsingError", "ServerError", "Lme/oriient/navigation/common/util/NavigationError$AlgoCoreError;", "Lme/oriient/navigation/common/util/NavigationError$AuthError;", "Lme/oriient/navigation/common/util/NavigationError$DbError;", "Lme/oriient/navigation/common/util/NavigationError$GeneralError;", "Lme/oriient/navigation/common/util/NavigationError$IOError;", "Lme/oriient/navigation/common/util/NavigationError$InternalError;", "Lme/oriient/navigation/common/util/NavigationError$InvalidInputError;", "Lme/oriient/navigation/common/util/NavigationError$OperationCanceled;", "Lme/oriient/navigation/common/util/NavigationError$ParsingError;", "Lme/oriient/navigation/common/util/NavigationError$ServerError;", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class NavigationError extends Exception {

    @NotNull
    private final String message;

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/navigation/common/util/NavigationError$AlgoCoreError;", "Lme/oriient/navigation/common/util/NavigationError;", "message", "", "(Ljava/lang/String;)V", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AlgoCoreError extends NavigationError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AlgoCoreError(@NotNull String message) {
            super(message, null);
            Intrinsics.h(message, "message");
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/navigation/common/util/NavigationError$AuthError;", "Lme/oriient/navigation/common/util/NavigationError;", "()V", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AuthError extends NavigationError {

        @NotNull
        public static final AuthError INSTANCE = new AuthError();

        private AuthError() {
            super("Error: not logged in", null);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/navigation/common/util/NavigationError$DbError;", "Lme/oriient/navigation/common/util/NavigationError;", lqlqqlq.mmm006Dm006Dm, "", "(Ljava/lang/String;)V", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DbError extends NavigationError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DbError(@NotNull String description) {
            super("Error: DB operation failed - ".concat(description), null);
            Intrinsics.h(description, "description");
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/navigation/common/util/NavigationError$GeneralError;", "Lme/oriient/navigation/common/util/NavigationError;", "message", "", "(Ljava/lang/String;)V", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class GeneralError extends NavigationError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GeneralError(@NotNull String message) {
            super(message, null);
            Intrinsics.h(message, "message");
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/navigation/common/util/NavigationError$IOError;", "Lme/oriient/navigation/common/util/NavigationError;", "()V", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IOError extends NavigationError {

        @NotNull
        public static final IOError INSTANCE = new IOError();

        private IOError() {
            super("Error: error while reading or writing from/to file", null);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/navigation/common/util/NavigationError$InternalError;", "Lme/oriient/navigation/common/util/NavigationError;", "message", "", "(Ljava/lang/String;)V", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InternalError extends NavigationError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InternalError(@NotNull String message) {
            super(message, null);
            Intrinsics.h(message, "message");
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/navigation/common/util/NavigationError$InvalidInputError;", "Lme/oriient/navigation/common/util/NavigationError;", "message", "", "(Ljava/lang/String;)V", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InvalidInputError extends NavigationError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidInputError(@NotNull String message) {
            super(message, null);
            Intrinsics.h(message, "message");
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/navigation/common/util/NavigationError$OperationCanceled;", "Lme/oriient/navigation/common/util/NavigationError;", "()V", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OperationCanceled extends NavigationError {

        @NotNull
        public static final OperationCanceled INSTANCE = new OperationCanceled();

        private OperationCanceled() {
            super("Operation canceled", null);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lme/oriient/navigation/common/util/NavigationError$ParsingError;", "Lme/oriient/navigation/common/util/NavigationError;", "toParse", "", "(Ljava/lang/Object;)V", "getToParse", "()Ljava/lang/Object;", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ParsingError extends NavigationError {

        @NotNull
        private final Object toParse;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParsingError(@NotNull Object toParse) {
            super("Error: failed to parse " + toParse, null);
            Intrinsics.h(toParse, "toParse");
            this.toParse = toParse;
        }

        @NotNull
        public final Object getToParse() {
            return this.toParse;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lme/oriient/navigation/common/util/NavigationError$ServerError;", "Lme/oriient/navigation/common/util/NavigationError;", "code", "", "serverMessage", "", "(ILjava/lang/String;)V", "getCode", "()I", "getServerMessage", "()Ljava/lang/String;", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ServerError extends NavigationError {
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

        public final int getCode() {
            return this.code;
        }

        @NotNull
        public final String getServerMessage() {
            return this.serverMessage;
        }
    }

    public /* synthetic */ NavigationError(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }

    @NotNull
    public final OriientError toOriientError() {
        if (equals(AuthError.INSTANCE)) {
            return new me.oriient.internal.infra.utils.core.AuthError();
        }
        if (equals(IOError.INSTANCE)) {
            return new me.oriient.internal.infra.utils.core.IOError();
        }
        if (this instanceof InvalidInputError ? true : this instanceof DbError ? true : this instanceof AlgoCoreError ? true : this instanceof GeneralError ? true : this instanceof InternalError) {
            return new me.oriient.internal.infra.utils.core.InternalError(getMessage());
        }
        if (equals(OperationCanceled.INSTANCE)) {
            return new me.oriient.internal.infra.utils.core.OperationCanceled();
        }
        if (this instanceof ParsingError) {
            return new me.oriient.internal.infra.utils.core.ParsingError(((ParsingError) this).getToParse().toString());
        }
        if (this instanceof ServerError) {
            return new me.oriient.internal.infra.utils.core.ServerError(((ServerError) this).getCode(), getMessage());
        }
        throw new NoWhenBranchMatchedException();
    }

    private NavigationError(String str) {
        super(str);
        this.message = str;
    }
}
