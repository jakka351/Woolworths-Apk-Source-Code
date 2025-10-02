package com.woolworths.scanlibrary.models.error;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001e\u0010\u0013\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/woolworths/scanlibrary/models/error/ApigeeErrorResponse;", "", "<init>", "()V", "statusCode", "", "getStatusCode", "()I", "setStatusCode", "(I)V", "message", "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "errorCode", "getErrorCode", "setErrorCode", lqlqqlq.mmm006Dm006Dm, "getDescription", "setDescription", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public class ApigeeErrorResponse {
    public static final int $stable = 8;

    @SerializedName("statusCode")
    private int statusCode;

    @SerializedName("message")
    @NotNull
    private String message = "";

    @SerializedName("errorCode")
    @NotNull
    private String errorCode = "";

    @SerializedName(lqlqqlq.mmm006Dm006Dm)
    @NotNull
    private String description = "";

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final void setDescription(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.description = str;
    }

    public final void setErrorCode(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.errorCode = str;
    }

    public final void setMessage(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.message = str;
    }

    public final void setStatusCode(int i) {
        this.statusCode = i;
    }
}
