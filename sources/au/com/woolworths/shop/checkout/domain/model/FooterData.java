package au.com.woolworths.shop.checkout.domain.model;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/FooterData;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FooterData {

    /* renamed from: a, reason: collision with root package name */
    public final String f10599a;
    public final FulfilmentWindowSlotSelectionInfo b;
    public final int c;

    public FooterData(String str, FulfilmentWindowSlotSelectionInfo fulfilmentWindowSlotSelectionInfo, int i) {
        this.f10599a = str;
        this.b = fulfilmentWindowSlotSelectionInfo;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FooterData)) {
            return false;
        }
        FooterData footerData = (FooterData) obj;
        return Intrinsics.c(this.f10599a, footerData.f10599a) && Intrinsics.c(this.b, footerData.b) && this.c == footerData.c;
    }

    public final int hashCode() {
        int iHashCode = this.f10599a.hashCode() * 31;
        FulfilmentWindowSlotSelectionInfo fulfilmentWindowSlotSelectionInfo = this.b;
        return Integer.hashCode(this.c) + ((iHashCode + (fulfilmentWindowSlotSelectionInfo == null ? 0 : fulfilmentWindowSlotSelectionInfo.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FooterData(buttonTitle=");
        sb.append(this.f10599a);
        sb.append(", selectionInfo=");
        sb.append(this.b);
        sb.append(", slotId=");
        return a.m(sb, this.c, ")");
    }
}
