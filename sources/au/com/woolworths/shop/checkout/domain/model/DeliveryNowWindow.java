package au.com.woolworths.shop.checkout.domain.model;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/DeliveryNowWindow;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeliveryNowWindow {

    /* renamed from: a, reason: collision with root package name */
    public final int f10596a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final InfoSection j;
    public final boolean k;
    public final Boolean l;
    public final FulfilmentWindowSlotSelectionInfo m;
    public final Object n;
    public final Object o;

    public DeliveryNowWindow(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, InfoSection infoSection, boolean z, Boolean bool, FulfilmentWindowSlotSelectionInfo fulfilmentWindowSlotSelectionInfo, List list, List list2) {
        this.f10596a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = infoSection;
        this.k = z;
        this.l = bool;
        this.m = fulfilmentWindowSlotSelectionInfo;
        this.n = list;
        this.o = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryNowWindow)) {
            return false;
        }
        DeliveryNowWindow deliveryNowWindow = (DeliveryNowWindow) obj;
        return this.f10596a == deliveryNowWindow.f10596a && this.b.equals(deliveryNowWindow.b) && this.c.equals(deliveryNowWindow.c) && this.d.equals(deliveryNowWindow.d) && Intrinsics.c(this.e, deliveryNowWindow.e) && this.f.equals(deliveryNowWindow.f) && this.g.equals(deliveryNowWindow.g) && this.h.equals(deliveryNowWindow.h) && this.i.equals(deliveryNowWindow.i) && this.j.equals(deliveryNowWindow.j) && this.k == deliveryNowWindow.k && this.l.equals(deliveryNowWindow.l) && Intrinsics.c(this.m, deliveryNowWindow.m) && this.n.equals(deliveryNowWindow.n) && this.o.equals(deliveryNowWindow.o);
    }

    public final int hashCode() {
        int iC = b.c(b.c(b.c(Integer.hashCode(this.f10596a) * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int iHashCode = (this.l.hashCode() + b.e((this.j.hashCode() + b.c(b.c(b.c(b.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i)) * 31, 31, this.k)) * 961;
        FulfilmentWindowSlotSelectionInfo fulfilmentWindowSlotSelectionInfo = this.m;
        return this.o.hashCode() + a.e((iHashCode + (fulfilmentWindowSlotSelectionInfo != null ? fulfilmentWindowSlotSelectionInfo.hashCode() : 0)) * 31, 31, this.n);
    }

    public final String toString() {
        StringBuilder sbP = androidx.constraintlayout.core.state.a.p("DeliveryNowWindow(id=", this.f10596a, ", startTime=", this.b, ", title=");
        androidx.constraintlayout.core.state.a.B(sbP, this.c, ", subtitle=", this.d, ", secondarySubtitle=");
        androidx.constraintlayout.core.state.a.B(sbP, this.e, ", sectionTitle=", this.f, ", imageUrl=");
        androidx.constraintlayout.core.state.a.B(sbP, this.g, ", buttonTitle=", this.h, ", messageTitle=");
        sbP.append(this.i);
        sbP.append(", info=");
        sbP.append(this.j);
        sbP.append(", isReserved=");
        sbP.append(this.k);
        sbP.append(", isEnabled=");
        sbP.append(this.l);
        sbP.append(", badge=null, selectionInfo=");
        sbP.append(this.m);
        sbP.append(", tags=");
        sbP.append(this.n);
        sbP.append(", statuses=");
        return a.o(this.o, ")", sbP);
    }
}
