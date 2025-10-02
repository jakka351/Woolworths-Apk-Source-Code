package au.com.woolworths.feature.shop.login;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/login/LoginContract;", "", "Action", "ViewState", "login_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface LoginContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/feature/shop/login/LoginContract$Action;", "", "CloseLoginScreen", "LaunchPickUpLocator", "LaunchSignUp", "LaunchAddressPickerAndCloseLogin", "Lau/com/woolworths/feature/shop/login/LoginContract$Action$CloseLoginScreen;", "Lau/com/woolworths/feature/shop/login/LoginContract$Action$LaunchAddressPickerAndCloseLogin;", "Lau/com/woolworths/feature/shop/login/LoginContract$Action$LaunchPickUpLocator;", "Lau/com/woolworths/feature/shop/login/LoginContract$Action$LaunchSignUp;", "login_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/login/LoginContract$Action$CloseLoginScreen;", "Lau/com/woolworths/feature/shop/login/LoginContract$Action;", "login_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CloseLoginScreen extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final CloseLoginScreen f7447a = new CloseLoginScreen();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/login/LoginContract$Action$LaunchAddressPickerAndCloseLogin;", "Lau/com/woolworths/feature/shop/login/LoginContract$Action;", "login_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchAddressPickerAndCloseLogin extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchAddressPickerAndCloseLogin f7448a = new LaunchAddressPickerAndCloseLogin();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/login/LoginContract$Action$LaunchPickUpLocator;", "Lau/com/woolworths/feature/shop/login/LoginContract$Action;", "login_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchPickUpLocator extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchPickUpLocator f7449a = new LaunchPickUpLocator();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/login/LoginContract$Action$LaunchSignUp;", "Lau/com/woolworths/feature/shop/login/LoginContract$Action;", "login_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchSignUp extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchSignUp f7450a = new LaunchSignUp();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/login/LoginContract$ViewState;", "", "login_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f7451a;
        public final LoginFullPageErrorState b;

        public ViewState(boolean z, LoginFullPageErrorState loginFullPageErrorState) {
            this.f7451a = z;
            this.b = loginFullPageErrorState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f7451a == viewState.f7451a && Intrinsics.c(this.b, viewState.b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f7451a) * 31;
            LoginFullPageErrorState loginFullPageErrorState = this.b;
            return iHashCode + (loginFullPageErrorState == null ? 0 : loginFullPageErrorState.hashCode());
        }

        public final String toString() {
            return "ViewState(contentLoading=" + this.f7451a + ", errorState=" + this.b + ")";
        }
    }
}
