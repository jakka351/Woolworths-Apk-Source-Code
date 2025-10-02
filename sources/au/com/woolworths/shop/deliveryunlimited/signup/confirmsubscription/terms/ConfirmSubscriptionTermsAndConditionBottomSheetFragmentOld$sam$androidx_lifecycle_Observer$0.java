package au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.terms;

import androidx.lifecycle.Observer;
import au.com.woolworths.product.details.d;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ConfirmSubscriptionTermsAndConditionBottomSheetFragmentOld$sam$androidx_lifecycle_Observer$0 implements Observer, FunctionAdapter {
    public final /* synthetic */ d d;

    public ConfirmSubscriptionTermsAndConditionBottomSheetFragmentOld$sam$androidx_lifecycle_Observer$0(d dVar) {
        this.d = dVar;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.c(b(), ((FunctionAdapter) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.d.invoke(obj);
    }
}
