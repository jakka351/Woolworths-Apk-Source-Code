package au.com.woolworths.feature.shop.notification.preferences.generated.callback;

import android.view.View;
import au.com.woolworths.feature.shop.notification.preferences.databinding.EpoxyItemPreferenceToggleBindingImpl;
import au.com.woolworths.feature.shop.notification.preferences.details.ShopPreferenceDetailsClickHandler;
import au.com.woolworths.feature.shop.notification.preferences.models.PreferenceToggleData;
import com.dynatrace.android.callback.Callback;

/* loaded from: classes3.dex */
public final class OnClickListener implements View.OnClickListener {
    public final EpoxyItemPreferenceToggleBindingImpl d;

    public interface Listener {
    }

    public OnClickListener(EpoxyItemPreferenceToggleBindingImpl epoxyItemPreferenceToggleBindingImpl) {
        this.d = epoxyItemPreferenceToggleBindingImpl;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Callback.g(view);
        try {
            EpoxyItemPreferenceToggleBindingImpl epoxyItemPreferenceToggleBindingImpl = this.d;
            ShopPreferenceDetailsClickHandler shopPreferenceDetailsClickHandler = epoxyItemPreferenceToggleBindingImpl.E;
            PreferenceToggleData preferenceToggleData = epoxyItemPreferenceToggleBindingImpl.D;
            if (shopPreferenceDetailsClickHandler != null && preferenceToggleData != null) {
                shopPreferenceDetailsClickHandler.B2(preferenceToggleData, !preferenceToggleData.getValue());
            }
        } finally {
            Callback.h();
        }
    }
}
