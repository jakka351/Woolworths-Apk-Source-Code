package au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasTab;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasTermsAndConditions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/landing/ui/FaqsContentItem;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FaqsContentItem {

    /* renamed from: a, reason: collision with root package name */
    public final EverydayExtrasTab.EverydayExtrasFaqsTab f6106a;
    public final EverydayExtrasTermsAndConditions b;

    public FaqsContentItem(EverydayExtrasTab.EverydayExtrasFaqsTab everydayExtrasFaqsTab, EverydayExtrasTermsAndConditions everydayExtrasTermsAndConditions) {
        this.f6106a = everydayExtrasFaqsTab;
        this.b = everydayExtrasTermsAndConditions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaqsContentItem)) {
            return false;
        }
        FaqsContentItem faqsContentItem = (FaqsContentItem) obj;
        return Intrinsics.c(this.f6106a, faqsContentItem.f6106a) && Intrinsics.c(this.b, faqsContentItem.b);
    }

    public final int hashCode() {
        int iHashCode = this.f6106a.hashCode() * 31;
        EverydayExtrasTermsAndConditions everydayExtrasTermsAndConditions = this.b;
        return iHashCode + (everydayExtrasTermsAndConditions == null ? 0 : everydayExtrasTermsAndConditions.hashCode());
    }

    public final String toString() {
        return "FaqsContentItem(faqs=" + this.f6106a + ", termsAndConditions=" + this.b + ")";
    }
}
