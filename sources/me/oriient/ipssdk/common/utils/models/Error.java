package me.oriient.ipssdk.common.utils.models;

import YU.a;
import androidx.annotation.Keep;
import kotlin.Metadata;
import me.oriient.ipssdk.api.models.IPSError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB!\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007B\u001f\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lme/oriient/ipssdk/common/utils/models/Error;", "Lme/oriient/ipssdk/api/models/IPSError;", "t", "", "code", "", "recoveryStrategy", "(Ljava/lang/Throwable;II)V", "message", "", "(Ljava/lang/String;II)V", "getCode", "getMessage", "getRecoveryStrategy", "toString", "Companion", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Error implements IPSError {

    @NotNull
    private static final String NO_ERROR_MESSAGE = "no error message";
    private final int code;

    @Nullable
    private final String message;
    private final int recoveryStrategy;

    public Error(@Nullable String str, int i, int i2) {
        this.message = str;
        this.code = i;
        this.recoveryStrategy = i2;
    }

    @Override // me.oriient.ipssdk.api.models.IPSError
    public int getCode() {
        return this.code;
    }

    @Override // me.oriient.ipssdk.api.models.IPSError
    @NotNull
    public String getMessage() {
        String str = this.message;
        return str == null ? NO_ERROR_MESSAGE : str;
    }

    @Override // me.oriient.ipssdk.api.models.IPSError
    public int getRecoveryStrategy() {
        return this.recoveryStrategy;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Error{message='");
        sb.append(this.message);
        sb.append("', code=");
        sb.append(this.code);
        sb.append("', recoveryStrategy=");
        return a.l(sb, this.recoveryStrategy, '}');
    }

    public Error(@Nullable Throwable th, int i, int i2) {
        String message;
        this((th == null || (message = th.getMessage()) == null) ? NO_ERROR_MESSAGE : message, i, i2);
    }
}
