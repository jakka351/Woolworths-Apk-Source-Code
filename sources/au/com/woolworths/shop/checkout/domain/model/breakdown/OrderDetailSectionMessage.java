package au.com.woolworths.shop.checkout.domain.model.breakdown;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/breakdown/OrderDetailSectionMessage;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OrderDetailSectionMessage {

    /* renamed from: a, reason: collision with root package name */
    public final String f10646a;
    public final String b;
    public final MessageType c;

    public OrderDetailSectionMessage(String str, String str2, MessageType messageType) {
        this.f10646a = str;
        this.b = str2;
        this.c = messageType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderDetailSectionMessage)) {
            return false;
        }
        OrderDetailSectionMessage orderDetailSectionMessage = (OrderDetailSectionMessage) obj;
        return Intrinsics.c(this.f10646a, orderDetailSectionMessage.f10646a) && Intrinsics.c(this.b, orderDetailSectionMessage.b) && this.c == orderDetailSectionMessage.c;
    }

    public final int hashCode() {
        String str = this.f10646a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        MessageType messageType = this.c;
        return iHashCode2 + (messageType != null ? messageType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("OrderDetailSectionMessage(title=", this.f10646a, ", body=", this.b, ", type=");
        sbV.append(this.c);
        sbV.append(")");
        return sbV.toString();
    }
}
