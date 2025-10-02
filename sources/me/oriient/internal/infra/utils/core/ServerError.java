package me.oriient.internal.infra.utils.core;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lme/oriient/internal/infra/utils/core/ServerError;", "Lme/oriient/internal/infra/utils/core/OriientError;", "code", "", "message", "", "(ILjava/lang/String;)V", "getCode", "()I", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ServerError extends OriientError {
    private final int code;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServerError(int i, @NotNull String message) {
        super(null, message, 1, null);
        Intrinsics.h(message, "message");
        this.code = i;
    }

    public final int getCode() {
        return this.code;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return "ServerError(code=" + this.code + ", message=" + getMessage() + ')';
    }
}
