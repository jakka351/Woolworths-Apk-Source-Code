package au.com.woolworths.feature.shop.wpay.ui.addcreditcard;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.shop.wpay.domain.model.PageResult;
import au.com.woolworths.feature.shop.wpay.ui.common.model.LoadingState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/addcreditcard/AddCreditCardContract;", "", "ViewState", "Action", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AddCreditCardContract {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/addcreditcard/AddCreditCardContract$Action;", "", "Success", "SnackBarConnectionError", "SnackBarServerError", "SubmitForm", "Dismiss", "Lau/com/woolworths/feature/shop/wpay/ui/addcreditcard/AddCreditCardContract$Action$Dismiss;", "Lau/com/woolworths/feature/shop/wpay/ui/addcreditcard/AddCreditCardContract$Action$SnackBarConnectionError;", "Lau/com/woolworths/feature/shop/wpay/ui/addcreditcard/AddCreditCardContract$Action$SnackBarServerError;", "Lau/com/woolworths/feature/shop/wpay/ui/addcreditcard/AddCreditCardContract$Action$SubmitForm;", "Lau/com/woolworths/feature/shop/wpay/ui/addcreditcard/AddCreditCardContract$Action$Success;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/addcreditcard/AddCreditCardContract$Action$Dismiss;", "Lau/com/woolworths/feature/shop/wpay/ui/addcreditcard/AddCreditCardContract$Action;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Dismiss implements Action {

            /* renamed from: a, reason: collision with root package name */
            public static final Dismiss f8323a = new Dismiss();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Dismiss);
            }

            public final int hashCode() {
                return 2048400312;
            }

            public final String toString() {
                return "Dismiss";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/addcreditcard/AddCreditCardContract$Action$SnackBarConnectionError;", "Lau/com/woolworths/feature/shop/wpay/ui/addcreditcard/AddCreditCardContract$Action;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class SnackBarConnectionError implements Action {

            /* renamed from: a, reason: collision with root package name */
            public static final SnackBarConnectionError f8324a = new SnackBarConnectionError();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof SnackBarConnectionError);
            }

            public final int hashCode() {
                return -365360301;
            }

            public final String toString() {
                return "SnackBarConnectionError";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/addcreditcard/AddCreditCardContract$Action$SnackBarServerError;", "Lau/com/woolworths/feature/shop/wpay/ui/addcreditcard/AddCreditCardContract$Action;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class SnackBarServerError implements Action {

            /* renamed from: a, reason: collision with root package name */
            public static final SnackBarServerError f8325a = new SnackBarServerError();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof SnackBarServerError);
            }

            public final int hashCode() {
                return 319880846;
            }

            public final String toString() {
                return "SnackBarServerError";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/addcreditcard/AddCreditCardContract$Action$SubmitForm;", "Lau/com/woolworths/feature/shop/wpay/ui/addcreditcard/AddCreditCardContract$Action;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class SubmitForm implements Action {

            /* renamed from: a, reason: collision with root package name */
            public static final SubmitForm f8326a = new SubmitForm();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof SubmitForm);
            }

            public final int hashCode() {
                return -1727277810;
            }

            public final String toString() {
                return "SubmitForm";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/addcreditcard/AddCreditCardContract$Action$Success;", "Lau/com/woolworths/feature/shop/wpay/ui/addcreditcard/AddCreditCardContract$Action;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Success implements Action {

            /* renamed from: a, reason: collision with root package name */
            public final AddCreditCardResult f8327a;

            public Success(AddCreditCardResult addCreditCardResult) {
                this.f8327a = addCreditCardResult;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && Intrinsics.c(this.f8327a, ((Success) obj).f8327a);
            }

            public final int hashCode() {
                return this.f8327a.hashCode();
            }

            public final String toString() {
                return "Success(result=" + this.f8327a + ")";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/addcreditcard/AddCreditCardContract$ViewState;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final LoadingState f8328a;
        public final PageResult b;
        public final String c;
        public final boolean d;

        public ViewState(LoadingState loadingState, PageResult pageResult, String str, boolean z) {
            Intrinsics.h(loadingState, "loadingState");
            Intrinsics.h(pageResult, "pageResult");
            this.f8328a = loadingState;
            this.b = pageResult;
            this.c = str;
            this.d = z;
        }

        public static ViewState a(ViewState viewState, LoadingState loadingState, PageResult pageResult, String str, boolean z, int i) {
            if ((i & 1) != 0) {
                loadingState = viewState.f8328a;
            }
            if ((i & 2) != 0) {
                pageResult = viewState.b;
            }
            if ((i & 4) != 0) {
                str = viewState.c;
            }
            if ((i & 8) != 0) {
                z = viewState.d;
            }
            viewState.getClass();
            Intrinsics.h(loadingState, "loadingState");
            Intrinsics.h(pageResult, "pageResult");
            return new ViewState(loadingState, pageResult, str, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f8328a == viewState.f8328a && Intrinsics.c(this.b, viewState.b) && Intrinsics.c(this.c, viewState.c) && this.d == viewState.d;
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + (this.f8328a.hashCode() * 31)) * 31;
            String str = this.c;
            return Boolean.hashCode(this.d) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(loadingState=");
            sb.append(this.f8328a);
            sb.append(", pageResult=");
            sb.append(this.b);
            sb.append(", errorMessage=");
            return d.r(this.c, ", showAddCreditCardControls=", ")", sb, this.d);
        }

        public /* synthetic */ ViewState(PageResult pageResult, int i) {
            this(LoadingState.d, (i & 2) != 0 ? PageResult.Uninitialized.f8286a : pageResult, (i & 4) != 0 ? null : "Unable to add card, please check card details.", (i & 8) == 0);
        }
    }
}
