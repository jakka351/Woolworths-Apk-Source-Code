package au.com.woolworths.shop.checkout.domain.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/UpfrontFulfilmentWindowResult;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UpfrontFulfilmentWindowResult {

    /* renamed from: a, reason: collision with root package name */
    public final CollectionMethodOptionModeId f10640a;

    public UpfrontFulfilmentWindowResult(CollectionMethodOptionModeId collectionMethodOptionModeId) {
        this.f10640a = collectionMethodOptionModeId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpfrontFulfilmentWindowResult) && this.f10640a == ((UpfrontFulfilmentWindowResult) obj).f10640a;
    }

    public final int hashCode() {
        return this.f10640a.hashCode();
    }

    public final String toString() {
        return "UpfrontFulfilmentWindowResult(modeId=" + this.f10640a + ")";
    }
}
