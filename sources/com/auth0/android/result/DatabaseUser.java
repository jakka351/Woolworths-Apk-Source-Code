package com.auth0.android.result;

import com.auth0.android.request.internal.JsonRequired;
import com.google.android.gms.common.Scopes;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/auth0/android/result/DatabaseUser;", "", "", Scopes.EMAIL, "username", "", "isEmailVerified", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Ljava/lang/String;", "getEmail", "()Ljava/lang/String;", "getUsername", "Z", "()Z", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DatabaseUser {

    @SerializedName(Scopes.EMAIL)
    @JsonRequired
    @NotNull
    private final String email;

    @SerializedName("email_verified")
    private final boolean isEmailVerified;

    @SerializedName("username")
    @Nullable
    private final String username;

    public DatabaseUser(@NotNull String email, @Nullable String str, boolean z) {
        Intrinsics.h(email, "email");
        this.email = email;
        this.username = str;
        this.isEmailVerified = z;
    }
}
