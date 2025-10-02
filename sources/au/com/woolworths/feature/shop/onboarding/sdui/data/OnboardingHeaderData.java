package au.com.woolworths.feature.shop.onboarding.sdui.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.sdui.common.IconAsset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/sdui/data/OnboardingHeaderData;", "", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OnboardingHeaderData {

    /* renamed from: a, reason: collision with root package name */
    public final IconAsset f7980a;
    public final String b;

    public OnboardingHeaderData(IconAsset iconAsset, String str) {
        this.f7980a = iconAsset;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingHeaderData)) {
            return false;
        }
        OnboardingHeaderData onboardingHeaderData = (OnboardingHeaderData) obj;
        return Intrinsics.c(this.f7980a, onboardingHeaderData.f7980a) && Intrinsics.c(this.b, onboardingHeaderData.b);
    }

    public final int hashCode() {
        IconAsset iconAsset = this.f7980a;
        return this.b.hashCode() + ((iconAsset == null ? 0 : iconAsset.hashCode()) * 31);
    }

    public final String toString() {
        return "OnboardingHeaderData(image=" + this.f7980a + ", title=" + this.b + ")";
    }
}
