package au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.data.RewardsSecurePreference;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.data.RewardsSecurePreferenceLoadingState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesContract;", "", "ViewState", "Content", "Action", "ViewAction", "ViewModelAction", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SecurityPreferencesContract {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesContract$Action;", "", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Action {
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesContract$Content;", "", "Loading", "ServerError", "NoConnection", "UpdateError", "Changing", "Preference", "Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesContract$Content$Changing;", "Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesContract$Content$Loading;", "Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesContract$Content$NoConnection;", "Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesContract$Content$Preference;", "Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesContract$Content$ServerError;", "Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesContract$Content$UpdateError;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Content {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesContract$Content$Changing;", "Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesContract$Content;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Changing implements Content {

            /* renamed from: a, reason: collision with root package name */
            public final RewardsSecurePreferenceLoadingState f6451a;

            public Changing(RewardsSecurePreferenceLoadingState rewardsSecurePreferenceLoadingState) {
                this.f6451a = rewardsSecurePreferenceLoadingState;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Changing) && Intrinsics.c(this.f6451a, ((Changing) obj).f6451a);
            }

            public final int hashCode() {
                RewardsSecurePreferenceLoadingState rewardsSecurePreferenceLoadingState = this.f6451a;
                if (rewardsSecurePreferenceLoadingState == null) {
                    return 0;
                }
                return rewardsSecurePreferenceLoadingState.hashCode();
            }

            public final String toString() {
                return "Changing(data=" + this.f6451a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesContract$Content$Loading;", "Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesContract$Content;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Loading implements Content {

            /* renamed from: a, reason: collision with root package name */
            public static final Loading f6452a = new Loading();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public final int hashCode() {
                return -1544881828;
            }

            public final String toString() {
                return "Loading";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesContract$Content$NoConnection;", "Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesContract$Content;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NoConnection implements Content {

            /* renamed from: a, reason: collision with root package name */
            public static final NoConnection f6453a = new NoConnection();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NoConnection);
            }

            public final int hashCode() {
                return -1721440417;
            }

            public final String toString() {
                return "NoConnection";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesContract$Content$Preference;", "Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesContract$Content;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Preference implements Content {

            /* renamed from: a, reason: collision with root package name */
            public final RewardsSecurePreference f6454a;

            public Preference(RewardsSecurePreference data) {
                Intrinsics.h(data, "data");
                this.f6454a = data;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Preference) && Intrinsics.c(this.f6454a, ((Preference) obj).f6454a);
            }

            public final int hashCode() {
                return this.f6454a.hashCode() + (Boolean.hashCode(false) * 31);
            }

            public final String toString() {
                return "Preference(updated=false, data=" + this.f6454a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesContract$Content$ServerError;", "Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesContract$Content;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ServerError implements Content {

            /* renamed from: a, reason: collision with root package name */
            public static final ServerError f6455a = new ServerError();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ServerError);
            }

            public final int hashCode() {
                return 942328997;
            }

            public final String toString() {
                return "ServerError";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesContract$Content$UpdateError;", "Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesContract$Content;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class UpdateError implements Content {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f6456a;

            public UpdateError(boolean z) {
                this.f6456a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UpdateError) && this.f6456a == ((UpdateError) obj).f6456a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f6456a);
            }

            public final String toString() {
                return androidx.compose.ui.input.pointer.a.n("UpdateError(lock=", ")", this.f6456a);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesContract$ViewAction;", "Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesContract$Action;", "DoNothing", "Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesContract$ViewAction$DoNothing;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ViewAction extends Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesContract$ViewAction$DoNothing;", "Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesContract$ViewAction;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class DoNothing implements ViewAction {
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof DoNothing);
            }

            public final int hashCode() {
                return -1189548006;
            }

            public final String toString() {
                return "DoNothing";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesContract$ViewModelAction;", "Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesContract$Action;", "ChangeLock", "RetryFetch", "Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesContract$ViewModelAction$ChangeLock;", "Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesContract$ViewModelAction$RetryFetch;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ViewModelAction extends Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesContract$ViewModelAction$ChangeLock;", "Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesContract$ViewModelAction;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ChangeLock implements ViewModelAction {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f6457a;

            public ChangeLock(boolean z) {
                this.f6457a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeLock) && this.f6457a == ((ChangeLock) obj).f6457a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f6457a);
            }

            public final String toString() {
                return androidx.compose.ui.input.pointer.a.n("ChangeLock(lock=", ")", this.f6457a);
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesContract$ViewModelAction$RetryFetch;", "Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesContract$ViewModelAction;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class RetryFetch implements ViewModelAction {

            /* renamed from: a, reason: collision with root package name */
            public static final RetryFetch f6458a = new RetryFetch();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RetryFetch);
            }

            public final int hashCode() {
                return -247812911;
            }

            public final String toString() {
                return "RetryFetch";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesContract$ViewState;", "", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final Content f6459a;
        public final ViewAction b;
        public final Function1 c;
        public final Function1 d;

        public ViewState(Content content, ViewAction viewAction, Function1 function1, Function1 function12) {
            Intrinsics.h(content, "content");
            this.f6459a = content;
            this.b = viewAction;
            this.c = function1;
            this.d = function12;
        }

        public static ViewState a(ViewState viewState, Content content, ViewAction viewAction, int i) {
            if ((i & 1) != 0) {
                content = viewState.f6459a;
            }
            if ((i & 2) != 0) {
                viewAction = viewState.b;
            }
            Function1 function1 = viewState.c;
            Function1 function12 = viewState.d;
            viewState.getClass();
            Intrinsics.h(content, "content");
            return new ViewState(content, viewAction, function1, function12);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.c(this.f6459a, viewState.f6459a) && Intrinsics.c(this.b, viewState.b) && Intrinsics.c(this.c, viewState.c) && Intrinsics.c(this.d, viewState.d);
        }

        public final int hashCode() {
            int iHashCode = this.f6459a.hashCode() * 31;
            ViewAction viewAction = this.b;
            return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (viewAction == null ? 0 : viewAction.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            return "ViewState(content=" + this.f6459a + ", action=" + this.b + ", complete=" + this.c + ", trigger=" + this.d + ")";
        }
    }
}
