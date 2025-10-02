package au.com.woolworths.android.onesite.network;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/network/AkamaiServerErrorType;", "", "RateLimiting", "BadIpReputation", "ScanningToolsOrWebAttacker", "BotmanProtection", "CustomRules", "Companion", "Lau/com/woolworths/android/onesite/network/AkamaiServerErrorType$BadIpReputation;", "Lau/com/woolworths/android/onesite/network/AkamaiServerErrorType$BotmanProtection;", "Lau/com/woolworths/android/onesite/network/AkamaiServerErrorType$CustomRules;", "Lau/com/woolworths/android/onesite/network/AkamaiServerErrorType$RateLimiting;", "Lau/com/woolworths/android/onesite/network/AkamaiServerErrorType$ScanningToolsOrWebAttacker;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AkamaiServerErrorType {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/network/AkamaiServerErrorType$BadIpReputation;", "Lau/com/woolworths/android/onesite/network/AkamaiServerErrorType;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BadIpReputation implements AkamaiServerErrorType {

        /* renamed from: a, reason: collision with root package name */
        public final String f4557a;
        public final String b;
        public final String c;

        public BadIpReputation(String str, String str2) {
            this.f4557a = str;
            this.b = str2;
            AkamaiCustomStatusCode akamaiCustomStatusCode = AkamaiCustomStatusCode.e;
            this.c = String.valueOf(461);
        }

        @Override // au.com.woolworths.android.onesite.network.AkamaiServerErrorType
        /* renamed from: a */
        public final String getC() {
            return "Bad IP Reputation Error";
        }

        @Override // au.com.woolworths.android.onesite.network.AkamaiServerErrorType
        /* renamed from: b, reason: from getter */
        public final String getD() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BadIpReputation)) {
                return false;
            }
            BadIpReputation badIpReputation = (BadIpReputation) obj;
            return Intrinsics.c(this.f4557a, badIpReputation.f4557a) && Intrinsics.c(this.b, badIpReputation.b);
        }

        @Override // au.com.woolworths.android.onesite.network.AkamaiServerErrorType
        /* renamed from: getErrorCode, reason: from getter */
        public final String getF4561a() {
            return this.f4557a;
        }

        @Override // au.com.woolworths.android.onesite.network.AkamaiServerErrorType
        /* renamed from: getErrorMessage, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final int hashCode() {
            String str = this.f4557a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return YU.a.j("BadIpReputation(errorCode=", this.f4557a, ", errorMessage=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/network/AkamaiServerErrorType$BotmanProtection;", "Lau/com/woolworths/android/onesite/network/AkamaiServerErrorType;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BotmanProtection implements AkamaiServerErrorType {

        /* renamed from: a, reason: collision with root package name */
        public final String f4558a;
        public final String b;
        public final String c;

        public BotmanProtection(String str, String str2) {
            this.f4558a = str;
            this.b = str2;
            AkamaiCustomStatusCode akamaiCustomStatusCode = AkamaiCustomStatusCode.e;
            this.c = String.valueOf(463);
        }

        @Override // au.com.woolworths.android.onesite.network.AkamaiServerErrorType
        /* renamed from: a */
        public final String getC() {
            return "Botman Protection Error";
        }

        @Override // au.com.woolworths.android.onesite.network.AkamaiServerErrorType
        /* renamed from: b, reason: from getter */
        public final String getD() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BotmanProtection)) {
                return false;
            }
            BotmanProtection botmanProtection = (BotmanProtection) obj;
            return Intrinsics.c(this.f4558a, botmanProtection.f4558a) && Intrinsics.c(this.b, botmanProtection.b);
        }

        @Override // au.com.woolworths.android.onesite.network.AkamaiServerErrorType
        /* renamed from: getErrorCode, reason: from getter */
        public final String getF4561a() {
            return this.f4558a;
        }

        @Override // au.com.woolworths.android.onesite.network.AkamaiServerErrorType
        /* renamed from: getErrorMessage, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final int hashCode() {
            String str = this.f4558a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return YU.a.j("BotmanProtection(errorCode=", this.f4558a, ", errorMessage=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/network/AkamaiServerErrorType$Companion;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/network/AkamaiServerErrorType$CustomRules;", "Lau/com/woolworths/android/onesite/network/AkamaiServerErrorType;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CustomRules implements AkamaiServerErrorType {

        /* renamed from: a, reason: collision with root package name */
        public final String f4559a;
        public final String b;
        public final String c;
        public final String d;

        public CustomRules(String str, String str2) {
            this.f4559a = str;
            this.b = str2;
            this.c = YU.a.A("Custom Rules ", (str == null || str.length() <= 0) ? "" : YU.a.A(" - ", str));
            AkamaiCustomStatusCode akamaiCustomStatusCode = AkamaiCustomStatusCode.e;
            this.d = String.valueOf(464);
        }

        @Override // au.com.woolworths.android.onesite.network.AkamaiServerErrorType
        /* renamed from: a, reason: from getter */
        public final String getC() {
            return this.c;
        }

        @Override // au.com.woolworths.android.onesite.network.AkamaiServerErrorType
        /* renamed from: b, reason: from getter */
        public final String getD() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomRules)) {
                return false;
            }
            CustomRules customRules = (CustomRules) obj;
            return Intrinsics.c(this.f4559a, customRules.f4559a) && Intrinsics.c(this.b, customRules.b);
        }

        @Override // au.com.woolworths.android.onesite.network.AkamaiServerErrorType
        /* renamed from: getErrorCode, reason: from getter */
        public final String getF4561a() {
            return this.f4559a;
        }

        @Override // au.com.woolworths.android.onesite.network.AkamaiServerErrorType
        /* renamed from: getErrorMessage, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final int hashCode() {
            String str = this.f4559a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return YU.a.j("CustomRules(errorCode=", this.f4559a, ", errorMessage=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/network/AkamaiServerErrorType$RateLimiting;", "Lau/com/woolworths/android/onesite/network/AkamaiServerErrorType;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RateLimiting implements AkamaiServerErrorType {

        /* renamed from: a, reason: collision with root package name */
        public final String f4560a;
        public final String b;
        public final String c;

        public RateLimiting(String str, String str2) {
            this.f4560a = str;
            this.b = str2;
            AkamaiCustomStatusCode akamaiCustomStatusCode = AkamaiCustomStatusCode.e;
            this.c = String.valueOf(460);
        }

        @Override // au.com.woolworths.android.onesite.network.AkamaiServerErrorType
        /* renamed from: a */
        public final String getC() {
            return "Rate Limiting Error";
        }

        @Override // au.com.woolworths.android.onesite.network.AkamaiServerErrorType
        /* renamed from: b, reason: from getter */
        public final String getD() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RateLimiting)) {
                return false;
            }
            RateLimiting rateLimiting = (RateLimiting) obj;
            return Intrinsics.c(this.f4560a, rateLimiting.f4560a) && Intrinsics.c(this.b, rateLimiting.b);
        }

        @Override // au.com.woolworths.android.onesite.network.AkamaiServerErrorType
        /* renamed from: getErrorCode, reason: from getter */
        public final String getF4561a() {
            return this.f4560a;
        }

        @Override // au.com.woolworths.android.onesite.network.AkamaiServerErrorType
        /* renamed from: getErrorMessage, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final int hashCode() {
            String str = this.f4560a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return YU.a.j("RateLimiting(errorCode=", this.f4560a, ", errorMessage=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/network/AkamaiServerErrorType$ScanningToolsOrWebAttacker;", "Lau/com/woolworths/android/onesite/network/AkamaiServerErrorType;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ScanningToolsOrWebAttacker implements AkamaiServerErrorType {

        /* renamed from: a, reason: collision with root package name */
        public final String f4561a;
        public final String b;
        public final String c;
        public final String d;

        public ScanningToolsOrWebAttacker(String str, String str2) {
            this.f4561a = str;
            this.b = str2;
            this.c = StringsKt.y(str, "WAT", true) ? "Web Attacker Error" : "Scanning Tools Error";
            AkamaiCustomStatusCode akamaiCustomStatusCode = AkamaiCustomStatusCode.e;
            this.d = String.valueOf(462);
        }

        @Override // au.com.woolworths.android.onesite.network.AkamaiServerErrorType
        /* renamed from: a, reason: from getter */
        public final String getC() {
            return this.c;
        }

        @Override // au.com.woolworths.android.onesite.network.AkamaiServerErrorType
        /* renamed from: b, reason: from getter */
        public final String getD() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScanningToolsOrWebAttacker)) {
                return false;
            }
            ScanningToolsOrWebAttacker scanningToolsOrWebAttacker = (ScanningToolsOrWebAttacker) obj;
            return Intrinsics.c(this.f4561a, scanningToolsOrWebAttacker.f4561a) && Intrinsics.c(this.b, scanningToolsOrWebAttacker.b);
        }

        @Override // au.com.woolworths.android.onesite.network.AkamaiServerErrorType
        /* renamed from: getErrorCode, reason: from getter */
        public final String getF4561a() {
            return this.f4561a;
        }

        @Override // au.com.woolworths.android.onesite.network.AkamaiServerErrorType
        /* renamed from: getErrorMessage, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final int hashCode() {
            String str = this.f4561a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return YU.a.j("ScanningToolsOrWebAttacker(errorCode=", this.f4561a, ", errorMessage=", this.b, ")");
        }
    }

    /* renamed from: a */
    String getC();

    /* renamed from: b */
    String getD();

    /* renamed from: getErrorCode */
    String getF4561a();

    /* renamed from: getErrorMessage */
    String getB();
}
