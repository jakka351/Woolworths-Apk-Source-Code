package au.com.woolworths.feature.shop.bundles.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/data/UpdateCartBundleQuantity;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UpdateCartBundleQuantity {

    /* renamed from: a, reason: collision with root package name */
    public final int f6770a;
    public final int b;
    public final BundleQuantityStepper c;
    public final ArrayList d;

    public UpdateCartBundleQuantity(int i, int i2, BundleQuantityStepper bundleQuantityStepper, ArrayList arrayList) {
        this.f6770a = i;
        this.b = i2;
        this.c = bundleQuantityStepper;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateCartBundleQuantity)) {
            return false;
        }
        UpdateCartBundleQuantity updateCartBundleQuantity = (UpdateCartBundleQuantity) obj;
        return this.f6770a == updateCartBundleQuantity.f6770a && this.b == updateCartBundleQuantity.b && this.c.equals(updateCartBundleQuantity.c) && this.d.equals(updateCartBundleQuantity.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + b.a(this.b, Integer.hashCode(this.f6770a) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = a.q(this.f6770a, this.b, "UpdateCartBundleQuantity(productCount=", ", totalProductCount=", ", updatedBundleQuantitySelector=");
        sbQ.append(this.c);
        sbQ.append(", updatedProductQuantities=");
        sbQ.append(this.d);
        sbQ.append(")");
        return sbQ.toString();
    }
}
