package au.com.woolworths.feature.shop.myorders.generated.callback;

import au.com.woolworths.feature.shop.myorders.databinding.ActivityOrderCancelPromptBindingImpl;
import au.com.woolworths.feature.shop.myorders.details.cancel.OrderCancellationPromptViewModel;
import au.com.woolworths.views.unlockslider.UnlockSlider;

/* loaded from: classes3.dex */
public final class OnUnlockListener implements UnlockSlider.OnUnlockListener {

    /* renamed from: a, reason: collision with root package name */
    public final ActivityOrderCancelPromptBindingImpl f7850a;

    public interface Listener {
    }

    public OnUnlockListener(ActivityOrderCancelPromptBindingImpl activityOrderCancelPromptBindingImpl) {
        this.f7850a = activityOrderCancelPromptBindingImpl;
    }

    @Override // au.com.woolworths.views.unlockslider.UnlockSlider.OnUnlockListener
    public final void a() {
        ActivityOrderCancelPromptBindingImpl activityOrderCancelPromptBindingImpl = this.f7850a;
        Integer num = activityOrderCancelPromptBindingImpl.G;
        OrderCancellationPromptViewModel orderCancellationPromptViewModel = activityOrderCancelPromptBindingImpl.H;
        if (orderCancellationPromptViewModel != null) {
            orderCancellationPromptViewModel.q6(num.intValue());
        }
    }
}
