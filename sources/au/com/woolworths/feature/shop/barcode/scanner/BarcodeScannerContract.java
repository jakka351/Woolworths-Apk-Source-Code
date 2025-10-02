package au.com.woolworths.feature.shop.barcode.scanner;

import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/barcode/scanner/BarcodeScannerContract;", "", "Actions", "ViewState", "ErrorState", "barcode-scanner_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface BarcodeScannerContract {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/feature/shop/barcode/scanner/BarcodeScannerContract$Actions;", "", "EnableCameraAccess", "CameraAccessPermanentlyDenied", "BarcodeDetected", "ResumeCamera", "LaunchLegacyProductDetails", "LaunchProductDetails", "Lau/com/woolworths/feature/shop/barcode/scanner/BarcodeScannerContract$Actions$BarcodeDetected;", "Lau/com/woolworths/feature/shop/barcode/scanner/BarcodeScannerContract$Actions$CameraAccessPermanentlyDenied;", "Lau/com/woolworths/feature/shop/barcode/scanner/BarcodeScannerContract$Actions$EnableCameraAccess;", "Lau/com/woolworths/feature/shop/barcode/scanner/BarcodeScannerContract$Actions$LaunchLegacyProductDetails;", "Lau/com/woolworths/feature/shop/barcode/scanner/BarcodeScannerContract$Actions$LaunchProductDetails;", "Lau/com/woolworths/feature/shop/barcode/scanner/BarcodeScannerContract$Actions$ResumeCamera;", "barcode-scanner_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/barcode/scanner/BarcodeScannerContract$Actions$BarcodeDetected;", "Lau/com/woolworths/feature/shop/barcode/scanner/BarcodeScannerContract$Actions;", "barcode-scanner_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class BarcodeDetected extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final BarcodeDetected f6639a = new BarcodeDetected();
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/barcode/scanner/BarcodeScannerContract$Actions$CameraAccessPermanentlyDenied;", "Lau/com/woolworths/feature/shop/barcode/scanner/BarcodeScannerContract$Actions;", "barcode-scanner_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CameraAccessPermanentlyDenied extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final CameraAccessPermanentlyDenied f6640a = new CameraAccessPermanentlyDenied();
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/barcode/scanner/BarcodeScannerContract$Actions$EnableCameraAccess;", "Lau/com/woolworths/feature/shop/barcode/scanner/BarcodeScannerContract$Actions;", "barcode-scanner_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class EnableCameraAccess extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final EnableCameraAccess f6641a = new EnableCameraAccess();
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/barcode/scanner/BarcodeScannerContract$Actions$LaunchLegacyProductDetails;", "Lau/com/woolworths/feature/shop/barcode/scanner/BarcodeScannerContract$Actions;", "barcode-scanner_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchLegacyProductDetails extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final Activities.LegacyProductDetails.Extras f6642a;

            public LaunchLegacyProductDetails(Activities.LegacyProductDetails.Extras extras) {
                this.f6642a = extras;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchLegacyProductDetails) && Intrinsics.c(this.f6642a, ((LaunchLegacyProductDetails) obj).f6642a);
            }

            public final int hashCode() {
                return this.f6642a.d.hashCode();
            }

            public final String toString() {
                return "LaunchLegacyProductDetails(productDetailsExtra=" + this.f6642a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/barcode/scanner/BarcodeScannerContract$Actions$LaunchProductDetails;", "Lau/com/woolworths/feature/shop/barcode/scanner/BarcodeScannerContract$Actions;", "barcode-scanner_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductDetails extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f6643a;

            public LaunchProductDetails(ProductCard productCard) {
                this.f6643a = productCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchProductDetails) && Intrinsics.c(this.f6643a, ((LaunchProductDetails) obj).f6643a);
            }

            public final int hashCode() {
                return this.f6643a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.dynamic.page.ui.content.d.n("LaunchProductDetails(productCard=", this.f6643a, ")");
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/barcode/scanner/BarcodeScannerContract$Actions$ResumeCamera;", "Lau/com/woolworths/feature/shop/barcode/scanner/BarcodeScannerContract$Actions;", "barcode-scanner_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ResumeCamera extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ResumeCamera f6644a = new ResumeCamera();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/barcode/scanner/BarcodeScannerContract$ErrorState;", "", "barcode-scanner_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ErrorState {
        public static final ErrorState f;
        public static final ErrorState g;
        public static final ErrorState h;
        public static final ErrorState i;
        public static final /* synthetic */ ErrorState[] j;
        public static final /* synthetic */ EnumEntries k;
        public final int d;
        public final int e;

        static {
            ErrorState errorState = new ErrorState(0, com.woolworths.R.string.no_network_heading, com.woolworths.R.string.product_detail_connection_error, "NO_NETWORK");
            f = errorState;
            ErrorState errorState2 = new ErrorState(1, com.woolworths.R.string.product_not_found_title, com.woolworths.R.string.product_not_found_message, "NOT_FOUND");
            g = errorState2;
            ErrorState errorState3 = new ErrorState(2, com.woolworths.R.string.product_not_found_title, com.woolworths.R.string.product_not_decoded_message, "NOT_DECODED");
            h = errorState3;
            ErrorState errorState4 = new ErrorState(3, com.woolworths.R.string.server_error_heading, com.woolworths.R.string.product_detail_unable_to_load_results, "SERVER_ERROR");
            i = errorState4;
            ErrorState[] errorStateArr = {errorState, errorState2, errorState3, errorState4};
            j = errorStateArr;
            k = EnumEntriesKt.a(errorStateArr);
        }

        public ErrorState(int i2, int i3, int i4, String str) {
            this.d = i3;
            this.e = i4;
        }

        public static ErrorState valueOf(String str) {
            return (ErrorState) Enum.valueOf(ErrorState.class, str);
        }

        public static ErrorState[] values() {
            return (ErrorState[]) j.clone();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/barcode/scanner/BarcodeScannerContract$ViewState;", "", "barcode-scanner_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f6645a;
        public final boolean b;
        public final ErrorState c;

        public ViewState(boolean z, boolean z2, ErrorState errorState) {
            this.f6645a = z;
            this.b = z2;
            this.c = errorState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f6645a == viewState.f6645a && this.b == viewState.b && this.c == viewState.c;
        }

        public final int hashCode() {
            int iE = androidx.camera.core.impl.b.e(Boolean.hashCode(this.f6645a) * 31, 31, this.b);
            ErrorState errorState = this.c;
            return iE + (errorState == null ? 0 : errorState.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = androidx.camera.core.impl.b.v("ViewState(showOnboarding=", ", isLoading=", ", errorState=", this.f6645a, this.b);
            sbV.append(this.c);
            sbV.append(")");
            return sbV.toString();
        }
    }
}
