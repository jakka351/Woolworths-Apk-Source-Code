package au.com.woolworths.shop.checkout.domain.model;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import java.util.ArrayList;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/PackagingMethod;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PackagingMethod {

    /* renamed from: a, reason: collision with root package name */
    public final String f10623a;
    public final ArrayList b;

    public PackagingMethod(String str, ArrayList arrayList) {
        this.f10623a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackagingMethod)) {
            return false;
        }
        PackagingMethod packagingMethod = (PackagingMethod) obj;
        return this.f10623a.equals(packagingMethod.f10623a) && this.b.equals(packagingMethod.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10623a.hashCode() * 31);
    }

    public final String toString() {
        return d.q("PackagingMethod(title=", this.f10623a, ", options=", ")", this.b);
    }
}
