package au.com.woolworths.android.onesite.jwt;

import au.com.woolworths.android.onesite.a;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.storage.db.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/android/onesite/jwt/JwksKeyResponse;", "", "", "Lau/com/woolworths/android/onesite/jwt/JwksKey;", i.a.n, "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class JwksKeyResponse {

    @SerializedName(i.a.n)
    @NotNull
    private final List<JwksKey> keys;

    public JwksKeyResponse(@NotNull List<JwksKey> keys) {
        Intrinsics.h(keys, "keys");
        this.keys = keys;
    }

    /* renamed from: a, reason: from getter */
    public final List getKeys() {
        return this.keys;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof JwksKeyResponse) && Intrinsics.c(this.keys, ((JwksKeyResponse) obj).keys);
    }

    public final int hashCode() {
        return this.keys.hashCode();
    }

    public final String toString() {
        return a.l("JwksKeyResponse(keys=", ")", this.keys);
    }
}
