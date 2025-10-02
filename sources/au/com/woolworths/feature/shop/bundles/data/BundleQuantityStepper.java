package au.com.woolworths.feature.shop.bundles.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/data/BundleQuantityStepper;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BundleQuantityStepper {

    /* renamed from: a, reason: collision with root package name */
    public final int f6759a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;

    public BundleQuantityStepper(int i, int i2, int i3, int i4, String str, String str2, String str3) {
        this.f6759a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = str;
        this.f = str2;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BundleQuantityStepper)) {
            return false;
        }
        BundleQuantityStepper bundleQuantityStepper = (BundleQuantityStepper) obj;
        return this.f6759a == bundleQuantityStepper.f6759a && this.b == bundleQuantityStepper.b && this.c == bundleQuantityStepper.c && this.d == bundleQuantityStepper.d && Intrinsics.c(this.e, bundleQuantityStepper.e) && Intrinsics.c(this.f, bundleQuantityStepper.f) && Intrinsics.c(this.g, bundleQuantityStepper.g);
    }

    public final int hashCode() {
        int iC = b.c(b.a(this.d, b.a(this.c, b.a(this.b, Integer.hashCode(this.f6759a) * 31, 31), 31), 31), 31, this.e);
        String str = this.f;
        return this.g.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = a.q(this.f6759a, this.b, "BundleQuantityStepper(minimum=", ", maximum=", ", increment=");
        a.w(this.c, this.d, ", inCart=", ", addToCartLabel=", sbQ);
        androidx.constraintlayout.core.state.a.B(sbQ, this.e, ", maximumReachedLabel=", this.f, ", offerId=");
        return a.o(sbQ, this.g, ")");
    }
}
