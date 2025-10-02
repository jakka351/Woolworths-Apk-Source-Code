package au.com.woolworths.feature.shop.barcode.scanner.generated.callback;

import android.view.View;
import au.com.woolworths.feature.shop.barcode.scanner.databinding.ActivityBarcodeScannerBindingImpl;
import com.dynatrace.android.callback.Callback;

/* loaded from: classes3.dex */
public final class OnClickListener implements View.OnClickListener {
    public final ActivityBarcodeScannerBindingImpl d;
    public final int e;

    public interface Listener {
    }

    public OnClickListener(ActivityBarcodeScannerBindingImpl activityBarcodeScannerBindingImpl, int i) {
        this.d = activityBarcodeScannerBindingImpl;
        this.e = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Callback.g(view);
        try {
            this.d.a(this.e);
        } finally {
            Callback.h();
        }
    }
}
