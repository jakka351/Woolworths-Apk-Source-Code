package au.com.woolworths.feature.shop.delivery.address.addaddressmanually;

import androidx.camera.core.impl.b;
import au.com.woolworths.base.shopapp.models.address.SuburbResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/delivery/address/addaddressmanually/AddDeliveryAddressManuallyContract;", "", "Actions", "ViewState", "Companion", "delivery-address_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AddDeliveryAddressManuallyContract {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/delivery/address/addaddressmanually/AddDeliveryAddressManuallyContract$Actions;", "", "ShowSnackbarMessage", "CloseScreen", "Lau/com/woolworths/feature/shop/delivery/address/addaddressmanually/AddDeliveryAddressManuallyContract$Actions$CloseScreen;", "Lau/com/woolworths/feature/shop/delivery/address/addaddressmanually/AddDeliveryAddressManuallyContract$Actions$ShowSnackbarMessage;", "delivery-address_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/delivery/address/addaddressmanually/AddDeliveryAddressManuallyContract$Actions$CloseScreen;", "Lau/com/woolworths/feature/shop/delivery/address/addaddressmanually/AddDeliveryAddressManuallyContract$Actions;", "delivery-address_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CloseScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final CloseScreen f7047a = new CloseScreen();
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/delivery/address/addaddressmanually/AddDeliveryAddressManuallyContract$Actions$ShowSnackbarMessage;", "Lau/com/woolworths/feature/shop/delivery/address/addaddressmanually/AddDeliveryAddressManuallyContract$Actions;", "delivery-address_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSnackbarMessage extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final int f7048a;

            public ShowSnackbarMessage(int i) {
                this.f7048a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowSnackbarMessage) && this.f7048a == ((ShowSnackbarMessage) obj).f7048a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f7048a);
            }

            public final String toString() {
                return YU.a.e(this.f7048a, "ShowSnackbarMessage(messageResId=", ")");
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/delivery/address/addaddressmanually/AddDeliveryAddressManuallyContract$Companion;", "", "delivery-address_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/delivery/address/addaddressmanually/AddDeliveryAddressManuallyContract$ViewState;", "", "delivery-address_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f7049a;
        public final String b;
        public final String c;
        public final String d;
        public final List e;
        public final SuburbResult.Suburb f;
        public final String g;

        public ViewState(boolean z, String streetAddress1, String str, String postcode, List suburbList, SuburbResult.Suburb suburb, String str2) {
            Intrinsics.h(streetAddress1, "streetAddress1");
            Intrinsics.h(postcode, "postcode");
            Intrinsics.h(suburbList, "suburbList");
            this.f7049a = z;
            this.b = streetAddress1;
            this.c = str;
            this.d = postcode;
            this.e = suburbList;
            this.f = suburb;
            this.g = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f7049a == viewState.f7049a && Intrinsics.c(this.b, viewState.b) && Intrinsics.c(this.c, viewState.c) && Intrinsics.c(this.d, viewState.d) && this.e.equals(viewState.e) && Intrinsics.c(this.f, viewState.f) && Intrinsics.c(this.g, viewState.g);
        }

        public final int hashCode() {
            int iC = b.c(Boolean.hashCode(this.f7049a) * 31, 31, this.b);
            String str = this.c;
            int iD = b.d(b.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
            SuburbResult.Suburb suburb = this.f;
            int iHashCode = (iD + (suburb == null ? 0 : suburb.hashCode())) * 31;
            String str2 = this.g;
            return Boolean.hashCode(false) + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbT = au.com.woolworths.android.onesite.a.t("ViewState(isLoading=", ", streetAddress1=", this.b, ", streetAddress2=", this.f7049a);
            androidx.constraintlayout.core.state.a.B(sbT, this.c, ", postcode=", this.d, ", suburbList=");
            sbT.append(this.e);
            sbT.append(", selectedSuburb=");
            sbT.append(this.f);
            sbT.append(", postcodeInlineErrorMessage=");
            return YU.a.o(sbT, this.g, ", postcodeErrorEnabled=false)");
        }
    }
}
