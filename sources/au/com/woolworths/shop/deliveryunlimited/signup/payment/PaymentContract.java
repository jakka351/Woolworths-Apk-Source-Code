package au.com.woolworths.shop.deliveryunlimited.signup.payment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.feature.shop.wpay.domain.model.PageResult;
import au.com.woolworths.feature.shop.wpay.ui.common.model.LoadingState;
import au.com.woolworths.feature.shop.wpay.ui.wpay.AlertDialogData;
import au.com.woolworths.feature.shop.wpay.ui.wpay.ModalBottomSheetData;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.TermsBottomSheetData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/payment/PaymentContract;", "", "ViewState", "Action", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PaymentContract {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/payment/PaymentContract$Action;", "", "Dismiss", "OpenUrl", "LaunchSnackBar", "CvvFormSubmit", "CvvFormReload", "LaunchConfirmationPage", "Lau/com/woolworths/shop/deliveryunlimited/signup/payment/PaymentContract$Action$CvvFormReload;", "Lau/com/woolworths/shop/deliveryunlimited/signup/payment/PaymentContract$Action$CvvFormSubmit;", "Lau/com/woolworths/shop/deliveryunlimited/signup/payment/PaymentContract$Action$Dismiss;", "Lau/com/woolworths/shop/deliveryunlimited/signup/payment/PaymentContract$Action$LaunchConfirmationPage;", "Lau/com/woolworths/shop/deliveryunlimited/signup/payment/PaymentContract$Action$LaunchSnackBar;", "Lau/com/woolworths/shop/deliveryunlimited/signup/payment/PaymentContract$Action$OpenUrl;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/payment/PaymentContract$Action$CvvFormReload;", "Lau/com/woolworths/shop/deliveryunlimited/signup/payment/PaymentContract$Action;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CvvFormReload implements Action {

            /* renamed from: a, reason: collision with root package name */
            public static final CvvFormReload f10885a = new CvvFormReload();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CvvFormReload);
            }

            public final int hashCode() {
                return -579636592;
            }

            public final String toString() {
                return "CvvFormReload";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/payment/PaymentContract$Action$CvvFormSubmit;", "Lau/com/woolworths/shop/deliveryunlimited/signup/payment/PaymentContract$Action;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CvvFormSubmit implements Action {

            /* renamed from: a, reason: collision with root package name */
            public static final CvvFormSubmit f10886a = new CvvFormSubmit();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CvvFormSubmit);
            }

            public final int hashCode() {
                return -536530673;
            }

            public final String toString() {
                return "CvvFormSubmit";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/payment/PaymentContract$Action$Dismiss;", "Lau/com/woolworths/shop/deliveryunlimited/signup/payment/PaymentContract$Action;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Dismiss implements Action {

            /* renamed from: a, reason: collision with root package name */
            public static final Dismiss f10887a = new Dismiss();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/payment/PaymentContract$Action$LaunchConfirmationPage;", "Lau/com/woolworths/shop/deliveryunlimited/signup/payment/PaymentContract$Action;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchConfirmationPage implements Action {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchConfirmationPage f10888a = new LaunchConfirmationPage();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchConfirmationPage);
            }

            public final int hashCode() {
                return -930340889;
            }

            public final String toString() {
                return "LaunchConfirmationPage";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/payment/PaymentContract$Action$LaunchSnackBar;", "Lau/com/woolworths/shop/deliveryunlimited/signup/payment/PaymentContract$Action;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchSnackBar implements Action {

            /* renamed from: a, reason: collision with root package name */
            public final Text f10889a;

            public LaunchSnackBar(Text text) {
                this.f10889a = text;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchSnackBar) && Intrinsics.c(this.f10889a, ((LaunchSnackBar) obj).f10889a);
            }

            public final int hashCode() {
                return this.f10889a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.android.onesite.a.h("LaunchSnackBar(message=", this.f10889a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/payment/PaymentContract$Action$OpenUrl;", "Lau/com/woolworths/shop/deliveryunlimited/signup/payment/PaymentContract$Action;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenUrl implements Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f10890a;

            public OpenUrl(String url) {
                Intrinsics.h(url, "url");
                this.f10890a = url;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenUrl) && Intrinsics.c(this.f10890a, ((OpenUrl) obj).f10890a);
            }

            public final int hashCode() {
                return this.f10890a.hashCode();
            }

            public final String toString() {
                return YU.a.h("OpenUrl(url=", this.f10890a, ")");
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/payment/PaymentContract$ViewState;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final LoadingState f10891a;
        public final PageResult b;
        public final String c;
        public final ModalBottomSheetData d;
        public final boolean e;
        public final String f;
        public final AlertDialogData g;
        public final TermsBottomSheetData h;
        public final String i;

        public ViewState(LoadingState loadingState, PageResult pageResult, String str, ModalBottomSheetData modalBottomSheetData, boolean z, String str2, AlertDialogData alertDialogData, TermsBottomSheetData termsBottomSheetData, String str3) {
            Intrinsics.h(pageResult, "pageResult");
            this.f10891a = loadingState;
            this.b = pageResult;
            this.c = str;
            this.d = modalBottomSheetData;
            this.e = z;
            this.f = str2;
            this.g = alertDialogData;
            this.h = termsBottomSheetData;
            this.i = str3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v11, types: [au.com.woolworths.shop.deliveryunlimited.signup.payment.TermsBottomSheetData] */
        /* JADX WARN: Type inference failed for: r14v2, types: [au.com.woolworths.feature.shop.wpay.ui.wpay.ModalBottomSheetData] */
        public static ViewState a(ViewState viewState, LoadingState loadingState, PageResult pageResult, String str, ModalBottomSheetData.AddCreditCard addCreditCard, boolean z, String str2, AlertDialogData alertDialogData, TermsBottomSheetData.Terms terms, String str3, int i) {
            if ((i & 1) != 0) {
                loadingState = viewState.f10891a;
            }
            LoadingState loadingState2 = loadingState;
            if ((i & 2) != 0) {
                pageResult = viewState.b;
            }
            PageResult pageResult2 = pageResult;
            if ((i & 4) != 0) {
                str = viewState.c;
            }
            String str4 = str;
            ModalBottomSheetData.AddCreditCard addCreditCard2 = addCreditCard;
            if ((i & 8) != 0) {
                addCreditCard2 = viewState.d;
            }
            ModalBottomSheetData.AddCreditCard addCreditCard3 = addCreditCard2;
            if ((i & 16) != 0) {
                z = viewState.e;
            }
            boolean z2 = z;
            String str5 = (i & 32) != 0 ? viewState.f : str2;
            AlertDialogData alertDialogData2 = (i & 64) != 0 ? viewState.g : alertDialogData;
            TermsBottomSheetData.Terms terms2 = (i & 128) != 0 ? viewState.h : terms;
            String str6 = (i & 256) != 0 ? viewState.i : str3;
            viewState.getClass();
            Intrinsics.h(loadingState2, "loadingState");
            Intrinsics.h(pageResult2, "pageResult");
            return new ViewState(loadingState2, pageResult2, str4, addCreditCard3, z2, str5, alertDialogData2, terms2, str6);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f10891a == viewState.f10891a && Intrinsics.c(this.b, viewState.b) && Intrinsics.c(this.c, viewState.c) && Intrinsics.c(this.d, viewState.d) && this.e == viewState.e && Intrinsics.c(this.f, viewState.f) && Intrinsics.c(this.g, viewState.g) && Intrinsics.c(this.h, viewState.h) && Intrinsics.c(this.i, viewState.i);
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + (this.f10891a.hashCode() * 31)) * 31;
            String str = this.c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ModalBottomSheetData modalBottomSheetData = this.d;
            int iE = androidx.camera.core.impl.b.e((iHashCode2 + (modalBottomSheetData == null ? 0 : modalBottomSheetData.hashCode())) * 31, 31, this.e);
            String str2 = this.f;
            int iHashCode3 = (iE + (str2 == null ? 0 : str2.hashCode())) * 31;
            AlertDialogData alertDialogData = this.g;
            int iHashCode4 = (iHashCode3 + (alertDialogData == null ? 0 : alertDialogData.hashCode())) * 31;
            TermsBottomSheetData termsBottomSheetData = this.h;
            int iHashCode5 = (iHashCode4 + (termsBottomSheetData == null ? 0 : termsBottomSheetData.hashCode())) * 31;
            String str3 = this.i;
            return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(loadingState=");
            sb.append(this.f10891a);
            sb.append(", pageResult=");
            sb.append(this.b);
            sb.append(", selectedPaymentMethod=");
            sb.append(this.c);
            sb.append(", modalBottomSheetData=");
            sb.append(this.d);
            sb.append(", cvvErrorLoadingVisible=");
            au.com.woolworths.android.onesite.a.y(", cvvErrorValidationMessage=", this.f, ", alertDialogData=", sb, this.e);
            sb.append(this.g);
            sb.append(", termsBottomSheetData=");
            sb.append(this.h);
            sb.append(", errorBannerMessage=");
            return YU.a.o(sb, this.i, ")");
        }

        public /* synthetic */ ViewState(PageResult pageResult, String str, TermsBottomSheetData.Terms terms, int i) {
            this(LoadingState.d, (i & 2) != 0 ? PageResult.Uninitialized.f8286a : pageResult, (i & 4) != 0 ? null : str, null, false, null, null, (i & 128) != 0 ? null : terms, (i & 256) == 0 ? "Unable to subscribe" : null);
        }
    }
}
