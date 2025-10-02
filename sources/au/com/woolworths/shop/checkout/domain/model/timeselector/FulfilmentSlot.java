package au.com.woolworths.shop.checkout.domain.model.timeselector;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.shop.checkout.domain.model.FooterData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/timeselector/FulfilmentSlot;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FulfilmentSlot {

    /* renamed from: a, reason: collision with root package name */
    public final int f10671a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final FooterData g;
    public final String h;
    public final List i;
    public final List j;

    public FulfilmentSlot(int i, String str, String str2, String str3, boolean z, boolean z2, FooterData footerData, String str4, List list, List list2) {
        this.f10671a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
        this.g = footerData;
        this.h = str4;
        this.i = list;
        this.j = list2;
    }

    public static FulfilmentSlot a(FulfilmentSlot fulfilmentSlot, boolean z) {
        int i = fulfilmentSlot.f10671a;
        String str = fulfilmentSlot.b;
        String str2 = fulfilmentSlot.c;
        String str3 = fulfilmentSlot.d;
        boolean z2 = fulfilmentSlot.f;
        FooterData footerData = fulfilmentSlot.g;
        String str4 = fulfilmentSlot.h;
        List list = fulfilmentSlot.i;
        List list2 = fulfilmentSlot.j;
        fulfilmentSlot.getClass();
        return new FulfilmentSlot(i, str, str2, str3, z, z2, footerData, str4, list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FulfilmentSlot)) {
            return false;
        }
        FulfilmentSlot fulfilmentSlot = (FulfilmentSlot) obj;
        return this.f10671a == fulfilmentSlot.f10671a && Intrinsics.c(this.b, fulfilmentSlot.b) && Intrinsics.c(this.c, fulfilmentSlot.c) && Intrinsics.c(this.d, fulfilmentSlot.d) && this.e == fulfilmentSlot.e && this.f == fulfilmentSlot.f && Intrinsics.c(this.g, fulfilmentSlot.g) && Intrinsics.c(this.h, fulfilmentSlot.h) && Intrinsics.c(this.i, fulfilmentSlot.i) && Intrinsics.c(this.j, fulfilmentSlot.j);
    }

    public final int hashCode() {
        int iC = b.c(Integer.hashCode(this.f10671a) * 31, 31, this.b);
        String str = this.c;
        int iE = b.e(b.e(b.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        FooterData footerData = this.g;
        return this.j.hashCode() + b.d(b.c((iE + (footerData != null ? footerData.hashCode() : 0)) * 31, 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbP = a.p("FulfilmentSlot(id=", this.f10671a, ", title=", this.b, ", subtitle=");
        a.B(sbP, this.c, ", price=", this.d, ", isSelected=");
        au.com.woolworths.android.onesite.a.D(sbP, this.e, ", isDisabled=", this.f, ", footerData=");
        sbP.append(this.g);
        sbP.append(", startTime=");
        sbP.append(this.h);
        sbP.append(", statuses=");
        sbP.append(this.i);
        sbP.append(", tags=");
        sbP.append(this.j);
        sbP.append(")");
        return sbP.toString();
    }
}
