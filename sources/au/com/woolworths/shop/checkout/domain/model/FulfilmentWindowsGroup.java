package au.com.woolworths.shop.checkout.domain.model;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/FulfilmentWindowsGroup;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FulfilmentWindowsGroup {

    /* renamed from: a, reason: collision with root package name */
    public final String f10613a;
    public final boolean b;
    public final String c;
    public final FulfilmentWindowsMessage d;
    public final String e;
    public final List f;
    public final List g;

    public FulfilmentWindowsGroup(String str, boolean z, String str2, FulfilmentWindowsMessage fulfilmentWindowsMessage, String str3, List list, List list2) {
        this.f10613a = str;
        this.b = z;
        this.c = str2;
        this.d = fulfilmentWindowsMessage;
        this.e = str3;
        this.f = list;
        this.g = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FulfilmentWindowsGroup)) {
            return false;
        }
        FulfilmentWindowsGroup fulfilmentWindowsGroup = (FulfilmentWindowsGroup) obj;
        return Intrinsics.c(this.f10613a, fulfilmentWindowsGroup.f10613a) && this.b == fulfilmentWindowsGroup.b && Intrinsics.c(this.c, fulfilmentWindowsGroup.c) && Intrinsics.c(this.d, fulfilmentWindowsGroup.d) && Intrinsics.c(this.e, fulfilmentWindowsGroup.e) && Intrinsics.c(this.f, fulfilmentWindowsGroup.f) && Intrinsics.c(this.g, fulfilmentWindowsGroup.g);
    }

    public final int hashCode() {
        int iC = b.c(b.e(this.f10613a.hashCode() * 31, 31, this.b), 31, this.c);
        FulfilmentWindowsMessage fulfilmentWindowsMessage = this.d;
        int iHashCode = (iC + (fulfilmentWindowsMessage == null ? 0 : fulfilmentWindowsMessage.hashCode())) * 31;
        String str = this.e;
        return this.g.hashCode() + b.d((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sbQ = a.q("FulfilmentWindowsGroup(title=", this.f10613a, ", isSelected=", ", imageUrl=", this.b);
        sbQ.append(this.c);
        sbQ.append(", message=");
        sbQ.append(this.d);
        sbQ.append(", subtitle=");
        au.com.woolworths.android.onesite.a.B(sbQ, this.e, ", slotsV1=", this.f, ", slotsV2=");
        return android.support.v4.media.session.a.t(sbQ, this.g, ")");
    }
}
