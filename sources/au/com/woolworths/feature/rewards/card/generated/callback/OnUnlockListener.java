package au.com.woolworths.feature.rewards.card.generated.callback;

import au.com.woolworths.feature.rewards.card.databinding.FragmentUnlockChristmasFundsBottomSheetBindingImpl;
import au.com.woolworths.feature.rewards.card.unlock.UnlockChristmasFundsViewModel;
import au.com.woolworths.views.unlockslider.UnlockSlider;

/* loaded from: classes3.dex */
public final class OnUnlockListener implements UnlockSlider.OnUnlockListener {

    /* renamed from: a, reason: collision with root package name */
    public final FragmentUnlockChristmasFundsBottomSheetBindingImpl f5822a;

    public interface Listener {
    }

    public OnUnlockListener(FragmentUnlockChristmasFundsBottomSheetBindingImpl fragmentUnlockChristmasFundsBottomSheetBindingImpl) {
        this.f5822a = fragmentUnlockChristmasFundsBottomSheetBindingImpl;
    }

    @Override // au.com.woolworths.views.unlockslider.UnlockSlider.OnUnlockListener
    public final void a() {
        UnlockChristmasFundsViewModel unlockChristmasFundsViewModel = this.f5822a.I;
        if (unlockChristmasFundsViewModel != null) {
            unlockChristmasFundsViewModel.p6();
        }
    }
}
