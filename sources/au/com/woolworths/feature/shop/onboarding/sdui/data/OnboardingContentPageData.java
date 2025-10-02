package au.com.woolworths.feature.shop.onboarding.sdui.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/sdui/data/OnboardingContentPageData;", "", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OnboardingContentPageData {

    /* renamed from: a, reason: collision with root package name */
    public final OnboardingHeaderData f7978a;
    public final OnboardingContentData b;
    public final OnboardingFooterData c;

    public OnboardingContentPageData(OnboardingHeaderData onboardingHeaderData, OnboardingContentData onboardingContentData, OnboardingFooterData onboardingFooterData) {
        this.f7978a = onboardingHeaderData;
        this.b = onboardingContentData;
        this.c = onboardingFooterData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingContentPageData)) {
            return false;
        }
        OnboardingContentPageData onboardingContentPageData = (OnboardingContentPageData) obj;
        return Intrinsics.c(this.f7978a, onboardingContentPageData.f7978a) && Intrinsics.c(this.b, onboardingContentPageData.b) && Intrinsics.c(this.c, onboardingContentPageData.c);
    }

    public final int hashCode() {
        OnboardingHeaderData onboardingHeaderData = this.f7978a;
        return this.c.hashCode() + ((this.b.hashCode() + ((onboardingHeaderData == null ? 0 : onboardingHeaderData.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        return "OnboardingContentPageData(header=" + this.f7978a + ", content=" + this.b + ", footer=" + this.c + ")";
    }
}
