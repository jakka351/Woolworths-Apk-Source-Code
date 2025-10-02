package au.com.woolworths.feature.shared.instore.wifi.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/ui/JoinWifiContract;", "", "ViewState", "Actions", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface JoinWifiContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/ui/JoinWifiContract$Actions;", "", "CloseScreen", "ShowJoinConfirmation", "ShowJoinError", "ShowUserLoginRequiredDialog", "Lau/com/woolworths/feature/shared/instore/wifi/ui/JoinWifiContract$Actions$CloseScreen;", "Lau/com/woolworths/feature/shared/instore/wifi/ui/JoinWifiContract$Actions$ShowJoinConfirmation;", "Lau/com/woolworths/feature/shared/instore/wifi/ui/JoinWifiContract$Actions$ShowJoinError;", "Lau/com/woolworths/feature/shared/instore/wifi/ui/JoinWifiContract$Actions$ShowUserLoginRequiredDialog;", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/ui/JoinWifiContract$Actions$CloseScreen;", "Lau/com/woolworths/feature/shared/instore/wifi/ui/JoinWifiContract$Actions;", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CloseScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f6534a;

            public CloseScreen(boolean z) {
                this.f6534a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CloseScreen) && this.f6534a == ((CloseScreen) obj).f6534a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f6534a);
            }

            public final String toString() {
                return androidx.compose.ui.input.pointer.a.n("CloseScreen(success=", ")", this.f6534a);
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/ui/JoinWifiContract$Actions$ShowJoinConfirmation;", "Lau/com/woolworths/feature/shared/instore/wifi/ui/JoinWifiContract$Actions;", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ShowJoinConfirmation extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowJoinConfirmation f6535a = new ShowJoinConfirmation();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/ui/JoinWifiContract$Actions$ShowJoinError;", "Lau/com/woolworths/feature/shared/instore/wifi/ui/JoinWifiContract$Actions;", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ShowJoinError extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowJoinError f6536a = new ShowJoinError();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/ui/JoinWifiContract$Actions$ShowUserLoginRequiredDialog;", "Lau/com/woolworths/feature/shared/instore/wifi/ui/JoinWifiContract$Actions;", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ShowUserLoginRequiredDialog extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowUserLoginRequiredDialog f6537a = new ShowUserLoginRequiredDialog();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/ui/JoinWifiContract$ViewState;", "", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f6538a;
        public final boolean b;

        public ViewState(boolean z, boolean z2) {
            this.f6538a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f6538a == viewState.f6538a && this.b == viewState.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f6538a) * 31);
        }

        public final String toString() {
            return "ViewState(isLoading=" + this.f6538a + ", acceptedTerms=" + this.b + ")";
        }
    }
}
