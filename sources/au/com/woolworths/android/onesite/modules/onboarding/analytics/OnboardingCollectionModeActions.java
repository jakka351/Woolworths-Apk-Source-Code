package au.com.woolworths.android.onesite.modules.onboarding.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/modules/onboarding/analytics/OnboardingCollectionModeActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class OnboardingCollectionModeActions implements Action {
    public static final OnboardingCollectionModeActions e;
    public static final OnboardingCollectionModeActions f;
    public static final OnboardingCollectionModeActions g;
    public static final /* synthetic */ OnboardingCollectionModeActions[] h;
    public static final /* synthetic */ EnumEntries i;
    public final Screen d = Screens.o;

    static {
        OnboardingCollectionModeActions onboardingCollectionModeActions = new OnboardingCollectionModeActions() { // from class: au.com.woolworths.android.onesite.modules.onboarding.analytics.OnboardingCollectionModeActions.ONBOARDING_PICK_UP_CLICK
            public final Category j = Category.m;
            public final String k = "Collection Mode: Pick up";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getJ() {
                return this.k;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getI() {
                return this.j;
            }
        };
        e = onboardingCollectionModeActions;
        OnboardingCollectionModeActions onboardingCollectionModeActions2 = new OnboardingCollectionModeActions() { // from class: au.com.woolworths.android.onesite.modules.onboarding.analytics.OnboardingCollectionModeActions.ONBOARDING_DELIVERY_CLICK
            public final Category j = Category.m;
            public final String k = "Collection Mode: Delivery";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getJ() {
                return this.k;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getI() {
                return this.j;
            }
        };
        f = onboardingCollectionModeActions2;
        OnboardingCollectionModeActions onboardingCollectionModeActions3 = new OnboardingCollectionModeActions() { // from class: au.com.woolworths.android.onesite.modules.onboarding.analytics.OnboardingCollectionModeActions.ONBOARDING_IN_STORE_CLICK
            public final Category j = Category.m;
            public final String k = "Collection Mode: In-Store";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getJ() {
                return this.k;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getI() {
                return this.j;
            }
        };
        g = onboardingCollectionModeActions3;
        OnboardingCollectionModeActions[] onboardingCollectionModeActionsArr = {onboardingCollectionModeActions, onboardingCollectionModeActions2, onboardingCollectionModeActions3};
        h = onboardingCollectionModeActionsArr;
        i = EnumEntriesKt.a(onboardingCollectionModeActionsArr);
    }

    public OnboardingCollectionModeActions(String str, int i2) {
    }

    public static OnboardingCollectionModeActions valueOf(String str) {
        return (OnboardingCollectionModeActions) Enum.valueOf(OnboardingCollectionModeActions.class, str);
    }

    public static OnboardingCollectionModeActions[] values() {
        return (OnboardingCollectionModeActions[]) h.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public final Screen getD() {
        return this.d;
    }
}
