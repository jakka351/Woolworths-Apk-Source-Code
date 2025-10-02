package au.com.woolworths.shop.checkout.domain.model;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.shopapp.data.models.CartProductInfo;
import au.com.woolworths.shop.checkout.domain.model.substitution.CheckoutProductSubstitutionPreference;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/CheckoutProduct;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CheckoutProduct {

    /* renamed from: a, reason: collision with root package name */
    public final String f10565a;
    public final double b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final CheckoutProductInstruction h;
    public final CheckoutProductRewards i;
    public final CheckoutRemoveProductInfo j;
    public final boolean k;
    public final ArrayList l;
    public final boolean m;
    public final CartProductInfo n;
    public final CheckoutProductSubstitutionPreference o;

    public CheckoutProduct(String str, double d, String str2, String str3, String str4, String str5, String str6, CheckoutProductInstruction checkoutProductInstruction, CheckoutProductRewards checkoutProductRewards, CheckoutRemoveProductInfo checkoutRemoveProductInfo, boolean z, ArrayList arrayList, boolean z2, CartProductInfo cartProductInfo, CheckoutProductSubstitutionPreference checkoutProductSubstitutionPreference) {
        this.f10565a = str;
        this.b = d;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = checkoutProductInstruction;
        this.i = checkoutProductRewards;
        this.j = checkoutRemoveProductInfo;
        this.k = z;
        this.l = arrayList;
        this.m = z2;
        this.n = cartProductInfo;
        this.o = checkoutProductSubstitutionPreference;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutProduct)) {
            return false;
        }
        CheckoutProduct checkoutProduct = (CheckoutProduct) obj;
        return this.f10565a.equals(checkoutProduct.f10565a) && Double.compare(this.b, checkoutProduct.b) == 0 && this.c.equals(checkoutProduct.c) && this.d.equals(checkoutProduct.d) && this.e.equals(checkoutProduct.e) && this.f.equals(checkoutProduct.f) && this.g.equals(checkoutProduct.g) && this.h.equals(checkoutProduct.h) && Intrinsics.c(this.i, checkoutProduct.i) && this.j.equals(checkoutProduct.j) && this.k == checkoutProduct.k && this.l.equals(checkoutProduct.l) && this.m == checkoutProduct.m && Intrinsics.c(this.n, checkoutProduct.n) && Intrinsics.c(this.o, checkoutProduct.o);
    }

    public final int hashCode() {
        int iHashCode = (this.h.hashCode() + b.c(b.c(b.c(b.c(b.c(a.a(this.b, this.f10565a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31;
        CheckoutProductRewards checkoutProductRewards = this.i;
        int iE = b.e(androidx.compose.ui.input.pointer.a.b(b.e((this.j.hashCode() + ((iHashCode + (checkoutProductRewards == null ? 0 : checkoutProductRewards.hashCode())) * 31)) * 31, 31, this.k), 31, this.l), 31, this.m);
        CartProductInfo cartProductInfo = this.n;
        int iHashCode2 = (iE + (cartProductInfo == null ? 0 : cartProductInfo.hashCode())) * 31;
        CheckoutProductSubstitutionPreference checkoutProductSubstitutionPreference = this.o;
        return iHashCode2 + (checkoutProductSubstitutionPreference != null ? checkoutProductSubstitutionPreference.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = au.com.woolworths.android.onesite.a.r(this.b, "CheckoutProduct(title=", this.f10565a, ", quantity=");
        androidx.constraintlayout.core.state.a.B(sbR, ", productId=", this.c, ", unitPrice=", this.d);
        androidx.constraintlayout.core.state.a.B(sbR, ", totalPrice=", this.e, ", totalTitle=", this.f);
        sbR.append(", imageUrl=");
        sbR.append(this.g);
        sbR.append(", instruction=");
        sbR.append(this.h);
        sbR.append(", rewards=");
        sbR.append(this.i);
        sbR.append(", removeInfo=");
        sbR.append(this.j);
        sbR.append(", allowSubstitution=");
        sbR.append(this.k);
        sbR.append(", messages=");
        sbR.append(this.l);
        sbR.append(", showSubstitution=");
        sbR.append(this.m);
        sbR.append(", cartProductInfo=");
        sbR.append(this.n);
        sbR.append(", substitutionPreference=");
        sbR.append(this.o);
        sbR.append(")");
        return sbR.toString();
    }
}
