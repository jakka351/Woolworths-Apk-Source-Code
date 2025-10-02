package au.com.woolworths.feature.shop.wpay.ui.addgiftcard;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.wpay.ui.common.model.LoadingState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/addgiftcard/AddGiftCardContract;", "", "ViewState", "Action", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AddGiftCardContract {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/addgiftcard/AddGiftCardContract$Action;", "", "Success", "SnackBarConnectionError", "SnackBarServerError", "Dismiss", "Lau/com/woolworths/feature/shop/wpay/ui/addgiftcard/AddGiftCardContract$Action$Dismiss;", "Lau/com/woolworths/feature/shop/wpay/ui/addgiftcard/AddGiftCardContract$Action$SnackBarConnectionError;", "Lau/com/woolworths/feature/shop/wpay/ui/addgiftcard/AddGiftCardContract$Action$SnackBarServerError;", "Lau/com/woolworths/feature/shop/wpay/ui/addgiftcard/AddGiftCardContract$Action$Success;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/addgiftcard/AddGiftCardContract$Action$Dismiss;", "Lau/com/woolworths/feature/shop/wpay/ui/addgiftcard/AddGiftCardContract$Action;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Dismiss implements Action {

            /* renamed from: a, reason: collision with root package name */
            public static final Dismiss f8336a = new Dismiss();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Dismiss);
            }

            public final int hashCode() {
                return 908002698;
            }

            public final String toString() {
                return "Dismiss";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/addgiftcard/AddGiftCardContract$Action$SnackBarConnectionError;", "Lau/com/woolworths/feature/shop/wpay/ui/addgiftcard/AddGiftCardContract$Action;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class SnackBarConnectionError implements Action {

            /* renamed from: a, reason: collision with root package name */
            public static final SnackBarConnectionError f8337a = new SnackBarConnectionError();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof SnackBarConnectionError);
            }

            public final int hashCode() {
                return -1599729371;
            }

            public final String toString() {
                return "SnackBarConnectionError";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/addgiftcard/AddGiftCardContract$Action$SnackBarServerError;", "Lau/com/woolworths/feature/shop/wpay/ui/addgiftcard/AddGiftCardContract$Action;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class SnackBarServerError implements Action {

            /* renamed from: a, reason: collision with root package name */
            public static final SnackBarServerError f8338a = new SnackBarServerError();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof SnackBarServerError);
            }

            public final int hashCode() {
                return -562184864;
            }

            public final String toString() {
                return "SnackBarServerError";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/addgiftcard/AddGiftCardContract$Action$Success;", "Lau/com/woolworths/feature/shop/wpay/ui/addgiftcard/AddGiftCardContract$Action;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Success implements Action {

            /* renamed from: a, reason: collision with root package name */
            public final AddGiftCardResult f8339a;

            public Success(AddGiftCardResult addGiftCardResult) {
                this.f8339a = addGiftCardResult;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && Intrinsics.c(this.f8339a, ((Success) obj).f8339a);
            }

            public final int hashCode() {
                return this.f8339a.hashCode();
            }

            public final String toString() {
                return "Success(result=" + this.f8339a + ")";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/addgiftcard/AddGiftCardContract$ViewState;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final LoadingState f8340a;
        public final String b;
        public final boolean c;
        public final boolean d;

        public ViewState(LoadingState loadingState, String str, boolean z, boolean z2) {
            Intrinsics.h(loadingState, "loadingState");
            this.f8340a = loadingState;
            this.b = str;
            this.c = z;
            this.d = z2;
        }

        public static ViewState a(ViewState viewState, String str, boolean z, boolean z2, int i) {
            LoadingState loadingState = LoadingState.d;
            if ((i & 1) != 0) {
                loadingState = viewState.f8340a;
            }
            if ((i & 2) != 0) {
                str = viewState.b;
            }
            if ((i & 4) != 0) {
                z = viewState.c;
            }
            if ((i & 8) != 0) {
                z2 = viewState.d;
            }
            viewState.getClass();
            Intrinsics.h(loadingState, "loadingState");
            return new ViewState(loadingState, str, z, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f8340a == viewState.f8340a && Intrinsics.c(this.b, viewState.b) && this.c == viewState.c && this.d == viewState.d;
        }

        public final int hashCode() {
            int iHashCode = this.f8340a.hashCode() * 31;
            String str = this.b;
            return Boolean.hashCode(this.d) + androidx.camera.core.impl.b.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(loadingState=");
            sb.append(this.f8340a);
            sb.append(", errorMessage=");
            sb.append(this.b);
            sb.append(", showPinInlineError=");
            return au.com.woolworths.android.onesite.a.q(sb, this.c, ", showGiftCardNumberInlineError=", this.d, ")");
        }

        public /* synthetic */ ViewState(int i) {
            this(LoadingState.d, (i & 2) != 0 ? null : "Unable to add gift card, please check gift card details.", (i & 4) == 0, (i & 8) == 0);
        }
    }
}
