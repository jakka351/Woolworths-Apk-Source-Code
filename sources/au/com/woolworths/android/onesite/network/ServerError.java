package au.com.woolworths.android.onesite.network;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/network/ServerError;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ServerError {

    /* renamed from: a, reason: collision with root package name */
    public final ServerErrorCode f4576a;
    public final String b;

    public ServerError(ServerErrorCode serverErrorCode, String str) {
        this.f4576a = serverErrorCode;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServerError)) {
            return false;
        }
        ServerError serverError = (ServerError) obj;
        return this.f4576a == serverError.f4576a && Intrinsics.c(this.b, serverError.b);
    }

    public final int hashCode() {
        int iHashCode = this.f4576a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ServerError(code=" + this.f4576a + ", message=" + this.b + ")";
    }
}
