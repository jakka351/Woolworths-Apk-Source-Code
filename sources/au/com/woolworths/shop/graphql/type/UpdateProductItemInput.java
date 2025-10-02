package au.com.woolworths.shop.graphql.type;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/UpdateProductItemInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UpdateProductItemInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f11996a;
    public final String b;
    public final double c;
    public final boolean d;
    public final double e;

    public UpdateProductItemInput(double d, String str, String productId, double d2, boolean z) {
        Intrinsics.h(productId, "productId");
        this.f11996a = str;
        this.b = productId;
        this.c = d;
        this.d = z;
        this.e = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateProductItemInput)) {
            return false;
        }
        UpdateProductItemInput updateProductItemInput = (UpdateProductItemInput) obj;
        return Intrinsics.c(this.f11996a, updateProductItemInput.f11996a) && Intrinsics.c(this.b, updateProductItemInput.b) && Double.compare(this.c, updateProductItemInput.c) == 0 && this.d == updateProductItemInput.d && Double.compare(this.e, updateProductItemInput.e) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.e) + b.e(a.a(this.c, b.c(this.f11996a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("UpdateProductItemInput(id=", this.f11996a, ", productId=", this.b, ", quantity=");
        sbV.append(this.c);
        sbV.append(", checked=");
        sbV.append(this.d);
        sbV.append(", timestamp=");
        sbV.append(this.e);
        sbV.append(")");
        return sbV.toString();
    }
}
