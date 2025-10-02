package au.com.woolworths.shop.checkout.domain.model.substitution;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/substitution/ProductSubstitute;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductSubstitute {

    /* renamed from: a, reason: collision with root package name */
    public final String f10661a;
    public final double b;
    public final String c;
    public final String d;
    public final boolean e;

    public ProductSubstitute(double d, String name, String str, String str2, boolean z) {
        Intrinsics.h(name, "name");
        this.f10661a = name;
        this.b = d;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductSubstitute)) {
            return false;
        }
        ProductSubstitute productSubstitute = (ProductSubstitute) obj;
        return Intrinsics.c(this.f10661a, productSubstitute.f10661a) && Double.compare(this.b, productSubstitute.b) == 0 && Intrinsics.c(this.c, productSubstitute.c) && Intrinsics.c(this.d, productSubstitute.d) && this.e == productSubstitute.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + b.c(b.c(a.a(this.b, this.f10661a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbR = au.com.woolworths.android.onesite.a.r(this.b, "ProductSubstitute(name=", this.f10661a, ", quantity=");
        androidx.constraintlayout.core.state.a.B(sbR, ", productId=", this.c, ", imageUrl=", this.d);
        sbR.append(", isSelected=");
        sbR.append(this.e);
        sbR.append(")");
        return sbR.toString();
    }
}
