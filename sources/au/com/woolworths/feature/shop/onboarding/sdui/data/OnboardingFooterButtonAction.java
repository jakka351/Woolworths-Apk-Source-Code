package au.com.woolworths.feature.shop.onboarding.sdui.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/sdui/data/OnboardingFooterButtonAction;", "", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OnboardingFooterButtonAction {
    public static final OnboardingFooterButtonAction d;
    public static final OnboardingFooterButtonAction e;
    public static final OnboardingFooterButtonAction f;
    public static final OnboardingFooterButtonAction g;
    public static final /* synthetic */ OnboardingFooterButtonAction[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        OnboardingFooterButtonAction onboardingFooterButtonAction = new OnboardingFooterButtonAction("LOGIN", 0);
        d = onboardingFooterButtonAction;
        OnboardingFooterButtonAction onboardingFooterButtonAction2 = new OnboardingFooterButtonAction("SIGNUP", 1);
        e = onboardingFooterButtonAction2;
        OnboardingFooterButtonAction onboardingFooterButtonAction3 = new OnboardingFooterButtonAction("LOGIN_AS_GUEST", 2);
        f = onboardingFooterButtonAction3;
        OnboardingFooterButtonAction onboardingFooterButtonAction4 = new OnboardingFooterButtonAction("UNKNOWN", 3);
        g = onboardingFooterButtonAction4;
        OnboardingFooterButtonAction[] onboardingFooterButtonActionArr = {onboardingFooterButtonAction, onboardingFooterButtonAction2, onboardingFooterButtonAction3, onboardingFooterButtonAction4};
        h = onboardingFooterButtonActionArr;
        i = EnumEntriesKt.a(onboardingFooterButtonActionArr);
    }

    public static OnboardingFooterButtonAction valueOf(String str) {
        return (OnboardingFooterButtonAction) Enum.valueOf(OnboardingFooterButtonAction.class, str);
    }

    public static OnboardingFooterButtonAction[] values() {
        return (OnboardingFooterButtonAction[]) h.clone();
    }
}
