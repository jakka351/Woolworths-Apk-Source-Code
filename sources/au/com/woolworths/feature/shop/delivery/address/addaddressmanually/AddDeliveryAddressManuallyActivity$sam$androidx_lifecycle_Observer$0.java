package au.com.woolworths.feature.shop.delivery.address.addaddressmanually;

import androidx.lifecycle.Observer;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.l;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AddDeliveryAddressManuallyActivity$sam$androidx_lifecycle_Observer$0 implements Observer, FunctionAdapter {
    public final /* synthetic */ l d;

    public AddDeliveryAddressManuallyActivity$sam$androidx_lifecycle_Observer$0(l lVar) {
        this.d = lVar;
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
    public final /* synthetic */ void onChanged(Object obj) throws Exception {
        this.d.invoke(obj);
    }
}
