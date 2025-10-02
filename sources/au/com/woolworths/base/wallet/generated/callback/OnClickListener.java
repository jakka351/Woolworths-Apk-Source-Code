package au.com.woolworths.base.wallet.generated.callback;

import android.view.View;
import au.com.woolworths.base.wallet.databinding.FragmentRewardsWalletOcrOverlayBindingImpl;
import au.com.woolworths.base.wallet.ocr.OverlayClickHandler;
import com.dynatrace.android.callback.Callback;

/* loaded from: classes3.dex */
public final class OnClickListener implements View.OnClickListener {
    public final FragmentRewardsWalletOcrOverlayBindingImpl d;

    public interface Listener {
    }

    public OnClickListener(FragmentRewardsWalletOcrOverlayBindingImpl fragmentRewardsWalletOcrOverlayBindingImpl) {
        this.d = fragmentRewardsWalletOcrOverlayBindingImpl;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Callback.g(view);
        try {
            OverlayClickHandler overlayClickHandler = this.d.C;
            if (overlayClickHandler != null) {
                overlayClickHandler.a();
            }
        } finally {
            Callback.h();
        }
    }
}
