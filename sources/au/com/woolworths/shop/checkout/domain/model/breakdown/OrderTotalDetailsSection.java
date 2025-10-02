package au.com.woolworths.shop.checkout.domain.model.breakdown;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/breakdown/OrderTotalDetailsSection;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OrderTotalDetailsSection {

    /* renamed from: a, reason: collision with root package name */
    public final String f10647a;
    public final DetailsSectionValueType b;
    public final String c;
    public final DetailsSectionValueType d;
    public final String e;
    public final OrderDetailSectionMessage f;

    public OrderTotalDetailsSection(String title, DetailsSectionValueType detailsSectionValueType, String value, DetailsSectionValueType detailsSectionValueType2, String str, OrderDetailSectionMessage orderDetailSectionMessage) {
        Intrinsics.h(title, "title");
        Intrinsics.h(value, "value");
        this.f10647a = title;
        this.b = detailsSectionValueType;
        this.c = value;
        this.d = detailsSectionValueType2;
        this.e = str;
        this.f = orderDetailSectionMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderTotalDetailsSection)) {
            return false;
        }
        OrderTotalDetailsSection orderTotalDetailsSection = (OrderTotalDetailsSection) obj;
        return Intrinsics.c(this.f10647a, orderTotalDetailsSection.f10647a) && this.b == orderTotalDetailsSection.b && Intrinsics.c(this.c, orderTotalDetailsSection.c) && this.d == orderTotalDetailsSection.d && Intrinsics.c(this.e, orderTotalDetailsSection.e) && Intrinsics.c(this.f, orderTotalDetailsSection.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + b.c((this.b.hashCode() + (this.f10647a.hashCode() * 31)) * 31, 31, this.c)) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        OrderDetailSectionMessage orderDetailSectionMessage = this.f;
        return iHashCode2 + (orderDetailSectionMessage != null ? orderDetailSectionMessage.hashCode() : 0);
    }

    public final String toString() {
        return "OrderTotalDetailsSection(title=" + this.f10647a + ", titleType=" + this.b + ", value=" + this.c + ", valueType=" + this.d + ", imageUrl=" + this.e + ", message=" + this.f + ")";
    }
}
