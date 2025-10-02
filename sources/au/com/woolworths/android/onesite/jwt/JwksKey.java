package au.com.woolworths.android.onesite.jwt;

import YU.a;
import androidx.camera.core.impl.b;
import com.google.gson.annotations.SerializedName;
import io.jsonwebtoken.JwsHeader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lau/com/woolworths/android/onesite/jwt/JwksKey;", "", "", "n", JwsHeader.KEY_ID, "e", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "a", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class JwksKey {

    @SerializedName("e")
    @NotNull
    private final String e;

    @SerializedName(JwsHeader.KEY_ID)
    @NotNull
    private final String kid;

    @SerializedName("n")
    @NotNull
    private final String n;

    public JwksKey(@NotNull String n, @NotNull String kid, @NotNull String e) {
        Intrinsics.h(n, "n");
        Intrinsics.h(kid, "kid");
        Intrinsics.h(e, "e");
        this.n = n;
        this.kid = kid;
        this.e = e;
    }

    /* renamed from: a, reason: from getter */
    public final String getE() {
        return this.e;
    }

    /* renamed from: b, reason: from getter */
    public final String getKid() {
        return this.kid;
    }

    /* renamed from: c, reason: from getter */
    public final String getN() {
        return this.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JwksKey)) {
            return false;
        }
        JwksKey jwksKey = (JwksKey) obj;
        return Intrinsics.c(this.n, jwksKey.n) && Intrinsics.c(this.kid, jwksKey.kid) && Intrinsics.c(this.e, jwksKey.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + b.c(this.n.hashCode() * 31, 31, this.kid);
    }

    public final String toString() {
        String str = this.n;
        String str2 = this.kid;
        return a.o(a.v("JwksKey(n=", str, ", kid=", str2, ", e="), this.e, ")");
    }
}
