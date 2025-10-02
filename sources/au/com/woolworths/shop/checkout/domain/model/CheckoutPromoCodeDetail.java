package au.com.woolworths.shop.checkout.domain.model;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/CheckoutPromoCodeDetail;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CheckoutPromoCodeDetail {

    /* renamed from: a, reason: collision with root package name */
    public final String f10576a;
    public final String b;
    public final List c;

    public CheckoutPromoCodeDetail(String str, String str2, List list) {
        this.f10576a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutPromoCodeDetail)) {
            return false;
        }
        CheckoutPromoCodeDetail checkoutPromoCodeDetail = (CheckoutPromoCodeDetail) obj;
        return Intrinsics.c(this.f10576a, checkoutPromoCodeDetail.f10576a) && Intrinsics.c(this.b, checkoutPromoCodeDetail.b) && Intrinsics.c(this.c, checkoutPromoCodeDetail.c);
    }

    public final int hashCode() {
        String str = this.f10576a;
        return this.c.hashCode() + b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return a.t(YU.a.v("CheckoutPromoCodeDetail(placeholderText=", this.f10576a, ", buttonTitle=", this.b, ", promoCodes="), this.c, ")");
    }
}
