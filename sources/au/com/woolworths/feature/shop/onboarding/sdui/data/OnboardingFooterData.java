package au.com.woolworths.feature.shop.onboarding.sdui.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/sdui/data/OnboardingFooterData;", "", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OnboardingFooterData {

    /* renamed from: a, reason: collision with root package name */
    public final ButtonData f7979a;
    public final ButtonData b;
    public final ButtonData c;

    public OnboardingFooterData(ButtonData buttonData, ButtonData buttonData2, ButtonData buttonData3) {
        this.f7979a = buttonData;
        this.b = buttonData2;
        this.c = buttonData3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingFooterData)) {
            return false;
        }
        OnboardingFooterData onboardingFooterData = (OnboardingFooterData) obj;
        return Intrinsics.c(this.f7979a, onboardingFooterData.f7979a) && Intrinsics.c(this.b, onboardingFooterData.b) && Intrinsics.c(this.c, onboardingFooterData.c);
    }

    public final int hashCode() {
        int iHashCode = this.f7979a.hashCode() * 31;
        ButtonData buttonData = this.b;
        int iHashCode2 = (iHashCode + (buttonData == null ? 0 : buttonData.hashCode())) * 31;
        ButtonData buttonData2 = this.c;
        return iHashCode2 + (buttonData2 != null ? buttonData2.hashCode() : 0);
    }

    public final String toString() {
        return "OnboardingFooterData(button1=" + this.f7979a + ", button2=" + this.b + ", button3=" + this.c + ")";
    }
}
