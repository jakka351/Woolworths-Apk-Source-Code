package au.com.woolworths.feature.shop.myorders.editdriverinstruction;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.feature.shop.myorders.editdriverinstruction.EditDriverInstructionActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/editdriverinstruction/EditDriverInstructionsContract;", "", "Actions", "ViewState", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface EditDriverInstructionsContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/editdriverinstruction/EditDriverInstructionsContract$Actions;", "", "ShowSnackbar", "FinishWithMessage", "Lau/com/woolworths/feature/shop/myorders/editdriverinstruction/EditDriverInstructionsContract$Actions$FinishWithMessage;", "Lau/com/woolworths/feature/shop/myorders/editdriverinstruction/EditDriverInstructionsContract$Actions$ShowSnackbar;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/editdriverinstruction/EditDriverInstructionsContract$Actions$FinishWithMessage;", "Lau/com/woolworths/feature/shop/myorders/editdriverinstruction/EditDriverInstructionsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class FinishWithMessage extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final EditDriverInstructionActivity.Result f7826a;

            public FinishWithMessage(EditDriverInstructionActivity.Result result) {
                this.f7826a = result;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FinishWithMessage) && Intrinsics.c(this.f7826a, ((FinishWithMessage) obj).f7826a);
            }

            public final int hashCode() {
                return this.f7826a.hashCode();
            }

            public final String toString() {
                return "FinishWithMessage(result=" + this.f7826a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/editdriverinstruction/EditDriverInstructionsContract$Actions$ShowSnackbar;", "Lau/com/woolworths/feature/shop/myorders/editdriverinstruction/EditDriverInstructionsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSnackbar extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final Text f7827a;

            public ShowSnackbar(Text text) {
                this.f7827a = text;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowSnackbar) && Intrinsics.c(this.f7827a, ((ShowSnackbar) obj).f7827a);
            }

            public final int hashCode() {
                return this.f7827a.hashCode();
            }

            public final String toString() {
                return a.h("ShowSnackbar(message=", this.f7827a, ")");
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/editdriverinstruction/EditDriverInstructionsContract$ViewState;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final StatefulButtonState f7828a;

        public ViewState(StatefulButtonState statefulButtonState) {
            this.f7828a = statefulButtonState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewState) && this.f7828a == ((ViewState) obj).f7828a;
        }

        public final int hashCode() {
            return this.f7828a.hashCode();
        }

        public final String toString() {
            return "ViewState(saveButtonState=" + this.f7828a + ")";
        }
    }
}
