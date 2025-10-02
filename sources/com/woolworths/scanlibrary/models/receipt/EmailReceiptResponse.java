package com.woolworths.scanlibrary.models.receipt;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.Scopes;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/woolworths/scanlibrary/models/receipt/EmailReceiptResponse;", "", "status", "", "message", Scopes.EMAIL, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "getMessage", "getEmail", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class EmailReceiptResponse {
    public static final int $stable = 0;

    @SerializedName(Scopes.EMAIL)
    @NotNull
    private final String email;

    @SerializedName("message")
    @NotNull
    private final String message;

    @SerializedName("status")
    @NotNull
    private final String status;

    public EmailReceiptResponse(@NotNull String status, @NotNull String message, @NotNull String email) {
        Intrinsics.h(status, "status");
        Intrinsics.h(message, "message");
        Intrinsics.h(email, "email");
        this.status = status;
        this.message = message;
        this.email = email;
    }

    public static /* synthetic */ EmailReceiptResponse copy$default(EmailReceiptResponse emailReceiptResponse, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailReceiptResponse.status;
        }
        if ((i & 2) != 0) {
            str2 = emailReceiptResponse.message;
        }
        if ((i & 4) != 0) {
            str3 = emailReceiptResponse.email;
        }
        return emailReceiptResponse.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @NotNull
    public final EmailReceiptResponse copy(@NotNull String status, @NotNull String message, @NotNull String email) {
        Intrinsics.h(status, "status");
        Intrinsics.h(message, "message");
        Intrinsics.h(email, "email");
        return new EmailReceiptResponse(status, message, email);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmailReceiptResponse)) {
            return false;
        }
        EmailReceiptResponse emailReceiptResponse = (EmailReceiptResponse) other;
        return Intrinsics.c(this.status, emailReceiptResponse.status) && Intrinsics.c(this.message, emailReceiptResponse.message) && Intrinsics.c(this.email, emailReceiptResponse.email);
    }

    @NotNull
    public final String getEmail() {
        return this.email;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.email.hashCode() + b.c(this.status.hashCode() * 31, 31, this.message);
    }

    @NotNull
    public String toString() {
        String str = this.status;
        String str2 = this.message;
        return a.o(a.v("EmailReceiptResponse(status=", str, ", message=", str2, ", email="), this.email, ")");
    }
}
