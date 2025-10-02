package com.woolworths.scanlibrary.models.authentication;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/woolworths/scanlibrary/models/authentication/Token;", "", "accessToken", "", "refreshToken", "expiresIn", "shopperId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getRefreshToken", "getExpiresIn", "getShopperId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Token {
    public static final int $stable = 0;

    @SerializedName("access_token")
    @NotNull
    private final String accessToken;

    @SerializedName("expires_in")
    @Nullable
    private final String expiresIn;

    @SerializedName("refresh_token")
    @NotNull
    private final String refreshToken;

    @SerializedName("shopperId")
    @Nullable
    private final String shopperId;

    public Token() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ Token copy$default(Token token, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = token.accessToken;
        }
        if ((i & 2) != 0) {
            str2 = token.refreshToken;
        }
        if ((i & 4) != 0) {
            str3 = token.expiresIn;
        }
        if ((i & 8) != 0) {
            str4 = token.shopperId;
        }
        return token.copy(str, str2, str3, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getExpiresIn() {
        return this.expiresIn;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getShopperId() {
        return this.shopperId;
    }

    @NotNull
    public final Token copy(@NotNull String accessToken, @NotNull String refreshToken, @Nullable String expiresIn, @Nullable String shopperId) {
        Intrinsics.h(accessToken, "accessToken");
        Intrinsics.h(refreshToken, "refreshToken");
        return new Token(accessToken, refreshToken, expiresIn, shopperId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Token)) {
            return false;
        }
        Token token = (Token) other;
        return Intrinsics.c(this.accessToken, token.accessToken) && Intrinsics.c(this.refreshToken, token.refreshToken) && Intrinsics.c(this.expiresIn, token.expiresIn) && Intrinsics.c(this.shopperId, token.shopperId);
    }

    @NotNull
    public final String getAccessToken() {
        return this.accessToken;
    }

    @Nullable
    public final String getExpiresIn() {
        return this.expiresIn;
    }

    @NotNull
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    @Nullable
    public final String getShopperId() {
        return this.shopperId;
    }

    public int hashCode() {
        int iC = b.c(this.accessToken.hashCode() * 31, 31, this.refreshToken);
        String str = this.expiresIn;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.shopperId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.accessToken;
        String str2 = this.refreshToken;
        return a.l(YU.a.v("Token(accessToken=", str, ", refreshToken=", str2, ", expiresIn="), this.expiresIn, ", shopperId=", this.shopperId, ")");
    }

    public Token(@NotNull String accessToken, @NotNull String refreshToken, @Nullable String str, @Nullable String str2) {
        Intrinsics.h(accessToken, "accessToken");
        Intrinsics.h(refreshToken, "refreshToken");
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.expiresIn = str;
        this.shopperId = str2;
    }

    public /* synthetic */ Token(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
