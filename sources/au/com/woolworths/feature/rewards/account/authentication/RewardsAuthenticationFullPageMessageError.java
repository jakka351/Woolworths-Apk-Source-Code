package au.com.woolworths.feature.rewards.account.authentication;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.ResText;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationFullPageMessageError;", "", "ConnectionError", "ServerError", "CustomError", "UserBlockedError", "Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationFullPageMessageError$ConnectionError;", "Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationFullPageMessageError$CustomError;", "Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationFullPageMessageError$ServerError;", "Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationFullPageMessageError$UserBlockedError;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface RewardsAuthenticationFullPageMessageError {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationFullPageMessageError$ConnectionError;", "Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationFullPageMessageError;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConnectionError implements RewardsAuthenticationFullPageMessageError {

        /* renamed from: a, reason: collision with root package name */
        public static final ConnectionError f5663a = new ConnectionError();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ConnectionError);
        }

        public final int hashCode() {
            return 455714289;
        }

        public final String toString() {
            return "ConnectionError";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationFullPageMessageError$CustomError;", "Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationFullPageMessageError;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CustomError implements RewardsAuthenticationFullPageMessageError {

        /* renamed from: a, reason: collision with root package name */
        public final ResText f5664a;

        public CustomError(ResText resText) {
            this.f5664a = resText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CustomError) && this.f5664a.equals(((CustomError) obj).f5664a);
        }

        public final int hashCode() {
            return this.f5664a.hashCode();
        }

        public final String toString() {
            return "CustomError(errorMessage=" + this.f5664a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationFullPageMessageError$ServerError;", "Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationFullPageMessageError;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ServerError implements RewardsAuthenticationFullPageMessageError {

        /* renamed from: a, reason: collision with root package name */
        public static final ServerError f5665a = new ServerError();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ServerError);
        }

        public final int hashCode() {
            return -1203529684;
        }

        public final String toString() {
            return "ServerError";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationFullPageMessageError$UserBlockedError;", "Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationFullPageMessageError;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UserBlockedError implements RewardsAuthenticationFullPageMessageError {

        /* renamed from: a, reason: collision with root package name */
        public static final UserBlockedError f5666a = new UserBlockedError();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UserBlockedError);
        }

        public final int hashCode() {
            return -41904224;
        }

        public final String toString() {
            return "UserBlockedError";
        }
    }
}
