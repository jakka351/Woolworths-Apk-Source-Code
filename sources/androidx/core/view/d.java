package androidx.core.view;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import au.com.woolworths.base.wallet.ocr.RewardsWalletOcrOverlayFragment;
import com.google.android.material.bottomappbar.BottomAppBar;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public /* synthetic */ d(int i, View view) {
        this.d = i;
        this.e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        View view = this.e;
        switch (i) {
            case 0:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
            case 1:
                int i2 = RewardsWalletOcrOverlayFragment.e;
                view.setVisibility(0);
                break;
            case 2:
                int i3 = BottomAppBar.x0;
                view.requestLayout();
                break;
            case 3:
                view.requestFocus();
                view.post(new d(4, view));
                break;
            default:
                ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
                break;
        }
    }
}
