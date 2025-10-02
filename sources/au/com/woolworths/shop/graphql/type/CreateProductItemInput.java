package au.com.woolworths.shop.graphql.type;

import android.support.v4.media.session.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CreateProductItemInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CreateProductItemInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f11300a;
    public final double b;
    public final boolean c;

    public CreateProductItemInput(String productId, double d, boolean z) {
        Intrinsics.h(productId, "productId");
        this.f11300a = productId;
        this.b = d;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateProductItemInput)) {
            return false;
        }
        CreateProductItemInput createProductItemInput = (CreateProductItemInput) obj;
        return Intrinsics.c(this.f11300a, createProductItemInput.f11300a) && Double.compare(this.b, createProductItemInput.b) == 0 && this.c == createProductItemInput.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + a.a(this.b, this.f11300a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbR = au.com.woolworths.android.onesite.a.r(this.b, "CreateProductItemInput(productId=", this.f11300a, ", quantity=");
        sbR.append(", checked=");
        sbR.append(this.c);
        sbR.append(")");
        return sbR.toString();
    }
}
