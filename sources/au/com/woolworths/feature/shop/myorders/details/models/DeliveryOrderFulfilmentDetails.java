package au.com.woolworths.feature.shop.myorders.details.models;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/DeliveryOrderFulfilmentDetails;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DeliveryOrderFulfilmentDetails {

    /* renamed from: a, reason: collision with root package name */
    public final String f7753a;
    public final ArrayList b;
    public final DeliveryInstructionsData c;

    public DeliveryOrderFulfilmentDetails(String str, ArrayList arrayList, DeliveryInstructionsData deliveryInstructionsData) {
        this.f7753a = str;
        this.b = arrayList;
        this.c = deliveryInstructionsData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryOrderFulfilmentDetails)) {
            return false;
        }
        DeliveryOrderFulfilmentDetails deliveryOrderFulfilmentDetails = (DeliveryOrderFulfilmentDetails) obj;
        return this.f7753a.equals(deliveryOrderFulfilmentDetails.f7753a) && this.b.equals(deliveryOrderFulfilmentDetails.b) && Intrinsics.c(this.c, deliveryOrderFulfilmentDetails.c);
    }

    public final int hashCode() {
        int iB = a.b(this.f7753a.hashCode() * 31, 31, this.b);
        DeliveryInstructionsData deliveryInstructionsData = this.c;
        return iB + (deliveryInstructionsData == null ? 0 : deliveryInstructionsData.hashCode());
    }

    public final String toString() {
        StringBuilder sbX = d.x("DeliveryOrderFulfilmentDetails(title=", this.f7753a, ", items=", ", deliveryInstructions=", this.b);
        sbX.append(this.c);
        sbX.append(")");
        return sbX.toString();
    }
}
