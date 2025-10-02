package au.com.woolworths.feature.shop.instore.navigation.onboarding.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.instore.navigation.onboarding.data.ProductFinderOnboardingItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/onboarding/ui/OnboardingPagePreviewData;", "", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OnboardingPagePreviewData {

    /* renamed from: a, reason: collision with root package name */
    public final ProductFinderOnboardingItem f7426a;
    public final boolean b;
    public final int c;
    public final int d;

    public OnboardingPagePreviewData(ProductFinderOnboardingItem pageItem, boolean z, int i, int i2) {
        Intrinsics.h(pageItem, "pageItem");
        this.f7426a = pageItem;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingPagePreviewData)) {
            return false;
        }
        OnboardingPagePreviewData onboardingPagePreviewData = (OnboardingPagePreviewData) obj;
        return Intrinsics.c(this.f7426a, onboardingPagePreviewData.f7426a) && this.b == onboardingPagePreviewData.b && this.c == onboardingPagePreviewData.c && this.d == onboardingPagePreviewData.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + androidx.camera.core.impl.b.a(this.c, androidx.camera.core.impl.b.e(this.f7426a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnboardingPagePreviewData(pageItem=");
        sb.append(this.f7426a);
        sb.append(", isLastPage=");
        sb.append(this.b);
        sb.append(", currentPageIndex=");
        return androidx.compose.ui.input.pointer.a.i(this.c, this.d, ", totalPages=", ")", sb);
    }
}
