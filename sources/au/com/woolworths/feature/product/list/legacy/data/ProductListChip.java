package au.com.woolworths.feature.product.list.legacy.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/data/ProductListChip;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductListChip {

    /* renamed from: a, reason: collision with root package name */
    public final String f5364a;
    public final boolean b;
    public final ChipText c;
    public final String d;

    public ProductListChip(String id, boolean z, ChipText chipText, String str) {
        Intrinsics.h(id, "id");
        this.f5364a = id;
        this.b = z;
        this.c = chipText;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductListChip)) {
            return false;
        }
        ProductListChip productListChip = (ProductListChip) obj;
        return Intrinsics.c(this.f5364a, productListChip.f5364a) && this.b == productListChip.b && Intrinsics.c(this.c, productListChip.c) && Intrinsics.c(this.d, productListChip.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + b.e(this.f5364a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = a.q("ProductListChip(id=", this.f5364a, ", isSelected=", ", text=", this.b);
        sbQ.append(this.c);
        sbQ.append(", persistentId=");
        sbQ.append(this.d);
        sbQ.append(")");
        return sbQ.toString();
    }
}
