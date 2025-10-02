package au.com.woolworths.feature.shared.receipt.details;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shared/receipt/details/EReceiptDetailsContract;", "", "ViewState", "Actions", "receipt-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface EReceiptDetailsContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/feature/shared/receipt/details/EReceiptDetailsContract$Actions;", "", "OpenStoreLocationSheet", "OpenShareSheet", "CloseScreen", "ShowDownloadErrorMessage", "Lau/com/woolworths/feature/shared/receipt/details/EReceiptDetailsContract$Actions$CloseScreen;", "Lau/com/woolworths/feature/shared/receipt/details/EReceiptDetailsContract$Actions$OpenShareSheet;", "Lau/com/woolworths/feature/shared/receipt/details/EReceiptDetailsContract$Actions$OpenStoreLocationSheet;", "Lau/com/woolworths/feature/shared/receipt/details/EReceiptDetailsContract$Actions$ShowDownloadErrorMessage;", "receipt-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/receipt/details/EReceiptDetailsContract$Actions$CloseScreen;", "Lau/com/woolworths/feature/shared/receipt/details/EReceiptDetailsContract$Actions;", "receipt-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CloseScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final CloseScreen f6548a = new CloseScreen();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/receipt/details/EReceiptDetailsContract$Actions$OpenShareSheet;", "Lau/com/woolworths/feature/shared/receipt/details/EReceiptDetailsContract$Actions;", "receipt-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenShareSheet extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f6549a;

            public OpenShareSheet(String filePath) {
                Intrinsics.h(filePath, "filePath");
                this.f6549a = filePath;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenShareSheet) && Intrinsics.c(this.f6549a, ((OpenShareSheet) obj).f6549a);
            }

            public final int hashCode() {
                return (this.f6549a.hashCode() * 31) - 1248334925;
            }

            public final String toString() {
                return YU.a.h("OpenShareSheet(filePath=", this.f6549a, ", fileType=application/pdf)");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/receipt/details/EReceiptDetailsContract$Actions$OpenStoreLocationSheet;", "Lau/com/woolworths/feature/shared/receipt/details/EReceiptDetailsContract$Actions;", "receipt-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenStoreLocationSheet extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f6550a;
            public final String b;

            public OpenStoreLocationSheet(String division, String storeNo) {
                Intrinsics.h(division, "division");
                Intrinsics.h(storeNo, "storeNo");
                this.f6550a = division;
                this.b = storeNo;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OpenStoreLocationSheet)) {
                    return false;
                }
                OpenStoreLocationSheet openStoreLocationSheet = (OpenStoreLocationSheet) obj;
                return Intrinsics.c(this.f6550a, openStoreLocationSheet.f6550a) && Intrinsics.c(this.b, openStoreLocationSheet.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f6550a.hashCode() * 31);
            }

            public final String toString() {
                return YU.a.j("OpenStoreLocationSheet(division=", this.f6550a, ", storeNo=", this.b, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/receipt/details/EReceiptDetailsContract$Actions$ShowDownloadErrorMessage;", "Lau/com/woolworths/feature/shared/receipt/details/EReceiptDetailsContract$Actions;", "receipt-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ShowDownloadErrorMessage extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowDownloadErrorMessage f6551a = new ShowDownloadErrorMessage();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/receipt/details/EReceiptDetailsContract$ViewState;", "", "receipt-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f6552a;
        public final boolean b;
        public final EReceiptDetails c;
        public final boolean d;
        public final EReceiptDetailsFullPageErrorState e;

        public ViewState(boolean z, boolean z2, EReceiptDetails eReceiptDetails, boolean z3, EReceiptDetailsFullPageErrorState eReceiptDetailsFullPageErrorState) {
            this.f6552a = z;
            this.b = z2;
            this.c = eReceiptDetails;
            this.d = z3;
            this.e = eReceiptDetailsFullPageErrorState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f6552a == viewState.f6552a && this.b == viewState.b && Intrinsics.c(this.c, viewState.c) && this.d == viewState.d && this.e == viewState.e;
        }

        public final int hashCode() {
            int iE = androidx.camera.core.impl.b.e(Boolean.hashCode(this.f6552a) * 31, 31, this.b);
            EReceiptDetails eReceiptDetails = this.c;
            int iE2 = androidx.camera.core.impl.b.e((iE + (eReceiptDetails == null ? 0 : eReceiptDetails.hashCode())) * 31, 31, this.d);
            EReceiptDetailsFullPageErrorState eReceiptDetailsFullPageErrorState = this.e;
            return iE2 + (eReceiptDetailsFullPageErrorState != null ? eReceiptDetailsFullPageErrorState.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = androidx.camera.core.impl.b.v("ViewState(isLoading=", ", isDownloading=", ", data=", this.f6552a, this.b);
            sbV.append(this.c);
            sbV.append(", isPaymentsCardExpanded=");
            sbV.append(this.d);
            sbV.append(", errorState=");
            sbV.append(this.e);
            sbV.append(")");
            return sbV.toString();
        }
    }
}
