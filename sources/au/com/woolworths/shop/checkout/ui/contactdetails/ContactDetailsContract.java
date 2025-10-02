package au.com.woolworths.shop.checkout.ui.contactdetails;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/contactdetails/ContactDetailsContract;", "", "ViewState", "Action", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ContactDetailsContract {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/contactdetails/ContactDetailsContract$Action;", "", "Dismiss", "Lau/com/woolworths/shop/checkout/ui/contactdetails/ContactDetailsContract$Action$Dismiss;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/contactdetails/ContactDetailsContract$Action$Dismiss;", "Lau/com/woolworths/shop/checkout/ui/contactdetails/ContactDetailsContract$Action;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Dismiss implements Action {

            /* renamed from: a, reason: collision with root package name */
            public static final Dismiss f10726a = new Dismiss();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Dismiss);
            }

            public final int hashCode() {
                return 545977917;
            }

            public final String toString() {
                return "Dismiss";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/contactdetails/ContactDetailsContract$ViewState;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final String f10727a;
        public final String b;
        public final boolean c;

        public /* synthetic */ ViewState(String str, String str2, int i) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, false);
        }

        public static ViewState a(ViewState viewState, String phoneNumber, boolean z, int i) {
            if ((i & 1) != 0) {
                phoneNumber = viewState.f10727a;
            }
            String placeholder = viewState.b;
            viewState.getClass();
            Intrinsics.h(phoneNumber, "phoneNumber");
            Intrinsics.h(placeholder, "placeholder");
            return new ViewState(phoneNumber, placeholder, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.c(this.f10727a, viewState.f10727a) && Intrinsics.c(this.b, viewState.b) && this.c == viewState.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + b.c(this.f10727a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.k(")", a.v("ViewState(phoneNumber=", this.f10727a, ", placeholder=", this.b, ", showPhoneNumberMissingError="), this.c);
        }

        public ViewState(String phoneNumber, String placeholder, boolean z) {
            Intrinsics.h(phoneNumber, "phoneNumber");
            Intrinsics.h(placeholder, "placeholder");
            this.f10727a = phoneNumber;
            this.b = placeholder;
            this.c = z;
        }
    }
}
