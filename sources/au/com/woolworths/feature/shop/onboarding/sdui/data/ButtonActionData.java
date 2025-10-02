package au.com.woolworths.feature.shop.onboarding.sdui.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.sdui.model.action.ActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/sdui/data/ButtonActionData;", "", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ButtonActionData {

    /* renamed from: a, reason: collision with root package name */
    public final String f7975a;
    public final OnboardingFooterButtonAction b;
    public final ActionType c;

    public ButtonActionData(String str, OnboardingFooterButtonAction onboardingFooterButtonAction, ActionType actionType) {
        this.f7975a = str;
        this.b = onboardingFooterButtonAction;
        this.c = actionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonActionData)) {
            return false;
        }
        ButtonActionData buttonActionData = (ButtonActionData) obj;
        return Intrinsics.c(this.f7975a, buttonActionData.f7975a) && this.b == buttonActionData.b && this.c == buttonActionData.c;
    }

    public final int hashCode() {
        String str = this.f7975a;
        return this.c.hashCode() + ((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        return "ButtonActionData(id=" + this.f7975a + ", action=" + this.b + ", type=" + this.c + ")";
    }
}
