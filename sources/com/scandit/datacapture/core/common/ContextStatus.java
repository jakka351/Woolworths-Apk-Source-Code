package com.scandit.datacapture.core.common;

import com.scandit.datacapture.core.internal.sdk.common.NativeContextStatus;
import com.scandit.datacapture.core.internal.sdk.common.NativeContextStatusCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/scandit/datacapture/core/common/ContextStatus;", "", "Lcom/scandit/datacapture/core/internal/sdk/common/NativeContextStatus;", "_impl$scandit_capture_core", "()Lcom/scandit/datacapture/core/internal/sdk/common/NativeContextStatus;", "_impl", "", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "", "b", "I", "getCode", "()I", "code", "", "isValid", "()Z", "status", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/common/NativeContextStatus;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class ContextStatus {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String message;

    /* renamed from: b, reason: from kotlin metadata */
    private final int code;

    public ContextStatus(@NotNull NativeContextStatus status) {
        Intrinsics.h(status, "status");
        String message = status.getMessage();
        Intrinsics.g(message, "status.message");
        this.message = message;
        this.code = status.getCode();
    }

    @NotNull
    public final NativeContextStatus _impl$scandit_capture_core() {
        return new NativeContextStatus(this.message, this.code);
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final boolean isValid() {
        return NativeContextStatusCompat.isValid(this.code);
    }
}
