package au.com.woolworths.shop.graphql.type;

import au.com.woolworths.android.onesite.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ProductFilterOption;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductFilterOption {

    /* renamed from: a, reason: collision with root package name */
    public final String f11740a;
    public final java.util.List b;

    public ProductFilterOption(String type, java.util.List values) {
        Intrinsics.h(type, "type");
        Intrinsics.h(values, "values");
        this.f11740a = type;
        this.b = values;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductFilterOption)) {
            return false;
        }
        ProductFilterOption productFilterOption = (ProductFilterOption) obj;
        return Intrinsics.c(this.f11740a, productFilterOption.f11740a) && Intrinsics.c(this.b, productFilterOption.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11740a.hashCode() * 31);
    }

    public final String toString() {
        return a.i("ProductFilterOption(type=", this.f11740a, ", values=", ")", this.b);
    }
}
