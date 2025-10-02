package au.com.woolworths.feature.shop.myorders.details.models;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/DeliveryInstructionsData;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DeliveryInstructionsData {

    /* renamed from: a, reason: collision with root package name */
    public final String f7752a;
    public final String b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final boolean h;

    public DeliveryInstructionsData(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f7752a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = z2;
        this.f = str4;
        this.g = z3;
        this.h = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryInstructionsData)) {
            return false;
        }
        DeliveryInstructionsData deliveryInstructionsData = (DeliveryInstructionsData) obj;
        return Intrinsics.c(this.f7752a, deliveryInstructionsData.f7752a) && Intrinsics.c(this.b, deliveryInstructionsData.b) && this.c == deliveryInstructionsData.c && Intrinsics.c(this.d, deliveryInstructionsData.d) && this.e == deliveryInstructionsData.e && Intrinsics.c(this.f, deliveryInstructionsData.f) && this.g == deliveryInstructionsData.g && this.h == deliveryInstructionsData.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + b.e(b.c(b.e(b.c(b.e(b.c(this.f7752a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbV = a.v("DeliveryInstructionsData(driverInstructionsTitle=", this.f7752a, ", driverInstructions=", this.b, ", leaveUnattended=");
        au.com.woolworths.android.onesite.a.y(", leaveUnattendedTitle=", this.d, ", hideLeaveUnattended=", sbV, this.c);
        au.com.woolworths.android.onesite.a.y(", leaveUnattendedMessage=", this.f, ", canEditInstructions=", sbV, this.e);
        return au.com.woolworths.android.onesite.a.q(sbV, this.g, ", canToggleLeaveUnattended=", this.h, ")");
    }
}
