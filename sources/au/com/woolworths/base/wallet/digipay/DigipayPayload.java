package au.com.woolworths.base.wallet.digipay;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import io.jsonwebtoken.Claims;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012¨\u0006\u0016"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/DigipayPayload;", "", "", "accessToken", "digipayToken", "", "digipayTokenExpiresIn", "digipayTokenIssuedAt", "hashCrn", Claims.ISSUED_AT, "<init>", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;J)V", "Ljava/lang/String;", "getAccessToken", "()Ljava/lang/String;", "a", "J", "b", "()J", "getDigipayTokenIssuedAt", "getHashCrn", "getIat", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DigipayPayload {

    @SerializedName("accessToken")
    @NotNull
    private final String accessToken;

    @SerializedName("digipayToken")
    @NotNull
    private final String digipayToken;

    @SerializedName("digipayTokenExpiresIn")
    private final long digipayTokenExpiresIn;

    @SerializedName("digipayTokenIssuedAt")
    private final long digipayTokenIssuedAt;

    @SerializedName("hashCrn")
    @NotNull
    private final String hashCrn;

    @SerializedName(Claims.ISSUED_AT)
    private final long iat;

    public DigipayPayload(@NotNull String accessToken, @NotNull String digipayToken, long j, long j2, @NotNull String hashCrn, long j3) {
        Intrinsics.h(accessToken, "accessToken");
        Intrinsics.h(digipayToken, "digipayToken");
        Intrinsics.h(hashCrn, "hashCrn");
        this.accessToken = accessToken;
        this.digipayToken = digipayToken;
        this.digipayTokenExpiresIn = j;
        this.digipayTokenIssuedAt = j2;
        this.hashCrn = hashCrn;
        this.iat = j3;
    }

    /* renamed from: a, reason: from getter */
    public final String getDigipayToken() {
        return this.digipayToken;
    }

    /* renamed from: b, reason: from getter */
    public final long getDigipayTokenExpiresIn() {
        return this.digipayTokenExpiresIn;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DigipayPayload)) {
            return false;
        }
        DigipayPayload digipayPayload = (DigipayPayload) obj;
        return Intrinsics.c(this.accessToken, digipayPayload.accessToken) && Intrinsics.c(this.digipayToken, digipayPayload.digipayToken) && this.digipayTokenExpiresIn == digipayPayload.digipayTokenExpiresIn && this.digipayTokenIssuedAt == digipayPayload.digipayTokenIssuedAt && Intrinsics.c(this.hashCrn, digipayPayload.hashCrn) && this.iat == digipayPayload.iat;
    }

    public final int hashCode() {
        return Long.hashCode(this.iat) + b.c(b.b(b.b(b.c(this.accessToken.hashCode() * 31, 31, this.digipayToken), 31, this.digipayTokenExpiresIn), 31, this.digipayTokenIssuedAt), 31, this.hashCrn);
    }

    public final String toString() {
        String str = this.accessToken;
        String str2 = this.digipayToken;
        long j = this.digipayTokenExpiresIn;
        long j2 = this.digipayTokenIssuedAt;
        String str3 = this.hashCrn;
        long j3 = this.iat;
        StringBuilder sbV = a.v("DigipayPayload(accessToken=", str, ", digipayToken=", str2, ", digipayTokenExpiresIn=");
        sbV.append(j);
        androidx.constraintlayout.core.state.a.A(sbV, ", digipayTokenIssuedAt=", j2, ", hashCrn=");
        sbV.append(str3);
        sbV.append(", iat=");
        sbV.append(j3);
        sbV.append(")");
        return sbV.toString();
    }
}
