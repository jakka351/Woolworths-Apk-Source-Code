package au.com.woolworths.feature.shop.wpay.domain.model.payment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/LinkPayPalResponse;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LinkPayPalResponse {

    /* renamed from: a, reason: collision with root package name */
    public final String f8299a;
    public final String b;
    public final String c;
    public final Map d;

    public LinkPayPalResponse(String str, String str2, Map map, String str3) {
        this.f8299a = str;
        this.b = str2;
        this.c = str3;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkPayPalResponse)) {
            return false;
        }
        LinkPayPalResponse linkPayPalResponse = (LinkPayPalResponse) obj;
        return Intrinsics.c(this.f8299a, linkPayPalResponse.f8299a) && Intrinsics.c(this.b, linkPayPalResponse.b) && Intrinsics.c(this.c, linkPayPalResponse.c) && Intrinsics.c(this.d, linkPayPalResponse.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + b.c(b.c(this.f8299a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbV = a.v("LinkPayPalResponse(id=", this.f8299a, ", url=", this.b, ", redirectUrl=");
        sbV.append(this.c);
        sbV.append(", headers=");
        sbV.append(this.d);
        sbV.append(")");
        return sbV.toString();
    }
}
