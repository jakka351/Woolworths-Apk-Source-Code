package au.com.woolworths.shop.checkout.domain.model;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/FulfilmentSlotSelectionOptionsState;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FulfilmentSlotSelectionOptionsState {

    /* renamed from: a, reason: collision with root package name */
    public final Object f10608a;

    public FulfilmentSlotSelectionOptionsState(List list) {
        this.f10608a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FulfilmentSlotSelectionOptionsState) && this.f10608a.equals(((FulfilmentSlotSelectionOptionsState) obj).f10608a);
    }

    public final int hashCode() {
        return this.f10608a.hashCode();
    }

    public final String toString() {
        return b.n(this.f10608a, "FulfilmentSlotSelectionOptionsState(options=", ")");
    }
}
