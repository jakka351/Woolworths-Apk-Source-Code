package au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.data.SecureDollarsConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecureDollarsContract;", "", "ViewState", "Content", "Action", "ViewModelAction", "ViewAction", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SecureDollarsContract {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecureDollarsContract$Action;", "", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Action {
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecureDollarsContract$Content;", "", "Loading", "Error", "Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecureDollarsContract$Content$Error;", "Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecureDollarsContract$Content$Loading;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Content {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecureDollarsContract$Content$Error;", "Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecureDollarsContract$Content;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Error implements Content {

            /* renamed from: a, reason: collision with root package name */
            public final String f6442a;

            public Error(String str) {
                this.f6442a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.c(this.f6442a, ((Error) obj).f6442a);
            }

            public final int hashCode() {
                String str = this.f6442a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return YU.a.h("Error(message=", this.f6442a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecureDollarsContract$Content$Loading;", "Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecureDollarsContract$Content;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Loading implements Content {

            /* renamed from: a, reason: collision with root package name */
            public static final Loading f6443a = new Loading();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public final int hashCode() {
                return 1922986052;
            }

            public final String toString() {
                return "Loading";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecureDollarsContract$ViewAction;", "Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecureDollarsContract$Action;", "Success", "Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecureDollarsContract$ViewAction$Success;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ViewAction extends Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecureDollarsContract$ViewAction$Success;", "Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecureDollarsContract$ViewAction;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Success implements ViewAction {

            /* renamed from: a, reason: collision with root package name */
            public final String f6444a;

            public Success(String str) {
                this.f6444a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && Intrinsics.c(this.f6444a, ((Success) obj).f6444a);
            }

            public final int hashCode() {
                String str = this.f6444a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return YU.a.h("Success(message=", this.f6444a, ")");
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecureDollarsContract$ViewModelAction;", "Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecureDollarsContract$Action;", "Retry", "Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecureDollarsContract$ViewModelAction$Retry;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ViewModelAction extends Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecureDollarsContract$ViewModelAction$Retry;", "Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecureDollarsContract$ViewModelAction;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Retry implements ViewModelAction {

            /* renamed from: a, reason: collision with root package name */
            public static final Retry f6445a = new Retry();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Retry);
            }

            public final int hashCode() {
                return 608357457;
            }

            public final String toString() {
                return "Retry";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecureDollarsContract$ViewState;", "", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final SecureDollarsConfig f6446a;
        public final String b;
        public final String c;
        public final Content d;
        public final ViewAction e;
        public final Function1 f;
        public final Function1 g;

        public ViewState(SecureDollarsConfig secureDollarsConfig, String str, String str2, Content content, ViewAction viewAction, Function1 function1, Function1 function12) {
            Intrinsics.h(content, "content");
            this.f6446a = secureDollarsConfig;
            this.b = str;
            this.c = str2;
            this.d = content;
            this.e = viewAction;
            this.f = function1;
            this.g = function12;
        }

        public static ViewState a(ViewState viewState, String str, String str2, Content content, ViewAction viewAction, int i) {
            SecureDollarsConfig secureDollarsConfig = viewState.f6446a;
            if ((i & 2) != 0) {
                str = viewState.b;
            }
            String token = str;
            if ((i & 4) != 0) {
                str2 = viewState.c;
            }
            String bffAction = str2;
            if ((i & 8) != 0) {
                content = viewState.d;
            }
            Content content2 = content;
            if ((i & 16) != 0) {
                viewAction = viewState.e;
            }
            Function1 function1 = viewState.f;
            Function1 function12 = viewState.g;
            viewState.getClass();
            Intrinsics.h(token, "token");
            Intrinsics.h(bffAction, "bffAction");
            Intrinsics.h(content2, "content");
            return new ViewState(secureDollarsConfig, token, bffAction, content2, viewAction, function1, function12);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.c(this.f6446a, viewState.f6446a) && Intrinsics.c(this.b, viewState.b) && Intrinsics.c(this.c, viewState.c) && Intrinsics.c(this.d, viewState.d) && Intrinsics.c(this.e, viewState.e) && Intrinsics.c(this.f, viewState.f) && Intrinsics.c(this.g, viewState.g);
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c(this.f6446a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
            ViewAction viewAction = this.e;
            return this.g.hashCode() + ((this.f.hashCode() + ((iHashCode + (viewAction == null ? 0 : viewAction.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            return "ViewState(config=" + this.f6446a + ", token=" + this.b + ", bffAction=" + this.c + ", content=" + this.d + ", action=" + this.e + ", complete=" + this.f + ", trigger=" + this.g + ")";
        }
    }
}
