package au.com.woolworths.feature.rewards.account.closeaccount;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.account.closeaccount.model.DeleteAccount;
import au.com.woolworths.feature.rewards.account.closeaccount.model.DeleteAccountConfirmation;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/account/closeaccount/CloseAccountContract;", "", "Action", "ViewState", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CloseAccountContract {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/account/closeaccount/CloseAccountContract$Action;", "", "OpenUrl", "ShowErrorMessage", "CloseAndGoToWelcomeScreen", "Lau/com/woolworths/feature/rewards/account/closeaccount/CloseAccountContract$Action$CloseAndGoToWelcomeScreen;", "Lau/com/woolworths/feature/rewards/account/closeaccount/CloseAccountContract$Action$OpenUrl;", "Lau/com/woolworths/feature/rewards/account/closeaccount/CloseAccountContract$Action$ShowErrorMessage;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/closeaccount/CloseAccountContract$Action$CloseAndGoToWelcomeScreen;", "Lau/com/woolworths/feature/rewards/account/closeaccount/CloseAccountContract$Action;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CloseAndGoToWelcomeScreen implements Action {

            /* renamed from: a, reason: collision with root package name */
            public static final CloseAndGoToWelcomeScreen f5683a = new CloseAndGoToWelcomeScreen();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CloseAndGoToWelcomeScreen);
            }

            public final int hashCode() {
                return -1574019854;
            }

            public final String toString() {
                return "CloseAndGoToWelcomeScreen";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/closeaccount/CloseAccountContract$Action$OpenUrl;", "Lau/com/woolworths/feature/rewards/account/closeaccount/CloseAccountContract$Action;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenUrl implements Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f5684a;

            public OpenUrl(String str) {
                this.f5684a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenUrl) && Intrinsics.c(this.f5684a, ((OpenUrl) obj).f5684a);
            }

            public final int hashCode() {
                return this.f5684a.hashCode();
            }

            public final String toString() {
                return a.h("OpenUrl(url=", this.f5684a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/closeaccount/CloseAccountContract$Action$ShowErrorMessage;", "Lau/com/woolworths/feature/rewards/account/closeaccount/CloseAccountContract$Action;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowErrorMessage implements Action {

            /* renamed from: a, reason: collision with root package name */
            public final int f5685a;

            public ShowErrorMessage(int i) {
                this.f5685a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowErrorMessage) && this.f5685a == ((ShowErrorMessage) obj).f5685a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f5685a);
            }

            public final String toString() {
                return a.e(this.f5685a, "ShowErrorMessage(message=", ")");
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/feature/rewards/account/closeaccount/CloseAccountContract$ViewState;", "", "Loading", "ConsentPage", "ConfirmationPage", "Error", "Lau/com/woolworths/feature/rewards/account/closeaccount/CloseAccountContract$ViewState$ConfirmationPage;", "Lau/com/woolworths/feature/rewards/account/closeaccount/CloseAccountContract$ViewState$ConsentPage;", "Lau/com/woolworths/feature/rewards/account/closeaccount/CloseAccountContract$ViewState$Error;", "Lau/com/woolworths/feature/rewards/account/closeaccount/CloseAccountContract$ViewState$Loading;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final int f5686a;

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/closeaccount/CloseAccountContract$ViewState$ConfirmationPage;", "Lau/com/woolworths/feature/rewards/account/closeaccount/CloseAccountContract$ViewState;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ConfirmationPage extends ViewState {
            public final DeleteAccountConfirmation b;
            public final String c;

            public ConfirmationPage(DeleteAccountConfirmation page) {
                Intrinsics.h(page, "page");
                this.b = page;
                this.c = page.f5693a;
            }

            @Override // au.com.woolworths.feature.rewards.account.closeaccount.CloseAccountContract.ViewState
            /* renamed from: a, reason: from getter */
            public final String getE() {
                return this.c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ConfirmationPage) && Intrinsics.c(this.b, ((ConfirmationPage) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "ConfirmationPage(page=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/closeaccount/CloseAccountContract$ViewState$ConsentPage;", "Lau/com/woolworths/feature/rewards/account/closeaccount/CloseAccountContract$ViewState;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ConsentPage extends ViewState {
            public final DeleteAccount b;
            public final boolean c;
            public final boolean d;
            public final String e;

            public ConsentPage(DeleteAccount page, boolean z, boolean z2) {
                Intrinsics.h(page, "page");
                this.b = page;
                this.c = z;
                this.d = z2;
                this.e = page.f5692a;
            }

            public static ConsentPage b(ConsentPage consentPage, boolean z, boolean z2, int i) {
                DeleteAccount page = consentPage.b;
                if ((i & 2) != 0) {
                    z = consentPage.c;
                }
                if ((i & 4) != 0) {
                    z2 = consentPage.d;
                }
                Intrinsics.h(page, "page");
                return new ConsentPage(page, z, z2);
            }

            @Override // au.com.woolworths.feature.rewards.account.closeaccount.CloseAccountContract.ViewState
            /* renamed from: a, reason: from getter */
            public final String getE() {
                return this.e;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ConsentPage)) {
                    return false;
                }
                ConsentPage consentPage = (ConsentPage) obj;
                return Intrinsics.c(this.b, consentPage.b) && this.c == consentPage.c && this.d == consentPage.d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + b.e(this.b.hashCode() * 31, 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ConsentPage(page=");
                sb.append(this.b);
                sb.append(", isConsentChecked=");
                sb.append(this.c);
                sb.append(", isProcessing=");
                return a.k(")", sb, this.d);
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/closeaccount/CloseAccountContract$ViewState$Error;", "Lau/com/woolworths/feature/rewards/account/closeaccount/CloseAccountContract$ViewState;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Error extends ViewState {
            public final FullPageMessage.Error b;

            public Error(FullPageMessage.Error error) {
                this.b = error;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.c(this.b, ((Error) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Error(error=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/closeaccount/CloseAccountContract$ViewState$Loading;", "Lau/com/woolworths/feature/rewards/account/closeaccount/CloseAccountContract$ViewState;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Loading extends ViewState {
            public static final Loading b = new Loading();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public final int hashCode() {
                return -1481129540;
            }

            public final String toString() {
                return "Loading";
            }
        }

        public ViewState() {
            String strB = Reflection.f24268a.b(getClass()).B();
            this.f5686a = strB != null ? strB.hashCode() : 0;
        }

        /* renamed from: a */
        public String getE() {
            return "";
        }
    }
}
