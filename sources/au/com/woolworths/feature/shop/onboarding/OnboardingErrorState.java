package au.com.woolworths.feature.shop.onboarding;

import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/OnboardingErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class OnboardingErrorState implements FullPageErrorCause {
    public static final OnboardingErrorState d;
    public static final /* synthetic */ OnboardingErrorState[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        OnboardingErrorState onboardingErrorState = new OnboardingErrorState() { // from class: au.com.woolworths.feature.shop.onboarding.OnboardingErrorState.NETWORK_ERROR
            @Override // au.com.woolworths.feature.shop.onboarding.OnboardingErrorState
            public final void a(OnboardingViewModel onboardingViewModel) {
                onboardingViewModel.p6();
            }

            @Override // au.com.woolworths.feature.shop.onboarding.OnboardingErrorState
            public final void b(OnboardingViewModel onboardingViewModel) {
                onboardingViewModel.p6();
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getDrawableRes */
            public final int getG() {
                return com.woolworths.R.drawable.empty_connection_error_old;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getMessage */
            public final Text getE() {
                return new ResText(com.woolworths.R.string.no_network_connection_error);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getPrimaryActionRes() {
                return com.woolworths.R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getTitle */
            public final Text getD() {
                return new ResText(com.woolworths.R.string.no_network_heading);
            }
        };
        d = onboardingErrorState;
        OnboardingErrorState[] onboardingErrorStateArr = {onboardingErrorState};
        e = onboardingErrorStateArr;
        f = EnumEntriesKt.a(onboardingErrorStateArr);
    }

    public static OnboardingErrorState valueOf(String str) {
        return (OnboardingErrorState) Enum.valueOf(OnboardingErrorState.class, str);
    }

    public static OnboardingErrorState[] values() {
        return (OnboardingErrorState[]) e.clone();
    }

    public abstract void a(OnboardingViewModel onboardingViewModel);

    public abstract void b(OnboardingViewModel onboardingViewModel);
}
