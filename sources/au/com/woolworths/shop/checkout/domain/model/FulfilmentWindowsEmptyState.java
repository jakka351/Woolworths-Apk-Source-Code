package au.com.woolworths.shop.checkout.domain.model;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/FulfilmentWindowsEmptyState;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FulfilmentWindowsEmptyState {

    /* renamed from: a, reason: collision with root package name */
    public final String f10611a;
    public final String b;

    public FulfilmentWindowsEmptyState(String str, String str2) {
        this.f10611a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FulfilmentWindowsEmptyState)) {
            return false;
        }
        FulfilmentWindowsEmptyState fulfilmentWindowsEmptyState = (FulfilmentWindowsEmptyState) obj;
        return Intrinsics.c(this.f10611a, fulfilmentWindowsEmptyState.f10611a) && Intrinsics.c(this.b, fulfilmentWindowsEmptyState.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10611a.hashCode() * 31);
    }

    public final String toString() {
        return a.j("FulfilmentWindowsEmptyState(title=", this.f10611a, ", message=", this.b, ")");
    }
}
