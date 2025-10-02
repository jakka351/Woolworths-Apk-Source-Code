package com.auth0.android.result;

import YU.a;
import com.google.gson.annotations.SerializedName;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0016\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0015\u0010\u000eR.\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@@X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/auth0/android/result/Credentials;", "", "", "idToken", "accessToken", "type", "refreshToken", "Ljava/util/Date;", "expiresAt", "scope", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "a", "f", "d", "Ljava/util/Date;", "b", "()Ljava/util/Date;", "e", "<set-?>", "recoveryCode", "getRecoveryCode", "g", "(Ljava/lang/String;)V", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class Credentials {

    @SerializedName("access_token")
    @NotNull
    private final String accessToken;

    @SerializedName("expires_at")
    @NotNull
    private final Date expiresAt;

    @SerializedName("id_token")
    @NotNull
    private final String idToken;

    @SerializedName("recovery_code")
    @Nullable
    private String recoveryCode;

    @SerializedName("refresh_token")
    @Nullable
    private final String refreshToken;

    @SerializedName("scope")
    @Nullable
    private final String scope;

    @SerializedName("token_type")
    @NotNull
    private final String type;

    public Credentials(@NotNull String idToken, @NotNull String accessToken, @NotNull String type, @Nullable String str, @NotNull Date expiresAt, @Nullable String str2) {
        Intrinsics.h(idToken, "idToken");
        Intrinsics.h(accessToken, "accessToken");
        Intrinsics.h(type, "type");
        Intrinsics.h(expiresAt, "expiresAt");
        this.idToken = idToken;
        this.accessToken = accessToken;
        this.type = type;
        this.refreshToken = str;
        this.expiresAt = expiresAt;
        this.scope = str2;
    }

    /* renamed from: a, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* renamed from: b, reason: from getter */
    public final Date getExpiresAt() {
        return this.expiresAt;
    }

    /* renamed from: c, reason: from getter */
    public final String getIdToken() {
        return this.idToken;
    }

    /* renamed from: d, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    /* renamed from: e, reason: from getter */
    public final String getScope() {
        return this.scope;
    }

    /* renamed from: f, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final void g(String str) {
        this.recoveryCode = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Credentials(idToken='xxxxx', accessToken='xxxxx', type='");
        sb.append(this.type);
        sb.append("', refreshToken='xxxxx', expiresAt='");
        sb.append(this.expiresAt);
        sb.append("', scope='");
        return a.o(sb, this.scope, "')");
    }
}
