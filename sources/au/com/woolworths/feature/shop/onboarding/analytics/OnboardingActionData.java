package au.com.woolworths.feature.shop.onboarding.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/analytics/OnboardingActionData;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class OnboardingActionData implements Action {
    public static final OnboardingActionData e;
    public static final OnboardingActionData f;
    public static final OnboardingActionData g;
    public static final OnboardingActionData h;
    public static final /* synthetic */ OnboardingActionData[] i;
    public static final /* synthetic */ EnumEntries j;
    public final Screens d = Screens.w;

    static {
        OnboardingActionData onboardingActionData = new OnboardingActionData() { // from class: au.com.woolworths.feature.shop.onboarding.analytics.OnboardingActionData.CREATE_ACCOUNT
            public final Category k = Category.m;
            public final String l = "Create Account";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.l;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.k;
            }
        };
        e = onboardingActionData;
        OnboardingActionData onboardingActionData2 = new OnboardingActionData() { // from class: au.com.woolworths.feature.shop.onboarding.analytics.OnboardingActionData.LOG_IN
            public final Category k = Category.m;
            public final String l = "Log In";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.l;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.k;
            }
        };
        f = onboardingActionData2;
        OnboardingActionData onboardingActionData3 = new OnboardingActionData() { // from class: au.com.woolworths.feature.shop.onboarding.analytics.OnboardingActionData.BROWSE_AS_GUEST
            public final Category k = Category.m;
            public final String l = "Browse as Guest";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.l;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.k;
            }
        };
        g = onboardingActionData3;
        OnboardingActionData onboardingActionData4 = new OnboardingActionData() { // from class: au.com.woolworths.feature.shop.onboarding.analytics.OnboardingActionData.CAROUSEL_SWIPE
            public final Category k = Category.l;
            public final String l = "Onboarding Walkthrough";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.l;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.k;
            }
        };
        h = onboardingActionData4;
        OnboardingActionData[] onboardingActionDataArr = {onboardingActionData, onboardingActionData2, onboardingActionData3, onboardingActionData4};
        i = onboardingActionDataArr;
        j = EnumEntriesKt.a(onboardingActionDataArr);
    }

    public OnboardingActionData(String str, int i2) {
    }

    public static OnboardingActionData valueOf(String str) {
        return (OnboardingActionData) Enum.valueOf(OnboardingActionData.class, str);
    }

    public static OnboardingActionData[] values() {
        return (OnboardingActionData[]) i.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
