package au.com.woolworths.feature.shared.instore.wifi.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/ui/InstoreWifiContract;", "", "ErrorType", "ViewState", "Actions", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface InstoreWifiContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/ui/InstoreWifiContract$Actions;", "", "ShowJoinScreen", "LaunchLogin", "OpenUrl", "ShowFeedbackForm", "Lau/com/woolworths/feature/shared/instore/wifi/ui/InstoreWifiContract$Actions$LaunchLogin;", "Lau/com/woolworths/feature/shared/instore/wifi/ui/InstoreWifiContract$Actions$OpenUrl;", "Lau/com/woolworths/feature/shared/instore/wifi/ui/InstoreWifiContract$Actions$ShowFeedbackForm;", "Lau/com/woolworths/feature/shared/instore/wifi/ui/InstoreWifiContract$Actions$ShowJoinScreen;", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/ui/InstoreWifiContract$Actions$LaunchLogin;", "Lau/com/woolworths/feature/shared/instore/wifi/ui/InstoreWifiContract$Actions;", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchLogin extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchLogin f6529a = new LaunchLogin();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/ui/InstoreWifiContract$Actions$OpenUrl;", "Lau/com/woolworths/feature/shared/instore/wifi/ui/InstoreWifiContract$Actions;", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenUrl extends Actions {
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof OpenUrl);
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "OpenUrl(url=null)";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/ui/InstoreWifiContract$Actions$ShowFeedbackForm;", "Lau/com/woolworths/feature/shared/instore/wifi/ui/InstoreWifiContract$Actions;", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowFeedbackForm extends Actions {
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowFeedbackForm);
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "ShowFeedbackForm(formId=null)";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/ui/InstoreWifiContract$Actions$ShowJoinScreen;", "Lau/com/woolworths/feature/shared/instore/wifi/ui/InstoreWifiContract$Actions;", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ShowJoinScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowJoinScreen f6530a = new ShowJoinScreen();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/ui/InstoreWifiContract$ErrorType;", "", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ErrorType {
        public static final ErrorType d;
        public static final ErrorType e;
        public static final /* synthetic */ ErrorType[] f;
        public static final /* synthetic */ EnumEntries g;

        static {
            ErrorType errorType = new ErrorType("RecoverableError", 0);
            d = errorType;
            ErrorType errorType2 = new ErrorType("NonRecoverableError", 1);
            e = errorType2;
            ErrorType[] errorTypeArr = {errorType, errorType2};
            f = errorTypeArr;
            g = EnumEntriesKt.a(errorTypeArr);
        }

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) f.clone();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/ui/InstoreWifiContract$ViewState;", "", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final String f6531a;
        public final boolean b;
        public final Boolean c;
        public final boolean d;
        public final String e;
        public final ErrorType f;

        public ViewState(String str, boolean z, Boolean bool, boolean z2, String str2, ErrorType errorType) {
            this.f6531a = str;
            this.b = z;
            this.c = bool;
            this.d = z2;
            this.e = str2;
            this.f = errorType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.c(this.f6531a, viewState.f6531a) && this.b == viewState.b && Intrinsics.c(this.c, viewState.c) && this.d == viewState.d && Intrinsics.c(this.e, viewState.e) && this.f == viewState.f;
        }

        public final int hashCode() {
            String str = this.f6531a;
            int iE = androidx.camera.core.impl.b.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            Boolean bool = this.c;
            int iE2 = androidx.camera.core.impl.b.e((iE + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.d);
            String str2 = this.e;
            int iHashCode = (iE2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            ErrorType errorType = this.f;
            return iHashCode + (errorType != null ? errorType.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbQ = androidx.constraintlayout.core.state.a.q("ViewState(version=", this.f6531a, ", isDeviceSupported=", ", hasProfile=", this.b);
            sbQ.append(this.c);
            sbQ.append(", isLoading=");
            sbQ.append(this.d);
            sbQ.append(", snackbarMessage=");
            sbQ.append(this.e);
            sbQ.append(", errorType=");
            sbQ.append(this.f);
            sbQ.append(")");
            return sbQ.toString();
        }
    }
}
