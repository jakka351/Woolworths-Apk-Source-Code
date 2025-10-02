package au.com.woolworths.feature.shop.myorders.details.cancel;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/cancel/CancelOrderFullPageErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class CancelOrderFullPageErrorState implements FullPageErrorCause {
    public final String d;

    public CancelOrderFullPageErrorState(String message) {
        Intrinsics.h(message, "message");
        this.d = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CancelOrderFullPageErrorState) && Intrinsics.c(this.d, ((CancelOrderFullPageErrorState) obj).d);
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final int getDrawableRes() {
        return R.drawable.ic_order_not_found;
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final Text getMessage() {
        return new PlainText(this.d);
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final int getSecondaryActionRes() {
        return R.string.cancel_order_return_to_order_list;
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final Text getTitle() {
        return null;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return a.h("CancelOrderFullPageErrorState(title=null, message=", this.d, ")");
    }
}
