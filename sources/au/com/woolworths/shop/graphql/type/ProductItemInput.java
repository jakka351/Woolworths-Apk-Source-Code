package au.com.woolworths.shop.graphql.type;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ProductItemInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductItemInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f11748a;
    public final double b;
    public final boolean c;
    public final boolean d;

    public ProductItemInput(double d, boolean z, boolean z2, String productId) {
        Intrinsics.h(productId, "productId");
        this.f11748a = productId;
        this.b = d;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductItemInput)) {
            return false;
        }
        ProductItemInput productItemInput = (ProductItemInput) obj;
        return Intrinsics.c(this.f11748a, productItemInput.f11748a) && Double.compare(this.b, productItemInput.b) == 0 && this.c == productItemInput.c && this.d == productItemInput.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + b.e(a.a(this.b, this.f11748a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbR = au.com.woolworths.android.onesite.a.r(this.b, "ProductItemInput(productId=", this.f11748a, ", quantity=");
        sbR.append(", checked=");
        sbR.append(this.c);
        sbR.append(", isAvailable=");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }
}
