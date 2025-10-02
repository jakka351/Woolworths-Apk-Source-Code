package au.com.woolworths.feature.shop.myorders.editorderconditions;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/editorderconditions/EditOrderConditionsContract;", "", "Actions", "ViewState", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface EditOrderConditionsContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/editorderconditions/EditOrderConditionsContract$Actions;", "", "NavigateToHome", "NavigateBack", "NavigateToCmoReview", "NavigateBackWithMessage", "ShowSnackbarMessage", "Lau/com/woolworths/feature/shop/myorders/editorderconditions/EditOrderConditionsContract$Actions$NavigateBack;", "Lau/com/woolworths/feature/shop/myorders/editorderconditions/EditOrderConditionsContract$Actions$NavigateBackWithMessage;", "Lau/com/woolworths/feature/shop/myorders/editorderconditions/EditOrderConditionsContract$Actions$NavigateToCmoReview;", "Lau/com/woolworths/feature/shop/myorders/editorderconditions/EditOrderConditionsContract$Actions$NavigateToHome;", "Lau/com/woolworths/feature/shop/myorders/editorderconditions/EditOrderConditionsContract$Actions$ShowSnackbarMessage;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/editorderconditions/EditOrderConditionsContract$Actions$NavigateBack;", "Lau/com/woolworths/feature/shop/myorders/editorderconditions/EditOrderConditionsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateBack extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final NavigateBack f7838a = new NavigateBack();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NavigateBack);
            }

            public final int hashCode() {
                return -98135867;
            }

            public final String toString() {
                return "NavigateBack";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/editorderconditions/EditOrderConditionsContract$Actions$NavigateBackWithMessage;", "Lau/com/woolworths/feature/shop/myorders/editorderconditions/EditOrderConditionsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateBackWithMessage extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f7839a;

            public NavigateBackWithMessage(String str) {
                this.f7839a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NavigateBackWithMessage) && Intrinsics.c(this.f7839a, ((NavigateBackWithMessage) obj).f7839a);
            }

            public final int hashCode() {
                return this.f7839a.hashCode();
            }

            public final String toString() {
                return YU.a.h("NavigateBackWithMessage(message=", this.f7839a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/editorderconditions/EditOrderConditionsContract$Actions$NavigateToCmoReview;", "Lau/com/woolworths/feature/shop/myorders/editorderconditions/EditOrderConditionsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateToCmoReview extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final NavigateToCmoReview f7840a = new NavigateToCmoReview();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NavigateToCmoReview);
            }

            public final int hashCode() {
                return -1519139036;
            }

            public final String toString() {
                return "NavigateToCmoReview";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/editorderconditions/EditOrderConditionsContract$Actions$NavigateToHome;", "Lau/com/woolworths/feature/shop/myorders/editorderconditions/EditOrderConditionsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateToHome extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final NavigateToHome f7841a = new NavigateToHome();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NavigateToHome);
            }

            public final int hashCode() {
                return 708169304;
            }

            public final String toString() {
                return "NavigateToHome";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/editorderconditions/EditOrderConditionsContract$Actions$ShowSnackbarMessage;", "Lau/com/woolworths/feature/shop/myorders/editorderconditions/EditOrderConditionsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSnackbarMessage extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final Text f7842a;

            public ShowSnackbarMessage(Text text) {
                this.f7842a = text;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowSnackbarMessage) && Intrinsics.c(this.f7842a, ((ShowSnackbarMessage) obj).f7842a);
            }

            public final int hashCode() {
                return this.f7842a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.android.onesite.a.h("ShowSnackbarMessage(message=", this.f7842a, ")");
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/editorderconditions/EditOrderConditionsContract$ViewState;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f7843a;
        public final StatefulButtonState b;

        public ViewState(boolean z, StatefulButtonState statefulButtonState) {
            this.f7843a = z;
            this.b = statefulButtonState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f7843a == viewState.f7843a && this.b == viewState.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.f7843a) * 31);
        }

        public final String toString() {
            return "ViewState(isSettingEditOrderStatus=" + this.f7843a + ", cmoButtonState=" + this.b + ")";
        }
    }
}
