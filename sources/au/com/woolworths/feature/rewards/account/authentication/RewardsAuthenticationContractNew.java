package au.com.woolworths.feature.rewards.account.authentication;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContractNew;", "", "Action", "ViewState", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface RewardsAuthenticationContractNew {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContractNew$Action;", "", "LaunchHomepage", "LaunchAuth0Form", "LaunchContactUs", "Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContractNew$Action$LaunchAuth0Form;", "Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContractNew$Action$LaunchContactUs;", "Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContractNew$Action$LaunchHomepage;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContractNew$Action$LaunchAuth0Form;", "Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContractNew$Action;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchAuth0Form implements Action {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f5656a;
            public final Boolean b;

            public LaunchAuth0Form(boolean z, int i) {
                Boolean bool = (i & 2) != 0 ? Boolean.FALSE : Boolean.TRUE;
                this.f5656a = z;
                this.b = bool;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchAuth0Form)) {
                    return false;
                }
                LaunchAuth0Form launchAuth0Form = (LaunchAuth0Form) obj;
                return this.f5656a == launchAuth0Form.f5656a && Intrinsics.c(this.b, launchAuth0Form.b);
            }

            public final int hashCode() {
                int iHashCode = Boolean.hashCode(this.f5656a) * 31;
                Boolean bool = this.b;
                return (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            }

            public final String toString() {
                return "LaunchAuth0Form(isSignUp=" + this.f5656a + ", forceLogin=" + this.b + ", email=null)";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContractNew$Action$LaunchContactUs;", "Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContractNew$Action;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchContactUs implements Action {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchContactUs f5657a = new LaunchContactUs();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchContactUs);
            }

            public final int hashCode() {
                return 574965257;
            }

            public final String toString() {
                return "LaunchContactUs";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContractNew$Action$LaunchHomepage;", "Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContractNew$Action;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchHomepage implements Action {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchHomepage f5658a = new LaunchHomepage();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchHomepage);
            }

            public final int hashCode() {
                return -592109725;
            }

            public final String toString() {
                return "LaunchHomepage";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContractNew$ViewState;", "", "Loading", "Signup", "ForcedLoggedOut", "Error", "Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContractNew$ViewState$Error;", "Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContractNew$ViewState$ForcedLoggedOut;", "Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContractNew$ViewState$Loading;", "Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContractNew$ViewState$Signup;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ViewState {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContractNew$ViewState$Error;", "Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContractNew$ViewState;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Error implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final RewardsAuthenticationFullPageMessageError f5659a;

            public Error(RewardsAuthenticationFullPageMessageError rewardsAuthenticationFullPageMessageError) {
                this.f5659a = rewardsAuthenticationFullPageMessageError;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.c(this.f5659a, ((Error) obj).f5659a);
            }

            public final int hashCode() {
                return this.f5659a.hashCode();
            }

            public final String toString() {
                return "Error(error=" + this.f5659a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContractNew$ViewState$ForcedLoggedOut;", "Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContractNew$ViewState;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ForcedLoggedOut implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public static final ForcedLoggedOut f5660a = new ForcedLoggedOut();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ForcedLoggedOut);
            }

            public final int hashCode() {
                return 123741499;
            }

            public final String toString() {
                return "ForcedLoggedOut";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContractNew$ViewState$Loading;", "Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContractNew$ViewState;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Loading implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public static final Loading f5661a = new Loading();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public final int hashCode() {
                return -468352284;
            }

            public final String toString() {
                return "Loading";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContractNew$ViewState$Signup;", "Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContractNew$ViewState;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Signup implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final String f5662a;
            public final String b;
            public final String c;

            public Signup(String urlToLoad, String callbackUrlPattern, String str) {
                Intrinsics.h(urlToLoad, "urlToLoad");
                Intrinsics.h(callbackUrlPattern, "callbackUrlPattern");
                this.f5662a = urlToLoad;
                this.b = callbackUrlPattern;
                this.c = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Signup)) {
                    return false;
                }
                Signup signup = (Signup) obj;
                return Intrinsics.c(this.f5662a, signup.f5662a) && Intrinsics.c(this.b, signup.b) && Intrinsics.c(this.c, signup.c);
            }

            public final int hashCode() {
                int iC = androidx.camera.core.impl.b.c(this.f5662a.hashCode() * 31, 31, this.b);
                String str = this.c;
                return iC + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return YU.a.o(YU.a.v("Signup(urlToLoad=", this.f5662a, ", callbackUrlPattern=", this.b, ", callbackUrlRegexPattern="), this.c, ")");
            }
        }
    }
}
