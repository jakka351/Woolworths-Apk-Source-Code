package au.com.woolworths.feature.shop.instore.navigation.onboarding.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/onboarding/data/ProductFinderOnboardingItem;", "", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductFinderOnboardingItem {

    /* renamed from: a, reason: collision with root package name */
    public final int f7423a;
    public final int b;
    public final int c;

    public ProductFinderOnboardingItem(int i, int i2, int i3) {
        this.f7423a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductFinderOnboardingItem)) {
            return false;
        }
        ProductFinderOnboardingItem productFinderOnboardingItem = (ProductFinderOnboardingItem) obj;
        return this.f7423a == productFinderOnboardingItem.f7423a && this.b == productFinderOnboardingItem.b && this.c == productFinderOnboardingItem.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + b.a(this.b, Integer.hashCode(this.f7423a) * 31, 31);
    }

    public final String toString() {
        return a.m(a.q(this.f7423a, this.b, "ProductFinderOnboardingItem(title=", ", body=", ", image="), this.c, ")");
    }
}
