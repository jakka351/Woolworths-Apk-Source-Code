package au.com.woolworths.shop.checkout.domain.model.substitution;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/substitution/ProductSubstitutesSection;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductSubstitutesSection {

    /* renamed from: a, reason: collision with root package name */
    public final List f10662a;

    public ProductSubstitutesSection(List list) {
        this.f10662a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProductSubstitutesSection) && Intrinsics.c(this.f10662a, ((ProductSubstitutesSection) obj).f10662a);
    }

    public final int hashCode() {
        return this.f10662a.hashCode();
    }

    public final String toString() {
        return a.l("ProductSubstitutesSection(substitutions=", ")", this.f10662a);
    }
}
