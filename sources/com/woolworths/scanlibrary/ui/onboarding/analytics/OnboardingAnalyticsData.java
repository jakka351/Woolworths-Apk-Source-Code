package com.woolworths.scanlibrary.ui.onboarding.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import com.woolworths.scanlibrary.analytics.Screens;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/onboarding/analytics/OnboardingAnalyticsData;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class OnboardingAnalyticsData implements Action {
    public static final OnboardingAnalyticsData e;
    public static final OnboardingAnalyticsData f;
    public static final OnboardingAnalyticsData g;
    public static final /* synthetic */ OnboardingAnalyticsData[] h;
    public static final /* synthetic */ EnumEntries i;
    public final Screens d = Screens.l;

    static {
        OnboardingAnalyticsData onboardingAnalyticsData = new OnboardingAnalyticsData() { // from class: com.woolworths.scanlibrary.ui.onboarding.analytics.OnboardingAnalyticsData.CAROUSEL_SWIPE
            public final Category j = Category.n;
            public final String k = "Onboarding Walkthrough - Scan&Go";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.k;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.j;
            }
        };
        e = onboardingAnalyticsData;
        OnboardingAnalyticsData onboardingAnalyticsData2 = new OnboardingAnalyticsData() { // from class: com.woolworths.scanlibrary.ui.onboarding.analytics.OnboardingAnalyticsData.CLOSE
            public final Category j = Category.m;
            public final String k = "cancel";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.k;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.j;
            }
        };
        f = onboardingAnalyticsData2;
        OnboardingAnalyticsData onboardingAnalyticsData3 = new OnboardingAnalyticsData() { // from class: com.woolworths.scanlibrary.ui.onboarding.analytics.OnboardingAnalyticsData.GOT_IT
            public final Category j = Category.m;
            public final String k = "Got it";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.k;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.j;
            }
        };
        g = onboardingAnalyticsData3;
        OnboardingAnalyticsData[] onboardingAnalyticsDataArr = {onboardingAnalyticsData, onboardingAnalyticsData2, onboardingAnalyticsData3};
        h = onboardingAnalyticsDataArr;
        i = EnumEntriesKt.a(onboardingAnalyticsDataArr);
    }

    public OnboardingAnalyticsData(String str, int i2) {
    }

    public static OnboardingAnalyticsData valueOf(String str) {
        return (OnboardingAnalyticsData) Enum.valueOf(OnboardingAnalyticsData.class, str);
    }

    public static OnboardingAnalyticsData[] values() {
        return (OnboardingAnalyticsData[]) h.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
