package au.com.woolworths.shop.checkout.domain.model;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/CheckoutProductInstruction;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CheckoutProductInstruction {

    /* renamed from: a, reason: collision with root package name */
    public final String f10569a;
    public final String b;
    public final String c;
    public final String d;
    public final InputTextLimit e;
    public final String f;

    public CheckoutProductInstruction(String str, String str2, String str3, String str4, InputTextLimit inputTextLimit, String str5) {
        this.f10569a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = inputTextLimit;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutProductInstruction)) {
            return false;
        }
        CheckoutProductInstruction checkoutProductInstruction = (CheckoutProductInstruction) obj;
        return Intrinsics.c(this.f10569a, checkoutProductInstruction.f10569a) && Intrinsics.c(this.b, checkoutProductInstruction.b) && Intrinsics.c(this.c, checkoutProductInstruction.c) && Intrinsics.c(this.d, checkoutProductInstruction.d) && Intrinsics.c(this.e, checkoutProductInstruction.e) && Intrinsics.c(this.f, checkoutProductInstruction.f);
    }

    public final int hashCode() {
        String str = this.f10569a;
        int iC = b.c(b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
        String str2 = this.d;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        InputTextLimit inputTextLimit = this.e;
        return this.f.hashCode() + ((iHashCode + (inputTextLimit != null ? inputTextLimit.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbV = a.v("CheckoutProductInstruction(text=", this.f10569a, ", title=", this.b, ", label=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", placeholderText=", this.d, ", inputLimit=");
        sbV.append(this.e);
        sbV.append(", buttonTitle=");
        sbV.append(this.f);
        sbV.append(")");
        return sbV.toString();
    }
}
