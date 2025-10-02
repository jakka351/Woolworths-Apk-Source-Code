package au.com.woolworths.android.onesite.jwt;

import YU.a;
import io.jsonwebtoken.JwtException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/android/onesite/jwt/RewardsJwtResponse;", "", "Verified", "Rejected", "Lau/com/woolworths/android/onesite/jwt/RewardsJwtResponse$Rejected;", "Lau/com/woolworths/android/onesite/jwt/RewardsJwtResponse$Verified;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class RewardsJwtResponse {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/jwt/RewardsJwtResponse$Rejected;", "Lau/com/woolworths/android/onesite/jwt/RewardsJwtResponse;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Rejected extends RewardsJwtResponse {

        /* renamed from: a, reason: collision with root package name */
        public final JwtException f4261a;

        public Rejected(JwtException jwtException) {
            this.f4261a = jwtException;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Rejected) && this.f4261a.equals(((Rejected) obj).f4261a);
        }

        public final int hashCode() {
            return this.f4261a.hashCode();
        }

        public final String toString() {
            return "Rejected(e=" + this.f4261a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/jwt/RewardsJwtResponse$Verified;", "Lau/com/woolworths/android/onesite/jwt/RewardsJwtResponse;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Verified extends RewardsJwtResponse {

        /* renamed from: a, reason: collision with root package name */
        public final String f4262a;

        public Verified(String str) {
            this.f4262a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Verified) && Intrinsics.c(this.f4262a, ((Verified) obj).f4262a);
        }

        public final int hashCode() {
            return this.f4262a.hashCode();
        }

        public final String toString() {
            return a.h("Verified(payload=", this.f4262a, ")");
        }
    }
}
