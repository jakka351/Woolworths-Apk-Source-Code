package au.com.woolworths.shop.checkout.domain.model;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.inlinemessage.InlineMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/FulfilmentWindowsSelectedState;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FulfilmentWindowsSelectedState {

    /* renamed from: a, reason: collision with root package name */
    public final String f10616a;
    public final String b;
    public final String c;
    public final String d;
    public final FulfilmentWindows e;
    public final InlineMessage f;

    public FulfilmentWindowsSelectedState(String str, String str2, String details, String str3, FulfilmentWindows fulfilmentWindows, InlineMessage inlineMessage) {
        Intrinsics.h(details, "details");
        this.f10616a = str;
        this.b = str2;
        this.c = details;
        this.d = str3;
        this.e = fulfilmentWindows;
        this.f = inlineMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FulfilmentWindowsSelectedState)) {
            return false;
        }
        FulfilmentWindowsSelectedState fulfilmentWindowsSelectedState = (FulfilmentWindowsSelectedState) obj;
        return Intrinsics.c(this.f10616a, fulfilmentWindowsSelectedState.f10616a) && Intrinsics.c(this.b, fulfilmentWindowsSelectedState.b) && Intrinsics.c(this.c, fulfilmentWindowsSelectedState.c) && Intrinsics.c(this.d, fulfilmentWindowsSelectedState.d) && Intrinsics.c(this.e, fulfilmentWindowsSelectedState.e) && Intrinsics.c(this.f, fulfilmentWindowsSelectedState.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + b.c(b.c(b.c(this.f10616a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31;
        InlineMessage inlineMessage = this.f;
        return iHashCode + (inlineMessage == null ? 0 : inlineMessage.hashCode());
    }

    public final String toString() {
        StringBuilder sbV = a.v("FulfilmentWindowsSelectedState(title=", this.f10616a, ", subtitle=", this.b, ", details=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", buttonTitle=", this.d, ", windows=");
        sbV.append(this.e);
        sbV.append(", message=");
        sbV.append(this.f);
        sbV.append(")");
        return sbV.toString();
    }
}
