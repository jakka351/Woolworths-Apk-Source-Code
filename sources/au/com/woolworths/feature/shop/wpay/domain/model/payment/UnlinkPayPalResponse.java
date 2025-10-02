package au.com.woolworths.feature.shop.wpay.domain.model.payment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/UnlinkPayPalResponse;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UnlinkPayPalResponse {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8319a;
    public final String b;

    public UnlinkPayPalResponse(boolean z, String str) {
        this.f8319a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnlinkPayPalResponse)) {
            return false;
        }
        UnlinkPayPalResponse unlinkPayPalResponse = (UnlinkPayPalResponse) obj;
        return this.f8319a == unlinkPayPalResponse.f8319a && Intrinsics.c(this.b, unlinkPayPalResponse.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f8319a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return a.m("UnlinkPayPalResponse(success=", this.f8319a, ", message=", this.b, ")");
    }
}
