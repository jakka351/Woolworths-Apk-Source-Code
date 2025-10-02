package au.com.woolworths.feature.shop.login.guest.ui.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/login/guest/ui/fragment/GuestLoginContract;", "", "Actions", "ViewState", "login_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface GuestLoginContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shop/login/guest/ui/fragment/GuestLoginContract$Actions;", "", "GuestMode", "LaunchLogIn", "LaunchSignUp", "Lau/com/woolworths/feature/shop/login/guest/ui/fragment/GuestLoginContract$Actions$GuestMode;", "Lau/com/woolworths/feature/shop/login/guest/ui/fragment/GuestLoginContract$Actions$LaunchLogIn;", "Lau/com/woolworths/feature/shop/login/guest/ui/fragment/GuestLoginContract$Actions$LaunchSignUp;", "login_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/login/guest/ui/fragment/GuestLoginContract$Actions$GuestMode;", "Lau/com/woolworths/feature/shop/login/guest/ui/fragment/GuestLoginContract$Actions;", "login_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class GuestMode extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final GuestMode f7457a = new GuestMode();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/login/guest/ui/fragment/GuestLoginContract$Actions$LaunchLogIn;", "Lau/com/woolworths/feature/shop/login/guest/ui/fragment/GuestLoginContract$Actions;", "login_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchLogIn extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchLogIn f7458a = new LaunchLogIn();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/login/guest/ui/fragment/GuestLoginContract$Actions$LaunchSignUp;", "Lau/com/woolworths/feature/shop/login/guest/ui/fragment/GuestLoginContract$Actions;", "login_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchSignUp extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchSignUp f7459a = new LaunchSignUp();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/login/guest/ui/fragment/GuestLoginContract$ViewState;", "", "login_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ViewState);
        }

        public final int hashCode() {
            return Boolean.hashCode(false);
        }

        public final String toString() {
            return "ViewState(showGuestMode=false)";
        }
    }
}
