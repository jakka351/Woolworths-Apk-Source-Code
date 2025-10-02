package au.com.woolworths.foundation.shop.editorder.ui;

import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderConfirmation;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderMessage;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/ui/EditOrderBannerContract;", "", "ViewState", "Action", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface EditOrderBannerContract {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/ui/EditOrderBannerContract$Action;", "", "ShowDialog", "ShowCmoErrorPage", "CancellationSuccess", "CancellationFailure", "Lau/com/woolworths/foundation/shop/editorder/ui/EditOrderBannerContract$Action$CancellationFailure;", "Lau/com/woolworths/foundation/shop/editorder/ui/EditOrderBannerContract$Action$CancellationSuccess;", "Lau/com/woolworths/foundation/shop/editorder/ui/EditOrderBannerContract$Action$ShowCmoErrorPage;", "Lau/com/woolworths/foundation/shop/editorder/ui/EditOrderBannerContract$Action$ShowDialog;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/ui/EditOrderBannerContract$Action$CancellationFailure;", "Lau/com/woolworths/foundation/shop/editorder/ui/EditOrderBannerContract$Action;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CancellationFailure extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final Text f8742a;

            public CancellationFailure(Text text) {
                this.f8742a = text;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CancellationFailure) && Intrinsics.c(this.f8742a, ((CancellationFailure) obj).f8742a);
            }

            public final int hashCode() {
                return this.f8742a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.android.onesite.a.h("CancellationFailure(message=", this.f8742a, ")");
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/ui/EditOrderBannerContract$Action$CancellationSuccess;", "Lau/com/woolworths/foundation/shop/editorder/ui/EditOrderBannerContract$Action;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CancellationSuccess extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final Text f8743a;

            public CancellationSuccess(Text text) {
                this.f8743a = text;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CancellationSuccess) && Intrinsics.c(this.f8743a, ((CancellationSuccess) obj).f8743a);
            }

            public final int hashCode() {
                return this.f8743a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.android.onesite.a.h("CancellationSuccess(message=", this.f8743a, ")");
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/ui/EditOrderBannerContract$Action$ShowCmoErrorPage;", "Lau/com/woolworths/foundation/shop/editorder/ui/EditOrderBannerContract$Action;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowCmoErrorPage extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final EditOrderMessage f8744a;

            public ShowCmoErrorPage(EditOrderMessage data) {
                Intrinsics.h(data, "data");
                this.f8744a = data;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowCmoErrorPage) && Intrinsics.c(this.f8744a, ((ShowCmoErrorPage) obj).f8744a);
            }

            public final int hashCode() {
                return this.f8744a.hashCode();
            }

            public final String toString() {
                return "ShowCmoErrorPage(data=" + this.f8744a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/ui/EditOrderBannerContract$Action$ShowDialog;", "Lau/com/woolworths/foundation/shop/editorder/ui/EditOrderBannerContract$Action;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowDialog extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final EditOrderConfirmation f8745a;

            public ShowDialog(EditOrderConfirmation editOrderConfirmation) {
                this.f8745a = editOrderConfirmation;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowDialog) && Intrinsics.c(this.f8745a, ((ShowDialog) obj).f8745a);
            }

            public final int hashCode() {
                return this.f8745a.hashCode();
            }

            public final String toString() {
                return "ShowDialog(data=" + this.f8745a + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/ui/EditOrderBannerContract$ViewState;", "", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final EditOrderStatus f8746a;

        public ViewState(EditOrderStatus editOrderStatus) {
            this.f8746a = editOrderStatus;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewState) && Intrinsics.c(this.f8746a, ((ViewState) obj).f8746a);
        }

        public final int hashCode() {
            EditOrderStatus editOrderStatus = this.f8746a;
            if (editOrderStatus == null) {
                return 0;
            }
            return editOrderStatus.hashCode();
        }

        public final String toString() {
            return "ViewState(data=" + this.f8746a + ")";
        }
    }
}
