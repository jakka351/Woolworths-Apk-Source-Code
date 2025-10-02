package au.com.woolworths.android.onesite.modules.deliveryaddress.search;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/modules/deliveryaddress/search/DeliveryAddressSearchContract;", "", "Actions", "ViewState", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface DeliveryAddressSearchContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/android/onesite/modules/deliveryaddress/search/DeliveryAddressSearchContract$Actions;", "", "ShowErrorMessageWithResId", "ShowErrorMessage", "AddressSetSuccessfully", "ForceLogoutEvent", "LaunchAddDeliveryAddressManually", "HideKeyboard", "Lau/com/woolworths/android/onesite/modules/deliveryaddress/search/DeliveryAddressSearchContract$Actions$AddressSetSuccessfully;", "Lau/com/woolworths/android/onesite/modules/deliveryaddress/search/DeliveryAddressSearchContract$Actions$ForceLogoutEvent;", "Lau/com/woolworths/android/onesite/modules/deliveryaddress/search/DeliveryAddressSearchContract$Actions$HideKeyboard;", "Lau/com/woolworths/android/onesite/modules/deliveryaddress/search/DeliveryAddressSearchContract$Actions$LaunchAddDeliveryAddressManually;", "Lau/com/woolworths/android/onesite/modules/deliveryaddress/search/DeliveryAddressSearchContract$Actions$ShowErrorMessage;", "Lau/com/woolworths/android/onesite/modules/deliveryaddress/search/DeliveryAddressSearchContract$Actions$ShowErrorMessageWithResId;", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/deliveryaddress/search/DeliveryAddressSearchContract$Actions$AddressSetSuccessfully;", "Lau/com/woolworths/android/onesite/modules/deliveryaddress/search/DeliveryAddressSearchContract$Actions;", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class AddressSetSuccessfully extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final AddressSetSuccessfully f4326a = new AddressSetSuccessfully();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/deliveryaddress/search/DeliveryAddressSearchContract$Actions$ForceLogoutEvent;", "Lau/com/woolworths/android/onesite/modules/deliveryaddress/search/DeliveryAddressSearchContract$Actions;", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ForceLogoutEvent extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ForceLogoutEvent f4327a = new ForceLogoutEvent();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/deliveryaddress/search/DeliveryAddressSearchContract$Actions$HideKeyboard;", "Lau/com/woolworths/android/onesite/modules/deliveryaddress/search/DeliveryAddressSearchContract$Actions;", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class HideKeyboard extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final HideKeyboard f4328a = new HideKeyboard();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/deliveryaddress/search/DeliveryAddressSearchContract$Actions$LaunchAddDeliveryAddressManually;", "Lau/com/woolworths/android/onesite/modules/deliveryaddress/search/DeliveryAddressSearchContract$Actions;", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchAddDeliveryAddressManually extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchAddDeliveryAddressManually f4329a = new LaunchAddDeliveryAddressManually();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/deliveryaddress/search/DeliveryAddressSearchContract$Actions$ShowErrorMessage;", "Lau/com/woolworths/android/onesite/modules/deliveryaddress/search/DeliveryAddressSearchContract$Actions;", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowErrorMessage extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f4330a;

            public ShowErrorMessage(String message) {
                Intrinsics.h(message, "message");
                this.f4330a = message;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowErrorMessage) && Intrinsics.c(this.f4330a, ((ShowErrorMessage) obj).f4330a);
            }

            public final int hashCode() {
                return this.f4330a.hashCode();
            }

            public final String toString() {
                return YU.a.h("ShowErrorMessage(message=", this.f4330a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/deliveryaddress/search/DeliveryAddressSearchContract$Actions$ShowErrorMessageWithResId;", "Lau/com/woolworths/android/onesite/modules/deliveryaddress/search/DeliveryAddressSearchContract$Actions;", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowErrorMessageWithResId extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final int f4331a;

            public ShowErrorMessageWithResId(int i) {
                this.f4331a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowErrorMessageWithResId) && this.f4331a == ((ShowErrorMessageWithResId) obj).f4331a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f4331a);
            }

            public final String toString() {
                return YU.a.e(this.f4331a, "ShowErrorMessageWithResId(messageResId=", ")");
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/deliveryaddress/search/DeliveryAddressSearchContract$ViewState;", "", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f4332a;
        public final DeliveryAddressSearchErrorState b;
        public final List c;
        public final DeliveryAddressSearchViewModel.ScreenOptions d;

        public ViewState(boolean z, DeliveryAddressSearchErrorState deliveryAddressSearchErrorState, List searchResultList, DeliveryAddressSearchViewModel.ScreenOptions screenOptions) {
            Intrinsics.h(searchResultList, "searchResultList");
            this.f4332a = z;
            this.b = deliveryAddressSearchErrorState;
            this.c = searchResultList;
            this.d = screenOptions;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f4332a == viewState.f4332a && this.b == viewState.b && Intrinsics.c(this.c, viewState.c) && Intrinsics.c(this.d, viewState.d);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f4332a) * 31;
            DeliveryAddressSearchErrorState deliveryAddressSearchErrorState = this.b;
            int iD = androidx.camera.core.impl.b.d((iHashCode + (deliveryAddressSearchErrorState == null ? 0 : deliveryAddressSearchErrorState.hashCode())) * 31, 31, this.c);
            DeliveryAddressSearchViewModel.ScreenOptions screenOptions = this.d;
            return iD + (screenOptions != null ? screenOptions.hashCode() : 0);
        }

        public final String toString() {
            return "ViewState(isFullPageLoading=" + this.f4332a + ", fullPageErrorState=" + this.b + ", searchResultList=" + this.c + ", screenOptions=" + this.d + ")";
        }
    }
}
