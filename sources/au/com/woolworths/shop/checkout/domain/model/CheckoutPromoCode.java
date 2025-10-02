package au.com.woolworths.shop.checkout.domain.model;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/CheckoutPromoCode;", "", "CheckoutPromoCodeItem", "Lau/com/woolworths/shop/checkout/domain/model/CheckoutPromoCode$CheckoutPromoCodeItem;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class CheckoutPromoCode {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/CheckoutPromoCode$CheckoutPromoCodeItem;", "Lau/com/woolworths/shop/checkout/domain/model/CheckoutPromoCode;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CheckoutPromoCodeItem extends CheckoutPromoCode {

        /* renamed from: a, reason: collision with root package name */
        public final String f10575a;
        public final String b;
        public final String c;
        public final String d;
        public final boolean e;
        public final String f;
        public final Boolean g;

        public CheckoutPromoCodeItem(String str, String str2, String str3, String str4, boolean z, String str5, Boolean bool) {
            this.f10575a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = z;
            this.f = str5;
            this.g = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CheckoutPromoCodeItem)) {
                return false;
            }
            CheckoutPromoCodeItem checkoutPromoCodeItem = (CheckoutPromoCodeItem) obj;
            return Intrinsics.c(this.f10575a, checkoutPromoCodeItem.f10575a) && Intrinsics.c(this.b, checkoutPromoCodeItem.b) && Intrinsics.c(this.c, checkoutPromoCodeItem.c) && Intrinsics.c(this.d, checkoutPromoCodeItem.d) && this.e == checkoutPromoCodeItem.e && Intrinsics.c(this.f, checkoutPromoCodeItem.f) && Intrinsics.c(this.g, checkoutPromoCodeItem.g);
        }

        public final int hashCode() {
            int iC = b.c(b.e(b.c(b.c(b.c(this.f10575a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
            Boolean bool = this.g;
            return iC + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = a.v("CheckoutPromoCodeItem(title=", this.f10575a, ", subtitle=", this.b, ", primaryLabel=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", secondaryLabel=", this.d, ", isApplied=");
            au.com.woolworths.android.onesite.a.y(", code=", this.f, ", isProcessing=", sbV, this.e);
            return au.com.woolworths.android.onesite.a.o(sbV, this.g, ")");
        }
    }
}
