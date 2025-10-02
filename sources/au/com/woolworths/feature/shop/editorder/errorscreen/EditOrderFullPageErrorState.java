package au.com.woolworths.feature.shop.editorder.errorscreen;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/errorscreen/EditOrderFullPageErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "CmoError", "Lau/com/woolworths/feature/shop/editorder/errorscreen/EditOrderFullPageErrorState$CmoError;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class EditOrderFullPageErrorState implements FullPageErrorCause {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/errorscreen/EditOrderFullPageErrorState$CmoError;", "Lau/com/woolworths/feature/shop/editorder/errorscreen/EditOrderFullPageErrorState;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CmoError extends EditOrderFullPageErrorState {
        public final String d;
        public final String e;

        public CmoError(String title, String message) {
            Intrinsics.h(title, "title");
            Intrinsics.h(message, "message");
            this.d = title;
            this.e = message;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CmoError)) {
                return false;
            }
            CmoError cmoError = (CmoError) obj;
            return Intrinsics.c(this.d, cmoError.d) && Intrinsics.c(this.e, cmoError.e);
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final int getDrawableRes() {
            return R.drawable.cmo_error_state;
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final Text getMessage() {
            return new PlainText(this.e);
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final Text getTitle() {
            return new PlainText(this.d);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        public final String toString() {
            return a.j("CmoError(title=", this.d, ", message=", this.e, ")");
        }
    }
}
