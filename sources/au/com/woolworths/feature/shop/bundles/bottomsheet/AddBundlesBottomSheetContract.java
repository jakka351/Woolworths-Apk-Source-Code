package au.com.woolworths.feature.shop.bundles.bottomsheet;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/bottomsheet/AddBundlesBottomSheetContract;", "", "Actions", "ViewState", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AddBundlesBottomSheetContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/bottomsheet/AddBundlesBottomSheetContract$Actions;", "", "ShowBoostFailureSnackbar", "ShowLoading", "ShowAddToCartError", "DismissBottomSheet", "Lau/com/woolworths/feature/shop/bundles/bottomsheet/AddBundlesBottomSheetContract$Actions$DismissBottomSheet;", "Lau/com/woolworths/feature/shop/bundles/bottomsheet/AddBundlesBottomSheetContract$Actions$ShowAddToCartError;", "Lau/com/woolworths/feature/shop/bundles/bottomsheet/AddBundlesBottomSheetContract$Actions$ShowBoostFailureSnackbar;", "Lau/com/woolworths/feature/shop/bundles/bottomsheet/AddBundlesBottomSheetContract$Actions$ShowLoading;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/bottomsheet/AddBundlesBottomSheetContract$Actions$DismissBottomSheet;", "Lau/com/woolworths/feature/shop/bundles/bottomsheet/AddBundlesBottomSheetContract$Actions;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class DismissBottomSheet extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final BundlesBottomSheetActionType f6747a;

            public DismissBottomSheet(BundlesBottomSheetActionType bundlesBottomSheetActionType) {
                this.f6747a = bundlesBottomSheetActionType;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DismissBottomSheet) && this.f6747a == ((DismissBottomSheet) obj).f6747a;
            }

            public final int hashCode() {
                return this.f6747a.hashCode();
            }

            public final String toString() {
                return "DismissBottomSheet(actionType=" + this.f6747a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/bottomsheet/AddBundlesBottomSheetContract$Actions$ShowAddToCartError;", "Lau/com/woolworths/feature/shop/bundles/bottomsheet/AddBundlesBottomSheetContract$Actions;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowAddToCartError extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final BundlesBottomSheetErrorCause f6748a;

            public ShowAddToCartError(BundlesBottomSheetErrorCause bundlesBottomSheetErrorCause) {
                this.f6748a = bundlesBottomSheetErrorCause;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowAddToCartError) && this.f6748a == ((ShowAddToCartError) obj).f6748a;
            }

            public final int hashCode() {
                return this.f6748a.hashCode();
            }

            public final String toString() {
                return "ShowAddToCartError(errorCause=" + this.f6748a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/bottomsheet/AddBundlesBottomSheetContract$Actions$ShowBoostFailureSnackbar;", "Lau/com/woolworths/feature/shop/bundles/bottomsheet/AddBundlesBottomSheetContract$Actions;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowBoostFailureSnackbar extends Actions {
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowBoostFailureSnackbar);
            }

            public final int hashCode() {
                Boolean.hashCode(false);
                throw null;
            }

            public final String toString() {
                return "ShowBoostFailureSnackbar(showRetryButton=false, actionType=null)";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/bottomsheet/AddBundlesBottomSheetContract$Actions$ShowLoading;", "Lau/com/woolworths/feature/shop/bundles/bottomsheet/AddBundlesBottomSheetContract$Actions;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowLoading extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final BundlesBottomSheetActionType f6749a;

            public ShowLoading(BundlesBottomSheetActionType bundlesBottomSheetActionType) {
                this.f6749a = bundlesBottomSheetActionType;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowLoading) && this.f6749a == ((ShowLoading) obj).f6749a;
            }

            public final int hashCode() {
                return this.f6749a.hashCode();
            }

            public final String toString() {
                return "ShowLoading(actionType=" + this.f6749a + ")";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/bottomsheet/AddBundlesBottomSheetContract$ViewState;", "", "Companion", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {
        public static final ViewState c = new ViewState(0, StatefulButtonState.f);

        /* renamed from: a, reason: collision with root package name */
        public final int f6750a;
        public final StatefulButtonState b;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/bottomsheet/AddBundlesBottomSheetContract$ViewState$Companion;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
        }

        public ViewState(int i, StatefulButtonState statefulButtonState) {
            this.f6750a = i;
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
            return this.f6750a == viewState.f6750a && this.b == viewState.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.f6750a) * 31);
        }

        public final String toString() {
            return "ViewState(selectedQuantityIndex=" + this.f6750a + ", buttonState=" + this.b + ")";
        }
    }
}
